package com.kubi.sdk.widget.shape.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.res.R$styleable;
import l10.C42025b;
import l10.C42026c;
import o10.C42945o;

/* JADX INFO: loaded from: classes43.dex */
public class ShapeTextView extends BaseTextView {

    /* JADX INFO: renamed from: d */
    public static final C42945o f48666d = new C42945o();

    /* JADX INFO: renamed from: b */
    public final C42025b f48667b;

    /* JADX INFO: renamed from: c */
    public final C42026c f48668c;

    public ShapeTextView(Context context) {
        this(context, null);
    }

    public ShapeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public C42025b getShapeDrawableBuilder() {
        return this.f48667b;
    }

    public C42026c getTextColorBuilder() {
        return this.f48668c;
    }

    @Override // com.kubi.resources.widget.BaseTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C42026c c42026c = this.f48668c;
        if (c42026c == null || !(c42026c.m92157d() || this.f48668c.m92158e())) {
            super.setText(charSequence, bufferType);
        } else {
            super.setText(this.f48668c.m92155b(charSequence), bufferType);
        }
    }

    public ShapeTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShapeTextView);
        C42945o c42945o = f48666d;
        C42025b c42025b = new C42025b(this, typedArrayObtainStyledAttributes, c42945o);
        this.f48667b = c42025b;
        C42026c c42026c = new C42026c(this, typedArrayObtainStyledAttributes, c42945o);
        this.f48668c = c42026c;
        typedArrayObtainStyledAttributes.recycle();
        c42025b.m92143e();
        if (!c42026c.m92157d() && !c42026c.m92158e()) {
            c42026c.m92156c();
        } else {
            setText(getText());
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i11) {
        super.setTextColor(i11);
        C42026c c42026c = this.f48668c;
        if (c42026c == null) {
            return;
        }
        c42026c.m92159f(i11);
    }
}
