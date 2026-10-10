package com.google.zxing.common.reedsolomon;

/* JADX INFO: loaded from: classes56.dex */
final class GenericGFPoly {
    private final int[] coefficients;
    private final GenericGF field;

    public int evaluateAt(int i11) {
        if (i11 == 0) {
            return getCoefficient(0);
        }
        if (i11 == 1) {
            int iAddOrSubtract = 0;
            for (int i12 : this.coefficients) {
                iAddOrSubtract = GenericGF.addOrSubtract(iAddOrSubtract, i12);
            }
            return iAddOrSubtract;
        }
        int[] iArr = this.coefficients;
        int iAddOrSubtract2 = iArr[0];
        int length = iArr.length;
        for (int i13 = 1; i13 < length; i13++) {
            iAddOrSubtract2 = GenericGF.addOrSubtract(this.field.multiply(i11, iAddOrSubtract2), this.coefficients[i13]);
        }
        return iAddOrSubtract2;
    }

    public GenericGFPoly multiply(GenericGFPoly genericGFPoly) {
        if (!this.field.equals(genericGFPoly.field)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (isZero() || genericGFPoly.isZero()) {
            return this.field.getZero();
        }
        int[] iArr = this.coefficients;
        int length = iArr.length;
        int[] iArr2 = genericGFPoly.coefficients;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            for (int i13 = 0; i13 < length2; i13++) {
                int i14 = i11 + i13;
                iArr3[i14] = GenericGF.addOrSubtract(iArr3[i14], this.field.multiply(i12, iArr2[i13]));
            }
        }
        return new GenericGFPoly(this.field, iArr3);
    }

    public GenericGFPoly addOrSubtract(GenericGFPoly genericGFPoly) {
        if (!this.field.equals(genericGFPoly.field)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (isZero()) {
            return genericGFPoly;
        }
        if (genericGFPoly.isZero()) {
            return this;
        }
        int[] iArr = this.coefficients;
        int[] iArr2 = genericGFPoly.coefficients;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i11 = length; i11 < iArr.length; i11++) {
            iArr3[i11] = GenericGF.addOrSubtract(iArr2[i11 - length], iArr[i11]);
        }
        return new GenericGFPoly(this.field, iArr3);
    }

    public GenericGFPoly[] divide(GenericGFPoly genericGFPoly) {
        if (!this.field.equals(genericGFPoly.field)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (genericGFPoly.isZero()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        GenericGFPoly zero = this.field.getZero();
        int iInverse = this.field.inverse(genericGFPoly.getCoefficient(genericGFPoly.getDegree()));
        GenericGFPoly genericGFPolyAddOrSubtract = this;
        while (genericGFPolyAddOrSubtract.getDegree() >= genericGFPoly.getDegree() && !genericGFPolyAddOrSubtract.isZero()) {
            int degree = genericGFPolyAddOrSubtract.getDegree() - genericGFPoly.getDegree();
            int iMultiply = this.field.multiply(genericGFPolyAddOrSubtract.getCoefficient(genericGFPolyAddOrSubtract.getDegree()), iInverse);
            GenericGFPoly genericGFPolyMultiplyByMonomial = genericGFPoly.multiplyByMonomial(degree, iMultiply);
            zero = zero.addOrSubtract(this.field.buildMonomial(degree, iMultiply));
            genericGFPolyAddOrSubtract = genericGFPolyAddOrSubtract.addOrSubtract(genericGFPolyMultiplyByMonomial);
        }
        return new GenericGFPoly[]{zero, genericGFPolyAddOrSubtract};
    }

    public int getCoefficient(int i11) {
        int[] iArr = this.coefficients;
        return iArr[(iArr.length - 1) - i11];
    }

    public int[] getCoefficients() {
        return this.coefficients;
    }

    public int getDegree() {
        return this.coefficients.length - 1;
    }

    public boolean isZero() {
        return this.coefficients[0] == 0;
    }

    public GenericGFPoly multiplyByMonomial(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        if (i12 == 0) {
            return this.field.getZero();
        }
        int length = this.coefficients.length;
        int[] iArr = new int[i11 + length];
        for (int i13 = 0; i13 < length; i13++) {
            iArr[i13] = this.field.multiply(this.coefficients[i13], i12);
        }
        return new GenericGFPoly(this.field, iArr);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(getDegree() * 8);
        for (int degree = getDegree(); degree >= 0; degree--) {
            int coefficient = getCoefficient(degree);
            if (coefficient != 0) {
                if (coefficient < 0) {
                    sb2.append(" - ");
                    coefficient = -coefficient;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (degree == 0 || coefficient != 1) {
                    int iLog = this.field.log(coefficient);
                    if (iLog == 0) {
                        sb2.append('1');
                    } else if (iLog == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(iLog);
                    }
                }
                if (degree != 0) {
                    if (degree == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(degree);
                    }
                }
            }
        }
        return sb2.toString();
    }

    public GenericGFPoly(GenericGF genericGF, int[] iArr) {
        if (iArr.length != 0) {
            this.field = genericGF;
            int length = iArr.length;
            int i11 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i11 < length && iArr[i11] == 0) {
                    i11++;
                }
                if (i11 == length) {
                    this.coefficients = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i11];
                this.coefficients = iArr2;
                System.arraycopy(iArr, i11, iArr2, 0, iArr2.length);
                return;
            }
            this.coefficients = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public GenericGFPoly multiply(int i11) {
        if (i11 == 0) {
            return this.field.getZero();
        }
        if (i11 == 1) {
            return this;
        }
        int length = this.coefficients.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.field.multiply(this.coefficients[i12], i11);
        }
        return new GenericGFPoly(this.field, iArr);
    }
}
