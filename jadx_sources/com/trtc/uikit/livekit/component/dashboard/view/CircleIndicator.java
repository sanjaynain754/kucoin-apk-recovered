package com.trtc.uikit.livekit.component.dashboard.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.trtc.uikit.livekit.R$color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import uc0.C45152a;

/* JADX INFO: compiled from: CircleIndicator.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\tJ\b\u0010\u0018\u001a\u00020\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\tH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/dashboard/view/CircleIndicator;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "normalColor", "", "selectedColor", "circleRadius", "circleCount", "selected", "setCircleCount", "", "count", "setCircleRadius", "radius", "setSelected", "index", "setNormalColor", "color", "setSelectedColor", "update", "createCircleView", "Landroid/view/View;", "createRoundGradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CircleIndicator extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public int f77724b;

    /* JADX INFO: renamed from: c */
    public int f77725c;

    /* JADX INFO: renamed from: d */
    public int f77726d;

    /* JADX INFO: renamed from: e */
    public int f77727e;

    /* JADX INFO: renamed from: f */
    public int f77728f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public CircleIndicator(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CircleIndicator(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final View m79616a() {
        View view = new View(getContext());
        view.setBackground(m79617b(this.f77724b));
        return view;
    }

    /* JADX INFO: renamed from: b */
    public final GradientDrawable m79617b(int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i11);
        gradientDrawable.setCornerRadius(this.f77726d);
        return gradientDrawable;
    }

    public final void setCircleCount(int count) {
        this.f77727e = count;
    }

    public final void setCircleRadius(int radius) {
        this.f77726d = radius;
    }

    public final void setNormalColor(int color) {
        this.f77724b = color;
    }

    public final void setSelected(int index) {
        this.f77728f = index;
        m79618c();
    }

    public final void setSelectedColor(int color) {
        this.f77725c = color;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircleIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77728f = -1;
        setOrientation(0);
        setNormalColor(context.getResources().getColor(R$color.common_text_color_disabled));
        setSelectedColor(context.getResources().getColor(R$color.common_text_color_primary));
        setCircleCount(0);
        setSelected(-1);
    }

    /* JADX INFO: renamed from: c */
    public final void m79618c() {
        int i11;
        if (getChildCount() != this.f77727e) {
            removeAllViews();
            int i12 = this.f77727e;
            for (int i13 = 0; i13 < i12; i13++) {
                View viewM79616a = m79616a();
                int i14 = this.f77726d;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i14 * 2, i14 * 2);
                layoutParams.leftMargin = C45152a.m99799a(5.0f);
                layoutParams.rightMargin = C45152a.m99799a(5.0f);
                addView(viewM79616a, layoutParams);
            }
        }
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            Drawable background = childAt.getBackground();
            if (background instanceof GradientDrawable) {
                if (i15 == this.f77728f) {
                    i11 = this.f77725c;
                } else {
                    i11 = this.f77724b;
                }
                ((GradientDrawable) background).setColor(i11);
                childAt.setBackground(background);
            }
        }
    }
}
