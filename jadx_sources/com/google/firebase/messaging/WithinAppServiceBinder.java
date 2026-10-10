package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.credentials.ExecutorC1980h;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
class WithinAppServiceBinder extends Binder {
    private final IntentHandler intentHandler;

    public interface IntentHandler {
        Task<Void> handle(Intent intent);
    }

    public WithinAppServiceBinder(IntentHandler intentHandler) {
        this.intentHandler = intentHandler;
    }

    public void send(final WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "service received new intent via bind strategy");
            }
            this.intentHandler.handle(bindRequest.intent).addOnCompleteListener(new ExecutorC1980h(), new OnCompleteListener() { // from class: com.google.firebase.messaging.l0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    bindRequest.finish();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
