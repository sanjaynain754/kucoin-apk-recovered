package com.kubi.kucoin.data;

import com.kubi.kucoin.data.platform.IPlatformService;
import com.kubi.kucoin.data.platform.model.CountryEntity;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p694vk.C45583m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MobileCodeUtils.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.data.MobileCodeUtils$findCountryByMobileCode$2", m90122f = "MobileCodeUtils.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nMobileCodeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobileCodeUtils.kt\ncom/kubi/kucoin/data/MobileCodeUtils$findCountryByMobileCode$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n774#2:103\n865#2,2:104\n*S KotlinDebug\n*F\n+ 1 MobileCodeUtils.kt\ncom/kubi/kucoin/data/MobileCodeUtils$findCountryByMobileCode$2\n*L\n95#1:103\n95#1:104,2\n*E\n"})
public final class MobileCodeUtils$findCountryByMobileCode$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<CountryEntity, Unit> $callback;
    final /* synthetic */ String $mobileCode;
    final /* synthetic */ String $sceneCode;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MobileCodeUtils$findCountryByMobileCode$2(String str, String str2, Function1<? super CountryEntity, Unit> function1, Continuation<? super MobileCodeUtils$findCountryByMobileCode$2> continuation) {
        super(2, continuation);
        this.$sceneCode = str;
        this.$mobileCode = str2;
        this.$callback = function1;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m31963f(String str, Function1 function1, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((CountryEntity) obj).getMobileCode(), str)) {
                arrayList.add(obj);
            }
        }
        C41696j.m91104d(C45583m0.m100622e(null, null, 3, null), null, null, new MobileCodeUtils$findCountryByMobileCode$2$1$1(function1, arrayList.size() == 1 ? (CountryEntity) arrayList.get(0) : null, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MobileCodeUtils$findCountryByMobileCode$2(this.$sceneCode, this.$mobileCode, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MobileCodeUtils$findCountryByMobileCode$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IPlatformService iPlatformServiceM31961i = MobileCodeUtils.f27721a.m31961i();
            String str = this.$sceneCode;
            final String str2 = this.$mobileCode;
            final Function1<CountryEntity, Unit> function1 = this.$callback;
            iPlatformServiceM31961i.mo32036h(str, new Function1() { // from class: com.kubi.kucoin.data.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MobileCodeUtils$findCountryByMobileCode$2.m31963f(str2, function1, (List) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
