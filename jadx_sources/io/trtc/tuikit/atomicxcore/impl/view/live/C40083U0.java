package io.trtc.tuikit.atomicxcore.impl.view.live;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.U0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40083U0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40085V0 f89154a;

    public C40083U0(C40085V0 c40085v0) {
        this.f89154a = c40085v0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        List list = (List) obj;
        LiveData<List<TUIRoomDefine.SeatInfo>> liveData = this.f89154a.f89156a.coGuestState.seatList;
        Intrinsics.checkNotNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.collections.List<com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.SeatInfo>>");
        MutableLiveData mutableLiveData = (MutableLiveData) liveData;
        C40085V0 c40085v0 = this.f89154a;
        ArrayList<SeatInfo> arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (Intrinsics.areEqual(c40085v0.f89157b, ((SeatInfo) obj2).getUserInfo().getLiveID())) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (SeatInfo seatInfo : arrayList) {
            Intrinsics.checkNotNullParameter(seatInfo, "seatInfo");
            TUIRoomDefine.SeatInfo seatInfo2 = new TUIRoomDefine.SeatInfo();
            seatInfo2.index = seatInfo.getIndex();
            seatInfo2.userId = seatInfo.getUserInfo().getUserID();
            seatInfo2.userName = seatInfo.getUserInfo().getUserName();
            seatInfo2.nameCard = seatInfo.getUserInfo().getUserName();
            seatInfo2.avatarUrl = seatInfo.getUserInfo().getAvatarURL();
            seatInfo2.roomId = seatInfo.getUserInfo().getLiveID();
            seatInfo2.isLocked = seatInfo.isLocked();
            seatInfo2.isVideoLocked = !seatInfo.getUserInfo().getAllowOpenCamera();
            seatInfo2.isAudioLocked = !seatInfo.getUserInfo().getAllowOpenMicrophone();
            arrayList2.add(seatInfo2);
        }
        mutableLiveData.setValue(arrayList2);
        LiveData<Set<String>> liveData2 = this.f89154a.f89156a.userState.hasAudioStreamUserList;
        Intrinsics.checkNotNull(liveData2, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.collections.Set<kotlin.String>>");
        MutableLiveData mutableLiveData2 = (MutableLiveData) liveData2;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (((SeatInfo) obj3).getUserInfo().getMicrophoneStatus() == DeviceStatus.ON) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((SeatInfo) it.next()).getUserInfo().getUserID());
        }
        mutableLiveData2.setValue(CollectionsKt.toSet(arrayList4));
        LiveData<Set<String>> liveData3 = this.f89154a.f89156a.userState.hasVideoStreamUserList;
        Intrinsics.checkNotNull(liveData3, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.collections.Set<kotlin.String>>");
        MutableLiveData mutableLiveData3 = (MutableLiveData) liveData3;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : list) {
            if (((SeatInfo) obj4).getUserInfo().getCameraStatus() == DeviceStatus.ON) {
                arrayList5.add(obj4);
            }
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add(((SeatInfo) it2.next()).getUserInfo().getUserID());
        }
        mutableLiveData3.setValue(CollectionsKt.toSet(arrayList6));
        return Unit.INSTANCE;
    }
}
