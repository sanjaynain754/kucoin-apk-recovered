package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import og0.C43045a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;

/* JADX INFO: renamed from: kotlinx.coroutines.b2 */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0012¨\u0006\u0015"}, m90084d2 = {"", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Log0/a0;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Log0/a0;", "COMPLETING_ALREADY", "b", "COMPLETING_WAITING_CHILDREN", "c", "COMPLETING_RETRY", "d", "TOO_LATE_TO_CANCEL", "e", "SEALED", "Lkotlinx/coroutines/e1;", "f", "Lkotlinx/coroutines/e1;", "EMPTY_NEW", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41551b2 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43045a0 f91461a = new C43045a0("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b */
    @JvmField
    @NotNull
    public static final C43045a0 f91462b = new C43045a0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C43045a0 f91463c = new C43045a0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final C43045a0 f91464d = new C43045a0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final C43045a0 f91465e = new C43045a0("SEALED");

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final C41585e1 f91466f = new C41585e1(false);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final C41585e1 f91467g = new C41585e1(true);

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Object m90494g(@Nullable Object obj) {
        return obj instanceof InterfaceC41741s1 ? new C41759t1((InterfaceC41741s1) obj) : obj;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final Object m90495h(@Nullable Object obj) {
        InterfaceC41741s1 interfaceC41741s1;
        C41759t1 c41759t1 = obj instanceof C41759t1 ? (C41759t1) obj : null;
        return (c41759t1 == null || (interfaceC41741s1 = c41759t1.state) == null) ? obj : interfaceC41741s1;
    }
}
