package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: bv.k0 */
/* JADX INFO: compiled from: QuoteItemViewRankSortBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4677k0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4398a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f4399b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f4400c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f4401d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f4402e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f4403f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Group f4404g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatImageView f4405h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f4406i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f4407j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f4408k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final Group f4409l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f4410m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f4411n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f4412o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4677k0 m4666a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.fl_change_rate;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.fl_price))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.ll_name))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.margin_view;
            View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById4 != null) {
                i11 = R$id.market_group;
                Group group = (Group) ViewBindings.findChildViewById(view, i11);
                if (group != null) {
                    i11 = R$id.market_label;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.market_type;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_line;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tv_name;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.tv_rank_group;
                                    Group group2 = (Group) ViewBindings.findChildViewById(view, i11);
                                    if (group2 != null) {
                                        i11 = R$id.tv_sort_change_rate;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tv_sort_price;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tv_vol;
                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView6 != null) {
                                                    return new C4677k0(constraintLayout, viewFindChildViewById3, viewFindChildViewById, viewFindChildViewById2, constraintLayout, viewFindChildViewById4, group, appCompatImageView, baseTextView, baseTextView2, baseTextView3, group2, baseTextView4, baseTextView5, baseTextView6);
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
        return this.f4398a;
    }

    public C4677k0(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull ConstraintLayout constraintLayout2, @NonNull View view4, @NonNull Group group, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull Group group2, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f4398a = constraintLayout;
        this.f4399b = view;
        this.f4400c = view2;
        this.f4401d = view3;
        this.f4402e = constraintLayout2;
        this.f4403f = view4;
        this.f4404g = group;
        this.f4405h = appCompatImageView;
        this.f4406i = baseTextView;
        this.f4407j = baseTextView2;
        this.f4408k = baseTextView3;
        this.f4409l = group2;
        this.f4410m = baseTextView4;
        this.f4411n = baseTextView5;
        this.f4412o = baseTextView6;
    }
}
