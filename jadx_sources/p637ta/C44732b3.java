package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.b3 */
/* JADX INFO: compiled from: BassetsViewWithdrawContentKycBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44732b3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99616a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f99617b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f99618c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99619d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f99620e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44732b3 m98974a(@NonNull View view) {
        View viewFindChildViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.tvKycCertification;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tvKycRemainAmount;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_kyc_divider))) != null) {
                return new C44732b3(constraintLayout, constraintLayout, baseTextView, baseTextView2, viewFindChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f99616a;
    }

    public C44732b3(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull View view) {
        this.f99616a = constraintLayout;
        this.f99617b = constraintLayout2;
        this.f99618c = baseTextView;
        this.f99619d = baseTextView2;
        this.f99620e = view;
    }
}
