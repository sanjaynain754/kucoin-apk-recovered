package v30;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.core.biz.leverbar.LeverageSettingBar;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.w */
/* JADX INFO: compiled from: FragmentMarginInfoBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45410w implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102373a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f102374b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f102375c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f102376d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LeverageSettingBar f102377e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45410w m100357a(@NonNull View view) {
        int i11 = R$id.hourly_interest_rate_label;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.hourly_interest_rate_value;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.interest_rate_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.leverage_setting_bar;
                    LeverageSettingBar leverageSettingBar = (LeverageSettingBar) ViewBindings.findChildViewById(view, i11);
                    if (leverageSettingBar != null) {
                        return new C45410w((ConstraintLayout) view, baseTextView, baseTextView2, linearLayout, leverageSettingBar);
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
        return this.f102373a;
    }

    public C45410w(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull LinearLayout linearLayout, @NonNull LeverageSettingBar leverageSettingBar) {
        this.f102373a = constraintLayout;
        this.f102374b = baseTextView;
        this.f102375c = baseTextView2;
        this.f102376d = linearLayout;
        this.f102377e = leverageSettingBar;
    }
}
