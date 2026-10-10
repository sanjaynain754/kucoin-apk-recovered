package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41550b1;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BT\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00127\u0010\u000e\u001a3\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\f¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0016\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001c\u0010\u001bR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m90084d2 = {"Landroidx/lifecycle/CoroutineLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MediatorLiveData;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "", "", "Landroidx/lifecycle/Block;", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;)V", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/b1;", "emitSource$lifecycle_livedata_release", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSource", "clearSource$lifecycle_livedata_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSource", "onActive", "()V", "onInactive", "Landroidx/lifecycle/BlockRunner;", "blockRunner", "Landroidx/lifecycle/BlockRunner;", "Landroidx/lifecycle/EmittedSource;", "emittedSource", "Landroidx/lifecycle/EmittedSource;", "lifecycle-livedata_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {

    @Nullable
    private BlockRunner<T> blockRunner;

    @Nullable
    private EmittedSource emittedSource;

    public /* synthetic */ CoroutineLiveData(CoroutineContext coroutineContext, long j11, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i11 & 2) != 0 ? 5000L : j11, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(CoroutineLiveData coroutineLiveData) {
        coroutineLiveData.blockRunner = null;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object clearSource$lifecycle_livedata_release(@NotNull Continuation<? super Unit> continuation) {
        CoroutineLiveData$clearSource$1 coroutineLiveData$clearSource$1;
        if (continuation instanceof CoroutineLiveData$clearSource$1) {
            coroutineLiveData$clearSource$1 = (CoroutineLiveData$clearSource$1) continuation;
            int i11 = coroutineLiveData$clearSource$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$clearSource$1.label = i11 - Integer.MIN_VALUE;
            } else {
                coroutineLiveData$clearSource$1 = new CoroutineLiveData$clearSource$1(this, continuation);
            }
        } else {
            coroutineLiveData$clearSource$1 = new CoroutineLiveData$clearSource$1(this, continuation);
        }
        Object obj = coroutineLiveData$clearSource$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = coroutineLiveData$clearSource$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            EmittedSource emittedSource = this.emittedSource;
            if (emittedSource != null) {
                coroutineLiveData$clearSource$1.label = 1;
                if (emittedSource.disposeNow(coroutineLiveData$clearSource$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.emittedSource = null;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r7 == r1) goto L21;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emitSource$lifecycle_livedata_release(@NotNull LiveData<T> liveData, @NotNull Continuation<? super InterfaceC41550b1> continuation) {
        CoroutineLiveData$emitSource$1 coroutineLiveData$emitSource$1;
        if (continuation instanceof CoroutineLiveData$emitSource$1) {
            coroutineLiveData$emitSource$1 = (CoroutineLiveData$emitSource$1) continuation;
            int i11 = coroutineLiveData$emitSource$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$emitSource$1.label = i11 - Integer.MIN_VALUE;
            } else {
                coroutineLiveData$emitSource$1 = new CoroutineLiveData$emitSource$1(this, continuation);
            }
        } else {
            coroutineLiveData$emitSource$1 = new CoroutineLiveData$emitSource$1(this, continuation);
        }
        Object objAddDisposableSource = coroutineLiveData$emitSource$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = coroutineLiveData$emitSource$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objAddDisposableSource);
            coroutineLiveData$emitSource$1.L$0 = liveData;
            coroutineLiveData$emitSource$1.label = 1;
            if (clearSource$lifecycle_livedata_release(coroutineLiveData$emitSource$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            liveData = (LiveData) coroutineLiveData$emitSource$1.L$0;
            ResultKt.throwOnFailure(objAddDisposableSource);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAddDisposableSource);
        }
        EmittedSource emittedSource = (EmittedSource) objAddDisposableSource;
        this.emittedSource = emittedSource;
        return emittedSource;
        coroutineLiveData$emitSource$1.L$0 = null;
        coroutineLiveData$emitSource$1.label = 2;
        objAddDisposableSource = CoroutineLiveDataKt.addDisposableSource(this, liveData, coroutineLiveData$emitSource$1);
    }

    public CoroutineLiveData(@NotNull CoroutineContext context, long j11, @NotNull Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.blockRunner = new BlockRunner<>(this, block, j11, C41713n0.m91125a(C41782z0.m91393c().getImmediate().plus(context).plus(C41727q2.m91191a((InterfaceC41775x1) context.get(InterfaceC41775x1.INSTANCE)))), new Function0() { // from class: androidx.lifecycle.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoroutineLiveData._init_$lambda$0(this.f2759b);
            }
        });
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.maybeRun();
        }
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.cancel();
        }
    }
}
