package og0;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.AbstractC41697j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: og0.l */
/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "Lkotlinx/coroutines/j0;", "", "name", "b", "(Lkotlinx/coroutines/j0;Ljava/lang/String;)Lkotlinx/coroutines/j0;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
public final class C43066l {
    /* JADX INFO: renamed from: a */
    public static final void m94607a(int i11) {
        if (i11 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i11).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AbstractC41697j0 m94608b(@NotNull AbstractC41697j0 abstractC41697j0, @Nullable String str) {
        return str != null ? new C43076s(abstractC41697j0, str) : abstractC41697j0;
    }
}
