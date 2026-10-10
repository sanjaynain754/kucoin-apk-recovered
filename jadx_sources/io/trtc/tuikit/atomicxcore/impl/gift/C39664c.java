package io.trtc.tuikit.atomicxcore.impl.gift;

import com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.gift.Gift;
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39747j0;
import java.util.Map;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.gift.c */
/* JADX INFO: loaded from: classes61.dex */
public final class C39664c extends TUILiveGiftManager.Observer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39667f f88125a;

    public C39664c(C39667f c39667f) {
        this.f88125a = c39667f;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager.Observer
    public final void onReceiveGiftMessage(String roomID, TUILiveGiftManager.GiftInfo gift, long j11, TUIRoomDefine.UserInfo sender) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(gift, "giftInfo");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(gift, "gift");
        String giftId = gift.giftId;
        Intrinsics.checkNotNullExpressionValue(giftId, "giftId");
        String name = gift.name;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        String desc = gift.desc;
        Intrinsics.checkNotNullExpressionValue(desc, "desc");
        String iconUrl = gift.iconUrl;
        Intrinsics.checkNotNullExpressionValue(iconUrl, "iconUrl");
        String resourceUrl = gift.resourceUrl;
        Intrinsics.checkNotNullExpressionValue(resourceUrl, "resourceUrl");
        long j12 = gift.level;
        long j13 = gift.coins;
        Map<String, String> extensionInfo = gift.extensionInfo;
        Intrinsics.checkNotNullExpressionValue(extensionInfo, "extensionInfo");
        this.f88125a.f88133d.m88249a((Function1) new C39663b(roomID, new Gift(giftId, name, desc, iconUrl, resourceUrl, j12, j13, extensionInfo), j11, AbstractC39747j0.m88322a(sender)));
    }
}
