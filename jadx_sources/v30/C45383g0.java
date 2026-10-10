package v30;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;

/* JADX INFO: renamed from: v30.g0 */
/* JADX INFO: compiled from: LayoutSpotSymbolBarBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45383g0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102088a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f102089b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f102090c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f102091d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f102092e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f102093f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f102094g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f102095h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f102096i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45383g0 m100298a(@NonNull View view) {
        int i11 = R$id.ivKLineStateBtn;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ivKlinePageEnter;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.ivMore;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView2 != null) {
                    i11 = R$id.ivSymbolMenu;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView3 != null) {
                        i11 = R$id.tvChangeRate;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tvLeverLabel;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tvStLabel;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.tvSymbolMenu;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        return new C45383g0((LinearLayout) view, imageView, appCompatImageView, appCompatImageView2, appCompatImageView3, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C45383g0 m100299c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.layout_spot_symbol_bar, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m100298a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f102088a;
    }

    public C45383g0(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f102088a = linearLayout;
        this.f102089b = imageView;
        this.f102090c = appCompatImageView;
        this.f102091d = appCompatImageView2;
        this.f102092e = appCompatImageView3;
        this.f102093f = baseTextView;
        this.f102094g = baseTextView2;
        this.f102095h = baseTextView3;
        this.f102096i = baseTextView4;
    }
}
