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

/* JADX INFO: renamed from: ta.l1 */
/* JADX INFO: compiled from: AssetItemOngoingLeadtradingBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44810l1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeConstraintLayout f100350a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RoundImageView f100351b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f100352c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeConstraintLayout f100353d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100354e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100355f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ShowHideTextView f100356g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100357h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f100358i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f100359j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f100360k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShowHideTextView f100361l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f100362m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final ShowHideTextView f100363n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final View f100364o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final View f100365p;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44810l1 m99140a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.ivBg;
        RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i11);
        if (roundImageView != null) {
            i11 = R$id.ivIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                ShapeConstraintLayout shapeConstraintLayout = (ShapeConstraintLayout) view;
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
                                                        return new C44810l1(shapeConstraintLayout, roundImageView, imageView, shapeConstraintLayout, baseTextView, baseTextView2, showHideTextView, baseTextView3, baseTextView4, baseTextView5, baseTextView6, showHideTextView2, baseTextView7, showHideTextView3, viewFindChildViewById, viewFindChildViewById2);
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
    public static C44810l1 m99141c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.asset_item_ongoing_leadtrading, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m99140a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeConstraintLayout getRoot() {
        return this.f100350a;
    }

    public C44810l1(@NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull RoundImageView roundImageView, @NonNull ImageView imageView, @NonNull ShapeConstraintLayout shapeConstraintLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull ShowHideTextView showHideTextView2, @NonNull BaseTextView baseTextView7, @NonNull ShowHideTextView showHideTextView3, @NonNull View view, @NonNull View view2) {
        this.f100350a = shapeConstraintLayout;
        this.f100351b = roundImageView;
        this.f100352c = imageView;
        this.f100353d = shapeConstraintLayout2;
        this.f100354e = baseTextView;
        this.f100355f = baseTextView2;
        this.f100356g = showHideTextView;
        this.f100357h = baseTextView3;
        this.f100358i = baseTextView4;
        this.f100359j = baseTextView5;
        this.f100360k = baseTextView6;
        this.f100361l = showHideTextView2;
        this.f100362m = baseTextView7;
        this.f100363n = showHideTextView3;
        this.f100364o = view;
        this.f100365p = view2;
    }
}
