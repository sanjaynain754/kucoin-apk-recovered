package gi0;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import fi0.C37505e;
import fi0.InterfaceC37503c;
import fi0.InterfaceC37504d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import third.sdk.com.heytap.openid.IOpenID;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.n */
/* JADX INFO: compiled from: OppoImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37963n implements InterfaceC37504d {

    /* JADX INFO: renamed from: a */
    public final Context f85385a;

    /* JADX INFO: renamed from: b */
    public String f85386b;

    /* JADX INFO: renamed from: gi0.n$a */
    /* JADX INFO: compiled from: OppoImpl.java */
    public class a implements ServiceConnectionC37962m.a {
        public a() {
        }

        @Override // gi0.ServiceConnectionC37962m.a
        /* JADX INFO: renamed from: a */
        public String mo85798a(IBinder iBinder) throws OAIDException, RemoteException {
            try {
                return C37963n.this.m85808e(iBinder);
            } catch (RemoteException e11) {
                throw e11;
            } catch (OAIDException e12) {
                throw e12;
            } catch (Exception e13) {
                throw new OAIDException(e13);
            }
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: a */
    public boolean mo84451a() {
        Context context = this.f85385a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.heytap.openid", 0) != null;
        } catch (Exception e11) {
            C37505e.m84453a(e11);
            return false;
        }
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: b */
    public void mo84452b(InterfaceC37503c interfaceC37503c) {
        if (this.f85385a == null || interfaceC37503c == null) {
            return;
        }
        Intent intent = new Intent("action.com.heytap.openid.OPEN_ID_SERVICE");
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        ServiceConnectionC37962m.m85804a(this.f85385a, intent, interfaceC37503c, new a());
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* JADX INFO: renamed from: e */
    public final String m85808e(IBinder iBinder) throws OAIDException, PackageManager.NameNotFoundException, NoSuchAlgorithmException, RemoteException {
        String packageName = this.f85385a.getPackageName();
        String str = this.f85386b;
        if (str != null) {
            return m85807d(iBinder, packageName, str);
        }
        byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(this.f85385a.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray());
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : bArrDigest) {
            sb2.append(Integer.toHexString((b11 & 255) | 256).substring(1, 3));
        }
        String string = sb2.toString();
        this.f85386b = string;
        return m85807d(iBinder, packageName, string);
    }

    public C37963n(Context context) {
        if (context instanceof Application) {
            this.f85385a = context;
        } else {
            this.f85385a = context.getApplicationContext();
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m85807d(IBinder iBinder, String str, String str2) throws OAIDException, RemoteException {
        IOpenID iOpenIDAsInterface = IOpenID.Stub.asInterface(iBinder);
        if (iOpenIDAsInterface != null) {
            return iOpenIDAsInterface.getSerID(str, str2, "OUID");
        }
        throw new OAIDException("IOpenID is null");
    }
}
