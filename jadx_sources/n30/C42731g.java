package n30;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.tradebase.R$id;

/* JADX INFO: renamed from: n30.g */
/* JADX INFO: compiled from: BtradebaseFragmentKlineTimeSetBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42731g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f94610a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f94611b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f94612c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcSecondaryButton f94613d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f94614e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42731g m93633a(@NonNull View view) {
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.tvConfirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.tvReset;
                KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcSecondaryButton != null) {
                    i11 = R$id.tvSubTitle;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        return new C42731g((ConstraintLayout) view, recyclerView, kcPrimaryButton, kcSecondaryButton, baseTextView);
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
        return this.f94610a;
    }

    public C42731g(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull BaseTextView baseTextView) {
        this.f94610a = constraintLayout;
        this.f94611b = recyclerView;
        this.f94612c = kcPrimaryButton;
        this.f94613d = kcSecondaryButton;
        this.f94614e = baseTextView;
    }
}
