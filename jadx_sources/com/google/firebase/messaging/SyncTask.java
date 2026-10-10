package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes56.dex */
class SyncTask implements Runnable {
    private final FirebaseMessaging firebaseMessaging;
    private final long nextDelaySeconds;

    @SuppressLint({"ThreadPoolCreation"})
    @VisibleForTesting
    ExecutorService processorExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
    private final PowerManager.WakeLock syncWakeLock;

    @VisibleForTesting
    public static class ConnectivityChangeReceiver extends BroadcastReceiver {

        @Nullable
        private Context receiverContext;

        @Nullable
        private SyncTask task;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SyncTask syncTask = this.task;
            if (syncTask != null && syncTask.isDeviceConnected()) {
                if (SyncTask.isDebugLogEnabled()) {
                    Log.d(Constants.TAG, "Connectivity changed. Starting background sync.");
                }
                this.task.firebaseMessaging.enqueueTaskWithDelaySeconds(this.task, 0L);
                Context context2 = this.receiverContext;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.task = null;
            }
        }

        public ConnectivityChangeReceiver(SyncTask syncTask) {
            this.task = syncTask;
        }

        public void registerReceiver() {
            if (SyncTask.isDebugLogEnabled()) {
                Log.d(Constants.TAG, "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            SyncTask syncTask = this.task;
            if (syncTask != null) {
                Context context = syncTask.getContext();
                this.receiverContext = context;
                context.registerReceiver(this, intentFilter);
            }
        }
    }

    public static boolean isDebugLogEnabled() {
        return Log.isLoggable(Constants.TAG, 3);
    }

    public Context getContext() {
        return this.firebaseMessaging.getApplicationContext();
    }

    @VisibleForTesting
    public boolean maybeRefreshToken() throws IOException {
        try {
            if (this.firebaseMessaging.blockingGetToken() == null) {
                Log.e(Constants.TAG, "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable(Constants.TAG, 3)) {
                return true;
            }
            Log.d(Constants.TAG, "Token successfully retrieved");
            return true;
        } catch (IOException e11) {
            if (!GmsRpc.isErrorMessageForRetryableError(e11.getMessage())) {
                if (e11.getMessage() != null) {
                    throw e11;
                }
                Log.w(Constants.TAG, "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w(Constants.TAG, "Token retrieval failed: " + e11.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w(Constants.TAG, "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    @VisibleForTesting
    public SyncTask(FirebaseMessaging firebaseMessaging, long j11) {
        this.firebaseMessaging = firebaseMessaging;
        this.nextDelaySeconds = j11;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.syncWakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public boolean isDeviceConnected() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) getContext().getSystemService("connectivity");
        if (connectivityManager != null) {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
            this.syncWakeLock.acquire();
        }
        try {
            this.firebaseMessaging.setSyncScheduledOrRunning(true);
            if (!this.firebaseMessaging.isGmsCorePresent()) {
                this.firebaseMessaging.setSyncScheduledOrRunning(false);
            } else if (ServiceStarter.getInstance().hasAccessNetworkStatePermission(getContext()) && !isDeviceConnected()) {
                new ConnectivityChangeReceiver(this).registerReceiver();
            } else {
                if (maybeRefreshToken()) {
                    this.firebaseMessaging.setSyncScheduledOrRunning(false);
                } else {
                    this.firebaseMessaging.syncWithDelaySecondsInternal(this.nextDelaySeconds);
                }
            }
        } catch (IOException e11) {
            Log.e(Constants.TAG, "Topic sync or token retrieval failed on hard failure exceptions: " + e11.getMessage() + ". Won't retry the operation.");
            this.firebaseMessaging.setSyncScheduledOrRunning(false);
        } finally {
            if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                this.syncWakeLock.release();
            }
        }
    }
}
