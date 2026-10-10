package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import androidx.autofill.HintConstants;
import com.kubi.sdk.aspect.NetworkUtillAspect;
import dh0.C36686b;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.aspectj.lang.InterfaceC43175a;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkUtils {

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC43175a.a f6379a;

    public static final class NetworkChangedReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public NetworkType f6380a;

        /* JADX INFO: renamed from: b */
        public Set<InterfaceC5242a> f6381b = new HashSet();

        /* JADX INFO: renamed from: com.blankj.utilcode.util.NetworkUtils$NetworkChangedReceiver$a */
        public class RunnableC5238a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC5242a f6382b;

            public RunnableC5238a(InterfaceC5242a interfaceC5242a) {
                this.f6382b = interfaceC5242a;
            }

            @Override // java.lang.Runnable
            @SuppressLint({"MissingPermission"})
            public void run() {
                int size = NetworkChangedReceiver.this.f6381b.size();
                NetworkChangedReceiver.this.f6381b.add(this.f6382b);
                if (size == 0 && NetworkChangedReceiver.this.f6381b.size() == 1) {
                    NetworkChangedReceiver.this.f6380a = NetworkUtils.m6057e();
                    C5287o0.m6331a().registerReceiver(NetworkChangedReceiver.m6070e(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        }

        /* JADX INFO: renamed from: com.blankj.utilcode.util.NetworkUtils$NetworkChangedReceiver$b */
        /* JADX INFO: loaded from: classes34.dex */
        public class RunnableC5239b implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC5242a f6384b;

            public RunnableC5239b(InterfaceC5242a interfaceC5242a) {
                this.f6384b = interfaceC5242a;
            }

            @Override // java.lang.Runnable
            public void run() {
                int size = NetworkChangedReceiver.this.f6381b.size();
                NetworkChangedReceiver.this.f6381b.remove(this.f6384b);
                if (size == 1 && NetworkChangedReceiver.this.f6381b.size() == 0) {
                    C5287o0.m6331a().unregisterReceiver(NetworkChangedReceiver.m6070e());
                }
            }
        }

        /* JADX INFO: renamed from: com.blankj.utilcode.util.NetworkUtils$NetworkChangedReceiver$c */
        public class RunnableC5240c implements Runnable {
            public RunnableC5240c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NetworkType networkTypeM6057e = NetworkUtils.m6057e();
                if (NetworkChangedReceiver.this.f6380a != networkTypeM6057e) {
                    NetworkChangedReceiver.this.f6380a = networkTypeM6057e;
                    if (networkTypeM6057e == NetworkType.NETWORK_NO) {
                        Iterator it = NetworkChangedReceiver.this.f6381b.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC5242a) it.next()).onDisconnected();
                        }
                    } else {
                        Iterator it2 = NetworkChangedReceiver.this.f6381b.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC5242a) it2.next()).mo6072a(networkTypeM6057e);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.blankj.utilcode.util.NetworkUtils$NetworkChangedReceiver$d */
        public static class C5241d {

            /* JADX INFO: renamed from: a */
            public static final NetworkChangedReceiver f6387a = new NetworkChangedReceiver();
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                C5299u0.m6474L(new RunnableC5240c(), 1000L);
            }
        }

        public void registerListener(InterfaceC5242a interfaceC5242a) {
            if (interfaceC5242a == null) {
                return;
            }
            C5299u0.m6473K(new RunnableC5238a(interfaceC5242a));
        }

        public void unregisterListener(InterfaceC5242a interfaceC5242a) {
            if (interfaceC5242a == null) {
                return;
            }
            C5299u0.m6473K(new RunnableC5239b(interfaceC5242a));
        }

        /* JADX INFO: renamed from: e */
        public static NetworkChangedReceiver m6070e() {
            return C5241d.f6387a;
        }
    }

    public enum NetworkType {
        NETWORK_ETHERNET,
        NETWORK_WIFI,
        NETWORK_5G,
        NETWORK_4G,
        NETWORK_3G,
        NETWORK_2G,
        NETWORK_UNKNOWN,
        NETWORK_NO
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.NetworkUtils$a */
    public interface InterfaceC5242a {
        /* JADX INFO: renamed from: a */
        void mo6072a(NetworkType networkType);

        void onDisconnected();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6053a() {
        C36686b c36686b = new C36686b("NetworkUtils.java", NetworkUtils.class);
        f6379a = c36686b.m82128h("method-execution", c36686b.m82127g("9", "getNetworkType", "com.blankj.utilcode.util.NetworkUtils", "", "", "", "com.blankj.utilcode.util.NetworkUtils$NetworkType"), 406);
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /* JADX INFO: renamed from: e */
    public static NetworkType m6057e() {
        return NetworkUtillAspect.m56535b().m56536c(new C5300v(new Object[]{C36686b.m82122b(f6379a, null, null)}).linkClosureAndJoinPoint(65536));
    }

    @RequiresPermission("android.permission.INTERNET")
    /* JADX INFO: renamed from: h */
    public static boolean m6060h() {
        return m6061i("");
    }

    static {
        m6053a();
    }

    public NetworkUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /* JADX INFO: renamed from: b */
    public static NetworkInfo m6054b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C5287o0.m6331a().getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    @RequiresPermission("android.permission.INTERNET")
    /* JADX INFO: renamed from: c */
    public static String m6055c(boolean z11) {
        boolean z12;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            LinkedList<InetAddress> linkedList = new LinkedList();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.isUp() && !networkInterfaceNextElement.isLoopback()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        linkedList.addFirst(inetAddresses.nextElement());
                    }
                }
            }
            for (InetAddress inetAddress : linkedList) {
                if (!inetAddress.isLoopbackAddress()) {
                    String hostAddress = inetAddress.getHostAddress();
                    if (hostAddress.indexOf(58) < 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11) {
                        if (z12) {
                            return hostAddress;
                        }
                    } else if (!z12) {
                        int iIndexOf = hostAddress.indexOf(37);
                        if (iIndexOf < 0) {
                            return hostAddress.toUpperCase();
                        }
                        return hostAddress.substring(0, iIndexOf).toUpperCase();
                    }
                }
            }
            return "";
        } catch (SocketException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m6056d() {
        TelephonyManager telephonyManager = (TelephonyManager) C5287o0.m6331a().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkOperatorName();
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ NetworkType m6058f(InterfaceC43175a interfaceC43175a) {
        if (m6064l()) {
            return NetworkType.NETWORK_ETHERNET;
        }
        NetworkInfo networkInfoM6054b = m6054b();
        if (networkInfoM6054b != null && networkInfoM6054b.isAvailable()) {
            if (networkInfoM6054b.getType() == 1) {
                return NetworkType.NETWORK_WIFI;
            }
            if (networkInfoM6054b.getType() == 0) {
                switch (networkInfoM6054b.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return NetworkType.NETWORK_2G;
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
                        return NetworkType.NETWORK_3G;
                    case 13:
                    case 18:
                        return NetworkType.NETWORK_4G;
                    case 19:
                    default:
                        String subtypeName = networkInfoM6054b.getSubtypeName();
                        if (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000")) {
                            return NetworkType.NETWORK_UNKNOWN;
                        }
                        return NetworkType.NETWORK_3G;
                    case 20:
                        return NetworkType.NETWORK_5G;
                }
            }
            return NetworkType.NETWORK_UNKNOWN;
        }
        return NetworkType.NETWORK_NO;
    }

    @RequiresPermission("android.permission.INTERNET")
    /* JADX INFO: renamed from: g */
    public static boolean m6059g() {
        if (!m6060h() && !m6062j(null)) {
            return false;
        }
        return true;
    }

    @RequiresPermission("android.permission.INTERNET")
    /* JADX INFO: renamed from: i */
    public static boolean m6061i(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "www.baidu.com";
        }
        try {
            if (InetAddress.getByName(str) == null) {
                return false;
            }
            return true;
        } catch (UnknownHostException e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    /* JADX INFO: renamed from: j */
    public static boolean m6062j(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "223.5.5.5";
        }
        if (C5273h0.m6231a(String.format("ping -c 1 %s", str), false).f6545a != 0) {
            return false;
        }
        return true;
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /* JADX INFO: renamed from: k */
    public static boolean m6063k() {
        NetworkInfo networkInfoM6054b = m6054b();
        if (networkInfoM6054b != null && networkInfoM6054b.isConnected()) {
            return true;
        }
        return false;
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /* JADX INFO: renamed from: l */
    public static boolean m6064l() {
        NetworkInfo networkInfo;
        NetworkInfo.State state;
        ConnectivityManager connectivityManager = (ConnectivityManager) C5287o0.m6331a().getSystemService("connectivity");
        if (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(9)) == null || (state = networkInfo.getState()) == null) {
            return false;
        }
        if (state != NetworkInfo.State.CONNECTED && state != NetworkInfo.State.CONNECTING) {
            return false;
        }
        return true;
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /* JADX INFO: renamed from: m */
    public static boolean m6065m() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) C5287o0.m6331a().getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) {
            return false;
        }
        return true;
    }

    public static void registerNetworkStatusChangedListener(InterfaceC5242a interfaceC5242a) {
        NetworkChangedReceiver.m6070e().registerListener(interfaceC5242a);
    }

    public static void unregisterNetworkStatusChangedListener(InterfaceC5242a interfaceC5242a) {
        NetworkChangedReceiver.m6070e().unregisterListener(interfaceC5242a);
    }
}
