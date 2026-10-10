package com.kubi.sdk.site;

import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.DelayKt;
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
import ro.C44128b;

/* JADX INFO: compiled from: SiteService.kt */
/* JADX INFO: loaded from: classes42.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.SiteService$fetchAndSwitchSiteInLogout$2", m90122f = "SiteService.kt", m90123i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, m90124l = {458, 459, 468, 469}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", "appReviewDeferred", "$this$withContext", "appReviewDeferred", "changed", "$this$withContext", "appReviewDeferred", "isReview", "changed", "shouldSwitch", "$this$withContext", "appReviewDeferred", "isReview", "changed", "shouldSwitch"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "Z$0", "I$0", "L$0", "L$1", "L$2", "Z$0", "I$0"})
public final class SiteService$fetchAndSwitchSiteInLogout$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;

    public SiteService$fetchAndSwitchSiteInLogout$2(Continuation<? super SiteService$fetchAndSwitchSiteInLogout$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SiteService$fetchAndSwitchSiteInLogout$2 siteService$fetchAndSwitchSiteInLogout$2 = new SiteService$fetchAndSwitchSiteInLogout$2(continuation);
        siteService$fetchAndSwitchSiteInLogout$2.L$0 = obj;
        return siteService$fetchAndSwitchSiteInLogout$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((SiteService$fetchAndSwitchSiteInLogout$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:40:0x0105  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        if (r3 == r12) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0132, code lost:
    
        if (r0 == r12) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.StringBuilder] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41729r0 interfaceC41729r0M91102b;
        Object objM58002p;
        boolean zBooleanValue;
        Object objMo91198h;
        boolean zBooleanValue2;
        boolean z11;
        Boolean bool;
        InterfaceC41729r0 interfaceC41729r0;
        ?? r11;
        Object objM57981G;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        Boolean bool2 = null;
        ?? r13 = 1;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            SiteService siteService = SiteService.f47793a;
            interfaceC41729r0M91102b = siteService.m58004r() ? C41696j.m91102b(interfaceC41709m0, null, null, new SiteService$fetchAndSwitchSiteInLogout$2$appReviewDeferred$1(null), 3, null) : null;
            SiteService.SwitchFromType switchFromType = SiteService.SwitchFromType.Logout;
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = interfaceC41729r0M91102b;
            this.label = 1;
            objM58002p = siteService.m58002p(switchFromType, this);
            if (objM58002p != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            InterfaceC41729r0 interfaceC41729r1 = (InterfaceC41729r0) this.L$1;
            ResultKt.throwOnFailure(obj);
            interfaceC41729r0M91102b = interfaceC41729r1;
            objM58002p = obj;
        } else {
            if (i11 == 2) {
                zBooleanValue = this.Z$0;
                InterfaceC41729r0 interfaceC41729r2 = (InterfaceC41729r0) this.L$1;
                ResultKt.throwOnFailure(obj);
                interfaceC41729r0M91102b = interfaceC41729r2;
                objMo91198h = obj;
                bool2 = (Boolean) objMo91198h;
                zBooleanValue2 = false;
                if (bool2 != null) {
                    r13 = zBooleanValue;
                } else if (zBooleanValue || !bool2.booleanValue()) {
                    r13 = 0;
                }
                C44128b.m97266j("SiteService", "fetchAndSwitchSiteInLogout shouldSwitch=" + r13 + ", [changed=" + zBooleanValue + ", isReview=" + bool2 + ']');
                if (r13 != 0) {
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(bool2);
                    this.Z$0 = zBooleanValue;
                    this.I$0 = r13;
                    this.label = 3;
                    if (DelayKt.m90350b(1000L, this) != coroutine_suspended) {
                        z11 = zBooleanValue;
                        bool = bool2;
                        interfaceC41729r0 = interfaceC41729r0M91102b;
                        r11 = r13;
                        SiteService siteService2 = SiteService.f47793a;
                        SiteService.SwitchFromType switchFromType2 = SiteService.SwitchFromType.Logout;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(bool);
                        this.Z$0 = z11;
                        this.I$0 = r11;
                        this.label = 4;
                        objM57981G = SiteService.m57981G(siteService2, null, switchFromType2, null, null, this, 13, null);
                    }
                    return coroutine_suspended;
                }
                return Boxing.boxBoolean(zBooleanValue2);
            }
            if (i11 == 3) {
                int i12 = this.I$0;
                z11 = this.Z$0;
                bool = (Boolean) this.L$2;
                interfaceC41729r0 = (InterfaceC41729r0) this.L$1;
                ResultKt.throwOnFailure(obj);
                r11 = i12;
                SiteService siteService3 = SiteService.f47793a;
                SiteService.SwitchFromType switchFromType3 = SiteService.SwitchFromType.Logout;
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                this.L$2 = SpillingKt.nullOutSpilledVariable(bool);
                this.Z$0 = z11;
                this.I$0 = r11;
                this.label = 4;
                objM57981G = SiteService.m57981G(siteService3, null, switchFromType3, null, null, this, 13, null);
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM57981G = obj;
            }
        }
        zBooleanValue2 = ((Boolean) objM57981G).booleanValue();
        return Boxing.boxBoolean(zBooleanValue2);
        zBooleanValue = ((Boolean) objM58002p).booleanValue();
        if (interfaceC41729r0M91102b == null) {
            zBooleanValue2 = false;
            if (bool2 != null) {
                r13 = zBooleanValue;
            } else if (zBooleanValue) {
                r13 = 0;
            } else {
                r13 = 0;
            }
            C44128b.m97266j("SiteService", "fetchAndSwitchSiteInLogout shouldSwitch=" + r13 + ", [changed=" + zBooleanValue + ", isReview=" + bool2 + ']');
            if (r13 != 0) {
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
                this.L$2 = SpillingKt.nullOutSpilledVariable(bool2);
                this.Z$0 = zBooleanValue;
                this.I$0 = r13;
                this.label = 3;
                if (DelayKt.m90350b(1000L, this) != coroutine_suspended) {
                    z11 = zBooleanValue;
                    bool = bool2;
                    interfaceC41729r0 = interfaceC41729r0M91102b;
                    r11 = r13;
                    SiteService siteService4 = SiteService.f47793a;
                    SiteService.SwitchFromType switchFromType4 = SiteService.SwitchFromType.Logout;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(bool);
                    this.Z$0 = z11;
                    this.I$0 = r11;
                    this.label = 4;
                    objM57981G = SiteService.m57981G(siteService4, null, switchFromType4, null, null, this, 13, null);
                }
            }
            return Boxing.boxBoolean(zBooleanValue2);
        }
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
        this.Z$0 = zBooleanValue;
        this.label = 2;
        objMo91198h = interfaceC41729r0M91102b.mo91198h(this);
        return coroutine_suspended;
    }
}
