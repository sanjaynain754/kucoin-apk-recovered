package wd0;

import android.graphics.Bitmap;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wd0.n, reason: from toString */
/* JADX INFO: compiled from: MediaStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/MediaState;", "", "isAudioLocked", "Lkotlinx/coroutines/flow/StateFlow;", "", "isVideoLocked", "isPipModeEnabled", "bigMuteBitmap", "Landroid/graphics/Bitmap;", "smallMuteBitmap", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V", "()Lkotlinx/coroutines/flow/StateFlow;", "getBigMuteBitmap", "()Landroid/graphics/Bitmap;", "setBigMuteBitmap", "(Landroid/graphics/Bitmap;)V", "getSmallMuteBitmap", "setSmallMuteBitmap", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MediaState {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final InterfaceC41678w<Boolean> isAudioLocked;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final InterfaceC41678w<Boolean> isVideoLocked;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final InterfaceC41678w<Boolean> isPipModeEnabled;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public Bitmap bigMuteBitmap;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public Bitmap smallMuteBitmap;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaState)) {
            return false;
        }
        MediaState mediaState = (MediaState) other;
        return Intrinsics.areEqual(this.isAudioLocked, mediaState.isAudioLocked) && Intrinsics.areEqual(this.isVideoLocked, mediaState.isVideoLocked) && Intrinsics.areEqual(this.isPipModeEnabled, mediaState.isPipModeEnabled) && Intrinsics.areEqual(this.bigMuteBitmap, mediaState.bigMuteBitmap) && Intrinsics.areEqual(this.smallMuteBitmap, mediaState.smallMuteBitmap);
    }

    public MediaState(@NotNull InterfaceC41678w<Boolean> isAudioLocked, @NotNull InterfaceC41678w<Boolean> isVideoLocked, @NotNull InterfaceC41678w<Boolean> isPipModeEnabled, @Nullable Bitmap bitmap, @Nullable Bitmap bitmap2) {
        Intrinsics.checkNotNullParameter(isAudioLocked, "isAudioLocked");
        Intrinsics.checkNotNullParameter(isVideoLocked, "isVideoLocked");
        Intrinsics.checkNotNullParameter(isPipModeEnabled, "isPipModeEnabled");
        this.isAudioLocked = isAudioLocked;
        this.isVideoLocked = isVideoLocked;
        this.isPipModeEnabled = isPipModeEnabled;
        this.bigMuteBitmap = bitmap;
        this.smallMuteBitmap = bitmap2;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bitmap getBigMuteBitmap() {
        return this.bigMuteBitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Bitmap getSmallMuteBitmap() {
        return this.smallMuteBitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC41678w<Boolean> m101183c() {
        return this.isPipModeEnabled;
    }

    /* JADX INFO: renamed from: d */
    public final void m101184d(@Nullable Bitmap bitmap) {
        this.bigMuteBitmap = bitmap;
    }

    /* JADX INFO: renamed from: e */
    public final void m101185e(@Nullable Bitmap bitmap) {
        this.smallMuteBitmap = bitmap;
    }

    public int hashCode() {
        int iHashCode = ((((this.isAudioLocked.hashCode() * 31) + this.isVideoLocked.hashCode()) * 31) + this.isPipModeEnabled.hashCode()) * 31;
        Bitmap bitmap = this.bigMuteBitmap;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Bitmap bitmap2 = this.smallMuteBitmap;
        return iHashCode2 + (bitmap2 != null ? bitmap2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MediaState(isAudioLocked=" + this.isAudioLocked + ", isVideoLocked=" + this.isVideoLocked + ", isPipModeEnabled=" + this.isPipModeEnabled + ", bigMuteBitmap=" + this.bigMuteBitmap + ", smallMuteBitmap=" + this.smallMuteBitmap + ')';
    }
}
