package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0467R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CompoundButtonCompat;

/* JADX INFO: loaded from: classes.dex */
class AppCompatCompoundButtonHelper {
    private ColorStateList mButtonTintList = null;
    private PorterDuff.Mode mButtonTintMode = null;
    private boolean mHasButtonTint = false;
    private boolean mHasButtonTintMode = false;
    private boolean mSkipNextApply;

    @NonNull
    private final CompoundButton mView;

    public void applyButtonTint() {
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(this.mView);
        if (buttonDrawable != null) {
            if (this.mHasButtonTint || this.mHasButtonTintMode) {
                Drawable drawableMutate = DrawableCompat.wrap(buttonDrawable).mutate();
                if (this.mHasButtonTint) {
                    DrawableCompat.setTintList(drawableMutate, this.mButtonTintList);
                }
                if (this.mHasButtonTintMode) {
                    DrawableCompat.setTintMode(drawableMutate, this.mButtonTintMode);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.mView.getDrawableState());
                }
                this.mView.setButtonDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList getSupportButtonTintList() {
        return this.mButtonTintList;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        return this.mButtonTintMode;
    }

    public void loadFromAttributes(@Nullable AttributeSet attributeSet, int i11) {
        int i12;
        int resourceId;
        int resourceId2;
        Context context = this.mView.getContext();
        int[] iArr = C0467R.styleable.CompoundButton;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i11, 0);
        CompoundButton compoundButton = this.mView;
        ViewCompat.saveAttributeDataForStyleable(compoundButton, compoundButton.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i11, 0);
        try {
            int i13 = C0467R.styleable.CompoundButton_buttonCompat;
            if (!tintTypedArrayObtainStyledAttributes.hasValue(i13) || (resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(i13, 0)) == 0) {
                i12 = C0467R.styleable.CompoundButton_android_button;
                if (tintTypedArrayObtainStyledAttributes.hasValue(i12) && (resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(i12, 0)) != 0) {
                    CompoundButton compoundButton2 = this.mView;
                    compoundButton2.setButtonDrawable(AppCompatResources.getDrawable(compoundButton2.getContext(), resourceId));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.mView;
                    compoundButton3.setButtonDrawable(AppCompatResources.getDrawable(compoundButton3.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    i12 = C0467R.styleable.CompoundButton_android_button;
                    if (tintTypedArrayObtainStyledAttributes.hasValue(i12)) {
                        CompoundButton compoundButton4 = this.mView;
                        compoundButton4.setButtonDrawable(AppCompatResources.getDrawable(compoundButton4.getContext(), resourceId));
                    }
                }
            }
            int i14 = C0467R.styleable.CompoundButton_buttonTint;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i14)) {
                CompoundButtonCompat.setButtonTintList(this.mView, tintTypedArrayObtainStyledAttributes.getColorStateList(i14));
            }
            int i15 = C0467R.styleable.CompoundButton_buttonTintMode;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i15)) {
                CompoundButtonCompat.setButtonTintMode(this.mView, DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i15, -1), null));
            }
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    public void onSetButtonDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
        } else {
            this.mSkipNextApply = true;
            applyButtonTint();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        this.mButtonTintList = colorStateList;
        this.mHasButtonTint = true;
        applyButtonTint();
    }

    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        this.mButtonTintMode = mode;
        this.mHasButtonTintMode = true;
        applyButtonTint();
    }

    public AppCompatCompoundButtonHelper(@NonNull CompoundButton compoundButton) {
        this.mView = compoundButton;
    }
}
