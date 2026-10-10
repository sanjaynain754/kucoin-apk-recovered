package androidx.constraintlayout.core;

import com.tencent.bugly.proguard.C33627eb;
import java.util.Arrays;

/* JADX INFO: loaded from: classes23.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean HASH = true;
    private static float sEpsilon = 0.001f;
    protected final Cache mCache;
    private final ArrayRow mRow;
    private final int mNone = -1;
    private int mSize = 16;
    private int mHashSize = 16;
    int[] mKeys = new int[16];
    int[] mNextKeys = new int[16];
    int[] mVariables = new int[16];
    float[] mValues = new float[16];
    int[] mPrevious = new int[16];
    int[] mNext = new int[16];
    int mCount = 0;
    int mHead = -1;

    private void displayHash() {
        for (int i11 = 0; i11 < this.mHashSize; i11++) {
            if (this.mKeys[i11] != -1) {
                String str = hashCode() + " hash [" + i11 + "] => ";
                int i12 = this.mKeys[i11];
                boolean z11 = false;
                while (!z11) {
                    str = str + C33627eb.f69716f + this.mVariables[i12];
                    int i13 = this.mNextKeys[i12];
                    if (i13 != -1) {
                        i12 = i13;
                    } else {
                        z11 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private int findEmptySlot() {
        for (int i11 = 0; i11 < this.mSize; i11++) {
            if (this.mVariables[i11] == -1) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return 0;
    }

    private void addToHashMap(SolverVariable solverVariable, int i11) {
        int[] iArr;
        int i12 = solverVariable.f2179id % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            iArr2[i12] = i11;
        } else {
            while (true) {
                iArr = this.mNextKeys;
                int i14 = iArr[i13];
                if (i14 == -1) {
                    break;
                } else {
                    i13 = i14;
                }
            }
            iArr[i13] = i11;
        }
        this.mNextKeys[i11] = -1;
    }

    private void addVariable(int i11, SolverVariable solverVariable, float f11) {
        this.mVariables[i11] = solverVariable.f2179id;
        this.mValues[i11] = f11;
        this.mPrevious[i11] = -1;
        this.mNext[i11] = -1;
        solverVariable.addToRow(this.mRow);
        solverVariable.usageInRowCount++;
        this.mCount++;
    }

    private void increaseSize() {
        int i11 = this.mSize * 2;
        this.mVariables = Arrays.copyOf(this.mVariables, i11);
        this.mValues = Arrays.copyOf(this.mValues, i11);
        this.mPrevious = Arrays.copyOf(this.mPrevious, i11);
        this.mNext = Arrays.copyOf(this.mNext, i11);
        this.mNextKeys = Arrays.copyOf(this.mNextKeys, i11);
        for (int i12 = this.mSize; i12 < i11; i12++) {
            this.mVariables[i12] = -1;
            this.mNextKeys[i12] = -1;
        }
        this.mSize = i11;
    }

    private void removeFromHashMap(SolverVariable solverVariable) {
        int[] iArr;
        int i11;
        int i12 = solverVariable.f2179id;
        int i13 = i12 % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i14 = iArr2[i13];
        if (i14 == -1) {
            return;
        }
        if (this.mVariables[i14] == i12) {
            int[] iArr3 = this.mNextKeys;
            iArr2[i13] = iArr3[i14];
            iArr3[i14] = -1;
            return;
        }
        while (true) {
            iArr = this.mNextKeys;
            i11 = iArr[i14];
            if (i11 == -1 || this.mVariables[i11] == i12) {
                break;
            } else {
                i14 = i11;
            }
        }
        if (i11 == -1 || this.mVariables[i11] != i12) {
            return;
        }
        iArr[i14] = iArr[i11];
        iArr[i11] = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f11, boolean z11) {
        float f12 = sEpsilon;
        if (f11 <= (-f12) || f11 >= f12) {
            int iIndexOf = indexOf(solverVariable);
            if (iIndexOf == -1) {
                put(solverVariable, f11);
                return;
            }
            float[] fArr = this.mValues;
            float f13 = fArr[iIndexOf] + f11;
            fArr[iIndexOf] = f13;
            float f14 = sEpsilon;
            if (f13 <= (-f14) || f13 >= f14) {
                return;
            }
            fArr[iIndexOf] = 0.0f;
            remove(solverVariable, z11);
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i11 = this.mCount;
        for (int i12 = 0; i12 < i11; i12++) {
            SolverVariable variable = getVariable(i12);
            if (variable != null) {
                variable.removeFromRow(this.mRow);
            }
        }
        for (int i13 = 0; i13 < this.mSize; i13++) {
            this.mVariables[i13] = -1;
            this.mNextKeys[i13] = -1;
        }
        for (int i14 = 0; i14 < this.mHashSize; i14++) {
            this.mKeys[i14] = -1;
        }
        this.mCount = 0;
        this.mHead = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i11 = this.mCount;
        System.out.print("{ ");
        for (int i12 = 0; i12 < i11; i12++) {
            SolverVariable variable = getVariable(i12);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i12) + C33627eb.f69716f);
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f11) {
        int i11 = this.mCount;
        int i12 = this.mHead;
        for (int i13 = 0; i13 < i11; i13++) {
            float[] fArr = this.mValues;
            fArr[i12] = fArr[i12] / f11;
            i12 = this.mNext[i12];
            if (i12 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.mCount;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i11) {
        int i12 = this.mCount;
        if (i12 == 0) {
            return null;
        }
        int i13 = this.mHead;
        for (int i14 = 0; i14 < i12; i14++) {
            if (i14 == i11 && i13 != -1) {
                return this.mCache.mIndexedVariables[this.mVariables[i13]];
            }
            i13 = this.mNext[i13];
            if (i13 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i11) {
        int i12 = this.mCount;
        int i13 = this.mHead;
        for (int i14 = 0; i14 < i12; i14++) {
            if (i14 == i11) {
                return this.mValues[i13];
            }
            i13 = this.mNext[i13];
            if (i13 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        if (this.mCount != 0 && solverVariable != null) {
            int i11 = solverVariable.f2179id;
            int i12 = this.mKeys[i11 % this.mHashSize];
            if (i12 == -1) {
                return -1;
            }
            if (this.mVariables[i12] == i11) {
                return i12;
            }
            do {
                i12 = this.mNextKeys[i12];
                if (i12 == -1) {
                    break;
                }
            } while (this.mVariables[i12] != i11);
            if (i12 != -1 && this.mVariables[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i11 = this.mCount;
        int i12 = this.mHead;
        for (int i13 = 0; i13 < i11; i13++) {
            float[] fArr = this.mValues;
            fArr[i12] = fArr[i12] * (-1.0f);
            i12 = this.mNext[i12];
            if (i12 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(SolverVariable solverVariable, float f11) {
        float f12 = sEpsilon;
        if (f11 > (-f12) && f11 < f12) {
            remove(solverVariable, true);
            return;
        }
        if (this.mCount == 0) {
            addVariable(0, solverVariable, f11);
            addToHashMap(solverVariable, 0);
            this.mHead = 0;
            return;
        }
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf != -1) {
            this.mValues[iIndexOf] = f11;
            return;
        }
        if (this.mCount + 1 >= this.mSize) {
            increaseSize();
        }
        int i11 = this.mCount;
        int i12 = this.mHead;
        int i13 = -1;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = this.mVariables[i12];
            int i16 = solverVariable.f2179id;
            if (i15 == i16) {
                this.mValues[i12] = f11;
                return;
            }
            if (i15 < i16) {
                i13 = i12;
            }
            i12 = this.mNext[i12];
            if (i12 == -1) {
                break;
            }
        }
        insertVariable(i13, solverVariable, f11);
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i11 = this.mCount;
        for (int i12 = 0; i12 < i11; i12++) {
            SolverVariable variable = getVariable(i12);
            if (variable != null) {
                String str2 = str + variable + " = " + getVariableValue(i12) + C33627eb.f69716f;
                int iIndexOf = indexOf(variable);
                String str3 = str2 + "[p: ";
                String str4 = (this.mPrevious[iIndexOf] != -1 ? str3 + this.mCache.mIndexedVariables[this.mVariables[this.mPrevious[iIndexOf]]] : str3 + "none") + ", n: ";
                str = (this.mNext[iIndexOf] != -1 ? str4 + this.mCache.mIndexedVariables[this.mVariables[this.mNext[iIndexOf]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z11) {
        float f11 = get(arrayRow.mVariable);
        remove(arrayRow.mVariable, z11);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.variables;
        int currentSize = solverVariableValues.getCurrentSize();
        int i11 = 0;
        int i12 = 0;
        while (i11 < currentSize) {
            int i13 = solverVariableValues.mVariables[i12];
            if (i13 != -1) {
                add(this.mCache.mIndexedVariables[i13], solverVariableValues.mValues[i12] * f11, z11);
                i11++;
            }
            i12++;
        }
        return f11;
    }

    public SolverVariableValues(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
        clear();
    }

    private void insertVariable(int i11, SolverVariable solverVariable, float f11) {
        int iFindEmptySlot = findEmptySlot();
        addVariable(iFindEmptySlot, solverVariable, f11);
        if (i11 != -1) {
            this.mPrevious[iFindEmptySlot] = i11;
            int[] iArr = this.mNext;
            iArr[iFindEmptySlot] = iArr[i11];
            iArr[i11] = iFindEmptySlot;
        } else {
            this.mPrevious[iFindEmptySlot] = -1;
            if (this.mCount > 0) {
                this.mNext[iFindEmptySlot] = this.mHead;
                this.mHead = iFindEmptySlot;
            } else {
                this.mNext[iFindEmptySlot] = -1;
            }
        }
        int i12 = this.mNext[iFindEmptySlot];
        if (i12 != -1) {
            this.mPrevious[i12] = iFindEmptySlot;
        }
        addToHashMap(solverVariable, iFindEmptySlot);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        if (indexOf(solverVariable) != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float get(SolverVariable solverVariable) {
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf != -1) {
            return this.mValues[iIndexOf];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(SolverVariable solverVariable, boolean z11) {
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf == -1) {
            return 0.0f;
        }
        removeFromHashMap(solverVariable);
        float f11 = this.mValues[iIndexOf];
        if (this.mHead == iIndexOf) {
            this.mHead = this.mNext[iIndexOf];
        }
        this.mVariables[iIndexOf] = -1;
        int[] iArr = this.mPrevious;
        int i11 = iArr[iIndexOf];
        if (i11 != -1) {
            int[] iArr2 = this.mNext;
            iArr2[i11] = iArr2[iIndexOf];
        }
        int i12 = this.mNext[iIndexOf];
        if (i12 != -1) {
            iArr[i12] = iArr[iIndexOf];
        }
        this.mCount--;
        solverVariable.usageInRowCount--;
        if (z11) {
            solverVariable.removeFromRow(this.mRow);
        }
        return f11;
    }
}
