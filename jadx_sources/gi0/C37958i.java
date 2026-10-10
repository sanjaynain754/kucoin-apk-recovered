package gi0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import fi0.C37505e;
import fi0.InterfaceC37503c;
import fi0.InterfaceC37504d;
import java.util.Objects;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.i */
/* JADX INFO: compiled from: MeizuImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37958i implements InterfaceC37504d {

    /* JADX INFO: renamed from: a */
    public final Context f85377a;

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: a */
    public boolean mo84451a() {
        Context context = this.f85377a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().resolveContentProvider("com.meizu.flyme.openidsdk", 0) != null;
        } catch (Exception e11) {
            C37505e.m84453a(e11);
            return false;
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: b */
    public void mo84452b(InterfaceC37503c interfaceC37503c) {
        if (this.f85377a == null || interfaceC37503c == null) {
            return;
        }
        try {
            Cursor cursorQuery = this.f85377a.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
            try {
                Objects.requireNonNull(cursorQuery);
                cursorQuery.moveToFirst();
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                if (string == null || string.length() == 0) {
                    throw new OAIDException("OAID query failed");
                }
                C37505e.m84453a("OAID query success: " + string);
                interfaceC37503c.mo84443a(string);
                cursorQuery.close();
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
        } catch (Exception e11) {
            C37505e.m84453a(e11);
            interfaceC37503c.mo84444b(e11);
        }
    }

    public C37958i(Context context) {
        this.f85377a = context;
    }
}
