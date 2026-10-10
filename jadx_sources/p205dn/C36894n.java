package p205dn;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dn.n */
/* JADX INFO: compiled from: LayoutJumioDialogContentManualBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36894n implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81503a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f81504b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f81505c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36894n m82657a(@NonNull View view) {
        int i11 = R$id.tvMaual;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.tvRetry;
            KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton2 != null) {
                return new C36894n((LinearLayout) view, kcPrimaryButton, kcPrimaryButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81503a;
    }

    public C36894n(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2) {
        this.f81503a = linearLayout;
        this.f81504b = kcPrimaryButton;
        this.f81505c = kcPrimaryButton2;
    }
}
