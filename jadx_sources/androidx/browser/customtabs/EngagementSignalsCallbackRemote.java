package androidx.browser.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.IEngagementSignalsCallback;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
final class EngagementSignalsCallbackRemote implements EngagementSignalsCallback {
    private static final String TAG = "EngagementSigsCallbkRmt";
    private final IEngagementSignalsCallback mCallbackBinder;

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onGreatestScrollPercentageIncreased(@IntRange(from = 1, m1553to = 100) int i11, @NonNull Bundle bundle) {
        try {
            this.mCallbackBinder.onGreatestScrollPercentageIncreased(i11, bundle);
        } catch (RemoteException unused) {
            Log.e(TAG, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onSessionEnded(boolean z11, @NonNull Bundle bundle) {
        try {
            this.mCallbackBinder.onSessionEnded(z11, bundle);
        } catch (RemoteException unused) {
            Log.e(TAG, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onVerticalScrollEvent(boolean z11, @NonNull Bundle bundle) {
        try {
            this.mCallbackBinder.onVerticalScrollEvent(z11, bundle);
        } catch (RemoteException unused) {
            Log.e(TAG, "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    private EngagementSignalsCallbackRemote(@NonNull IEngagementSignalsCallback iEngagementSignalsCallback) {
        this.mCallbackBinder = iEngagementSignalsCallback;
    }

    @NonNull
    public static EngagementSignalsCallbackRemote fromBinder(@NonNull IBinder iBinder) {
        return new EngagementSignalsCallbackRemote(IEngagementSignalsCallback.Stub.asInterface(iBinder));
    }
}
