package com.kubi.utils;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: com.kubi.utils.b0 */
/* JADX INFO: compiled from: LinkMovementClickMethod.java */
/* JADX INFO: loaded from: classes54.dex */
public class C27016b0 extends LinkMovementMethod {

    /* JADX INFO: renamed from: b */
    public static C27016b0 f54308b;

    /* JADX INFO: renamed from: a */
    public long f54309a;

    /* JADX INFO: renamed from: a */
    public static C27016b0 m66509a() {
        if (f54308b == null) {
            f54308b = new C27016b0();
        }
        return f54308b;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            int totalPaddingLeft = x11 - textView.getTotalPaddingLeft();
            int totalPaddingTop = y11 - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    if (System.currentTimeMillis() - this.f54309a < 500 && C27014a1.m66501a(textView)) {
                        clickableSpanArr[0].onClick(textView);
                    }
                } else {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                    this.f54309a = System.currentTimeMillis();
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
