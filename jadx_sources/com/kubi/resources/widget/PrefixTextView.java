package com.kubi.resources.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.C27096v0;

/* JADX INFO: loaded from: classes13.dex */
public class PrefixTextView extends BaseTextView {

    /* JADX INFO: renamed from: b */
    public int f43996b;

    public PrefixTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43996b = Color.parseColor("#DC5656");
        m54717b(attributeSet);
    }

    public void setTextLabel(String str) {
        m54718c(null, str);
    }

    @SuppressLint({"CustomViewStyleable"})
    /* JADX INFO: renamed from: b */
    public final void m54717b(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.kucoin_PrefixTextView);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_PrefixTextView_kucoin_prefix);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_PrefixTextView_kucoin_text);
        this.f43996b = typedArrayObtainStyledAttributes.getColor(R$styleable.kucoin_PrefixTextView_kucoin_prefix_color, Color.parseColor("#DC5656"));
        m54718c(string, string2);
        setGravity(16);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: c */
    public void m54718c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "• ";
        }
        C27096v0 c27096v0 = new C27096v0();
        c27096v0.m66905e(str, this.f43996b).m66905e(str2, getCurrentTextColor());
        setText(c27096v0);
    }

    public PrefixTextView(Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f43996b = Color.parseColor("#DC5656");
        m54717b(attributeSet);
    }
}
