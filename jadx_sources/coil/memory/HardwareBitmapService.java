package coil.memory;

import android.os.Build;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p744x0.C45970e;
import p744x0.C45971f;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: HardwareBitmapService.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcoil/memory/HardwareBitmapService;", "", "<init>", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "Lx0/f;", "Lcoil/memory/a;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public abstract class HardwareBitmapService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: HardwareBitmapService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0005"}, m90084d2 = {"Lcoil/memory/HardwareBitmapService$Companion;", "", "()V", "invoke", "Lcoil/memory/HardwareBitmapService;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final HardwareBitmapService invoke() {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 26 || C45970e.IS_BLOCKED) {
                return new C45971f(false);
            }
            return (i11 == 26 || i11 == 27) ? C5047a.f5815b : new C45971f(true);
        }
    }

    public /* synthetic */ HardwareBitmapService(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public HardwareBitmapService() {
    }
}
