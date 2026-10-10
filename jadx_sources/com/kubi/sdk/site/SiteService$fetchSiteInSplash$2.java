package com.kubi.sdk.site;

import com.kubi.sdk.site.helper.ActivityHelper;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.site.rebirth.AppRebirth;
import com.kubi.user.config.UserInfo;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;
import ro.C44128b;

/* JADX INFO: compiled from: SiteService.kt */
/* JADX INFO: loaded from: classes42.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.SiteService$fetchSiteInSplash$2", m90122f = "SiteService.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m90124l = {509, 514, 523}, m90125m = "invokeSuspend", m90126n = {"$this$coroutineScope", "defaultSiteType", "appReviewDeferred", "fetchSiteTypeDeferred", "$this$coroutineScope", "defaultSiteType", "appReviewDeferred", "fetchSiteTypeDeferred", "changed", "it", "$i$a$-let-SiteService$fetchSiteInSplash$2$1", "$this$coroutineScope", "defaultSiteType", "appReviewDeferred", "fetchSiteTypeDeferred", "changed"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4"})
public final class SiteService$fetchSiteInSplash$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    public SiteService$fetchSiteInSplash$2(Continuation<? super SiteService$fetchSiteInSplash$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SiteService$fetchSiteInSplash$2 siteService$fetchSiteInSplash$2 = new SiteService$fetchSiteInSplash$2(continuation);
        siteService$fetchSiteInSplash$2.L$0 = obj;
        return siteService$fetchSiteInSplash$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((SiteService$fetchSiteInSplash$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0171  */
    /* JADX WARN: Code duplicated, block: B:42:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x01c6  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41729r0 interfaceC41729r0;
        InterfaceC41729r0 interfaceC41729r1;
        String str;
        Ref.BooleanRef booleanRef;
        Object objMo91198h;
        InterfaceC41729r0 interfaceC41729r2;
        Ref.BooleanRef booleanRef2;
        String str2;
        InterfaceC41729r0 interfaceC41729r3;
        SiteService siteService;
        String strM58110d;
        SiteService.SwitchFromType switchFromType;
        Ref.BooleanRef booleanRef3;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        boolean z11 = false;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (AppRebirth.f47935a.m58168c()) {
                C44128b.m97266j("SiteService", "state=appRebirth cancel updateSite");
                return Boxing.boxBoolean(false);
            }
            SiteService siteService2 = SiteService.f47793a;
            String strM57993A = siteService2.m57993A();
            InterfaceC41729r0 interfaceC41729r0M91102b = (UserInfo.a.n() || !siteService2.m58004r()) ? null : C41696j.m91102b(interfaceC41709m0, null, null, new SiteService$fetchSiteInSplash$2$appReviewDeferred$1(null), 3, null);
            InterfaceC41729r0 interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, null, null, new SiteService$fetchSiteInSplash$2$fetchSiteTypeDeferred$1(strM57993A, null), 3, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(strM57993A);
            this.L$2 = interfaceC41729r0M91102b;
            this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b2);
            this.label = 1;
            if (interfaceC41729r0M91102b2.mo91198h(this) != coroutine_suspended) {
                interfaceC41729r0 = interfaceC41729r0M91102b;
                interfaceC41729r1 = interfaceC41729r0M91102b2;
                str = strM57993A;
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            interfaceC41729r1 = (InterfaceC41729r0) this.L$3;
            interfaceC41729r0 = (InterfaceC41729r0) this.L$2;
            str = (String) this.L$1;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i11 == 2) {
                booleanRef2 = (Ref.BooleanRef) this.L$4;
                InterfaceC41729r0 interfaceC41729r4 = (InterfaceC41729r0) this.L$3;
                InterfaceC41729r0 interfaceC41729r5 = (InterfaceC41729r0) this.L$2;
                String str3 = (String) this.L$1;
                ResultKt.throwOnFailure(obj);
                str2 = str3;
                interfaceC41729r3 = interfaceC41729r5;
                interfaceC41729r2 = interfaceC41729r4;
                objMo91198h = obj;
                boolean zBooleanValue = ((Boolean) objMo91198h).booleanValue();
                if (booleanRef2.element && zBooleanValue) {
                    z11 = true;
                }
                booleanRef2.element = z11;
                C44128b.m97266j("SiteService", "state=stayInSplashPage needSwitchSite not login, change=" + booleanRef2.element + ", [needSwitchSite=" + SiteService.f47793a.m58008v() + ", isReview=" + zBooleanValue + ']');
                String str4 = str2;
                booleanRef = booleanRef2;
                interfaceC41729r1 = interfaceC41729r2;
                interfaceC41729r0 = interfaceC41729r3;
                str = str4;
                C44128b.m97266j("SiteService", "state=stayInSplashPage changed=" + booleanRef.element);
                if (booleanRef.element) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("state=isInSplashPage startSwitchSite, !ActivityHelper.isInSplashPage() = ");
                    sb2.append(!ActivityHelper.f47910a.m58098e());
                    C44128b.m97270n("SiteService", sb2.toString());
                    InterfaceC41729r0 interfaceC41729r6 = interfaceC41729r1;
                    siteService = SiteService.f47793a;
                    strM58110d = SiteInfoManager.f47913a.m58110d();
                    switchFromType = SiteService.SwitchFromType.SplashTimeout;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(str);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r6);
                    this.L$4 = booleanRef;
                    this.L$5 = null;
                    this.label = 3;
                    if (SiteService.m57981G(siteService, strM58110d, switchFromType, null, null, this, 12, null) != coroutine_suspended) {
                        booleanRef3 = booleanRef;
                    }
                    return coroutine_suspended;
                }
                C44128b.m97266j("SiteService", "state=stayInSplashPage no need switchSite");
                Unit unit = Unit.INSTANCE;
                return Boxing.boxBoolean(booleanRef.element);
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef3 = (Ref.BooleanRef) this.L$4;
            ResultKt.throwOnFailure(obj);
        }
        booleanRef = booleanRef3;
        return Boxing.boxBoolean(booleanRef.element);
        booleanRef = new Ref.BooleanRef();
        booleanRef.element = SiteService.f47793a.m58008v();
        if (interfaceC41729r0 == null) {
            C44128b.m97266j("SiteService", "state=stayInSplashPage changed=" + booleanRef.element);
            if (booleanRef.element) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("state=isInSplashPage startSwitchSite, !ActivityHelper.isInSplashPage() = ");
                sb3.append(!ActivityHelper.f47910a.m58098e());
                C44128b.m97270n("SiteService", sb3.toString());
                InterfaceC41729r0 interfaceC41729r7 = interfaceC41729r1;
                siteService = SiteService.f47793a;
                strM58110d = SiteInfoManager.f47913a.m58110d();
                switchFromType = SiteService.SwitchFromType.SplashTimeout;
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(str);
                this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r7);
                this.L$4 = booleanRef;
                this.L$5 = null;
                this.label = 3;
                if (SiteService.m57981G(siteService, strM58110d, switchFromType, null, null, this, 12, null) != coroutine_suspended) {
                    booleanRef3 = booleanRef;
                    booleanRef = booleanRef3;
                }
            } else {
                C44128b.m97266j("SiteService", "state=stayInSplashPage no need switchSite");
                Unit unit2 = Unit.INSTANCE;
            }
            return Boxing.boxBoolean(booleanRef.element);
        }
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.L$1 = SpillingKt.nullOutSpilledVariable(str);
        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
        this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r1);
        this.L$4 = booleanRef;
        this.L$5 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
        this.I$0 = 0;
        this.label = 2;
        objMo91198h = interfaceC41729r0.mo91198h(this);
        if (objMo91198h != coroutine_suspended) {
            InterfaceC41729r0 interfaceC41729r8 = interfaceC41729r0;
            interfaceC41729r2 = interfaceC41729r1;
            booleanRef2 = booleanRef;
            str2 = str;
            interfaceC41729r3 = interfaceC41729r8;
            boolean zBooleanValue2 = ((Boolean) objMo91198h).booleanValue();
            if (booleanRef2.element) {
                z11 = true;
            }
            booleanRef2.element = z11;
            C44128b.m97266j("SiteService", "state=stayInSplashPage needSwitchSite not login, change=" + booleanRef2.element + ", [needSwitchSite=" + SiteService.f47793a.m58008v() + ", isReview=" + zBooleanValue2 + ']');
            String str5 = str2;
            booleanRef = booleanRef2;
            interfaceC41729r1 = interfaceC41729r2;
            interfaceC41729r0 = interfaceC41729r3;
            str = str5;
            C44128b.m97266j("SiteService", "state=stayInSplashPage changed=" + booleanRef.element);
            if (booleanRef.element) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("state=isInSplashPage startSwitchSite, !ActivityHelper.isInSplashPage() = ");
                sb4.append(!ActivityHelper.f47910a.m58098e());
                C44128b.m97270n("SiteService", sb4.toString());
                InterfaceC41729r0 interfaceC41729r9 = interfaceC41729r1;
                siteService = SiteService.f47793a;
                strM58110d = SiteInfoManager.f47913a.m58110d();
                switchFromType = SiteService.SwitchFromType.SplashTimeout;
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(str);
                this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41729r9);
                this.L$4 = booleanRef;
                this.L$5 = null;
                this.label = 3;
                if (SiteService.m57981G(siteService, strM58110d, switchFromType, null, null, this, 12, null) != coroutine_suspended) {
                    booleanRef3 = booleanRef;
                    booleanRef = booleanRef3;
                }
            } else {
                C44128b.m97266j("SiteService", "state=stayInSplashPage no need switchSite");
                Unit unit3 = Unit.INSTANCE;
            }
            return Boxing.boxBoolean(booleanRef.element);
        }
        return coroutine_suspended;
    }
}
