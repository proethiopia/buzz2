package com.endpoint;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    get("/getendpoint", (request, response) -> {
      System.out.println("YOU are in the get endpoint");
      return "YOU are in the post endpoint" + request.body();
    });
    post("/endpoint", (request, response) -> {
      System.out.println("YOU are in the post endpoint");
      return "YOU are in the post endpoint" + response.body();
    });

    put("/putendpoint", (request, response) -> {
      System.out.println("You are in the PUT endpoint");
      return "YOU are in the PUT endpoint";
    });
    delete("/endpointdelete", (request, response) -> {
      System.out.println("You are in the DELETE endpoint");
      return "YOU are in the DELETE endpoint";
    });
  }
}
