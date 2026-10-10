package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: SingleProcessCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m90084d2 = {"Landroidx/datastore/core/SingleProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "", "filePath", "<init>", "(Ljava/lang/String;)V", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "lock", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "tryLock", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", "Ljava/lang/String;", "Lrg0/a;", "mutex", "Lrg0/a;", "Landroidx/datastore/core/AtomicInt;", "version", "Landroidx/datastore/core/AtomicInt;", "Lkotlinx/coroutines/flow/e;", "", "updateNotifications", "Lkotlinx/coroutines/flow/e;", "getUpdateNotifications", "()Lkotlinx/coroutines/flow/e;", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSingleProcessCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleProcessCoordinator.kt\nandroidx/datastore/core/SingleProcessCoordinator\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 MutexUtils.kt\nandroidx/datastore/core/MutexUtilsKt\n*L\n1#1,60:1\n120#2,10:61\n32#3,10:71\n*S KotlinDebug\n*F\n+ 1 SingleProcessCoordinator.kt\nandroidx/datastore/core/SingleProcessCoordinator\n*L\n40#1:61,10\n49#1:71,10\n*E\n"})
public final class SingleProcessCoordinator implements InterProcessCoordinator {

    @NotNull
    private final String filePath;

    @NotNull
    private final InterfaceC44082a mutex;

    @NotNull
    private final InterfaceC41634e<Unit> updateNotifications;

    @NotNull
    private final AtomicInt version;

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessCoordinator$lock$1 */
    /* JADX INFO: compiled from: SingleProcessCoordinator.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.SingleProcessCoordinator", m90122f = "SingleProcessCoordinator.kt", m90123i = {0, 0, 1}, m90124l = {66, 41}, m90125m = "lock", m90126n = {"block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m90127s = {"L$0", "L$1", "L$0"})
    public static final class C23471<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C23471(Continuation<? super C23471> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleProcessCoordinator.this.lock(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessCoordinator$tryLock$1 */
    /* JADX INFO: compiled from: SingleProcessCoordinator.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.SingleProcessCoordinator", m90122f = "SingleProcessCoordinator.kt", m90123i = {0, 0}, m90124l = {50}, m90125m = "tryLock", m90126n = {"$this$withTryLock_u24default$iv", "locked$iv"}, m90127s = {"L$0", "Z$0"})
    public static final class C23481<T> extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C23481(Continuation<? super C23481> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleProcessCoordinator.this.tryLock(null, this);
        }
    }

    public SingleProcessCoordinator(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
        this.mutex = C44087f.m97144b(false, 1, null);
        this.version = new AtomicInt(0);
        this.updateNotifications = C41636g.m90887K(new SingleProcessCoordinator$updateNotifications$1(null));
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    @NotNull
    public InterfaceC41634e<Unit> getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public Object getVersion(@NotNull Continuation<? super Integer> continuation) {
        return Boxing.boxInt(this.version.get());
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public Object incrementAndGetVersion(@NotNull Continuation<? super Integer> continuation) {
        return Boxing.boxInt(this.version.incrementAndGet());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public <T> Object lock(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) throws Throwable {
        C23471 c23471;
        InterfaceC44082a interfaceC44082a;
        Throwable th2;
        InterfaceC44082a interfaceC44082a2;
        if (continuation instanceof C23471) {
            c23471 = (C23471) continuation;
            int i11 = c23471.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23471.label = i11 - Integer.MIN_VALUE;
            } else {
                c23471 = new C23471(continuation);
            }
        } else {
            c23471 = new C23471(continuation);
        }
        Object obj = c23471.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c23471.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                interfaceC44082a = this.mutex;
                c23471.L$0 = function1;
                c23471.L$1 = interfaceC44082a;
                c23471.label = 1;
                if (interfaceC44082a.mo91344d(null, c23471) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC44082a2 = (InterfaceC44082a) c23471.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    interfaceC44082a2.mo91345e(null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    interfaceC44082a2.mo91345e(null);
                    throw th2;
                }
            }
            InterfaceC44082a interfaceC44082a3 = (InterfaceC44082a) c23471.L$1;
            Function1<? super Continuation<? super T>, ? extends Object> function2 = (Function1) c23471.L$0;
            ResultKt.throwOnFailure(obj);
            interfaceC44082a = interfaceC44082a3;
            function1 = function2;
            c23471.L$0 = interfaceC44082a;
            c23471.L$1 = null;
            c23471.label = 2;
            Object objInvoke = function1.invoke(c23471);
            if (objInvoke != coroutine_suspended) {
                InterfaceC44082a interfaceC44082a4 = interfaceC44082a;
                obj = objInvoke;
                interfaceC44082a2 = interfaceC44082a4;
                interfaceC44082a2.mo91345e(null);
                return obj;
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            InterfaceC44082a interfaceC44082a5 = interfaceC44082a;
            th2 = th4;
            interfaceC44082a2 = interfaceC44082a5;
            interfaceC44082a2.mo91345e(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    @Nullable
    public <T> Object tryLock(@NotNull Function2<? super Boolean, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        C23481 c23481;
        InterfaceC44082a interfaceC44082a;
        Throwable th2;
        boolean z11;
        if (continuation instanceof C23481) {
            c23481 = (C23481) continuation;
            int i11 = c23481.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23481.label = i11 - Integer.MIN_VALUE;
            } else {
                c23481 = new C23481(continuation);
            }
        } else {
            c23481 = new C23481(continuation);
        }
        Object obj = c23481.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c23481.label;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = c23481.Z$0;
            interfaceC44082a = (InterfaceC44082a) c23481.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                if (z11) {
                    interfaceC44082a.mo91345e(null);
                }
                return obj;
            } catch (Throwable th3) {
                th2 = th3;
                if (z11) {
                    interfaceC44082a.mo91345e(null);
                }
                throw th2;
            }
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC44082a interfaceC44082a2 = this.mutex;
        boolean zMo91342a = interfaceC44082a2.mo91342a(null);
        try {
            Boolean boolBoxBoolean = Boxing.boxBoolean(zMo91342a);
            c23481.L$0 = interfaceC44082a2;
            c23481.Z$0 = zMo91342a;
            c23481.label = 1;
            Object objInvoke = function2.invoke(boolBoxBoolean, c23481);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC44082a = interfaceC44082a2;
            obj = objInvoke;
            z11 = zMo91342a;
            if (z11) {
                interfaceC44082a.mo91345e(null);
            }
            return obj;
        } catch (Throwable th4) {
            interfaceC44082a = interfaceC44082a2;
            th2 = th4;
            z11 = zMo91342a;
            if (z11) {
                interfaceC44082a.mo91345e(null);
            }
            throw th2;
        }
    }
}
