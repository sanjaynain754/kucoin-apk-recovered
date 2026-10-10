package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.resources.C22912t;
import com.kubi.resources.ResViewEx;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.res.R$font;
import com.kubi.utils.C27014a1;

/* JADX INFO: loaded from: classes13.dex */
public class PasswordToggleView extends FocusEditTextLinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: d */
    public ClearEditText f43991d;

    /* JADX INFO: renamed from: e */
    public ImageView f43992e;

    /* JADX INFO: renamed from: f */
    public View f43993f;

    /* JADX INFO: renamed from: g */
    public boolean f43994g;

    /* JADX INFO: renamed from: com.kubi.resources.widget.PasswordToggleView$a */
    public class C22939a implements TextWatcher {
        public C22939a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                PasswordToggleView.this.f43993f.setVisibility(8);
            } else {
                PasswordToggleView.this.f43993f.setVisibility(0);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    public ClearEditText getEditText() {
        return this.f43991d;
    }

    public void setNumberPwd(boolean z11) {
        if (z11) {
            this.f43991d.setInputType(18);
        } else {
            this.f43991d.setInputType(129);
        }
    }

    public PasswordToggleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43994g = false;
        m54716d();
    }

    /* JADX INFO: renamed from: d */
    public final void m54716d() {
        int i11;
        C22912t.m54418p(this);
        setOrientation(0);
        ClearEditText clearEditText = new ClearEditText(getContext());
        this.f43991d = clearEditText;
        clearEditText.setCanFilter(false);
        this.f43991d.setBackground(null);
        this.f43991d.setSingleLine();
        this.f43991d.setTextSize(16.0f);
        ResViewEx.f43501a.setCompactTextCursorDrawable4Java(this.f43991d, R$drawable.shape_primary_cursor);
        this.f43991d.setTextColor(ContextCompat.getColor(getContext(), R$color.c_text));
        this.f43991d.setHintTextColor(ContextCompat.getColor(getContext(), R$color.c_text40));
        this.f43991d.setInputType(129);
        this.f43991d.setGravity(16);
        this.f43991d.setTypeface(ResourcesCompat.getFont(getContext(), R$font.medium));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1, 3.0f);
        layoutParams.gravity = 16;
        addView(this.f43991d, layoutParams);
        ImageView imageView = new ImageView(getContext());
        this.f43992e = imageView;
        imageView.setColorFilter(getResources().getColor(R$color.c_icon40), PorterDuff.Mode.SRC_IN);
        int iM6236a = C5275i0.m6236a(8.0f);
        this.f43992e.setPaddingRelative(0, iM6236a, 0, iM6236a);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C5275i0.m6236a(40.0f), C5275i0.m6236a(40.0f));
        this.f43992e.setPaddingRelative(C5275i0.m6236a(10.0f), C5275i0.m6236a(10.0f), 10, C5275i0.m6236a(10.0f));
        layoutParams2.gravity = 17;
        View view = new View(getContext());
        this.f43993f = view;
        view.setBackgroundResource(R$color.c_cover8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(C5275i0.m6236a(1.0f), C5275i0.m6236a(16.0f));
        layoutParams3.gravity = 16;
        layoutParams3.setMarginStart(C5275i0.m6236a(5.0f));
        addView(this.f43993f, layoutParams3);
        addView(this.f43992e, layoutParams2);
        this.f43992e.setOnClickListener(this);
        ImageView imageView2 = this.f43992e;
        if (this.f43994g) {
            i11 = R$drawable.ic2_eye_open_20;
        } else {
            i11 = R$drawable.ic2_eye_close_20;
        }
        imageView2.setImageResource(i11);
        this.f43991d.addTextChangedListener(new C22939a());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i11;
        if (C27014a1.m66501a(view)) {
            return;
        }
        boolean z11 = this.f43994g;
        this.f43994g = !z11;
        ImageView imageView = this.f43992e;
        if (!z11) {
            i11 = R$drawable.ic_eye_open_20;
        } else {
            i11 = R$drawable.ic_eye_close_20;
        }
        imageView.setImageResource(i11);
        if (!this.f43994g) {
            this.f43991d.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else {
            this.f43991d.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        }
        ClearEditText clearEditText = this.f43991d;
        clearEditText.setSelection(clearEditText.getText().length());
    }
}
