package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.b0 */
/* JADX INFO: compiled from: AssetDialogHoldEarnOpenBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44729b0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99597a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f99598b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCheckBox f99599c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f99600d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f99601e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f99602f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f99603g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99604h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99605i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99606j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44729b0 m98968a(@NonNull View view) {
        int i11 = R$id.btnOpen;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.cbAgree;
            KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
            if (kuCheckBox != null) {
                i11 = R$id.contentContainer;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.holdEarnTipsContainer;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout2 != null) {
                        i11 = R$id.ivClose;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView != null) {
                            i11 = R$id.ivTop;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatImageView2 != null) {
                                i11 = R$id.tvDesc;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tvProtocol;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvTitle;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            return new C44729b0((LinearLayout) view, kcPrimaryButton, kuCheckBox, linearLayout, linearLayout2, appCompatImageView, appCompatImageView2, baseTextView, baseTextView2, baseTextView3);
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
        return this.f99597a;
    }

    public C44729b0(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KuCheckBox kuCheckBox, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f99597a = linearLayout;
        this.f99598b = kcPrimaryButton;
        this.f99599c = kuCheckBox;
        this.f99600d = linearLayout2;
        this.f99601e = linearLayout3;
        this.f99602f = appCompatImageView;
        this.f99603g = appCompatImageView2;
        this.f99604h = baseTextView;
        this.f99605i = baseTextView2;
        this.f99606j = baseTextView3;
    }
}
