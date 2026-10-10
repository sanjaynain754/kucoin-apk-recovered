package v30;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;

/* JADX INFO: renamed from: v30.o0 */
/* JADX INFO: compiled from: TradeCoreViewSymbolOfflineBannerBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45399o0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102265a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f102266b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f102267c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final DashTextView f102268d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45399o0 m100334a(@NonNull View view) {
        int i11 = R$id.ivIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.tvCountdown;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvLabel;
                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                if (dashTextView != null) {
                    return new C45399o0((LinearLayout) view, appCompatImageView, baseTextView, dashTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C45399o0 m100335c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.trade_core_view_symbol_offline_banner, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m100334a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f102265a;
    }

    public C45399o0(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull DashTextView dashTextView) {
        this.f102265a = linearLayout;
        this.f102266b = appCompatImageView;
        this.f102267c = baseTextView;
        this.f102268d = dashTextView;
    }
}
