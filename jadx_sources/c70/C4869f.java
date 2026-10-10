package c70;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;
import com.kubi.user.view.EmailPhoneInputView;

/* JADX INFO: renamed from: c70.f */
/* JADX INFO: compiled from: BusercenterFragmentCreateAccountBinding.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C4869f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5082a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C4862b0 f5083b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C4866d0 f5084c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f5085d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final CheckBox f5086e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final CheckBox f5087f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f5088g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final EmailPhoneInputView f5089h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayoutCompat f5090i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f5091j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final NavigationBar f5092k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f5093l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f5094m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f5095n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f5096o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f5097p;

    public C4869f(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull C4862b0 c4862b0, @NonNull C4866d0 c4866d0, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull ImageView imageView, @NonNull EmailPhoneInputView emailPhoneInputView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayout linearLayout, @NonNull NavigationBar navigationBar, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5) {
        this.f5082a = linearLayoutCompat;
        this.f5083b = c4862b0;
        this.f5084c = c4866d0;
        this.f5085d = kcPrimaryButton;
        this.f5086e = checkBox;
        this.f5087f = checkBox2;
        this.f5088g = imageView;
        this.f5089h = emailPhoneInputView;
        this.f5090i = linearLayoutCompat2;
        this.f5091j = linearLayout;
        this.f5092k = navigationBar;
        this.f5093l = baseTextView;
        this.f5094m = baseTextView2;
        this.f5095n = baseTextView3;
        this.f5096o = baseTextView4;
        this.f5097p = baseTextView5;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4869f m5016a(@NonNull View view) {
        int i11 = R$id.bindingExtAccount;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C4862b0 c4862b0M5002a = C4862b0.m5002a(viewFindChildViewById);
            i11 = R$id.bindingRcode;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById2 != null) {
                C4866d0 c4866d0M5010a = C4866d0.m5010a(viewFindChildViewById2);
                i11 = R$id.btnCreate;
                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton != null) {
                    i11 = R$id.cbMarketingPolicy;
                    CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
                    if (checkBox != null) {
                        i11 = R$id.cbPrivacyPolicy;
                        CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, i11);
                        if (checkBox2 != null) {
                            i11 = R$id.imgIndiaRegister;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView != null) {
                                i11 = R$id.inputEmailPhone;
                                EmailPhoneInputView emailPhoneInputView = (EmailPhoneInputView) ViewBindings.findChildViewById(view, i11);
                                if (emailPhoneInputView != null) {
                                    i11 = R$id.layoutProtocol;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayoutCompat != null) {
                                        i11 = R$id.llMarketingPolicy;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayout != null) {
                                            i11 = R$id.naviBar;
                                            NavigationBar navigationBar = (NavigationBar) ViewBindings.findChildViewById(view, i11);
                                            if (navigationBar != null) {
                                                i11 = R$id.tvAgreePrivacy;
                                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView != null) {
                                                    i11 = R$id.tvAgreeUseTerms;
                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView2 != null) {
                                                        i11 = R$id.tvAgreenAnd;
                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView3 != null) {
                                                            i11 = R$id.tvMarketingPolicy;
                                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView4 != null) {
                                                                i11 = R$id.tvPrivacyPolicy;
                                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView5 != null) {
                                                                    return new C4869f((LinearLayoutCompat) view, c4862b0M5002a, c4866d0M5010a, kcPrimaryButton, checkBox, checkBox2, imageView, emailPhoneInputView, linearLayoutCompat, linearLayout, navigationBar, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5);
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
    public LinearLayoutCompat getRoot() {
        return this.f5082a;
    }
}
