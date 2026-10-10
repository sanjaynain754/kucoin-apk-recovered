package l60;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.unify.R$id;

/* JADX INFO: renamed from: l60.e */
/* JADX INFO: compiled from: FragmentUnifyRepayCurrencyBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C42110e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f93483a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f93484b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f93485c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f93486d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcPrimaryButton f93487e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f93488f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FrameLayout f93489g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f93490h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f93491i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AppCompatImageView f93492j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final View f93493k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final View f93494l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f93495m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final RecyclerView f93496n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final RecyclerView f93497o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f93498p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f93499q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f93500r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f93501s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f93502t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f93503u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f93504v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f93505w;

    public C42110e(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull View view4, @NonNull FrameLayout frameLayout, @NonNull View view5, @NonNull View view6, @NonNull AppCompatImageView appCompatImageView, @NonNull View view7, @NonNull View view8, @NonNull BaseTextView baseTextView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9) {
        this.f93483a = linearLayout;
        this.f93484b = view;
        this.f93485c = view2;
        this.f93486d = view3;
        this.f93487e = kcPrimaryButton;
        this.f93488f = view4;
        this.f93489g = frameLayout;
        this.f93490h = view5;
        this.f93491i = view6;
        this.f93492j = appCompatImageView;
        this.f93493k = view7;
        this.f93494l = view8;
        this.f93495m = baseTextView;
        this.f93496n = recyclerView;
        this.f93497o = recyclerView2;
        this.f93498p = baseTextView2;
        this.f93499q = baseTextView3;
        this.f93500r = baseTextView4;
        this.f93501s = baseTextView5;
        this.f93502t = baseTextView6;
        this.f93503u = baseTextView7;
        this.f93504v = baseTextView8;
        this.f93505w = baseTextView9;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42110e m92375a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        View viewFindChildViewById6;
        View viewFindChildViewById7;
        int i11 = R$id.assetBgView;
        View viewFindChildViewById8 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById8 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.assetClickRectView))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.assetDividerView))) != null) {
            i11 = R$id.btnConfirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.dividerView))) != null) {
                i11 = R$id.flAssetCurrencyListView;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i11 = R$id.guideLineAssetView))) != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i11 = R$id.guideLineLiabilityView))) != null) {
                    i11 = R$id.ivLiabilityCurrencyIcon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null && (viewFindChildViewById6 = ViewBindings.findChildViewById(view, (i11 = R$id.liabilityBgView))) != null && (viewFindChildViewById7 = ViewBindings.findChildViewById(view, (i11 = R$id.liabilityClickRectView))) != null) {
                        i11 = R$id.predictAmount;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.rv_assets_icon_group_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                            if (recyclerView != null) {
                                i11 = R$id.rvSelectedAssetDetailView;
                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                if (recyclerView2 != null) {
                                    i11 = R$id.tvAssetCurrencyAmount;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvAssetCurrencyListView;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tvAssetTitle;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.tvEmptyStateWord;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    i11 = R$id.tv_estimate_repay_amount;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        i11 = R$id.tvLiabilityAmount;
                                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView7 != null) {
                                                            i11 = R$id.tvLiabilityCoinAmount;
                                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView8 != null) {
                                                                i11 = R$id.tvLiabilityTitle;
                                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView9 != null) {
                                                                    return new C42110e((LinearLayout) view, viewFindChildViewById8, viewFindChildViewById, viewFindChildViewById2, kcPrimaryButton, viewFindChildViewById3, frameLayout, viewFindChildViewById4, viewFindChildViewById5, appCompatImageView, viewFindChildViewById6, viewFindChildViewById7, baseTextView, recyclerView, recyclerView2, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f93483a;
    }
}
