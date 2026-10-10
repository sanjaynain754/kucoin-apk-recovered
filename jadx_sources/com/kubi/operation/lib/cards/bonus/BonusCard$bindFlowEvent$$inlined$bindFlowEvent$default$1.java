package com.kubi.operation.lib.cards.bonus;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.operation.lib.widget.Bouns3TaskView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p701vs.C45629f;
import p852kotlin.Metadata;
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
import pf.C43460a;
import pf.InterfaceC43461b;

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.cards.bonus.BonusCard$bindFlowEvent$$inlined$bindFlowEvent$default$1", m90122f = "BonusCard.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 BonusCard.kt\ncom/kubi/operation/lib/cards/bonus/BonusCard\n*L\n1#1,187:1\n154#2,17:188\n*E\n"})
public final class BonusCard$bindFlowEvent$$inlined$bindFlowEvent$default$1 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BonusCard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BonusCard$bindFlowEvent$$inlined$bindFlowEvent$default$1(String str, Continuation continuation, BonusCard bonusCard) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = bonusCard;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BonusCard$bindFlowEvent$$inlined$bindFlowEvent$default$1 bonusCard$bindFlowEvent$$inlined$bindFlowEvent$default$1 = new BonusCard$bindFlowEvent$$inlined$bindFlowEvent$default$1(this.$key, continuation, this.this$0);
        bonusCard$bindFlowEvent$$inlined$bindFlowEvent$default$1.L$0 = obj;
        return bonusCard$bindFlowEvent$$inlined$bindFlowEvent$default$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((BonusCard$bindFlowEvent$$inlined$bindFlowEvent$default$1) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Boolean boolBoxBoolean;
        Bouns3TaskView bouns3TaskView;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        Bouns3TaskView bouns3TaskView2;
        LinearLayoutCompat linearLayoutCompat;
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
                        C45629f c45629fM43333J3 = this.this$0.m43333J3();
                        if (c45629fM43333J3 != null && (linearLayoutCompat2 = c45629fM43333J3.f102821f) != null) {
                            boolBoxBoolean = Boxing.boxBoolean(ViewExtKt.m66581l(linearLayoutCompat2));
                        } else {
                            boolBoxBoolean = null;
                        }
                        if (C27025c.m66566d(boolBoxBoolean)) {
                            if (this.this$0.m43308K3().m43606h()) {
                                C45629f c45629fM43333J4 = this.this$0.m43333J3();
                                if (c45629fM43333J4 != null && (linearLayoutCompat = c45629fM43333J4.f102821f) != null) {
                                    C27046k.m66700o(linearLayoutCompat);
                                }
                                C45629f c45629fM43333J5 = this.this$0.m43333J3();
                                if (c45629fM43333J5 != null && (bouns3TaskView2 = c45629fM43333J5.f102826k) != null) {
                                    C27046k.m66700o(bouns3TaskView2);
                                }
                                this.this$0.m43337y3();
                            } else {
                                C45629f c45629fM43333J6 = this.this$0.m43333J3();
                                if (c45629fM43333J6 != null && (baseTextView4 = c45629fM43333J6.f102828m) != null) {
                                    baseTextView4.setText((CharSequence) list.get(0));
                                }
                                C45629f c45629fM43333J7 = this.this$0.m43333J3();
                                if (c45629fM43333J7 != null && (baseTextView3 = c45629fM43333J7.f102830o) != null) {
                                    baseTextView3.setText((CharSequence) list.get(1));
                                }
                                C45629f c45629fM43333J8 = this.this$0.m43333J3();
                                if (c45629fM43333J8 != null && (baseTextView2 = c45629fM43333J8.f102832q) != null) {
                                    baseTextView2.setText((CharSequence) list.get(2));
                                }
                                C45629f c45629fM43333J9 = this.this$0.m43333J3();
                                if (c45629fM43333J9 != null && (baseTextView = c45629fM43333J9.f102834s) != null) {
                                    baseTextView.setText((CharSequence) list.get(3));
                                }
                            }
                        } else {
                            C45629f c45629fM43333J10 = this.this$0.m43333J3();
                            if (c45629fM43333J10 != null && (bouns3TaskView = c45629fM43333J10.f102826k) != null) {
                                C27046k.m66700o(bouns3TaskView);
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
