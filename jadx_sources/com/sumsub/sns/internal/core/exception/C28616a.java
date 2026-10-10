package com.sumsub.sns.internal.core.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.exception.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28616a {

    /* JADX INFO: renamed from: a */
    public final Set f58230a;

    /* JADX INFO: renamed from: a */
    public final boolean m69471a(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        while (th2 != null && !arrayList.contains(th2)) {
            arrayList.add(th2);
            for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                Set set = this.f58230a;
                if (set == null || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (StringsKt.startsWith$default(stackTraceElement.getClassName(), (String) it.next(), false, 2, (Object) null)) {
                            return true;
                        }
                    }
                }
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public C28616a(Set set) {
        this.f58230a = set;
    }
}
