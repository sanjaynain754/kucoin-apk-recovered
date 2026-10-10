package c70;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.resources.widget.ResendView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.o */
/* JADX INFO: compiled from: BusercenterFragmentSecurityVerificationBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4887o implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final NestedScrollView f5233a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f5234b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextInputEditText f5235c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextInputEditText f5236d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextInputEditText f5237e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f5238f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f5239g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f5240h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ImageView f5241i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ImageView f5242j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final KcTextInputLayout f5243k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final KcTextInputLayout f5244l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final KcTextInputLayout f5245m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final LinearLayout f5246n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final LinearLayout f5247o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final LinearLayout f5248p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final AlertTipsTextView f5249q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final ResendView f5250r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f5251s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f5252t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f5253u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final ResendView f5254v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f5255w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f5256x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f5257y;

    public C4887o(@NonNull NestedScrollView nestedScrollView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull TextInputEditText textInputEditText, @NonNull TextInputEditText textInputEditText2, @NonNull TextInputEditText textInputEditText3, @NonNull BaseTextView baseTextView, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull KcTextInputLayout kcTextInputLayout, @NonNull KcTextInputLayout kcTextInputLayout2, @NonNull KcTextInputLayout kcTextInputLayout3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull AlertTipsTextView alertTipsTextView, @NonNull ResendView resendView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull ResendView resendView2, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7) {
        this.f5233a = nestedScrollView;
        this.f5234b = kcPrimaryButton;
        this.f5235c = textInputEditText;
        this.f5236d = textInputEditText2;
        this.f5237e = textInputEditText3;
        this.f5238f = baseTextView;
        this.f5239g = linearLayout;
        this.f5240h = imageView;
        this.f5241i = imageView2;
        this.f5242j = imageView3;
        this.f5243k = kcTextInputLayout;
        this.f5244l = kcTextInputLayout2;
        this.f5245m = kcTextInputLayout3;
        this.f5246n = linearLayout2;
        this.f5247o = linearLayout3;
        this.f5248p = linearLayout4;
        this.f5249q = alertTipsTextView;
        this.f5250r = resendView;
        this.f5251s = baseTextView2;
        this.f5252t = baseTextView3;
        this.f5253u = baseTextView4;
        this.f5254v = resendView2;
        this.f5255w = baseTextView5;
        this.f5256x = baseTextView6;
        this.f5257y = baseTextView7;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4887o m5053a(@NonNull View view) {
        int i11 = R$id.btnSubmit;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.edt2FACode;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, i11);
            if (textInputEditText != null) {
                i11 = R$id.edtEmailCode;
                TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, i11);
                if (textInputEditText2 != null) {
                    i11 = R$id.edtSmsCode;
                    TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, i11);
                    if (textInputEditText3 != null) {
                        i11 = R$id.fishCode;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.fishTips;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                i11 = R$id.imgClearEmailCode;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                if (imageView != null) {
                                    i11 = R$id.imgClearGoogleCode;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                    if (imageView2 != null) {
                                        i11 = R$id.imgClearSmsCode;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                        if (imageView3 != null) {
                                            i11 = R$id.inputEmail;
                                            KcTextInputLayout kcTextInputLayout = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
                                            if (kcTextInputLayout != null) {
                                                i11 = R$id.inputGoogle2FA;
                                                KcTextInputLayout kcTextInputLayout2 = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
                                                if (kcTextInputLayout2 != null) {
                                                    i11 = R$id.inputSms;
                                                    KcTextInputLayout kcTextInputLayout3 = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
                                                    if (kcTextInputLayout3 != null) {
                                                        i11 = R$id.llEmail;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                        if (linearLayout2 != null) {
                                                            i11 = R$id.llGoogle2FA;
                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                            if (linearLayout3 != null) {
                                                                i11 = R$id.llSms;
                                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                                if (linearLayout4 != null) {
                                                                    i11 = R$id.riskTips;
                                                                    AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (alertTipsTextView != null) {
                                                                        i11 = R$id.tvEmailCountDown;
                                                                        ResendView resendView = (ResendView) ViewBindings.findChildViewById(view, i11);
                                                                        if (resendView != null) {
                                                                            i11 = R$id.tvEmailSendTips;
                                                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView2 != null) {
                                                                                i11 = R$id.tvPaste;
                                                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView3 != null) {
                                                                                    i11 = R$id.tvSecurityVerificationTips;
                                                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView4 != null) {
                                                                                        i11 = R$id.tvSmsCountDown;
                                                                                        ResendView resendView2 = (ResendView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (resendView2 != null) {
                                                                                            i11 = R$id.tvSmsSendTips;
                                                                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView5 != null) {
                                                                                                i11 = R$id.tvSwitchVerificationMethod;
                                                                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView6 != null) {
                                                                                                    i11 = R$id.tvVerificationMethodNotAvailable;
                                                                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (baseTextView7 != null) {
                                                                                                        return new C4887o((NestedScrollView) view, kcPrimaryButton, textInputEditText, textInputEditText2, textInputEditText3, baseTextView, linearLayout, imageView, imageView2, imageView3, kcTextInputLayout, kcTextInputLayout2, kcTextInputLayout3, linearLayout2, linearLayout3, linearLayout4, alertTipsTextView, resendView, baseTextView2, baseTextView3, baseTextView4, resendView2, baseTextView5, baseTextView6, baseTextView7);
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
    public NestedScrollView getRoot() {
        return this.f5233a;
    }
}
