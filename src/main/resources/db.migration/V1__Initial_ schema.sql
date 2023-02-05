CREATE TABLE aid_material_categories
(
    id                 PRIMARY KEY  NOT NULL,
    category_name      varchar(255) NOT NULL,
    is_active          bool,
    status             varchar(255) NOT NULL,
    created_date       timestamp    NOT NULL,
    last_modified_date timestamp    NOT NULL,
    version            integer      NOT NULL
);