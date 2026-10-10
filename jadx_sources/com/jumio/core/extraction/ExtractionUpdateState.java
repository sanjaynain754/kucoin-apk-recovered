package com.jumio.core.extraction;

import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/jumio/core/extraction/ExtractionUpdateState;", "", "<init>", "()V", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class ExtractionUpdateState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public static AtomicInteger f13864a;

    /* JADX INFO: renamed from: b */
    public static final int f13865b;

    /* JADX INFO: renamed from: c */
    public static final int f13866c;

    /* JADX INFO: renamed from: d */
    public static final int f13867d;

    /* JADX INFO: renamed from: e */
    public static final int f13868e;

    /* JADX INFO: renamed from: f */
    public static final int f13869f;

    /* JADX INFO: renamed from: g */
    public static final int f13870g;

    /* JADX INFO: renamed from: h */
    public static final int f13871h;

    /* JADX INFO: renamed from: i */
    public static final int f13872i;

    /* JADX INFO: renamed from: j */
    public static final int f13873j;

    /* JADX INFO: renamed from: k */
    public static final int f13874k;

    /* JADX INFO: renamed from: l */
    public static final int f13875l;

    /* JADX INFO: renamed from: m */
    public static final int f13876m;

    /* JADX INFO: renamed from: n */
    public static final int f13877n;

    /* JADX INFO: renamed from: o */
    public static final int f13878o;

    /* JADX INFO: renamed from: p */
    public static final int f13879p;

    /* JADX INFO: renamed from: q */
    public static final int f13880q;

    /* JADX INFO: renamed from: r */
    public static final int f13881r;

    /* JADX INFO: renamed from: s */
    public static final int f13882s;

    /* JADX INFO: renamed from: t */
    public static final int f13883t;

    /* JADX INFO: renamed from: u */
    public static final int f13884u;

    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b)\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\rR\u0011\u0010\u001c\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\rR\u0011\u0010\u001e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\rR\u0011\u0010 \u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\rR\u0011\u0010\"\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\rR\u0011\u0010$\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\rR\u0011\u0010&\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\rR\u0011\u0010(\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\rR\u0011\u0010*\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\rR\u0011\u0010,\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\rR\u0011\u0010.\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\rR\u0011\u00100\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\rR\u0011\u00102\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\r¨\u00064"}, m90084d2 = {"Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;", "", "<init>", "()V", "id", "Ljava/util/concurrent/atomic/AtomicInteger;", "getId", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setId", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "saveImage", "", "getSaveImage", "()I", "saveHighResolutionImage", "getSaveHighResolutionImage", "saveDebugImage", "getSaveDebugImage", "shotTaken", "getShotTaken", "resetOverlay", "getResetOverlay", "centerId", "getCenterId", "holdStill", "getHoldStill", "holdStraight", "getHoldStraight", "moveCloser", "getMoveCloser", "tooClose", "getTooClose", "fallbackRequired", "getFallbackRequired", "documentClassified", "getDocumentClassified", "captureHighResolutionImage", "getCaptureHighResolutionImage", "flash", "getFlash", "skipImage", "getSkipImage", "tilt", "getTilt", "lockExposureAndWhiteBalance", "getLockExposureAndWhiteBalance", "setChallenge", "getSetChallenge", "rotate", "getRotate", "metering", "getMetering", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public final void setId(@NotNull AtomicInteger atomicInteger) {
            Intrinsics.checkNotNullParameter(atomicInteger, "<set-?>");
            ExtractionUpdateState.f13864a = atomicInteger;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final int getCaptureHighResolutionImage() {
            return ExtractionUpdateState.f13877n;
        }

        public final int getCenterId() {
            return ExtractionUpdateState.f13870g;
        }

        public final int getDocumentClassified() {
            return ExtractionUpdateState.f13876m;
        }

        public final int getFallbackRequired() {
            return ExtractionUpdateState.f13875l;
        }

        public final int getFlash() {
            return ExtractionUpdateState.f13878o;
        }

        public final int getHoldStill() {
            return ExtractionUpdateState.f13871h;
        }

        public final int getHoldStraight() {
            return ExtractionUpdateState.f13872i;
        }

        @NotNull
        public final AtomicInteger getId() {
            return ExtractionUpdateState.f13864a;
        }

        public final int getLockExposureAndWhiteBalance() {
            return ExtractionUpdateState.f13881r;
        }

        public final int getMetering() {
            return ExtractionUpdateState.f13884u;
        }

        public final int getMoveCloser() {
            return ExtractionUpdateState.f13873j;
        }

        public final int getResetOverlay() {
            return ExtractionUpdateState.f13869f;
        }

        public final int getRotate() {
            return ExtractionUpdateState.f13883t;
        }

        public final int getSaveDebugImage() {
            return ExtractionUpdateState.f13867d;
        }

        public final int getSaveHighResolutionImage() {
            return ExtractionUpdateState.f13866c;
        }

        public final int getSaveImage() {
            return ExtractionUpdateState.f13865b;
        }

        public final int getSetChallenge() {
            return ExtractionUpdateState.f13882s;
        }

        public final int getShotTaken() {
            return ExtractionUpdateState.f13868e;
        }

        public final int getSkipImage() {
            return ExtractionUpdateState.f13879p;
        }

        public final int getTilt() {
            return ExtractionUpdateState.f13880q;
        }

        public final int getTooClose() {
            return ExtractionUpdateState.f13874k;
        }
    }

    static {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        f13864a = atomicInteger;
        f13865b = atomicInteger.getAndIncrement();
        f13866c = f13864a.getAndIncrement();
        f13867d = f13864a.getAndIncrement();
        f13868e = f13864a.getAndIncrement();
        f13869f = f13864a.getAndIncrement();
        f13870g = f13864a.getAndIncrement();
        f13871h = f13864a.getAndIncrement();
        f13872i = f13864a.getAndIncrement();
        f13873j = f13864a.getAndIncrement();
        f13874k = f13864a.getAndIncrement();
        f13875l = f13864a.getAndIncrement();
        f13876m = f13864a.getAndIncrement();
        f13877n = f13864a.getAndIncrement();
        f13878o = f13864a.getAndIncrement();
        f13879p = f13864a.getAndIncrement();
        f13880q = f13864a.getAndIncrement();
        f13881r = f13864a.getAndIncrement();
        f13882s = f13864a.getAndIncrement();
        f13883t = f13864a.getAndIncrement();
        f13884u = f13864a.getAndIncrement();
    }
}
