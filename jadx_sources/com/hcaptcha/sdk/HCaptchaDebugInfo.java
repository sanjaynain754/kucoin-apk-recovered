package com.hcaptcha.sdk;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.fasterxml.jackson.databind.ObjectMapper;
import dalvik.system.DexFile;
import edu.umd.cs.findbugs.annotations.Nullable;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import lombok.NonNull;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes56.dex */
final class HCaptchaDebugInfo implements Serializable {
    public static final String JS_INTERFACE_TAG = "JSDI";

    /* JADX INFO: renamed from: c */
    public static String f12856c = "[]";

    /* JADX INFO: renamed from: d */
    public static String f12857d;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final transient WeakReference<Context> f12858b;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaDebugInfo(@NonNull WeakReference<Context> weakReference) {
        if (weakReference == null) {
            throw new NullPointerException("contextRef is marked non-null but is null");
        }
        this.f12858b = weakReference;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(@Nullable Object obj) {
        return obj == this || (obj instanceof HCaptchaDebugInfo);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        return 1;
    }

    public HCaptchaDebugInfo(@NonNull Context context) {
        if (context == null) {
            throw new NullPointerException("context is marked non-null but is null");
        }
        this.f12858b = new WeakReference<>(context);
    }

    public List<String> debugInfo(String str, String str2) throws NoSuchAlgorithmException, IOException {
        ArrayList arrayList = new ArrayList(8);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
        MessageDigest messageDigest3 = MessageDigest.getInstance("MD5");
        DexFile dexFile = new DexFile(str2);
        try {
            Enumeration<String> enumerationEntries = dexFile.entries();
            int i11 = 0;
            while (enumerationEntries.hasMoreElements()) {
                String strNextElement = enumerationEntries.nextElement();
                if (strNextElement.startsWith("com.google.android.") || strNextElement.startsWith("android.")) {
                    messageDigest.update(strNextElement.getBytes("UTF-8"));
                } else if (strNextElement.startsWith(str)) {
                    messageDigest2.update(strNextElement.getBytes("UTF-8"));
                } else {
                    messageDigest3.update(strNextElement.getBytes("UTF-8"));
                }
                i11++;
                if (i11 > 512) {
                    break;
                }
            }
            dexFile.close();
            arrayList.add("sys_".concat(String.format("%032x", new BigInteger(1, messageDigest.digest()))));
            arrayList.add("deps_".concat(String.format("%032x", new BigInteger(1, messageDigest3.digest()))));
            arrayList.add("app_".concat(String.format("%032x", new BigInteger(1, messageDigest2.digest()))));
            arrayList.add("aver_" + Build.VERSION.RELEASE);
            arrayList.add("sdk_" + "4.4.0_56".replace('.', '_'));
            return arrayList;
        } catch (Throwable th2) {
            dexFile.close();
            throw th2;
        }
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public WeakReference<Context> getContextRef() {
        return this.f12858b;
    }

    @JavascriptInterface
    public String getDebugInfo() {
        String str = f12856c;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            try {
                String str2 = f12856c;
                if (str2 != null) {
                    return str2;
                }
                Context context = this.f12858b.get();
                if (context == null) {
                    Log.w(JS_INTERFACE_TAG, "Context is null, cannot build debugInfo");
                    return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                }
                try {
                    String strWriteValueAsString = new ObjectMapper().writeValueAsString(debugInfo(context.getPackageName(), context.getPackageCodePath()));
                    f12856c = strWriteValueAsString;
                    return strWriteValueAsString;
                } catch (IOException | NoSuchAlgorithmException unused) {
                    Log.d(JS_INTERFACE_TAG, "Cannot build debugInfo");
                    return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @JavascriptInterface
    public String getSysDebug() {
        String str = f12857d;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            String str2 = f12857d;
            if (str2 != null) {
                return str2;
            }
            try {
                String strWriteValueAsString = new ObjectMapper().writeValueAsString(roBuildProps());
                f12857d = strWriteValueAsString;
                return strWriteValueAsString;
            } catch (IOException unused) {
                Log.d(JS_INTERFACE_TAG, "Cannot build sysDebug");
                return "{}";
            }
        }
    }

    public Map<String, String> roBuildProps() {
        HashMap map = new HashMap();
        Process processStart = null;
        try {
            processStart = new ProcessBuilder("/system/bin/getprop").start();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream(), "UTF-8"));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        processStart.destroy();
                        return map;
                    }
                    if (line.endsWith("]")) {
                        sb2.replace(0, sb2.length() == 0 ? 0 : sb2.length() - 1, line);
                        String[] strArrSplit = sb2.toString().split("]: \\[");
                        String strSubstring = strArrSplit[0].substring(1);
                        if (strSubstring.startsWith("ro")) {
                            String str = strArrSplit[1];
                            map.put(strSubstring, str.substring(0, str.length() - 2));
                        }
                    } else {
                        sb2.append(line);
                    }
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (processStart != null) {
                processStart.destroy();
            }
            throw th4;
        }
    }

    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "HCaptchaDebugInfo(contextRef=" + getContextRef() + ")";
    }
}
