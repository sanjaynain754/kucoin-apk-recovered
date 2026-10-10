package com.google.zxing.pdf417.decoder.p071ec;

/* JADX INFO: loaded from: classes56.dex */
final class ModulusPoly {
    private final int[] coefficients;
    private final ModulusGF field;

    public int evaluateAt(int i11) {
        if (i11 == 0) {
            return getCoefficient(0);
        }
        if (i11 == 1) {
            int iAdd = 0;
            for (int i12 : this.coefficients) {
                iAdd = this.field.add(iAdd, i12);
            }
            return iAdd;
        }
        int[] iArr = this.coefficients;
        int iAdd2 = iArr[0];
        int length = iArr.length;
        for (int i13 = 1; i13 < length; i13++) {
            ModulusGF modulusGF = this.field;
            iAdd2 = modulusGF.add(modulusGF.multiply(i11, iAdd2), this.coefficients[i13]);
        }
        return iAdd2;
    }

    public ModulusPoly multiply(ModulusPoly modulusPoly) {
        if (!this.field.equals(modulusPoly.field)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (isZero() || modulusPoly.isZero()) {
            return this.field.getZero();
        }
        int[] iArr = this.coefficients;
        int length = iArr.length;
        int[] iArr2 = modulusPoly.coefficients;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            for (int i13 = 0; i13 < length2; i13++) {
                int i14 = i11 + i13;
                ModulusGF modulusGF = this.field;
                iArr3[i14] = modulusGF.add(iArr3[i14], modulusGF.multiply(i12, iArr2[i13]));
            }
        }
        return new ModulusPoly(this.field, iArr3);
    }

    public ModulusPoly add(ModulusPoly modulusPoly) {
        if (!this.field.equals(modulusPoly.field)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (isZero()) {
            return modulusPoly;
        }
        if (modulusPoly.isZero()) {
            return this;
        }
        int[] iArr = this.coefficients;
        int[] iArr2 = modulusPoly.coefficients;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i11 = length; i11 < iArr.length; i11++) {
            iArr3[i11] = this.field.add(iArr2[i11 - length], iArr[i11]);
        }
        return new ModulusPoly(this.field, iArr3);
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

    public ModulusPoly multiplyByMonomial(int i11, int i12) {
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
        return new ModulusPoly(this.field, iArr);
    }

    public ModulusPoly negative() {
        int length = this.coefficients.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.field.subtract(0, this.coefficients[i11]);
        }
        return new ModulusPoly(this.field, iArr);
    }

    public ModulusPoly subtract(ModulusPoly modulusPoly) {
        if (this.field.equals(modulusPoly.field)) {
            return modulusPoly.isZero() ? this : add(modulusPoly.negative());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
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
                    sb2.append(coefficient);
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

    public ModulusPoly(ModulusGF modulusGF, int[] iArr) {
        if (iArr.length != 0) {
            this.field = modulusGF;
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

    public ModulusPoly multiply(int i11) {
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
        return new ModulusPoly(this.field, iArr);
    }
}
