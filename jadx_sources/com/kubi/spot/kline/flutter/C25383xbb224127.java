package com.kubi.spot.kline.flutter;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.flutter.proto.kline.AlertType;
import com.kubi.flutter.proto.kline.PaintGuideEvent;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.layout.ShapeConstraintLayout;
import n30.C42727c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import pf.C43460a;
import pf.InterfaceC43461b;

/* JADX INFO: renamed from: com.kubi.spot.kline.flutter.SpotFlutterKlineLandscapeActivity$bindEvent$$inlined$bindFlowEvent$3 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.kline.flutter.SpotFlutterKlineLandscapeActivity$bindEvent$$inlined$bindFlowEvent$3", m90122f = "SpotFlutterKlineLandscapeActivity.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 SpotFlutterKlineLandscapeActivity.kt\ncom/kubi/spot/kline/flutter/SpotFlutterKlineLandscapeActivity\n*L\n1#1,187:1\n312#2,9:188\n*E\n"})
public final class C25383xbb224127 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SpotFlutterKlineLandscapeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25383xbb224127(String str, Continuation continuation, SpotFlutterKlineLandscapeActivity spotFlutterKlineLandscapeActivity) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = spotFlutterKlineLandscapeActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C25383xbb224127 c25383xbb224127 = new C25383xbb224127(this.$key, continuation, this.this$0);
        c25383xbb224127.L$0 = obj;
        return c25383xbb224127;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C25383xbb224127) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String content;
        boolean z11;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        ShapeConstraintLayout shapeConstraintLayout;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof PaintGuideEvent)) {
                    PaintGuideEvent paintGuideEvent = (PaintGuideEvent) c43460a.getData();
                    String title = paintGuideEvent.getTitle();
                    int i11 = 0;
                    if ((title != null && title.length() != 0) || ((content = paintGuideEvent.getContent()) != null && content.length() != 0)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    C42727c c42727cM62054S0 = this.this$0.m62054S0();
                    if (c42727cM62054S0 != null && (shapeConstraintLayout = c42727cM62054S0.f94576d) != null) {
                        if (paintGuideEvent.getType() != AlertType.ALERT_SHOW || z11) {
                            i11 = 8;
                        }
                        shapeConstraintLayout.setVisibility(i11);
                    }
                    C42727c c42727cM62054S1 = this.this$0.m62054S0();
                    if (c42727cM62054S1 != null && (baseTextView2 = c42727cM62054S1.f94593u) != null) {
                        baseTextView2.setText(paintGuideEvent.getTitle());
                    }
                    C42727c c42727cM62054S2 = this.this$0.m62054S0();
                    if (c42727cM62054S2 != null && (baseTextView = c42727cM62054S2.f94586n) != null) {
                        baseTextView.setText(paintGuideEvent.getContent());
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
