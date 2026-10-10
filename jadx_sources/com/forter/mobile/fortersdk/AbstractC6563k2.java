package com.forter.mobile.fortersdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.ProxyInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiEnterpriseConfig;
import android.net.wifi.WifiManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.k2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6563k2 {
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: d */
    public static boolean m12413d(@NonNull Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasCapability(12) && (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3));
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected() && (activeNetworkInfo.getType() == 0 || activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9);
        } catch (Exception unused) {
        }
    }

    @Nullable
    @TargetApi(23)
    /* JADX INFO: renamed from: b */
    public static String[] m12411b(@NonNull Context context) {
        try {
            ProxyInfo defaultProxy = ((ConnectivityManager) context.getSystemService("connectivity")).getDefaultProxy();
            if (defaultProxy != null) {
                return new String[]{defaultProxy.getHost(), String.valueOf(defaultProxy.getPort()), defaultProxy.getExclusionList() != null ? AbstractC6539f3.m12276j(defaultProxy.getExclusionList()) : ""};
            }
        } catch (Exception unused) {
        }
        try {
            Object objInvoke = ConnectivityManager.class.getMethod("getProxy", new Class[0]).invoke((ConnectivityManager) context.getSystemService("connectivity"), new Object[0]);
            if (objInvoke == null) {
                return null;
            }
            Class<?> cls = Class.forName("android.net.ProxyProperties");
            String[] strArr = {(String) cls.getMethod("getHost", new Class[0]).invoke(objInvoke, new Object[0]), String.valueOf(cls.getMethod("getPort", new Class[0]).invoke(objInvoke, new Object[0])), (String) cls.getMethod("getExclusionList", new Class[0]).invoke(objInvoke, new Object[0])};
            if (strArr[0] != null) {
                return strArr;
            }
        } catch (NoSuchMethodException | Exception unused2) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0189 A[EDGE_INSN: B:145:0x0189->B:93:0x0189 BREAK  A[LOOP:1: B:87:0x0174->B:92:0x0186], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[Catch: all -> 0x01e4, TryCatch #2 {all -> 0x01e4, blocks: (B:3:0x0007, B:24:0x005b, B:25:0x006b, B:27:0x0071, B:29:0x0090, B:30:0x0095, B:32:0x009b, B:38:0x00ad, B:41:0x00b6, B:43:0x00bc, B:45:0x00d2, B:48:0x00e0, B:86:0x016d, B:87:0x0174, B:89:0x0179, B:91:0x0181, B:92:0x0186, B:93:0x0189, B:100:0x01a6, B:103:0x01cb), top: B:117:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d2 A[Catch: all -> 0x01e4, TryCatch #2 {all -> 0x01e4, blocks: (B:3:0x0007, B:24:0x005b, B:25:0x006b, B:27:0x0071, B:29:0x0090, B:30:0x0095, B:32:0x009b, B:38:0x00ad, B:41:0x00b6, B:43:0x00bc, B:45:0x00d2, B:48:0x00e0, B:86:0x016d, B:87:0x0174, B:89:0x0179, B:91:0x0181, B:92:0x0186, B:93:0x0189, B:100:0x01a6, B:103:0x01cb), top: B:117:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:60:0x0117  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124  */
    /* JADX WARN: Code duplicated, block: B:75:0x0143  */
    /* JADX WARN: Code duplicated, block: B:80:0x0157  */
    /* JADX WARN: Code duplicated, block: B:84:0x0167  */
    /* JADX WARN: Code duplicated, block: B:89:0x0179 A[Catch: all -> 0x01e4, TryCatch #2 {all -> 0x01e4, blocks: (B:3:0x0007, B:24:0x005b, B:25:0x006b, B:27:0x0071, B:29:0x0090, B:30:0x0095, B:32:0x009b, B:38:0x00ad, B:41:0x00b6, B:43:0x00bc, B:45:0x00d2, B:48:0x00e0, B:86:0x016d, B:87:0x0174, B:89:0x0179, B:91:0x0181, B:92:0x0186, B:93:0x0189, B:100:0x01a6, B:103:0x01cb), top: B:117:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0181 A[Catch: all -> 0x01e4, TryCatch #2 {all -> 0x01e4, blocks: (B:3:0x0007, B:24:0x005b, B:25:0x006b, B:27:0x0071, B:29:0x0090, B:30:0x0095, B:32:0x009b, B:38:0x00ad, B:41:0x00b6, B:43:0x00bc, B:45:0x00d2, B:48:0x00e0, B:86:0x016d, B:87:0x0174, B:89:0x0179, B:91:0x0181, B:92:0x0186, B:93:0x0189, B:100:0x01a6, B:103:0x01cb), top: B:117:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a1 A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #3 {all -> 0x01a6, blocks: (B:97:0x019b, B:99:0x01a1), top: B:119:0x019b }] */
    @NonNull
    @SuppressLint({"MissingPermission"})
    @TargetApi(26)
    /* JADX INFO: renamed from: g */
    public static JSONObject m12416g(@NonNull Context context) {
        Field field;
        Field field2;
        Field field3;
        Field field4;
        Field field5;
        Field field6;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str2;
        boolean z11;
        String str3;
        boolean z12;
        Field field7;
        String str4;
        boolean z13;
        String str5;
        JSONArray jSONArray;
        int i17;
        String[] strArr;
        boolean z14;
        ProxyInfo httpProxy;
        String strM12276j;
        JSONObject jSONObject = new JSONObject();
        try {
            List<WifiConfiguration> configuredNetworks = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConfiguredNetworks();
            JSONArray jSONArray2 = new JSONArray();
            jSONObject.put("networks", jSONArray2);
            String str6 = ViewProps.HIDDEN;
            if (configuredNetworks != null) {
                try {
                    field = WifiConfiguration.class.getField("creatorName");
                } catch (Throwable unused) {
                    field = null;
                }
                try {
                    field2 = WifiConfiguration.class.getField("lastUpdateName");
                } catch (Throwable unused2) {
                    field2 = null;
                }
                try {
                    field3 = WifiConfiguration.class.getField("validatedInternetAccess");
                } catch (Throwable unused3) {
                    field3 = null;
                }
                try {
                    field4 = WifiConfiguration.class.getField("defaultGwMacAddress");
                } catch (Throwable unused4) {
                    field4 = null;
                }
                try {
                    field5 = WifiConfiguration.class.getField("numAssociation");
                } catch (Throwable unused5) {
                    field5 = null;
                }
                try {
                    field6 = WifiConfiguration.class.getField("meteredHint");
                } catch (Throwable unused6) {
                    field6 = null;
                }
                Iterator<WifiConfiguration> it = configuredNetworks.iterator();
                int i18 = 0;
                int i19 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (it.hasNext()) {
                    WifiConfiguration next = it.next();
                    JSONObject jSONObject2 = new JSONObject();
                    Iterator<WifiConfiguration> it2 = it;
                    jSONObject2.put(TPDownloadProxyEnum.USER_SSID, next.SSID);
                    boolean z15 = next.hiddenSSID;
                    if (z15) {
                        i19++;
                        jSONObject2.put(str6, z15);
                    }
                    int i25 = Build.VERSION.SDK_INT;
                    WifiEnterpriseConfig wifiEnterpriseConfig = next.enterpriseConfig;
                    if (wifiEnterpriseConfig != null) {
                        str2 = str6;
                        if (wifiEnterpriseConfig.getEapMethod() != -1) {
                            z11 = true;
                        }
                        if (z11) {
                            i21++;
                            jSONObject2.put("enterprise", z11);
                        }
                        if (i25 > 25 && (httpProxy = next.getHttpProxy()) != null) {
                            String host = httpProxy.getHost();
                            Integer numValueOf = Integer.valueOf(httpProxy.getPort());
                            if (httpProxy.getExclusionList() != null) {
                                strM12276j = AbstractC6539f3.m12276j(httpProxy.getExclusionList());
                            } else {
                                strM12276j = "";
                            }
                            jSONObject2.put("proxy", new JSONArray((Collection) Arrays.asList(host, numValueOf, strM12276j)));
                        }
                        if (field != null) {
                            try {
                                str3 = (String) field.get(next);
                                if (str3 != null || "null".equals(str3) || "android.uid.system:1000".equals(str3)) {
                                    z12 = false;
                                    str3 = null;
                                } else {
                                    i22++;
                                    z12 = true;
                                }
                                field7 = field;
                                try {
                                    jSONObject2.put(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_CREATOR, str3);
                                } catch (Throwable unused7) {
                                }
                            } catch (Throwable unused8) {
                                field7 = field;
                                z12 = false;
                            }
                        } else {
                            field7 = field;
                            z12 = false;
                        }
                        if (field2 != null) {
                            try {
                                str4 = (String) field2.get(next);
                                if (str4 != null || "null".equals(str4) || "android.uid.system:1000".equals(str4)) {
                                    str4 = null;
                                } else if (!z12) {
                                    i22++;
                                }
                                jSONObject2.put("lastModifier", str4);
                            } catch (Throwable unused9) {
                            }
                        }
                        if (field3 != null) {
                            try {
                                z13 = field3.getBoolean(next);
                                jSONObject2.put("validated", z13);
                                if (z13) {
                                    i18++;
                                }
                            } catch (Throwable unused10) {
                            }
                        }
                        if (field4 != null) {
                            try {
                                str5 = (String) field4.get(next);
                                if ("null".equals(str5)) {
                                    str5 = null;
                                }
                                jSONObject2.put("defaultGatewayMac", str5);
                            } catch (Throwable unused11) {
                            }
                        }
                        jSONArray = new JSONArray();
                        i17 = 0;
                        while (true) {
                            strArr = WifiConfiguration.KeyMgmt.strings;
                            if (i17 < strArr.length) {
                                break;
                            }
                            if (next.allowedKeyManagement.get(i17)) {
                                jSONArray.put(strArr[i17]);
                            }
                            i17++;
                        }
                        jSONObject2.put("security", jSONArray);
                        if (field5 != null) {
                            try {
                                int i26 = field5.getInt(next);
                                i23 += i26;
                                jSONObject2.put("associations", i26);
                            } catch (Throwable unused12) {
                            }
                        }
                        if (field6 != null) {
                            try {
                                z14 = field6.getBoolean(next);
                                if (z14) {
                                    i24++;
                                    jSONObject2.put("meteredHint", z14);
                                }
                            } catch (Throwable unused13) {
                            }
                        }
                        jSONArray2.put(jSONObject2);
                        it = it2;
                        str6 = str2;
                        field = field7;
                    } else {
                        str2 = str6;
                    }
                    z11 = false;
                    if (z11) {
                        i21++;
                        jSONObject2.put("enterprise", z11);
                    }
                    if (i25 > 25) {
                        String host2 = httpProxy.getHost();
                        Integer numValueOf2 = Integer.valueOf(httpProxy.getPort());
                        if (httpProxy.getExclusionList() != null) {
                            strM12276j = AbstractC6539f3.m12276j(httpProxy.getExclusionList());
                        } else {
                            strM12276j = "";
                        }
                        jSONObject2.put("proxy", new JSONArray((Collection) Arrays.asList(host2, numValueOf2, strM12276j)));
                    }
                    if (field != null) {
                        str3 = (String) field.get(next);
                        if (str3 != null) {
                            z12 = false;
                            str3 = null;
                        } else {
                            z12 = false;
                            str3 = null;
                        }
                        field7 = field;
                        jSONObject2.put(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_CREATOR, str3);
                    } else {
                        field7 = field;
                        z12 = false;
                    }
                    if (field2 != null) {
                        str4 = (String) field2.get(next);
                        if (str4 != null) {
                            str4 = null;
                        } else {
                            str4 = null;
                        }
                        jSONObject2.put("lastModifier", str4);
                    }
                    if (field3 != null) {
                        z13 = field3.getBoolean(next);
                        jSONObject2.put("validated", z13);
                        if (z13) {
                            i18++;
                        }
                    }
                    if (field4 != null) {
                        str5 = (String) field4.get(next);
                        if ("null".equals(str5)) {
                            str5 = null;
                        }
                        jSONObject2.put("defaultGatewayMac", str5);
                    }
                    jSONArray = new JSONArray();
                    i17 = 0;
                    while (true) {
                        strArr = WifiConfiguration.KeyMgmt.strings;
                        if (i17 < strArr.length) {
                            break;
                            break;
                        }
                        if (next.allowedKeyManagement.get(i17)) {
                            jSONArray.put(strArr[i17]);
                        }
                        i17++;
                    }
                    jSONObject2.put("security", jSONArray);
                    if (field5 != null) {
                        int i27 = field5.getInt(next);
                        i23 += i27;
                        jSONObject2.put("associations", i27);
                    }
                    if (field6 != null) {
                        z14 = field6.getBoolean(next);
                        if (z14) {
                            i24++;
                            jSONObject2.put("meteredHint", z14);
                        }
                    }
                    jSONArray2.put(jSONObject2);
                    it = it2;
                    str6 = str2;
                    field = field7;
                }
                str = str6;
                i11 = i18;
                i12 = i19;
                i13 = i21;
                i14 = i22;
                i15 = i23;
                i16 = i24;
            } else {
                str = ViewProps.HIDDEN;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i14 = 0;
                i16 = 0;
                i15 = 0;
            }
            jSONObject.put("validatedNetwork", i11);
            jSONObject.put(str, i12);
            jSONObject.put("enterprise", i13);
            jSONObject.put("custom", i14);
            jSONObject.put("meteredHint", i16);
            jSONObject.put("associations", i15);
        } catch (Throwable unused14) {
        }
        return jSONObject;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static JSONObject m12410a() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            JSONObject jSONObject = new JSONObject();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                if (inetAddresses.hasMoreElements()) {
                    String displayName = networkInterfaceNextElement.getDisplayName();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("hostname", inetAddressNextElement.getCanonicalHostName());
                        jSONObject2.put(C33954u6.f72239j, inetAddressNextElement.getHostAddress());
                        jSONObject.put(displayName, jSONObject2);
                    }
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static String m12412c(@NonNull Context context) {
        try {
            NetworkInfo networkInfoM12069a = C6503a0.m12069a(context);
            if (networkInfoM12069a != null && networkInfoM12069a.isConnected() && networkInfoM12069a.getType() == 1) {
                return "WiFi";
            }
            NetworkInfo networkInfoM12069a2 = C6503a0.m12069a(context);
            if (networkInfoM12069a2 != null && networkInfoM12069a2.isConnected() && networkInfoM12069a2.getType() == 0) {
                return "DATA";
            }
            return "OFFLINE";
        } catch (Exception unused) {
            return "FAILURE";
        }
    }

    @SuppressLint({"MissingPermission", "NewApi"})
    @TargetApi(16)
    /* JADX INFO: renamed from: e */
    public static String m12414e(@NonNull Context context) {
        try {
            return String.valueOf(((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).isActiveNetworkMetered());
        } catch (Exception unused) {
            return "N/A";
        }
    }

    @NonNull
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: f */
    public static String m12415f(@NonNull Context context) {
        try {
            String ssid = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getSSID();
            if (!ssid.equals("<unknown ssid>")) {
                return ssid;
            }
        } catch (Exception unused) {
        }
        return AbstractC6553i2.m12313A(context);
    }
}
