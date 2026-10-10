package com.kubi.quotefacade.alpha.list;

import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.alpha.AlphaCurrent;
import com.kubi.quotefacade.constant.AlphaMenu;
import com.kubi.quotefacade.constant.ChainSortItemEnum;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.helper.C22212u1;
import com.kubi.quotefacade.rank.list.RankListCountDownView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ChainCoinLogoView;
import com.kubi.resources.widget.TradePairFlexboxView;
import com.kubi.resources.widget.UpDownColorTextView;
import com.kubi.sdk.util.CountDownFinishCallback;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import cv.C36544a;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import rs.C44172b;

/* JADX INFO: compiled from: AlphaListAdapter.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bJ\u0010\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014J\u001c\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0014\u0010\u001d\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0002H\u0002J\u0014\u0010\u001f\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0002H\u0002J\b\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaListAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "currentParams", "Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;", "alphaMenu", "Lcom/kubi/quotefacade/constant/AlphaMenu;", "<init>", "(Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;Lcom/kubi/quotefacade/constant/AlphaMenu;)V", "firstVisiblePosition", "", "lastVisiblePosition", "longClickPosition", "isNotBindRecyclerView", "", "setLongClickPosition", "", ViewProps.POSITION, "countDownFinish", "Lcom/kubi/sdk/util/CountDownFinishCallback;", "setCountDownFinishCallback", TUIConstants.TUIChat.CALL_BACK, "convert", "helper", "item", "bindToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "renderNormal", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "renderNew", "listItemView", "Lcom/kubi/quotefacade/alpha/list/IAlphaListItemView;", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AlphaListAdapter extends BaseMultiItemQuickAdapter<AlphaItemEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Companion f41286o = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AlphaCurrent.a f41287i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final AlphaMenu f41288j;

    /* JADX INFO: renamed from: k */
    public int f41289k;

    /* JADX INFO: renamed from: l */
    public int f41290l;

    /* JADX INFO: renamed from: m */
    public int f41291m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public CountDownFinishCallback f41292n;

    /* JADX INFO: compiled from: AlphaListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaListAdapter$Companion;", "", "<init>", "()V", "ITEM_TYPE_NEW", "", "ITEM_TYPE_NORMAL", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.alpha.list.AlphaListAdapter$b */
    /* JADX INFO: compiled from: AlphaListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/alpha/list/AlphaListAdapter$bindToRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21683b extends RecyclerView.OnScrollListener {
        public C21683b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            AlphaListAdapter alphaListAdapter = AlphaListAdapter.this;
            alphaListAdapter.f41289k = linearLayoutManager.findFirstVisibleItemPosition();
            alphaListAdapter.f41290l = linearLayoutManager.findLastVisibleItemPosition();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.alpha.list.AlphaListAdapter$a */
    /* JADX INFO: compiled from: AlphaListAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C21682a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChainSortItemEnum.values().length];
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_TXCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_MAKERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_HOLDERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_MARKET_CAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_FDV.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_TVL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_CREATE_TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ChainSortItemEnum.CHAIN_SORT_TYPE_SAFELY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaListAdapter(@NotNull AlphaCurrent.a currentParams, @NotNull AlphaMenu alphaMenu) {
        super(new ArrayList());
        Intrinsics.checkNotNullParameter(currentParams, "currentParams");
        Intrinsics.checkNotNullParameter(alphaMenu, "alphaMenu");
        this.f41287i = currentParams;
        this.f41288j = alphaMenu;
        this.f41290l = 15;
        this.f41291m = -1;
        setHasStableIds(true);
        addItemType(1, R$layout.item_list_alpha_coin_preview);
        addItemType(2, R$layout.item_list_alpha_coin);
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m50535o(BaseViewHolder baseViewHolder, AlphaItemEntity alphaItemEntity, AlphaListAdapter alphaListAdapter) {
        ChainCoinLogoView chainCoinLogoView = (ChainCoinLogoView) baseViewHolder.getView(R$id.coin_icon);
        if (chainCoinLogoView != null) {
            String strM66668h = C27041f.m66668h(alphaItemEntity.getTokenIcon());
            String strM66668h2 = C27041f.m66668h(alphaItemEntity.getChainIcon());
            String strM66668h3 = C27041f.m66668h(alphaItemEntity.getDisplayToken());
            RecyclerView recyclerView = alphaListAdapter.getRecyclerView();
            ChainCoinLogoView.m54460h(chainCoinLogoView, strM66668h, strM66668h2, strM66668h3, null, null, recyclerView != null ? recyclerView.getContext() : null, 24, null);
        }
        baseViewHolder.setText(R$id.tv_symbol, C27041f.m66668h(alphaItemEntity.getDisplayToken()));
        RankListCountDownView rankListCountDownView = (RankListCountDownView) baseViewHolder.getView(R$id.layoutCountdown);
        Long alphaOpeningAt = alphaItemEntity.getAlphaOpeningAt();
        rankListCountDownView.m52797e(alphaOpeningAt != null ? Long.valueOf(alphaOpeningAt.longValue() * ((long) 1000)) : null);
        rankListCountDownView.m52796d(alphaListAdapter.f41292n);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m50536q(BaseViewHolder baseViewHolder, AlphaItemEntity alphaItemEntity, AlphaListAdapter alphaListAdapter) {
        ChainCoinLogoView chainCoinLogoView = (ChainCoinLogoView) baseViewHolder.getView(R$id.logoView);
        if (chainCoinLogoView != null) {
            String strM66668h = C27041f.m66668h(alphaItemEntity.getTokenIcon());
            String strM66668h2 = C27041f.m66668h(alphaItemEntity.getChainIcon());
            String strM66668h3 = C27041f.m66668h(alphaItemEntity.getDisplayToken());
            RecyclerView recyclerView = alphaListAdapter.getRecyclerView();
            ChainCoinLogoView.m54460h(chainCoinLogoView, strM66668h, strM66668h2, strM66668h3, null, null, recyclerView != null ? recyclerView.getContext() : null, 24, null);
        }
        TradePairFlexboxView tradePairFlexboxView = (TradePairFlexboxView) baseViewHolder.getView(R$id.tradePairFlexboxView);
        if (tradePairFlexboxView != null) {
            BaseTextView tradePairView = tradePairFlexboxView.getTradePairView();
            if (tradePairView != null) {
                tradePairView.setText(C27041f.m66668h(alphaItemEntity.getDisplayToken()));
            }
            ImageView labelViewHot = tradePairFlexboxView.getLabelViewHot();
            if (labelViewHot != null) {
                labelViewHot.setVisibility(Intrinsics.areEqual(alphaItemEntity.getHot(), Boolean.TRUE) ? 0 : 8);
            }
        }
        boolean z11 = alphaItemEntity.isShowAlphaOnDo() && alphaListAdapter.f41288j != AlphaMenu.ONDO;
        int i11 = R$id.tv_label_stock_token;
        baseViewHolder.setGone(i11, z11);
        if (z11) {
            baseViewHolder.setText(i11, alphaListAdapter.mContext.getString(R$string.market_alpha_ondo_coin_tag));
        }
        baseViewHolder.setGone(R$id.ivFav, C36544a.m81808a(alphaItemEntity));
        baseViewHolder.setText(R$id.tvVol, C22212u1.m52120b(String.valueOf(alphaItemEntity.getTradingVolume())));
        boolean z12 = RangesKt.coerceAtLeast(alphaListAdapter.f41289k, baseViewHolder.getBindingAdapterPosition()) == RangesKt.coerceAtMost(alphaListAdapter.f41290l, baseViewHolder.getBindingAdapterPosition());
        UpDownColorTextView upDownColorTextView = (UpDownColorTextView) baseViewHolder.getView(R$id.tvPrice);
        Intrinsics.checkNotNull(upDownColorTextView);
        C44172b.m97383c(upDownColorTextView, null, false, 3, null);
        upDownColorTextView.setSameSymbol(Boolean.valueOf(upDownColorTextView.getTag() != null && upDownColorTextView.getTag().equals(alphaItemEntity.getToken())));
        upDownColorTextView.setTag(alphaItemEntity.getToken());
        upDownColorTextView.setVisibleToUser(z12);
        upDownColorTextView.setText(C22212u1.m52119a(alphaItemEntity.getPrice()));
        baseViewHolder.setGone(R$id.tvRate, false);
        baseViewHolder.setGone(R$id.tvTradeCount, false);
        baseViewHolder.setGone(R$id.layoutCount, false);
        baseViewHolder.setGone(R$id.tvSingleLine, false);
        baseViewHolder.setGone(R$id.ivContainer, false);
        alphaListAdapter.m50539m().mo50661a(baseViewHolder, alphaItemEntity);
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable AlphaItemEntity alphaItemEntity) {
        if (baseViewHolder == null || alphaItemEntity == null) {
            return;
        }
        int f38450c = alphaItemEntity.getF38450c();
        if (f38450c == 1) {
            m50540n(baseViewHolder, alphaItemEntity);
        } else {
            if (f38450c != 2) {
                return;
            }
            m50541p(baseViewHolder, alphaItemEntity);
        }
    }

    /* JADX INFO: renamed from: m */
    public final IAlphaListItemView m50539m() {
        switch (C21682a.$EnumSwitchMapping$0[this.f41287i.getF41152g().ordinal()]) {
            case 1:
                return new AlphaChangeRateItemView();
            case 2:
                return new AlphaTradeCountItemView();
            case 3:
                return new AlphaMarkersItemView();
            case 4:
                return new AlphaHoldersItemView();
            case 5:
                return new AlphaMarketCapItemView();
            case 6:
                return new AlphaFdvItemView();
            case 7:
                return new AlphaTvlItemView();
            case 8:
                return new AlphaCreateTimeView();
            case 9:
                return new AlphaSafelyView();
            default:
                return new AlphaChangeRateItemView();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m50540n(final BaseViewHolder baseViewHolder, final AlphaItemEntity alphaItemEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.list.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListAdapter.m50535o(baseViewHolder, alphaItemEntity, this);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m50541p(final BaseViewHolder baseViewHolder, final AlphaItemEntity alphaItemEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.list.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListAdapter.m50536q(baseViewHolder, alphaItemEntity, this);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m50542r(@Nullable CountDownFinishCallback countDownFinishCallback) {
        this.f41292n = countDownFinishCallback;
    }

    /* JADX INFO: renamed from: s */
    public final void m50543s(int i11) {
        this.f41291m = i11;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public void bindToRecyclerView(@Nullable RecyclerView recyclerView) {
        super.bindToRecyclerView(recyclerView);
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new C21683b());
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m50538l() {
        if (getRecyclerView() == null) {
            return true;
        }
        return false;
    }
}
