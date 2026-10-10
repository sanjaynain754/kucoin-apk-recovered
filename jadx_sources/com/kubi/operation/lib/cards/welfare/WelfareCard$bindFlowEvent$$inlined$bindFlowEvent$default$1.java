package com.kubi.operation.lib.cards.welfare;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.operation.lib.widget.Bouns2TaskView;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p701vs.C45627d;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import pf.C43460a;
import pf.InterfaceC43461b;

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.cards.welfare.WelfareCard$bindFlowEvent$$inlined$bindFlowEvent$default$1", m90122f = "WelfareCard.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 WelfareCard.kt\ncom/kubi/operation/lib/cards/welfare/WelfareCard\n*L\n1#1,187:1\n137#2,13:188\n*E\n"})
public final class WelfareCard$bindFlowEvent$$inlined$bindFlowEvent$default$1 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ Pair[] $tags$inlined;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WelfareCard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelfareCard$bindFlowEvent$$inlined$bindFlowEvent$default$1(String str, Continuation continuation, WelfareCard welfareCard, Pair[] pairArr) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = welfareCard;
        this.$tags$inlined = pairArr;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        WelfareCard$bindFlowEvent$$inlined$bindFlowEvent$default$1 welfareCard$bindFlowEvent$$inlined$bindFlowEvent$default$1 = new WelfareCard$bindFlowEvent$$inlined$bindFlowEvent$default$1(this.$key, continuation, this.this$0, this.$tags$inlined);
        welfareCard$bindFlowEvent$$inlined$bindFlowEvent$default$1.L$0 = obj;
        return welfareCard$bindFlowEvent$$inlined$bindFlowEvent$default$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((WelfareCard$bindFlowEvent$$inlined$bindFlowEvent$default$1) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Boolean boolBoxBoolean;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Bouns2TaskView bouns2TaskView;
        LinearLayoutCompat linearLayoutCompat;
        View view;
        LinearLayoutCompat linearLayoutCompat2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof List)) {
                    List list = (List) c43460a.getData();
                    if (this.this$0.getView() != null) {
                        C45627d c45627dM43450Z3 = this.this$0.m43450Z3();
                        if (c45627dM43450Z3 != null && (linearLayoutCompat2 = c45627dM43450Z3.f102791e) != null) {
                            boolBoxBoolean = Boxing.boxBoolean(ViewExtKt.m66581l(linearLayoutCompat2));
                        } else {
                            boolBoxBoolean = null;
                        }
                        if (C27025c.m66566d(boolBoxBoolean)) {
                            if (this.this$0.m43419a4().m43606h()) {
                                C45627d c45627dM43450Z4 = this.this$0.m43450Z3();
                                if (c45627dM43450Z4 != null && (view = c45627dM43450Z4.f102804r) != null) {
                                    C27046k.m66700o(view);
                                }
                                C45627d c45627dM43450Z5 = this.this$0.m43450Z3();
                                if (c45627dM43450Z5 != null && (linearLayoutCompat = c45627dM43450Z5.f102791e) != null) {
                                    C27046k.m66700o(linearLayoutCompat);
                                }
                                C45627d c45627dM43450Z6 = this.this$0.m43450Z3();
                                if (c45627dM43450Z6 != null && (bouns2TaskView = c45627dM43450Z6.f102796j) != null) {
                                    C27046k.m66700o(bouns2TaskView);
                                }
                            } else {
                                C45627d c45627dM43450Z7 = this.this$0.m43450Z3();
                                if (c45627dM43450Z7 != null && (baseTextView2 = c45627dM43450Z7.f102799m) != null) {
                                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                    String str = String.format(C27041f.m66668h(this.this$0.f36736b0), Arrays.copyOf(new Object[]{list.get(0), list.get(1), list.get(2), list.get(3)}, 4));
                                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                    baseTextView2.setText(str);
                                }
                                C45627d c45627dM43450Z8 = this.this$0.m43450Z3();
                                if (c45627dM43450Z8 != null && (baseTextView = c45627dM43450Z8.f102799m) != null) {
                                    HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
                                    Pair[] pairArr = this.$tags$inlined;
                                    highlightTextHelper.m54120f(baseTextView, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                                }
                            }
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
