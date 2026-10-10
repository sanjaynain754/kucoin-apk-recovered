package com.kubi.sdk.site.config;

import com.kubi.sdk.site.issue.SiteConfigMessage;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SiteConfigManager.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.config.SiteConfigManager$watchTimeout$2$job$1", m90122f = "SiteConfigManager.kt", m90123i = {}, m90124l = {108}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nSiteConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteConfigManager.kt\ncom/kubi/sdk/site/config/SiteConfigManager$watchTimeout$2$job$1\n+ 2 SiteConfigIssue.kt\ncom/kubi/sdk/site/issue/SiteConfigIssueKt\n*L\n1#1,123:1\n48#2,2:124\n*S KotlinDebug\n*F\n+ 1 SiteConfigManager.kt\ncom/kubi/sdk/site/config/SiteConfigManager$watchTimeout$2$job$1\n*L\n110#1:124,2\n*E\n"})
public final class SiteConfigManager$watchTimeout$2$job$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    int label;

    public SiteConfigManager$watchTimeout$2$job$1(Continuation<? super SiteConfigManager$watchTimeout$2$job$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SiteConfigManager$watchTimeout$2$job$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((SiteConfigManager$watchTimeout$2$job$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            this.label = 1;
            if (DelayKt.m90350b(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        C44128b.m97266j("SiteConfigManager", "watchTimeout timeout 3000");
        C43846g.m96568c(new SiteConfigMessage("fetch site config timeout", "SiteConfigManager", false, 4, null), null, 2, null);
        return Boxing.boxBoolean(SiteConfigManager.f47887d.mo91370n(Boxing.boxBoolean(true)));
    }
}
