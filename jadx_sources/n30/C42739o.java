package n30;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.tradebase.R$id;

/* JADX INFO: renamed from: n30.o */
/* JADX INFO: compiled from: TradebaseDialogSegmentDistributionBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42739o implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f94656a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ShapeTextView f94657b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f94658c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RadioButton f94659d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RadioButton f94660e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RadioButton f94661f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f94662g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f94663h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f94664i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f94665j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f94666k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f94667l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f94668m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final LinearLayout f94669n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42739o m93652a(@NonNull View view) {
        int i11 = R$id.btnConfirm;
        ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
        if (shapeTextView != null) {
            i11 = R$id.llEstMarginRow;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.rbDecreasing;
                RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                if (radioButton != null) {
                    i11 = R$id.rbIncreasing;
                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                    if (radioButton2 != null) {
                        i11 = R$id.rbUniform;
                        RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                        if (radioButton3 != null) {
                            i11 = R$id.rvOrders;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                            if (recyclerView != null) {
                                i11 = R$id.tvAvgPrice;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tvError;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvEstMargin;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tvHeaderPrice;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.tvHeaderQty;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    i11 = R$id.tvTotalQty;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        i11 = R$id.typeGroup;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                        if (linearLayout2 != null) {
                                                            return new C42739o((LinearLayout) view, shapeTextView, linearLayout, radioButton, radioButton2, radioButton3, recyclerView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, linearLayout2);
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
        return this.f94656a;
    }

    public C42739o(@NonNull LinearLayout linearLayout, @NonNull ShapeTextView shapeTextView, @NonNull LinearLayout linearLayout2, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull LinearLayout linearLayout3) {
        this.f94656a = linearLayout;
        this.f94657b = shapeTextView;
        this.f94658c = linearLayout2;
        this.f94659d = radioButton;
        this.f94660e = radioButton2;
        this.f94661f = radioButton3;
        this.f94662g = recyclerView;
        this.f94663h = baseTextView;
        this.f94664i = baseTextView2;
        this.f94665j = baseTextView3;
        this.f94666k = baseTextView4;
        this.f94667l = baseTextView5;
        this.f94668m = baseTextView6;
        this.f94669n = linearLayout3;
    }
}
