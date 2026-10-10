package com.kubi.resources.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.kubi.resources.C22890g;
import com.kubi.sdk.res.R$color;

/* JADX INFO: loaded from: classes13.dex */
public class UpDownColorTextView extends BaseTextView {

    /* JADX INFO: renamed from: b */
    public final Handler f44200b;

    /* JADX INFO: renamed from: c */
    public boolean f44201c;

    /* JADX INFO: renamed from: d */
    public Boolean f44202d;

    public UpDownColorTextView(Context context) {
        super(context);
        this.f44200b = new Handler(Looper.getMainLooper());
        this.f44201c = true;
        this.f44202d = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m54916c(boolean z11) {
        if (this.f44201c) {
            this.f44200b.removeCallbacksAndMessages(null);
            if (z11) {
                setTextColor(C22890g.m54291p(getContext()));
            } else {
                setTextColor(C22890g.m54289n(getContext()));
            }
            this.f44200b.postDelayed(new Runnable() { // from class: com.kubi.resources.widget.t3
                @Override // java.lang.Runnable
                public final void run() {
                    UpDownColorTextView upDownColorTextView = this.f45219b;
                    upDownColorTextView.setTextColor(upDownColorTextView.getResources().getColor(R$color.c_text));
                }
            }, 1200L);
        }
    }

    public void setSameSymbol(Boolean bool) {
        this.f44202d = bool;
    }

    @Override // com.kubi.resources.widget.BaseTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        double d11;
        Boolean bool;
        double d12 = -1.0d;
        try {
            d11 = Double.parseDouble(getText().toString().replace(",", ""));
        } catch (Exception unused) {
            d11 = -1.0d;
        }
        super.setText(charSequence, bufferType);
        if (!this.f44201c || ((bool = this.f44202d) != null && !bool.booleanValue())) {
            setTextColor(getResources().getColor(R$color.c_text));
            return;
        }
        try {
            d12 = Double.parseDouble(charSequence.toString().replace(",", ""));
        } catch (Exception unused2) {
        }
        if (d11 <= 0.0d || d11 == d12) {
            return;
        }
        m54916c(d12 > d11);
    }

    public void setVisibleToUser(boolean z11) {
        this.f44201c = z11;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44200b.removeCallbacksAndMessages(null);
    }

    public UpDownColorTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44200b = new Handler(Looper.getMainLooper());
        this.f44201c = true;
        this.f44202d = null;
    }

    public UpDownColorTextView(Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44200b = new Handler(Looper.getMainLooper());
        this.f44201c = true;
        this.f44202d = null;
    }
}
