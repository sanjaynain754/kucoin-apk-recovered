package p206dp;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.chart.depth.KuCoinDepthView;

/* JADX INFO: renamed from: dp.a0 */
/* JADX INFO: compiled from: BmarginFragmentMarketOrderbookBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36902a0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81570a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KuCoinDepthView f81571b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f81572c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81573d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f81574e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81575f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f81576g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RecyclerView f81577h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81578i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81579j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f81580k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f81581l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36902a0 m82673a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.depth_view;
        KuCoinDepthView kuCoinDepthView = (KuCoinDepthView) ViewBindings.findChildViewById(view, i11);
        if (kuCoinDepthView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.label1))) != null) {
            i11 = R$id.label2;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.label3))) != null) {
                i11 = R$id.label4;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.recycler_view_order_book_sell;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView != null) {
                        i11 = R$id.recyclerview_orderbook_buy;
                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                        if (recyclerView2 != null) {
                            i11 = R$id.tv_amount_unit;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tv_amount_unit_1;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tv_precision_title;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.tv_price_unit;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            return new C36902a0((ConstraintLayout) view, kuCoinDepthView, viewFindChildViewById, baseTextView, viewFindChildViewById2, baseTextView2, recyclerView, recyclerView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6);
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
        return this.f81570a;
    }

    public C36902a0(@NonNull ConstraintLayout constraintLayout, @NonNull KuCoinDepthView kuCoinDepthView, @NonNull View view, @NonNull BaseTextView baseTextView, @NonNull View view2, @NonNull BaseTextView baseTextView2, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f81570a = constraintLayout;
        this.f81571b = kuCoinDepthView;
        this.f81572c = view;
        this.f81573d = baseTextView;
        this.f81574e = view2;
        this.f81575f = baseTextView2;
        this.f81576g = recyclerView;
        this.f81577h = recyclerView2;
        this.f81578i = baseTextView3;
        this.f81579j = baseTextView4;
        this.f81580k = baseTextView5;
        this.f81581l = baseTextView6;
    }
}
