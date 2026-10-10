package c70;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.e */
/* JADX INFO: compiled from: BusercenterFragmentBindEmailBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4867e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final NestedScrollView f5076a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f5077b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcTextInputLayout f5078c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4867e m5012a(@NonNull View view) {
        int i11 = R$id.btnConfirm;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.inputBindEmail;
            KcTextInputLayout kcTextInputLayout = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
            if (kcTextInputLayout != null) {
                return new C4867e((NestedScrollView) view, kcPrimaryButton, kcTextInputLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f5076a;
    }

    public C4867e(@NonNull NestedScrollView nestedScrollView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcTextInputLayout kcTextInputLayout) {
        this.f5076a = nestedScrollView;
        this.f5077b = kcPrimaryButton;
        this.f5078c = kcTextInputLayout;
    }
}
