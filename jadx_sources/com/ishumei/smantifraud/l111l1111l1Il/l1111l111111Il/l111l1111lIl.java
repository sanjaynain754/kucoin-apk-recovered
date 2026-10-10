package com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il;

import android.app.UiModeManager;
import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class l111l1111lIl {
    private static final int l1111l111111Il = 4;
    private final Set<l111l1111lI1l<?>> l111l11111I1l;
    private final PriorityBlockingQueue<l111l1111lI1l<?>> l111l11111Il;
    private final AtomicInteger l111l11111lIl;
    private final com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l11111Il l111l1111l1Il;
    private final l111l1111l1Il[] l111l1111lI1l;
    private final List<l111l11111Il> l111l1111lIl;
    private final l11l1111I11l l111l1111llIl;
    private final List<l111l11111lIl> l11l1111lIIl;

    /* JADX INFO: loaded from: classes56.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface l1111l111111Il {
        public static final int l1111l111111Il = 0;
        public static final int l111l11111I1l = 2;
        public static final int l111l11111Il = 3;
        public static final int l111l11111lIl = 1;
        public static final int l111l1111l1Il = 4;
        public static final int l111l1111llIl = 5;
    }

    /* JADX INFO: loaded from: classes56.dex */
    public interface l111l11111I1l {
        boolean l1111l111111Il(l111l1111lI1l<?> l111l1111li1l);
    }

    /* JADX INFO: loaded from: classes56.dex */
    @Deprecated
    public interface l111l11111Il<T> {
        void l1111l111111Il();
    }

    /* JADX INFO: loaded from: classes56.dex */
    public interface l111l11111lIl {
        void l1111l111111Il();
    }

    public l111l1111lIl() {
    }

    public static int l1111l111111Il(Context context) {
        try {
            return ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static HashMap<String, String> l111l11111I1l() {
        HashMap<String, String> map = new HashMap<>();
        try {
            Class<?> clsLoadClass = Context.class.getClassLoader().loadClass("android.os.SystemProperties");
            Method method = clsLoadClass.getMethod("get", String.class);
            method.setAccessible(true);
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add("ro.debuggable");
            arrayList.add("ro.boot.hardware");
            arrayList.add("gsm.operator.alpha");
            arrayList.add("sys.usb.state");
            for (String str : arrayList) {
                String str2 = (String) method.invoke(clsLoadClass, str);
                if (str2 != null && !str2.isEmpty()) {
                    map.put(str, str2);
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    private <T> void l111l11111Il(l111l1111lI1l<T> l111l1111li1l) {
        this.l111l11111Il.add(l111l1111li1l);
    }

    public final void l111l11111lIl() {
        for (l111l1111l1Il l111l1111l1il : this.l111l1111lI1l) {
            if (l111l1111l1il != null) {
                l111l1111l1il.l1111l111111Il();
            }
        }
    }

    public l111l1111lIl(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l11111Il l111l11111il) {
        this(l111l11111il, 4);
    }

    private <T> void l111l11111I1l(l111l1111lI1l<T> l111l1111li1l) {
        l111l11111Il(l111l1111li1l);
    }

    private static boolean l111l11111Il() {
        return true;
    }

    private int l111l1111l1Il() {
        return this.l111l11111lIl.incrementAndGet();
    }

    private l11l1111I11l l111l1111llIl() {
        return this.l111l1111llIl;
    }

    public final <T> l111l1111lI1l<T> l1111l111111Il(l111l1111lI1l<T> l111l1111li1l) {
        l111l1111li1l.l1111l111111Il(this);
        synchronized (this.l111l11111I1l) {
            this.l111l11111I1l.add(l111l1111li1l);
        }
        l111l1111li1l.l111l11111lIl(this.l111l11111lIl.incrementAndGet());
        l111l1111li1l.l1111l111111Il("add-to-queue");
        l1111l111111Il(l111l1111li1l, 0);
        this.l111l11111Il.add(l111l1111li1l);
        return l111l1111li1l;
    }

    public final <T> void l111l11111lIl(l111l1111lI1l<T> l111l1111li1l) {
        synchronized (this.l111l11111I1l) {
            this.l111l11111I1l.remove(l111l1111li1l);
        }
        synchronized (this.l111l1111lIl) {
            try {
                Iterator<l111l11111Il> it = this.l111l1111lIl.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        l1111l111111Il(l111l1111li1l, 5);
    }

    private l111l1111lIl(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l11111Il l111l11111il, int i11) {
        this(l111l11111il, 4, new com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l11111lIl());
    }

    @Deprecated
    private <T> void l111l11111lIl(l111l11111Il<T> l111l11111il) {
        synchronized (this.l111l1111lIl) {
            this.l111l1111lIl.remove(l111l11111il);
        }
    }

    public final synchronized void l1111l111111Il() {
        l111l11111lIl();
        int i11 = 0;
        while (i11 < this.l111l1111lI1l.length) {
            l111l1111l1Il l111l1111l1il = new l111l1111l1Il(this.l111l11111Il, this.l111l1111l1Il, this.l111l1111llIl);
            StringBuilder sb2 = new StringBuilder("sm-http-thread");
            int i12 = i11 + 1;
            sb2.append(i12);
            l111l1111l1il.setName(sb2.toString());
            this.l111l1111lI1l[i11] = l111l1111l1il;
            l111l1111l1il.start();
            i11 = i12;
        }
    }

    private l111l1111lIl(com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l11111Il l111l11111il, int i11, l11l1111I11l l11l1111i11l) {
        this.l111l11111lIl = new AtomicInteger();
        this.l111l11111I1l = new HashSet();
        this.l111l11111Il = new PriorityBlockingQueue<>();
        this.l111l1111lIl = new ArrayList();
        this.l11l1111lIIl = new ArrayList();
        this.l111l1111l1Il = l111l11111il;
        this.l111l1111lI1l = new l111l1111l1Il[i11];
        this.l111l1111llIl = l11l1111i11l;
    }

    private void l111l11111lIl(l111l11111lIl l111l11111lil) {
        synchronized (this.l11l1111lIIl) {
            this.l11l1111lIIl.remove(l111l11111lil);
        }
    }

    public final void l1111l111111Il(l111l1111lI1l<?> l111l1111li1l, int i11) {
        synchronized (this.l11l1111lIIl) {
            try {
                Iterator<l111l11111lIl> it = this.l11l1111lIIl.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l1111l111111Il(l111l11111I1l l111l11111i1l) {
        synchronized (this.l111l11111I1l) {
            try {
                for (l111l1111lI1l<?> l111l1111li1l : this.l111l11111I1l) {
                    if (l111l11111i1l.l1111l111111Il(l111l1111li1l)) {
                        l111l1111li1l.l11l1111lIIl();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    private <T> void l1111l111111Il(l111l11111Il<T> l111l11111il) {
        synchronized (this.l111l1111lIl) {
            this.l111l1111lIl.add(l111l11111il);
        }
    }

    private void l1111l111111Il(l111l11111lIl l111l11111lil) {
        synchronized (this.l11l1111lIIl) {
            this.l11l1111lIIl.add(l111l11111lil);
        }
    }

    private void l1111l111111Il(final Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        l1111l111111Il(new l111l11111I1l() { // from class: com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lIl.1
            @Override // com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l111l1111lIl.l111l11111I1l
            public final boolean l1111l111111Il(l111l1111lI1l<?> l111l1111li1l) {
                if (l111l1111li1l.l111l11111Il() == obj) {
                    return true;
                }
                return false;
            }
        });
    }
}
