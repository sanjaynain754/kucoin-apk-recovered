package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.round.widget.RoundLinearLayout;

/* JADX INFO: renamed from: ta.d3 */
/* JADX INFO: compiled from: DepositBottomTipTitleBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44748d3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RoundLinearLayout f99737a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f99738b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f99739c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99740d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f99741e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RoundLinearLayout f99742f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99743g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44748d3 m99010a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.iv_info;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.layout_info;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.minDepositTv;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.minDepositTvDivider))) != null) {
                    RoundLinearLayout roundLinearLayout = (RoundLinearLayout) view;
                    i11 = R$id.tv_info;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C44748d3(roundLinearLayout, imageView, constraintLayout, baseTextView, viewFindChildViewById, roundLinearLayout, baseTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RoundLinearLayout getRoot() {
        return this.f99737a;
    }

    public C44748d3(@NonNull RoundLinearLayout roundLinearLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull View view, @NonNull RoundLinearLayout roundLinearLayout2, @NonNull BaseTextView baseTextView2) {
        this.f99737a = roundLinearLayout;
        this.f99738b = imageView;
        this.f99739c = constraintLayout;
        this.f99740d = baseTextView;
        this.f99741e = view;
        this.f99742f = roundLinearLayout2;
        this.f99743g = baseTextView2;
    }
}
