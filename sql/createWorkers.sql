BEGIN;

-- CREATE TABLE "workers" ---------------------------------
CREATE TABLE "public"."workers" ( 
	"id" Integer NOT NULL,
	"name" Varchar(50) NOT NULL,
	"email" Varchar(50) NOT NULL,
	CONSTRAINT "unique_workers_id" UNIQUE( "id" ) );
 ;
-- -------------------------------------------------------------

COMMIT;
