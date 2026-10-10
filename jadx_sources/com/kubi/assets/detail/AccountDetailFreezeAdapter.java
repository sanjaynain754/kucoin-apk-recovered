package com.kubi.assets.detail;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$id;
import com.kubi.assets.entity.FreezeData;
import com.kubi.assets.entity.FreezeType;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.router.core.Router;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import gf.C37885i;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountDetailFreezeAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0002R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/detail/AccountDetailFreezeAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/FreezeData;", "Lio/chad/library/adapter/base/BaseViewHolder;", "layoutResId", "", FirebaseAnalytics.Param.CURRENCY, "", "freezeType", "Lcom/kubi/assets/entity/FreezeType;", "<init>", "(ILjava/lang/String;Lcom/kubi/assets/entity/FreezeType;)V", "getCurrency", "()Ljava/lang/String;", "convert", "", "helper", "item", "showTrade", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AccountDetailFreezeAdapter extends BaseQuickAdapter<FreezeData, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f16847i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final FreezeType f16848j;

    /* JADX INFO: renamed from: com.kubi.assets.detail.AccountDetailFreezeAdapter$a */
    /* JADX INFO: compiled from: AccountDetailFreezeAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C9670a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FreezeType.values().length];
            try {
                iArr[FreezeType.TRADE_FREEZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FreezeType.GREY_MARKET_FREEZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FreezeType.GEM_POOL_FREEZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDetailFreezeAdapter(@LayoutRes int i11, @Nullable String str, @NotNull FreezeType freezeType) {
        super(i11);
        Intrinsics.checkNotNullParameter(freezeType, "freezeType");
        this.f16847i = str;
        this.f16848j = freezeType;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m15841j(AccountDetailFreezeAdapter accountDetailFreezeAdapter, FreezeData freezeData) {
        int i11 = C9670a.$EnumSwitchMapping$0[accountDetailFreezeAdapter.f16848j.ordinal()];
        if (i11 == 1) {
            ISpotService iSpotServiceM19187h = AssetsDepend.f18689a.m19187h();
            String symbol = freezeData.getSymbol();
            if (symbol == null) {
                symbol = "";
            }
            ISpotService.m59984g(iSpotServiceM19187h, symbol, false, 2, null);
        } else if (i11 == 2) {
            Router.f46192a.m56184f(AssetExKt.m15122j("/pre-market/myOrder?appNeedLang=true")).m4048k();
        } else if (i11 == 3) {
            Router.f46192a.m56184f(AssetExKt.m15122j("/gempool?appNeedLang=true")).m4048k();
        }
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable FreezeData freezeData) {
        if (baseViewHolder == null || freezeData == null) {
            return;
        }
        String currency = freezeData.getCurrency();
        if (currency == null && (currency = this.f16847i) == null) {
            currency = "";
        }
        BaseViewHolder text = baseViewHolder.setText(R$id.tvTime, AssetExKt.m15121i(freezeData.getOperateTime()));
        int i11 = R$id.tvAmount;
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(freezeData.getAmount());
        String strM85563b = bigDecimalM66536f != null ? C37885i.m85563b(bigDecimalM66536f, currency, 0, 2, null) : null;
        String currency2 = freezeData.getCurrency();
        text.setText(i11, C42828b.m93906g(strM85563b, (currency2 == null && (currency2 = this.f16847i) == null) ? "" : currency2, true, false, 4, null)).setGone(R$id.view_divider, !freezeData.isHideLine());
        m15843i(baseViewHolder, freezeData);
    }

    /* JADX INFO: renamed from: i */
    public final void m15843i(BaseViewHolder baseViewHolder, final FreezeData freezeData) {
        FreezeType freezeType = this.f16848j;
        if (freezeType == FreezeType.TRADE_FREEZE || freezeType == FreezeType.GREY_MARKET_FREEZE || freezeType == FreezeType.GEM_POOL_FREEZE) {
            int i11 = R$id.tvCoinName;
            String symbol = freezeData.getSymbol();
            if (symbol == null) {
                symbol = "";
            }
            baseViewHolder.setText(i11, symbol);
        }
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.detail.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountDetailFreezeAdapter.m15841j(this.f16888b, freezeData);
            }
        }, 1, null);
    }
}
