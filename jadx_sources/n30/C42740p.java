package n30;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.tradebase.R$id;

/* JADX INFO: renamed from: n30.p */
/* JADX INFO: compiled from: TradebaseDialogSegmentDistributionInfoBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42740p implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f94670a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f94671b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f94672c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f94673d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeTextView f94674e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ShapeTextView f94675f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ShapeTextView f94676g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f94677h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f94678i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f94679j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f94680k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42740p m93654a(@NonNull View view) {
        int i11 = R$id.ivType;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.llDistribution;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.rvTable;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.tvAsc;
                    ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                    if (shapeTextView != null) {
                        i11 = R$id.tvAvg;
                        ShapeTextView shapeTextView2 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                        if (shapeTextView2 != null) {
                            i11 = R$id.tvDesc;
                            ShapeTextView shapeTextView3 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                            if (shapeTextView3 != null) {
                                i11 = R$id.tvDescDetail;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tvExampleDesc;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvExampleTitle;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tvSegmentDistPriceHeader;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                return new C42740p((LinearLayout) view, imageView, linearLayoutCompat, recyclerView, shapeTextView, shapeTextView2, shapeTextView3, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
        return this.f94670a;
    }

    public C42740p(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull ShapeTextView shapeTextView, @NonNull ShapeTextView shapeTextView2, @NonNull ShapeTextView shapeTextView3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f94670a = linearLayout;
        this.f94671b = imageView;
        this.f94672c = linearLayoutCompat;
        this.f94673d = recyclerView;
        this.f94674e = shapeTextView;
        this.f94675f = shapeTextView2;
        this.f94676g = shapeTextView3;
        this.f94677h = baseTextView;
        this.f94678i = baseTextView2;
        this.f94679j = baseTextView3;
        this.f94680k = baseTextView4;
    }
}
