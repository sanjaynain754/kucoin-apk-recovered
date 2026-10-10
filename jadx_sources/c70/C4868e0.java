package c70;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.e0 */
/* JADX INFO: compiled from: BusercenterLayoutSignupByEmailBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4868e0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f5079a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcTextInputLayout f5080b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f5081c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4868e0 m5014a(@NonNull View view) {
        int i11 = R$id.inputEmail;
        KcTextInputLayout kcTextInputLayout = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
        if (kcTextInputLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new C4868e0(linearLayout, kcTextInputLayout, linearLayout);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f5079a;
    }

    public C4868e0(@NonNull LinearLayout linearLayout, @NonNull KcTextInputLayout kcTextInputLayout, @NonNull LinearLayout linearLayout2) {
        this.f5079a = linearLayout;
        this.f5080b = kcTextInputLayout;
        this.f5081c = linearLayout2;
    }
}
