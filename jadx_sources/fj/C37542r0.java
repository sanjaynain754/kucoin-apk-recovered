package fj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: fj.r0 */
/* JADX INFO: compiled from: KucoinLayoutCardsNoDataBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C37542r0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f83404a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f83405b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37542r0 m84552a(@NonNull View view) {
        int i11 = R$id.card_retry;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            return new C37542r0((LinearLayout) view, kcPrimaryButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f83404a;
    }

    public C37542r0(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f83404a = linearLayout;
        this.f83405b = kcPrimaryButton;
    }
}
