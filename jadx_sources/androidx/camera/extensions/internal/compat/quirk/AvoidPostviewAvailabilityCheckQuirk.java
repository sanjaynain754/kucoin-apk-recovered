package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AvoidPostviewAvailabilityCheckQuirk.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Landroidx/camera/extensions/internal/compat/quirk/AvoidPostviewAvailabilityCheckQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "Companion", "camera-extensions_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class AvoidPostviewAvailabilityCheckQuirk implements Quirk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: AvoidPostviewAvailabilityCheckQuirk.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m90084d2 = {"Landroidx/camera/extensions/internal/compat/quirk/AvoidPostviewAvailabilityCheckQuirk$Companion;", "", "<init>", "()V", "load", "", "camera-extensions_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final boolean load() {
            return StringsKt.equals("Xiaomi", Build.BRAND, true) && StringsKt.equals("dada", Build.DEVICE, true);
        }
    }

    @JvmStatic
    public static final boolean load() {
        return INSTANCE.load();
    }
}
