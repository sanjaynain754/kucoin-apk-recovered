package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R7\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSCustomBehavior;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "expandedOffsetCallback", "Lkotlin/Function1;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lkotlin/ParameterName;", "name", "parent", "", "getExpandedOffsetCallback", "()Lkotlin/jvm/functions/Function1;", "setExpandedOffsetCallback", "(Lkotlin/jvm/functions/Function1;)V", "onLayoutChild", "", "child", ViewProps.LAYOUT_DIRECTION, "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSCustomBehavior extends BottomSheetBehavior<ViewGroup> {

    @Nullable
    private Function1<? super CoordinatorLayout, Integer> expandedOffsetCallback;

    @Nullable
    public final Function1<CoordinatorLayout, Integer> getExpandedOffsetCallback() {
        return this.expandedOffsetCallback;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NotNull CoordinatorLayout parent, @NotNull ViewGroup child, int layoutDirection) {
        Function1<? super CoordinatorLayout, Integer> function1 = this.expandedOffsetCallback;
        int iIntValue = function1 != null ? function1.invoke(parent).intValue() : 0;
        float height = ((parent.getHeight() - iIntValue) / 2.0f) / parent.getHeight();
        if (iIntValue > parent.getHeight()) {
            return super.onLayoutChild(parent, child, layoutDirection);
        }
        setExpandedOffset(iIntValue);
        setHalfExpandedRatio(height);
        return super.onLayoutChild(parent, child, layoutDirection);
    }

    public final void setExpandedOffsetCallback(@Nullable Function1<? super CoordinatorLayout, Integer> function1) {
        this.expandedOffsetCallback = function1;
    }

    public SNSCustomBehavior(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
