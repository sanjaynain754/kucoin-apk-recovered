package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcSwitchButton;

/* JADX INFO: renamed from: ta.w2 */
/* JADX INFO: compiled from: AssetWithdrawSettingFragmentBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44888w2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f101047a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f101048b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcSwitchButton f101049c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f101050d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f101051e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f101052f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcSwitchButton f101053g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f101054h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ConstraintLayout f101055i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f101056j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44888w2 m99300a(@NonNull View view) {
        int i11 = R$id.only_book_desc;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.only_book_switch;
            KcSwitchButton kcSwitchButton = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
            if (kcSwitchButton != null) {
                i11 = R$id.only_book_title;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.withdraw_new_address_limit;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout != null) {
                        i11 = R$id.withdraw_new_address_limit_desc;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.withdraw_new_address_limit_switch;
                            KcSwitchButton kcSwitchButton2 = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
                            if (kcSwitchButton2 != null) {
                                i11 = R$id.withdraw_new_address_title;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.withdraw_only_book;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                    if (constraintLayout2 != null) {
                                        i11 = R$id.withdraw_title;
                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView5 != null) {
                                            return new C44888w2((LinearLayout) view, baseTextView, kcSwitchButton, baseTextView2, constraintLayout, baseTextView3, kcSwitchButton2, baseTextView4, constraintLayout2, baseTextView5);
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
    public LinearLayout getRoot() {
        return this.f101047a;
    }

    public C44888w2(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull KcSwitchButton kcSwitchButton, @NonNull BaseTextView baseTextView2, @NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView3, @NonNull KcSwitchButton kcSwitchButton2, @NonNull BaseTextView baseTextView4, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView5) {
        this.f101047a = linearLayout;
        this.f101048b = baseTextView;
        this.f101049c = kcSwitchButton;
        this.f101050d = baseTextView2;
        this.f101051e = constraintLayout;
        this.f101052f = baseTextView3;
        this.f101053g = kcSwitchButton2;
        this.f101054h = baseTextView4;
        this.f101055i = constraintLayout2;
        this.f101056j = baseTextView5;
    }
}
