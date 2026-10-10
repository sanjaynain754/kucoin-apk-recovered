package com.kubi.homern.page;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeRnFragment.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.homern.page.HomeRnFragment$checkVipLevelUpDialog$1", m90122f = "HomeRnFragment.kt", m90123i = {}, m90124l = {166}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class HomeRnFragment$checkVipLevelUpDialog$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeRnFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRnFragment$checkVipLevelUpDialog$1(HomeRnFragment homeRnFragment, Continuation<? super HomeRnFragment$checkVipLevelUpDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = homeRnFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeRnFragment$checkVipLevelUpDialog$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HomeRnFragment$checkVipLevelUpDialog$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            HomeRNViewModel homeRNViewModelM31286H3 = this.this$0.m31286H3();
            this.label = 1;
            obj = homeRNViewModelM31286H3.m31254o(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        HomeRNViewModel.InterfaceC15155a interfaceC15155a = (HomeRNViewModel.InterfaceC15155a) obj;
        if (!Intrinsics.areEqual(interfaceC15155a, HomeRNViewModel.InterfaceC15155a.b.f26962a)) {
            if (Intrinsics.areEqual(interfaceC15155a, HomeRNViewModel.InterfaceC15155a.a.f26961a)) {
                HomeRnFragment homeRnFragment = this.this$0;
                homeRnFragment.m31284F3(homeRnFragment.getActivity());
            } else if (interfaceC15155a instanceof HomeRNViewModel.InterfaceC15155a.Show) {
                this.this$0.m31288L3((HomeRNViewModel.InterfaceC15155a.Show) interfaceC15155a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
