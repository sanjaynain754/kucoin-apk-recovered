package androidx.core.text.method;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.core.os.BuildCompat;

/* JADX INFO: loaded from: classes23.dex */
public class LinkMovementMethodCompat extends LinkMovementMethod {
    private static LinkMovementMethodCompat sInstance;

    @NonNull
    public static LinkMovementMethodCompat getInstance() {
        if (sInstance == null) {
            sInstance = new LinkMovementMethodCompat();
        }
        return sInstance;
    }

    private LinkMovementMethodCompat() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r0 <= r2.getLineRight(r1)) goto L18;
     */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@Nullable TextView textView, @Nullable Spannable spannable, @Nullable MotionEvent motionEvent) {
        int action;
        if (!BuildCompat.isAtLeastV() && ((action = motionEvent.getAction()) == 1 || action == 0)) {
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            int totalPaddingLeft = x11 - textView.getTotalPaddingLeft();
            int totalPaddingTop = y11 - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            if (scrollY >= 0 && scrollY <= layout.getHeight()) {
                int lineForVertical = layout.getLineForVertical(scrollY);
                float f11 = scrollX;
                if (f11 >= layout.getLineLeft(lineForVertical)) {
                }
            }
            Selection.removeSelection(spannable);
            return Touch.onTouchEvent(textView, spannable, motionEvent);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
