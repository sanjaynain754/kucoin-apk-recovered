package com.sumsub.sns.internal.core.presentation.android;

import android.os.Parcelable;
import com.sumsub.sns.internal.core.analytics.PermissionPayload;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28637L implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final String f58265a;

    /* JADX INFO: renamed from: b */
    public final String f58266b;

    /* JADX INFO: renamed from: c */
    public final PermissionPayload f58267c;

    public AbstractC28637L(String str, String str2, PermissionPayload permissionPayload) {
        this.f58265a = str;
        this.f58266b = str2;
        this.f58267c = permissionPayload;
    }
}
