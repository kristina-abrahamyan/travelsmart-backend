## Model
- Data classes (entities, DTOs)
- Defining what a user may look like 
- It defines what the backend can accept from frontend, which fields it expects to see when it receives
JSON payload from the frontend
- It's a plain Java class with fields that match the JSON keys sent from the frontend (e.g., email, password)


## Why UserRegistration is in 'model'
- it's in 'model' because it's a **data structure** not a logic handler or web controller
- it's a DTO - collects data coming from frontend

## Why User is in 'model'
- User is an 'Entity' - connects to DB - entity stored and queried in the DB

## Object-Relational Mapping 
- Programming technique that simplifies database interactions by allowing developers to work with objects 
in their programming language instead of writing SQL queries directly