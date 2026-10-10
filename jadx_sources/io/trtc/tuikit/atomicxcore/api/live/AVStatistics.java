package io.trtc.tuikit.atomicxcore.api.live;

import io.trtc.tuikit.atomicxcore.api.call.AbstractC39396a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006+"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/AVStatistics;", "", "userID", "", "videoBitrate", "", "videoWidth", "videoHeight", "frameRate", "audioSampleRate", "audioBitrate", "(Ljava/lang/String;IIIIII)V", "getAudioBitrate", "()I", "setAudioBitrate", "(I)V", "getAudioSampleRate", "setAudioSampleRate", "getFrameRate", "setFrameRate", "getUserID", "()Ljava/lang/String;", "setUserID", "(Ljava/lang/String;)V", "getVideoBitrate", "setVideoBitrate", "getVideoHeight", "setVideoHeight", "getVideoWidth", "setVideoWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class AVStatistics {
    private int audioBitrate;
    private int audioSampleRate;
    private int frameRate;

    @NotNull
    private String userID;
    private int videoBitrate;
    private int videoHeight;
    private int videoWidth;

    public AVStatistics() {
        this(null, 0, 0, 0, 0, 0, 0, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AVStatistics)) {
            return false;
        }
        AVStatistics aVStatistics = (AVStatistics) other;
        return Intrinsics.areEqual(this.userID, aVStatistics.userID) && this.videoBitrate == aVStatistics.videoBitrate && this.videoWidth == aVStatistics.videoWidth && this.videoHeight == aVStatistics.videoHeight && this.frameRate == aVStatistics.frameRate && this.audioSampleRate == aVStatistics.audioSampleRate && this.audioBitrate == aVStatistics.audioBitrate;
    }

    public AVStatistics(@NotNull String userID, int i11, int i12, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.userID = userID;
        this.videoBitrate = i11;
        this.videoWidth = i12;
        this.videoHeight = i13;
        this.frameRate = i14;
        this.audioSampleRate = i15;
        this.audioBitrate = i16;
    }

    public static /* synthetic */ AVStatistics copy$default(AVStatistics aVStatistics, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            str = aVStatistics.userID;
        }
        if ((i17 & 2) != 0) {
            i11 = aVStatistics.videoBitrate;
        }
        if ((i17 & 4) != 0) {
            i12 = aVStatistics.videoWidth;
        }
        if ((i17 & 8) != 0) {
            i13 = aVStatistics.videoHeight;
        }
        if ((i17 & 16) != 0) {
            i14 = aVStatistics.frameRate;
        }
        if ((i17 & 32) != 0) {
            i15 = aVStatistics.audioSampleRate;
        }
        if ((i17 & 64) != 0) {
            i16 = aVStatistics.audioBitrate;
        }
        int i18 = i15;
        int i19 = i16;
        int i21 = i14;
        int i22 = i12;
        return aVStatistics.copy(str, i11, i22, i13, i21, i18, i19);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVideoBitrate() {
        return this.videoBitrate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getVideoWidth() {
        return this.videoWidth;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getVideoHeight() {
        return this.videoHeight;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFrameRate() {
        return this.frameRate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAudioSampleRate() {
        return this.audioSampleRate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getAudioBitrate() {
        return this.audioBitrate;
    }

    public final int getAudioBitrate() {
        return this.audioBitrate;
    }

    public final int getAudioSampleRate() {
        return this.audioSampleRate;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    @NotNull
    public final String getUserID() {
        return this.userID;
    }

    public final int getVideoBitrate() {
        return this.videoBitrate;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public int hashCode() {
        return Integer.hashCode(this.audioBitrate) + AbstractC39396a.m88225a(this.audioSampleRate, AbstractC39396a.m88225a(this.frameRate, AbstractC39396a.m88225a(this.videoHeight, AbstractC39396a.m88225a(this.videoWidth, AbstractC39396a.m88225a(this.videoBitrate, this.userID.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final void setAudioBitrate(int i11) {
        this.audioBitrate = i11;
    }

    public final void setAudioSampleRate(int i11) {
        this.audioSampleRate = i11;
    }

    public final void setFrameRate(int i11) {
        this.frameRate = i11;
    }

    public final void setUserID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userID = str;
    }

    public final void setVideoBitrate(int i11) {
        this.videoBitrate = i11;
    }

    public final void setVideoHeight(int i11) {
        this.videoHeight = i11;
    }

    public final void setVideoWidth(int i11) {
        this.videoWidth = i11;
    }

    @NotNull
    public String toString() {
        return "AVStatistics(userID=" + this.userID + ", videoBitrate=" + this.videoBitrate + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", frameRate=" + this.frameRate + ", audioSampleRate=" + this.audioSampleRate + ", audioBitrate=" + this.audioBitrate + ')';
    }

    @NotNull
    public final AVStatistics copy(@NotNull String userID, int videoBitrate, int videoWidth, int videoHeight, int frameRate, int audioSampleRate, int audioBitrate) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        return new AVStatistics(userID, videoBitrate, videoWidth, videoHeight, frameRate, audioSampleRate, audioBitrate);
    }

    public /* synthetic */ AVStatistics(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? 0 : i11, (i17 & 4) != 0 ? 0 : i12, (i17 & 8) != 0 ? 0 : i13, (i17 & 16) != 0 ? 0 : i14, (i17 & 32) != 0 ? 0 : i15, (i17 & 64) != 0 ? 0 : i16);
    }
}
