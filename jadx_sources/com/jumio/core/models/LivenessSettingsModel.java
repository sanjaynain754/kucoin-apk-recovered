package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import jumio.core.AbstractC40511C;
import jumio.core.AbstractC40653e0;
import jumio.core.AbstractC40749x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002HIB±\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\t\u0010<\u001a\u00020\u0012HÆ\u0003J\t\u0010=\u001a\u00020\u0012HÆ\u0003J\t\u0010>\u001a\u00020\u0015HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J³\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0005HÆ\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020\u0003HÖ\u0001J\t\u0010G\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d¨\u0006J"}, m90084d2 = {"Lcom/jumio/core/models/LivenessSettingsModel;", "Lcom/jumio/core/model/StaticModel;", "frameRateThreshold", "", "samplingTimeInMs", "", "violationLimit", "modelInitTimeoutInMs", "retries", "minTimePerDistanceInMs", "maxFaceCenterDifference", "", "minimumPitch", "maximumPitch", "minimumYaw", "maximumYaw", "requiredDistanceMovementRatio", "portrait", "Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;", "landscape", "configOverride", "", "hardwareLatency", "delayBetweenDistanceInMs", "<init>", "(IJIJIJDIIIIDLcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;Ljava/lang/String;IJ)V", "getFrameRateThreshold", "()I", "getSamplingTimeInMs", "()J", "getViolationLimit", "getModelInitTimeoutInMs", "getRetries", "getMinTimePerDistanceInMs", "getMaxFaceCenterDifference", "()D", "getMinimumPitch", "getMaximumPitch", "getMinimumYaw", "getMaximumYaw", "getRequiredDistanceMovementRatio", "getPortrait", "()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;", "getLandscape", "getConfigOverride", "()Ljava/lang/String;", "getHardwareLatency", "getDelayBetweenDistanceInMs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "LivenessOrientationSettingsModel", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("LivenessSettingsModel")
public final /* data */ class LivenessSettingsModel implements StaticModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final int f14266a;

    /* JADX INFO: renamed from: b */
    public final long f14267b;

    /* JADX INFO: renamed from: c */
    public final int f14268c;

    /* JADX INFO: renamed from: d */
    public final long f14269d;

    /* JADX INFO: renamed from: e */
    public final int f14270e;

    /* JADX INFO: renamed from: f */
    public final long f14271f;

    /* JADX INFO: renamed from: g */
    public final double f14272g;

    /* JADX INFO: renamed from: h */
    public final int f14273h;

    /* JADX INFO: renamed from: i */
    public final int f14274i;

    /* JADX INFO: renamed from: j */
    public final int f14275j;

    /* JADX INFO: renamed from: k */
    public final int f14276k;

    /* JADX INFO: renamed from: l */
    public final double f14277l;

    /* JADX INFO: renamed from: m */
    public final LivenessOrientationSettingsModel f14278m;

    /* JADX INFO: renamed from: n */
    public final LivenessOrientationSettingsModel f14279n;

    /* JADX INFO: renamed from: o */
    public final String f14280o;

    /* JADX INFO: renamed from: p */
    public final int f14281p;

    /* JADX INFO: renamed from: q */
    public final long f14282q;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/LivenessSettingsModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/LivenessSettingsModel;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final LivenessSettingsModel fromJson(@NotNull JSONObject jsonObject) {
            LivenessOrientationSettingsModel livenessOrientationSettingsModelFromJson;
            LivenessOrientationSettingsModel livenessOrientationSettingsModelFromJson2;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            int iOptInt = jsonObject.optInt("frameRateThreshold", 15);
            long jOptLong = jsonObject.optLong("samplingTimeInMs", 1000L);
            int iOptInt2 = jsonObject.optInt("violationLimit", 3);
            long jOptLong2 = jsonObject.optLong("modelInitTimeoutInMs", 5000L);
            int iOptInt3 = jsonObject.optInt("retries", 3);
            long jOptLong3 = jsonObject.optLong("minTimePerDistanceInMs", 1000L);
            double dOptDouble = jsonObject.optDouble("maxFaceCenterDifference", 0.2d);
            int iOptInt4 = jsonObject.optInt("minimumPseudoPitch", 105);
            int iOptInt5 = jsonObject.optInt("maximumPseudoPitch", 170);
            int iOptInt6 = jsonObject.optInt("minimumPseudoYaw", 65);
            int iOptInt7 = jsonObject.optInt("maximumPseudoYaw", 135);
            double dOptDouble2 = jsonObject.optDouble("requiredDistanceMovementRatio", 0.85d);
            String strOptString = jsonObject.optString("configOverride", "{\"nodes\":[{\"nodeName\":\"FarNearCollector\",\"settings\":{\"image_format\":\"webp\"}},{\"nodeName\":\"UserJourneyCollector\",\"settings\":{\"image_format\":\"webp\"}}]}");
            int iOptInt8 = jsonObject.optInt("hardwareLatency", 4);
            long jOptLong4 = jsonObject.optLong("delayBetweenDistanceInMs", 1250L);
            LivenessOrientationSettingsModel livenessOrientationSettingsModel = AbstractC9306a.f14382a;
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("portrait");
            LivenessOrientationSettingsModel livenessOrientationSettingsModel2 = (jSONObjectOptJSONObject == null || (livenessOrientationSettingsModelFromJson2 = LivenessOrientationSettingsModel.INSTANCE.fromJson(jSONObjectOptJSONObject, livenessOrientationSettingsModel)) == null) ? livenessOrientationSettingsModel : livenessOrientationSettingsModelFromJson2;
            LivenessOrientationSettingsModel livenessOrientationSettingsModel3 = AbstractC9306a.f14383b;
            JSONObject jSONObjectOptJSONObject2 = jsonObject.optJSONObject("landscape");
            LivenessOrientationSettingsModel livenessOrientationSettingsModel4 = (jSONObjectOptJSONObject2 == null || (livenessOrientationSettingsModelFromJson = LivenessOrientationSettingsModel.INSTANCE.fromJson(jSONObjectOptJSONObject2, livenessOrientationSettingsModel3)) == null) ? livenessOrientationSettingsModel3 : livenessOrientationSettingsModelFromJson;
            Intrinsics.checkNotNull(strOptString);
            return new LivenessSettingsModel(iOptInt, jOptLong, iOptInt2, jOptLong2, iOptInt3, jOptLong3, dOptDouble, iOptInt4, iOptInt5, iOptInt6, iOptInt7, dOptDouble2, livenessOrientationSettingsModel2, livenessOrientationSettingsModel4, strOptString, iOptInt8, jOptLong4);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\fB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, m90084d2 = {"Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;", "Lcom/jumio/core/model/StaticModel;", "normalizedNearFarCutOffPoint", "", "initialFaceWidthRatioMin", "initialFaceWidthRatioMax", "<init>", "(DDD)V", "getNormalizedNearFarCutOffPoint", "()D", "getInitialFaceWidthRatioMin", "getInitialFaceWidthRatioMax", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class LivenessOrientationSettingsModel implements StaticModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a */
        public final double f14283a;

        /* JADX INFO: renamed from: b */
        public final double f14284b;

        /* JADX INFO: renamed from: c */
        public final double f14285c;

        @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005¨\u0006\t"}, m90084d2 = {"Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;", "jsonObject", "Lorg/json/JSONObject;", "default", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public static /* synthetic */ LivenessOrientationSettingsModel fromJson$default(Companion companion, JSONObject jSONObject, LivenessOrientationSettingsModel livenessOrientationSettingsModel, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    livenessOrientationSettingsModel = AbstractC9306a.f14382a;
                }
                return companion.fromJson(jSONObject, livenessOrientationSettingsModel);
            }

            @NotNull
            public final LivenessOrientationSettingsModel fromJson(@NotNull JSONObject jsonObject, @NotNull LivenessOrientationSettingsModel livenessOrientationSettingsModel) {
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                Intrinsics.checkNotNullParameter(livenessOrientationSettingsModel, "default");
                return new LivenessOrientationSettingsModel(jsonObject.optDouble("normalizedNearFarCutOffPoint", livenessOrientationSettingsModel.getF14283a()), jsonObject.optDouble("initialFaceWidthRatioMin", livenessOrientationSettingsModel.getF14284b()), jsonObject.optDouble("initialFaceWidthRatioMax", livenessOrientationSettingsModel.getF14285c()));
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public LivenessOrientationSettingsModel() {
            this(0.0d, 0.0d, 0.0d, 7, null);
        }

        public LivenessOrientationSettingsModel(double d11, double d12, double d13) {
            this.f14283a = d11;
            this.f14284b = d12;
            this.f14285c = d13;
        }

        /* JADX INFO: renamed from: getInitialFaceWidthRatioMax, reason: from getter */
        public final double getF14285c() {
            return this.f14285c;
        }

        /* JADX INFO: renamed from: getInitialFaceWidthRatioMin, reason: from getter */
        public final double getF14284b() {
            return this.f14284b;
        }

        /* JADX INFO: renamed from: getNormalizedNearFarCutOffPoint, reason: from getter */
        public final double getF14283a() {
            return this.f14283a;
        }

        public /* synthetic */ LivenessOrientationSettingsModel(double d11, double d12, double d13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0.7d : d11, (i11 & 2) != 0 ? 0.5d : d12, (i11 & 4) != 0 ? 0.9d : d13);
        }
    }

    public LivenessSettingsModel() {
        this(0, 0L, 0, 0L, 0, 0L, 0.0d, 0, 0, 0, 0, 0.0d, null, null, null, 0, 0L, 131071, null);
    }

    public static /* synthetic */ LivenessSettingsModel copy$default(LivenessSettingsModel livenessSettingsModel, int i11, long j11, int i12, long j12, int i13, long j13, double d11, int i14, int i15, int i16, int i17, double d12, LivenessOrientationSettingsModel livenessOrientationSettingsModel, LivenessOrientationSettingsModel livenessOrientationSettingsModel2, String str, int i18, long j14, int i19, Object obj) {
        long j15;
        int i21;
        LivenessOrientationSettingsModel livenessOrientationSettingsModel3;
        int i22 = (i19 & 1) != 0 ? livenessSettingsModel.f14266a : i11;
        long j16 = (i19 & 2) != 0 ? livenessSettingsModel.f14267b : j11;
        int i23 = (i19 & 4) != 0 ? livenessSettingsModel.f14268c : i12;
        long j17 = (i19 & 8) != 0 ? livenessSettingsModel.f14269d : j12;
        int i24 = (i19 & 16) != 0 ? livenessSettingsModel.f14270e : i13;
        long j18 = (i19 & 32) != 0 ? livenessSettingsModel.f14271f : j13;
        double d13 = (i19 & 64) != 0 ? livenessSettingsModel.f14272g : d11;
        int i25 = (i19 & 128) != 0 ? livenessSettingsModel.f14273h : i14;
        int i26 = (i19 & 256) != 0 ? livenessSettingsModel.f14274i : i15;
        int i27 = (i19 & 512) != 0 ? livenessSettingsModel.f14275j : i16;
        int i28 = i22;
        int i29 = (i19 & 1024) != 0 ? livenessSettingsModel.f14276k : i17;
        long j19 = j16;
        double d14 = (i19 & 2048) != 0 ? livenessSettingsModel.f14277l : d12;
        LivenessOrientationSettingsModel livenessOrientationSettingsModel4 = (i19 & 4096) != 0 ? livenessSettingsModel.f14278m : livenessOrientationSettingsModel;
        double d15 = d14;
        LivenessOrientationSettingsModel livenessOrientationSettingsModel5 = (i19 & 8192) != 0 ? livenessSettingsModel.f14279n : livenessOrientationSettingsModel2;
        String str2 = (i19 & 16384) != 0 ? livenessSettingsModel.f14280o : str;
        int i31 = (i19 & 32768) != 0 ? livenessSettingsModel.f14281p : i18;
        if ((i19 & 65536) != 0) {
            livenessOrientationSettingsModel3 = livenessOrientationSettingsModel5;
            i21 = i31;
            j15 = livenessSettingsModel.f14282q;
        } else {
            j15 = j14;
            i21 = i31;
            livenessOrientationSettingsModel3 = livenessOrientationSettingsModel5;
        }
        return livenessSettingsModel.copy(i28, j19, i23, j17, i24, j18, d13, i25, i26, i27, i29, d15, livenessOrientationSettingsModel4, livenessOrientationSettingsModel3, str2, i21, j15);
    }

    @NotNull
    public final LivenessSettingsModel copy(int frameRateThreshold, long samplingTimeInMs, int violationLimit, long modelInitTimeoutInMs, int retries, long minTimePerDistanceInMs, double maxFaceCenterDifference, int minimumPitch, int maximumPitch, int minimumYaw, int maximumYaw, double requiredDistanceMovementRatio, @NotNull LivenessOrientationSettingsModel portrait, @NotNull LivenessOrientationSettingsModel landscape, @NotNull String configOverride, int hardwareLatency, long delayBetweenDistanceInMs) {
        Intrinsics.checkNotNullParameter(portrait, "portrait");
        Intrinsics.checkNotNullParameter(landscape, "landscape");
        Intrinsics.checkNotNullParameter(configOverride, "configOverride");
        return new LivenessSettingsModel(frameRateThreshold, samplingTimeInMs, violationLimit, modelInitTimeoutInMs, retries, minTimePerDistanceInMs, maxFaceCenterDifference, minimumPitch, maximumPitch, minimumYaw, maximumYaw, requiredDistanceMovementRatio, portrait, landscape, configOverride, hardwareLatency, delayBetweenDistanceInMs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LivenessSettingsModel)) {
            return false;
        }
        LivenessSettingsModel livenessSettingsModel = (LivenessSettingsModel) other;
        return this.f14266a == livenessSettingsModel.f14266a && this.f14267b == livenessSettingsModel.f14267b && this.f14268c == livenessSettingsModel.f14268c && this.f14269d == livenessSettingsModel.f14269d && this.f14270e == livenessSettingsModel.f14270e && this.f14271f == livenessSettingsModel.f14271f && Double.compare(this.f14272g, livenessSettingsModel.f14272g) == 0 && this.f14273h == livenessSettingsModel.f14273h && this.f14274i == livenessSettingsModel.f14274i && this.f14275j == livenessSettingsModel.f14275j && this.f14276k == livenessSettingsModel.f14276k && Double.compare(this.f14277l, livenessSettingsModel.f14277l) == 0 && Intrinsics.areEqual(this.f14278m, livenessSettingsModel.f14278m) && Intrinsics.areEqual(this.f14279n, livenessSettingsModel.f14279n) && Intrinsics.areEqual(this.f14280o, livenessSettingsModel.f14280o) && this.f14281p == livenessSettingsModel.f14281p && this.f14282q == livenessSettingsModel.f14282q;
    }

    public /* synthetic */ LivenessSettingsModel(int i11, long j11, int i12, long j12, int i13, long j13, double d11, int i14, int i15, int i16, int i17, double d12, LivenessOrientationSettingsModel livenessOrientationSettingsModel, LivenessOrientationSettingsModel livenessOrientationSettingsModel2, String str, int i18, long j14, int i19, DefaultConstructorMarker defaultConstructorMarker) {
        this((i19 & 1) != 0 ? 15 : i11, (i19 & 2) != 0 ? 1000L : j11, (i19 & 4) != 0 ? 3 : i12, (i19 & 8) != 0 ? 5000L : j12, (i19 & 16) == 0 ? i13 : 3, (i19 & 32) == 0 ? j13 : 1000L, (i19 & 64) != 0 ? 0.2d : d11, (i19 & 128) != 0 ? 105 : i14, (i19 & 256) != 0 ? 170 : i15, (i19 & 512) != 0 ? 65 : i16, (i19 & 1024) != 0 ? 135 : i17, (i19 & 2048) != 0 ? 0.85d : d12, (i19 & 4096) != 0 ? AbstractC9306a.f14382a : livenessOrientationSettingsModel, (i19 & 8192) != 0 ? AbstractC9306a.f14383b : livenessOrientationSettingsModel2, (i19 & 16384) != 0 ? "{\"nodes\":[{\"nodeName\":\"FarNearCollector\",\"settings\":{\"image_format\":\"webp\"}},{\"nodeName\":\"UserJourneyCollector\",\"settings\":{\"image_format\":\"webp\"}}]}" : str, (i19 & 32768) != 0 ? 4 : i18, (i19 & 65536) != 0 ? 1250L : j14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getF14266a() {
        return this.f14266a;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getF14275j() {
        return this.f14275j;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getF14276k() {
        return this.f14276k;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getF14277l() {
        return this.f14277l;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final LivenessOrientationSettingsModel getF14278m() {
        return this.f14278m;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final LivenessOrientationSettingsModel getF14279n() {
        return this.f14279n;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getF14280o() {
        return this.f14280o;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getF14281p() {
        return this.f14281p;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getF14282q() {
        return this.f14282q;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getF14267b() {
        return this.f14267b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getF14268c() {
        return this.f14268c;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getF14269d() {
        return this.f14269d;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getF14270e() {
        return this.f14270e;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getF14271f() {
        return this.f14271f;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getF14272g() {
        return this.f14272g;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getF14273h() {
        return this.f14273h;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getF14274i() {
        return this.f14274i;
    }

    @NotNull
    public final String getConfigOverride() {
        return this.f14280o;
    }

    public final long getDelayBetweenDistanceInMs() {
        return this.f14282q;
    }

    public final int getFrameRateThreshold() {
        return this.f14266a;
    }

    public final int getHardwareLatency() {
        return this.f14281p;
    }

    @NotNull
    public final LivenessOrientationSettingsModel getLandscape() {
        return this.f14279n;
    }

    public final double getMaxFaceCenterDifference() {
        return this.f14272g;
    }

    public final int getMaximumPitch() {
        return this.f14274i;
    }

    public final int getMaximumYaw() {
        return this.f14276k;
    }

    public final long getMinTimePerDistanceInMs() {
        return this.f14271f;
    }

    public final int getMinimumPitch() {
        return this.f14273h;
    }

    public final int getMinimumYaw() {
        return this.f14275j;
    }

    public final long getModelInitTimeoutInMs() {
        return this.f14269d;
    }

    @NotNull
    public final LivenessOrientationSettingsModel getPortrait() {
        return this.f14278m;
    }

    public final double getRequiredDistanceMovementRatio() {
        return this.f14277l;
    }

    public final int getRetries() {
        return this.f14270e;
    }

    public final long getSamplingTimeInMs() {
        return this.f14267b;
    }

    public final int getViolationLimit() {
        return this.f14268c;
    }

    public int hashCode() {
        return Long.hashCode(this.f14282q) + AbstractC40653e0.m89252a(this.f14281p, AbstractC40511C.m89148a(this.f14280o, (this.f14279n.hashCode() + ((this.f14278m.hashCode() + ((Double.hashCode(this.f14277l) + AbstractC40653e0.m89252a(this.f14276k, AbstractC40653e0.m89252a(this.f14275j, AbstractC40653e0.m89252a(this.f14274i, AbstractC40653e0.m89252a(this.f14273h, (Double.hashCode(this.f14272g) + AbstractC40749x1.m89269a(this.f14271f, AbstractC40653e0.m89252a(this.f14270e, AbstractC40749x1.m89269a(this.f14269d, AbstractC40653e0.m89252a(this.f14268c, AbstractC40749x1.m89269a(this.f14267b, Integer.hashCode(this.f14266a) * 31, 31), 31), 31), 31), 31)) * 31, 31), 31), 31), 31)) * 31)) * 31)) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "LivenessSettingsModel(frameRateThreshold=" + this.f14266a + ", samplingTimeInMs=" + this.f14267b + ", violationLimit=" + this.f14268c + ", modelInitTimeoutInMs=" + this.f14269d + ", retries=" + this.f14270e + ", minTimePerDistanceInMs=" + this.f14271f + ", maxFaceCenterDifference=" + this.f14272g + ", minimumPitch=" + this.f14273h + ", maximumPitch=" + this.f14274i + ", minimumYaw=" + this.f14275j + ", maximumYaw=" + this.f14276k + ", requiredDistanceMovementRatio=" + this.f14277l + ", portrait=" + this.f14278m + ", landscape=" + this.f14279n + ", configOverride=" + this.f14280o + ", hardwareLatency=" + this.f14281p + ", delayBetweenDistanceInMs=" + this.f14282q + ')';
    }

    public LivenessSettingsModel(int i11, long j11, int i12, long j12, int i13, long j13, double d11, int i14, int i15, int i16, int i17, double d12, @NotNull LivenessOrientationSettingsModel portrait, @NotNull LivenessOrientationSettingsModel landscape, @NotNull String configOverride, int i18, long j14) {
        Intrinsics.checkNotNullParameter(portrait, "portrait");
        Intrinsics.checkNotNullParameter(landscape, "landscape");
        Intrinsics.checkNotNullParameter(configOverride, "configOverride");
        this.f14266a = i11;
        this.f14267b = j11;
        this.f14268c = i12;
        this.f14269d = j12;
        this.f14270e = i13;
        this.f14271f = j13;
        this.f14272g = d11;
        this.f14273h = i14;
        this.f14274i = i15;
        this.f14275j = i16;
        this.f14276k = i17;
        this.f14277l = d12;
        this.f14278m = portrait;
        this.f14279n = landscape;
        this.f14280o = configOverride;
        this.f14281p = i18;
        this.f14282q = j14;
    }
}
