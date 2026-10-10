package com.google.zxing.pdf417.decoder.p071ec;

import com.google.zxing.ChecksumException;

/* JADX INFO: loaded from: classes56.dex */
public final class ErrorCorrection {
    private final ModulusGF field = ModulusGF.PDF417_GF;

    public int decode(int[] iArr, int i11, int[] iArr2) throws ChecksumException {
        ModulusPoly modulusPoly = new ModulusPoly(this.field, iArr);
        int[] iArr3 = new int[i11];
        boolean z11 = false;
        for (int i12 = i11; i12 > 0; i12--) {
            int iEvaluateAt = modulusPoly.evaluateAt(this.field.exp(i12));
            iArr3[i11 - i12] = iEvaluateAt;
            if (iEvaluateAt != 0) {
                z11 = true;
            }
        }
        if (!z11) {
            return 0;
        }
        ModulusPoly one = this.field.getOne();
        if (iArr2 != null) {
            for (int i13 : iArr2) {
                int iExp = this.field.exp((iArr.length - 1) - i13);
                ModulusGF modulusGF = this.field;
                one = one.multiply(new ModulusPoly(modulusGF, new int[]{modulusGF.subtract(0, iExp), 1}));
            }
        }
        ModulusPoly[] modulusPolyArrRunEuclideanAlgorithm = runEuclideanAlgorithm(this.field.buildMonomial(i11, 1), new ModulusPoly(this.field, iArr3), i11);
        ModulusPoly modulusPoly2 = modulusPolyArrRunEuclideanAlgorithm[0];
        ModulusPoly modulusPoly3 = modulusPolyArrRunEuclideanAlgorithm[1];
        int[] iArrFindErrorLocations = findErrorLocations(modulusPoly2);
        int[] iArrFindErrorMagnitudes = findErrorMagnitudes(modulusPoly3, modulusPoly2, iArrFindErrorLocations);
        for (int i14 = 0; i14 < iArrFindErrorLocations.length; i14++) {
            int length = (iArr.length - 1) - this.field.log(iArrFindErrorLocations[i14]);
            if (length < 0) {
                throw ChecksumException.getChecksumInstance();
            }
            iArr[length] = this.field.subtract(iArr[length], iArrFindErrorMagnitudes[i14]);
        }
        return iArrFindErrorLocations.length;
    }

    private int[] findErrorLocations(ModulusPoly modulusPoly) throws ChecksumException {
        int degree = modulusPoly.getDegree();
        int[] iArr = new int[degree];
        int i11 = 0;
        for (int i12 = 1; i12 < this.field.getSize() && i11 < degree; i12++) {
            if (modulusPoly.evaluateAt(i12) == 0) {
                iArr[i11] = this.field.inverse(i12);
                i11++;
            }
        }
        if (i11 == degree) {
            return iArr;
        }
        throw ChecksumException.getChecksumInstance();
    }

    private int[] findErrorMagnitudes(ModulusPoly modulusPoly, ModulusPoly modulusPoly2, int[] iArr) {
        int degree = modulusPoly2.getDegree();
        int[] iArr2 = new int[degree];
        for (int i11 = 1; i11 <= degree; i11++) {
            iArr2[degree - i11] = this.field.multiply(i11, modulusPoly2.getCoefficient(i11));
        }
        ModulusPoly modulusPoly3 = new ModulusPoly(this.field, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            int iInverse = this.field.inverse(iArr[i12]);
            iArr3[i12] = this.field.multiply(this.field.subtract(0, modulusPoly.evaluateAt(iInverse)), this.field.inverse(modulusPoly3.evaluateAt(iInverse)));
        }
        return iArr3;
    }

    private ModulusPoly[] runEuclideanAlgorithm(ModulusPoly modulusPoly, ModulusPoly modulusPoly2, int i11) throws ChecksumException {
        if (modulusPoly.getDegree() < modulusPoly2.getDegree()) {
            modulusPoly2 = modulusPoly;
            modulusPoly = modulusPoly2;
        }
        ModulusPoly zero = this.field.getZero();
        ModulusPoly one = this.field.getOne();
        while (true) {
            ModulusPoly modulusPoly3 = modulusPoly2;
            modulusPoly2 = modulusPoly;
            modulusPoly = modulusPoly3;
            ModulusPoly modulusPoly4 = one;
            ModulusPoly modulusPoly5 = zero;
            zero = modulusPoly4;
            if (modulusPoly.getDegree() >= i11 / 2) {
                if (!modulusPoly.isZero()) {
                    ModulusPoly zero2 = this.field.getZero();
                    int iInverse = this.field.inverse(modulusPoly.getCoefficient(modulusPoly.getDegree()));
                    while (modulusPoly2.getDegree() >= modulusPoly.getDegree() && !modulusPoly2.isZero()) {
                        int degree = modulusPoly2.getDegree() - modulusPoly.getDegree();
                        int iMultiply = this.field.multiply(modulusPoly2.getCoefficient(modulusPoly2.getDegree()), iInverse);
                        zero2 = zero2.add(this.field.buildMonomial(degree, iMultiply));
                        modulusPoly2 = modulusPoly2.subtract(modulusPoly.multiplyByMonomial(degree, iMultiply));
                    }
                    one = zero2.multiply(zero).subtract(modulusPoly5).negative();
                } else {
                    throw ChecksumException.getChecksumInstance();
                }
            } else {
                int coefficient = zero.getCoefficient(0);
                if (coefficient != 0) {
                    int iInverse2 = this.field.inverse(coefficient);
                    return new ModulusPoly[]{zero.multiply(iInverse2), modulusPoly.multiply(iInverse2)};
                }
                throw ChecksumException.getChecksumInstance();
            }
        }
    }
}
