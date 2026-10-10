package p701vs;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.operation.lib.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: vs.a */
/* JADX INFO: compiled from: OperationDialogUserStatusCloseBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45624a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102758a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcSecondaryButton f102759b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f102760c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatCheckBox f102761d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f102762e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f102763f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f102764g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45624a m100733a(@NonNull View view) {
        int i11 = R$id.btnCancel;
        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcSecondaryButton != null) {
            i11 = R$id.btnClose;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.cbNeverShowAgain;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i11);
                if (appCompatCheckBox != null) {
                    i11 = R$id.ivClose;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.tvMessage;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tvTitle;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                return new C45624a((ConstraintLayout) view, kcSecondaryButton, kcPrimaryButton, appCompatCheckBox, appCompatImageView, baseTextView, baseTextView2);
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
        return this.f102758a;
    }

    public C45624a(@NonNull ConstraintLayout constraintLayout, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AppCompatCheckBox appCompatCheckBox, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f102758a = constraintLayout;
        this.f102759b = kcSecondaryButton;
        this.f102760c = kcPrimaryButton;
        this.f102761d = appCompatCheckBox;
        this.f102762e = appCompatImageView;
        this.f102763f = baseTextView;
        this.f102764g = baseTextView2;
    }
}
