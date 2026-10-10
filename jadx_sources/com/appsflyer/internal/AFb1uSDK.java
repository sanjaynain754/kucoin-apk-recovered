package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AFb1uSDK {

    /* JADX INFO: loaded from: classes34.dex */
    public static final class AFa1tSDK {
        private final boolean AFAdRevenueData;
        public final String getRevenue;

        public final boolean getMediationNetwork() {
            return this.AFAdRevenueData;
        }

        public AFa1tSDK(String str, boolean z11) {
            this.getRevenue = str;
            this.AFAdRevenueData = z11;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class AFa1uSDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> AFAdRevenueData = new LinkedBlockingQueue<>(1);
        boolean getMonetizationNetwork = false;

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.AFAdRevenueData.put(iBinder);
            } catch (InterruptedException e11) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e11);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class AFa1zSDK implements IInterface {
        private final IBinder getMediationNetwork;

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.getMediationNetwork;
        }

        public AFa1zSDK(IBinder iBinder) {
            this.getMediationNetwork = iBinder;
        }

        public final String AFAdRevenueData() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.getMediationNetwork.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final boolean getMediationNetwork() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z11 = true;
                parcelObtain.writeInt(1);
                this.getMediationNetwork.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z11 = false;
                }
                return z11;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public static AFa1tSDK AFAdRevenueData(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            AFa1uSDK aFa1uSDK = new AFa1uSDK();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, aFa1uSDK, 1)) {
                    if (!aFa1uSDK.getMonetizationNetwork) {
                        aFa1uSDK.getMonetizationNetwork = true;
                        IBinder iBinderPoll = aFa1uSDK.AFAdRevenueData.poll(10L, TimeUnit.SECONDS);
                        if (iBinderPoll != null) {
                            AFa1zSDK aFa1zSDK = new AFa1zSDK(iBinderPoll);
                            AFa1tSDK aFa1tSDK = new AFa1tSDK(aFa1zSDK.AFAdRevenueData(), aFa1zSDK.getMediationNetwork());
                            context.unbindService(aFa1uSDK);
                            return aFa1tSDK;
                        }
                        throw new TimeoutException("Timed out waiting for the service connection");
                    }
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                }
                context.unbindService(aFa1uSDK);
                throw new IOException("Google Play connection failed");
            } catch (Throwable th2) {
                context.unbindService(aFa1uSDK);
                throw th2;
            }
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }
}
