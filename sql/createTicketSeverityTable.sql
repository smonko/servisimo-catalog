BEGIN;

-- CREATE TABLE "ticketseverity" ---------------------------------
CREATE TABLE "public"."ticketseverity" ( 
	"id" Integer NOT NULL,
	"severity" Varchar(50) NOT NULL,
	CONSTRAINT "unique_ticketseverity_id" UNIQUE( "id" ) );
 ;
-- -------------------------------------------------------------

COMMIT;
