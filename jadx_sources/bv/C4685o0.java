package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: bv.o0 */
/* JADX INFO: compiled from: QuoteViewTradechanceGemboxBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4685o0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4469a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C4687p0 f4470b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C4683n0 f4471c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f4472d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f4473e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f4474f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4685o0 m4682a(@NonNull View view) {
        int i11 = R$id.includLayoutCurrency;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C4687p0 c4687p0M4686a = C4687p0.m4686a(viewFindChildViewById);
            i11 = R$id.includLayoutEmpty;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById2 != null) {
                C4683n0 c4683n0M4678a = C4683n0.m4678a(viewFindChildViewById2);
                i11 = R$id.otherList;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.tvMore;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvTitle;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            return new C4685o0((ConstraintLayout) view, c4687p0M4686a, c4683n0M4678a, recyclerView, baseTextView, baseTextView2);
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
        return this.f4469a;
    }

    public C4685o0(@NonNull ConstraintLayout constraintLayout, @NonNull C4687p0 c4687p0, @NonNull C4683n0 c4683n0, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f4469a = constraintLayout;
        this.f4470b = c4687p0;
        this.f4471c = c4683n0;
        this.f4472d = recyclerView;
        this.f4473e = baseTextView;
        this.f4474f = baseTextView2;
    }
}
