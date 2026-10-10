package bv;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: bv.f */
/* JADX INFO: compiled from: FragmentChainFavoriteBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4665f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4314a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f4315b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f4316c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f4317d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f4318e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final C4681m0 f4319f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4665f m4642a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.layout_favorite_no_data;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.tv_action;
                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton != null) {
                    i11 = R$id.tv_holding_status;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_sort))) != null) {
                        return new C4665f((ConstraintLayout) view, linearLayout, recyclerView, kcPrimaryButton, baseTextView, C4681m0.m4674a(viewFindChildViewById));
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
        return this.f4314a;
    }

    public C4665f(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull C4681m0 c4681m0) {
        this.f4314a = constraintLayout;
        this.f4315b = linearLayout;
        this.f4316c = recyclerView;
        this.f4317d = kcPrimaryButton;
        this.f4318e = baseTextView;
        this.f4319f = c4681m0;
    }
}
