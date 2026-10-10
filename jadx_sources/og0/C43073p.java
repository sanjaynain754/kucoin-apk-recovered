package og0;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: renamed from: og0.p */
/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Log0/p;", "", "<init>", "()V", "Lkotlinx/coroutines/e2;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lkotlinx/coroutines/e2;", "b", "Lkotlinx/coroutines/e2;", "dispatcher", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1971#2,14:131\n*S KotlinDebug\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n*L\n34#1:131,14\n*E\n"})
public final class C43073p {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43073p f95272a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final AbstractC41586e2 dispatcher;

    static {
        C43073p c43073p = new C43073p();
        f95272a = c43073p;
        C43047b0.m94543f("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = c43073p.m94630a();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC41586e2 m94630a() {
        Object next;
        AbstractC41586e2 abstractC41586e2M94635e;
        try {
            List list = SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            Iterator it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            if (mainDispatcherFactory != null && (abstractC41586e2M94635e = C43074q.m94635e(mainDispatcherFactory, list)) != null) {
                return abstractC41586e2M94635e;
            }
            C43074q.m94632b(null, null, 3, null);
            return null;
        } catch (Throwable th2) {
            C43074q.m94632b(th2, null, 2, null);
            return null;
        }
    }
}
