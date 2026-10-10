package com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.Signature;
import android.os.IBinder;
import android.os.Parcel;
import java.security.MessageDigest;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes56.dex */
public final class l111l1111lIl extends l111l1111lI1l {
    private final LinkedBlockingQueue<IBinder> l1111l111111Il = new LinkedBlockingQueue<>(1);
    private ServiceConnection l111l11111I1l = new ServiceConnection() { // from class: com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lIl.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                l111l1111lIl.this.l1111l111111Il.put(iBinder);
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };
    private Context l111l11111lIl;

    @Override // com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il.l111l1111lI1l
    public final String l1111l111111Il() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        String strL1111l111111Il = "";
        if (!this.l111l11111lIl.bindService(intent, this.l111l11111I1l, 1)) {
            return "";
        }
        try {
            strL1111l111111Il = l1111l111111Il(this.l1111l111111Il.take());
            this.l111l11111lIl.unbindService(this.l111l11111I1l);
            return strL1111l111111Il;
        } catch (Throwable unused) {
            return strL1111l111111Il;
        }
    }

    private static String l1111l111111Il(Context context, String str) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                return "";
            }
            byte[] byteArray = signatureArr[0].toByteArray();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            if (messageDigest == null) {
                return "";
            }
            byte[] bArrDigest = messageDigest.digest(byteArray);
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : bArrDigest) {
                sb2.append(Integer.toHexString((b11 & 255) | 256).substring(1, 3));
            }
            return sb2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public l111l1111lIl(Context context) {
        this.l111l11111lIl = context;
    }

    private String l1111l111111Il(IBinder iBinder) {
        String packageName = this.l111l11111lIl.getPackageName();
        String strL1111l111111Il = l1111l111111Il(this.l111l11111lIl, packageName);
        try {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                parcelObtain.writeString(packageName);
                parcelObtain.writeString(strL1111l111111Il);
                parcelObtain.writeString("OUID");
                iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String string = parcelObtain2.readString();
                try {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                    return string;
                } catch (Exception unused) {
                    return string;
                }
            } catch (Throwable th2) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                throw th2;
            }
        } catch (Exception unused2) {
            return "";
        }
    }
}
