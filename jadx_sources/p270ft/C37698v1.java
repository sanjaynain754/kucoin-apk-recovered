package p270ft;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.view.OrderRemindView;
import com.kubi.payment.widget.RotateTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;

/* JADX INFO: renamed from: ft.v1 */
/* JADX INFO: compiled from: PaymentFragmentP2pTradeMarketBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37698v1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f84753a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BGABanner f84754b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CardView f84755c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f84756d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f84757e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f84758f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatTextView f84759g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RotateTextView f84760h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84761i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RotateTextView f84762j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RotateTextView f84763k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final AppCompatTextView f84764l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final View f84765m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final OrderRemindView f84766n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37698v1 m84986a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.banner;
        BGABanner bGABanner = (BGABanner) ViewBindings.findChildViewById(view, i11);
        if (bGABanner != null) {
            i11 = R$id.card_view;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i11);
            if (cardView != null) {
                i11 = R$id.fragment_trade_list;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null) {
                    i11 = R$id.iv_currency_crypto;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.iv_filter;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView != null) {
                            i11 = R$id.tv_buy;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatTextView != null) {
                                i11 = R$id.tv_currency_crypto;
                                RotateTextView rotateTextView = (RotateTextView) ViewBindings.findChildViewById(view, i11);
                                if (rotateTextView != null) {
                                    i11 = R$id.tv_currency_fiat;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.tv_filter_amount;
                                        RotateTextView rotateTextView2 = (RotateTextView) ViewBindings.findChildViewById(view, i11);
                                        if (rotateTextView2 != null) {
                                            i11 = R$id.tv_filter_pay_type;
                                            RotateTextView rotateTextView3 = (RotateTextView) ViewBindings.findChildViewById(view, i11);
                                            if (rotateTextView3 != null) {
                                                i11 = R$id.tv_sell;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                if (appCompatTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_line))) != null) {
                                                    i11 = R$id.view_order_remind;
                                                    OrderRemindView orderRemindView = (OrderRemindView) ViewBindings.findChildViewById(view, i11);
                                                    if (orderRemindView != null) {
                                                        return new C37698v1((FrameLayout) view, bGABanner, cardView, constraintLayout, imageView, appCompatImageView, appCompatTextView, rotateTextView, baseTextView, rotateTextView2, rotateTextView3, appCompatTextView2, viewFindChildViewById, orderRemindView);
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
    public FrameLayout getRoot() {
        return this.f84753a;
    }

    public C37698v1(@NonNull FrameLayout frameLayout, @NonNull BGABanner bGABanner, @NonNull CardView cardView, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull RotateTextView rotateTextView, @NonNull BaseTextView baseTextView, @NonNull RotateTextView rotateTextView2, @NonNull RotateTextView rotateTextView3, @NonNull AppCompatTextView appCompatTextView2, @NonNull View view, @NonNull OrderRemindView orderRemindView) {
        this.f84753a = frameLayout;
        this.f84754b = bGABanner;
        this.f84755c = cardView;
        this.f84756d = constraintLayout;
        this.f84757e = imageView;
        this.f84758f = appCompatImageView;
        this.f84759g = appCompatTextView;
        this.f84760h = rotateTextView;
        this.f84761i = baseTextView;
        this.f84762j = rotateTextView2;
        this.f84763k = rotateTextView3;
        this.f84764l = appCompatTextView2;
        this.f84765m = view;
        this.f84766n = orderRemindView;
    }
}
