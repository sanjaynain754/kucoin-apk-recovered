package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.ChartSetupConfig;
import com.kubi.flutter.proto.kline.ChartSetupConfigKt$Dsl;
import com.kubi.flutter.proto.kline.SelectPadConfig;
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
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineViewController$changeSelectPadConfig$1", m90122f = "KLineViewController.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {637}, m90125m = "invokeSuspend", m90126n = {"$this$changeSelectPadConfig$iv", "selectPadConfig$iv", "$this$control$iv$iv", "control$iv$iv", "$i$f$changeSelectPadConfig", "$i$f$control"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nKLineViewController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$changeSelectPadConfig$1\n+ 2 KLineChannelExtension.kt\ncom/kubi/flutter/widget/kline/KLineChannelExtensionKt\n+ 3 ViewControlKt.kt\ncom/kubi/flutter/proto/kline/ViewControlKtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ChartSetupConfigKt.kt\ncom/kubi/flutter/proto/kline/ChartSetupConfigKtKt\n*L\n1#1,627:1\n84#2:628\n13#2:629\n85#2:632\n86#2,3:634\n14#2:637\n89#2:638\n8#3:630\n1#4:631\n8#5:633\n*S KotlinDebug\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$changeSelectPadConfig$1\n*L\n366#1:628\n366#1:629\n366#1:632\n366#1:634,3\n366#1:637\n366#1:638\n366#1:630\n366#1:631\n366#1:633\n*E\n"})
public final class KLineViewController$changeSelectPadConfig$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ SelectPadConfig $selectPadConfig;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ KLineViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineViewController$changeSelectPadConfig$1(KLineViewController kLineViewController, SelectPadConfig selectPadConfig, Continuation<? super KLineViewController$changeSelectPadConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = kLineViewController;
        this.$selectPadConfig = selectPadConfig;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineViewController$changeSelectPadConfig$1(this.this$0, this.$selectPadConfig, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KLineViewController$changeSelectPadConfig$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            IKLineChannel iKLineChannel = this.this$0.f22398d;
            SelectPadConfig selectPadConfig = this.$selectPadConfig;
            ViewControlKt$Dsl.Companion companion = ViewControlKt$Dsl.f22217b;
            ViewControl.C12733b c12733bNewBuilder = ViewControl.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12733bNewBuilder, "newBuilder(...)");
            ViewControlKt$Dsl viewControlKt$Dsl_create = companion._create(c12733bNewBuilder);
            ChartSetupConfigKt$Dsl.Companion companion2 = ChartSetupConfigKt$Dsl.f22091b;
            ChartSetupConfig.C12652b c12652bNewBuilder = ChartSetupConfig.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12652bNewBuilder, "newBuilder(...)");
            ChartSetupConfigKt$Dsl chartSetupConfigKt$Dsl_create = companion2._create(c12652bNewBuilder);
            chartSetupConfigKt$Dsl_create.m23937d(selectPadConfig);
            viewControlKt$Dsl_create.m24058c(chartSetupConfigKt$Dsl_create.m23934a());
            ViewControl viewControlM24056a = viewControlKt$Dsl_create.m24056a();
            this.L$0 = SpillingKt.nullOutSpilledVariable(iKLineChannel);
            this.L$1 = SpillingKt.nullOutSpilledVariable(selectPadConfig);
            this.L$2 = SpillingKt.nullOutSpilledVariable(iKLineChannel);
            this.L$3 = SpillingKt.nullOutSpilledVariable(viewControlM24056a);
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 1;
            if (iKLineChannel.mo24112c(viewControlM24056a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
