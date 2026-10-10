package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes45.dex */
@KeepForSdk
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    @KeepForSdk
    public native void nativeOnComplete(long j11, @Nullable Object obj, boolean z11, boolean z12, @Nullable String str);

    @KeepForSdk
    public static void createAndAddCallback(@NonNull Task<Object> task, long j11) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j11));
    }

    @KeepForSdk
    public NativeOnCompleteListener(long j11) {
        this.zza = j11;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    public void onComplete(@NonNull Task<Object> task) {
        Object result;
        String message;
        Exception exception;
        if (task.isSuccessful()) {
            result = task.getResult();
            message = null;
        } else if (!task.isCanceled() && (exception = task.getException()) != null) {
            message = exception.getMessage();
            result = null;
        } else {
            result = null;
            message = null;
        }
        nativeOnComplete(this.zza, result, task.isSuccessful(), task.isCanceled(), message);
    }
}
