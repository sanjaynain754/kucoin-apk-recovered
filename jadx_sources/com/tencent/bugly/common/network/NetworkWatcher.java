package com.tencent.bugly.common.network;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.proguard.C33598d3;
import com.tencent.bugly.proguard.C33872q4;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\rJ\b\u0010\"\u001a\u0004\u0018\u00010\u0004J\u0006\u0010#\u001a\u00020\u001cJ\u0006\u0010$\u001a\u00020\rJ\u0006\u0010%\u001a\u00020\rJ\u0018\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u001cH\u0002J\u0018\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u0016J\b\u00100\u001a\u00020\u001cH\u0002J\u0006\u00101\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00078BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\"\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u00062"}, m90084d2 = {"Lcom/tencent/bugly/common/network/NetworkWatcher;", "", "()V", "ACTION_CONN_CHANGE", "", "TAG", "apn", "Lcom/tencent/bugly/common/network/Apn;", "getApn", "()Lcom/tencent/bugly/common/network/Apn;", "handler", "Landroid/os/Handler;", "isInited", "", "isNetAvailable", "()Z", "setNetAvailable", "(Z)V", "isWifiAvailable", "setWifiAvailable", "mListeners", "Ljava/util/HashSet;", "Lcom/tencent/bugly/common/network/INetworkStateListener;", "Lkotlin/collections/HashSet;", "netStatusReceive", "com/tencent/bugly/common/network/NetworkWatcher$netStatusReceive$1", "Lcom/tencent/bugly/common/network/NetworkWatcher$netStatusReceive$1;", "checkConnInfo", "", "networkState", "Lcom/tencent/bugly/common/network/NetworkState;", "getMobileDetailState", "getNetworkState", "fetchMobileDetailState", "getOperatorName", "init", "isNetworkConnectedRealtime", "isWiFiConnectedRealtime", "isWiFiType", "connManager", "Landroid/net/ConnectivityManager;", "activeNetInfo", "Landroid/net/NetworkInfo;", "notifyListener", "processApn", "it", "registerListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "resetApn", "unInit", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class NetworkWatcher {

    @NotNull
    private static final String ACTION_CONN_CHANGE = "android.net.conn.CONNECTIVITY_CHANGE";

    @NotNull
    private static final String TAG = "Bugly_NetWatcher";

    @Nullable
    private static Handler handler;
    private static volatile boolean isInited;
    private static volatile boolean isNetAvailable;
    private static volatile boolean isWifiAvailable;

    @Nullable
    private static HashSet<INetworkStateListener> mListeners;

    @NotNull
    public static final NetworkWatcher INSTANCE = new NetworkWatcher();

    @NotNull
    private static volatile Apn apn = Apn.TYPE_INIT;

    @NotNull
    private static final NetworkWatcher$netStatusReceive$1 netStatusReceive = new NetworkWatcher$netStatusReceive$1();

    private final Apn getApn() {
        if (apn == Apn.TYPE_INIT) {
            resetApn();
        }
        return apn;
    }

    private final void resetApn() {
        Apn apn2;
        try {
            NetworkState networkState = getNetworkState(true);
            int i11 = WhenMappings.$EnumSwitchMapping$1[networkState.ordinal()];
            if (i11 != 3) {
                apn2 = i11 != 4 ? getApn(networkState) : Apn.TYPE_UNKNOWN;
            } else {
                apn2 = Apn.TYPE_WIFI;
            }
        } catch (Exception e11) {
            Log.w(TAG, e11 + ": cannot get apn from network state, so use default");
            apn2 = Apn.TYPE_UNKNOWN;
        }
        apn = apn2;
    }

    public final boolean isNetworkConnectedRealtime() {
        return getNetworkState(false) != NetworkState.NETWORK_NONE;
    }

    public final boolean isWiFiConnectedRealtime() {
        return getNetworkState(false) == NetworkState.NETWORK_WIFI;
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Apn.values().length];
            iArr[Apn.TYPE_WIFI.ordinal()] = 1;
            iArr[Apn.TYPE_UNKNOWN.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NetworkState.values().length];
            iArr2[NetworkState.NETWORK_2G.ordinal()] = 1;
            iArr2[NetworkState.NETWORK_3G.ordinal()] = 2;
            iArr2[NetworkState.NETWORK_WIFI.ordinal()] = 3;
            iArr2[NetworkState.NETWORK_NONE.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final boolean isWiFiType(ConnectivityManager connManager, NetworkInfo activeNetInfo) {
        if (AndroidVersion.INSTANCE.isOverL()) {
            Network[] allNetworks = connManager.getAllNetworks();
            Intrinsics.checkNotNullExpressionValue(allNetworks, "connManager.allNetworks");
            for (Network network : allNetworks) {
                NetworkInfo networkInfo = connManager.getNetworkInfo(network);
                if (networkInfo != null && networkInfo.getType() == 1 && (networkInfo.getState() == NetworkInfo.State.CONNECTED || networkInfo.getState() == NetworkInfo.State.CONNECTING)) {
                    return true;
                }
            }
        } else if (activeNetInfo.isConnectedOrConnecting() && activeNetInfo.getType() == 1) {
            return true;
        }
        return false;
    }

    public final boolean isNetAvailable() {
        return isNetAvailable;
    }

    public final boolean isWifiAvailable() {
        return isWifiAvailable;
    }

    public final void registerListener(@NotNull INetworkStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (mListeners == null) {
            mListeners = new HashSet<>();
        }
        HashSet<INetworkStateListener> hashSet = mListeners;
        if (hashSet != null) {
            Intrinsics.checkNotNull(hashSet);
            if (hashSet.contains(listener)) {
                return;
            }
            HashSet<INetworkStateListener> hashSet2 = mListeners;
            Intrinsics.checkNotNull(hashSet2);
            hashSet2.add(listener);
        }
    }

    public final void setNetAvailable(boolean z11) {
        isNetAvailable = z11;
    }

    public final void setWifiAvailable(boolean z11) {
        isWifiAvailable = z11;
    }

    private NetworkWatcher() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkConnInfo() {
        boolean z11;
        resetApn();
        boolean z12 = false;
        if (WhenMappings.$EnumSwitchMapping$0[getApn().ordinal()] == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        isWifiAvailable = z11;
        if (getApn() != Apn.TYPE_UNKNOWN) {
            z12 = true;
        }
        isNetAvailable = z12;
        notifyListener();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0069, code lost:
    
        if (r1.intValue() != 11) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d5, code lost:
    
        if (r1.intValue() != 15) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final NetworkState getMobileDetailState() {
        Object systemService;
        TelephonyManager telephonyManager;
        try {
            if (!C33872q4.m74663a(C33598d3.m72772c(), C33872q4.f71536c)) {
                return NetworkState.NETWORK_MOBILE;
            }
            Context contextM72772c = C33598d3.m72772c();
            Integer numValueOf = null;
            if (contextM72772c != null) {
                systemService = contextM72772c.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            } else {
                systemService = null;
            }
            if (systemService instanceof TelephonyManager) {
                telephonyManager = (TelephonyManager) systemService;
            } else {
                telephonyManager = null;
            }
            if (telephonyManager != null) {
                numValueOf = Integer.valueOf(telephonyManager.getNetworkType());
            }
            if (numValueOf == null || numValueOf.intValue() != 1) {
                if (numValueOf == null || numValueOf.intValue() != 4) {
                    if (numValueOf == null || numValueOf.intValue() != 2) {
                        if (numValueOf == null || numValueOf.intValue() != 7) {
                            if (numValueOf != null) {
                            }
                            if (numValueOf == null || numValueOf.intValue() != 6) {
                                if (numValueOf == null || numValueOf.intValue() != 3) {
                                    if (numValueOf == null || numValueOf.intValue() != 5) {
                                        if (numValueOf == null || numValueOf.intValue() != 8) {
                                            if (numValueOf == null || numValueOf.intValue() != 9) {
                                                if (numValueOf == null || numValueOf.intValue() != 10) {
                                                    if (numValueOf == null || numValueOf.intValue() != 12) {
                                                        if (numValueOf == null || numValueOf.intValue() != 14) {
                                                            if (numValueOf != null) {
                                                            }
                                                            if (numValueOf != null && numValueOf.intValue() == 13) {
                                                                return NetworkState.NETWORK_4G;
                                                            }
                                                            return NetworkState.NETWORK_MOBILE;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return NetworkState.NETWORK_3G;
                        }
                    }
                }
            }
            return NetworkState.NETWORK_2G;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(TAG, th2);
            return NetworkState.NETWORK_MOBILE;
        }
    }

    private final void notifyListener() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getApn().ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 == 2) {
                i12 = 3;
            }
        }
        HashSet<INetworkStateListener> hashSet = mListeners;
        if (hashSet != null) {
            Intrinsics.checkNotNull(hashSet);
            Iterator<INetworkStateListener> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().onNetworkStateChanged(i12);
            }
        }
    }

    private final Apn processApn(String it, NetworkState networkState) {
        int iHashCode = it.hashCode();
        if (iHashCode != 618558396) {
            if (iHashCode != 618596989) {
                if (iHashCode == 618663094 && it.equals("中国联通")) {
                    int i11 = WhenMappings.$EnumSwitchMapping$1[networkState.ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return Apn.T_APN_WONET;
                        }
                        return Apn.T_APN_3GNET;
                    }
                    return Apn.T_APN_UNINET;
                }
            } else if (it.equals("中国移动")) {
                int i12 = WhenMappings.$EnumSwitchMapping$1[networkState.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        return Apn.T_APN_CMLTE;
                    }
                    return Apn.T_APN_CM3G;
                }
                return Apn.T_APN_CMNET;
            }
        } else if (it.equals("中国电信")) {
            int i13 = WhenMappings.$EnumSwitchMapping$1[networkState.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    return Apn.T_APN_CTLTE;
                }
                return Apn.T_APN_CTNET;
            }
            return Apn.TYPE_UNKNOWN;
        }
        return Apn.TYPE_NET;
    }

    @NotNull
    public final NetworkState getNetworkState(boolean fetchMobileDetailState) {
        Object systemService;
        Context contextM72772c = C33598d3.m72772c();
        ConnectivityManager connectivityManager = null;
        if (contextM72772c != null) {
            systemService = contextM72772c.getSystemService("connectivity");
        } else {
            systemService = null;
        }
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        }
        if (connectivityManager == null) {
            return NetworkState.NETWORK_NONE;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            if (isWiFiType(connectivityManager, activeNetworkInfo)) {
                return NetworkState.NETWORK_WIFI;
            }
            if (fetchMobileDetailState) {
                return getMobileDetailState();
            }
            return NetworkState.NETWORK_MOBILE;
        }
        return NetworkState.NETWORK_NONE;
    }

    @Nullable
    public final String getOperatorName() {
        Object systemService;
        TelephonyManager telephonyManager;
        Context contextM72772c = C33598d3.m72772c();
        if (contextM72772c != null) {
            systemService = contextM72772c.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        } else {
            systemService = null;
        }
        if (systemService instanceof TelephonyManager) {
            telephonyManager = (TelephonyManager) systemService;
        } else {
            telephonyManager = null;
        }
        if (telephonyManager == null) {
            return null;
        }
        return telephonyManager.getSimOperatorName();
    }

    public final void init() {
        if (isInited) {
            return;
        }
        Logger.INSTANCE.mo77132i(TAG, "init");
        synchronized (NetworkWatcher.class) {
            try {
                if (!isInited) {
                    Context contextM72772c = C33598d3.m72772c();
                    if (contextM72772c != null) {
                        Intrinsics.checkNotNullExpressionValue(contextM72772c, "getGlobalContext()");
                        try {
                            contextM72772c.registerReceiver(netStatusReceive, new IntentFilter(ACTION_CONN_CHANGE));
                        } catch (Throwable th2) {
                            Logger.INSTANCE.mo77131e(TAG, "unInit, " + th2);
                        }
                    }
                    handler = new Handler(ThreadManager.INSTANCE.getMonitorThreadLooper());
                    isInited = true;
                    INSTANCE.checkConnInfo();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void unInit() {
        synchronized (NetworkWatcher.class) {
            try {
                if (isInited) {
                    try {
                        Context contextM72772c = C33598d3.m72772c();
                        if (contextM72772c != null) {
                            contextM72772c.unregisterReceiver(netStatusReceive);
                        }
                    } catch (Throwable th2) {
                        Logger.INSTANCE.mo77131e(TAG, "unInit, " + th2);
                    }
                    isInited = false;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private final Apn getApn(NetworkState networkState) {
        Apn apnProcessApn;
        String operatorName = getOperatorName();
        return (operatorName == null || (apnProcessApn = INSTANCE.processApn(operatorName, networkState)) == null) ? Apn.TYPE_NET : apnProcessApn;
    }
}
