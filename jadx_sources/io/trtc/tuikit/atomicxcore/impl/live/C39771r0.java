package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.r0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39771r0 implements TUIRoomDefine.GetUserListCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39774s0 f88377a;

    public C39771r0(C39774s0 c39774s0) {
        this.f88377a = c39774s0;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.GetUserListCallback
    public final void onError(TUICommonDefine.Error error, String str) {
        C39510r c39510r = this.f88377a.f88389f;
        StringBuilder sb2 = new StringBuilder("Response: getBannedUserList failed code=");
        sb2.append(error != null ? Integer.valueOf(error.getValue()) : null);
        sb2.append(", message=");
        sb2.append(str);
        String message = sb2.toString();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(2, message);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.GetUserListCallback
    public final void onSuccess(TUIRoomDefine.UserListResult userListResult) {
        Object value;
        Collection collectionEmptyList;
        List<TUIRoomDefine.UserInfo> list;
        AbstractC39465b.m88232a(this.f88377a.f88389f, "Response: getBannedUserList success", "message", 0, "Response: getBannedUserList success");
        InterfaceC41669n interfaceC41669n = this.f88377a.f88388e;
        do {
            value = interfaceC41669n.getValue();
            if (userListResult == null || (list = userListResult.userInfoList) == null) {
                collectionEmptyList = CollectionsKt.emptyList();
            } else {
                collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (TUIRoomDefine.UserInfo userInfo : list) {
                    Intrinsics.checkNotNull(userInfo);
                    collectionEmptyList.add(AbstractC39747j0.m88322a(userInfo));
                }
            }
        } while (!interfaceC41669n.compareAndSet(value, collectionEmptyList));
    }
}
