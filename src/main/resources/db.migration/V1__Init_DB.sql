CREATE TABLE "Lead" (
       "Id" bigserial,
       "FirstName" character varying NOT NULL,
       "LastName" character varying NOT NULL,
       "MiddleName" character varying,
       "PhoneNumber" character varying NOT NULL,
       "Email" character varying NOT NULL,
       "Gender" BOOLEAN NOT NULL,
       "DateofBirth" DATE NOT NULL,
       "Login" character varying NOT NULL,
       "Password" character varying NOT NULL,
       CONSTRAINT "Lead_pk" PRIMARY KEY ("Id")
) WITH (
      OIDS=FALSE
);



CREATE TABLE "Account" (
      "Id" bigserial,
      "LeadId" bigserial,
      "SubscriptionType" bigserial,
      CONSTRAINT "Account_pk" PRIMARY KEY ("Id")
) WITH (
      OIDS=FALSE
);





ALTER TABLE "Account" ADD CONSTRAINT "Account_fk0" FOREIGN KEY ("LeadId") REFERENCES "Lead"("Id");


