package w70;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import ro.C44127a;

/* JADX INFO: renamed from: w70.b */
/* JADX INFO: compiled from: LDNetUtil.java */
/* JADX INFO: loaded from: classes23.dex */
@SuppressLint({"DefaultLocale"})
public class C45749b {
    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m100990a(String str) throws Throwable {
        String str2;
        long jCurrentTimeMillis;
        HashMap map = new HashMap();
        Object obj = null;
        try {
            try {
                jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    if (allByName != null) {
                        try {
                            try {
                                obj = (System.currentTimeMillis() - jCurrentTimeMillis) + "";
                            } catch (UnknownHostException e11) {
                                e = e11;
                                str2 = (System.currentTimeMillis() - jCurrentTimeMillis) + "";
                                try {
                                    e.printStackTrace();
                                    map.put("remoteInet", null);
                                    map.put("useTime", str2);
                                    return map;
                                } catch (Throwable th2) {
                                    th = th2;
                                    map.put("remoteInet", obj);
                                    map.put("useTime", str2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = allByName;
                            str2 = null;
                            map.put("remoteInet", obj);
                            map.put("useTime", str2);
                            throw th;
                        }
                    }
                    map.put("remoteInet", allByName);
                    map.put("useTime", obj);
                    return map;
                } catch (UnknownHostException e12) {
                    e = e12;
                    str2 = (System.currentTimeMillis() - jCurrentTimeMillis) + "";
                    e.printStackTrace();
                    map.put("remoteInet", null);
                    map.put("useTime", str2);
                    return map;
                }
            } catch (UnknownHostException e13) {
                e = e13;
                jCurrentTimeMillis = 0;
            }
        } catch (Throwable th4) {
            th = th4;
            str2 = null;
            map.put("remoteInet", obj);
            map.put("useTime", str2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0041: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:66), block:B:9:0x0041 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX INFO: renamed from: b */
    public static String m100991b(String str) throws Throwable {
        BufferedReader bufferedReader;
        InterruptedException e11;
        ?? r11;
        IOException e12;
        ?? r12;
        BufferedReader bufferedReader2;
        ?? r13;
        ?? r14;
        String str2 = "";
        BufferedReader bufferedReader3 = null;
        try {
            try {
                str = Runtime.getRuntime().exec("getprop net." + ((String) str));
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(str.getInputStream()));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            str2 = str2 + line;
                        } catch (IOException e13) {
                            e12 = e13;
                            r12 = str;
                            e12.printStackTrace();
                            r14 = r12;
                            r13 = r12;
                            if (bufferedReader != null) {
                            }
                            r13.destroy();
                            return str2.trim();
                        } catch (InterruptedException e14) {
                            e11 = e14;
                            r11 = str;
                            e11.printStackTrace();
                            r13 = r11;
                            if (bufferedReader != null) {
                                r14 = r11;
                            }
                            r13.destroy();
                            return str2.trim();
                        }
                    }
                    bufferedReader.close();
                    str.waitFor();
                    r14 = str;
                } catch (IOException e15) {
                    bufferedReader = null;
                    e12 = e15;
                    r12 = str;
                } catch (InterruptedException e16) {
                    bufferedReader = null;
                    e11 = e16;
                    r11 = str;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader3 != null) {
                        try {
                            bufferedReader3.close();
                        } catch (Exception unused) {
                            throw th;
                        }
                    }
                    str.destroy();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader3 = bufferedReader2;
            }
        } catch (IOException e17) {
            bufferedReader = null;
            e12 = e17;
            r12 = 0;
        } catch (InterruptedException e18) {
            bufferedReader = null;
            e11 = e18;
            r11 = 0;
        } catch (Throwable th4) {
            th = th4;
            str = 0;
        }
        try {
            bufferedReader.close();
            r13 = r14;
            r13.destroy();
        } catch (Exception unused2) {
        }
        return str2.trim();
    }

    /* JADX INFO: renamed from: e */
    public static String m100994e(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return "ConnectivityManager not found";
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "UNKNOWN";
        }
        String typeName = activeNetworkInfo.getTypeName();
        if (typeName.equalsIgnoreCase("WIFI")) {
            return "WIFI";
        }
        if (typeName.equalsIgnoreCase("MOBILE")) {
            return TextUtils.isEmpty(Proxy.getDefaultHost()) ? m100997h(context) : "WAP";
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m100992c() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m100993d(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager == null) {
            return "wifiManager not found";
        }
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo == null) {
            return "wifiInfo not found";
        }
        int ipAddress = connectionInfo.getIpAddress();
        return String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m100995f(Context context) {
        boolean z11;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return Boolean.FALSE;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m100996g() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                for (NetworkInterface networkInterface : Collections.list(networkInterfaces)) {
                    if (networkInterface.isUp() && networkInterface.getInterfaceAddresses().size() != 0 && ("tun0".equals(networkInterface.getName()) || "ppp0".equals(networkInterface.getName()))) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Throwable th2) {
            C44127a.m97244d(th2.toString());
            th2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m100997h(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager == null) {
            return "TM==null";
        }
        switch (telephonyManager.getNetworkType()) {
            case 0:
                return "UNKNOWN";
            case 1:
            case 2:
                return "2G";
            case 3:
                return "3G";
            case 4:
                return "2G";
            case 5:
            case 6:
                return "3G";
            case 7:
                return "2G";
            case 8:
            case 9:
            case 10:
                return "3G";
            case 11:
                return "2G";
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
            default:
                return "4G";
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m100998i(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager == null) {
            return "wifiManager not found";
        }
        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
        if (dhcpInfo != null) {
            int i11 = dhcpInfo.gateway;
            return String.format("%d.%d.%d.%d", Integer.valueOf(i11 & 255), Integer.valueOf((i11 >> 8) & 255), Integer.valueOf((i11 >> 16) & 255), Integer.valueOf((i11 >> 24) & 255));
        }
        return null;
    }
}
