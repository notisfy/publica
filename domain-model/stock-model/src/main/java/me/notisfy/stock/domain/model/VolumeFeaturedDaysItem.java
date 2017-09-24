/**
 * Stock API
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.9
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


/**
 * VolumeFeaturedDaysItem
 */

public class VolumeFeaturedDaysItem   {
  @SerializedName("date")
  private String date = null;

  @SerializedName("volume")
  private String volume = null;

  @SerializedName("adjClosePrice")
  private String adjClosePrice = null;

  @SerializedName("featured")
  private Boolean featured = null;

  public VolumeFeaturedDaysItem date(String date) {
    this.date = date;
    return this;
  }

   /**
   * 날짜
   * @return date
  **/
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public VolumeFeaturedDaysItem volume(String volume) {
    this.volume = volume;
    return this;
  }

   /**
   * 거래량
   * @return volume
  **/
  public String getVolume() {
    return volume;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }

  public VolumeFeaturedDaysItem adjClosePrice(String adjClosePrice) {
    this.adjClosePrice = adjClosePrice;
    return this;
  }

   /**
   * 수정종가
   * @return adjClosePrice
  **/
  public String getAdjClosePrice() {
    return adjClosePrice;
  }

  public void setAdjClosePrice(String adjClosePrice) {
    this.adjClosePrice = adjClosePrice;
  }

  public VolumeFeaturedDaysItem featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

   /**
   * 해당 날짜가 featured 된 날인지 여부
   * @return featured
  **/
  public Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeFeaturedDaysItem volumeFeaturedDaysItem = (VolumeFeaturedDaysItem) o;
    return Objects.equals(this.date, volumeFeaturedDaysItem.date) &&
        Objects.equals(this.volume, volumeFeaturedDaysItem.volume) &&
        Objects.equals(this.adjClosePrice, volumeFeaturedDaysItem.adjClosePrice) &&
        Objects.equals(this.featured, volumeFeaturedDaysItem.featured);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, volume, adjClosePrice, featured);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeFeaturedDaysItem {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    adjClosePrice: ").append(toIndentedString(adjClosePrice)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
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

