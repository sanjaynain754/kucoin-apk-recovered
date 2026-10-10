package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.EventMessage;
import com.kubi.flutter.proto.kline.Request;
import com.kubi.flutter.proto.kline.Response;
import com.kubi.flutter.proto.kline.ResponseKt$Dsl;
import com.kubi.flutter.proto.kline.StateEventType;
import java.nio.ByteBuffer;
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
import ro.C44128b;

/* JADX INFO: compiled from: KLineChannel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Ljava/nio/ByteBuffer;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineChannel$onReceived$2", m90122f = "KLineChannel.kt", m90123i = {}, m90124l = {139}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKLineChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineChannel.kt\ncom/kubi/flutter/widget/kline/KLineChannel$onReceived$2\n+ 2 ResponseKt.kt\ncom/kubi/flutter/proto/kline/ResponseKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,227:1\n8#2:228\n8#2:230\n1#3:229\n1#3:231\n*S KotlinDebug\n*F\n+ 1 KLineChannel.kt\ncom/kubi/flutter/widget/kline/KLineChannel$onReceived$2\n*L\n142#1:228\n148#1:230\n142#1:229\n148#1:231\n*E\n"})
public final class KLineChannel$onReceived$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super ByteBuffer>, Object> {
    final /* synthetic */ Request $request;
    int label;
    final /* synthetic */ KLineChannel this$0;

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.KLineChannel$onReceived$2$a */
    /* JADX INFO: compiled from: KLineChannel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C12748a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Request.BodyCase.values().length];
            try {
                iArr[Request.BodyCase.EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineChannel$onReceived$2(Request request, KLineChannel kLineChannel, Continuation<? super KLineChannel$onReceived$2> continuation) {
        super(2, continuation);
        this.$request = request;
        this.this$0 = kLineChannel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineChannel$onReceived$2(this.$request, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super ByteBuffer> continuation) {
        return ((KLineChannel$onReceived$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Response responseM24018a;
        int i11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Request.BodyCase bodyCase = this.$request.getBodyCase();
                if (bodyCase == null) {
                    i11 = -1;
                } else {
                    i11 = C12748a.$EnumSwitchMapping$0[bodyCase.ordinal()];
                }
                if (i11 == 1) {
                    C44128b.m97266j("KLineChannel", "onReceived Event " + this.$request.getEvent().getEventTypeCase());
                    if (this.$request.getEvent().hasStateEvent() && this.$request.getEvent().getStateEvent() == StateEventType.VIEW_LOADED) {
                        this.this$0.f22323c.release();
                    }
                    KLineChannel kLineChannel = this.this$0;
                    EventMessage event = this.$request.getEvent();
                    Intrinsics.checkNotNullExpressionValue(event, "getEvent(...)");
                    this.label = 1;
                    obj = kLineChannel.m24116o(event, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    ResponseKt$Dsl.Companion companion = ResponseKt$Dsl.f22177b;
                    Response.C12705b c12705bNewBuilder = Response.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder, "newBuilder(...)");
                    ResponseKt$Dsl responseKt$Dsl_create = companion._create(c12705bNewBuilder);
                    responseKt$Dsl_create.m24019b(400);
                    responseM24018a = responseKt$Dsl_create.m24018a();
                }
                return this.this$0.m24120s(responseM24018a);
            }
            responseM24018a = (Response) obj;
        } catch (Throwable th2) {
            ResponseKt$Dsl.Companion companion2 = ResponseKt$Dsl.f22177b;
            Response.C12705b c12705bNewBuilder2 = Response.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder2, "newBuilder(...)");
            ResponseKt$Dsl responseKt$Dsl_create2 = companion2._create(c12705bNewBuilder2);
            responseKt$Dsl_create2.m24019b(500);
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            responseKt$Dsl_create2.m24020c(message);
            responseM24018a = responseKt$Dsl_create2.m24018a();
        }
        return this.this$0.m24120s(responseM24018a);
    }
}
