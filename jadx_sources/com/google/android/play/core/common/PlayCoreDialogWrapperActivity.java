package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.play:core-common@@2.0.4 */
/* JADX INFO: loaded from: classes45.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    @Nullable
    private ResultReceiver zza;

    private final void zza() {
        ResultReceiver resultReceiver = this.zza;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 0 && (resultReceiver = this.zza) != null) {
            if (i12 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i12 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        PendingIntent pendingIntent = null;
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            Intent intent2 = new Intent();
            intent2.putExtra("window_flags", intExtra);
            intent = intent2;
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle == null) {
            this.zza = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                pendingIntent = (PendingIntent) extras.get("confirmation_intent");
            }
            if (extras != null && pendingIntent != null) {
                try {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
                    } catch (IntentSender.SendIntentException unused) {
                        zza();
                        finish();
                    }
                } catch (IntentSender.SendIntentException unused2) {
                }
            } else {
                zza();
                finish();
            }
        } else {
            this.zza = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.zza);
    }
}
