package v30;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;

/* JADX INFO: renamed from: v30.h */
/* JADX INFO: compiled from: BkucoinLayoutLeverBarVerticalBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45384h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102097a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f102098b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f102099c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f102100d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f102101e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45384h m100301a(@NonNull View view) {
        int i11 = R$id.tvBorrowAndRepay;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tvMarginLever;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.tvMarginType;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.tvRepayMode;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        return new C45384h((LinearLayout) view, baseTextView, baseTextView2, baseTextView3, baseTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C45384h m100302c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkucoin_layout_lever_bar_vertical, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m100301a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f102097a;
    }

    public C45384h(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f102097a = linearLayout;
        this.f102098b = baseTextView;
        this.f102099c = baseTextView2;
        this.f102100d = baseTextView3;
        this.f102101e = baseTextView4;
    }
}
