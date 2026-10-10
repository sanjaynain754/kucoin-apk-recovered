package com.kubi.numeric.financial.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5303w0;
import com.google.android.material.textfield.TextInputLayout;
import com.kubi.numeric.financial.widget.KcOrderStyleInputLayout;
import com.kubi.numeric.kit.R$drawable;
import com.kubi.numeric.kit.R$id;
import com.kubi.numeric.kit.R$layout;
import com.kubi.numeric.kit.R$styleable;
import com.kubi.resources.widget.input.KCCustomActionTextInputLayout;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27040e;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KcOrderStyleInputLayout.kt */
/* JADX INFO: loaded from: classes30.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u0006\u0010\u001a\u001a\u00020\u000bJ\u0006\u0010\u001b\u001a\u00020\rJ\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0007J\b\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/numeric/financial/widget/KcOrderStyleInputLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mTextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "mTextInputEditText", "Lcom/kubi/numeric/financial/widget/FinancialInputEditText;", "mTextInputActionLayout", "Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout;", "mBorderView", "Landroid/view/View;", "mOnFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "initAttributes", "", "setupListeners", "updateBorderColor", "setOnFocusChangeListener", CmcdData.Factory.STREAM_TYPE_LIVE, "getTextInputLayout", "getEditText", "addAction", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lcom/kubi/resources/widget/input/KCCustomActionTextInputLayout$ActionItem;", "removeAction", "setMaxDecimalPlaces", "maxDecimalPlaces", "isActivityValid", "", "LNumericKit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KcOrderStyleInputLayout extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TextInputLayout f36422b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final FinancialInputEditText f36423c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final KCCustomActionTextInputLayout f36424d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final View f36425e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public View.OnFocusChangeListener f36426f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcOrderStyleInputLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcOrderStyleInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: e */
    public static final void m43240e(KcOrderStyleInputLayout kcOrderStyleInputLayout, KCCustomActionTextInputLayout.ActionItem actionItem) {
        kcOrderStyleInputLayout.f36424d.m55305e(actionItem);
    }

    /* JADX INFO: renamed from: h */
    public static final void m43241h(KcOrderStyleInputLayout kcOrderStyleInputLayout, KCCustomActionTextInputLayout.ActionItem actionItem) {
        kcOrderStyleInputLayout.f36424d.m55311l(actionItem);
    }

    /* JADX INFO: renamed from: j */
    public static final void m43242j(KcOrderStyleInputLayout kcOrderStyleInputLayout, View view, boolean z11) {
        View.OnFocusChangeListener onFocusChangeListener = kcOrderStyleInputLayout.f36426f;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z11);
        }
        kcOrderStyleInputLayout.m43247k();
    }

    /* JADX INFO: renamed from: d */
    public final void m43243d(@NotNull final KCCustomActionTextInputLayout.ActionItem action) {
        Intrinsics.checkNotNullParameter(action, "action");
        post(new Runnable() { // from class: qs.e
            @Override // java.lang.Runnable
            public final void run() {
                KcOrderStyleInputLayout.m43240e(this.f96955b, action);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m43245g(@NotNull final KCCustomActionTextInputLayout.ActionItem action) {
        Intrinsics.checkNotNullParameter(action, "action");
        post(new Runnable() { // from class: qs.g
            @Override // java.lang.Runnable
            public final void run() {
                KcOrderStyleInputLayout.m43241h(this.f96958b, action);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: getEditText, reason: from getter */
    public final FinancialInputEditText getF36423c() {
        return this.f36423c;
    }

    @NotNull
    /* JADX INFO: renamed from: getTextInputLayout, reason: from getter */
    public final TextInputLayout getF36422b() {
        return this.f36422b;
    }

    /* JADX INFO: renamed from: i */
    public final void m43246i() {
        this.f36423c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: qs.f
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                KcOrderStyleInputLayout.m43242j(this.f96957b, view, z11);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m43247k() {
        this.f36425e.setBackground(C27017c.m66510d(C27017c.f54310a, this.f36423c.isFocused() ? R$drawable.bg_kc_custom_input_border_focused : R$drawable.bg_kc_custom_input_border, null, 2, null));
    }

    public final void setMaxDecimalPlaces(int maxDecimalPlaces) {
        this.f36423c.setMaxDecimalPlaces(maxDecimalPlaces);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(@NotNull View.OnFocusChangeListener l11) {
        Intrinsics.checkNotNullParameter(l11, "l");
        this.f36426f = l11;
    }

    public /* synthetic */ KcOrderStyleInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: f */
    public final void m43244f(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R$styleable.KCOrderStyleInputLayout, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.KCOrderStyleInputLayout_hint);
            if (string != null) {
                this.f36422b.setHint(string);
            }
            String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.KCOrderStyleInputLayout_text);
            if (string2 != null) {
                this.f36423c.setText(string2);
            }
            int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.KCOrderStyleInputLayout_maxDecimalPlaces, 6);
            boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.KCOrderStyleInputLayout_isFinancialStyle, true);
            this.f36423c.setMaxDecimalPlaces(i11);
            this.f36423c.setFinancialStyle(z11);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KcOrderStyleInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = View.inflate(context, R$layout.kc_order_input_view, this);
        View viewFindViewById = viewInflate.findViewById(R$id.kc_order_input_action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f36424d = (KCCustomActionTextInputLayout) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R$id.kc_order_input_textLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f36422b = (TextInputLayout) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R$id.kc_order_input_editText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        FinancialInputEditText financialInputEditText = (FinancialInputEditText) viewFindViewById3;
        this.f36423c = financialInputEditText;
        View viewFindViewById4 = viewInflate.findViewById(R$id.borderView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f36425e = viewFindViewById4;
        if (C5303w0.m6511a() && Build.VERSION.SDK_INT >= 35) {
            financialInputEditText.setPaddingRelative(financialInputEditText.getPaddingStart(), C27040e.m66658b(16), financialInputEditText.getPaddingEnd(), financialInputEditText.getPaddingBottom());
        }
        m43244f(attributeSet);
        m43246i();
    }
}
