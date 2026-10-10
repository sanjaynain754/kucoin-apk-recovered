package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;

/* JADX INFO: loaded from: classes.dex */
public class ShapeAppearancePathProvider {
    protected static final int BOTTOM_LEFT_CORNER_INDEX = 2;
    protected static final int BOTTOM_RIGHT_CORNER_INDEX = 1;
    protected static final int TOP_LEFT_CORNER_INDEX = 3;
    protected static final int TOP_RIGHT_CORNER_INDEX = 0;
    private final ShapePath[] cornerPaths = new ShapePath[4];
    private final Matrix[] cornerTransforms = new Matrix[4];
    private final Matrix[] edgeTransforms = new Matrix[4];
    private final PointF pointF = new PointF();
    private final Path overlappedEdgePath = new Path();
    private final Path boundsPath = new Path();
    private final ShapePath shapePath = new ShapePath();
    private final float[] scratch = new float[2];
    private final float[] scratch2 = new float[2];
    private final Path edgePath = new Path();
    private final Path cornerPath = new Path();
    private boolean edgeIntersectionCheckEnabled = true;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i11);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i11);
    }

    private void getCoordinatesOfCorner(int i11, @NonNull RectF rectF, @NonNull PointF pointF) {
        if (i11 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i11 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i11 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private CornerTreatment getCornerTreatmentForIndex(int i11, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (i11 == 1) {
            return shapeAppearanceModel.getBottomRightCorner();
        }
        if (i11 != 2) {
            return i11 != 3 ? shapeAppearanceModel.getTopRightCorner() : shapeAppearanceModel.getTopLeftCorner();
        }
        return shapeAppearanceModel.getBottomLeftCorner();
    }

    private EdgeTreatment getEdgeTreatmentForIndex(int i11, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (i11 == 1) {
            return shapeAppearanceModel.getBottomEdge();
        }
        if (i11 != 2) {
            return i11 != 3 ? shapeAppearanceModel.getRightEdge() : shapeAppearanceModel.getTopEdge();
        }
        return shapeAppearanceModel.getLeftEdge();
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f11, RectF rectF, @NonNull Path path) {
        calculatePath(shapeAppearanceModel, f11, rectF, null, path);
    }

    @NonNull
    public CornerSize getCornerSizeForIndex(int i11, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (i11 == 1) {
            return shapeAppearanceModel.getBottomRightCornerSize();
        }
        if (i11 != 2) {
            return i11 != 3 ? shapeAppearanceModel.getTopRightCornerSize() : shapeAppearanceModel.getTopLeftCornerSize();
        }
        return shapeAppearanceModel.getBottomLeftCornerSize();
    }

    public static class Lazy {
        static final ShapeAppearancePathProvider INSTANCE = new ShapeAppearancePathProvider();

        private Lazy() {
        }
    }

    public static final class ShapeAppearancePathSpec {

        @NonNull
        public final RectF bounds;
        public final float interpolation;

        @NonNull
        public final Path path;

        @Nullable
        public final PathListener pathListener;

        @NonNull
        public final ShapeAppearanceModel shapeAppearanceModel;

        public ShapeAppearancePathSpec(@NonNull ShapeAppearanceModel shapeAppearanceModel, float f11, RectF rectF, @Nullable PathListener pathListener, Path path) {
            this.pathListener = pathListener;
            this.shapeAppearanceModel = shapeAppearanceModel;
            this.interpolation = f11;
            this.bounds = rectF;
            this.path = path;
        }
    }

    private float angleOfEdge(int i11) {
        return ((i11 + 1) % 4) * 90;
    }

    private void appendCornerPath(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i11) {
        this.scratch[0] = this.cornerPaths[i11].getStartX();
        this.scratch[1] = this.cornerPaths[i11].getStartY();
        this.cornerTransforms[i11].mapPoints(this.scratch);
        if (i11 == 0) {
            Path path = shapeAppearancePathSpec.path;
            float[] fArr = this.scratch;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = shapeAppearancePathSpec.path;
            float[] fArr2 = this.scratch;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.cornerPaths[i11].applyToPath(this.cornerTransforms[i11], shapeAppearancePathSpec.path);
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onCornerPathCreated(this.cornerPaths[i11], this.cornerTransforms[i11], i11);
        }
    }

    private void appendEdgePath(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i11) {
        int i12 = (i11 + 1) % 4;
        this.scratch[0] = this.cornerPaths[i11].getEndX();
        this.scratch[1] = this.cornerPaths[i11].getEndY();
        this.cornerTransforms[i11].mapPoints(this.scratch);
        this.scratch2[0] = this.cornerPaths[i12].getStartX();
        this.scratch2[1] = this.cornerPaths[i12].getStartY();
        this.cornerTransforms[i12].mapPoints(this.scratch2);
        float[] fArr = this.scratch;
        float f11 = fArr[0];
        float[] fArr2 = this.scratch2;
        float fMax = Math.max(((float) Math.hypot(f11 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float edgeCenterForIndex = getEdgeCenterForIndex(shapeAppearancePathSpec.bounds, i11);
        this.shapePath.reset(0.0f, 0.0f);
        EdgeTreatment edgeTreatmentForIndex = getEdgeTreatmentForIndex(i11, shapeAppearancePathSpec.shapeAppearanceModel);
        edgeTreatmentForIndex.getEdgePath(fMax, edgeCenterForIndex, shapeAppearancePathSpec.interpolation, this.shapePath);
        this.edgePath.reset();
        this.shapePath.applyToPath(this.edgeTransforms[i11], this.edgePath);
        if (this.edgeIntersectionCheckEnabled && (edgeTreatmentForIndex.forceIntersection() || pathOverlapsCorner(this.edgePath, i11) || pathOverlapsCorner(this.edgePath, i12))) {
            Path path = this.edgePath;
            path.op(path, this.boundsPath, Path.Op.DIFFERENCE);
            this.scratch[0] = this.shapePath.getStartX();
            this.scratch[1] = this.shapePath.getStartY();
            this.edgeTransforms[i11].mapPoints(this.scratch);
            Path path2 = this.overlappedEdgePath;
            float[] fArr3 = this.scratch;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.shapePath.applyToPath(this.edgeTransforms[i11], this.overlappedEdgePath);
        } else {
            this.shapePath.applyToPath(this.edgeTransforms[i11], shapeAppearancePathSpec.path);
        }
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onEdgePathCreated(this.shapePath, this.edgeTransforms[i11], i11);
        }
    }

    private float getEdgeCenterForIndex(@NonNull RectF rectF, int i11) {
        float[] fArr = this.scratch;
        ShapePath shapePath = this.cornerPaths[i11];
        fArr[0] = shapePath.endX;
        fArr[1] = shapePath.endY;
        this.cornerTransforms[i11].mapPoints(fArr);
        return (i11 == 1 || i11 == 3) ? Math.abs(rectF.centerX() - this.scratch[0]) : Math.abs(rectF.centerY() - this.scratch[1]);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @UiThread
    public static ShapeAppearancePathProvider getInstance() {
        return Lazy.INSTANCE;
    }

    private boolean pathOverlapsCorner(Path path, int i11) {
        this.cornerPath.reset();
        this.cornerPaths[i11].applyToPath(this.cornerTransforms[i11], this.cornerPath);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.cornerPath.computeBounds(rectF, true);
        path.op(this.cornerPath, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void setCornerPathAndTransform(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i11, @Nullable float[] fArr) {
        getCornerTreatmentForIndex(i11, shapeAppearancePathSpec.shapeAppearanceModel).getCornerPath(this.cornerPaths[i11], 90.0f, shapeAppearancePathSpec.interpolation, shapeAppearancePathSpec.bounds, fArr == null ? getCornerSizeForIndex(i11, shapeAppearancePathSpec.shapeAppearanceModel) : new ClampedCornerSize(fArr[i11]));
        float fAngleOfEdge = angleOfEdge(i11);
        this.cornerTransforms[i11].reset();
        getCoordinatesOfCorner(i11, shapeAppearancePathSpec.bounds, this.pointF);
        Matrix matrix = this.cornerTransforms[i11];
        PointF pointF = this.pointF;
        matrix.setTranslate(pointF.x, pointF.y);
        this.cornerTransforms[i11].preRotate(fAngleOfEdge);
    }

    private void setEdgePathAndTransform(int i11) {
        this.scratch[0] = this.cornerPaths[i11].getEndX();
        this.scratch[1] = this.cornerPaths[i11].getEndY();
        this.cornerTransforms[i11].mapPoints(this.scratch);
        float fAngleOfEdge = angleOfEdge(i11);
        this.edgeTransforms[i11].reset();
        Matrix matrix = this.edgeTransforms[i11];
        float[] fArr = this.scratch;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.edgeTransforms[i11].preRotate(fAngleOfEdge);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f11, RectF rectF, PathListener pathListener, @NonNull Path path) {
        calculatePath(shapeAppearanceModel, null, f11, rectF, pathListener, path);
    }

    public void setEdgeIntersectionCheckEnable(boolean z11) {
        this.edgeIntersectionCheckEnabled = z11;
    }

    public ShapeAppearancePathProvider() {
        for (int i11 = 0; i11 < 4; i11++) {
            this.cornerPaths[i11] = new ShapePath();
            this.cornerTransforms[i11] = new Matrix();
            this.edgeTransforms[i11] = new Matrix();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void calculatePath(@NonNull ShapeAppearanceModel shapeAppearanceModel, @Nullable float[] fArr, float f11, RectF rectF, PathListener pathListener, @NonNull Path path) {
        path.rewind();
        this.overlappedEdgePath.rewind();
        this.boundsPath.rewind();
        this.boundsPath.addRect(rectF, Path.Direction.CW);
        ShapeAppearancePathSpec shapeAppearancePathSpec = new ShapeAppearancePathSpec(shapeAppearanceModel, f11, rectF, pathListener, path);
        for (int i11 = 0; i11 < 4; i11++) {
            setCornerPathAndTransform(shapeAppearancePathSpec, i11, fArr);
            setEdgePathAndTransform(i11);
        }
        for (int i12 = 0; i12 < 4; i12++) {
            appendCornerPath(shapeAppearancePathSpec, i12);
            appendEdgePath(shapeAppearancePathSpec, i12);
        }
        path.close();
        this.overlappedEdgePath.close();
        if (this.overlappedEdgePath.isEmpty()) {
            return;
        }
        path.op(this.overlappedEdgePath, Path.Op.UNION);
    }
}
