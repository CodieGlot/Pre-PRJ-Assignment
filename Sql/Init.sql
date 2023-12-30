-- Create table for Users
CREATE TABLE Users (
    Id INT IDENTITY(1,1) PRIMARY KEY,
    Username NVARCHAR(255) NOT NULL,
    Password NVARCHAR(255) NOT NULL,
    UserRole INT NOT NULL
);

-- Create table for Facilities
CREATE TABLE Facilities (
    Id NVARCHAR(9) PRIMARY KEY,
    Name NVARCHAR(255) NOT NULL,
    Area FLOAT NOT NULL,
    RentalCost DECIMAL(18, 2) NOT NULL,
    MaxOccupancy INT NOT NULL,
    RentType NVARCHAR(50) NOT NULL CHECK (RentType IN ('Year', 'Month', 'Day', 'Hour')),
    FacilityType INT NOT NULL
);

-- Create table for Villa Facilities
CREATE TABLE Villas (
    Id NVARCHAR(9) PRIMARY KEY,
    StandardRoom NVARCHAR(255) NOT NULL,
    PoolArea FLOAT NOT NULL,
    Floors INT NOT NULL,
    FOREIGN KEY (Id) REFERENCES Facilities(Id) NOT NULL
);

-- Create table for House Facilities
CREATE TABLE Houses (
    Id NVARCHAR(9) PRIMARY KEY,
    StandardRoom NVARCHAR(255) NOT NULL,
    Floors INT NOT NULL,
    FOREIGN KEY (Id) REFERENCES Facilities(Id) NOT NULL
);

-- Create table for Room Facilities
CREATE TABLE Rooms (
    Id NVARCHAR(9) PRIMARY KEY,
    FreeService NVARCHAR(255) NOT NULL,
    FOREIGN KEY (Id) REFERENCES Facilities(Id) NOT NULL
);

-- Create table for employees
CREATE TABLE Employees (
    Id NVARCHAR(7) PRIMARY KEY,
    FullName NVARCHAR(255) NOT NULL,
    BirthDate DATE NOT NULL,
    Gender NVARCHAR(10) NOT NULL,
    IdNumber NVARCHAR(12) NOT NULL,
    PhoneNumber NVARCHAR(10) NOT NULL,
    Email NVARCHAR(255) NOT NULL,
    Qualification INT NOT NULL,
    Position INT NOT NULL,
    Salary DECIMAL(18, 2) NOT NULL
);

-- Create table for customers
CREATE TABLE Customers (
    Id NVARCHAR(7) PRIMARY KEY,
    FullName NVARCHAR(255) NOT NULL,
    BirthDate DATE NOT NULL,
    Gender NVARCHAR(10) NOT NULL,
    IdNumber NVARCHAR(12) NOT NULL,
    PhoneNumber NVARCHAR(10) NOT NULL,
    Email NVARCHAR(255) NOT NULL,
    CustomerType INT NOT NULL,
    Address NVARCHAR(255) NOT NULL
);

-- Create table for bookings
CREATE TABLE Bookings (
    Id INT IDENTITY(1,1) PRIMARY KEY,
    BookingDate DATE NOT NULL,
    StartDate DATE NOT NULL,
    EndDate DATE NOT NULL,
    CustomerId NVARCHAR(7) NOT NULL,
    FacilityId NVARCHAR(9) NOT NULL,
    FOREIGN KEY (CustomerId) REFERENCES Customers(Id) NOT NULL,
    FOREIGN KEY (FacilityId) REFERENCES Facilities(Id) NOT NULL
);

-- Create table for rental contracts
CREATE TABLE RentalContracts (
    Id INT IDENTITY(1,1) PRIMARY KEY,
    BookingId INT NOT NULL,
    Deposit DECIMAL(18, 2) NOT NULL,
    TotalAmount DECIMAL(18, 2) NOT NULL,
    FOREIGN KEY (BookingId) REFERENCES Bookings(Id) NOT NULL
);
