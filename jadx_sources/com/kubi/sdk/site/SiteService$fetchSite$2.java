package com.kubi.sdk.site;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlinx.coroutines.InterfaceC41709m0;
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

/* JADX INFO: compiled from: SiteService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.SiteService$fetchSite$2", m90122f = "SiteService.kt", m90123i = {1}, m90124l = {412, 418, TypedValues.CycleType.TYPE_WAVE_PERIOD}, m90125m = "invokeSuspend", m90126n = {"defaultSiteType"}, m90127s = {"L$0"})
public final class SiteService$fetchSite$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ SiteService.SwitchFromType $fromType;
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.sdk.site.SiteService$fetchSite$2$a */
    /* JADX INFO: compiled from: SiteService.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C24119a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SiteService.SwitchFromType.values().length];
            try {
                iArr[SiteService.SwitchFromType.Splash.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SiteService.SwitchFromType.Login.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteService$fetchSite$2(SiteService.SwitchFromType switchFromType, Continuation<? super SiteService$fetchSite$2> continuation) {
        super(2, continuation);
        this.$fromType = switchFromType;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SiteService$fetchSite$2(this.$fromType, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((SiteService$fetchSite$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r6.m57998l(r1, r3, r5) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r6.m57998l(r1, r2, r5) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (r6 == r0) goto L25;
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
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                        zBooleanValue = SiteService.f47793a.m58008v();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    zBooleanValue = SiteService.f47793a.m58008v();
                }
            } else {
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
        } else {
            ResultKt.throwOnFailure(obj);
            int i12 = C24119a.$EnumSwitchMapping$0[this.$fromType.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    SiteService siteService = SiteService.f47793a;
                    String currentSiteType = SiteType.INSTANCE.getCurrentSiteType();
                    SiteService.SwitchFromType switchFromType = this.$fromType;
                    this.label = 3;
                } else {
                    SiteService siteService2 = SiteService.f47793a;
                    String strM57993A = siteService2.m57993A();
                    SiteService.SwitchFromType switchFromType2 = this.$fromType;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(strM57993A);
                    this.label = 2;
                }
            } else {
                SiteService siteService3 = SiteService.f47793a;
                this.label = 1;
                obj = siteService3.m58003q(this);
            }
            return coroutine_suspended;
        }
        return Boxing.boxBoolean(zBooleanValue);
    }
}
