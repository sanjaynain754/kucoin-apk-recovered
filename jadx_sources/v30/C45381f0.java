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
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;

/* JADX INFO: renamed from: v30.f0 */
/* JADX INFO: compiled from: LayoutMarginSymbolBarBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45381f0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102073a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f102074b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f102075c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f102076d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f102077e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f102078f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f102079g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f102080h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f102081i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final View f102082j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45381f0 m100292a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.ivKLineStateBtn;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.ivKlinePageEnter;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView2 != null) {
                i11 = R$id.ivMore;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView3 != null) {
                    i11 = R$id.ivSymbolMenu;
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView4 != null) {
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
                                    if (baseTextView4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewBadge))) != null) {
                                        return new C45381f0((LinearLayout) view, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, baseTextView, baseTextView2, baseTextView3, baseTextView4, viewFindChildViewById);
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
    public static C45381f0 m100293c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.layout_margin_symbol_bar, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m100292a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f102073a;
    }

    public C45381f0(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull AppCompatImageView appCompatImageView4, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull View view) {
        this.f102073a = linearLayout;
        this.f102074b = appCompatImageView;
        this.f102075c = appCompatImageView2;
        this.f102076d = appCompatImageView3;
        this.f102077e = appCompatImageView4;
        this.f102078f = baseTextView;
        this.f102079g = baseTextView2;
        this.f102080h = baseTextView3;
        this.f102081i = baseTextView4;
        this.f102082j = view;
    }
}
