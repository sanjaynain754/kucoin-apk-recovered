package io.trtc.tuikit.atomicxcore.impl.common;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.q */
/* JADX INFO: loaded from: classes61.dex */
public final class C39509q {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList f87705a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a */
    public final void m88248a(Object obj) {
        if (obj != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f87705a;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((WeakReference) it.next()).get(), obj)) {
                        return;
                    }
                }
            }
            this.f87705a.add(new WeakReference(obj));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m88250b(Object obj) {
        if (obj != null) {
            CollectionsKt.removeAll((List) this.f87705a, (Function1) new C39508p(obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m88249a(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        CollectionsKt.removeAll((List) this.f87705a, (Function1) C39507o.f87703a);
        Iterator it = this.f87705a.iterator();
        while (it.hasNext()) {
            Object obj = ((WeakReference) it.next()).get();
            if (obj != null) {
                block.invoke(obj);
            }
        }
    }
}
