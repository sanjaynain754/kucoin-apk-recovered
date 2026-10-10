package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.kubi.resources.C22912t;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CheckEditText.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010)\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010*\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020(H\u0016J\u001a\u0010,\u001a\u00020(2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010#\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u001c\u0010%\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/kubi/resources/widget/CheckEditText;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getAttrs", "()Landroid/util/AttributeSet;", "editText", "Lcom/kubi/resources/widget/UnitEditText;", "getEditText", "()Lcom/kubi/resources/widget/UnitEditText;", "setEditText", "(Lcom/kubi/resources/widget/UnitEditText;)V", "tipsText", "Landroid/widget/TextView;", "getTipsText", "()Landroid/widget/TextView;", "setTipsText", "(Landroid/widget/TextView;)V", "value", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "normalBg", "Landroid/graphics/drawable/Drawable;", "getNormalBg", "()Landroid/graphics/drawable/Drawable;", "focusBg", "getFocusBg", "errorBg", "getErrorBg", "focusListener", "Lkotlin/Function1;", "", "", "showError", "hideError", "hideErrorInvisible", "setOnFocusChangedListener", TUIConstants.TUIChat.CALL_BACK, "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class CheckEditText extends LinearLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AttributeSet f43742b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public UnitEditText f43743c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public TextView f43744d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Drawable f43745e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Drawable f43746f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Drawable f43747g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Function1<? super Boolean, Unit> f43748h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f43742b = attrs;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.CheckEditText);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setOrientation(1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.f43744d = appCompatTextView;
        appCompatTextView.setGravity(16);
        this.f43744d.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CheckEditText_tipsSize, 10));
        this.f43744d.setTextColor(typedArrayObtainStyledAttributes.getColor(R$styleable.CheckEditText_tipsColor, -16776961));
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.CheckEditText_normalBg);
        if (drawable == null) {
            drawable = getResources().getDrawable(R$drawable.shape_input_normal);
            Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        }
        this.f43745e = drawable;
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.CheckEditText_focusBg);
        if (drawable2 == null) {
            drawable2 = getResources().getDrawable(R$drawable.shape_input_focus);
            Intrinsics.checkNotNullExpressionValue(drawable2, "getDrawable(...)");
        }
        this.f43746f = drawable2;
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.CheckEditText_errorBg);
        if (drawable3 == null) {
            drawable3 = getResources().getDrawable(R$drawable.shape_input_error);
            Intrinsics.checkNotNullExpressionValue(drawable3, "getDrawable(...)");
        }
        this.f43747g = drawable3;
        UnitEditText unitEditText = new UnitEditText(context, null, 2, 0 == true ? 1 : 0);
        this.f43743c = unitEditText;
        unitEditText.setSingleLine();
        this.f43743c.setPadding(C27029c.m66601d(this, 12), 0, C27029c.m66601d(this, 12), 0);
        this.f43743c.setGravity(16);
        this.f43743c.setHint(typedArrayObtainStyledAttributes.getString(R$styleable.CheckEditText_hintText));
        this.f43743c.setHintTextColor(typedArrayObtainStyledAttributes.getColor(R$styleable.CheckEditText_hintColor, -16776961));
        this.f43743c.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CheckEditText_editSize, 10));
        this.f43743c.setTextColor(typedArrayObtainStyledAttributes.getColor(R$styleable.CheckEditText_editColor, -16776961));
        C22912t.m54419q(this.f43743c, typedArrayObtainStyledAttributes.getResourceId(R$styleable.CheckEditText_editCursor, R$drawable.shape_primary_cursor));
        this.f43743c.setBackgroundDrawable(drawable);
        this.f43743c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.resources.widget.q
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CheckEditText.m54475b(this.f45021b, view, z11);
            }
        });
        addView(this.f43743c, new LinearLayout.LayoutParams(-1, typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CheckEditText_editHeight, C27029c.m66601d(this, 40))));
        View view = this.f43744d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = C27029c.m66601d(this, 6);
        Unit unit = Unit.INSTANCE;
        addView(view, layoutParams);
        ViewExtKt.m66577h(this.f43744d);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public static final void m54475b(CheckEditText checkEditText, View view, boolean z11) {
        Drawable drawable;
        if (checkEditText.f43744d.getVisibility() == 0) {
            drawable = checkEditText.f43747g;
        } else {
            drawable = z11 ? checkEditText.f43746f : checkEditText.f43745e;
        }
        view.setBackgroundDrawable(drawable);
        Function1<? super Boolean, Unit> function1 = checkEditText.f43748h;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo36660c() {
        this.f43744d.setVisibility(8);
        if (this.f43743c.hasFocus()) {
            this.f43743c.setBackgroundDrawable(this.f43746f);
        } else {
            this.f43743c.setBackgroundDrawable(this.f43745e);
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo36661d(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f43744d.setText(text);
        this.f43744d.setVisibility(0);
        this.f43743c.setBackgroundDrawable(this.f43747g);
    }

    @NotNull
    /* JADX INFO: renamed from: getAttrs, reason: from getter */
    public final AttributeSet getF43742b() {
        return this.f43742b;
    }

    @NotNull
    /* JADX INFO: renamed from: getEditText, reason: from getter */
    public final UnitEditText getF43743c() {
        return this.f43743c;
    }

    @NotNull
    /* JADX INFO: renamed from: getErrorBg, reason: from getter */
    public final Drawable getF43747g() {
        return this.f43747g;
    }

    @NotNull
    /* JADX INFO: renamed from: getFocusBg, reason: from getter */
    public final Drawable getF43746f() {
        return this.f43746f;
    }

    @NotNull
    /* JADX INFO: renamed from: getNormalBg, reason: from getter */
    public final Drawable getF43745e() {
        return this.f43745e;
    }

    @NotNull
    public final String getText() {
        return String.valueOf(this.f43743c.getText());
    }

    @NotNull
    /* JADX INFO: renamed from: getTipsText, reason: from getter */
    public final TextView getF43744d() {
        return this.f43744d;
    }

    public final void setEditText(@NotNull UnitEditText unitEditText) {
        Intrinsics.checkNotNullParameter(unitEditText, "<set-?>");
        this.f43743c = unitEditText;
    }

    public final void setOnFocusChangedListener(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f43748h = callback;
    }

    public final void setText(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f43743c.setText(value);
    }

    public final void setTipsText(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f43744d = textView;
    }
}
