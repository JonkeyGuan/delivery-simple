cd ../
mvn clean package -DskipTests

cd env
oc start-build delivery-simple --from-dir=../target/ -F
