package com.datavisorobfus;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.KeyguardManager;
import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaDrm;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.webkit.ProxyConfig;
import com.datavisor.vangogh.bridge.crypto;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.entity.OtcAd;
import com.tencent.bugly.proguard.C33872q4;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.imsdk.BaseConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.datavisorobfus.r */
/* JADX INFO: loaded from: classes34.dex */
public class C5440r {

    /* JADX INFO: renamed from: d */
    private static C5440r f7355d = new C5440r();

    /* JADX INFO: renamed from: e */
    private static long f7356e = 0;

    /* JADX INFO: renamed from: f */
    public static String f7357f = C5420h.f7256a;

    /* JADX INFO: renamed from: a */
    private final Object f7358a = new Object();

    /* JADX INFO: renamed from: b */
    private final Object f7359b = new Object();

    /* JADX INFO: renamed from: c */
    private final Object f7360c = new Object();

    /* JADX INFO: renamed from: com.datavisorobfus.r$a */
    public class a implements Comparator<JSONArray> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(JSONArray jSONArray, JSONArray jSONArray2) {
            try {
                int i11 = jSONArray.getInt(2);
                int i12 = jSONArray2.getInt(2);
                if (i11 < i12) {
                    return 1;
                }
                return i11 == i12 ? 0 : -1;
            } catch (JSONException unused) {
                return 0;
            }
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.datavisorobfus.r$b */
    public class b implements FileFilter {
        public b() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            try {
                return Pattern.matches("cpu[0-9]", file.getName());
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.datavisorobfus.r$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f7363a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C5434o[] f7364b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String[] f7365c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Object f7366d;

        /* JADX INFO: renamed from: com.datavisorobfus.r$c$a */
        public class a implements C5434o.c {
            public a() {
            }

            @Override // com.datavisorobfus.C5434o.c
            /* JADX INFO: renamed from: a */
            public void mo7241a(String str) {
                c cVar = c.this;
                cVar.f7365c[0] = str;
                synchronized (cVar.f7366d) {
                    try {
                        c.this.f7366d.notifyAll();
                    } catch (Throwable th2) {
                        C5415f0.m7139a(th2);
                    }
                }
            }
        }

        public c(Context context, C5434o[] c5434oArr, String[] strArr, Object obj) {
            this.f7363a = context;
            this.f7364b = c5434oArr;
            this.f7365c = strArr;
            this.f7366d = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5440r.m7285k0(this.f7363a)) {
                this.f7364b[0] = new C5434o(this.f7363a, new a());
                return;
            }
            C5415f0.m7136a("WebView unavailable");
            this.f7364b[0] = null;
            this.f7365c[0] = "not_supported";
            synchronized (this.f7366d) {
                try {
                    this.f7366d.notifyAll();
                } catch (Throwable th2) {
                    C5415f0.m7139a(th2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.datavisorobfus.r$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C5434o[] f7369a;

        public d(C5434o[] c5434oArr) {
            this.f7369a = c5434oArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5434o c5434o;
            try {
                C5434o[] c5434oArr = this.f7369a;
                if (c5434oArr == null || (c5434o = c5434oArr[0]) == null) {
                    return;
                }
                c5434o.m7240a();
                this.f7369a[0] = null;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.datavisorobfus.r$e */
    public class e implements InterfaceC5403b0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String[] f7371a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean[] f7372b;

        public e(String[] strArr, boolean[] zArr) {
            this.f7371a = strArr;
            this.f7372b = zArr;
        }

        @Override // com.datavisorobfus.InterfaceC5403b0
        /* JADX INFO: renamed from: a */
        public void mo7113a(String str) {
            this.f7371a[0] = str;
            synchronized (C5440r.this.f7359b) {
                this.f7372b[0] = true;
                try {
                    C5440r.this.f7359b.notifyAll();
                } catch (Throwable th2) {
                    C5415f0.m7139a(th2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.datavisorobfus.r$f */
    public class f implements InterfaceC5403b0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String[] f7374a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean[] f7375b;

        public f(String[] strArr, boolean[] zArr) {
            this.f7374a = strArr;
            this.f7375b = zArr;
        }

        @Override // com.datavisorobfus.InterfaceC5403b0
        /* JADX INFO: renamed from: a */
        public void mo7113a(String str) {
            this.f7374a[0] = str;
            synchronized (C5440r.this.f7360c) {
                this.f7375b[0] = true;
                try {
                    C5440r.this.f7360c.notifyAll();
                } catch (Throwable th2) {
                    C5415f0.m7139a(th2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.datavisorobfus.r$g */
    public class g implements SensorEventListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float[] f7377a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CountDownLatch f7378b;

        public g(float[] fArr, CountDownLatch countDownLatch) {
            this.f7377a = fArr;
            this.f7378b = countDownLatch;
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            Sensor sensor;
            float[] fArr;
            if (sensorEvent == null || (sensor = sensorEvent.sensor) == null || sensor.getType() != 6 || (fArr = sensorEvent.values) == null || fArr.length <= 0) {
                return;
            }
            try {
                this.f7377a[0] = fArr[0];
                C5415f0.m7136a("pressureValue: " + this.f7377a[0]);
                this.f7378b.countDown();
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i11) {
        }
    }

    /* JADX INFO: renamed from: B */
    private String m7274B() {
        String str;
        try {
            new FileReader("/sys/block/mmcblk0/device/type");
            str = "/sys/block/mmcblk0/device/";
        } catch (Throwable unused) {
            str = null;
        }
        try {
            new FileReader("/sys/block/mmcblk1/device/type");
            str = "/sys/block/mmcblk1/device/";
        } catch (Throwable unused2) {
        }
        try {
            new FileReader("/sys/block/mmcblk2/device/type");
            return "/sys/block/mmcblk2/device/";
        } catch (Throwable unused3) {
            return str;
        }
    }

    /* JADX INFO: renamed from: c */
    private String m7281c() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                return null;
            }
            String address = defaultAdapter.isEnabled() ? defaultAdapter.getAddress() : null;
            if (address == null || address.endsWith("00:00:00:00:00")) {
                address = m7277a(defaultAdapter);
            }
            if (C5457z0.m7480a(address)) {
                return null;
            }
            return address;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    private Activity m7284j() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(objInvoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
            return null;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static C5440r m7286q() {
        return f7355d;
    }

    /* JADX INFO: renamed from: A */
    public String m7287A() {
        String strM7274B = m7274B();
        if (strM7274B == null) {
            return "empty";
        }
        try {
            return new BufferedReader(new FileReader(strM7274B + "serial")).readLine();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: C */
    public String m7290C() {
        try {
            String strM7403a = C5446u.m7403a(Build.BOARD + Build.BRAND + Build.CPU_ABI + Build.DEVICE + Build.DISPLAY + Build.HOST + Build.ID + Build.MANUFACTURER + Build.MODEL + Build.PRODUCT + Build.TAGS + Build.TYPE + Build.USER);
            return C5457z0.m7480a(strM7403a) ? "empty" : strM7403a;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: D */
    public String m7292D() {
        try {
            return SystemClock.elapsedRealtime() + "";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: E */
    public String m7294E() {
        try {
            return "" + (System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: F */
    public String m7296F() {
        try {
            String displayName = TimeZone.getDefault().getDisplayName(false, 0);
            return C5457z0.m7480a(displayName) ? "empty" : displayName;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: G */
    public String m7297G() {
        try {
            byte[] propertyByteArray = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L)).getPropertyByteArray("deviceUniqueId");
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : propertyByteArray) {
                sb2.append(String.format("%02x", Byte.valueOf(b11)));
            }
            return sb2.toString();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: O */
    public synchronized String m7306O(Context context) {
        String[] strArr;
        strArr = new String[]{"empty"};
        boolean[] zArr = {false};
        C5442s.m7391b(context, new e(strArr, zArr));
        synchronized (this.f7359b) {
            try {
                if (!zArr[0]) {
                    try {
                        this.f7359b.wait(50L);
                    } catch (Throwable th2) {
                        C5415f0.m7139a(th2);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C5415f0.m7136a("getOAID getOAID getOAID getOAID:       " + strArr[0]);
        return strArr[0];
    }

    /* JADX INFO: renamed from: P */
    public String m7307P(Context context) {
        String strValueOf;
        try {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager == null) {
                C5415f0.m7136a("Sensor service not available");
                return "not_supported";
            }
            Sensor defaultSensor = sensorManager.getDefaultSensor(6);
            if (defaultSensor == null) {
                C5415f0.m7136a("Pressure sensor not available");
                return "not_supported";
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            float[] fArr = {-1.0f};
            g gVar = new g(fArr, countDownLatch);
            try {
                try {
                    sensorManager.registerListener(gVar, defaultSensor, 3);
                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        strValueOf = String.valueOf(fArr[0]);
                    } else {
                        C5415f0.m7136a("pressureSensor overtime");
                        strValueOf = "empty";
                    }
                    sensorManager.unregisterListener(gVar);
                    return strValueOf;
                } finally {
                    sensorManager.unregisterListener(gVar);
                }
            } catch (Throwable unused) {
                C5415f0.m7136a("Interrupted while waiting for pressure data");
                return "exception";
            }
        } catch (Throwable th2) {
            C5415f0.m7138a("General Exception: ", th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: b */
    public int m7323b(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null || m7280b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return -1;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                return activeNetworkInfo.getType();
            }
        } catch (Throwable unused) {
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public String m7328d() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: e */
    public String m7331e() {
        return Build.CPU_ABI;
    }

    /* JADX INFO: renamed from: f */
    public String m7334f() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new b()).length + "";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: g */
    public String m7336g() {
        try {
            String strM7398e = C5444t.m7398e("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq");
            return C5457z0.m7480a(strM7398e) ? "empty" : strM7398e;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: h */
    public String m7339h() {
        try {
            String strM7395b = C5444t.m7395b("Processor");
            return C5457z0.m7480a(strM7395b) ? "empty" : strM7395b;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: i */
    public String m7342i() {
        try {
            String strM7395b = C5444t.m7395b("Hardware");
            return C5457z0.m7480a(strM7395b) ? "empty" : strM7395b;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m7346j0(Context context) {
        try {
            if (m7280b(context, "android.permission.ACCESS_NETWORK_STATE")) {
                C5415f0.m7137a(f7357f, "no ACCESS_NETWORK_STATE");
                return true;
            }
            if (context == null) {
                C5415f0.m7137a(f7357f, "context is null");
                return true;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: k */
    public String m7347k() {
        return Build.BRAND;
    }

    /* JADX INFO: renamed from: l */
    public String m7349l() {
        try {
            String strM7396c = C5444t.m7396c(crypto.convert("KZHQy23Vq8RBVph/BuAb"));
            return C5457z0.m7480a(strM7396c) ? "" : strM7396c;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: m */
    public String m7351m() {
        return Build.MANUFACTURER;
    }

    /* JADX INFO: renamed from: n */
    public String m7353n() {
        return Build.DEVICE;
    }

    /* JADX INFO: renamed from: o */
    public String m7355o() {
        return Build.HARDWARE;
    }

    /* JADX INFO: renamed from: p */
    public String m7357p() {
        try {
            String id2 = TimeZone.getDefault().getID();
            return C5457z0.m7480a(id2) ? "empty" : id2;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: r */
    public String m7360r() {
        try {
            String string = Locale.getDefault().toString();
            return C5457z0.m7480a(string) ? "empty" : string;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: s */
    public String m7362s() {
        try {
            return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: t */
    public String m7364t() {
        return "" + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: u */
    public String m7366u() {
        BufferedReader bufferedReader;
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader("/proc/meminfo");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader2, 8192);
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        try {
                            fileReader2.close();
                        } catch (Throwable unused) {
                        }
                        try {
                            bufferedReader2.close();
                        } catch (Throwable unused2) {
                        }
                        return "empty";
                    }
                    String str = "" + Long.valueOf(Long.parseLong(line.split("\\s+")[1]));
                    try {
                        fileReader2.close();
                    } catch (Throwable unused3) {
                    }
                    try {
                        bufferedReader2.close();
                    } catch (Throwable unused4) {
                    }
                    return str;
                } catch (Throwable th2) {
                    bufferedReader = bufferedReader2;
                    th = th2;
                    fileReader = fileReader2;
                    try {
                        C5415f0.m7139a(th);
                        return "exception";
                    } finally {
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (Throwable unused5) {
                            }
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused6) {
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: v */
    public String m7368v() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: w */
    public String m7370w() {
        try {
            return Process.myPid() + "";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: x */
    public String m7372x() {
        String strM7274B = m7274B();
        if (strM7274B == null) {
            return "empty";
        }
        try {
            return new BufferedReader(new FileReader(strM7274B + "csd")).readLine();
        } catch (Throwable unused) {
            return "exception";
        }
    }

    /* JADX INFO: renamed from: y */
    public String m7374y() {
        String strM7274B = m7274B();
        if (strM7274B == null) {
            return "empty";
        }
        try {
            return new BufferedReader(new FileReader(strM7274B + CmcdConfiguration.KEY_CONTENT_ID)).readLine();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: z */
    public String m7376z() {
        String strM7274B = m7274B();
        if (strM7274B == null) {
            return "empty";
        }
        try {
            return new BufferedReader(new FileReader(strM7274B + "name")).readLine();
        } catch (Throwable unused) {
            return "exception";
        }
    }

    /* JADX INFO: renamed from: F */
    private String m7275F(Context context) {
        byte[] hardwareAddress;
        if (m7280b(context, "android.permission.ACCESS_WIFI_STATE")) {
            C5415f0.m7137a(f7357f, "no permission ACCESS_WIFI_STATE");
            return "no_permission";
        }
        try {
            String strM7178c = C5423i0.m7173c().m7178c(context);
            if (C5457z0.m7480a(strM7178c) || (hardwareAddress = NetworkInterface.getByInetAddress(InetAddress.getByName(strM7178c)).getHardwareAddress()) == null) {
                return "empty";
            }
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : hardwareAddress) {
                sb2.append(String.format("%02X:", Integer.valueOf(b11 & 255)));
            }
            if (sb2.length() > 0) {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            if (!sb2.toString().equals("02:00:00:00:00:00") && !sb2.toString().equals("00:00:00:00:00:00")) {
                return sb2.toString();
            }
            return "empty";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m7285k0(Context context) {
        try {
            new WebView(context).destroy();
            return true;
        } catch (Throwable th2) {
            C5415f0.m7138a("WebView Unavailable: ", th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: A */
    public String m7288A(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0 ? "1" : "0";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: B */
    public String m7289B(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? "1" : "0";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: C */
    public String m7291C(Context context) {
        List<InputMethodInfo> inputMethodList;
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            Object obj = "empty";
            if (inputMethodManager != null && (inputMethodList = inputMethodManager.getInputMethodList()) != null) {
                for (int i11 = 0; i11 < inputMethodList.size(); i11++) {
                    InputMethodInfo inputMethodInfo = inputMethodList.get(i11);
                    String packageName = inputMethodInfo.getPackageName();
                    String string = inputMethodInfo.loadLabel(context.getPackageManager()).toString();
                    if (C5457z0.m7482b(packageName)) {
                        if (C5457z0.m7480a(string)) {
                            string = "empty";
                        }
                        JSONArray jSONArray3 = new JSONArray();
                        jSONArray3.put(packageName);
                        jSONArray3.put(string);
                        jSONArray2.put(jSONArray3);
                    }
                }
            }
            String string2 = Settings.Secure.getString(context.getContentResolver(), "enabled_input_methods");
            if (C5457z0.m7480a(string2)) {
                string2 = "empty";
            }
            String string3 = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
            if (!C5457z0.m7480a(string3)) {
                obj = string3;
            }
            jSONArray.put(jSONArray2);
            jSONArray.put(string2);
            jSONArray.put(obj);
            return jSONArray.toString();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: D */
    public String m7293D(Context context) {
        if (m7280b(context, "android.permission.ACCESS_WIFI_STATE")) {
            C5415f0.m7137a(f7357f, "no permission ACCESS_WIFI_STATE");
            return "no_permission";
        }
        if (context == null) {
            C5415f0.m7137a(f7357f, "context is null");
            return "para_err";
        }
        try {
            String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            return (C5457z0.m7480a(macAddress) || macAddress.equals("02:00:00:00:00:00") || macAddress.equals("00:00:00:00:00:00")) ? "empty" : macAddress;
        } catch (Throwable unused) {
            return "exception";
        }
    }

    /* JADX INFO: renamed from: E */
    public String m7295E(Context context) {
        if (m7280b(context, "android.permission.ACCESS_WIFI_STATE")) {
            C5415f0.m7137a(f7357f, "no permission ACCESS_WIFI_STATE");
            return "no_permission";
        }
        if (context == null) {
            C5415f0.m7137a(f7357f, "context is null");
            return "para_err";
        }
        try {
            String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            if (!C5457z0.m7480a(macAddress) && !macAddress.equals("02:00:00:00:00:00") && !macAddress.equals("00:00:00:00:00:00")) {
                return macAddress;
            }
            return m7321a(context, "wlan0");
        } catch (Throwable unused) {
            C5415f0.m7137a(f7357f, "throw Exce");
            return "exception";
        }
    }

    /* JADX INFO: renamed from: G */
    public String m7298G(Context context) {
        try {
            return m7323b(context) == 0 ? m7275F(context) : "empty";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: I */
    public String m7300I(Context context) {
        if (m7280b(context, C33872q4.f71536c)) {
            C5415f0.m7137a(f7357f, "no permission READ_PHONE_STATE");
            return "no_permission";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            String str = (String) telephonyManager.getClass().getMethod("getDeviceId", Integer.TYPE).invoke(telephonyManager, 2);
            return m7278a(str) ? "empty" : str;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: J */
    public String m7301J(Context context) {
        try {
            if (m7280b(context, C33872q4.f71536c)) {
                C5415f0.m7137a(f7357f, "no permission READ_PHONE_STATE");
                return "no_permission";
            }
            if (context == null) {
                C5415f0.m7137a(f7357f, "context is null");
                return "para_err";
            }
            String simOperator = ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getSimOperator();
            return C5457z0.m7480a(simOperator) ? "empty" : simOperator;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: K */
    public String m7302K(Context context) {
        try {
            if (m7280b(context, C33872q4.f71536c)) {
                C5415f0.m7137a(f7357f, "no permission READ_PHONE_STATE");
                return "no_permission";
            }
            if (context == null) {
                C5415f0.m7137a(f7357f, "context is null");
                return "para_err";
            }
            String networkOperatorName = ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getNetworkOperatorName();
            return C5457z0.m7480a(networkOperatorName) ? "empty" : networkOperatorName;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: L */
    public String m7303L(Context context) {
        try {
            if (m7280b(context, "android.permission.ACCESS_COARSE_LOCATION") && m7280b(context, "android.permission.ACCESS_FINE_LOCATION")) {
                return "no_permission";
            }
            JSONObject jSONObject = new JSONObject();
            LocationManager locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
            for (String str : locationManager.getProviders(true)) {
                Location lastKnownLocation = locationManager.getLastKnownLocation(str);
                if (lastKnownLocation != null) {
                    JSONArray jSONArray = new JSONArray();
                    int i11 = Build.VERSION.SDK_INT;
                    jSONArray.put(lastKnownLocation.isFromMockProvider() ? "1" : "0");
                    if (i11 >= 31) {
                        jSONArray.put(lastKnownLocation.isMock() ? "1" : "0");
                    } else {
                        jSONArray.put("empty");
                    }
                    jSONObject.put(str, jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: M */
    public String m7304M(Context context) {
        String str;
        String str2;
        if (m7280b(context, "android.permission.CHANGE_WIFI_STATE")) {
            str = f7357f;
            str2 = "no permission CHANGE_WIFI_STATE";
        } else if (m7280b(context, "android.permission.ACCESS_WIFI_STATE")) {
            str = f7357f;
            str2 = "no permission ACCESS_WIFI_STATE";
        } else if (m7280b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            str = f7357f;
            str2 = "no permission ACCESS_NETWORK_STATE";
        } else {
            if (!m7280b(context, "android.permission.ACCESS_FINE_LOCATION")) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                    wifiManager.startScan();
                    for (ScanResult scanResult : wifiManager.getScanResults()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(scanResult.SSID);
                        jSONArray2.put(scanResult.BSSID);
                        jSONArray2.put(scanResult.level);
                        jSONArray.put(jSONArray2);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        arrayList.add((JSONArray) jSONArray.get(i11));
                    }
                    Collections.sort(arrayList, new a());
                    JSONArray jSONArray3 = new JSONArray();
                    for (int i12 = 0; i12 < Math.min(arrayList.size(), 10); i12++) {
                        jSONArray3.put(arrayList.get(i12));
                    }
                    return jSONArray3.toString();
                } catch (Throwable th2) {
                    C5415f0.m7139a(th2);
                    return "exception";
                }
            }
            str = f7357f;
            str2 = "no permission ACCESS_FINE_LOCATION";
        }
        C5415f0.m7137a(str, str2);
        return "no_permission";
    }

    /* JADX INFO: renamed from: N */
    public String m7305N(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            C5415f0.m7137a(f7357f, "context is null");
            return "para_err";
        }
        if (m7280b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            C5415f0.m7137a(f7357f, "no ACCESS_NETWORK_STATE");
            return "no_permission";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
                return OtcAd.KYC_NOT_PASS;
            }
            return activeNetworkInfo.getType() + "";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: S */
    public String m7310S(Context context) {
        if (!m7280b(context, C33872q4.f71536c)) {
            return C5435o0.m7247c(context);
        }
        C5415f0.m7137a(f7357f, "no permission READ_PHONE_STATE");
        return "no_permission";
    }

    /* JADX INFO: renamed from: T */
    public String m7311T(Context context) {
        if (!m7280b(context, C33872q4.f71536c)) {
            return C5435o0.m7248d(context);
        }
        C5415f0.m7137a(f7357f, "no permission READ_PHONE_STATE");
        return "no_permission";
    }

    /* JADX INFO: renamed from: U */
    public String m7312U(Context context) {
        if (!m7280b(context, C33872q4.f71536c)) {
            return C5435o0.m7249e(context);
        }
        C5415f0.m7137a(f7357f, "no permission READ_PHONE_STATE");
        return "no_permission";
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: V */
    public String m7313V(Context context) {
        String simSerialNumber;
        if (m7280b(context, C33872q4.f71536c)) {
            C5415f0.m7137a(f7357f, "no permission READ_PHONE_STATE");
            return "no_permission";
        }
        if (context == null) {
            C5415f0.m7137a(f7357f, "context is null");
            return "para_err";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            simSerialNumber = telephonyManager != null ? telephonyManager.getSimSerialNumber() : "default";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            simSerialNumber = "exception";
        }
        return C5457z0.m7480a(simSerialNumber) ? "empty" : simSerialNumber;
    }

    /* JADX INFO: renamed from: X */
    public String m7315X(Context context) {
        try {
            if (context == null) {
                C5415f0.m7136a("getScreenSharingStatus context is null");
                return "empty";
            }
            Display[] displays = ((DisplayManager) context.getSystemService("display")).getDisplays();
            if (displays == null) {
                return "empty";
            }
            C5415f0.m7136a("Current screen num: " + displays.length);
            return displays.length > 1 ? "1" : "0";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: Z */
    public String m7317Z(Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (Sensor sensor : ((SensorManager) context.getSystemService("sensor")).getSensorList(-1)) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(sensor.getName());
                jSONArray2.put(sensor.getType() + "");
                jSONArray2.put(sensor.getVendor());
                jSONArray.put(jSONArray2);
            }
            return jSONArray.toString();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: a */
    public String m7318a() {
        try {
            long freeSpace = Environment.getDataDirectory().getFreeSpace();
            if (freeSpace == 0) {
                return "default";
            }
            return freeSpace + "";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: b0 */
    public String m7325b0(Context context) {
        try {
            if (m7280b(context, C33872q4.f71536c)) {
                C5415f0.m7137a(f7357f, "no permission READ_PHONE_STATE");
                return "no_permission";
            }
            if (context == null) {
                C5415f0.m7137a(f7357f, "context is null");
                return "para_err";
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager == null) {
                return "empty";
            }
            return "" + telephonyManager.getSimState();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: c */
    public String m7326c(Context context) {
        try {
            if (context == null) {
                C5415f0.m7136a("context is null");
                return "para_err";
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager != null ? accessibilityManager.isEnabled() : false;
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_accessibility_services");
            if (string == null) {
                string = "";
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ViewProps.f9928ON, zIsEnabled);
                jSONObject.put("value", string);
                return jSONObject.toString();
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
                return "empty";
            }
        } catch (Throwable th3) {
            C5415f0.m7139a(th3);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: d */
    public String m7329d(Context context) {
        if (context == null) {
            C5415f0.m7137a(f7357f, "context is null");
            return "para_err";
        }
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (!C5457z0.m7480a(string)) {
                return string;
            }
            C5415f0.m7137a(f7357f, "androidId is null");
            return "empty";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: e */
    public String m7332e(Context context) {
        try {
            Map<String, Integer> mapM7394a = C5444t.m7394a();
            if (mapM7394a == null) {
                return "empty";
            }
            return "" + mapM7394a.get("userid").intValue();
        } catch (Throwable unused) {
            return "exception";
        }
    }

    /* JADX INFO: renamed from: e0 */
    public String m7333e0(Context context) {
        if (context == null) {
            C5415f0.m7137a(f7357f, "context is null");
            return "para_err";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            int i11 = audioManager.getRingerMode() == 0 ? 1 : 0;
            int streamVolume = audioManager.getStreamVolume(0);
            int streamVolume2 = audioManager.getStreamVolume(1);
            int streamVolume3 = audioManager.getStreamVolume(2);
            int streamVolume4 = audioManager.getStreamVolume(3);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("ringermode", "" + i11);
            jSONObject.put("call", "" + streamVolume);
            jSONObject.put("system", "" + streamVolume2);
            jSONObject.put("ring", "" + streamVolume3);
            jSONObject.put("music", "" + streamVolume4);
            jSONObject.put(NotificationCompat.CATEGORY_ALARM, "" + streamVolume5);
            return jSONObject.toString();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: f */
    public String m7335f(Context context) {
        try {
            String strM7405b = C5446u.m7405b(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            return C5457z0.m7480a(strM7405b) ? "empty" : strM7405b;
        } catch (Throwable unused) {
            return "exception";
        }
    }

    /* JADX INFO: renamed from: g */
    public String m7337g(Context context) {
        try {
            return "" + ((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", new Class[0]).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(context), new Object[0])).doubleValue();
        } catch (Throwable unused) {
            return "exception";
        }
    }

    /* JADX INFO: renamed from: g0 */
    public String m7338g0(Context context) {
        try {
            String[] strArr = {"default"};
            Object obj = new Object();
            Handler handler = new Handler(context.getMainLooper());
            C5434o[] c5434oArr = new C5434o[1];
            try {
                handler.post(new c(context, c5434oArr, strArr, obj));
                synchronized (obj) {
                    try {
                        obj.wait(1000L);
                    } catch (Throwable th2) {
                        C5415f0.m7139a(th2);
                    }
                }
                C5415f0.m7136a("now wait for webrtc finished");
                handler.post(new d(c5434oArr));
                return strArr[0];
            } catch (Throwable unused) {
                return "exception";
            }
        } catch (Throwable unused2) {
            return "exception";
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized String m7340h(Context context) {
        try {
            int intProperty = ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4);
            if (intProperty == 0) {
                if (context.getApplicationInfo().targetSdkVersion < 28) {
                    return "not_supported";
                }
                return intProperty + "";
            }
            if (Integer.MIN_VALUE == intProperty) {
                return "not_supported";
            }
            return intProperty + "";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: h0 */
    public String m7341h0(Context context) {
        String bssid;
        String str;
        String str2;
        if (m7280b(context, "android.permission.ACCESS_WIFI_STATE")) {
            str = f7357f;
            str2 = "no ACCESS_WIFI_STATE";
        } else {
            if (!m7280b(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                if (context == null) {
                    C5415f0.m7137a(f7357f, "context is null");
                    return "para_err";
                }
                try {
                    WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                    bssid = wifiManager.isWifiEnabled() ? wifiManager.getConnectionInfo().getBSSID() : "default";
                } catch (Throwable th2) {
                    C5415f0.m7139a(th2);
                    bssid = "exception";
                }
                return (C5457z0.m7480a(bssid) || bssid.equals("02:00:00:00:00:00") || bssid.equals("00:00:00:00:00:00")) ? "empty" : bssid;
            }
            str = f7357f;
            str2 = "no ACCESS_COARSE_LOCATION";
        }
        C5415f0.m7137a(str, str2);
        return "no_permission";
    }

    /* JADX INFO: renamed from: i */
    public synchronized String m7343i(Context context) {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return "empty";
            }
            return ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(6) + "";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: i0 */
    public String m7344i0(Context context) {
        if (m7280b(context, "android.permission.ACCESS_WIFI_STATE")) {
            C5415f0.m7137a(f7357f, "no ACCESS_WIFI_STATE");
            return "no_permission";
        }
        if (context == null) {
            C5415f0.m7137a(f7357f, "context is null");
            return "para_err";
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            String ssid = wifiManager.isWifiEnabled() ? wifiManager.getConnectionInfo().getSSID() : null;
            if (C5457z0.m7482b(ssid) && ssid.equals("<unknown ssid>")) {
                ssid = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().getExtraInfo();
            }
            if (!C5457z0.m7480a(ssid)) {
                if (ssid.length() < 2 || !ssid.startsWith("\"") || !ssid.endsWith("\"")) {
                    return ssid;
                }
                String strSubstring = ssid.substring(1, ssid.length() - 1);
                if (!C5457z0.m7480a(strSubstring)) {
                    return strSubstring;
                }
            }
            return "empty";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: j */
    public String m7345j(Context context) {
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver == null) {
                return "empty";
            }
            int intExtra = intentRegisterReceiver.getIntExtra("voltage", BaseConstants.ERR_SVR_SSO_VCODE);
            if (intExtra == -10000) {
                return "default";
            }
            return "" + intExtra;
        } catch (Throwable unused) {
            return "exception";
        }
    }

    /* JADX INFO: renamed from: k */
    public String m7348k(Context context) {
        if (m7280b(context, "android.permission.BLUETOOTH")) {
            C5415f0.m7137a(f7357f, "no permission ACCESS_WIFI_STATE");
            return "no_permission";
        }
        if (context == null) {
            C5415f0.m7137a(f7357f, "context is null");
            return "para_err";
        }
        String strM7281c = m7281c();
        try {
            if (C5457z0.m7480a(strM7281c) || "02:00:00:00:00:00".equals(strM7281c) || "00:00:00:00:00:00".equals(strM7281c)) {
                strM7281c = Settings.Secure.getString(context.getContentResolver(), "bluetooth_address");
                if (C5457z0.m7480a(strM7281c) || "02:00:00:00:00:00".equals(strM7281c) || "00:00:00:00:00:00".equals(strM7281c)) {
                    strM7281c = "empty";
                }
            }
            return C5457z0.m7480a(strM7281c) ? "empty" : strM7281c;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: l */
    public String m7350l(Context context) {
        if (context == null) {
            return "empty";
        }
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness") + "";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: m */
    public String m7352m(Context context) {
        StringBuilder sb2;
        try {
            boolean zM7146b = C5417g.m7143a(context).m7146b("uuid10");
            if (Build.VERSION.SDK_INT < 29 || !zM7146b) {
                return "empty";
            }
            String absolutePath = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath(), "au_uu_SzH34yR2.mp3").getAbsolutePath();
            String strM7114a = C5405c.m7114a(context, "au_uu_SzH34yR2");
            if (!C5457z0.m7480a(strM7114a)) {
                long iVar = crypto.geti(absolutePath);
                sb2 = new StringBuilder();
                sb2.append(iVar);
                sb2.append("_");
                sb2.append(strM7114a);
            } else {
                if (C5448v.m7419a(absolutePath)) {
                    return "empty";
                }
                String string = UUID.randomUUID().toString();
                if (!C5405c.m7115a(context, "au_uu_SzH34yR2", string)) {
                    return "empty";
                }
                long iVar2 = crypto.geti(absolutePath);
                sb2 = new StringBuilder();
                sb2.append(iVar2);
                sb2.append("_");
                sb2.append(string);
            }
            return sb2.toString();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: n */
    public String m7354n(Context context) {
        try {
            String strM7399a = C5445t0.m7399a(context, ".__psek.sys");
            if (C5457z0.m7480a(strM7399a)) {
                strM7399a = C5447u0.m7417f(context, "DVSPSEQ");
            }
            String str = ((C5457z0.m7482b(strM7399a) ? Integer.parseInt(strM7399a) : 0) + 1) + "";
            C5445t0.m7400a(context, ".__psek.sys", str);
            C5447u0.m7408a(context, "DVSPSEQ", str);
            return str;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: o */
    public synchronized String m7356o(Context context) {
        String string;
        try {
            String strM7399a = C5445t0.m7399a(context, ".__puuk.sys");
            String strM7417f = C5447u0.m7417f(context, "DVSPUUID");
            string = "";
            if (C5457z0.m7482b(strM7399a)) {
                string = strM7399a;
            } else if (C5457z0.m7482b(strM7417f)) {
                string = strM7417f;
            }
            if (C5457z0.m7480a(string)) {
                string = UUID.randomUUID().toString();
            }
            if (C5457z0.m7480a(strM7399a)) {
                C5445t0.m7400a(context, ".__puuk.sys", string);
            }
            if (C5457z0.m7480a(strM7417f)) {
                C5447u0.m7408a(context, "DVSPUUID", string);
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
        return string;
    }

    /* JADX INFO: renamed from: p */
    public String m7358p(Context context) {
        return "empty";
    }

    /* JADX INFO: renamed from: q */
    public String m7359q(Context context) {
        JSONArray jSONArray = new JSONArray();
        try {
            if (context == null) {
                C5415f0.m7136a("getDisplayInfo context is null");
                return jSONArray.toString();
            }
            Display[] displays = ((DisplayManager) context.getSystemService("display")).getDisplays();
            if (displays != null) {
                for (Display display : displays) {
                    if (display != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("name", display.getName());
                        jSONObject.put("id", display.getDisplayId());
                        jSONObject.put("flag", display.getFlags());
                        jSONObject.put("refresh_rate", display.getRefreshRate());
                        jSONObject.put("rotation", display.getRotation());
                        jSONObject.put("cache_width", display.getWidth());
                        jSONObject.put("cache_height", display.getHeight());
                        jSONObject.put("display_deadline_nanos", display.getPresentationDeadlineNanos());
                        jSONObject.put("display_app_vsync_offset_nanos", display.getAppVsyncOffsetNanos());
                        jSONObject.put("display_mode", display.getMode());
                        Activity activityM7284j = m7284j();
                        if (activityM7284j != null) {
                            DisplayMetrics displayMetrics = new DisplayMetrics();
                            activityM7284j.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                            jSONObject.put("display_width", displayMetrics.widthPixels);
                            jSONObject.put("display_height", displayMetrics.heightPixels);
                        }
                        try {
                            Field declaredField = display.getClass().getDeclaredField("mDisplayInfo");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(display);
                            if (obj != null) {
                                for (Field field : obj.getClass().getDeclaredFields()) {
                                    field.setAccessible(true);
                                    Object obj2 = field.get(obj);
                                    jSONObject.put(field.getName(), obj2 != null ? obj2.toString() : "null");
                                }
                            }
                        } catch (Throwable th2) {
                            C5415f0.m7139a(th2);
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
        } catch (Throwable th3) {
            C5415f0.m7138a("Exception in getDisplayInfo", th3);
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: r */
    public String m7361r(Context context) {
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
            if (cameraManager == null) {
                return "empty";
            }
            JSONArray jSONArray = new JSONArray();
            for (String str : cameraManager.getCameraIdList()) {
                Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                C5415f0.m7140b("camera ID: " + str + ", lensFacing: " + num);
                if (num != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(str);
                    jSONArray2.put(num);
                    jSONArray.put(jSONArray2);
                }
            }
            return jSONArray.toString();
        } catch (Throwable th2) {
            C5415f0.m7138a("Cannot access camera: ", th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: s */
    public String m7363s(Context context) {
        String str;
        try {
            String strM7399a = C5445t0.m7399a(context, ".__pfrk.sys");
            String strM7417f = C5447u0.m7417f(context, "DVSPFIRSTREPORTTIME");
            if (C5457z0.m7482b(strM7399a)) {
                str = strM7399a;
            } else {
                str = C5457z0.m7482b(strM7417f) ? strM7417f : "";
            }
            if (C5457z0.m7480a(str)) {
                str = System.currentTimeMillis() + "";
            }
            if (C5457z0.m7480a(strM7399a)) {
                C5445t0.m7400a(context, ".__pfrk.sys", str);
            }
            if (C5457z0.m7480a(strM7417f)) {
                C5447u0.m7408a(context, "DVSPFIRSTREPORTTIME", str);
            }
            return str;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: t */
    public synchronized String m7365t(Context context) {
        String[] strArr;
        strArr = new String[]{"empty"};
        boolean[] zArr = {false};
        C5442s.m7390a(context, new f(strArr, zArr));
        synchronized (this.f7360c) {
            try {
                if (!zArr[0]) {
                    try {
                        this.f7360c.wait(50L);
                    } catch (Throwable th2) {
                        C5415f0.m7139a(th2);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C5415f0.m7136a("getGoogleAdsId getGoogleAdsId getGoogleAdsId getGoogleAdsId:       " + strArr[0]);
        return strArr[0];
    }

    /* JADX INFO: renamed from: u */
    public String m7367u(Context context) {
        try {
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (keyguardManager != null) {
                return keyguardManager.isKeyguardSecure() ? "1" : "0";
            }
            return "empty";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: v */
    public String m7369v(Context context) {
        String deviceId;
        if (m7280b(context, C33872q4.f71536c)) {
            C5415f0.m7137a(f7357f, "no permission READ_PHONE_STATE");
            return "no_permission";
        }
        if (context == null) {
            C5415f0.m7137a(f7357f, "context is null");
            return "para_err";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            deviceId = telephonyManager != null ? telephonyManager.getDeviceId() : "default";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            deviceId = "exception";
        }
        return C5457z0.m7480a(deviceId) ? "empty" : deviceId;
    }

    /* JADX INFO: renamed from: w */
    public String m7371w(Context context) {
        if (m7280b(context, C33872q4.f71536c)) {
            C5415f0.m7137a(f7357f, "no permission READ_PHONE_STATE");
            return "no_permission";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            String str = (String) telephonyManager.getClass().getMethod("getDeviceId", Integer.TYPE).invoke(telephonyManager, 1);
            return m7278a(str) ? "empty" : str;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: x */
    public String m7373x(Context context) {
        String subscriberId;
        if (m7280b(context, C33872q4.f71536c)) {
            C5415f0.m7137a(f7357f, "no permission READ_PHONE_STATE");
            return "no_permission";
        }
        if (context == null) {
            C5415f0.m7137a(f7357f, "context is null");
            return "para_err";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            subscriberId = telephonyManager != null ? telephonyManager.getSubscriberId() : "default";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            subscriberId = "exception";
        }
        return C5457z0.m7480a(subscriberId) ? "empty" : subscriberId;
    }

    /* JADX INFO: renamed from: y */
    public String m7375y(Context context) {
        try {
            if (m7280b(context, C33872q4.f71536c)) {
                C5415f0.m7137a(f7357f, "no permission READ_PHONE_STATE");
                return "no_permission";
            }
            if (context == null) {
                C5415f0.m7137a(f7357f, "context is null");
                return "para_err";
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            JSONArray jSONArray = new JSONArray();
            boolean z11 = true;
            boolean z12 = telephonyManager != null && telephonyManager.getCallState() == 2;
            if (z12) {
                z11 = z12;
            } else if (((AudioManager) context.getSystemService("audio")).getMode() != 3) {
                z11 = false;
            }
            jSONArray.put(z11);
            jSONArray.put(false);
            return jSONArray.toString();
        } catch (Throwable th2) {
            C5415f0.m7136a("getIsActivePhoneCall exception: " + th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: z */
    public String m7377z(Context context) {
        String string;
        if (context == null) {
            C5415f0.m7136a("testMockLocation context is null");
            return "para_err";
        }
        try {
            return (Settings.Secure.getInt(context.getContentResolver(), "location_mode") == 0 || (string = Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed")) == null || string.length() != 0) ? "0" : "1";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "0";
        }
    }

    /* JADX INFO: renamed from: a */
    private String m7277a(BluetoothAdapter bluetoothAdapter) {
        try {
            Field declaredField = BluetoothAdapter.class.getDeclaredField("mService");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(bluetoothAdapter);
            if (obj == null) {
                return null;
            }
            Method declaredMethod = obj.getClass().getDeclaredMethod("getAddress", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(obj, new Object[0]);
            if (objInvoke != null && (objInvoke instanceof String)) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7282c(Context context, String str) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: f0 */
    private WindowManager m7283f0(Context context) {
        try {
            if (Build.VERSION.SDK_INT > 30) {
                context = context.createDisplayContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0)).createWindowContext(2038, null);
            }
            return (WindowManager) context.getSystemService(InterfaceC33953u5.f72199F);
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: H */
    public String m7299H(Context context) {
        try {
            if (m7323b(context) == 1) {
                return m7275F(context);
            }
            return "empty";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: Q */
    public String m7308Q(Context context) {
        return C5435o0.m7243a(context);
    }

    /* JADX INFO: renamed from: R */
    public String m7309R(Context context) {
        return C5435o0.m7246b(context);
    }

    /* JADX INFO: renamed from: W */
    public String m7314W(Context context) {
        try {
            WindowManager windowManagerM7283f0 = m7283f0(context);
            if (windowManagerM7283f0 == null) {
                return "empty";
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManagerM7283f0.getDefaultDisplay().getRealMetrics(displayMetrics);
            return "" + displayMetrics.heightPixels;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: Y */
    public String m7316Y(Context context) {
        try {
            WindowManager windowManagerM7283f0 = m7283f0(context);
            if (windowManagerM7283f0 == null) {
                return "empty";
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManagerM7283f0.getDefaultDisplay().getRealMetrics(displayMetrics);
            return "" + displayMetrics.widthPixels;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: a0 */
    public String m7322a0(Context context) {
        try {
            return "" + ((SensorManager) context.getSystemService("sensor")).getSensorList(-1).size();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: b */
    public String m7324b() {
        try {
            long totalSpace = Environment.getDataDirectory().getTotalSpace();
            if (totalSpace == 0) {
                return "default";
            }
            return "" + totalSpace;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: c0 */
    public String m7327c0(Context context) {
        try {
            WindowManager windowManagerM7283f0 = m7283f0(context);
            if (windowManagerM7283f0 == null) {
                return "empty";
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManagerM7283f0.getDefaultDisplay().getRealMetrics(displayMetrics);
            int i11 = displayMetrics.widthPixels;
            int i12 = displayMetrics.heightPixels;
            return Math.max(i11, i12) + ProxyConfig.MATCH_ALL_SCHEMES + Math.min(i11, i12);
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: d0 */
    public String m7330d0(Context context) {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            if (C5457z0.m7480a(defaultUserAgent)) {
                defaultUserAgent = System.getProperty("http.agent");
            }
            if (C5457z0.m7480a(defaultUserAgent)) {
                return "empty";
            }
            StringBuilder sb2 = new StringBuilder();
            int length = defaultUserAgent.length();
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = defaultUserAgent.charAt(i11);
                if (cCharAt > 31 && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                }
            }
            return sb2.toString();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7280b(Context context, String str) {
        return !m7282c(context, str);
    }

    /* JADX INFO: renamed from: a */
    public String m7319a(Context context) {
        boolean z11;
        NetworkInfo networkInfo;
        if (m7280b(context, "android.permission.INTERNET")) {
            C5415f0.m7137a(f7357f, "no permission INTERNET");
            return "no_permission";
        }
        boolean zIsConnectedOrConnecting = false;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                z11 = false;
                for (NetworkInterface networkInterface : Collections.list(networkInterfaces)) {
                    try {
                        if (networkInterface.isUp() && networkInterface.getInterfaceAddresses().size() != 0 && ("tun0".equals(networkInterface.getName()) || "ppp0".equals(networkInterface.getName()) || "tap0".equals(networkInterface.getName()) || "ppp".equals(networkInterface.getName()) || "tun".equals(networkInterface.getName()) || "tap".equals(networkInterface.getName()))) {
                            z11 = true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C5415f0.m7139a(th);
                    }
                }
            } else {
                z11 = false;
            }
        } catch (Throwable th3) {
            th = th3;
            z11 = false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (networkInfo = connectivityManager.getNetworkInfo(17)) != null) {
                zIsConnectedOrConnecting = networkInfo.isConnectedOrConnecting();
            }
        } catch (Throwable th4) {
            C5415f0.m7139a(th4);
        }
        return (z11 || zIsConnectedOrConnecting) ? "1" : "0";
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0038 A[RETURN] */
    /* JADX INFO: renamed from: a */
    public String m7320a(Context context, int i11) {
        String string;
        ContentResolver contentResolver;
        String str;
        try {
            if (i11 == 1) {
                contentResolver = context.getContentResolver();
                str = "mi_health_id";
            } else if (i11 == 2) {
                contentResolver = context.getContentResolver();
                str = "gcbooster_uuid";
            } else {
                if (i11 != 3) {
                    if (i11 == 4) {
                        contentResolver = context.getContentResolver();
                        str = "ad_aaid";
                    } else {
                        string = "empty";
                    }
                    if (C5457z0.m7482b(string)) {
                        return string;
                    }
                    return "empty";
                }
                contentResolver = context.getContentResolver();
                str = "key_mqs_uuid";
            }
            string = Settings.Global.getString(contentResolver, str);
            if (C5457z0.m7482b(string)) {
                return string;
            }
            return "empty";
        } catch (Throwable th2) {
            C5415f0.m7136a("getMiHealthId" + th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: a */
    public String m7321a(Context context, String str) {
        if (m7280b(context, "android.permission.ACCESS_WIFI_STATE")) {
            C5415f0.m7137a(f7357f, "no permission ACCESS_WIFI_STATE");
            return "no_permission";
        }
        if (context == null) {
            C5415f0.m7137a(f7357f, "context is null");
            return "para_err";
        }
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            if (list != null) {
                for (NetworkInterface networkInterface : list) {
                    if (networkInterface != null && networkInterface.getName() != null && networkInterface.getName().equalsIgnoreCase(str)) {
                        byte[] hardwareAddress = networkInterface.getHardwareAddress();
                        if (hardwareAddress != null) {
                            StringBuilder sb2 = new StringBuilder();
                            for (byte b11 : hardwareAddress) {
                                sb2.append(String.format("%02X:", Integer.valueOf(b11 & 255)));
                            }
                            if (sb2.length() > 0) {
                                sb2.deleteCharAt(sb2.length() - 1);
                            }
                            if (!sb2.toString().equals("02:00:00:00:00:00") && !sb2.toString().equals("00:00:00:00:00:00")) {
                                return sb2.toString();
                            }
                            break;
                            break;
                        }
                        return "empty";
                    }
                }
            }
            return "empty";
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "exception";
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m7278a(String str) {
        if (str != null) {
            try {
                if (!str.equals("") && !str.contains("unknown") && !str.contains("null") && !str.contains("nil") && !str.toLowerCase().contains("0123456789abcdef")) {
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 <= str.length() - 1) {
                        int i13 = i11 + 1;
                        if (str.substring(i11, i13).equals("0") && (i12 = i12 + 1) > str.length() / 2) {
                            return true;
                        }
                        i11 = i13;
                    }
                    return false;
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return true;
    }
}
