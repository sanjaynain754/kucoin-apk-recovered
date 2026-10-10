package com.sumsub.sns.internal.core.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33872q4;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.m0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28474m0 {

    /* JADX INFO: renamed from: a */
    public Context f58010a;

    /* JADX INFO: renamed from: c */
    public Function1 f58012c;

    /* JADX INFO: renamed from: b */
    public final Lazy f58011b = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.common.d2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C28474m0.m69372a(this.f57961b);
        }
    });

    /* JADX INFO: renamed from: d */
    public final C28471l0 f58013d = new C28471l0(this);

    /* JADX INFO: renamed from: a */
    public static final ConnectivityManager m69372a(C28474m0 c28474m0) {
        Context context = c28474m0.f58010a;
        return (ConnectivityManager) (context != null ? context.getSystemService("connectivity") : null);
    }

    /* JADX INFO: renamed from: a */
    public final void m69375a(Context context, Function1 function1) {
        this.f58010a = context;
        try {
            if (ContextCompat.checkSelfPermission(context, "android.permission.CHANGE_NETWORK_STATE") != 0) {
                function1.invoke(NetworkManager$NetworkType.NO_PERMISSION);
                return;
            }
            this.f58012c = function1;
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f58011b.getValue();
            if (connectivityManager != null) {
                connectivityManager.requestNetwork(networkRequestBuild, this.f58013d);
            }
        } catch (Throwable th2) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(this), "Can't start network manager", th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m69374a() {
        ConnectivityManager connectivityManager;
        try {
            Context context = this.f58010a;
            if (context == null || ContextCompat.checkSelfPermission(context, "android.permission.CHANGE_NETWORK_STATE") != 0 || (connectivityManager = (ConnectivityManager) this.f58011b.getValue()) == null) {
                return;
            }
            connectivityManager.unregisterNetworkCallback(this.f58013d);
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(this), "Can't stop network manager", e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final NetworkManager$NetworkType m69373a(C28474m0 c28474m0, Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        try {
            if (context == null) {
                return NetworkManager$NetworkType.NONE;
            }
            if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                ConnectivityManager connectivityManager = (ConnectivityManager) c28474m0.f58011b.getValue();
                if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null) {
                    ConnectivityManager connectivityManager2 = (ConnectivityManager) c28474m0.f58011b.getValue();
                    if (connectivityManager2 != null && (networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork)) != null) {
                        if (networkCapabilities.hasTransport(1)) {
                            return NetworkManager$NetworkType.WIFI;
                        }
                        if (networkCapabilities.hasTransport(3)) {
                            return NetworkManager$NetworkType.ETHERNET;
                        }
                        if (networkCapabilities.hasTransport(0)) {
                            if (ContextCompat.checkSelfPermission(context, C33872q4.f71536c) == 0) {
                                switch (((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getDataNetworkType()) {
                                    case 1:
                                    case 2:
                                    case 4:
                                    case 7:
                                    case 11:
                                    case 16:
                                        return NetworkManager$NetworkType.M_2G;
                                    case 3:
                                    case 5:
                                    case 6:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        return NetworkManager$NetworkType.M_3G;
                                    case 13:
                                        return NetworkManager$NetworkType.LTE;
                                    case 18:
                                        return NetworkManager$NetworkType.M_4G;
                                    case 19:
                                    default:
                                        return NetworkManager$NetworkType.OTHER;
                                    case 20:
                                        return NetworkManager$NetworkType.M_5G;
                                }
                            }
                            return NetworkManager$NetworkType.NONE;
                        }
                        return NetworkManager$NetworkType.OTHER;
                    }
                    return NetworkManager$NetworkType.NONE;
                }
                return NetworkManager$NetworkType.OTHER;
            }
            return NetworkManager$NetworkType.NO_PERMISSION;
        } catch (Throwable unused) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(c28474m0), "Error while getting network type", null);
            return NetworkManager$NetworkType.NONE;
        }
    }
}
