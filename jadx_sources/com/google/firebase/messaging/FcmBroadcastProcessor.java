package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.ExecutorC1980h;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class FcmBroadcastProcessor {
    private static final String EXTRA_BINARY_DATA = "rawData";
    private static final String EXTRA_BINARY_DATA_BASE_64 = "gcm.rawData64";

    @GuardedBy("lock")
    private static WithinAppServiceConnection fcmServiceConn;
    private static final Object lock = new Object();
    private final Context context;
    private final Executor executor;

    public FcmBroadcastProcessor(Context context) {
        this.context = context;
        this.executor = new ExecutorC1980h();
    }

    private static Task<Integer> bindToMessagingService(Context context, Intent intent, boolean z11) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Binding to service");
        }
        WithinAppServiceConnection serviceConnection = getServiceConnection(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z11) {
            return serviceConnection.sendIntent(intent).continueWith(new ExecutorC1980h(), new Continuation() { // from class: com.google.firebase.messaging.g
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return FcmBroadcastProcessor.m13781c(task);
                }
            });
        }
        if (ServiceStarter.getInstance().hasWakeLockPermission(context)) {
            WakeLockHolder.sendWakefulServiceIntent(context, serviceConnection, intent);
        } else {
            serviceConnection.sendIntent(intent);
        }
        return Tasks.forResult(-1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Integer m13781c(Task task) {
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Integer m13782d(Task task) {
        return 403;
    }

    private static WithinAppServiceConnection getServiceConnection(Context context, String str) {
        WithinAppServiceConnection withinAppServiceConnection;
        synchronized (lock) {
            try {
                if (fcmServiceConn == null) {
                    fcmServiceConn = new WithinAppServiceConnection(context, str);
                }
                withinAppServiceConnection = fcmServiceConn;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return withinAppServiceConnection;
    }

    @VisibleForTesting
    public static void reset() {
        synchronized (lock) {
            fcmServiceConn = null;
        }
    }

    @VisibleForTesting
    public static void setServiceConnection(WithinAppServiceConnection withinAppServiceConnection) {
        synchronized (lock) {
            fcmServiceConn = withinAppServiceConnection;
        }
    }

    @KeepForSdk
    public Task<Integer> process(Intent intent) {
        String stringExtra = intent.getStringExtra(EXTRA_BINARY_DATA_BASE_64);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(EXTRA_BINARY_DATA_BASE_64);
        }
        return startMessagingService(this.context, intent);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m13779a(Context context, Intent intent, boolean z11, Task task) {
        if (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) {
            return bindToMessagingService(context, intent, z11).continueWith(new ExecutorC1980h(), new Continuation() { // from class: com.google.firebase.messaging.d
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return FcmBroadcastProcessor.m13782d(task2);
                }
            });
        }
        return task;
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> startMessagingService(final Context context, final Intent intent) {
        boolean z11;
        final boolean z12 = false;
        if (PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z12 = true;
        }
        if (z11 && !z12) {
            return bindToMessagingService(context, intent, z12);
        }
        return Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.messaging.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(ServiceStarter.getInstance().startMessagingService(context, intent));
            }
        }).continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.messaging.f
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return FcmBroadcastProcessor.m13779a(context, intent, z12, task);
            }
        });
    }

    public FcmBroadcastProcessor(Context context, ExecutorService executorService) {
        this.context = context;
        this.executor = executorService;
    }
}
