package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.ChartViewConfig;
import com.kubi.flutter.proto.kline.ChartViewConfigKt$Dsl;
import com.kubi.flutter.proto.kline.MainIndexType;
import com.kubi.flutter.proto.kline.MainIndexTypes;
import com.kubi.flutter.proto.kline.MainIndexTypesKt$Dsl;
import com.kubi.flutter.proto.kline.ViewControl;
import com.kubi.flutter.proto.kline.ViewControlKt$Dsl;
import com.tencent.bugly.proguard.C33556b3;
import java.util.List;
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
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineViewController$changeMainTypes$1", m90122f = "KLineViewController.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {C33556b3.f69051i}, m90125m = "invokeSuspend", m90126n = {"$this$changeMainTypes$iv", "types$iv", "$this$control$iv$iv", "control$iv$iv", "$i$f$changeMainTypes", "$i$f$control"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nKLineViewController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$changeMainTypes$1\n+ 2 KLineChannelExtension.kt\ncom/kubi/flutter/widget/kline/KLineChannelExtensionKt\n+ 3 ViewControlKt.kt\ncom/kubi/flutter/proto/kline/ViewControlKtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ChartViewConfigKt.kt\ncom/kubi/flutter/proto/kline/ChartViewConfigKtKt\n+ 6 MainIndexTypesKt.kt\ncom/kubi/flutter/proto/kline/MainIndexTypesKtKt\n*L\n1#1,627:1\n38#2:628\n13#2:629\n39#2:632\n40#2:634\n41#2,4:636\n14#2:640\n45#2:641\n8#3:630\n1#4:631\n8#5:633\n8#6:635\n*S KotlinDebug\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$changeMainTypes$1\n*L\n308#1:628\n308#1:629\n308#1:632\n308#1:634\n308#1:636,4\n308#1:640\n308#1:641\n308#1:630\n308#1:631\n308#1:633\n308#1:635\n*E\n"})
public final class KLineViewController$changeMainTypes$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ KLineViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineViewController$changeMainTypes$1(KLineViewController kLineViewController, Continuation<? super KLineViewController$changeMainTypes$1> continuation) {
        super(2, continuation);
        this.this$0 = kLineViewController;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineViewController$changeMainTypes$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KLineViewController$changeMainTypes$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            List<MainIndexType> listM24246d = this.this$0.f22397c.m24246d();
            ViewControlKt$Dsl.Companion companion = ViewControlKt$Dsl.f22217b;
            ViewControl.C12733b c12733bNewBuilder = ViewControl.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12733bNewBuilder, "newBuilder(...)");
            ViewControlKt$Dsl viewControlKt$Dsl_create = companion._create(c12733bNewBuilder);
            ChartViewConfigKt$Dsl.Companion companion2 = ChartViewConfigKt$Dsl.f22094b;
            ChartViewConfig.C12654b c12654bNewBuilder = ChartViewConfig.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12654bNewBuilder, "newBuilder(...)");
            ChartViewConfigKt$Dsl chartViewConfigKt$Dsl_create = companion2._create(c12654bNewBuilder);
            MainIndexTypesKt$Dsl.Companion companion3 = MainIndexTypesKt$Dsl.f22135b;
            MainIndexTypes.C12679c c12679cNewBuilder = MainIndexTypes.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12679cNewBuilder, "newBuilder(...)");
            MainIndexTypesKt$Dsl mainIndexTypesKt$Dsl_create = companion3._create(c12679cNewBuilder);
            mainIndexTypesKt$Dsl_create.m23958b(mainIndexTypesKt$Dsl_create.m23959c(), listM24246d);
            chartViewConfigKt$Dsl_create.m23944c(mainIndexTypesKt$Dsl_create.m23957a());
            viewControlKt$Dsl_create.m24060e(chartViewConfigKt$Dsl_create.m23942a());
            ViewControl viewControlM24056a = viewControlKt$Dsl_create.m24056a();
            this.L$0 = SpillingKt.nullOutSpilledVariable(iKLineChannel);
            this.L$1 = SpillingKt.nullOutSpilledVariable(listM24246d);
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
