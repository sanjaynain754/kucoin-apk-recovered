package io.trtc.tuikit.atomicxcore.api.live;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LiveCanvas;", "", "w", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "templateID", "(III)V", "getH", "()I", "setH", "(I)V", "getTemplateID", "setTemplateID", "getW", "setW", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class LiveCanvas {
    private int h;
    private int templateID;
    private int w;

    public LiveCanvas() {
        this(0, 0, 0, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveCanvas)) {
            return false;
        }
        LiveCanvas liveCanvas = (LiveCanvas) other;
        return this.w == liveCanvas.w && this.h == liveCanvas.h && this.templateID == liveCanvas.templateID;
    }

    public LiveCanvas(int i11, int i12, int i13) {
        this.w = i11;
        this.h = i12;
        this.templateID = i13;
    }

    public static /* synthetic */ LiveCanvas copy$default(LiveCanvas liveCanvas, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = liveCanvas.w;
        }
        if ((i14 & 2) != 0) {
            i12 = liveCanvas.h;
        }
        if ((i14 & 4) != 0) {
            i13 = liveCanvas.templateID;
        }
        return liveCanvas.copy(i11, i12, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getW() {
        return this.w;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTemplateID() {
        return this.templateID;
    }

    @NotNull
    public final LiveCanvas copy(int w11, int h11, int templateID) {
        return new LiveCanvas(w11, h11, templateID);
    }

    public final int getH() {
        return this.h;
    }

    public final int getTemplateID() {
        return this.templateID;
    }

    public final int getW() {
        return this.w;
    }

    public int hashCode() {
        return Integer.hashCode(this.templateID) + AbstractC39396a.m88225a(this.h, Integer.hashCode(this.w) * 31, 31);
    }

    public final void setH(int i11) {
        this.h = i11;
    }

    public final void setTemplateID(int i11) {
        this.templateID = i11;
    }

    public final void setW(int i11) {
        this.w = i11;
    }

    @NotNull
    public String toString() {
        return "LiveCanvas(w=" + this.w + ", h=" + this.h + ", templateID=" + this.templateID + ')';
    }

    public /* synthetic */ LiveCanvas(int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 600 : i13);
    }
}
