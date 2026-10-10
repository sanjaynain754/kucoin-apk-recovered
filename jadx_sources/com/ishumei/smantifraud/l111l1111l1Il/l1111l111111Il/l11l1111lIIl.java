package com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il;

/* JADX INFO: loaded from: classes.dex */
public class l11l1111lIIl<T> {
    private static final String l111l11111Il = "volley";
    public final T l1111l111111Il;
    public boolean l111l11111I1l;
    public final l11l1111I1ll l111l11111lIl;

    public interface l1111l111111Il {
        void l1111l111111Il(l11l1111I1ll l11l1111i1ll);
    }

    public interface l111l11111lIl<T> {
        void l1111l111111Il(T t11);
    }

    public l11l1111lIIl() {
    }

    private static l111l1111lIl l1111l111111Il(l111l11111Il l111l11111il) {
        return new l111l1111lIl(l111l11111il);
    }

    private l11l1111lIIl(l11l1111I1ll l11l1111i1ll) {
        this.l111l11111I1l = false;
        this.l1111l111111Il = null;
        this.l111l11111lIl = l11l1111i1ll;
    }

    public static <T> l11l1111lIIl<T> l1111l111111Il(l11l1111I1ll l11l1111i1ll) {
        return new l11l1111lIIl<>(l11l1111i1ll);
    }

    public static l111l1111lIl l111l11111lIl() {
        return new l111l1111lIl(new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl(new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l1111l1Il()));
    }

    private l11l1111lIIl(T t11) {
        this.l111l11111I1l = false;
        this.l1111l111111Il = t11;
        this.l111l11111lIl = null;
    }

    public static <T> l11l1111lIIl<T> l1111l111111Il(T t11) {
        return new l11l1111lIIl<>(t11);
    }

    public final boolean l1111l111111Il() {
        return this.l111l11111lIl == null;
    }
}
