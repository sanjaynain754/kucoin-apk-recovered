package ee0;

import android.graphics.Bitmap;
import io.trtc.tuikit.atomicxcore.api.device.VideoQuality;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ee0.h, reason: from toString */
/* JADX INFO: compiled from: MediaStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003HÆ\u0003Je\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/MediaState;", "", "isPictureInPictureMode", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "playbackQuality", "Lio/trtc/tuikit/atomicxcore/api/device/VideoQuality;", "playbackQualityList", "", "bigMuteBitmap", "Landroid/graphics/Bitmap;", "smallMuteBitmap", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;)V", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getPlaybackQuality", "getPlaybackQualityList", "getBigMuteBitmap", "getSmallMuteBitmap", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MediaState {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final InterfaceC41669n<Boolean> isPictureInPictureMode;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final InterfaceC41669n<VideoQuality> playbackQuality;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final InterfaceC41669n<List<VideoQuality>> playbackQualityList;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final InterfaceC41669n<Bitmap> bigMuteBitmap;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final InterfaceC41669n<Bitmap> smallMuteBitmap;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaState)) {
            return false;
        }
        MediaState mediaState = (MediaState) other;
        return Intrinsics.areEqual(this.isPictureInPictureMode, mediaState.isPictureInPictureMode) && Intrinsics.areEqual(this.playbackQuality, mediaState.playbackQuality) && Intrinsics.areEqual(this.playbackQualityList, mediaState.playbackQualityList) && Intrinsics.areEqual(this.bigMuteBitmap, mediaState.bigMuteBitmap) && Intrinsics.areEqual(this.smallMuteBitmap, mediaState.smallMuteBitmap);
    }

    public MediaState(@NotNull InterfaceC41669n<Boolean> isPictureInPictureMode, @NotNull InterfaceC41669n<VideoQuality> playbackQuality, @NotNull InterfaceC41669n<List<VideoQuality>> playbackQualityList, @NotNull InterfaceC41669n<Bitmap> bigMuteBitmap, @NotNull InterfaceC41669n<Bitmap> smallMuteBitmap) {
        Intrinsics.checkNotNullParameter(isPictureInPictureMode, "isPictureInPictureMode");
        Intrinsics.checkNotNullParameter(playbackQuality, "playbackQuality");
        Intrinsics.checkNotNullParameter(playbackQualityList, "playbackQualityList");
        Intrinsics.checkNotNullParameter(bigMuteBitmap, "bigMuteBitmap");
        Intrinsics.checkNotNullParameter(smallMuteBitmap, "smallMuteBitmap");
        this.isPictureInPictureMode = isPictureInPictureMode;
        this.playbackQuality = playbackQuality;
        this.playbackQualityList = playbackQualityList;
        this.bigMuteBitmap = bigMuteBitmap;
        this.smallMuteBitmap = smallMuteBitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC41669n<Bitmap> m83107a() {
        return this.bigMuteBitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n<VideoQuality> m83108b() {
        return this.playbackQuality;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n<List<VideoQuality>> m83109c() {
        return this.playbackQualityList;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n<Bitmap> m83110d() {
        return this.smallMuteBitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n<Boolean> m83111e() {
        return this.isPictureInPictureMode;
    }

    public int hashCode() {
        return (((((((this.isPictureInPictureMode.hashCode() * 31) + this.playbackQuality.hashCode()) * 31) + this.playbackQualityList.hashCode()) * 31) + this.bigMuteBitmap.hashCode()) * 31) + this.smallMuteBitmap.hashCode();
    }

    @NotNull
    public String toString() {
        return "MediaState(isPictureInPictureMode=" + this.isPictureInPictureMode + ", playbackQuality=" + this.playbackQuality + ", playbackQualityList=" + this.playbackQualityList + ", bigMuteBitmap=" + this.bigMuteBitmap + ", smallMuteBitmap=" + this.smallMuteBitmap + ')';
    }
}
