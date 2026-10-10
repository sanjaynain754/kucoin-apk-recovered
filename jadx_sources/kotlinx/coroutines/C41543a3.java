package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kotlinx.coroutines.a3 */
/* JADX INFO: compiled from: Unconfined.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m90084d2 = {"Lkotlinx/coroutines/a3;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "<init>", "()V", "", "b", "Z", "dispatcherWasUnconfined", "c", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@PublishedApi
public final class C41543a3 extends AbstractCoroutineContextElement {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    public boolean dispatcherWasUnconfined;

    /* JADX INFO: renamed from: kotlinx.coroutines.a3$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Unconfined.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lkotlinx/coroutines/a3$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/a3;", "<init>", "()V", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion implements CoroutineContext.Key<C41543a3> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public C41543a3() {
        super(INSTANCE);
    }
}
