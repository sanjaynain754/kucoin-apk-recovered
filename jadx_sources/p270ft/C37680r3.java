package p270ft;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.r3 */
/* JADX INFO: compiled from: PaymentViewPaymentMethodsP2pBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37680r3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84596a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f84597b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f84598c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f84599d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f84600e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f84601f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84602g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84603h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84604i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37680r3 m84949a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.iv_p2p_view_more;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.layout_p2p;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.ll_p2p;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.ll_p2p_view_more;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.p2p_divider))) != null) {
                        i11 = R$id.tv_category_name;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_category_tips;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tv_p2p_view_more;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    return new C37680r3((ConstraintLayout) view, appCompatImageView, constraintLayout, linearLayoutCompat, linearLayout, viewFindChildViewById, baseTextView, baseTextView2, baseTextView3);
                                }
                            }
                        }
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
        return this.f84596a;
    }

    public C37680r3(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f84596a = constraintLayout;
        this.f84597b = appCompatImageView;
        this.f84598c = constraintLayout2;
        this.f84599d = linearLayoutCompat;
        this.f84600e = linearLayout;
        this.f84601f = view;
        this.f84602g = baseTextView;
        this.f84603h = baseTextView2;
        this.f84604i = baseTextView3;
    }
}
