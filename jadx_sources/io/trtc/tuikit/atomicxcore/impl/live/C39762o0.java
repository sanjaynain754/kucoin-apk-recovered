package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.o0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39762o0 extends TUIRoomObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39774s0 f88356a;

    public C39762o0(C39774s0 c39774s0) {
        this.f88356a = c39774s0;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRemoteUserEnterRoom(String roomID, TUIRoomDefine.UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        if (Intrinsics.areEqual(roomID, this.f88356a.f88384a) && userInfo.userRole != TUIRoomDefine.Role.ROOM_OWNER) {
            List list = (List) this.f88356a.f88386c.getValue();
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((LiveUserInfo) it.next()).getUserID(), userInfo.userId)) {
                    }
                }
                InterfaceC41669n interfaceC41669n = this.f88356a.f88386c;
                List mutableList = CollectionsKt.toMutableList((Collection) list);
                mutableList.add(AbstractC39747j0.m88322a(userInfo));
                interfaceC41669n.setValue(mutableList);
            } else {
                InterfaceC41669n interfaceC41669n2 = this.f88356a.f88386c;
                List mutableList2 = CollectionsKt.toMutableList((Collection) list);
                mutableList2.add(AbstractC39747j0.m88322a(userInfo));
                interfaceC41669n2.setValue(mutableList2);
            }
            AbstractC39465b.m88232a(this.f88356a.f88389f, "Listener: onRemoteUserEnterRoom called", "message", 0, "Listener: onRemoteUserEnterRoom called");
            this.f88356a.f88390g.m88249a((Function1) new C39750k0(userInfo));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRemoteUserLeaveRoom(String roomID, TUIRoomDefine.UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        if (Intrinsics.areEqual(roomID, this.f88356a.f88384a)) {
            InterfaceC41669n interfaceC41669n = this.f88356a.f88386c;
            List mutableList = CollectionsKt.toMutableList((Collection) interfaceC41669n.getValue());
            CollectionsKt.removeAll(mutableList, (Function1) new C39753l0(userInfo));
            interfaceC41669n.setValue(mutableList);
            AbstractC39465b.m88232a(this.f88356a.f88389f, "Listener: onRemoteUserLeaveRoom called", "message", 0, "Listener: onRemoteUserLeaveRoom called");
            this.f88356a.f88390g.m88249a((Function1) new C39756m0(userInfo));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRoomUserCountChanged(String roomID, int i11) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        if (Intrinsics.areEqual(roomID, this.f88356a.f88384a)) {
            this.f88356a.f88387d.setValue(Integer.valueOf(i11 == 0 ? 0 : i11 - 1));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onSendMessageForUserDisableChanged(String roomID, String userID, boolean z11) {
        String str;
        Object value;
        ArrayList arrayList;
        Object next;
        Object value2;
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(userID, "userID");
        if (Intrinsics.areEqual(roomID, this.f88356a.f88384a)) {
            C39510r c39510r = this.f88356a.f88389f;
            String message = "Listener: onAudienceMessageDisabled roomId:" + roomID + ", userID:" + userID + ", isDisable:" + z11;
            c39510r.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c39510r.m88251a(0, message);
            if (z11) {
                Iterator it = ((Iterable) this.f88356a.f88388e.getValue()).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((LiveUserInfo) next).getUserID(), userID));
                if (next == null) {
                    List mutableList = CollectionsKt.toMutableList((Collection) this.f88356a.f88388e.getValue());
                    str = userID;
                    mutableList.add(new LiveUserInfo(str, null, null, 6, null));
                    InterfaceC41669n interfaceC41669n = this.f88356a.f88388e;
                    do {
                        value2 = interfaceC41669n.getValue();
                    } while (!interfaceC41669n.compareAndSet(value2, mutableList));
                } else {
                    str = userID;
                }
            } else {
                str = userID;
                InterfaceC41669n interfaceC41669n2 = this.f88356a.f88388e;
                do {
                    value = interfaceC41669n2.getValue();
                    arrayList = new ArrayList();
                    for (Object obj : (List) value) {
                        if (!Intrinsics.areEqual(((LiveUserInfo) obj).getUserID(), str)) {
                            arrayList.add(obj);
                        }
                    }
                } while (!interfaceC41669n2.compareAndSet(value, CollectionsKt.toMutableList((Collection) arrayList)));
            }
            this.f88356a.f88390g.m88249a((Function1) new C39759n0(str, z11));
        }
    }
}
