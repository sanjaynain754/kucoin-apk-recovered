package io.trtc.tuikit.atomicxcore.impl.view.live;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.o0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40124o0 implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40085V0 f89250a;

    public C40124o0(C40085V0 c40085v0) {
        this.f89250a = c40085v0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        List<SeatUserInfo> list = (List) obj;
        LiveData<List<TUILiveBattleManager.BattleUser>> liveData = this.f89250a.f89156a.battleState.battlingUserList;
        Intrinsics.checkNotNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.collections.List<com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager.BattleUser>>");
        MutableLiveData mutableLiveData = (MutableLiveData) liveData;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (SeatUserInfo userInfo : list) {
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            TUILiveBattleManager.BattleUser battleUser = new TUILiveBattleManager.BattleUser();
            battleUser.roomId = userInfo.getLiveID();
            battleUser.userId = userInfo.getUserID();
            battleUser.userName = userInfo.getUserName();
            battleUser.avatarUrl = userInfo.getAvatarURL();
            battleUser.score = 0;
            arrayList.add(battleUser);
        }
        mutableLiveData.setValue(arrayList);
        return Unit.INSTANCE;
    }
}
