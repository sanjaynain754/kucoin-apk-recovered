package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.ChartViewConfig;
import com.kubi.flutter.proto.kline.ChartViewConfigKt$Dsl;
import com.kubi.flutter.proto.kline.DataSourceConfig;
import com.kubi.flutter.proto.kline.DataSourceConfigKt$Dsl;
import com.kubi.flutter.proto.kline.SwitchType;
import com.kubi.flutter.proto.kline.ViewControl;
import com.kubi.flutter.proto.kline.ViewControlKt$Dsl;
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
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineViewController$changeSymbol$1", m90122f = "KLineViewController.kt", m90123i = {0, 0, 0}, m90124l = {635, 262}, m90125m = "invokeSuspend", m90126n = {"$this$control$iv", "control$iv", "$i$f$control"}, m90127s = {"L$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nKLineViewController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$changeSymbol$1\n+ 2 KLineChannelExtension.kt\ncom/kubi/flutter/widget/kline/KLineChannelExtensionKt\n+ 3 ViewControlKt.kt\ncom/kubi/flutter/proto/kline/ViewControlKtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 DataSourceConfigKt.kt\ncom/kubi/flutter/proto/kline/DataSourceConfigKtKt\n+ 6 ChartViewConfigKt.kt\ncom/kubi/flutter/proto/kline/ChartViewConfigKtKt\n*L\n1#1,627:1\n13#2:628\n14#2:635\n8#3:629\n1#4:630\n1#4:632\n1#4:634\n8#5:631\n8#6:633\n*S KotlinDebug\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$changeSymbol$1\n*L\n250#1:628\n250#1:635\n250#1:629\n250#1:630\n251#1:632\n255#1:634\n251#1:631\n255#1:633\n*E\n"})
public final class KLineViewController$changeSymbol$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ SwitchType $isLineSwitch;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ KLineViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineViewController$changeSymbol$1(KLineViewController kLineViewController, SwitchType switchType, Continuation<? super KLineViewController$changeSymbol$1> continuation) {
        super(2, continuation);
        this.this$0 = kLineViewController;
        this.$isLineSwitch = switchType;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineViewController$changeSymbol$1(this.this$0, this.$isLineSwitch, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KLineViewController$changeSymbol$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
    
        if (r10.m24226P("changeSymbol", r9) == r0) goto L17;
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
        this.this$0.m24212B();
        IKLineChannel iKLineChannel = this.this$0.f22398d;
        KLineViewController kLineViewController = this.this$0;
        SwitchType switchType = this.$isLineSwitch;
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
        ChartViewConfigKt$Dsl.Companion companion3 = ChartViewConfigKt$Dsl.f22094b;
        ChartViewConfig.C12654b c12654bNewBuilder = ChartViewConfig.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12654bNewBuilder, "newBuilder(...)");
        ChartViewConfigKt$Dsl chartViewConfigKt$Dsl_create = companion3._create(c12654bNewBuilder);
        chartViewConfigKt$Dsl_create.m23943b(switchType);
        viewControlKt$Dsl_create.m24060e(chartViewConfigKt$Dsl_create.m23942a());
        ViewControl viewControlM24056a = viewControlKt$Dsl_create.m24056a();
        this.L$0 = SpillingKt.nullOutSpilledVariable(iKLineChannel);
        this.L$1 = SpillingKt.nullOutSpilledVariable(viewControlM24056a);
        this.I$0 = 0;
        this.label = 1;
        if (iKLineChannel.mo24112c(viewControlM24056a, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        if (this.this$0.f22403i.get() == 1) {
            KLineViewController kLineViewController2 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
