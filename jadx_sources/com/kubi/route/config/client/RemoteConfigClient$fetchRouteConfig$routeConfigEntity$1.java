package com.kubi.route.config.client;

import com.kubi.route.config.model.RouteConfigEntry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: RemoteConfigClient.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, m90084d2 = {"<anonymous>", "Lcom/kubi/route/config/model/RouteConfigEntry;"}, m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.route.config.client.RemoteConfigClient$fetchRouteConfig$routeConfigEntity$1", m90122f = "RemoteConfigClient.kt", m90123i = {}, m90124l = {23}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RemoteConfigClient$fetchRouteConfig$routeConfigEntity$1 extends SuspendLambda implements Function1<Continuation<? super RouteConfigEntry>, Object> {
    final /* synthetic */ InterfaceC23632a $api;
    final /* synthetic */ String $version;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigClient$fetchRouteConfig$routeConfigEntity$1(InterfaceC23632a interfaceC23632a, String str, Continuation<? super RemoteConfigClient$fetchRouteConfig$routeConfigEntity$1> continuation) {
        super(1, continuation);
        this.$api = interfaceC23632a;
        this.$version = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new RemoteConfigClient$fetchRouteConfig$routeConfigEntity$1(this.$api, this.$version, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super RouteConfigEntry> continuation) {
        return ((RemoteConfigClient$fetchRouteConfig$routeConfigEntity$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC23632a interfaceC23632a = this.$api;
        String str = this.$version;
        Boolean boolBoxBoolean = Boxing.boxBoolean(true);
        this.label = 1;
        Object objM56177a = interfaceC23632a.m56177a(str, boolBoxBoolean, this);
        if (objM56177a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM56177a;
    }
}
