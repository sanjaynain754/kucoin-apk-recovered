package l50;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.q */
/* JADX INFO: compiled from: BtradingBotKitGridTradingListItemBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42089q implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93224a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f93225b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatTextView f93226c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatTextView f93227d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f93228e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f93229f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f93230g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ConstraintLayout f93231h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f93232i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f93233j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42089q m92331a(@NonNull View view) {
        int i11 = R$id.barrier_start;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.grid_trading_user_number;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
            if (appCompatTextView != null) {
                i11 = R$id.grid_trading_user_number_text;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                if (appCompatTextView2 != null) {
                    i11 = R$id.iv_grid_icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.iv_grid_lite_label;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView2 != null) {
                            i11 = R$id.iv_grid_select;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView3 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i11 = R$id.tv_grid_label;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView != null) {
                                    i11 = R$id.tv_grid_name;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView2 != null) {
                                        return new C42089q(constraintLayout, barrier, appCompatTextView, appCompatTextView2, imageView, imageView2, imageView3, constraintLayout, textView, textView2);
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
    public ConstraintLayout getRoot() {
        return this.f93224a;
    }

    public C42089q(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f93224a = constraintLayout;
        this.f93225b = barrier;
        this.f93226c = appCompatTextView;
        this.f93227d = appCompatTextView2;
        this.f93228e = imageView;
        this.f93229f = imageView2;
        this.f93230g = imageView3;
        this.f93231h = constraintLayout2;
        this.f93232i = textView;
        this.f93233j = textView2;
    }
}
