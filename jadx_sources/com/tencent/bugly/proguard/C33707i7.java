package com.tencent.bugly.proguard;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.feedback.eup.CrashHandleListener;
import com.tencent.feedback.eup.CrashReport;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.i7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33707i7 {

    /* JADX INFO: renamed from: a */
    public static final String f70197a = "4.0";

    /* JADX INFO: renamed from: b */
    public static final String f70198b = "CrashReport-GameAgent";

    /* JADX INFO: renamed from: c */
    public static final int f70199c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f70200d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f70201e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f70202f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f70203g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f70204h = 2;

    /* JADX INFO: renamed from: i */
    public static final int f70205i = 3;

    /* JADX INFO: renamed from: j */
    public static final int f70206j = 4;

    /* JADX INFO: renamed from: k */
    public static final int f70207k = 4;

    /* JADX INFO: renamed from: l */
    public static final int f70208l = 5;

    /* JADX INFO: renamed from: m */
    public static final int f70209m = 6;

    /* JADX INFO: renamed from: n */
    public static final String f70210n = "com.unity3d.player.UnityPlayer";

    /* JADX INFO: renamed from: o */
    public static final String f70211o = "org.cocos2dx.lib.Cocos2dxActivity";

    /* JADX INFO: renamed from: p */
    public static int f70212p;

    /* JADX INFO: renamed from: q */
    public static long f70213q;

    /* JADX INFO: renamed from: r */
    public static Handler f70214r;

    /* JADX INFO: renamed from: s */
    public static WeakReference<Activity> f70215s;

    /* JADX INFO: renamed from: t */
    public static WeakReference<Context> f70216t;

    /* JADX INFO: renamed from: u */
    public static CrashHandleListener f70217u;

    /* JADX INFO: renamed from: v */
    public static boolean f70218v;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f70219b;

        public a(String str) {
            this.f70219b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33808n3.m74222h(C33707i7.m73381g(), this.f70219b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f70220b;

        public b(String str) {
            this.f70220b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C34042ye.m75507a(102, this.f70220b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$c */
    /* JADX INFO: compiled from: BUGLY */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f70221b;

        public c(String str) {
            this.f70221b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33808n3.m74209e(C33707i7.m73381g(), this.f70221b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$d */
    /* JADX INFO: compiled from: BUGLY */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f70222b;

        public d(String str) {
            this.f70222b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C34042ye.m75507a(106, this.f70222b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$e */
    /* JADX INFO: compiled from: BUGLY */
    public class e implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f70223b;

        public e(String str) {
            this.f70223b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33808n3.m74213f(C33707i7.m73381g(), this.f70223b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$f */
    /* JADX INFO: compiled from: BUGLY */
    public class f implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f70224b;

        public f(String str) {
            this.f70224b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C34042ye.m75507a(113, this.f70224b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$g */
    /* JADX INFO: compiled from: BUGLY */
    public class g implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String[] f70225b;

        public g(String[] strArr) {
            this.f70225b = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33808n3.m74195a(this.f70225b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$h */
    /* JADX INFO: compiled from: BUGLY */
    public class h implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f70226b;

        public h(int i11) {
            this.f70226b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            CrashReport.m75840a(C33707i7.m73381g(), this.f70226b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$i */
    /* JADX INFO: compiled from: BUGLY */
    public class i implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f70227b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f70228c;

        public i(String str, String str2) {
            this.f70227b = str;
            this.f70228c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33808n3.m74181a(C33707i7.m73381g(), this.f70227b, this.f70228c);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$j */
    /* JADX INFO: compiled from: BUGLY */
    public class j implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f70229b;

        public j(String str) {
            this.f70229b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33808n3.m74197b(C33707i7.m73381g(), this.f70229b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$l */
    /* JADX INFO: compiled from: BUGLY */
    public class l implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String[] f70230b;

        public l(String[] strArr) {
            this.f70230b = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            C34042ye.m75504a((List<String>) Arrays.asList(this.f70230b));
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$m */
    /* JADX INFO: compiled from: BUGLY */
    public class m implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String[] f70231b;

        public m(String[] strArr) {
            this.f70231b = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            C34042ye.m75513b((List<String>) Arrays.asList(this.f70231b));
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$o */
    /* JADX INFO: compiled from: BUGLY */
    public class o implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f70232b;

        public o(String str) {
            this.f70232b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C34042ye.m75503a(this.f70232b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$p */
    /* JADX INFO: compiled from: BUGLY */
    public class p implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f70233b;

        public p(String str) {
            this.f70233b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C34042ye.m75512b(this.f70233b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$q */
    /* JADX INFO: compiled from: BUGLY */
    public class q implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f70234b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f70235c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f70236d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f70237e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Map f70238f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ boolean f70239g;

        public q(int i11, String str, String str2, String str3, Map map, boolean z11) {
            this.f70234b = i11;
            this.f70235c = str;
            this.f70236d = str2;
            this.f70237e = str3;
            this.f70238f = map;
            this.f70239g = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33563ba.m72492a(this.f70234b, this.f70235c, this.f70236d, this.f70237e, (Map<String, String>) this.f70238f);
            if (this.f70239g) {
                C33707i7.m73356a(3000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$r */
    /* JADX INFO: compiled from: BUGLY */
    public class r implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f70240b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f70241c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f70242d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f70243e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Map f70244f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ boolean f70245g;

        public r(int i11, String str, String str2, String str3, Map map, boolean z11) {
            this.f70240b = i11;
            this.f70241c = str;
            this.f70242d = str2;
            this.f70243e = str3;
            this.f70244f = map;
            this.f70245g = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33563ba.m72492a(this.f70240b, this.f70241c, this.f70242d, this.f70243e, (Map<String, String>) this.f70244f);
            if (this.f70245g) {
                C33707i7.m73356a(3000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$s */
    /* JADX INFO: compiled from: BUGLY */
    public class s implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f70246b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f70247c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f70248d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Map f70249e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f70250f;

        public s(String str, String str2, String str3, Map map, boolean z11) {
            this.f70246b = str;
            this.f70247c = str2;
            this.f70248d = str3;
            this.f70249e = map;
            this.f70250f = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33563ba.m72493a(this.f70246b, this.f70247c, this.f70248d, this.f70249e);
            if (this.f70250f) {
                C33707i7.m73356a(3000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$t */
    /* JADX INFO: compiled from: BUGLY */
    public class t implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String[] f70251b;

        public t(String[] strArr) {
            this.f70251b = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            C34042ye.m75504a((List<String>) Arrays.asList(this.f70251b));
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$u */
    /* JADX INFO: compiled from: BUGLY */
    public class u implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f70252b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f70253c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f70254d;

        public u(Context context, String str, boolean z11) {
            this.f70252b = context;
            this.f70253c = str;
            this.f70254d = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C33707i7.f70217u != null) {
                C33951u3 c33951u3 = new C33951u3();
                CrashHandleListener crashHandleListener = C33707i7.f70217u;
                synchronized (c33951u3) {
                    c33951u3.f72192s = crashHandleListener;
                }
                Context context = this.f70252b;
                String str = this.f70253c;
                boolean z11 = this.f70254d;
                long j11 = C33707i7.f70213q;
                C33598d3.m72770a(context);
                C33808n3.m74182a(context, str, z11, c33951u3, j11);
                return;
            }
            Context context2 = this.f70252b;
            String str2 = this.f70253c;
            boolean z12 = this.f70254d;
            long j12 = C33707i7.f70213q;
            C33598d3.m72770a(context2);
            C33808n3.m74182a(context2, str2, z12, (C33951u3) null, j12);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$v */
    /* JADX INFO: compiled from: BUGLY */
    public class v implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f70255b;

        public v(String str) {
            this.f70255b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33891r3.m74778h(C33707i7.m73381g(), this.f70255b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$w */
    /* JADX INFO: compiled from: BUGLY */
    public class w implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f70256b;

        public w(String str) {
            this.f70256b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33808n3.m74202c(C33707i7.m73381g(), this.f70256b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$x */
    /* JADX INFO: compiled from: BUGLY */
    public class x implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f70257b;

        public x(int i11) {
            this.f70257b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            C34042ye.m75520c(104, Integer.valueOf(this.f70257b));
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$y */
    /* JADX INFO: compiled from: BUGLY */
    public static class y {
        /* JADX INFO: renamed from: b */
        public static Object m73397b(String str, String str2, Object obj) {
            try {
                Field declaredField = Class.forName(str).getDeclaredField(str2);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (ClassNotFoundException e11) {
                e11.printStackTrace();
                return null;
            } catch (IllegalAccessException e12) {
                e12.printStackTrace();
                return null;
            } catch (NoSuchFieldException e13) {
                e13.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public static Object m73396a(String str, Object[] objArr, Class<?>... clsArr) {
            try {
                Class<?> cls = Class.forName(str);
                if (objArr == null) {
                    return cls.newInstance();
                }
                return cls.getConstructor(clsArr).newInstance(objArr);
            } catch (ClassNotFoundException e11) {
                e11.printStackTrace();
                return null;
            } catch (IllegalAccessException e12) {
                e12.printStackTrace();
                return null;
            } catch (InstantiationException e13) {
                e13.printStackTrace();
                return null;
            } catch (NoSuchMethodException e14) {
                e14.printStackTrace();
                return null;
            } catch (InvocationTargetException e15) {
                e15.printStackTrace();
                return null;
            } catch (Exception e16) {
                e16.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public static Object m73398b(String str, String str2, Object[] objArr, Class<?>... clsArr) {
            try {
                Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(null, objArr);
            } catch (ClassNotFoundException e11) {
                e11.printStackTrace();
                return null;
            } catch (IllegalAccessException e12) {
                e12.printStackTrace();
                return null;
            } catch (NoSuchMethodException e13) {
                e13.printStackTrace();
                return null;
            } catch (InvocationTargetException e14) {
                e14.printStackTrace();
                return null;
            } catch (Exception e15) {
                e15.printStackTrace();
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73351a(int i11, String str) {
        m73352a(i11, f70198b, str);
    }

    /* JADX INFO: renamed from: e */
    public static void m73377e() {
        int iMyPid = Process.myPid();
        m73352a(3, f70198b, String.format(Locale.US, "Exit application by kill process[%d]", Integer.valueOf(iMyPid)));
        Process.killProcess(iMyPid);
    }

    /* JADX INFO: renamed from: f */
    public static Activity m73379f() {
        Activity activityM73383h;
        WeakReference<Activity> weakReference = f70215s;
        if (weakReference == null || weakReference.get() == null) {
            int i11 = f70212p;
            if (i11 == 1) {
                activityM73383h = m73383h();
            } else if (i11 != 2) {
                Log.w(f70198b, "Game type has not been set.");
                activityM73383h = m73389k();
            } else {
                activityM73383h = m73385i();
            }
            if (activityM73383h != null) {
                f70215s = new WeakReference<>(activityM73383h);
            }
        }
        WeakReference<Activity> weakReference2 = f70215s;
        if (weakReference2 != null) {
            return weakReference2.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static Context m73381g() {
        Activity activityM73379f;
        WeakReference<Context> weakReference = f70216t;
        if ((weakReference == null || weakReference.get() == null) && (activityM73379f = m73379f()) != null) {
            f70216t = new WeakReference<>(activityM73379f.getApplicationContext());
        }
        WeakReference<Context> weakReference2 = f70216t;
        if (weakReference2 != null) {
            return weakReference2.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static Activity m73383h() {
        try {
            Object objM73398b = y.m73398b(f70211o, "getContext", null, new Class[0]);
            if (objM73398b != null && (objM73398b instanceof Activity)) {
                return (Activity) objM73398b;
            }
        } catch (Exception unused) {
            Log.w(f70198b, "Failed to get activity of Cocos.");
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static Activity m73385i() {
        try {
            Object objM73397b = y.m73397b(f70210n, "currentActivity", null);
            if (objM73397b != null && (objM73397b instanceof Activity)) {
                return (Activity) objM73397b;
            }
        } catch (Exception unused) {
            Log.w(f70198b, "Failed to get activity of Unity.");
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static String m73387j() {
        return "4.0";
    }

    /* JADX INFO: renamed from: k */
    public static Activity m73389k() {
        if (f70218v) {
            return null;
        }
        f70218v = true;
        Activity activityM73383h = m73383h();
        return activityM73383h == null ? m73385i() : activityM73383h;
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$k */
    /* JADX INFO: compiled from: BUGLY */
    public class k implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            C33707i7.m73377e();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i7$n */
    /* JADX INFO: compiled from: BUGLY */
    public class n implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            C34042ye.m75502a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73358a(Runnable runnable) {
        Activity activityM73379f = m73379f();
        if (activityM73379f != null) {
            activityM73379f.runOnUiThread(runnable);
        } else {
            new Thread(runnable).start();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e A[PHI: r10
      0x005e: PHI (r10v2 java.lang.String) = (r10v1 java.lang.String), (r10v1 java.lang.String), (r10v6 java.lang.String) binds: [B:24:0x0056, B:26:0x005c, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    public static void m73367b(int i11, String str, String str2, String str3, boolean z11, Map<String, String> map) {
        String str4;
        try {
            if (str3.startsWith("stack traceback")) {
                str3 = str3.substring(str3.indexOf(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE) + 1, str3.length()).trim();
            }
            int iIndexOf = str3.indexOf(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            if (iIndexOf > 0) {
                str3 = str3.substring(iIndexOf + 1, str3.length());
            }
            int iIndexOf2 = str3.indexOf(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            String strSubstring = iIndexOf2 > 0 ? str3.substring(0, iIndexOf2) : str3;
            int iIndexOf3 = strSubstring.indexOf("]:");
            if (str == null || str.length() == 0) {
                if (iIndexOf3 != -1) {
                    str = strSubstring.substring(0, iIndexOf3 + 1);
                } else {
                    str4 = str2;
                }
                m73358a(new q(i11, str4, str2, str3, map, z11));
            }
        } catch (Throwable unused) {
            if (str == null || str.length() == 0) {
                str4 = str2;
            }
        }
        str4 = str;
        m73358a(new q(i11, str4, str2, str3, map, z11));
    }

    /* JADX INFO: renamed from: c */
    public static HashMap<String, String> m73372c(String str) {
        Exception e11;
        HashMap<String, String> map = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap<String, String> map2 = new HashMap<>();
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map2.put(next, jSONObject.getString(next));
                }
                return map2;
            } catch (Exception e12) {
                e11 = e12;
                map = map2;
                Log.w(f70198b, "Failed to parse extra info. " + e11);
                return map;
            }
        } catch (Exception e13) {
            e11 = e13;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m73376d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith("<Log>")) {
            m73352a(2, f70198b, str);
            return;
        }
        if (str.startsWith("<LogDebug>")) {
            m73352a(1, f70198b, str);
            return;
        }
        if (str.startsWith("<LogInfo>")) {
            m73352a(2, f70198b, str);
            return;
        }
        if (str.startsWith("<LogWarning>")) {
            m73352a(3, f70198b, str);
            return;
        }
        if (str.startsWith("<LogAssert>")) {
            m73352a(3, f70198b, str);
            return;
        }
        if (str.startsWith("<LogError>")) {
            m73352a(4, f70198b, str);
        } else if (str.startsWith("<LogException>")) {
            m73352a(4, f70198b, str);
        } else {
            m73352a(0, f70198b, str);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m73388j(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m73358a(new f(str));
    }

    /* JADX INFO: renamed from: l */
    public static void m73391l(String str) {
        if (!TextUtils.isEmpty(str)) {
            C33597d2.m72767a(str);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m73392m(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m73358a(new a(str));
    }

    /* JADX INFO: renamed from: n */
    public static void m73393n(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m73358a(new b(str));
    }

    /* JADX INFO: renamed from: a */
    public static void m73356a(long j11) {
        long jMax = Math.max(0L, j11);
        Handler handler = f70214r;
        if (handler != null) {
            handler.postDelayed(new k(), jMax);
            return;
        }
        try {
            Thread.sleep(jMax);
            m73377e();
        } catch (InterruptedException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m73382g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m73358a(new c(str));
    }

    /* JADX INFO: renamed from: k */
    public static void m73390k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m73358a(new v(str));
    }

    /* JADX INFO: renamed from: e */
    public static void m73378e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m73358a(new j(str));
    }

    /* JADX INFO: renamed from: h */
    public static void m73384h(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m73358a(new d(str));
    }

    /* JADX INFO: renamed from: i */
    public static void m73386i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m73358a(new e(str));
    }

    /* JADX INFO: renamed from: f */
    public static void m73380f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m73358a(new w(str));
    }

    /* JADX INFO: renamed from: a */
    public static void m73355a(int i11, String str, String str2, String str3, boolean z11, Map<String, String> map) {
        m73358a(new r(i11, str, str2, str3, map, z11));
    }

    /* JADX INFO: renamed from: c */
    public static void m73373c(int i11) {
        m73358a(new h(i11));
    }

    /* JADX INFO: renamed from: a */
    public static void m73363a(String str, String str2, String str3, boolean z11, Map<String, String> map) {
        m73358a(new s(str, str2, str3, map, z11));
    }

    /* JADX INFO: renamed from: c */
    public static void m73374c(String[] strArr) {
        m73358a(new m(strArr));
    }

    /* JADX INFO: renamed from: a */
    public static void m73354a(int i11, String str, String str2, String str3, boolean z11) {
        m73353a(i11, str, str2, str3, (String) null, z11);
    }

    /* JADX INFO: renamed from: b */
    public static void m73368b(long j11) {
        f70213q = j11;
    }

    /* JADX INFO: renamed from: a */
    public static void m73353a(int i11, String str, String str2, String str3, String str4, boolean z11) {
        HashMap<String, String> mapM73372c = m73372c(str4);
        if (i11 == 4) {
            m73363a(str, str2, str3, z11, mapM73372c);
            return;
        }
        if (i11 == 5) {
            m73355a(i11, str, str2, str3, z11, mapM73372c);
        } else {
            if (i11 != 6) {
                m73352a(4, f70198b, "The category of exception posted is unknown: " + String.valueOf(i11));
                return;
            }
            m73367b(i11, str, str2, str3, z11, mapM73372c);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m73366b(int i11) {
        m73358a(new x(i11));
    }

    /* JADX INFO: renamed from: b */
    public static void m73370b(String[] strArr) {
        m73358a(new l(strArr));
    }

    /* JADX INFO: renamed from: b */
    public static void m73369b(String str) {
        m73358a(new p(str));
    }

    /* JADX INFO: renamed from: a */
    public static void m73350a(int i11) {
        f70212p = i11;
    }

    /* JADX INFO: renamed from: a */
    public static void m73357a(CrashHandleListener crashHandleListener) {
        f70217u = crashHandleListener;
    }

    /* JADX INFO: renamed from: a */
    public static void m73361a(String str, String str2, String str3, String str4, String[] strArr, String str5) {
        Context contextM73381g = m73381g();
        if (contextM73381g == null) {
            m73352a(4, f70198b, "Context is null. bugly initialize terminated.");
            return;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C34042ye.m75520c(107, contextM73381g);
            C33652ff.m73064a(101, str);
            C33652ff.m73064a(100, str2);
            if (!TextUtils.isEmpty(str3)) {
                C33652ff.m73064a(103, str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                C33652ff.m73064a(109, str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                C33652ff.m73064a(112, str5);
            }
            m73358a(new t(strArr));
            return;
        }
        m73352a(4, f70198b, "Please input appId and appKey.");
    }

    /* JADX INFO: renamed from: a */
    public static void m73362a(String str, String str2, String str3, String str4, String[] strArr, String str5, boolean z11) {
        Context contextM73381g = m73381g();
        if (contextM73381g == null) {
            m73352a(4, f70198b, "Context is null. bugly initialize terminated.");
            return;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(str3)) {
                C33808n3.m74218g(contextM73381g, str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                C33808n3.m74210e(str4);
            }
            f70214r = new Handler(Looper.getMainLooper());
            m73358a(new u(contextM73381g, str, z11));
            return;
        }
        m73352a(4, f70198b, "Please input appId and appKey.");
    }

    /* JADX INFO: renamed from: a */
    public static void m73364a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        m73358a(new g(strArr));
    }

    /* JADX INFO: renamed from: a */
    public static void m73360a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        m73358a(new i(str, str2));
    }

    /* JADX INFO: renamed from: a */
    public static void m73349a() {
        m73358a(new n());
    }

    /* JADX INFO: renamed from: a */
    public static void m73359a(String str) {
        m73358a(new o(str));
    }

    /* JADX INFO: renamed from: a */
    public static void m73352a(int i11, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (i11 == 0) {
            C33534a2.m72287d(str, str2);
            return;
        }
        if (i11 == 2) {
            C33534a2.m72286c(str, str2);
            return;
        }
        if (i11 == 3) {
            C33534a2.m72288e(str, str2);
        } else if (i11 != 4) {
            C33534a2.m72283a(str, str2);
        } else {
            C33534a2.m72285b(str, str2);
        }
    }
}
