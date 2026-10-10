package com.kubi.resources.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5301v0;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.futures.trade.welfare.C14439y;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.res.R$font;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.C27021e;
import cw.C36551a;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import k00.C40855s;
import p011a9.C0206f;
import ro.C44127a;
import ro.C44128b;

/* JADX INFO: loaded from: classes13.dex */
public class TradeInputEditor extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public C40855s f44104b;

    /* JADX INFO: renamed from: c */
    public double f44105c;

    /* JADX INFO: renamed from: d */
    public int f44106d;

    /* JADX INFO: renamed from: e */
    public double f44107e;

    /* JADX INFO: renamed from: f */
    public View.OnFocusChangeListener f44108f;

    /* JADX INFO: renamed from: g */
    public boolean f44109g;

    /* JADX INFO: renamed from: h */
    public boolean f44110h;

    /* JADX INFO: renamed from: com.kubi.resources.widget.TradeInputEditor$a */
    public class C22954a extends AbstractViewOnTouchListenerC22956c {
        public C22954a() {
        }

        @Override // com.kubi.resources.widget.TradeInputEditor.AbstractViewOnTouchListenerC22956c
        /* JADX INFO: renamed from: b */
        public void mo54824b() {
            TradeInputEditor tradeInputEditor = TradeInputEditor.this;
            if (tradeInputEditor.f44110h) {
                tradeInputEditor.m54823n();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.TradeInputEditor$b */
    public class C22955b extends AbstractViewOnTouchListenerC22956c {
        public C22955b() {
        }

        @Override // com.kubi.resources.widget.TradeInputEditor.AbstractViewOnTouchListenerC22956c
        /* JADX INFO: renamed from: b */
        public void mo54824b() {
            TradeInputEditor tradeInputEditor = TradeInputEditor.this;
            if (tradeInputEditor.f44109g) {
                tradeInputEditor.m54815e();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.TradeInputEditor$c */
    public static abstract class AbstractViewOnTouchListenerC22956c implements View.OnTouchListener {

        /* JADX INFO: renamed from: b */
        public Handler f44113b = new a();

        /* JADX INFO: renamed from: com.kubi.resources.widget.TradeInputEditor$c$a */
        public class a extends Handler {
            public a() {
            }

            @Override // android.os.Handler
            @SuppressLint({"HandlerLeak"})
            public void handleMessage(@NonNull Message message) {
                if (message.what == 0) {
                    AbstractViewOnTouchListenerC22956c.this.m54826c();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo54824b();

        /* JADX INFO: renamed from: c */
        public final void m54826c() {
            this.f44113b.sendEmptyMessageDelayed(0, ViewConfiguration.getTapTimeout());
            mo54824b();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.f44113b.sendEmptyMessageDelayed(0, ViewConfiguration.getLongPressTimeout());
            }
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.f44113b.removeMessages(0);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.TradeInputEditor$d */
    public interface InterfaceC22957d {
    }

    public TradeInputEditor(@NonNull Context context) {
        this(context, null);
    }

    public void setValue(double d11) {
        m54822m(d11, false);
    }

    public TradeInputEditor(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m54810a(TradeInputEditor tradeInputEditor, View view) {
        if (tradeInputEditor.f44109g) {
            tradeInputEditor.m54815e();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m54811b(TradeInputEditor tradeInputEditor, View view) {
        if (tradeInputEditor.f44110h) {
            tradeInputEditor.m54823n();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m54813d(TradeInputEditor tradeInputEditor, AbstractViewOnTouchListenerC22956c abstractViewOnTouchListenerC22956c, CharSequence charSequence) {
        tradeInputEditor.f44104b.f90819d.setEnabled(!TextUtils.isEmpty(charSequence));
        if (!TextUtils.isEmpty(charSequence) || abstractViewOnTouchListenerC22956c.f44113b == null) {
            return;
        }
        abstractViewOnTouchListenerC22956c.f44113b.removeMessages(0);
    }

    /* JADX INFO: renamed from: f */
    public static void m54814f(EditText editText) {
        C5301v0.m6505b(40L);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(editText, "scaleX", 1.0f, 1.2f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(editText, "scaleY", 1.0f, 1.2f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(100L).playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    public EditText getEditText() {
        return this.f44104b.f90817b;
    }

    /* JADX INFO: renamed from: h */
    public final String m54817h(double d11) {
        return C6447a.m11724a(new BigDecimal(String.valueOf(d11)).setScale(this.f44106d, RoundingMode.DOWN)).toPlainString();
    }

    /* JADX INFO: renamed from: i */
    public final void m54818i(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.kucoin_TradeInputEditor);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_TradeInputEditor_kucoin_tie_hint);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.kucoin_TradeInputEditor_kucoin_tie_hint_color, ContextCompat.getColor(context, R$color.emphasis30));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.kucoin_TradeInputEditor_kucoin_tie_text_size, C5275i0.m6241f(16.0f));
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.kucoin_TradeInputEditor_kucoin_tie_text_color, ContextCompat.getColor(context, R$color.emphasis));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.kucoin_TradeInputEditor_kucoin_tie_btn_width, C5275i0.m6236a(36.0f));
        typedArrayObtainStyledAttributes.recycle();
        m54820k(this.f44104b.f90817b, string, 14);
        this.f44104b.f90817b.setHintTextColor(color);
        this.f44104b.f90817b.setTextSize(0, dimensionPixelSize);
        this.f44104b.f90817b.setTextColor(color2);
        ViewGroup.LayoutParams layoutParams = this.f44104b.f90819d.getLayoutParams();
        layoutParams.width = dimensionPixelSize2;
        this.f44104b.f90819d.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f44104b.f90818c.getLayoutParams();
        layoutParams2.width = dimensionPixelSize2;
        this.f44104b.f90818c.setLayoutParams(layoutParams2);
        if (getBackground() == null) {
            setBackgroundResource(R$drawable.shape_edittext_input_background);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m54819j() {
        this.f44104b.f90817b.setFocusable(true);
        this.f44104b.f90817b.setFocusableInTouchMode(true);
        this.f44104b.f90817b.requestFocus();
    }

    /* JADX INFO: renamed from: l */
    public void m54821l(double d11, int i11) {
        this.f44106d = i11;
        this.f44105c = d11;
        setEnsureIncrement(d11);
        if (i11 <= 0) {
            this.f44104b.f90817b.setInputType(2);
        } else {
            this.f44104b.f90817b.setInputType(8194);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m54822m(double d11, boolean z11) {
        C40855s c40855s = this.f44104b;
        if (c40855s == null) {
            return;
        }
        if (d11 == 0.0d) {
            c40855s.f90817b.setText("");
            return;
        }
        String strM54817h = m54817h(d11);
        if (strM54817h.equals(this.f44104b.f90817b.getText() != null ? this.f44104b.f90817b.getText().toString() : "")) {
            return;
        }
        this.f44104b.f90817b.setText(strM54817h);
        FilterEmojiEditText filterEmojiEditText = this.f44104b.f90817b;
        filterEmojiEditText.setSelection(filterEmojiEditText.getText().length());
        if (z11) {
            m54814f(this.f44104b.f90817b);
        }
    }

    public void setEnsureIncrement(double d11) {
        this.f44107e = d11;
    }

    public void setHint(CharSequence charSequence) {
        m54820k(this.f44104b.f90817b, charSequence.toString(), 14);
    }

    public void setInnerFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f44108f = onFocusChangeListener;
    }

    public void setUseAddInput(boolean z11) {
        this.f44109g = z11;
    }

    public void setUseSubInput(boolean z11) {
        this.f44110h = z11;
    }

    @SuppressLint({"CheckResult"})
    public TradeInputEditor(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44106d = 8;
        this.f44109g = true;
        this.f44110h = true;
        C40855s c40855sM89412b = C40855s.m89412b(LayoutInflater.from(context), this);
        this.f44104b = c40855sM89412b;
        View root = c40855sM89412b.getRoot();
        m54818i(context, attributeSet);
        this.f44104b.f90817b.setInputType(8194);
        this.f44104b.f90817b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.resources.widget.g2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                this.f44846b.m54816g(z11);
            }
        });
        int i12 = R$id.iv_trade_sub;
        root.findViewById(i12).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.resources.widget.h2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TradeInputEditor.m54811b(this.f44852b, view);
            }
        });
        final C22954a c22954a = new C22954a();
        root.findViewById(i12).setOnTouchListener(c22954a);
        int i13 = R$id.iv_trade_add;
        root.findViewById(i13).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.resources.widget.i2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TradeInputEditor.m54810a(this.f44859b, view);
            }
        });
        root.findViewById(i13).setOnTouchListener(new C22955b());
        C0206f.m784d(this.f44104b.f90817b).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.kubi.resources.widget.j2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeInputEditor.m54813d(this.f44918b, c22954a, (CharSequence) obj);
            }
        }, new Consumer() { // from class: com.kubi.resources.widget.k2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C44128b.m97264h((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m54815e() {
        setValue(C27021e.m66522a(getValue(), this.f44105c));
        m54819j();
    }

    /* JADX INFO: renamed from: g */
    public void m54816g(boolean z11) {
        C40855s c40855s;
        setSelected(z11);
        View.OnFocusChangeListener onFocusChangeListener = this.f44108f;
        if (onFocusChangeListener != null && (c40855s = this.f44104b) != null) {
            onFocusChangeListener.onFocusChange(c40855s.f90817b, z11);
        }
        if (this.f44104b != null && this.f44107e != 0.0d) {
            try {
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(getValue()));
                if (!z11 && bigDecimal.doubleValue() != 0.0d) {
                    BigDecimal bigDecimalRemainder = bigDecimal.remainder(new BigDecimal(String.valueOf(this.f44107e)));
                    if (bigDecimalRemainder.compareTo(BigDecimal.ZERO) != 0) {
                        setValue(bigDecimal.subtract(bigDecimalRemainder).doubleValue());
                    }
                }
            } catch (Exception e11) {
                C44127a.m97248h(e11);
            }
        }
    }

    public double getValue() {
        String string;
        if (!isEnabled()) {
            return 0.0d;
        }
        if (this.f44104b.f90817b.getText() != null) {
            string = this.f44104b.f90817b.getText().toString();
        } else {
            string = "";
        }
        if (TextUtils.isEmpty(string)) {
            return 0.0d;
        }
        try {
            return new BigDecimal(string).doubleValue();
        } catch (Exception e11) {
            C44128b.m97264h(e11);
            return 0.0d;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m54820k(EditText editText, String str, int i11) {
        Typeface font;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(i11, true);
        if (Build.VERSION.SDK_INT >= 28 && (font = ResourcesCompat.getFont(getContext(), R$font.medium)) != null) {
            spannableString.setSpan(C14439y.m28811a(font), 0, spannableString.length(), 33);
        }
        spannableString.setSpan(absoluteSizeSpan, 0, spannableString.length(), 33);
        editText.setHint(new SpannableString(spannableString));
    }

    /* JADX INFO: renamed from: n */
    public void m54823n() {
        double value = getValue();
        if (value != 0.0d) {
            try {
                setValue(Math.max(0.0d, C27021e.m66527f(value, this.f44105c)));
                m54819j();
            } catch (Throwable th2) {
                C36551a.m81821a(th2, "TradeInputEditor");
            }
        }
    }

    public void setSubOrAddClickListener(InterfaceC22957d interfaceC22957d) {
    }
}
