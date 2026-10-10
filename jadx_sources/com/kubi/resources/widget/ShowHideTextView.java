package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;

/* JADX INFO: loaded from: classes13.dex */
public class ShowHideTextView extends BaseTextView {

    /* JADX INFO: renamed from: b */
    public boolean f44051b;

    /* JADX INFO: renamed from: c */
    public CharSequence f44052c;

    public ShowHideTextView(Context context) {
        super(context);
        this.f44051b = false;
    }

    /* JADX INFO: renamed from: d */
    public static void m54778d(View view, boolean z11) {
        if (!(view instanceof ViewGroup)) {
            if (view instanceof ShowHideTextView) {
                ShowHideTextView showHideTextView = (ShowHideTextView) view;
                if (showHideTextView.m54780c()) {
                    showHideTextView.setHide(z11);
                    showHideTextView.setText(showHideTextView.getText());
                    return;
                }
                return;
            }
            return;
        }
        int i11 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i11 >= viewGroup.getChildCount()) {
                return;
            }
            m54778d(viewGroup.getChildAt(i11), z11);
            i11++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m54779b(CharSequence charSequence) {
        try {
            if (charSequence.equals(this.f44052c) || charSequence.toString().contains("******")) {
                return;
            }
            this.f44052c = charSequence;
        } catch (Exception unused) {
        }
    }

    public ShowHideTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44051b = false;
    }

    private int getAvailableWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m54780c() {
        if (getTag() != null && TIMPushProvider.f75063o.equals(getTag())) {
            return true;
        }
        return false;
    }

    public void setHide(boolean z11) {
        if (m54780c()) {
            this.f44051b = z11;
        }
    }

    @Override // com.kubi.resources.widget.BaseTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        if (m54780c()) {
            m54779b(charSequence);
            if (this.f44051b) {
                charSequence2 = "******";
            } else {
                charSequence2 = this.f44052c;
            }
            super.setText(charSequence2, bufferType);
            return;
        }
        super.setText(charSequence, bufferType);
    }

    public ShowHideTextView(Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44051b = false;
    }
}
