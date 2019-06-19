alter table SPEEDYPIZZAAPP_EMPLOYEE alter column NAME rename to NAME__U40394 ^
alter table SPEEDYPIZZAAPP_EMPLOYEE alter column NAME__U40394 set null ;
-- alter table SPEEDYPIZZAAPP_EMPLOYEE add column USER_ID varchar(36) ^
-- update SPEEDYPIZZAAPP_EMPLOYEE set USER_ID = <default_value> ;
-- alter table SPEEDYPIZZAAPP_EMPLOYEE alter column USER_ID set not null ;
alter table SPEEDYPIZZAAPP_EMPLOYEE add column USER_ID varchar(36) not null ;
