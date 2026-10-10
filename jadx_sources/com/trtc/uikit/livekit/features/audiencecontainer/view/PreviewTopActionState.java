package com.trtc.uikit.livekit.features.audiencecontainer.view;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.features.audiencecontainer.view.w, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: PreviewTopActionState.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/view/PreviewTopActionState;", "", "showPreviewShare", "", "showPreviewReport", "showFloatWindow", "<init>", "(ZZZ)V", "getShowPreviewShare", "()Z", "getShowPreviewReport", "getShowFloatWindow", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PreviewTopActionState {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean showPreviewShare;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final boolean showPreviewReport;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final boolean showFloatWindow;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewTopActionState)) {
            return false;
        }
        PreviewTopActionState previewTopActionState = (PreviewTopActionState) other;
        return this.showPreviewShare == previewTopActionState.showPreviewShare && this.showPreviewReport == previewTopActionState.showPreviewReport && this.showFloatWindow == previewTopActionState.showFloatWindow;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getShowFloatWindow() {
        return this.showFloatWindow;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowPreviewReport() {
        return this.showPreviewReport;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowPreviewShare() {
        return this.showPreviewShare;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.showPreviewShare) * 31) + Boolean.hashCode(this.showPreviewReport)) * 31) + Boolean.hashCode(this.showFloatWindow);
    }

    @NotNull
    public String toString() {
        return "PreviewTopActionState(showPreviewShare=" + this.showPreviewShare + ", showPreviewReport=" + this.showPreviewReport + ", showFloatWindow=" + this.showFloatWindow + ')';
    }

    public PreviewTopActionState(boolean z11, boolean z12, boolean z13) {
        this.showPreviewShare = z11;
        this.showPreviewReport = z12;
        this.showFloatWindow = z13;
    }
}
