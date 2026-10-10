package c70;

import android.view.View;
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

/* JADX INFO: renamed from: c70.w */
/* JADX INFO: compiled from: BusercenterLayoutExternalAccountBindV2PasswordBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4901w implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5352a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C4870f0 f5353b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f5354c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final EmailPhoneInputView f5355d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f5356e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f5357f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final NavigationBar f5358g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final NestedScrollView f5359h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f5360i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f5361j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f5362k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4901w m5081a(@NonNull View view) {
        int i11 = R$id.bindingPwd;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C4870f0 c4870f0M5018a = C4870f0.m5018a(viewFindChildViewById);
            i11 = R$id.btnNext;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.extAccountCreateInputEmailPhone;
                EmailPhoneInputView emailPhoneInputView = (EmailPhoneInputView) ViewBindings.findChildViewById(view, i11);
                if (emailPhoneInputView != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                    i11 = R$id.llPwd;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.naviBar;
                        NavigationBar navigationBar = (NavigationBar) ViewBindings.findChildViewById(view, i11);
                        if (navigationBar != null) {
                            i11 = R$id.scrollView;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                            if (nestedScrollView != null) {
                                i11 = R$id.tvBindTips;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tvBindTitle;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvForgetPwd;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            return new C4901w(linearLayoutCompat, c4870f0M5018a, kcPrimaryButton, emailPhoneInputView, linearLayoutCompat, linearLayout, navigationBar, nestedScrollView, baseTextView, baseTextView2, baseTextView3);
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
        return this.f5352a;
    }

    public C4901w(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull C4870f0 c4870f0, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull EmailPhoneInputView emailPhoneInputView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayout linearLayout, @NonNull NavigationBar navigationBar, @NonNull NestedScrollView nestedScrollView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f5352a = linearLayoutCompat;
        this.f5353b = c4870f0;
        this.f5354c = kcPrimaryButton;
        this.f5355d = emailPhoneInputView;
        this.f5356e = linearLayoutCompat2;
        this.f5357f = linearLayout;
        this.f5358g = navigationBar;
        this.f5359h = nestedScrollView;
        this.f5360i = baseTextView;
        this.f5361j = baseTextView2;
        this.f5362k = baseTextView3;
    }
}
