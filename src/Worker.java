public class Worker {
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }


    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorListener) {
        this.callback = callback;
        this.errorCallback = errorListener;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i!=33){
                callback.onDone("Task " + i + " is done");
            } else {
                errorCallback.onError("Task execution error number " + i );
            }
        }
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String rezult);

    }
}
