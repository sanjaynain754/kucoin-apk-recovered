package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import cw.C36551a;
import p569qq.C43840a;

/* JADX INFO: loaded from: classes13.dex */
public class FixAutoSizeTextView extends BaseTextView {

    /* JADX INFO: renamed from: b */
    public int f43805b;

    /* JADX INFO: renamed from: c */
    public int f43806c;

    /* JADX INFO: renamed from: d */
    public int f43807d;

    /* JADX INFO: renamed from: e */
    public int f43808e;

    /* JADX INFO: renamed from: f */
    public boolean f43809f;

    public FixAutoSizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43809f = true;
        m54508e();
    }

    /* JADX INFO: renamed from: c */
    public final void m54509c() {
        TextViewCompat.setAutoSizeTextTypeWithDefaults(this, 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m54510d() {
        int i11;
        try {
            if (this.f43807d < 1) {
                this.f43807d = 1;
            }
            int i12 = this.f43805b;
            if (i12 != 0 && (i11 = this.f43806c) > i12) {
                TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this, i12, i11, this.f43807d, 0);
                return;
            }
            C43840a.m96550d("minTextSize:" + this.f43805b + ",maxTextSize=" + this.f43806c, "FixAutoSizeTextView");
        } catch (Throwable th2) {
            C36551a.m81821a(th2, "FixAutoSizeTextView");
        }
    }

    public void setNeedAuto(boolean z11) {
        this.f43809f = z11;
        if (z11) {
            setMaxWidth(this.f43808e);
        } else {
            setMaxWidth(Integer.MAX_VALUE);
            m54509c();
        }
    }

    @Override // com.kubi.resources.widget.BaseTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.f43809f) {
            super.setText(charSequence, bufferType);
            return;
        }
        m54509c();
        setTextSize(0, this.f43806c);
        super.setText(charSequence, bufferType);
        post(new Runnable() { // from class: com.kubi.resources.widget.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f45294b.m54510d();
            }
        });
    }

    /* JADX INFO: renamed from: e */
    private void m54508e() {
        this.f43805b = TextViewCompat.getAutoSizeMinTextSize(this);
        this.f43806c = TextViewCompat.getAutoSizeMaxTextSize(this);
        this.f43807d = Math.max(1, TextViewCompat.getAutoSizeStepGranularity(this));
        this.f43808e = getMaxWidth();
    }

    public FixAutoSizeTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f43809f = true;
        m54508e();
    }
}
