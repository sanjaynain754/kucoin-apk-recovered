package com.kubi.assets.exchange.viewmodel;

import org.json.JSONException;
import p719wa.C45775a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import va.C45484a;

/* JADX INFO: compiled from: MainConvertViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.exchange.viewmodel.MainConvertViewModel$requestConvertMainSmallAssets$2", m90122f = "MainConvertViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MainConvertViewModel$requestConvertMainSmallAssets$2 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MainConvertViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainConvertViewModel$requestConvertMainSmallAssets$2(MainConvertViewModel mainConvertViewModel, Continuation<? super MainConvertViewModel$requestConvertMainSmallAssets$2> continuation) {
        super(2, continuation);
        this.this$0 = mainConvertViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainConvertViewModel$requestConvertMainSmallAssets$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((MainConvertViewModel$requestConvertMainSmallAssets$2) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.sendSingleEvent(new C45775a());
            C45484a.f102511a.m100443d(true, "success");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
