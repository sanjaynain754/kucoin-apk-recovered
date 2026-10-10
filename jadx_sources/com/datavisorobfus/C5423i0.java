package com.datavisorobfus;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.ProxyInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import com.datavisor.vangogh.bridge.crypto;
import com.datavisor.vangogh.bridge.storage;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.C33978va;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.datavisorobfus.i0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5423i0 {

    /* JADX INFO: renamed from: a */
    private static C5423i0 f7290a = new C5423i0();

    /* JADX INFO: renamed from: c */
    public static C5423i0 m7173c() {
        return f7290a;
    }

    /* JADX INFO: renamed from: a */
    public String m7174a() {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (C5457z0.m7480a(property) && C5457z0.m7480a(property2)) {
                return "empty";
            }
            if (C5457z0.m7480a(property)) {
                property = "empty";
            }
            if (C5457z0.m7480a(property2)) {
                property2 = "empty";
            }
            return property + C33844oi.f71346o + property2;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: b */
    public String m7176b() {
        try {
            String property = System.getProperty("https.proxyHost");
            String property2 = System.getProperty("https.proxyPort");
            if (C5457z0.m7480a(property) && C5457z0.m7480a(property2)) {
                return "empty";
            }
            if (C5457z0.m7480a(property)) {
                property = "empty";
            }
            if (C5457z0.m7480a(property2)) {
                property2 = "empty";
            }
            return property + C33844oi.f71346o + property2;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: d */
    public String m7179d() {
        String string;
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            if (list != null) {
                for (NetworkInterface networkInterface : list) {
                    if (networkInterface != null && C5457z0.m7482b(networkInterface.getName())) {
                        byte[] hardwareAddress = networkInterface.getHardwareAddress();
                        String hostAddress = null;
                        if (hardwareAddress != null) {
                            StringBuilder sb2 = new StringBuilder();
                            for (byte b11 : hardwareAddress) {
                                sb2.append(String.format("%02X:", Integer.valueOf(b11 & 255)));
                            }
                            if (sb2.length() > 0) {
                                sb2.deleteCharAt(sb2.length() - 1);
                            }
                            string = sb2.toString();
                        } else {
                            string = null;
                        }
                        Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress inetAddressNextElement = inetAddresses.nextElement();
                            if (inetAddressNextElement instanceof Inet4Address) {
                                hostAddress = inetAddressNextElement.getHostAddress();
                                break;
                            }
                        }
                        if (C5457z0.m7480a(string)) {
                            string = "empty";
                        }
                        if (C5457z0.m7480a(hostAddress)) {
                            hostAddress = "empty";
                        }
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(networkInterface.getName());
                        jSONArray2.put(hostAddress);
                        jSONArray2.put(string);
                        jSONArray.put(jSONArray2);
                    }
                }
            }
            return jSONArray.toString();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: e */
    public String m7181e() {
        String string;
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (true) {
                if (it.hasNext()) {
                    NetworkInterface networkInterface = (NetworkInterface) it.next();
                    if (networkInterface != null && C5457z0.m7482b(networkInterface.getName()) && networkInterface.getName().toLowerCase().equals(crypto.convert("K8yOmQ=="))) {
                        byte[] hardwareAddress = networkInterface.getHardwareAddress();
                        if (hardwareAddress != null) {
                            StringBuilder sb2 = new StringBuilder();
                            for (byte b11 : hardwareAddress) {
                                sb2.append(String.format("%02X:", Integer.valueOf(b11 & 255)));
                            }
                            if (sb2.length() > 0) {
                                sb2.deleteCharAt(sb2.length() - 1);
                            }
                            string = sb2.toString();
                            break;
                        }
                    }
                }
                string = null;
                break;
            }
            return (C5457z0.m7480a(string) || string.equals("02:00:00:00:00:00") || string.equals("00:00:00:00:00:00")) ? "empty" : string;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: a */
    private String m7171a(int i11) {
        if (i11 > 32) {
            return "";
        }
        int i12 = (-1) << (32 - i11);
        int[] iArr = new int[4];
        for (int i13 = 0; i13 < 4; i13++) {
            iArr[3 - i13] = (i12 >> (i13 * 8)) & 255;
        }
        String str = "" + iArr[0];
        for (int i14 = 1; i14 < 4; i14++) {
            str = str + C33978va.f72339h + iArr[i14];
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    private String m7172b(int i11) {
        return (i11 & 255) + C33978va.f72339h + ((i11 >> 8) & 255) + C33978va.f72339h + ((i11 >> 16) & 255) + C33978va.f72339h + ((i11 >> 24) & 255);
    }

    /* JADX INFO: renamed from: c */
    public String m7178c(Context context) throws SocketException {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.getType() == 0) {
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    while (networkInterfaces.hasMoreElements()) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress inetAddressNextElement = inetAddresses.nextElement();
                            if (!inetAddressNextElement.isLoopbackAddress() && !inetAddressNextElement.isLinkLocalAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                                return inetAddressNextElement.getHostAddress();
                            }
                        }
                    }
                } else if (activeNetworkInfo.getType() == 1) {
                    return m7172b(((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getIpAddress());
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public String m7180d(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.getType() == 1) {
                String strM7178c = m7178c(context);
                if (C5457z0.m7482b(strM7178c)) {
                    return NetworkInterface.getByInetAddress(InetAddress.getByName(strM7178c)).getName().toLowerCase();
                }
            }
            return null;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public String m7182e(Context context) throws SocketException {
        String strM7178c = m7178c(context);
        return C5411e.m7131b(strM7178c) ? strM7178c : "empty";
    }

    /* JADX INFO: renamed from: f */
    public String m7183f(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable() || activeNetworkInfo.getType() != 0) {
                return "empty";
            }
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && !inetAddressNextElement.isLinkLocalAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        Enumeration<InetAddress> inetAddresses2 = networkInterfaceNextElement.getInetAddresses();
                        while (inetAddresses2.hasMoreElements()) {
                            InetAddress inetAddressNextElement2 = inetAddresses2.nextElement();
                            if ((inetAddressNextElement2 instanceof Inet6Address) && !inetAddressNextElement2.isLoopbackAddress()) {
                                String str = inetAddressNextElement2.getHostAddress().split("%")[0];
                                if (str.length() > 15) {
                                    return str;
                                }
                            }
                        }
                        break;
                    }
                }
            }
            return "empty";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: g */
    public String m7184g(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            String str = "default";
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.getType() == 1) {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                    if (networkInterfaceNextElement.getName().toLowerCase().equals("wlan0")) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress inetAddressNextElement = inetAddresses.nextElement();
                            if ((inetAddressNextElement instanceof Inet6Address) && !inetAddressNextElement.isLoopbackAddress()) {
                                str = inetAddressNextElement.getHostAddress().split("%")[0];
                                break;
                            }
                        }
                    }
                }
            }
            return str;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: h */
    public String m7185h(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable() || activeNetworkInfo.getType() != 1) {
                return "empty";
            }
            String strM7172b = m7172b(((WifiManager) context.getSystemService("wifi")).getDhcpInfo().gateway);
            storage.globalSet(crypto.convert("H6ih/XXMmO4KRLN/BOo="), strM7172b, 0);
            return strM7172b;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: i */
    public String m7186i(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            String strM7171a = null;
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.getType() == 1) {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                    if (networkInterfaceNextElement.getName().toLowerCase().equals("wlan0")) {
                        for (InterfaceAddress interfaceAddress : networkInterfaceNextElement.getInterfaceAddresses()) {
                            if (interfaceAddress.getAddress() instanceof Inet4Address) {
                                strM7171a = m7171a(interfaceAddress.getNetworkPrefixLength());
                            }
                        }
                    }
                }
            }
            return C5457z0.m7480a(strM7171a) ? "empty" : strM7171a;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: a */
    public String m7175a(Context context) {
        Network activeNetwork;
        LinkProperties linkProperties;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) == null) {
                return "empty";
            }
            JSONObject jSONObject = new JSONObject();
            ProxyInfo httpProxy = linkProperties.getHttpProxy();
            if (httpProxy != null && !C5457z0.m7480a(httpProxy.getHost())) {
                jSONObject.put("host", httpProxy.getHost());
                jSONObject.put("port", httpProxy.getPort());
            }
            if (httpProxy != null && httpProxy.getPacFileUrl() != null && !C5457z0.m7480a(httpProxy.getPacFileUrl().toString())) {
                jSONObject.put("pac_url", httpProxy.getPacFileUrl().toString());
            }
            return jSONObject.toString();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: b */
    public String m7177b(Context context) {
        try {
            String string = Settings.Global.getString(context.getContentResolver(), "http_proxy");
            return C5457z0.m7480a(string) ? "empty" : string;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }
}
