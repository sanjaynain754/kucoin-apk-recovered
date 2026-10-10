package androidx.datastore.core;

import java.io.File;
import kotlinx.coroutines.InterfaceC41550b1;
import kotlinx.coroutines.channels.C41570i;
import kotlinx.coroutines.channels.InterfaceC41574m;
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
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MulticastFileObserver.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/channels/m;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", m90122f = "MulticastFileObserver.android.kt", m90123i = {0, 0}, m90124l = {84, 85}, m90125m = "invokeSuspend", m90126n = {"$this$channelFlow", "disposeListener"}, m90127s = {"L$0", "L$1"})
public final class MulticastFileObserver$Companion$observe$1 extends SuspendLambda implements Function2<InterfaceC41574m<? super Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1(File file, Continuation<? super MulticastFileObserver$Companion$observe$1> continuation) {
        super(2, continuation);
        this.$file = file;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.$file, continuation);
        multicastFileObserver$Companion$observe$1.L$0 = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41574m<? super Unit> interfaceC41574m, @Nullable Continuation<? super Unit> continuation) {
        return ((MulticastFileObserver$Companion$observe$1) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (kotlinx.coroutines.channels.ProduceKt.m90681a(r3, r7, r6) == r0) goto L16;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        final InterfaceC41550b1 interfaceC41550b1Observe;
        InterfaceC41574m interfaceC41574m;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                interfaceC41550b1Observe = (InterfaceC41550b1) this.L$1;
                interfaceC41574m = (InterfaceC41574m) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        final InterfaceC41574m interfaceC41574m2 = (InterfaceC41574m) this.L$0;
        final File file = this.$file;
        Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: androidx.datastore.core.MulticastFileObserver$Companion$observe$1$flowObserver$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable String str) {
                if (Intrinsics.areEqual(str, file.getName())) {
                    C41570i.m90707b(interfaceC41574m2, Unit.INSTANCE);
                }
            }
        };
        MulticastFileObserver.Companion companion = MulticastFileObserver.INSTANCE;
        File parentFile = this.$file.getParentFile();
        Intrinsics.checkNotNull(parentFile);
        interfaceC41550b1Observe = companion.observe(parentFile, function1);
        Unit unit = Unit.INSTANCE;
        this.L$0 = interfaceC41574m2;
        this.L$1 = interfaceC41550b1Observe;
        this.label = 1;
        if (interfaceC41574m2.send(unit, this) != coroutine_suspended) {
            interfaceC41574m = interfaceC41574m2;
        }
        return coroutine_suspended;
        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.datastore.core.MulticastFileObserver$Companion$observe$1.1
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                interfaceC41550b1Observe.dispose();
            }
        };
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
