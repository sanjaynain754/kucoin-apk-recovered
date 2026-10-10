package io.trtc.tuikit.atomicxcore.impl.gift;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.gift.GiftListener;
import io.trtc.tuikit.atomicxcore.api.gift.GiftState;
import io.trtc.tuikit.atomicxcore.api.gift.GiftStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.common.C39506n;
import io.trtc.tuikit.atomicxcore.impl.common.C39509q;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0;
import java.util.List;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.gift.f */
/* JADX INFO: loaded from: classes61.dex */
public final class C39667f extends GiftStore implements InterfaceC39729d0 {

    /* JADX INFO: renamed from: a */
    public final String f88130a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n f88131b;

    /* JADX INFO: renamed from: c */
    public final C39510r f88132c;

    /* JADX INFO: renamed from: d */
    public final C39509q f88133d;

    /* JADX INFO: renamed from: e */
    public final C39664c f88134e;

    /* JADX INFO: renamed from: f */
    public final TUILiveGiftManager f88135f;

    /* JADX INFO: renamed from: g */
    public final GiftState f88136g;

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88234a(LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        C39510r c39510r = this.f88132c;
        String message = "API: afterEnterRoom called with liveInfo=" + liveInfo;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.gift.GiftStore
    public final void addGiftListener(GiftListener giftListener) {
        this.f88133d.m88248a(giftListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: b */
    public final void mo88236b(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: beforeEnterRoom called with liveID=", liveID, this.f88132c, "message", 0);
        this.f88135f.addObserver(this.f88134e);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.gift.GiftStore
    public final GiftState getGiftState() {
        return this.f88136g;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.gift.GiftStore
    public final void refreshUsableGifts(CompletionHandler completionHandler) {
        C39510r c39510r = this.f88132c;
        String message = "API: refreshUsableGifts called with liveID=" + this.f88130a;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88135f.getGiftList(this.f88130a, new C39665d(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.gift.GiftStore
    public final void removeGiftListener(GiftListener giftListener) {
        this.f88133d.m88250b(giftListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.gift.GiftStore
    public final void sendGift(String giftID, int i11, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(giftID, "giftID");
        C39510r c39510r = this.f88132c;
        String message = "API: sendGift called with giftID=" + giftID + ", count=" + i11;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88135f.sendGift(this.f88130a, giftID, i11, new C39666e(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.gift.GiftStore
    public final void setLanguage(String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        AbstractC39662a.m88299a("setCurrentLanguage:", language, this.f88132c, "message", 0);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("language", language);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("api", "setCurrentLanguage");
            jSONObject2.put(ReportDataTable.COLUMN_PARAMS, jSONObject);
            String string = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            TUIRoomEngine.sharedInstance().callExperimentalAPI(string, null);
        } catch (JSONException e11) {
            C39510r c39510r = this.f88132c;
            String message = "setCurrentLanguage failed:" + e11.getLocalizedMessage();
            c39510r.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c39510r.m88251a(2, message);
        }
    }

    public C39667f(String liveID) {
        TUIRoomEngine roomEngine = TUIRoomEngine.sharedInstance();
        Intrinsics.checkNotNullExpressionValue(roomEngine, "sharedInstance(...)");
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(roomEngine, "roomEngine");
        this.f88130a = liveID;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88131b = interfaceC41669nM91009a;
        this.f88132c = AbstractC39398a.m88229a("GiftStoreImpl", "file", "AtomicXCore-Live", "GiftStoreImpl");
        this.f88133d = new C39509q();
        this.f88134e = new C39664c(this);
        Object extension = roomEngine.getExtension(TUICommonDefine.ExtensionType.LIVE_GIFT_MANAGER);
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager");
        this.f88135f = (TUILiveGiftManager) extension;
        this.f88136g = new GiftState(interfaceC41669nM91009a);
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88235a(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: leaveRoom called with liveID=", liveID, this.f88132c, "message", 0);
        CollectionsKt.removeAll((List) this.f88133d.f87705a, (Function1) C39506n.f87702a);
        this.f88135f.removeObserver(this.f88134e);
    }
}
