package k00;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.res.R$id;

/* JADX INFO: renamed from: k00.f */
/* JADX INFO: compiled from: KucoinAlertDialogButtonHorizontalBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40842f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f90750a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f90751b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcSecondaryButton f90752c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f90753d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40842f m89381a(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.tv_left_btn;
        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcSecondaryButton != null) {
            i11 = R$id.tv_right_btn;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                return new C40842f(linearLayout, linearLayout, kcSecondaryButton, kcPrimaryButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f90750a;
    }

    public C40842f(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f90750a = linearLayout;
        this.f90751b = linearLayout2;
        this.f90752c = kcSecondaryButton;
        this.f90753d = kcPrimaryButton;
    }
}
