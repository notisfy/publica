rm -rf domain-model/stock-model
mkdir domain-model/stock-model
java -Dmodels -Dapis -DapiTests=false -DapiDocs=false -DmodelTests=false -DmodelDocs=false \
    -jar swagger-codegen-cli-2.2.1.jar generate \
    -i stock-api.yml \
    -l java \
    -c stock-api-config.json \
    -o domain-model/stock-model
cp domain-model/stock-model-build.gradle domain-model/stock-model/build.gradle
cp domain-model/stock-model-gitignore domain-model/stock-model/.gitignore
touch domain-model/stock-model/settings.gradle
mv domain-model/stock-model/src/main/java/me/notisfy/stock/domain/DefaultApi.java domain-model/stock-model/src/main/java/me/notisfy/stock/domain/StockApi.java
sed -i.bak 's/DefaultApi/StockApi/' domain-model/stock-model/src/main/java/me/notisfy/stock/domain/StockApi.java
sed -i.bak '/import me\.notisfy\.stock\.CollectionFormats/d' domain-model/stock-model/src/main/java/me/notisfy/stock/domain/StockApi.java
rm -f domain-model/stock-model/src/main/java/me/notisfy/stock/domain/StockApi.java.bak
sed -i.bak '/@ApiModelPropert/d' domain-model/stock-model/src/main/java/me/notisfy/stock/domain/model/*.java
sed -i.bak '/import io\.swagger/d' domain-model/stock-model/src/main/java/me/notisfy/stock/domain/model/*.java
sed -i.bak '/import me\.notisfy\.stock\.CollectionFormats/d' domain-model/stock-model/src/main/java/me/notisfy/stock/domain/model/*.java
rm -f domain-model/stock-model/src/main/java/me/notisfy/stock/domain/model/*.java.bak
