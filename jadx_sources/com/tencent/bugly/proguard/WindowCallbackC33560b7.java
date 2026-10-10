package com.tencent.bugly.proguard;

import android.annotation.SuppressLint;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.b7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class WindowCallbackC33560b7 implements Window.Callback {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Window.Callback f69152a;

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return false;
        }
        return callback.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Window.Callback callback2 = this.f69152a;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return false;
        }
        return callback.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return false;
        }
        return callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return false;
        }
        return callback.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return false;
        }
        return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return false;
        }
        return callback.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return false;
        }
        return callback.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return;
        }
        callback.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return;
        }
        callback.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return;
        }
        callback.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return;
        }
        callback.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i11, @NotNull Menu menu) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return false;
        }
        return callback.onCreatePanelMenu(i11, menu);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public View onCreatePanelView(int i11) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return null;
        }
        return callback.onCreatePanelView(i11);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return;
        }
        callback.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i11, @NotNull MenuItem menuItem) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return false;
        }
        return callback.onMenuItemSelected(i11, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i11, @Nullable Menu menu) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return false;
        }
        return callback.onMenuOpened(i11, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i11, @NotNull Menu menu) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return;
        }
        callback.onPanelClosed(i11, menu);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public void onPointerCaptureChanged(boolean z11) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return;
        }
        callback.onPointerCaptureChanged(z11);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i11, @Nullable View view, @NotNull Menu menu) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return false;
        }
        return callback.onPreparePanel(i11, view, menu);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, @Nullable Menu menu, int i11) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return;
        }
        callback.onProvideKeyboardShortcuts(list, menu, i11);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return;
        }
        callback.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z11) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return;
        }
        callback.onWindowFocusChanged(z11);
    }

    public WindowCallbackC33560b7(@Nullable Window.Callback callback) {
        this.f69152a = callback;
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public boolean onSearchRequested(SearchEvent searchEvent) {
        Window.Callback callback = this.f69152a;
        if (callback == null) {
            return false;
        }
        return callback.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    @SuppressLint({"NewApi"})
    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i11) {
        Window.Callback callback2 = this.f69152a;
        if (callback2 == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback, i11);
    }
}
