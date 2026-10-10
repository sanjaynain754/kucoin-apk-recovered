package com.kubi.assets.overview.ongoing;

import com.kubi.assets.overview.ongoing.mapper.ProductItem;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.kumex.entity.PositionWrapperEntity;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.json.JSONException;
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

/* JADX INFO: compiled from: AssetOnGoingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$contractSubscription$1$1", m90122f = "AssetOnGoingViewModel.kt", m90123i = {}, m90124l = {116}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetOnGoingViewModel$contractSubscription$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AssetOnGoingViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$contractSubscription$1$1$a */
    /* JADX INFO: compiled from: AssetOnGoingViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10751a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AssetOnGoingViewModel f18417b;

        public C10751a(AssetOnGoingViewModel assetOnGoingViewModel) {
            this.f18417b = assetOnGoingViewModel;
        }

        /* JADX INFO: renamed from: g */
        public static final UIState m18743g(UIState updateState) {
            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
            return UIState.copy$default(updateState, null, Boolean.TRUE, false, 5, null);
        }

        /* JADX INFO: renamed from: h */
        public static final UIState m18744h(UIState updateState) {
            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
            return UIState.copy$default(updateState, null, Boolean.FALSE, false, 5, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<PositionWrapperEntity> list, Continuation<? super Unit> continuation) throws JSONException {
            this.f18417b.f18416b0 = list;
            List<ProductItem> data = ((UIState) this.f18417b.getState()).getData();
            if (data == null || data.isEmpty()) {
                if (list.isEmpty()) {
                    this.f18417b.updateState(new Function1() { // from class: com.kubi.assets.overview.ongoing.y
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AssetOnGoingViewModel$contractSubscription$1$1.C10751a.m18744h((UIState) obj);
                        }
                    });
                } else {
                    this.f18417b.updateState(new Function1() { // from class: com.kubi.assets.overview.ongoing.x
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AssetOnGoingViewModel$contractSubscription$1$1.C10751a.m18743g((UIState) obj);
                        }
                    });
                }
            }
            AssetOnGoingViewModel assetOnGoingViewModel = this.f18417b;
            assetOnGoingViewModel.m18738S(assetOnGoingViewModel.f18415a0, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetOnGoingViewModel$contractSubscription$1$1(AssetOnGoingViewModel assetOnGoingViewModel, Continuation<? super AssetOnGoingViewModel$contractSubscription$1$1> continuation) {
        super(2, continuation);
        this.this$0 = assetOnGoingViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetOnGoingViewModel$contractSubscription$1$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetOnGoingViewModel$contractSubscription$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM90915g = C41636g.m90915g(AssetsDepend.m19180c().mo33290t().mo35844a());
            C10751a c10751a = new C10751a(this.this$0);
            this.label = 1;
            if (interfaceC41634eM90915g.collect(c10751a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
