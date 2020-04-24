static void performIterationsWithCallback(int numberOfIterations, LoopCallback callback) {
    for (int i = 0; i < numberOfIterations; i++) {
        callback.onNewIteration(i);
    }
}

static void startIterations(int numberOfIterations) {
    performIterationsWithCallback(numberOfIterations, new LoopCallback() {
        public void onNewIteration(int iteration) {
         System.out.println("Iteration: " + iteration);
        }
    });
}