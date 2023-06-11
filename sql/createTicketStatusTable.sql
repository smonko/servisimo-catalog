BEGIN;

-- CREATE TABLE "ticketstatus" ---------------------------------
CREATE TABLE "public"."ticketstatus" ( 
	"id" Integer NOT NULL,
	"status" Varchar(50) NOT NULL,
	CONSTRAINT "unique_ticketstatus_id" UNIQUE( "id" ) );
 ;
-- -------------------------------------------------------------

COMMIT;
