package com.geetest.gtc4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: renamed from: com.geetest.gtc4.w7 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6913w7 implements InterfaceC6919x4 {

    /* JADX INFO: renamed from: a */
    public final Context f11544a;

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final boolean mo12620a() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        return AbstractC6768g6.m12640a("persist.sys.identifierid.supported", "0").equals("1");
    }

    public C6913w7(Context context) {
        this.f11544a = context;
    }

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final void mo12619a(C6783i3 c6783i3) {
        if (this.f11544a != null) {
            try {
                Cursor cursorQuery = this.f11544a.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
                try {
                    Objects.requireNonNull(cursorQuery);
                    cursorQuery.moveToFirst();
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                    if (string != null && !string.isEmpty()) {
                        c6783i3.f11391a.set(string);
                        c6783i3.f11392b.countDown();
                        cursorQuery.close();
                        return;
                    }
                    throw new C6750e6("OAID query failed");
                } catch (Throwable th2) {
                    if (cursorQuery == null) {
                        throw th2;
                    }
                    try {
                        cursorQuery.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Exception unused) {
                c6783i3.f11392b.countDown();
            }
        }
    }
}
