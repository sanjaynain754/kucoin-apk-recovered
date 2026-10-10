package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.bizshimmer.HomeShimmerHalfCard;

/* JADX INFO: renamed from: bv.w0 */
/* JADX INFO: compiled from: QuoteWidgetFearGreedBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4701w0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f4589a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f4590b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final MaterialCardView f4591c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Group f4592d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f4593e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f4594f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f4595g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final HomeShimmerHalfCard f4596h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayoutCompat f4597i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ReloadRefreshView f4598j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f4599k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f4600l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f4601m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f4602n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f4603o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4701w0 m4714a(@NonNull View view) {
        int i11 = R$id.bgViewBottom;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            MaterialCardView materialCardView = (MaterialCardView) view;
            i11 = R$id.groupContent;
            Group group = (Group) ViewBindings.findChildViewById(view, i11);
            if (group != null) {
                i11 = R$id.indexBg;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.indexIndictor;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView2 != null) {
                        i11 = R$id.layoutProgress;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout != null) {
                            i11 = R$id.layoutShimmer;
                            HomeShimmerHalfCard homeShimmerHalfCard = (HomeShimmerHalfCard) ViewBindings.findChildViewById(view, i11);
                            if (homeShimmerHalfCard != null) {
                                i11 = R$id.layoutYesterday;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                if (linearLayoutCompat != null) {
                                    i11 = R$id.reloadView;
                                    ReloadRefreshView reloadRefreshView = (ReloadRefreshView) ViewBindings.findChildViewById(view, i11);
                                    if (reloadRefreshView != null) {
                                        i11 = R$id.tvScore;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.tvStatus;
                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView2 != null) {
                                                i11 = R$id.tvTitle;
                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView3 != null) {
                                                    i11 = R$id.tvYesterday;
                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView4 != null) {
                                                        i11 = R$id.tvYesterdayValue;
                                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView5 != null) {
                                                            return new C4701w0(materialCardView, viewFindChildViewById, materialCardView, group, appCompatImageView, appCompatImageView2, constraintLayout, homeShimmerHalfCard, linearLayoutCompat, reloadRefreshView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f4589a;
    }

    public C4701w0(@NonNull MaterialCardView materialCardView, @NonNull View view, @NonNull MaterialCardView materialCardView2, @NonNull Group group, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull ConstraintLayout constraintLayout, @NonNull HomeShimmerHalfCard homeShimmerHalfCard, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ReloadRefreshView reloadRefreshView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5) {
        this.f4589a = materialCardView;
        this.f4590b = view;
        this.f4591c = materialCardView2;
        this.f4592d = group;
        this.f4593e = appCompatImageView;
        this.f4594f = appCompatImageView2;
        this.f4595g = constraintLayout;
        this.f4596h = homeShimmerHalfCard;
        this.f4597i = linearLayoutCompat;
        this.f4598j = reloadRefreshView;
        this.f4599k = baseTextView;
        this.f4600l = baseTextView2;
        this.f4601m = baseTextView3;
        this.f4602n = baseTextView4;
        this.f4603o = baseTextView5;
    }
}
