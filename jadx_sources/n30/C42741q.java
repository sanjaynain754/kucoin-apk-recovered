package n30;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;

/* JADX INFO: renamed from: n30.q */
/* JADX INFO: compiled from: TradebaseItemSegmentDistInfoRowBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42741q implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f94681a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f94682b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f94683c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f94684d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42741q m93656a(@NonNull View view) {
        int i11 = R$id.tvAmount;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tvPrice;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.tvRatio;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    return new C42741q((LinearLayout) view, baseTextView, baseTextView2, baseTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C42741q m93657c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.tradebase_item_segment_dist_info_row, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m93656a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f94681a;
    }

    public C42741q(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f94681a = linearLayout;
        this.f94682b = baseTextView;
        this.f94683c = baseTextView2;
        this.f94684d = baseTextView3;
    }
}
