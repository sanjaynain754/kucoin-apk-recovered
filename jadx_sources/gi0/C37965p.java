package gi0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import fi0.C37505e;
import fi0.C37506f;
import fi0.InterfaceC37503c;
import fi0.InterfaceC37504d;
import java.util.Objects;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.p */
/* JADX INFO: compiled from: VivoImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37965p implements InterfaceC37504d {

    /* JADX INFO: renamed from: a */
    public final Context f85390a;

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: a */
    public boolean mo84451a() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        return C37506f.m84471r("persist.sys.identifierid.supported", "0").equals("1");
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: b */
    public void mo84452b(InterfaceC37503c interfaceC37503c) {
        if (this.f85390a == null || interfaceC37503c == null) {
            return;
        }
        try {
            Cursor cursorQuery = this.f85390a.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
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

    public C37965p(Context context) {
        this.f85390a = context;
    }
}
