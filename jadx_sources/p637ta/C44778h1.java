package p637ta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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

/* JADX INFO: renamed from: ta.h1 */
/* JADX INFO: compiled from: AssetItemOngoingCrossBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44778h1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeConstraintLayout f100015a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f100016b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RoundImageView f100017c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f100018d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100019e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ShowHideTextView f100020f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100021g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShowHideTextView f100022h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44778h1 m99072a(@NonNull View view) {
        int i11 = R$id.container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.ivBg;
            RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i11);
            if (roundImageView != null) {
                i11 = R$id.riskView;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null) {
                    i11 = R$id.tvName;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvProfitLoss;
                        ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                        if (showHideTextView != null) {
                            i11 = R$id.tvProfitLossName;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tvProfitLossRate;
                                ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                if (showHideTextView2 != null) {
                                    return new C44778h1((ShapeConstraintLayout) view, linearLayout, roundImageView, frameLayout, baseTextView, showHideTextView, baseTextView2, showHideTextView2);
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
    public static C44778h1 m99073c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.asset_item_ongoing_cross, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m99072a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeConstraintLayout getRoot() {
        return this.f100015a;
    }

    public C44778h1(@NonNull ShapeConstraintLayout shapeConstraintLayout, @NonNull LinearLayout linearLayout, @NonNull RoundImageView roundImageView, @NonNull FrameLayout frameLayout, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView2, @NonNull ShowHideTextView showHideTextView2) {
        this.f100015a = shapeConstraintLayout;
        this.f100016b = linearLayout;
        this.f100017c = roundImageView;
        this.f100018d = frameLayout;
        this.f100019e = baseTextView;
        this.f100020f = showHideTextView;
        this.f100021g = baseTextView2;
        this.f100022h = showHideTextView2;
    }
}
