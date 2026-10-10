package t20;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.TradeInputLayoutProxy;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.v0 */
/* JADX INFO: compiled from: SpotDialogAmendOrderBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44671v0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99404a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TradeInputLayoutProxy f99405b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TradeInputLayoutProxy f99406c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f99407d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f99408e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f99409f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcPrimaryButton f99410g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShapeTextView f99411h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99412i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99413j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99414k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShapeTextView f99415l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f99416m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f99417n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44671v0 m98818a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.etNumber;
        TradeInputLayoutProxy tradeInputLayoutProxy = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
        if (tradeInputLayoutProxy != null) {
            i11 = R$id.etPrice;
            TradeInputLayoutProxy tradeInputLayoutProxy2 = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
            if (tradeInputLayoutProxy2 != null) {
                i11 = R$id.ivClose;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.overlayView))) != null) {
                    i11 = R$id.root;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout != null) {
                        i11 = R$id.tvConfirm;
                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                        if (kcPrimaryButton != null) {
                            i11 = R$id.tvOrderType;
                            ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                            if (shapeTextView != null) {
                                i11 = R$id.tvPrice;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tvPriceName;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvRiskTip;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tvSide;
                                            ShapeTextView shapeTextView2 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                            if (shapeTextView2 != null) {
                                                i11 = R$id.tvSymbol;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.tvTitle;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        return new C44671v0((ConstraintLayout) view, tradeInputLayoutProxy, tradeInputLayoutProxy2, imageView, viewFindChildViewById, constraintLayout, kcPrimaryButton, shapeTextView, baseTextView, baseTextView2, baseTextView3, shapeTextView2, baseTextView4, baseTextView5);
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
    public ConstraintLayout getRoot() {
        return this.f99404a;
    }

    public C44671v0(@NonNull ConstraintLayout constraintLayout, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy2, @NonNull ImageView imageView, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ShapeTextView shapeTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull ShapeTextView shapeTextView2, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5) {
        this.f99404a = constraintLayout;
        this.f99405b = tradeInputLayoutProxy;
        this.f99406c = tradeInputLayoutProxy2;
        this.f99407d = imageView;
        this.f99408e = view;
        this.f99409f = constraintLayout2;
        this.f99410g = kcPrimaryButton;
        this.f99411h = shapeTextView;
        this.f99412i = baseTextView;
        this.f99413j = baseTextView2;
        this.f99414k = baseTextView3;
        this.f99415l = shapeTextView2;
        this.f99416m = baseTextView4;
        this.f99417n = baseTextView5;
    }
}
