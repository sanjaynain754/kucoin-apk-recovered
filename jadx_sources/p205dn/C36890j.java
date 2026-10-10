package p205dn;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dn.j */
/* JADX INFO: compiled from: DialogJumioRetryContentBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36890j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81473a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Button f81474b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f81475c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36890j m82649a(@NonNull View view) {
        int i11 = R$id.btn_cancel;
        Button button = (Button) ViewBindings.findChildViewById(view, i11);
        if (button != null) {
            i11 = R$id.btn_retry;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                return new C36890j((LinearLayout) view, button, kcPrimaryButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81473a;
    }

    public C36890j(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f81473a = linearLayout;
        this.f81474b = button;
        this.f81475c = kcPrimaryButton;
    }
}
