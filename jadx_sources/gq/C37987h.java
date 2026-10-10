package gq;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.kubi.mine.R$id;
import com.kubi.mine.lib.view.UploadAvatarImageView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: gq.h */
/* JADX INFO: compiled from: FragmentEditUserInfoBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37987h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final NestedScrollView f85467a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final UploadAvatarImageView f85468b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f85469c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextInputEditText f85470d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f85471e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f85472f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcTextInputLayout f85473g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f85474h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f85475i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f85476j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f85477k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37987h m85849a(@NonNull View view) {
        int i11 = R$id.avatar;
        UploadAvatarImageView uploadAvatarImageView = (UploadAvatarImageView) ViewBindings.findChildViewById(view, i11);
        if (uploadAvatarImageView != null) {
            i11 = R$id.btnSave;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.clearInputNickname;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, i11);
                if (textInputEditText != null) {
                    i11 = R$id.flNicknameContainer;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.imgClearNickname;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView != null) {
                            i11 = R$id.inputLayoutNickname;
                            KcTextInputLayout kcTextInputLayout = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
                            if (kcTextInputLayout != null) {
                                i11 = R$id.tvAvatarTip;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tvNicknameLength;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvNicknameTip;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tvNicknameTitle;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                return new C37987h((NestedScrollView) view, uploadAvatarImageView, kcPrimaryButton, textInputEditText, frameLayout, imageView, kcTextInputLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4);
                                            }
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
    public NestedScrollView getRoot() {
        return this.f85467a;
    }

    public C37987h(@NonNull NestedScrollView nestedScrollView, @NonNull UploadAvatarImageView uploadAvatarImageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull TextInputEditText textInputEditText, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull KcTextInputLayout kcTextInputLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f85467a = nestedScrollView;
        this.f85468b = uploadAvatarImageView;
        this.f85469c = kcPrimaryButton;
        this.f85470d = textInputEditText;
        this.f85471e = frameLayout;
        this.f85472f = imageView;
        this.f85473g = kcTextInputLayout;
        this.f85474h = baseTextView;
        this.f85475i = baseTextView2;
        this.f85476j = baseTextView3;
        this.f85477k = baseTextView4;
    }
}
