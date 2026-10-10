package com.forter.mobile.fortersdk;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.WallpaperManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.Settings;
import android.system.Os;
import android.system.StructUtsname;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.Display;
import android.view.InputDevice;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.a3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6506a3 {

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.a3$a */
    public class a implements FileFilter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pattern f10801a;

        public a(Pattern pattern) {
            this.f10801a = pattern;
        }

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return file != null && this.f10801a.matcher(file.getName()).matches();
        }
    }

    /* JADX INFO: renamed from: E */
    public static int m12077E() {
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new a(Pattern.compile("cpu[0-9]+")));
            if (fileArrListFiles != null) {
                return fileArrListFiles.length;
            }
            return 1;
        } catch (Throwable unused) {
            return 1;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: W */
    public static JSONArray m12095W(@NonNull Context context) {
        Boolean boolValueOf;
        JSONArray jSONArray = new JSONArray();
        try {
            InputManager inputManager = (InputManager) context.getSystemService("input");
            for (int i11 : inputManager.getInputDeviceIds()) {
                InputDevice inputDevice = inputManager.getInputDevice(i11);
                if (inputDevice != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", inputDevice.getName());
                    jSONObject.put("descriptor", inputDevice.getDescriptor());
                    if (Build.VERSION.SDK_INT >= 29) {
                        boolValueOf = Boolean.valueOf(inputDevice.isExternal());
                    } else {
                        boolValueOf = null;
                        try {
                            Method declaredMethod = InputDevice.class.getDeclaredMethod("isExternal", new Class[0]);
                            declaredMethod.setAccessible(true);
                            Object objInvoke = declaredMethod.invoke(inputDevice, new Object[0]);
                            if (objInvoke instanceof Boolean) {
                                boolValueOf = (Boolean) objInvoke;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (boolValueOf != null) {
                        jSONObject.put(FirebaseAnalytics.Param.LOCATION, boolValueOf.booleanValue() ? "external" : "built-in");
                    }
                    jSONObject.put("sources", inputDevice.getSources());
                    jSONArray.put(jSONObject);
                }
            }
        } catch (Throwable unused2) {
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: b0 */
    public static Boolean m12102b0(@NonNull Context context) {
        try {
            return (Boolean) Class.forName("io.fabric.sdk.android.services.common.CommonUtils").getMethod("isRooted", Context.class).invoke(null, context);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m12106d0(@NonNull Context context) {
        try {
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (keyguardManager != null) {
                return keyguardManager.isDeviceSecure();
            }
            return keyguardManager != null && keyguardManager.isKeyguardSecure();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m12125s(@Nullable ClassLoader classLoader) {
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), File.pathSeparator);
            while (stringTokenizer.hasMoreTokens()) {
                if ("/system/framework/XposedBridge.jar".equals(stringTokenizer.nextToken())) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        if (classLoader != null) {
            try {
                classLoader.loadClass("de.robv.android.xposed.XposedBridge");
                return true;
            } catch (ClassNotFoundException unused2) {
            }
        }
        try {
            Class.forName("de.robv.android.xposed.XposedHelpers");
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m12131y(@Nullable ClassLoader classLoader) {
        if (classLoader != null) {
            try {
                classLoader.loadClass("com.saurik.substrate.SubstrateClassLoader");
                return true;
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Class.forName("com.saurik.substrate.MS");
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: A */
    public static String m12073A() {
        PackageInfo currentWebViewPackage;
        try {
            return (Build.VERSION.SDK_INT < 26 || (currentWebViewPackage = WebView.getCurrentWebViewPackage()) == null) ? "UNKNOWN" : currentWebViewPackage.packageName;
        } catch (Throwable unused) {
            return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: D */
    public static boolean m12076D(String str) {
        return str == null || str.length() <= 0 || "unknown".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: F */
    public static long m12078F(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                String[] strArrSplit = new RandomAccessFile("/proc/meminfo", "r").readLine().split(" kB")[0].split(C33627eb.f69716f);
                return ((long) Integer.parseInt(strArrSplit[strArrSplit.length - 1])) * 1024;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        } catch (Exception unused) {
            return -2L;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public static DisplayMetrics m12081I(@NonNull Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService(InterfaceC33953u5.f72199F);
            if (windowManager == null) {
                return null;
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: J */
    public static JSONArray m12082J() {
        String str;
        String name;
        JSONArray jSONArray = new JSONArray();
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
            if (keyStore != null) {
                keyStore.load(null, null);
                Enumeration<String> enumerationAliases = keyStore.aliases();
                if (enumerationAliases != null) {
                    while (enumerationAliases.hasMoreElements()) {
                        String strNextElement = enumerationAliases.nextElement();
                        if (strNextElement != null) {
                            try {
                                if (keyStore.isCertificateEntry(strNextElement) && strNextElement.startsWith("user:")) {
                                    Certificate certificate = keyStore.getCertificate(strNextElement);
                                    JSONObject jSONObject = new JSONObject();
                                    if (certificate instanceof X509Certificate) {
                                        String str2 = "n/a";
                                        Principal issuerDN = ((X509Certificate) certificate).getIssuerDN();
                                        if (issuerDN != null && (name = issuerDN.getName()) != null) {
                                            str2 = name;
                                        }
                                        jSONObject.put("issuer", str2);
                                        JSONArray jSONArray2 = new JSONArray();
                                        boolean[] keyUsage = ((X509Certificate) certificate).getKeyUsage();
                                        for (int i11 = 0; i11 < keyUsage.length; i11++) {
                                            if (keyUsage[i11]) {
                                                switch (i11) {
                                                    case 0:
                                                        str = "digitalSignature";
                                                        break;
                                                    case 1:
                                                        str = "nonRepudiation";
                                                        break;
                                                    case 2:
                                                        str = "keyEncipherment";
                                                        break;
                                                    case 3:
                                                        str = "dataEncipherment";
                                                        break;
                                                    case 4:
                                                        str = "keyAgreement";
                                                        break;
                                                    case 5:
                                                        str = "keyCertSign";
                                                        break;
                                                    case 6:
                                                        str = "cRLSign";
                                                        break;
                                                    case 7:
                                                        str = "encipherOnly";
                                                        break;
                                                    case 8:
                                                        str = "decipherOnly";
                                                        break;
                                                    default:
                                                        str = null;
                                                        break;
                                                }
                                                jSONArray2.put(str);
                                            }
                                        }
                                        jSONObject.put("usages", jSONArray2);
                                    }
                                    Date creationDate = keyStore.getCreationDate(strNextElement);
                                    if (creationDate != null) {
                                        jSONObject.put("creationDate", creationDate.getTime());
                                    }
                                    jSONArray.put(jSONObject);
                                }
                            } catch (KeyStoreException unused) {
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return jSONArray;
    }

    @Nullable
    @RequiresApi(api = 17)
    /* JADX INFO: renamed from: K */
    public static DisplayMetrics m12083K(@NonNull Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService(InterfaceC33953u5.f72199F);
            if (windowManager == null) {
                return null;
            }
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c8 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:3:0x0007, B:6:0x0011, B:9:0x0020, B:11:0x002b, B:12:0x0031, B:14:0x0037, B:16:0x0041, B:17:0x0044, B:19:0x0048, B:21:0x0050, B:23:0x0057, B:49:0x00b8, B:52:0x00bf, B:53:0x00c2, B:55:0x00c8), top: B:61:0x0007 }] */
    @Nullable
    /* JADX INFO: renamed from: L */
    public static JSONObject m12084L() {
        HashSet hashSet;
        JSONObject jSONObject = new JSONObject();
        try {
            C6545h[] c6545hArrM12165b = AbstractC6515b0.m12165b("cpuInfo");
            BufferedReader bufferedReader = null;
            if (c6545hArrM12165b == null) {
                return null;
            }
            JSONObject jSONObjectM12174h = AbstractC6518b3.m12174h(c6545hArrM12165b, "struct");
            if (!AbstractC6539f3.m12286t(jSONObjectM12174h)) {
                JSONArray jSONArrayOptJSONArray = jSONObjectM12174h.optJSONArray("keys");
                if (AbstractC6539f3.m12285s(jSONArrayOptJSONArray)) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i11);
                        if (!TextUtils.isEmpty(strOptString)) {
                            hashSet.add(strOptString);
                        }
                    }
                }
                boolean zOptBoolean = jSONObjectM12174h.optBoolean("getAllKeys");
                HashSet hashSet2 = zOptBoolean ? new HashSet() : null;
                if (!AbstractC6539f3.m12283q(hashSet) || zOptBoolean) {
                    try {
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/cpuinfo"));
                            try {
                                Pattern patternCompile = Pattern.compile("\\t*:\\s*");
                                while (true) {
                                    String line = bufferedReader2.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    if (line.contains(C33844oi.f71346o)) {
                                        String[] strArrSplit = patternCompile.split(line, 2);
                                        if (strArrSplit.length > 0) {
                                            String strM12258E = AbstractC6539f3.m12258E(strArrSplit[0]);
                                            if (TextUtils.isEmpty(strM12258E)) {
                                                continue;
                                            } else {
                                                if (hashSet2 != null) {
                                                    hashSet2.add(strM12258E);
                                                }
                                                if (hashSet != null && hashSet.contains(strM12258E)) {
                                                    try {
                                                        jSONObject.put(strM12258E, strArrSplit.length > 1 ? strArrSplit[1] : "N/A");
                                                        hashSet.remove(strM12258E);
                                                        if (!zOptBoolean && hashSet.size() <= 0) {
                                                            break;
                                                        }
                                                    } catch (JSONException unused) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                                bufferedReader2.close();
                            } catch (Throwable unused2) {
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                } else if (!AbstractC6539f3.m12283q(hashSet2)) {
                                    jSONObject.put("keys", TextUtils.join(",", hashSet2));
                                }
                                return jSONObject;
                            }
                        } catch (IOException unused3) {
                        }
                    } catch (Throwable unused4) {
                    }
                    if (!AbstractC6539f3.m12283q(hashSet2)) {
                        jSONObject.put("keys", TextUtils.join(",", hashSet2));
                    }
                }
            }
        } catch (Throwable unused5) {
        }
        return jSONObject;
    }

    @NonNull
    /* JADX INFO: renamed from: M */
    public static JSONArray m12085M(@NonNull Context context) {
        JSONArray jSONArray = new JSONArray();
        try {
            if (m12115i(context, "android.permission.GET_ACCOUNTS") == 0) {
                for (Account account : AccountManager.get(context).getAccounts()) {
                    jSONArray.put(account.type);
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: N */
    public static JSONObject m12086N() {
        String property;
        JSONObject jSONObject = new JSONObject();
        try {
            StructUtsname structUtsnameUname = Os.uname();
            if (structUtsnameUname != null) {
                String str = structUtsnameUname.machine;
                String str2 = structUtsnameUname.release;
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    m12124r(jSONObject, str, str2);
                    return jSONObject;
                }
            }
            String property2 = null;
            try {
                property = System.getProperty("os.arch");
            } catch (SecurityException unused) {
                property = null;
            }
            try {
                property2 = System.getProperty("os.version");
            } catch (SecurityException unused2) {
            }
            m12124r(jSONObject, property, property2);
        } catch (Throwable unused3) {
        }
        return jSONObject;
    }

    @NonNull
    /* JADX INFO: renamed from: O */
    public static JSONArray m12087O(Context context) {
        String str;
        JSONArray jSONArray = new JSONArray();
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                FeatureInfo[] systemAvailableFeatures = packageManager.getSystemAvailableFeatures();
                if (!AbstractC6539f3.m12287u(systemAvailableFeatures)) {
                    for (FeatureInfo featureInfo : systemAvailableFeatures) {
                        if (featureInfo == null) {
                            str = "null";
                        } else {
                            String str2 = featureInfo.name;
                            if (str2 == null) {
                                str = String.format(Locale.ENGLISH, "reqGlEsVersion=%s", Integer.toHexString(featureInfo.reqGlEsVersion));
                            } else if (!str2.startsWith("android.hardware") && !str2.startsWith("android.software")) {
                                jSONArray.put(str2);
                            }
                        }
                        jSONArray.put(str);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x00fc A[Catch: all -> 0x0104, TryCatch #1 {all -> 0x0104, blocks: (B:62:0x00f4, B:64:0x00fc, B:66:0x0101, B:52:0x00db, B:54:0x00e3, B:56:0x00e8), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0101 A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #1 {all -> 0x0104, blocks: (B:62:0x00f4, B:64:0x00fc, B:66:0x0101, B:52:0x00db, B:54:0x00e3, B:56:0x00e8), top: B:71:0x0009 }] */
    @NonNull
    /* JADX INFO: renamed from: P */
    public static JSONObject m12088P() {
        EGL10 egl10;
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        EGLDisplay eGLDisplayEglGetDisplay;
        int i11;
        EGLConfig eGLConfig;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLContext eGLContextEglCreateContext;
        EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                egl10 = (EGL10) EGLContext.getEGL();
                if (egl10 != null) {
                    try {
                        eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                        if (eGLDisplayEglGetDisplay != null) {
                            try {
                                if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY || !egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                                    eGLSurfaceEglCreatePbufferSurface = null;
                                    eGLContextEglCreateContext = null;
                                } else {
                                    int[] iArr = {12352, 4, 12344};
                                    int[] iArr2 = new int[1];
                                    if (!egl10.eglChooseConfig(eGLDisplayEglGetDisplay, iArr, null, 0, iArr2) || (i11 = iArr2[0]) <= 0) {
                                        eGLSurfaceEglCreatePbufferSurface = null;
                                        eGLContextEglCreateContext = null;
                                    } else {
                                        EGLConfig[] eGLConfigArr = new EGLConfig[i11];
                                        if (egl10.eglChooseConfig(eGLDisplayEglGetDisplay, iArr, eGLConfigArr, i11, iArr2)) {
                                            int[] iArr3 = new int[1];
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 >= i11) {
                                                    eGLConfig = null;
                                                    break;
                                                }
                                                eGLConfig = eGLConfigArr[i12];
                                                if (eGLConfig != null) {
                                                    egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfig, 12327, iArr3);
                                                    if (iArr3[0] != 12368) {
                                                        egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfig, 12339, iArr3);
                                                        if ((iArr3[0] & 1) != 0) {
                                                            break;
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                i12++;
                                            }
                                            if (eGLConfig != null) {
                                                eGLSurfaceEglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344});
                                                if (eGLSurfaceEglCreatePbufferSurface != null && eGLSurfaceEglCreatePbufferSurface != eGLSurface2) {
                                                    try {
                                                        eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, eGLContext2, new int[]{12440, 2, 12344});
                                                        if (eGLContextEglCreateContext != null && eGLContextEglCreateContext != eGLContext2) {
                                                            try {
                                                                if (egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                                                                    GL10 gl10 = (GL10) eGLContextEglCreateContext.getGL();
                                                                    jSONObject.put("version", gl10.glGetString(7938));
                                                                    jSONObject.put("vendor", gl10.glGetString(7936));
                                                                    jSONObject.put("renderer", gl10.glGetString(7937));
                                                                }
                                                            } catch (Throwable unused) {
                                                                eGLSurface = eGLSurfaceEglCreatePbufferSurface;
                                                                egl10 = egl10;
                                                                eGLContext = eGLContextEglCreateContext;
                                                                if (egl10 != null) {
                                                                    if (eGLSurface != null) {
                                                                        egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, eGLContext2);
                                                                        egl10.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurface);
                                                                    }
                                                                    if (eGLContext != null) {
                                                                        egl10.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContext);
                                                                    }
                                                                    if (eGLDisplayEglGetDisplay != null) {
                                                                        egl10.eglTerminate(eGLDisplayEglGetDisplay);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable unused2) {
                                                        eGLSurface = eGLSurfaceEglCreatePbufferSurface;
                                                        eGLContext = null;
                                                        if (egl10 != null) {
                                                            if (eGLSurface != null && eGLSurface != eGLSurface2) {
                                                                egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, eGLContext2);
                                                                egl10.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurface);
                                                            }
                                                            if (eGLContext != null) {
                                                                egl10.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContext);
                                                            }
                                                            if (eGLDisplayEglGetDisplay != null) {
                                                                egl10.eglTerminate(eGLDisplayEglGetDisplay);
                                                            }
                                                        }
                                                        return jSONObject;
                                                    }
                                                }
                                            } else {
                                                eGLSurfaceEglCreatePbufferSurface = null;
                                            }
                                            eGLContextEglCreateContext = null;
                                        } else {
                                            eGLSurfaceEglCreatePbufferSurface = null;
                                            eGLContextEglCreateContext = null;
                                        }
                                    }
                                }
                            } catch (Throwable unused3) {
                                eGLSurface = null;
                            }
                        } else {
                            eGLSurfaceEglCreatePbufferSurface = null;
                            eGLContextEglCreateContext = null;
                        }
                    } catch (Throwable unused4) {
                        egl10 = egl10;
                        eGLSurface = null;
                        eGLContext = null;
                        eGLDisplayEglGetDisplay = null;
                        if (egl10 != null) {
                            if (eGLSurface != null) {
                                egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, eGLContext2);
                                egl10.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurface);
                            }
                            if (eGLContext != null) {
                                egl10.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContext);
                            }
                            if (eGLDisplayEglGetDisplay != null) {
                                egl10.eglTerminate(eGLDisplayEglGetDisplay);
                            }
                        }
                        return jSONObject;
                    }
                } else {
                    eGLSurfaceEglCreatePbufferSurface = null;
                    eGLContextEglCreateContext = null;
                    eGLDisplayEglGetDisplay = null;
                }
                if (egl10 != null) {
                    if (eGLSurfaceEglCreatePbufferSurface != null && eGLSurfaceEglCreatePbufferSurface != eGLSurface2) {
                        egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, eGLContext2);
                        egl10.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                    }
                    if (eGLContextEglCreateContext != null) {
                        egl10.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                    }
                    if (eGLDisplayEglGetDisplay != null) {
                        egl10.eglTerminate(eGLDisplayEglGetDisplay);
                        return jSONObject;
                    }
                }
            } catch (Throwable unused5) {
            }
        } catch (Throwable unused6) {
            egl10 = null;
        }
        return jSONObject;
    }

    @NonNull
    /* JADX INFO: renamed from: Q */
    public static String m12089Q(Context context) {
        Boolean bool;
        try {
            String str = Build.MANUFACTURER;
            String str2 = Build.BRAND;
            if (m12076D(str)) {
                if (m12076D(str2)) {
                    return "FAILURE";
                }
                str = null;
            } else if (str.equalsIgnoreCase(str2)) {
                str2 = null;
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return "FAILURE";
            }
            FeatureInfo[] systemAvailableFeatures = packageManager.getSystemAvailableFeatures();
            if (!AbstractC6539f3.m12287u(systemAvailableFeatures)) {
                for (FeatureInfo featureInfo : systemAvailableFeatures) {
                    String str3 = featureInfo.name;
                    if (str3 != null && !str3.startsWith("android.hardware") && !str3.startsWith("android.software")) {
                        String[] strArrSplit = str3.split("\\.");
                        int length = strArrSplit.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                String str4 = strArrSplit[i11];
                                if ((str == null || !str.equalsIgnoreCase(str4)) && (str2 == null || !str2.equalsIgnoreCase(str4))) {
                                    i11++;
                                } else {
                                    bool = Boolean.TRUE;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                return Boolean.FALSE.toString();
            }
            bool = Boolean.FALSE;
            return bool.toString();
        } catch (Exception unused) {
            return "FAILURE";
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX INFO: renamed from: R */
    public static JSONArray m12090R() {
        ClassLoader systemClassLoader;
        boolean zM12131y;
        boolean zM12125s;
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            systemClassLoader = ClassLoader.getSystemClassLoader();
        } catch (Throwable unused) {
            systemClassLoader = null;
        }
        boolean z11 = false;
        try {
            zM12125s = m12125s(systemClassLoader);
            try {
                zM12131y = m12131y(systemClassLoader);
                try {
                    if (!zM12125s || !zM12131y) {
                        try {
                            throw new Exception("ftr");
                        } catch (Exception e11) {
                            int i11 = 0;
                            for (StackTraceElement stackTraceElement : e11.getStackTrace()) {
                                String className = stackTraceElement.getClassName();
                                if ("de.robv.android.xposed.XposedBridge".equals(className)) {
                                    zM12125s = true;
                                    if (zM12131y) {
                                        break;
                                    }
                                } else {
                                    if ((className != null && className.startsWith("com.saurik.substrate")) || ("com.android.internal.os.ZygoteInit".equals(className) && (i11 = i11 + 1) == 2)) {
                                        zM12131y = true;
                                        if (zM12125s) {
                                            break;
                                        }
                                    }
                                }
                                if (zM12125s) {
                                    jSONArray.put("xposed");
                                }
                                if (zM12131y) {
                                    jSONArray.put("cydia");
                                }
                                return jSONArray;
                            }
                        }
                    }
                    if (!zM12125s || !zM12131y) {
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/self/maps"));
                            while (true) {
                                try {
                                    String line = bufferedReader2.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    if (line.endsWith("app_process32_xposed") || line.endsWith("app_process64_xposed") || line.endsWith("libxposed_art.so") || line.endsWith("libxposed_dalvik.so") || line.endsWith("XposedBridge.jar")) {
                                        zM12125s = true;
                                        if (zM12131y) {
                                            break;
                                        }
                                    } else if (line.endsWith("libsubstrate.so") || line.endsWith("libsubstrate-dvm.so") || line.endsWith("libDalvikLoader.cy.so") || line.endsWith("libAndroidLoader.so") || line.endsWith("libAndroidCydia.cy.so") || line.endsWith("libAndroidBootstrap0.so")) {
                                        zM12131y = true;
                                        if (zM12125s) {
                                            break;
                                        }
                                    }
                                } catch (Throwable unused2) {
                                    bufferedReader = bufferedReader2;
                                    z11 = zM12125s;
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    zM12125s = z11;
                                }
                            }
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused4) {
                            }
                        } catch (Throwable unused5) {
                        }
                    }
                } catch (Throwable unused6) {
                    z11 = zM12125s;
                    zM12125s = z11;
                    if (zM12125s) {
                        jSONArray.put("xposed");
                    }
                    if (zM12131y) {
                        jSONArray.put("cydia");
                    }
                    return jSONArray;
                }
            } catch (Throwable unused7) {
                zM12131y = false;
            }
        } catch (Throwable unused8) {
            zM12131y = false;
        }
        if (zM12125s) {
            jSONArray.put("xposed");
        }
        if (zM12131y) {
            jSONArray.put("cydia");
        }
        return jSONArray;
    }

    @NonNull
    /* JADX INFO: renamed from: S */
    public static JSONArray m12091S(@NonNull Context context) {
        String[] cameraIdList;
        JSONArray jSONArray = new JSONArray();
        try {
            try {
                CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
                if (cameraManager != null) {
                    try {
                        cameraIdList = cameraManager.getCameraIdList();
                    } catch (AssertionError e11) {
                        m12123q(e11, "Got AssertionErr while getting camera ID list");
                        cameraIdList = null;
                    }
                    if (cameraIdList != null) {
                        for (String str : cameraIdList) {
                            try {
                                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                                Size size = (Size) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
                                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                                float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
                                StringBuilder sb2 = new StringBuilder();
                                if (fArr != null && fArr.length > 0) {
                                    for (int i11 = 0; i11 < fArr.length; i11++) {
                                        sb2.append(fArr[i11]);
                                        if (i11 != fArr.length - 1) {
                                            sb2.append(",");
                                        }
                                    }
                                }
                                float[] fArr2 = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                                StringBuilder sb3 = new StringBuilder();
                                if (fArr2 != null && fArr2.length > 0) {
                                    for (int i12 = 0; i12 < fArr2.length; i12++) {
                                        sb3.append(fArr2[i12]);
                                        if (i12 != fArr2.length - 1) {
                                            sb3.append(",");
                                        }
                                    }
                                }
                                int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                                ColorSpaceTransform colorSpaceTransform = m12115i(context, "android.permission.CAMERA") == 0 ? (ColorSpaceTransform) cameraCharacteristics.get(CameraCharacteristics.SENSOR_CALIBRATION_TRANSFORM1) : null;
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("id", str);
                                jSONObject.put("caps", iArr != null ? iArr.length : 0);
                                jSONObject.put("lensFacing", num != null ? num.intValue() : -1);
                                jSONObject.put("resolution", size != null ? size.toString() : "FAILURE");
                                jSONObject.put("aperture", sb2.length() > 0 ? sb2.toString() : "FAILURE");
                                jSONObject.put("focal", sb3.length() > 0 ? sb3.toString() : "FAILURE");
                                jSONObject.put("transformation", colorSpaceTransform != null ? colorSpaceTransform.toString() : "FAILURE");
                                jSONArray.put(jSONObject);
                            } catch (JSONException | Exception unused) {
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
                AbstractC6524c3.m12215g();
            }
        } catch (AssertionError e12) {
            m12123q(e12, "Got AssertionErr while generating camera info");
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: T */
    public static JSONObject m12092T() {
        Map<String, String> map;
        JSONObject jSONObject = new JSONObject();
        C6545h[] c6545hArrM12165b = AbstractC6515b0.m12165b("sysEnviron");
        if (c6545hArrM12165b == null) {
            return null;
        }
        JSONArray jSONArrayM12175i = AbstractC6518b3.m12175i(c6545hArrM12165b, "keys");
        if (!AbstractC6539f3.m12285s(jSONArrayM12175i)) {
            try {
                map = System.getenv();
            } catch (SecurityException unused) {
                map = null;
            }
            for (int i11 = 0; i11 < jSONArrayM12175i.length(); i11++) {
                String strOptString = jSONArrayM12175i.optString(i11, null);
                if (!AbstractC6539f3.m12282p(strOptString)) {
                    try {
                        jSONObject.put(strOptString, AbstractC6539f3.m12260G(!AbstractC6539f3.m12284r(map) ? map.get(strOptString) : Os.getenv(strOptString)));
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        return jSONObject;
    }

    @NonNull
    /* JADX INFO: renamed from: V */
    public static JSONArray m12094V(@NonNull Context context) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (Sensor sensor : ((SensorManager) context.getSystemService("sensor")).getSensorList(-1)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", sensor.getName());
                jSONObject.put("vendor", sensor.getVendor());
                jSONObject.put("version", sensor.getVersion());
                jSONObject.put("type", sensor.getType());
                jSONObject.put("maxRange", sensor.getMaximumRange());
                jSONObject.put("resolution", sensor.getResolution());
                jSONObject.put("power", sensor.getPower());
                jSONObject.put("minDelay", sensor.getMinDelay());
                jSONArray.put(jSONObject);
            }
        } catch (Exception unused) {
            AbstractC6524c3.m12215g();
        }
        return jSONArray;
    }

    @NonNull
    @TargetApi(17)
    /* JADX INFO: renamed from: X */
    public static String m12096X(@NonNull Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (Build.VERSION.SDK_INT < 26) {
                return Settings.Secure.getString(contentResolver, "install_non_market_apps");
            }
        } catch (Exception unused) {
        }
        return "FAILURE";
    }

    @NonNull
    /* JADX INFO: renamed from: Y */
    public static JSONObject m12097Y(@NonNull Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            ContentResolver contentResolver = context.getContentResolver();
            jSONObject.put("default", m12117k(contentResolver, RingtoneManager.getActualDefaultRingtoneUri(context, 1)));
            jSONObject.put("notification", m12117k(contentResolver, RingtoneManager.getActualDefaultRingtoneUri(context, 2)));
            jSONObject.put(NotificationCompat.CATEGORY_ALARM, m12117k(contentResolver, RingtoneManager.getActualDefaultRingtoneUri(context, 4)));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @NonNull
    /* JADX INFO: renamed from: Z */
    public static JSONObject m12098Z(@NonNull Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(context);
            boolean z11 = true;
            int wallpaperId = wallpaperManager.getWallpaperId(1);
            int wallpaperId2 = wallpaperManager.getWallpaperId(2);
            jSONObject.put("sysId", wallpaperId);
            jSONObject.put("lockId", wallpaperId2);
            if (wallpaperManager.getWallpaperInfo() == null) {
                z11 = false;
            }
            jSONObject.put("isLive", z11);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @NonNull
    /* JADX INFO: renamed from: a0 */
    public static JSONObject m12100a0(@NonNull Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            C6571m0.m12427a(jSONObject, "isAMonkey", new C6635z.a() { // from class: com.forter.mobile.fortersdk.t2
                @Override // com.forter.mobile.fortersdk.C6635z.a
                /* JADX INFO: renamed from: a */
                public final Object mo12072a() {
                    return AbstractC6506a3.m12093U();
                }
            }, "FAILURE");
            int i11 = Build.VERSION.SDK_INT;
            final UserManager userManager = (UserManager) context.getSystemService("user");
            if (userManager != null) {
                if (i11 >= 25) {
                    C6571m0.m12427a(jSONObject, "isDemoUser", new C6635z.a() { // from class: com.forter.mobile.fortersdk.u2
                        @Override // com.forter.mobile.fortersdk.C6635z.a
                        /* JADX INFO: renamed from: a */
                        public final Object mo12072a() {
                            return AbstractC6506a3.m12080H(userManager);
                        }
                    }, "FAILURE");
                }
                C6571m0.m12427a(jSONObject, "isSystemUser", new C6635z.a() { // from class: com.forter.mobile.fortersdk.v2
                    @Override // com.forter.mobile.fortersdk.C6635z.a
                    /* JADX INFO: renamed from: a */
                    public final Object mo12072a() {
                        return AbstractC6506a3.m12075C(userManager);
                    }
                }, "FAILURE");
                if (i11 >= 30) {
                    C6571m0.m12427a(jSONObject, "isManagedProfile", new C6635z.a() { // from class: com.forter.mobile.fortersdk.w2
                        @Override // com.forter.mobile.fortersdk.C6635z.a
                        /* JADX INFO: renamed from: a */
                        public final Object mo12072a() {
                            return AbstractC6506a3.m12129w(userManager);
                        }
                    }, "FAILURE");
                }
                List<UserHandle> listM12121o = m12121o(userManager);
                JSONArray jSONArray = new JSONArray();
                for (final UserHandle userHandle : listM12121o) {
                    if (userHandle != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        C6571m0.m12427a(jSONObject2, "id", new C6635z.a() { // from class: com.forter.mobile.fortersdk.x2
                            @Override // com.forter.mobile.fortersdk.C6635z.a
                            /* JADX INFO: renamed from: a */
                            public final Object mo12072a() {
                                return AbstractC6506a3.m12079G(userManager, userHandle);
                            }
                        }, -1L);
                        int i12 = Build.VERSION.SDK_INT;
                        C6571m0.m12427a(jSONObject2, "creationTime", new C6635z.a() { // from class: com.forter.mobile.fortersdk.y2
                            @Override // com.forter.mobile.fortersdk.C6635z.a
                            /* JADX INFO: renamed from: a */
                            public final Object mo12072a() {
                                return AbstractC6506a3.m12132z(userManager, userHandle);
                            }
                        }, -1L);
                        C6571m0.m12427a(jSONObject2, "quiteMode", new C6635z.a() { // from class: com.forter.mobile.fortersdk.z2
                            @Override // com.forter.mobile.fortersdk.C6635z.a
                            /* JADX INFO: renamed from: a */
                            public final Object mo12072a() {
                                return AbstractC6506a3.m12130x(userManager, userHandle);
                            }
                        }, "FAILURE");
                        if (i12 >= 25) {
                            C6571m0.m12427a(jSONObject2, "isRunning", new C6635z.a() { // from class: com.forter.mobile.fortersdk.s2
                                @Override // com.forter.mobile.fortersdk.C6635z.a
                                /* JADX INFO: renamed from: a */
                                public final Object mo12072a() {
                                    return AbstractC6506a3.m12119m(userManager, userHandle);
                                }
                            }, "FAILURE");
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
                C6571m0.m12428b(jSONObject, "profiles", jSONArray);
                C6571m0.m12428b(jSONObject, "userCount", Integer.valueOf(listM12121o.size()));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @NonNull
    /* JADX INFO: renamed from: c0 */
    public static JSONArray m12104c0(@NonNull Context context) {
        int displayId;
        JSONArray jSONArray = new JSONArray();
        try {
            Display[] displayArrM12112g0 = m12112g0(context);
            if (!AbstractC6539f3.m12287u(displayArrM12112g0)) {
                HashMap map = null;
                for (Display display : displayArrM12112g0) {
                    if (display != null && (displayId = display.getDisplayId()) != 0) {
                        String name = display.getName();
                        if (TextUtils.isEmpty(name)) {
                            name = "unknown";
                        }
                        if (map == null) {
                            map = new HashMap();
                        }
                        C6550i c6550i = (C6550i) map.get(name);
                        if (c6550i == null) {
                            map.put(name, new C6550i(displayId));
                        } else {
                            c6550i.f10965a = displayId;
                            c6550i.f10966b++;
                        }
                    }
                }
                if (!AbstractC6539f3.m12284r(map)) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        C6550i c6550i2 = (C6550i) entry.getValue();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("id", c6550i2.f10965a);
                            jSONObject.put("name", str);
                            int i11 = c6550i2.f10966b;
                            if (i11 > 1) {
                                jSONObject.put("count", i11);
                            }
                            jSONArray.put(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return jSONArray;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX INFO: renamed from: e0 */
    public static JSONObject m12108e0(@NonNull Context context) {
        int i11;
        JSONObject jSONObject;
        int i12 = -1;
        Boolean boolValueOf = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
                int intExtra2 = intentRegisterReceiver.getIntExtra("scale", 0);
                int intExtra3 = intentRegisterReceiver.getIntExtra("plugged", -1);
                i11 = (intExtra == -1 || intExtra2 == 0) ? -1 : (int) ((((double) intExtra) / ((double) intExtra2)) * 100.0d);
                if (intExtra3 != -1) {
                    try {
                        boolValueOf = Boolean.valueOf(intExtra3 != 0);
                    } catch (Throwable unused) {
                        i12 = i11;
                        i11 = i12;
                    }
                }
                jSONObject = new JSONObject();
                C6571m0.m12428b(jSONObject, FirebaseAnalytics.Param.LEVEL, Integer.valueOf(i11));
                if (boolValueOf != null) {
                    C6571m0.m12428b(jSONObject, "isCharging", boolValueOf);
                }
                C6571m0.m12428b(jSONObject, "capacity", Long.valueOf(m12114h0(context)));
                return jSONObject;
            }
            int i13 = Build.VERSION.SDK_INT;
            BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
            int intProperty = batteryManager.getIntProperty(4);
            i12 = intProperty >= 0 ? intProperty : -1;
            if (i13 >= 26) {
                int intProperty2 = batteryManager.getIntProperty(6);
                if (intProperty2 == 2) {
                    boolValueOf = Boolean.TRUE;
                } else if (intProperty2 == 4) {
                    boolValueOf = Boolean.FALSE;
                }
            }
        } catch (Throwable unused2) {
        }
        i11 = i12;
        jSONObject = new JSONObject();
        C6571m0.m12428b(jSONObject, FirebaseAnalytics.Param.LEVEL, Integer.valueOf(i11));
        if (boolValueOf != null) {
            C6571m0.m12428b(jSONObject, "isCharging", boolValueOf);
        }
        C6571m0.m12428b(jSONObject, "capacity", Long.valueOf(m12114h0(context)));
        return jSONObject;
    }

    @NonNull
    /* JADX INFO: renamed from: f0 */
    public static SharedPreferences m12110f0(@NonNull Context context) {
        return context.getSharedPreferences("forter_sdk_prefs", 0);
    }

    @Nullable
    /* JADX INFO: renamed from: g0 */
    public static Display[] m12112g0(@NonNull Context context) {
        try {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return displayManager.getDisplays();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: h0 */
    public static long m12114h0(@NonNull Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
            Object objInvoke = cls.getMethod("getAveragePower", String.class).invoke(cls.getConstructor(Context.class).newInstance(context), "battery.capacity");
            if (objInvoke instanceof Double) {
                return (long) ((Double) objInvoke).doubleValue();
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: j */
    public static long m12116j(@NonNull String str) {
        try {
            StatFs statFs = new StatFs(str);
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (Exception unused) {
            return -2L;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public static String m12118l(@NonNull Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null) {
            return "FAILURE";
        }
        try {
            List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
            StringBuilder sb2 = new StringBuilder();
            Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
            while (it.hasNext()) {
                List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
                for (int i11 = 0; i11 < enabledInputMethodSubtypeList.size(); i11++) {
                    InputMethodSubtype inputMethodSubtype = enabledInputMethodSubtypeList.get(i11);
                    if (inputMethodSubtype.getMode().equals("keyboard")) {
                        String languageTag = inputMethodSubtype.getLanguageTag();
                        if (TextUtils.isEmpty(languageTag)) {
                            languageTag = inputMethodSubtype.getLocale();
                        }
                        sb2.append(languageTag);
                        if (i11 < enabledInputMethodSubtypeList.size() - 1) {
                            sb2.append(";");
                        }
                    }
                }
            }
            return sb2.toString();
        } catch (Exception unused) {
            return "FAILURE";
        }
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public static String m12120n(@Nullable DisplayMetrics displayMetrics) {
        if (displayMetrics == null) {
            return "FAILURE";
        }
        return displayMetrics.widthPixels + "," + displayMetrics.heightPixels;
    }

    @NonNull
    @SuppressLint({"NewApi", "HardwareIds"})
    /* JADX INFO: renamed from: p */
    public static JSONObject m12122p() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ID", Build.ID);
            try {
                jSONObject.put("VERSION_BASE_OS", Build.VERSION.BASE_OS);
                jSONObject.put("VERSION_PREVIEW_SDK_INT", Build.VERSION.PREVIEW_SDK_INT);
                jSONObject.put("VERSION_SECURITY_PATCH", Build.VERSION.SECURITY_PATCH);
            } catch (Throwable th2) {
                C6514b.m12151b().m12158f("OSUtils => Failed collecting API>22 params: ".concat(String.valueOf(th2)));
            }
            jSONObject.put("VERSION_CODENAME", Build.VERSION.CODENAME);
            jSONObject.put("VERSION_INCREMENTAL", Build.VERSION.INCREMENTAL);
            jSONObject.put("VERSION_RELEASE", Build.VERSION.RELEASE);
            jSONObject.put("VERSION_SDK_INT", Build.VERSION.SDK_INT);
            jSONObject.put("FIRST_SDK_INT", C6529d3.m12223b("ro.product.first_api_level", 0));
            jSONObject.put("BOARD", Build.BOARD);
            jSONObject.put("BRAND", Build.BRAND);
            jSONObject.put("BOOTLOADER", Build.BOOTLOADER);
            jSONObject.put("DEVICE", Build.DEVICE);
            jSONObject.put("DISPLAY", Build.DISPLAY);
            jSONObject.put("FINGERPRINT", Build.FINGERPRINT);
            jSONObject.put("HARDWARE", Build.HARDWARE);
            String str = Build.MANUFACTURER;
            jSONObject.put("MANUFACTURER", str);
            jSONObject.put("MODEL", Build.MODEL);
            jSONObject.put("PRODUCT", Build.PRODUCT);
            jSONObject.put("SERIAL", AbstractC6553i2.m12395y());
            jSONObject.put("TAGS", Build.TAGS);
            jSONObject.put(CredentialProviderBaseController.TYPE_TAG, Build.TYPE);
            jSONObject.put("TIME", Build.TIME);
            jSONObject.put("USER", Build.USER);
            jSONObject.put("HOST", Build.HOST);
            jSONObject.put("RADIO", Build.getRadioVersion());
            String[] strArr = Build.SUPPORTED_ABIS;
            jSONObject.put("CPU_ABI", strArr.length > 0 ? strArr[0] : "");
            if ("samsung".equals(str)) {
                jSONObject.put("SALES_CODE", C6529d3.m12225d("ril.sales_code", C6529d3.m12225d("ro.csc.sales_code", "unknown")));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: r */
    public static void m12124r(@NonNull JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put("architecture", AbstractC6539f3.m12260G(str));
            jSONObject.put("version", AbstractC6539f3.m12260G(str2));
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: t */
    public static long m12126t(@NonNull String str) {
        try {
            StatFs statFs = new StatFs(str);
            return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        } catch (Exception unused) {
            return -2L;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static String m12127u() {
        try {
            return System.getProperty("http.agent");
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public static String m12128v(@NonNull Context context) {
        try {
            try {
                TelephonyManager telephonyManagerM12330J = AbstractC6553i2.m12330J(context);
                return telephonyManagerM12330J == null ? "FAILURE" : Currency.getInstance(new Locale(telephonyManagerM12330J.getSimCountryIso().toUpperCase(Locale.ROOT))).getCurrencyCode();
            } catch (Exception unused) {
                return "FAILURE";
            }
        } catch (Exception unused2) {
            Locale locale = Locale.getDefault();
            return TextUtils.isEmpty(locale.getCountry()) ? "FAILURE" : Currency.getInstance(locale).getCurrencyCode();
        }
        return "FAILURE";
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public static String m12074B(@NonNull Context context) {
        File externalStorageDirectory;
        try {
            File[] obbDirs = context.getObbDirs();
            if (!AbstractC6539f3.m12287u(obbDirs)) {
                for (File file : obbDirs) {
                    if (file != null && !Environment.isExternalStorageEmulated(file)) {
                        return file.getPath();
                    }
                }
            }
            if (!Environment.isExternalStorageEmulated() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
                return externalStorageDirectory.getPath();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m12075C(UserManager userManager) throws Throwable {
        return String.valueOf(userManager.isSystemUser());
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Long m12079G(UserManager userManager, UserHandle userHandle) throws Throwable {
        return Long.valueOf(userManager.getSerialNumberForUser(userHandle));
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ String m12080H(UserManager userManager) throws Throwable {
        return String.valueOf(userManager.isDemoUser());
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ String m12093U() throws Throwable {
        return String.valueOf(ActivityManager.isUserAMonkey());
    }

    /* JADX INFO: renamed from: i */
    public static int m12115i(@NonNull Context context, @NonNull String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public static String m12117k(@NonNull ContentResolver contentResolver, @NonNull Uri uri) {
        String string = null;
        try {
            Cursor cursorQuery = contentResolver.query(uri, new String[]{"title"}, null, null, null);
            if (cursorQuery != null) {
                if (cursorQuery.moveToFirst()) {
                    string = cursorQuery.getString(0);
                }
                cursorQuery.close();
            }
        } catch (Exception unused) {
        }
        if (string != null) {
            return string;
        }
        return "FAILURE";
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m12119m(UserManager userManager, UserHandle userHandle) throws Throwable {
        return String.valueOf(userManager.isUserRunning(userHandle));
    }

    @NonNull
    @RequiresApi(api = 17)
    /* JADX INFO: renamed from: o */
    public static List<UserHandle> m12121o(@NonNull UserManager userManager) {
        List<UserHandle> userProfiles;
        try {
            userProfiles = userManager.getUserProfiles();
        } catch (Throwable unused) {
            AbstractC6524c3.m12212d();
            userProfiles = null;
        }
        if (AbstractC6539f3.m12283q(userProfiles)) {
            return Collections.singletonList(Process.myUserHandle());
        }
        return userProfiles;
    }

    /* JADX INFO: renamed from: q */
    public static void m12123q(AssertionError assertionError, String str) {
        AbstractC6524c3.m12212d();
        C6520c.m12182b().m12187e(str, assertionError.getMessage());
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m12129w(UserManager userManager) throws Throwable {
        return String.valueOf(userManager.isManagedProfile());
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m12130x(UserManager userManager, UserHandle userHandle) throws Throwable {
        return String.valueOf(userManager.isQuietModeEnabled(userHandle));
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Long m12132z(UserManager userManager, UserHandle userHandle) throws Throwable {
        return Long.valueOf(userManager.getUserCreationTime(userHandle));
    }
}
