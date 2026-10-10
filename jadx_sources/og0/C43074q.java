package og0;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import org.jetbrains.annotations.NotNull;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: og0.q */
/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "factories", "Lkotlinx/coroutines/e2;", "e", "(Lkotlinx/coroutines/internal/MainDispatcherFactory;Ljava/util/List;)Lkotlinx/coroutines/e2;", "", "c", "(Lkotlinx/coroutines/e2;)Z", "", "cause", "", "errorHint", "Log0/r;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;Ljava/lang/String;)Log0/r;", "", "d", "()Ljava/lang/Void;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatchersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class C43074q {
    /* JADX INFO: renamed from: a */
    public static final C43075r m94631a(Throwable th2, String str) throws Throwable {
        if (th2 != null) {
            throw th2;
        }
        m94634d();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C43075r m94632b(Throwable th2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return m94631a(th2, str);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Void m94634d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m94633c(@NotNull AbstractC41586e2 abstractC41586e2) {
        return abstractC41586e2.getImmediate() instanceof C43075r;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final AbstractC41586e2 m94635e(@NotNull MainDispatcherFactory mainDispatcherFactory, @NotNull List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th2) {
            return m94631a(th2, mainDispatcherFactory.hintOnError());
        }
    }
}
