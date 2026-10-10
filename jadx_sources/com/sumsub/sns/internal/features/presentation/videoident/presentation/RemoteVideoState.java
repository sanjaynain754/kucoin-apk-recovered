package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\r\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/RemoteVideoState;", "", "showVideoView", "", ViewProps.ASPECT_RATIO, "", "caption", "", "showLoader", "<init>", "(ZFLjava/lang/CharSequence;Z)V", "getShowVideoView", "()Z", "getAspectRatio", "()F", "getCaption", "()Ljava/lang/CharSequence;", "getShowLoader", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* data */ class RemoteVideoState {
    private final float aspectRatio;

    @Nullable
    private final CharSequence caption;
    private final boolean showLoader;
    private final boolean showVideoView;

    public RemoteVideoState(boolean z11, float f11, @Nullable CharSequence charSequence, boolean z12) {
        this.showVideoView = z11;
        this.aspectRatio = f11;
        this.caption = charSequence;
        this.showLoader = z12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteVideoState)) {
            return false;
        }
        RemoteVideoState remoteVideoState = (RemoteVideoState) other;
        return this.showVideoView == remoteVideoState.showVideoView && Float.compare(this.aspectRatio, remoteVideoState.aspectRatio) == 0 && Intrinsics.areEqual(this.caption, remoteVideoState.caption) && this.showLoader == remoteVideoState.showLoader;
    }

    public static /* synthetic */ RemoteVideoState copy$default(RemoteVideoState remoteVideoState, boolean z11, float f11, CharSequence charSequence, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = remoteVideoState.showVideoView;
        }
        if ((i11 & 2) != 0) {
            f11 = remoteVideoState.aspectRatio;
        }
        if ((i11 & 4) != 0) {
            charSequence = remoteVideoState.caption;
        }
        if ((i11 & 8) != 0) {
            z12 = remoteVideoState.showLoader;
        }
        return remoteVideoState.copy(z11, f11, charSequence, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowVideoView() {
        return this.showVideoView;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CharSequence getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowLoader() {
        return this.showLoader;
    }

    @NotNull
    public final RemoteVideoState copy(boolean showVideoView, float aspectRatio, @Nullable CharSequence caption, boolean showLoader) {
        return new RemoteVideoState(showVideoView, aspectRatio, caption, showLoader);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @Nullable
    public final CharSequence getCaption() {
        return this.caption;
    }

    public final boolean getShowLoader() {
        return this.showLoader;
    }

    public final boolean getShowVideoView() {
        return this.showVideoView;
    }

    public int hashCode() {
        int iHashCode = (Float.hashCode(this.aspectRatio) + (Boolean.hashCode(this.showVideoView) * 31)) * 31;
        CharSequence charSequence = this.caption;
        return Boolean.hashCode(this.showLoader) + ((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.showVideoView;
        float f11 = this.aspectRatio;
        CharSequence charSequence = this.caption;
        return "RemoteVideoState(showVideoView=" + z11 + ", aspectRatio=" + f11 + ", caption=" + ((Object) charSequence) + ", showLoader=" + this.showLoader + ")";
    }

    public /* synthetic */ RemoteVideoState(boolean z11, float f11, CharSequence charSequence, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, f11, charSequence, (i11 & 8) != 0 ? false : z12);
    }
}
