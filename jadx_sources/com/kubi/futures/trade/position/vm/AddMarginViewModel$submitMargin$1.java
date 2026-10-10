package com.kubi.futures.trade.position.vm;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.utils.Log;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33820nf;
import java.math.BigDecimal;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ug.InterfaceC45233b;

/* JADX INFO: compiled from: AddMarginViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.AddMarginViewModel$submitMargin$1", m90122f = "AddMarginViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AddMarginViewModel$submitMargin$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BigDecimal $inputValue;
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ String $positionSide;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ AddMarginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMarginViewModel$submitMargin$1(boolean z11, String str, BigDecimal bigDecimal, String str2, AddMarginViewModel addMarginViewModel, Continuation<? super AddMarginViewModel$submitMargin$1> continuation) {
        super(2, continuation);
        this.$isTrial = z11;
        this.$symbol = str;
        this.$inputValue = bigDecimal;
        this.$positionSide = str2;
        this.this$0 = addMarginViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddMarginViewModel$submitMargin$1(this.$isTrial, this.$symbol, this.$inputValue, this.$positionSide, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AddMarginViewModel$submitMargin$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                InterfaceC45233b interfaceC45233bM20259p = MultiBizFacadeManager.m20259p(MultiBizFacadeManager.f19232a, null, 1, null);
                boolean z11 = this.$isTrial;
                String str = this.$symbol;
                String plainString = this.$inputValue.toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                interfaceC45233bM20259p.mo93810g0(z11, str, plainString, StringsKt.replace$default(string, C33820nf.f71144W, "", false, 4, (Object) null), this.$positionSide);
                this.this$0.m27792c0().postValue(new Pair<>(Boxing.boxBoolean(true), null));
            } catch (CancellationException e11) {
                Log.f30813a.m36615a(this.this$0.f24265a0, "submitMargin:" + C27041f.m66668h(e11.getMessage()));
                throw e11;
            } catch (Exception e12) {
                this.this$0.m27792c0().postValue(new Pair<>(Boxing.boxBoolean(false), e12));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
