package dm;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.o0 */
/* JADX INFO: compiled from: BkumexDialogOpenFuturesTradingGuideBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36812o0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80696a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f80697b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f80698c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80699d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RadioButton f80700e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RadioButton f80701f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RadioButton f80702g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RadioGroup f80703h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80704i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36812o0 m82485a(@NonNull View view) {
        int i11 = R$id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.confirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.desc;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.rb_beginner;
                    RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                    if (radioButton != null) {
                        i11 = R$id.rb_experienced;
                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                        if (radioButton2 != null) {
                            i11 = R$id.rb_expert;
                            RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                            if (radioButton3 != null) {
                                i11 = R$id.rgp;
                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i11);
                                if (radioGroup != null) {
                                    i11 = R$id.title;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        return new C36812o0((ConstraintLayout) view, imageView, kcPrimaryButton, baseTextView, radioButton, radioButton2, radioButton3, radioGroup, baseTextView2);
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
        return this.f80696a;
    }

    public C36812o0(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioGroup radioGroup, @NonNull BaseTextView baseTextView2) {
        this.f80696a = constraintLayout;
        this.f80697b = imageView;
        this.f80698c = kcPrimaryButton;
        this.f80699d = baseTextView;
        this.f80700e = radioButton;
        this.f80701f = radioButton2;
        this.f80702g = radioButton3;
        this.f80703h = radioGroup;
        this.f80704i = baseTextView2;
    }
}
