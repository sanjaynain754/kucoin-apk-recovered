package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.C7048R;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzht {
    @Nullable
    public static final String zzb(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier("google_app_id", TypedValues.Custom.S_STRING, str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @Nullable
    public static final Boolean zzc(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return Boolean.valueOf(resources.getBoolean(identifier));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String zza(Context context) {
        try {
            return context.getResources().getResourcePackageName(C7048R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
