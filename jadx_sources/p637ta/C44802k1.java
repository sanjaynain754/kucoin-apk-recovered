package p637ta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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

/* JADX INFO: renamed from: ta.k1 */
/* JADX INFO: compiled from: AssetItemOngoingIsolatedBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44802k1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeConstraintLayout f100279a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RoundImageView f100280b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f100281c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f100282d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShowHideTextView f100283e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100284f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100285g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100286h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f100287i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShowHideTextView f100288j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f100289k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShowHideTextView f100290l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44802k1 m99123a(@NonNull View view) {
        int i11 = R$id.ivBg;
        RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i11);
        if (roundImageView != null) {
            i11 = R$id.ivIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.riskView;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null) {
                    i11 = R$id.tvLiquidationPrice;
                    ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                    if (showHideTextView != null) {
                        i11 = R$id.tvLiquidationPriceName;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tvMarkPrice;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tvMarkPriceName;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.tvName;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        i11 = R$id.tvProfitLoss;
                                        ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                        if (showHideTextView2 != null) {
                                            i11 = R$id.tvProfitLossName;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tvProfitLossRate;
                                                ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                if (showHideTextView3 != null) {
                                                    return new C44802k1((ShapeConstraintLayout) view, roundImageView, imageView, frameLayout, showHideTextView, baseTextView, baseTextView2, baseTextView3, baseTextView4, showHideTextView2, baseTextView5, showHideTextView3);
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
    public static C44802k1 m99124c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.asset_item_ongoing_isolated, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m99123a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeConstraintLayout getRoot() {
        return this.f100279a;
    }

    public C44802k1(@NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull RoundImageView roundImageView, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull ShowHideTextView showHideTextView2, @NonNull BaseTextView baseTextView5, @NonNull ShowHideTextView showHideTextView3) {
        this.f100279a = shapeConstraintLayout;
        this.f100280b = roundImageView;
        this.f100281c = imageView;
        this.f100282d = frameLayout;
        this.f100283e = showHideTextView;
        this.f100284f = baseTextView;
        this.f100285g = baseTextView2;
        this.f100286h = baseTextView3;
        this.f100287i = baseTextView4;
        this.f100288j = showHideTextView2;
        this.f100289k = baseTextView5;
        this.f100290l = showHideTextView3;
    }
}
