package com.kubi.otc.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.view.PaymentPassWordGridView;
import com.kubi.resources.C22912t;
import com.tencent.bugly.proguard.C33627eb;
import io.reactivex.functions.Consumer;
import p011a9.C0206f;
import p752x8.AbstractC46099a;
import ro.C44128b;

/* JADX INFO: loaded from: classes33.dex */
public class PaymentPassWordGridView extends LinearLayoutCompat {

    /* JADX INFO: renamed from: b */
    public final int f38171b;

    /* JADX INFO: renamed from: c */
    public Consumer<String> f38172c;

    /* JADX INFO: renamed from: d */
    public EditText f38173d;

    /* JADX INFO: renamed from: com.kubi.otc.view.PaymentPassWordGridView$a */
    public class C20291a implements TextWatcher {
        public C20291a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            TextView textView = (TextView) PaymentPassWordGridView.this.getChildAt(i11 + 1);
            if (i12 == 0) {
                textView.setText(PaymentPassWordGridView.this.m45559e());
            } else {
                textView.setText("");
            }
            for (int i14 = 1; i14 < PaymentPassWordGridView.this.getChildCount(); i14++) {
                PaymentPassWordGridView.this.getChildAt(i14).setSelected(false);
            }
            if (charSequence.length() <= 5) {
                PaymentPassWordGridView.this.getChildAt(charSequence.length() + 1).setSelected(true);
            }
            if (TextUtils.isEmpty(charSequence) || charSequence.length() != 6 || PaymentPassWordGridView.this.f38172c == null) {
                return;
            }
            try {
                PaymentPassWordGridView.this.f38172c.accept(charSequence.toString());
            } catch (Exception e11) {
                C44128b.m97264h(e11);
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.view.PaymentPassWordGridView$b */
    public class C20292b extends ImageSpan {
        public C20292b(Drawable drawable) {
            super(drawable);
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, @NonNull Paint paint) {
            Drawable drawable = getDrawable();
            canvas.save();
            canvas.translate(f11, (i13 + ((i15 - i13) / 2.0f)) - (drawable.getBounds().height() / 2.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public PaymentPassWordGridView(@NonNull Context context) {
        super(context);
        this.f38171b = 6;
        m45557f();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m45554a(PaymentPassWordGridView paymentPassWordGridView, View view) {
        InputMethodManager inputMethodManager;
        if (!paymentPassWordGridView.f38173d.requestFocus() || (inputMethodManager = (InputMethodManager) paymentPassWordGridView.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(paymentPassWordGridView.f38173d, 1);
    }

    /* JADX INFO: renamed from: d */
    public void m45558d() {
        this.f38173d.setText((CharSequence) null);
        for (int i11 = 1; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof TextView) {
                ((TextView) getChildAt(i11)).setText("");
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final SpannableString m45559e() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(ContextCompat.getColor(getContext(), R$color.c_text));
        int iM6236a = C5275i0.m6236a(8.0f);
        gradientDrawable.setBounds(0, 0, iM6236a, iM6236a);
        C20292b c20292b = new C20292b(gradientDrawable);
        SpannableString spannableString = new SpannableString(C33627eb.f69716f);
        spannableString.setSpan(c20292b, 0, 1, 33);
        return spannableString;
    }

    public String getPwd() {
        return this.f38173d.getText().toString();
    }

    public AbstractC46099a<CharSequence> getSubject() {
        return C0206f.m784d(this.f38173d);
    }

    public void setCompleteCallBack(Consumer<String> consumer) {
        this.f38172c = consumer;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: f */
    private void m45557f() {
        C22912t.m54418p(this);
        EditText editText = new EditText(getContext());
        this.f38173d = editText;
        editText.setLayoutParams(new FrameLayout.LayoutParams(1, -2));
        this.f38173d.setCursorVisible(false);
        this.f38173d.setBackgroundDrawable(null);
        this.f38173d.setInputType(18);
        this.f38173d.setPadding(0, 0, 0, 0);
        addView(this.f38173d);
        this.f38173d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        setOnClickListener(new View.OnClickListener() { // from class: mt.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentPassWordGridView.m45554a(this.f94378b, view);
            }
        });
        int iM6236a = C5275i0.m6236a(12.0f);
        int iM6183e = (((C5267e0.m6183e() - (C5275i0.m6236a(16.0f) * 2)) - (iM6236a * 5)) / 6) - 1;
        for (int i11 = 0; i11 < 6; i11++) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            appCompatTextView.setTextSize(20.0f);
            appCompatTextView.setBackgroundResource(R$drawable.shape_input_pwd_dialog_v2);
            appCompatTextView.setGravity(17);
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(iM6183e, iM6183e);
            if (i11 < 5) {
                layoutParams.setMarginEnd(iM6236a);
            }
            addView(appCompatTextView, layoutParams);
        }
        getChildAt(1).setSelected(true);
        this.f38173d.addTextChangedListener(new C20291a());
    }

    public PaymentPassWordGridView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38171b = 6;
        m45557f();
    }

    public PaymentPassWordGridView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f38171b = 6;
        m45557f();
    }
}
