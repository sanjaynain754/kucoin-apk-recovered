package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.exifinterface.media.ExifInterface;
import androidx.loader.app.LoaderManagerImpl;
import java.time.Duration;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.C41685g2;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FlowLiveData.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "timeoutInMs", "Landroidx/lifecycle/LiveData;", "asLiveData", "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;J)Landroidx/lifecycle/LiveData;", "asFlow", "(Landroidx/lifecycle/LiveData;)Lkotlinx/coroutines/flow/e;", "Ljava/time/Duration;", "timeout", "(Lkotlinx/coroutines/flow/e;Ljava/time/Duration;Lkotlin/coroutines/CoroutineContext;)Landroidx/lifecycle/LiveData;", "lifecycle-livedata_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@JvmName(name = "FlowLiveDataConversions")
public final class FlowLiveDataConversions {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1 */
    /* JADX INFO: compiled from: FlowLiveData.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/m;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m90085k = 3, m90086mv = {2, 0, 0})
    @DebugMetadata(m90121c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", m90122f = "FlowLiveData.kt", m90123i = {0, 1}, m90124l = {105, 106, 108}, m90125m = "invokeSuspend", m90126n = {"observer", "observer"}, m90127s = {"L$0", "L$0"})
    public static final class C26131<T> extends SuspendLambda implements Function2<InterfaceC41574m<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ LiveData<T> $this_asFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: FlowLiveData.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 0, 0})
        @DebugMetadata(m90121c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", m90122f = "FlowLiveData.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LiveData<T> liveData, Observer<T> observer, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$this_asFlow, this.$observer, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$this_asFlow.observeForever((Observer<? super T>) this.$observer);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: FlowLiveData.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 0, 0})
        @DebugMetadata(m90121c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", m90122f = "FlowLiveData.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            final /* synthetic */ Observer<T> $observer;
            final /* synthetic */ LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LiveData<T> liveData, Observer<T> observer, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$this_asFlow, this.$observer, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$this_asFlow.removeObserver((Observer<? super T>) this.$observer);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26131(LiveData<T> liveData, Continuation<? super C26131> continuation) {
            super(2, continuation);
            this.$this_asFlow = liveData;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26131 c26131 = new C26131(this.$this_asFlow, continuation);
            c26131.L$0 = obj;
            return c26131;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41574m<? super T> interfaceC41574m, Continuation<? super Unit> continuation) {
            return ((C26131) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.Observer] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Observer observer;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r11 = this.label;
            try {
                if (r11 != 0) {
                    if (r11 != 1) {
                        if (r11 != 2) {
                            if (r11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th2 = (Throwable) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th2;
                        }
                        Observer observer2 = (Observer) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        r11 = observer2;
                    } else {
                        Observer observer3 = (Observer) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        observer = observer3;
                    }
                    throw new KotlinNothingValueException();
                }
                ResultKt.throwOnFailure(obj);
                final InterfaceC41574m interfaceC41574m = (InterfaceC41574m) this.L$0;
                Observer observer4 = new Observer() { // from class: androidx.lifecycle.f
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj2) {
                        interfaceC41574m.mo90594e(obj2);
                    }
                };
                AbstractC41586e2 immediate = C41782z0.m91393c().getImmediate();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, observer4, null);
                this.L$0 = observer4;
                this.label = 1;
                observer = observer4;
                if (C41686h.m91049g(immediate, anonymousClass1, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
                this.L$0 = observer;
                this.label = 2;
                r11 = observer;
                if (DelayKt.m90349a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th3) {
                CoroutineContext coroutineContextPlus = C41782z0.m91393c().getImmediate().plus(C41685g2.f91735b);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_asFlow, r11, null);
                this.L$0 = th3;
                this.label = 3;
                if (C41686h.m91049g(coroutineContextPlus, anonymousClass2, this) != coroutine_suspended) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1 */
    /* JADX INFO: compiled from: FlowLiveData.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveDataScope;"}, m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", m90122f = "FlowLiveData.kt", m90123i = {}, m90124l = {78}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C26141<T> extends SuspendLambda implements Function2<LiveDataScope<T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC41634e<T> $this_asLiveData;
        private /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<T> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C26141) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26141(InterfaceC41634e<? extends T> interfaceC41634e, Continuation<? super C26141> continuation) {
            super(2, continuation);
            this.$this_asLiveData = interfaceC41634e;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26141 c26141 = new C26141(this.$this_asLiveData, continuation);
            c26141.L$0 = obj;
            return c26141;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
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
                final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                InterfaceC41634e<T> interfaceC41634e = this.$this_asLiveData;
                InterfaceC41635f<? super T> interfaceC41635f = new InterfaceC41635f() { // from class: androidx.lifecycle.FlowLiveDataConversions.asLiveData.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public final Object emit(T t11, Continuation<? super Unit> continuation) {
                        Object objEmit = liveDataScope.emit(t11, continuation);
                        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (interfaceC41634e.collect(interfaceC41635f, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @JvmOverloads
    @NotNull
    public static final <T> LiveData<T> asLiveData(@NotNull InterfaceC41634e<? extends T> interfaceC41634e) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        return asLiveData$default(interfaceC41634e, (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC41634e interfaceC41634e, CoroutineContext coroutineContext, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            j11 = 5000;
        }
        return asLiveData(interfaceC41634e, coroutineContext, j11);
    }

    @NotNull
    public static final <T> InterfaceC41634e<T> asFlow(@NotNull LiveData<T> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        return C41636g.m90935r(C41636g.m90913f(new C26131(liveData, null)));
    }

    @JvmOverloads
    @NotNull
    public static final <T> LiveData<T> asLiveData(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return asLiveData$default(interfaceC41634e, context, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    @NotNull
    public static final <T> LiveData<T> asLiveData(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull CoroutineContext context, long j11) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        LoaderManagerImpl.LoaderInfo loaderInfo = (LiveData<T>) CoroutineLiveDataKt.liveData(context, j11, new C26141(interfaceC41634e, null));
        if (interfaceC41634e instanceof InterfaceC41678w) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                loaderInfo.setValue(((InterfaceC41678w) interfaceC41634e).getValue());
                return loaderInfo;
            }
            loaderInfo.postValue(((InterfaceC41678w) interfaceC41634e).getValue());
        }
        return loaderInfo;
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC41634e interfaceC41634e, Duration duration, CoroutineContext coroutineContext, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return asLiveData(interfaceC41634e, duration, coroutineContext);
    }

    @RequiresApi(26)
    @NotNull
    public static final <T> LiveData<T> asLiveData(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Duration timeout, @NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(context, "context");
        return asLiveData(interfaceC41634e, context, Api26Impl.INSTANCE.toMillis(timeout));
    }
}
