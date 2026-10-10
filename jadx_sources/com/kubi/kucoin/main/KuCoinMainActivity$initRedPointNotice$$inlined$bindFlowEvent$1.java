package com.kubi.kucoin.main;

import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.resources.widget.rorbin.badgeview.QBadgeView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p209ds.RedDot;
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
import zw.C46932c;

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.main.KuCoinMainActivity$initRedPointNotice$$inlined$bindFlowEvent$1", m90122f = "KuCoinMainActivity.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 KuCoinMainActivity.kt\ncom/kubi/kucoin/main/KuCoinMainActivity\n*L\n1#1,187:1\n351#2,20:188\n*E\n"})
public final class KuCoinMainActivity$initRedPointNotice$$inlined$bindFlowEvent$1 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KuCoinMainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuCoinMainActivity$initRedPointNotice$$inlined$bindFlowEvent$1(String str, Continuation continuation, KuCoinMainActivity kuCoinMainActivity) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = kuCoinMainActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        KuCoinMainActivity$initRedPointNotice$$inlined$bindFlowEvent$1 kuCoinMainActivity$initRedPointNotice$$inlined$bindFlowEvent$1 = new KuCoinMainActivity$initRedPointNotice$$inlined$bindFlowEvent$1(this.$key, continuation, this.this$0);
        kuCoinMainActivity$initRedPointNotice$$inlined$bindFlowEvent$1.L$0 = obj;
        return kuCoinMainActivity$initRedPointNotice$$inlined$bindFlowEvent$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((KuCoinMainActivity$initRedPointNotice$$inlined$bindFlowEvent$1) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof RedDot)) {
                    RedDot redDot = (RedDot) c43460a.getData();
                    QBadgeView qBadgeView = this.this$0.f27965L;
                    if (qBadgeView != null) {
                        int iM6236a = C5275i0.m6236a(24.0f);
                        int i11 = 0;
                        if (redDot.getNoticeNumberCount() > 0) {
                            qBadgeView.mo55426c(C46932c.m103406c(qBadgeView, iM6236a), C5275i0.m6236a(2.0f), false);
                            qBadgeView.mo55425b(redDot.getNoticeNumberCount());
                        } else {
                            qBadgeView.mo55426c(C46932c.m103405b(qBadgeView, iM6236a), C5275i0.m6236a(5.0f), false);
                            if (redDot.getEncourageCount() > 0 || redDot.getInvitationCount() > 0 || redDot.getNoticeAllCount() > 0) {
                                i11 = -1;
                            }
                            qBadgeView.mo55425b(i11);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
