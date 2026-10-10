package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyFeeLayout;
import com.kubi.payment.widget.ConfirmCountDownView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.d3 */
/* JADX INFO: compiled from: PaymentViewFastBuyConfirmInfoBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37610d3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f83807a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConfirmCountDownView f83808b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Layer f83809c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f83810d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f83811e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f83812f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Barrier f83813g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BuyFeeLayout f83814h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Group f83815i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AppCompatImageView f83816j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f83817k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f83818l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f83819m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f83820n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f83821o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f83822p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f83823q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f83824r;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37610d3 m84802a(@NonNull View view) {
        int i11 = R$id.countDownView;
        ConfirmCountDownView confirmCountDownView = (ConfirmCountDownView) ViewBindings.findChildViewById(view, i11);
        if (confirmCountDownView != null) {
            i11 = R$id.coupon_layer;
            Layer layer = (Layer) ViewBindings.findChildViewById(view, i11);
            if (layer != null) {
                i11 = R$id.coupon_list_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.coupon_selected_info;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.disount_tag;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.feeBarrier;
                            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
                            if (barrier != null) {
                                i11 = R$id.feeLayout;
                                BuyFeeLayout buyFeeLayout = (BuyFeeLayout) ViewBindings.findChildViewById(view, i11);
                                if (buyFeeLayout != null) {
                                    i11 = R$id.groupFiatCurrency;
                                    Group group = (Group) ViewBindings.findChildViewById(view, i11);
                                    if (group != null) {
                                        i11 = R$id.ivFeeQuestion;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                        if (appCompatImageView2 != null) {
                                            i11 = R$id.tvFee;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.tvFiatCurrency;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.tvFiatCurrencyValue;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        i11 = R$id.tvPaymentMethod;
                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView6 != null) {
                                                            i11 = R$id.tvPaymentMethodValue;
                                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView7 != null) {
                                                                i11 = R$id.tv_promotions;
                                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView8 != null) {
                                                                    i11 = R$id.tvReceive;
                                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView9 != null) {
                                                                        i11 = R$id.tvReceiveValue;
                                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView10 != null) {
                                                                            return new C37610d3(view, confirmCountDownView, layer, appCompatImageView, baseTextView, baseTextView2, barrier, buyFeeLayout, group, appCompatImageView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10);
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
        return this.f83807a;
    }

    public C37610d3(@NonNull View view, @NonNull ConfirmCountDownView confirmCountDownView, @NonNull Layer layer, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull Barrier barrier, @NonNull BuyFeeLayout buyFeeLayout, @NonNull Group group, @NonNull AppCompatImageView appCompatImageView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10) {
        this.f83807a = view;
        this.f83808b = confirmCountDownView;
        this.f83809c = layer;
        this.f83810d = appCompatImageView;
        this.f83811e = baseTextView;
        this.f83812f = baseTextView2;
        this.f83813g = barrier;
        this.f83814h = buyFeeLayout;
        this.f83815i = group;
        this.f83816j = appCompatImageView2;
        this.f83817k = baseTextView3;
        this.f83818l = baseTextView4;
        this.f83819m = baseTextView5;
        this.f83820n = baseTextView6;
        this.f83821o = baseTextView7;
        this.f83822p = baseTextView8;
        this.f83823q = baseTextView9;
        this.f83824r = baseTextView10;
    }
}
