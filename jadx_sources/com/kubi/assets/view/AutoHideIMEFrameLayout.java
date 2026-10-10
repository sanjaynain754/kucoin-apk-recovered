package com.kubi.assets.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AutoHideIMEFrameLayout.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0002¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/view/AutoHideIMEFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "shouldHideInputMethod", "focusView", "Landroid/view/View;", "event", "hideInputMethod", "", "currentFocus", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AutoHideIMEFrameLayout extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoHideIMEFrameLayout(@Nullable Context context) {
        super(context);
        Intrinsics.checkNotNull(context);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m20010b(View view, MotionEvent motionEvent) {
        if (view == null || !(view instanceof EditText)) {
            return false;
        }
        int[] iArr = {0, 0};
        EditText editText = (EditText) view;
        editText.getLocationInWindow(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        return motionEvent.getRawX() <= ((float) i11) || motionEvent.getRawX() >= ((float) (editText.getWidth() + i11)) || motionEvent.getRawY() <= ((float) i12) || motionEvent.getRawY() >= ((float) (editText.getHeight() + i12));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoHideIMEFrameLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNull(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m20009a(View view) {
        Context context;
        Object systemService = (view == null || (context = view.getContext()) == null) ? null : context.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (ev2.getAction() == 0) {
            Context context = getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null) {
                return super.dispatchTouchEvent(ev2);
            }
            View currentFocus = activity.getCurrentFocus();
            if (m20010b(currentFocus, ev2)) {
                m20009a(currentFocus);
                if (currentFocus != null) {
                    currentFocus.clearFocus();
                }
            }
        }
        return super.dispatchTouchEvent(ev2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoHideIMEFrameLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNull(context);
    }
}
