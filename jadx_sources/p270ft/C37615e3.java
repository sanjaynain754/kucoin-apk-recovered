package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;

/* JADX INFO: renamed from: ft.e3 */
/* JADX INFO: compiled from: PaymentViewFastBuyConfirmTermsBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37615e3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f83843a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KuCheckBox f83844b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f83845c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37615e3 m84812a(@NonNull View view) {
        int i11 = R$id.cbTerms;
        KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
        if (kuCheckBox != null) {
            i11 = R$id.tvTerms;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C37615e3(view, kuCheckBox, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f83843a;
    }

    public C37615e3(@NonNull View view, @NonNull KuCheckBox kuCheckBox, @NonNull BaseTextView baseTextView) {
        this.f83843a = view;
        this.f83844b = kuCheckBox;
        this.f83845c = baseTextView;
    }
}
