package pd0;

import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.gift.Gift;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: pd0.a */
/* JADX INFO: compiled from: GiftModel.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/viewmodel/GiftModel;", "", "<init>", "()V", "gift", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "getGift", "()Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "setGift", "(Lio/trtc/tuikit/atomicxcore/api/gift/Gift;)V", "giftCount", "", "getGiftCount", "()I", "setGiftCount", "(I)V", TUIConstants.TUICalling.SENDER, "Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "getSender", "()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "setSender", "(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)V", "isFromSelf", "", "()Z", "setFromSelf", "(Z)V", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43444a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Gift f95973a;

    /* JADX INFO: renamed from: b */
    public int f95974b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public LiveUserInfo f95975c;

    /* JADX INFO: renamed from: d */
    public boolean f95976d;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Gift getF95973a() {
        return this.f95973a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF95974b() {
        return this.f95974b;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final LiveUserInfo getF95975c() {
        return this.f95975c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getF95976d() {
        return this.f95976d;
    }

    /* JADX INFO: renamed from: e */
    public final void m95649e(boolean z11) {
        this.f95976d = z11;
    }

    /* JADX INFO: renamed from: f */
    public final void m95650f(@Nullable Gift gift) {
        this.f95973a = gift;
    }

    /* JADX INFO: renamed from: g */
    public final void m95651g(int i11) {
        this.f95974b = i11;
    }

    /* JADX INFO: renamed from: h */
    public final void m95652h(@Nullable LiveUserInfo liveUserInfo) {
        this.f95975c = liveUserInfo;
    }
}
