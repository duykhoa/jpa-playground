CREATE TABLE "Member" (
    id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR2(50) NOT NULL,
    email VARCHAR2(100) NOT NULL,
    street_address VARCHAR2(200) NOT NULL,
    contactno VARCHAR2(50) NOT NULL,
    biology TEXT(4000),
    suburb VARCHAR2(50) NOT NULL,
    PRIMARY KEY (id)
)