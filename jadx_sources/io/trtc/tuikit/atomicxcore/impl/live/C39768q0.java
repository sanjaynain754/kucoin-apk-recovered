package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.q0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39768q0 implements TUIRoomDefine.GetUserListCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39774s0 f88374a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88375b;

    public C39768q0(C39774s0 c39774s0, CompletionHandler completionHandler) {
        this.f88374a = c39774s0;
        this.f88375b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.GetUserListCallback
    public final void onError(TUICommonDefine.Error error, String str) {
        C39510r c39510r = this.f88374a.f88389f;
        StringBuilder sb2 = new StringBuilder("Response: fetchAudienceList failed code=");
        sb2.append(error != null ? Integer.valueOf(error.getValue()) : null);
        sb2.append(", message=");
        sb2.append(str);
        String message = sb2.toString();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(2, message);
        CompletionHandler completionHandler = this.f88375b;
        if (completionHandler != null) {
            int value = error != null ? error.getValue() : -1;
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(value, str);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.GetUserListCallback
    public final void onSuccess(TUIRoomDefine.UserListResult userListResult) {
        List<TUIRoomDefine.UserInfo> list;
        AbstractC39465b.m88232a(this.f88374a.f88389f, "Response: fetchAudienceList success", "message", 0, "Response: fetchAudienceList success");
        InterfaceC41669n interfaceC41669n = this.f88374a.f88386c;
        List mutableList = CollectionsKt.toMutableList((Collection) interfaceC41669n.getValue());
        if (userListResult != null && (list = userListResult.userInfoList) != null) {
            ArrayList<TUIRoomDefine.UserInfo> arrayList = new ArrayList();
            for (Object obj : list) {
                TUIRoomDefine.UserInfo userInfo = (TUIRoomDefine.UserInfo) obj;
                if (mutableList == null || !mutableList.isEmpty()) {
                    Iterator it = mutableList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.areEqual(((LiveUserInfo) it.next()).getUserID(), userInfo.userId)) {
                            }
                        }
                    }
                }
                if (userInfo.userRole != TUIRoomDefine.Role.ROOM_OWNER) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (TUIRoomDefine.UserInfo userInfo2 : arrayList) {
                Intrinsics.checkNotNull(userInfo2);
                arrayList2.add(AbstractC39747j0.m88322a(userInfo2));
            }
            mutableList.addAll(arrayList2);
        }
        interfaceC41669n.setValue(mutableList);
        CompletionHandler completionHandler = this.f88375b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
