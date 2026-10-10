package com.facebook.react.bridge;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes45.dex */
public abstract class GuardedResultAsyncTask<Result> extends AsyncTask<Void, Void, Result> {
    private final JSExceptionHandler mExceptionHandler;

    public GuardedResultAsyncTask(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }

    public abstract Result doInBackgroundGuarded();

    public abstract void onPostExecuteGuarded(Result result);

    public GuardedResultAsyncTask(JSExceptionHandler jSExceptionHandler) {
        this.mExceptionHandler = jSExceptionHandler;
    }

    @Override // android.os.AsyncTask
    public final Result doInBackground(Void... voidArr) {
        try {
            return doInBackgroundGuarded();
        } catch (RuntimeException e11) {
            this.mExceptionHandler.handleException(e11);
            throw e11;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Result result) {
        try {
            onPostExecuteGuarded(result);
        } catch (RuntimeException e11) {
            this.mExceptionHandler.handleException(e11);
        }
    }
}
