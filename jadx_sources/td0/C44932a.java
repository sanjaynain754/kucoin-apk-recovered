package td0;

import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: td0.a */
/* JADX INFO: compiled from: PIPPanelState.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/pippanel/PIPPanelState;", "", "<init>", "()V", "roomId", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getRoomId", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "anchorIsPictureInPictureMode", "", "getAnchorIsPictureInPictureMode", "()Z", "setAnchorIsPictureInPictureMode", "(Z)V", "audienceIsPictureInPictureMode", "getAudienceIsPictureInPictureMode", "setAudienceIsPictureInPictureMode", "isAnchorStreaming", "setAnchorStreaming", "enablePictureInPictureToggle", "getEnablePictureInPictureToggle", "setEnablePictureInPictureToggle", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44932a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC41669n<String> f101320a = C41679x.m91009a("");

    /* JADX INFO: renamed from: b */
    public boolean f101321b;

    /* JADX INFO: renamed from: c */
    public boolean f101322c;

    /* JADX INFO: renamed from: d */
    public boolean f101323d;

    /* JADX INFO: renamed from: e */
    public boolean f101324e;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF101321b() {
        return this.f101321b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF101322c() {
        return this.f101322c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getF101324e() {
        return this.f101324e;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n<String> m99359d() {
        return this.f101320a;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getF101323d() {
        return this.f101323d;
    }

    /* JADX INFO: renamed from: f */
    public final void m99361f(boolean z11) {
        this.f101321b = z11;
    }

    /* JADX INFO: renamed from: g */
    public final void m99362g(boolean z11) {
        this.f101323d = z11;
    }

    /* JADX INFO: renamed from: h */
    public final void m99363h(boolean z11) {
        this.f101322c = z11;
    }

    /* JADX INFO: renamed from: i */
    public final void m99364i(boolean z11) {
        this.f101324e = z11;
    }
}
