package com.jumio.commons.camera;

import android.hardware.camera2.params.ColorSpaceTransform;
import android.util.Rational;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0010\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0012H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"FRAME_DATA_DEFAULT_SIZE_WIDTH", "", "FRAME_DATA_DEFAULT_SIZE_HEIGHT", "FRAME_DATA_DEFAULT_ROTATION", "FRAME_DATA_DEFAULT_ISO", "FRAME_DATA_DEFAULT_SHUTTER_SPEED", "", "FRAME_DATA_DEFAULT_LENS_POSITION", "", "FRAME_DATA_DEFAULT_APERTURE", "FRAME_DATA_DEFAULT_ORIENTATION", "FRAME_DATA_DEFAULT_IS_PORTRAIT", "", "FRAME_DATA_DEFAULT_IMAGE_FORMAT", "toFloatArray", "", "Landroid/hardware/camera2/params/ColorSpaceTransform;", "deepCopy", "", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFrame.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Frame.kt\ncom/jumio/commons/camera/FrameKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,214:1\n13467#2,3:215\n*S KotlinDebug\n*F\n+ 1 Frame.kt\ncom/jumio/commons/camera/FrameKt\n*L\n201#1:215,3\n*E\n"})
public final class FrameKt {
    public static final float FRAME_DATA_DEFAULT_APERTURE = 0.0f;
    public static final int FRAME_DATA_DEFAULT_IMAGE_FORMAT = 17;
    public static final int FRAME_DATA_DEFAULT_ISO = 0;
    public static final boolean FRAME_DATA_DEFAULT_IS_PORTRAIT = false;
    public static final float FRAME_DATA_DEFAULT_LENS_POSITION = 0.0f;
    public static final int FRAME_DATA_DEFAULT_ORIENTATION = 0;
    public static final int FRAME_DATA_DEFAULT_ROTATION = 0;
    public static final long FRAME_DATA_DEFAULT_SHUTTER_SPEED = 0;
    public static final int FRAME_DATA_DEFAULT_SIZE_HEIGHT = 0;
    public static final int FRAME_DATA_DEFAULT_SIZE_WIDTH = 0;

    public static final byte[] access$deepCopy(byte[] bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @NotNull
    public static final float[] toFloatArray(@NotNull ColorSpaceTransform colorSpaceTransform) {
        Intrinsics.checkNotNullParameter(colorSpaceTransform, "<this>");
        float[] fArr = new float[9];
        Rational[] rationalArr = new Rational[9];
        int i11 = 0;
        for (int i12 = 0; i12 < 9; i12++) {
            Rational ZERO = Rational.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            rationalArr[i12] = ZERO;
        }
        colorSpaceTransform.copyElements(rationalArr, 0);
        int i13 = 0;
        while (i11 < 9) {
            fArr[i13] = rationalArr[i11].floatValue();
            i11++;
            i13++;
        }
        return fArr;
    }
}
