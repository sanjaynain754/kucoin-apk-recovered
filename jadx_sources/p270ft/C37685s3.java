package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.s3 */
/* JADX INFO: compiled from: PaymentViewPaymentMethodsPopularPayBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37685s3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84624a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f84625b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f84626c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84627d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84628e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37685s3 m84961a(@NonNull View view) {
        int i11 = R$id.layout_popular_pay;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.ll_popular_pay;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.tv_category_name;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_category_tips;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C37685s3((ConstraintLayout) view, constraintLayout, linearLayoutCompat, baseTextView, baseTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84624a;
    }

    public C37685s3(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f84624a = constraintLayout;
        this.f84625b = constraintLayout2;
        this.f84626c = linearLayoutCompat;
        this.f84627d = baseTextView;
        this.f84628e = baseTextView2;
    }
}
