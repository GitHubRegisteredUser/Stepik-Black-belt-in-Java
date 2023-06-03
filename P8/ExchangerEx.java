package P8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {

    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.SCISSORS);
        friend1Action.add(Action.PAPER);
        friend1Action.add(Action.SCISSORS);
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.PAPER);
        friend2Action.add(Action.ROCK);
        friend2Action.add(Action.ROCK);

        new BestFriend("Vanya", friend1Action, exchanger);
        new BestFriend("Petya", friend2Action, exchanger);
    }

}

enum Action {
    ROCK, SCISSORS, PAPER;
}

class BestFriend extends Thread {

    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if ((myAction == Action.ROCK && friendsAction == Action.SCISSORS) ||
                (myAction == Action.SCISSORS && friendsAction == Action.PAPER) ||
                (myAction == Action.PAPER && friendsAction == Action.ROCK)) {
            System.out.println(name + " WINS!!!");
        }
    }

    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}