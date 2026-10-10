package com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes63.dex */
public interface ITPDownloadProxyAidl extends IInterface {

    public static abstract class Stub extends Binder implements ITPDownloadProxyAidl {
        private static final String DESCRIPTOR = "com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl";
        static final int TRANSACTION_checkResourceExist = 25;
        static final int TRANSACTION_checkResourceStatus = 17;
        static final int TRANSACTION_clearCache = 24;
        static final int TRANSACTION_deleteOfflineLicenseKeySetId = 28;
        static final int TRANSACTION_getClipPlayUrl = 6;
        static final int TRANSACTION_getNativeInfo = 16;
        static final int TRANSACTION_getOfflineLicenseKeySetId = 27;
        static final int TRANSACTION_getPlayErrorCodeStr = 7;
        static final int TRANSACTION_getPlayUrl = 5;
        static final int TRANSACTION_getResourceDownloadProgress = 26;
        static final int TRANSACTION_getResourceSize = 18;
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_pauseDownload = 9;
        static final int TRANSACTION_pushEvent = 19;
        static final int TRANSACTION_removeStorageCache = 23;
        static final int TRANSACTION_resumeDownload = 10;
        static final int TRANSACTION_setClipInfo = 4;
        static final int TRANSACTION_setMaxStorageSizeMB = 21;
        static final int TRANSACTION_setPlayState = 20;
        static final int TRANSACTION_setUserData = 15;
        static final int TRANSACTION_startClipPlay = 3;
        static final int TRANSACTION_startClipPreload = 12;
        static final int TRANSACTION_startPlay = 2;
        static final int TRANSACTION_startPreload = 11;
        static final int TRANSACTION_startTask = 14;
        static final int TRANSACTION_stopPlay = 8;
        static final int TRANSACTION_stopPreload = 13;
        static final int TRANSACTION_updateTaskInfo = 22;

