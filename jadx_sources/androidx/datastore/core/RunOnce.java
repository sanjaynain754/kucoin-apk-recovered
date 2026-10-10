package androidx.datastore.core;

import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Landroidx/datastore/core/RunOnce;", "", "<init>", "()V", "", "doRun", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitComplete", "runIfNeeded", "Lrg0/a;", "runMutex", "Lrg0/a;", "Lkotlinx/coroutines/w;", "didRun", "Lkotlinx/coroutines/w;", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n*L\n495#1:539,10\n*E\n"})
public abstract class RunOnce {

    @NotNull
    private final InterfaceC44082a runMutex = C44087f.m97144b(false, 1, null);

    @NotNull
    private final InterfaceC41769w<Unit> didRun = C41777y.m91388c(null, 1, null);

    /* JADX INFO: renamed from: androidx.datastore.core.RunOnce$runIfNeeded$1 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.RunOnce", m90122f = "DataStoreImpl.kt", m90123i = {0, 0, 1, 1}, m90124l = {544, 497}, m90125m = "runIfNeeded", m90126n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, m90127s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C23441 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C23441(Continuation<? super C23441> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RunOnce.this.runIfNeeded(this);
        }
    }

    @Nullable
    public abstract Object doRun(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    public final Object awaitComplete(@NotNull Continuation<? super Unit> continuation) {
        Object objMo91198h = this.didRun.mo91198h(continuation);
        return objMo91198h == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo91198h : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object runIfNeeded(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        C23441 c23441;
        InterfaceC44082a interfaceC44082a;
        RunOnce runOnce;
        InterfaceC44082a interfaceC44082a2;
        Throwable th2;
        RunOnce runOnce2;
        if (continuation instanceof C23441) {
            c23441 = (C23441) continuation;
            int i11 = c23441.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23441.label = i11 - Integer.MIN_VALUE;
            } else {
                c23441 = new C23441(continuation);
            }
        } else {
            c23441 = new C23441(continuation);
        }
        Object obj = c23441.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c23441.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.didRun.isCompleted()) {
                    return Unit.INSTANCE;
                }
                interfaceC44082a = this.runMutex;
                c23441.L$0 = this;
                c23441.L$1 = interfaceC44082a;
                c23441.label = 1;
                if (interfaceC44082a.mo91344d(null, c23441) != coroutine_suspended) {
                    runOnce = this;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC44082a2 = (InterfaceC44082a) c23441.L$1;
                runOnce2 = (RunOnce) c23441.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC41769w<Unit> interfaceC41769w = runOnce2.didRun;
                    Unit unit = Unit.INSTANCE;
                    interfaceC41769w.mo91370n(unit);
                    interfaceC44082a2.mo91345e(null);
                    return unit;
                } catch (Throwable th3) {
                    th2 = th3;
                    interfaceC44082a2.mo91345e(null);
                    throw th2;
                }
            }
            InterfaceC44082a interfaceC44082a3 = (InterfaceC44082a) c23441.L$1;
            runOnce = (RunOnce) c23441.L$0;
            ResultKt.throwOnFailure(obj);
            interfaceC44082a = interfaceC44082a3;
            if (runOnce.didRun.isCompleted()) {
                Unit unit2 = Unit.INSTANCE;
                interfaceC44082a.mo91345e(null);
                return unit2;
            }
            c23441.L$0 = runOnce;
            c23441.L$1 = interfaceC44082a;
            c23441.label = 2;
            if (runOnce.doRun(c23441) != coroutine_suspended) {
                interfaceC44082a2 = interfaceC44082a;
                runOnce2 = runOnce;
                InterfaceC41769w<Unit> interfaceC41769w2 = runOnce2.didRun;
                Unit unit3 = Unit.INSTANCE;
                interfaceC41769w2.mo91370n(unit3);
                interfaceC44082a2.mo91345e(null);
                return unit3;
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            interfaceC44082a2 = interfaceC44082a;
            th2 = th4;
            interfaceC44082a2.mo91345e(null);
            throw th2;
        }
    }
}
