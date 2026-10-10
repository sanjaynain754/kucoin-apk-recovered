package l50;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.k */
/* JADX INFO: compiled from: BtradingBotKitFragmentNewUserCouponsBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42077k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93001a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f93002b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f93003c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f93004d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f93005e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f93006f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f93007g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatTextView f93008h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AppCompatTextView f93009i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AppCompatTextView f93010j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final AppCompatTextView f93011k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final AppCompatTextView f93012l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42077k m92305a(@NonNull View view) {
        int i11 = R$id.bt_confirm_params;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
        if (textView != null) {
            i11 = R$id.cl_content;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                i11 = R$id.header_bg;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null) {
                    i11 = R$id.iv_close;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.iv_new_user_coupons;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView2 != null) {
                            i11 = R$id.percent;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatTextView != null) {
                                i11 = R$id.tv_content_new_user_coupons;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatTextView2 != null) {
                                    i11 = R$id.tv_coupons_validity_period;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                    if (appCompatTextView3 != null) {
                                        i11 = R$id.tv_percent_number;
                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                        if (appCompatTextView4 != null) {
                                            i11 = R$id.tv_title_congratulations;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                            if (appCompatTextView5 != null) {
                                                return new C42077k(constraintLayout2, textView, constraintLayout, constraintLayout2, frameLayout, imageView, imageView2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
                                            }
                                        }
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
        return this.f93001a;
    }

    public C42077k(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5) {
        this.f93001a = constraintLayout;
        this.f93002b = textView;
        this.f93003c = constraintLayout2;
        this.f93004d = constraintLayout3;
        this.f93005e = frameLayout;
        this.f93006f = imageView;
        this.f93007g = imageView2;
        this.f93008h = appCompatTextView;
        this.f93009i = appCompatTextView2;
        this.f93010j = appCompatTextView3;
        this.f93011k = appCompatTextView4;
        this.f93012l = appCompatTextView5;
    }
}
