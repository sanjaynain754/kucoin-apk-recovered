package p716w7;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: w7.b */
/* JADX INFO: compiled from: ReLinker.java */
/* JADX INFO: loaded from: classes.dex */
public class C45744b {

    /* JADX INFO: renamed from: w7.b$a */
    /* JADX INFO: compiled from: ReLinker.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo100968a(Context context, String[] strArr, String str, File file, C45745c c45745c);
    }

    /* JADX INFO: renamed from: w7.b$b */
    /* JADX INFO: compiled from: ReLinker.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        String mo100976a(String str);

        /* JADX INFO: renamed from: b */
        String[] mo100977b();

        /* JADX INFO: renamed from: c */
        void mo100978c(String str);

        /* JADX INFO: renamed from: d */
        String mo100979d(String str);

        void loadLibrary(String str);
    }

    /* JADX INFO: renamed from: w7.b$c */
    /* JADX INFO: compiled from: ReLinker.java */
    /* JADX INFO: loaded from: classes45.dex */
    public interface c {
    }

    /* JADX INFO: renamed from: a */
    public static void m100974a(Context context, String str) {
        m100975b(context, str, null, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m100975b(Context context, String str, String str2, c cVar) {
        new C45745c().m100985f(context, str, str2, cVar);
    }
}
