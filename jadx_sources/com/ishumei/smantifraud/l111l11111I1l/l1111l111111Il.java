package com.ishumei.smantifraud.l111l11111I1l;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import android.util.ArraySet;
import android.util.Base64;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.util.Constants;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.bugly.proguard.C33872q4;
import com.tencent.bugly.proguard.C33978va;
import dalvik.system.BaseDexClassLoader;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.zip.Inflater;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l1111l111111Il {
    private static final String l1111l111111Il = "eJy1Wt9P5DYQ/l9WPPQktBHcG1SVDriiVYFbEdpKoHtwkiHrrmOnsbPAnfq/d5xNgpM4u9k4vOyheH5883k8Htv39HO2hrfZ2QwYJMDV7HgWMvLjB36JCNvQtSffpILEu4LXJVGrGyrV0ddaNgG1EhEKK+GrjPIYv0ka44dfPt38QzbEY4TH3nbsHAdTkpFkdvb0/Xim3lKYnZ38d1xBoFwu17GBgPAoEzTySJp6X9KU0ZAoKviShGsSwy3h+JuZKGJQCy4VYQyiUkq+I1qUkHJFmacDMQGhdzWzoZIpWj2xoBLS8wtulplIIVO08GVieXfd5WI3PTM9ONeD85LXGtppC9rp5NDcwR4PxA/hFkobf5qJDY0g83xQCrXlkQ9hnkEriHbK3VT6oeAKE9S73P57D1KwDWSHR1YanJcG5y2DQwONYGPLIIWLLl0J/uY9VH/Zk/oKNjSEReSyuhCDLVUcMCz2kNe3ojiu4g0YWN6tZPDMIFTerYjoM21ioPKuUqxIeLTF3OA9yG0FBdfHVTlkmC8+YeA4yRxBQHSAp5iJgLCh2XxdSHcql3JL5cUHZG6Wc4TfV5NDnA+qehLmPucczWLhxioUgpRmLd5Vim05gzgUkWsXIA+o77wbIA4JmV4JLlD8rQlnNOiQ8ufe6Rm4ZRpyi6213q0BYbYTM028loF9e0NfNOk6niCacnBcJIby2Ciwi0G4U3UxhoJztsArhNaqi1mpaNLYXUvZQe1LubwH9i/mhKdRsanQyIAVisSrKMNIIOOEGbvUEn8BPb6+fcAeGcvkcESo5F37twWwD8CUyjwYSZOfB+UymBoUZgt16mgWaMAVgFM70wQwtpUJVEJCC4yA5aCEUCvvovrrS0RS1a29UZTh2nGhIgTGmLChGEzGJZq4EdsyY0LpGjIlhwALVxiIba9sp6oiCnQlA95EJ7jp8rIwZ6TuPoif/rI1RbXwvBG5LQgUdUr0G8rh5C5PgmJk9CSjP6d0t8IYm/U0DGnkxIpPE+yBKGHuzBRgnLjpBTP6gIMrPnXi5w7Ui8jW3/DwTpRw4qcA48RPLxgnfjhJYEqO7kgCzjxpUFNy1QQ1li9JE8d8whSfIpcKIK5rbbo8KuA455EByTWHakBTcTRN/tBEunVr2EjKMKNYHF3bRunWtdmBjOUlXYUi57Yrm8GAiublsrRS8bLYQ8OLvWnECuS90Gfq/Y0/lsb9loQTtItSNs4RQ537/uLKxW2Gfke4vd+qDWUWzY2Krizbjeze5ysYyeSFK5XooPhmd12F0nX8sFU6gEs8eo7y5Nd6w51RfVxw23ppvAqEZlB39c0LoEPvGwkeXRzxfGHMHYcMCc/6JqDOsp5iibr3IHOmHC5etQ+pD2fjMOgRv1QfXB711T8nARvjk0o98LVQ33uBb179gGLEthWw8nToGQfkxskKP6o8MgO8GuCrsHOwL8HjQ50xItWaixduvyPouOw5P6KVP7SV7jWB7XKw1/qIS8Ly9USOB780TJSgH3feoAZCMCD2C4EApNKYxsO5QAsVJMtNRm3lMqNKn0vPH/f0N9W1RqU5rzRnu155zGoXRYyOJRiVr1OpF3kujRuc3rBq4aNK+ryxOrvhdDWsUcSp1JVq/MTUfgbBt6X5++CwgPpmgydAxk/HHWoPmYlvXEveYkOJRoZOhlXpA+LI4N8cF0ol8Wca4S6yc2Yq0fut5nm/RB1rLSIkDur/K/H+Sb/XLIFHuGgWxQNRz2VizUzLP8r2ihizU8kIOd8iML4hhHkDgv2K8rVZ2vXTAAqH+k0rISlJqVe+We4r8sL2CjiwmtuQPVPWOJsXVYwK73fKGk8lv1JO1W87t5QG9f1F7XPT+ekkzg+Gs6vsfm5sbUFOWdShyHxWu9ASzalqI36ahK8KTYezA9G0N1YLFD0414MmkO//A9zgF+k=";

    /* JADX INFO: renamed from: com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il$1 */
    public static /* synthetic */ class C92701 {
        public static Map<String, Integer> l1111l111111Il() {
            HashMap map = new HashMap();
            Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
            if (context != null) {
                try {
                    Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (intentRegisterReceiver != null) {
                        int intExtra = intentRegisterReceiver.getIntExtra("status", 0);
                        int intExtra2 = intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, 0);
                        int intExtra3 = intentRegisterReceiver.getIntExtra("scale", 100);
                        int intExtra4 = intentRegisterReceiver.getIntExtra("temperature", 0);
                        int intExtra5 = intentRegisterReceiver.getIntExtra("voltage", 0);
                        map.put("status", Integer.valueOf(intExtra));
                        map.put(FirebaseAnalytics.Param.LEVEL, Integer.valueOf(intExtra2));
                        map.put("scale", Integer.valueOf(intExtra3));
                        map.put("temp", Integer.valueOf(intExtra4));
                        map.put("vol", Integer.valueOf(intExtra5));
                    }
                } catch (Exception unused) {
                }
            }
            return map;
        }
    }

    /* JADX INFO: renamed from: com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il$l1111l111111Il, reason: collision with other inner class name */
    public static class C46974l1111l111111Il {
        private static int l1111l111111Il = 1;
        private static int l111l11111I1l = 3;
        private static int l111l11111lIl = 2;
        private String l111l11111Il;
        private String l111l1111l1Il;
        private List<String> l111l1111lI1l;
        private int l111l1111lIl;
        private String l111l1111llIl;

        private C46974l1111l111111Il() {
        }

        public final String l1111l111111Il() {
            return this.l111l1111l1Il;
        }

        public final List<String> l111l11111I1l() {
            return this.l111l1111lI1l;
        }

        public final String l111l11111lIl() {
            return this.l111l1111llIl;
        }

        public /* synthetic */ C46974l1111l111111Il(byte b11) {
            this();
        }

        private String l111l1111l1Il() {
            return this.l111l11111Il;
        }

        public final void l1111l111111Il(int i11) {
            this.l111l1111lIl = i11;
        }

        public final void l111l11111I1l(String str) {
            this.l111l1111llIl = str;
        }

        public final int l111l11111Il() {
            return this.l111l1111lIl;
        }

        public final void l111l11111lIl(String str) {
            this.l111l1111l1Il = str;
        }

        public final void l1111l111111Il(String str) {
            this.l111l11111Il = str;
        }

        public final void l1111l111111Il(List<String> list) {
            this.l111l1111lI1l = list;
        }
    }

    private static int l1111l111111Il(boolean z11) {
        return z11 ? 1 : 0;
    }

    public static boolean l11l111l11Il() {
        try {
            Class.forName("de.robv.android.xposed.XposedHelpers");
        } catch (Throwable th2) {
            String[] strArrL1111l111111Il = l1111l111111Il(th2);
            if (strArrL1111l111111Il != null) {
                for (String str : strArrL1111l111111Il) {
                    if (str.contains("de.robvf.android.xposed.XposedHelpers")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static Map<String, Object> l1111l111111Il() {
        String strL1111l111111Il;
        HashMap map = new HashMap();
        try {
            ArrayList<C46974l1111l111111Il> arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(l11l111l1I1l());
            byte b11 = 0;
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    String string = jSONObject.getString("key");
                    String string2 = jSONObject.getString("clazz");
                    String string3 = jSONObject.getString(FirebaseAnalytics.Param.METHOD);
                    JSONArray jSONArray2 = jSONObject.getJSONArray("param");
                    int i12 = jSONObject.getInt("type");
                    C46974l1111l111111Il c46974l1111l111111Il = new C46974l1111l111111Il(b11);
                    c46974l1111l111111Il.l1111l111111Il(string);
                    c46974l1111l111111Il.l111l11111lIl(string2);
                    c46974l1111l111111Il.l111l11111I1l(string3);
                    c46974l1111l111111Il.l1111l111111Il(i12);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < jSONArray2.length(); i13++) {
                        arrayList2.add(jSONArray2.getString(i13));
                    }
                    c46974l1111l111111Il.l1111l111111Il(arrayList2);
                    arrayList.add(c46974l1111l111111Il);
                } catch (Exception unused) {
                }
            }
            for (C46974l1111l111111Il c46974l1111l111111Il2 : arrayList) {
                try {
                    Class<?> cls = Class.forName(c46974l1111l111111Il2.l1111l111111Il().replace("/", C33978va.f72339h));
                    int iL111l11111Il = c46974l1111l111111Il2.l111l11111Il();
                    List<String> listL111l11111I1l = c46974l1111l111111Il2.l111l11111I1l();
                    if (iL111l11111Il != 3) {
                        if (Modifier.isNative(((listL111l11111I1l == null || listL111l11111I1l.size() == 0) ? cls.getDeclaredMethod(c46974l1111l111111Il2.l111l11111lIl(), new Class[0]) : cls.getDeclaredMethod(c46974l1111l111111Il2.l111l11111lIl(), l1111l111111Il(listL111l11111I1l))).getModifiers())) {
                            strL1111l111111Il = c46974l1111l111111Il2.l1111l111111Il();
                            map.put(strL1111l111111Il, 1);
                        }
                    } else if (Modifier.isNative(((listL111l11111I1l == null || listL111l11111I1l.size() == 0) ? cls.getConstructor(new Class[0]) : cls.getConstructor(l1111l111111Il(listL111l11111I1l))).getModifiers())) {
                        strL1111l111111Il = c46974l1111l111111Il2.l1111l111111Il();
                        map.put(strL1111l111111Il, 1);
                    }
                } catch (Exception unused2) {
                }
            }
        } catch (Exception unused3) {
        }
        return map;
    }

    public static Set<Object> l111l11111I1l() {
        HashSet hashSet = new HashSet();
        try {
            Class<?> clsLoadClass = ClassLoader.getSystemClassLoader().loadClass("de.robv.android.xposed.XposedHelpers");
            l1111l111111Il(clsLoadClass, "fieldCache", hashSet);
            l1111l111111Il(clsLoadClass, "methodCache", hashSet);
            l1111l111111Il(clsLoadClass, "constructorCache", hashSet);
        } catch (Throwable unused) {
        }
        return hashSet;
    }

    public static Map<String, Object> l111l11111Il() {
        boolean z11;
        Field field;
        Class<?> clsLoadClass;
        Method declaredMethod;
        HashMap map = new HashMap();
        try {
            Field[] declaredFields = ClassLoader.getSystemClassLoader().loadClass("de.robv.android.xposed.XposedBridge").getDeclaredFields();
            int length = declaredFields.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    field = null;
                    break;
                }
                field = declaredFields[i11];
                if ("sHookedMethodCallbacks".equals(field.getName())) {
                    z11 = false;
                    break;
                }
                if ("hookedMethodCallbacks".equals(field.getName())) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (field != null) {
                field.setAccessible(true);
                Map map2 = (Map) field.get(null);
                if (z11) {
                    clsLoadClass = null;
                    declaredMethod = null;
                } else {
                    clsLoadClass = ClassLoader.getSystemClassLoader().loadClass("de.robv.android.xposed.XposedBridge$CopyOnWriteSortedSet");
                    declaredMethod = clsLoadClass.getDeclaredMethod("getSnapshot", new Class[0]);
                    declaredMethod.setAccessible(true);
                }
                for (Object obj : map2.entrySet()) {
                    String string = ((Map.Entry) obj).getKey().toString();
                    Set hashSet = (Set) map.get(string);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(string, hashSet);
                    }
                    Object value = ((Map.Entry) obj).getValue();
                    Object[] array = (clsLoadClass == null || !clsLoadClass.isInstance(value)) ? TreeSet.class.isInstance(value) ? ((TreeSet) value).toArray() : null : (Object[]) declaredMethod.invoke(value, new Object[0]);
                    if (array != null) {
                        for (Object obj2 : array) {
                            hashSet.add(obj2.getClass().getName());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    public static boolean l111l11111lIl() {
        try {
            return l1111l111111Il("XposedBridge.jar");
        } catch (Exception unused) {
            return false;
        }
    }

    public static String l111l1111lI1l() {
        StringBuilder sb2 = new StringBuilder();
        try {
            Method method = Class.forName("android.os.ServiceManager").getMethod("getService", String.class);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, FirebaseAnalytics.Param.LOCATION);
            Object objInvoke2 = method.invoke(null, HintConstants.AUTOFILL_HINT_PHONE);
            sb2.append("locateServiceName:");
            sb2.append(objInvoke.getClass().getName());
            sb2.append("|");
            sb2.append("phoneServiceName:");
            sb2.append(objInvoke2.getClass().getName());
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    public static String l111l1111lIl() {
        ArrayList arrayList = new ArrayList();
        try {
            Field declaredField = Class.forName("de.robv.android.xposed.XposedInit").getDeclaredField("loadedPackagesInProcess");
            declaredField.setAccessible(true);
            arrayList.addAll((Set) declaredField.get(null));
        } catch (Throwable unused) {
        }
        return TextUtils.join("|", arrayList);
    }

    public static String l111l1111llIl() {
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return "";
        }
        return String.format(Locale.US, "%d%d%d%d%d%d%d", Integer.valueOf(l1111l111111Il(context.checkSelfPermission(C33872q4.f71536c) == 0)), Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)), Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.WRITE_SETTINGS") == 0)), Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0)), Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)), Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0)), Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0)));
    }

    public static int l111l11IlIlIl() {
        if (Build.VERSION.SDK_INT < 26) {
            return 0;
        }
        try {
            FileDescriptor fd2 = new FileOutputStream(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il.getApplicationInfo().dataDir + File.separator + "tmp.data").getFD();
            Field declaredField = fd2.getClass().getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            int iIntValue = ((Integer) declaredField.get(fd2)).intValue();
            StringBuilder sb2 = new StringBuilder("/proc/self/fd/");
            sb2.append(iIntValue);
            return new File(Files.readSymbolicLink(Paths.get(sb2.toString(), new String[0])).toString().replace("tmp.data", "..")).canRead() ? 1 : 0;
        } catch (Exception unused) {
            return 2;
        }
    }

    public static String l11l1111I11l() {
        if (Build.VERSION.SDK_INT >= 28) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName("android.app.ApplicationLoaders");
            Field declaredField = cls.getDeclaredField("gApplicationLoaders");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = cls.getDeclaredField("mLoaders");
            declaredField2.setAccessible(true);
            for (Map.Entry entry : ((Map) declaredField2.get(obj)).entrySet()) {
                String str = (String) entry.getKey();
                try {
                    Class.forName("com.elderdrivers.riru.edxp.config.EdXpConfigGlobal", false, (ClassLoader) entry.getValue());
                    arrayList.add(str);
                } catch (ClassNotFoundException unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        return TextUtils.join("|", arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.pm.PackageManager] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.content.pm.ApplicationInfo, android.content.pm.PackageItemInfo] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:49:0x0068
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.util.List<java.lang.String> l11l1111I1l() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            android.content.Context r2 = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il
            if (r2 != 0) goto L10
            goto Lbd
        L10:
            r3 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L63
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L63
            java.lang.String r6 = "/proc/self/maps"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L63
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L63
        L1d:
            java.lang.String r3 = r4.readLine()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L5a
            if (r3 == 0) goto L56
            java.lang.String r5 = "/data/app/"
            int r5 = r3.indexOf(r5)     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L3e
            r6 = -1
            if (r5 != r6) goto L2d
            goto L1d
        L2d:
            java.lang.String r7 = "-"
            int r7 = r3.indexOf(r7, r5)     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L3e
            if (r7 != r6) goto L41
            java.lang.String r6 = "/"
            int r7 = r5 + 10
            int r7 = r3.indexOf(r6, r7)     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L3e
            goto L41
        L3e:
            r0 = move-exception
            r3 = r4
            goto L5d
        L41:
            int r5 = r5 + 10
            java.lang.String r3 = r3.substring(r5, r7)     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L3e
            java.lang.String r5 = r2.getPackageName()     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L3e
            boolean r5 = r3.equals(r5)     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L3e
            if (r5 == 0) goto L52
            goto L1d
        L52:
            r1.add(r3)     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L3e
            goto L1d
        L56:
            r4.close()     // Catch: java.io.IOException -> L68
            goto L68
        L5a:
            r3 = r4
            goto L63
        L5c:
            r0 = move-exception
        L5d:
            if (r3 == 0) goto L62
            r3.close()     // Catch: java.io.IOException -> L62
        L62:
            throw r0
        L63:
            if (r3 == 0) goto L68
            r3.close()     // Catch: java.io.IOException -> L68
        L68:
            java.lang.String r3 = "xposedmodule"
            java.lang.String r4 = "xposedminversion"
            java.lang.String r5 = "xposeddescription"
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> Lbd
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> Lbd
        L79:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Exception -> Lbd
            if (r6 == 0) goto Lbd
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Exception -> Lbd
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lbd
            r7 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r7 = r2.getApplicationInfo(r6, r7)     // Catch: java.lang.Exception -> L79
            android.os.Bundle r8 = r7.metaData     // Catch: java.lang.Exception -> L79
            if (r8 != 0) goto L90
            goto L79
        L90:
            java.lang.Object r9 = r8.get(r3)     // Catch: java.lang.Exception -> L79
            java.lang.Object r10 = r8.get(r4)     // Catch: java.lang.Exception -> L79
            java.lang.Object r8 = r8.get(r5)     // Catch: java.lang.Exception -> L79
            if (r9 == 0) goto L79
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L79
            r12 = 29
            if (r11 < r12) goto La7
            java.lang.String r7 = ""
            goto Laf
        La7:
            java.lang.CharSequence r7 = r7.loadLabel(r2)     // Catch: java.lang.Exception -> L79
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L79
        Laf:
            java.lang.String r11 = ","
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7, r9, r10, r8}     // Catch: java.lang.Exception -> L79
            java.lang.String r6 = android.text.TextUtils.join(r11, r6)     // Catch: java.lang.Exception -> L79
            r0.add(r6)     // Catch: java.lang.Exception -> L79
            goto L79
        Lbd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l11l1111I1l():java.util.List");
    }

    public static Map<String, Object> l11l1111I1ll() {
        ActivityManager activityManager;
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap(3);
        hashSet.add("user.zposed.app");
        hashSet.add("user.zposed.system");
        for (ActivityManager.RunningServiceInfo runningServiceInfo : activityManager.getRunningServices(Integer.MAX_VALUE)) {
            if (hashSet.contains(runningServiceInfo.process)) {
                map.put(runningServiceInfo.process, 1);
            }
        }
        return map;
    }

    public static int l11l1111Il() {
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir());
        sb2.append(File.separator);
        sb2.append("exp_base.apk");
        return new File(sb2.toString()).exists() ? 1 : 0;
    }

    public static List<String> l11l1111Il1l() {
        String[] strArr = {"java.lang.Throwable", "at com.ishumei", "at android.view.View", "at android.os.Handler", "at android.os.Looper", "at android.app.ActivityThread", "at java.lang.reflect.Method", "at com.android.internal.os"};
        String[] strArrL1111l111111Il = l1111l111111Il(new Throwable());
        ArrayList arrayList = new ArrayList();
        if (strArrL1111l111111Il != null) {
            for (String str : strArrL1111l111111Il) {
                int i11 = 0;
                while (true) {
                    if (i11 >= 8) {
                        arrayList.add(str.trim());
                        break;
                    }
                    if (str.trim().startsWith(strArr[i11])) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return arrayList;
    }

    public static List<String> l11l1111Ill() {
        String line;
        try {
            ArrayList arrayList = new ArrayList();
            Process processExec = Runtime.getRuntime().exec(new String[]{"sh", "-c", "set"});
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                line = bufferedReader.readLine();
                if (TextUtils.isEmpty(line)) {
                    break;
                }
                if (line.contains("V_SO_PATH") || line.contains("V_SO_PATH") || line.contains("V_REPLACE") || line.contains("VMOS_ROOT_DIR")) {
                    arrayList.add(line);
                }
            }
            for (String line2 = new BufferedReader(new InputStreamReader(processExec.getErrorStream())).readLine(); !TextUtils.isEmpty(line2); line2 = bufferedReader.readLine()) {
                if (line2.contains("libva.so")) {
                    arrayList.add(line);
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String l11l1111lIIl() {
        ArrayList arrayList = new ArrayList();
        try {
            Field declaredField = Class.forName("de.robv.android.xposed.XposedInit").getDeclaredField("loadedModules");
            declaredField.setAccessible(true);
            Iterator it = ((ArraySet) declaredField.get(null)).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
        } catch (Throwable unused) {
        }
        return TextUtils.join("|", arrayList);
    }

    private static String l11l111l1I1l() {
        int iInflate;
        byte[] bArrDecode = Base64.decode(l1111l111111Il, 0);
        try {
            byte[] bArr = new byte[4096];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArrDecode.length);
            Inflater inflater = new Inflater();
            inflater.setInput(bArrDecode, 0, bArrDecode.length);
            while (!inflater.finished() && (iInflate = inflater.inflate(bArr)) > 0) {
                byteArrayOutputStream.write(bArr, 0, iInflate);
            }
            inflater.end();
            return new String(byteArrayOutputStream.toByteArray());
        } catch (Exception unused) {
            return "";
        }
    }

    public static List<String> l11l111l1lll() {
        try {
            String[] list = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il.getAssets().list("ghplugin");
            if (list != null) {
                return Arrays.asList(list);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map<String, Object> l11l11IlIIll() {
        Location location = new Location("gps");
        if (location.getLongitude() < 1.0E-4d || location.getLatitude() < 1.0E-4d) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(FirebaseAnalytics.Param.LOCATION, location.toString());
        map.put("lo", Double.valueOf(location.getLongitude()));
        map.put("la", Double.valueOf(location.getLatitude()));
        return map;
    }

    private static void l1111l111111Il(Class<?> cls, String str, Set<Object> set) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            set.addAll(((Map) declaredField.get(null)).keySet());
        } catch (Throwable unused) {
        }
    }

    public static Map<String, Object> l111l1111l1Il() {
        String str;
        String string;
        HashMap map = new HashMap();
        try {
            Object objInvoke = Class.forName("android.content.Context").getDeclaredMethod("getSystemService", String.class).invoke(com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il, "accessibility");
            Method declaredMethod = objInvoke.getClass().getDeclaredMethod(Constants.ENABLE_DISABLE, new Class[0]);
            Method declaredMethod2 = objInvoke.getClass().getDeclaredMethod("getEnabledAccessibilityServiceList", Integer.TYPE);
            Object objInvoke2 = declaredMethod.invoke(objInvoke, new Object[0]);
            List list = (List) declaredMethod2.invoke(objInvoke, -1);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Object objInvoke3 = obj.getClass().getDeclaredMethod("getId", new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke3 == null) {
                    Object objInvoke4 = obj.getClass().getDeclaredMethod("getResolveInfo", new Class[0]).invoke(obj, new Object[0]);
                    if (objInvoke4 == null) {
                        string = obj.toString();
                    } else {
                        string = objInvoke4.toString();
                    }
                    arrayList.add(string);
                } else {
                    arrayList.add((String) objInvoke3);
                }
            }
            if (((Boolean) objInvoke2).booleanValue()) {
                str = "1";
            } else {
                str = "0";
            }
            map.put(BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, str);
            map.put(NotificationCompat.CATEGORY_SERVICE, arrayList);
            map.put("suc", "1");
            return map;
        } catch (Throwable th2) {
            map.put("e", th2.getMessage());
            map.put("suc", OtcAd.KYC_NOT_PASS);
            return map;
        }
    }

    private static boolean l1111l111111Il(ClassLoader classLoader, String str) {
        if (classLoader == null || !(classLoader instanceof BaseDexClassLoader)) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("dalvik.system.DexPathList");
            Method method = Class.forName("dalvik.system.DexPathList$Element").getMethod("toString", null);
            Field declaredField = cls.getDeclaredField("dexElements");
            declaredField.setAccessible(true);
            Field declaredField2 = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField2.setAccessible(true);
            Object[] objArr = (Object[]) declaredField.get(declaredField2.get(classLoader));
            for (Object obj : objArr) {
                String str2 = (String) method.invoke(obj, null);
                if (str2 != null && str2.contains(str)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean l1111l111111Il(String str) {
        try {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            if (l1111l111111Il(systemClassLoader, str) || l1111l111111Il(systemClassLoader.getParent(), str)) {
                return true;
            }
            ClassLoader classLoader = l1111l111111Il.class.getClassLoader();
            return l1111l111111Il(classLoader, str) || l1111l111111Il(classLoader.getParent(), str);
        } catch (Exception unused) {
            return false;
        }
    }

    private static Class[] l1111l111111Il(List<String> list) throws ClassNotFoundException {
        Class<?> cls;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            switch (str) {
                case "double":
                    cls = Double.TYPE;
                    break;
                case "int":
                    cls = Integer.TYPE;
                    break;
                case "byte":
                    cls = Byte.TYPE;
                    break;
                case "char":
                    cls = Character.TYPE;
                    break;
                case "long":
                    cls = Long.TYPE;
                    break;
                case "boolean":
                    cls = Boolean.TYPE;
                    break;
                case "float":
                    cls = Float.TYPE;
                    break;
                case "short":
                    cls = Short.TYPE;
                    break;
                default:
                    cls = Class.forName(str);
                    break;
            }
            arrayList.add(cls);
        }
        Class[] clsArr = new Class[arrayList.size()];
        arrayList.toArray(clsArr);
        return clsArr;
    }

    private static String[] l1111l111111Il(Throwable th2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th2.printStackTrace(new PrintStream(byteArrayOutputStream));
            return byteArrayOutputStream.toString().split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        } catch (Throwable unused) {
            return null;
        }
    }
}
