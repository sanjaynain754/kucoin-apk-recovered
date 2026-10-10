package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.widget.MaxHeightRecyclerView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.l0 */
/* JADX INFO: compiled from: MarketingCouponListLayoutBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37647l0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84198a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f84199b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f84200c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Layer f84201d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84202e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f84203f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final MaxHeightRecyclerView f84204g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84205h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84206i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final Layer f84207j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final KcPrimaryButton f84208k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f84209l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f84210m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37647l0 m84877a(@NonNull View view) {
        int i11 = R$id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.empty_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.empty_layer;
                Layer layer = (Layer) ViewBindings.findChildViewById(view, i11);
                if (layer != null) {
                    i11 = R$id.empty_text;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.iv_close;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.recycler_view;
                            MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) ViewBindings.findChildViewById(view, i11);
                            if (maxHeightRecyclerView != null) {
                                i11 = R$id.save_amount;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.save_amount_currency;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.save_amount_layer;
                                        Layer layer2 = (Layer) ViewBindings.findChildViewById(view, i11);
                                        if (layer2 != null) {
                                            i11 = R$id.tv_confirm;
                                            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                            if (kcPrimaryButton != null) {
                                                i11 = R$id.tv_title;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.you_save;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        return new C37647l0((ConstraintLayout) view, barrier, appCompatImageView, layer, baseTextView, appCompatImageView2, maxHeightRecyclerView, baseTextView2, baseTextView3, layer2, kcPrimaryButton, baseTextView4, baseTextView5);
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
        return this.f84198a;
    }

    public C37647l0(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull AppCompatImageView appCompatImageView, @NonNull Layer layer, @NonNull BaseTextView baseTextView, @NonNull AppCompatImageView appCompatImageView2, @NonNull MaxHeightRecyclerView maxHeightRecyclerView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull Layer layer2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5) {
        this.f84198a = constraintLayout;
        this.f84199b = barrier;
        this.f84200c = appCompatImageView;
        this.f84201d = layer;
        this.f84202e = baseTextView;
        this.f84203f = appCompatImageView2;
        this.f84204g = maxHeightRecyclerView;
        this.f84205h = baseTextView2;
        this.f84206i = baseTextView3;
        this.f84207j = layer2;
        this.f84208k = kcPrimaryButton;
        this.f84209l = baseTextView4;
        this.f84210m = baseTextView5;
    }
}
