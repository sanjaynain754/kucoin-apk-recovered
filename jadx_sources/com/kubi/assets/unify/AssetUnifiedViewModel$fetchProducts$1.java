package com.kubi.assets.unify;

import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.ArrayList;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AssetUnifiedViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedViewModel$fetchProducts$1", m90122f = "AssetUnifiedViewModel.kt", m90123i = {}, m90124l = {241}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetUnifiedViewModel$fetchProducts$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AssetUnifiedViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.assets.unify.AssetUnifiedViewModel$fetchProducts$1$1 */
    /* JADX INFO: compiled from: AssetUnifiedViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/EarnAccountItem;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedViewModel$fetchProducts$1$1", m90122f = "AssetUnifiedViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C111321 extends SuspendLambda implements Function2<ArrayList<EarnAccountItem>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AssetUnifiedViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111321(AssetUnifiedViewModel assetUnifiedViewModel, Continuation<? super C111321> continuation) {
            super(2, continuation);
            this.this$0 = assetUnifiedViewModel;
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m19706f(ArrayList arrayList, UIState uIState) {
            return UIState.copy$default(uIState, null, null, false, false, false, null, arrayList, null, null, null, null, 1983, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C111321 c111321 = new C111321(this.this$0, continuation);
            c111321.L$0 = obj;
            return c111321;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<EarnAccountItem> arrayList, Continuation<? super Unit> continuation) {
            return ((C111321) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final ArrayList arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.updateState(new Function1() { // from class: com.kubi.assets.unify.i0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetUnifiedViewModel$fetchProducts$1.C111321.m19706f(arrayList, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetUnifiedViewModel$fetchProducts$1(AssetUnifiedViewModel assetUnifiedViewModel, Continuation<? super AssetUnifiedViewModel$fetchProducts$1> continuation) {
        super(2, continuation);
        this.this$0 = assetUnifiedViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetUnifiedViewModel$fetchProducts$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetUnifiedViewModel$fetchProducts$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<ArrayList<EarnAccountItem>> interfaceC41634eM17099R = this.this$0.m19697G().m17099R(MapsKt.hashMapOf(TuplesKt.m90091to("upActive", Boxing.boxBoolean(true))));
            C111321 c111321 = new C111321(this.this$0, null);
            this.label = 1;
            if (RetrofitFlowExKt.m42824e(interfaceC41634eM17099R, false, c111321, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
