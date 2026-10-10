package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes34.dex */
@ExperimentalRoomApi
public class MultiInstanceInvalidationService extends Service {
    int mMaxClientId = 0;
    final HashMap<Integer, String> mClientNames = new HashMap<>();
    final RemoteCallbackList<IMultiInstanceInvalidationCallback> mCallbackList = new RemoteCallbackList<IMultiInstanceInvalidationCallback>() { // from class: androidx.room.MultiInstanceInvalidationService.1
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, Object obj) {
            HashMap<Integer, String> map = MultiInstanceInvalidationService.this.mClientNames;
            Integer num = (Integer) obj;
            num.intValue();
            map.remove(num);
        }
    };
    private final IMultiInstanceInvalidationService.Stub mBinder = new IMultiInstanceInvalidationService.Stub() { // from class: androidx.room.MultiInstanceInvalidationService.2
        @Override // androidx.room.IMultiInstanceInvalidationService
        public int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.mCallbackList) {
                try {
                    MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                    int i11 = multiInstanceInvalidationService.mMaxClientId + 1;
                    multiInstanceInvalidationService.mMaxClientId = i11;
                    if (multiInstanceInvalidationService.mCallbackList.register(iMultiInstanceInvalidationCallback, Integer.valueOf(i11))) {
                        MultiInstanceInvalidationService.this.mClientNames.put(Integer.valueOf(i11), str);
                        return i11;
                    }
                    MultiInstanceInvalidationService.this.mMaxClientId--;
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void broadcastInvalidation(int i11, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.mCallbackList) {
                try {
                    String str = MultiInstanceInvalidationService.this.mClientNames.get(Integer.valueOf(i11));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    int iBeginBroadcast = MultiInstanceInvalidationService.this.mCallbackList.beginBroadcast();
                    for (int i12 = 0; i12 < iBeginBroadcast; i12++) {
                        try {
                            Integer num = (Integer) MultiInstanceInvalidationService.this.mCallbackList.getBroadcastCookie(i12);
                            int iIntValue = num.intValue();
                            String str2 = MultiInstanceInvalidationService.this.mClientNames.get(num);
                            if (i11 != iIntValue && str.equals(str2)) {
                                try {
                                    ((IMultiInstanceInvalidationCallback) MultiInstanceInvalidationService.this.mCallbackList.getBroadcastItem(i12)).onInvalidation(strArr);
                                } catch (RemoteException e11) {
                                    Log.w("ROOM", "Error invoking a remote callback", e11);
                                }
                            }
                        } catch (Throwable th2) {
                            MultiInstanceInvalidationService.this.mCallbackList.finishBroadcast();
                            throw th2;
                        }
                    }
                    MultiInstanceInvalidationService.this.mCallbackList.finishBroadcast();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i11) {
            synchronized (MultiInstanceInvalidationService.this.mCallbackList) {
                MultiInstanceInvalidationService.this.mCallbackList.unregister(iMultiInstanceInvalidationCallback);
                MultiInstanceInvalidationService.this.mClientNames.remove(Integer.valueOf(i11));
            }
        }
    };

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NonNull Intent intent) {
        return this.mBinder;
    }
}
