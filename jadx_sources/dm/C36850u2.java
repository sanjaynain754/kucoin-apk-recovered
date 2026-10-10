package dm;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.RadioGroupPlus;

/* JADX INFO: renamed from: dm.u2 */
/* JADX INFO: compiled from: BkumexFragmentMarketFuturesInfoBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36850u2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81133a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RadioButton f81134b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RadioButton f81135c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final HorizontalScrollView f81136d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f81137e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RadioGroupPlus f81138f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RadioButton f81139g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RadioButton f81140h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36850u2 m82565a(@NonNull View view) {
        int i11 = R$id.fundingRateRb;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
        if (radioButton != null) {
            i11 = R$id.fundingRateRbInTime;
            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
            if (radioButton2 != null) {
                i11 = R$id.horizontalScrollView;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i11);
                if (horizontalScrollView != null) {
                    i11 = R$id.infoContainerFl;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.rgp;
                        RadioGroupPlus radioGroupPlus = (RadioGroupPlus) ViewBindings.findChildViewById(view, i11);
                        if (radioGroupPlus != null) {
                            i11 = R$id.riskLimitRb;
                            RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                            if (radioButton3 != null) {
                                i11 = R$id.tradeRulesRb;
                                RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                if (radioButton4 != null) {
                                    return new C36850u2((ConstraintLayout) view, radioButton, radioButton2, horizontalScrollView, frameLayout, radioGroupPlus, radioButton3, radioButton4);
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
    public ConstraintLayout getRoot() {
        return this.f81133a;
    }

    public C36850u2(@NonNull ConstraintLayout constraintLayout, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull HorizontalScrollView horizontalScrollView, @NonNull FrameLayout frameLayout, @NonNull RadioGroupPlus radioGroupPlus, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4) {
        this.f81133a = constraintLayout;
        this.f81134b = radioButton;
        this.f81135c = radioButton2;
        this.f81136d = horizontalScrollView;
        this.f81137e = frameLayout;
        this.f81138f = radioGroupPlus;
        this.f81139g = radioButton3;
        this.f81140h = radioButton4;
    }
}
