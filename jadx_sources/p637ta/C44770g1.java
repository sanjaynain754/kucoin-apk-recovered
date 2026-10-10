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

/* JADX INFO: renamed from: ta.g1 */
/* JADX INFO: compiled from: AssetItemOngoingCopytradingBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44770g1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeConstraintLayout f99955a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RoundImageView f99956b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f99957c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShowHideTextView f99958d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99959e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ShowHideTextView f99960f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99961g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99962h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShowHideTextView f99963i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99964j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ShowHideTextView f99965k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44770g1 m99055a(@NonNull View view) {
        int i11 = R$id.ivBg;
        RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i11);
        if (roundImageView != null) {
            i11 = R$id.ivIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.tvCopyTime;
                ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                if (showHideTextView != null) {
                    i11 = R$id.tvCopyTimeName;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvInvestment;
                        ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                        if (showHideTextView2 != null) {
                            i11 = R$id.tvInvestmentName;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tvName;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.tvProfitLoss;
                                    ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                    if (showHideTextView3 != null) {
                                        i11 = R$id.tvProfitLossName;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tvProfitLossRate;
                                            ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                            if (showHideTextView4 != null) {
                                                return new C44770g1((ShapeConstraintLayout) view, roundImageView, imageView, showHideTextView, baseTextView, showHideTextView2, baseTextView2, baseTextView3, showHideTextView3, baseTextView4, showHideTextView4);
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
    public static C44770g1 m99056c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.asset_item_ongoing_copytrading, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m99055a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeConstraintLayout getRoot() {
        return this.f99955a;
    }

    public C44770g1(@NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull RoundImageView roundImageView, @NonNull ImageView imageView, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull ShowHideTextView showHideTextView3, @NonNull BaseTextView baseTextView4, @NonNull ShowHideTextView showHideTextView4) {
        this.f99955a = shapeConstraintLayout;
        this.f99956b = roundImageView;
        this.f99957c = imageView;
        this.f99958d = showHideTextView;
        this.f99959e = baseTextView;
        this.f99960f = showHideTextView2;
        this.f99961g = baseTextView2;
        this.f99962h = baseTextView3;
        this.f99963i = showHideTextView3;
        this.f99964j = baseTextView4;
        this.f99965k = showHideTextView4;
    }
}
