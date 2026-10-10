package com.revolut.revolutpay.ui_kit.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.revolutpay.R$id;
import com.revolut.revolutpay.R$layout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import wa0.C45780a;
import wa0.C45781b;
import wa0.C45783d;
import xa0.InterfaceC46115a;
import xa0.InterfaceC46117c;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.widget.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C27599a extends ConstraintLayout {

    /* JADX INFO: renamed from: n */
    @NotNull
    public final AppCompatTextView f56407n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final AppCompatTextView f56408o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final AppCompatImageView f56409p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final AppCompatImageView f56410q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public C27599a(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C27599a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_row_widget, this);
        View viewFindViewById = findViewById(R$id.internal_row_widget_title_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.internal_row_widget_title_text)");
        this.f56407n = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.internal_row_widget_subtitle_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.intern…row_widget_subtitle_text)");
        this.f56408o = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.internal_row_widget_main_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.internal_row_widget_main_image)");
        this.f56409p = (AppCompatImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.internal_row_widget_badge_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.internal_row_widget_badge_image)");
        this.f56410q = (AppCompatImageView) viewFindViewById4;
        m68549a();
    }

    /* JADX INFO: renamed from: a */
    private final void m68549a() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
    }

    public final void setBadgeImage$revolut_pay_sdk_2_0_release(@Nullable InterfaceC46117c interfaceC46117c) {
        C45781b.m101106b(this.f56410q, interfaceC46117c);
    }

    public final void setImageSize$revolut_pay_sdk_2_0_release(int i11) {
        AppCompatImageView appCompatImageView = this.f56409p;
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int iM101101a = C45780a.m101101a(context, i11);
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = iM101101a;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = iM101101a;
        appCompatImageView.setLayoutParams(layoutParams2);
    }

    public final void setMainImage$revolut_pay_sdk_2_0_release(@NotNull InterfaceC46117c image) {
        Intrinsics.checkNotNullParameter(image, "image");
        C45781b.m101105a(this.f56409p, image);
    }

    public final void setSubtitle$revolut_pay_sdk_2_0_release(@Nullable InterfaceC46115a interfaceC46115a) {
        C45783d.m101109b(this.f56408o, interfaceC46115a, null, 2, null);
    }

    public final void setTitle$revolut_pay_sdk_2_0_release(@Nullable InterfaceC46115a interfaceC46115a) {
        C45783d.m101109b(this.f56407n, interfaceC46115a, null, 2, null);
    }

    public /* synthetic */ C27599a(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }
}
