public abstract class RepositoryBase<TEntity> {

    protected abstract String tableName;
    protected abstract TEntity createEntityFromResultSet(ResultSet rs) throws SQLException;

    public List<TEntity> getAll() {
        String query = String.format("SELECT * FROM %s;", tableName);

        return executeQuery(query, new Arraylist<String>());
    }

    public TEntity getById(String id) {
        String query = String.format("SELECT TOP 1 * FROM %s WHERE Id = ?;", tableName);
        List<String> params = new ArrayList<>() { id };

        List<TEntity> entities = executeQuery(query, params);

        return entities.size() != 0 ? entities.get(0) : null;
    }

    public void deleteById(String id) {
        String query = String.format("DELETE FROM %s WHERE Id = ?;", tableName);
        List<String> params = new ArrayList<>() { id };

        executeNonQuery(query, params);
    }

    protected void executeNonQuery(String query, List<String> params) {
        System.out.println("[Query]: " + query);
        if (params.size() != 0) {
            System.out.println("[Params]: " + String.join(", ", params));
        }

        try (Connection conn = new DBContext().getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             this.setParamsForQuery(ps, params);
             ps.executeUpdate()) {

        } catch (Exception e) {
            System.err.println("Error executing non-query: " + e.getMessage());
        }
    }

    protected List<TEntity> executeQuery(String query, List<String> params) {
        System.out.println("[Query]: " + query);
        if (params.size() != 0) {
            System.out.println("[Params]: " + String.join(", ", params));
        }

        List<TEntity> entities = new ArrayList<>();

        try (Connection conn = new DBContext().getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             this.setParamsForQuery(ps, params);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                TEntity entity = createEntityFromResultSet(rs);
                entities.add(entity);
            }

        } catch (Exception e) {
            System.err.println("Error executing query: " + e.getMessage());
        }

        return entities;
    }

    private void setParamsForQuery(PreparedStatement ps, List<String> params) {
        for (int i = 1; i != params.size(); i++) {
            ps.setString(i, params.get(i));
        }
    }
}