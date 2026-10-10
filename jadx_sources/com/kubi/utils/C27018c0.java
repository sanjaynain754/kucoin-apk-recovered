package com.kubi.utils;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5287o0;

/* JADX INFO: renamed from: com.kubi.utils.c0 */
/* JADX INFO: compiled from: MyClickSpan.java */
/* JADX INFO: loaded from: classes54.dex */
public class C27018c0 extends ClickableSpan {

    /* JADX INFO: renamed from: b */
    public View.OnClickListener f54311b;

    /* JADX INFO: renamed from: c */
    @ColorRes
    public int f54312c;

    public C27018c0(@ColorRes int i11, View.OnClickListener onClickListener) {
        this.f54311b = onClickListener;
        this.f54312c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        View.OnClickListener onClickListener;
        if (!C27014a1.m66501a(view) && (onClickListener = this.f54311b) != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        textPaint.setColor(ContextCompat.getColor(C5287o0.m6331a().getApplicationContext(), this.f54312c));
    }
}
