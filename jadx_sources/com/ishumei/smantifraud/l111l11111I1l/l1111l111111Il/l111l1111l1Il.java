package com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes56.dex */
public final class l111l1111l1Il extends l111l1111lI1l {
    private final Context l1111l111111Il;

    @Override // com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lI1l
    public final String l1111l111111Il() {
        try {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = this.l1111l111111Il.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
            Bundle bundleCall = null;
            if (contentProviderClientAcquireContentProviderClient != null) {
                bundleCall = contentProviderClientAcquireContentProviderClient.call("getOAID", null, null);
                contentProviderClientAcquireContentProviderClient.close();
            }
            return (bundleCall != null ? bundleCall.getInt("code", -1) : -1) == 0 ? bundleCall.getString("id") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public l111l1111l1Il(Context context) {
        this.l1111l111111Il = context;
    }
}
