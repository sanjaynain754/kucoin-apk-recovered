package gi0;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import fi0.C37505e;
import fi0.InterfaceC37503c;
import fi0.InterfaceC37504d;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: gi0.k */
/* JADX INFO: compiled from: NubiaImpl.java */
/* JADX INFO: loaded from: classes61.dex */
public class C37960k implements InterfaceC37504d {

    /* JADX INFO: renamed from: a */
    public final Context f85380a;

    @Override // fi0.InterfaceC37504d
    @SuppressLint({"AnnotateVersionCheck"})
    /* JADX INFO: renamed from: a */
    public boolean mo84451a() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // fi0.InterfaceC37504d
    /* JADX INFO: renamed from: b */
    public void mo84452b(InterfaceC37503c interfaceC37503c) {
        if (this.f85380a == null || interfaceC37503c == null) {
            return;
        }
        if (!mo84451a()) {
            C37505e.m84453a("Only supports Android 10.0 and above for Nubia");
            interfaceC37503c.mo84444b(new OAIDException("Only supports Android 10.0 and above for Nubia"));
            return;
        }
        try {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = this.f85380a.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
            if (contentProviderClientAcquireContentProviderClient == null) {
                return;
            }
            Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("getOAID", null, null);
            contentProviderClientAcquireContentProviderClient.close();
            if (bundleCall == null) {
                throw new OAIDException("OAID query failed: bundle is null");
            }
            String string = bundleCall.getInt("code", -1) == 0 ? bundleCall.getString("id") : null;
            if (string == null || string.length() == 0) {
                throw new OAIDException("OAID query failed: " + bundleCall.getString("message"));
            }
            C37505e.m84453a("OAID query success: " + string);
            interfaceC37503c.mo84443a(string);
        } catch (Exception e11) {
            C37505e.m84453a(e11);
            interfaceC37503c.mo84444b(e11);
        }
    }

    public C37960k(Context context) {
        this.f85380a = context;
    }
}
