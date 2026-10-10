package c70;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.PassWordGridView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;
import com.kubi.user.view.KycCountDownTextView;

/* JADX INFO: renamed from: c70.g */
/* JADX INFO: compiled from: BusercenterFragmentDeleteAccountSafeCheckBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4871g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ScrollView f5103a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f5104b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ClearEditText f5105c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f5106d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f5107e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f5108f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f5109g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f5110h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KycCountDownTextView f5111i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ClearEditText f5112j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f5113k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f5114l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final KcPrimaryButton f5115m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f5116n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final KycCountDownTextView f5117o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final TextView f5118p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final KycCountDownTextView f5119q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final PassWordGridView f5120r;

    public C4871g(@NonNull ScrollView scrollView, @NonNull ClearEditText clearEditText, @NonNull ClearEditText clearEditText2, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull KycCountDownTextView kycCountDownTextView, @NonNull ClearEditText clearEditText3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull TextView textView4, @NonNull KycCountDownTextView kycCountDownTextView2, @NonNull TextView textView5, @NonNull KycCountDownTextView kycCountDownTextView3, @NonNull PassWordGridView passWordGridView) {
        this.f5103a = scrollView;
        this.f5104b = clearEditText;
        this.f5105c = clearEditText2;
        this.f5106d = linearLayout;
        this.f5107e = linearLayout2;
        this.f5108f = linearLayout3;
        this.f5109g = linearLayout4;
        this.f5110h = textView;
        this.f5111i = kycCountDownTextView;
        this.f5112j = clearEditText3;
        this.f5113k = textView2;
        this.f5114l = textView3;
        this.f5115m = kcPrimaryButton;
        this.f5116n = textView4;
        this.f5117o = kycCountDownTextView2;
        this.f5118p = textView5;
        this.f5119q = kycCountDownTextView3;
        this.f5120r = passWordGridView;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4871g m5020a(@NonNull View view) {
        int i11 = R$id.et_email_code;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.et_sms_code;
            ClearEditText clearEditText2 = (ClearEditText) ViewBindings.findChildViewById(view, i11);
            if (clearEditText2 != null) {
                i11 = R$id.ll_email;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.ll_google;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout2 != null) {
                        i11 = R$id.ll_sms;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout3 != null) {
                            i11 = R$id.ll_trade_pwd;
                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout4 != null) {
                                i11 = R$id.tv_email_code_error;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView != null) {
                                    i11 = R$id.tv_email_count_down;
                                    KycCountDownTextView kycCountDownTextView = (KycCountDownTextView) ViewBindings.findChildViewById(view, i11);
                                    if (kycCountDownTextView != null) {
                                        i11 = R$id.tv_google_check;
                                        ClearEditText clearEditText3 = (ClearEditText) ViewBindings.findChildViewById(view, i11);
                                        if (clearEditText3 != null) {
                                            i11 = R$id.tv_google_code_error;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                            if (textView2 != null) {
                                                i11 = R$id.tv_google_text;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView3 != null) {
                                                    i11 = R$id.tv_next;
                                                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                    if (kcPrimaryButton != null) {
                                                        i11 = R$id.tv_sms_code_error;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                        if (textView4 != null) {
                                                            i11 = R$id.tv_sms_count_down;
                                                            KycCountDownTextView kycCountDownTextView2 = (KycCountDownTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (kycCountDownTextView2 != null) {
                                                                i11 = R$id.tv_trade_pwd_error;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                if (textView5 != null) {
                                                                    i11 = R$id.tv_voice;
                                                                    KycCountDownTextView kycCountDownTextView3 = (KycCountDownTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (kycCountDownTextView3 != null) {
                                                                        i11 = R$id.tv_withdraw_pwd;
                                                                        PassWordGridView passWordGridView = (PassWordGridView) ViewBindings.findChildViewById(view, i11);
                                                                        if (passWordGridView != null) {
                                                                            return new C4871g((ScrollView) view, clearEditText, clearEditText2, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView, kycCountDownTextView, clearEditText3, textView2, textView3, kcPrimaryButton, textView4, kycCountDownTextView2, textView5, kycCountDownTextView3, passWordGridView);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f5103a;
    }
}
