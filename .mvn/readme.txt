# Create Wrapper
mvn wrapper:wrapper

# Update Wrapper
# 1. Call updates maven-wrapper.properties.
# 2. Call updates maven-wrapper.jar and mvnw.* Files.

./mvnw wrapper:wrapper -Dtype=bin -Dmaven=4.0.0-rc-3

# Using Wrapper
./mvnw GOAL
