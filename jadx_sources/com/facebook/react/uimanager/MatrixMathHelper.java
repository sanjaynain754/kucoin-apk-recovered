package com.facebook.react.uimanager;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import org.jetbrains.annotations.NotNull;
import p302h6.C38115a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MatrixMathHelper.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b*\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0007J \u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0005H\u0007J\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J(\u0010 \u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0007J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0007J\b\u0010&\u001a\u00020\fH\u0007J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0007J\u0010\u0010)\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u0018\u0010*\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0005H\u0007J\u0018\u0010,\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0005H\u0007J\u0018\u0010.\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0005H\u0007J\u0016\u0010/\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0005J \u00100\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0007J(\u00103\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0005H\u0007J\u0018\u00105\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u00107\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u00108\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u00109\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u0010:\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006<"}, m90084d2 = {"Lcom/facebook/react/uimanager/MatrixMathHelper;", "", "<init>", "()V", "EPSILON", "", "isZero", "", "d", "multiplyInto", "", "out", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "decomposeMatrix", Snapshot.TRANSFORM_MATRIX, "ctx", "Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;", "determinant", "matrix", "inverse", "transpose", "m", "multiplyVectorByMatrix", "v", DbParams.KEY_CHANNEL_RESULT, "v3Length", "v3Normalize", "vector", "norm", "v3Dot", "v3Combine", "aScale", "bScale", "v3Cross", "roundTo3Places", "n", "createIdentityMatrix", "degreesToRadians", "degrees", "resetIdentityMatrix", "applyPerspective", "perspective", "applyScaleX", "factor", "applyScaleY", "applyScaleZ", "applyTranslate2D", "x", "y", "applyTranslate3D", "z", "applySkewX", "radians", "applySkewY", "applyRotateX", "applyRotateY", "applyRotateZ", "MatrixDecompositionContext", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class MatrixMathHelper {
    private static final double EPSILON = 1.0E-5d;

    @NotNull
    public static final MatrixMathHelper INSTANCE = new MatrixMathHelper();

    /* JADX INFO: compiled from: MatrixMathHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;", "", "<init>", "()V", "perspective", "", "scale", "skew", "translation", "rotationDegrees", "reset", "", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static class MatrixDecompositionContext {

        @NotNull
        private static final Companion Companion = new Companion(null);

        @JvmField
        @NotNull
        public double[] perspective = new double[4];

        @JvmField
        @NotNull
        public double[] scale = new double[3];

        @JvmField
        @NotNull
        public double[] skew = new double[3];

        @JvmField
        @NotNull
        public double[] translation = new double[3];

        @JvmField
        @NotNull
        public double[] rotationDegrees = new double[3];

        /* JADX INFO: compiled from: MatrixMathHelper.kt */
        @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0013\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, m90084d2 = {"Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext$Companion;", "", "<init>", "()V", "resetArray", "", "arr", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void resetArray(double[] arr) {
                int length = arr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    arr[i11] = 0.0d;
                }
            }

            private Companion() {
            }
        }

        public final void reset() {
            Companion companion = Companion;
            companion.resetArray(this.perspective);
            companion.resetArray(this.scale);
            companion.resetArray(this.skew);
            companion.resetArray(this.translation);
            companion.resetArray(this.rotationDegrees);
        }
    }

    @JvmStatic
    @NotNull
    public static final double[] v3Normalize(@NotNull double[] vector, double norm) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        double d11 = 1;
        if (INSTANCE.isZero(norm)) {
            norm = v3Length(vector);
        }
        double d12 = d11 / norm;
        return new double[]{vector[0] * d12, vector[1] * d12, vector[2] * d12};
    }

    @JvmStatic
    public static final void applyPerspective(@NotNull double[] m11, double perspective) {
        Intrinsics.checkNotNullParameter(m11, "m");
        m11[11] = ((double) (-1)) / perspective;
    }

    @JvmStatic
    public static final void applyRotateX(@NotNull double[] m11, double radians) {
        Intrinsics.checkNotNullParameter(m11, "m");
        m11[5] = Math.cos(radians);
        m11[6] = Math.sin(radians);
        m11[9] = -Math.sin(radians);
        m11[10] = Math.cos(radians);
    }

    @JvmStatic
    public static final void applyRotateY(@NotNull double[] m11, double radians) {
        Intrinsics.checkNotNullParameter(m11, "m");
        m11[0] = Math.cos(radians);
        m11[2] = -Math.sin(radians);
        m11[8] = Math.sin(radians);
        m11[10] = Math.cos(radians);
    }

    @JvmStatic
    public static final void applyRotateZ(@NotNull double[] m11, double radians) {
        Intrinsics.checkNotNullParameter(m11, "m");
        m11[0] = Math.cos(radians);
        m11[1] = Math.sin(radians);
        m11[4] = -Math.sin(radians);
        m11[5] = Math.cos(radians);
    }

    @JvmStatic
    public static final void applyScaleX(@NotNull double[] m11, double factor) {
        Intrinsics.checkNotNullParameter(m11, "m");
        m11[0] = factor;
    }

    @JvmStatic
    public static final void applyScaleY(@NotNull double[] m11, double factor) {
        Intrinsics.checkNotNullParameter(m11, "m");
        m11[5] = factor;
    }

    @JvmStatic
    public static final void applySkewX(@NotNull double[] m11, double radians) {
        Intrinsics.checkNotNullParameter(m11, "m");
        m11[4] = Math.tan(radians);
    }

    @JvmStatic
    public static final void applySkewY(@NotNull double[] m11, double radians) {
        Intrinsics.checkNotNullParameter(m11, "m");
        m11[1] = Math.tan(radians);
    }

    @JvmStatic
    public static final void applyTranslate2D(@NotNull double[] m11, double x11, double y11) {
        Intrinsics.checkNotNullParameter(m11, "m");
        m11[12] = x11;
        m11[13] = y11;
    }

    @JvmStatic
    public static final void applyTranslate3D(@NotNull double[] m11, double x11, double y11, double z11) {
        Intrinsics.checkNotNullParameter(m11, "m");
        m11[12] = x11;
        m11[13] = y11;
        m11[14] = z11;
    }

    @JvmStatic
    @NotNull
    public static final double[] createIdentityMatrix() {
        double[] dArr = new double[16];
        resetIdentityMatrix(dArr);
        return dArr;
    }

    @JvmStatic
    public static final void decomposeMatrix(@NotNull double[] transformMatrix, @NotNull MatrixDecompositionContext ctx) {
        Intrinsics.checkNotNullParameter(transformMatrix, "transformMatrix");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        C38115a.m86045a(transformMatrix.length == 16);
        double[] dArr = ctx.perspective;
        double[] dArr2 = ctx.scale;
        double[] dArr3 = ctx.skew;
        double[] dArr4 = ctx.translation;
        double[] dArr5 = ctx.rotationDegrees;
        if (INSTANCE.isZero(transformMatrix[15])) {
            return;
        }
        double[][] dArr6 = new double[4][];
        for (int i11 = 0; i11 < 4; i11++) {
            dArr6[i11] = new double[4];
        }
        double[] dArr7 = new double[16];
        for (int i12 = 0; i12 < 4; i12++) {
            for (int i13 = 0; i13 < 4; i13++) {
                int i14 = (i12 * 4) + i13;
                double d11 = transformMatrix[i14] / transformMatrix[15];
                dArr6[i12][i13] = d11;
                if (i13 == 3) {
                    d11 = 0.0d;
                }
                dArr7[i14] = d11;
            }
        }
        dArr7[15] = 1.0d;
        MatrixMathHelper matrixMathHelper = INSTANCE;
        if (matrixMathHelper.isZero(determinant(dArr7))) {
            return;
        }
        if (matrixMathHelper.isZero(dArr6[0][3]) && matrixMathHelper.isZero(dArr6[1][3]) && matrixMathHelper.isZero(dArr6[2][3])) {
            dArr[2] = 0.0d;
            dArr[1] = 0.0d;
            dArr[0] = 0.0d;
            dArr[3] = 1.0d;
        } else {
            multiplyVectorByMatrix(new double[]{dArr6[0][3], dArr6[1][3], dArr6[2][3], dArr6[3][3]}, transpose(inverse(dArr7)), dArr);
        }
        for (int i15 = 0; i15 < 3; i15++) {
            dArr4[i15] = dArr6[3][i15];
        }
        double[][] dArr8 = new double[3][];
        for (int i16 = 0; i16 < 3; i16++) {
            dArr8[i16] = new double[3];
        }
        for (int i17 = 0; i17 < 3; i17++) {
            double[] dArr9 = dArr8[i17];
            double[] dArr10 = dArr6[i17];
            dArr9[0] = dArr10[0];
            dArr9[1] = dArr10[1];
            dArr9[2] = dArr10[2];
        }
        double dV3Length = v3Length(dArr8[0]);
        dArr2[0] = dV3Length;
        double[] dArrV3Normalize = v3Normalize(dArr8[0], dV3Length);
        dArr8[0] = dArrV3Normalize;
        double dV3Dot = v3Dot(dArrV3Normalize, dArr8[1]);
        dArr3[0] = dV3Dot;
        double[] dArrV3Combine = v3Combine(dArr8[1], dArr8[0], 1.0d, -dV3Dot);
        dArr8[1] = dArrV3Combine;
        double dV3Length2 = v3Length(dArrV3Combine);
        dArr2[1] = dV3Length2;
        dArr8[1] = v3Normalize(dArr8[1], dV3Length2);
        dArr3[0] = dArr3[0] / dArr2[1];
        double dV3Dot2 = v3Dot(dArr8[0], dArr8[2]);
        dArr3[1] = dV3Dot2;
        double[] dArrV3Combine2 = v3Combine(dArr8[2], dArr8[0], 1.0d, -dV3Dot2);
        dArr8[2] = dArrV3Combine2;
        double dV3Dot3 = v3Dot(dArr8[1], dArrV3Combine2);
        dArr3[2] = dV3Dot3;
        double[] dArrV3Combine3 = v3Combine(dArr8[2], dArr8[1], 1.0d, -dV3Dot3);
        dArr8[2] = dArrV3Combine3;
        double dV3Length3 = v3Length(dArrV3Combine3);
        dArr2[2] = dV3Length3;
        double[] dArrV3Normalize2 = v3Normalize(dArr8[2], dV3Length3);
        dArr8[2] = dArrV3Normalize2;
        double d12 = dArr3[1];
        double d13 = dArr2[2];
        dArr3[1] = d12 / d13;
        dArr3[2] = dArr3[2] / d13;
        if (v3Dot(dArr8[0], v3Cross(dArr8[1], dArrV3Normalize2)) < 0.0d) {
            for (int i18 = 0; i18 < 3; i18++) {
                dArr2[i18] = dArr2[i18] * (-1.0d);
                double[] dArr11 = dArr8[i18];
                dArr11[0] = dArr11[0] * (-1.0d);
                dArr11[1] = dArr11[1] * (-1.0d);
                dArr11[2] = dArr11[2] * (-1.0d);
            }
        }
        double[] dArr12 = dArr8[2];
        dArr5[0] = roundTo3Places((-Math.atan2(dArr12[1], dArr12[2])) * 57.29577951308232d);
        double[] dArr13 = dArr8[2];
        double d14 = -dArr13[0];
        double d15 = dArr13[1];
        double d16 = dArr13[2];
        dArr5[1] = roundTo3Places((-Math.atan2(d14, Math.sqrt((d15 * d15) + (d16 * d16)))) * 57.29577951308232d);
        dArr5[2] = roundTo3Places((-Math.atan2(dArr8[1][0], dArr8[0][0])) * 57.29577951308232d);
    }

    @JvmStatic
    public static final double determinant(@NotNull double[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        double d11 = matrix[0];
        double d12 = matrix[1];
        double d13 = matrix[2];
        double d14 = matrix[3];
        double d15 = matrix[4];
        double d16 = matrix[5];
        double d17 = matrix[6];
        double d18 = matrix[7];
        double d19 = matrix[8];
        double d21 = matrix[9];
        double d22 = matrix[10];
        double d23 = matrix[11];
        double d24 = matrix[12];
        double d25 = matrix[13];
        double d26 = matrix[14];
        double d27 = matrix[15];
        double d28 = d14 * d17;
        double d29 = d13 * d18;
        double d31 = d14 * d16;
        double d32 = d12 * d18;
        double d33 = d13 * d16;
        double d34 = d12 * d17;
        double d35 = d14 * d15;
        double d36 = d18 * d11;
        double d37 = d13 * d15;
        double d38 = d17 * d11;
        double d39 = d12 * d15;
        double d41 = d11 * d16;
        return ((((((((((((((((((((((((d28 * d21) * d24) - ((d29 * d21) * d24)) - ((d31 * d22) * d24)) + ((d32 * d22) * d24)) + ((d33 * d23) * d24)) - ((d34 * d23) * d24)) - ((d28 * d19) * d25)) + ((d29 * d19) * d25)) + ((d35 * d22) * d25)) - ((d36 * d22) * d25)) - ((d37 * d23) * d25)) + ((d38 * d23) * d25)) + ((d31 * d19) * d26)) - ((d32 * d19) * d26)) - ((d35 * d21) * d26)) + ((d36 * d21) * d26)) + ((d39 * d23) * d26)) - ((d23 * d41) * d26)) - ((d33 * d19) * d27)) + ((d34 * d19) * d27)) + ((d37 * d21) * d27)) - ((d38 * d21) * d27)) - ((d39 * d22) * d27)) + (d41 * d22 * d27);
    }

    @JvmStatic
    @NotNull
    public static final double[] inverse(@NotNull double[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        double dDeterminant = determinant(matrix);
        if (INSTANCE.isZero(dDeterminant)) {
            return matrix;
        }
        double d11 = matrix[0];
        double d12 = matrix[1];
        double d13 = matrix[2];
        double d14 = matrix[3];
        double d15 = matrix[4];
        double d16 = matrix[5];
        double d17 = matrix[6];
        double d18 = matrix[7];
        double d19 = matrix[8];
        double d21 = matrix[9];
        double d22 = matrix[10];
        double d23 = matrix[11];
        double d24 = matrix[12];
        double d25 = matrix[13];
        double d26 = matrix[14];
        double d27 = matrix[15];
        double d28 = d17 * d23;
        double d29 = d18 * d22;
        double d31 = d18 * d21;
        double d32 = d16 * d23;
        double d33 = d17 * d21;
        double d34 = d16 * d22;
        double d35 = d14 * d22;
        double d36 = d13 * d23;
        double d37 = d14 * d21;
        double d38 = d12 * d23;
        double d39 = d13 * d21;
        double d41 = d12 * d22;
        double d42 = d13 * d18;
        double d43 = d14 * d17;
        double d44 = d14 * d16;
        double d45 = d12 * d18;
        double d46 = d13 * d16;
        double d47 = d12 * d17;
        double d48 = (d29 * d24) - (d28 * d24);
        double d49 = d18 * d19;
        double d51 = d15 * d23;
        double d52 = d17 * d19;
        double d53 = d15 * d22;
        double d54 = (d36 * d24) - (d35 * d24);
        double d55 = d14 * d19;
        double d56 = d11 * d23;
        double d57 = d13 * d19;
        double d58 = d11 * d22;
        double d59 = d14 * d15;
        double d61 = d18 * d11;
        double d62 = d13 * d15;
        double d63 = d17 * d11;
        double d64 = (((d32 * d24) - (d31 * d24)) + (d49 * d25)) - (d51 * d25);
        double d65 = d16 * d19;
        double d66 = d15 * d21;
        double d67 = (((d37 * d24) - (d38 * d24)) - (d55 * d25)) + (d56 * d25);
        double d68 = d12 * d19;
        double d69 = d11 * d21;
        double d71 = d12 * d15;
        double d72 = d11 * d16;
        return new double[]{((((((d28 * d25) - (d29 * d25)) + (d31 * d26)) - (d32 * d26)) - (d33 * d27)) + (d34 * d27)) / dDeterminant, ((((((d35 * d25) - (d36 * d25)) - (d37 * d26)) + (d38 * d26)) + (d39 * d27)) - (d41 * d27)) / dDeterminant, ((((((d42 * d25) - (d43 * d25)) + (d44 * d26)) - (d45 * d26)) - (d46 * d27)) + (d47 * d27)) / dDeterminant, ((((((d43 * d21) - (d42 * d21)) - (d44 * d22)) + (d45 * d22)) + (d46 * d23)) - (d47 * d23)) / dDeterminant, ((((d48 - (d49 * d26)) + (d51 * d26)) + (d52 * d27)) - (d53 * d27)) / dDeterminant, ((((d54 + (d55 * d26)) - (d56 * d26)) - (d57 * d27)) + (d58 * d27)) / dDeterminant, ((((((d43 * d24) - (d42 * d24)) - (d59 * d26)) + (d61 * d26)) + (d62 * d27)) - (d63 * d27)) / dDeterminant, ((((((d42 * d19) - (d43 * d19)) + (d59 * d22)) - (d61 * d22)) - (d62 * d23)) + (d63 * d23)) / dDeterminant, ((d64 - (d65 * d27)) + (d66 * d27)) / dDeterminant, ((d67 + (d68 * d27)) - (d69 * d27)) / dDeterminant, ((((((d45 * d24) - (d44 * d24)) + (d59 * d25)) - (d61 * d25)) - (d71 * d27)) + (d27 * d72)) / dDeterminant, ((((((d44 * d19) - (d45 * d19)) - (d59 * d21)) + (d61 * d21)) + (d71 * d23)) - (d23 * d72)) / dDeterminant, ((((((d33 * d24) - (d34 * d24)) - (d52 * d25)) + (d53 * d25)) + (d65 * d26)) - (d66 * d26)) / dDeterminant, ((((((d41 * d24) - (d39 * d24)) + (d57 * d25)) - (d58 * d25)) - (d68 * d26)) + (d69 * d26)) / dDeterminant, ((((((d46 * d24) - (d24 * d47)) - (d62 * d25)) + (d25 * d63)) + (d71 * d26)) - (d26 * d72)) / dDeterminant, ((((((d47 * d19) - (d46 * d19)) + (d62 * d21)) - (d63 * d21)) - (d71 * d22)) + (d72 * d22)) / dDeterminant};
    }

    @JvmStatic
    public static final void multiplyInto(@NotNull double[] out, @NotNull double[] a11, @NotNull double[] b11) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        double d11 = a11[0];
        double d12 = a11[1];
        double d13 = a11[2];
        double d14 = a11[3];
        double d15 = a11[4];
        double d16 = a11[5];
        double d17 = a11[6];
        double d18 = a11[7];
        double d19 = a11[8];
        double d21 = a11[9];
        double d22 = a11[10];
        double d23 = a11[11];
        double d24 = a11[12];
        double d25 = a11[13];
        double d26 = a11[14];
        double d27 = a11[15];
        double d28 = b11[0];
        double d29 = b11[1];
        double d31 = b11[2];
        double d32 = b11[3];
        out[0] = (d28 * d11) + (d29 * d15) + (d31 * d19) + (d32 * d24);
        out[1] = (d28 * d12) + (d29 * d16) + (d31 * d21) + (d32 * d25);
        out[2] = (d28 * d13) + (d29 * d17) + (d31 * d22) + (d32 * d26);
        out[3] = (d28 * d14) + (d29 * d18) + (d31 * d23) + (d32 * d27);
        double d33 = b11[4];
        double d34 = b11[5];
        double d35 = b11[6];
        double d36 = b11[7];
        out[4] = (d33 * d11) + (d34 * d15) + (d35 * d19) + (d36 * d24);
        out[5] = (d33 * d12) + (d34 * d16) + (d35 * d21) + (d36 * d25);
        out[6] = (d33 * d13) + (d34 * d17) + (d35 * d22) + (d36 * d26);
        out[7] = (d33 * d14) + (d34 * d18) + (d35 * d23) + (d36 * d27);
        double d37 = b11[8];
        double d38 = b11[9];
        double d39 = b11[10];
        double d41 = b11[11];
        out[8] = (d37 * d11) + (d38 * d15) + (d39 * d19) + (d41 * d24);
        out[9] = (d37 * d12) + (d38 * d16) + (d39 * d21) + (d41 * d25);
        out[10] = (d37 * d13) + (d38 * d17) + (d39 * d22) + (d41 * d26);
        out[11] = (d37 * d14) + (d38 * d18) + (d39 * d23) + (d41 * d27);
        double d42 = b11[12];
        double d43 = b11[13];
        double d44 = b11[14];
        double d45 = b11[15];
        out[12] = (d11 * d42) + (d15 * d43) + (d19 * d44) + (d24 * d45);
        out[13] = (d12 * d42) + (d16 * d43) + (d21 * d44) + (d25 * d45);
        out[14] = (d13 * d42) + (d17 * d43) + (d22 * d44) + (d26 * d45);
        out[15] = (d42 * d14) + (d43 * d18) + (d44 * d23) + (d45 * d27);
    }

    @JvmStatic
    public static final void multiplyVectorByMatrix(@NotNull double[] v11, @NotNull double[] m11, @NotNull double[] result) {
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(m11, "m");
        Intrinsics.checkNotNullParameter(result, "result");
        double d11 = v11[0];
        double d12 = v11[1];
        double d13 = v11[2];
        double d14 = v11[3];
        result[0] = (m11[0] * d11) + (m11[4] * d12) + (m11[8] * d13) + (m11[12] * d14);
        result[1] = (m11[1] * d11) + (m11[5] * d12) + (m11[9] * d13) + (m11[13] * d14);
        result[2] = (m11[2] * d11) + (m11[6] * d12) + (m11[10] * d13) + (m11[14] * d14);
        result[3] = (d11 * m11[3]) + (d12 * m11[7]) + (d13 * m11[11]) + (d14 * m11[15]);
    }

    @JvmStatic
    public static final void resetIdentityMatrix(@NotNull double[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix[14] = 0.0d;
        matrix[13] = 0.0d;
        matrix[12] = 0.0d;
        matrix[11] = 0.0d;
        matrix[9] = 0.0d;
        matrix[8] = 0.0d;
        matrix[7] = 0.0d;
        matrix[6] = 0.0d;
        matrix[4] = 0.0d;
        matrix[3] = 0.0d;
        matrix[2] = 0.0d;
        matrix[1] = 0.0d;
        matrix[15] = 1.0d;
        matrix[10] = 1.0d;
        matrix[5] = 1.0d;
        matrix[0] = 1.0d;
    }

    @JvmStatic
    @NotNull
    public static final double[] transpose(@NotNull double[] m11) {
        Intrinsics.checkNotNullParameter(m11, "m");
        return new double[]{m11[0], m11[4], m11[8], m11[12], m11[1], m11[5], m11[9], m11[13], m11[2], m11[6], m11[10], m11[14], m11[3], m11[7], m11[11], m11[15]};
    }

    @JvmStatic
    @NotNull
    public static final double[] v3Combine(@NotNull double[] a11, @NotNull double[] b11, double aScale, double bScale) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        return new double[]{(a11[0] * aScale) + (b11[0] * bScale), (a11[1] * aScale) + (b11[1] * bScale), (aScale * a11[2]) + (bScale * b11[2])};
    }

    @JvmStatic
    @NotNull
    public static final double[] v3Cross(@NotNull double[] a11, @NotNull double[] b11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        double d11 = a11[1];
        double d12 = b11[2];
        double d13 = a11[2];
        double d14 = b11[1];
        double d15 = b11[0];
        double d16 = a11[0];
        return new double[]{(d11 * d12) - (d13 * d14), (d13 * d15) - (d12 * d16), (d16 * d14) - (d11 * d15)};
    }

    @JvmStatic
    public static final double v3Dot(@NotNull double[] a11, @NotNull double[] b11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        return (a11[0] * b11[0]) + (a11[1] * b11[1]) + (a11[2] * b11[2]);
    }

    @JvmStatic
    public static final double v3Length(@NotNull double[] a11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        double d11 = a11[0];
        double d12 = a11[1];
        double d13 = (d11 * d11) + (d12 * d12);
        double d14 = a11[2];
        return Math.sqrt(d13 + (d14 * d14));
    }

    public final void applyScaleZ(@NotNull double[] m11, double factor) {
        Intrinsics.checkNotNullParameter(m11, "m");
        m11[10] = factor;
    }

    private MatrixMathHelper() {
    }

    private final boolean isZero(double d11) {
        if (Double.isNaN(d11) || Math.abs(d11) >= 1.0E-5d) {
            return false;
        }
        return true;
    }

    @JvmStatic
    public static final double degreesToRadians(double degrees) {
        return (degrees * 3.141592653589793d) / ((double) 180);
    }

    @JvmStatic
    public static final double roundTo3Places(double n11) {
        return Math.round(n11 * 1000.0d) * 0.001d;
    }
}
