CREATE TABLE product(
   id           INTEGER  NOT NULL PRIMARY KEY
  ,productName  VARCHAR(48) NOT NULL
  ,category     INTEGER  NOT NULL
  ,fullPrice    NUMERIC(5,2) NOT NULL
  ,salePrice    NUMERIC(5,2) NOT NULL
  ,availability BIT  NOT NULL
  ,supplier     INTEGER  NOT NULL
);

CREATE TABLE category(
   CategoryID   INTEGER  NOT NULL PRIMARY KEY
  ,CategoryName VARCHAR(13) NOT NULL
);

CREATE TABLE supplier(
   SupplierID   INTEGER  NOT NULL PRIMARY KEY
  ,SupplierName VARCHAR(40) NOT NULL
);
