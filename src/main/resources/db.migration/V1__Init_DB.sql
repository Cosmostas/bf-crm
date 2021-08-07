CREATE TABLE "Lead" (
       "Id" bigserial PRIMARY KEY,
       "FirstName" VARCHAR NOT NULL,
       "LastName" VARCHAR NOT NULL,
       "MiddleName" VARCHAR,
       "PhoneNumber" VARCHAR NOT NULL,
       "Email" VARCHAR NOT NULL,
       "Gender" BOOLEAN NOT NULL,
       "DateofBirth" DATE NOT NULL,
       "Login" VARCHAR NOT NULL,
       "Password" VARCHAR NOT NULL,
       CONSTRAINT "Account_fk0" FOREIGN KEY ("LeadId") REFERENCES "Lead"("Id")
);



CREATE TABLE "Account" (
      "Id" bigserial PRIMARY KEY,
      "LeadId" INT8 NOT NULL ,
      "SubscriptionType" INT4
);
ALTER TABLE "Account" ADD CONSTRAINT "Account_fk0" FOREIGN KEY ("LeadId") REFERENCES "Lead"("Id")