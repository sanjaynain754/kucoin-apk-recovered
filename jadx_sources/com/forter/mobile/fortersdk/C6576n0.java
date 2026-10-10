package com.forter.mobile.fortersdk;

import android.content.Context;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.C33954u6;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.n0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6576n0 {

    /* JADX INFO: renamed from: a */
    public static final List<String> f11006a;

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.n0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final InetAddress f11007a;

        /* JADX INFO: renamed from: b */
        public final int f11008b;

        /* JADX INFO: renamed from: c */
        public final String f11009c;

        /* JADX INFO: renamed from: d */
        public final int f11010d;

        @NonNull
        /* JADX INFO: renamed from: b */
        public static List<a> m12436b(File file) {
            Scanner scanner;
            ArrayList arrayList = new ArrayList();
            try {
                scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    try {
                        String strTrim = scanner.nextLine().trim();
                        if (!strTrim.startsWith("sl")) {
                            String[] strArrSplit = strTrim.split("\\s+");
                            if (strArrSplit.length >= 12) {
                                arrayList.add(new a(m12435a(strArrSplit[1].split(C33844oi.f71346o)[0]), Integer.parseInt(strArrSplit[1].split(C33844oi.f71346o)[1], 16), strArrSplit[3], Integer.parseInt(strArrSplit[7])));
                            } else {
                                continue;
                            }
                        }
                    } catch (Throwable unused) {
                        if (scanner != null) {
                            scanner.close();
                        }
                        return arrayList;
                    }
                }
                scanner.close();
                return arrayList;
            } catch (Throwable unused2) {
                scanner = null;
            }
        }

        public a(InetAddress inetAddress, int i11, String str, int i12) {
            this.f11007a = inetAddress;
            this.f11008b = i11;
            this.f11009c = str;
            this.f11010d = i12;
        }

        /* JADX INFO: renamed from: a */
        public static InetAddress m12435a(String str) throws UnknownHostException {
            int length = str.length();
            if (length != 8 && length != 32) {
                throw new IllegalArgumentException(String.valueOf(length));
            }
            int i11 = length / 2;
            byte[] bArr = new byte[i11];
            for (int i12 = 0; i12 < i11; i12 += 4) {
                int i13 = i12 * 2;
                bArr[i12] = (byte) ((Character.digit(str.charAt(i13 + 6), 16) << 4) + Character.digit(str.charAt(i13 + 7), 16));
                bArr[i12 + 1] = (byte) ((Character.digit(str.charAt(i13 + 4), 16) << 4) + Character.digit(str.charAt(i13 + 5), 16));
                bArr[i12 + 2] = (byte) ((Character.digit(str.charAt(i13 + 2), 16) << 4) + Character.digit(str.charAt(i13 + 3), 16));
                bArr[i12 + 3] = (byte) ((Character.digit(str.charAt(i13), 16) << 4) + Character.digit(str.charAt(i13 + 1), 16));
            }
            return InetAddress.getByAddress(bArr);
        }
    }

    static {
        ArrayList arrayList = new ArrayList(15);
        f11006a = arrayList;
        arrayList.add("0.0.0.0:5555");
        arrayList.add("0.0.0.0:22468");
        arrayList.add("0.0.0.0:9101");
        arrayList.add("0.0.0.0:9551");
        arrayList.add("0.0.0.0:9552");
        arrayList.add("10.0.2.15:5555");
        arrayList.add("127.0.0.1:5037");
        arrayList.add("0.0.0.0 1020");
        arrayList.add("0.0.0.0 10000");
        arrayList.add("127.0.0.1 10000");
        arrayList.add(":: 1002");
        arrayList.add(":: 1020");
        arrayList.add("0.0.0.0:7275");
        arrayList.add(":::5555");
        arrayList.add(":::7275");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x013c A[Catch: JSONException -> 0x0141, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0141, blocks: (B:46:0x0134, B:48:0x013c), top: B:52:0x0134 }] */
    /* JADX INFO: renamed from: a */
    public static JSONObject m12430a(@NonNull Context context, @NonNull String str, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        File file = new File("/proc/net/".concat(String.valueOf(str)));
        if (file.canRead()) {
            List<a> listM12436b = a.m12436b(file);
            if (!AbstractC6539f3.m12283q(listM12436b)) {
                boolean zStartsWith = str.startsWith(C33675gh.f69993B);
                boolean z12 = Looper.getMainLooper().getThread() == Thread.currentThread();
                JSONArray jSONArray = null;
                JSONArray jSONArray2 = null;
                for (a aVar : listM12436b) {
                    String str2 = aVar.f11007a.getHostAddress() + ':' + aVar.f11008b;
                    String str3 = aVar.f11007a.getHostAddress() + ' ' + aVar.f11010d;
                    String str4 = str2 + ' ' + aVar.f11010d;
                    if (aVar.f11010d != Process.myUid()) {
                        if ((zStartsWith ? "0A" : "07").equals(aVar.f11009c) && !m12432c(str2) && !m12432c(str3) && !m12432c(str4) && (!z11 || z12 || !zStartsWith || m12433d(aVar.f11007a, aVar.f11008b))) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put(C33954u6.f72239j, aVar.f11007a.getHostAddress());
                                jSONObject2.put("port", aVar.f11008b);
                                jSONObject2.put("uid", aVar.f11010d);
                                String[] packagesForUid = context.getPackageManager().getPackagesForUid(aVar.f11010d);
                                jSONObject2.put("pkgs", packagesForUid == null ? "[unknown]" : Arrays.asList(packagesForUid).toString());
                                if (aVar.f11007a.isLoopbackAddress()) {
                                    if (jSONArray2 == null) {
                                        jSONArray2 = new JSONArray();
                                    }
                                    jSONArray2.put(jSONObject2);
                                } else {
                                    if (jSONArray == null) {
                                        jSONArray = new JSONArray();
                                    }
                                    jSONArray.put(jSONObject2);
                                }
                            } catch (JSONException unused) {
                            }
                        }
                    }
                }
                if (jSONArray != null) {
                    try {
                        jSONObject.put("remotely", jSONArray);
                        if (jSONArray2 != null) {
                            jSONObject.put("locally", jSONArray2);
                        }
                    } catch (JSONException unused2) {
                    }
                } else if (jSONArray2 != null) {
                    jSONObject.put("locally", jSONArray2);
                }
            }
        }
        return jSONObject;
    }

    @NonNull
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public static JSONObject m12431b(@NonNull Context context, @NonNull JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("protocols");
        if (!AbstractC6539f3.m12285s(jSONArrayOptJSONArray)) {
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("allowList");
            if (!AbstractC6539f3.m12285s(jSONArrayOptJSONArray2)) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                    String strOptString = jSONArrayOptJSONArray2.optString(i11);
                    if (!TextUtils.isEmpty(strOptString)) {
                        f11006a.add(strOptString);
                    }
                }
            }
            boolean zOptBoolean = jSONObject.optBoolean("checkConnection");
            for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                String strOptString2 = jSONArrayOptJSONArray.optString(i12);
                if (!TextUtils.isEmpty(strOptString2)) {
                    try {
                        jSONObject2.put(strOptString2, m12430a(context, strOptString2, zOptBoolean));
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12432c(String str) {
        return m12434e(f11006a, str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12433d(InetAddress inetAddress, int i11) {
        Socket socket = new Socket();
        try {
            try {
                socket.connect(new InetSocketAddress(inetAddress, i11), 5000);
                try {
                    socket.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (IOException unused2) {
                return false;
            }
        } catch (IOException unused3) {
            socket.close();
            return false;
        } catch (Throwable th2) {
            try {
                socket.close();
            } catch (IOException unused4) {
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m12434e(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (Pattern.matches(Pattern.quote(it.next()), str)) {
                return true;
            }
        }
        return false;
    }
}
