package bv;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.QuoteUpDownTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.FocusEditTextLinearLayout;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: bv.e0 */
/* JADX INFO: compiled from: KucoinViewAlertHeaderBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4663e0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f4292a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final QuoteUpDownTextView f4293b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f4294c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ClearEditText f4295d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ClearEditText f4296e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FocusEditTextLinearLayout f4297f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FocusEditTextLinearLayout f4298g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f4299h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f4300i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f4301j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final KcPrimaryButton f4302k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final QuoteUpDownTextView f4303l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f4304m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f4305n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f4306o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4663e0 m4638a(@NonNull View view) {
        int i11 = R$id.coin_turnover;
        QuoteUpDownTextView quoteUpDownTextView = (QuoteUpDownTextView) ViewBindings.findChildViewById(view, i11);
        if (quoteUpDownTextView != null) {
            i11 = R$id.edit_title;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.et_amount_input;
                ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
                if (clearEditText != null) {
                    i11 = R$id.et_amplitude_input;
                    ClearEditText clearEditText2 = (ClearEditText) ViewBindings.findChildViewById(view, i11);
                    if (clearEditText2 != null) {
                        i11 = R$id.ll_amount;
                        FocusEditTextLinearLayout focusEditTextLinearLayout = (FocusEditTextLinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (focusEditTextLinearLayout != null) {
                            i11 = R$id.ll_amplitude;
                            FocusEditTextLinearLayout focusEditTextLinearLayout2 = (FocusEditTextLinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (focusEditTextLinearLayout2 != null) {
                                i11 = R$id.tv_alert_num;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tv_amount_tip;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tv_amplitude_unit;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tv_create_alert;
                                            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                            if (kcPrimaryButton != null) {
                                                i11 = R$id.tv_cur_amount;
                                                QuoteUpDownTextView quoteUpDownTextView2 = (QuoteUpDownTextView) ViewBindings.findChildViewById(view, i11);
                                                if (quoteUpDownTextView2 != null) {
                                                    i11 = R$id.tv_cur_price;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        i11 = R$id.tv_symbol;
                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView6 != null) {
                                                            i11 = R$id.tv_tip;
                                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView7 != null) {
                                                                return new C4663e0((LinearLayout) view, quoteUpDownTextView, baseTextView, clearEditText, clearEditText2, focusEditTextLinearLayout, focusEditTextLinearLayout2, baseTextView2, baseTextView3, baseTextView4, kcPrimaryButton, quoteUpDownTextView2, baseTextView5, baseTextView6, baseTextView7);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f4292a;
    }

    public C4663e0(@NonNull LinearLayout linearLayout, @NonNull QuoteUpDownTextView quoteUpDownTextView, @NonNull BaseTextView baseTextView, @NonNull ClearEditText clearEditText, @NonNull ClearEditText clearEditText2, @NonNull FocusEditTextLinearLayout focusEditTextLinearLayout, @NonNull FocusEditTextLinearLayout focusEditTextLinearLayout2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull QuoteUpDownTextView quoteUpDownTextView2, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7) {
        this.f4292a = linearLayout;
        this.f4293b = quoteUpDownTextView;
        this.f4294c = baseTextView;
        this.f4295d = clearEditText;
        this.f4296e = clearEditText2;
        this.f4297f = focusEditTextLinearLayout;
        this.f4298g = focusEditTextLinearLayout2;
        this.f4299h = baseTextView2;
        this.f4300i = baseTextView3;
        this.f4301j = baseTextView4;
        this.f4302k = kcPrimaryButton;
        this.f4303l = quoteUpDownTextView2;
        this.f4304m = baseTextView5;
        this.f4305n = baseTextView6;
        this.f4306o = baseTextView7;
    }
}
