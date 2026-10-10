package com.kubi.p110rn.modules.command.impl;

import android.content.Intent;
import com.kubi.p110rn.modules.command.model.PhotoModel;
import com.kubi.sdk.util.ImagePickerHelper;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TakePictureCommand.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/rn/modules/command/model/PhotoModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.rn.modules.command.impl.TakePictureCommand$onActivityResult$1$outputModels$1", m90122f = "TakePictureCommand.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TakePictureCommand$onActivityResult$1$outputModels$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends PhotoModel>>, Object> {
    final /* synthetic */ Intent $data;
    int label;
    final /* synthetic */ TakePictureCommand this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends PhotoModel>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<PhotoModel>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakePictureCommand$onActivityResult$1$outputModels$1(TakePictureCommand takePictureCommand, Intent intent, Continuation<? super TakePictureCommand$onActivityResult$1$outputModels$1> continuation) {
        super(2, continuation);
        this.this$0 = takePictureCommand;
        this.$data = intent;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TakePictureCommand$onActivityResult$1$outputModels$1(this.this$0, this.$data, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<PhotoModel>> continuation) {
        return ((TakePictureCommand$onActivityResult$1$outputModels$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return this.this$0.convert(ImagePickerHelper.m58393b(this.$data));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
