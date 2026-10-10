package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.AlertClickType;
import com.kubi.flutter.proto.kline.PaintViewConfig;
import com.kubi.flutter.proto.kline.PaintViewConfigKt$Dsl;
import com.kubi.flutter.proto.kline.ViewControl;
import com.kubi.flutter.proto.kline.ViewControlKt$Dsl;
import kotlinx.coroutines.InterfaceC41709m0;
import p311hf.C38190h;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KLineViewController.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.KLineViewController$deleteAllDraw$1", m90122f = "KLineViewController.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, m90124l = {638}, m90125m = "invokeSuspend", m90126n = {"$this$deleteAllDraw$iv", "type$iv", "$this$control$iv$iv", "$completion$iv$iv", "control$iv$iv", "$i$f$deleteAllDraw", "it$iv", "$i$a$-let-KLineChannelExtensionKt$deleteAllDraw$3$iv", "$i$f$control"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "Z$0", "I$1", "I$2"})
@SourceDebugExtension({"SMAP\nKLineViewController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$deleteAllDraw$1\n+ 2 KLineChannelExtension.kt\ncom/kubi/flutter/widget/kline/KLineChannelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ViewControlKt.kt\ncom/kubi/flutter/proto/kline/ViewControlKtKt\n+ 5 PaintViewConfigKt.kt\ncom/kubi/flutter/proto/kline/PaintViewConfigKtKt\n*L\n1#1,627:1\n184#2:628\n185#2:630\n13#2:631\n186#2:633\n187#2,3:635\n14#2:638\n191#2:639\n1#3:629\n8#4:632\n8#5:634\n*S KotlinDebug\n*F\n+ 1 KLineViewController.kt\ncom/kubi/flutter/widget/kline/KLineViewController$deleteAllDraw$1\n*L\n351#1:628\n351#1:630\n351#1:631\n351#1:633\n351#1:635,3\n351#1:638\n351#1:639\n351#1:629\n351#1:632\n351#1:634\n*E\n"})
public final class KLineViewController$deleteAllDraw$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AlertClickType $type;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final /* synthetic */ KLineViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineViewController$deleteAllDraw$1(AlertClickType alertClickType, KLineViewController kLineViewController, Continuation<? super KLineViewController$deleteAllDraw$1> continuation) {
        super(2, continuation);
        this.$type = alertClickType;
        this.this$0 = kLineViewController;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineViewController$deleteAllDraw$1(this.$type, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KLineViewController$deleteAllDraw$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C44128b.m97266j("KLineViewController", "deleteAllDraw " + this.$type);
            IKLineChannel iKLineChannel = this.this$0.f22398d;
            AlertClickType alertClickType = this.$type;
            Boolean boolBoxBoolean = Boxing.boxBoolean(C38190h.f85888a.m86164i());
            if (!boolBoxBoolean.booleanValue()) {
                boolBoxBoolean = null;
            }
            if (boolBoxBoolean != null) {
                boolean zBooleanValue = boolBoxBoolean.booleanValue();
                ViewControlKt$Dsl.Companion companion = ViewControlKt$Dsl.f22217b;
                ViewControl.C12733b c12733bNewBuilder = ViewControl.newBuilder();
                Intrinsics.checkNotNullExpressionValue(c12733bNewBuilder, "newBuilder(...)");
                ViewControlKt$Dsl viewControlKt$Dsl_create = companion._create(c12733bNewBuilder);
                PaintViewConfigKt$Dsl.Companion companion2 = PaintViewConfigKt$Dsl.f22166b;
                PaintViewConfig.C12699b c12699bNewBuilder = PaintViewConfig.newBuilder();
                Intrinsics.checkNotNullExpressionValue(c12699bNewBuilder, "newBuilder(...)");
                PaintViewConfigKt$Dsl paintViewConfigKt$Dsl_create = companion2._create(c12699bNewBuilder);
                paintViewConfigKt$Dsl_create.m24004c(alertClickType);
                viewControlKt$Dsl_create.m24057b(paintViewConfigKt$Dsl_create.m24002a());
                ViewControl viewControlM24056a = viewControlKt$Dsl_create.m24056a();
                this.L$0 = SpillingKt.nullOutSpilledVariable(iKLineChannel);
                this.L$1 = SpillingKt.nullOutSpilledVariable(alertClickType);
                this.L$2 = SpillingKt.nullOutSpilledVariable(iKLineChannel);
                this.L$3 = SpillingKt.nullOutSpilledVariable(this);
                this.L$4 = SpillingKt.nullOutSpilledVariable(viewControlM24056a);
                this.I$0 = 0;
                this.Z$0 = zBooleanValue;
                this.I$1 = 0;
                this.I$2 = 0;
                this.label = 1;
                obj = iKLineChannel.mo24112c(viewControlM24056a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
