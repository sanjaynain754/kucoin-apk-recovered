package com.kubi.home.main;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.home.common.card.HomeCardsRepository;
import com.kubi.home.main.shimmer.HomeShimmerLayout;
import com.kubi.home.navigation.NavigationCard;
import com.kubi.home.navigation.NavigationState;
import com.kubi.kucoin.home.cards.BaseCardData;
import fj.C37516e0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.main.HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$1", m90122f = "HomeFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 HomeFragment.kt\ncom/kubi/home/main/HomeFragment\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n180#2,3:188\n184#2:192\n1#3:191\n*E\n"})
public final class HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$1 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$1(String str, Continuation continuation, HomeFragment homeFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = homeFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$1 homeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$1 = new HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$1(this.$key, continuation, this.this$0);
        homeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$1.L$0 = obj;
        return homeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$1) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C37516e0 c37516e0M29303C3;
        HomeShimmerLayout homeShimmerLayout;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof Boolean) && ((Boolean) c43460a.getData()).booleanValue()) {
                    NavigationCard navigationCardM29307G3 = this.this$0.m29307G3();
                    if (navigationCardM29307G3 != null) {
                        navigationCardM29307G3.m29661Q3(NavigationState.ShowShimmer);
                    }
                    List<BaseCardData> listM29075l = HomeCardsRepository.f25606a.m29075l();
                    if (listM29075l != null && (c37516e0M29303C3 = this.this$0.m29303C3()) != null && (homeShimmerLayout = c37516e0M29303C3.f83244f) != null) {
                        homeShimmerLayout.m29471I(listM29075l);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
