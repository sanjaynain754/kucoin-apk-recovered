package com.sumsub.sentry;

import com.tencent.bugly.proguard.C33978va;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sentry.r0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27989r0 {

    /* JADX INFO: renamed from: a */
    public final C27891Q0 f57125a;

    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX INFO: renamed from: a */
    public final C27985q0 m69021a(Throwable th2, C27876J c27876j, Thread thread, boolean z11) {
        C27885N0 c27885n0;
        Package r11 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        String message = th2.getMessage();
        if (r11 != null) {
            name = StringsKt.replace$default(name, r11.getName() + C33978va.f72339h, "", false, 4, (Object) null);
        }
        String str = name;
        String name2 = r11 != null ? r11.getName() : null;
        ArrayList arrayListM68979a = this.f57125a.m68979a(th2.getStackTrace());
        if (arrayListM68979a == null) {
            c27885n0 = null;
        } else {
            if ((!arrayListM68979a.isEmpty() ? arrayListM68979a : null) != null) {
                Boolean boolValueOf = Boolean.valueOf(z11);
                if (!z11) {
                    boolValueOf = null;
                }
                c27885n0 = new C27885N0(arrayListM68979a, boolValueOf);
            } else {
                c27885n0 = null;
            }
        }
        return new C27985q0(str, message, name2, thread != null ? Long.valueOf(thread.getId()) : null, c27885n0, c27876j);
    }

    public C27989r0(C27891Q0 c27891q0) {
        this.f57125a = c27891q0;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m69022a(C28015y c28015y) {
        Thread threadCurrentThread;
        C27876J c27876j;
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        Throwable cause = c28015y;
        while (cause != null && hashSet.add(cause)) {
            if (cause instanceof C28015y) {
                C28015y c28015y2 = (C28015y) cause;
                C27876J c27876j2 = c28015y2.f57170a;
                Throwable th2 = c28015y2.f57171b;
                threadCurrentThread = c28015y2.f57172c;
                cause = th2;
                c27876j = c27876j2;
            } else {
                threadCurrentThread = Thread.currentThread();
                c27876j = null;
            }
            arrayDeque.addFirst(m69021a(cause, c27876j, threadCurrentThread, false));
            cause = cause.getCause();
        }
        return new ArrayList(arrayDeque);
    }
}
