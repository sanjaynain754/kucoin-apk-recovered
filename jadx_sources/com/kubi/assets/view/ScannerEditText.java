package com.kubi.assets.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$styleable;
import com.kubi.qrcode.api.service.IQrCodeService;
import com.kubi.resources.widget.round.widget.RoundTextView;
import com.kubi.sdk.BaseActivity;
import com.kubi.utils.C27057k;
import io.reactivex.functions.Action;
import p637ta.C44821m5;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import ro.C44128b;

/* JADX INFO: loaded from: classes6.dex */
public class ScannerEditText extends ConstraintLayout {

    /* JADX INFO: renamed from: n */
    public C44821m5 f19102n;

    /* JADX INFO: renamed from: o */
    public final String f19103o;

    /* JADX INFO: renamed from: p */
    public final int f19104p;

    /* JADX INFO: renamed from: q */
    public View.OnClickListener f19105q;

    /* JADX INFO: renamed from: r */
    public Action f19106r;

    /* JADX INFO: renamed from: s */
    public boolean f19107s;

    /* JADX INFO: renamed from: t */
    public RoundTextView f19108t;

    /* JADX INFO: renamed from: com.kubi.assets.view.ScannerEditText$a */
    public class C11240a implements TextWatcher {
        public C11240a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (ScannerEditText.this.f19108t != null) {
                ScannerEditText.this.f19108t.setVisibility(8);
            }
            if (ScannerEditText.this.f19107s) {
                if (TextUtils.isEmpty(editable)) {
                    ScannerEditText.this.f19102n.f100472h.setVisibility(0);
                    ScannerEditText.this.f19102n.f100466b.setVisibility(8);
                } else {
                    ScannerEditText.this.f19102n.f100466b.setVisibility(0);
                    ScannerEditText.this.f19102n.f100472h.setVisibility(8);
                }
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            ScannerEditText.this.f19102n.f100469e.requestFocus();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    public ScannerEditText(Context context) {
        this(context, null);
    }

    public ScannerEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EditText getInputEditText() {
        return this.f19102n.f100469e;
    }

    public CharSequence getText() {
        return this.f19102n.f100469e.getText();
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: j */
    public final void m20041j() {
        if (this.f19105q != null) {
            return;
        }
        Context context = getContext();
        if (context instanceof BaseActivity) {
            IQrCodeService.f40829a.get().handleScanCodeResult((BaseActivity) context, new Function1() { // from class: com.kubi.assets.view.y0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ScannerEditText.m20033b(this.f19193b, (String) obj);
                }
            });
        }
    }

    public void setGone(boolean z11) {
        this.f19107s = z11;
        this.f19102n.f100466b.setVisibility(z11 ? 0 : 8);
        this.f19102n.f100467c.setVisibility(z11 ? 0 : 8);
        this.f19102n.f100472h.setVisibility(z11 ? 0 : 8);
        if (z11) {
            return;
        }
        setBackgroundResource(R$drawable.bassets_shape_border_dash);
    }

    public void setOnSetCallBack(Action action) {
        this.f19106r = action;
    }

    public void setScanClickListener(View.OnClickListener onClickListener) {
        this.f19105q = onClickListener;
        this.f19102n.f100467c.setOnClickListener(onClickListener);
    }

    public void setTag(String str) {
        if (this.f19108t == null) {
            this.f19108t = new RoundTextView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f19108t.setPadding(C5275i0.m6236a(4.0f), 0, C5275i0.m6236a(4.0f), 0);
            layoutParams.setMargins(C5275i0.m6236a(12.0f), C5275i0.m6236a(12.0f), 0, C5275i0.m6236a(-8.0f));
            this.f19108t.setCornerRadius(C5275i0.m6236a(2.0f));
            this.f19108t.setBackgroundResource(R$color.primary8);
            this.f19108t.setTextColor(getResources().getColor(R$color.primary));
            this.f19102n.f100471g.addView(this.f19108t, 0, layoutParams);
        }
        if (TextUtils.isEmpty(str)) {
            this.f19108t.setVisibility(8);
        } else {
            this.f19108t.setVisibility(0);
            this.f19108t.setText(str);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f19102n.f100469e.setText(charSequence);
        EditText editText = this.f19102n.f100469e;
        editText.setSelection(editText.getText().length());
        Action action = this.f19106r;
        if (action != null) {
            try {
                action.run();
            } catch (Exception e11) {
                C44128b.m97263g("ScannerEditText", e11);
            }
        }
    }

    public ScannerEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f19105q = null;
        this.f19107s = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.kucoin_ScannerEditText);
        this.f19103o = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_ScannerEditText_kucoin_hint);
        this.f19104p = typedArrayObtainStyledAttributes.getColor(R$styleable.kucoin_ScannerEditText_kucoin_hint_color, ContextCompat.getColor(context, R$color.emphasis));
        typedArrayObtainStyledAttributes.recycle();
        m20040i();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Unit m20033b(ScannerEditText scannerEditText, String str) {
        scannerEditText.getClass();
        if (!TextUtils.isEmpty(str)) {
            scannerEditText.setText(str);
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m20036e(ScannerEditText scannerEditText, View view) {
        scannerEditText.getClass();
        CharSequence charSequenceM66749e = C27057k.m66749e();
        if (!TextUtils.isEmpty(charSequenceM66749e)) {
            scannerEditText.setText(charSequenceM66749e);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m20040i() {
        this.f19102n = C44821m5.m99167c(LayoutInflater.from(getContext()), this, true);
        setFocusableInTouchMode(true);
        setFocusable(true);
        this.f19102n.f100469e.setHint(this.f19103o);
        this.f19102n.f100469e.setHintTextColor(this.f19104p);
        this.f19102n.f100469e.clearFocus();
        setBackgroundResource(R$drawable.asset_edittext_background_with_emphasis3_4);
        this.f19102n.f100467c.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19183b.m20041j();
            }
        });
        this.f19102n.f100472h.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScannerEditText.m20036e(this.f19184b, view);
            }
        });
        this.f19102n.f100470f.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19186b.f19102n.f100469e.requestFocus();
            }
        });
        this.f19102n.f100466b.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.view.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19191b.f19102n.f100469e.getEditableText().clear();
            }
        });
        this.f19102n.f100469e.addTextChangedListener(new C11240a());
    }
}
