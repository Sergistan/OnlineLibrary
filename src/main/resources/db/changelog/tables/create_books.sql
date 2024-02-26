CREATE TABLE books
(
    id                  int PRIMARY KEY,
    name                varchar(256) not null,
    author              varchar(256) not null,
    date_of_publication integer check (date_of_publication > 1814),
    user_id             int    references users (id) on delete set null
);
