package p270ft;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.fasttrade.widget.FastTradeInputView;
import com.kubi.payment.widget.NumberKeyboardView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.j1 */
/* JADX INFO: compiled from: PaymentFragmentFastBuyNewBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37638j1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84079a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f84080b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f84081c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f84082d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f84083e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final NumberKeyboardView f84084f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f84085g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final FastTradeInputView f84086h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f84087i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final KcPrimaryButton f84088j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f84089k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f84090l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f84091m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f84092n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37638j1 m84859a(@NonNull View view) {
        int i11 = R$id.ivCryptoCurrency;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.ivCryptoCurrencyArrowEnd;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView2 != null) {
                i11 = R$id.ivFrequency;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView3 != null) {
                    i11 = R$id.ivRecurringQuestion;
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView4 != null) {
                        i11 = R$id.keyboard;
                        NumberKeyboardView numberKeyboardView = (NumberKeyboardView) ViewBindings.findChildViewById(view, i11);
                        if (numberKeyboardView != null) {
                            i11 = R$id.layoutCryptoCurrency;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout != null) {
                                i11 = R$id.layoutInput;
                                FastTradeInputView fastTradeInputView = (FastTradeInputView) ViewBindings.findChildViewById(view, i11);
                                if (fastTradeInputView != null) {
                                    i11 = R$id.layoutRecurring;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout != null) {
                                        i11 = R$id.tvConfirm;
                                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                        if (kcPrimaryButton != null) {
                                            i11 = R$id.tvCryptoCurrencyName;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tvLimitTip;
                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView2 != null) {
                                                    i11 = R$id.tvNeedHigherLimits;
                                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView3 != null) {
                                                        i11 = R$id.tvRecurring;
                                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView4 != null) {
                                                            return new C37638j1((ConstraintLayout) view, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, numberKeyboardView, constraintLayout, fastTradeInputView, linearLayout, kcPrimaryButton, baseTextView, baseTextView2, baseTextView3, baseTextView4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84079a;
    }

    public C37638j1(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull AppCompatImageView appCompatImageView4, @NonNull NumberKeyboardView numberKeyboardView, @NonNull ConstraintLayout constraintLayout2, @NonNull FastTradeInputView fastTradeInputView, @NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f84079a = constraintLayout;
        this.f84080b = appCompatImageView;
        this.f84081c = appCompatImageView2;
        this.f84082d = appCompatImageView3;
        this.f84083e = appCompatImageView4;
        this.f84084f = numberKeyboardView;
        this.f84085g = constraintLayout2;
        this.f84086h = fastTradeInputView;
        this.f84087i = linearLayout;
        this.f84088j = kcPrimaryButton;
        this.f84089k = baseTextView;
        this.f84090l = baseTextView2;
        this.f84091m = baseTextView3;
        this.f84092n = baseTextView4;
    }
}
