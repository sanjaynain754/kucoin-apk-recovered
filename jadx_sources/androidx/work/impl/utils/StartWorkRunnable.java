package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkManagerImpl;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class StartWorkRunnable implements Runnable {
    private WorkerParameters.RuntimeExtras mRuntimeExtras;
    private WorkManagerImpl mWorkManagerImpl;
    private StartStopToken mWorkSpecId;

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        this.mWorkManagerImpl.getProcessor().startWork(this.mWorkSpecId, this.mRuntimeExtras);
    }

    public StartWorkRunnable(@NonNull WorkManagerImpl workManagerImpl, @NonNull StartStopToken startStopToken, @Nullable WorkerParameters.RuntimeExtras runtimeExtras) {
        this.mWorkManagerImpl = workManagerImpl;
        this.mWorkSpecId = startStopToken;
        this.mRuntimeExtras = runtimeExtras;
    }
}
