package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: loaded from: classes12.dex */
public class FilterEmojiEditText extends TextInputEditText implements C23161v.a {

    /* JADX INFO: renamed from: b */
    public boolean f43803b;

    /* JADX INFO: renamed from: c */
    public boolean f43804c;

    public FilterEmojiEditText(Context context) {
        super(context);
        this.f43803b = true;
        this.f43804c = true;
        m54504d();
    }

    /* JADX INFO: renamed from: d */
    private void m54504d() {
        addTextChangedListener(new C23161v(this, getContext()));
    }

    @Override // com.kubi.resources.widget.C23161v.a
    /* JADX INFO: renamed from: a */
    public boolean mo54505a() {
        return this.f43804c;
    }

    @Override // com.kubi.resources.widget.C23161v.a
    /* JADX INFO: renamed from: c */
    public boolean mo54506c() {
        return this.f43803b;
    }

    public void setCanFilter(boolean z11) {
        this.f43803b = z11;
    }

    public void setShowToast(boolean z11) {
        this.f43804c = z11;
    }

    public FilterEmojiEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43803b = true;
        this.f43804c = true;
        m54504d();
    }

    public FilterEmojiEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f43803b = true;
        this.f43804c = true;
        m54504d();
    }
}
