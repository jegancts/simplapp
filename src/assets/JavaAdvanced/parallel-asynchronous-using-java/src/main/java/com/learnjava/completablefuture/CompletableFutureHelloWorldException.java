package com.learnjava.completablefuture;

import com.learnjava.service.HelloWorldService;

import java.util.concurrent.CompletableFuture;

import static com.learnjava.util.CommonUtil.*;
import static com.learnjava.util.LoggerUtil.log;

public class CompletableFutureHelloWorldException {

    private HelloWorldService hws;

    public CompletableFutureHelloWorldException(HelloWorldService hws) {
        this.hws = hws;
    }


    public String helloworld_3_async_calls_handle(){
        startTimer();

        CompletableFuture<String> hello = CompletableFuture.supplyAsync(()->hws.hello());
        CompletableFuture<String> world = CompletableFuture.supplyAsync(()->hws.world());
        CompletableFuture<String> hiCompletableFuture =  CompletableFuture.supplyAsync(()->{
            delay(1000);
            return " Hi CompletableFuture!";
        });

        String hw= hello // hello
                .handle((res, e) -> {
                    log("res is :" + res);
                    if(e!=null){
                        log("Exception is :" + e.getMessage());
                        return "";
                    }else{
                        return res;
                    }

                })
                .thenCombine(world, (h, w) -> h+w) // "hello world!"
                .handle((res, e) -> {
                    log("res is :" + res);
                    if(e!=null){
                        log("Exception after world is :" + e.getMessage());
                        return "";
                    }else{
                        return res;
                    }
                })
                .thenCombine(hiCompletableFuture, (previous,current)->previous+current)
                //   "hello world! Hi CompletableFuture!"
                .thenApply(String::toUpperCase) // "HELLO WORLD! HI COMPLETABLEFUTURE!"
                .join(); // "HELLO WORLD! HI COMPLETABLEFUTURE!"

        timeTaken();
        return hw;
    }
}
