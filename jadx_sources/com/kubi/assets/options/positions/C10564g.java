package com.kubi.assets.options.positions;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.kubi.assets.R$id;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.OptionsPositionEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import gf.C37885i;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p258fb.C37421c;
import p311hf.C38184b;
import p402kf.C41014a;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rs.AbstractC44173c;
import rs.C44172b;

/* JADX INFO: renamed from: com.kubi.assets.options.positions.g */
/* JADX INFO: compiled from: PositionItemBindExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001c\u0010\t\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001c\u0010\n\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001c\u0010\u000b\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001c\u0010\f\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001c\u0010\r\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001c\u0010\u000e\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001c\u0010\u000f\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0001*\u00020\bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"OPTION_POSITION_CURRENCY", "", "bindOptionName", "", "Lcom/kubi/assets/options/positions/OptionsPositionsFragment;", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/assets/entity/OptionsPositionEntity;", "bindTradeSide", "bindExpiryDate", "bindAmountNumber", "bindPNLNumber", "bindAvgPriceNumber", "bindMarkPriceNumber", "bindShareBtn", "bindBreakEvenNumber", "groupBreakEvenDisplayText", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPositionItemBindExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionItemBindExt.kt\ncom/kubi/assets/options/positions/PositionItemBindExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
public final class C10564g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f18170a = C38184b.f85884a.m86146a();

    /* JADX INFO: renamed from: d */
    public static final void m18175d(@NotNull OptionsPositionsFragment optionsPositionsFragment, @NotNull BaseViewHolder helper, @NotNull OptionsPositionEntity item) {
        Intrinsics.checkNotNullParameter(optionsPositionsFragment, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        ShowHideTextView showHideTextView = (ShowHideTextView) helper.getView(R$id.tv_option_amount_value);
        Intrinsics.checkNotNull(showHideTextView);
        C44172b.m97383c(showHideTextView, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        BigDecimal totalSize = item.getTotalSize();
        showHideTextView.setText(C27041f.m66669i(totalSize != null ? C37885i.m85563b(totalSize, f18170a, 0, 2, null) : null, "--"));
        ShowHideTextView showHideTextView2 = (ShowHideTextView) helper.getView(R$id.tv_option_amount_price_value);
        Intrinsics.checkNotNull(showHideTextView2);
        C44172b.m97383c(showHideTextView2, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        BigDecimal amount = item.getAmount();
        showHideTextView2.setText(C27041f.m66669i(amount != null ? C41014a.m89950x(C41014a.m89940n(amount, f18170a), null, null, 0, false, true, false, true, 47, null) : null, "--"));
    }

    /* JADX INFO: renamed from: e */
    public static final void m18176e(@NotNull OptionsPositionsFragment optionsPositionsFragment, @NotNull BaseViewHolder helper, @NotNull OptionsPositionEntity item) {
        Intrinsics.checkNotNullParameter(optionsPositionsFragment, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        ShowHideTextView showHideTextView = (ShowHideTextView) helper.getView(R$id.tv_option_average_price_value);
        BigDecimal avgPrice = item.getAvgPrice();
        showHideTextView.setText(C27041f.m66669i(avgPrice != null ? C37885i.m85563b(avgPrice, f18170a, 0, 2, null) : null, "--"));
        Intrinsics.checkNotNull(showHideTextView);
        C44172b.m97383c(showHideTextView, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
    }

    /* JADX INFO: renamed from: f */
    public static final void m18177f(@NotNull OptionsPositionsFragment optionsPositionsFragment, @NotNull BaseViewHolder helper, @NotNull OptionsPositionEntity item) {
        Intrinsics.checkNotNullParameter(optionsPositionsFragment, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        ShowHideTextView showHideTextView = (ShowHideTextView) helper.getView(R$id.tv_option_breakeven_price_and_rate_value);
        Intrinsics.checkNotNull(showHideTextView);
        C44172b.m97383c(showHideTextView, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        showHideTextView.setText(m18187p(item));
    }

    /* JADX INFO: renamed from: g */
    public static final void m18178g(@NotNull OptionsPositionsFragment optionsPositionsFragment, @NotNull BaseViewHolder helper, @NotNull OptionsPositionEntity item) {
        Intrinsics.checkNotNullParameter(optionsPositionsFragment, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Long strikeTime = item.getStrikeTime();
        helper.setText(R$id.tv_option_expiry_date, C27017c.f54310a.m66516f(R$string.option_position_due_date, new Object[0]) + ' ' + C27041f.m66669i(strikeTime != null ? C42179a.m92629b(strikeTime.longValue(), null, false, null, false, 15, null) : null, "--"));
    }

    /* JADX INFO: renamed from: h */
    public static final void m18179h(@NotNull OptionsPositionsFragment optionsPositionsFragment, @NotNull BaseViewHolder helper, @NotNull OptionsPositionEntity item) {
        Intrinsics.checkNotNullParameter(optionsPositionsFragment, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        ShowHideTextView showHideTextView = (ShowHideTextView) helper.getView(R$id.tv_option_market_price_value);
        BigDecimal markPrice = item.getMarkPrice();
        showHideTextView.setText(C27041f.m66669i(markPrice != null ? C37885i.m85563b(markPrice, f18170a, 0, 2, null) : null, "--"));
        Intrinsics.checkNotNull(showHideTextView);
        C44172b.m97383c(showHideTextView, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
    }

    /* JADX INFO: renamed from: i */
    public static final void m18180i(@NotNull OptionsPositionsFragment optionsPositionsFragment, @NotNull BaseViewHolder helper, @NotNull OptionsPositionEntity item) {
        Intrinsics.checkNotNullParameter(optionsPositionsFragment, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setText(R$id.tv_option_name, C27041f.m66669i(C42828b.m93915p(item.getProductName()), "--"));
    }

    /* JADX INFO: renamed from: j */
    public static final void m18181j(@NotNull final OptionsPositionsFragment optionsPositionsFragment, @NotNull BaseViewHolder helper, @NotNull OptionsPositionEntity item) {
        Intrinsics.checkNotNullParameter(optionsPositionsFragment, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.getView(R$id.tv_option_profit_and_loss_label);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.assets.options.positions.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10564g.m18182k(optionsPositionsFragment);
            }
        }, 1, null);
        Context contextM66513b = C27017c.f54310a.m66513b();
        BigDecimal currentProfitLossRate = item.getCurrentProfitLossRate();
        int iM54279d = C22890g.m54279d(contextM66513b, C27039d.m66646f(currentProfitLossRate != null ? Double.valueOf(currentProfitLossRate.doubleValue()) : null), 0, 2, null);
        ShowHideTextView showHideTextView = (ShowHideTextView) helper.getView(R$id.tv_option_profit_and_loss_value);
        showHideTextView.setTextColor(iM54279d);
        Intrinsics.checkNotNull(showHideTextView);
        C44172b.m97383c(showHideTextView, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        BigDecimal currentProfitLossAmount = item.getCurrentProfitLossAmount();
        showHideTextView.setText(C27041f.m66669i(currentProfitLossAmount != null ? C37885i.m85563b(currentProfitLossAmount, f18170a, 0, 2, null) : null, "--"));
        ShowHideTextView showHideTextView2 = (ShowHideTextView) helper.getView(R$id.tv_option_profit_and_loss_rate_value);
        showHideTextView2.setTextColor(iM54279d);
        Intrinsics.checkNotNull(showHideTextView2);
        C44172b.m97383c(showHideTextView2, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        BigDecimal currentProfitLossRate2 = item.getCurrentProfitLossRate();
        showHideTextView2.setText(C27041f.m66669i(currentProfitLossRate2 != null ? C41014a.m89937k(currentProfitLossRate2, null, 0, false, false, true, 15, null) : null, "--"));
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m18182k(OptionsPositionsFragment optionsPositionsFragment) {
        String string = optionsPositionsFragment.getString(R$string.option_position_tips);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.margin_profit_loss).m54156M4(string).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.assets.options.positions.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C10564g.m18183l(dialogInterface, i11);
            }
        });
        FragmentManager childFragmentManager = optionsPositionsFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "AlertDialogFragmentHelper");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final void m18184m(@NotNull OptionsPositionsFragment optionsPositionsFragment, @NotNull BaseViewHolder helper, @NotNull final OptionsPositionEntity item) {
        Intrinsics.checkNotNullParameter(optionsPositionsFragment, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        final View view = helper.getView(R$id.iv_option_share);
        if (view != null) {
            C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.assets.options.positions.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C10564g.m18185n(view, item);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m18185n(View view, OptionsPositionEntity optionsPositionEntity) {
        C37421c c37421c = C37421c.f83015a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C37421c.m84174f(c37421c, context, optionsPositionEntity, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final void m18186o(@NotNull OptionsPositionsFragment optionsPositionsFragment, @NotNull BaseViewHolder helper, @NotNull OptionsPositionEntity item) {
        Intrinsics.checkNotNullParameter(optionsPositionsFragment, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TradeSide tradeSideM18171a = C10558a.m18171a(item);
        int i11 = R$id.tv_option_trade_direct;
        BaseViewHolder textColor = helper.setText(i11, tradeSideM18171a.getTextRes()).setTextColor(i11, tradeSideM18171a.getTextColorInt());
        Intrinsics.checkNotNullExpressionValue(textColor, "setTextColor(...)");
        C22890g.m54293r(textColor, i11, tradeSideM18171a.getBgDrawable());
    }

    /* JADX INFO: renamed from: p */
    public static final String m18187p(OptionsPositionEntity optionsPositionEntity) {
        BigDecimal breakEvenPrice = optionsPositionEntity.getBreakEvenPrice();
        String strM85563b = null;
        if (breakEvenPrice != null) {
            strM85563b = C37885i.m85563b(breakEvenPrice, f18170a, 0, 2, null);
        }
        return C27041f.m66669i(strM85563b, "--");
    }

    /* JADX INFO: renamed from: l */
    public static final void m18183l(DialogInterface dialogInterface, int i11) {
    }
}
