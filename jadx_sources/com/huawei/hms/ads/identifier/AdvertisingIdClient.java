package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.huawei.hms.ads.identifier.aidl.OpenDeviceIdentifierService;
import java.io.IOException;

/* JADX INFO: loaded from: classes56.dex */
@Keep
public class AdvertisingIdClient {
    private static final String SETTINGS_AD_ID = "pps_oaid";
    private static final String SETTINGS_TRACK_LIMIT = "pps_track_limit";

    @Keep
    public static final class Info {
        private final String advertisingId;
        private final boolean limitAdTrackingEnabled;

        @Keep
        public String getId() {
            return this.advertisingId;
        }

        @Keep
        public boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }

        @Keep
        public Info(String str, boolean z11) {
            this.advertisingId = str;
            this.limitAdTrackingEnabled = z11;
        }
    }

    @Keep
    public static boolean isAdvertisingIdAvailable(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getPackageInfo(C9255b.m14290a(context), 128);
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage(C9255b.m14290a(context));
            return !packageManager.queryIntentServices(intent, 0).isEmpty();
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Info requestAdvertisingIdInfo(Context context) throws IOException {
        try {
            context.getPackageManager().getPackageInfo(C9255b.m14290a(context), 128);
            ServiceConnectionC9254a serviceConnectionC9254a = new ServiceConnectionC9254a();
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage(C9255b.m14290a(context));
            try {
                if (!context.bindService(intent, serviceConnectionC9254a, 1)) {
                    throw new IOException("bind failed");
                }
                try {
                    try {
                        OpenDeviceIdentifierService openDeviceIdentifierServiceAsInterface = OpenDeviceIdentifierService.Stub.asInterface(serviceConnectionC9254a.m14289a());
                        Info info = new Info(openDeviceIdentifierServiceAsInterface.getOaid(), openDeviceIdentifierServiceAsInterface.isOaidTrackLimited());
                        try {
                            context.unbindService(serviceConnectionC9254a);
                            return info;
                        } catch (Throwable th2) {
                            Log.w("AdIdClient", "unbind " + th2.getClass().getSimpleName());
                            return info;
                        }
                    } catch (RemoteException unused) {
                        throw new IOException("bind hms service RemoteException");
                    }
                } catch (InterruptedException unused2) {
                    throw new IOException("bind hms service InterruptedException");
                }
            } catch (Throwable th3) {
                try {
                    context.unbindService(serviceConnectionC9254a);
                } catch (Throwable th4) {
                    Log.w("AdIdClient", "unbind " + th4.getClass().getSimpleName());
                }
                throw th3;
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            throw new IOException("Service not found");
        } catch (Exception unused4) {
            throw new IOException("Service not found: Exception");
        }
    }

    private static void updateAdvertisingIdInfo(final Context context) {
        AbstractC9256c.f13265a.execute(new Runnable() { // from class: com.huawei.hms.ads.identifier.AdvertisingIdClient.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AdvertisingIdClient.requestAdvertisingIdInfo(context);
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Keep
    public static Info getAdvertisingIdInfo(Context context) throws IOException {
        try {
            String string = Settings.Global.getString(context.getContentResolver(), SETTINGS_AD_ID);
            String string2 = Settings.Global.getString(context.getContentResolver(), SETTINGS_TRACK_LIMIT);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                updateAdvertisingIdInfo(context);
                return new Info(string, Boolean.valueOf(string2).booleanValue());
            }
        } catch (Throwable unused) {
        }
        return requestAdvertisingIdInfo(context);
    }

    @Keep
    public static boolean verifyAdId(Context context, String str, boolean z11) throws AdIdVerifyException {
        try {
            Info infoRequestAdvertisingIdInfo = requestAdvertisingIdInfo(context);
            if (infoRequestAdvertisingIdInfo != null) {
                if (!TextUtils.equals(str, infoRequestAdvertisingIdInfo.getId()) || z11 != infoRequestAdvertisingIdInfo.isLimitAdTrackingEnabled()) {
                    return false;
                }
                return true;
            }
            Log.w("AdIdClient", "info is null");
            return false;
        } catch (Throwable unused) {
            throw new AdIdVerifyException("Something wrong with verification, please try later.");
        }
    }
}
