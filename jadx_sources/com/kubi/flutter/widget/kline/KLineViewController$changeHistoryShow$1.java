package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.ChartSetupConfig;
import com.kubi.flutter.proto.kline.ChartSetupConfigKt$Dsl;
import com.kubi.flutter.proto.kline.OrderViewConfig;
import com.kubi.flutter.proto.kline.OrderViewConfigKt$Dsl;
import com.kubi.flutter.proto.kline.SwitchType;
import com.kubi.flutter.proto.kline.ViewControl;
import com.kubi.flutter.proto.kline.ViewControlKt$Dsl;
import com.kubi.flutter.widget.kline.utils.KLineRealTimeLog;
import com.tencent.bugly.proguard.C33556b3;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KLineViewController.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineViewController$changeHistoryShow$1", m90122f = "KLineViewController.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {C33556b3.f69051i, 383}, m90125m = "invokeSuspend", m90126n = {"$this$changeHistory$iv", "type$iv", "$this$control$iv$iv", "control$iv$iv", "$i$f$changeHistory", "$i$f$control"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nKLineViewController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$changeHistoryShow$1\n+ 2 KLineChannelExtension.kt\ncom/kubi/flutter/widget/kline/KLineChannelExtensionKt\n+ 3 ViewControlKt.kt\ncom/kubi/flutter/proto/kline/ViewControlKtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ChartSetupConfigKt.kt\ncom/kubi/flutter/proto/kline/ChartSetupConfigKtKt\n+ 6 OrderViewConfigKt.kt\ncom/kubi/flutter/proto/kline/OrderViewConfigKtKt\n*L\n1#1,627:1\n110#2:628\n13#2:629\n111#2:632\n112#2:634\n113#2,4:636\n14#2:640\n117#2:641\n8#3:630\n1#4:631\n8#5:633\n8#6:635\n*S KotlinDebug\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$changeHistoryShow$1\n*L\n379#1:628\n379#1:629\n379#1:632\n379#1:634\n379#1:636,4\n379#1:640\n379#1:641\n379#1:630\n379#1:631\n379#1:633\n379#1:635\n*E\n"})
public final class KLineViewController$changeHistoryShow$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isChecked;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ KLineViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineViewController$changeHistoryShow$1(KLineViewController kLineViewController, boolean z11, Continuation<? super KLineViewController$changeHistoryShow$1> continuation) {
        super(2, continuation);
        this.this$0 = kLineViewController;
        this.$isChecked = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineViewController$changeHistoryShow$1(this.this$0, this.$isChecked, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KLineViewController$changeHistoryShow$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x012e, code lost:
    
        if (r13 == r0) goto L19;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        IKLineChannel iKLineChannel = this.this$0.f22398d;
        SwitchType switchTypeM24288b = C12766e.m24288b(this.$isChecked, null, 1, null);
        ViewControlKt$Dsl.Companion companion = ViewControlKt$Dsl.f22217b;
        ViewControl.C12733b c12733bNewBuilder = ViewControl.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12733bNewBuilder, "newBuilder(...)");
        ViewControlKt$Dsl viewControlKt$Dsl_create = companion._create(c12733bNewBuilder);
        ChartSetupConfigKt$Dsl.Companion companion2 = ChartSetupConfigKt$Dsl.f22091b;
        ChartSetupConfig.C12652b c12652bNewBuilder = ChartSetupConfig.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12652bNewBuilder, "newBuilder(...)");
        ChartSetupConfigKt$Dsl chartSetupConfigKt$Dsl_create = companion2._create(c12652bNewBuilder);
        OrderViewConfigKt$Dsl.Companion companion3 = OrderViewConfigKt$Dsl.f22157b;
        OrderViewConfig.C12693b c12693bNewBuilder = OrderViewConfig.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12693bNewBuilder, "newBuilder(...)");
        OrderViewConfigKt$Dsl orderViewConfigKt$Dsl_create = companion3._create(c12693bNewBuilder);
        orderViewConfigKt$Dsl_create.m23995c(switchTypeM24288b);
        chartSetupConfigKt$Dsl_create.m23936c(orderViewConfigKt$Dsl_create.m23993a());
        viewControlKt$Dsl_create.m24058c(chartSetupConfigKt$Dsl_create.m23934a());
        ViewControl viewControlM24056a = viewControlKt$Dsl_create.m24056a();
        this.L$0 = SpillingKt.nullOutSpilledVariable(iKLineChannel);
        this.L$1 = SpillingKt.nullOutSpilledVariable(switchTypeM24288b);
        this.L$2 = SpillingKt.nullOutSpilledVariable(iKLineChannel);
        this.L$3 = SpillingKt.nullOutSpilledVariable(viewControlM24056a);
        this.I$0 = 0;
        this.I$1 = 0;
        this.label = 1;
        if (iKLineChannel.mo24112c(viewControlM24056a, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        if (this.$isChecked) {
            KLineRealTimeLog.f22494a.m24393a("changeHistoryShow,symbol=" + this.this$0.f22397c.getSymbol() + ",type=" + this.this$0.f22397c.getType().getType() + ",showHistory=" + this.this$0.f22397c.getShowHistory() + ",enableHistory=" + this.this$0.f22397c.getEnableHistory());
            KLineDataSession kLineDataSession = (KLineDataSession) this.this$0.f22401g.get();
            if (kLineDataSession != null) {
                IKLineDataInteractor.OrderParam orderParamM24265w = this.this$0.f22397c.m24265w();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                obj = KLineDataSession.m24166q(kLineDataSession, orderParamM24265w, 0L, this, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
