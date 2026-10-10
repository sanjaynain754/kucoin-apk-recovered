package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zag implements DialogInterface.OnClickListener {
    public abstract void zaa();

    public static zag zab(Activity activity, @Nullable Intent intent, int i11) {
        return new zad(intent, activity, i11);
    }

    public static zag zac(@NonNull Fragment fragment, @Nullable Intent intent, int i11) {
        return new zae(intent, fragment, i11);
    }

    public static zag zad(@NonNull LifecycleFragment lifecycleFragment, @Nullable Intent intent, int i11) {
        return new zaf(intent, lifecycleFragment, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        try {
            try {
                zaa();
            } catch (ActivityNotFoundException e11) {
                String str = "Failed to start resolution intent.";
                if (true == Build.FINGERPRINT.contains("generic")) {
                    str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                }
                Log.e("DialogRedirect", str, e11);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
