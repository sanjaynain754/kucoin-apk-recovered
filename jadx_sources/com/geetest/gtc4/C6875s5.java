package com.geetest.gtc4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Objects;

/* JADX INFO: renamed from: com.geetest.gtc4.s5 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6875s5 implements InterfaceC6919x4 {

    /* JADX INFO: renamed from: a */
    public final Context f11492a;

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final boolean mo12620a() {
        Context context = this.f11492a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().resolveContentProvider("com.meizu.flyme.openidsdk", 0) != null;
        } catch (Exception unused) {
        }
    }

    public C6875s5(Context context) {
        this.f11492a = context;
    }

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final void mo12619a(C6783i3 c6783i3) {
        if (this.f11492a != null) {
            try {
                Cursor cursorQuery = this.f11492a.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
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
