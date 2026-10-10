package com.datavisorobfus;

import android.content.Context;
import android.net.Uri;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.datavisor.vangogh.bridge.crypto;
import com.datavisor.vangogh.util.ExceptionUtil;
import com.datavisor.vangogh.util.network.AnyCastDNS;
import com.jumio.core.constants.ConstantsKt;
import java.io.IOException;
import java.net.ConnectException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.datavisorobfus.r0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5441r0 {

    /* JADX INFO: renamed from: a */
    private static OkHttpClient f7380a;

    /* JADX INFO: renamed from: a */
    private static void m7385a(Map<String, String> map, int i11) {
    }

    static {
        OkHttpClient.Builder builderNewBuilder = new OkHttpClient().newBuilder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f7380a = builderNewBuilder.connectTimeout(10000L, timeUnit).writeTimeout(10000L, timeUnit).readTimeout(10000L, timeUnit).build();
    }

    /* JADX INFO: renamed from: a */
    private static int m7379a(String str) {
        try {
            String path = Uri.parse(str).getPath();
            if (C5457z0.m7480a(path)) {
                return 0;
            }
            if (path.equals("/vangogh_data")) {
                return 1;
            }
            if (path.equals("/config")) {
                return 2;
            }
            if (path.equals("/vangogh_errlog2")) {
                return 3;
            }
            if (path.equals("/vangogh_event")) {
                return 4;
            }
            if (path.equals("/vangogh_long_session")) {
                return 5;
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private static C5443s0 m7380a(int i11, int i12, int i13, Map<String, String> map, byte[] bArr, Map<String, String> map2, Context context) {
        int i14;
        C5443s0 c5443s0M7381a;
        Map<String, String> map3 = map;
        try {
            m7385a(map3, i11);
            JSONObject jSONObject = new JSONObject();
            int i15 = 0;
            int i16 = 0;
            C5443s0 c5443s0 = null;
            while (true) {
                if (i15 >= i13) {
                    i14 = i12;
                    c5443s0M7381a = c5443s0;
                    break;
                }
                String strM7383a = m7383a(context, i11, i16);
                long jNanoTime = System.nanoTime();
                i14 = i12;
                c5443s0M7381a = m7381a(strM7383a, i14, map3, bArr, map2, context, false);
                long jNanoTime2 = System.nanoTime();
                if (i11 == 1 && i14 == 0) {
                    try {
                        long j11 = (jNanoTime2 - jNanoTime) / 1000000;
                        String host = Uri.parse(strM7383a).getHost();
                        if (C5457z0.m7482b(host)) {
                            if (!jSONObject.has(host)) {
                                jSONObject.put(host, new JSONArray());
                            }
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(host);
                            if (jSONArrayOptJSONArray != null) {
                                jSONArrayOptJSONArray.put(j11);
                            }
                        }
                    } catch (Throwable th2) {
                        C5415f0.m7139a(th2);
                    }
                }
                int i17 = c5443s0M7381a.f7383c;
                if (i17 == 0 || i17 == 6 || i17 == 17 || i17 == 7 || (i14 == 3 && i17 == 16)) {
                    break;
                    break;
                    break;
                    break;
                    break;
                }
                if (i15 < i13 - 1) {
                    int iM7462b = C5454y.m7454a(context).m7462b(i16);
                    try {
                        Thread.sleep(4000L);
                    } catch (InterruptedException unused) {
                    }
                    i16 = iM7462b;
                }
                i15++;
                map3 = map;
                c5443s0 = c5443s0M7381a;
            }
            if (i11 == 1 && i14 == 0) {
                try {
                    C5422i.m7160b().f7272k = jSONObject.toString();
                } catch (Throwable th3) {
                    C5415f0.m7139a(th3);
                }
            }
            if (c5443s0M7381a != null) {
                return c5443s0M7381a;
            }
            C5443s0 c5443s1 = new C5443s0();
            c5443s1.f7383c = 10;
            return c5443s1;
        } catch (Throwable th4) {
            C5415f0.m7139a(th4);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C5443s0 m7387b(Map<String, String> map, byte[] bArr, Context context) {
        return m7380a(1, 1, C5454y.m7454a(context).m7468e(), map, bArr, (Map<String, String>) null, context);
    }

    /* JADX INFO: renamed from: c */
    public static C5443s0 m7388c(Map<String, String> map, byte[] bArr, Context context) {
        return m7380a(1, 0, C5454y.m7454a(context).m7468e(), map, bArr, (Map<String, String>) null, context);
    }

    /* JADX INFO: renamed from: d */
    public static C5443s0 m7389d(Map<String, String> map, byte[] bArr, Context context) {
        return m7380a(3, 0, C5454y.m7454a(context).m7468e(), map, bArr, (Map<String, String>) null, context);
    }

    /* JADX INFO: renamed from: a */
    public static C5443s0 m7381a(String str, int i11, Map<String, String> map, byte[] bArr, Map<String, String> map2, Context context, boolean z11) {
        StringBuilder sb2;
        HttpUrl httpUrl;
        Request.Builder builder = new Request.Builder();
        C5443s0 c5443s0 = new C5443s0();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builder.addHeader(entry.getKey(), entry.getValue());
            }
        }
        if (bArr != null) {
            if (i11 == 1) {
                builder.put(RequestBody.create(MediaType.parse(ConstantsKt.MIME_TYPE_OCTET_STREAM), bArr));
            } else if (i11 == 0) {
                builder.post(RequestBody.create(MediaType.parse(ConstantsKt.MIME_TYPE_OCTET_STREAM), bArr));
            } else if (i11 == 3) {
                builder.patch(RequestBody.create(MediaType.parse(ConstantsKt.MIME_TYPE_OCTET_STREAM), bArr));
            } else {
                builder.get();
            }
        }
        if (map2 == null || map2.size() <= 0 || (httpUrl = HttpUrl.parse(str)) == null) {
            builder.url(str);
        } else {
            HttpUrl.Builder builderNewBuilder = httpUrl.newBuilder();
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                builderNewBuilder.addQueryParameter(entry2.getKey(), entry2.getValue());
            }
            builder.url(builderNewBuilder.build());
        }
        Request requestBuild = builder.build();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                Response responseExecute = f7380a.newCall(requestBuild).execute();
                if (responseExecute.isSuccessful()) {
                    c5443s0.f7381a = responseExecute.headers().toMultimap();
                    c5443s0.f7382b = responseExecute.body().bytes();
                    c5443s0.f7385e = responseExecute.headers().toString();
                } else if (responseExecute.code() == 304) {
                    c5443s0.f7383c = 17;
                } else {
                    if (responseExecute.code() == 550) {
                        c5443s0.f7383c = 16;
                    } else if (responseExecute.code() < 400 || responseExecute.code() >= 500) {
                        c5443s0.f7383c = 7;
                    } else {
                        c5443s0.f7383c = 6;
                    }
                    if (m7379a(str) == 1) {
                        ExceptionUtil.m7089a("postException errcode: ", responseExecute.toString(), context);
                    }
                }
            } catch (IOException e11) {
                if (e11 instanceof SocketTimeoutException) {
                    c5443s0.f7383c = 9;
                } else if (e11 instanceof ConnectException) {
                    c5443s0.f7383c = 5;
                } else if (e11 instanceof UnknownHostException) {
                    c5443s0.f7383c = 18;
                } else if (e11 instanceof SSLHandshakeException) {
                    c5443s0.f7383c = 19;
                } else if (e11 instanceof SSLPeerUnverifiedException) {
                    c5443s0.f7383c = 20;
                } else if (e11 instanceof SSLKeyException) {
                    c5443s0.f7383c = 21;
                } else if (e11 instanceof SSLProtocolException) {
                    c5443s0.f7383c = 22;
                } else if (e11 instanceof SSLException) {
                    c5443s0.f7383c = 23;
                } else if (e11 instanceof SocketException) {
                    c5443s0.f7383c = 24;
                } else {
                    c5443s0.f7383c = 10;
                }
                c5443s0.f7386f = e11;
                C5415f0.m7139a(e11);
                if (z11) {
                    byte[] bArrM7386a = m7386a(str, bArr, map);
                    if (bArrM7386a == null || bArrM7386a.length <= 1) {
                        sb2 = new StringBuilder();
                        sb2.append("postException udpFail: ");
                    } else {
                        c5443s0.f7383c = 0;
                        HashMap map3 = new HashMap();
                        if (bArrM7386a[0] != 0) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("1");
                            map3.put("cv", arrayList);
                        }
                        c5443s0.f7381a = map3;
                        byte[] bArr2 = new byte[bArrM7386a.length - 1];
                        System.arraycopy(bArrM7386a, 1, bArr2, 0, bArrM7386a.length - 1);
                        c5443s0.f7382b = bArr2;
                        sb2 = new StringBuilder();
                        sb2.append("postException udpSuccess: ");
                    }
                } else if (m7379a(str) == 1) {
                    sb2 = new StringBuilder();
                    sb2.append("postException: ");
                }
                sb2.append(str);
                ExceptionUtil.m7091a(sb2.toString(), e11, context);
            }
            return c5443s0;
        } finally {
            c5443s0.f7384d = System.currentTimeMillis() - jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C5443s0 m7382a(Map<String, String> map, byte[] bArr, Context context) {
        return m7380a(1, 3, C5454y.m7454a(context).m7468e(), map, bArr, (Map<String, String>) null, context);
    }

    /* JADX INFO: renamed from: a */
    private static String m7383a(Context context, int i11, int i12) {
        String strM7461a;
        StringBuilder sb2;
        String str;
        try {
            if (i11 == 4) {
                strM7461a = C5454y.m7454a(context).m7465c();
            } else if (i11 == 8) {
                strM7461a = C5454y.m7454a(context).m7466d();
            } else {
                strM7461a = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 5) ? C5454y.m7454a(context).m7461a(i12) : "";
            }
            if (C5457z0.m7480a(strM7461a)) {
                return "";
            }
            if (i11 == 1) {
                sb2 = new StringBuilder();
                sb2.append(strM7461a);
                str = "/vangogh_data";
            } else if (i11 == 2) {
                sb2 = new StringBuilder();
                sb2.append(strM7461a);
                str = "/config";
            } else if (i11 == 3) {
                sb2 = new StringBuilder();
                sb2.append(strM7461a);
                str = "/vangogh_errlog2";
            } else if (i11 == 4) {
                sb2 = new StringBuilder();
                sb2.append(strM7461a);
                str = "/vangogh_event";
            } else if (i11 == 5) {
                sb2 = new StringBuilder();
                sb2.append(strM7461a);
                str = "/vangogh_long_session";
            } else {
                if (i11 != 8) {
                    return "";
                }
                sb2 = new StringBuilder();
                sb2.append(strM7461a);
                str = "/vangogh_raphael_v3";
            }
            sb2.append(str);
            return sb2.toString();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7384a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            C5415f0.m7136a("setIPDirectClient iPDirectDomainMap is empty");
            return;
        }
        OkHttpClient.Builder builderNewBuilder = new OkHttpClient().newBuilder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f7380a = builderNewBuilder.connectTimeout(10000L, timeUnit).writeTimeout(10000L, timeUnit).readTimeout(10000L, timeUnit).dns(new AnyCastDNS(map)).build();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX INFO: renamed from: a */
    private static byte[] m7386a(String str, byte[] bArr, Map<String, String> map) {
        Throwable th2;
        DatagramSocket datagramSocket;
        byte[] bArr2;
        byte[] bArrSign;
        byte b11;
        DatagramSocket datagramSocket2 = null;
        byte[] bArr3 = null;
        if (C5457z0.m7480a(str) || bArr == null) {
            return null;
        }
        try {
            String host = Uri.parse(str).getHost();
            byte[] bArrReduce = crypto.reduce(bArr);
            if (bArrReduce == null || (bArrSign = crypto.sign(bArrReduce)) == null) {
                bArr2 = null;
            } else {
                int length = bArrReduce.length + 2 + bArrSign.length;
                byte[] bArr4 = new byte[length];
                byte bM7379a = (byte) (m7379a(str) & 255);
                if (map != null) {
                    String str2 = map.get("c");
                    if (C5457z0.m7482b(str2) && str2.equals("1")) {
                        b11 = (byte) 1;
                    } else {
                        b11 = 0;
                    }
                } else {
                    b11 = 0;
                }
                bArr4[0] = bM7379a;
                bArr4[1] = b11;
                System.arraycopy(bArrReduce, 0, bArr4, 2, bArrReduce.length);
                System.arraycopy(bArrSign, 0, bArr4, bArrReduce.length + 2, bArrSign.length);
                datagramSocket = new DatagramSocket(9111);
                try {
                    datagramSocket.setSoTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
                    datagramSocket.send(new DatagramPacket(bArr4, length, InetAddress.getByName(host), 9111));
                    DatagramPacket datagramPacket = new DatagramPacket(new byte[2048], 2048);
                    datagramSocket.receive(datagramPacket);
                    int length2 = datagramPacket.getLength();
                    if (length2 > 0) {
                        byte[] bArr5 = new byte[length2];
                        System.arraycopy(datagramPacket.getData(), 0, bArr5, 0, length2);
                        bArr3 = bArr5;
                    }
                    byte[] bArr6 = bArr3;
                    datagramSocket2 = datagramSocket;
                    bArr2 = bArr6;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        C5415f0.m7139a(th2);
                        return null;
                    } finally {
                        if (datagramSocket != null) {
                            datagramSocket.close();
                        }
                    }
                }
            }
            if (datagramSocket2 != null) {
                datagramSocket2.close();
            }
            return bArr2;
        } catch (Throwable th4) {
            th2 = th4;
            datagramSocket = null;
        }
    }
}
