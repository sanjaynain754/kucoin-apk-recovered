package com.forter.mobile.fortersdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.net.TrafficStats;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiEnterpriseConfig;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.o2 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6583o2 {
    /* JADX INFO: renamed from: a */
    public static String m12444a(String str) {
        return (str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static JSONArray m12445b(@NonNull Context context, @NonNull JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        Inet4Address dhcpServerAddress;
        JSONArray jSONArray = new JSONArray();
        if (AbstractC6506a3.m12115i(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
                if (connectivityManager != null) {
                    Network[] allNetworks = connectivityManager.getAllNetworks();
                    if (!AbstractC6539f3.m12287u(allNetworks)) {
                        for (Network network : allNetworks) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                                if (linkProperties != null) {
                                    jSONObject2.put("iface", String.valueOf(linkProperties.getInterfaceName()));
                                    m12450g(jSONObject2, linkProperties);
                                    if (Build.VERSION.SDK_INT >= 30 && jSONObject.optBoolean("dhcpServer") && (dhcpServerAddress = linkProperties.getDhcpServerAddress()) != null) {
                                        jSONObject2.put("dhcp", m12449f(dhcpServerAddress));
                                    }
                                    ProxyInfo httpProxy = linkProperties.getHttpProxy();
                                    if (httpProxy != null) {
                                        m12452i(jSONObject2, httpProxy);
                                    } else if (network != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("proxy")) != null && jSONObjectOptJSONObject.optBoolean("useRef")) {
                                        try {
                                            Object objInvoke = ConnectivityManager.class.getMethod("getProxyForNetwork", Network.class).invoke(connectivityManager, network);
                                            if (objInvoke instanceof ProxyInfo) {
                                                m12452i(jSONObject2, (ProxyInfo) objInvoke);
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    m12456m(jSONObject2, linkProperties);
                                }
                                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                                if (networkCapabilities != null) {
                                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("trans");
                                    if (jSONArrayOptJSONArray != null) {
                                        m12457n(jSONObject2, networkCapabilities, jSONArrayOptJSONArray);
                                    }
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("caps");
                                    if (jSONArrayOptJSONArray2 != null) {
                                        m12451h(jSONObject2, networkCapabilities, jSONArrayOptJSONArray2);
                                    }
                                }
                                if (network != null && network.equals(connectivityManager.getActiveNetwork())) {
                                    jSONObject2.put("active", true);
                                }
                                if (jSONObject2.length() > 0) {
                                    jSONArray.put(jSONObject2);
                                }
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        }
        return jSONArray;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static JSONArray m12446c(@NonNull List<WifiConfiguration> list, @NonNull JSONObject jSONObject) {
        ProxyInfo httpProxy;
        JSONArray jSONArray = new JSONArray();
        for (WifiConfiguration wifiConfiguration : list) {
            if (wifiConfiguration != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(TPDownloadProxyEnum.USER_SSID, m12444a(wifiConfiguration.SSID));
                    if (wifiConfiguration.hiddenSSID) {
                        jSONObject2.put(ViewProps.HIDDEN, true);
                    }
                    int i11 = Build.VERSION.SDK_INT;
                    WifiEnterpriseConfig wifiEnterpriseConfig = wifiConfiguration.enterpriseConfig;
                    int i12 = 0;
                    jSONObject2.put("enterprise", (wifiEnterpriseConfig == null || wifiEnterpriseConfig.getEapMethod() == -1) ? false : true);
                    if (i11 >= 26 && (httpProxy = wifiConfiguration.getHttpProxy()) != null) {
                        jSONObject2.put("proxy", m12448e(httpProxy));
                    }
                    JSONArray jSONArray2 = new JSONArray();
                    while (true) {
                        String[] strArr = WifiConfiguration.KeyMgmt.strings;
                        if (i12 >= strArr.length) {
                            break;
                        }
                        if (wifiConfiguration.allowedKeyManagement.get(i12)) {
                            jSONArray2.put(strArr[i12]);
                        }
                        i12++;
                    }
                    jSONObject2.put("security", jSONArray2);
                    if (jSONObject.optBoolean("useRef", true)) {
                        try {
                            String str = (String) WifiConfiguration.class.getField("creatorName").get(wifiConfiguration);
                            if (!TextUtils.isEmpty(str) && !"android.uid.system:1000".equals(str) && !"null".equals(str)) {
                                jSONObject2.put(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_CREATOR, str);
                            }
                        } catch (Throwable unused) {
                        }
                        try {
                            String str2 = (String) WifiConfiguration.class.getField("lastUpdateName").get(wifiConfiguration);
                            if (!TextUtils.isEmpty(str2) && !"android.uid.system:1000".equals(str2) && !"null".equals(str2)) {
                                jSONObject2.put("modifier", str2);
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            jSONObject2.put("trusted", WifiConfiguration.class.getField("trusted").getBoolean(wifiConfiguration));
                        } catch (Throwable unused3) {
                        }
                        try {
                            jSONObject2.put("validated", WifiConfiguration.class.getField("validatedInternetAccess").getBoolean(wifiConfiguration));
                        } catch (Throwable unused4) {
                        }
                        try {
                            String str3 = (String) WifiConfiguration.class.getField("dhcpServer").get(wifiConfiguration);
                            if (!TextUtils.isEmpty(str3)) {
                                jSONObject2.put("dhcpServer", str3);
                            }
                        } catch (Throwable unused5) {
                        }
                        try {
                            jSONObject2.put("assocs", WifiConfiguration.class.getField("numAssociation").getInt(wifiConfiguration));
                        } catch (Throwable unused6) {
                        }
                        try {
                            jSONObject2.put("metered", WifiConfiguration.class.getField("meteredHint").getBoolean(wifiConfiguration));
                        } catch (Throwable unused7) {
                        }
                    }
                    jSONArray.put(jSONObject2);
                } catch (JSONException unused8) {
                }
            }
        }
        return jSONArray;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static JSONObject m12447d() {
        JSONObject jSONObject = new JSONObject();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces.hasMoreElements()) {
                while (networkInterfaces.hasMoreElements()) {
                    try {
                        NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                        List<InterfaceAddress> interfaceAddresses = networkInterfaceNextElement.getInterfaceAddresses();
                        if (!AbstractC6539f3.m12283q(interfaceAddresses)) {
                            String displayName = networkInterfaceNextElement.getDisplayName();
                            if (!TextUtils.isEmpty(displayName)) {
                                JSONObject jSONObject2 = new JSONObject();
                                JSONArray jSONArray = new JSONArray();
                                Iterator<InterfaceAddress> it = interfaceAddresses.iterator();
                                while (it.hasNext()) {
                                    InetAddress address = it.next().getAddress();
                                    if (address != null && !address.isLoopbackAddress()) {
                                        jSONArray.put(m12449f(address));
                                    }
                                }
                                if (jSONArray.length() > 0) {
                                    jSONObject2.put("addrs", jSONArray);
                                    jSONObject.put(displayName, jSONObject2);
                                }
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return jSONObject;
    }

    @NonNull
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: e */
    public static JSONObject m12448e(@NonNull ProxyInfo proxyInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("host", proxyInfo.getHost());
        jSONObject.put("port", proxyInfo.getPort());
        String[] exclusionList = proxyInfo.getExclusionList();
        if (!AbstractC6539f3.m12287u(exclusionList)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : exclusionList) {
                if (!TextUtils.isEmpty(str)) {
                    jSONArray.put(str);
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put("exclusionList", jSONArray);
            }
        }
        return jSONObject;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static JSONObject m12449f(@NonNull InetAddress inetAddress) {
        JSONObject jSONObject = new JSONObject();
        try {
            String hostAddress = inetAddress.getHostAddress();
            String canonicalHostName = inetAddress.getCanonicalHostName();
            if (!TextUtils.equals(canonicalHostName, hostAddress)) {
                jSONObject.put("hostname", canonicalHostName);
            }
            if (inetAddress instanceof Inet6Address) {
                int iIndexOf = hostAddress != null ? hostAddress.indexOf("%") : 0;
                if (iIndexOf > 0) {
                    hostAddress = hostAddress.substring(0, iIndexOf);
                }
            }
            jSONObject.put(C33954u6.f72239j, hostAddress);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: h */
    public static void m12451h(@NonNull JSONObject jSONObject, @NonNull NetworkCapabilities networkCapabilities, @NonNull JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        Object objValueOf = null;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            int iOptInt = jSONArray.optInt(i11, -1);
            if (11 == iOptInt) {
                objValueOf = Boolean.valueOf(!networkCapabilities.hasCapability(iOptInt));
            }
            if (iOptInt != -1 && networkCapabilities.hasCapability(iOptInt)) {
                jSONArray2.put(iOptInt);
            }
        }
        jSONObject.put("caps", jSONArray2);
        if (objValueOf != null) {
            jSONObject.put("metered", objValueOf);
        }
    }

    /* JADX INFO: renamed from: k */
    public static JSONObject m12454k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mobileTx", TrafficStats.getMobileTxBytes());
            jSONObject.put("mobileRx", TrafficStats.getMobileRxBytes());
            jSONObject.put("totalTx", TrafficStats.getTotalTxBytes());
            jSONObject.put("totalRx", TrafficStats.getTotalRxBytes());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public static JSONObject m12455l(@NonNull Context context, @NonNull JSONObject jSONObject) {
        DhcpInfo dhcpInfo;
        int rssi;
        int linkSpeed;
        int frequency;
        JSONObject jSONObject2 = new JSONObject();
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                String ssid = connectionInfo.getSSID();
                if (!"<unknown ssid>".equals(ssid) && !TextUtils.isEmpty(ssid)) {
                    jSONObject2.put(TPDownloadProxyEnum.USER_SSID, m12444a(ssid));
                }
                int ipAddress = connectionInfo.getIpAddress();
                if (ipAddress > 0) {
                    jSONObject2.put("ipAddr", AbstractC6539f3.m12268b(ipAddress));
                }
                if (jSONObject.optBoolean("frequency") && (frequency = connectionInfo.getFrequency()) > 0) {
                    jSONObject2.put("freq", frequency + "MHz");
                }
                if (jSONObject.optBoolean("linkSpeed") && (linkSpeed = connectionInfo.getLinkSpeed()) > 0) {
                    jSONObject2.put("linkSpeed", linkSpeed + "Mbps");
                }
                if (jSONObject.optBoolean("signalLevel") && (rssi = connectionInfo.getRssi()) > -127) {
                    jSONObject2.put("signalLevel", WifiManager.calculateSignalLevel(rssi, 100));
                }
                if (jSONObject.optBoolean("dhcpInfo", true) && (dhcpInfo = wifiManager.getDhcpInfo()) != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("ipAddr", AbstractC6539f3.m12268b(dhcpInfo.ipAddress));
                    jSONObject3.put("gw", AbstractC6539f3.m12268b(dhcpInfo.gateway));
                    jSONObject3.put("nm", AbstractC6539f3.m12268b(dhcpInfo.netmask));
                    jSONObject3.put("dns1", AbstractC6539f3.m12268b(dhcpInfo.dns1));
                    jSONObject3.put("dns2", AbstractC6539f3.m12268b(dhcpInfo.dns2));
                    jSONObject3.put("dhcpAddr", AbstractC6539f3.m12268b(dhcpInfo.serverAddress));
                    jSONObject3.put("leaseDur", dhcpInfo.leaseDuration);
                    jSONObject2.put("dhcp", jSONObject3);
                }
                if (jSONObject.optBoolean("scanResults")) {
                    m12453j(jSONObject2, wifiManager, context, jSONObject);
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("confNets");
                if (jSONObjectOptJSONObject != null) {
                    List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
                    if (!AbstractC6539f3.m12283q(configuredNetworks)) {
                        JSONArray jSONArrayM12446c = m12446c(configuredNetworks, jSONObjectOptJSONObject);
                        if (jSONArrayM12446c.length() > 0) {
                            jSONObject2.put("confNets", jSONArrayM12446c);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject2;
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: n */
    public static void m12457n(@NonNull JSONObject jSONObject, @NonNull NetworkCapabilities networkCapabilities, @NonNull JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            int iOptInt = jSONArray.optInt(i11, -1);
            if (iOptInt != -1 && networkCapabilities.hasTransport(iOptInt)) {
                jSONArray2.put(iOptInt);
            }
        }
        jSONObject.put("trans", jSONArray2);
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: g */
    public static void m12450g(@NonNull JSONObject jSONObject, @NonNull LinkProperties linkProperties) throws JSONException {
        InetAddress address;
        List<LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
        if (!AbstractC6539f3.m12283q(linkAddresses)) {
            JSONArray jSONArray = new JSONArray();
            for (LinkAddress linkAddress : linkAddresses) {
                if (linkAddress != null && (address = linkAddress.getAddress()) != null) {
                    jSONArray.put(m12449f(address));
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put("addrs", jSONArray);
            }
        }
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: i */
    public static void m12452i(@NonNull JSONObject jSONObject, @NonNull ProxyInfo proxyInfo) throws JSONException {
        jSONObject.put("proxy", m12448e(proxyInfo));
    }

    /* JADX INFO: renamed from: j */
    public static void m12453j(@NonNull JSONObject jSONObject, @NonNull WifiManager wifiManager, @NonNull Context context, @NonNull JSONObject jSONObject2) throws JSONException {
        if ((Build.VERSION.SDK_INT <= 28 && AbstractC6506a3.m12115i(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) || AbstractC6506a3.m12115i(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (!AbstractC6539f3.m12283q(scanResults)) {
                JSONArray jSONArray = new JSONArray();
                for (ScanResult scanResult : scanResults) {
                    if (scanResult != null) {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(TPDownloadProxyEnum.USER_SSID, scanResult.SSID);
                            if (jSONObject2.optBoolean("frequency")) {
                                jSONObject3.put("freq", scanResult.frequency);
                            }
                            jSONObject3.put("caps", scanResult.capabilities);
                            if (jSONObject2.optBoolean("channelWidth")) {
                                jSONObject3.put("channelWidth", new String[]{"20MHz", "40MHz", "80MHz", "160MHz", "80+80MHz"}[scanResult.channelWidth]);
                            }
                            CharSequence charSequence = scanResult.venueName;
                            if (!TextUtils.isEmpty(charSequence)) {
                                jSONObject3.put("venueName", charSequence);
                            }
                            if (jSONObject2.optBoolean("signalLevel")) {
                                jSONObject3.put("signalLevel", WifiManager.calculateSignalLevel(scanResult.level, 100));
                            }
                            jSONArray.put(jSONObject3);
                        } catch (JSONException unused) {
                        }
                    }
                }
                jSONObject.put("scanResults", jSONArray);
            }
        }
    }

    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: m */
    public static void m12456m(@NonNull JSONObject jSONObject, @NonNull LinkProperties linkProperties) throws JSONException {
        List<InetAddress> dnsServers = linkProperties.getDnsServers();
        if (!AbstractC6539f3.m12283q(dnsServers)) {
            JSONArray jSONArray = new JSONArray();
            for (InetAddress inetAddress : dnsServers) {
                if (inetAddress != null) {
                    jSONArray.put(m12449f(inetAddress));
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put("dns", jSONArray);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if (linkProperties.isPrivateDnsActive()) {
                jSONObject.put("privateDnsActive", true);
            }
            String privateDnsServerName = linkProperties.getPrivateDnsServerName();
            if (!TextUtils.isEmpty(privateDnsServerName)) {
                jSONObject.put("privateDnsName", privateDnsServerName);
            }
        }
        String domains = linkProperties.getDomains();
        if (!TextUtils.isEmpty(domains)) {
            jSONObject.put("domains", domains);
        }
    }
}
