package coil.memory;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.InterfaceC4450g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;

/* JADX INFO: compiled from: RequestService.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m90084d2 = {"Lcoil/memory/RequestService;", "", "Lb1/g;", "logger", "<init>", "(Lb1/g;)V", "Lcoil/memory/HardwareBitmapService;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcoil/memory/HardwareBitmapService;", "hardwareBitmapService", "b", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class RequestService {

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final Bitmap.Config[] f5811c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HardwareBitmapService hardwareBitmapService = HardwareBitmapService.INSTANCE.invoke();

    static {
        f5811c = Build.VERSION.SDK_INT >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
    }

    public RequestService(@Nullable InterfaceC4450g interfaceC4450g) {
    }
}
