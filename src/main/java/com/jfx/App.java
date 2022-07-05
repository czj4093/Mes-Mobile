package com.jfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class App extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        WebView webView = new WebView();
        webView.getEngine().load("http://mes.juyi.com.cn:55555/mobile");
        Scene scene = new Scene(webView);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
