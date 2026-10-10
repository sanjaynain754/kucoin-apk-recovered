package com.kubi.sdk.site.config.client;

import com.kubi.sdk.site.config.data.SiteConfigEntity;
import l00.InterfaceC42016a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: RemoteConfigClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/site/config/data/SiteConfigEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.config.client.RemoteConfigClient$fetchSiteConfig$siteConfigEntity$1", m90122f = "RemoteConfigClient.kt", m90123i = {}, m90124l = {30}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RemoteConfigClient$fetchSiteConfig$siteConfigEntity$1 extends SuspendLambda implements Function1<Continuation<? super SiteConfigEntity>, Object> {
    final /* synthetic */ InterfaceC42016a $api;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigClient$fetchSiteConfig$siteConfigEntity$1(InterfaceC42016a interfaceC42016a, Continuation<? super RemoteConfigClient$fetchSiteConfig$siteConfigEntity$1> continuation) {
        super(1, continuation);
        this.$api = interfaceC42016a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new RemoteConfigClient$fetchSiteConfig$siteConfigEntity$1(this.$api, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super SiteConfigEntity> continuation) {
        return ((RemoteConfigClient$fetchSiteConfig$siteConfigEntity$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
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
        InterfaceC42016a interfaceC42016a = this.$api;
        this.label = 1;
        Object objM92118a = interfaceC42016a.m92118a(this);
        if (objM92118a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM92118a;
    }
}
