package q70;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utaspotlib.R$id;
import com.kubi.utaspotlib.R$layout;

/* JADX INFO: renamed from: q70.e */
/* JADX INFO: compiled from: UtaItemOrderSegmentConfirmOrderBinding.java */
/* JADX INFO: loaded from: classes54.dex */
public final class C43658e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f96368a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f96369b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f96370c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f96371d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f96372e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43658e m96076a(@NonNull View view) {
        int i11 = R$id.tvImmediateFill;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tvOrderType;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.tvPrice;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.tvQty;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        return new C43658e((LinearLayout) view, baseTextView, baseTextView2, baseTextView3, baseTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C43658e m96077c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.uta_item_order_segment_confirm_order, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m96076a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f96368a;
    }

    public C43658e(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f96368a = linearLayout;
        this.f96369b = baseTextView;
        this.f96370c = baseTextView2;
        this.f96371d = baseTextView3;
        this.f96372e = baseTextView4;
    }
}