        public static class Proxy implements ITPDownloadProxyAidl {
            private IBinder mRemote;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public boolean checkResourceExist(String str, String str2, long j11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeLong(j11);
                    boolean z11 = false;
                    this.mRemote.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z11 = true;
                    }
                    return z11;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int checkResourceStatus(String str, String str2, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i11);
                    this.mRemote.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int clearCache(String str, String str2, int i11, long j11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeLong(j11);
                    this.mRemote.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int deleteOfflineLicenseKeySetId(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.mRemote.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public String getClipPlayUrl(int i11, int i12, int i13) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public String getNativeInfo(int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public byte[] getOfflineLicenseKeySetId(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.mRemote.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public String getPlayErrorCodeStr(int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public String getPlayUrl(int i11, int i12) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public float getResourceDownloadProgress(String str, String str2, long j11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeLong(j11);
                    this.mRemote.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readFloat();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public long getResourceSize(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int init(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int pauseDownload(int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void pushEvent(int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    this.mRemote.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int removeStorageCache(String str, long j11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j11);
                    this.mRemote.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int resumeDownload(int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public boolean setClipInfo(int i11, int i12, String str, TPDownloadParamAidl tPDownloadParamAidl) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeString(str);
                    boolean z11 = true;
                    if (tPDownloadParamAidl != null) {
                        parcelObtain.writeInt(1);
                        tPDownloadParamAidl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
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

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void setMaxStorageSizeMB(long j11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j11);
                    this.mRemote.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void setPlayState(int i11, int i12) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.mRemote.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void setUserData(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int startClipPlay(String str, int i11, ITPPlayListenerAidl iTPPlayListenerAidl) throws RemoteException {
                IBinder iBinderAsBinder;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i11);
                    if (iTPPlayListenerAidl != null) {
                        iBinderAsBinder = iTPPlayListenerAidl.asBinder();
                    } else {
                        iBinderAsBinder = null;
                    }
                    parcelObtain.writeStrongBinder(iBinderAsBinder);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int startClipPreload(String str, int i11, ITPPreLoadListenerAidl iTPPreLoadListenerAidl) throws RemoteException {
                IBinder iBinderAsBinder;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i11);
                    if (iTPPreLoadListenerAidl != null) {
                        iBinderAsBinder = iTPPreLoadListenerAidl.asBinder();
                    } else {
                        iBinderAsBinder = null;
                    }
                    parcelObtain.writeStrongBinder(iBinderAsBinder);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int startPlay(String str, TPDownloadParamAidl tPDownloadParamAidl, ITPPlayListenerAidl iTPPlayListenerAidl) throws RemoteException {
                IBinder iBinderAsBinder;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (tPDownloadParamAidl != null) {
                        parcelObtain.writeInt(1);
                        tPDownloadParamAidl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (iTPPlayListenerAidl != null) {
                        iBinderAsBinder = iTPPlayListenerAidl.asBinder();
                    } else {
                        iBinderAsBinder = null;
                    }
                    parcelObtain.writeStrongBinder(iBinderAsBinder);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int startPreload(String str, TPDownloadParamAidl tPDownloadParamAidl, ITPPreLoadListenerAidl iTPPreLoadListenerAidl) throws RemoteException {
                IBinder iBinderAsBinder;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (tPDownloadParamAidl != null) {
                        parcelObtain.writeInt(1);
                        tPDownloadParamAidl.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (iTPPreLoadListenerAidl != null) {
                        iBinderAsBinder = iTPPreLoadListenerAidl.asBinder();
                    } else {
                        iBinderAsBinder = null;
                    }
                    parcelObtain.writeStrongBinder(iBinderAsBinder);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void startTask(int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void stopPlay(int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void stopPreload(int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void updateTaskInfo(int i11, Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static ITPDownloadProxyAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITPDownloadProxyAidl)) ? new Proxy(iBinder) : (ITPDownloadProxyAidl) iInterfaceQueryLocalInterface;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 != 1598968902) {
                TPDownloadParamAidl tPDownloadParamAidlCreateFromParcel = null;
                switch (i11) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        int iInit = init(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(iInit);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        String string = parcel.readString();
                        if (parcel.readInt() != 0) {
                            tPDownloadParamAidlCreateFromParcel = TPDownloadParamAidl.CREATOR.createFromParcel(parcel);
                        }
                        int iStartPlay = startPlay(string, tPDownloadParamAidlCreateFromParcel, ITPPlayListenerAidl.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(iStartPlay);
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        int iStartClipPlay = startClipPlay(parcel.readString(), parcel.readInt(), ITPPlayListenerAidl.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(iStartClipPlay);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        int i13 = parcel.readInt();
                        int i14 = parcel.readInt();
                        String string2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            tPDownloadParamAidlCreateFromParcel = TPDownloadParamAidl.CREATOR.createFromParcel(parcel);
                        }
                        boolean clipInfo = setClipInfo(i13, i14, string2, tPDownloadParamAidlCreateFromParcel);
                        parcel2.writeNoException();
                        parcel2.writeInt(clipInfo ? 1 : 0);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        String playUrl = getPlayUrl(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(playUrl);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        String clipPlayUrl = getClipPlayUrl(parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(clipPlayUrl);
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        String playErrorCodeStr = getPlayErrorCodeStr(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(playErrorCodeStr);
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        stopPlay(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        int iPauseDownload = pauseDownload(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(iPauseDownload);
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        int iResumeDownload = resumeDownload(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(iResumeDownload);
                        return true;
                    case 11:
                        parcel.enforceInterface(DESCRIPTOR);
                        String string3 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            tPDownloadParamAidlCreateFromParcel = TPDownloadParamAidl.CREATOR.createFromParcel(parcel);
                        }
                        int iStartPreload = startPreload(string3, tPDownloadParamAidlCreateFromParcel, ITPPreLoadListenerAidl.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(iStartPreload);
                        return true;
                    case 12:
                        parcel.enforceInterface(DESCRIPTOR);
                        int iStartClipPreload = startClipPreload(parcel.readString(), parcel.readInt(), ITPPreLoadListenerAidl.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(iStartClipPreload);
                        return true;
                    case 13:
                        parcel.enforceInterface(DESCRIPTOR);
                        stopPreload(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface(DESCRIPTOR);
                        startTask(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface(DESCRIPTOR);
                        setUserData(parcel.readHashMap(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface(DESCRIPTOR);
                        String nativeInfo = getNativeInfo(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(nativeInfo);
                        return true;
                    case 17:
                        parcel.enforceInterface(DESCRIPTOR);
                        int iCheckResourceStatus = checkResourceStatus(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(iCheckResourceStatus);
                        return true;
                    case 18:
                        parcel.enforceInterface(DESCRIPTOR);
                        long resourceSize = getResourceSize(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeLong(resourceSize);
                        return true;
                    case 19:
                        parcel.enforceInterface(DESCRIPTOR);
                        pushEvent(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel.enforceInterface(DESCRIPTOR);
                        setPlayState(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface(DESCRIPTOR);
                        setMaxStorageSizeMB(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface(DESCRIPTOR);
                        updateTaskInfo(parcel.readInt(), parcel.readHashMap(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface(DESCRIPTOR);
                        int iRemoveStorageCache = removeStorageCache(parcel.readString(), parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(iRemoveStorageCache);
                        return true;
                    case 24:
                        parcel.enforceInterface(DESCRIPTOR);
                        int iClearCache = clearCache(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(iClearCache);
                        return true;
                    case 25:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean zCheckResourceExist = checkResourceExist(parcel.readString(), parcel.readString(), parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(zCheckResourceExist ? 1 : 0);
                        return true;
                    case 26:
                        parcel.enforceInterface(DESCRIPTOR);
                        float resourceDownloadProgress = getResourceDownloadProgress(parcel.readString(), parcel.readString(), parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeFloat(resourceDownloadProgress);
                        return true;
                    case 27:
                        parcel.enforceInterface(DESCRIPTOR);
                        byte[] offlineLicenseKeySetId = getOfflineLicenseKeySetId(parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeByteArray(offlineLicenseKeySetId);
                        return true;
                    case 28:
                        parcel.enforceInterface(DESCRIPTOR);
                        int iDeleteOfflineLicenseKeySetId = deleteOfflineLicenseKeySetId(parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(iDeleteOfflineLicenseKeySetId);
                        return true;
                    default:
                        return super.onTransact(i11, parcel, parcel2, i12);
                }
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    boolean checkResourceExist(String str, String str2, long j11) throws RemoteException;

    int checkResourceStatus(String str, String str2, int i11) throws RemoteException;

    int clearCache(String str, String str2, int i11, long j11) throws RemoteException;

    int deleteOfflineLicenseKeySetId(String str, String str2, String str3) throws RemoteException;

    String getClipPlayUrl(int i11, int i12, int i13) throws RemoteException;

    String getNativeInfo(int i11) throws RemoteException;

    byte[] getOfflineLicenseKeySetId(String str, String str2, String str3) throws RemoteException;

    String getPlayErrorCodeStr(int i11) throws RemoteException;

    String getPlayUrl(int i11, int i12) throws RemoteException;

    float getResourceDownloadProgress(String str, String str2, long j11) throws RemoteException;

    long getResourceSize(String str, String str2) throws RemoteException;

    int init(String str) throws RemoteException;

    int pauseDownload(int i11) throws RemoteException;

    void pushEvent(int i11) throws RemoteException;

    int removeStorageCache(String str, long j11) throws RemoteException;

    int resumeDownload(int i11) throws RemoteException;

    boolean setClipInfo(int i11, int i12, String str, TPDownloadParamAidl tPDownloadParamAidl) throws RemoteException;

    void setMaxStorageSizeMB(long j11) throws RemoteException;

    void setPlayState(int i11, int i12) throws RemoteException;

    void setUserData(Map map) throws RemoteException;

    int startClipPlay(String str, int i11, ITPPlayListenerAidl iTPPlayListenerAidl) throws RemoteException;

    int startClipPreload(String str, int i11, ITPPreLoadListenerAidl iTPPreLoadListenerAidl) throws RemoteException;

    int startPlay(String str, TPDownloadParamAidl tPDownloadParamAidl, ITPPlayListenerAidl iTPPlayListenerAidl) throws RemoteException;

    int startPreload(String str, TPDownloadParamAidl tPDownloadParamAidl, ITPPreLoadListenerAidl iTPPreLoadListenerAidl) throws RemoteException;

    void startTask(int i11) throws RemoteException;

    void stopPlay(int i11) throws RemoteException;

    void stopPreload(int i11) throws RemoteException;

    void updateTaskInfo(int i11, Map map) throws RemoteException;
}
