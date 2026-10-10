package androidx.media3.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class NetworkTypeObserver {

    @Nullable
    private static NetworkTypeObserver staticInstance;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList<WeakReference<Listener>> listeners = new CopyOnWriteArrayList<>();
    private final Object networkTypeLock = new Object();

    @GuardedBy("networkTypeLock")
    private int networkType = 0;

    @RequiresApi(31)
    public static final class Api31 {

        public static final class DisplayInfoCallback extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
            private final NetworkTypeObserver instance;

            public DisplayInfoCallback(NetworkTypeObserver networkTypeObserver) {
                this.instance = networkTypeObserver;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                boolean z11;
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                int i11 = 5;
                if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                NetworkTypeObserver networkTypeObserver = this.instance;
                if (z11) {
                    i11 = 10;
                }
                networkTypeObserver.updateNetworkType(i11);
            }
        }

        private Api31() {
        }

        public static void disambiguate4gAnd5gNsa(Context context, NetworkTypeObserver networkTypeObserver) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) Assertions.checkNotNull((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE));
                DisplayInfoCallback displayInfoCallback = new DisplayInfoCallback(networkTypeObserver);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), displayInfoCallback);
                telephonyManager.unregisterTelephonyCallback(displayInfoCallback);
            } catch (RuntimeException unused) {
                networkTypeObserver.updateNetworkType(5);
            }
        }
    }

    public interface Listener {
        void onNetworkTypeChanged(int i11);
    }

    public final class Receiver extends BroadcastReceiver {
        private Receiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int networkTypeFromConnectivityManager = NetworkTypeObserver.getNetworkTypeFromConnectivityManager(context);
            if (Util.SDK_INT < 31 || networkTypeFromConnectivityManager != 5) {
                NetworkTypeObserver.this.updateNetworkType(networkTypeFromConnectivityManager);
            } else {
                Api31.disambiguate4gAnd5gNsa(context, NetworkTypeObserver.this);
            }
        }
    }

    public static synchronized NetworkTypeObserver getInstance(Context context) {
        try {
            if (staticInstance == null) {
                staticInstance = new NetworkTypeObserver(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return staticInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getNetworkTypeFromConnectivityManager(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i11 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i11 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return getMobileNetworkType(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i11;
    }

    private void removeClearedReferences() {
        for (WeakReference<Listener> weakReference : this.listeners) {
            if (weakReference.get() == null) {
                this.listeners.remove(weakReference);
            }
        }
    }

    @VisibleForTesting
    public static synchronized void resetForTests() {
        staticInstance = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNetworkType(int i11) {
        synchronized (this.networkTypeLock) {
            try {
                if (this.networkType == i11) {
                    return;
                }
                this.networkType = i11;
                for (WeakReference<Listener> weakReference : this.listeners) {
                    Listener listener = weakReference.get();
                    if (listener != null) {
                        listener.onNetworkTypeChanged(i11);
                    } else {
                        this.listeners.remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getNetworkType() {
        int i11;
        synchronized (this.networkTypeLock) {
            i11 = this.networkType;
        }
        return i11;
    }

    private NetworkTypeObserver(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new Receiver(), intentFilter);
    }

    private static int getMobileNetworkType(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                if (Util.SDK_INT >= 29) {
                    return 9;
                }
                return 0;
        }
    }

    public void register(final Listener listener) {
        removeClearedReferences();
        this.listeners.add(new WeakReference<>(listener));
        this.mainHandler.post(new Runnable() { // from class: androidx.media3.common.util.c
            @Override // java.lang.Runnable
            public final void run() {
                listener.onNetworkTypeChanged(this.f2894b.getNetworkType());
            }
        });
    }
}
