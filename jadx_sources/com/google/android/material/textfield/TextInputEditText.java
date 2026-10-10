package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0467R;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.C7090R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes.dex */
public class TextInputEditText extends AppCompatEditText {
    private final Rect parentRect;
    private boolean textInputLayoutFocusedRectEnabled;

    public TextInputEditText(@NonNull Context context) {
        this(context, null);
    }

    public TextInputEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C0467R.attr.editTextStyle);
    }

    private boolean shouldUseTextInputLayoutFocusedRect(@Nullable TextInputLayout textInputLayout) {
        return textInputLayout != null && this.textInputLayoutFocusedRectEnabled;
    }

    public boolean isTextInputLayoutFocusedRectEnabled() {
        return this.textInputLayoutFocusedRectEnabled;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z11) {
        this.textInputLayoutFocusedRectEnabled = z11;
    }

    public TextInputEditText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, 0), attributeSet, i11);
        this.parentRect = new Rect();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C7090R.styleable.TextInputEditText, i11, C7090R.style.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayObtainStyledAttributes.getBoolean(C7090R.styleable.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @NonNull
    private String getAccessibilityNodeInfoText(@NonNull TextInputLayout textInputLayout) {
        String string;
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        String str = "";
        if (TextUtils.isEmpty(hint)) {
            string = "";
        } else {
            string = hint.toString();
        }
        if (!zIsEmpty) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) text);
            if (!TextUtils.isEmpty(string)) {
                str = ", " + string;
            }
            sb2.append(str);
            return sb2.toString();
        }
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return string;
    }

    @Nullable
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @Nullable
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@Nullable Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (shouldUseTextInputLayoutFocusedRect(textInputLayout) && rect != null) {
            textInputLayout.getFocusedRect(this.parentRect);
            rect.bottom = this.parentRect.bottom;
        }
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(@Nullable Rect rect, @Nullable Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (shouldUseTextInputLayoutFocusedRect(textInputLayout)) {
            boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
            if (globalVisibleRect && point != null) {
                point.offset(-getScrollX(), -getScrollY());
            }
            return globalVisibleRect;
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.isProvidingHint()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.isProvidingHint() && super.getHint() == null && ManufacturerUtils.isMeizuDevice()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(@Nullable Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (shouldUseTextInputLayoutFocusedRect(textInputLayout) && rect != null) {
            this.parentRect.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.parentRect);
        }
        return super.requestRectangleOnScreen(rect);
    }
}
