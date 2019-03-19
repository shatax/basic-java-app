package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;




public class Main extends Application {

    private Stage window;
    private Scene scene1, scene2, scene3;
    private static int counter = 0;


    private int QuizCounter(){
        int count = 0;
        return count++;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        DropShadow shadow = new DropShadow(20,Color.WHITE);

        Counter count = new Counter();
        counter = count.getCounter();

        // Home Button for all

        Button homeButton = new Button("Home");
        HBox home = new HBox();
        home.getChildren().add(homeButton);
        home.setAlignment(Pos.BOTTOM_RIGHT);
        home.setPadding(new Insets(0, 10, 0, 0));
        homeButton.setStyle("-fx-background-color: blue");
        homeButton.setTextFill(Color.WHITE);
        homeButton.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                homeButton.setEffect(shadow);
                homeButton.setCursor(Cursor.HAND);
            }
        });

        homeButton.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                homeButton.setEffect(null);
            }
        });


        //submit button for all

        Button submit = new Button("Submit");
        submit.setStyle("-fx-background-color: blue");
        submit.setTextFill(Color.WHITE);
        submit.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                submit.setEffect(shadow);
                submit.setCursor(Cursor.HAND);
            }
        });
        submit.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                submit.setEffect(null);
            }
        });

        VBox submitHolder = new VBox();
        submitHolder.getChildren().add(submit);
        submitHolder.setAlignment(Pos.BOTTOM_RIGHT);
        submitHolder.setPadding(new Insets(0, 0, 0, 100));


        // Victory message
        VBox victory = new VBox(20);
        Button exit = new Button(" Home");
        exit.setStyle("-fx-background-color: black");
        exit.setTextFill(Color.WHITE);

        Label victoryMessage = new Label("Congrats!! You got all category of  questions right!!\n\nClick 'home' to go back");
        victory.getChildren().addAll(victoryMessage, exit);
        victory.setAlignment(Pos.CENTER);
        victory.setStyle("-fx-background-color: #27fac3");
        Scene victoryScene = new Scene(victory, 800, 800);
        exit.setOnAction(e -> window.setScene(scene1));

        exit.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                exit.setEffect(shadow);
                exit.setCursor(Cursor.HAND);
            }
        });
        exit.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                exit.setEffect(null);
            }
        });

        // Success Message

        VBox success = new VBox(20);
        Button back = new Button("Back");
        back.setStyle("-fx-background-color: darkgreen");
        back.setTextFill(Color.WHITE);
        back.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                back.setEffect(shadow);
                back.setCursor(Cursor.HAND);
            }
        });
        back.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                back.setEffect(null);
            }
        });
        Label successMessage = new Label("Congrats!! You got all questions right!!\n\nClick 'back' to try more!");
        success.getChildren().addAll(successMessage, back);
        success.setAlignment(Pos.CENTER);
        success.setStyle("-fx-background-color: lightgoldenrodyellow");
        Scene successScene = new Scene(success, 800, 800);
        back.setOnAction(e -> window.setScene(scene2));


        // Fair Message

        Button back2 = new Button("Back");
        back2.setStyle("-fx-background-color: orange");
        back2.setTextFill(Color.WHITE);
        back2.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                back2.setEffect(shadow);
                back2.setCursor(Cursor.HAND);
            }
        });
        back2.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                back2.setEffect(null);
            }
        });
        VBox fair = new VBox(21);
        Label fairMessage = new Label("Good Trial! You got 2 Correct!!\n\nClick 'back' to try more!");
        fair.getChildren().addAll(fairMessage, back2);
        fair.setAlignment(Pos.CENTER);
        fair.setStyle("-fx-background-color: lightgoldenrodyellow");
        Scene fairScene = new Scene(fair, 800, 800);
        back2.setOnAction(e -> window.setScene(scene2));

        // Try Again Message

        Button back3 = new Button("Again");
        back3.setStyle("-fx-background-color: #cf1010");
        back3.setTextFill(Color.WHITE);
        back3.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                back3.setEffect(shadow);
                back3.setCursor(Cursor.HAND);
            }
        });
        back3.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                back3.setEffect(null);
            }
        });
        VBox tryAgain = new VBox(22);
        Label tryAgainMessage = new Label("You tried\n\nClick 'Again' to try again");
        tryAgain.getChildren().addAll(tryAgainMessage, back3);
        tryAgain.setAlignment(Pos.CENTER);
        tryAgain.setStyle("-fx-background-color: lightgoldenrodyellow");
        Scene tryAgainScene = new Scene(tryAgain, 800, 800);
        back3.setOnAction(e -> window.setScene(scene3));

        //page 1

        Text firstPageLabel = new Text();
        firstPageLabel.setText("  Welcome to Quiz App!\n\nClick Below to Get Started!\n\n");
        firstPageLabel.setFont(Font.font(null, FontWeight.BOLD, 30));
        firstPageLabel.setFill(Color.WHITE);
        Button startButton = new Button("Get Started");
        startButton.setOnAction(e -> window.setScene(scene2));
        startButton.setTextFill(Color.YELLOW);
        startButton.setStyle("-fx-font-size: 2em; -fx-background-color: deeppink; " +
                "-fx-border-color: #fffcf3; -fx-border-width: 5px;");

        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(5.0);
        dropShadow.setOffsetX(4.0);
        dropShadow.setOffsetY(4.0);
        startButton.setEffect(dropShadow);


        startButton.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                startButton.setEffect(shadow);
                startButton.setCursor(Cursor.HAND);
            }
        });
        startButton.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                startButton.setEffect(null);
                startButton.setEffect(dropShadow);

            }
        });


        VBox homePage = new VBox(20);
        homePage.setAlignment(Pos.CENTER);
        homePage.getChildren().addAll(firstPageLabel, startButton);
        homePage.setStyle("-fx-background-color: purple;");
        scene1 = new Scene(homePage, 800, 800);

        //page2

        Text secondPageLabel = new Text();

        secondPageLabel.setText("Please Choose a category of Quizzes\n\t(Do the Categories in order)");
        secondPageLabel.setFill(Color.WHITE);
        secondPageLabel.setFont(Font.font(null, FontWeight.BOLD, 30));

        Button firstQuizButton = new Button("1. Science Questions");
        Button secondQuizButton = new Button("2. History Questions");
        Button thirdQuizButton = new Button("3. Pop Culture Questions");

        firstQuizButton.setTextFill(Color.WHITE);
        firstQuizButton.setStyle("-fx-background-color: blue; -fx-font-size: 1.6em;");
        firstQuizButton.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                firstQuizButton.setEffect(shadow);
                firstQuizButton.setCursor(Cursor.HAND);
            }
        });
        firstQuizButton.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                firstQuizButton.setEffect(null);
            }
        });
        secondQuizButton.setTextFill(Color.WHITE);
        secondQuizButton.setStyle("-fx-background-color: blue;-fx-font-size: 1.6em;");
        secondQuizButton.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                secondQuizButton.setEffect(shadow);
                secondQuizButton.setCursor(Cursor.HAND);
            }
        });
        secondQuizButton.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                secondQuizButton.setEffect(null);
            }
        });
        thirdQuizButton.setTextFill(Color.WHITE);
        thirdQuizButton.setStyle("-fx-background-color: blue;-fx-font-size: 1.6em;");
        thirdQuizButton.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                thirdQuizButton.setEffect(shadow);
                thirdQuizButton.setCursor(Cursor.HAND);
            }
        });
        thirdQuizButton.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                thirdQuizButton.setEffect(null);
            }
        });

        // Questions: category 1

        firstQuizButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                FlowPane quizBox = new FlowPane();

                TextField textField1 = new TextField();
                TextField textField2 = new TextField();
                TextField textField3 = new TextField();

                StackPane textPane = new StackPane();
                textPane.getChildren().add(textField1);
                textPane.setMaxWidth(150);

                StackPane textPane2 = new StackPane();
                textPane2.getChildren().add(textField2);
                textPane2.setMaxWidth(150);

                StackPane textPane3 = new StackPane();
                textPane3.getChildren().add(textField3);
                textPane3.setMaxWidth(150);

                Label quiz1 = new Label("1. What is the biggest planet in our solar system?\n\n");
                Label quiz1Choice1 = new Label("\tA. Mars");
                Label quiz1Choice2 = new Label("\tB. Jupiter");
                Label quiz1choice3 = new Label("\tC. Earth\n");
                Label answerLabel = new Label("type your choice below (uppercase)");

                Label quiz2 = new Label("2. True or False? Dogs are herbivores\n");
                Label quiz2Choice1 = new Label("\tA. True");
                Label quiz2Choice2 = new Label("\tB. False");
                Label answerLabel2 = new Label("Type your choice below (first letter uppercase)");

                Label quiz3 = new Label("3. Which is the most abundant gas in the earth's atmosphere?");
                Label quiz3Choice1 = new Label("\tA. Nitrogen");
                Label quiz3Choice2 = new Label("\tB. Oxygen");
                Label quiz3Choice3 = new Label("\tC. Neon");
                Label answerLabel3 = new Label("Type your choice below (first letter uppercase)");


                submit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {

                        int count = QuizCounter();
                        String quiz1Ans = "B";
                        String quiz2Ans = "B";
                        String quiz3Ans = "A";

                        if (textField1.getText().equals(quiz1Ans)) {
                            count++;

                        }
                        if (textField2.getText().equals(quiz2Ans)) {
                            count++;
                        }
                        if (textField3.getText().equals(quiz3Ans)) {
                            count++;
                        }

                        if (count == 3) {
                            counter++;
                            window.setScene(successScene);
                        } else if (count == 2) {
                            window.setScene(fairScene);
                        } else if (count == 1 || count == 0) {
                            window.setScene(tryAgainScene);
                        }
                    }
                });


                VBox scienceBox = new VBox(10);

                scienceBox.getChildren().addAll(quiz1, quiz1Choice1, quiz1Choice2, quiz1choice3, answerLabel,
                        textPane, quiz2, quiz2Choice1, quiz2Choice2, answerLabel2, textPane2, quiz3, quiz3Choice1,
                        quiz3Choice2, quiz3Choice3, textPane3, answerLabel3, submitHolder);

                homeButton.setOnAction(e -> window.setScene(scene1));

                quizBox.getChildren().addAll(home, scienceBox);

                quizBox.setAlignment(Pos.CENTER);
                quizBox.setStyle("-fx-background-color: lightblue");

                scene3 = new Scene(quizBox, 800, 800);
                window.setScene(scene3);
                window.setTitle("Science Questions");

            }
        });
        secondQuizButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FlowPane quizBox2 = new FlowPane();

                TextField textField = new TextField();
                TextField textField2 = new TextField();
                TextField textField3 = new TextField();

                StackPane textPane = new StackPane();
                textPane.getChildren().add(textField);
                textPane.setMaxWidth(150);

                StackPane textPane2 = new StackPane();
                textPane2.getChildren().add(textField2);
                textPane2.setMaxWidth(150);

                StackPane textPane3 = new StackPane();
                textPane3.getChildren().add(textField3);
                textPane3.setMaxWidth(150);

                Label quiz1 = new Label("1. World War 1 began in which year?\n\n");
                Label quiz1Choice1 = new Label("\tA. 1923");
                Label quiz1Choice2 = new Label("\tB. 1938");
                Label quiz1choice3 = new Label("\tC. 1914");
                Label answerLabel = new Label("type your choice below (uppercase)");

                Label quiz2 = new Label("2. Who invented the Evolution Theory? Charles ________");
                Label quiz2Choice1 = new Label("\tA. Darwin");
                Label quiz2Choice2 = new Label("\tB. Einstein");
                Label quiz2Choice3 = new Label("\tC. Turing");
                Label answerLabel2 = new Label("Type your choice below (first letter uppercase)");

                Label quiz3 = new Label("3. When was Acadia University Founded");
                Label quiz3Choice1 = new Label("\tA. 1880");
                Label quiz3Choice2 = new Label("\tB. 1838");
                Label quiz3Choice3 = new Label("\tC. 1900");
                Label answerLabel3 = new Label("Type your choice below (first letter uppercase)");


                submit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {

                        int count = QuizCounter();
                        String quiz1Ans = "C";
                        String quiz2Ans = "A";
                        String quiz3Ans = "B";

                        if (textField.getText().equals(quiz1Ans)) {
                            count++;
                        }
                        if (textField2.getText().equals(quiz2Ans)) {
                            count++;
                        }
                        if (textField3.getText().equals(quiz3Ans)) {
                            count++;
                        }
                        if (count == 3) {
                            counter++;
                            window.setScene(successScene);
                        } else if (count == 2) {
                            window.setScene(fairScene);
                        } else if (count == 1 || count == 0) {
                            window.setScene(tryAgainScene);
                        }
                    }
                });


                VBox historyBox = new VBox(10);

                historyBox.getChildren().addAll(quiz1, quiz1Choice1, quiz1Choice2, quiz1choice3, answerLabel,
                        textPane, quiz2, quiz2Choice1, quiz2Choice2, quiz2Choice3, answerLabel2, textPane2, quiz3, quiz3Choice1,
                        quiz3Choice2, quiz3Choice3, textPane3, answerLabel3, submitHolder);

                homeButton.setOnAction(e -> window.setScene(scene1));

                quizBox2.getChildren().addAll(home, historyBox);

                quizBox2.setAlignment(Pos.CENTER);
                quizBox2.setStyle("-fx-background-color: violet");

                scene3 = new Scene(quizBox2, 800, 800);
                window.setScene(scene3);
                window.setTitle("History Questions");

            }
        });
        thirdQuizButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                FlowPane quizBox3 = new FlowPane();

                TextField textField = new TextField();
                TextField textField2 = new TextField();
                TextField textField3 = new TextField();

                StackPane textPane = new StackPane();
                textPane.getChildren().add(textField);
                textPane.setMaxWidth(150);

                StackPane textPane2 = new StackPane();
                textPane2.getChildren().add(textField2);
                textPane2.setMaxWidth(150);

                StackPane textPane3 = new StackPane();
                textPane3.getChildren().add(textField3);
                textPane3.setMaxWidth(150);

                Label quiz1 = new Label("1. In which city was the 2016 Summer Olympics held?\n\n");
                Label quiz1Choice1 = new Label("\tA. Rio");
                Label quiz1Choice2 = new Label("\tB. Mogadishu");
                Label quiz1choice3 = new Label("\tC. Abuja");
                Label answerLabel = new Label("type your choice below (uppercase)");

                Label quiz2 = new Label("2. Which CONTINENT is the most linguistically diverse in the world?");
                Label quiz2Choice1 = new Label("\tA. Africa");
                Label quiz2Choice2 = new Label("\tB. Asia");
                Label quiz2Choice3 = new Label("\tC. Antarctica");
                Label answerLabel2 = new Label("Type your choice");

                Label quiz3 = new Label("3. Who won the 2018 Fifa World Cup?");
                Label quiz3Choice1 = new Label("\tA. Brazil");
                Label quiz3Choice2 = new Label("\tB. France");
                Label quiz3Choice3 = new Label("\tC. Germany");
                Label answerLabel3 = new Label("Type your choice below (uppercase)");


                submit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {

                        int count = QuizCounter();
                        String quiz1Ans = "A";
                        String quiz2Ans = "A";
                        String quiz3Ans = "B";

                        if (textField.getText().equals(quiz1Ans)) {
                            count++;
                        }
                        if (textField2.getText().equals(quiz2Ans)) {
                            count++;
                        }
                        if (textField3.getText().equals(quiz3Ans)) {
                            count++;
                        }
                        if (count == 3) {
                            counter++;
                            window.setScene(successScene);
                        } else if (count == 2) {
                            window.setScene(fairScene);
                        } else if (count == 1 || count == 0) {
                            window.setScene(tryAgainScene);
                        }

                        if (counter == 3){
                            window.setScene(victoryScene);
                            counter = 0;
                        }
                    }
                });


                VBox popCultureBox = new VBox(10);

                popCultureBox.getChildren().addAll(quiz1, quiz1Choice1, quiz1Choice2, quiz1choice3, answerLabel,
                        textPane, quiz2, quiz2Choice1, quiz2Choice2, quiz2Choice3, answerLabel2, textPane2, quiz3, quiz3Choice1,
                        quiz3Choice2, quiz3Choice3, textPane3, answerLabel3, submitHolder);

                homeButton.setOnAction(e -> window.setScene(scene1));

                quizBox3.getChildren().addAll(home, popCultureBox);

                quizBox3.setAlignment(Pos.CENTER);
                quizBox3.setStyle("-fx-background-color: lightgreen");

                scene3 = new Scene(quizBox3, 800, 800);
                window.setScene(scene3);
                window.setTitle("Pop Culture Questions");
            }
        });

        VBox buttonBox = new VBox(20);
        buttonBox.getChildren().addAll(firstQuizButton, secondQuizButton, thirdQuizButton);
        buttonBox.setAlignment(Pos.BOTTOM_CENTER);

        VBox layout2 = new VBox(20);
        layout2.setAlignment(Pos.CENTER);
        layout2.getChildren().addAll(secondPageLabel, buttonBox);
        layout2.setStyle("-fx-background-color: blueviolet;");
        scene2 = new Scene(layout2, 800, 800);

        window.setScene(scene1);
        window.setTitle("Test App");
        window.show();


    }


    private class Counter {


        private int cnt;

        private int getCounter(){
            return cnt++;
        }
    }



    public static void main(String[] args) {
        launch(args);
    }
}
