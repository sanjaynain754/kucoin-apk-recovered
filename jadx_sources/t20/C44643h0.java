package t20;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.h0 */
/* JADX INFO: compiled from: IncludeTradeInputBaseQuoteValueBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44643h0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f99099a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f99100b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f99101c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f99102d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final DashTextView f99103e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99104f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99105g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final DashTextView f99106h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99107i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final DashTextView f99108j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44643h0 m98763a(@NonNull View view) {
        int i11 = R$id.flAvailableTrade;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.flBase;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout2 != null) {
                i11 = R$id.flQuote;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout3 != null) {
                    i11 = R$id.tvAvailableTradeLabel;
                    DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                    if (dashTextView != null) {
                        i11 = R$id.tvAvailableTradeValue;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_base_amount;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tv_base_unit;
                                DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                if (dashTextView2 != null) {
                                    i11 = R$id.tv_quote_amount;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tv_quote_unit;
                                        DashTextView dashTextView3 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                        if (dashTextView3 != null) {
                                            return new C44643h0(view, constraintLayout, constraintLayout2, constraintLayout3, dashTextView, baseTextView, baseTextView2, dashTextView2, baseTextView3, dashTextView3);
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
    public View getRoot() {
        return this.f99099a;
    }

    public C44643h0(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull DashTextView dashTextView2, @NonNull BaseTextView baseTextView3, @NonNull DashTextView dashTextView3) {
        this.f99099a = view;
        this.f99100b = constraintLayout;
        this.f99101c = constraintLayout2;
        this.f99102d = constraintLayout3;
        this.f99103e = dashTextView;
        this.f99104f = baseTextView;
        this.f99105g = baseTextView2;
        this.f99106h = dashTextView2;
        this.f99107i = baseTextView3;
        this.f99108j = dashTextView3;
    }
}
