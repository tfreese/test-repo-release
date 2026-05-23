# Create Wrapper
mvn wrapper:wrapper

# Update Wrapper
# 1. Call updates maven-wrapper.properties.
# 2. Call updates maven-wrapper.jar and mvnw.* Files.

#./mvnw wrapper:wrapper -Dtype=bin -Dmaven=...
./mvnw wrapper:wrapper -Dmaven=3.9.16

# Using Wrapper
./mvnw GOAL
