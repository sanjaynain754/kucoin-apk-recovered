package androidx.constraintlayout.core;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.futures.dialog.twap.OrderPriceType;
import com.tencent.bugly.proguard.C33627eb;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class LinearSystem {
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    private static final boolean DEBUG_CONSTRAINTS = false;
    private static final boolean DO_NOT_USE = false;
    public static final boolean FULL_DEBUG = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = false;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;
    public static Metrics sMetrics;
    final Cache mCache;
    private Row mGoal;
    private Row mTempGoal;
    private int mPoolSize = 1000;
    public boolean hasSimpleDefinition = false;
    int mVariablesID = 0;
    private HashMap<String, SolverVariable> mVariables = null;
    private int mTableSize = 32;
    private int mMaxColumns = 32;
    public boolean graphOptimizer = false;
    public boolean newgraphOptimizer = false;
    private boolean[] mAlreadyTestedCandidates = new boolean[32];
    int mNumColumns = 1;
    int mNumRows = 0;
    private int mMaxRows = 32;
    private SolverVariable[] mPoolVariables = new SolverVariable[1000];
    private int mPoolVariablesCount = 0;
    ArrayRow[] mRows = new ArrayRow[32];

    public interface Row {
        void addError(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr);

        void initFromRow(Row row);

        boolean isEmpty();

        void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z11);

        void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z11);

        void updateFromSystem(LinearSystem linearSystem);
    }

    private void computeValues() {
        for (int i11 = 0; i11 < this.mNumRows; i11++) {
            ArrayRow arrayRow = this.mRows[i11];
            arrayRow.mVariable.computedValue = arrayRow.mConstantValue;
        }
    }

    private String getDisplayStrength(int i11) {
        if (i11 == 1) {
            return "LOW";
        }
        if (i11 == 2) {
            return "MEDIUM";
        }
        if (i11 == 3) {
            return "HIGH";
        }
        if (i11 == 4) {
            return "HIGHEST";
        }
        if (i11 == 5) {
            return "EQUALITY";
        }
        if (i11 == 8) {
            return OrderPriceType.TYPE_FIXED;
        }
        return i11 == 6 ? "BARRIER" : "NONE";
    }

    public ArrayRow addEquality(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, int i12) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.mSimpleEquations++;
        }
        if (USE_BASIC_SYNONYMS && i12 == 8 && solverVariable2.isFinalValue && solverVariable.mDefinitionId == -1) {
            solverVariable.setFinalValue(this, solverVariable2.computedValue + i11);
            return null;
        }
        ArrayRow arrayRowCreateRow = createRow();
        arrayRowCreateRow.createRowEquals(solverVariable, solverVariable2, i11);
        if (i12 != 8) {
            arrayRowCreateRow.addError(this, i12);
        }
        addConstraint(arrayRowCreateRow);
        return arrayRowCreateRow;
    }

    public void addSingleError(ArrayRow arrayRow, int i11, int i12) {
        arrayRow.addSingleError(createErrorVariable(i12, null), i11);
    }

    public final void cleanupRows() {
        int i11;
        int i12 = 0;
        while (i12 < this.mNumRows) {
            ArrayRow arrayRow = this.mRows[i12];
            if (arrayRow.variables.getCurrentSize() == 0) {
                arrayRow.mIsSimpleDefinition = true;
            }
            if (arrayRow.mIsSimpleDefinition) {
                SolverVariable solverVariable = arrayRow.mVariable;
                solverVariable.computedValue = arrayRow.mConstantValue;
                solverVariable.removeFromRow(arrayRow);
                int i13 = i12;
                while (true) {
                    i11 = this.mNumRows;
                    if (i13 >= i11 - 1) {
                        break;
                    }
                    ArrayRow[] arrayRowArr = this.mRows;
                    int i14 = i13 + 1;
                    arrayRowArr[i13] = arrayRowArr[i14];
                    i13 = i14;
                }
                this.mRows[i11 - 1] = null;
                this.mNumRows = i11 - 1;
                i12--;
                if (OPTIMIZED_ENGINE) {
                    this.mCache.mOptimizedArrayRowPool.release(arrayRow);
                } else {
                    this.mCache.mArrayRowPool.release(arrayRow);
                }
            }
            i12++;
        }
    }

    public SolverVariable createObjectVariable(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.getSolverVariable();
            if (solverVariable == null) {
                constraintAnchor.resetSolverVariable(this.mCache);
                solverVariable = constraintAnchor.getSolverVariable();
            }
            int i11 = solverVariable.f2179id;
            if (i11 != -1 && i11 <= this.mVariablesID && this.mCache.mIndexedVariables[i11] != null) {
                return solverVariable;
            }
            if (i11 != -1) {
                solverVariable.reset();
            }
            int i12 = this.mVariablesID + 1;
            this.mVariablesID = i12;
            this.mNumColumns++;
            solverVariable.f2179id = i12;
            solverVariable.mType = SolverVariable.Type.UNRESTRICTED;
            this.mCache.mIndexedVariables[i12] = solverVariable;
        }
        return solverVariable;
    }

    public void displaySystemInformation() {
        int iSizeInBytes = 0;
        for (int i11 = 0; i11 < this.mTableSize; i11++) {
            ArrayRow arrayRow = this.mRows[i11];
            if (arrayRow != null) {
                iSizeInBytes += arrayRow.sizeInBytes();
            }
        }
        int iSizeInBytes2 = 0;
        for (int i12 = 0; i12 < this.mNumRows; i12++) {
            ArrayRow arrayRow2 = this.mRows[i12];
            if (arrayRow2 != null) {
                iSizeInBytes2 += arrayRow2.sizeInBytes();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Linear System -> Table size: ");
        sb2.append(this.mTableSize);
        sb2.append(" (");
        int i13 = this.mTableSize;
        sb2.append(getDisplaySize(i13 * i13));
        sb2.append(") -- row sizes: ");
        sb2.append(getDisplaySize(iSizeInBytes));
        sb2.append(", actual size: ");
        sb2.append(getDisplaySize(iSizeInBytes2));
        sb2.append(" rows: ");
        sb2.append(this.mNumRows);
        sb2.append("/");
        sb2.append(this.mMaxRows);
        sb2.append(" cols: ");
        sb2.append(this.mNumColumns);
        sb2.append("/");
        sb2.append(this.mMaxColumns);
        sb2.append(C33627eb.f69716f);
        sb2.append(0);
        sb2.append(" occupied cells, ");
        sb2.append(getDisplaySize(0));
        printStream.println(sb2.toString());
    }

    public int getMemoryUsed() {
        int iSizeInBytes = 0;
        for (int i11 = 0; i11 < this.mNumRows; i11++) {
            ArrayRow arrayRow = this.mRows[i11];
            if (arrayRow != null) {
                iSizeInBytes += arrayRow.sizeInBytes();
            }
        }
        return iSizeInBytes;
    }

    public void reset() {
        Cache cache;
        int i11 = 0;
        while (true) {
            cache = this.mCache;
            SolverVariable[] solverVariableArr = cache.mIndexedVariables;
            if (i11 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i11];
            if (solverVariable != null) {
                solverVariable.reset();
            }
            i11++;
        }
        cache.mSolverVariablePool.releaseAll(this.mPoolVariables, this.mPoolVariablesCount);
        this.mPoolVariablesCount = 0;
        Arrays.fill(this.mCache.mIndexedVariables, (Object) null);
        HashMap<String, SolverVariable> map = this.mVariables;
        if (map != null) {
            map.clear();
        }
        this.mVariablesID = 0;
        this.mGoal.clear();
        this.mNumColumns = 1;
        for (int i12 = 0; i12 < this.mNumRows; i12++) {
            ArrayRow arrayRow = this.mRows[i12];
            if (arrayRow != null) {
                arrayRow.mUsed = false;
            }
        }
        releaseRows();
        this.mNumRows = 0;
        if (OPTIMIZED_ENGINE) {
            this.mTempGoal = new ValuesRow(this.mCache);
        } else {
            this.mTempGoal = new ArrayRow(this.mCache);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class ValuesRow extends ArrayRow {
        public ValuesRow(Cache cache) {
            this.variables = new SolverVariableValues(this, cache);
        }
    }

    private SolverVariable acquireSolverVariable(SolverVariable.Type type, String str) {
        SolverVariable solverVariableAcquire = this.mCache.mSolverVariablePool.acquire();
        if (solverVariableAcquire == null) {
            solverVariableAcquire = new SolverVariable(type, str);
            solverVariableAcquire.setType(type, str);
        } else {
            solverVariableAcquire.reset();
            solverVariableAcquire.setType(type, str);
        }
        int i11 = this.mPoolVariablesCount;
        int i12 = this.mPoolSize;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            this.mPoolSize = i13;
            this.mPoolVariables = (SolverVariable[]) Arrays.copyOf(this.mPoolVariables, i13);
        }
        SolverVariable[] solverVariableArr = this.mPoolVariables;
        int i14 = this.mPoolVariablesCount;
        this.mPoolVariablesCount = i14 + 1;
        solverVariableArr[i14] = solverVariableAcquire;
        return solverVariableAcquire;
    }

    private void addRow(ArrayRow arrayRow) {
        int i11;
        if (SIMPLIFY_SYNONYMS && arrayRow.mIsSimpleDefinition) {
            arrayRow.mVariable.setFinalValue(this, arrayRow.mConstantValue);
        } else {
            ArrayRow[] arrayRowArr = this.mRows;
            int i12 = this.mNumRows;
            arrayRowArr[i12] = arrayRow;
            SolverVariable solverVariable = arrayRow.mVariable;
            solverVariable.mDefinitionId = i12;
            this.mNumRows = i12 + 1;
            solverVariable.updateReferencesWithNewDefinition(this, arrayRow);
        }
        if (SIMPLIFY_SYNONYMS && this.hasSimpleDefinition) {
            int i13 = 0;
            while (i13 < this.mNumRows) {
                if (this.mRows[i13] == null) {
                    System.out.println("WTF");
                }
                ArrayRow arrayRow2 = this.mRows[i13];
                if (arrayRow2 != null && arrayRow2.mIsSimpleDefinition) {
                    arrayRow2.mVariable.setFinalValue(this, arrayRow2.mConstantValue);
                    if (OPTIMIZED_ENGINE) {
                        this.mCache.mOptimizedArrayRowPool.release(arrayRow2);
                    } else {
                        this.mCache.mArrayRowPool.release(arrayRow2);
                    }
                    this.mRows[i13] = null;
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (true) {
                        i11 = this.mNumRows;
                        if (i14 >= i11) {
                            break;
                        }
                        ArrayRow[] arrayRowArr2 = this.mRows;
                        int i16 = i14 - 1;
                        ArrayRow arrayRow3 = arrayRowArr2[i14];
                        arrayRowArr2[i16] = arrayRow3;
                        SolverVariable solverVariable2 = arrayRow3.mVariable;
                        if (solverVariable2.mDefinitionId == i14) {
                            solverVariable2.mDefinitionId = i16;
                        }
                        i15 = i14;
                        i14++;
                    }
                    if (i15 < i11) {
                        this.mRows[i15] = null;
                    }
                    this.mNumRows = i11 - 1;
                    i13--;
                }
                i13++;
            }
            this.hasSimpleDefinition = false;
        }
    }

    private SolverVariable createVariable(String str, SolverVariable.Type type) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.variables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable solverVariableAcquireSolverVariable = acquireSolverVariable(type, null);
        solverVariableAcquireSolverVariable.setName(str);
        int i11 = this.mVariablesID + 1;
        this.mVariablesID = i11;
        this.mNumColumns++;
        solverVariableAcquireSolverVariable.f2179id = i11;
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        this.mVariables.put(str, solverVariableAcquireSolverVariable);
        this.mCache.mIndexedVariables[this.mVariablesID] = solverVariableAcquireSolverVariable;
        return solverVariableAcquireSolverVariable;
    }

    private void displaySolverVariables() {
        System.out.println("Display Rows (" + this.mNumRows + "x" + this.mNumColumns + ")\n");
    }

    private int enforceBFS(Row row) throws Exception {
        float f11;
        long j11;
        for (int i11 = 0; i11 < this.mNumRows; i11++) {
            ArrayRow arrayRow = this.mRows[i11];
            if (arrayRow.mVariable.mType != SolverVariable.Type.UNRESTRICTED) {
                float f12 = 0.0f;
                if (arrayRow.mConstantValue < 0.0f) {
                    boolean z11 = false;
                    int i12 = 0;
                    while (!z11) {
                        Metrics metrics = sMetrics;
                        long j12 = 1;
                        if (metrics != null) {
                            metrics.bfs++;
                        }
                        i12++;
                        float f13 = Float.MAX_VALUE;
                        int i13 = 0;
                        int i14 = -1;
                        int i15 = -1;
                        int i16 = 0;
                        while (true) {
                            if (i13 >= this.mNumRows) {
                                break;
                            }
                            ArrayRow arrayRow2 = this.mRows[i13];
                            if (arrayRow2.mVariable.mType == SolverVariable.Type.UNRESTRICTED || arrayRow2.mIsSimpleDefinition || arrayRow2.mConstantValue >= f12) {
                                f11 = f12;
                                j11 = j12;
                            } else if (SKIP_COLUMNS) {
                                int currentSize = arrayRow2.variables.getCurrentSize();
                                int i17 = 0;
                                while (i17 < currentSize) {
                                    float f14 = f12;
                                    SolverVariable variable = arrayRow2.variables.getVariable(i17);
                                    long j13 = j12;
                                    float f15 = arrayRow2.variables.get(variable);
                                    if (f15 > f14) {
                                        for (int i18 = 0; i18 < 9; i18++) {
                                            float f16 = variable.mStrengthVector[i18] / f15;
                                            if ((f16 < f13 && i18 == i16) || i18 > i16) {
                                                i16 = i18;
                                                i15 = variable.f2179id;
                                                i14 = i13;
                                                f13 = f16;
                                            }
                                        }
                                    }
                                    i17++;
                                    f12 = f14;
                                    j12 = j13;
                                }
                                f11 = f12;
                                j11 = j12;
                            } else {
                                f11 = f12;
                                j11 = j12;
                                for (int i19 = 1; i19 < this.mNumColumns; i19++) {
                                    SolverVariable solverVariable = this.mCache.mIndexedVariables[i19];
                                    float f17 = arrayRow2.variables.get(solverVariable);
                                    if (f17 > f11) {
                                        for (int i21 = 0; i21 < 9; i21++) {
                                            float f18 = solverVariable.mStrengthVector[i21] / f17;
                                            if ((f18 < f13 && i21 == i16) || i21 > i16) {
                                                i16 = i21;
                                                f13 = f18;
                                                i14 = i13;
                                                i15 = i19;
                                            }
                                        }
                                    }
                                }
                            }
                            i13++;
                            f12 = f11;
                            j12 = j11;
                        }
                        float f19 = f12;
                        long j14 = j12;
                        if (i14 != -1) {
                            ArrayRow arrayRow3 = this.mRows[i14];
                            arrayRow3.mVariable.mDefinitionId = -1;
                            Metrics metrics2 = sMetrics;
                            if (metrics2 != null) {
                                metrics2.pivots += j14;
                            }
                            arrayRow3.pivot(this.mCache.mIndexedVariables[i15]);
                            SolverVariable solverVariable2 = arrayRow3.mVariable;
                            solverVariable2.mDefinitionId = i14;
                            solverVariable2.updateReferencesWithNewDefinition(this, arrayRow3);
                        } else {
                            z11 = true;
                        }
                        if (i12 > this.mNumColumns / 2) {
                            z11 = true;
                        }
                        f12 = f19;
                    }
                    return i12;
                }
            }
        }
        return 0;
    }

    private String getDisplaySize(int i11) {
        int i12 = i11 * 4;
        int i13 = i12 / 1024;
        int i14 = i13 / 1024;
        if (i14 > 0) {
            return "" + i14 + " Mb";
        }
        if (i13 > 0) {
            return "" + i13 + " Kb";
        }
        return "" + i12 + " bytes";
    }

    public static Metrics getMetrics() {
        return sMetrics;
    }

    private void increaseTableSize() {
        int i11 = this.mTableSize * 2;
        this.mTableSize = i11;
        this.mRows = (ArrayRow[]) Arrays.copyOf(this.mRows, i11);
        Cache cache = this.mCache;
        cache.mIndexedVariables = (SolverVariable[]) Arrays.copyOf(cache.mIndexedVariables, this.mTableSize);
        int i12 = this.mTableSize;
        this.mAlreadyTestedCandidates = new boolean[i12];
        this.mMaxColumns = i12;
        this.mMaxRows = i12;
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.tableSizeIncrease++;
            metrics.maxTableSize = Math.max(metrics.maxTableSize, i12);
            Metrics metrics2 = sMetrics;
            metrics2.lastTableSize = metrics2.maxTableSize;
        }
    }

    private int optimize(Row row, boolean z11) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.optimize++;
        }
        for (int i11 = 0; i11 < this.mNumColumns; i11++) {
            this.mAlreadyTestedCandidates[i11] = false;
        }
        boolean z12 = false;
        int i12 = 0;
        while (!z12) {
            Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.iterations++;
            }
            i12++;
            if (i12 < this.mNumColumns * 2) {
                if (row.getKey() != null) {
                    this.mAlreadyTestedCandidates[row.getKey().f2179id] = true;
                }
                SolverVariable pivotCandidate = row.getPivotCandidate(this, this.mAlreadyTestedCandidates);
                if (pivotCandidate != null) {
                    boolean[] zArr = this.mAlreadyTestedCandidates;
                    int i13 = pivotCandidate.f2179id;
                    if (!zArr[i13]) {
                        zArr[i13] = true;
                    }
                }
                if (pivotCandidate != null) {
                    float f11 = Float.MAX_VALUE;
                    int i14 = -1;
                    for (int i15 = 0; i15 < this.mNumRows; i15++) {
                        ArrayRow arrayRow = this.mRows[i15];
                        if (arrayRow.mVariable.mType != SolverVariable.Type.UNRESTRICTED && !arrayRow.mIsSimpleDefinition && arrayRow.hasVariable(pivotCandidate)) {
                            float f12 = arrayRow.variables.get(pivotCandidate);
                            if (f12 < 0.0f) {
                                float f13 = (-arrayRow.mConstantValue) / f12;
                                if (f13 < f11) {
                                    i14 = i15;
                                    f11 = f13;
                                }
                            }
                        }
                    }
                    if (i14 > -1) {
                        ArrayRow arrayRow2 = this.mRows[i14];
                        arrayRow2.mVariable.mDefinitionId = -1;
                        Metrics metrics3 = sMetrics;
                        if (metrics3 != null) {
                            metrics3.pivots++;
                        }
                        arrayRow2.pivot(pivotCandidate);
                        SolverVariable solverVariable = arrayRow2.mVariable;
                        solverVariable.mDefinitionId = i14;
                        solverVariable.updateReferencesWithNewDefinition(this, arrayRow2);
                    }
                } else {
                    z12 = true;
                }
            }
            return i12;
        }
        return i12;
    }

    private void releaseRows() {
        int i11 = 0;
        if (OPTIMIZED_ENGINE) {
            while (i11 < this.mNumRows) {
                ArrayRow arrayRow = this.mRows[i11];
                if (arrayRow != null) {
                    this.mCache.mOptimizedArrayRowPool.release(arrayRow);
                }
                this.mRows[i11] = null;
                i11++;
            }
            return;
        }
        while (i11 < this.mNumRows) {
            ArrayRow arrayRow2 = this.mRows[i11];
            if (arrayRow2 != null) {
                this.mCache.mArrayRowPool.release(arrayRow2);
            }
            this.mRows[i11] = null;
            i11++;
        }
    }

    public void addCenterPoint(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f11, int i11) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable solverVariableCreateObjectVariable = createObjectVariable(constraintWidget.getAnchor(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable solverVariableCreateObjectVariable2 = createObjectVariable(constraintWidget.getAnchor(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable solverVariableCreateObjectVariable3 = createObjectVariable(constraintWidget.getAnchor(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable solverVariableCreateObjectVariable4 = createObjectVariable(constraintWidget.getAnchor(type4));
        SolverVariable solverVariableCreateObjectVariable5 = createObjectVariable(constraintWidget2.getAnchor(type));
        SolverVariable solverVariableCreateObjectVariable6 = createObjectVariable(constraintWidget2.getAnchor(type2));
        SolverVariable solverVariableCreateObjectVariable7 = createObjectVariable(constraintWidget2.getAnchor(type3));
        SolverVariable solverVariableCreateObjectVariable8 = createObjectVariable(constraintWidget2.getAnchor(type4));
        ArrayRow arrayRowCreateRow = createRow();
        double d11 = f11;
        double d12 = i11;
        arrayRowCreateRow.createRowWithAngle(solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable8, (float) (Math.sin(d11) * d12));
        addConstraint(arrayRowCreateRow);
        ArrayRow arrayRowCreateRow2 = createRow();
        arrayRowCreateRow2.createRowWithAngle(solverVariableCreateObjectVariable, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable7, (float) (Math.cos(d11) * d12));
        addConstraint(arrayRowCreateRow2);
    }

    public void addCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, float f11, SolverVariable solverVariable3, SolverVariable solverVariable4, int i12, int i13) {
        ArrayRow arrayRowCreateRow = createRow();
        arrayRowCreateRow.createRowCentering(solverVariable, solverVariable2, i11, f11, solverVariable3, solverVariable4, i12);
        if (i13 != 8) {
            arrayRowCreateRow.addError(this, i13);
        }
        addConstraint(arrayRowCreateRow);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    public void addConstraint(ArrayRow arrayRow) {
        SolverVariable solverVariablePickPivot;
        if (arrayRow == null) {
            return;
        }
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.constraints++;
            if (arrayRow.mIsSimpleDefinition) {
                metrics.simpleconstraints++;
            }
        }
        boolean z11 = true;
        if (this.mNumRows + 1 >= this.mMaxRows || this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        boolean z12 = false;
        if (!arrayRow.mIsSimpleDefinition) {
            arrayRow.updateFromSystem(this);
            if (arrayRow.isEmpty()) {
                return;
            }
            arrayRow.ensurePositiveConstant();
            if (arrayRow.chooseSubject(this)) {
                SolverVariable solverVariableCreateExtraVariable = createExtraVariable();
                arrayRow.mVariable = solverVariableCreateExtraVariable;
                int i11 = this.mNumRows;
                addRow(arrayRow);
                if (this.mNumRows == i11 + 1) {
                    this.mTempGoal.initFromRow(arrayRow);
                    optimize(this.mTempGoal, true);
                    if (solverVariableCreateExtraVariable.mDefinitionId == -1) {
                        if (arrayRow.mVariable == solverVariableCreateExtraVariable && (solverVariablePickPivot = arrayRow.pickPivot(solverVariableCreateExtraVariable)) != null) {
                            Metrics metrics2 = sMetrics;
                            if (metrics2 != null) {
                                metrics2.pivots++;
                            }
                            arrayRow.pivot(solverVariablePickPivot);
                        }
                        if (!arrayRow.mIsSimpleDefinition) {
                            arrayRow.mVariable.updateReferencesWithNewDefinition(this, arrayRow);
                        }
                        if (OPTIMIZED_ENGINE) {
                            this.mCache.mOptimizedArrayRowPool.release(arrayRow);
                        } else {
                            this.mCache.mArrayRowPool.release(arrayRow);
                        }
                        this.mNumRows--;
                    }
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            if (!arrayRow.hasKeyVariable()) {
                return;
            } else {
                z12 = z11;
            }
        }
        if (z12) {
            return;
        }
        addRow(arrayRow);
    }

    public void addSynonym(SolverVariable solverVariable, SolverVariable solverVariable2, int i11) {
        if (solverVariable.mDefinitionId != -1 || i11 != 0) {
            addEquality(solverVariable, solverVariable2, i11, 8);
            return;
        }
        if (solverVariable2.mIsSynonym) {
            solverVariable2 = this.mCache.mIndexedVariables[solverVariable2.mSynonym];
        }
        if (solverVariable.mIsSynonym) {
            SolverVariable solverVariable3 = this.mCache.mIndexedVariables[solverVariable.mSynonym];
        } else {
            solverVariable.setSynonym(this, solverVariable2, 0.0f);
        }
    }

    public SolverVariable createErrorVariable(int i11, String str) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.errors++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable solverVariableAcquireSolverVariable = acquireSolverVariable(SolverVariable.Type.ERROR, str);
        int i12 = this.mVariablesID + 1;
        this.mVariablesID = i12;
        this.mNumColumns++;
        solverVariableAcquireSolverVariable.f2179id = i12;
        solverVariableAcquireSolverVariable.strength = i11;
        this.mCache.mIndexedVariables[i12] = solverVariableAcquireSolverVariable;
        this.mGoal.addError(solverVariableAcquireSolverVariable);
        return solverVariableAcquireSolverVariable;
    }

    public SolverVariable createExtraVariable() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.extravariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable solverVariableAcquireSolverVariable = acquireSolverVariable(SolverVariable.Type.SLACK, null);
        int i11 = this.mVariablesID + 1;
        this.mVariablesID = i11;
        this.mNumColumns++;
        solverVariableAcquireSolverVariable.f2179id = i11;
        this.mCache.mIndexedVariables[i11] = solverVariableAcquireSolverVariable;
        return solverVariableAcquireSolverVariable;
    }

    public ArrayRow createRow() {
        ArrayRow arrayRowAcquire;
        if (OPTIMIZED_ENGINE) {
            arrayRowAcquire = this.mCache.mOptimizedArrayRowPool.acquire();
            if (arrayRowAcquire == null) {
                arrayRowAcquire = new ValuesRow(this.mCache);
                OPTIMIZED_ARRAY_ROW_CREATION++;
            } else {
                arrayRowAcquire.reset();
            }
        } else {
            arrayRowAcquire = this.mCache.mArrayRowPool.acquire();
            if (arrayRowAcquire == null) {
                arrayRowAcquire = new ArrayRow(this.mCache);
                ARRAY_ROW_CREATION++;
            } else {
                arrayRowAcquire.reset();
            }
        }
        SolverVariable.increaseErrorId();
        return arrayRowAcquire;
    }

    public SolverVariable createSlackVariable() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.slackvariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable solverVariableAcquireSolverVariable = acquireSolverVariable(SolverVariable.Type.SLACK, null);
        int i11 = this.mVariablesID + 1;
        this.mVariablesID = i11;
        this.mNumColumns++;
        solverVariableAcquireSolverVariable.f2179id = i11;
        this.mCache.mIndexedVariables[i11] = solverVariableAcquireSolverVariable;
        return solverVariableAcquireSolverVariable;
    }

    public void fillMetrics(Metrics metrics) {
        sMetrics = metrics;
    }

    public Cache getCache() {
        return this.mCache;
    }

    public Row getGoal() {
        return this.mGoal;
    }

    public int getNumEquations() {
        return this.mNumRows;
    }

    public int getNumVariables() {
        return this.mVariablesID;
    }

    public int getObjectVariableValue(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).getSolverVariable();
        if (solverVariable != null) {
            return (int) (solverVariable.computedValue + 0.5f);
        }
        return 0;
    }

    public ArrayRow getRow(int i11) {
        return this.mRows[i11];
    }

    public float getValueFor(String str) {
        SolverVariable variable = getVariable(str, SolverVariable.Type.UNRESTRICTED);
        if (variable == null) {
            return 0.0f;
        }
        return variable.computedValue;
    }

    public SolverVariable getVariable(String str, SolverVariable.Type type) {
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        SolverVariable solverVariable = this.mVariables.get(str);
        return solverVariable == null ? createVariable(str, type) : solverVariable;
    }

    public void minimize() throws Exception {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimize++;
        }
        if (this.mGoal.isEmpty()) {
            computeValues();
            return;
        }
        if (!this.graphOptimizer && !this.newgraphOptimizer) {
            minimizeGoal(this.mGoal);
            return;
        }
        Metrics metrics2 = sMetrics;
        if (metrics2 != null) {
            metrics2.graphOptimizer++;
        }
        for (int i11 = 0; i11 < this.mNumRows; i11++) {
            if (!this.mRows[i11].mIsSimpleDefinition) {
                minimizeGoal(this.mGoal);
                return;
            }
        }
        Metrics metrics3 = sMetrics;
        if (metrics3 != null) {
            metrics3.fullySolved++;
        }
        computeValues();
    }

    public void minimizeGoal(Row row) throws Exception {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimizeGoal++;
            metrics.maxVariables = Math.max(metrics.maxVariables, this.mNumColumns);
            Metrics metrics2 = sMetrics;
            metrics2.maxRows = Math.max(metrics2.maxRows, this.mNumRows);
        }
        enforceBFS(row);
        optimize(row, false);
        computeValues();
    }

    public void removeRow(ArrayRow arrayRow) {
        SolverVariable solverVariable;
        int i11;
        if (!arrayRow.mIsSimpleDefinition || (solverVariable = arrayRow.mVariable) == null) {
            return;
        }
        int i12 = solverVariable.mDefinitionId;
        if (i12 != -1) {
            while (true) {
                i11 = this.mNumRows;
                if (i12 >= i11 - 1) {
                    break;
                }
                ArrayRow[] arrayRowArr = this.mRows;
                int i13 = i12 + 1;
                ArrayRow arrayRow2 = arrayRowArr[i13];
                SolverVariable solverVariable2 = arrayRow2.mVariable;
                if (solverVariable2.mDefinitionId == i13) {
                    solverVariable2.mDefinitionId = i12;
                }
                arrayRowArr[i12] = arrayRow2;
                i12 = i13;
            }
            this.mNumRows = i11 - 1;
        }
        SolverVariable solverVariable3 = arrayRow.mVariable;
        if (!solverVariable3.isFinalValue) {
            solverVariable3.setFinalValue(this, arrayRow.mConstantValue);
        }
        if (OPTIMIZED_ENGINE) {
            this.mCache.mOptimizedArrayRowPool.release(arrayRow);
        } else {
            this.mCache.mArrayRowPool.release(arrayRow);
        }
    }

    public LinearSystem() {
        releaseRows();
        Cache cache = new Cache();
        this.mCache = cache;
        this.mGoal = new PriorityGoalRow(cache);
        if (OPTIMIZED_ENGINE) {
            this.mTempGoal = new ValuesRow(cache);
        } else {
            this.mTempGoal = new ArrayRow(cache);
        }
    }

    public static ArrayRow createRowDimensionPercent(LinearSystem linearSystem, SolverVariable solverVariable, SolverVariable solverVariable2, float f11) {
        return linearSystem.createRow().createRowDimensionPercent(solverVariable, solverVariable2, f11);
    }

    private void displayRows() {
        displaySolverVariables();
        String str = "";
        for (int i11 = 0; i11 < this.mNumRows; i11++) {
            str = (str + this.mRows[i11]) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        }
        System.out.println(str + this.mGoal + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
    }

    public void addGreaterBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, boolean z11) {
        ArrayRow arrayRowCreateRow = createRow();
        SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowGreaterThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i11);
        addConstraint(arrayRowCreateRow);
    }

    public void addGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, int i12) {
        ArrayRow arrayRowCreateRow = createRow();
        SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowGreaterThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i11);
        if (i12 != 8) {
            addSingleError(arrayRowCreateRow, (int) (arrayRowCreateRow.variables.get(solverVariableCreateSlackVariable) * (-1.0f)), i12);
        }
        addConstraint(arrayRowCreateRow);
    }

    public void addLowerBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, boolean z11) {
        ArrayRow arrayRowCreateRow = createRow();
        SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowLowerThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i11);
        addConstraint(arrayRowCreateRow);
    }

    public void addLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, int i12) {
        ArrayRow arrayRowCreateRow = createRow();
        SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowLowerThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i11);
        if (i12 != 8) {
            addSingleError(arrayRowCreateRow, (int) (arrayRowCreateRow.variables.get(solverVariableCreateSlackVariable) * (-1.0f)), i12);
        }
        addConstraint(arrayRowCreateRow);
    }

    public void addRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f11, int i11) {
        ArrayRow arrayRowCreateRow = createRow();
        arrayRowCreateRow.createRowDimensionRatio(solverVariable, solverVariable2, solverVariable3, solverVariable4, f11);
        if (i11 != 8) {
            arrayRowCreateRow.addError(this, i11);
        }
        addConstraint(arrayRowCreateRow);
    }

    public void displayReadableRows() {
        displaySolverVariables();
        String str = " num vars " + this.mVariablesID + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        for (int i11 = 0; i11 < this.mVariablesID + 1; i11++) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[i11];
            if (solverVariable != null && solverVariable.isFinalValue) {
                str = str + " $[" + i11 + "] => " + solverVariable + " = " + solverVariable.computedValue + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
            }
        }
        String str2 = str + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        for (int i12 = 0; i12 < this.mVariablesID + 1; i12++) {
            SolverVariable[] solverVariableArr = this.mCache.mIndexedVariables;
            SolverVariable solverVariable2 = solverVariableArr[i12];
            if (solverVariable2 != null && solverVariable2.mIsSynonym) {
                str2 = str2 + " ~[" + i12 + "] => " + solverVariable2 + " = " + solverVariableArr[solverVariable2.mSynonym] + " + " + solverVariable2.mSynonymDelta + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i13 = 0; i13 < this.mNumRows; i13++) {
            str3 = (str3 + this.mRows[i13].toReadableString()) + "\n #  ";
        }
        if (this.mGoal != null) {
            str3 = str3 + "Goal: " + this.mGoal + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        }
        System.out.println(str3);
    }

    public void displayVariablesReadableRows() {
        displaySolverVariables();
        String str = "";
        for (int i11 = 0; i11 < this.mNumRows; i11++) {
            if (this.mRows[i11].mVariable.mType == SolverVariable.Type.UNRESTRICTED) {
                str = (str + this.mRows[i11].toReadableString()) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
            }
        }
        System.out.println(str + this.mGoal + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
    }

    public void addEquality(SolverVariable solverVariable, int i11) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.mSimpleEquations++;
        }
        if (USE_BASIC_SYNONYMS && solverVariable.mDefinitionId == -1) {
            float f11 = i11;
            solverVariable.setFinalValue(this, f11);
            for (int i12 = 0; i12 < this.mVariablesID + 1; i12++) {
                SolverVariable solverVariable2 = this.mCache.mIndexedVariables[i12];
                if (solverVariable2 != null && solverVariable2.mIsSynonym && solverVariable2.mSynonym == solverVariable.f2179id) {
                    solverVariable2.setFinalValue(this, solverVariable2.mSynonymDelta + f11);
                }
            }
            return;
        }
        int i13 = solverVariable.mDefinitionId;
        if (i13 != -1) {
            ArrayRow arrayRow = this.mRows[i13];
            if (arrayRow.mIsSimpleDefinition) {
                arrayRow.mConstantValue = i11;
                return;
            }
            if (arrayRow.variables.getCurrentSize() == 0) {
                arrayRow.mIsSimpleDefinition = true;
                arrayRow.mConstantValue = i11;
                return;
            } else {
                ArrayRow arrayRowCreateRow = createRow();
                arrayRowCreateRow.createRowEquals(solverVariable, i11);
                addConstraint(arrayRowCreateRow);
                return;
            }
        }
        ArrayRow arrayRowCreateRow2 = createRow();
        arrayRowCreateRow2.createRowDefinition(solverVariable, i11);
        addConstraint(arrayRowCreateRow2);
    }
}
