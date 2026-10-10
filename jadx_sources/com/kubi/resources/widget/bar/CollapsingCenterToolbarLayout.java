package com.kubi.resources.widget.bar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.core.content.res.ResourcesCompat;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.internal.CollapsingTextHelper;
import com.kubi.sdk.res.R$dimen;
import com.kubi.sdk.res.R$font;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.C27034h;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: CollapsingCenterToolbarLayout.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\tH\u0003¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/resources/widget/bar/CollapsingCenterToolbarLayout;", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", ViewProps.ON_LAYOUT, "", "changed", "", "left", "", ViewProps.TOP, "right", ViewProps.BOTTOM, "recalculateCenterToolbar", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CollapsingCenterToolbarLayout extends CollapsingToolbarLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsingCenterToolbarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: a */
    public final void m54947a() {
        Field declaredField;
        try {
            try {
                declaredField = CollapsingToolbarLayout.class.getDeclaredField("collapsingTitleHelper");
            } catch (NoSuchFieldException unused) {
                declaredField = CollapsingToolbarLayout.class.getDeclaredField("collapsingTextHelper");
            }
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.google.android.material.internal.CollapsingTextHelper");
            CollapsingTextHelper collapsingTextHelper = (CollapsingTextHelper) obj;
            declaredField.setAccessible(false);
            Field declaredField2 = declaredField.getType().getDeclaredField("collapsedBounds");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(collapsingTextHelper);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.graphics.Rect");
            Rect rect = (Rect) obj2;
            declaredField2.setAccessible(false);
            Field declaredField3 = declaredField.getType().getDeclaredField("expandedBounds");
            declaredField3.setAccessible(true);
            Object obj3 = declaredField3.get(collapsingTextHelper);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type android.graphics.Rect");
            Rect rect2 = (Rect) obj3;
            declaredField3.setAccessible(false);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            collapsingTextHelper.setCollapsedTextSize(C27025c.m66568f(context, 18));
            Context context2 = getContext();
            int i11 = R$font.semi;
            collapsingTextHelper.setCollapsedTypeface(ResourcesCompat.getFont(context2, i11));
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            collapsingTextHelper.setExpandedTextSize(C27025c.m66568f(context3, 24));
            collapsingTextHelper.setExpandedTypeface(ResourcesCompat.getFont(getContext(), i11));
            collapsingTextHelper.setExpandedBounds(rect2.left, rect2.top, rect2.right, C27029c.m66601d(this, 75));
            int i12 = R$dimen.ui_title_bar_height;
            collapsingTextHelper.setCollapsedBounds(C27034h.m66634e(this, i12), rect.top, getRight() - C27034h.m66634e(this, i12), rect.bottom);
            collapsingTextHelper.recalculate();
        } catch (Throwable th2) {
            C44128b.m97263g("CollapsingCenterToolbarLayout", th2);
        }
    }

    @Override // com.google.android.material.appbar.CollapsingToolbarLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        m54947a();
    }
}
