package c70;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.user.R$id;
import com.kubi.user.view.EmailPhoneInputView;

/* JADX INFO: renamed from: c70.u */
/* JADX INFO: compiled from: BusercenterLayoutExternalAccountBindDisableBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4899u implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5337a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f5338b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final EmailPhoneInputView f5339c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f5340d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f5341e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final NavigationBar f5342f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final NestedScrollView f5343g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f5344h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4899u m5077a(@NonNull View view) {
        int i11 = R$id.changeBind;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.extAccountCreateInputEmailPhone;
            EmailPhoneInputView emailPhoneInputView = (EmailPhoneInputView) ViewBindings.findChildViewById(view, i11);
            if (emailPhoneInputView != null) {
                i11 = R$id.goToLogin;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                    i11 = R$id.naviBar;
                    NavigationBar navigationBar = (NavigationBar) ViewBindings.findChildViewById(view, i11);
                    if (navigationBar != null) {
                        i11 = R$id.scrollView;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                        if (nestedScrollView != null) {
                            i11 = R$id.tvBindTips;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                return new C4899u(linearLayoutCompat, baseTextView, emailPhoneInputView, baseTextView2, linearLayoutCompat, navigationBar, nestedScrollView, baseTextView3);
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
        return this.f5337a;
    }

    public C4899u(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull EmailPhoneInputView emailPhoneInputView, @NonNull BaseTextView baseTextView2, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull NavigationBar navigationBar, @NonNull NestedScrollView nestedScrollView, @NonNull BaseTextView baseTextView3) {
        this.f5337a = linearLayoutCompat;
        this.f5338b = baseTextView;
        this.f5339c = emailPhoneInputView;
        this.f5340d = baseTextView2;
        this.f5341e = linearLayoutCompat2;
        this.f5342f = navigationBar;
        this.f5343g = nestedScrollView;
        this.f5344h = baseTextView3;
    }
}
