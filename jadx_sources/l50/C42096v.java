package l50;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.v */
/* JADX INFO: compiled from: BtradingBotKitItemCouponsBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42096v implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93290a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatTextView f93291b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Guideline f93292c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Guideline f93293d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f93294e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatTextView f93295f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f93296g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f93297h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42096v m92347a(@NonNull View view) {
        int i11 = R$id.bt_use_coupons;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
        if (appCompatTextView != null) {
            i11 = R$id.guide_line_percent;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i11);
            if (guideline != null) {
                i11 = R$id.guide_line_title;
                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i11);
                if (guideline2 != null) {
                    i11 = R$id.tv_discount_expire_date;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView != null) {
                        i11 = R$id.tv_percent_number;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatTextView2 != null) {
                            i11 = R$id.tv_scope_application;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView2 != null) {
                                i11 = R$id.tv_title;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView3 != null) {
                                    return new C42096v((ConstraintLayout) view, appCompatTextView, guideline, guideline2, textView, appCompatTextView2, textView2, textView3);
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
        return this.f93290a;
    }

    public C42096v(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull TextView textView, @NonNull AppCompatTextView appCompatTextView2, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f93290a = constraintLayout;
        this.f93291b = appCompatTextView;
        this.f93292c = guideline;
        this.f93293d = guideline2;
        this.f93294e = textView;
        this.f93295f = appCompatTextView2;
        this.f93296g = textView2;
        this.f93297h = textView3;
    }
}
