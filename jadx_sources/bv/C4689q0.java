package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.QuoteCompareIndicator;

/* JADX INFO: renamed from: bv.q0 */
/* JADX INFO: compiled from: QuoteViewTradechanceHotrankBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4689q0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4497a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Group f4498b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C4683n0 f4499c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final QuoteCompareIndicator f4500d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f4501e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f4502f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f4503g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f4504h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f4505i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f4506j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f4507k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f4508l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f4509m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4689q0 m4690a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.groupData;
        Group group = (Group) ViewBindings.findChildViewById(view, i11);
        if (group != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.includLayoutEmpty))) != null) {
            C4683n0 c4683n0M4678a = C4683n0.m4678a(viewFindChildViewById);
            i11 = R$id.indicatorCompare;
            QuoteCompareIndicator quoteCompareIndicator = (QuoteCompareIndicator) ViewBindings.findChildViewById(view, i11);
            if (quoteCompareIndicator != null) {
                i11 = R$id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.tvCountDown;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvCountUp;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvHeaderName;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tvHeaderPrice;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tvHeaderRate;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.tvMore;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            i11 = R$id.tvRule;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                i11 = R$id.tvTitle;
                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView8 != null) {
                                                    return new C4689q0((ConstraintLayout) view, group, c4683n0M4678a, quoteCompareIndicator, recyclerView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8);
                                                }
                                            }
                                        }
                                    }
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
        return this.f4497a;
    }

    public C4689q0(@NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull C4683n0 c4683n0, @NonNull QuoteCompareIndicator quoteCompareIndicator, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8) {
        this.f4497a = constraintLayout;
        this.f4498b = group;
        this.f4499c = c4683n0;
        this.f4500d = quoteCompareIndicator;
        this.f4501e = recyclerView;
        this.f4502f = baseTextView;
        this.f4503g = baseTextView2;
        this.f4504h = baseTextView3;
        this.f4505i = baseTextView4;
        this.f4506j = baseTextView5;
        this.f4507k = baseTextView6;
        this.f4508l = baseTextView7;
        this.f4509m = baseTextView8;
    }
}
