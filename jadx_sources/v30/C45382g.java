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

/* JADX INFO: renamed from: v30.g */
/* JADX INFO: compiled from: BkucoinLayoutLeverBarHorizontalBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45382g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102083a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f102084b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f102085c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f102086d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f102087e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45382g m100295a(@NonNull View view) {
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
                        return new C45382g((LinearLayout) view, baseTextView, baseTextView2, baseTextView3, baseTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C45382g m100296c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkucoin_layout_lever_bar_horizontal, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m100295a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f102083a;
    }

    public C45382g(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f102083a = linearLayout;
        this.f102084b = baseTextView;
        this.f102085c = baseTextView2;
        this.f102086d = baseTextView3;
        this.f102087e = baseTextView4;
    }
}
