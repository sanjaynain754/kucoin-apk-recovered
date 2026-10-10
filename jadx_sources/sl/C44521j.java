package sl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kucoin.market.monitor.lib.R$id;

/* JADX INFO: renamed from: sl.j */
/* JADX INFO: compiled from: ViewItemFloatingWindowSettingCurrencyBinding.java */
/* JADX INFO: loaded from: classes19.dex */
public final class C44521j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f98670a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f98671b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f98672c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f98673d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f98674e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f98675f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f98676g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f98677h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44521j m98502a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.currency_layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.delete;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider))) != null) {
                i11 = R$id.sort_symbol;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView != null) {
                    i11 = R$id.top_symbol;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView2 != null) {
                        i11 = R$id.tv_trade_pair_left;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView != null) {
                            i11 = R$id.tv_trade_pair_right;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView2 != null) {
                                return new C44521j((ConstraintLayout) view, constraintLayout, imageView, viewFindChildViewById, appCompatImageView, appCompatImageView2, textView, textView2);
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
        return this.f98670a;
    }

    public C44521j(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f98670a = constraintLayout;
        this.f98671b = constraintLayout2;
        this.f98672c = imageView;
        this.f98673d = view;
        this.f98674e = appCompatImageView;
        this.f98675f = appCompatImageView2;
        this.f98676g = textView;
        this.f98677h = textView2;
    }
}
