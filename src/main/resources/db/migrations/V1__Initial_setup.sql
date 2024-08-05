CREATE TABLE login (
    id SERIAL PRIMARY KEY,
    password varchar(50) NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE years_of_experience (
    id SERIAL PRIMARY KEY,
    label VARCHAR(20),
    min_years INTEGER,
    max_years INTEGER
);

CREATE TABLE country (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    iso_code VARCHAR(10) UNIQUE,
    phone_prefix VARCHAR(10)
);

CREATE TABLE address (
    id SERIAL PRIMARY KEY,
    street_name VARCHAR(255) NOT NULL,
    door VARCHAR(50),
    floor VARCHAR(50),
    postal_code VARCHAR(20),
    city VARCHAR(100),
    country_id INTEGER,
    phone_number VARCHAR(50),
    longitude DOUBLE PRECISION,
    latitude DOUBLE PRECISION,
    CONSTRAINT fk_country FOREIGN KEY (country_id) REFERENCES country(id)
);

CREATE TABLE company (
    id SERIAL PRIMARY KEY,
    company_name VARCHAR(255),
    address_id INTEGER,
    CONSTRAINT fk_address FOREIGN KEY (address_id) REFERENCES address(id)
);

CREATE TABLE plumbee (
    id SERIAL PRIMARY KEY,
    login_id INTEGER,
    fullname varchar(50),
    email varchar(50) UNIQUE NOT NULL,
    birthdate TIMESTAMP,
    phone_number VARCHAR(50),
    profile_photo_id INTEGER,
    user_type INTEGER,
    address_id INTEGER,

    CONSTRAINT fk_login FOREIGN KEY (login_id) REFERENCES login(id),
    CONSTRAINT fk_address FOREIGN KEY (address_id) REFERENCES address(id)
);

CREATE TABLE profession (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    requires_certificate boolean
);

CREATE TABLE householder (
    id SERIAL PRIMARY KEY,
    plumbee_id INTEGER,
    
    CONSTRAINT fk_plumbee FOREIGN KEY (plumbee_id) REFERENCES plumbee(id)
);

CREATE TABLE preferred_profession (
    id SERIAL PRIMARY KEY,
    profession_id INTEGER,
    householder_Id INTEGER,

    CONSTRAINT fk_profession FOREIGN KEY (profession_id) REFERENCES profession(id),
    CONSTRAINT fk_householder FOREIGN KEY (householder_id) REFERENCES householder(id)
);

CREATE TABLE technician (
    id SERIAL PRIMARY KEY,
    plumbee_id INTEGER,
    profession_id INTEGER,
    second_profession_id INTEGER,
    years_of_experience_id INTEGER,

    CONSTRAINT fk_plumbee FOREIGN KEY (plumbee_id) REFERENCES plumbee(id),
    CONSTRAINT fk_profession FOREIGN KEY (profession_id) REFERENCES profession(id),
    CONSTRAINT fk_second_profession FOREIGN KEY (second_profession_id) REFERENCES profession(id),
    CONSTRAINT fk_experience FOREIGN KEY (years_of_experience_id) REFERENCES years_of_experience(id)
);


