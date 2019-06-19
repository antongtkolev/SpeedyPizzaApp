alter table SPEEDYPIZZAAPP_DISH alter column PRICE rename to PRICE__U00706 ^
alter table SPEEDYPIZZAAPP_DISH alter column PRICE__U00706 set null ;
alter table SPEEDYPIZZAAPP_DISH add column PRICE decimal(19, 2) ^
update SPEEDYPIZZAAPP_DISH set PRICE = 0 where PRICE is null ;
alter table SPEEDYPIZZAAPP_DISH alter column PRICE set not null ;
