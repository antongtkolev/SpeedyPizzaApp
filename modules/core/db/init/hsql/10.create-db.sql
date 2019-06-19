-- begin SPEEDYPIZZAAPP_ORDER_DETAILS
create table SPEEDYPIZZAAPP_ORDER_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COUNT_ integer not null,
    ORDER_ID varchar(36) not null,
    DISH_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end SPEEDYPIZZAAPP_ORDER_DETAILS
-- begin SPEEDYPIZZAAPP_DISH
create table SPEEDYPIZZAAPP_DISH (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100) not null,
    PRICE decimal(19, 2) not null,
    PREP_TIME time not null,
    DISH_TYPE_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end SPEEDYPIZZAAPP_DISH
-- begin SPEEDYPIZZAAPP_INGREDIENTS
create table SPEEDYPIZZAAPP_INGREDIENTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100),
    --
    primary key (ID)
)^
-- end SPEEDYPIZZAAPP_INGREDIENTS
-- begin SPEEDYPIZZAAPP_DISH_TYPE
create table SPEEDYPIZZAAPP_DISH_TYPE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100) not null,
    --
    primary key (ID)
)^
-- end SPEEDYPIZZAAPP_DISH_TYPE
-- begin SPEEDYPIZZAAPP_CUSTOMER
create table SPEEDYPIZZAAPP_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CUSTOMER_ADRESS varchar(255) not null,
    PHONE_NUMBER varchar(20) not null,
    ORDER_COUNTER integer not null,
    --
    primary key (ID)
)^
-- end SPEEDYPIZZAAPP_CUSTOMER
-- begin SPEEDYPIZZAAPP_ORDERS
create table SPEEDYPIZZAAPP_ORDERS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_TIME timestamp not null,
    DELIVERY_DETAILS varchar(300),
    ESTIMATE_DELIVERY_TIME time not null,
    EMPLOYEE_ID varchar(36) not null,
    CUSTOMER_ID varchar(36) not null,
    TOTAL_AMOUNT decimal(19, 2),
    --
    primary key (ID)
)^
-- end SPEEDYPIZZAAPP_ORDERS
-- begin SPEEDYPIZZAAPP_EMPLOYEE
create table SPEEDYPIZZAAPP_EMPLOYEE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end SPEEDYPIZZAAPP_EMPLOYEE
-- begin SPEEDYPIZZAAPP_INGREDIENTS_DISH_LINK
create table SPEEDYPIZZAAPP_INGREDIENTS_DISH_LINK (
    INGREDIENTS_ID varchar(36) not null,
    DISH_ID varchar(36) not null,
    primary key (INGREDIENTS_ID, DISH_ID)
)^
-- end SPEEDYPIZZAAPP_INGREDIENTS_DISH_LINK
