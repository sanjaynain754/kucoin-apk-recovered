package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.k3 */
/* JADX INFO: compiled from: PaymentViewFastSellConfirmHeaderBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37645k3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f84175a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f84176b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84177c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37645k3 m84874a(@NonNull View view) {
        int i11 = R$id.tvAmountValue;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tvTitle;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                return new C37645k3(view, baseTextView, baseTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84175a;
    }

    public C37645k3(@NonNull View view, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f84175a = view;
        this.f84176b = baseTextView;
        this.f84177c = baseTextView2;
    }
}
