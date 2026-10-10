package com.kubi.welfare;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.welfare.WelfareEncourageFragment;
import com.kubi.welfare.api.entity.EncourageRecordItemEntity;
import com.kubi.welfare.api.entity.WelfareInfoEntity;
import com.kubi.welfare.view.WelfareHeaderView;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.Map;
import l80.InterfaceC42137a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WelfareEncourageFragment.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0014J\u001c\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0014J$\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0014H\u0014J\b\u0010 \u001a\u00020\u0017H\u0016J\u001a\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0017H\u0002J\b\u0010'\u001a\u00020\u0014H\u0014J\b\u0010(\u001a\u00020\u0014H\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006)"}, m90084d2 = {"Lcom/kubi/welfare/WelfareEncourageFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/welfare/api/entity/EncourageRecordItemEntity;", "<init>", "()V", "mHeaderView", "Lcom/kubi/welfare/view/WelfareHeaderView;", "assetApi", "Lcom/kubi/welfare/api/remote/WelfareApi;", "kotlin.jvm.PlatformType", "getAssetApi", "()Lcom/kubi/welfare/api/remote/WelfareApi;", "assetApi$delegate", "Lkotlin/Lazy;", "encourage", "Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;", "getEncourage", "()Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;", "encourage$delegate", "getLayout", "", "getItemLayout", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "refreshData", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initHeader", "getEmptyFooterText", "getEmptyFooterIcon", "WelfareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WelfareEncourageFragment extends BasePagingFragment<EncourageRecordItemEntity> {

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ int f54879c0 = 0;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public WelfareHeaderView f54880Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f54881a0 = LazyKt.lazy(new Function0() { // from class: k80.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WelfareEncourageFragment.m67016K3();
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f54882b0 = LazyKt.lazy(new Function0() { // from class: k80.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WelfareEncourageFragment.m67017M3(this.f91035b);
        }
    });

    /* JADX INFO: renamed from: Q3 */
    public static final void m67018Q3(WelfareEncourageFragment welfareEncourageFragment, WelfareInfoEntity welfareInfoEntity) {
        Map<String, WelfareInfoEntity.WelfareDetailEntity> incomeResponse;
        WelfareInfoEntity.WelfareDetailEntity welfareDetailEntity = (welfareInfoEntity == null || (incomeResponse = welfareInfoEntity.getIncomeResponse()) == null) ? null : incomeResponse.get("ENCOURAGEMENT");
        WelfareHeaderView welfareHeaderView = welfareEncourageFragment.f54880Z;
        if (welfareHeaderView != null) {
            welfareHeaderView.setData(welfareDetailEntity);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: L3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable BaseViewHolder baseViewHolder, @Nullable EncourageRecordItemEntity encourageRecordItemEntity) {
        Integer status;
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(encourageRecordItemEntity != null ? encourageRecordItemEntity.getHoldCurrency() : null));
        if (encourageRecordItemEntity != null && (status = encourageRecordItemEntity.getStatus()) != null) {
            DrawStatus drawStatusValueOfInt = DrawStatus.INSTANCE.valueOfInt(status.intValue());
            if (drawStatusValueOfInt != null) {
                if (baseViewHolder != null) {
                    baseViewHolder.setText(R$id.tv_status, drawStatusValueOfInt.getStr());
                }
                if (baseViewHolder != null) {
                    baseViewHolder.setTextColor(R$id.tv_status, getColorRes(drawStatusValueOfInt.getColor()));
                }
            }
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_coin_name, String.valueOf(C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null)));
        }
        String strM66668h = C27041f.m66668h(encourageRecordItemEntity != null ? encourageRecordItemEntity.getReason() : null);
        if (strM66668h.length() == 0) {
            if (baseViewHolder != null) {
                baseViewHolder.setText(R$id.tv_coin_nameReason, "");
            }
        } else if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_coin_nameReason, '(' + strM66668h + ')');
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_amount_1, C37885i.m85571j(C27039d.m66647g(encourageRecordItemEntity != null ? encourageRecordItemEntity.getHoldAmount() : null), C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null), null, true, false, false, false, null, 122, null));
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_price_1, C41014a.m89950x(C41014a.m89939m(C27039d.m66647g(encourageRecordItemEntity != null ? encourageRecordItemEntity.getHoldAmount() : null), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null), null, null, 0, false, false, false, false, 127, null));
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_amount_2, C37885i.m85571j(C27039d.m66647g(encourageRecordItemEntity != null ? encourageRecordItemEntity.getAmount() : null), C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null), null, true, false, false, false, null, 122, null));
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_price_2, C41014a.m89950x(C41014a.m89939m(C27039d.m66647g(encourageRecordItemEntity != null ? encourageRecordItemEntity.getAmount() : null), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null), null, null, 0, false, false, false, false, 127, null));
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_date, TimeUtils.m66422i(C27039d.m66652l(encourageRecordItemEntity != null ? encourageRecordItemEntity.getShareDate() : null)));
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final InterfaceC42137a m67020N3() {
        return (InterfaceC42137a) this.f54881a0.getValue();
    }

    /* JADX INFO: renamed from: O3 */
    public final WelfareInfoEntity.WelfareDetailEntity m67021O3() {
        return (WelfareInfoEntity.WelfareDetailEntity) this.f54882b0.getValue();
    }

    /* JADX INFO: renamed from: P3 */
    public final void m67022P3() {
        if (this.f54880Z == null) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            WelfareHeaderView welfareHeaderView = new WelfareHeaderView(mContext, 2);
            this.f54880Z = welfareHeaderView;
            this.f46495W.addHeaderView(welfareHeaderView);
        }
        if (m67021O3() == null) {
            addSubscription(m67020N3().m92471d().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: k80.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    WelfareEncourageFragment.m67018Q3(this.f91036b, (WelfareInfoEntity) obj);
                }
            }, new C24223c1(this)));
            return;
        }
        WelfareHeaderView welfareHeaderView2 = this.f54880Z;
        if (welfareHeaderView2 != null) {
            welfareHeaderView2.setData(m67021O3());
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_encourage_record;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: s3 */
    public int mo56581s3() {
        return R$drawable.ic2_common_empty;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: t3 */
    public int mo15921t3() {
        return R$string.no_encourage;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.kucoin_item_encourage_record;
    }

    /* JADX INFO: renamed from: K3 */
    public static final InterfaceC42137a m67016K3() {
        return (InterfaceC42137a) C42597a.m93386b().create(InterfaceC42137a.class);
    }

    /* JADX INFO: renamed from: M3 */
    public static final WelfareInfoEntity.WelfareDetailEntity m67017M3(WelfareEncourageFragment welfareEncourageFragment) {
        Bundle arguments = welfareEncourageFragment.getArguments();
        if (arguments != null) {
            return (WelfareInfoEntity.WelfareDetailEntity) RouteExKt.m56231V(arguments, "data");
        }
        return null;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        super.mo15906F3();
        m67022P3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getTitleBar().setTitle(getString(R$string.kcs_encourage_bonus));
        SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) findViewById(R$id.m_swipe_recycler_view);
        if (swipeRefreshRecyclerView != null && (recyclerView = swipeRefreshRecyclerView.getRecyclerView()) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<EncourageRecordItemEntity>> mo16440r3(int i11, int i12) {
        Observable observableCompose = m67020N3().m92476i(i11, i12).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }
}
