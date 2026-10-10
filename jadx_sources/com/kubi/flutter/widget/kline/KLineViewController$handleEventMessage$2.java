package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.ChangeToolBarModeEvent;
import com.kubi.flutter.proto.kline.ConfirmAlerEvent;
import com.kubi.flutter.proto.kline.EventMessage;
import com.kubi.flutter.proto.kline.JumpOrderEvent;
import com.kubi.flutter.proto.kline.LoadMoreEvent;
import com.kubi.flutter.proto.kline.PaintGuideEvent;
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
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineViewController$handleEventMessage$2", m90122f = "KLineViewController.kt", m90123i = {}, m90124l = {559, 560, 561, 562, 563, 564}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKLineViewController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$handleEventMessage$2\n+ 2 ResponseKt.kt\ncom/kubi/flutter/proto/kline/ResponseKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,627:1\n8#2:628\n1#3:629\n*S KotlinDebug\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$handleEventMessage$2\n*L\n565#1:628\n565#1:629\n*E\n"})
public final class KLineViewController$handleEventMessage$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Response>, Object> {
    final /* synthetic */ EventMessage $eventMessage;
    int label;
    final /* synthetic */ KLineViewController this$0;

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.KLineViewController$handleEventMessage$2$a */
    /* JADX INFO: compiled from: KLineViewController.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C12761a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventMessage.EventTypeCase.values().length];
            try {
                iArr[EventMessage.EventTypeCase.LOADMORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventMessage.EventTypeCase.JUMPEVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventMessage.EventTypeCase.TOOLBARMODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EventMessage.EventTypeCase.CONFIRMALERTEVENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EventMessage.EventTypeCase.PAINTGUIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EventMessage.EventTypeCase.TOASTEVENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineViewController$handleEventMessage$2(EventMessage eventMessage, KLineViewController kLineViewController, Continuation<? super KLineViewController$handleEventMessage$2> continuation) {
        super(2, continuation);
        this.$eventMessage = eventMessage;
        this.this$0 = kLineViewController;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineViewController$handleEventMessage$2(this.$eventMessage, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Response> continuation) {
        return ((KLineViewController$handleEventMessage$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r4 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r4 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (r4 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (r4 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c2, code lost:
    
        if (r4 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dc, code lost:
    
        if (r4 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00de, code lost:
    
        return r0;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                EventMessage.EventTypeCase eventTypeCase = this.$eventMessage.getEventTypeCase();
                if (eventTypeCase == null) {
                    i11 = -1;
                } else {
                    i11 = C12761a.$EnumSwitchMapping$0[eventTypeCase.ordinal()];
                }
                switch (i11) {
                    case 1:
                        KLineViewController kLineViewController = this.this$0;
                        LoadMoreEvent loadMore = this.$eventMessage.getLoadMore();
                        Intrinsics.checkNotNullExpressionValue(loadMore, "getLoadMore(...)");
                        this.label = 1;
                        obj = kLineViewController.m24221K(loadMore, this);
                        break;
                    case 2:
                        KLineViewController kLineViewController2 = this.this$0;
                        JumpOrderEvent jumpEvent = this.$eventMessage.getJumpEvent();
                        Intrinsics.checkNotNullExpressionValue(jumpEvent, "getJumpEvent(...)");
                        this.label = 2;
                        obj = kLineViewController2.m24220J(jumpEvent, this);
                        break;
                    case 3:
                        KLineViewController kLineViewController3 = this.this$0;
                        ChangeToolBarModeEvent toolBarMode = this.$eventMessage.getToolBarMode();
                        this.label = 3;
                        obj = kLineViewController3.m24225O(toolBarMode, this);
                        break;
                    case 4:
                        KLineViewController kLineViewController4 = this.this$0;
                        ConfirmAlerEvent confirmAlertEvent = this.$eventMessage.getConfirmAlertEvent();
                        this.label = 4;
                        obj = kLineViewController4.m24216F(confirmAlertEvent, this);
                        break;
                    case 5:
                        KLineViewController kLineViewController5 = this.this$0;
                        PaintGuideEvent paintGuide = this.$eventMessage.getPaintGuide();
                        this.label = 5;
                        obj = kLineViewController5.m24222L(paintGuide, this);
                        break;
                    case 6:
                        KLineViewController kLineViewController6 = this.this$0;
                        ToastEvent toastEvent = this.$eventMessage.getToastEvent();
                        this.label = 6;
                        obj = kLineViewController6.m24224N(toastEvent, this);
                        break;
                    default:
                        ResponseKt$Dsl.Companion companion = ResponseKt$Dsl.f22177b;
                        Response.C12705b c12705bNewBuilder = Response.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(c12705bNewBuilder, "newBuilder(...)");
                        return companion._create(c12705bNewBuilder).m24018a();
                }
                break;
            case 1:
                ResultKt.throwOnFailure(obj);
                return (Response) obj;
            case 2:
                ResultKt.throwOnFailure(obj);
                return (Response) obj;
            case 3:
                ResultKt.throwOnFailure(obj);
                return (Response) obj;
            case 4:
                ResultKt.throwOnFailure(obj);
                return (Response) obj;
            case 5:
                ResultKt.throwOnFailure(obj);
                return (Response) obj;
            case 6:
                ResultKt.throwOnFailure(obj);
                return (Response) obj;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
