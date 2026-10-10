package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.facebook.drawee.drawable.AbstractC5596p;
import com.facebook.drawee.drawable.InterfaceC5597q;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ScaleTypeStartInside.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lcom/facebook/react/views/image/ScaleTypeStartInside;", "Lcom/facebook/drawee/drawable/p;", "<init>", "()V", "Landroid/graphics/Matrix;", "outTransform", "Landroid/graphics/Rect;", "parentRect", "", "childWidth", "childHeight", "", "focusX", "focusY", "scaleX", "scaleY", "", "getTransformImpl", "(Landroid/graphics/Matrix;Landroid/graphics/Rect;IIFFFF)V", "", "toString", "()Ljava/lang/String;", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ScaleTypeStartInside extends AbstractC5596p {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final InterfaceC5597q INSTANCE = new ScaleTypeStartInside();

    /* JADX INFO: compiled from: ScaleTypeStartInside.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/facebook/react/views/image/ScaleTypeStartInside$Companion;", "", "<init>", "()V", "Lcom/facebook/drawee/drawable/q;", "INSTANCE", "Lcom/facebook/drawee/drawable/q;", "getINSTANCE", "()Lcom/facebook/drawee/drawable/q;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final InterfaceC5597q getINSTANCE() {
            return ScaleTypeStartInside.INSTANCE;
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC5596p
    public void getTransformImpl(@NotNull Matrix outTransform, @NotNull Rect parentRect, int childWidth, int childHeight, float focusX, float focusY, float scaleX, float scaleY) {
        Intrinsics.checkNotNullParameter(outTransform, "outTransform");
        Intrinsics.checkNotNullParameter(parentRect, "parentRect");
        float fCoerceAtMost = RangesKt.coerceAtMost(Math.min(scaleX, scaleY), 1.0f);
        float f11 = parentRect.left;
        float f12 = parentRect.top;
        outTransform.setScale(fCoerceAtMost, fCoerceAtMost);
        outTransform.postTranslate(Math.round(f11), Math.round(f12));
    }

    @NotNull
    public String toString() {
        return "start_inside";
    }
}
