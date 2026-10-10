package com.kubi.flutter.widget.kline;

import com.kubi.event.api.C12572a;
import com.kubi.flutter.proto.kline.Response;
import com.kubi.flutter.proto.kline.ResponseKt$Dsl;
import com.kubi.flutter.proto.kline.ToastEvent;
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

/* JADX INFO: compiled from: KLineViewController.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/flutter/proto/kline/Response;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineViewController$onToastEvent$2", m90122f = "KLineViewController.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKLineViewController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$onToastEvent$2\n+ 2 ResponseKt.kt\ncom/kubi/flutter/proto/kline/ResponseKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,627:1\n8#2:628\n1#3:629\n*S KotlinDebug\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$onToastEvent$2\n*L\n624#1:628\n624#1:629\n*E\n"})
public final class KLineViewController$onToastEvent$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Response>, Object> {
    final /* synthetic */ ToastEvent $toast;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineViewController$onToastEvent$2(ToastEvent toastEvent, Continuation<? super KLineViewController$onToastEvent$2> continuation) {
        super(2, continuation);
        this.$toast = toastEvent;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineViewController$onToastEvent$2(this.$toast, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Response> continuation) {
        return ((KLineViewController$onToastEvent$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ToastEvent toastEvent = this.$toast;
            if (toastEvent != null) {
                String name = ToastEvent.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                C12572a.m23695d(name, toastEvent, 0L, 4, null);
            }
            ResponseKt$Dsl.Companion companion = ResponseKt$Dsl.f22177b;
            Response.C12705b c12705bNewBuilder = Response.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder, "newBuilder(...)");
            return companion._create(c12705bNewBuilder).m24018a();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
