package io.trtc.tuikit.atomicxcore.impl.view.live;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.J0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40062J0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40085V0 f89122a;

    public C40062J0(C40085V0 c40085v0) {
        this.f89122a = c40085v0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        List list = (List) obj;
        LiveData<Set<TUIRoomDefine.UserInfo>> liveData = this.f89122a.f89156a.coGuestState.inviteeList;
        Intrinsics.checkNotNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.collections.Set<com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.UserInfo>>");
        MutableLiveData mutableLiveData = (MutableLiveData) liveData;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC40043A.m88426a((LiveUserInfo) it.next()));
        }
        mutableLiveData.setValue(CollectionsKt.toSet(arrayList));
        return Unit.INSTANCE;
    }
}
