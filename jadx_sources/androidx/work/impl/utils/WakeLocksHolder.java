package androidx.work.impl.utils;

import android.os.PowerManager;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: WakeLocks.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u0012\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Landroidx/work/impl/utils/WakeLocksHolder;", "", "()V", "wakeLocks", "Ljava/util/WeakHashMap;", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "", "getWakeLocks", "()Ljava/util/WeakHashMap;", "work-runtime_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
final class WakeLocksHolder {

    @NotNull
    public static final WakeLocksHolder INSTANCE = new WakeLocksHolder();

    @NotNull
    private static final WeakHashMap<PowerManager.WakeLock, String> wakeLocks = new WeakHashMap<>();

    @NotNull
    public final WeakHashMap<PowerManager.WakeLock, String> getWakeLocks() {
        return wakeLocks;
    }

    private WakeLocksHolder() {
    }
}
