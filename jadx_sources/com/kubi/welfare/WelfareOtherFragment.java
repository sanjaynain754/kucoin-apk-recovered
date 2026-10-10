package com.kubi.welfare;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.DropMenuView;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.welfare.WelfareOtherFragment;
import com.kubi.welfare.api.entity.OtherRecordItemEntity;
import com.kubi.welfare.api.entity.WelfareInfoEntity;
import com.kubi.welfare.view.WelfareHeaderView;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import gf.C37890n;
import i10.Menu;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l80.InterfaceC42137a;
import mr.C42597a;
import o80.C42996a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WelfareOtherFragment.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001cH\u0014J\b\u0010\u001f\u001a\u00020\u001cH\u0014J\u001c\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0014J$\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020'0&2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001cH\u0014J\u001a\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020!H\u0016J\b\u00100\u001a\u00020!H\u0002J\b\u00101\u001a\u00020!H\u0002J\b\u00102\u001a\u00020\u001cH\u0014J\b\u00103\u001a\u00020\u001cH\u0014J\u0016\u00106\u001a\u00020!2\f\u00107\u001a\b\u0012\u0004\u0012\u00020908H\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, m90084d2 = {"Lcom/kubi/welfare/WelfareOtherFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/welfare/api/entity/OtherRecordItemEntity;", "<init>", "()V", "assetApi", "Lcom/kubi/welfare/api/remote/WelfareApi;", "kotlin.jvm.PlatformType", "getAssetApi", "()Lcom/kubi/welfare/api/remote/WelfareApi;", "assetApi$delegate", "Lkotlin/Lazy;", "other", "Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;", "getOther", "()Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;", "other$delegate", "mMenuHelper", "Lcom/kubi/resources/widget/drop/DropMenuHelper;", "getMMenuHelper", "()Lcom/kubi/resources/widget/drop/DropMenuHelper;", "mMenuHelper$delegate", "mHeaderView", "Lcom/kubi/welfare/view/WelfareHeaderView;", "start", "", "end", "type", "", "Ljava/lang/Integer;", "getLayout", "getItemLayout", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "refreshData", "initFilter", "initHeader", "getEmptyFooterText", "getEmptyFooterIcon", "beforeGet", "Lcom/kubi/utils/TimeUtils$BeforeGet;", "onFilter", "list", "", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "WelfareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WelfareOtherFragment extends BasePagingFragment<OtherRecordItemEntity> {

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ int f54889h0 = 0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public WelfareHeaderView f54893c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public String f54894d0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public Integer f54896f0;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f54890Z = LazyKt.lazy(new Function0() { // from class: k80.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WelfareOtherFragment.m67052N3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f54891a0 = LazyKt.lazy(new Function0() { // from class: k80.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WelfareOtherFragment.m67059Z3(this.f91043b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f54892b0 = LazyKt.lazy(new Function0() { // from class: k80.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WelfareOtherFragment.m67058X3();
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public String f54895e0 = String.valueOf(System.currentTimeMillis());

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public TimeUtils.C27004b f54897g0 = new TimeUtils.C27004b();

    /* JADX INFO: renamed from: Y3 */
    public final void m67064Y3(List<FilterType.InterfaceC23033b> list) {
        String endTime;
        String f44545b = list.get(0).getF44545b();
        Integer num = null;
        switch (f44545b.hashCode()) {
            case 64897:
                f44545b.equals("ALL");
                break;
            case 75532016:
                if (f44545b.equals("OTHER")) {
                    num = 4;
                }
                break;
            case 736573060:
                if (f44545b.equals("DISTRIBUTION")) {
                    num = 3;
                }
                break;
            case 840025640:
                if (f44545b.equals("AIRDROP_FORK")) {
                    num = 2;
                }
                break;
            case 1818632964:
                if (f44545b.equals("REWARDS")) {
                    num = 1;
                }
                break;
        }
        this.f54896f0 = num;
        String f44545b2 = list.get(1).getF44545b();
        this.f54894d0 = C42996a.f95143a.m94427b(f44545b2, this.f54897g0);
        if (Intrinsics.areEqual(f44545b2, "ALL")) {
            endTime = "";
        } else {
            endTime = this.f54897g0.f54265b;
            Intrinsics.checkNotNullExpressionValue(endTime, "endTime");
        }
        this.f54895e0 = endTime;
        mo15906F3();
    }

    /* JADX INFO: renamed from: P3 */
    private final InterfaceC42137a m67053P3() {
        return (InterfaceC42137a) this.f54890Z.getValue();
    }

    /* JADX INFO: renamed from: V3 */
    private final void m67056V3() {
        if (this.f54893c0 == null) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            WelfareHeaderView welfareHeaderView = new WelfareHeaderView(mContext, 3);
            this.f54893c0 = welfareHeaderView;
            this.f46495W.addHeaderView(welfareHeaderView);
        }
        if (m67062R3() == null) {
            addSubscription(m67053P3().m92471d().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: k80.o
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    WelfareOtherFragment.m67057W3(this.f91045b, (WelfareInfoEntity) obj);
                }
            }, new C24223c1(this)));
            return;
        }
        WelfareHeaderView welfareHeaderView2 = this.f54893c0;
        if (welfareHeaderView2 != null) {
            welfareHeaderView2.setData(m67062R3());
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m67057W3(WelfareOtherFragment welfareOtherFragment, WelfareInfoEntity welfareInfoEntity) {
        Map<String, WelfareInfoEntity.WelfareDetailEntity> incomeResponse;
        WelfareInfoEntity.WelfareDetailEntity welfareDetailEntity = (welfareInfoEntity == null || (incomeResponse = welfareInfoEntity.getIncomeResponse()) == null) ? null : incomeResponse.get("OTHER_REWARD");
        WelfareHeaderView welfareHeaderView = welfareOtherFragment.f54893c0;
        if (welfareHeaderView != null) {
            welfareHeaderView.setData(welfareDetailEntity);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static final C23034a m67058X3() {
        return new C23034a();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        this.f54897g0 = new TimeUtils.C27004b();
        super.mo15906F3();
        m67056V3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: O3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable BaseViewHolder baseViewHolder, @Nullable OtherRecordItemEntity otherRecordItemEntity) {
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(otherRecordItemEntity != null ? otherRecordItemEntity.getCurrency() : null));
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_coin_name, C27041f.m66669i(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null, C27041f.m66668h(otherRecordItemEntity != null ? otherRecordItemEntity.getCurrency() : null)));
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_amount, C37885i.m85571j(C27039d.m66647g(otherRecordItemEntity != null ? otherRecordItemEntity.getAmount() : null), C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null), null, false, false, false, false, null, 126, null));
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_price, C41014a.m89950x(C41014a.m89939m(C27039d.m66647g(otherRecordItemEntity != null ? otherRecordItemEntity.getAmount() : null), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null), null, null, 0, false, false, false, false, 127, null));
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_date, TimeUtils.m66422i(C27039d.m66652l(otherRecordItemEntity != null ? otherRecordItemEntity.getTransferFinishTime() : null)));
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_reason, C27041f.m66668h(otherRecordItemEntity != null ? otherRecordItemEntity.getReason() : null));
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public final C23034a m67061Q3() {
        return (C23034a) this.f54892b0.getValue();
    }

    /* JADX INFO: renamed from: R3 */
    public final WelfareInfoEntity.WelfareDetailEntity m67062R3() {
        return (WelfareInfoEntity.WelfareDetailEntity) this.f54891a0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_layout_welfare_other;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: s3 */
    public int mo56581s3() {
        return R$drawable.ic2_common_empty;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: t3 */
    public int mo15921t3() {
        return R$string.no_gain;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.kucoin_item_other_record;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public static final InterfaceC42137a m67052N3() {
        return (InterfaceC42137a) C42597a.m93386b().create(InterfaceC42137a.class);
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m67054T3(final WelfareOtherFragment welfareOtherFragment, Map map) {
        TextView textView;
        TitleBar titleBar = welfareOtherFragment.getTitleBar();
        int i11 = R$id.welfareMenuMore;
        titleBar.setMenu(new Menu(i11, null, null, 0, Integer.valueOf(R$string.filter), R$color.c_text60, 0, null, 0, 462, null));
        DropMenuView dropMenuView = (DropMenuView) welfareOtherFragment.findViewById(R$id.drop_menu_view);
        if (dropMenuView != null) {
            View viewM58933e = welfareOtherFragment.getTitleBar().m58933e(i11);
            if (viewM58933e instanceof TextView) {
                textView = (TextView) viewM58933e;
            } else {
                textView = null;
            }
            if (textView != null) {
                welfareOtherFragment.m67061Q3().m55160d(textView, dropMenuView);
            }
        }
        ArrayList arrayList = new ArrayList();
        String string = welfareOtherFragment.getString(R$string.type);
        FilterType.Companion companion = FilterType.f44543a;
        arrayList.add(new C23034a.a(string, FilterType.Companion.convert2Filter$default(companion, map, false, 2, null)));
        String string2 = welfareOtherFragment.getString(R$string.time);
        C42996a c42996a = C42996a.f95143a;
        Context mContext = welfareOtherFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        arrayList.add(new C23034a.a(string2, FilterType.Companion.convert2Filter$default(companion, c42996a.m94426a(mContext), false, 2, null)));
        welfareOtherFragment.m67061Q3().m55164h(arrayList, new Consumer() { // from class: k80.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WelfareOtherFragment.m67055U3(this.f91046b, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m67055U3(WelfareOtherFragment welfareOtherFragment, List list) {
        Intrinsics.checkNotNull(list);
        welfareOtherFragment.m67064Y3(list);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final WelfareInfoEntity.WelfareDetailEntity m67059Z3(WelfareOtherFragment welfareOtherFragment) {
        Bundle arguments = welfareOtherFragment.getArguments();
        if (arguments != null) {
            return (WelfareInfoEntity.WelfareDetailEntity) RouteExKt.m56231V(arguments, "data");
        }
        return null;
    }

    /* JADX INFO: renamed from: S3 */
    public final void m67063S3() {
        addSubscription(m67053P3().m92469b("WELFARE").compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: k80.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WelfareOtherFragment.m67054T3(this.f91044b, (Map) obj);
            }
        }, new C24223c1(this)));
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getTitleBar().setTitle(getString(R$string.other_receive));
        SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) findViewById(R$id.m_swipe_recycler_view);
        if (swipeRefreshRecyclerView != null && (recyclerView = swipeRefreshRecyclerView.getRecyclerView()) != null) {
            C27046k.m66691f(recyclerView, 0);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        }
        m67063S3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<OtherRecordItemEntity>> mo16440r3(int i11, int i12) {
        Observable observableCompose = m67053P3().m92475h(i11, i12, this.f54894d0, this.f54895e0, this.f54896f0).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }
}
