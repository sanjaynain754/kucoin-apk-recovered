package com.facebook.react.devsupport;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.util.Supplier;
import com.facebook.react.C5771R;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import p302h6.C38115a;

/* JADX INFO: loaded from: classes45.dex */
class PausedInDebuggerOverlayDialogManager implements PausedInDebuggerOverlayManager {
    private final Supplier<Context> mContextSupplier;

    @Nullable
    private Dialog mPausedInDebuggerDialog;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hidePausedInDebuggerOverlay$2() {
        Dialog dialog = this.mPausedInDebuggerDialog;
        if (dialog != null) {
            dialog.dismiss();
            this.mPausedInDebuggerDialog = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPausedInDebuggerOverlay$1(final DevSupportManager.PausedInDebuggerOverlayCommandListener pausedInDebuggerOverlayCommandListener, String str) {
        Dialog dialog = this.mPausedInDebuggerDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        Context context = this.mContextSupplier.get();
        if (context == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(C5771R.layout.paused_in_debugger_view, (ViewGroup) null);
        ((View) C38115a.m86047c(viewInflate.findViewById(C5771R.id.button))).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pausedInDebuggerOverlayCommandListener.onResume();
            }
        });
        ((TextView) C38115a.m86047c((TextView) viewInflate.findViewById(C5771R.id.button_text))).setText(str);
        Dialog dialog2 = new Dialog(context, C5771R.style.NoAnimationDialog);
        this.mPausedInDebuggerDialog = dialog2;
        dialog2.setContentView(viewInflate);
        this.mPausedInDebuggerDialog.setCancelable(false);
        Window window = this.mPausedInDebuggerDialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.2f;
            window.setAttributes(attributes);
            window.addFlags(2);
            window.setGravity(48);
            window.setElevation(0.0f);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setBackgroundDrawableResource(C5771R.drawable.paused_in_debugger_background);
        }
        this.mPausedInDebuggerDialog.show();
    }

    @Override // com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager
    public void hidePausedInDebuggerOverlay() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.m0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9745b.lambda$hidePausedInDebuggerOverlay$2();
            }
        });
    }

    @Override // com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager
    public void showPausedInDebuggerOverlay(final String str, final DevSupportManager.PausedInDebuggerOverlayCommandListener pausedInDebuggerOverlayCommandListener) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9741b.lambda$showPausedInDebuggerOverlay$1(pausedInDebuggerOverlayCommandListener, str);
            }
        });
    }

    public PausedInDebuggerOverlayDialogManager(Supplier<Context> supplier) {
        this.mContextSupplier = supplier;
    }
}
