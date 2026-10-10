package io.trtc.tuikit.atomicxcore.impl.barrage;

import androidx.media3.exoplayer.RendererCapabilities;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import io.trtc.tuikit.atomicxcore.api.barrage.Barrage;
import io.trtc.tuikit.atomicxcore.api.barrage.BarrageType;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39747j0;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.barrage.a */
/* JADX INFO: loaded from: classes61.dex */
public final class C39464a extends TUIRoomObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39468e f87612a;

    public C39464a(C39468e c39468e) {
        this.f87612a = c39468e;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onReceiveCustomMessage(TUIRoomDefine.RoomCustomMessage message) {
        Intrinsics.checkNotNullParameter(message, "customMessage");
        if (Intrinsics.areEqual(message.roomId, this.f87612a.f87617a)) {
            C39468e c39468e = this.f87612a;
            Intrinsics.checkNotNullParameter(message, "message");
            String roomId = message.roomId;
            Intrinsics.checkNotNullExpressionValue(roomId, "roomId");
            TUIRoomDefine.UserInfo sender = message.sender;
            Intrinsics.checkNotNullExpressionValue(sender, "sender");
            LiveUserInfo liveUserInfoM88322a = AbstractC39747j0.m88322a(sender);
            long j11 = message.sequence;
            long j12 = message.timestampInSecond;
            BarrageType barrageType = BarrageType.CUSTOM;
            String businessId = message.businessId;
            Intrinsics.checkNotNullExpressionValue(businessId, "businessId");
            String data = message.data;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            c39468e.m88233a(new Barrage(roomId, liveUserInfoM88322a, j11, j12, barrageType, null, null, businessId, data, 96, null));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onReceiveTextMessage(TUIRoomDefine.RoomTextMessage message) {
        Intrinsics.checkNotNullParameter(message, "textMessage");
        if (Intrinsics.areEqual(message.roomId, this.f87612a.f87617a)) {
            C39468e c39468e = this.f87612a;
            Intrinsics.checkNotNullParameter(message, "message");
            String roomId = message.roomId;
            Intrinsics.checkNotNullExpressionValue(roomId, "roomId");
            TUIRoomDefine.UserInfo sender = message.sender;
            Intrinsics.checkNotNullExpressionValue(sender, "sender");
            LiveUserInfo liveUserInfoM88322a = AbstractC39747j0.m88322a(sender);
            long j11 = message.sequence;
            long j12 = message.timestampInSecond;
            BarrageType barrageType = BarrageType.TEXT;
            String textContent = message.textContent;
            Intrinsics.checkNotNullExpressionValue(textContent, "textContent");
            Map<String, String> extensionInfo = message.extensionInfo;
            Intrinsics.checkNotNullExpressionValue(extensionInfo, "extensionInfo");
            c39468e.m88233a(new Barrage(roomId, liveUserInfoM88322a, j11, j12, barrageType, textContent, extensionInfo, null, null, RendererCapabilities.DECODER_SUPPORT_MASK, null));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onSendMessageForAllUserDisableChanged(String roomID, boolean z11) {
        Object value;
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        if (Intrinsics.areEqual(roomID, this.f87612a.f87617a)) {
            InterfaceC41669n interfaceC41669n = this.f87612a.f87623g;
            do {
                value = interfaceC41669n.getValue();
                ((Boolean) value).getClass();
            } while (!interfaceC41669n.compareAndSet(value, Boolean.valueOf(!z11)));
        }
    }
}
