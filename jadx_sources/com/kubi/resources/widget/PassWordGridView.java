package com.kubi.resources.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.resources.C22912t;
import com.kubi.sdk.res.R$layout;
import io.reactivex.functions.Consumer;
import p011a9.C0206f;
import p752x8.AbstractC46099a;
import ro.C44128b;

/* JADX INFO: loaded from: classes13.dex */
public class PassWordGridView extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public final int f43987b;

    /* JADX INFO: renamed from: c */
    public Consumer<String> f43988c;

    /* JADX INFO: renamed from: d */
    public EditText f43989d;

    /* JADX INFO: renamed from: com.kubi.resources.widget.PassWordGridView$a */
    public class C22938a implements TextWatcher {
        public C22938a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            TextView textView = (TextView) PassWordGridView.this.getChildAt(i11 + 1);
            if (i12 == 0) {
                textView.setText("∗");
            } else {
                textView.setText("");
            }
            for (int i14 = 1; i14 < PassWordGridView.this.getChildCount(); i14++) {
                PassWordGridView.this.getChildAt(i14).setSelected(false);
            }
            if (charSequence.length() <= 5) {
                PassWordGridView.this.getChildAt(charSequence.length() + 1).setSelected(true);
            }
            if (TextUtils.isEmpty(charSequence) || charSequence.length() != 6 || PassWordGridView.this.f43988c == null) {
                return;
            }
            try {
                PassWordGridView.this.f43988c.accept(charSequence.toString());
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

    public PassWordGridView(@NonNull Context context) {
        super(context);
        this.f43987b = 6;
        m54713d();
    }

    /* JADX INFO: renamed from: e */
    public void m54714e(@DrawableRes int i11) {
        for (int i12 = 1; i12 < getChildCount(); i12++) {
            getChildAt(i12).setBackgroundResource(i11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m54710a(PassWordGridView passWordGridView, View view) {
        InputMethodManager inputMethodManager;
        if (!passWordGridView.f43989d.requestFocus() || (inputMethodManager = (InputMethodManager) passWordGridView.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(passWordGridView.f43989d, 1);
    }

    /* JADX INFO: renamed from: c */
    public void m54712c() {
        this.f43989d.setText((CharSequence) null);
        for (int i11 = 1; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof TextView) {
                ((TextView) getChildAt(i11)).setText("");
            }
        }
    }

    public String getPwd() {
        return this.f43989d.getText().toString();
    }

    public AbstractC46099a<CharSequence> getSubject() {
        return C0206f.m784d(this.f43989d);
    }

    public void setCompleteCallBack(Consumer<String> consumer) {
        this.f43988c = consumer;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: d */
    public final void m54713d() {
        C22912t.m54418p(this);
        EditText editText = new EditText(getContext());
        this.f43989d = editText;
        editText.setLayoutParams(new FrameLayout.LayoutParams(1, -2));
        this.f43989d.setCursorVisible(false);
        this.f43989d.setBackgroundDrawable(null);
        this.f43989d.setInputType(18);
        addView(this.f43989d);
        this.f43989d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        setOnClickListener(new View.OnClickListener() { // from class: com.kubi.resources.widget.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PassWordGridView.m54710a(this.f45222b, view);
            }
        });
        double dM6236a = C5275i0.m6236a(5.5f);
        double dM6183e = ((double) ((C5267e0.m6183e() - C5275i0.m6236a(32.0f)) - C5275i0.m6236a(55.0f))) / 6.0d;
        for (int i11 = 0; i11 < 6; i11++) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R$layout.kucoin_view_single_pwd_editext, (ViewGroup) null);
            textView.setTextSize(20.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) dM6183e, C5275i0.m6236a(48.0f), 1.0f);
            if (i11 == 0) {
                layoutParams.setMarginEnd((int) dM6236a);
            } else if (i11 == 5) {
                layoutParams.setMarginStart((int) dM6236a);
            } else {
                int i12 = (int) dM6236a;
                layoutParams.setMarginStart(i12);
                layoutParams.setMarginEnd(i12);
            }
            addView(textView, layoutParams);
        }
        getChildAt(1).setSelected(true);
        this.f43989d.addTextChangedListener(new C22938a());
    }

    public PassWordGridView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43987b = 6;
        m54713d();
    }

    public PassWordGridView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f43987b = 6;
        m54713d();
    }
}
