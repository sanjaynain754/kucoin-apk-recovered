package dm;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.h3 */
/* JADX INFO: compiled from: BkumexFragmentSettingRiskLimitBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36773h3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80201a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80202b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f80203c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RadioButton f80204d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RadioButton f80205e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RadioGroup f80206f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f80207g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatTextView f80208h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80209i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ViewPager2 f80210j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36773h3 m82403a(@NonNull View view) {
        int i11 = R$id.contractsLabel;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.llSymbol;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.rb_cross;
                RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                if (radioButton != null) {
                    i11 = R$id.rb_isolated;
                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                    if (radioButton2 != null) {
                        i11 = R$id.rgp;
                        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i11);
                        if (radioGroup != null) {
                            i11 = R$id.symbolIv;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatImageView != null) {
                                i11 = R$id.symbolName;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatTextView != null) {
                                    i11 = R$id.title;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.viewPager;
                                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i11);
                                        if (viewPager2 != null) {
                                            return new C36773h3((ConstraintLayout) view, baseTextView, linearLayout, radioButton, radioButton2, radioGroup, appCompatImageView, appCompatTextView, baseTextView2, viewPager2);
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
        return this.f80201a;
    }

    public C36773h3(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull LinearLayout linearLayout, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioGroup radioGroup, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull BaseTextView baseTextView2, @NonNull ViewPager2 viewPager2) {
        this.f80201a = constraintLayout;
        this.f80202b = baseTextView;
        this.f80203c = linearLayout;
        this.f80204d = radioButton;
        this.f80205e = radioButton2;
        this.f80206f = radioGroup;
        this.f80207g = appCompatImageView;
        this.f80208h = appCompatTextView;
        this.f80209i = baseTextView2;
        this.f80210j = viewPager2;
    }
}
