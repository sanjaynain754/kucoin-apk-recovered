package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.commons.camera.Size;
import com.jumio.core.model.StaticModel;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aBM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lcom/jumio/core/models/DocfinderSettingsModel;", "Lcom/jumio/core/model/StaticModel;", "frameRateThreshold", "", "samplingTimeInMs", "", "violationLimit", "modelInitTimeoutInMs", "rotationTolerance", "", "minAllowedRatio", "minDetectionSize", "Lcom/jumio/commons/camera/Size;", "<init>", "(IJIJDDLcom/jumio/commons/camera/Size;)V", "getFrameRateThreshold", "()I", "getSamplingTimeInMs", "()J", "getViolationLimit", "getModelInitTimeoutInMs", "getRotationTolerance", "()D", "getMinAllowedRatio", "getMinDetectionSize", "()Lcom/jumio/commons/camera/Size;", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("DocfinderSettingsModel")
public final class DocfinderSettingsModel implements StaticModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final int f14215a;

    /* JADX INFO: renamed from: b */
    public final long f14216b;

    /* JADX INFO: renamed from: c */
    public final int f14217c;

    /* JADX INFO: renamed from: d */
    public final long f14218d;

    /* JADX INFO: renamed from: e */
    public final double f14219e;

    /* JADX INFO: renamed from: f */
    public final double f14220f;

    /* JADX INFO: renamed from: g */
    public final Size f14221g;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/DocfinderSettingsModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/DocfinderSettingsModel;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final DocfinderSettingsModel fromJson(@NotNull JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            return new DocfinderSettingsModel(jsonObject.optInt("frameRateThreshold", 4), jsonObject.optLong("samplingTimeInMs", 1000000000L), jsonObject.optInt("violationLimit", 3), jsonObject.optLong("modelInitTimeoutInMs", 5000L), jsonObject.optDouble("rotationTolerance", 0.349066d), jsonObject.optDouble("minAllowedRatio", 0.65d), new Size(jsonObject.optInt("minDetectionWidth", 512), jsonObject.optInt("minDetectionHeight", 323)));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DocfinderSettingsModel() {
        this(0, 0L, 0, 0L, 0.0d, 0.0d, null, 127, null);
    }

    public DocfinderSettingsModel(int i11, long j11, int i12, long j12, double d11, double d12, @NotNull Size minDetectionSize) {
        Intrinsics.checkNotNullParameter(minDetectionSize, "minDetectionSize");
        this.f14215a = i11;
        this.f14216b = j11;
        this.f14217c = i12;
        this.f14218d = j12;
        this.f14219e = d11;
        this.f14220f = d12;
        this.f14221g = minDetectionSize;
    }

    /* JADX INFO: renamed from: getFrameRateThreshold, reason: from getter */
    public final int getF14215a() {
        return this.f14215a;
    }

    /* JADX INFO: renamed from: getMinAllowedRatio, reason: from getter */
    public final double getF14220f() {
        return this.f14220f;
    }

    @NotNull
    /* JADX INFO: renamed from: getMinDetectionSize, reason: from getter */
    public final Size getF14221g() {
        return this.f14221g;
    }

    /* JADX INFO: renamed from: getModelInitTimeoutInMs, reason: from getter */
    public final long getF14218d() {
        return this.f14218d;
    }

    /* JADX INFO: renamed from: getRotationTolerance, reason: from getter */
    public final double getF14219e() {
        return this.f14219e;
    }

    /* JADX INFO: renamed from: getSamplingTimeInMs, reason: from getter */
    public final long getF14216b() {
        return this.f14216b;
    }

    /* JADX INFO: renamed from: getViolationLimit, reason: from getter */
    public final int getF14217c() {
        return this.f14217c;
    }

    public /* synthetic */ DocfinderSettingsModel(int i11, long j11, int i12, long j12, double d11, double d12, Size size, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 4 : i11, (i13 & 2) != 0 ? 1000000000L : j11, (i13 & 4) != 0 ? 3 : i12, (i13 & 8) != 0 ? 5000L : j12, (i13 & 16) != 0 ? 0.349066d : d11, (i13 & 32) != 0 ? 0.65d : d12, (i13 & 64) != 0 ? new Size(512, 323) : size);
    }
}
