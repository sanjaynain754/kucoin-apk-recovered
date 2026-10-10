package com.kubi.margin.kline;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.kubi.margin.R$color;
import com.kubi.margin.R$string;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradebase.business.klineSettings.KLineTimeAdapter;
import com.kubi.tradebase.business.klineSettings.KLineTimeCycleAdapter;
import com.kubi.tradebase.business.klineSettings.KLineTimeEntity;
import gf.C37878b0;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p206dp.C36941u;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarginKlineFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.kline.MarginKlineFragment$getKlinePosition$1", m90122f = "MarginKlineFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nMarginKlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginKlineFragment.kt\ncom/kubi/margin/kline/MarginKlineFragment$getKlinePosition$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,575:1\n1869#2,2:576\n1869#2,2:578\n*S KotlinDebug\n*F\n+ 1 MarginKlineFragment.kt\ncom/kubi/margin/kline/MarginKlineFragment$getKlinePosition$1\n*L\n486#1:576,2\n495#1:578,2\n*E\n"})
public final class MarginKlineFragment$getKlinePosition$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: $i */
    final /* synthetic */ int f33118$i;
    int label;
    final /* synthetic */ MarginKlineFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginKlineFragment$getKlinePosition$1(MarginKlineFragment marginKlineFragment, int i11, Continuation<? super MarginKlineFragment$getKlinePosition$1> continuation) {
        super(2, continuation);
        this.this$0 = marginKlineFragment;
        this.f33118$i = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginKlineFragment$getKlinePosition$1(this.this$0, this.f33118$i, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarginKlineFragment$getKlinePosition$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C36941u c36941uM38684d4;
        BaseTextView baseTextView;
        C36941u c36941uM38684d5;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        List<KLineTimeEntity> data;
        boolean z11;
        List<KLineTimeEntity> data2;
        BaseTextView baseTextView4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            KLineTimeCycleAdapter kLineTimeCycleAdapter = this.this$0.f33113d0;
            boolean z12 = false;
            if (kLineTimeCycleAdapter != null && (data2 = kLineTimeCycleAdapter.getData()) != null) {
                MarginKlineFragment marginKlineFragment = this.this$0;
                for (KLineTimeEntity kLineTimeEntity : data2) {
                    if (kLineTimeEntity.getTag() == C37878b0.f85252a.m85523d()) {
                        kLineTimeEntity.setSelected(true);
                        C36941u c36941uM38684d6 = marginKlineFragment.m38684d4();
                        if (c36941uM38684d6 != null && (baseTextView4 = c36941uM38684d6.f81995l) != null) {
                            baseTextView4.setText(kLineTimeEntity.getTime());
                        }
                    } else {
                        kLineTimeEntity.setSelected(false);
                    }
                }
            }
            KLineTimeCycleAdapter kLineTimeCycleAdapter2 = this.this$0.f33113d0;
            if (kLineTimeCycleAdapter2 != null) {
                kLineTimeCycleAdapter2.notifyDataSetChanged();
            }
            KLineTimeAdapter kLineTimeAdapter = this.this$0.f33114e0;
            if (kLineTimeAdapter != null && (data = kLineTimeAdapter.getData()) != null) {
                boolean z13 = false;
                for (KLineTimeEntity kLineTimeEntity2 : data) {
                    int tag = kLineTimeEntity2.getTag();
                    C37878b0 c37878b0 = C37878b0.f85252a;
                    if (tag == c37878b0.m85523d()) {
                        z13 = true;
                    }
                    if (kLineTimeEntity2.getTag() == c37878b0.m85523d()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    kLineTimeEntity2.setSelected(z11);
                }
                z12 = z13;
            }
            KLineTimeAdapter kLineTimeAdapter2 = this.this$0.f33114e0;
            if (kLineTimeAdapter2 != null) {
                kLineTimeAdapter2.notifyDataSetChanged();
            }
            if (z12 && this.f33118$i != -1) {
                C36941u c36941uM38684d7 = this.this$0.m38684d4();
                if (c36941uM38684d7 != null && (baseTextView3 = c36941uM38684d7.f81995l) != null) {
                    baseTextView3.setText(this.this$0.getString(R$string.more));
                }
                Context context = this.this$0.getContext();
                if (context != null && (c36941uM38684d5 = this.this$0.m38684d4()) != null && (baseTextView2 = c36941uM38684d5.f81995l) != null) {
                    baseTextView2.setTextColor(ContextCompat.getColor(context, R$color.c_text40));
                }
            } else {
                Context context2 = this.this$0.getContext();
                if (context2 != null && (c36941uM38684d4 = this.this$0.m38684d4()) != null && (baseTextView = c36941uM38684d4.f81995l) != null) {
                    baseTextView.setTextColor(ContextCompat.getColor(context2, R$color.c_text));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
