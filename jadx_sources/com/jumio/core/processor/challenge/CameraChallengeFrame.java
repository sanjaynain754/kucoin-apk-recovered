package com.jumio.core.processor.challenge;

import android.graphics.Color;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.jumio.commons.camera.CaptureSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import jumio.core.AbstractC40514C2;
import jumio.core.AbstractC40653e0;
import jumio.core.AbstractC40749x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010&\u001a\u00020'J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003JY\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0005HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00066"}, m90084d2 = {"Lcom/jumio/core/processor/challenge/CameraChallengeFrame;", "", DocumentClassifier.KEY_SIDE, "", "color", "", "colorTime", "", "deviation", "", "deviationTime", "settings", "Lcom/jumio/commons/camera/CaptureSettings;", "metadata", "Lcom/jumio/commons/camera/Frame$Metadata;", "state", "Lcom/jumio/core/processor/challenge/CameraChallengeState;", "<init>", "(Ljava/lang/String;IJDJLcom/jumio/commons/camera/CaptureSettings;Lcom/jumio/commons/camera/Frame$Metadata;Lcom/jumio/core/processor/challenge/CameraChallengeState;)V", "getClassifier", "()Ljava/lang/String;", "getColor", "()I", "getColorTime", "()J", "getDeviation", "()D", "getDeviationTime", "getSettings", "()Lcom/jumio/commons/camera/CaptureSettings;", "setSettings", "(Lcom/jumio/commons/camera/CaptureSettings;)V", "getMetadata", "()Lcom/jumio/commons/camera/Frame$Metadata;", "getState", "()Lcom/jumio/core/processor/challenge/CameraChallengeState;", "setState", "(Lcom/jumio/core/processor/challenge/CameraChallengeState;)V", "toJsonObject", "Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CameraChallengeFrame {

    /* JADX INFO: renamed from: a */
    public final String f14498a;

    /* JADX INFO: renamed from: b */
    public final int f14499b;

    /* JADX INFO: renamed from: c */
    public final long f14500c;

    /* JADX INFO: renamed from: d */
    public final double f14501d;

    /* JADX INFO: renamed from: e */
    public final long f14502e;

    /* JADX INFO: renamed from: f */
    public CaptureSettings f14503f;

    /* JADX INFO: renamed from: g */
    public final Frame.Metadata f14504g;

    /* JADX INFO: renamed from: h */
    public CameraChallengeState f14505h;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraChallengeFrame)) {
            return false;
        }
        CameraChallengeFrame cameraChallengeFrame = (CameraChallengeFrame) other;
        return Intrinsics.areEqual(this.f14498a, cameraChallengeFrame.f14498a) && this.f14499b == cameraChallengeFrame.f14499b && this.f14500c == cameraChallengeFrame.f14500c && Double.compare(this.f14501d, cameraChallengeFrame.f14501d) == 0 && this.f14502e == cameraChallengeFrame.f14502e && Intrinsics.areEqual(this.f14503f, cameraChallengeFrame.f14503f) && Intrinsics.areEqual(this.f14504g, cameraChallengeFrame.f14504g) && this.f14505h == cameraChallengeFrame.f14505h;
    }

    public CameraChallengeFrame(@NotNull String classifier, int i11, long j11, double d11, long j12, @NotNull CaptureSettings settings, @NotNull Frame.Metadata metadata, @NotNull CameraChallengeState state) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f14498a = classifier;
        this.f14499b = i11;
        this.f14500c = j11;
        this.f14501d = d11;
        this.f14502e = j12;
        this.f14503f = settings;
        this.f14504g = metadata;
        this.f14505h = state;
    }

    public static /* synthetic */ CameraChallengeFrame copy$default(CameraChallengeFrame cameraChallengeFrame, String str, int i11, long j11, double d11, long j12, CaptureSettings captureSettings, Frame.Metadata metadata, CameraChallengeState cameraChallengeState, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = cameraChallengeFrame.f14498a;
        }
        if ((i12 & 2) != 0) {
            i11 = cameraChallengeFrame.f14499b;
        }
        if ((i12 & 4) != 0) {
            j11 = cameraChallengeFrame.f14500c;
        }
        if ((i12 & 8) != 0) {
            d11 = cameraChallengeFrame.f14501d;
        }
        if ((i12 & 16) != 0) {
            j12 = cameraChallengeFrame.f14502e;
        }
        if ((i12 & 32) != 0) {
            captureSettings = cameraChallengeFrame.f14503f;
        }
        if ((i12 & 64) != 0) {
            metadata = cameraChallengeFrame.f14504g;
        }
        if ((i12 & 128) != 0) {
            cameraChallengeState = cameraChallengeFrame.f14505h;
        }
        CameraChallengeState cameraChallengeState2 = cameraChallengeState;
        CaptureSettings captureSettings2 = captureSettings;
        long j13 = j12;
        double d12 = d11;
        long j14 = j11;
        return cameraChallengeFrame.copy(str, i11, j14, d12, j13, captureSettings2, metadata, cameraChallengeState2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF14498a() {
        return this.f14498a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getF14499b() {
        return this.f14499b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getF14500c() {
        return this.f14500c;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getF14501d() {
        return this.f14501d;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getF14502e() {
        return this.f14502e;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CaptureSettings getF14503f() {
        return this.f14503f;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Frame.Metadata getF14504g() {
        return this.f14504g;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final CameraChallengeState getF14505h() {
        return this.f14505h;
    }

    @NotNull
    public final CameraChallengeFrame copy(@NotNull String classifier, int color, long colorTime, double deviation, long deviationTime, @NotNull CaptureSettings settings, @NotNull Frame.Metadata metadata, @NotNull CameraChallengeState state) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(state, "state");
        return new CameraChallengeFrame(classifier, color, colorTime, deviation, deviationTime, settings, metadata, state);
    }

    @NotNull
    public final String getClassifier() {
        return this.f14498a;
    }

    public final int getColor() {
        return this.f14499b;
    }

    public final long getColorTime() {
        return this.f14500c;
    }

    public final double getDeviation() {
        return this.f14501d;
    }

    public final long getDeviationTime() {
        return this.f14502e;
    }

    @NotNull
    public final Frame.Metadata getMetadata() {
        return this.f14504g;
    }

    @NotNull
    public final CaptureSettings getSettings() {
        return this.f14503f;
    }

    @NotNull
    public final CameraChallengeState getState() {
        return this.f14505h;
    }

    public int hashCode() {
        return this.f14505h.hashCode() + ((this.f14504g.hashCode() + ((this.f14503f.hashCode() + AbstractC40749x1.m89269a(this.f14502e, (Double.hashCode(this.f14501d) + AbstractC40749x1.m89269a(this.f14500c, AbstractC40653e0.m89252a(this.f14499b, this.f14498a.hashCode() * 31, 31), 31)) * 31, 31)) * 31)) * 31);
    }

    public final void setSettings(@NotNull CaptureSettings captureSettings) {
        Intrinsics.checkNotNullParameter(captureSettings, "<set-?>");
        this.f14503f = captureSettings;
    }

    public final void setState(@NotNull CameraChallengeState cameraChallengeState) {
        Intrinsics.checkNotNullParameter(cameraChallengeState, "<set-?>");
        this.f14505h = cameraChallengeState;
    }

    @NotNull
    public final JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DocumentClassifier.KEY_SIDE, this.f14498a);
        jSONObject.put("state", this.f14505h.name());
        jSONObject.put("timestamp", this.f14504g.getTimestamp());
        jSONObject.put("red", Color.red(this.f14499b));
        jSONObject.put("green", Color.green(this.f14499b));
        jSONObject.put("blue", Color.blue(this.f14499b));
        jSONObject.put("focus", this.f14501d / ((double) 16581375));
        jSONObject.put("fNumber", AbstractC40514C2.m89155a(this.f14504g.getAperture(), 3));
        jSONObject.put(JAnalysisConstants.TYPE_EXPOSURE, AbstractC40514C2.m89155a(this.f14504g.getShutterSpeed() / 1.0E9d, 5));
        jSONObject.put("iso", this.f14504g.getIso());
        jSONObject.put("lensPosition", AbstractC40514C2.m89155a(this.f14504g.getLensPosition(), 2));
        float[] colorSpaceTransform = this.f14504g.getColorSpaceTransform();
        jSONObject.put("colorMatrix", colorSpaceTransform != null ? new JSONArray(colorSpaceTransform) : new JSONArray());
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "CameraChallengeFrame(classifier=" + this.f14498a + ", color=" + this.f14499b + ", colorTime=" + this.f14500c + ", deviation=" + this.f14501d + ", deviationTime=" + this.f14502e + ", settings=" + this.f14503f + ", metadata=" + this.f14504g + ", state=" + this.f14505h + ')';
    }
}
