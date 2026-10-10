package bv;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.UpdownCompareIndicator;
import com.kubi.resources.widget.bizshimmer.HomeShimmerHalfCard;

/* JADX INFO: renamed from: bv.u0 */
/* JADX INFO: compiled from: QuoteWidgetEmotionBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4697u0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f4544a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final UpdownCompareIndicator f4545b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final MaterialCardView f4546c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Group f4547d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final HomeShimmerHalfCard f4548e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f4549f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayoutCompat f4550g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ReloadRefreshView f4551h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f4552i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f4553j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f4554k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f4555l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f4556m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f4557n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f4558o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4697u0 m4706a(@NonNull View view) {
        int i11 = R$id.compareIndicator;
        UpdownCompareIndicator updownCompareIndicator = (UpdownCompareIndicator) ViewBindings.findChildViewById(view, i11);
        if (updownCompareIndicator != null) {
            MaterialCardView materialCardView = (MaterialCardView) view;
            i11 = R$id.groupContent;
            Group group = (Group) ViewBindings.findChildViewById(view, i11);
            if (group != null) {
                i11 = R$id.layoutShimmer;
                HomeShimmerHalfCard homeShimmerHalfCard = (HomeShimmerHalfCard) ViewBindings.findChildViewById(view, i11);
                if (homeShimmerHalfCard != null) {
                    i11 = R$id.layoutTopDown;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat != null) {
                        i11 = R$id.layoutTopUp;
                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                        if (linearLayoutCompat2 != null) {
                            i11 = R$id.reloadView;
                            ReloadRefreshView reloadRefreshView = (ReloadRefreshView) ViewBindings.findChildViewById(view, i11);
                            if (reloadRefreshView != null) {
                                i11 = R$id.tvDownCount;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tvTitle;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvTopDownName;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tvTopDownRate;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.tvTopUpName;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    i11 = R$id.tvTopUpRate;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        i11 = R$id.tvUpCount;
                                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView7 != null) {
                                                            return new C4697u0(materialCardView, updownCompareIndicator, materialCardView, group, homeShimmerHalfCard, linearLayoutCompat, linearLayoutCompat2, reloadRefreshView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7);
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
        return this.f4544a;
    }

    public C4697u0(@NonNull MaterialCardView materialCardView, @NonNull UpdownCompareIndicator updownCompareIndicator, @NonNull MaterialCardView materialCardView2, @NonNull Group group, @NonNull HomeShimmerHalfCard homeShimmerHalfCard, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull ReloadRefreshView reloadRefreshView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7) {
        this.f4544a = materialCardView;
        this.f4545b = updownCompareIndicator;
        this.f4546c = materialCardView2;
        this.f4547d = group;
        this.f4548e = homeShimmerHalfCard;
        this.f4549f = linearLayoutCompat;
        this.f4550g = linearLayoutCompat2;
        this.f4551h = reloadRefreshView;
        this.f4552i = baseTextView;
        this.f4553j = baseTextView2;
        this.f4554k = baseTextView3;
        this.f4555l = baseTextView4;
        this.f4556m = baseTextView5;
        this.f4557n = baseTextView6;
        this.f4558o = baseTextView7;
    }
}
