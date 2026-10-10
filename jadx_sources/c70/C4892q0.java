package c70;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kucoin.CountryCodeViewLayout;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.q0 */
/* JADX INFO: compiled from: BusercenterViewEmailPhoneInputBinding.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C4892q0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f5283a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CountryCodeViewLayout f5284b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcTextInputLayout f5285c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4892q0 m5063a(@NonNull View view) {
        int i11 = R$id.countryCodeView;
        CountryCodeViewLayout countryCodeViewLayout = (CountryCodeViewLayout) ViewBindings.findChildViewById(view, i11);
        if (countryCodeViewLayout != null) {
            i11 = R$id.inputLayout;
            KcTextInputLayout kcTextInputLayout = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
            if (kcTextInputLayout != null) {
                return new C4892q0((FrameLayout) view, countryCodeViewLayout, kcTextInputLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f5283a;
    }

    public C4892q0(@NonNull FrameLayout frameLayout, @NonNull CountryCodeViewLayout countryCodeViewLayout, @NonNull KcTextInputLayout kcTextInputLayout) {
        this.f5283a = frameLayout;
        this.f5284b = countryCodeViewLayout;
        this.f5285c = kcTextInputLayout;
    }
}
