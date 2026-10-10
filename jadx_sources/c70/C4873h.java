package c70;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;
import com.kubi.user.view.EmailPhoneInputView;

/* JADX INFO: renamed from: c70.h */
/* JADX INFO: compiled from: BusercenterFragmentLoginV2Binding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4873h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5125a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C4864c0 f5126b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C4870f0 f5127c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f5128d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcPrimaryButton f5129e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FrameLayout f5130f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f5131g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayoutCompat f5132h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final EmailPhoneInputView f5133i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final NavigationBar f5134j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final NestedScrollView f5135k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f5136l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4873h m5024a(@NonNull View view) {
        int i11 = R$id.bindingExtAccount;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C4864c0 c4864c0M5006a = C4864c0.m5006a(viewFindChildViewById);
            i11 = R$id.bindingPwd;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById2 != null) {
                C4870f0 c4870f0M5018a = C4870f0.m5018a(viewFindChildViewById2);
                i11 = R$id.btnLogin;
                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton != null) {
                    i11 = R$id.btnNext;
                    KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcPrimaryButton2 != null) {
                        i11 = R$id.flBtn;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                        if (frameLayout != null) {
                            i11 = R$id.llPwd;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                                i11 = R$id.loginInputEmailPhone;
                                EmailPhoneInputView emailPhoneInputView = (EmailPhoneInputView) ViewBindings.findChildViewById(view, i11);
                                if (emailPhoneInputView != null) {
                                    i11 = R$id.naviBar;
                                    NavigationBar navigationBar = (NavigationBar) ViewBindings.findChildViewById(view, i11);
                                    if (navigationBar != null) {
                                        i11 = R$id.nsv_content;
                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                                        if (nestedScrollView != null) {
                                            i11 = R$id.tvForgetPwd;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                return new C4873h(linearLayoutCompat, c4864c0M5006a, c4870f0M5018a, kcPrimaryButton, kcPrimaryButton2, frameLayout, linearLayout, linearLayoutCompat, emailPhoneInputView, navigationBar, nestedScrollView, baseTextView);
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
        return this.f5125a;
    }

    public C4873h(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull C4864c0 c4864c0, @NonNull C4870f0 c4870f0, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull EmailPhoneInputView emailPhoneInputView, @NonNull NavigationBar navigationBar, @NonNull NestedScrollView nestedScrollView, @NonNull BaseTextView baseTextView) {
        this.f5125a = linearLayoutCompat;
        this.f5126b = c4864c0;
        this.f5127c = c4870f0;
        this.f5128d = kcPrimaryButton;
        this.f5129e = kcPrimaryButton2;
        this.f5130f = frameLayout;
        this.f5131g = linearLayout;
        this.f5132h = linearLayoutCompat2;
        this.f5133i = emailPhoneInputView;
        this.f5134j = navigationBar;
        this.f5135k = nestedScrollView;
        this.f5136l = baseTextView;
    }
}
