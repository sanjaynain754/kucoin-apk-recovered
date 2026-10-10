package l50;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.x */
/* JADX INFO: compiled from: BtradingBotKitSignProtocolBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42098x implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93302a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AlignTopCheckBox f93303b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f93304c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f93305d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f93306e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f93307f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42098x m92351a(@NonNull View view) {
        int i11 = R$id.checkBox;
        AlignTopCheckBox alignTopCheckBox = (AlignTopCheckBox) ViewBindings.findChildViewById(view, i11);
        if (alignTopCheckBox != null) {
            i11 = R$id.close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.confirmBtn;
                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton != null) {
                    i11 = R$id.protocolsDescTv;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.titleTv;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            return new C42098x((ConstraintLayout) view, alignTopCheckBox, appCompatImageView, kcPrimaryButton, baseTextView, baseTextView2);
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
        return this.f93302a;
    }

    public C42098x(@NonNull ConstraintLayout constraintLayout, @NonNull AlignTopCheckBox alignTopCheckBox, @NonNull AppCompatImageView appCompatImageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f93302a = constraintLayout;
        this.f93303b = alignTopCheckBox;
        this.f93304c = appCompatImageView;
        this.f93305d = kcPrimaryButton;
        this.f93306e = baseTextView;
        this.f93307f = baseTextView2;
    }
}
