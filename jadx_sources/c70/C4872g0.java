package c70;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kucoin.CountryCodeViewLayout;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.g0 */
/* JADX INFO: compiled from: BusercenterLayoutSignupByPhoneBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4872g0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f5121a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CountryCodeViewLayout f5122b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcTextInputLayout f5123c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f5124d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4872g0 m5022a(@NonNull View view) {
        int i11 = R$id.countryCodeView;
        CountryCodeViewLayout countryCodeViewLayout = (CountryCodeViewLayout) ViewBindings.findChildViewById(view, i11);
        if (countryCodeViewLayout != null) {
            i11 = R$id.inputPhone;
            KcTextInputLayout kcTextInputLayout = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
            if (kcTextInputLayout != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new C4872g0(frameLayout, countryCodeViewLayout, kcTextInputLayout, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f5121a;
    }

    public C4872g0(@NonNull FrameLayout frameLayout, @NonNull CountryCodeViewLayout countryCodeViewLayout, @NonNull KcTextInputLayout kcTextInputLayout, @NonNull FrameLayout frameLayout2) {
        this.f5121a = frameLayout;
        this.f5122b = countryCodeViewLayout;
        this.f5123c = kcTextInputLayout;
        this.f5124d = frameLayout2;
    }
}
