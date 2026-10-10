package com.google.zxing.common.reedsolomon;

/* JADX INFO: loaded from: classes56.dex */
public final class ReedSolomonDecoder {
    private final GenericGF field;

    private int[] findErrorMagnitudes(GenericGFPoly genericGFPoly, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            int iInverse = this.field.inverse(iArr[i11]);
            int iMultiply = 1;
            for (int i12 = 0; i12 < length; i12++) {
                if (i11 != i12) {
                    int iMultiply2 = this.field.multiply(iArr[i12], iInverse);
                    iMultiply = this.field.multiply(iMultiply, (iMultiply2 & 1) == 0 ? iMultiply2 | 1 : iMultiply2 & (-2));
                }
            }
            iArr2[i11] = this.field.multiply(genericGFPoly.evaluateAt(iInverse), this.field.inverse(iMultiply));
            if (this.field.getGeneratorBase() != 0) {
                iArr2[i11] = this.field.multiply(iArr2[i11], iInverse);
            }
        }
        return iArr2;
    }

    public void decode(int[] iArr, int i11) throws ReedSolomonException {
        GenericGFPoly genericGFPoly = new GenericGFPoly(this.field, iArr);
        int[] iArr2 = new int[i11];
        boolean z11 = true;
        for (int i12 = 0; i12 < i11; i12++) {
            GenericGF genericGF = this.field;
            int iEvaluateAt = genericGFPoly.evaluateAt(genericGF.exp(genericGF.getGeneratorBase() + i12));
            iArr2[(i11 - 1) - i12] = iEvaluateAt;
            if (iEvaluateAt != 0) {
                z11 = false;
            }
        }
        if (z11) {
            return;
        }
        GenericGFPoly[] genericGFPolyArrRunEuclideanAlgorithm = runEuclideanAlgorithm(this.field.buildMonomial(i11, 1), new GenericGFPoly(this.field, iArr2), i11);
        GenericGFPoly genericGFPoly2 = genericGFPolyArrRunEuclideanAlgorithm[0];
        GenericGFPoly genericGFPoly3 = genericGFPolyArrRunEuclideanAlgorithm[1];
        int[] iArrFindErrorLocations = findErrorLocations(genericGFPoly2);
        int[] iArrFindErrorMagnitudes = findErrorMagnitudes(genericGFPoly3, iArrFindErrorLocations);
        for (int i13 = 0; i13 < iArrFindErrorLocations.length; i13++) {
            int length = (iArr.length - 1) - this.field.log(iArrFindErrorLocations[i13]);
            if (length < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            iArr[length] = GenericGF.addOrSubtract(iArr[length], iArrFindErrorMagnitudes[i13]);
        }
    }

    public ReedSolomonDecoder(GenericGF genericGF) {
        this.field = genericGF;
    }

    private int[] findErrorLocations(GenericGFPoly genericGFPoly) throws ReedSolomonException {
        int degree = genericGFPoly.getDegree();
        if (degree == 1) {
            return new int[]{genericGFPoly.getCoefficient(1)};
        }
        int[] iArr = new int[degree];
        int i11 = 0;
        for (int i12 = 1; i12 < this.field.getSize() && i11 < degree; i12++) {
            if (genericGFPoly.evaluateAt(i12) == 0) {
                iArr[i11] = this.field.inverse(i12);
                i11++;
            }
        }
        if (i11 == degree) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    private GenericGFPoly[] runEuclideanAlgorithm(GenericGFPoly genericGFPoly, GenericGFPoly genericGFPoly2, int i11) throws ReedSolomonException {
        if (genericGFPoly.getDegree() < genericGFPoly2.getDegree()) {
            genericGFPoly2 = genericGFPoly;
            genericGFPoly = genericGFPoly2;
        }
        GenericGFPoly zero = this.field.getZero();
        GenericGFPoly one = this.field.getOne();
        do {
            GenericGFPoly genericGFPoly3 = genericGFPoly2;
            genericGFPoly2 = genericGFPoly;
            genericGFPoly = genericGFPoly3;
            GenericGFPoly genericGFPoly4 = one;
            GenericGFPoly genericGFPoly5 = zero;
            zero = genericGFPoly4;
            if (genericGFPoly.getDegree() >= i11 / 2) {
                if (!genericGFPoly.isZero()) {
                    GenericGFPoly zero2 = this.field.getZero();
                    int iInverse = this.field.inverse(genericGFPoly.getCoefficient(genericGFPoly.getDegree()));
                    while (genericGFPoly2.getDegree() >= genericGFPoly.getDegree() && !genericGFPoly2.isZero()) {
                        int degree = genericGFPoly2.getDegree() - genericGFPoly.getDegree();
                        int iMultiply = this.field.multiply(genericGFPoly2.getCoefficient(genericGFPoly2.getDegree()), iInverse);
                        zero2 = zero2.addOrSubtract(this.field.buildMonomial(degree, iMultiply));
                        genericGFPoly2 = genericGFPoly2.addOrSubtract(genericGFPoly.multiplyByMonomial(degree, iMultiply));
                    }
                    one = zero2.multiply(zero).addOrSubtract(genericGFPoly5);
                } else {
                    throw new ReedSolomonException("r_{i-1} was zero");
                }
            } else {
                int coefficient = zero.getCoefficient(0);
                if (coefficient != 0) {
                    int iInverse2 = this.field.inverse(coefficient);
                    return new GenericGFPoly[]{zero.multiply(iInverse2), genericGFPoly.multiply(iInverse2)};
                }
                throw new ReedSolomonException("sigmaTilde(0) was zero");
            }
        } while (genericGFPoly2.getDegree() < genericGFPoly.getDegree());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }
}
