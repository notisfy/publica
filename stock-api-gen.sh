rm -rf domain-model/stock-model
mkdir domain-model/stock-model
java -Dmodels -Dapis -DapiTests=false -DapiDocs=false -DmodelTests=false -DmodelDocs=false \
    -jar swagger-codegen-cli-2.2.1.jar generate \
    -i stock-api.yml \
    -l java \
    -c stock-api-config.json \
    -o domain-model/stock-model
mv domain-model/stock-model/src/main/java/me/notisfy/stock/domain/DefaultApi.java domain-model/stock-model/src/main/java/me/notisfy/stock/domain/StockApi.java
sed -i '' 's/DefaultApi/StockApi/' domain-model/stock-model/src/main/java/me/notisfy/stock/domain/StockApi.java
sed -i '' '/@ApiModelPropert/d' domain-model/stock-model/src/main/java/me/notisfy/stock/domain/model/*.java
sed -i '' '/import io\.swagger/d' domain-model/stock-model/src/main/java/me/notisfy/stock/domain/model/*.java
