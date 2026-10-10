package bv;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ChainCoinLogoView;
import com.kubi.resources.widget.ShowHideTextView;

/* JADX INFO: renamed from: bv.j0 */
/* JADX INFO: compiled from: QuoteItemRecommendAlphaBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4675j0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4379a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f4380b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f4381c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ChainCoinLogoView f4382d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f4383e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatCheckBox f4384f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f4385g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShowHideTextView f4386h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4675j0 m4662a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.layoutSymbol;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.logoView;
            ChainCoinLogoView chainCoinLogoView = (ChainCoinLogoView) ViewBindings.findChildViewById(view, i11);
            if (chainCoinLogoView != null) {
                i11 = R$id.price;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.toggle;
                    AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i11);
                    if (appCompatCheckBox != null) {
                        i11 = R$id.tvName;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvPercent;
                            ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                            if (showHideTextView != null) {
                                return new C4675j0(constraintLayout, constraintLayout, linearLayout, chainCoinLogoView, baseTextView, appCompatCheckBox, baseTextView2, showHideTextView);
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
    public ConstraintLayout getRoot() {
        return this.f4379a;
    }

    public C4675j0(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout, @NonNull ChainCoinLogoView chainCoinLogoView, @NonNull BaseTextView baseTextView, @NonNull AppCompatCheckBox appCompatCheckBox, @NonNull BaseTextView baseTextView2, @NonNull ShowHideTextView showHideTextView) {
        this.f4379a = constraintLayout;
        this.f4380b = constraintLayout2;
        this.f4381c = linearLayout;
        this.f4382d = chainCoinLogoView;
        this.f4383e = baseTextView;
        this.f4384f = appCompatCheckBox;
        this.f4385g = baseTextView2;
        this.f4386h = showHideTextView;
    }
}
