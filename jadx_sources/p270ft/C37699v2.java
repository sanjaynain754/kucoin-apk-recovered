package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;

/* JADX INFO: renamed from: ft.v2 */
/* JADX INFO: compiled from: PaymentViewBuyFluctuationTermsBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37699v2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f84767a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KuCheckBox f84768b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84769c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37699v2 m84988a(@NonNull View view) {
        int i11 = R$id.cbTerms;
        KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
        if (kuCheckBox != null) {
            i11 = R$id.tvTerms;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C37699v2(view, kuCheckBox, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84767a;
    }

    public C37699v2(@NonNull View view, @NonNull KuCheckBox kuCheckBox, @NonNull BaseTextView baseTextView) {
        this.f84767a = view;
        this.f84768b = kuCheckBox;
        this.f84769c = baseTextView;
    }
}
