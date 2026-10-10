package gi0;

import android.annotation.SuppressLint;
import android.content.Context;
import fi0.C37505e;
import fi0.InterfaceC37503c;
import fi0.InterfaceC37504d;
import java.lang.reflect.InvocationTargetException;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.q */
/* JADX INFO: compiled from: XiaomiImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37966q implements InterfaceC37504d {

    /* JADX INFO: renamed from: a */
    public final Context f85391a;

    /* JADX INFO: renamed from: b */
    public Class<?> f85392b;

    /* JADX INFO: renamed from: c */
    public Object f85393c;

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: a */
    public boolean mo84451a() {
        return this.f85393c != null;
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: b */
    public void mo84452b(InterfaceC37503c interfaceC37503c) {
        if (this.f85391a == null || interfaceC37503c == null) {
            return;
        }
        if (this.f85392b == null || this.f85393c == null) {
            interfaceC37503c.mo84444b(new OAIDException("Xiaomi IdProvider not exists"));
            return;
        }
        try {
            String strM85809c = m85809c();
            if (strM85809c == null || strM85809c.length() == 0) {
                throw new OAIDException("OAID query failed");
            }
            C37505e.m84453a("OAID query success: " + strM85809c);
            interfaceC37503c.mo84443a(strM85809c);
        } catch (Exception e11) {
            C37505e.m84453a(e11);
            interfaceC37503c.mo84444b(e11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m85809c() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (String) this.f85392b.getMethod("getOAID", Context.class).invoke(this.f85393c, this.f85391a);
    }

    @SuppressLint({"PrivateApi"})
    public C37966q(Context context) {
        this.f85391a = context;
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            this.f85392b = cls;
            this.f85393c = cls.newInstance();
        } catch (Exception e11) {
            C37505e.m84453a(e11);
        }
    }
}
