package rg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.sync.C41756a;
import og0.C43045a0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: rg0.f */
/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, m90084d2 = {"", "locked", "Lrg0/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Z)Lrg0/a;", "Log0/a0;", "Log0/a0;", "NO_OWNER", "b", "ON_LOCK_ALREADY_LOCKED_BY_OWNER", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C44087f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43045a0 f97335a = new C43045a0("NO_OWNER");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C43045a0 f97336b = new C43045a0("ALREADY_LOCKED_BY_OWNER");

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC44082a m97143a(boolean z11) {
        return new C41756a(z11);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC44082a m97144b(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m97143a(z11);
    }
}
