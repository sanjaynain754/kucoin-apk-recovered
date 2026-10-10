package gq;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: gq.n */
/* JADX INFO: compiled from: KucoinFragmentPermissionSettingsBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37993n implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f85554a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f85555b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37993n m85861a(@NonNull View view) {
        int i11 = R$id.goto_system_settings;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            return new C37993n((LinearLayout) view, kcPrimaryButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f85554a;
    }

    public C37993n(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f85554a = linearLayout;
        this.f85555b = kcPrimaryButton;
    }
}
