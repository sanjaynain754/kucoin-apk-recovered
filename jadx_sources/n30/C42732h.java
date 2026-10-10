package n30;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.tradebase.R$id;

/* JADX INFO: renamed from: n30.h */
/* JADX INFO: compiled from: BtradebaseKlineIndicatorBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42732h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f94615a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f94616b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ShapeTextView f94617c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeTextView f94618d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeTextView f94619e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ShapeTextView f94620f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ShapeTextView f94621g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShapeTextView f94622h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f94623i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42732h m93635a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.ivEdit;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tv_kline_boll;
            ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
            if (shapeTextView != null) {
                i11 = R$id.tv_kline_ema;
                ShapeTextView shapeTextView2 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                if (shapeTextView2 != null) {
                    i11 = R$id.tv_kline_kdj;
                    ShapeTextView shapeTextView3 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                    if (shapeTextView3 != null) {
                        i11 = R$id.tv_kline_ma;
                        ShapeTextView shapeTextView4 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                        if (shapeTextView4 != null) {
                            i11 = R$id.tv_kline_macd;
                            ShapeTextView shapeTextView5 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                            if (shapeTextView5 != null) {
                                i11 = R$id.tv_kline_rsi;
                                ShapeTextView shapeTextView6 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                if (shapeTextView6 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider))) != null) {
                                    return new C42732h((ConstraintLayout) view, imageView, shapeTextView, shapeTextView2, shapeTextView3, shapeTextView4, shapeTextView5, shapeTextView6, viewFindChildViewById);
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
        return this.f94615a;
    }

    public C42732h(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ShapeTextView shapeTextView, @NonNull ShapeTextView shapeTextView2, @NonNull ShapeTextView shapeTextView3, @NonNull ShapeTextView shapeTextView4, @NonNull ShapeTextView shapeTextView5, @NonNull ShapeTextView shapeTextView6, @NonNull View view) {
        this.f94615a = constraintLayout;
        this.f94616b = imageView;
        this.f94617c = shapeTextView;
        this.f94618d = shapeTextView2;
        this.f94619e = shapeTextView3;
        this.f94620f = shapeTextView4;
        this.f94621g = shapeTextView5;
        this.f94622h = shapeTextView6;
        this.f94623i = view;
    }
}
