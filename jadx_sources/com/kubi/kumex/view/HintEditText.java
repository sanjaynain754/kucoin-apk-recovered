package com.kubi.kumex.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$styleable;
import com.kubi.kumex.view.HintEditText;
import com.kubi.resources.widget.CheckEditText;
import com.kubi.utils.extensions.core.C27029c;
import io.reactivex.functions.Consumer;
import org.jetbrains.annotations.NotNull;
import p011a9.C0206f;
import p752x8.AbstractC46099a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HintEditText.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/kumex/view/HintEditText;", "Lcom/kubi/resources/widget/CheckEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "content", "Landroid/widget/FrameLayout;", "getContent", "()Landroid/widget/FrameLayout;", "setContent", "(Landroid/widget/FrameLayout;)V", "hintText", "Landroid/widget/TextView;", "getHintText", "()Landroid/widget/TextView;", "setHintText", "(Landroid/widget/TextView;)V", "showError", "", "text", "", "hideError", "setEnabled", "enabled", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HintEditText extends CheckEditText {

    /* JADX INFO: renamed from: i */
    @NotNull
    public FrameLayout f30849i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public TextView f30850j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HintEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        removeView(getF43743c());
        removeView(getF43744d());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.CheckEditText);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setOrientation(1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.f30850j = appCompatTextView;
        appCompatTextView.setGravity(17);
        this.f30850j.setText(typedArrayObtainStyledAttributes.getString(R$styleable.CheckEditText_hintText));
        this.f30850j.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CheckEditText_hintSize, 10));
        this.f30850j.setTextColor(typedArrayObtainStyledAttributes.getColorStateList(R$styleable.CheckEditText_hintColor));
        getF43743c().setPadding(0, 0, 0, 0);
        getF43743c().setGravity(8388629);
        getF43743c().setInputType(2);
        getF43743c().setHint("");
        getF43743c().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xm.v
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                HintEditText.m36657h(this.f103871b, view, z11);
            }
        });
        getF43743c().setBackgroundDrawable(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30849i = frameLayout;
        frameLayout.setPadding(C27029c.m66601d(this, 16), 0, C27029c.m66601d(this, 16), 0);
        this.f30849i.setBackgroundResource(R$drawable.shape_largecolor_4r);
        this.f30849i.addView(this.f30850j, new LinearLayout.LayoutParams(-2, -1));
        this.f30849i.addView(getF43743c(), new LinearLayout.LayoutParams(-1, -1));
        addView(this.f30849i, new LinearLayout.LayoutParams(-1, C27029c.m66601d(this, 38)));
        addView(getF43744d(), new LinearLayout.LayoutParams(-1, -2));
        AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(getF43743c());
        final Function1 function1 = new Function1() { // from class: xm.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HintEditText.m36658i(this.f103872b, (CharSequence) obj);
            }
        };
        abstractC46099aM784d.subscribe(new Consumer() { // from class: xm.x
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HintEditText.m36659j(function1, obj);
            }
        });
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m36658i(HintEditText hintEditText, CharSequence charSequence) {
        hintEditText.f30850j.setVisibility(TextUtils.isEmpty(charSequence) ? 0 : 4);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.widget.CheckEditText
    /* JADX INFO: renamed from: d */
    public void mo36661d(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        getF43744d().setText(text);
        getF43744d().setVisibility(0);
        this.f30849i.setBackgroundResource(R$drawable.bkumex_shape_input_dark_error);
    }

    @NotNull
    /* JADX INFO: renamed from: getContent, reason: from getter */
    public final FrameLayout getF30849i() {
        return this.f30849i;
    }

    @NotNull
    /* JADX INFO: renamed from: getHintText, reason: from getter */
    public final TextView getF30850j() {
        return this.f30850j;
    }

    public final void setContent(@NotNull FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
        this.f30849i = frameLayout;
    }

    public final void setHintText(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f30850j = textView;
    }

    /* JADX INFO: renamed from: h */
    public static final void m36657h(HintEditText hintEditText, View view, boolean z11) {
        hintEditText.getF43743c().setBackgroundDrawable(null);
    }

    /* JADX INFO: renamed from: j */
    public static final void m36659j(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // com.kubi.resources.widget.CheckEditText
    /* JADX INFO: renamed from: c */
    public void mo36660c() {
        getF43744d().setVisibility(8);
        if (getF43743c().hasFocus()) {
            this.f30849i.setBackgroundResource(R$drawable.bkumex_shape_input_dark_green);
        } else {
            this.f30849i.setBackgroundResource(R$drawable.shape_largecolor_4r);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.f30850j.setEnabled(enabled);
        getF43743c().setEnabled(enabled);
    }
}
