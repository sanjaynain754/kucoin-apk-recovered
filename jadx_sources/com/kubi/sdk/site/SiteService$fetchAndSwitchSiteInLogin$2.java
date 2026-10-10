package com.kubi.sdk.site;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: SiteService.kt */
/* JADX INFO: loaded from: classes42.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.SiteService$fetchAndSwitchSiteInLogin$2", m90122f = "SiteService.kt", m90123i = {1}, m90124l = {437, 442}, m90125m = "invokeSuspend", m90126n = {"isChanged"}, m90127s = {"Z$0"})
public final class SiteService$fetchAndSwitchSiteInLogin$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $targetPath;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteService$fetchAndSwitchSiteInLogin$2(String str, Continuation<? super SiteService$fetchAndSwitchSiteInLogin$2> continuation) {
        super(2, continuation);
        this.$targetPath = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SiteService$fetchAndSwitchSiteInLogin$2(this.$targetPath, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((SiteService$fetchAndSwitchSiteInLogin$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        if (r10 == r0) goto L18;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
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
                ResultKt.throwOnFailure(obj);
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            return Boxing.boxBoolean(zBooleanValue);
        }
        ResultKt.throwOnFailure(obj);
        C44128b.m97266j("SiteService", "fetchAndSwitchSiteInLogin start, targetPath=" + this.$targetPath + ", isSwitchingSite=" + SiteService.f47796d.get());
        SiteService.f47796d.set(System.currentTimeMillis());
        SiteService siteService = SiteService.f47793a;
        SiteService.SwitchFromType switchFromType = SiteService.SwitchFromType.Login;
        this.label = 1;
        obj = siteService.m58002p(switchFromType, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        if (!zBooleanValue2) {
            SiteService.f47793a.m57994B();
            zBooleanValue = false;
        } else {
            SiteService siteService2 = SiteService.f47793a;
            SiteService.SwitchFromType switchFromType2 = SiteService.SwitchFromType.Login;
            String str = this.$targetPath;
            this.Z$0 = zBooleanValue2;
            this.label = 2;
            obj = SiteService.m57981G(siteService2, null, switchFromType2, str, null, this, 9, null);
        }
        return Boxing.boxBoolean(zBooleanValue);
    }
}
