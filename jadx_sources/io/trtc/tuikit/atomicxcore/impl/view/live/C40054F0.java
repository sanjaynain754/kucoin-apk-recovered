package io.trtc.tuikit.atomicxcore.impl.view.live;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.F0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40054F0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40085V0 f89107a;

    public C40054F0(C40085V0 c40085v0) {
        this.f89107a = c40085v0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        LiveData<List<TUIRoomDefine.UserInfo>> liveData = this.f89107a.f89156a.coGuestState.connectedUserList;
        Intrinsics.checkNotNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.collections.List<com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.UserInfo>>");
        MutableLiveData mutableLiveData = (MutableLiveData) liveData;
        C40085V0 c40085v0 = this.f89107a;
        ArrayList<SeatUserInfo> arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            SeatUserInfo seatUserInfo = (SeatUserInfo) obj2;
            if (Intrinsics.areEqual(seatUserInfo.getLiveID(), c40085v0.f89157b) && seatUserInfo.getUserID().length() > 0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (SeatUserInfo audienceInfo : arrayList) {
            Intrinsics.checkNotNullParameter(audienceInfo, "audienceInfo");
            TUIRoomDefine.UserInfo userInfo = new TUIRoomDefine.UserInfo();
            userInfo.userId = audienceInfo.getUserID();
            userInfo.userName = audienceInfo.getUserName();
            userInfo.avatarUrl = audienceInfo.getAvatarURL();
            arrayList2.add(userInfo);
        }
        mutableLiveData.setValue(arrayList2);
        return Unit.INSTANCE;
    }
}
