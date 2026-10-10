package com.jumio.core.data.document;

import android.graphics.PointF;
import android.graphics.RectF;
import com.jumio.commons.camera.Size;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0005\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0002\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"MIN_VALID_WIDTH", "", "MIN_VALID_HEIGHT", "distanceTo", "", "Landroid/graphics/PointF;", "other", "copy", "isAtLeast", "", "Lcom/jumio/commons/camera/Size;", "toSize", "Landroid/graphics/RectF;", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CornerPointsKt {
    public static final Size access$toSize(RectF rectF) {
        return new Size((int) rectF.width(), (int) rectF.height());
    }

    @NotNull
    public static final PointF copy(@NotNull PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        return new PointF(pointF.x, pointF.y);
    }

    public static final float distanceTo(@NotNull PointF pointF, @NotNull PointF other) {
        Intrinsics.checkNotNullParameter(pointF, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        double d11 = 2;
        return (float) Math.sqrt(((float) Math.pow(other.x - pointF.x, d11)) + ((float) Math.pow(other.y - pointF.y, d11)));
    }

    public static final boolean access$isAtLeast(Size size, Size size2) {
        if (size.getWidth() >= size2.getWidth() && size.getHeight() >= size2.getHeight()) {
            return true;
        }
        return false;
    }
}
