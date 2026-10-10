package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.F */
/* JADX INFO: loaded from: classes61.dex */
public final class C39678F implements TUIRoomDefine.RequestListCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39692M f88152a;

    public C39678F(C39692M c39692m) {
        this.f88152a = c39692m;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestListCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.RequestListCallback
    public final void onSuccess(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        C39692M c39692m = this.f88152a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TUIRoomDefine.Request request = (TUIRoomDefine.Request) it.next();
            InterfaceC41669n interfaceC41669n = c39692m.f88182e;
            List mutableList = CollectionsKt.toMutableList((Collection) interfaceC41669n.getValue());
            mutableList.add(AbstractC39747j0.m88321a(request));
            interfaceC41669n.setValue(mutableList);
            LinkedHashMap linkedHashMap = c39692m.f88184g;
            String userId = request.userId;
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            linkedHashMap.put(userId, request);
        }
    }
}
