package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.e0 */
/* JADX INFO: compiled from: TransformCallback.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/drawee/drawable/e0;", "", "Landroid/graphics/Matrix;", ViewProps.TRANSFORM, "", "getTransform", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/RectF;", "bounds", "getRootBounds", "(Landroid/graphics/RectF;)V", "drawee_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC5583e0 {
    void getRootBounds(@NotNull RectF bounds);

    void getTransform(@NotNull Matrix transform);
}
