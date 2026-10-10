package coil.memory;

import com.tencent.bugly.proguard.C33914s6;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: coil.memory.a */
/* JADX INFO: compiled from: HardwareBitmapService.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m90084d2 = {"Lcoil/memory/a;", "Lcoil/memory/HardwareBitmapService;", "<init>", "()V", "Ljava/io/File;", "c", "Ljava/io/File;", "fileDescriptorList", "", "d", "Z", "hasAvailableFileDescriptors", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C5047a extends HardwareBitmapService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C5047a f5815b = new C5047a();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final File fileDescriptorList = new File(C33914s6.f71831j);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static volatile boolean hasAvailableFileDescriptors = true;

    public C5047a() {
        super(null);
    }
}
