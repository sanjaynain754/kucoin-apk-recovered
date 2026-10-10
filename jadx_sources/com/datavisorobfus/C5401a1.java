package com.datavisorobfus;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: renamed from: com.datavisorobfus.a1 */
/* JADX INFO: loaded from: classes34.dex */
public class C5401a1 implements InterfaceC5406c0 {

    /* JADX INFO: renamed from: a */
    private Context f7235a;

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public void mo7110a(InterfaceC5403b0 interfaceC5403b0) {
        Cursor cursorQuery = null;
        try {
            String string = "";
            cursorQuery = this.f7235a.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
            }
            if (C5457z0.m7480a(string)) {
                string = "empty";
            }
            if (interfaceC5403b0 != null) {
                try {
                    interfaceC5403b0.mo7113a(string);
                } catch (Throwable th2) {
                    C5415f0.m7139a(th2);
                }
            }
            if (cursorQuery == null) {
                return;
            }
        } catch (Throwable th3) {
            try {
                C5415f0.m7139a(th3);
                if (interfaceC5403b0 != null) {
                    try {
                        interfaceC5403b0.mo7113a("empty");
                    } catch (Throwable th4) {
                        C5415f0.m7139a(th4);
                    }
                }
                if (cursorQuery == null) {
                    return;
                }
            } catch (Throwable th5) {
                if (cursorQuery == null) {
                    throw th5;
                }
                try {
                    cursorQuery.close();
                    throw th5;
                } catch (Throwable th6) {
                    C5415f0.m7139a(th6);
                    throw th5;
                }
            }
        }
        try {
            cursorQuery.close();
        } catch (Throwable th7) {
            C5415f0.m7139a(th7);
        }
    }

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public boolean mo7111a() {
        try {
            String strM7396c = C5444t.m7396c("persist.sys.identifierid.supported");
            return C5457z0.m7482b(strM7396c) && strM7396c.equals("1");
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    public C5401a1(Context context) {
        this.f7235a = context;
    }
}
