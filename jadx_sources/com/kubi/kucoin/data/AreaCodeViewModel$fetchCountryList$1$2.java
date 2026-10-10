package com.kubi.kucoin.data;

import com.kubi.kucoin.data.platform.model.CountryEntity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AreaCodeViewModel.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.data.AreaCodeViewModel$fetchCountryList$1$2", m90122f = "AreaCodeViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAreaCodeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaCodeViewModel.kt\ncom/kubi/kucoin/data/AreaCodeViewModel$fetchCountryList$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1056#2:153\n295#2,2:154\n*S KotlinDebug\n*F\n+ 1 AreaCodeViewModel.kt\ncom/kubi/kucoin/data/AreaCodeViewModel$fetchCountryList$1$2\n*L\n44#1:153\n52#1:154,2\n*E\n"})
public final class AreaCodeViewModel$fetchCountryList$1$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $codeAndMobileCodeStr;
    final /* synthetic */ List<CountryEntity> $countryList;
    final /* synthetic */ String $fromWhereType;
    int label;
    final /* synthetic */ AreaCodeViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.kucoin.data.AreaCodeViewModel$fetchCountryList$1$2$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AreaCodeViewModel.kt\ncom/kubi/kucoin/data/AreaCodeViewModel$fetchCountryList$1$2\n*L\n1#1,328:1\n44#2:329\n*E\n"})
    public static final class C15281a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((CountryEntity) t11).getEn(), ((CountryEntity) t12).getEn());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AreaCodeViewModel$fetchCountryList$1$2(List<CountryEntity> list, AreaCodeViewModel areaCodeViewModel, String str, String str2, Continuation<? super AreaCodeViewModel$fetchCountryList$1$2> continuation) {
        super(2, continuation);
        this.$countryList = list;
        this.this$0 = areaCodeViewModel;
        this.$fromWhereType = str;
        this.$codeAndMobileCodeStr = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AreaCodeViewModel$fetchCountryList$1$2(this.$countryList, this.this$0, this.$fromWhereType, this.$codeAndMobileCodeStr, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AreaCodeViewModel$fetchCountryList$1$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        CountryEntity f27719y;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List listSortedWith = CollectionsKt.sortedWith(this.$countryList, new C15281a());
            boolean zM31942A = this.this$0.m31942A(this.$fromWhereType, this.$codeAndMobileCodeStr, CollectionsKt.toMutableList((Collection) this.$countryList));
            boolean zM31947t = this.this$0.m31947t(this.$fromWhereType);
            String country = MultiLanguageManager.f46811g.getLocale().getCountry();
            if (zM31947t && zM31942A) {
                f27719y = this.this$0.getF27719Y();
            } else {
                Iterator it = listSortedWith.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        CountryEntity countryEntity = (CountryEntity) next;
                        if (Intrinsics.areEqual(countryEntity.getCode(), country) && !countryEntity.isDismissed()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                f27719y = (CountryEntity) next;
            }
            this.this$0.f27716V.postValue(listSortedWith);
            this.this$0.m31943B().postValue(this.this$0.m31945D(f27719y, CollectionsKt.toMutableList((Collection) listSortedWith)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
