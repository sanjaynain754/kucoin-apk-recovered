package com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.Parcel;
import android.provider.Settings;
import android.text.TextUtils;
import com.tencent.bugly.proguard.C33820nf;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes56.dex */
public final class l111l11111lIl extends l111l1111lI1l {
    private final Context l1111l111111Il;
    private final LinkedBlockingQueue<IBinder> l111l11111lIl = new LinkedBlockingQueue<>(1);
    private ServiceConnection l111l11111I1l = new ServiceConnection() { // from class: com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l11111lIl.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                l111l11111lIl.this.l111l11111lIl.put(iBinder);
            } catch (Exception unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    @Override // com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lI1l
    public final String l1111l111111Il() {
        String string;
        String str = "com.huawei.hwid.tv";
        try {
            String string2 = Settings.Global.getString(this.l1111l111111Il.getContentResolver(), "pps_oaid");
            if (!(TextUtils.isEmpty(string2) ? true : string2.replaceAll("0", "").replaceAll(C33820nf.f71144W, "").isEmpty())) {
                return string2;
            }
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            Context context = this.l1111l111111Il;
            if (l1111l111111Il(context, "com.huawei.hwid")) {
                str = "com.huawei.hwid";
            } else if (l1111l111111Il(context, "com.huawei.hms")) {
                str = "com.huawei.hms";
            } else if (!l1111l111111Il(context, "com.huawei.hwid.tv")) {
                str = "com.huawei.hwid";
            }
            intent.setPackage(str);
            if (this.l1111l111111Il.bindService(intent, this.l111l11111I1l, 1)) {
                try {
                    try {
                        IBinder iBinderTake = this.l111l11111lIl.take();
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                            iBinderTake.transact(1, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            string = parcelObtain2.readString();
                            parcelObtain.recycle();
                            parcelObtain2.recycle();
                        } catch (Throwable th2) {
                            try {
                                th2.printStackTrace();
                                parcelObtain.recycle();
                                parcelObtain2.recycle();
                                string = null;
                            } catch (Throwable th3) {
                                parcelObtain.recycle();
                                parcelObtain2.recycle();
                                throw th3;
                            }
                        }
                        this.l1111l111111Il.unbindService(this.l111l11111I1l);
                        return string;
                    } catch (Throwable th4) {
                        this.l1111l111111Il.unbindService(this.l111l11111I1l);
                        throw th4;
                    }
                } catch (Exception unused) {
                    this.l1111l111111Il.unbindService(this.l111l11111I1l);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return "";
    }

    private String l1111l111111Il(Context context) {
        if (!l1111l111111Il(context, "com.huawei.hwid")) {
            if (l1111l111111Il(context, "com.huawei.hms")) {
                return "com.huawei.hms";
            }
            if (l1111l111111Il(context, "com.huawei.hwid.tv")) {
                return "com.huawei.hwid.tv";
            }
        }
        return "com.huawei.hwid";
    }

    public l111l11111lIl(Context context) {
        this.l1111l111111Il = context;
    }

    private static PackageInfo l111l11111lIl(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    return packageManager.getPackageInfo(str, 128);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private boolean l1111l111111Il(Context context, String str) {
        return l111l11111lIl(context, str) != null;
    }

    private static boolean l1111l111111Il(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return str.replaceAll("0", "").replaceAll(C33820nf.f71144W, "").isEmpty();
    }
}
