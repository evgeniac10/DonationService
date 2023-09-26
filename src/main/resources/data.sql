CREATE TABLE donation (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          amount DECIMAL(10, 2) NOT NULL,
                          donationDate DATE NOT NULL
);

INSERT INTO donation (name, amount) VALUES
                                        ('Donor 1', 100.00),
                                        ('Donor 2', 50.00),
                                        ('Donor 3', 200.00);
