/**
 * Stock API
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package me.notisfy.stock.domain.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import me.notisfy.stock.domain.model.VolumeFeaturedItem;


/**
 * VolumeFeatured
 */

public class VolumeFeatured   {
  @SerializedName("version")
  private String version = null;

  @SerializedName("stocks")
  private List<VolumeFeaturedItem> stocks = new ArrayList<VolumeFeaturedItem>();

  public VolumeFeatured version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Volume featured 버전
   * @return version
  **/
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public VolumeFeatured stocks(List<VolumeFeaturedItem> stocks) {
    this.stocks = stocks;
    return this;
  }

  public VolumeFeatured addStocksItem(VolumeFeaturedItem stocksItem) {
    this.stocks.add(stocksItem);
    return this;
  }

   /**
   * 거래량 특징주 정보
   * @return stocks
  **/
  public List<VolumeFeaturedItem> getStocks() {
    return stocks;
  }

  public void setStocks(List<VolumeFeaturedItem> stocks) {
    this.stocks = stocks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeFeatured volumeFeatured = (VolumeFeatured) o;
    return Objects.equals(this.version, volumeFeatured.version) &&
        Objects.equals(this.stocks, volumeFeatured.stocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, stocks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeFeatured {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    stocks: ").append(toIndentedString(stocks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

