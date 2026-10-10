package com.forter.mobile.fortersdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.q */
/* JADX INFO: loaded from: classes.dex */
public final class C6590q extends BroadcastReceiver {

    /* JADX INFO: renamed from: b */
    public static final IntentFilter f11042b = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");

    /* JADX INFO: renamed from: a */
    public boolean f11043a = false;

    /* JADX INFO: renamed from: a */
    public final synchronized void m12466a(Context context) {
        if (context != null) {
            if (!this.f11043a) {
                this.f11043a = true;
                context.registerReceiver(this, f11042b);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (C6520c.m12182b().m12193l(false)) {
            if (!C6566l0.m12419a().m12422d()) {
                AbstractC6609t3.m12485l(context);
            }
            AbstractC6609t3.m12483j(context);
            C6520c c6520cM12182b = C6520c.m12182b();
            boolean zM12413d = AbstractC6563k2.m12413d(context);
            if (c6520cM12182b.m12193l(false)) {
                if (!c6520cM12182b.f10917c.m98895u() && zM12413d) {
                    c6520cM12182b.m12203w();
                }
                c6520cM12182b.f10917c.m98864A(zM12413d);
            }
        }
    }
}
