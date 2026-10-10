package io.trtc.tuikit.atomicxcore.impl.view.live;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39699P0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.B0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40046B0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40085V0 f89091a;

    public C40046B0(C40085V0 c40085v0) {
        this.f89091a = c40085v0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        List list = (List) obj;
        LiveData<List<TUILiveConnectionManager.ConnectionUser>> liveData = this.f89091a.f89156a.coHostState.sentConnectionRequestList;
        Intrinsics.checkNotNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.collections.List<com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.ConnectionUser>>");
        MutableLiveData mutableLiveData = (MutableLiveData) liveData;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC39699P0.m88310a((SeatUserInfo) it.next()));
        }
        mutableLiveData.setValue(arrayList);
        return Unit.INSTANCE;
    }
}
