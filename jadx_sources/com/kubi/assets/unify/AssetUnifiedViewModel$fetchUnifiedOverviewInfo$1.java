package com.kubi.assets.unify;

import com.kubi.assets.entity.UnifiedAccountOverview;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: AssetUnifiedViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1", m90122f = "AssetUnifiedViewModel.kt", m90123i = {0, 0}, m90124l = {166}, m90125m = "invokeSuspend", m90126n = {"it", "$i$a$-let-AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1"}, m90127s = {"L$0", "I$0"})
@SourceDebugExtension({"SMAP\nAssetUnifiedViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetUnifiedViewModel.kt\ncom/kubi/assets/unify/AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n25#2:272\n26#2:274\n1#3:273\n*S KotlinDebug\n*F\n+ 1 AssetUnifiedViewModel.kt\ncom/kubi/assets/unify/AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1\n*L\n167#1:272\n167#1:274\n167#1:273\n*E\n"})
public final class AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $baseCurrency;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ AssetUnifiedViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1(String str, AssetUnifiedViewModel assetUnifiedViewModel, Continuation<? super AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1> continuation) {
        super(2, continuation);
        this.$baseCurrency = str;
        this.this$0 = assetUnifiedViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1(this.$baseCurrency, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
            String str = this.$baseCurrency;
            if (str != null) {
                AssetUnifiedViewModel assetUnifiedViewModel = this.this$0;
                InterfaceC41634e<UnifiedAccountOverview> interfaceC41634eM17082F1 = assetUnifiedViewModel.m19697G().m17082F1(str);
                AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1$1 assetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1$1 = new AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1$1(assetUnifiedViewModel, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(str);
                this.I$0 = 0;
                this.label = 1;
                obj = RetrofitFlowExKt.m42824e(interfaceC41634eM17082F1, false, assetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1$1, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }
}
