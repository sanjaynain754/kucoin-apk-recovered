package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: loaded from: classes34.dex */
public abstract class DialogPreference extends Preference {
    private Drawable mDialogIcon;
    private int mDialogLayoutResId;
    private CharSequence mDialogMessage;
    private CharSequence mDialogTitle;
    private CharSequence mNegativeButtonText;
    private CharSequence mPositiveButtonText;

    public interface TargetFragment {
        @Nullable
        <T extends Preference> T findPreference(@NonNull CharSequence charSequence);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3729R.styleable.DialogPreference, i11, i12);
        String string = TypedArrayUtils.getString(typedArrayObtainStyledAttributes, C3729R.styleable.DialogPreference_dialogTitle, C3729R.styleable.DialogPreference_android_dialogTitle);
        this.mDialogTitle = string;
        if (string == null) {
            this.mDialogTitle = getTitle();
        }
        this.mDialogMessage = TypedArrayUtils.getString(typedArrayObtainStyledAttributes, C3729R.styleable.DialogPreference_dialogMessage, C3729R.styleable.DialogPreference_android_dialogMessage);
        this.mDialogIcon = TypedArrayUtils.getDrawable(typedArrayObtainStyledAttributes, C3729R.styleable.DialogPreference_dialogIcon, C3729R.styleable.DialogPreference_android_dialogIcon);
        this.mPositiveButtonText = TypedArrayUtils.getString(typedArrayObtainStyledAttributes, C3729R.styleable.DialogPreference_positiveButtonText, C3729R.styleable.DialogPreference_android_positiveButtonText);
        this.mNegativeButtonText = TypedArrayUtils.getString(typedArrayObtainStyledAttributes, C3729R.styleable.DialogPreference_negativeButtonText, C3729R.styleable.DialogPreference_android_negativeButtonText);
        this.mDialogLayoutResId = TypedArrayUtils.getResourceId(typedArrayObtainStyledAttributes, C3729R.styleable.DialogPreference_dialogLayout, C3729R.styleable.DialogPreference_android_dialogLayout, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setDialogIcon(@Nullable Drawable drawable) {
        this.mDialogIcon = drawable;
    }

    public void setDialogMessage(@Nullable CharSequence charSequence) {
        this.mDialogMessage = charSequence;
    }

    public void setDialogTitle(@Nullable CharSequence charSequence) {
        this.mDialogTitle = charSequence;
    }

    public void setNegativeButtonText(@Nullable CharSequence charSequence) {
        this.mNegativeButtonText = charSequence;
    }

    public void setPositiveButtonText(@Nullable CharSequence charSequence) {
        this.mPositiveButtonText = charSequence;
    }

    @Nullable
    public Drawable getDialogIcon() {
        return this.mDialogIcon;
    }

    public int getDialogLayoutResource() {
        return this.mDialogLayoutResId;
    }

    @Nullable
    public CharSequence getDialogMessage() {
        return this.mDialogMessage;
    }

    @Nullable
    public CharSequence getDialogTitle() {
        return this.mDialogTitle;
    }

    @Nullable
    public CharSequence getNegativeButtonText() {
        return this.mNegativeButtonText;
    }

    @Nullable
    public CharSequence getPositiveButtonText() {
        return this.mPositiveButtonText;
    }

    public void setDialogIcon(int i11) {
        this.mDialogIcon = AppCompatResources.getDrawable(getContext(), i11);
    }

    public void setDialogLayoutResource(int i11) {
        this.mDialogLayoutResId = i11;
    }

    public void setDialogMessage(int i11) {
        setDialogMessage(getContext().getString(i11));
    }

    public void setDialogTitle(int i11) {
        setDialogTitle(getContext().getString(i11));
    }

    public void setNegativeButtonText(int i11) {
        setNegativeButtonText(getContext().getString(i11));
    }

    public void setPositiveButtonText(int i11) {
        setPositiveButtonText(getContext().getString(i11));
    }

    @Override // androidx.preference.Preference
    public void onClick() {
        getPreferenceManager().showDialog(this);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, C3729R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(@NonNull Context context) {
        this(context, null);
    }
}
