package me.notisfy.stock.domain;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import me.notisfy.stock.domain.model.VolumeFeaturedDays;
import me.notisfy.stock.domain.model.VolumeFeaturedProfit;
import me.notisfy.stock.domain.model.VolumeFeatured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StockApi {
  /**
   * 거래량 특징주 이익률
   * 상위 200위 기업중 거래량 특징이 나타난 주식의 2주간 수정종가 리스트 
   * @param year 거래 해당 연도 (required)
   * @param daySymbolJson 2주간의 수정종가를 알고 싶은 특정 주식의 코드(심볼)와 특정일 (required)
   * @return Call&lt;VolumeFeaturedDays&gt;
   */
  
  @GET("volume-featured-days/{year}/{day_symbol_json}")
  Call<VolumeFeaturedDays> volumeFeaturedDaysYearDaySymbolJsonGet(
    @Path("year") String year, @Path("day_symbol_json") String daySymbolJson
  );

  /**
   * 거래량 특징주 이익률
   * 상위 200위 기업중 당 거래일 전일까지 거래량 특징을 보인 주식의 이익률 정보를 제공한다. 
   * @param year 거래 해당 연도 (required)
   * @param dayJson 거래량 특징주와 이익률 정보가 담긴 리소스 이름 (required)
   * @return Call&lt;VolumeFeaturedProfit&gt;
   */
  
  @GET("volume-featured-profit/{year}/{day_json}")
  Call<VolumeFeaturedProfit> volumeFeaturedProfitYearDayJsonGet(
    @Path("year") String year, @Path("day_json") String dayJson
  );

  /**
   * 일별 거래량 특징주
   * 상위 200위 기업중 당 거래일에 특징적인 거래량을 기록한 주식 정보를 제공한다. 
   * @param year 거래 해당 연도 (required)
   * @param dayJson 당일 거래량 특징주를 담은 리소스 이름 (required)
   * @return Call&lt;VolumeFeatured&gt;
   */
  
  @GET("volume-featured/{year}/{day_json}")
  Call<VolumeFeatured> volumeFeaturedYearDayJsonGet(
    @Path("year") String year, @Path("day_json") String dayJson
  );

}
