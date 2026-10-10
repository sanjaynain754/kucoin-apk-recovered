package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class InstallReferrerClientImpl extends InstallReferrerClient {

    /* JADX INFO: renamed from: a */
    public int f6242a = 0;

    /* JADX INFO: renamed from: b */
    public final Context f6243b;

    /* JADX INFO: renamed from: c */
    public IGetInstallReferrerService f6244c;

    /* JADX INFO: renamed from: d */
    public ServiceConnection f6245d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    /* JADX INFO: renamed from: com.android.installreferrer.api.InstallReferrerClientImpl$b */
    public final class ServiceConnectionC5122b implements ServiceConnection {

        /* JADX INFO: renamed from: b */
        public final InstallReferrerStateListener f6246b;

        public ServiceConnectionC5122b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f6246b = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
            InstallReferrerClientImpl.this.f6244c = IGetInstallReferrerService.Stub.m12872b(iBinder);
            InstallReferrerClientImpl.this.f6242a = 2;
            this.f6246b.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
            InstallReferrerClientImpl.this.f6244c = null;
            InstallReferrerClientImpl.this.f6242a = 0;
            this.f6246b.onInstallReferrerServiceDisconnected();
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void endConnection() {
        this.f6242a = 3;
        if (this.f6245d != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.f6243b.unbindService(this.f6245d);
            this.f6245d = null;
        }
        this.f6244c = null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5910c() {
        try {
            return this.f6243b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.f6242a != 2 || this.f6244c == null || this.f6245d == null) ? false : true;
    }

    public InstallReferrerClientImpl(Context context) {
        this.f6243b = context.getApplicationContext();
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails getInstallReferrer() throws RemoteException {
        if (isReady()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f6243b.getPackageName());
            try {
                return new ReferrerDetails(this.f6244c.mo12871c(bundle));
            } catch (RemoteException e11) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f6242a = 0;
                throw e11;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i11 = this.f6242a;
        if (i11 == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i11 == 3) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = this.f6243b.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if ("com.android.vending".equals(str) && str2 != null && m5910c()) {
                Intent intent2 = new Intent(intent);
                ServiceConnectionC5122b serviceConnectionC5122b = new ServiceConnectionC5122b(installReferrerStateListener);
                this.f6245d = serviceConnectionC5122b;
                try {
                    if (this.f6243b.bindService(intent2, serviceConnectionC5122b, 1)) {
                        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                        return;
                    }
                    InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
                    this.f6242a = 0;
                    installReferrerStateListener.onInstallReferrerSetupFinished(1);
                    return;
                } catch (SecurityException unused) {
                    InstallReferrerCommons.logWarn("InstallReferrerClient", "No permission to connect to service.");
                    this.f6242a = 0;
                    installReferrerStateListener.onInstallReferrerSetupFinished(4);
                    return;
                }
            }
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.f6242a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        this.f6242a = 0;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
        installReferrerStateListener.onInstallReferrerSetupFinished(2);
    }
}
