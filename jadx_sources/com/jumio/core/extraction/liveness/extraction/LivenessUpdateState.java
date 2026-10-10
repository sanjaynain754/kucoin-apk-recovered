package com.jumio.core.extraction.liveness.extraction;

import com.jumio.core.extraction.ExtractionUpdateState;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007¨\u0006$"}, m90084d2 = {"Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;", "Lcom/jumio/core/extraction/ExtractionUpdateState;", "<init>", "()V", "faceRoiRect", "", "getFaceRoiRect", "()I", "faceCenterArea", "getFaceCenterArea", "moveFaceIntoFrame", "getMoveFaceIntoFrame", "centerFace", "getCenterFace", "levelEyesAndDevice", "getLevelEyesAndDevice", "faceTiltUp", "getFaceTiltUp", "faceTiltDown", "getFaceTiltDown", "faceTiltLeft", "getFaceTiltLeft", "faceTiltRight", "getFaceTiltRight", "faceTooClose", "getFaceTooClose", "moveFaceCloser", "getMoveFaceCloser", "nextPosition", "getNextPosition", "livenessFinished", "getLivenessFinished", "updateColor", "getUpdateColor", "attachClient", "getAttachClient", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LivenessUpdateState extends ExtractionUpdateState {

    /* JADX INFO: renamed from: A */
    public static final int f14117A;

    /* JADX INFO: renamed from: B */
    public static final int f14118B;

    /* JADX INFO: renamed from: C */
    public static final int f14119C;

    /* JADX INFO: renamed from: D */
    public static final int f14120D;

    /* JADX INFO: renamed from: E */
    public static final int f14121E;

    /* JADX INFO: renamed from: F */
    public static final int f14122F;

    /* JADX INFO: renamed from: G */
    public static final int f14123G;

    /* JADX INFO: renamed from: H */
    public static final int f14124H;

    /* JADX INFO: renamed from: I */
    public static final int f14125I;

    @NotNull
    public static final LivenessUpdateState INSTANCE = new LivenessUpdateState();

    /* JADX INFO: renamed from: J */
    public static final int f14126J;

    /* JADX INFO: renamed from: v */
    public static final int f14127v;

    /* JADX INFO: renamed from: w */
    public static final int f14128w;

    /* JADX INFO: renamed from: x */
    public static final int f14129x;

    /* JADX INFO: renamed from: y */
    public static final int f14130y;

    /* JADX INFO: renamed from: z */
    public static final int f14131z;

    static {
        ExtractionUpdateState.Companion companion = ExtractionUpdateState.INSTANCE;
        f14127v = companion.getId().getAndIncrement();
        f14128w = companion.getId().getAndIncrement();
        f14129x = companion.getId().getAndIncrement();
        f14130y = companion.getId().getAndIncrement();
        f14131z = companion.getId().getAndIncrement();
        f14117A = companion.getId().getAndIncrement();
        f14118B = companion.getId().getAndIncrement();
        f14119C = companion.getId().getAndIncrement();
        f14120D = companion.getId().getAndIncrement();
        f14121E = companion.getId().getAndIncrement();
        f14122F = companion.getId().getAndIncrement();
        f14123G = companion.getId().getAndIncrement();
        f14124H = companion.getId().getAndIncrement();
        f14125I = companion.getId().getAndIncrement();
        f14126J = companion.getId().getAndIncrement();
    }

    public final int getAttachClient() {
        return f14126J;
    }

    public final int getCenterFace() {
        return f14130y;
    }

    public final int getFaceCenterArea() {
        return f14128w;
    }

    public final int getFaceRoiRect() {
        return f14127v;
    }

    public final int getFaceTiltDown() {
        return f14118B;
    }

    public final int getFaceTiltLeft() {
        return f14119C;
    }

    public final int getFaceTiltRight() {
        return f14120D;
    }

    public final int getFaceTiltUp() {
        return f14117A;
    }

    public final int getFaceTooClose() {
        return f14121E;
    }

    public final int getLevelEyesAndDevice() {
        return f14131z;
    }

    public final int getLivenessFinished() {
        return f14124H;
    }

    public final int getMoveFaceCloser() {
        return f14122F;
    }

    public final int getMoveFaceIntoFrame() {
        return f14129x;
    }

    public final int getNextPosition() {
        return f14123G;
    }

    public final int getUpdateColor() {
        return f14125I;
    }
}
