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

/* JADX INFO: renamed from: ta.n1 */
/* JADX INFO: compiled from: AssetItemOngoingRobotBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44824n1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeConstraintLayout f100478a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RoundImageView f100479b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f100480c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShowHideTextView f100481d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100482e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100483f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ShowHideTextView f100484g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100485h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShowHideTextView f100486i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f100487j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final View f100488k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44824n1 m99173a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.ivBg;
        RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i11);
        if (roundImageView != null) {
            i11 = R$id.ivIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.tvInvestment;
                ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                if (showHideTextView != null) {
                    i11 = R$id.tvInvestmentName;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvName;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvProfitLoss;
                            ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                            if (showHideTextView2 != null) {
                                i11 = R$id.tvProfitLossName;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.tvProfitLossRate;
                                    ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                    if (showHideTextView3 != null) {
                                        i11 = R$id.tvType;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_divider))) != null) {
                                            return new C44824n1((ShapeConstraintLayout) view, roundImageView, imageView, showHideTextView, baseTextView, baseTextView2, showHideTextView2, baseTextView3, showHideTextView3, baseTextView4, viewFindChildViewById);
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
    public static C44824n1 m99174c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.asset_item_ongoing_robot, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m99173a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeConstraintLayout getRoot() {
        return this.f100478a;
    }

    public C44824n1(@NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull RoundImageView roundImageView, @NonNull ImageView imageView, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull ShowHideTextView showHideTextView2, @NonNull BaseTextView baseTextView3, @NonNull ShowHideTextView showHideTextView3, @NonNull BaseTextView baseTextView4, @NonNull View view) {
        this.f100478a = shapeConstraintLayout;
        this.f100479b = roundImageView;
        this.f100480c = imageView;
        this.f100481d = showHideTextView;
        this.f100482e = baseTextView;
        this.f100483f = baseTextView2;
        this.f100484g = showHideTextView2;
        this.f100485h = baseTextView3;
        this.f100486i = showHideTextView3;
        this.f100487j = baseTextView4;
        this.f100488k = view;
    }
}
