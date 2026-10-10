package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.e */
/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000f\u000bB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086@¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u000b\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¨\u0006\u0010"}, m90084d2 = {"Lkotlinx/coroutines/e;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "Lkotlinx/coroutines/r0;", "deferreds", "<init>", "([Lkotlinx/coroutines/r0;)V", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "[Lkotlinx/coroutines/r0;", "Lkotlinx/atomicfu/AtomicInt;", "notCompletedCount", "b", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n426#2,9:122\n435#2,2:133\n13402#3,2:131\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n*L\n63#1:122,9\n63#1:133,2\n75#1:131,2\n*E\n"})
public final class C41583e<T> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f91532b = AtomicIntegerFieldUpdater.newUpdater(C41583e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41729r0<T>[] deferreds;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.e$a */
    /* JADX INFO: compiled from: Await.kt */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R<\u0010\u001d\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u0018\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001d\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00170\"8\u0002X\u0082\u0004¨\u0006$"}, m90084d2 = {"Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/a2;", "Lkotlinx/coroutines/m;", "", "continuation", "<init>", "(Lkotlinx/coroutines/e;Lkotlinx/coroutines/m;)V", "", "cause", "", "v", "(Ljava/lang/Throwable;)V", "f", "Lkotlinx/coroutines/m;", "Lkotlinx/coroutines/b1;", "g", "Lkotlinx/coroutines/b1;", "y", "()Lkotlinx/coroutines/b1;", "B", "(Lkotlinx/coroutines/b1;)V", "handle", "Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/e;", "value", "x", "()Lkotlinx/coroutines/e$b;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Lkotlinx/coroutines/e$b;)V", "disposer", "", "u", "()Z", "onCancelling", "Lkotlinx/atomicfu/AtomicRef;", "_disposer", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n11158#2:122\n11493#2,3:123\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n*L\n115#1:122\n115#1:123,3\n*E\n"})
    public final class a extends AbstractC41542a2 {

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f91534i = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC41708m<List<? extends T>> continuation;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public InterfaceC41550b1 handle;

        @Override // kotlinx.coroutines.AbstractC41542a2
        /* JADX INFO: renamed from: u */
        public boolean mo90449u() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC41708m<? super List<? extends T>> interfaceC41708m) {
            this.continuation = interfaceC41708m;
        }

        /* JADX INFO: renamed from: B */
        public final void m90723B(@NotNull InterfaceC41550b1 interfaceC41550b1) {
            this.handle = interfaceC41550b1;
        }

        @Override // kotlinx.coroutines.AbstractC41542a2
        /* JADX INFO: renamed from: v */
        public void mo90450v(@Nullable Throwable cause) {
            if (cause != null) {
                Object objMo91120y = this.continuation.mo91120y(cause);
                if (objMo91120y != null) {
                    this.continuation.mo91118s(objMo91120y);
                    C41583e<T>.b bVarM90724x = m90724x();
                    if (bVarM90724x != null) {
                        bVarM90724x.m90726a();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C41583e.m90719d().decrementAndGet(C41583e.this) == 0) {
                InterfaceC41708m<List<? extends T>> interfaceC41708m = this.continuation;
                InterfaceC41729r0[] interfaceC41729r0Arr = C41583e.this.deferreds;
                ArrayList arrayList = new ArrayList(interfaceC41729r0Arr.length);
                for (InterfaceC41729r0 interfaceC41729r0 : interfaceC41729r0Arr) {
                    arrayList.add(interfaceC41729r0.mo91197b());
                }
                interfaceC41708m.resumeWith(Result.m103844constructorimpl(arrayList));
            }
        }

        @NotNull
        /* JADX INFO: renamed from: y */
        public final InterfaceC41550b1 m90725y() {
            InterfaceC41550b1 interfaceC41550b1 = this.handle;
            if (interfaceC41550b1 != null) {
                return interfaceC41550b1;
            }
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }

        /* JADX INFO: renamed from: A */
        public final void m90722A(@Nullable C41583e<T>.b bVar) {
            f91534i.set(this, bVar);
        }

        @Nullable
        /* JADX INFO: renamed from: x */
        public final C41583e<T>.b m90724x() {
            return (b) f91534i.get(this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.e$b */
    /* JADX INFO: compiled from: Await.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/l;", "", "Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/e;", "nodes", "<init>", "(Lkotlinx/coroutines/e;[Lkotlinx/coroutines/e$a;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "", "cause", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "[Lkotlinx/coroutines/e$a;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n13402#2,2:122\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n*L\n88#1:122,2\n*E\n"})
    public final class b implements InterfaceC41704l {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final C41583e<T>.a[] nodes;

        public b(C41583e<T>.a[] aVarArr) {
            this.nodes = aVarArr;
        }

        /* JADX INFO: renamed from: a */
        public final void m90726a() {
            for (C41583e<T>.a aVar : this.nodes) {
                aVar.m90725y().dispose();
            }
        }

        @NotNull
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + ']';
        }

        @Override // kotlinx.coroutines.InterfaceC41704l
        /* JADX INFO: renamed from: b */
        public void mo90501b(@Nullable Throwable cause) {
            m90726a();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater m90719d() {
        return f91532b;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m90720c(@NotNull Continuation<? super List<? extends T>> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        int length = this.deferreds.length;
        a[] aVarArr = new a[length];
        for (int i11 = 0; i11 < length; i11++) {
            InterfaceC41729r0 interfaceC41729r0 = this.deferreds[i11];
            interfaceC41729r0.start();
            a aVar = new a(c41716o);
            aVar.m90723B(JobKt__JobKt.m90372p(interfaceC41729r0, false, aVar, 1, null));
            Unit unit = Unit.INSTANCE;
            aVarArr[i11] = aVar;
        }
        C41583e<T>.b bVar = new b(aVarArr);
        for (int i12 = 0; i12 < length; i12++) {
            aVarArr[i12].m90722A(bVar);
        }
        if (c41716o.isCompleted()) {
            bVar.m90726a();
        } else {
            C41724q.m91188c(c41716o, bVar);
        }
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41583e(@NotNull InterfaceC41729r0<? extends T>[] interfaceC41729r0Arr) {
        this.deferreds = interfaceC41729r0Arr;
        this.notCompletedCount$volatile = interfaceC41729r0Arr.length;
    }
}
