# Create Wrapper
mvn wrapper:wrapper

# Update Wrapper
./mvnw wrapper:wrapper -Dtype=bin -Dmaven=4.0.0-rc-2

# 1. Call updates maven-wrapper.properties.
# 2. Call updates maven-wrapper.jar and mvnw.* Files.

# Using Wrapper
./mvnw GOAL
