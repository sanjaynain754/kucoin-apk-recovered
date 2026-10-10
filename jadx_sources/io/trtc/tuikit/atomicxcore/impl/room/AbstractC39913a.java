package io.trtc.tuikit.atomicxcore.impl.room;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.a */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC39913a {
    /* JADX INFO: renamed from: a */
    public static final void m88341a(InterfaceC41669n interfaceC41669n, Object obj, Function1 keySelector) {
        Object value;
        List mutableList;
        Intrinsics.checkNotNullParameter(interfaceC41669n, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        do {
            value = interfaceC41669n.getValue();
            List list = (List) value;
            Iterator it = list.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (Intrinsics.areEqual(keySelector.invoke(it.next()), keySelector.invoke(obj))) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                mutableList = CollectionsKt.plus((Collection<? extends Object>) list, obj);
            } else {
                Intrinsics.checkNotNullParameter(list, "<this>");
                mutableList = CollectionsKt.toMutableList((Collection) list);
                mutableList.set(i11, obj);
            }
        } while (!interfaceC41669n.compareAndSet(value, mutableList));
    }

    /* JADX INFO: renamed from: b */
    public static final void m88342b(InterfaceC41669n interfaceC41669n, Object obj, Function1 keySelector) {
        Object value;
        List mutableList;
        Intrinsics.checkNotNullParameter(interfaceC41669n, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        do {
            value = interfaceC41669n.getValue();
            mutableList = (List) value;
            Iterator it = mutableList.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (Intrinsics.areEqual(keySelector.invoke(it.next()), keySelector.invoke(obj))) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 != -1) {
                Intrinsics.checkNotNullParameter(mutableList, "<this>");
                mutableList = CollectionsKt.toMutableList((Collection) mutableList);
                mutableList.set(i11, obj);
            }
        } while (!interfaceC41669n.compareAndSet(value, mutableList));
    }
}
