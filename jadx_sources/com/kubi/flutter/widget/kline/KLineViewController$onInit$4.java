package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.CandleViewConfig;
import com.kubi.flutter.proto.kline.ChartSetupConfig;
import com.kubi.flutter.proto.kline.ChartSetupConfigKt$Dsl;
import com.kubi.flutter.proto.kline.ChartViewConfig;
import com.kubi.flutter.proto.kline.ChartViewConfigKt$Dsl;
import com.kubi.flutter.proto.kline.DataSourceConfig;
import com.kubi.flutter.proto.kline.DataSourceConfigKt$Dsl;
import com.kubi.flutter.proto.kline.MainIndexTypes;
import com.kubi.flutter.proto.kline.MainIndexTypesKt$Dsl;
import com.kubi.flutter.proto.kline.OrderViewConfig;
import com.kubi.flutter.proto.kline.OrderViewConfigKt$Dsl;
import com.kubi.flutter.proto.kline.SelectPadConfig;
import com.kubi.flutter.proto.kline.SubIndexTypes;
import com.kubi.flutter.proto.kline.SubIndexTypesKt$Dsl;
import com.kubi.flutter.proto.kline.ViewControl;
import com.kubi.flutter.proto.kline.ViewControlKt$Dsl;
import com.kubi.flutter.proto.kline.VolumeConfig;
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
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineViewController$onInit$4", m90122f = "KLineViewController.kt", m90123i = {0, 0, 0, 0, 1}, m90124l = {644, 497}, m90125m = "invokeSuspend", m90126n = {"defaultSetupConfig", "$this$control$iv", "control$iv", "$i$f$control", "defaultSetupConfig"}, m90127s = {"L$0", "L$1", "L$2", "I$0", "L$0"})
@SourceDebugExtension({"SMAP\nKLineViewController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$onInit$4\n+ 2 KLineChannelExtension.kt\ncom/kubi/flutter/widget/kline/KLineChannelExtensionKt\n+ 3 ViewControlKt.kt\ncom/kubi/flutter/proto/kline/ViewControlKtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 DataSourceConfigKt.kt\ncom/kubi/flutter/proto/kline/DataSourceConfigKtKt\n+ 6 ChartSetupConfigKt.kt\ncom/kubi/flutter/proto/kline/ChartSetupConfigKtKt\n+ 7 OrderViewConfigKt.kt\ncom/kubi/flutter/proto/kline/OrderViewConfigKtKt\n+ 8 ChartViewConfigKt.kt\ncom/kubi/flutter/proto/kline/ChartViewConfigKtKt\n+ 9 MainIndexTypesKt.kt\ncom/kubi/flutter/proto/kline/MainIndexTypesKtKt\n+ 10 SubIndexTypesKt.kt\ncom/kubi/flutter/proto/kline/SubIndexTypesKtKt\n*L\n1#1,627:1\n13#2:628\n14#2:644\n8#3:629\n1#4:630\n1#4:632\n1#4:634\n1#4:635\n1#4:637\n1#4:639\n1#4:641\n1#4:643\n8#5:631\n8#6:633\n8#7:636\n8#8:638\n8#9:640\n8#10:642\n*S KotlinDebug\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$onInit$4\n*L\n469#1:628\n469#1:644\n469#1:629\n469#1:630\n470#1:632\n474#1:634\n478#1:637\n483#1:639\n485#1:641\n488#1:643\n470#1:631\n474#1:633\n478#1:636\n483#1:638\n485#1:640\n488#1:642\n*E\n"})
public final class KLineViewController$onInit$4 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ KLineViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineViewController$onInit$4(KLineViewController kLineViewController, Continuation<? super KLineViewController$onInit$4> continuation) {
        super(2, continuation);
        this.this$0 = kLineViewController;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineViewController$onInit$4(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KLineViewController$onInit$4) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x018b, code lost:
    
