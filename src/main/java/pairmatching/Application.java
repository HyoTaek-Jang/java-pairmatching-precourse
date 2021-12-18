package pairmatching;

import pairmatching.controller.PairMatchingController;
import pairmatching.model.PairMatching;

public class Application {
    public static void main(String[] args) {
        PairMatchingController pairMatchingController = new PairMatchingController(new PairMatching());
        pairMatchingController.run();
    }
}
