package com.trtc.uikit.livekit.features.anchorprepare.store;

import com.trtc.uikit.livekit.features.anchorprepare.LiveStreamPrivacyStatus;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnchorPrepareState.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u0006\""}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareState;", "", "<init>", "()V", "selfUserId", "", "getSelfUserId", "()Ljava/lang/String;", "setSelfUserId", "(Ljava/lang/String;)V", "selfUserName", "getSelfUserName", "setSelfUserName", "roomId", "getRoomId", "setRoomId", "useFrontCamera", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getUseFrontCamera", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "coverURL", "getCoverURL", "liveMode", "Lcom/trtc/uikit/livekit/features/anchorprepare/LiveStreamPrivacyStatus;", "getLiveMode", "coGuestTemplateId", "", "getCoGuestTemplateId", "coHostTemplateId", "getCoHostTemplateId", "roomName", "getRoomName", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AnchorPrepareState {

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Companion f78469j = new Companion(null);

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final String[] f78470k = {"https://liteav-test-1252463788.cos.ap-guangzhou.myqcloud.com/voice_room/voice_room_cover1.png", "https://liteav-test-1252463788.cos.ap-guangzhou.myqcloud.com/voice_room/voice_room_cover2.png", "https://liteav-test-1252463788.cos.ap-guangzhou.myqcloud.com/voice_room/voice_room_cover3.png", "https://liteav-test-1252463788.cos.ap-guangzhou.myqcloud.com/voice_room/voice_room_cover4.png", "https://liteav-test-1252463788.cos.ap-guangzhou.myqcloud.com/voice_room/voice_room_cover5.png", "https://liteav-test-1252463788.cos.ap-guangzhou.myqcloud.com/voice_room/voice_room_cover6.png", "https://liteav-test-1252463788.cos.ap-guangzhou.myqcloud.com/voice_room/voice_room_cover7.png", "https://liteav-test-1252463788.cos.ap-guangzhou.myqcloud.com/voice_room/voice_room_cover8.png", "https://liteav-test-1252463788.cos.ap-guangzhou.myqcloud.com/voice_room/voice_room_cover9.png", "https://liteav-test-1252463788.cos.ap-guangzhou.myqcloud.com/voice_room/voice_room_cover10.png", "https://liteav-test-1252463788.cos.ap-guangzhou.myqcloud.com/voice_room/voice_room_cover11.png", "https://liteav-test-1252463788.cos.ap-guangzhou.myqcloud.com/voice_room/voice_room_cover12.png"};

    /* JADX INFO: renamed from: a */
    @NotNull
    public String f78471a = "";

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f78472b = "";

    /* JADX INFO: renamed from: c */
    @NotNull
    public String f78473c = "";

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC41669n<Boolean> f78474d = C41679x.m91009a(Boolean.TRUE);

    /* JADX INFO: renamed from: e */
    @NotNull
    public final InterfaceC41669n<String> f78475e = C41679x.m91009a("https://liteav-test-1252463788.cos.ap-guangzhou.myqcloud.com/voice_room/voice_room_cover1.png");

    /* JADX INFO: renamed from: f */
    @NotNull
    public final InterfaceC41669n<LiveStreamPrivacyStatus> f78476f = C41679x.m91009a(LiveStreamPrivacyStatus.PUBLIC);

    /* JADX INFO: renamed from: g */
    @NotNull
    public final InterfaceC41669n<Integer> f78477g = C41679x.m91009a(600);

    /* JADX INFO: renamed from: h */
    @NotNull
    public final InterfaceC41669n<Integer> f78478h = C41679x.m91009a(600);

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC41669n<String> f78479i = C41679x.m91009a("");

    /* JADX INFO: compiled from: AnchorPrepareState.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareState$Companion;", "", "<init>", "()V", "MAX_INPUT_BYTE_LENGTH", "", "COVER_URL_LIST", "", "", "getCOVER_URL_LIST", "()[Ljava/lang/String;", "[Ljava/lang/String;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final String[] getCOVER_URL_LIST() {
            return AnchorPrepareState.f78470k;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n<Integer> m80621b() {
        return this.f78477g;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n<Integer> m80622c() {
        return this.f78478h;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n<String> m80623d() {
        return this.f78475e;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n<LiveStreamPrivacyStatus> m80624e() {
        return this.f78476f;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF78473c() {
        return this.f78473c;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InterfaceC41669n<String> m80626g() {
        return this.f78479i;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final InterfaceC41669n<Boolean> m80627h() {
        return this.f78474d;
    }

    /* JADX INFO: renamed from: i */
    public final void m80628i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f78473c = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m80629j(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f78471a = str;
    }

    /* JADX INFO: renamed from: k */
    public final void m80630k(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f78472b = str;
    }
}
