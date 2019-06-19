update SPEEDYPIZZAAPP_ORDER_DETAILS set COUNT_ = 0 where COUNT_ is null ;
alter table SPEEDYPIZZAAPP_ORDER_DETAILS alter column COUNT_ set not null ;
-- update SPEEDYPIZZAAPP_ORDER_DETAILS set DISH_ID = <default_value> where DISH_ID is null ;
alter table SPEEDYPIZZAAPP_ORDER_DETAILS alter column DISH_ID set not null ;
