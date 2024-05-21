CREATE TABLE Users
(
    id         UUID PRIMARY KEY,
    first_name VARCHAR(100),
    last_name  VARCHAR(100),
    email      VARCHAR(255) UNIQUE,
    company_id UUID,
    languages  jsonb,
    created_at TIMESTAMP,
    deleted_at TIMESTAMP
);