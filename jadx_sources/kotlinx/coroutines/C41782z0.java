package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.webkit.Profile;
import og0.C43073p;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import qg0.C43731b;
import qg0.ExecutorC43730a;

/* JADX INFO: renamed from: kotlinx.coroutines.z0 */
/* JADX INFO: compiled from: Dispatchers.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR\u001a\u0010\u0012\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0005\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lkotlinx/coroutines/z0;", "", "<init>", "()V", "Lkotlinx/coroutines/j0;", "b", "Lkotlinx/coroutines/j0;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lkotlinx/coroutines/j0;", "getDefault$annotations", Profile.DEFAULT_PROFILE_NAME, "c", "d", "getUnconfined$annotations", "Unconfined", "Lkotlinx/coroutines/e2;", "()Lkotlinx/coroutines/e2;", "getMain$annotations", "Main", "getIO$annotations", "IO", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41782z0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C41782z0 f91884a = new C41782z0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AbstractC41697j0 Default = C43731b.f96681h;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final AbstractC41697j0 Unconfined = C41772w2.f91877b;

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AbstractC41697j0 m91391a() {
        return Default;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AbstractC41697j0 m91392b() {
        return ExecutorC43730a.f96679c;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final AbstractC41586e2 m91393c() {
        return C43073p.dispatcher;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final AbstractC41697j0 m91394d() {
        return Unconfined;
    }
}
