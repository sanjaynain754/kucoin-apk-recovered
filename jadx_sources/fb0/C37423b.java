package fb0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.scottyab.rootbeer.RootBeerNative;
import com.tencent.bugly.proguard.C33627eb;
import gb0.C37859a;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* JADX INFO: renamed from: fb0.b */
/* JADX INFO: compiled from: RootBeer.java */
/* JADX INFO: loaded from: classes59.dex */
public class C37423b {

    /* JADX INFO: renamed from: a */
    public final Context f83021a;

    /* JADX INFO: renamed from: b */
    public boolean f83022b = true;

    /* JADX INFO: renamed from: g */
    public boolean m84189g() {
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"which", CmcdConfiguration.KEY_STARTUP});
            boolean z11 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
            processExec.destroy();
            return z11;
        } catch (Throwable unused) {
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m84190h() {
        return m84191i(null);
    }

    /* JADX INFO: renamed from: j */
    public boolean m84192j() {
        return m84193k(null);
    }

    /* JADX INFO: renamed from: n */
    public final String[] m84196n() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        } catch (IOException | NoSuchElementException e11) {
            C37859a.m85437a(e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public final String[] m84197o() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        } catch (IOException | NoSuchElementException e11) {
            C37859a.m85437a(e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m84183a() {
        return new RootBeerNative().m68566a();
    }

    /* JADX INFO: renamed from: c */
    public boolean m84185c() {
        HashMap map = new HashMap();
        map.put("ro.debuggable", "1");
        map.put("ro.secure", "0");
        String[] strArrM84197o = m84197o();
        if (strArrM84197o == null) {
            return false;
        }
        boolean z11 = false;
        for (String str : strArrM84197o) {
            for (String str2 : map.keySet()) {
                if (str.contains(str2)) {
                    String str3 = "[" + ((String) map.get(str2)) + "]";
                    if (str.contains(str3)) {
                        C37859a.m85442f(str2 + " = " + str3 + " detected!");
                        z11 = true;
                    }
                }
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: d */
    public boolean m84186d() {
        return m84184b("magisk");
    }

    /* JADX INFO: renamed from: i */
    public boolean m84191i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(C37422a.f83017b));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return m84195m(arrayList);
    }

    /* JADX INFO: renamed from: k */
    public boolean m84193k(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(C37422a.f83016a));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return m84195m(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public boolean m84194l() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* JADX INFO: renamed from: m */
    public final boolean m84195m(List<String> list) {
        PackageManager packageManager = this.f83021a.getPackageManager();
        boolean z11 = false;
        for (String str : list) {
            try {
                packageManager.getPackageInfo(str, 0);
                C37859a.m85438b(str + " ROOT management app detected!");
                z11 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z11;
    }

    public C37423b(Context context) {
        this.f83021a = context;
    }

    /* JADX INFO: renamed from: b */
    public boolean m84184b(String str) {
        boolean z11 = false;
        for (String str2 : C37422a.m84182a()) {
            String str3 = str2 + str;
            if (new File(str2, str).exists()) {
                C37859a.m85442f(str3 + " binary detected!");
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: e */
    public boolean m84187e() {
        String[] strArrM84196n = m84196n();
        int i11 = 0;
        if (strArrM84196n == null) {
            return false;
        }
        int length = strArrM84196n.length;
        int i12 = 0;
        boolean z11 = false;
        while (i12 < length) {
            String str = strArrM84196n[i12];
            String[] strArrSplit = str.split(C33627eb.f69716f);
            if (strArrSplit.length < 6) {
                C37859a.m85438b("Error formatting mount line: " + str);
            } else {
                String str2 = strArrSplit[2];
                String strReplace = strArrSplit[5];
                String[] strArr = C37422a.f83020e;
                int length2 = strArr.length;
                int i13 = i11;
                while (i13 < length2) {
                    String str3 = strArr[i13];
                    if (str2.equalsIgnoreCase(str3)) {
                        strReplace = strReplace.replace("(", "").replace(")", "");
                        String[] strArrSplit2 = strReplace.split(",");
                        int length3 = strArrSplit2.length;
                        for (int i14 = i11; i14 < length3; i14++) {
                            if (strArrSplit2[i14].equalsIgnoreCase("rw")) {
                                C37859a.m85442f(str3 + " path is mounted with rw permissions! " + str);
                                z11 = true;
                                break;
                            }
                        }
                    }
                    i13++;
                    i11 = 0;
                }
            }
            i12++;
            i11 = 0;
        }
        return z11;
    }

    /* JADX INFO: renamed from: f */
    public boolean m84188f() {
        if (!m84183a()) {
            C37859a.m85438b("We could not load the native library to test for root");
            return false;
        }
        String[] strArrM84182a = C37422a.m84182a();
        int length = strArrM84182a.length;
        String[] strArr = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            strArr[i11] = strArrM84182a[i11] + CmcdConfiguration.KEY_STARTUP;
        }
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.f83022b);
            if (rootBeerNative.checkForRoot(strArr) <= 0) {
                return false;
            }
            return true;
        } catch (UnsatisfiedLinkError unused) {
        }
    }
}
