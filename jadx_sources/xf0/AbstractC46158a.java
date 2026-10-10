package xf0;

import tf0.C44941b;
import uf0.C45224m;

/* JADX INFO: renamed from: xf0.a */
/* JADX INFO: compiled from: TextFormat.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC46158a {

    /* JADX INFO: renamed from: a */
    public static final b f103661a = new b();

    /* JADX INFO: renamed from: xf0.a$b */
    /* JADX INFO: compiled from: TextFormat.java */
    public static final class b extends AbstractC46158a {
        public b() {
        }

        @Override // xf0.AbstractC46158a
        /* JADX INFO: renamed from: a */
        public <C> void mo97935a(C45224m c45224m, C c11, c<C> cVar) {
            C44941b.m99389b(c45224m, "spanContext");
            C44941b.m99389b(c11, "carrier");
            C44941b.m99389b(cVar, "setter");
        }
    }

    /* JADX INFO: renamed from: xf0.a$c */
    /* JADX INFO: compiled from: TextFormat.java */
    public static abstract class c<C> {
        public abstract void put(C c11, String str, String str2);
    }

    /* JADX INFO: renamed from: a */
    public abstract <C> void mo97935a(C45224m c45224m, C c11, c<C> cVar);
}
