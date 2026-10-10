package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.bizshimmer.HomeShimmerFullCard;

/* JADX INFO: renamed from: bv.x0 */
/* JADX INFO: compiled from: QuoteWidgetFearGreedFullBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4703x0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f4609a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f4610b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f4611c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final MaterialCardView f4612d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Group f4613e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f4614f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f4615g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f4616h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final HomeShimmerFullCard f4617i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ReloadRefreshView f4618j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f4619k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f4620l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f4621m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f4622n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f4623o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f4624p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f4625q;

    public C4703x0(@NonNull MaterialCardView materialCardView, @NonNull Barrier barrier, @NonNull View view, @NonNull MaterialCardView materialCardView2, @NonNull Group group, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull ConstraintLayout constraintLayout, @NonNull HomeShimmerFullCard homeShimmerFullCard, @NonNull ReloadRefreshView reloadRefreshView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7) {
        this.f4609a = materialCardView;
        this.f4610b = barrier;
        this.f4611c = view;
        this.f4612d = materialCardView2;
        this.f4613e = group;
        this.f4614f = appCompatImageView;
        this.f4615g = appCompatImageView2;
        this.f4616h = constraintLayout;
        this.f4617i = homeShimmerFullCard;
        this.f4618j = reloadRefreshView;
        this.f4619k = baseTextView;
        this.f4620l = baseTextView2;
        this.f4621m = baseTextView3;
        this.f4622n = baseTextView4;
        this.f4623o = baseTextView5;
        this.f4624p = baseTextView6;
        this.f4625q = baseTextView7;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4703x0 m4718a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.barrierScoreStart;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.bgViewBottom))) != null) {
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
                            HomeShimmerFullCard homeShimmerFullCard = (HomeShimmerFullCard) ViewBindings.findChildViewById(view, i11);
                            if (homeShimmerFullCard != null) {
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
                                                i11 = R$id.tvWeekAgoLabel;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.tvWeekAgoScore;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        i11 = R$id.tvYesterdayLabel;
                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView6 != null) {
                                                            i11 = R$id.tvYesterdayScore;
                                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView7 != null) {
                                                                return new C4703x0(materialCardView, barrier, viewFindChildViewById, materialCardView, group, appCompatImageView, appCompatImageView2, constraintLayout, homeShimmerFullCard, reloadRefreshView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f4609a;
    }
}
