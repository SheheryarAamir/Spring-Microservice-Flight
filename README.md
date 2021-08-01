# Spring-Microservice-Flight

# Functional Requirements
-Flight Service
	getFlight (date or airport of departure or arrival) returns flight number
-Price Service
	getPrice  (flight number, date) returns price

# Non-Functional Requirements
Scalable 
Highly Performant
Highly Available

# Estimates
Flight
SLA is 850ms, load might vary: from 1K to 50K request per second

Price
taking 3GB RAM - you have to keep in memory
SLA is 50ms, load is around 50 request per day
