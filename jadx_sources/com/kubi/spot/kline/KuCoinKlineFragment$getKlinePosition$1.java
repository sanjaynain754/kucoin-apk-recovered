package com.kubi.spot.kline;

import androidx.core.content.res.ResourcesCompat;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.spot.R$color;
import com.kubi.spot.R$font;
import com.kubi.spot.R$string;
import com.kubi.tradebase.business.klineSettings.KLineTimeAdapter;
import com.kubi.tradebase.business.klineSettings.KLineTimeCycleAdapter;
import com.kubi.tradebase.business.klineSettings.KLineTimeEntity;
import gf.C37878b0;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import t20.C44651l0;
import w20.C45700a;

/* JADX INFO: compiled from: KuCoinKlineFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.kline.KuCoinKlineFragment$getKlinePosition$1", m90122f = "KuCoinKlineFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKuCoinKlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuCoinKlineFragment.kt\ncom/kubi/spot/kline/KuCoinKlineFragment$getKlinePosition$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,584:1\n1869#2,2:585\n1869#2,2:587\n43#3,7:589\n*S KotlinDebug\n*F\n+ 1 KuCoinKlineFragment.kt\ncom/kubi/spot/kline/KuCoinKlineFragment$getKlinePosition$1\n*L\n490#1:585,2\n499#1:587,2\n520#1:589,7\n*E\n"})
public final class KuCoinKlineFragment$getKlinePosition$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: $i */
    final /* synthetic */ int f50635$i;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KuCoinKlineFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuCoinKlineFragment$getKlinePosition$1(KuCoinKlineFragment kuCoinKlineFragment, int i11, Continuation<? super KuCoinKlineFragment$getKlinePosition$1> continuation) {
        super(2, continuation);
        this.this$0 = kuCoinKlineFragment;
        this.f50635$i = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KuCoinKlineFragment$getKlinePosition$1 kuCoinKlineFragment$getKlinePosition$1 = new KuCoinKlineFragment$getKlinePosition$1(this.this$0, this.f50635$i, continuation);
        kuCoinKlineFragment$getKlinePosition$1.L$0 = obj;
        return kuCoinKlineFragment$getKlinePosition$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KuCoinKlineFragment$getKlinePosition$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        List<KLineTimeEntity> data;
        List<KLineTimeEntity> data2;
        BaseTextView baseTextView4;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        KLineTimeCycleAdapter kLineTimeCycleAdapter = this.this$0.f50630f0;
        boolean z11 = false;
        if (kLineTimeCycleAdapter != null && (data2 = kLineTimeCycleAdapter.getData()) != null) {
            KuCoinKlineFragment kuCoinKlineFragment = this.this$0;
            for (KLineTimeEntity kLineTimeEntity : data2) {
                if (kLineTimeEntity.getTag() == C37878b0.f85252a.m85523d()) {
                    kLineTimeEntity.setSelected(true);
                    C44651l0 c44651l0M61963i4 = kuCoinKlineFragment.m61963i4();
                    if (c44651l0M61963i4 != null && (baseTextView4 = c44651l0M61963i4.f99198l) != null) {
                        baseTextView4.setText(kLineTimeEntity.getTime());
                    }
                } else {
                    kLineTimeEntity.setSelected(false);
                }
            }
        }
        KLineTimeCycleAdapter kLineTimeCycleAdapter2 = this.this$0.f50630f0;
        if (kLineTimeCycleAdapter2 != null) {
            kLineTimeCycleAdapter2.notifyDataSetChanged();
        }
        KLineTimeAdapter kLineTimeAdapter = this.this$0.f50631g0;
        if (kLineTimeAdapter != null && (data = kLineTimeAdapter.getData()) != null) {
            boolean z12 = false;
            for (KLineTimeEntity kLineTimeEntity2 : data) {
                int tag = kLineTimeEntity2.getTag();
                C37878b0 c37878b0 = C37878b0.f85252a;
                if (tag == c37878b0.m85523d()) {
                    z12 = true;
                }
                kLineTimeEntity2.setSelected(kLineTimeEntity2.getTag() == c37878b0.m85523d());
            }
            z11 = z12;
        }
        KLineTimeAdapter kLineTimeAdapter2 = this.this$0.f50631g0;
        if (kLineTimeAdapter2 != null) {
            kLineTimeAdapter2.notifyDataSetChanged();
        }
        int i11 = this.f50635$i;
        KuCoinKlineFragment kuCoinKlineFragment2 = this.this$0;
        try {
            Result.Companion companion = Result.INSTANCE;
            Unit unit = null;
            if (!z11 || i11 == -1) {
                C44651l0 c44651l0M61963i5 = kuCoinKlineFragment2.m61963i4();
                if (c44651l0M61963i5 != null && (baseTextView = c44651l0M61963i5.f99198l) != null) {
                    baseTextView.setTextColor(kuCoinKlineFragment2.getColorRes(R$color.c_text));
                    baseTextView.setTypeface(ResourcesCompat.getFont(((OldBaseFragment) kuCoinKlineFragment2).mContext, R$font.medium));
                    unit = Unit.INSTANCE;
                }
            } else {
                C44651l0 c44651l0M61963i6 = kuCoinKlineFragment2.m61963i4();
                if (c44651l0M61963i6 != null && (baseTextView3 = c44651l0M61963i6.f99198l) != null) {
                    baseTextView3.setText(kuCoinKlineFragment2.getString(R$string.more));
                }
                C44651l0 c44651l0M61963i7 = kuCoinKlineFragment2.m61963i4();
                if (c44651l0M61963i7 != null && (baseTextView2 = c44651l0M61963i7.f99198l) != null) {
                    baseTextView2.setTextColor(kuCoinKlineFragment2.getColorRes(R$color.c_text40));
                    baseTextView2.setTypeface(ResourcesCompat.getFont(((OldBaseFragment) kuCoinKlineFragment2).mContext, R$font.regular));
                    unit = Unit.INSTANCE;
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C45700a.m100877c(thM103847exceptionOrNullimpl, interfaceC41709m0.getClass().getSimpleName() + "-getKlinePosition");
        }
        return Unit.INSTANCE;
    }
}
