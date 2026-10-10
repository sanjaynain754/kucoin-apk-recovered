package io.trtc.tuikit.atomicxcore.impl.barrage;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.barrage.Barrage;
import io.trtc.tuikit.atomicxcore.api.barrage.BarrageState;
import io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0;
import java.util.Map;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.ArrayDeque;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.barrage.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C39468e extends BarrageStore implements InterfaceC39729d0 {

    /* JADX INFO: renamed from: a */
    public final String f87617a;

    /* JADX INFO: renamed from: b */
    public final TUIRoomEngine f87618b;

    /* JADX INFO: renamed from: c */
    public final C39510r f87619c;

    /* JADX INFO: renamed from: d */
    public final int f87620d;

    /* JADX INFO: renamed from: e */
    public final C39464a f87621e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f87622f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41669n f87623g;

    /* JADX INFO: renamed from: h */
    public final BarrageState f87624h;

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88234a(LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        C39510r c39510r = this.f87619c;
        String message = "API: afterEnterRoom called with liveID=" + liveInfo.getLiveID() + ", allowSendMessage=" + ((Boolean) this.f87623g.getValue()).booleanValue();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore
    public final void appendLocalTip(Barrage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        m88233a(message);
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: b */
    public final void mo88236b(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        C39510r c39510r = this.f87619c;
        String message = "API: beforeEnterRoom called with liveID=" + liveID + ", maxMessageCount=" + this.f87620d;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f87618b.addObserver(this.f87621e);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore
    public final BarrageState getBarrageState() {
        return this.f87624h;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore
    public final void sendCustomMessage(String str, String str2, CompletionHandler completionHandler) {
        C39510r c39510r = this.f87619c;
        String message = "API: sendCustomMessage called with businessID=" + str + ", data=" + str2;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        TUIRoomDefine.RoomCustomMessage roomCustomMessage = new TUIRoomDefine.RoomCustomMessage();
        roomCustomMessage.businessId = str;
        roomCustomMessage.data = str2;
        this.f87618b.sendCustomMessage(roomCustomMessage, new C39466c(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.barrage.BarrageStore
    public final void sendTextMessage(String str, Map map, CompletionHandler completionHandler) {
        C39510r c39510r = this.f87619c;
        String message = "API: sendTextMessage called with text=" + str + ", extensionInfo=" + map;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        TUIRoomDefine.RoomTextMessage roomTextMessage = new TUIRoomDefine.RoomTextMessage();
        roomTextMessage.textContent = str;
        roomTextMessage.extensionInfo = map;
        this.f87618b.sendTextMessage(roomTextMessage, new C39467d(this, completionHandler));
    }

    public C39468e(String liveID) {
        TUIRoomEngine roomEngine = TUIRoomEngine.sharedInstance();
        Intrinsics.checkNotNullExpressionValue(roomEngine, "sharedInstance(...)");
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(roomEngine, "roomEngine");
        this.f87617a = liveID;
        this.f87618b = roomEngine;
        this.f87619c = AbstractC39398a.m88229a("BarrageStoreImpl", "file", "AtomicXCore-Live", "BarrageStoreImpl");
        this.f87620d = 1000;
        this.f87621e = new C39464a(this);
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(new ArrayDeque(1000));
        this.f87622f = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(Boolean.TRUE);
        this.f87623g = interfaceC41669nM91009a2;
        this.f87624h = new BarrageState(interfaceC41669nM91009a, interfaceC41669nM91009a2);
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88235a(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        C39510r c39510r = this.f87619c;
        String message = "API: leaveRoom called with liveID=" + liveID + ", messageCount=" + ((ArrayDeque) this.f87622f.getValue()).size();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f87618b.removeObserver(this.f87621e);
    }

    /* JADX INFO: renamed from: a */
    public final void m88233a(Barrage barrage) {
        Object value;
        ArrayDeque arrayDeque;
        InterfaceC41669n interfaceC41669n = this.f87622f;
        do {
            value = interfaceC41669n.getValue();
            arrayDeque = new ArrayDeque((ArrayDeque) value);
            if (arrayDeque.size() >= this.f87620d) {
                CollectionsKt.removeFirst(arrayDeque);
            }
            arrayDeque.add(barrage);
        } while (!interfaceC41669n.compareAndSet(value, arrayDeque));
    }
}
