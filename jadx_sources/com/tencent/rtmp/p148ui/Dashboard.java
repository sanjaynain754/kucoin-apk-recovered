package com.tencent.rtmp.p148ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes56.dex */
public class Dashboard extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private final StringBuilder f75409a;

    /* JADX INFO: renamed from: b */
    private final SimpleDateFormat f75410b;

    /* JADX INFO: renamed from: c */
    private TextView f75411c;

    /* JADX INFO: renamed from: d */
    private TextView f75412d;

    /* JADX INFO: renamed from: e */
    private ScrollView f75413e;

    /* JADX INFO: renamed from: f */
    private int f75414f;

    /* JADX INFO: renamed from: g */
    private boolean f75415g;

    public Dashboard(Context context) {
        this(context, null);
    }

    public void setShowLevel(int i11) {
        if (i11 == 0) {
            TextView textView = this.f75411c;
            if (textView != null) {
                textView.setVisibility(4);
            }
            ScrollView scrollView = this.f75413e;
            if (scrollView != null) {
                scrollView.setVisibility(4);
            }
            setVisibility(4);
            return;
        }
        if (i11 != 1) {
            m77297a();
            this.f75411c.setVisibility(0);
            this.f75413e.setVisibility(0);
            setVisibility(0);
            return;
        }
        m77297a();
        this.f75411c.setVisibility(0);
        this.f75413e.setVisibility(4);
        setVisibility(0);
    }

    public Dashboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75409a = new StringBuilder();
        this.f75410b = new SimpleDateFormat("HH:mm:ss.SSS", Locale.ENGLISH);
        this.f75414f = 3000;
        this.f75415g = false;
        setOrientation(1);
        setVisibility(8);
    }

    /* JADX INFO: renamed from: a */
    private void m77297a() {
        if (this.f75411c != null) {
            return;
        }
        this.f75411c = new TextView(getContext());
        this.f75412d = new TextView(getContext());
        this.f75413e = new ScrollView(getContext());
        this.f75411c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f75411c.setTextColor(-49023);
        this.f75411c.setTypeface(Typeface.MONOSPACE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f75413e.setPadding(0, 10, 0, 0);
        this.f75413e.setLayoutParams(layoutParams);
        this.f75413e.setVerticalScrollBarEnabled(true);
        this.f75413e.setScrollbarFadingEnabled(true);
        this.f75412d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f75412d.setTextColor(-49023);
        this.f75413e.addView(this.f75412d);
        addView(this.f75411c);
        addView(this.f75413e);
        if (this.f75409a.length() <= 0) {
            this.f75409a.append("liteav sdk version:\n");
        }
        this.f75412d.setText(this.f75409a.toString());
    }

    public void setEventTextSize(float f11) {
        TextView textView = this.f75412d;
        if (textView != null) {
            textView.setTextSize(f11);
        }
    }

    public void setMessageMaxLength(int i11) {
        this.f75414f = i11;
    }

    public void setStatusText(CharSequence charSequence) {
        TextView textView = this.f75411c;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setStatusTextSize(float f11) {
        TextView textView = this.f75411c;
        if (textView != null) {
            textView.setTextSize(f11);
        }
    }
}
