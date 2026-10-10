package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: bv.r0 */
/* JADX INFO: compiled from: QuoteViewTradechanceMarketchangeBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4691r0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4518a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C4683n0 f4519b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f4520c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f4521d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f4522e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4691r0 m4694a(@NonNull View view) {
        int i11 = R$id.includLayoutEmpty;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C4683n0 c4683n0M4678a = C4683n0.m4678a(viewFindChildViewById);
            i11 = R$id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.tvMore;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvTitle;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C4691r0((ConstraintLayout) view, c4683n0M4678a, recyclerView, baseTextView, baseTextView2);
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
        return this.f4518a;
    }

    public C4691r0(@NonNull ConstraintLayout constraintLayout, @NonNull C4683n0 c4683n0, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f4518a = constraintLayout;
        this.f4519b = c4683n0;
        this.f4520c = recyclerView;
        this.f4521d = baseTextView;
        this.f4522e = baseTextView2;
    }
}
