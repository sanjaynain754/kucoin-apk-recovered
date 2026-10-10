package dm;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.chart.depth.KuCoinDepthView;

/* JADX INFO: renamed from: dm.u1 */
/* JADX INFO: compiled from: BkumexFragmentBookBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36849u1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81116a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81117b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f81118c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81119d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f81120e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RecyclerView f81121f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KuCoinDepthView f81122g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81123h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f81124i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81125j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final View f81126k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f81127l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ImageView f81128m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final RelativeLayout f81129n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f81130o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f81131p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final RecyclerView f81132q;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36849u1 m82563a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.amountUnit1;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.amountUnit1Layout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.amountUnit2;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.amountUnit2Layout;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout2 != null) {
                        i11 = R$id.buyList;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                        if (recyclerView != null) {
                            i11 = R$id.depth;
                            KuCoinDepthView kuCoinDepthView = (KuCoinDepthView) ViewBindings.findChildViewById(view, i11);
                            if (kuCoinDepthView != null) {
                                i11 = R$id.depthUnit;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.label1))) != null) {
                                    i11 = R$id.label2;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.label3))) != null) {
                                        i11 = R$id.label4;
                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView5 != null) {
                                            i11 = R$id.precisionIcon;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                            if (imageView != null) {
                                                i11 = R$id.precisionLayout;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                                                if (relativeLayout != null) {
                                                    i11 = R$id.precisionValue;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        i11 = R$id.priceUnit;
                                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView7 != null) {
                                                            i11 = R$id.sellList;
                                                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                                            if (recyclerView2 != null) {
                                                                return new C36849u1((LinearLayout) view, baseTextView, frameLayout, baseTextView2, frameLayout2, recyclerView, kuCoinDepthView, baseTextView3, viewFindChildViewById, baseTextView4, viewFindChildViewById2, baseTextView5, imageView, relativeLayout, baseTextView6, baseTextView7, recyclerView2);
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
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81116a;
    }

    public C36849u1(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull FrameLayout frameLayout, @NonNull BaseTextView baseTextView2, @NonNull FrameLayout frameLayout2, @NonNull RecyclerView recyclerView, @NonNull KuCoinDepthView kuCoinDepthView, @NonNull BaseTextView baseTextView3, @NonNull View view, @NonNull BaseTextView baseTextView4, @NonNull View view2, @NonNull BaseTextView baseTextView5, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull RecyclerView recyclerView2) {
        this.f81116a = linearLayout;
        this.f81117b = baseTextView;
        this.f81118c = frameLayout;
        this.f81119d = baseTextView2;
        this.f81120e = frameLayout2;
        this.f81121f = recyclerView;
        this.f81122g = kuCoinDepthView;
        this.f81123h = baseTextView3;
        this.f81124i = view;
        this.f81125j = baseTextView4;
        this.f81126k = view2;
        this.f81127l = baseTextView5;
        this.f81128m = imageView;
        this.f81129n = relativeLayout;
        this.f81130o = baseTextView6;
        this.f81131p = baseTextView7;
        this.f81132q = recyclerView2;
    }
}
