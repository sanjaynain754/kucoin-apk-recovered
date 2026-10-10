package vh0;

import java.util.List;
import wh0.InterfaceC45841i;

/* JADX INFO: renamed from: vh0.b */
/* JADX INFO: compiled from: PathContainer.java */
/* JADX INFO: loaded from: classes61.dex */
public interface InterfaceC45553b {

    /* JADX INFO: renamed from: vh0.b$a */
    /* JADX INFO: compiled from: PathContainer.java */
    public interface a {
        String value();
    }

    /* JADX INFO: renamed from: vh0.b$b */
    /* JADX INFO: compiled from: PathContainer.java */
    public static class b {

        /* JADX INFO: renamed from: c */
        public static final b f102653c = m100604a('/', true);

        /* JADX INFO: renamed from: d */
        public static final b f102654d = m100604a('.', false);

        /* JADX INFO: renamed from: a */
        public final char f102655a;

        /* JADX INFO: renamed from: b */
        public final boolean f102656b;

        /* JADX INFO: renamed from: a */
        public static b m100604a(char c11, boolean z11) {
            return new b(c11, z11);
        }

        /* JADX INFO: renamed from: b */
        public char m100605b() {
            return this.f102655a;
        }

        /* JADX INFO: renamed from: c */
        public boolean m100606c() {
            return this.f102656b;
        }

        public b(char c11, boolean z11) {
            this.f102655a = c11;
            this.f102656b = z11;
        }
    }

    /* JADX INFO: renamed from: vh0.b$c */
    /* JADX INFO: compiled from: PathContainer.java */
    public interface c extends a {
        /* JADX INFO: renamed from: a */
        String mo100600a();

        /* JADX INFO: renamed from: b */
        InterfaceC45841i<String, String> mo100601b();
    }

    /* JADX INFO: renamed from: vh0.b$d */
    /* JADX INFO: compiled from: PathContainer.java */
    public interface d extends a {
    }

    /* JADX INFO: renamed from: a */
    List<a> mo100596a();

    String value();

    /* JADX INFO: renamed from: b */
    static InterfaceC45553b m100603b(String str) {
        return C45552a.m100592c(str, b.f102653c);
    }
}
