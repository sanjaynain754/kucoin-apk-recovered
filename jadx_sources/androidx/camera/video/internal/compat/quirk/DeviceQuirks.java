package androidx.camera.video.internal.compat.quirk;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Consumer;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class DeviceQuirks {
    private static final String TAG = "DeviceQuirks";
    private static volatile Quirks sQuirks;

    public static Quirks getAll() {
        return sQuirks;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2180a(QuirkSettings quirkSettings) {
        sQuirks = new Quirks(DeviceQuirksLoader.loadQuirks(quirkSettings));
        Logger.m1866d(TAG, "video DeviceQuirks = " + Quirks.toString(sQuirks));
    }

    public static <T extends Quirk> T get(Class<T> cls) {
        return (T) sQuirks.get(cls);
    }

    public static <T extends Quirk> List<T> getAll(Class<T> cls) {
        return sQuirks.getAll(cls);
    }

    static {
        QuirkSettingsHolder.instance().observe(CameraXExecutors.directExecutor(), new Consumer() { // from class: androidx.camera.video.internal.compat.quirk.b
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DeviceQuirks.m2180a((QuirkSettings) obj);
            }
        });
    }

    private DeviceQuirks() {
    }
}
