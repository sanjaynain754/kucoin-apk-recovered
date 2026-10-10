package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.o */
/* JADX INFO: compiled from: BkumexDialogEuropeComplianceLangBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36811o implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80690a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f80691b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f80692c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f80693d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f80694e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80695f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36811o m82483a(@NonNull View view) {
        int i11 = R$id.close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.confirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView != null) {
                        i11 = R$id.title;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            return new C36811o((ConstraintLayout) view, appCompatImageView, kcPrimaryButton, linearLayout, recyclerView, baseTextView);
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
        return this.f80690a;
    }

    public C36811o(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView) {
        this.f80690a = constraintLayout;
        this.f80691b = appCompatImageView;
        this.f80692c = kcPrimaryButton;
        this.f80693d = linearLayout;
        this.f80694e = recyclerView;
        this.f80695f = baseTextView;
    }
}
