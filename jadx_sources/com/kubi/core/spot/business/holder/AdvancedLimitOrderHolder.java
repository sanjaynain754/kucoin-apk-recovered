package com.kubi.core.spot.business.holder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.kubi.core.biz.submit.TradeSubmitVM;
import com.kubi.core.spot.entity.AdvancedLimitItemEntity;
import com.kubi.core.spot.entity.OrderResultEntity;
import com.kubi.spot.entity.AdvancedLimitItemEntityKt;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.tradecorebiz.R$drawable;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import ne.InterfaceC42808a;
import ne.InterfaceC42809b;
import org.jetbrains.annotations.NotNull;
import p557qe.InterfaceC43720b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdvancedLimitOrderHolder.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012,\u0010\u000b\u001a(\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0 R\u000e\u0010\u001c\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/AdvancedLimitOrderHolder;", "Lcom/kubi/core/spot/business/holder/LimitOrderHolder;", "context", "Landroid/content/Context;", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "isStop", "", "isHorizontal", "requestOrderExecutor", "Lkotlin/Function2;", "", "", "Lio/reactivex/Observable;", "Lcom/kubi/core/spot/entity/OrderResultEntity;", "interceptionList", "Ljava/util/LinkedList;", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputInterceptResult;", "submitVM", "Lcom/kubi/core/biz/submit/TradeSubmitVM;", "diffTradeImp", "Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;", "<init>", "(Landroid/content/Context;Lcom/kubi/tradebase/tradetype/TradeType;Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;ZZLkotlin/jvm/functions/Function2;Ljava/util/LinkedList;Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;)V", "currentLimitType", "initView", "", "getAdvancedLimitParams", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
public final class AdvancedLimitOrderHolder extends LimitOrderHolder {

    /* JADX INFO: renamed from: u */
    @NotNull
    public String f21028u;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvancedLimitOrderHolder(Context context, TradeType tradeType, ITradeHolderDependDelegate iTradeHolderDependDelegate, boolean z11, boolean z12, Function2 function2, LinkedList linkedList, TradeSubmitVM tradeSubmitVM, ITradeDiffBizDefine iTradeDiffBizDefine, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        z11 = (i11 & 8) != 0 ? false : z11;
        z12 = (i11 & 16) != 0 ? false : z12;
        this(context, tradeType, iTradeHolderDependDelegate, z11, z12, function2, linkedList, tradeSubmitVM, (i11 & 256) != 0 ? new SpotDiffHolderImp(tradeSubmitVM, iTradeHolderDependDelegate, z12) : iTradeDiffBizDefine);
    }

    /* JADX INFO: renamed from: f2 */
    public static final Unit m22884f2(AdvancedLimitOrderHolder advancedLimitOrderHolder, AdvancedLimitItemEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advancedLimitOrderHolder.f21028u = it.getType();
        advancedLimitOrderHolder.getViewBinding().f102307m.setText(it.getTitle());
        return Unit.INSTANCE;
    }

    @NotNull
    public final Map<String, String> getAdvancedLimitParams() {
        if (Intrinsics.areEqual(this.f21028u, AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_POST_ONLY)) {
            HashMap map = new HashMap();
            map.put("postOnly", "1");
            return map;
        }
        HashMap map2 = new HashMap();
        map2.put("postOnly", "0");
        map2.put("timeInForce", this.f21028u);
        return map2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedLimitOrderHolder(@NotNull Context context, @NotNull TradeType tradeType, @NotNull ITradeHolderDependDelegate parentBehavior, boolean z11, boolean z12, @NotNull Function2<? super Map<String, String>, ? super String, ? extends Observable<OrderResultEntity>> requestOrderExecutor, @NotNull LinkedList<InterfaceC43720b<InterfaceC42808a, InterfaceC42809b>> interceptionList, @NotNull TradeSubmitVM submitVM, @NotNull ITradeDiffBizDefine diffTradeImp) {
        super(context, tradeType, parentBehavior, z11, z12, requestOrderExecutor, interceptionList, submitVM, diffTradeImp);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        Intrinsics.checkNotNullParameter(requestOrderExecutor, "requestOrderExecutor");
        Intrinsics.checkNotNullParameter(interceptionList, "interceptionList");
        Intrinsics.checkNotNullParameter(submitVM, "submitVM");
        Intrinsics.checkNotNullParameter(diffTradeImp, "diffTradeImp");
        this.f21028u = AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_POST_ONLY;
    }

    /* JADX INFO: renamed from: d2 */
    public static final Unit m22882d2(final AdvancedLimitOrderHolder advancedLimitOrderHolder) {
        advancedLimitOrderHolder.getViewBinding().f102301g.setImageResource(R$drawable.ic2_triangle_top_16);
        SubmitDialogHelper submitDialogHelper = SubmitDialogHelper.f21095a;
        FragmentManager childFragmentManager = advancedLimitOrderHolder.getF21029b().mo22357H().getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        submitDialogHelper.m23246d(childFragmentManager, advancedLimitOrderHolder.f21028u, new Action() { // from class: com.kubi.core.spot.business.holder.b
            @Override // io.reactivex.functions.Action
            public final void run() {
                AdvancedLimitOrderHolder.m22883e2(this.f21101b);
            }
        }, new Function1() { // from class: com.kubi.core.spot.business.holder.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedLimitOrderHolder.m22884f2(this.f21106b, (AdvancedLimitItemEntity) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e2 */
    public static final void m22883e2(AdvancedLimitOrderHolder advancedLimitOrderHolder) {
        advancedLimitOrderHolder.getViewBinding().f102301g.setImageResource(R$drawable.ic2_triangle_bottom_16);
    }

    @Override // com.kubi.core.spot.business.holder.LimitOrderHolder, com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: h0 */
    public void mo22885h0() {
        super.mo22885h0();
        LinearLayout flLimitType = getViewBinding().f102300f;
        Intrinsics.checkNotNullExpressionValue(flLimitType, "flLimitType");
        ViewExtKt.m66594y(flLimitType);
        LinearLayout flLimitType2 = getViewBinding().f102300f;
        Intrinsics.checkNotNullExpressionValue(flLimitType2, "flLimitType");
        C27046k.m66711z(flLimitType2, 0L, new Function0() { // from class: com.kubi.core.spot.business.holder.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedLimitOrderHolder.m22882d2(this.f21098b);
            }
        }, 1, null);
    }
}
