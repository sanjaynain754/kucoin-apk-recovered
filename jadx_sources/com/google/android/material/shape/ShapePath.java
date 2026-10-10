package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ShapePath {
    protected static final float ANGLE_LEFT = 180.0f;
    private static final float ANGLE_UP = 270.0f;
    private boolean containsIncompatibleShadowOp;

    @Deprecated
    public float currentShadowAngle;

    @Deprecated
    public float endShadowAngle;

    @Deprecated
    public float endX;

    @Deprecated
    public float endY;
    private final List<PathOperation> operations = new ArrayList();
    private final List<ShadowCompatOperation> shadowCompatOperations = new ArrayList();

    @Deprecated
    public float startX;

    @Deprecated
    public float startY;

    public static class ArcShadowOperation extends ShadowCompatOperation {
        private final PathArcOperation operation;

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i11, @NonNull Canvas canvas) {
            shadowRenderer.drawCornerShadow(canvas, matrix, new RectF(this.operation.getLeft(), this.operation.getTop(), this.operation.getRight(), this.operation.getBottom()), i11, this.operation.getStartAngle(), this.operation.getSweepAngle());
        }

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
            this.operation = pathArcOperation;
        }
    }

    /* JADX INFO: loaded from: classes45.dex */
    public static class InnerCornerShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation1;
        private final PathLineOperation operation2;
        private final float startX;
        private final float startY;

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i11, Canvas canvas) {
            int i12;
            float sweepAngle = getSweepAngle();
            if (sweepAngle > 0.0f) {
                return;
            }
            double dHypot = Math.hypot(this.operation1.f11902x - this.startX, this.operation1.f11903y - this.startY);
            double dHypot2 = Math.hypot(this.operation2.f11902x - this.operation1.f11902x, this.operation2.f11903y - this.operation1.f11903y);
            float fMin = (float) Math.min(i11, Math.min(dHypot, dHypot2));
            double d11 = fMin;
            double dTan = Math.tan(Math.toRadians((-sweepAngle) / 2.0f)) * d11;
            if (dHypot > dTan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (dHypot - dTan), 0.0f);
                this.renderMatrix.set(matrix);
                this.renderMatrix.preTranslate(this.startX, this.startY);
                this.renderMatrix.preRotate(getStartAngle());
                i12 = i11;
                shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF, i12);
            } else {
                i12 = i11;
            }
            float f11 = fMin * 2.0f;
            RectF rectF2 = new RectF(0.0f, 0.0f, f11, f11);
            this.renderMatrix.set(matrix);
            this.renderMatrix.preTranslate(this.operation1.f11902x, this.operation1.f11903y);
            this.renderMatrix.preRotate(getStartAngle());
            this.renderMatrix.preTranslate((float) ((-dTan) - d11), (-2.0f) * fMin);
            shadowRenderer.drawInnerCornerShadow(canvas, this.renderMatrix, rectF2, (int) fMin, 450.0f, sweepAngle, new float[]{(float) (d11 + dTan), f11});
            if (dHypot2 > dTan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (dHypot2 - dTan), 0.0f);
                this.renderMatrix.set(matrix);
                this.renderMatrix.preTranslate(this.operation1.f11902x, this.operation1.f11903y);
                this.renderMatrix.preRotate(getEndAngle());
                this.renderMatrix.preTranslate((float) dTan, 0.0f);
                shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF3, i12);
            }
        }

        public float getEndAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation2.f11903y - this.operation1.f11903y) / (this.operation2.f11902x - this.operation1.f11902x)));
        }

        public float getStartAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation1.f11903y - this.startY) / (this.operation1.f11902x - this.startX)));
        }

        public InnerCornerShadowOperation(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f11, float f12) {
            this.operation1 = pathLineOperation;
            this.operation2 = pathLineOperation2;
            this.startX = f11;
            this.startY = f12;
        }

        public float getSweepAngle() {
            float endAngle = ((getEndAngle() - getStartAngle()) + 360.0f) % 360.0f;
            if (endAngle <= 180.0f) {
                return endAngle;
            }
            return endAngle - 360.0f;
        }
    }

    public static class LineShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation;
        private final float startX;
        private final float startY;

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i11, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.operation.f11903y - this.startY, this.operation.f11902x - this.startX), 0.0f);
            this.renderMatrix.set(matrix);
            this.renderMatrix.preTranslate(this.startX, this.startY);
            this.renderMatrix.preRotate(getAngle());
            shadowRenderer.drawEdgeShadow(canvas, this.renderMatrix, rectF, i11);
        }

        public float getAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation.f11903y - this.startY) / (this.operation.f11902x - this.startX)));
        }

        public LineShadowOperation(PathLineOperation pathLineOperation, float f11, float f12) {
            this.operation = pathLineOperation;
            this.startX = f11;
            this.startY = f12;
        }
    }

    public static class PathArcOperation extends PathOperation {
        private static final RectF rectF = new RectF();

        @Deprecated
        public float bottom;

        @Deprecated
        public float left;

        @Deprecated
        public float right;

        @Deprecated
        public float startAngle;

        @Deprecated
        public float sweepAngle;

        @Deprecated
        public float top;

        /* JADX INFO: Access modifiers changed from: private */
        public float getBottom() {
            return this.bottom;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getLeft() {
            return this.left;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getRight() {
            return this.right;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getStartAngle() {
            return this.startAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getSweepAngle() {
            return this.sweepAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getTop() {
            return this.top;
        }

        private void setBottom(float f11) {
            this.bottom = f11;
        }

        private void setLeft(float f11) {
            this.left = f11;
        }

        private void setRight(float f11) {
            this.right = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartAngle(float f11) {
            this.startAngle = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSweepAngle(float f11) {
            this.sweepAngle = f11;
        }

        private void setTop(float f11) {
            this.top = f11;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF2 = rectF;
            rectF2.set(getLeft(), getTop(), getRight(), getBottom());
            path.arcTo(rectF2, getStartAngle(), getSweepAngle(), false);
            path.transform(matrix);
        }

        public PathArcOperation(float f11, float f12, float f13, float f14) {
            setLeft(f11);
            setTop(f12);
            setRight(f13);
            setBottom(f14);
        }
    }

    /* JADX INFO: loaded from: classes45.dex */
    public static class PathCubicOperation extends PathOperation {
        private float controlX1;
        private float controlX2;
        private float controlY1;
        private float controlY2;
        private float endX;
        private float endY;

        private float getControlX1() {
            return this.controlX1;
        }

        private float getControlX2() {
            return this.controlX2;
        }

        private float getControlY1() {
            return this.controlY1;
        }

        private float getControlY2() {
            return this.controlY1;
        }

        private float getEndX() {
            return this.endX;
        }

        private float getEndY() {
            return this.endY;
        }

        private void setControlX1(float f11) {
            this.controlX1 = f11;
        }

        private void setControlX2(float f11) {
            this.controlX2 = f11;
        }

        private void setControlY1(float f11) {
            this.controlY1 = f11;
        }

        private void setControlY2(float f11) {
            this.controlY2 = f11;
        }

        private void setEndX(float f11) {
            this.endX = f11;
        }

        private void setEndY(float f11) {
            this.endY = f11;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.controlX1, this.controlY1, this.controlX2, this.controlY2, this.endX, this.endY);
            path.transform(matrix);
        }

        public PathCubicOperation(float f11, float f12, float f13, float f14, float f15, float f16) {
            setControlX1(f11);
            setControlY1(f12);
            setControlX2(f13);
            setControlY2(f14);
            setEndX(f15);
            setEndY(f16);
        }
    }

    public static class PathLineOperation extends PathOperation {

        /* JADX INFO: renamed from: x */
        private float f11902x;

        /* JADX INFO: renamed from: y */
        private float f11903y;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f11902x, this.f11903y);
            path.transform(matrix);
        }
    }

    public static abstract class PathOperation {
        protected final Matrix matrix = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    /* JADX INFO: loaded from: classes45.dex */
    public static class PathQuadOperation extends PathOperation {

        @Deprecated
        public float controlX;

        @Deprecated
        public float controlY;

        @Deprecated
        public float endX;

        @Deprecated
        public float endY;

        private float getControlX() {
            return this.controlX;
        }

        private float getControlY() {
            return this.controlY;
        }

        private float getEndX() {
            return this.endX;
        }

        private float getEndY() {
            return this.endY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlX(float f11) {
            this.controlX = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlY(float f11) {
            this.controlY = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndX(float f11) {
            this.endX = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndY(float f11) {
            this.endY = f11;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(getControlX(), getControlY(), getEndX(), getEndY());
            path.transform(matrix);
        }
    }

    public static abstract class ShadowCompatOperation {
        static final Matrix IDENTITY_MATRIX = new Matrix();
        final Matrix renderMatrix = new Matrix();

        public abstract void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i11, Canvas canvas);

        public final void draw(ShadowRenderer shadowRenderer, int i11, Canvas canvas) {
            draw(IDENTITY_MATRIX, shadowRenderer, i11, canvas);
        }
    }

    public ShapePath() {
        reset(0.0f, 0.0f);
    }

    public void lineTo(float f11, float f12) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f11902x = f11;
        pathLineOperation.f11903y = f12;
        this.operations.add(pathLineOperation);
        LineShadowOperation lineShadowOperation = new LineShadowOperation(pathLineOperation, getEndX(), getEndY());
        addShadowCompatOperation(lineShadowOperation, lineShadowOperation.getAngle() + 270.0f, lineShadowOperation.getAngle() + 270.0f);
        setEndX(f11);
        setEndY(f12);
    }

    public void reset(float f11, float f12) {
        reset(f11, f12, 270.0f, 0.0f);
    }

    private float getCurrentShadowAngle() {
        return this.currentShadowAngle;
    }

    private float getEndShadowAngle() {
        return this.endShadowAngle;
    }

    private void setCurrentShadowAngle(float f11) {
        this.currentShadowAngle = f11;
    }

    private void setEndShadowAngle(float f11) {
        this.endShadowAngle = f11;
    }

    private void setEndX(float f11) {
        this.endX = f11;
    }

    private void setEndY(float f11) {
        this.endY = f11;
    }

    private void setStartX(float f11) {
        this.startX = f11;
    }

    private void setStartY(float f11) {
        this.startY = f11;
    }

    public void addArc(float f11, float f12, float f13, float f14, float f15, float f16) {
        PathArcOperation pathArcOperation = new PathArcOperation(f11, f12, f13, f14);
        pathArcOperation.setStartAngle(f15);
        pathArcOperation.setSweepAngle(f16);
        this.operations.add(pathArcOperation);
        ArcShadowOperation arcShadowOperation = new ArcShadowOperation(pathArcOperation);
        float f17 = f15 + f16;
        boolean z11 = f16 < 0.0f;
        if (z11) {
            f15 = (f15 + 180.0f) % 360.0f;
        }
        addShadowCompatOperation(arcShadowOperation, f15, z11 ? (180.0f + f17) % 360.0f : f17);
        double d11 = f17;
        setEndX(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.cos(Math.toRadians(d11)))));
        setEndY(((f12 + f14) * 0.5f) + (((f14 - f12) / 2.0f) * ((float) Math.sin(Math.toRadians(d11)))));
    }

    public void applyToPath(Matrix matrix, Path path) {
        int size = this.operations.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.operations.get(i11).applyToPath(matrix, path);
        }
    }

    public boolean containsIncompatibleShadowOp() {
        return this.containsIncompatibleShadowOp;
    }

    public void cubicToPoint(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.operations.add(new PathCubicOperation(f11, f12, f13, f14, f15, f16));
        this.containsIncompatibleShadowOp = true;
        setEndX(f15);
        setEndY(f16);
    }

    public float getEndX() {
        return this.endX;
    }

    public float getEndY() {
        return this.endY;
    }

    public float getStartX() {
        return this.startX;
    }

    public float getStartY() {
        return this.startY;
    }

    public void quadToPoint(float f11, float f12, float f13, float f14) {
        PathQuadOperation pathQuadOperation = new PathQuadOperation();
        pathQuadOperation.setControlX(f11);
        pathQuadOperation.setControlY(f12);
        pathQuadOperation.setEndX(f13);
        pathQuadOperation.setEndY(f14);
        this.operations.add(pathQuadOperation);
        this.containsIncompatibleShadowOp = true;
        setEndX(f13);
        setEndY(f14);
    }

    public void reset(float f11, float f12, float f13, float f14) {
        setStartX(f11);
        setStartY(f12);
        setEndX(f11);
        setEndY(f12);
        setCurrentShadowAngle(f13);
        setEndShadowAngle((f13 + f14) % 360.0f);
        this.operations.clear();
        this.shadowCompatOperations.clear();
        this.containsIncompatibleShadowOp = false;
    }

    private void addConnectingShadowIfNecessary(float f11) {
        if (getCurrentShadowAngle() != f11) {
            float currentShadowAngle = ((f11 - getCurrentShadowAngle()) + 360.0f) % 360.0f;
            if (currentShadowAngle > 180.0f) {
                return;
            }
            PathArcOperation pathArcOperation = new PathArcOperation(getEndX(), getEndY(), getEndX(), getEndY());
            pathArcOperation.setStartAngle(getCurrentShadowAngle());
            pathArcOperation.setSweepAngle(currentShadowAngle);
            this.shadowCompatOperations.add(new ArcShadowOperation(pathArcOperation));
            setCurrentShadowAngle(f11);
        }
    }

    private void addShadowCompatOperation(ShadowCompatOperation shadowCompatOperation, float f11, float f12) {
        addConnectingShadowIfNecessary(f11);
        this.shadowCompatOperations.add(shadowCompatOperation);
        setCurrentShadowAngle(f12);
    }

    @NonNull
    public ShadowCompatOperation createShadowCompatOperation(Matrix matrix) {
        addConnectingShadowIfNecessary(getEndShadowAngle());
        final Matrix matrix2 = new Matrix(matrix);
        final ArrayList arrayList = new ArrayList(this.shadowCompatOperations);
        return new ShadowCompatOperation() { // from class: com.google.android.material.shape.ShapePath.1
            @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
            public void draw(Matrix matrix3, ShadowRenderer shadowRenderer, int i11, Canvas canvas) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ShadowCompatOperation) it.next()).draw(matrix2, shadowRenderer, i11, canvas);
                }
            }
        };
    }

    public ShapePath(float f11, float f12) {
        reset(f11, f12);
    }

    public void lineTo(float f11, float f12, float f13, float f14) {
        if ((Math.abs(f11 - getEndX()) < 0.001f && Math.abs(f12 - getEndY()) < 0.001f) || (Math.abs(f11 - f13) < 0.001f && Math.abs(f12 - f14) < 0.001f)) {
            lineTo(f13, f14);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f11902x = f11;
        pathLineOperation.f11903y = f12;
        this.operations.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.f11902x = f13;
        pathLineOperation2.f11903y = f14;
        this.operations.add(pathLineOperation2);
        InnerCornerShadowOperation innerCornerShadowOperation = new InnerCornerShadowOperation(pathLineOperation, pathLineOperation2, getEndX(), getEndY());
        if (innerCornerShadowOperation.getSweepAngle() > 0.0f) {
            lineTo(f11, f12);
            lineTo(f13, f14);
        } else {
            addShadowCompatOperation(innerCornerShadowOperation, innerCornerShadowOperation.getStartAngle() + 270.0f, innerCornerShadowOperation.getEndAngle() + 270.0f);
            setEndX(f13);
            setEndY(f14);
        }
    }
}
