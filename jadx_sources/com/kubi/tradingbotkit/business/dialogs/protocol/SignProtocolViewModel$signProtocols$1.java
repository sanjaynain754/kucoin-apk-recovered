package com.kubi.tradingbotkit.business.dialogs.protocol;

import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.tradingbotkit.business.dialogs.protocol.model.SignProtocolRequestBody;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SignProtocolViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.dialogs.protocol.SignProtocolViewModel$signProtocols$1", m90122f = "SignProtocolViewModel.kt", m90123i = {}, m90124l = {36}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SignProtocolViewModel$signProtocols$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $strategyTemplateId;
    int label;
    final /* synthetic */ SignProtocolViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.dialogs.protocol.SignProtocolViewModel$signProtocols$1$1 */
    /* JADX INFO: compiled from: SignProtocolViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.dialogs.protocol.SignProtocolViewModel$signProtocols$1$1", m90122f = "SignProtocolViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C261321 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SignProtocolViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C261321(SignProtocolViewModel signProtocolViewModel, Continuation<? super C261321> continuation) {
            super(2, continuation);
            this.this$0 = signProtocolViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C261321(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C261321) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.f52341a0.postValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignProtocolViewModel$signProtocols$1(SignProtocolViewModel signProtocolViewModel, String str, Continuation<? super SignProtocolViewModel$signProtocols$1> continuation) {
        super(2, continuation);
        this.this$0 = signProtocolViewModel;
        this.$strategyTemplateId = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignProtocolViewModel$signProtocols$1(this.this$0, this.$strategyTemplateId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SignProtocolViewModel$signProtocols$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        SignProtocolViewModel$signProtocols$1 signProtocolViewModel$signProtocols$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                signProtocolViewModel$signProtocols$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.this$0.f52339Y.postValue(Boxing.boxBoolean(true));
            ISignProtocolApi iSignProtocolApiM63950t = this.this$0.m63950t();
            Long longOrNull = StringsKt.toLongOrNull(this.$strategyTemplateId);
            if (longOrNull != null) {
                jLongValue = longOrNull.longValue();
            } else {
                jLongValue = 1;
            }
            InterfaceC41634e<Object> interfaceC41634eM63977a = iSignProtocolApiM63950t.m63977a(new SignProtocolRequestBody(Boxing.boxLong(jLongValue)));
            C261321 c261321 = new C261321(this.this$0, null);
            this.label = 1;
            signProtocolViewModel$signProtocols$1 = this;
            if (RetrofitFlowExKt.m42824e(interfaceC41634eM63977a, false, c261321, signProtocolViewModel$signProtocols$1, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        signProtocolViewModel$signProtocols$1.this$0.f52339Y.postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
