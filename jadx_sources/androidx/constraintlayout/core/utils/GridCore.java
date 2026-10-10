package androidx.constraintlayout.core.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import com.tencent.bugly.proguard.C33844oi;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class GridCore extends VirtualLayout {
    private static final int DEFAULT_SIZE = 3;
    public static final int HORIZONTAL = 0;
    private static final int MAX_COLUMNS = 50;
    private static final int MAX_ROWS = 50;
    public static final int SPANS_RESPECT_WIDGET_ORDER = 2;
    public static final int SUB_GRID_BY_COL_ROW = 1;
    public static final int VERTICAL = 1;
    private ConstraintWidget[] mBoxWidgets;
    private String mColumnWeights;
    private int mColumns;
    private int mColumnsSet;
    private int[][] mConstraintMatrix;
    ConstraintWidgetContainer mContainer;
    private int mFlags;
    private float mHorizontalGaps;
    private int mOrientation;
    private boolean[][] mPositionMatrix;
    private String mRowWeights;
    private int mRows;
    private int mRowsSet;
    private String mSkips;
    private int[][] mSpanMatrix;
    private String mSpans;
    private float mVerticalGaps;
    private boolean mExtraSpaceHandled = false;
    private int mNextAvailableIndex = 0;
    Set<String> mSpanIds = new HashSet();
    private int mSpanIndex = 0;

    public GridCore() {
        updateActualRowsAndColumns();
        initMatrices();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    private void arrangeWidgets() {
        int[][] iArr;
        int i11;
        for (int i12 = 0; i12 < this.mWidgetsCount; i12++) {
            if (!this.mSpanIds.contains(this.mWidgets[i12].stringId)) {
                int nextPosition = getNextPosition();
                int rowByIndex = getRowByIndex(nextPosition);
                int colByIndex = getColByIndex(nextPosition);
                if (nextPosition == -1) {
                    return;
                }
                if (!isSpansRespectWidgetOrder() || (iArr = this.mSpanMatrix) == null || (i11 = this.mSpanIndex) >= iArr.length) {
                    connectWidget(this.mWidgets[i12], rowByIndex, colByIndex, 1, 1);
                } else {
                    int[] iArr2 = iArr[i11];
                    if (iArr2[0] == nextPosition) {
                        this.mPositionMatrix[rowByIndex][colByIndex] = true;
                        if (invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                            ConstraintWidget constraintWidget = this.mWidgets[i12];
                            int[] iArr3 = this.mSpanMatrix[this.mSpanIndex];
                            connectWidget(constraintWidget, rowByIndex, colByIndex, iArr3[1], iArr3[2]);
                            this.mSpanIndex++;
                        }
                    } else {
                        connectWidget(this.mWidgets[i12], rowByIndex, colByIndex, 1, 1);
                    }
                }
            }
        }
    }

    private void fillConstraintMatrix(boolean z11) {
        int[][] spans;
        int[][] spans2;
        if (z11) {
            for (int i11 = 0; i11 < this.mPositionMatrix.length; i11++) {
                int i12 = 0;
                while (true) {
                    boolean[][] zArr = this.mPositionMatrix;
                    if (i12 < zArr[0].length) {
                        zArr[i11][i12] = true;
                        i12++;
                    }
                }
            }
            for (int i13 = 0; i13 < this.mConstraintMatrix.length; i13++) {
                int i14 = 0;
                while (true) {
                    int[][] iArr = this.mConstraintMatrix;
                    if (i14 < iArr[0].length) {
                        iArr[i13][i14] = -1;
                        i14++;
                    }
                }
            }
        }
        this.mNextAvailableIndex = 0;
        String str = this.mSkips;
        if (str != null && !str.trim().isEmpty() && (spans2 = parseSpans(this.mSkips, false)) != null) {
            handleSkips(spans2);
        }
        String str2 = this.mSpans;
        if (str2 == null || str2.trim().isEmpty() || (spans = parseSpans(this.mSpans, true)) == null) {
            return;
        }
        handleSpans(spans);
    }

    private int getNextPosition() {
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11 = this.mNextAvailableIndex;
            if (i11 >= this.mRows * this.mColumns) {
                return -1;
            }
            int rowByIndex = getRowByIndex(i11);
            int colByIndex = getColByIndex(this.mNextAvailableIndex);
            boolean[] zArr = this.mPositionMatrix[rowByIndex];
            if (zArr[colByIndex]) {
                zArr[colByIndex] = false;
                z11 = true;
            }
            this.mNextAvailableIndex++;
        }
        return i11;
    }

    private void handleSkips(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!invalidatePositions(getRowByIndex(iArr2[0]), getColByIndex(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private boolean invalidatePositions(int i11, int i12, int i13, int i14) {
        for (int i15 = i11; i15 < i11 + i13; i15++) {
            for (int i16 = i12; i16 < i12 + i14; i16++) {
                boolean[][] zArr = this.mPositionMatrix;
                if (i15 < zArr.length && i16 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i15];
                    if (zArr2[i16]) {
                        zArr2[i16] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public void setHorizontalGaps(float f11) {
        if (f11 >= 0.0f && this.mHorizontalGaps != f11) {
            this.mHorizontalGaps = f11;
        }
    }

    public void setVerticalGaps(float f11) {
        if (f11 >= 0.0f && this.mVerticalGaps != f11) {
            this.mVerticalGaps = f11;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m2269a(String str, String str2) {
        return Integer.parseInt(str.split(C33844oi.f71346o)[0]) - Integer.parseInt(str2.split(C33844oi.f71346o)[0]);
    }

    private void clearHorizontalAttributes(ConstraintWidget constraintWidget) {
        constraintWidget.setHorizontalWeight(-1.0f);
        constraintWidget.mLeft.reset();
        constraintWidget.mRight.reset();
    }

    private void clearVerticalAttributes(ConstraintWidget constraintWidget) {
        constraintWidget.setVerticalWeight(-1.0f);
        constraintWidget.mTop.reset();
        constraintWidget.mBottom.reset();
        constraintWidget.mBaseline.reset();
    }

    private void connectWidget(ConstraintWidget constraintWidget, int i11, int i12, int i13, int i14) {
        constraintWidget.mLeft.connect(this.mBoxWidgets[i12].mLeft, 0);
        constraintWidget.mTop.connect(this.mBoxWidgets[i11].mTop, 0);
        constraintWidget.mRight.connect(this.mBoxWidgets[(i12 + i14) - 1].mRight, 0);
        constraintWidget.mBottom.connect(this.mBoxWidgets[(i11 + i13) - 1].mBottom, 0);
    }

    private void createBoxes() {
        int iMax = Math.max(this.mRows, this.mColumns);
        ConstraintWidget[] constraintWidgetArr = this.mBoxWidgets;
        int i11 = 0;
        if (constraintWidgetArr == null) {
            this.mBoxWidgets = new ConstraintWidget[iMax];
            while (true) {
                ConstraintWidget[] constraintWidgetArr2 = this.mBoxWidgets;
                if (i11 >= constraintWidgetArr2.length) {
                    return;
                }
                constraintWidgetArr2[i11] = makeNewWidget();
                i11++;
            }
        } else {
            if (iMax == constraintWidgetArr.length) {
                return;
            }
            ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[iMax];
            while (i11 < iMax) {
                ConstraintWidget[] constraintWidgetArr4 = this.mBoxWidgets;
                if (i11 < constraintWidgetArr4.length) {
                    constraintWidgetArr3[i11] = constraintWidgetArr4[i11];
                } else {
                    constraintWidgetArr3[i11] = makeNewWidget();
                }
                i11++;
            }
            while (true) {
                ConstraintWidget[] constraintWidgetArr5 = this.mBoxWidgets;
                if (iMax >= constraintWidgetArr5.length) {
                    this.mBoxWidgets = constraintWidgetArr3;
                    return;
                } else {
                    this.mContainer.remove(constraintWidgetArr5[iMax]);
                    iMax++;
                }
            }
        }
    }

    private int getColByIndex(int i11) {
        return this.mOrientation == 1 ? i11 / this.mRows : i11 % this.mColumns;
    }

    private int getRowByIndex(int i11) {
        return this.mOrientation == 1 ? i11 % this.mRows : i11 / this.mColumns;
    }

    private void initMatrices() {
        boolean[][] zArr;
        int[][] iArr = this.mConstraintMatrix;
        boolean z11 = false;
        if (iArr != null && iArr.length == this.mWidgetsCount && (zArr = this.mPositionMatrix) != null && zArr.length == this.mRows && zArr[0].length == this.mColumns) {
            z11 = true;
        }
        if (!z11) {
            initVariables();
        }
        fillConstraintMatrix(z11);
    }

    private void initVariables() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.mRows, this.mColumns);
        this.mPositionMatrix = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i11 = this.mWidgetsCount;
        if (i11 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11, 4);
            this.mConstraintMatrix = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    private boolean isSpansRespectWidgetOrder() {
        return (this.mFlags & 2) > 0;
    }

    private boolean isSubGridByColRow() {
        return (this.mFlags & 1) > 0;
    }

    private ConstraintWidget makeNewWidget() {
        ConstraintWidget constraintWidget = new ConstraintWidget();
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        constraintWidget.stringId = String.valueOf(constraintWidget.hashCode());
        return constraintWidget;
    }

    private int[][] parseSpans(String str, boolean z11) {
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new Comparator() { // from class: androidx.constraintlayout.core.utils.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return GridCore.m2269a((String) obj, (String) obj2);
                }
            });
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.mRows != 1 && this.mColumns != 1) {
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    String[] strArrSplit2 = strArrSplit[i11].trim().split(C33844oi.f71346o);
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i11][0] = Integer.parseInt(strArrSplit2[0]);
                    if (isSubGridByColRow()) {
                        iArr[i11][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i11][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i11][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i11][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < strArrSplit.length; i14++) {
                String[] strArrSplit4 = strArrSplit[i14].trim().split(C33844oi.f71346o);
                iArr[i14][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i14];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.mColumns == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i12 += iArr[i14][1];
                    if (z11) {
                        i12--;
                    }
                }
                if (this.mRows == 1) {
                    iArr[i14][2] = Integer.parseInt(strArrSplit4[1]);
                    i13 += iArr[i14][2];
                    if (z11) {
                        i13--;
                    }
                }
            }
            if (i12 != 0 && !this.mExtraSpaceHandled) {
                setRows(this.mRows + i12);
            }
            if (i13 != 0 && !this.mExtraSpaceHandled) {
                setColumns(this.mColumns + i13);
            }
            this.mExtraSpaceHandled = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private float[] parseWeights(int i11, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 < strArrSplit.length) {
                try {
                    fArr[i12] = Float.parseFloat(strArrSplit[i12]);
                } catch (Exception e11) {
                    System.err.println("Error parsing `" + strArrSplit[i12] + "`: " + e11.getMessage());
                    fArr[i12] = 1.0f;
                }
            } else {
                fArr[i12] = 1.0f;
            }
        }
        return fArr;
    }

    private void setBoxWidgetHorizontalChains() {
        int i11;
        int iMax = Math.max(this.mRows, this.mColumns);
        ConstraintWidget constraintWidget = this.mBoxWidgets[0];
        float[] weights = parseWeights(this.mColumns, this.mColumnWeights);
        if (this.mColumns == 1) {
            clearHorizontalAttributes(constraintWidget);
            constraintWidget.mLeft.connect(this.mLeft, 0);
            constraintWidget.mRight.connect(this.mRight, 0);
            return;
        }
        int i12 = 0;
        while (true) {
            i11 = this.mColumns;
            if (i12 >= i11) {
                break;
            }
            ConstraintWidget constraintWidget2 = this.mBoxWidgets[i12];
            clearHorizontalAttributes(constraintWidget2);
            if (weights != null) {
                constraintWidget2.setHorizontalWeight(weights[i12]);
            }
            if (i12 > 0) {
                constraintWidget2.mLeft.connect(this.mBoxWidgets[i12 - 1].mRight, 0);
            } else {
                constraintWidget2.mLeft.connect(this.mLeft, 0);
            }
            if (i12 < this.mColumns - 1) {
                constraintWidget2.mRight.connect(this.mBoxWidgets[i12 + 1].mLeft, 0);
            } else {
                constraintWidget2.mRight.connect(this.mRight, 0);
            }
            if (i12 > 0) {
                constraintWidget2.mLeft.mMargin = (int) this.mHorizontalGaps;
            }
            i12++;
        }
        while (i11 < iMax) {
            ConstraintWidget constraintWidget3 = this.mBoxWidgets[i11];
            clearHorizontalAttributes(constraintWidget3);
            constraintWidget3.mLeft.connect(this.mLeft, 0);
            constraintWidget3.mRight.connect(this.mRight, 0);
            i11++;
        }
    }

    private void setBoxWidgetVerticalChains() {
        int i11;
        int iMax = Math.max(this.mRows, this.mColumns);
        ConstraintWidget constraintWidget = this.mBoxWidgets[0];
        float[] weights = parseWeights(this.mRows, this.mRowWeights);
        if (this.mRows == 1) {
            clearVerticalAttributes(constraintWidget);
            constraintWidget.mTop.connect(this.mTop, 0);
            constraintWidget.mBottom.connect(this.mBottom, 0);
            return;
        }
        int i12 = 0;
        while (true) {
            i11 = this.mRows;
            if (i12 >= i11) {
                break;
            }
            ConstraintWidget constraintWidget2 = this.mBoxWidgets[i12];
            clearVerticalAttributes(constraintWidget2);
            if (weights != null) {
                constraintWidget2.setVerticalWeight(weights[i12]);
            }
            if (i12 > 0) {
                constraintWidget2.mTop.connect(this.mBoxWidgets[i12 - 1].mBottom, 0);
            } else {
                constraintWidget2.mTop.connect(this.mTop, 0);
            }
            if (i12 < this.mRows - 1) {
                constraintWidget2.mBottom.connect(this.mBoxWidgets[i12 + 1].mTop, 0);
            } else {
                constraintWidget2.mBottom.connect(this.mBottom, 0);
            }
            if (i12 > 0) {
                constraintWidget2.mTop.mMargin = (int) this.mVerticalGaps;
            }
            i12++;
        }
        while (i11 < iMax) {
            ConstraintWidget constraintWidget3 = this.mBoxWidgets[i11];
            clearVerticalAttributes(constraintWidget3);
            constraintWidget3.mTop.connect(this.mTop, 0);
            constraintWidget3.mBottom.connect(this.mBottom, 0);
            i11++;
        }
    }

    private void setupGrid(boolean z11) {
        int[][] spans;
        if (this.mRows < 1 || this.mColumns < 1) {
            return;
        }
        if (z11) {
            for (int i11 = 0; i11 < this.mPositionMatrix.length; i11++) {
                int i12 = 0;
                while (true) {
                    boolean[][] zArr = this.mPositionMatrix;
                    if (i12 < zArr[0].length) {
                        zArr[i11][i12] = true;
                        i12++;
                    }
                }
            }
            this.mSpanIds.clear();
        }
        this.mNextAvailableIndex = 0;
        String str = this.mSkips;
        if (str != null && !str.trim().isEmpty() && (spans = parseSpans(this.mSkips, false)) != null) {
            handleSkips(spans);
        }
        String str2 = this.mSpans;
        if (str2 != null && !str2.trim().isEmpty()) {
            this.mSpanMatrix = parseSpans(this.mSpans, true);
        }
        createBoxes();
        int[][] iArr = this.mSpanMatrix;
        if (iArr != null) {
            handleSpans(iArr);
        }
    }

    private void updateActualRowsAndColumns() {
        int i11;
        int i12 = this.mRowsSet;
        if (i12 != 0 && (i11 = this.mColumnsSet) != 0) {
            this.mRows = i12;
            this.mColumns = i11;
            return;
        }
        int i13 = this.mColumnsSet;
        if (i13 > 0) {
            this.mColumns = i13;
            this.mRows = ((this.mWidgetsCount + i13) - 1) / i13;
        } else if (i12 > 0) {
            this.mRows = i12;
            this.mColumns = ((this.mWidgetsCount + i12) - 1) / i12;
        } else {
            int iSqrt = (int) (Math.sqrt(this.mWidgetsCount) + 1.5d);
            this.mRows = iSqrt;
            this.mColumns = ((this.mWidgetsCount + iSqrt) - 1) / iSqrt;
        }
    }

    @Nullable
    public String getColumnWeights() {
        return this.mColumnWeights;
    }

    @Nullable
    public ConstraintWidgetContainer getContainer() {
        return this.mContainer;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public float getHorizontalGaps() {
        return this.mHorizontalGaps;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    @Nullable
    public String getRowWeights() {
        return this.mRowWeights;
    }

    public float getVerticalGaps() {
        return this.mVerticalGaps;
    }

    public void setColumnWeights(@NonNull String str) {
        String str2 = this.mColumnWeights;
        if (str2 == null || !str2.equals(str)) {
            this.mColumnWeights = str;
        }
    }

    public void setColumns(int i11) {
        if (i11 <= 50 && this.mColumnsSet != i11) {
            this.mColumnsSet = i11;
            updateActualRowsAndColumns();
            initVariables();
        }
    }

    public void setContainer(@NonNull ConstraintWidgetContainer constraintWidgetContainer) {
        this.mContainer = constraintWidgetContainer;
    }

    public void setFlags(int i11) {
        this.mFlags = i11;
    }

    public void setOrientation(int i11) {
        if ((i11 == 0 || i11 == 1) && this.mOrientation != i11) {
            this.mOrientation = i11;
        }
    }

    public void setRowWeights(@NonNull String str) {
        String str2 = this.mRowWeights;
        if (str2 == null || !str2.equals(str)) {
            this.mRowWeights = str;
        }
    }

    public void setRows(int i11) {
        if (i11 <= 50 && this.mRowsSet != i11) {
            this.mRowsSet = i11;
            updateActualRowsAndColumns();
            initVariables();
        }
    }

    public void setSkips(@NonNull String str) {
        String str2 = this.mSkips;
        if (str2 == null || !str2.equals(str)) {
            this.mExtraSpaceHandled = false;
            this.mSkips = str;
        }
    }

    public void setSpans(@NonNull CharSequence charSequence) {
        String str = this.mSpans;
        if (str == null || !str.equals(charSequence.toString())) {
            this.mExtraSpaceHandled = false;
            this.mSpans = charSequence.toString();
        }
    }

    private void addConstraints() {
        setBoxWidgetVerticalChains();
        setBoxWidgetHorizontalChains();
        arrangeWidgets();
    }

    private void handleSpans(int[][] iArr) {
        if (!isSpansRespectWidgetOrder()) {
            for (int i11 = 0; i11 < iArr.length; i11++) {
                int rowByIndex = getRowByIndex(iArr[i11][0]);
                int colByIndex = getColByIndex(iArr[i11][0]);
                int[] iArr2 = iArr[i11];
                if (!invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                    break;
                }
                ConstraintWidget constraintWidget = this.mWidgets[i11];
                int[] iArr3 = iArr[i11];
                connectWidget(constraintWidget, rowByIndex, colByIndex, iArr3[1], iArr3[2]);
                this.mSpanIds.add(this.mWidgets[i11].stringId);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(@Nullable LinearSystem linearSystem, boolean z11) {
        super.addToSolver(linearSystem, z11);
        addConstraints();
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i11, int i12, int i13, int i14) {
        super.measure(i11, i12, i13, i14);
        this.mContainer = (ConstraintWidgetContainer) getParent();
        setupGrid(false);
        this.mContainer.add(this.mBoxWidgets);
    }

    public GridCore(int i11, int i12) {
        this.mRowsSet = i11;
        this.mColumnsSet = i12;
        if (i11 > 50) {
            this.mRowsSet = 3;
        }
        if (i12 > 50) {
            this.mColumnsSet = 3;
        }
        updateActualRowsAndColumns();
        initMatrices();
    }
}
