package androidx.core.content;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;

/* JADX INFO: loaded from: classes23.dex */
public class UnusedAppRestrictionsBackportCallback {
    private IUnusedAppRestrictionsBackportCallback mCallback;

    public void onResult(boolean z11, boolean z12) throws RemoteException {
        this.mCallback.onIsPermissionRevocationEnabledForAppResult(z11, z12);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public UnusedAppRestrictionsBackportCallback(@NonNull IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
        this.mCallback = iUnusedAppRestrictionsBackportCallback;
    }
}
