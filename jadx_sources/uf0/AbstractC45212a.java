package uf0;

import tf0.C44941b;

/* JADX INFO: renamed from: uf0.a */
/* JADX INFO: compiled from: AttributeValue.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC45212a {

    /* JADX INFO: renamed from: uf0.a$a */
    /* JADX INFO: compiled from: AttributeValue.java */
    public static abstract class a extends AbstractC45212a {
        /* JADX INFO: renamed from: d */
        public abstract Long mo99890d();

        /* JADX INFO: renamed from: c */
        public static AbstractC45212a m99889c(Long l11) {
            return new C45213b((Long) C44941b.m99389b(l11, "longValue"));
        }
    }

    /* JADX INFO: renamed from: uf0.a$b */
    /* JADX INFO: compiled from: AttributeValue.java */
    public static abstract class b extends AbstractC45212a {
        /* JADX INFO: renamed from: d */
        public abstract String mo99892d();

        /* JADX INFO: renamed from: c */
        public static AbstractC45212a m99891c(String str) {
            return new C45214c((String) C44941b.m99389b(str, "stringValue"));
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC45212a m99887a(long j11) {
        return a.m99889c(Long.valueOf(j11));
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC45212a m99888b(String str) {
        return b.m99891c(str);
    }
}
