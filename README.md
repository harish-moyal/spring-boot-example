# spring-boot-rest
Rest Webservice using spring boot

# Endpoints supported
#Add vehichles
curl -i -H "Content-Type: application/json" -X POST -d 'Initial_Json' http://localhost:8080/addVehicles

#Print vehichles by price
curl -i -H "Content-Type: application/json" -X POST http://localhost:8080/print?sort=asc/desc

#Print vehicles by average cost by variable types
curl -i -H "Content-Type: application/json" -X POST http://localhost:8080/averageCostBy?type=carType/color/engine/brand
