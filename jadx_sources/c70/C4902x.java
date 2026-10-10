package c70;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;
import com.kubi.user.view.EmailPhoneInputView;

/* JADX INFO: renamed from: c70.x */
/* JADX INFO: compiled from: BusercenterLayoutExternalAccountCreateBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4902x implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final NestedScrollView f5363a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f5364b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CheckBox f5365c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CheckBox f5366d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final EmailPhoneInputView f5367e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcTextInputLayout f5368f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f5369g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f5370h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f5371i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final NestedScrollView f5372j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final LinearLayout f5373k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f5374l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f5375m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f5376n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f5377o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4902x m5083a(@NonNull View view) {
        int i11 = R$id.btnConfirm;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.cbExtAccountMarketingPolicy;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
            if (checkBox != null) {
                i11 = R$id.cbExtAccountPrivacyPolicy;
                CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, i11);
                if (checkBox2 != null) {
                    i11 = R$id.extAccountCreateInputEmailPhone;
                    EmailPhoneInputView emailPhoneInputView = (EmailPhoneInputView) ViewBindings.findChildViewById(view, i11);
                    if (emailPhoneInputView != null) {
                        i11 = R$id.inputRcode;
                        KcTextInputLayout kcTextInputLayout = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
                        if (kcTextInputLayout != null) {
                            i11 = R$id.ivReferArrow;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView != null) {
                                i11 = R$id.layoutProtocol;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout != null) {
                                    i11 = R$id.layoutRefer;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout2 != null) {
                                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                                        i11 = R$id.llExtAccountMarketingPolicy;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayout3 != null) {
                                            i11 = R$id.tvCreateTips;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tvDiscount;
                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView2 != null) {
                                                    i11 = R$id.tvExtAccountMarketingPolicy;
                                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView3 != null) {
                                                        i11 = R$id.tvExtAccountPrivacyPolicy;
                                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView4 != null) {
                                                            return new C4902x(nestedScrollView, kcPrimaryButton, checkBox, checkBox2, emailPhoneInputView, kcTextInputLayout, imageView, linearLayout, linearLayout2, nestedScrollView, linearLayout3, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
        return this.f5363a;
    }

    public C4902x(@NonNull NestedScrollView nestedScrollView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull EmailPhoneInputView emailPhoneInputView, @NonNull KcTextInputLayout kcTextInputLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull NestedScrollView nestedScrollView2, @NonNull LinearLayout linearLayout3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f5363a = nestedScrollView;
        this.f5364b = kcPrimaryButton;
        this.f5365c = checkBox;
        this.f5366d = checkBox2;
        this.f5367e = emailPhoneInputView;
        this.f5368f = kcTextInputLayout;
        this.f5369g = imageView;
        this.f5370h = linearLayout;
        this.f5371i = linearLayout2;
        this.f5372j = nestedScrollView2;
        this.f5373k = linearLayout3;
        this.f5374l = baseTextView;
        this.f5375m = baseTextView2;
        this.f5376n = baseTextView3;
        this.f5377o = baseTextView4;
    }
}
