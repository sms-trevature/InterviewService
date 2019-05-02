# InterviewService
Interview API for Staging Management System for Revature.


# Step 1 - Set up DB and Interview Service
1. You will need to create your own PostgreSQL DB on either your local machine or on a RDS. 
2. Figure out the schema necessary for this service. 
    * You will need tables at least for the interview,clients, and feedback
3. Will need to run the scripts included on that schema. 
4. All environment variables will need to be set. 
    * "DEPLOYMENT_STAGE": "dev",
    * "COGNITO_KEY": "Key from Cognito",
    * "COGNITO_URL": "URL for Cognito",
    * "DB_URL": "The actual DB URL",
    * "DB_USERNAME": "DB username",
    * "DB_PASSWORD": "DB password",
    * "DB_SCHEMA": "Schema where you have the tables saved", 
    * "GATEWAY_URL": "Gateway or Discovery Service URL (i.e. localhost:port")
5. Start running the Gateway Service and the Service Registry (requires addiional cognito config)
6. Start up this microservice
7. (Optional) You will probably need to start up the User Service to get all of the Cohorts and Associates for New Interview Component on the UI (requires addiional cognito and database config)

# Step 2 - Set up for Angular
1. npm install
2. ng add ngx-bootstrap  --component datepicker
3. npm start
  no additional environment variable configuration if running services locally
4. import { BsDatepickerModule } from 'ngx-bootstrap/datepicker'; in the components necessary
5. [Continue Reading in the Angular Documentation](https://github.com/sms-trevature/user-interface/tree/master/sms-ui)


