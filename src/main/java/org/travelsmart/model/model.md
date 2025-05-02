## Model
- Data classes (entities, DTOs)
- Defining what a user may look like 
- It defines what the backend can accept from frontend, which fields it expects to see when it receives
JSON payload from the frontend
- It's a plain Java class with fields that match the JSON keys sent from the frontend (e.g., email, password)


## Why UserRegistration is in 'model'
- it's in 'model' because it's a **data structure** not a logic handler or web controller