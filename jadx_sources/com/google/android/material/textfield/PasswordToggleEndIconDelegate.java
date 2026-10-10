package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.material.C7090R;

/* JADX INFO: loaded from: classes45.dex */
class PasswordToggleEndIconDelegate extends EndIconDelegate {

    @Nullable
    private EditText editText;
    private int iconResId;
    private final View.OnClickListener onIconClickListener;

    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isIconCheckable() {
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13193a(PasswordToggleEndIconDelegate passwordToggleEndIconDelegate, View view) {
        EditText editText = passwordToggleEndIconDelegate.editText;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (passwordToggleEndIconDelegate.hasPasswordTransformation()) {
            passwordToggleEndIconDelegate.editText.setTransformationMethod(null);
        } else {
            passwordToggleEndIconDelegate.editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            passwordToggleEndIconDelegate.editText.setSelection(selectionEnd);
        }
        passwordToggleEndIconDelegate.refreshIconState();
    }

    private boolean hasPasswordTransformation() {
        EditText editText = this.editText;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean isInputTypePassword(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @StringRes
    public int getIconContentDescriptionResId() {
        return C7090R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @DrawableRes
    public int getIconDrawableResId() {
        return this.iconResId;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(@Nullable EditText editText) {
        this.editText = editText;
        refreshIconState();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void setUp() {
        if (isInputTypePassword(this.editText)) {
            this.editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void tearDown() {
        EditText editText = this.editText;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public PasswordToggleEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout, @DrawableRes int i11) {
        super(endCompoundLayout);
        this.iconResId = C7090R.drawable.design_password_eye;
        this.onIconClickListener = new View.OnClickListener() { // from class: com.google.android.material.textfield.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordToggleEndIconDelegate.m13193a(this.f11933b, view);
            }
        };
        if (i11 != 0) {
            this.iconResId = i11;
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void beforeEditTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        refreshIconState();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isIconChecked() {
        return !hasPasswordTransformation();
    }
}
