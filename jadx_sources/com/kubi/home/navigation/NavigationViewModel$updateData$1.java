package com.kubi.home.navigation;

import com.kubi.home.entity.NavigationAvatarEntity;
import com.kubi.home.service.HomeDepend;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: NavigationViewModel.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.navigation.NavigationViewModel$updateData$1", m90122f = "NavigationViewModel.kt", m90123i = {}, m90124l = {29}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class NavigationViewModel$updateData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ NavigationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationViewModel$updateData$1(NavigationViewModel navigationViewModel, Continuation<? super NavigationViewModel$updateData$1> continuation) {
        super(2, continuation);
        this.this$0 = navigationViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NavigationViewModel$updateData$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((NavigationViewModel$updateData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41634e<HashMap<String, List<NavigationAvatarEntity>>> interfaceC41634eM29702c;
        NavigationViewModel$updateData$1 navigationViewModel$updateData$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                navigationViewModel$updateData$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.this$0.m29681p();
            if (HomeDepend.f26198a.m30225d().c()) {
                interfaceC41634eM29702c = this.this$0.f25888V.m29701b();
            } else {
                interfaceC41634eM29702c = this.this$0.f25888V.m29702c();
            }
            InterfaceC41634e<HashMap<String, List<NavigationAvatarEntity>>> interfaceC41634e = interfaceC41634eM29702c;
            this.label = 1;
            navigationViewModel$updateData$1 = this;
            obj = RetrofitFlowExKt.m42826g(interfaceC41634e, false, null, navigationViewModel$updateData$1, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        HashMap map = (HashMap) ((C19334f) obj).m42846a();
        if (map != null) {
            NavigationViewModel navigationViewModel = navigationViewModel$updateData$1.this$0;
            List listEmptyList = (List) map.get("app-per-center");
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            navigationViewModel.m29679n().postValue((NavigationAvatarEntity) CollectionsKt.firstOrNull(listEmptyList));
        }
        return Unit.INSTANCE;
    }
}
