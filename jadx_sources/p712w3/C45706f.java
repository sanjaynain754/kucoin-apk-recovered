package p712w3;

import java.util.Arrays;

/* JADX INFO: renamed from: w3.f */
/* JADX INFO: compiled from: Objects.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C45706f {

    /* JADX INFO: renamed from: w3.f$a */
    /* JADX INFO: compiled from: Objects.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f103044a;

        /* JADX INFO: renamed from: b */
        public final C47033a f103045b;

        /* JADX INFO: renamed from: c */
        public C47033a f103046c;

        /* JADX INFO: renamed from: d */
        public boolean f103047d;

        /* JADX INFO: renamed from: w3.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Objects.java */
        public static final class C47033a {

            /* JADX INFO: renamed from: a */
            public String f103048a;

            /* JADX INFO: renamed from: b */
            public Object f103049b;

            /* JADX INFO: renamed from: c */
            public C47033a f103050c;

            public C47033a() {
            }
        }

        public a(String str) {
            C47033a c47033a = new C47033a();
            this.f103045b = c47033a;
            this.f103046c = c47033a;
            this.f103047d = false;
            this.f103044a = (String) C45708h.m100896g(str);
        }

        /* JADX INFO: renamed from: d */
        public final C47033a m100888d() {
            C47033a c47033a = new C47033a();
            this.f103046c.f103050c = c47033a;
            this.f103046c = c47033a;
            return c47033a;
        }

        public String toString() {
            boolean z11 = this.f103047d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f103044a);
            sb2.append('{');
            String str = "";
            for (C47033a c47033a = this.f103045b.f103050c; c47033a != null; c47033a = c47033a.f103050c) {
                Object obj = c47033a.f103049b;
                if (!z11 || obj != null) {
                    sb2.append(str);
                    String str2 = c47033a.f103048a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        /* JADX INFO: renamed from: a */
        public a m100885a(String str, int i11) {
            return m100889e(str, String.valueOf(i11));
        }

        /* JADX INFO: renamed from: b */
        public a m100886b(String str, Object obj) {
            return m100889e(str, obj);
        }

        /* JADX INFO: renamed from: c */
        public a m100887c(String str, boolean z11) {
            return m100889e(str, String.valueOf(z11));
        }

        /* JADX INFO: renamed from: e */
        public final a m100889e(String str, Object obj) {
            C47033a c47033aM100888d = m100888d();
            c47033aM100888d.f103049b = obj;
            c47033aM100888d.f103048a = (String) C45708h.m100896g(str);
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m100883a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static a m100884b(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}
