## Repository
- For DB interaction (if using a DB)
- Repository layer - responsible for data access - retrieving, saving, updating and deleting data from the DB
- These are always 'interfaces' because we are defining a 'contract'
- There is no need to write implementation classes because we always extend JpaRepository
- When Spring sees extends Jpa... it auto creates a class at runtime that implements all the methods of Jpa...