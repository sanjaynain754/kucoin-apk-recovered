package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.C5771R;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import java.util.Objects;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
class RedBoxDialogSurfaceDelegate implements SurfaceDelegate {
    private final DevSupportManager mDevSupportManager;

    @Nullable
    private Dialog mDialog;
    private final DoubleTapReloadRecognizer mDoubleTapReloadRecognizer = new DoubleTapReloadRecognizer();

    @Nullable
    private RedBoxContentView mRedBoxContentView;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.RedBoxDialogSurfaceDelegate$1 */
    public class DialogC58991 extends Dialog {
        public DialogC58991(Context context, int i11) {
            super(context, i11);
        }

        @Override // android.app.Dialog, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i11, KeyEvent keyEvent) {
            if (i11 == 82) {
                RedBoxDialogSurfaceDelegate.this.mDevSupportManager.showDevOptionsDialog();
                return true;
            }
            if (RedBoxDialogSurfaceDelegate.this.mDoubleTapReloadRecognizer.didDoubleTapR(i11, getCurrentFocus())) {
                RedBoxDialogSurfaceDelegate.this.mDevSupportManager.handleReloadJS();
            }
            return super.onKeyUp(i11, keyEvent);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ WindowInsetsCompat m10324a(int i11, View view, WindowInsetsCompat windowInsetsCompat) {
            Insets insets = windowInsetsCompat.getInsets(i11);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).setMargins(insets.left, insets.top, insets.right, insets.bottom);
            return WindowInsetsCompat.CONSUMED;
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            Objects.requireNonNull(getWindow());
            getWindow().setBackgroundDrawable(new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
            final int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout();
            ViewCompat.setOnApplyWindowInsetsListener(RedBoxDialogSurfaceDelegate.this.mRedBoxContentView, new OnApplyWindowInsetsListener() { // from class: com.facebook.react.devsupport.p0
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return RedBoxDialogSurfaceDelegate.DialogC58991.m10324a(iSystemBars, view, windowInsetsCompat);
                }
            });
        }
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void destroyContentView() {
        this.mRedBoxContentView = null;
    }

    private static void runAfterHostResume(final ReactContext reactContext, final Runnable runnable) {
        reactContext.addLifecycleEventListener(new LifecycleEventListener() { // from class: com.facebook.react.devsupport.RedBoxDialogSurfaceDelegate.2
            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostResume() {
                runnable.run();
                reactContext.removeLifecycleEventListener(this);
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostDestroy() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostPause() {
            }
        });
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void createContentView(String str) {
        RedBoxHandler redBoxHandler = this.mDevSupportManager.getRedBoxHandler();
        Activity currentActivity = this.mDevSupportManager.getCurrentActivity();
        if (currentActivity != null && !currentActivity.isFinishing()) {
            RedBoxContentView redBoxContentView = new RedBoxContentView(currentActivity);
            this.mRedBoxContentView = redBoxContentView;
            redBoxContentView.setDevSupportManager(this.mDevSupportManager).setRedBoxHandler(redBoxHandler).init();
            return;
        }
        String lastErrorTitle = this.mDevSupportManager.getLastErrorTitle();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to launch redbox because react activity are not available, here is the error that redbox would've displayed: ");
        if (lastErrorTitle == null) {
            lastErrorTitle = "N/A";
        }
        sb2.append(lastErrorTitle);
        C45999a.m101507m(ReactConstants.TAG, sb2.toString());
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void hide() {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            try {
                dialog.dismiss();
            } catch (IllegalArgumentException e11) {
                C45999a.m101508n(ReactConstants.TAG, "RedBoxDialogSurfaceDelegate: error while dismissing dialog: ", e11);
            }
            destroyContentView();
            this.mDialog = null;
        }
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isContentViewReady() {
        return this.mRedBoxContentView != null;
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public boolean isShowing() {
        Dialog dialog = this.mDialog;
        return dialog != null && dialog.isShowing();
    }

    @Override // com.facebook.react.common.SurfaceDelegate
    public void show() {
        String lastErrorTitle = this.mDevSupportManager.getLastErrorTitle();
        Activity currentActivity = this.mDevSupportManager.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            ReactContext currentReactContext = this.mDevSupportManager.getCurrentReactContext();
            if (currentReactContext != null) {
                runAfterHostResume(currentReactContext, new Runnable() { // from class: com.facebook.react.devsupport.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9750b.show();
                    }
                });
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to launch redbox because react activity and react context is not available, here is the error that redbox would've displayed: ");
            if (lastErrorTitle == null) {
                lastErrorTitle = "N/A";
            }
            sb2.append(lastErrorTitle);
            C45999a.m101507m(ReactConstants.TAG, sb2.toString());
            return;
        }
        RedBoxContentView redBoxContentView = this.mRedBoxContentView;
        if (redBoxContentView == null || redBoxContentView.getContext() != currentActivity) {
            createContentView(NativeRedBoxSpec.NAME);
        }
        this.mRedBoxContentView.refreshContentView();
        if (this.mDialog == null) {
            DialogC58991 dialogC58991 = new DialogC58991(currentActivity, C5771R.style.Theme_Catalyst_RedBox);
            this.mDialog = dialogC58991;
            dialogC58991.requestWindowFeature(1);
            this.mDialog.setContentView(this.mRedBoxContentView);
        }
        this.mDialog.show();
    }

    public RedBoxDialogSurfaceDelegate(DevSupportManager devSupportManager) {
        this.mDevSupportManager = devSupportManager;
    }
}
