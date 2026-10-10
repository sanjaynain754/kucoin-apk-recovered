package com.swmansion.reanimated.keyboard;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.C0467R;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes59.dex */
public class WindowsInsetsManager {
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;
    private final WeakReference<ReactApplicationContext> mReactContext;
    private boolean mIsStatusBarTranslucent = false;
    private boolean mIsNavigationBarTranslucent = false;
    private final String MissingContextErrorMsg = "Unable to get reference to react activity";

    private Activity getCurrentActivity() {
        return this.mReactContext.get().getCurrentActivity();
    }

    private FrameLayout.LayoutParams getLayoutParams(int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.mIsStatusBarTranslucent) {
            i11 = 0;
        }
        if (this.mIsNavigationBarTranslucent) {
            i12 = 0;
        }
        layoutParams.setMargins(0, i11, 0, i12);
        return layoutParams;
    }

    private void updateInsets(final int i11, final int i12) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.swmansion.reanimated.keyboard.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f68414b.lambda$updateInsets$1(i11, i12);
            }
        });
    }

    private void updateWindowDecor(final boolean z11) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.swmansion.reanimated.keyboard.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f68412b.lambda$updateWindowDecor$0(z11);
            }
        });
    }

    public void startObservingChanges(KeyboardAnimationCallback keyboardAnimationCallback, boolean z11, boolean z12) {
        this.mIsStatusBarTranslucent = z11;
        this.mIsNavigationBarTranslucent = z12;
        updateWindowDecor(false);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        ViewCompat.setOnApplyWindowInsetsListener(decorView, new OnApplyWindowInsetsListener() { // from class: com.swmansion.reanimated.keyboard.b
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f68411b.onApplyWindowInsetsListener(view, windowInsetsCompat);
            }
        });
        ViewCompat.setWindowInsetsAnimationCallback(decorView, keyboardAnimationCallback);
    }

    public void stopObservingChanges() {
        updateWindowDecor((this.mIsStatusBarTranslucent || this.mIsNavigationBarTranslucent) ? false : true);
        updateInsets(0, 0);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        ViewCompat.setWindowInsetsAnimationCallback(decorView, null);
        ViewCompat.setOnApplyWindowInsetsListener(decorView, null);
    }

    public WindowsInsetsManager(WeakReference<ReactApplicationContext> weakReference, Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction) {
        this.mReactContext = weakReference;
        this.mKeyboard = keyboard;
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateInsets$1(int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = getLayoutParams(i11, i12);
        int i13 = C0467R.id.action_bar_root;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
        } else {
            currentActivity.getWindow().getDecorView().findViewById(i13).setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateWindowDecor$0(boolean z11) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
        } else {
            WindowCompat.setDecorFitsSystemWindows(currentActivity.getWindow(), z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindowInsetsCompat onApplyWindowInsetsListener(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
        if (this.mKeyboard.getState() == KeyboardState.OPEN) {
            this.mKeyboard.updateHeight(windowInsetsCompat, this.mIsNavigationBarTranslucent);
            this.mNotifyAboutKeyboardChange.call();
        }
        setWindowInsets(windowInsetsCompatOnApplyWindowInsets);
        return windowInsetsCompatOnApplyWindowInsets;
    }

    private void setWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        int iSystemBars = WindowInsetsCompat.Type.systemBars();
        updateInsets(windowInsetsCompat.getInsets(iSystemBars).top, windowInsetsCompat.getInsets(iSystemBars).bottom);
    }
}
