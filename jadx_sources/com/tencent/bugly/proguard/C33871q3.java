package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.q3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33871q3 {

    /* JADX INFO: renamed from: e */
    public static C33871q3 f71519e = null;

    /* JADX INFO: renamed from: f */
    public static final String f71520f = "crashrecord";

    /* JADX INFO: renamed from: g */
    public static final int f71521g = 2;

    /* JADX INFO: renamed from: h */
    public static final int f71522h = 86400000;

    /* JADX INFO: renamed from: i */
    public static final int f71523i = 86400000;

    /* JADX INFO: renamed from: j */
    public static final long f71524j = System.currentTimeMillis();

    /* JADX INFO: renamed from: a */
    public Context f71525a;

    /* JADX INFO: renamed from: d */
    public SharedPreferences f71528d;

    /* JADX INFO: renamed from: c */
    public Map<Integer, Map<String, C33850p3>> f71527c = new HashMap();

    /* JADX INFO: renamed from: b */
    public String f71526b = C33765l2.m73827s().f70745f;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.q3$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f71529b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f71530c;

        @Override // java.lang.Runnable
        public void run() {
            C33850p3 c33850p3;
            C33765l2 c33765l2;
            try {
                if (TextUtils.isEmpty(C33871q3.this.f71526b)) {
                    return;
                }
                List<C33850p3> listM74660c = C33871q3.this.m74660c(this.f71529b);
                if (listM74660c == null) {
                    listM74660c = new ArrayList();
                }
                if (C33871q3.this.f71527c.get(Integer.valueOf(this.f71529b)) == null) {
                    C33871q3.this.f71527c.put(Integer.valueOf(this.f71529b), new HashMap());
                }
                if (C33871q3.this.f71527c.get(Integer.valueOf(this.f71529b)).get(C33871q3.this.f71526b) == null) {
                    c33850p3 = new C33850p3();
                    c33850p3.f71361b = this.f71529b;
                    c33850p3.f71367h = C33871q3.f71524j;
                    c33850p3.f71362c = C33871q3.this.f71526b;
                    c33850p3.f71366g = C33765l2.m73827s().f70714F;
                    synchronized (C33765l2.class) {
                        c33765l2 = C33765l2.f70700C0;
                    }
                    c33850p3.f71365f = c33765l2.f70755k;
                    c33850p3.f71363d = System.currentTimeMillis();
                    c33850p3.f71364e = this.f71530c;
                    C33871q3.this.f71527c.get(Integer.valueOf(this.f71529b)).put(C33871q3.this.f71526b, c33850p3);
                } else {
                    c33850p3 = C33871q3.this.f71527c.get(Integer.valueOf(this.f71529b)).get(C33871q3.this.f71526b);
                    c33850p3.f71364e = this.f71530c;
                }
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (C33850p3 c33850p4 : listM74660c) {
                    if (C33871q3.m74654c(c33850p4, c33850p3)) {
                        c33850p4.f71364e = c33850p3.f71364e;
                        z11 = true;
                    }
                    if (C33871q3.m74655d(c33850p4, c33850p3)) {
                        arrayList.add(c33850p4);
                    }
                }
                listM74660c.removeAll(arrayList);
                if (!z11) {
                    listM74660c.add(c33850p3);
                }
                C33871q3.this.m74657a(this.f71529b, listM74660c);
            } catch (Exception unused) {
                C34012x4.m75437b("saveCrashRecord failed", new Object[0]);
            }
        }

        public a(int i11, int i12) {
            this.f71529b = i11;
            this.f71530c = i12;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.q3$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f71532b;

        public b(int i11) {
            this.f71532b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zM74659b = C33871q3.this.m74659b(this.f71532b);
            C33871q3.this.f71528d.edit().putBoolean(this.f71532b + "_" + C33871q3.this.f71526b, !zM74659b).commit();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m74654c(C33850p3 c33850p3, C33850p3 c33850p4) {
        String str;
        return c33850p3.f71367h == c33850p4.f71367h && (str = c33850p3.f71362c) != null && str.equalsIgnoreCase(c33850p4.f71362c);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m74655d(C33850p3 c33850p3, C33850p3 c33850p4) {
        String str = c33850p3.f71365f;
        if (str != null && !str.equalsIgnoreCase(c33850p4.f71365f)) {
            return true;
        }
        String str2 = c33850p3.f71366g;
        return !(str2 == null || str2.equalsIgnoreCase(c33850p4.f71366g)) || c33850p3.f71364e <= 0;
    }

    public C33871q3(Context context) {
        this.f71525a = context;
        this.f71528d = context.getSharedPreferences(f71520f, 0);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m74659b(int i11) {
        try {
            try {
                List<C33850p3> listM74660c = m74660c(i11);
                if (listM74660c == null) {
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (C33850p3 c33850p3 : listM74660c) {
                    String str = c33850p3.f71362c;
                    if (str != null && str.equalsIgnoreCase(this.f71526b) && c33850p3.f71364e > 0) {
                        arrayList.add(c33850p3);
                    }
                    if (c33850p3.f71363d + 86400000 < jCurrentTimeMillis) {
                        arrayList2.add(c33850p3);
                    }
                }
                Collections.sort(arrayList);
                if (arrayList.size() >= 2) {
                    if (arrayList.size() <= 0 || ((C33850p3) arrayList.get(arrayList.size() - 1)).f71363d + 86400000 >= jCurrentTimeMillis) {
                        return true;
                    }
                    listM74660c.clear();
                    m74657a(i11, listM74660c);
                    return false;
                }
                listM74660c.removeAll(arrayList2);
                m74657a(i11, listM74660c);
                return false;
            } catch (Exception unused) {
                C34012x4.m75437b("isFrequentCrash failed", new Object[0]);
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX INFO: renamed from: c */
    public final synchronized <T extends List<?>> T m74660c(int i11) {
        ObjectInputStream objectInputStream;
        try {
            File file = new File(this.f71525a.getDir(f71520f, 0), i11 + "");
            ?? Exists = file.exists();
            try {
                if (Exists == 0) {
                    return null;
                }
                try {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    try {
                        T t11 = (T) objectInputStream.readObject();
                        objectInputStream.close();
                        return t11;
                    } catch (IOException unused) {
                        C34012x4.m75442d("open record file error", new Object[0]);
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        return null;
                    } catch (ClassNotFoundException unused2) {
                        C34012x4.m75442d("get object error", new Object[0]);
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        return null;
                    }
                } catch (IOException unused3) {
                    objectInputStream = null;
                } catch (ClassNotFoundException unused4) {
                    objectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    Exists = 0;
                    if (Exists != 0) {
                        Exists.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused5) {
            C34012x4.m75437b("readCrashRecord error", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C33871q3 m74645a(Context context) {
        try {
            if (f71519e == null) {
                f71519e = new C33871q3(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f71519e;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C33871q3 m74644a() {
        return f71519e;
    }

    /* JADX INFO: renamed from: a */
    public void m74656a(int i11, int i12) {
        C33784m0.m74004c().m74006a(new a(i11, i12));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056 A[Catch: all -> 0x0036, Exception -> 0x005a, TryCatch #1 {Exception -> 0x005a, blocks: (B:7:0x0006, B:11:0x0032, B:27:0x0056, B:28:0x0059, B:25:0x0050), top: B:36:0x0006, outer: #2 }] */
    /* JADX INFO: renamed from: a */
    public final synchronized <T extends List<?>> void m74657a(int i11, T t11) {
        ObjectOutputStream objectOutputStream;
        Throwable th2;
        IOException e11;
        if (t11 == null) {
            return;
        }
        try {
            try {
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(this.f71525a.getDir(f71520f, 0), i11 + "")));
                try {
                    try {
                        objectOutputStream.writeObject(t11);
                        objectOutputStream.close();
                    } catch (IOException e12) {
                        e11 = e12;
                        e11.printStackTrace();
                        C34012x4.m75442d("open record file error", new Object[0]);
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (objectOutputStream != null) {
                        objectOutputStream.close();
                    }
                    throw th2;
                }
            } catch (IOException e13) {
                objectOutputStream = null;
                e11 = e13;
            } catch (Throwable th4) {
                objectOutputStream = null;
                th2 = th4;
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                throw th2;
            }
        } catch (Exception unused) {
            C34012x4.m75437b("writeCrashRecord error", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m74658a(int i11) {
        boolean z11;
        z11 = true;
        try {
            z11 = this.f71528d.getBoolean(i11 + "_" + this.f71526b, true);
            C33784m0.m74004c().m74006a(new b(i11));
        } catch (Exception unused) {
            C34012x4.m75437b("canInit error", new Object[0]);
            return z11;
        }
        return z11;
    }
}
