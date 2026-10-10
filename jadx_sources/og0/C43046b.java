package og0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: og0.b */
/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ai\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u000226\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000e\u001a\u00028\u0000\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0017\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Log0/x;", ExifInterface.LATITUDE_SOUTH, "", "id", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "prev", "createNewSegment", "Log0/y;", "c", "(Log0/x;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Log0/c;", "N", "b", "(Log0/c;)Log0/c;", "Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "cur", "", "condition", "addConditionally", "(Lkotlinx/atomicfu/AtomicInt;ILkotlin/jvm/functions/Function1;)Z", "Log0/a0;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Log0/a0;", "CLOSED", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,265:1\n42#1,8:280\n103#2,7:266\n103#2,7:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n70#1:280,8\n23#1:266,7\n81#1:273,7\n*E\n"})
public final class C43046b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43045a0 f95234a = new C43045a0("CLOSED");

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <S extends AbstractC43081x<S>> Object m94537c(@NotNull S s11, long j11, @NotNull Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s11.id >= j11 && !s11.mo94555k()) {
                return C43082y.m94646a(s11);
            }
            Object objM94553g = s11.m94553g();
            if (objM94553g == f95234a) {
                return C43082y.m94646a(f95234a);
            }
            S sInvoke = (S) ((AbstractC43048c) objM94553g);
            if (sInvoke == null) {
                sInvoke = function2.invoke(Long.valueOf(s11.id + 1), s11);
                if (s11.m94559o(sInvoke)) {
                    if (s11.mo94555k()) {
                        s11.m94558n();
                    }
                }
            }
            s11 = (Object) sInvoke;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <N extends AbstractC43048c<N>> N m94536b(@NotNull N n11) {
        while (true) {
            Object objM94553g = n11.m94553g();
            if (objM94553g == f95234a) {
                return n11;
            }
            AbstractC43048c abstractC43048c = (AbstractC43048c) objM94553g;
            if (abstractC43048c == null) {
                if (n11.m94557m()) {
                    return n11;
                }
            } else {
                n11 = (N) abstractC43048c;
            }
        }
    }
}