        if (r13.m24226P("init", r12) == r0) goto L21;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChartSetupConfig chartSetupConfigM24363c;
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
                chartSetupConfigM24363c = (ChartSetupConfig) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        chartSetupConfigM24363c = KLineSetting.f22480a.m24363c();
        IKLineChannel iKLineChannel = this.this$0.f22398d;
        KLineViewController kLineViewController = this.this$0;
        ViewControlKt$Dsl.Companion companion = ViewControlKt$Dsl.f22217b;
        ViewControl.C12733b c12733bNewBuilder = ViewControl.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12733bNewBuilder, "newBuilder(...)");
        ViewControlKt$Dsl viewControlKt$Dsl_create = companion._create(c12733bNewBuilder);
        DataSourceConfigKt$Dsl.Companion companion2 = DataSourceConfigKt$Dsl.f22100b;
        DataSourceConfig.C12658b c12658bNewBuilder = DataSourceConfig.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12658bNewBuilder, "newBuilder(...)");
        DataSourceConfigKt$Dsl dataSourceConfigKt$Dsl_create = companion2._create(c12658bNewBuilder);
        dataSourceConfigKt$Dsl_create.m23949b(kLineViewController.f22397c.getType().getPeriod());
        dataSourceConfigKt$Dsl_create.m23950c(kLineViewController.f22397c.getPrecision());
        viewControlKt$Dsl_create.m24059d(dataSourceConfigKt$Dsl_create.m23948a());
        ChartSetupConfigKt$Dsl.Companion companion3 = ChartSetupConfigKt$Dsl.f22091b;
        ChartSetupConfig.C12652b c12652bNewBuilder = ChartSetupConfig.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12652bNewBuilder, "newBuilder(...)");
        ChartSetupConfigKt$Dsl chartSetupConfigKt$Dsl_create = companion3._create(c12652bNewBuilder);
        CandleViewConfig candleView = chartSetupConfigM24363c.getCandleView();
        Intrinsics.checkNotNullExpressionValue(candleView, "getCandleView(...)");
        chartSetupConfigKt$Dsl_create.m23935b(candleView);
        SelectPadConfig selectPadConfig = kLineViewController.f22404j;
        if (selectPadConfig != null) {
            chartSetupConfigKt$Dsl_create.m23937d(selectPadConfig);
        }
        VolumeConfig volumeConfig = kLineViewController.f22405k;
        if (volumeConfig != null) {
            chartSetupConfigKt$Dsl_create.m23938e(volumeConfig);
        }
        OrderViewConfigKt$Dsl.Companion companion4 = OrderViewConfigKt$Dsl.f22157b;
        OrderViewConfig.C12693b c12693bNewBuilder = OrderViewConfig.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12693bNewBuilder, "newBuilder(...)");
        OrderViewConfigKt$Dsl orderViewConfigKt$Dsl_create = companion4._create(c12693bNewBuilder);
        orderViewConfigKt$Dsl_create.m23995c(C12766e.m24288b(kLineViewController.f22397c.getShowHistory(), null, 1, null));
        orderViewConfigKt$Dsl_create.m23994b(C12766e.m24288b(kLineViewController.f22397c.getShowActive(), null, 1, null));
        chartSetupConfigKt$Dsl_create.m23936c(orderViewConfigKt$Dsl_create.m23993a());
        viewControlKt$Dsl_create.m24058c(chartSetupConfigKt$Dsl_create.m23934a());
        ChartViewConfigKt$Dsl.Companion companion5 = ChartViewConfigKt$Dsl.f22094b;
        ChartViewConfig.C12654b c12654bNewBuilder = ChartViewConfig.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12654bNewBuilder, "newBuilder(...)");
        ChartViewConfigKt$Dsl chartViewConfigKt$Dsl_create = companion5._create(c12654bNewBuilder);
        chartViewConfigKt$Dsl_create.m23943b(C12766e.m24288b(kLineViewController.f22397c.getIsLineView(), null, 1, null));
        MainIndexTypesKt$Dsl.Companion companion6 = MainIndexTypesKt$Dsl.f22135b;
        MainIndexTypes.C12679c c12679cNewBuilder = MainIndexTypes.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12679cNewBuilder, "newBuilder(...)");
        MainIndexTypesKt$Dsl mainIndexTypesKt$Dsl_create = companion6._create(c12679cNewBuilder);
        mainIndexTypesKt$Dsl_create.m23958b(mainIndexTypesKt$Dsl_create.m23959c(), kLineViewController.f22397c.m24246d());
        chartViewConfigKt$Dsl_create.m23944c(mainIndexTypesKt$Dsl_create.m23957a());
        SubIndexTypesKt$Dsl.Companion companion7 = SubIndexTypesKt$Dsl.f22198b;
        SubIndexTypes.C12721c c12721cNewBuilder = SubIndexTypes.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12721cNewBuilder, "newBuilder(...)");
        SubIndexTypesKt$Dsl subIndexTypesKt$Dsl_create = companion7._create(c12721cNewBuilder);
        subIndexTypesKt$Dsl_create.m24041b(subIndexTypesKt$Dsl_create.m24042c(), kLineViewController.f22397c.m24251i());
        chartViewConfigKt$Dsl_create.m23945d(subIndexTypesKt$Dsl_create.m24040a());
        viewControlKt$Dsl_create.m24060e(chartViewConfigKt$Dsl_create.m23942a());
        ViewControl viewControlM24056a = viewControlKt$Dsl_create.m24056a();
        this.L$0 = SpillingKt.nullOutSpilledVariable(chartSetupConfigM24363c);
        this.L$1 = SpillingKt.nullOutSpilledVariable(iKLineChannel);
        this.L$2 = SpillingKt.nullOutSpilledVariable(viewControlM24056a);
        this.I$0 = 0;
        this.label = 1;
        if (iKLineChannel.mo24112c(viewControlM24056a, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        this.this$0.f22402h.set(true);
        KLineViewController kLineViewController2 = this.this$0;
        this.L$0 = SpillingKt.nullOutSpilledVariable(chartSetupConfigM24363c);
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
