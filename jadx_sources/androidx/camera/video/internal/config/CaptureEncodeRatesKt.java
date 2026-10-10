package androidx.camera.video.internal.config;

import android.util.Rational;
import androidx.camera.core.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.math.MathKt;

/* JADX INFO: compiled from: CaptureEncodeRates.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"TAG", "", "toEncodeRate", "", "captureRate", "captureToEncodeRatio", "Landroid/util/Rational;", "toCaptureRate", "encodeRate", "isInvalidCaptureToEncodeRatio", "", "ratio", "camera-video_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class CaptureEncodeRatesKt {

    @NotNull
    private static final String TAG = "CaptureEncodeRates";

    private static final boolean isInvalidCaptureToEncodeRatio(Rational rational) {
        return Intrinsics.areEqual(rational, Rational.NaN) || Intrinsics.areEqual(rational, Rational.ZERO) || Intrinsics.areEqual(rational, Rational.NEGATIVE_INFINITY) || Intrinsics.areEqual(rational, Rational.POSITIVE_INFINITY);
    }

    public static final int toCaptureRate(int i11, @Nullable Rational rational) {
        if (rational == null) {
            return i11;
        }
        if (!isInvalidCaptureToEncodeRatio(rational)) {
            return MathKt.roundToInt(i11 * rational.floatValue());
        }
        Logger.m1872w(TAG, "Invalid capture-to-encode ratio: " + rational);
        return i11;
    }

    public static final int toEncodeRate(int i11, @Nullable Rational rational) {
        if (rational == null) {
            return i11;
        }
        if (!isInvalidCaptureToEncodeRatio(rational)) {
            return MathKt.roundToInt(i11 / rational.floatValue());
        }
        Logger.m1872w(TAG, "Invalid capture-to-encode ratio: " + rational);
        return i11;
    }
}
