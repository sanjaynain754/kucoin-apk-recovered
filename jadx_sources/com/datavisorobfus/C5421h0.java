package com.datavisorobfus;

import android.content.Context;
import android.net.LocalServerSocket;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.datavisor.vangogh.bridge.crypto;
import com.datavisor.vangogh.bridge.storage;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.imsdk.BaseConstants;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.datavisorobfus.h0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5421h0 {

    /* JADX INFO: renamed from: d */
    private static C5421h0 f7257d;

    /* JADX INFO: renamed from: a */
    private Context f7258a;

    /* JADX INFO: renamed from: b */
    private LocalServerSocket f7259b = null;

    /* JADX INFO: renamed from: c */
    private long f7260c;

    /* JADX INFO: renamed from: a */
    public static C5421h0 m7148a(Context context) {
        if (f7257d == null) {
            synchronized (C5421h0.class) {
                try {
                    if (f7257d == null) {
                        f7257d = new C5421h0(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7257d;
    }

    /* JADX INFO: renamed from: a */
    public String m7153a(boolean z11) {
        JSONObject jSONObjectM7145a = C5417g.m7143a(this.f7258a).m7145a(crypto.convert("NpGOzHY="));
        if (jSONObjectM7145a == null) {
            return "empty";
        }
        this.f7260c = 0L;
        try {
            JSONArray jSONArray = jSONObjectM7145a.getJSONArray(crypto.convert("K5WZ"));
            if (jSONArray != null && jSONArray.length() > 0) {
                m7150a(jSONArray);
                m7151a(jSONArray, z11);
            }
        } catch (Throwable unused) {
        }
        m7149a();
        m7152b();
        return String.valueOf(this.f7260c);
    }

    /* JADX INFO: renamed from: c */
    public String m7154c() {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                C5415f0.m7136a("isFatherDirectoryReadableEx SDK version too low");
                return "not_supported";
            }
            String str = this.f7258a.getApplicationInfo().dataDir + File.separator + "DV_temp";
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            try {
                FileDescriptor fd2 = fileOutputStream.getFD();
                Field declaredField = fd2.getClass().getDeclaredField("descriptor");
                declaredField.setAccessible(true);
                Integer num = (Integer) declaredField.get(fd2);
                num.intValue();
                String string = Files.readSymbolicLink(Paths.get(String.format("/proc/self/fd/%d", num), new String[0])).toString();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(str);
                jSONArray.put(string);
                String string2 = jSONArray.toString();
                fileOutputStream.close();
                return string2;
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            C5415f0.m7139a(th4);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: d */
    public String m7155d() {
        try {
            String str = this.f7258a.getApplicationInfo().dataDir;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(File.separator);
            sb2.append("..");
            return new File(sb2.toString()).canRead() ? String.valueOf(1) : String.valueOf(0);
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    private C5421h0(Context context) {
        this.f7258a = null;
        this.f7260c = 0L;
        if (context != null) {
            this.f7258a = context;
            this.f7260c = 0L;
            return;
        }
        throw new IllegalArgumentException("MultiOpenDetect initialization error: mContext is null.");
    }

    /* JADX INFO: renamed from: a */
    private void m7149a() {
        try {
            if (this.f7259b != null) {
                return;
            }
            try {
                String strM7105f = C5399a.m7098a().m7105f(this.f7258a);
                String str = "";
                if (strM7105f == null) {
                    strM7105f = "";
                }
                String strM7106g = C5399a.m7098a().m7106g(this.f7258a);
                if (strM7106g != null) {
                    str = strM7106g;
                }
                this.f7259b = new LocalServerSocket(C5422i.m7160b().m7162a() + strM7105f + str);
            } catch (IOException e11) {
                String message = e11.getMessage();
                if (C5457z0.m7482b(message) && message.equals("Address already in use")) {
                    this.f7260c |= 8;
                }
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m7152b() {
        int i11;
        try {
            Map<String, Integer> mapM7394a = C5444t.m7394a();
            if (mapM7394a != null) {
                Integer num = mapM7394a.get("userid");
                num.intValue();
                String str = String.format(Locale.getDefault(), "u%d_a%d", num, Integer.valueOf(mapM7394a.get(AppsFlyerProperties.APP_ID).intValue() + BaseConstants.ERR_SVR_SSO_VCODE));
                if (!TextUtils.isEmpty(str)) {
                    String strM7393a = C5444t.m7393a("ps -e");
                    if (!TextUtils.isEmpty(strM7393a)) {
                        String[] strArrSplit = strM7393a.split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                        if (strArrSplit.length > 0) {
                            int i12 = 0;
                            for (int i13 = 0; i13 < strArrSplit.length; i13++) {
                                if (strArrSplit[i13].contains(str)) {
                                    int iLastIndexOf = strArrSplit[i13].lastIndexOf(C33627eb.f69716f);
                                    String str2 = strArrSplit[i13];
                                    if (iLastIndexOf <= 0) {
                                        i11 = 0;
                                    } else {
                                        i11 = iLastIndexOf + 1;
                                    }
                                    if (new File(String.format(Locale.getDefault(), "/data/user/%d/%s", num, str2.substring(i11, str2.length()))).exists()) {
                                        i12++;
                                    }
                                }
                            }
                            if (i12 > 1) {
                                this.f7260c |= 16;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7150a(JSONArray jSONArray) {
        try {
            String path = this.f7258a.getFilesDir().getPath();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                if (path.toLowerCase().contains(jSONArray.getString(i11).toLowerCase())) {
                    this.f7260c |= 1;
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m7151a(JSONArray jSONArray, boolean z11) {
        String strGlobalGet = storage.globalGet(crypto.convert(z11 ? "H6ik7UfoqtAwYIZxE9A68jVW8J/oAjw=" : "H6ih/XXMmPAdX5dBI+oF8QZ9zqL6"), 0);
        if (C5457z0.m7480a(strGlobalGet)) {
            return;
        }
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                if (strGlobalGet.contains(jSONArray.getString(i11).toLowerCase())) {
                    this.f7260c |= 2;
                    return;
                }
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
                return;
            }
        }
    }
}
