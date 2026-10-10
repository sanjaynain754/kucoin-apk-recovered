package com.kubi.payment.third.quote;

import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.payment.third.data.entities.PayMethodSelect;
import com.kubi.payment.third.data.entities.ThirdQuoteInfo;
import com.kubi.payment.third.data.entities.ThirdQuoteRequest;
import com.kubi.payment.third.data.source.IThirdRepository;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import org.tensorflow.lite.schema.BuiltinOperator;
import p477nt.AbstractC42878k;
import p569qq.C43841b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ThirdQuoteViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.third.quote.ThirdQuoteViewModel$loadQuoteThirdInfo$2", m90122f = "ThirdQuoteViewModel.kt", m90123i = {}, m90124l = {BuiltinOperator.RIGHT_SHIFT}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ThirdQuoteViewModel$loadQuoteThirdInfo$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ThirdQuoteViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdQuoteViewModel$loadQuoteThirdInfo$2(ThirdQuoteViewModel thirdQuoteViewModel, Continuation<? super ThirdQuoteViewModel$loadQuoteThirdInfo$2> continuation) {
        super(2, continuation);
        this.this$0 = thirdQuoteViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ThirdQuoteViewModel$loadQuoteThirdInfo$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ThirdQuoteViewModel$loadQuoteThirdInfo$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            IThirdRepository iThirdRepository = this.this$0.f40279X;
            ThirdQuoteRequest thirdQuoteRequest = new ThirdQuoteRequest(C27041f.m66668h(this.this$0.getF40280Y()), C27041f.m66668h(this.this$0.getF40281Z()), this.this$0.getF40283b0(), this.this$0.getF40282a0());
            this.label = 1;
            obj = iThirdRepository.mo49543d(thirdQuoteRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        String id2 = null;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.f40294m0.setValue(Boxing.boxBoolean(false));
            this.this$0.f40295n0.setValue(Boxing.boxBoolean(false));
            ThirdQuoteInfo thirdQuoteInfo = (ThirdQuoteInfo) ((AbstractC42878k.Success) abstractC42878k).m94040a();
            this.this$0.m49789p0(thirdQuoteInfo);
            if (this.this$0.f40302u0) {
                this.this$0.f40302u0 = false;
                C43841b.m96557d("B7third_buy", "data_load_finish", null, 4, null);
                C43841b.m96557d("B7third_buy", "page_load_end", null, 4, null);
            }
            List<PayMethodSelect> methodList = thirdQuoteInfo.getMethodList();
            if (methodList != null && !methodList.isEmpty()) {
                if (this.this$0.getF40282a0().length() == 0) {
                    ThirdQuoteViewModel thirdQuoteViewModel = this.this$0;
                    PayMethodSelect payMethodSelect = (PayMethodSelect) CollectionsKt.firstOrNull((List) methodList);
                    if (payMethodSelect != null) {
                        id2 = payMethodSelect.getId();
                    }
                    thirdQuoteViewModel.m49788o0(C27041f.m66668h(id2));
                }
                if (this.this$0.getF40283b0().length() == 0) {
                    this.this$0.f40286e0 = thirdQuoteInfo;
                }
                this.this$0.m49758I();
                this.this$0.f40296o0.setValue(Boxing.boxBoolean(false));
                this.this$0.f40293l0.setValue(Boxing.boxBoolean(true));
            } else {
                this.this$0.m49788o0("");
                this.this$0.f40296o0.setValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            AbstractC42878k.Error error = (AbstractC42878k.Error) abstractC42878k;
            this.this$0.m94035p().setValue(error.getException());
            if (error.getException() instanceof ApiException) {
                this.this$0.m49792y0((ApiException) error.getException());
            }
            if (this.this$0.f40302u0) {
                this.this$0.f40302u0 = false;
                C43841b.m96555b("B7third_buy", null, 2, null);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.m94034o().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
