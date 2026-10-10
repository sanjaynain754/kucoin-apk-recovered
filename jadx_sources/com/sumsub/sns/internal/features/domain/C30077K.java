package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.core.SNSMobileSDK;
import com.sumsub.sns.core.data.model.SNSInitConfig;
import com.sumsub.sns.core.theme.SNSJsonCustomizationSource;
import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.Domain;
import com.sumsub.sns.internal.core.analytics.SdkEvent;
import com.sumsub.sns.internal.core.common.AbstractC28409N0;
import com.sumsub.sns.internal.core.common.C28468k0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p852kotlin.KotlinVersion;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30077K extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f60433a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30078L f60434b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f60435c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30077K(C30078L c30078l, boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f60434b = c30078l;
        this.f60435c = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30077K(this.f60434b, this.f60435c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30077K(this.f60434b, this.f60435c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        Map<String, String> strings;
        Set<String> setKeySet;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60433a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30078L c30078l = this.f60434b;
            this.f60433a = 1;
            obj = C30078L.m70102a(c30078l, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Boolean bool = (Boolean) obj;
        bool.getClass();
        Pair pairM90091to = TuplesKt.m90091to("isDKAEnabled", Boolean.valueOf(this.f60435c));
        Pair pairM90091to2 = TuplesKt.m90091to("isRooted", bool);
        Pair pairM90091to3 = TuplesKt.m90091to("isVideoIdentAvailable", Boolean.valueOf(AbstractC28409N0.m69294a("com.sumsub.sns.videoident.BuildConfig")));
        Pair pairM90091to4 = TuplesKt.m90091to("isEidAvailable", Boolean.valueOf(AbstractC28409N0.m69294a("com.sumsub.sns.eid.BuildConfig")));
        Pair pairM90091to5 = TuplesKt.m90091to("isNFCAvailable", Boolean.valueOf(AbstractC28409N0.m69294a("com.sumsub.sns.nfc.BuildConfig")));
        Pair pairM90091to6 = TuplesKt.m90091to("isDynamicFeatureAvailable", Boolean.valueOf(AbstractC28409N0.m69294a("com.sumsub.sns.dynamicfeature.BuildConfig")));
        Pair pairM90091to7 = TuplesKt.m90091to("isFishermanAvailable", Boolean.valueOf(AbstractC28409N0.m69294a("com.sumsub.sns.fisherman.BuildConfig")));
        SNSMobileSDK sNSMobileSDK = SNSMobileSDK.INSTANCE;
        Map mapMutableMapOf = MapsKt.mutableMapOf(pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, pairM90091to5, pairM90091to6, pairM90091to7, TuplesKt.m90091to("isXmlThemeUsed", Boolean.valueOf(sNSMobileSDK.getXmlThemeUsed$idensic_mobile_sdk_aar_defaultRelease())), TuplesKt.m90091to("kotlinVersion", KotlinVersion.CURRENT.toString()));
        SNSInitConfig conf = C28468k0.f57983a.getConf();
        if (conf != null && (strings = conf.getStrings()) != null && (setKeySet = strings.keySet()) != null) {
            list = CollectionsKt.toList(setKeySet);
        } else {
            list = null;
        }
        if (list != null && (!list.isEmpty())) {
            mapMutableMapOf.put("localStrings", list);
        }
        SNSJsonCustomizationSource customizationSource$idensic_mobile_sdk_aar_defaultRelease = sNSMobileSDK.getCustomizationSource$idensic_mobile_sdk_aar_defaultRelease();
        if (customizationSource$idensic_mobile_sdk_aar_defaultRelease != null) {
            mapMutableMapOf.put("sdkCustomizationSource", customizationSource$idensic_mobile_sdk_aar_defaultRelease.getType());
        }
        C28368g c28368g = new C28368g();
        SdkEvent sdkEvent = SdkEvent.Init;
        c28368g.f57846b.add(Domain.Sdk);
        c28368g.f57846b.add(sdkEvent);
        c28368g.f57847c = MapsKt.toMap(mapMutableMapOf);
        c28368g.m69267a(false);
        return Unit.INSTANCE;
    }
}
