package gi0;

import android.app.KeyguardManager;
import android.content.Context;
import fi0.C37505e;
import fi0.InterfaceC37503c;
import fi0.InterfaceC37504d;
import java.util.Objects;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.c */
/* JADX INFO: compiled from: CooseaImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37952c implements InterfaceC37504d {

    /* JADX INFO: renamed from: a */
    public final Context f85366a;

    /* JADX INFO: renamed from: b */
    public final KeyguardManager f85367b;

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: a */
    public boolean mo84451a() {
        KeyguardManager keyguardManager;
        if (this.f85366a == null || (keyguardManager = this.f85367b) == null) {
            return false;
        }
        try {
            Object objInvoke = keyguardManager.getClass().getDeclaredMethod("isSupported", new Class[0]).invoke(this.f85367b, new Object[0]);
            Objects.requireNonNull(objInvoke);
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e11) {
            C37505e.m84453a(e11);
            return false;
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: b */
    public void mo84452b(InterfaceC37503c interfaceC37503c) {
        if (this.f85366a == null || interfaceC37503c == null) {
            return;
        }
        KeyguardManager keyguardManager = this.f85367b;
        if (keyguardManager == null) {
            interfaceC37503c.mo84444b(new OAIDException("KeyguardManager not found"));
            return;
        }
        try {
            Object objInvoke = keyguardManager.getClass().getDeclaredMethod("obtainOaid", new Class[0]).invoke(this.f85367b, new Object[0]);
            if (objInvoke == null) {
                throw new OAIDException("OAID obtain failed");
            }
            String string = objInvoke.toString();
            C37505e.m84453a("OAID obtain success: " + string);
            interfaceC37503c.mo84443a(string);
        } catch (Exception e11) {
            C37505e.m84453a(e11);
        }
    }

    public C37952c(Context context) {
        this.f85366a = context;
        this.f85367b = (KeyguardManager) context.getSystemService("keyguard");
    }
}
