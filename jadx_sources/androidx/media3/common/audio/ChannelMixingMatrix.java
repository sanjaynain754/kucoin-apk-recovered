package androidx.media3.common.audio;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class ChannelMixingMatrix {
    private final float[] coefficients;
    private final int inputChannelCount;
    private final boolean isDiagonal;
    private final boolean isIdentity;
    private final boolean isZero;
    private final int outputChannelCount;

    private static float[] checkCoefficientsValid(float[] fArr) {
        for (int i11 = 0; i11 < fArr.length; i11++) {
            if (fArr[i11] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + i11 + " is negative.");
            }
        }
        return fArr;
    }

    private static float[] createMixingCoefficients(int i11, int i12) {
        if (i11 == i12) {
            return initializeIdentityMatrix(i12);
        }
        if (i11 == 1 && i12 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i11 == 2 && i12 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        throw new UnsupportedOperationException("Default channel mixing coefficients for " + i11 + "->" + i12 + " are not yet implemented.");
    }

    public static ChannelMixingMatrix create(int i11, int i12) {
        return new ChannelMixingMatrix(i11, i12, createMixingCoefficients(i11, i12));
    }

    private static float[] initializeIdentityMatrix(int i11) {
        float[] fArr = new float[i11 * i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr[(i11 * i12) + i12] = 1.0f;
        }
        return fArr;
    }

    public int getInputChannelCount() {
        return this.inputChannelCount;
    }

    public float getMixingCoefficient(int i11, int i12) {
        return this.coefficients[(i11 * this.outputChannelCount) + i12];
    }

    public int getOutputChannelCount() {
        return this.outputChannelCount;
    }

    public boolean isDiagonal() {
        return this.isDiagonal;
    }

    public boolean isIdentity() {
        return this.isIdentity;
    }

    public boolean isSquare() {
        return this.inputChannelCount == this.outputChannelCount;
    }

    public boolean isZero() {
        return this.isZero;
    }

    public ChannelMixingMatrix scaleBy(float f11) {
        float[] fArr = new float[this.coefficients.length];
        int i11 = 0;
        while (true) {
            float[] fArr2 = this.coefficients;
            if (i11 >= fArr2.length) {
                return new ChannelMixingMatrix(this.inputChannelCount, this.outputChannelCount, fArr);
            }
            fArr[i11] = fArr2[i11] * f11;
            i11++;
        }
    }

    public ChannelMixingMatrix(int i11, int i12, float[] fArr) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16 = false;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkArgument(z11, "Input channel count must be positive.");
        if (i12 > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Assertions.checkArgument(z12, "Output channel count must be positive.");
        if (fArr.length == i11 * i12) {
            z13 = true;
        } else {
            z13 = false;
        }
        Assertions.checkArgument(z13, "Coefficient array length is invalid.");
        this.inputChannelCount = i11;
        this.outputChannelCount = i12;
        this.coefficients = checkCoefficientsValid(fArr);
        boolean z17 = true;
        boolean z18 = true;
        boolean z19 = true;
        for (int i13 = 0; i13 < i11; i13++) {
            for (int i14 = 0; i14 < i12; i14++) {
                float mixingCoefficient = getMixingCoefficient(i13, i14);
                if (i13 == i14) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (mixingCoefficient != 1.0f && z15) {
                    z19 = false;
                }
                if (mixingCoefficient != 0.0f) {
                    z17 = false;
                    if (!z15) {
                        z18 = false;
                    }
                }
            }
        }
        this.isZero = z17;
        if (isSquare() && z18) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.isDiagonal = z14;
        if (z14 && z19) {
            z16 = true;
        }
        this.isIdentity = z16;
    }
}
