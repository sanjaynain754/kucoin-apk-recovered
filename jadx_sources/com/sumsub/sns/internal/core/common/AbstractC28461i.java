package com.sumsub.sns.internal.core.common;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.core.app.C1554i;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.webkit.internal.AssetHelper;
import java.util.Iterator;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28461i {
    /* JADX INFO: renamed from: a */
    public static final boolean m69362a(Context context, String str) {
        Object next;
        if (Build.VERSION.SDK_INT < 26) {
            return NotificationManagerCompat.from(context).areNotificationsEnabled();
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (!notificationManager.areNotificationsEnabled()) {
            return false;
        }
        Iterator it = notificationManager.getNotificationChannels().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(C1554i.m2283a(next).getId(), str));
        NotificationChannel notificationChannelM2283a = C1554i.m2283a(next);
        return notificationChannelM2283a == null || notificationChannelM2283a.getImportance() != 0;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m69361a(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "always_finish_activities", 0) == 1;
    }

    /* JADX INFO: renamed from: a */
    public static final void m69360a(Context context, CharSequence charSequence, CharSequence charSequence2) {
        ClipboardManager clipboardManager = (ClipboardManager) ContextCompat.getSystemService(context, ClipboardManager.class);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(new ClipData(new ClipDescription(charSequence, new String[]{AssetHelper.DEFAULT_MIME_TYPE}), new ClipData.Item(charSequence2)));
        }
    }
}
