package com.google.firebase.remoteconfig;

import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.channels.ProduceKt;
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
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RemoteConfig.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lkotlinx/coroutines/channels/m;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1", m90122f = "RemoteConfig.kt", m90123i = {}, m90124l = {76}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RemoteConfigKt$configUpdates$1 extends SuspendLambda implements Function2<InterfaceC41574m<? super ConfigUpdate>, Continuation<? super Unit>, Object> {
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigKt$configUpdates$1(FirebaseRemoteConfig firebaseRemoteConfig, Continuation<? super RemoteConfigKt$configUpdates$1> continuation) {
        super(2, continuation);
        this.$this_configUpdates = firebaseRemoteConfig;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RemoteConfigKt$configUpdates$1 remoteConfigKt$configUpdates$1 = new RemoteConfigKt$configUpdates$1(this.$this_configUpdates, continuation);
        remoteConfigKt$configUpdates$1.L$0 = obj;
        return remoteConfigKt$configUpdates$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41574m<? super ConfigUpdate> interfaceC41574m, @Nullable Continuation<? super Unit> continuation) {
        return ((RemoteConfigKt$configUpdates$1) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41574m interfaceC41574m = (InterfaceC41574m) this.L$0;
            FirebaseRemoteConfig firebaseRemoteConfig = this.$this_configUpdates;
            final ConfigUpdateListenerRegistration configUpdateListenerRegistrationAddOnConfigUpdateListener = firebaseRemoteConfig.addOnConfigUpdateListener(new RemoteConfigKt$configUpdates$1$registration$1(firebaseRemoteConfig, interfaceC41574m));
            Intrinsics.checkNotNullExpressionValue(configUpdateListenerRegistrationAddOnConfigUpdateListener, "FirebaseRemoteConfig.con…      }\n        }\n      )");
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1.1
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
                    configUpdateListenerRegistrationAddOnConfigUpdateListener.remove();
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
