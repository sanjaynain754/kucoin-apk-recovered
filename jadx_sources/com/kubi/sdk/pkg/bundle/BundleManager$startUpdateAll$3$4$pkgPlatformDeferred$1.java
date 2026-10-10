package com.kubi.sdk.pkg.bundle;

import com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformStartupPlan;
import com.kubi.sdk.pkg.task.TaskStatus;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import rg0.InterfaceC44088g;

/* JADX INFO: compiled from: BundleManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/pkg/task/TaskStatus;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$4$pkgPlatformDeferred$1", m90122f = "BundleManager.kt", m90123i = {}, m90124l = {504}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BundleManager$startUpdateAll$3$4$pkgPlatformDeferred$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaskStatus>, Object> {
    final /* synthetic */ InterfaceC41769w<Unit> $normalStartGate;
    final /* synthetic */ InterfaceC41769w<Unit> $pkgCriticalScheduled;
    final /* synthetic */ PkgPlatformStartupPlan $pkgPlatformPlan;
    final /* synthetic */ InterfaceC44088g $semaphore;
    int label;

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$4$pkgPlatformDeferred$1$2 */
    /* JADX INFO: compiled from: BundleManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$4$pkgPlatformDeferred$1$2", m90122f = "BundleManager.kt", m90123i = {}, m90124l = {506}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C239312 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC41769w<Unit> $normalStartGate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C239312(InterfaceC41769w<Unit> interfaceC41769w, Continuation<? super C239312> continuation) {
            super(1, continuation);
            this.$normalStartGate = interfaceC41769w;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new C239312(this.$normalStartGate, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
            return ((C239312) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41769w<Unit> interfaceC41769w = this.$normalStartGate;
                this.label = 1;
                if (interfaceC41769w.mo91198h(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleManager$startUpdateAll$3$4$pkgPlatformDeferred$1(PkgPlatformStartupPlan pkgPlatformStartupPlan, InterfaceC44088g interfaceC44088g, InterfaceC41769w<Unit> interfaceC41769w, InterfaceC41769w<Unit> interfaceC41769w2, Continuation<? super BundleManager$startUpdateAll$3$4$pkgPlatformDeferred$1> continuation) {
        super(2, continuation);
        this.$pkgPlatformPlan = pkgPlatformStartupPlan;
        this.$semaphore = interfaceC44088g;
        this.$pkgCriticalScheduled = interfaceC41769w;
        this.$normalStartGate = interfaceC41769w2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BundleManager$startUpdateAll$3$4$pkgPlatformDeferred$1(this.$pkgPlatformPlan, this.$semaphore, this.$pkgCriticalScheduled, this.$normalStartGate, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super TaskStatus> continuation) {
        return ((BundleManager$startUpdateAll$3$4$pkgPlatformDeferred$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                PkgPlatformStartupPlan pkgPlatformStartupPlan = this.$pkgPlatformPlan;
                final InterfaceC41769w<Unit> interfaceC41769w = this.$pkgCriticalScheduled;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.kubi.sdk.pkg.bundle.BundleManager$startUpdateAll$3$4$pkgPlatformDeferred$1.1
                    @Override // p852kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        interfaceC41769w.mo91370n(Unit.INSTANCE);
                    }
                };
                C239312 c239312 = new C239312(this.$normalStartGate, null);
                InterfaceC44088g interfaceC44088g = this.$semaphore;
                this.label = 1;
                obj = pkgPlatformStartupPlan.m57633a(function0, c239312, interfaceC44088g, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            TaskStatus taskStatus = (TaskStatus) obj;
            this.$pkgCriticalScheduled.mo91370n(Unit.INSTANCE);
            return taskStatus;
        } catch (Throwable th2) {
            this.$pkgCriticalScheduled.mo91370n(Unit.INSTANCE);
            throw th2;
        }
    }
}
