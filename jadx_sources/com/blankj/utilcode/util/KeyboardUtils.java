package com.blankj.utilcode.util;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class KeyboardUtils {

    /* JADX INFO: renamed from: a */
    public static long f6368a;

    /* JADX INFO: renamed from: b */
    public static int f6369b;

    /* JADX INFO: renamed from: com.blankj.utilcode.util.KeyboardUtils$a */
    /* JADX INFO: loaded from: classes34.dex */
    public static class ViewTreeObserverOnGlobalLayoutListenerC5234a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Window f6370b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int[] f6371c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC5235b f6372d;

        public ViewTreeObserverOnGlobalLayoutListenerC5234a(Window window, int[] iArr, InterfaceC5235b interfaceC5235b) {
            this.f6370b = window;
            this.f6371c = iArr;
            this.f6372d = interfaceC5235b;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int iM6032d = KeyboardUtils.m6032d(this.f6370b);
            if (this.f6371c[0] != iM6032d) {
                this.f6372d.mo6045a(iM6032d);
                this.f6371c[0] = iM6032d;
            }
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.KeyboardUtils$b */
    /* JADX INFO: loaded from: classes34.dex */
    public interface InterfaceC5235b {
        /* JADX INFO: renamed from: a */
        void mo6045a(int i11);
    }

    /* JADX INFO: renamed from: b */
    public static void m6030b(@NonNull Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6031c(activity.getWindow());
    }

    /* JADX INFO: renamed from: c */
    public static void m6031c(@NonNull Window window) {
        if (window == null) {
            throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        InputMethodManager inputMethodManager = (InputMethodManager) C5287o0.m6331a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        String[] strArr = {"mLastSrvView", "mCurRootView", "mServedView", "mNextServedView"};
        for (int i11 = 0; i11 < 4; i11++) {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField(strArr[i11]);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Object obj = declaredField.get(inputMethodManager);
                if ((obj instanceof View) && ((View) obj).getRootView() == window.getDecorView().getRootView()) {
                    declaredField.set(inputMethodManager, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m6032d(@NonNull Window window) {
        if (window == null) {
            throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        View decorView = window.getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        Log.d("KeyboardUtils", "getDecorViewInvisibleHeight: " + (decorView.getBottom() - rect.bottom));
        int iAbs = Math.abs(decorView.getBottom() - rect.bottom);
        if (iAbs > C5299u0.m6499v() + C5299u0.m6501x()) {
            return iAbs - f6369b;
        }
        f6369b = iAbs;
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static void m6033e(@NonNull Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6035g(activity.getWindow());
    }

    /* JADX INFO: renamed from: f */
    public static void m6034f(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("Argument 'view' of type View (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        InputMethodManager inputMethodManager = (InputMethodManager) C5287o0.m6331a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: g */
    public static void m6035g(@NonNull Window window) {
        if (window == null) {
            throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        View currentFocus = window.getCurrentFocus();
        if (currentFocus == null) {
            View decorView = window.getDecorView();
            View viewFindViewWithTag = decorView.findViewWithTag("keyboardTagView");
            if (viewFindViewWithTag == null) {
                viewFindViewWithTag = new EditText(window.getContext());
                viewFindViewWithTag.setTag("keyboardTagView");
                ((ViewGroup) decorView).addView(viewFindViewWithTag, 0, 0);
            }
            currentFocus = viewFindViewWithTag;
            currentFocus.requestFocus();
        }
        m6034f(currentFocus);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m6037i(@NonNull Activity activity) {
        if (activity != null) {
            return m6032d(activity.getWindow()) > 0;
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX INFO: renamed from: j */
    public static void m6038j(@NonNull Activity activity, @NonNull InterfaceC5235b interfaceC5235b) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (interfaceC5235b == null) {
            throw new NullPointerException("Argument 'listener' of type OnSoftInputChangedListener (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6039k(activity.getWindow(), interfaceC5235b);
    }

    /* JADX INFO: renamed from: k */
    public static void m6039k(@NonNull Window window, @NonNull InterfaceC5235b interfaceC5235b) {
        if (window == null) {
            throw new NullPointerException("Argument 'window' of type Window (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (interfaceC5235b == null) {
            throw new NullPointerException("Argument 'listener' of type OnSoftInputChangedListener (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if ((window.getAttributes().flags & 512) != 0) {
            window.clearFlags(512);
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content);
        ViewTreeObserverOnGlobalLayoutListenerC5234a viewTreeObserverOnGlobalLayoutListenerC5234a = new ViewTreeObserverOnGlobalLayoutListenerC5234a(window, new int[]{m6032d(window)}, interfaceC5235b);
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC5234a);
        frameLayout.setTag(-8, viewTreeObserverOnGlobalLayoutListenerC5234a);
    }

    /* JADX INFO: renamed from: m */
    public static void m6041m(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("Argument 'view' of type View (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6042n(view, 0);
    }

    /* JADX INFO: renamed from: n */
    public static void m6042n(@NonNull View view, int i11) {
        if (view == null) {
            throw new NullPointerException("Argument 'view' of type View (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        InputMethodManager inputMethodManager = (InputMethodManager) C5287o0.m6331a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManager.showSoftInput(view, i11, new ResultReceiver(new Handler()) { // from class: com.blankj.utilcode.util.KeyboardUtils.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i12, Bundle bundle) {
                if (i12 == 1 || i12 == 3) {
                    KeyboardUtils.m6043o();
                }
            }
        });
        inputMethodManager.toggleSoftInput(2, 1);
    }

    /* JADX INFO: renamed from: p */
    public static void m6044p(@NonNull Window window) {
        if (window == null) {
            throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content);
        Object tag = frameLayout.getTag(-8);
        if (tag instanceof ViewTreeObserver.OnGlobalLayoutListener) {
            frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) tag);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m6036h(Activity activity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - f6368a) > 500 && m6037i(activity)) {
            m6043o();
        }
        f6368a = jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: l */
    public static void m6040l() {
        InputMethodManager inputMethodManager = (InputMethodManager) C5287o0.m6331a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(2, 1);
    }

    /* JADX INFO: renamed from: o */
    public static void m6043o() {
        InputMethodManager inputMethodManager = (InputMethodManager) C5287o0.m6331a().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 0);
    }
}
