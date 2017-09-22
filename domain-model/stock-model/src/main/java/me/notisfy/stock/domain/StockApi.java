package me.notisfy.stock.domain;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import me.notisfy.stock.domain.model.ArticleIndex;
import me.notisfy.stock.domain.model.BotHoldings;
import me.notisfy.stock.domain.model.ProfitMonth;
import me.notisfy.stock.domain.model.TodaySummary;
import me.notisfy.stock.domain.model.VolumeFeaturedDays;
import me.notisfy.stock.domain.model.VolumeFeaturedProfit;
import me.notisfy.stock.domain.model.VolumeFeatured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StockApi {
  /**
   * Article Index 정보
   * 전략글과 컬럼등의 Article 파일들에 대한 인덱스 정보를 제공한다. 
   * @param articleIndexJson 인덱스 파일 이름 (required)
   * @return Call&lt;ArticleIndex&gt;
   */
  
  @GET("articles/{article_index_json}")
  Call<ArticleIndex> articlesArticleIndexJsonGet(
    @Path("article_index_json") String articleIndexJson
  );

  /**
   * 보유 주식
   * Stocker bot이 보유한 주식의 매입 비율을 제공한다. 
   * @param year 거래 해당 연도 (required)
   * @param dayJson 주식 보유일 (required)
   * @return Call&lt;BotHoldings&gt;
   */
  
  @GET("bot-holdings/{year}/{day_json}")
  Call<BotHoldings> botHoldingsYearDayJsonGet(
    @Path("year") String year, @Path("day_json") String dayJson
  );

  /**
   * 보유 주식
   * Stocker bot이 보유한 주식의 매입 비율을 제공한다. 
   * @param year 거래 해당 연도 (required)
   * @param dayJson 주식 보유일 (required)
   * @return Call&lt;BotHoldings&gt;
   */
  
  @GET("bot-holdings/{year}/{day_json}")
  Call<BotHoldings> botHoldingsYearDayJsonGet_0(
    @Path("year") String year, @Path("day_json") String dayJson
  );

  /**
   * 특정 일로부터 한달간의 주식 이익률
   * 시가총액 상위 200위 주식중 한달간 주식 이익률이 상위 20 / 하위 20 인 주식 목록을 제공한다. 
   * @param year 거래 해당 연도 (required)
   * @param dayJson 해당 일로부터 한달간의 이익률 정보가 담긴 리소스 이름 (required)
   * @return Call&lt;ProfitMonth&gt;
   */
  
  @GET("profit-month-from/{year}/{day_json}")
  Call<ProfitMonth> profitMonthFromYearDayJsonGet(
    @Path("year") String year, @Path("day_json") String dayJson
  );

  /**
   * 특정 일로부터 한달간의 주식 이익률
   * 시가총액 상위 200위 주식중 한달간 주식 이익률이 상위 20 / 하위 20 인 주식 목록을 제공한다. 
   * @param year 거래 해당 연도 (required)
   * @param dayJson 해당 일로부터 한달간의 이익률 정보가 담긴 리소스 이름 (required)
   * @return Call&lt;ProfitMonth&gt;
   */
  
  @GET("profit-month-from/{year}/{day_json}")
  Call<ProfitMonth> profitMonthFromYearDayJsonGet_0(
    @Path("year") String year, @Path("day_json") String dayJson
  );

  /**
   * 월 주식 이익률
   * 해당 연월의 주식 이익률을 상위 20 / 하위 20 제공한다. 
   * @param yearMonthJson 이익률 리소스 (required)
   * @return Call&lt;ProfitMonth&gt;
   */
  
  @GET("profit-month/{year_month_json}")
  Call<ProfitMonth> profitMonthYearMonthJsonGet(
    @Path("year_month_json") String yearMonthJson
  );

  /**
   * 월 주식 이익률
   * 해당 연월의 주식 이익률을 상위 20 / 하위 20 제공한다. 
   * @param yearMonthJson 이익률 리소스 (required)
   * @return Call&lt;ProfitMonth&gt;
   */
  
  @GET("profit-month/{year_month_json}")
  Call<ProfitMonth> profitMonthYearMonthJsonGet_0(
    @Path("year_month_json") String yearMonthJson
  );

  /**
   * 오늘의 주식 요약 정보
   * 오늘의 코스피와 거래량 특징주 그리고 주식 매매에 대한 요약 정보를 제공한다. 
   * @param year 거래 해당 연도 (required)
   * @param dayJson 오늘의 주식 요약 정보가 담긴 리소스 이름 (required)
   * @return Call&lt;TodaySummary&gt;
   */
  
  @GET("today/{year}/{day_json}")
  Call<TodaySummary> todayYearDayJsonGet(
    @Path("year") String year, @Path("day_json") String dayJson
  );

  /**
   * 거래량 특징주 이익률
   * 시가총액 상위 200위 기업중 거래량 특징이 나타난 주식의 2주간 수정종가 리스트 
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
   * 시가총액 상위 200위 기업중 거래량 특징이 나타난 주식의 2주간 수정종가 리스트 
   * @param year 거래 해당 연도 (required)
   * @param daySymbolJson 2주간의 수정종가를 알고 싶은 특정 주식의 코드(심볼)와 특정일 (required)
   * @return Call&lt;VolumeFeaturedDays&gt;
   */
  
  @GET("volume-featured-days/{year}/{day_symbol_json}")
  Call<VolumeFeaturedDays> volumeFeaturedDaysYearDaySymbolJsonGet_0(
    @Path("year") String year, @Path("day_symbol_json") String daySymbolJson
  );

  /**
   * 거래량 특징주 이익률
   * 시가총액 상위 200위 기업중 당 거래일 전일까지 거래량 특징을 보인 주식의 이익률 정보를 제공한다. 
   * @param year 거래 해당 연도 (required)
   * @param dayJson 거래량 특징주와 이익률 정보가 담긴 리소스 이름 (required)
   * @return Call&lt;VolumeFeaturedProfit&gt;
   */
  
  @GET("volume-featured-profit/{year}/{day_json}")
  Call<VolumeFeaturedProfit> volumeFeaturedProfitYearDayJsonGet(
    @Path("year") String year, @Path("day_json") String dayJson
  );

  /**
   * 거래량 특징주 이익률
   * 시가총액 상위 200위 기업중 당 거래일 전일까지 거래량 특징을 보인 주식의 이익률 정보를 제공한다. 
   * @param year 거래 해당 연도 (required)
   * @param dayJson 거래량 특징주와 이익률 정보가 담긴 리소스 이름 (required)
   * @return Call&lt;VolumeFeaturedProfit&gt;
   */
  
  @GET("volume-featured-profit/{year}/{day_json}")
  Call<VolumeFeaturedProfit> volumeFeaturedProfitYearDayJsonGet_0(
    @Path("year") String year, @Path("day_json") String dayJson
  );

  /**
   * 일별 거래량 특징주
   * 시가총액 상위 200위 기업중 당 거래일에 특징적인 거래량을 기록한 주식 정보를 제공한다. 
   * @param year 거래 해당 연도 (required)
   * @param dayJson 당일 거래량 특징주를 담은 리소스 이름 (required)
   * @return Call&lt;VolumeFeatured&gt;
   */
  
  @GET("volume-featured/{year}/{day_json}")
  Call<VolumeFeatured> volumeFeaturedYearDayJsonGet(
    @Path("year") String year, @Path("day_json") String dayJson
  );

  /**
   * 일별 거래량 특징주
   * 시가총액 상위 200위 기업중 당 거래일에 특징적인 거래량을 기록한 주식 정보를 제공한다. 
   * @param year 거래 해당 연도 (required)
   * @param dayJson 당일 거래량 특징주를 담은 리소스 이름 (required)
   * @return Call&lt;VolumeFeatured&gt;
   */
  
  @GET("volume-featured/{year}/{day_json}")
  Call<VolumeFeatured> volumeFeaturedYearDayJsonGet_0(
    @Path("year") String year, @Path("day_json") String dayJson
  );

}
