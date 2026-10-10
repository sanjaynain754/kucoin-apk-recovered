package com.kubi.home.navigation;

import com.kubi.clean.api.service.IAutoCleanService;
import com.kubi.home.service.HomeDepend;
import com.kubi.mine.api.entity.KycStatusEntity;
import com.kubi.mine.api.service.IMineService;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NavigationViewModel.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.navigation.NavigationViewModel$queryKycStatus$1", m90122f = "NavigationViewModel.kt", m90123i = {}, m90124l = {43}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class NavigationViewModel$queryKycStatus$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ NavigationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationViewModel$queryKycStatus$1(NavigationViewModel navigationViewModel, Continuation<? super NavigationViewModel$queryKycStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = navigationViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NavigationViewModel$queryKycStatus$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((NavigationViewModel$queryKycStatus$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        String displayType = null;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            HomeDepend homeDepend = HomeDepend.f26198a;
            if (!homeDepend.m30225d().c()) {
                this.this$0.m29680o().postValue(null);
                return Unit.INSTANCE;
            }
            IMineService iMineServiceM30223b = homeDepend.m30223b();
            this.label = 1;
            obj = iMineServiceM30223b.mo41624g(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        KycStatusEntity kycStatusEntity = (KycStatusEntity) obj;
        if (kycStatusEntity != null) {
            NavigationViewModel navigationViewModel = this.this$0;
            KycStatusEntity value = navigationViewModel.m29680o().getValue();
            if (value != null) {
                displayType = value.getDisplayType();
            }
            if (displayType != null && !Intrinsics.areEqual(displayType, kycStatusEntity.getDisplayType())) {
                IAutoCleanService.f19482a.get().mo20401a();
            }
            navigationViewModel.m29680o().postValue(kycStatusEntity);
        }
        return Unit.INSTANCE;
    }
}
