package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.ChartViewConfig;
import com.kubi.flutter.proto.kline.ChartViewConfigKt$Dsl;
import com.kubi.flutter.proto.kline.SubIndexType;
import com.kubi.flutter.proto.kline.SubIndexTypes;
import com.kubi.flutter.proto.kline.SubIndexTypesKt$Dsl;
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
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineViewController$changeSubTypes$1", m90122f = "KLineViewController.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {C33556b3.f69051i}, m90125m = "invokeSuspend", m90126n = {"$this$changeSubTypes$iv", "type$iv", "$this$control$iv$iv", "control$iv$iv", "$i$f$changeSubTypes", "$i$f$control"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nKLineViewController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$changeSubTypes$1\n+ 2 KLineChannelExtension.kt\ncom/kubi/flutter/widget/kline/KLineChannelExtensionKt\n+ 3 ViewControlKt.kt\ncom/kubi/flutter/proto/kline/ViewControlKtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ChartViewConfigKt.kt\ncom/kubi/flutter/proto/kline/ChartViewConfigKtKt\n+ 6 SubIndexTypesKt.kt\ncom/kubi/flutter/proto/kline/SubIndexTypesKtKt\n*L\n1#1,627:1\n70#2:628\n13#2:629\n71#2:632\n72#2:634\n73#2,4:636\n14#2:640\n77#2:641\n8#3:630\n1#4:631\n8#5:633\n8#6:635\n*S KotlinDebug\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$changeSubTypes$1\n*L\n321#1:628\n321#1:629\n321#1:632\n321#1:634\n321#1:636,4\n321#1:640\n321#1:641\n321#1:630\n321#1:631\n321#1:633\n321#1:635\n*E\n"})
public final class KLineViewController$changeSubTypes$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ KLineViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineViewController$changeSubTypes$1(KLineViewController kLineViewController, Continuation<? super KLineViewController$changeSubTypes$1> continuation) {
        super(2, continuation);
        this.this$0 = kLineViewController;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineViewController$changeSubTypes$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KLineViewController$changeSubTypes$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            List<SubIndexType> listM24251i = this.this$0.f22397c.m24251i();
            ViewControlKt$Dsl.Companion companion = ViewControlKt$Dsl.f22217b;
            ViewControl.C12733b c12733bNewBuilder = ViewControl.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12733bNewBuilder, "newBuilder(...)");
            ViewControlKt$Dsl viewControlKt$Dsl_create = companion._create(c12733bNewBuilder);
            ChartViewConfigKt$Dsl.Companion companion2 = ChartViewConfigKt$Dsl.f22094b;
            ChartViewConfig.C12654b c12654bNewBuilder = ChartViewConfig.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12654bNewBuilder, "newBuilder(...)");
            ChartViewConfigKt$Dsl chartViewConfigKt$Dsl_create = companion2._create(c12654bNewBuilder);
            SubIndexTypesKt$Dsl.Companion companion3 = SubIndexTypesKt$Dsl.f22198b;
            SubIndexTypes.C12721c c12721cNewBuilder = SubIndexTypes.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12721cNewBuilder, "newBuilder(...)");
            SubIndexTypesKt$Dsl subIndexTypesKt$Dsl_create = companion3._create(c12721cNewBuilder);
            subIndexTypesKt$Dsl_create.m24041b(subIndexTypesKt$Dsl_create.m24042c(), listM24251i);
            chartViewConfigKt$Dsl_create.m23945d(subIndexTypesKt$Dsl_create.m24040a());
            viewControlKt$Dsl_create.m24060e(chartViewConfigKt$Dsl_create.m23942a());
            ViewControl viewControlM24056a = viewControlKt$Dsl_create.m24056a();
            this.L$0 = SpillingKt.nullOutSpilledVariable(iKLineChannel);
            this.L$1 = SpillingKt.nullOutSpilledVariable(listM24251i);
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
