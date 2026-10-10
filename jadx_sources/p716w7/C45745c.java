package p716w7;

import android.content.Context;
import android.util.Log;
import com.getkeepsafe.relinker.MissingLibraryException;
import com.tencent.bugly.proguard.C33978va;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p751x7.C46093i;

/* JADX INFO: renamed from: w7.c */
/* JADX INFO: compiled from: ReLinkerInstance.java */
/* JADX INFO: loaded from: classes.dex */
public class C45745c {

    /* JADX INFO: renamed from: a */
    public final Set<String> f103150a;

    /* JADX INFO: renamed from: b */
    public final C45744b.b f103151b;

    /* JADX INFO: renamed from: c */
    public final C45744b.a f103152c;

    /* JADX INFO: renamed from: d */
    public boolean f103153d;

    /* JADX INFO: renamed from: e */
    public boolean f103154e;

    /* JADX INFO: renamed from: w7.c$a */
    /* JADX INFO: compiled from: ReLinkerInstance.java */
    /* JADX INFO: loaded from: classes45.dex */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f103155b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f103156c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f103157d;

        /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() throws Throwable {
            try {
                C45745c.this.m100986g(this.f103155b, this.f103156c, this.f103157d);
                throw null;
            } catch (MissingLibraryException unused) {
                throw null;
            } catch (UnsatisfiedLinkError unused2) {
                throw null;
            }
        }

        public a(Context context, String str, String str2, C45744b.c cVar) {
            this.f103155b = context;
            this.f103156c = str;
            this.f103157d = str2;
        }
    }

    /* JADX INFO: renamed from: w7.c$b */
    /* JADX INFO: compiled from: ReLinkerInstance.java */
    /* JADX INFO: loaded from: classes45.dex */
    public class b implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f103159a;

        public b(String str) {
            this.f103159a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f103159a);
        }
    }

    public C45745c() {
        this(new C45746d(), new C45743a());
    }

    /* JADX INFO: renamed from: e */
    public void m100984e(Context context, String str) {
        m100985f(context, str, null, null);
    }

    public C45745c(C45744b.b bVar, C45744b.a aVar) {
        this.f103150a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f103151b = bVar;
        this.f103152c = aVar;
    }

    /* JADX INFO: renamed from: c */
    public File m100982c(Context context) {
        return context.getDir("lib", 0);
    }

    /* JADX INFO: renamed from: d */
    public File m100983d(Context context, String str, String str2) {
        String strMo100979d = this.f103151b.mo100979d(str);
        if (C45747e.m100989a(str2)) {
            return new File(m100982c(context), strMo100979d);
        }
        return new File(m100982c(context), strMo100979d + C33978va.f72339h + str2);
    }

    /* JADX INFO: renamed from: f */
    public void m100985f(Context context, String str, String str2, C45744b.c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (C45747e.m100989a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        m100988i("Beginning load of %s...", str);
        if (cVar == null) {
            m100986g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, cVar)).start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m100986g(Context context, String str, String str2) throws Throwable {
        C45745c c45745c;
        Context context2;
        C46093i c46093i;
        if (this.f103150a.contains(str) && !this.f103153d) {
            m100988i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f103151b.loadLibrary(str);
            this.f103150a.add(str);
            m100988i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e11) {
            m100988i("Loading the library normally failed: %s", Log.getStackTraceString(e11));
            m100988i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File fileM100983d = m100983d(context, str, str2);
            if (!fileM100983d.exists() || this.f103153d) {
                if (this.f103153d) {
                    m100988i("Forcing a re-link of %s (%s)...", str, str2);
                }
                m100981b(context, str, str2);
                c45745c = this;
                context2 = context;
                this.f103152c.mo100968a(context2, this.f103151b.mo100977b(), this.f103151b.mo100979d(str), fileM100983d, c45745c);
            } else {
                c45745c = this;
                context2 = context;
            }
            try {
                if (c45745c.f103154e) {
                    try {
                        c46093i = new C46093i(fileM100983d);
                        try {
                            List<String> listM101598g = c46093i.m101598g();
                            c46093i.close();
                            Iterator<String> it = listM101598g.iterator();
                            while (it.hasNext()) {
                                m100984e(context2, c45745c.f103151b.mo100976a(it.next()));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            if (c46093i == null) {
                                throw th3;
                            }
                            c46093i.close();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c46093i = null;
                    }
                }
            } catch (IOException unused) {
            }
            c45745c.f103151b.mo100978c(fileM100983d.getAbsolutePath());
            c45745c.f103150a.add(str);
            m100988i("%s (%s) was re-linked!", str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m100988i(String str, Object... objArr) {
        m100987h(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: renamed from: b */
    public void m100981b(Context context, String str, String str2) {
        File fileM100982c = m100982c(context);
        File fileM100983d = m100983d(context, str, str2);
        File[] fileArrListFiles = fileM100982c.listFiles(new b(this.f103151b.mo100979d(str)));
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (this.f103153d || !file.getAbsolutePath().equals(fileM100983d.getAbsolutePath())) {
                    file.delete();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m100987h(String str) {
    }
}
