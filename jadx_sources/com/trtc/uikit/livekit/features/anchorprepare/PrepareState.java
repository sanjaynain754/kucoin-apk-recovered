package com.trtc.uikit.livekit.features.anchorprepare;

import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.d, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: AnchorPrepareViewDefine.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003JY\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/PrepareState;", "", "coverURL", "Lkotlinx/coroutines/flow/StateFlow;", "", "liveMode", "Lcom/trtc/uikit/livekit/features/anchorprepare/LiveStreamPrivacyStatus;", "roomName", "coGuestTemplateId", "", "coHostTemplateId", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PrepareState {

    /* JADX INFO: renamed from: a, reason: from toString */
    @JvmField
    @NotNull
    public final InterfaceC41678w<String> coverURL;

    /* JADX INFO: renamed from: b, reason: from toString */
    @JvmField
    @NotNull
    public final InterfaceC41678w<LiveStreamPrivacyStatus> liveMode;

    /* JADX INFO: renamed from: c, reason: from toString */
    @JvmField
    @NotNull
    public final InterfaceC41678w<String> roomName;

    /* JADX INFO: renamed from: d, reason: from toString */
    @JvmField
    @NotNull
    public final InterfaceC41678w<Integer> coGuestTemplateId;

    /* JADX INFO: renamed from: e, reason: from toString */
    @JvmField
    @NotNull
    public final InterfaceC41678w<Integer> coHostTemplateId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrepareState)) {
            return false;
        }
        PrepareState prepareState = (PrepareState) other;
        return Intrinsics.areEqual(this.coverURL, prepareState.coverURL) && Intrinsics.areEqual(this.liveMode, prepareState.liveMode) && Intrinsics.areEqual(this.roomName, prepareState.roomName) && Intrinsics.areEqual(this.coGuestTemplateId, prepareState.coGuestTemplateId) && Intrinsics.areEqual(this.coHostTemplateId, prepareState.coHostTemplateId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrepareState(@NotNull InterfaceC41678w<String> coverURL, @NotNull InterfaceC41678w<? extends LiveStreamPrivacyStatus> liveMode, @NotNull InterfaceC41678w<String> roomName, @NotNull InterfaceC41678w<Integer> coGuestTemplateId, @NotNull InterfaceC41678w<Integer> coHostTemplateId) {
        Intrinsics.checkNotNullParameter(coverURL, "coverURL");
        Intrinsics.checkNotNullParameter(liveMode, "liveMode");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(coGuestTemplateId, "coGuestTemplateId");
        Intrinsics.checkNotNullParameter(coHostTemplateId, "coHostTemplateId");
        this.coverURL = coverURL;
        this.liveMode = liveMode;
        this.roomName = roomName;
        this.coGuestTemplateId = coGuestTemplateId;
        this.coHostTemplateId = coHostTemplateId;
    }

    public int hashCode() {
        return (((((((this.coverURL.hashCode() * 31) + this.liveMode.hashCode()) * 31) + this.roomName.hashCode()) * 31) + this.coGuestTemplateId.hashCode()) * 31) + this.coHostTemplateId.hashCode();
    }

    @NotNull
    public String toString() {
        return "PrepareState(coverURL=" + this.coverURL + ", liveMode=" + this.liveMode + ", roomName=" + this.roomName + ", coGuestTemplateId=" + this.coGuestTemplateId + ", coHostTemplateId=" + this.coHostTemplateId + ')';
    }
}
