package com.kubi.resources.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.res.R$font;
import cw.C36551a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ClearEditText extends FilterEmojiEditText implements TextWatcher {

    /* JADX INFO: renamed from: d */
    public List<View.OnFocusChangeListener> f43754d;

    /* JADX INFO: renamed from: e */
    public Drawable f43755e;

    /* JADX INFO: renamed from: f */
    public boolean f43756f;

    /* JADX INFO: renamed from: g */
    public Typeface f43757g;

    /* JADX INFO: renamed from: h */
    public Typeface f43758h;

    public ClearEditText(Context context) {
        super(context);
        this.f43756f = true;
        m54478g();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m54477e(ClearEditText clearEditText, View view, boolean z11) {
        for (View.OnFocusChangeListener onFocusChangeListener : clearEditText.f43754d) {
            if (view != null && onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z11);
            }
        }
        if (!z11 || TextUtils.isEmpty(clearEditText.getText())) {
            clearEditText.setCompoundDrawablesRelative(clearEditText.getCompoundDrawablesRelative()[0], null, null, null);
        } else {
            clearEditText.setCompoundDrawablesRelative(clearEditText.getCompoundDrawablesRelative()[0], null, clearEditText.f43755e, null);
        }
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* JADX INFO: renamed from: g */
    private void m54478g() {
        this.f43754d = new ArrayList();
        Drawable drawable = getResources().getDrawable(R$drawable.ic2_close_filled_20);
        this.f43755e = drawable;
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), this.f43755e.getMinimumHeight());
        this.f43755e.setColorFilter(getContext().getResources().getColor(R$color.c_icon40), PorterDuff.Mode.SRC_IN);
        setCompoundDrawablePadding(C5275i0.m6236a(8.0f));
        addTextChangedListener(this);
        super.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.resources.widget.s
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                ClearEditText.m54477e(this.f45105b, view, z11);
            }
        });
        m54479f(getText());
    }

    /* JADX INFO: renamed from: f */
    public final void m54479f(CharSequence charSequence) {
        try {
            if (this.f43757g == null) {
                this.f43757g = ResourcesCompat.getFont(getContext(), R$font.regular);
            }
            if (this.f43758h == null) {
                this.f43758h = ResourcesCompat.getFont(getContext(), R$font.medium);
            }
            if (TextUtils.isEmpty(charSequence)) {
                if (this.f43757g != getTypeface()) {
                    setTypeface(this.f43757g);
                }
            } else if (this.f43758h != getTypeface()) {
                setTypeface(this.f43758h);
            }
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "adjustFont";
            }
            C36551a.m81822b(message, "ClearEditText");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        if (Build.VERSION.SDK_INT < 26 || this.f43756f) {
            return super.getAutofillType();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public void m54480h(int i11) {
        this.f43755e.setBounds(0, 0, i11, i11);
    }

    public void setInnerFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.f43754d == null) {
            this.f43754d = new ArrayList();
        }
        this.f43754d.add(onFocusChangeListener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.f43754d == null) {
            this.f43754d = new ArrayList();
        }
        this.f43754d.add(onFocusChangeListener);
    }

    public void setSupportSysAutoFill(boolean z11) {
        this.f43756f = z11;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (TextUtils.isEmpty(editable)) {
            setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], null, null, null);
        } else if (hasFocus()) {
            setCompoundDrawablesRelative(getCompoundDrawablesRelative()[0], null, this.f43755e, null);
        }
        m54479f(editable);
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && getCompoundDrawablesRelative()[2] != null && (getLayoutDirection() != 1 ? !(motionEvent.getX() <= getWidth() - getTotalPaddingEnd() || motionEvent.getX() >= getWidth() - getPaddingEnd()) : !(motionEvent.getX() <= getPaddingEnd() || motionEvent.getX() >= getTotalPaddingEnd()))) {
            setText("");
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "onTouchEvent";
            }
            C36551a.m81822b(message, "ClearEditText");
            return false;
        }
    }

    public ClearEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43756f = true;
        m54478g();
    }

    public ClearEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f43756f = true;
        m54478g();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
