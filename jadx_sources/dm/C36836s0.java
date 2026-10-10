package dm;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.s0 */
/* JADX INFO: compiled from: BkumexDialogPositionPnlDetailsBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36836s0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81022a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RadioButton f81023b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RadioButton f81024c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final NestedScrollView f81025d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RadioGroup f81026e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81027f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcPrimaryButton f81028g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81029h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81030i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81031j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36836s0 m82536a(@NonNull View view) {
        int i11 = R$id.latestPriceRb;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
        if (radioButton != null) {
            i11 = R$id.markPriceRb;
            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
            if (radioButton2 != null) {
                i11 = R$id.nestedScrollView;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                if (nestedScrollView != null) {
                    i11 = R$id.priceModeRadioGroup;
                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i11);
                    if (radioGroup != null) {
                        i11 = R$id.title;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_ok;
                            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                            if (kcPrimaryButton != null) {
                                i11 = R$id.unrealisedDesc;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.unrealisedLabel;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.unrealisedValue;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            return new C36836s0((LinearLayout) view, radioButton, radioButton2, nestedScrollView, radioGroup, baseTextView, kcPrimaryButton, baseTextView2, baseTextView3, baseTextView4);
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
        return this.f81022a;
    }

    public C36836s0(@NonNull LinearLayout linearLayout, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull NestedScrollView nestedScrollView, @NonNull RadioGroup radioGroup, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f81022a = linearLayout;
        this.f81023b = radioButton;
        this.f81024c = radioButton2;
        this.f81025d = nestedScrollView;
        this.f81026e = radioGroup;
        this.f81027f = baseTextView;
        this.f81028g = kcPrimaryButton;
        this.f81029h = baseTextView2;
        this.f81030i = baseTextView3;
        this.f81031j = baseTextView4;
    }
}
