package com.kubi.payment.third.quote;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.kubi.payment.common.data.entities.UpgradeOptionRequest;
import com.kubi.payment.common.helper.UpgradeOptionHelper;
import com.kubi.payment.third.data.entities.PayChannelSelect;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ThirdQuoteViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.third.quote.ThirdQuoteViewModel$checkAppVersionIsSupport$1", m90122f = "ThirdQuoteViewModel.kt", m90123i = {}, m90124l = {332}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ThirdQuoteViewModel$checkAppVersionIsSupport$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentManager $manage;
    Object L$0;
    int label;
    final /* synthetic */ ThirdQuoteViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdQuoteViewModel$checkAppVersionIsSupport$1(ThirdQuoteViewModel thirdQuoteViewModel, FragmentManager fragmentManager, Continuation<? super ThirdQuoteViewModel$checkAppVersionIsSupport$1> continuation) {
        super(2, continuation);
        this.this$0 = thirdQuoteViewModel;
        this.$manage = fragmentManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ThirdQuoteViewModel$checkAppVersionIsSupport$1(this.this$0, this.$manage, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ThirdQuoteViewModel$checkAppVersionIsSupport$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String channel;
        MutableLiveData mutableLiveData;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                mutableLiveData = (MutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            MutableLiveData mutableLiveData2 = this.this$0.f40300s0;
            UpgradeOptionHelper upgradeOptionHelper = UpgradeOptionHelper.f38522a;
            String f40280y = this.this$0.getF40280Y();
            String f40281z = this.this$0.getF40281Z();
            PayChannelSelect f40285d0 = this.this$0.getF40285d0();
            if (f40285d0 != null) {
                channel = f40285d0.getChannel();
            } else {
                channel = null;
            }
            UpgradeOptionRequest upgradeOptionRequest = new UpgradeOptionRequest("THIRD_PARTY", f40280y, f40281z, null, C27041f.m66668h(channel), 8, null);
            FragmentManager fragmentManager = this.$manage;
            this.L$0 = mutableLiveData2;
            this.label = 1;
            Object objM46258b = upgradeOptionHelper.m46258b(upgradeOptionRequest, fragmentManager, this);
            if (objM46258b == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableLiveData = mutableLiveData2;
            obj = objM46258b;
        }
        mutableLiveData.setValue(obj);
        this.this$0.m94034o().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
