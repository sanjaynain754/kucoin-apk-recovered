package com.reactnativecommunity.imageeditor;

import java.io.File;
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
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ImageEditorModuleImpl.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 0, 0})
@DebugMetadata(m90121c = "com.reactnativecommunity.imageeditor.ImageEditorModuleImpl$cleanTask$1", m90122f = "ImageEditorModuleImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nImageEditorModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditorModuleImpl.kt\ncom/reactnativecommunity/imageeditor/ImageEditorModuleImpl$cleanTask$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,672:1\n1#2:673\n*E\n"})
public final class ImageEditorModuleImpl$cleanTask$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ImageEditorModuleImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageEditorModuleImpl$cleanTask$1(ImageEditorModuleImpl imageEditorModuleImpl, Continuation<? super ImageEditorModuleImpl$cleanTask$1> continuation) {
        super(2, continuation);
        this.this$0 = imageEditorModuleImpl;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImageEditorModuleImpl$cleanTask$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ImageEditorModuleImpl$cleanTask$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ImageEditorModuleImpl imageEditorModuleImpl = this.this$0;
            File cacheDir = imageEditorModuleImpl.reactContext.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
            imageEditorModuleImpl.m68115h(cacheDir);
            File externalCacheDir = this.this$0.reactContext.getExternalCacheDir();
            if (externalCacheDir != null) {
                this.this$0.m68115h(externalCacheDir);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
