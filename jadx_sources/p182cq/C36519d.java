package p182cq;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mart.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: cq.d */
/* JADX INFO: compiled from: MartLayoutSpotSidebarEmptyBinding.java */
/* JADX INFO: loaded from: classes28.dex */
public final class C36519d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f79364a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f79365b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f79366c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f79367d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36519d m81767a(@NonNull View view) {
        int i11 = R$id.emptyBtnLogin;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.emptyIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.emptyTips;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    return new C36519d((ConstraintLayout) view, kcPrimaryButton, imageView, baseTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f79364a;
    }

    public C36519d(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView) {
        this.f79364a = constraintLayout;
        this.f79365b = kcPrimaryButton;
        this.f79366c = imageView;
        this.f79367d = baseTextView;
    }
}
