package wd0;

import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wd0.i, reason: from toString */
/* JADX INFO: compiled from: AnchorStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\bj\b\u0012\u0004\u0012\u00020\u0003`\t0\u0007\u0012\u001c\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\bj\b\u0012\u0004\u0012\u00020\u0003`\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u001a\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\bj\b\u0012\u0004\u0012\u00020\u0003`\t0\u0007HÆ\u0003J\u001f\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\bj\b\u0012\u0004\u0012\u00020\u0003`\t0\u0007HÆ\u0003J]\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\bj\b\u0012\u0004\u0012\u00020\u0003`\t0\u00072\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\bj\b\u0012\u0004\u0012\u00020\u0003`\t0\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R'\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\bj\b\u0012\u0004\u0012\u00020\u0003`\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R'\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\bj\b\u0012\u0004\u0012\u00020\u0003`\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006#"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorState;", "", "roomId", "", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "lockAudioUserList", "Lkotlinx/coroutines/flow/StateFlow;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "lockVideoUserList", "<init>", "(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)V", "getRoomId", "()Ljava/lang/String;", "setRoomId", "(Ljava/lang/String;)V", "getLiveInfo", "()Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "setLiveInfo", "(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V", "getLockAudioUserList", "()Lkotlinx/coroutines/flow/StateFlow;", "getLockVideoUserList", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AnchorState {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public String roomId;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public LiveInfo liveInfo;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final InterfaceC41678w<LinkedHashSet<String>> lockAudioUserList;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final InterfaceC41678w<LinkedHashSet<String>> lockVideoUserList;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnchorState)) {
            return false;
        }
        AnchorState anchorState = (AnchorState) other;
        return Intrinsics.areEqual(this.roomId, anchorState.roomId) && Intrinsics.areEqual(this.liveInfo, anchorState.liveInfo) && Intrinsics.areEqual(this.lockAudioUserList, anchorState.lockAudioUserList) && Intrinsics.areEqual(this.lockVideoUserList, anchorState.lockVideoUserList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchorState(@NotNull String roomId, @NotNull LiveInfo liveInfo, @NotNull InterfaceC41678w<? extends LinkedHashSet<String>> lockAudioUserList, @NotNull InterfaceC41678w<? extends LinkedHashSet<String>> lockVideoUserList) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        Intrinsics.checkNotNullParameter(lockAudioUserList, "lockAudioUserList");
        Intrinsics.checkNotNullParameter(lockVideoUserList, "lockVideoUserList");
        this.roomId = roomId;
        this.liveInfo = liveInfo;
        this.lockAudioUserList = lockAudioUserList;
        this.lockVideoUserList = lockVideoUserList;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final LiveInfo getLiveInfo() {
        return this.liveInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC41678w<LinkedHashSet<String>> m101161b() {
        return this.lockAudioUserList;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC41678w<LinkedHashSet<String>> m101162c() {
        return this.lockVideoUserList;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRoomId() {
        return this.roomId;
    }

    /* JADX INFO: renamed from: e */
    public final void m101164e(@NotNull LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "<set-?>");
        this.liveInfo = liveInfo;
    }

    /* JADX INFO: renamed from: f */
    public final void m101165f(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomId = str;
    }

    public int hashCode() {
        return (((((this.roomId.hashCode() * 31) + this.liveInfo.hashCode()) * 31) + this.lockAudioUserList.hashCode()) * 31) + this.lockVideoUserList.hashCode();
    }

    @NotNull
    public String toString() {
        return "AnchorState(roomId=" + this.roomId + ", liveInfo=" + this.liveInfo + ", lockAudioUserList=" + this.lockAudioUserList + ", lockVideoUserList=" + this.lockVideoUserList + ')';
    }
}
