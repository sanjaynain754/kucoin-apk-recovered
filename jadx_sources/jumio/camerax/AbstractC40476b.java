package jumio.camerax;

import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.RggbChannelVector;
import android.util.Rational;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.camerax.b */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40476b {
    /* JADX INFO: renamed from: a */
    public static final ColorSpaceTransform m89126a(ColorSpaceTransform colorSpaceTransform) {
        Rational[] rationalArr = new Rational[9];
        for (int i11 = 0; i11 < 9; i11++) {
            Rational ZERO = Rational.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            rationalArr[i11] = ZERO;
        }
        colorSpaceTransform.copyElements(rationalArr, 0);
        return new ColorSpaceTransform(rationalArr);
    }

    /* JADX INFO: renamed from: a */
    public static final RggbChannelVector m89127a(RggbChannelVector rggbChannelVector) {
        return new RggbChannelVector(rggbChannelVector.getRed(), rggbChannelVector.getGreenEven(), rggbChannelVector.getGreenOdd(), rggbChannelVector.getBlue());
    }
}
