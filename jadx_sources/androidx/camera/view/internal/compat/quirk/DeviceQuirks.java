package androidx.camera.view.internal.compat.quirk;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.view.internal.compat.quirk.DeviceQuirks;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes23.dex */
public class DeviceQuirks {
    private static final String TAG = "DeviceQuirks";
    private static volatile Quirks sQuirks;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2254a(QuirkSettings quirkSettings) {
        sQuirks = new Quirks(DeviceQuirksLoader.loadQuirks(quirkSettings));
        Logger.m1866d(TAG, "view DeviceQuirks = " + Quirks.toString(sQuirks));
    }

    public static <T extends Quirk> T get(Class<T> cls) {
        return (T) sQuirks.get(cls);
    }

    static {
        QuirkSettingsHolder.instance().observe(CameraXExecutors.directExecutor(), new Consumer() { // from class: c0.a
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DeviceQuirks.m2254a((QuirkSettings) obj);
            }
        });
    }

    private DeviceQuirks() {
    }
}
