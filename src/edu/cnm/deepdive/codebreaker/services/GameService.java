package edu.cnm.deepdive.codebreaker.services;

import edu.cnm.deepdive.codebreaker.models.Game;
import edu.cnm.deepdive.codebreaker.models.Guess;
import java.util.List;
import java.util.UUID;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;

public interface GameService {

  @GET("games")
  Call<List<Game>> list();

  @GET ("games/(uuid)")
  Call<Game> findById(@Path("uuid") UUID uuid);

  @POST("games")
  Call<Game> createGame (@Body Game game);

  @POST("games/{id}/guesses")
  @Headers("accept:application/json")
  Call<Guess> createGuess(@Path("id") UUID id,@Body Guess guess);

}
