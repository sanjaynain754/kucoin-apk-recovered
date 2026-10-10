package com.jumio.commons.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J/\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Lcom/jumio/commons/utils/DrawingUtil;", "", "<init>", "()V", "createRectWithRoundedCornersAsPath", "Landroid/graphics/Path;", "bounds", "Landroid/graphics/Rect;", "radiusTL", "", "radiusTR", "radiusBR", "radiusBL", "createCroppedEdgePathListFromRect", "", "horizontalCrop", "", "drawPath", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "points", "", "Landroid/graphics/PointF;", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;[Landroid/graphics/PointF;)V", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DrawingUtil {

    @NotNull
    public static final DrawingUtil INSTANCE = new DrawingUtil();

    @NotNull
    public final List<Path> createCroppedEdgePathListFromRect(@NotNull Rect bounds, boolean horizontalCrop) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int i11 = bounds.left;
        int i12 = bounds.right;
        int i13 = bounds.top;
        int i14 = bounds.bottom;
        Path path = new Path();
        Path path2 = new Path();
        if (horizontalCrop) {
            float f11 = i12;
            float f12 = i13;
            path.moveTo(f11, f12);
            float f13 = i14;
            path.lineTo(f11, f13);
            float f14 = i11;
            path2.moveTo(f14, f13);
            path2.lineTo(f14, f12);
        } else {
            float f15 = i11;
            float f16 = i13;
            path.moveTo(f15, f16);
            float f17 = i12;
            path.lineTo(f17, f16);
            float f18 = i14;
            path2.moveTo(f17, f18);
            path2.lineTo(f15, f18);
        }
        return CollectionsKt.listOf((Object[]) new Path[]{path, path2});
    }

    @NotNull
    public final Path createRectWithRoundedCornersAsPath(@NotNull Rect bounds, int radiusTL, int radiusTR, int radiusBR, int radiusBL) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int i11 = bounds.left;
        int i12 = bounds.right;
        int i13 = bounds.top;
        int i14 = bounds.bottom;
        Path path = new Path();
        path.moveTo(radiusTL <= 0 ? i11 : i11 + radiusTL, i13);
        if (radiusTR <= 0) {
            path.lineTo(i12, i13);
        } else {
            float f11 = i13;
            path.lineTo(i12 - radiusTL, f11);
            float f12 = i12;
            path.quadTo(f12, f11, f12, radiusTR + i13);
        }
        if (radiusBR <= 0) {
            path.lineTo(i12, i14);
        } else {
            float f13 = i12;
            path.lineTo(f13, i14 - radiusBR);
            float f14 = i14;
            path.quadTo(f13, f14, i12 - radiusBR, f14);
        }
        if (radiusBL <= 0) {
            path.lineTo(i11, i14);
        } else {
            float f15 = i14;
            path.lineTo(i11 + radiusBL, f15);
            float f16 = i11;
            path.quadTo(f16, f15, f16, i14 - radiusBL);
        }
        if (radiusTL <= 0) {
            path.lineTo(i11, i13);
        } else {
            float f17 = i11;
            path.lineTo(f17, i13 + radiusTL);
            float f18 = i13;
            path.quadTo(f17, f18, i11 + radiusTL, f18);
        }
        path.close();
        return path;
    }

    public final void drawPath(@NotNull Canvas canvas, @NotNull Paint paint, @NotNull PointF... points) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(points, "points");
        Path path = new Path();
        int length = points.length;
        for (int i11 = 1; i11 < length; i11++) {
            int i12 = i11 - 1;
            if (Math.abs(points[i12].x - points[i11].x) < Math.abs(points[i12].y - points[i11].y)) {
                PointF pointF = points[i12];
                float f11 = pointF.y;
                if (f11 > points[i11].y) {
                    float f12 = 2;
                    path.moveTo(pointF.x, (paint.getStrokeWidth() / f12) + f11);
                    PointF pointF2 = points[i11];
                    path.lineTo(pointF2.x, pointF2.y - (paint.getStrokeWidth() / f12));
                } else {
                    float f13 = 2;
                    path.moveTo(pointF.x, f11 - (paint.getStrokeWidth() / f13));
                    PointF pointF3 = points[i11];
                    path.lineTo(pointF3.x, (paint.getStrokeWidth() / f13) + pointF3.y);
                }
            } else {
                float f14 = points[i12].x;
                if (f14 > points[i11].x) {
                    float f15 = 2;
                    path.moveTo((paint.getStrokeWidth() / f15) + f14, points[i12].y);
                    path.lineTo(points[i11].x - (paint.getStrokeWidth() / f15), points[i11].y);
                } else {
                    float f16 = 2;
                    path.moveTo(f14 - (paint.getStrokeWidth() / f16), points[i12].y);
                    path.lineTo((paint.getStrokeWidth() / f16) + points[i11].x, points[i11].y);
                }
            }
        }
        canvas.drawPath(path, paint);
    }
}
