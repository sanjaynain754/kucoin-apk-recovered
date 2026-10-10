package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public abstract class LinearTransformation {

    public static final class LinearTransformationBuilder {

        /* JADX INFO: renamed from: x1 */
        private final double f12406x1;

        /* JADX INFO: renamed from: y1 */
        private final double f12407y1;

        private LinearTransformationBuilder(double d11, double d12) {
            this.f12406x1 = d11;
            this.f12407y1 = d12;
        }

        public LinearTransformation and(double d11, double d12) {
            boolean z11;
            boolean z12 = false;
            if (DoubleUtils.isFinite(d11) && DoubleUtils.isFinite(d12)) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11);
            double d13 = this.f12406x1;
            if (d11 == d13) {
                if (d12 != this.f12407y1) {
                    z12 = true;
                }
                Preconditions.checkArgument(z12);
                return new VerticalLinearTransformation(this.f12406x1);
            }
            return withSlope((d12 - this.f12407y1) / (d11 - d13));
        }

        public LinearTransformation withSlope(double d11) {
            Preconditions.checkArgument(!Double.isNaN(d11));
            if (DoubleUtils.isFinite(d11)) {
                return new RegularLinearTransformation(d11, this.f12407y1 - (this.f12406x1 * d11));
            }
            return new VerticalLinearTransformation(this.f12406x1);
        }
    }

    public static final class NaNLinearTransformation extends LinearTransformation {
        static final NaNLinearTransformation INSTANCE = new NaNLinearTransformation();

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return Double.NaN;
        }

        public String toString() {
            return "NaN";
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d11) {
            return Double.NaN;
        }

        private NaNLinearTransformation() {
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            return this;
        }
    }

    public static final class RegularLinearTransformation extends LinearTransformation {

        @LazyInit
        LinearTransformation inverse;
        final double slope;
        final double yIntercept;

        public RegularLinearTransformation(double d11, double d12) {
            this.slope = d11;
            this.yIntercept = d12;
            this.inverse = null;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        private LinearTransformation createInverse() {
            double d11 = this.slope;
            return d11 != 0.0d ? new RegularLinearTransformation(1.0d / d11, (this.yIntercept * (-1.0d)) / d11, this) : new VerticalLinearTransformation(this.yIntercept, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.inverse;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            LinearTransformation linearTransformationCreateInverse = createInverse();
            this.inverse = linearTransformationCreateInverse;
            return linearTransformationCreateInverse;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return this.slope == 0.0d;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return this.slope;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.slope), Double.valueOf(this.yIntercept));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d11) {
            return (d11 * this.slope) + this.yIntercept;
        }

        public RegularLinearTransformation(double d11, double d12, LinearTransformation linearTransformation) {
            this.slope = d11;
            this.yIntercept = d12;
            this.inverse = linearTransformation;
        }
    }

    public static final class VerticalLinearTransformation extends LinearTransformation {

        @LazyInit
        LinearTransformation inverse;

        /* JADX INFO: renamed from: x */
        final double f12408x;

        public VerticalLinearTransformation(double d11) {
            this.f12408x = d11;
            this.inverse = null;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return true;
        }

        private LinearTransformation createInverse() {
            return new RegularLinearTransformation(0.0d, this.f12408x, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.inverse;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            LinearTransformation linearTransformationCreateInverse = createInverse();
            this.inverse = linearTransformationCreateInverse;
            return linearTransformationCreateInverse;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            throw new IllegalStateException();
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f12408x));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d11) {
            throw new IllegalStateException();
        }

        public VerticalLinearTransformation(double d11, LinearTransformation linearTransformation) {
            this.f12408x = d11;
            this.inverse = linearTransformation;
        }
    }

    public abstract LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double d11);

    public static LinearTransformation forNaN() {
        return NaNLinearTransformation.INSTANCE;
    }

    public static LinearTransformation horizontal(double d11) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d11));
        return new RegularLinearTransformation(0.0d, d11);
    }

    public static LinearTransformationBuilder mapping(double d11, double d12) {
        boolean z11;
        if (DoubleUtils.isFinite(d11) && DoubleUtils.isFinite(d12)) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        return new LinearTransformationBuilder(d11, d12);
    }

    public static LinearTransformation vertical(double d11) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d11));
        return new VerticalLinearTransformation(d11);
    }
}
