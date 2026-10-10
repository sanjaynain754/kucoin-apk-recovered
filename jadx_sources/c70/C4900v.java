package c70;

import android.view.View;
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

/* JADX INFO: renamed from: c70.v */
/* JADX INFO: compiled from: BusercenterLayoutExternalAccountBindV2Binding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4900v implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5345a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f5346b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final EmailPhoneInputView f5347c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f5348d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final NavigationBar f5349e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final NestedScrollView f5350f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f5351g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4900v m5079a(@NonNull View view) {
        int i11 = R$id.btnNext;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.extAccountCreateInputEmailPhone;
            EmailPhoneInputView emailPhoneInputView = (EmailPhoneInputView) ViewBindings.findChildViewById(view, i11);
            if (emailPhoneInputView != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                i11 = R$id.naviBar;
                NavigationBar navigationBar = (NavigationBar) ViewBindings.findChildViewById(view, i11);
                if (navigationBar != null) {
                    i11 = R$id.scrollView;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                    if (nestedScrollView != null) {
                        i11 = R$id.tvBindTips;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            return new C4900v(linearLayoutCompat, kcPrimaryButton, emailPhoneInputView, linearLayoutCompat, navigationBar, nestedScrollView, baseTextView);
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
        return this.f5345a;
    }

    public C4900v(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull EmailPhoneInputView emailPhoneInputView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull NavigationBar navigationBar, @NonNull NestedScrollView nestedScrollView, @NonNull BaseTextView baseTextView) {
        this.f5345a = linearLayoutCompat;
        this.f5346b = kcPrimaryButton;
        this.f5347c = emailPhoneInputView;
        this.f5348d = linearLayoutCompat2;
        this.f5349e = navigationBar;
        this.f5350f = nestedScrollView;
        this.f5351g = baseTextView;
    }
}
