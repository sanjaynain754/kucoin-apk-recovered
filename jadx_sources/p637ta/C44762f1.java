package p637ta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: ta.f1 */
/* JADX INFO: compiled from: AssetItemOngoingContractBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44762f1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeConstraintLayout f99880a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RoundImageView f99881b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f99882c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeConstraintLayout f99883d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeTextView f99884e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99885f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99886g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShowHideTextView f99887h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99888i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99889j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99890k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f99891l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ShowHideTextView f99892m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f99893n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ShowHideTextView f99894o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final View f99895p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final View f99896q;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44762f1 m99038a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.ivBg;
        RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i11);
        if (roundImageView != null) {
            i11 = R$id.ivIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) view;
                i11 = R$id.trialTagView;
                ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                if (shapeTextView != null) {
                    i11 = R$id.tvDirection;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvLever;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvLiquidationPrice;
                            ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                            if (showHideTextView != null) {
                                i11 = R$id.tvLiquidationPriceName;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.tvMarkPrice;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        i11 = R$id.tvMarkPriceName;
                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView5 != null) {
                                            i11 = R$id.tvName;
                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView6 != null) {
                                                i11 = R$id.tvProfitLoss;
                                                ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                if (showHideTextView2 != null) {
                                                    i11 = R$id.tvProfitLossName;
                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView7 != null) {
                                                        i11 = R$id.tvProfitLossRate;
                                                        ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (showHideTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_divider))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.view_divider1))) != null) {
                                                            return new C44762f1(shapeConstraintLayout, roundImageView, imageView, shapeConstraintLayout, shapeTextView, baseTextView, baseTextView2, showHideTextView, baseTextView3, baseTextView4, baseTextView5, baseTextView6, showHideTextView2, baseTextView7, showHideTextView3, viewFindChildViewById, viewFindChildViewById2);
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

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C44762f1 m99039c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.asset_item_ongoing_contract, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m99038a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeConstraintLayout getRoot() {
        return this.f99880a;
    }

    public C44762f1(@NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull RoundImageView roundImageView, @NonNull ImageView imageView, @NonNull ShapeConstraintLayout shapeConstraintLayout2, @NonNull ShapeTextView shapeTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull ShowHideTextView showHideTextView2, @NonNull BaseTextView baseTextView7, @NonNull ShowHideTextView showHideTextView3, @NonNull View view, @NonNull View view2) {
        this.f99880a = shapeConstraintLayout;
        this.f99881b = roundImageView;
        this.f99882c = imageView;
        this.f99883d = shapeConstraintLayout2;
        this.f99884e = shapeTextView;
        this.f99885f = baseTextView;
        this.f99886g = baseTextView2;
        this.f99887h = showHideTextView;
        this.f99888i = baseTextView3;
        this.f99889j = baseTextView4;
        this.f99890k = baseTextView5;
        this.f99891l = baseTextView6;
        this.f99892m = showHideTextView2;
        this.f99893n = baseTextView7;
        this.f99894o = showHideTextView3;
        this.f99895p = view;
        this.f99896q = view2;
    }
}
