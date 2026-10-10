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

/* JADX INFO: renamed from: n30.r */
/* JADX INFO: compiled from: TradebaseItemSegmentOrderBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42742r implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f94685a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f94686b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f94687c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f94688d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42742r m93659a(@NonNull View view) {
        int i11 = R$id.tvPrice;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tvQty;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.tvRatio;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    return new C42742r((LinearLayout) view, baseTextView, baseTextView2, baseTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C42742r m93660c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.tradebase_item_segment_order, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m93659a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f94685a;
    }

    public C42742r(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f94685a = linearLayout;
        this.f94686b = baseTextView;
        this.f94687c = baseTextView2;
        this.f94688d = baseTextView3;
    }
}
