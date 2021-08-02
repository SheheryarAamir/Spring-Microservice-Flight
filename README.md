# Spring-Microservice-Flight
# Reactive # Spring WebFlux

# Functional Requirements
-Flight Service<br/>
	getFlight (date or airport of departure or arrival) returns flight number<br/><br/>
-Price Service<br/>
	getPrice  (flight number, date) returns price<br/>

# Non-Functional Requirements
Scalable <br/>
Highly Performant<br/>
Highly Available<br/>

# Estimates
Flight<br/>
SLA is 850ms, load might vary: from 1K to 50K request per <br/>
<br/>
Price<br/>
taking 3GB RAM - you have to keep in memory<br/>
SLA is 50ms, load is around 50 request per day<br/>
