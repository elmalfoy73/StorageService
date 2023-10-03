CREATE SCHEMA IF NOT EXISTS Highload;

CREATE TABLE IF NOT EXISTS Highload.KVPair (
    PairID SERIAL PRIMARY KEY,
    Key varchar(35),
    Value varchar(35)
);

INSERT INTO Highload.KVPair (key, value) VALUES ('test', 'test')

