package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.g4 */
/* JADX INFO: compiled from: KucoinFragmentDepositBottomButtonBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44773g4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99990a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f99991b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f99992c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f99993d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44773g4 m99062a(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.save_address;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.share_address;
            KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton2 != null) {
                return new C44773g4(linearLayout, linearLayout, kcPrimaryButton, kcPrimaryButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f99990a;
    }

    public C44773g4(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2) {
        this.f99990a = linearLayout;
        this.f99991b = linearLayout2;
        this.f99992c = kcPrimaryButton;
        this.f99993d = kcPrimaryButton2;
    }
}
