package p329i2;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: i2.i */
/* JADX INFO: compiled from: FirstFrameAndAfterTrimMemoryWaiter.java */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(26)
public final class ComponentCallbacks2C38417i implements InterfaceC38419k, ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(20);
    }

    @Override // p329i2.InterfaceC38419k
    /* JADX INFO: renamed from: a */
    public void mo86611a(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
    }
}
