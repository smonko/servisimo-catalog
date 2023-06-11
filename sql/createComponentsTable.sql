BEGIN;

-- CREATE TABLE "components" ---------------------------------
CREATE TABLE "public"."components" ( 
	"id" Integer NOT NULL,
	"name" Varchar(50) NOT NULL,
	"description" TEXT NOT NULL,
	CONSTRAINT "unique_components_id" UNIQUE( "id" ) );
 ;
-- -------------------------------------------------------------

COMMIT;
