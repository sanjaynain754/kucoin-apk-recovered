package io.trtc.tuikit.atomicxcore.impl.view.call.grid;

import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.grid.f */
/* JADX INFO: loaded from: classes61.dex */
public final class C40009f implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40011h f88990a;

    public C40009f(C40011h c40011h) {
        this.f88990a = c40011h;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallParticipantInfo) it.next()).getId());
        }
        C40011h.m88403a(this.f88990a, CollectionsKt.toSet(arrayList));
        return Unit.INSTANCE;
    }
}
