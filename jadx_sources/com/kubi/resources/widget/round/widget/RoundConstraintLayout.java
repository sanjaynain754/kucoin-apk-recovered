package com.kubi.resources.widget.round.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ax.C4399a;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.res.R$styleable;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RoundConstraintLayout.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fJ0\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\"\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/resources/widget/round/widget/RoundConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/kubi/resources/widget/round/abs/IRoundView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "roundViewImpl", "Lcom/kubi/resources/widget/round/abs/RoundViewImpl;", ViewProps.ON_LAYOUT, "", "changed", "", "left", ViewProps.TOP, "right", ViewProps.BOTTOM, "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "init", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "attributeSet", "setCornerRadius", "cornerRadius", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RoundConstraintLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: n */
    public C4399a f45079n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundConstraintLayout(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundConstraintLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        m55450a(this, context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m55450a(View view, Context context, AttributeSet attributeSet) {
        int[] RCAttrs = R$styleable.RCAttrs;
        Intrinsics.checkNotNullExpressionValue(RCAttrs, "RCAttrs");
        this.f45079n = new C4399a(view, context, attributeSet, RCAttrs, R$styleable.RCAttrs_round_corner);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        C4399a c4399a = this.f45079n;
        C4399a c4399a2 = null;
        if (c4399a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roundViewImpl");
            c4399a = null;
        }
        c4399a.m4034b(canvas);
        super.dispatchDraw(canvas);
        C4399a c4399a3 = this.f45079n;
        if (c4399a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roundViewImpl");
        } else {
            c4399a2 = c4399a3;
        }
        c4399a2.m4033a(canvas);
    }

    public void setCornerRadius(float cornerRadius) {
        C4399a c4399a = this.f45079n;
        if (c4399a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roundViewImpl");
            c4399a = null;
        }
        c4399a.m4037e(cornerRadius);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        C4399a c4399a = this.f45079n;
        if (c4399a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("roundViewImpl");
            c4399a = null;
        }
        c4399a.m4036d(changed, left, top, right, bottom);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundConstraintLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        m55450a(this, context, attributeSet);
    }
}
