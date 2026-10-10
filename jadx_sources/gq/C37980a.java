package gq;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;
import com.kubi.mine.lib.view.CropImageView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: gq.a */
/* JADX INFO: compiled from: ActivityAvatarCropBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37980a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f85408a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f85409b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f85410c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CropImageView f85411d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37980a m85835a(@NonNull View view) {
        int i11 = R$id.btnCancel;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.btnConfirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.cropImageView;
                CropImageView cropImageView = (CropImageView) ViewBindings.findChildViewById(view, i11);
                if (cropImageView != null) {
                    return new C37980a((FrameLayout) view, baseTextView, kcPrimaryButton, cropImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f85408a;
    }

    public C37980a(@NonNull FrameLayout frameLayout, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull CropImageView cropImageView) {
        this.f85408a = frameLayout;
        this.f85409b = baseTextView;
        this.f85410c = kcPrimaryButton;
        this.f85411d = cropImageView;
    }
}
