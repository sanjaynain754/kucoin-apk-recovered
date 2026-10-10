package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.Closeable;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExperimentalStdlibApi;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextKey;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kotlinx.coroutines.m1 */
/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \r2\u00020\u00012\u00020\u00022\u00060\u0003j\u0002`\u0004:\u0001\u000eB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m90084d2 = {"Lkotlinx/coroutines/m1;", "Lkotlinx/coroutines/j0;", "Ljava/io/Closeable;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "", "close", "Ljava/util/concurrent/Executor;", "p", "()Ljava/util/concurrent/Executor;", "executor", "b", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractC41710m1 extends AbstractC41697j0 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kotlinx.coroutines.m1$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Executors.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lkotlinx/coroutines/m1$a;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlinx/coroutines/j0;", "Lkotlinx/coroutines/m1;", "<init>", "()V", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @ExperimentalStdlibApi
    public static final class Companion extends AbstractCoroutineContextKey<AbstractC41697j0, AbstractC41710m1> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
            super(AbstractC41697j0.INSTANCE, new Function1() { // from class: kotlinx.coroutines.l1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC41710m1.Companion.m91124b((CoroutineContext.Element) obj);
                }
            });
        }

        /* JADX INFO: renamed from: b */
        public static final AbstractC41710m1 m91124b(CoroutineContext.Element element) {
            if (element instanceof AbstractC41710m1) {
                return (AbstractC41710m1) element;
            }
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    @NotNull
    /* JADX INFO: renamed from: p */
    public abstract Executor mo91122p();
}
