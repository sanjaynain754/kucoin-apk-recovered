package com.sensorsdata.analytics.android.sdk.visual.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import com.sensorsdata.analytics.android.sdk.C27650R;
import com.sensorsdata.analytics.android.sdk.SALog;

/* JADX INFO: loaded from: classes59.dex */
public class PairingCodeEditDialog extends Dialog {
    private static final String TAG = "SA.PairingCodeEditDialog";
    private Context mContext;

    /* JADX INFO: renamed from: com.sensorsdata.analytics.android.sdk.visual.view.PairingCodeEditDialog$1 */
    public class C277621 implements IPairingCodeInterface.OnPairingCodeChangedListener {
        final /* synthetic */ PairingCodeEditText val$pairingCodeEditText;

        public C277621(PairingCodeEditText pairingCodeEditText) {
            this.val$pairingCodeEditText = pairingCodeEditText;
        }

        @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface.OnPairingCodeChangedListener
        public void onInputCompleted(CharSequence charSequence) {
            if (TextUtils.isEmpty(charSequence)) {
                SALog.m68589i(PairingCodeEditDialog.TAG, "onCreate | dialog input content is null and return");
            } else {
                new PairingCodeRequestHelper().verifyPairingCodeRequest(PairingCodeEditDialog.this.mContext, charSequence.toString(), new PairingCodeRequestHelper.IApiCallback() { // from class: com.sensorsdata.analytics.android.sdk.visual.view.PairingCodeEditDialog.1.1
                    @Override // com.sensorsdata.analytics.android.sdk.visual.view.PairingCodeRequestHelper.IApiCallback
                    public void onFailure(String str) {
                        C277621.this.val$pairingCodeEditText.clearText();
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        Toast.makeText(PairingCodeEditDialog.this.mContext, str, 1).show();
                    }

                    @Override // com.sensorsdata.analytics.android.sdk.visual.view.PairingCodeRequestHelper.IApiCallback
                    public void onSuccess() {
                        C277621.this.val$pairingCodeEditText.postDelayed(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.visual.view.PairingCodeEditDialog.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C277621.this.val$pairingCodeEditText.hiddenKeyBord();
                                PairingCodeEditDialog.this.dismiss();
                            }
                        }, 300L);
                    }
                });
            }
        }

        @Override // com.sensorsdata.analytics.android.sdk.visual.view.IPairingCodeInterface.OnPairingCodeChangedListener
        public void onPairingCodeChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    private boolean isActivityFinishingOrDestroyed(Context context) {
        Activity activity = (Activity) context;
        if (!activity.isFinishing()) {
            return activity.isDestroyed();
        }
        SALog.m68589i(TAG, "Activity is finish,name=" + activity.getClass().getName());
        return true;
    }

    private boolean isLiving() {
        Context context = this.mContext;
        if (context == null) {
            return false;
        }
        return ((context instanceof Activity) && isActivityFinishingOrDestroyed(context)) ? false : true;
    }

    public PairingCodeEditDialog(Context context) {
        super(context);
        this.mContext = context;
    }

    private int dip2px(Context context, float f11) {
        return (int) ((f11 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Context context = this.mContext;
            if ((context instanceof Activity) && isActivityFinishingOrDestroyed(context)) {
                SALog.m68589i(TAG, "Activity is finish");
                return;
            }
        }
        if (isShowing()) {
            try {
                SALog.m68589i(TAG, "isShowing() == true, dismiss");
                super.dismiss();
            } catch (IllegalArgumentException e11) {
                SALog.printStackTrace(e11);
            }
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C27650R.layout.sensors_analytics_verification_code);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = dip2px(getContext(), 350.0f);
            window.setAttributes(attributes);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(-1);
            gradientDrawable.setCornerRadius(dip2px(getContext(), 7.0f));
            window.setBackgroundDrawable(gradientDrawable);
            window.setSoftInputMode(4);
        }
        PairingCodeEditText pairingCodeEditText = (PairingCodeEditText) findViewById(C27650R.id.sensors_analytics_pairing_code);
        pairingCodeEditText.setOnPairingCodeChangedListener(new C277621(pairingCodeEditText));
    }

    @Override // android.app.Dialog
    public void show() {
        if (!isLiving()) {
            SALog.m68589i(TAG, "Activity is finish");
            return;
        }
        SALog.m68589i(TAG, "show:" + this.mContext);
        super.show();
    }
}
