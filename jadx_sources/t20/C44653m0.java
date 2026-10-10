package t20;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.chart.depth.KuCoinDepthView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.m0 */
/* JADX INFO: compiled from: KucoinFragmentMarketOrderbookBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44653m0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99216a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f99217b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCoinDepthView f99218c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f99219d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99220e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f99221f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99222g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f99223h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99224i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RecyclerView f99225j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RecyclerView f99226k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f99227l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f99228m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f99229n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f99230o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44653m0 m98782a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.call_auction_depth;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.depth_view;
            KuCoinDepthView kuCoinDepthView = (KuCoinDepthView) ViewBindings.findChildViewById(view, i11);
            if (kuCoinDepthView != null) {
                i11 = R$id.empty_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.empty_tips;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.label1))) != null) {
                        i11 = R$id.label2;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.label3))) != null) {
                            i11 = R$id.label4;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.recycler_view_order_book_sell;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                if (recyclerView != null) {
                                    i11 = R$id.recyclerview_orderbook_buy;
                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                    if (recyclerView2 != null) {
                                        i11 = R$id.tv_amount_unit;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tv_amount_unit_1;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tv_precision_title;
                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView6 != null) {
                                                    i11 = R$id.tv_price_unit;
                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView7 != null) {
                                                        return new C44653m0((ConstraintLayout) view, linearLayout, kuCoinDepthView, imageView, baseTextView, viewFindChildViewById, baseTextView2, viewFindChildViewById2, baseTextView3, recyclerView, recyclerView2, baseTextView4, baseTextView5, baseTextView6, baseTextView7);
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
        return this.f99216a;
    }

    public C44653m0(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull KuCoinDepthView kuCoinDepthView, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull View view, @NonNull BaseTextView baseTextView2, @NonNull View view2, @NonNull BaseTextView baseTextView3, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7) {
        this.f99216a = constraintLayout;
        this.f99217b = linearLayout;
        this.f99218c = kuCoinDepthView;
        this.f99219d = imageView;
        this.f99220e = baseTextView;
        this.f99221f = view;
        this.f99222g = baseTextView2;
        this.f99223h = view2;
        this.f99224i = baseTextView3;
        this.f99225j = recyclerView;
        this.f99226k = recyclerView2;
        this.f99227l = baseTextView4;
        this.f99228m = baseTextView5;
        this.f99229n = baseTextView6;
        this.f99230o = baseTextView7;
    }
}
