package com.kubi.p110rn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.p110rn.C23207R;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: loaded from: classes39.dex */
public final class ViewRnCustomErrorBinding implements ViewBinding {

    @NonNull
    public final KcPrimaryButton btnRetry;

    @NonNull
    public final ImageView ivErrorIcon;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvErrorDesc;

    @NonNull
    public static ViewRnCustomErrorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewRnCustomErrorBinding bind(@NonNull View view) {
        int i11 = C23207R.id.btnRetry;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = C23207R.id.ivErrorIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = C23207R.id.tvErrorDesc;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView != null) {
                    return new ViewRnCustomErrorBinding((ConstraintLayout) view, kcPrimaryButton, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewRnCustomErrorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(C23207R.layout.view_rn_custom_error, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private ViewRnCustomErrorBinding(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.btnRetry = kcPrimaryButton;
        this.ivErrorIcon = imageView;
        this.tvErrorDesc = textView;
    }
}
