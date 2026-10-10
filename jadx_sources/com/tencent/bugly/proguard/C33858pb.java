package com.tencent.bugly.proguard;

import android.util.Log;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.pb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33858pb {

    /* JADX INFO: renamed from: a */
    public static b f71385a;

    /* JADX INFO: renamed from: b */
    public static b f71386b;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pb$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements b {
        @Override // com.tencent.bugly.proguard.C33858pb.b
        /* JADX INFO: renamed from: a */
        public void mo74523a(String str, String str2, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                str2 = String.format(str2, objArr);
            }
            Log.d(str, str2);
        }

        @Override // com.tencent.bugly.proguard.C33858pb.b
        /* JADX INFO: renamed from: b */
        public void mo74525b(String str, String str2, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                str2 = String.format(str2, objArr);
            }
            Log.w(str, str2);
        }

        @Override // com.tencent.bugly.proguard.C33858pb.b
        /* JADX INFO: renamed from: c */
        public void mo74526c(String str, String str2, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                str2 = String.format(str2, objArr);
            }
            Log.e(str, str2);
        }

        @Override // com.tencent.bugly.proguard.C33858pb.b
        /* JADX INFO: renamed from: d */
        public void mo74527d(String str, String str2, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                str2 = String.format(str2, objArr);
            }
            Log.v(str, str2);
        }

        @Override // com.tencent.bugly.proguard.C33858pb.b
        /* JADX INFO: renamed from: e */
        public void mo74528e(String str, String str2, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                str2 = String.format(str2, objArr);
            }
            Log.i(str, str2);
        }

        @Override // com.tencent.bugly.proguard.C33858pb.b
        /* JADX INFO: renamed from: a */
        public void mo74524a(String str, Throwable th2, String str2, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            Log.e(str, str2 + "  " + Log.getStackTraceString(th2));
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pb$b */
    /* JADX INFO: compiled from: BUGLY */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo74523a(String str, String str2, Object... objArr);

        /* JADX INFO: renamed from: a */
        void mo74524a(String str, Throwable th2, String str2, Object... objArr);

        /* JADX INFO: renamed from: b */
        void mo74525b(String str, String str2, Object... objArr);

        /* JADX INFO: renamed from: c */
        void mo74526c(String str, String str2, Object... objArr);

        /* JADX INFO: renamed from: d */
        void mo74527d(String str, String str2, Object... objArr);

        /* JADX INFO: renamed from: e */
        void mo74528e(String str, String str2, Object... objArr);
    }

    /* JADX INFO: renamed from: a */
    public static void m74516a(b bVar) {
        f71386b = bVar;
    }

    static {
        a aVar = new a();
        f71385a = aVar;
        f71386b = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static b m74515a() {
        return f71386b;
    }

    /* JADX INFO: renamed from: b */
    public static void m74519b(String str, String str2, Object... objArr) {
        b bVar = f71386b;
        if (bVar != null) {
            bVar.mo74526c(str, str2, objArr);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m74520c(String str, String str2, Object... objArr) {
        b bVar = f71386b;
        if (bVar != null) {
            bVar.mo74528e(str, str2, objArr);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m74521d(String str, String str2, Object... objArr) {
        b bVar = f71386b;
        if (bVar != null) {
            bVar.mo74527d(str, str2, objArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m74522e(String str, String str2, Object... objArr) {
        b bVar = f71386b;
        if (bVar != null) {
            bVar.mo74525b(str, str2, objArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74517a(String str, String str2, Object... objArr) {
        b bVar = f71386b;
        if (bVar != null) {
            bVar.mo74523a(str, str2, objArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74518a(String str, Throwable th2, String str2, Object... objArr) {
        b bVar = f71386b;
        if (bVar != null) {
            bVar.mo74524a(str, th2, str2, objArr);
        }
    }
}
