package androidx.window.area;

import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.core.util.function.Consumer;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.channels.InterfaceC41577p;
import kotlinx.coroutines.channels.ProduceKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WindowAreaControllerImpl.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {"Lkotlinx/coroutines/channels/m;", "", "Landroidx/window/area/WindowAreaInfo;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1", m90122f = "WindowAreaControllerImpl.kt", m90123i = {}, m90124l = {94}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class WindowAreaControllerImpl$windowAreaInfos$1 extends SuspendLambda implements Function2<InterfaceC41574m<? super List<? extends WindowAreaInfo>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowAreaControllerImpl this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41574m<? super List<? extends WindowAreaInfo>> interfaceC41574m, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC41574m<? super List<WindowAreaInfo>>) interfaceC41574m, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowAreaControllerImpl$windowAreaInfos$1(WindowAreaControllerImpl windowAreaControllerImpl, Continuation<? super WindowAreaControllerImpl$windowAreaInfos$1> continuation) {
        super(2, continuation);
        this.this$0 = windowAreaControllerImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(WindowAreaControllerImpl windowAreaControllerImpl, InterfaceC41574m interfaceC41574m, ExtensionWindowAreaStatus extensionWindowAreaStatus) {
        Intrinsics.checkNotNullExpressionValue(extensionWindowAreaStatus, "extensionWindowAreaStatus");
        windowAreaControllerImpl.updateRearDisplayPresentationAvailability(extensionWindowAreaStatus);
        InterfaceC41577p channel = interfaceC41574m.getChannel();
        Collection collectionValues = windowAreaControllerImpl.currentWindowAreaInfoMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "currentWindowAreaInfoMap.values");
        channel.mo90594e(CollectionsKt.toList(collectionValues));
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        WindowAreaControllerImpl$windowAreaInfos$1 windowAreaControllerImpl$windowAreaInfos$1 = new WindowAreaControllerImpl$windowAreaInfos$1(this.this$0, continuation);
        windowAreaControllerImpl$windowAreaInfos$1.L$0 = obj;
        return windowAreaControllerImpl$windowAreaInfos$1;
    }

    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull InterfaceC41574m<? super List<WindowAreaInfo>> interfaceC41574m, @Nullable Continuation<? super Unit> continuation) {
        return ((WindowAreaControllerImpl$windowAreaInfos$1) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(WindowAreaControllerImpl windowAreaControllerImpl, InterfaceC41574m interfaceC41574m, Integer status) {
        Intrinsics.checkNotNullExpressionValue(status, "status");
        windowAreaControllerImpl.updateRearDisplayAvailability(status.intValue());
        InterfaceC41577p channel = interfaceC41574m.getChannel();
        Collection collectionValues = windowAreaControllerImpl.currentWindowAreaInfoMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "currentWindowAreaInfoMap.values");
        channel.mo90594e(CollectionsKt.toList(collectionValues));
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
            final InterfaceC41574m interfaceC41574m = (InterfaceC41574m) this.L$0;
            final WindowAreaControllerImpl windowAreaControllerImpl = this.this$0;
            final Consumer consumer = new Consumer() { // from class: androidx.window.area.g
                @Override // androidx.window.extensions.core.util.function.Consumer
                public final void accept(Object obj2) {
                    WindowAreaControllerImpl$windowAreaInfos$1.invokeSuspend$lambda$0(windowAreaControllerImpl, interfaceC41574m, (Integer) obj2);
                }
            };
            final WindowAreaControllerImpl windowAreaControllerImpl2 = this.this$0;
            final Consumer consumer2 = new Consumer() { // from class: androidx.window.area.h
                @Override // androidx.window.extensions.core.util.function.Consumer
                public final void accept(Object obj2) {
                    WindowAreaControllerImpl$windowAreaInfos$1.invokeSuspend$lambda$1(windowAreaControllerImpl2, interfaceC41574m, (ExtensionWindowAreaStatus) obj2);
                }
            };
            this.this$0.windowAreaComponent.addRearDisplayStatusListener(consumer);
            if (this.this$0.vendorApiLevel > 2) {
                this.this$0.windowAreaComponent.addRearDisplayPresentationStatusListener(consumer2);
            }
            final WindowAreaControllerImpl windowAreaControllerImpl3 = this.this$0;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1.1
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
                    windowAreaControllerImpl3.windowAreaComponent.removeRearDisplayStatusListener(consumer);
                    if (windowAreaControllerImpl3.vendorApiLevel > 2) {
                        windowAreaControllerImpl3.windowAreaComponent.removeRearDisplayPresentationStatusListener(consumer2);
                    }
                }
            };
            this.label = 1;
            if (ProduceKt.m90681a(interfaceC41574m, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
