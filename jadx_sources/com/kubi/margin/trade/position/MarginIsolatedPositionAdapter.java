package com.kubi.margin.trade.position;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.coin.TransferJumper;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.R$color;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$mipmap;
import com.kubi.margin.R$string;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.margin.entity.IsolateMarginPositionConfig;
import com.kubi.margin.entity.LeverBean;
import com.kubi.margin.trade.MarginConfigManager;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.DashTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37754f;
import g00.InterfaceC37756h;
import gf.C37885i;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43846g;
import p569qq.C43852m;
import p830zf.InterfaceC46815o0;
import p838zo.C46897a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import q30.C43608h;
import rs.AbstractC44173c;
import rs.C44172b;

/* JADX INFO: compiled from: MarginIsolatedPositionAdapter.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0015J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u001c\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J+\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\"2\b\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010$J+\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\"2\b\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010$J\u001a\u0010&\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u0014\u0010)\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006*"}, m90084d2 = {"Lcom/kubi/margin/trade/position/MarginIsolatedPositionAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/margin/api/entity/MarginPosition;", "Lio/chad/library/adapter/base/BaseViewHolder;", "currentSymbol", "Lcom/kubi/data/entity/SymbolInfoEntity;", "fragment", "Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;", "<init>", "(Lcom/kubi/data/entity/SymbolInfoEntity;Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;)V", "getCurrentSymbol", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "setCurrentSymbol", "(Lcom/kubi/data/entity/SymbolInfoEntity;)V", "getFragment", "()Lcom/kubi/margin/trade/position/MarginIsolatedPositionFragment;", "convert", "", "helper", ViewProps.POSITION, "handleCancelClosePosition", "toTransfer", FirebaseAnalytics.Param.CURRENCY, "", "symbol", "showAssetDialog", "showAssetDebtDialog", "showShareView", "Landroid/graphics/Bitmap;", "direction", "", "getDebtRate", "", "getDebt", "Lkotlin/Pair;", "isBuy", "(Ljava/lang/Boolean;Lcom/kubi/margin/api/entity/MarginPosition;)Lkotlin/Pair;", "getPositionAmount", "showMarginRiskDialog", "config", "Lcom/kubi/margin/entity/IsolateMarginPositionConfig;", "getShowSymbol", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginIsolatedPositionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginIsolatedPositionAdapter.kt\ncom/kubi/margin/trade/position/MarginIsolatedPositionAdapter\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,694:1\n17#2,2:695\n35#3,4:697\n39#3:703\n44#4,2:701\n*S KotlinDebug\n*F\n+ 1 MarginIsolatedPositionAdapter.kt\ncom/kubi/margin/trade/position/MarginIsolatedPositionAdapter\n*L\n151#1:695,2\n243#1:697,4\n243#1:703\n243#1:701,2\n*E\n"})
public final class MarginIsolatedPositionAdapter extends BaseQuickAdapter<MarginPosition, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public SymbolInfoEntity f33987i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final MarginIsolatedPositionFragment f33988j;

    /* JADX INFO: renamed from: com.kubi.margin.trade.position.MarginIsolatedPositionAdapter$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C18411a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: V */
    public final Pair<String, String> m40402V(Boolean bool, MarginPosition marginPosition) {
        if (C27025c.m66567e(bool, true)) {
            CurrencyBalance baseAsset = marginPosition.getBaseAsset();
            String strM66668h = C27041f.m66668h(baseAsset != null ? baseAsset.getCurrencyName() : null);
            CurrencyBalance baseAsset2 = marginPosition.getBaseAsset();
            return new Pair<>(strM66668h, C27041f.m66669i(baseAsset2 != null ? C46897a.m103305q(baseAsset2) : null, "--"));
        }
        CurrencyBalance quoteAsset = marginPosition.getQuoteAsset();
        String strM66668h2 = C27041f.m66668h(quoteAsset != null ? quoteAsset.getCurrencyName() : null);
        CurrencyBalance quoteAsset2 = marginPosition.getQuoteAsset();
        return new Pair<>(strM66668h2, C27041f.m66669i(quoteAsset2 != null ? C46897a.m103305q(quoteAsset2) : null, "--"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginIsolatedPositionAdapter(@NotNull SymbolInfoEntity currentSymbol, @NotNull MarginIsolatedPositionFragment fragment) {
        super(R$layout.bmargin_item_isolated_position_new);
        Intrinsics.checkNotNullParameter(currentSymbol, "currentSymbol");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f33987i = currentSymbol;
        this.f33988j = fragment;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m40357I(int i11, MarginIsolatedPositionAdapter marginIsolatedPositionAdapter) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(i11);
        C27017c c27017c = C27017c.f54310a;
        alertDialogFragmentHelperM54167X4.m54156M4(c27017c.m66516f(R$string.margin_dialog_profit_loss_tips_new, new Object[0])).m54163T4(c27017c.m66516f(R$string.i_know, new Object[0]), null).m54172c5(marginIsolatedPositionAdapter.f33988j.getChildFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final void m40358J(MarginPosition marginPosition, View view) {
        InterfaceC37749a.a.m85109d(C37304a.f82764a, C27041f.m66668h(marginPosition.getTag()), 5L, null, null, null, 28, null);
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m40359K(MarginIsolatedPositionAdapter marginIsolatedPositionAdapter, MarginPosition marginPosition) {
        C43852m.m96591c("B4tradingIsolated", "orderManagement", "17", null, 8, null);
        marginIsolatedPositionAdapter.m40407e0(marginPosition);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m40361M(MarginPosition marginPosition) {
        C43852m.m96591c("B4tradingIsolated", "orderManagement", "15", null, 8, null);
        C37304a c37304a = C37304a.f82764a;
        String tag = marginPosition.getTag();
        CurrencyBalance quoteAsset = marginPosition.getQuoteAsset();
        InterfaceC37756h.a.m85144b(c37304a, quoteAsset != null ? quoteAsset.getCurrency() : null, tag, "repay", "isolated", C43852m.m96601m("B4tradingIsolated", "orderManagement", "15"), null, null, 96, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m40363O(MarginIsolatedPositionAdapter marginIsolatedPositionAdapter, MarginPosition marginPosition) {
        C43852m.m96591c("B4tradingIsolated", "orderManagement", "14", null, 8, null);
        marginIsolatedPositionAdapter.f33988j.m40507j4(marginPosition);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final void m40364P(MarginIsolatedPositionAdapter marginIsolatedPositionAdapter, MarginPosition marginPosition, View view) {
        marginIsolatedPositionAdapter.m40410o0(marginIsolatedPositionAdapter.f33987i.getQuoteCurrency(), marginPosition.getTag());
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m40365Q(MarginIsolatedPositionAdapter marginIsolatedPositionAdapter, MarginPosition marginPosition, boolean z11) {
        C43852m.m96591c("B4tradingIsolated", "orderManagement", "16", null, 8, null);
        IShareService iShareService = IShareService.f49268a.get();
        ImageShareParam imageShareParam = new ImageShareParam("m_p_share", null, false, null, false, null, null, null, null, null, 1022, null);
        imageShareParam.setBitmap(marginIsolatedPositionAdapter.m40409n0(marginPosition, z11));
        IShareService.m59640c(iShareService, imageShareParam, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static final void m40367Y(MarginIsolatedPositionAdapter marginIsolatedPositionAdapter, MarginPosition marginPosition, DialogInterface dialogInterface, int i11) {
        marginIsolatedPositionAdapter.f33988j.m40503c4(marginPosition);
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m40368b0(MarginPosition marginPosition, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        int i11 = R$id.tv_base;
        CurrencyBalance baseAsset = marginPosition.getBaseAsset();
        viewHolder.setText(i11, baseAsset != null ? baseAsset.getCurrencyName() : null);
        int i12 = R$id.tv_quote;
        CurrencyBalance quoteAsset = marginPosition.getQuoteAsset();
        viewHolder.setText(i12, quoteAsset != null ? quoteAsset.getCurrencyName() : null);
        int i13 = R$id.tv_total_base;
        CurrencyBalance baseAsset2 = marginPosition.getBaseAsset();
        viewHolder.setText(i13, C27041f.m66669i(baseAsset2 != null ? C46897a.m103298j(baseAsset2) : null, C33820nf.f71144W));
        int i14 = R$id.tv_total_quote;
        CurrencyBalance quoteAsset2 = marginPosition.getQuoteAsset();
        viewHolder.setText(i14, C27041f.m66669i(quoteAsset2 != null ? C46897a.m103298j(quoteAsset2) : null, C33820nf.f71144W));
        int i15 = R$id.tv_freeze_base;
        CurrencyBalance baseAsset3 = marginPosition.getBaseAsset();
        viewHolder.setText(i15, C27041f.m66669i(baseAsset3 != null ? C46897a.m103302n(baseAsset3) : null, C33820nf.f71144W));
        int i16 = R$id.tv_freeze_quote;
        CurrencyBalance quoteAsset3 = marginPosition.getQuoteAsset();
        viewHolder.setText(i16, C27041f.m66669i(quoteAsset3 != null ? C46897a.m103302n(quoteAsset3) : null, C33820nf.f71144W));
        int i17 = R$id.tvAvailableBase;
        CurrencyBalance baseAsset4 = marginPosition.getBaseAsset();
        viewHolder.setText(i17, C27041f.m66669i(baseAsset4 != null ? C46897a.m103303o(baseAsset4) : null, C33820nf.f71144W));
        int i18 = R$id.tvAvailableQuote;
        CurrencyBalance quoteAsset4 = marginPosition.getQuoteAsset();
        viewHolder.setText(i18, C27041f.m66669i(quoteAsset4 != null ? C46897a.m103303o(quoteAsset4) : null, C33820nf.f71144W));
        viewHolder.setOnClickListener(R$id.tvTitle, new View.OnClickListener() { // from class: com.kubi.margin.trade.position.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarginIsolatedPositionAdapter.m40369c0(dialogFragmentHelper, view);
            }
        });
        viewHolder.setOnClickListener(R$id.tvBtnOk, new View.OnClickListener() { // from class: com.kubi.margin.trade.position.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarginIsolatedPositionAdapter.m40370d0(dialogFragmentHelper, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m40371f0(final MarginPosition marginPosition, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        int i11 = R$id.tv_base;
        CurrencyBalance baseAsset = marginPosition.getBaseAsset();
        viewHolder.setText(i11, baseAsset != null ? baseAsset.getCurrencyName() : null);
        int i12 = R$id.tv_quote;
        CurrencyBalance quoteAsset = marginPosition.getQuoteAsset();
        viewHolder.setText(i12, quoteAsset != null ? quoteAsset.getCurrencyName() : null);
        int i13 = R$id.tv_total_base;
        CurrencyBalance baseAsset2 = marginPosition.getBaseAsset();
        viewHolder.setText(i13, C27041f.m66669i(baseAsset2 != null ? C46897a.m103305q(baseAsset2) : null, C33820nf.f71144W));
        int i14 = R$id.tv_total_quote;
        CurrencyBalance quoteAsset2 = marginPosition.getQuoteAsset();
        viewHolder.setText(i14, C27041f.m66669i(quoteAsset2 != null ? C46897a.m103305q(quoteAsset2) : null, C33820nf.f71144W));
        int i15 = R$id.tv_freeze_base;
        CurrencyBalance baseAsset3 = marginPosition.getBaseAsset();
        viewHolder.setText(i15, C27041f.m66669i(baseAsset3 != null ? C46897a.m103301m(baseAsset3) : null, C33820nf.f71144W));
        int i16 = R$id.tv_freeze_quote;
        CurrencyBalance quoteAsset3 = marginPosition.getQuoteAsset();
        viewHolder.setText(i16, C27041f.m66669i(quoteAsset3 != null ? C46897a.m103301m(quoteAsset3) : null, C33820nf.f71144W));
        int i17 = R$id.tv_debt_base;
        CurrencyBalance baseAsset4 = marginPosition.getBaseAsset();
        viewHolder.setText(i17, C27041f.m66669i(baseAsset4 != null ? C46897a.m103298j(baseAsset4) : null, C33820nf.f71144W));
        int i18 = R$id.tv_debt_quote;
        CurrencyBalance quoteAsset4 = marginPosition.getQuoteAsset();
        viewHolder.setText(i18, C27041f.m66669i(quoteAsset4 != null ? C46897a.m103298j(quoteAsset4) : null, C33820nf.f71144W));
        int i19 = R$id.tvAvailableBase;
        CurrencyBalance baseAsset5 = marginPosition.getBaseAsset();
        viewHolder.setText(i19, C27041f.m66669i(baseAsset5 != null ? C46897a.m103290b(baseAsset5) : null, C33820nf.f71144W));
        int i21 = R$id.tvAvailableQuote;
        CurrencyBalance quoteAsset5 = marginPosition.getQuoteAsset();
        viewHolder.setText(i21, C27041f.m66669i(quoteAsset5 != null ? C46897a.m103290b(quoteAsset5) : null, C33820nf.f71144W));
        int i22 = R$id.tvNetBalanceBase;
        CurrencyBalance baseAsset6 = marginPosition.getBaseAsset();
        viewHolder.setText(i22, C27041f.m66669i(baseAsset6 != null ? C46897a.m103294f(baseAsset6) : null, C33820nf.f71144W));
        int i23 = R$id.tvNetBalanceQuote;
        CurrencyBalance quoteAsset6 = marginPosition.getQuoteAsset();
        viewHolder.setText(i23, C27041f.m66669i(quoteAsset6 != null ? C46897a.m103294f(quoteAsset6) : null, C33820nf.f71144W));
        int i24 = R$id.tvMaxOutBase;
        CurrencyBalance baseAsset7 = marginPosition.getBaseAsset();
        viewHolder.setText(i24, C27041f.m66669i(baseAsset7 != null ? C46897a.m103293e(baseAsset7) : null, C33820nf.f71144W));
        int i25 = R$id.tvMaxOutQuote;
        CurrencyBalance quoteAsset7 = marginPosition.getQuoteAsset();
        viewHolder.setText(i25, C27041f.m66669i(quoteAsset7 != null ? C46897a.m103293e(quoteAsset7) : null, C33820nf.f71144W));
        viewHolder.setOnClickListener(R$id.viewMore, new View.OnClickListener() { // from class: com.kubi.margin.trade.position.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarginIsolatedPositionAdapter.m40373g0(marginPosition, dialogFragmentHelper, view);
            }
        });
        viewHolder.setOnClickListener(R$id.tvTitle, new View.OnClickListener() { // from class: com.kubi.margin.trade.position.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarginIsolatedPositionAdapter.m40375h0(dialogFragmentHelper, view);
            }
        });
        viewHolder.setOnClickListener(R$id.tvBtnOk, new View.OnClickListener() { // from class: com.kubi.margin.trade.position.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarginIsolatedPositionAdapter.m40377i0(dialogFragmentHelper, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m40373g0(MarginPosition marginPosition, DialogFragmentHelper dialogFragmentHelper, View view) {
        InterfaceC37749a.a.m85109d(C37304a.f82764a, C27041f.m66668h(marginPosition.getTag()), 5L, null, null, null, 28, null);
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: k0 */
    public static final Unit m40380k0() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m40382l0(BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        TextView textView = (TextView) viewHolder.getView(R$id.tv_content);
        if (textView != null) {
            HighlightTextHelper.f43497a.m54116a(textView, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.c_text)));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m40384m0(SymbolInfoEntity symbolInfoEntity, DialogInterface dialogInterface, int i11) {
        TransferJumper.Companion.jumpToTransfer$default(TransferJumper.f21427a, C27041f.m66668h(symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null), null, C27041f.m66668h(symbolInfoEntity != null ? symbolInfoEntity.getSymbol() : null), "TRADE", SharedPositionInfo.MARGIN_MODE_ISOLATED, false, null, 98, null);
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m40388p0(String str, String str2) {
        TransferJumper.Companion.jumpToTransfer$default(TransferJumper.f21427a, str, null, str2, "TRADE", SharedPositionInfo.MARGIN_MODE_ISOLATED, false, C43852m.m96601m("B4tradingIsolated", "orderManagement", "13"), 34, null);
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"SetTextI18n", "KCCyclomaticComplexityCheck", "KCLongMethodCheck"})
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable final MarginPosition marginPosition) {
        Object objM20457a;
        if (marginPosition == null || baseViewHolder == null) {
            return;
        }
        if (!marginPosition.isOpenStatus()) {
            String strM40403W = m40403W(marginPosition.getSymbol());
            baseViewHolder.setGone(R$id.view_empty, true);
            baseViewHolder.setGone(R$id.view_content, false);
            baseViewHolder.setText(R$id.symbolName, strM40403W);
            int i11 = R$id.tv_empty_tips;
            C27017c c27017c = C27017c.f54310a;
            baseViewHolder.setText(i11, c27017c.m66516f(R$string.margin_account_empty_tips, c27017c.m66516f(R$string.margin_single_symbol_account, '-' + strM40403W)));
            baseViewHolder.setOnClickListener(R$id.tv_transfer_empty, new View.OnClickListener() { // from class: com.kubi.margin.trade.position.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MarginIsolatedPositionAdapter.m40364P(this.f34025b, marginPosition, view);
                }
            });
            return;
        }
        baseViewHolder.setGone(R$id.view_empty, false);
        baseViewHolder.setGone(R$id.view_content, true);
        final IsolateMarginPositionConfig isolateMarginPositionConfigM39872S0 = MarginConfigManager.f33681a.m39872S0(C27041f.m66668h(marginPosition.getTag()));
        baseViewHolder.setGone(R$id.iv_arrow, !Intrinsics.areEqual(marginPosition.getTag(), this.f33987i.getCode()));
        int i12 = R$id.tvSymbol;
        View view = baseViewHolder.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.margin.trade.position.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginIsolatedPositionAdapter.m40355G(marginPosition, this);
            }
        }, 1, null);
        baseViewHolder.setText(i12, m40403W(marginPosition.getSymbol()));
        if (marginPosition.getUserLeverage() != null) {
            baseViewHolder.setText(R$id.leverage, C42180b.m92640e(C27039d.m66656p(marginPosition.getUserLeverage()), null, 4, false, false, false, 0, null, 125, null) + 'x');
        }
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvType);
        Intrinsics.checkNotNull(textView);
        ViewExtKt.m66577h(textView);
        Boolean boolIsShowDirection = marginPosition.isShowDirection();
        if (boolIsShowDirection != null) {
            boolean zBooleanValue = boolIsShowDirection.booleanValue();
            ViewExtKt.m66594y(textView);
            textView.setText(C27017c.f54310a.m66516f(zBooleanValue ? R$string.multi : R$string.empty, new Object[0]));
            Context contextRequireContext = this.f33988j.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            textView.setBackground(C22890g.m54288m(C22890g.m54281f(contextRequireContext, zBooleanValue), 0.0f, 2, null));
        } else {
            boolIsShowDirection = null;
        }
        View view2 = baseViewHolder.getView(R$id.divider);
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.iv_share);
        Intrinsics.checkNotNull(imageView);
        ViewExtKt.m66577h(imageView);
        Intrinsics.checkNotNull(view2);
        ViewExtKt.m66577h(view2);
        Boolean boolIsShowDirection2 = marginPosition.isShowDirection();
        if (boolIsShowDirection2 != null) {
            final boolean zBooleanValue2 = boolIsShowDirection2.booleanValue();
            if (Intrinsics.areEqual(marginPosition.getStatus(), "IN_AUTO_RENEW")) {
                ViewExtKt.m66577h(imageView);
                ViewExtKt.m66577h(view2);
            } else {
                ViewExtKt.m66594y(imageView);
                ViewExtKt.m66594y(view2);
                C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.margin.trade.position.e0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginIsolatedPositionAdapter.m40365Q(this.f34030b, marginPosition, zBooleanValue2);
                    }
                }, 1, null);
            }
        }
        Pair<String, String> pairM40400T = m40400T(boolIsShowDirection, marginPosition);
        DashTextView dashTextView = (DashTextView) baseViewHolder.getView(R$id.tv_debt);
        dashTextView.setNeedDash(true);
        StringBuilder sb2 = new StringBuilder();
        C27017c c27017c2 = C27017c.f54310a;
        sb2.append(c27017c2.m66516f(R$string.total_debt, new Object[0]));
        sb2.append('(');
        sb2.append(pairM40400T.getFirst());
        sb2.append(')');
        dashTextView.setText(sb2.toString());
        Intrinsics.checkNotNull(dashTextView);
        C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.margin.trade.position.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginIsolatedPositionAdapter.m40366R(this.f34036b, marginPosition);
            }
        }, 1, null);
        int i13 = R$id.tv_debt_value;
        baseViewHolder.setText(i13, pairM40400T.getSecond());
        DashTextView dashTextView2 = (DashTextView) baseViewHolder.getView(R$id.tv_debt_rate);
        dashTextView2.setNeedDash(true);
        Intrinsics.checkNotNull(dashTextView2);
        C27046k.m66711z(dashTextView2, 0L, new Function0() { // from class: com.kubi.margin.trade.position.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginIsolatedPositionAdapter.m40356H(this.f34040b, marginPosition, isolateMarginPositionConfigM39872S0);
            }
        }, 1, null);
        ((TextView) baseViewHolder.getView(R$id.tv_debt_rate_value)).setText(m40401U(marginPosition));
        Pair<String, String> pairM40402V = m40402V(boolIsShowDirection, marginPosition);
        baseViewHolder.setText(R$id.tv_amount, c27017c2.m66516f(R$string.hold_ptn, new Object[0]) + '(' + pairM40402V.getFirst() + ')');
        int i14 = R$id.tv_amount_value;
        baseViewHolder.setText(i14, pairM40402V.getSecond());
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46815o0.class, SiteInfoManager.f47913a.m58109c());
        final int i15 = objM56186h != null ? ((InterfaceC46815o0) objM56186h).mo102977a() : false ? R$string.kc_trade_pnl_incl_fees : R$string.margin_profit_loss;
        DashTextView dashTextView3 = (DashTextView) baseViewHolder.getView(R$id.tv_profit);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(c27017c2.m66516f(i15, new Object[0]));
        sb3.append('(');
        CurrencyBalance quoteAsset = marginPosition.getQuoteAsset();
        sb3.append(quoteAsset != null ? quoteAsset.getCurrencyName() : null);
        sb3.append(')');
        dashTextView3.setText(sb3.toString());
        dashTextView3.setNeedDash(true);
        Intrinsics.checkNotNull(dashTextView3);
        C27046k.m66711z(dashTextView3, 0L, new Function0() { // from class: com.kubi.margin.trade.position.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginIsolatedPositionAdapter.m40357I(i15, this);
            }
        }, 1, null);
        baseViewHolder.setOnClickListener(R$id.iv_more, new View.OnClickListener() { // from class: com.kubi.margin.trade.position.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                MarginIsolatedPositionAdapter.m40358J(marginPosition, view3);
            }
        });
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_profit_value);
        textView2.setText(C27041f.m66669i(marginPosition.getProfitValueString(isolateMarginPositionConfigM39872S0 != null ? isolateMarginPositionConfigM39872S0.getPnlPrecision() : null), "--"));
        Context contextRequireContext2 = this.f33988j.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        textView2.setTextColor(C22890g.m54278c(contextRequireContext2, C27039d.m66647g(marginPosition.calculatorProfitValue()), R$color.c_text60));
        baseViewHolder.setText(R$id.tv_profit_value_legal, marginPosition.getProfitValueLegalString("--"));
        int i16 = R$id.tv_mark_price_value;
        baseViewHolder.setText(i16, marginPosition.getMarkPriceString());
        int i17 = R$id.tv_liquid_price;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(c27017c2.m66516f(R$string.kc_futures_grid_force_price, new Object[0]));
        sb4.append('(');
        CurrencyBalance quoteAsset2 = marginPosition.getQuoteAsset();
        sb4.append(quoteAsset2 != null ? quoteAsset2.getCurrencyName() : null);
        sb4.append(')');
        baseViewHolder.setText(i17, sb4.toString());
        int i18 = R$id.tv_liquid_price_value;
        baseViewHolder.setText(i18, marginPosition.liquidationPriceString(isolateMarginPositionConfigM39872S0 != null ? isolateMarginPositionConfigM39872S0.getFlDebtRatio() : null));
        DashTextView dashTextView4 = (DashTextView) baseViewHolder.getView(R$id.tv_asset_label);
        dashTextView4.setNeedDash(true);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(c27017c2.m66516f(R$string.total_assets, new Object[0]));
        sb5.append('(');
        CurrencyBalance quoteAsset3 = marginPosition.getQuoteAsset();
        sb5.append(quoteAsset3 != null ? quoteAsset3.getCurrencyName() : null);
        sb5.append(')');
        dashTextView4.setText(sb5.toString());
        Intrinsics.checkNotNull(dashTextView4);
        C27046k.m66711z(dashTextView4, 0L, new Function0() { // from class: com.kubi.margin.trade.position.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginIsolatedPositionAdapter.m40359K(this.f34054b, marginPosition);
            }
        }, 1, null);
        int i19 = R$id.tv_asset_value;
        View view3 = baseViewHolder.getView(i19);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C44172b.m97383c((TextView) view3, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        View view4 = baseViewHolder.getView(i13);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        C44172b.m97383c((TextView) view4, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        View view5 = baseViewHolder.getView(i14);
        Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
        C44172b.m97383c((TextView) view5, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        View view6 = baseViewHolder.getView(i16);
        Intrinsics.checkNotNullExpressionValue(view6, "getView(...)");
        C44172b.m97383c((TextView) view6, null, false, 3, null);
        View view7 = baseViewHolder.getView(i18);
        Intrinsics.checkNotNullExpressionValue(view7, "getView(...)");
        C44172b.m97383c((TextView) view7, null, false, 3, null);
        baseViewHolder.setText(i19, marginPosition.getAssetQuoteBalanceString());
        TextView textView3 = (TextView) baseViewHolder.getView(R$id.tv_transfer);
        textView3.setEnabled(marginPosition.isTransferEnable());
        textView3.setText(c27017c2.m66516f(R$string.transfer, new Object[0]));
        Intrinsics.checkNotNull(textView3);
        C27046k.m66711z(textView3, 0L, new Function0() { // from class: com.kubi.margin.trade.position.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginIsolatedPositionAdapter.m40360L(this.f34059b, marginPosition);
            }
        }, 1, null);
        TextView textView4 = (TextView) baseViewHolder.getView(R$id.tv_return);
        Intrinsics.checkNotNull(textView4);
        C27046k.m66711z(textView4, 0L, new Function0() { // from class: com.kubi.margin.trade.position.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginIsolatedPositionAdapter.m40361M(marginPosition);
            }
        }, 1, null);
        TextView textView5 = (TextView) baseViewHolder.getView(R$id.tv_close_position);
        if (Intrinsics.areEqual(marginPosition.getStatus(), "IN_LIQUIDATION") && Intrinsics.areEqual(marginPosition.getStatusBizType(), "ONE_CLICK_LIQUIDATION")) {
            textView5.setText(R$string.margin_cancel_close_position);
            textView5.setBackgroundResource(R$drawable.selector_btn_primary_24r);
            textView5.setTextColor(c27017c2.m66512a(R$color.c_textEmphasis));
            textView5.setEnabled(true);
            Intrinsics.checkNotNull(textView5);
            ViewExtKt.m66594y(textView5);
            C27046k.m66710y(textView5, 300L, new Function0() { // from class: com.kubi.margin.trade.position.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginIsolatedPositionAdapter.m40362N(this.f34120b, marginPosition);
                }
            });
            return;
        }
        textView5.setText(R$string.kumex_liquidation);
        textView5.setBackgroundResource(R$drawable.bmargin_selector_for_btn);
        textView5.setTextColor(textView5.getResources().getColorStateList(R$color.selector_color_for_normal_btn_text));
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C18411a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("margin_close_position", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        if (!C27025c.m66566d((Boolean) objM20457a)) {
            Intrinsics.checkNotNull(textView5);
            ViewExtKt.m66577h(textView5);
        } else {
            Intrinsics.checkNotNull(textView5);
            ViewExtKt.m66594y(textView5);
            textView5.setEnabled(marginPosition.isCloseEnable());
            C27046k.m66710y(textView5, 300L, new Function0() { // from class: com.kubi.margin.trade.position.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginIsolatedPositionAdapter.m40363O(this.f34154b, marginPosition);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: S, reason: from getter */
    public final SymbolInfoEntity getF33987i() {
        return this.f33987i;
    }

    /* JADX INFO: renamed from: T */
    public final Pair<String, String> m40400T(Boolean bool, MarginPosition marginPosition) {
        Pair<String, String> pair;
        BigDecimal bigDecimalDivide;
        String strM85563b;
        BigDecimal bigDecimalDivide2;
        String strM85563b2;
        String strM66669i = "--";
        try {
            if (C27025c.m66567e(bool, true)) {
                BigDecimal liabilityConversionBalance = marginPosition.getLiabilityConversionBalance();
                if (liabilityConversionBalance != null) {
                    CurrencyBalance quoteAsset = marginPosition.getQuoteAsset();
                    bigDecimalDivide2 = liabilityConversionBalance.divide(quoteAsset != null ? quoteAsset.getMarkPrice() : null, RoundingMode.DOWN);
                } else {
                    bigDecimalDivide2 = null;
                }
                if (bigDecimalDivide2 != null) {
                    CurrencyBalance quoteAsset2 = marginPosition.getQuoteAsset();
                    strM85563b2 = C37885i.m85563b(bigDecimalDivide2, quoteAsset2 != null ? quoteAsset2.getCurrency() : null, 0, 2, null);
                } else {
                    strM85563b2 = null;
                }
                strM66669i = C27041f.m66669i(strM85563b2, "--");
            } else {
                BigDecimal liabilityConversionBalance2 = marginPosition.getLiabilityConversionBalance();
                if (liabilityConversionBalance2 != null) {
                    CurrencyBalance baseAsset = marginPosition.getBaseAsset();
                    bigDecimalDivide = liabilityConversionBalance2.divide(baseAsset != null ? baseAsset.getMarkPrice() : null, RoundingMode.DOWN);
                } else {
                    bigDecimalDivide = null;
                }
                if (bigDecimalDivide != null) {
                    CurrencyBalance baseAsset2 = marginPosition.getBaseAsset();
                    strM85563b = C37885i.m85563b(bigDecimalDivide, baseAsset2 != null ? baseAsset2.getCurrency() : null, 0, 2, null);
                } else {
                    strM85563b = null;
                }
                strM66669i = C27041f.m66669i(strM85563b, "--");
            }
        } catch (Exception unused) {
        }
        if (C27025c.m66567e(bool, true)) {
            CurrencyBalance quoteAsset3 = marginPosition.getQuoteAsset();
            pair = new Pair<>(C27041f.m66668h(quoteAsset3 != null ? quoteAsset3.getCurrency() : null), strM66669i);
        } else {
            CurrencyBalance baseAsset3 = marginPosition.getBaseAsset();
            pair = new Pair<>(C27041f.m66668h(baseAsset3 != null ? baseAsset3.getCurrency() : null), strM66669i);
        }
        return pair;
    }

    /* JADX INFO: renamed from: W */
    public final String m40403W(String str) {
        if (str == null || str.length() == 0) {
            return "--";
        }
        return StringsKt.contains$default((CharSequence) str, (CharSequence) C33820nf.f71144W, false, 2, (Object) null) ? StringsKt.replace$default(str, C33820nf.f71144W, "/", false, 4, (Object) null) : str;
    }

    /* JADX INFO: renamed from: X */
    public final void m40404X(final MarginPosition marginPosition) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.margin_cancel_close_position).m54153J4(R$string.margin_cancel_close_position_desc).m54159P4(R$string.cancel, null).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: com.kubi.margin.trade.position.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                MarginIsolatedPositionAdapter.m40367Y(this.f34141b, marginPosition, dialogInterface, i11);
            }
        });
        FragmentManager childFragmentManager = this.f33988j.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "tips_auto");
    }

    /* JADX INFO: renamed from: Z */
    public final void m40405Z(@NotNull SymbolInfoEntity symbolInfoEntity) {
        Intrinsics.checkNotNullParameter(symbolInfoEntity, "<set-?>");
        this.f33987i = symbolInfoEntity;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m40406a0(final MarginPosition marginPosition) {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.bmargin_dialog_isolate_account_debet, true).m54237f4(new Function2() { // from class: com.kubi.margin.trade.position.t
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MarginIsolatedPositionAdapter.m40368b0(marginPosition, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = this.f33988j.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "showAssetDebtDialog");
    }

    /* JADX INFO: renamed from: e0 */
    public final void m40407e0(final MarginPosition marginPosition) {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.bmargin_dialog_isolate_account_detail, true).m54237f4(new Function2() { // from class: com.kubi.margin.trade.position.u
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MarginIsolatedPositionAdapter.m40371f0(marginPosition, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = this.f33988j.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "tv_asset_label");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:29:0x010d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0127  */
    /* JADX WARN: Code duplicated, block: B:34:0x0142  */
    /* JADX WARN: Code duplicated, block: B:47:0x0177  */
    /* JADX WARN: Code duplicated, block: B:50:0x0180  */
    /* JADX WARN: Code duplicated, block: B:51:0x0183  */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0088, please report this as an issue */
    /* JADX INFO: renamed from: j0 */
    public final void m40408j0(MarginPosition marginPosition, IsolateMarginPositionConfig isolateMarginPositionConfig) {
        C27096v0 c27096v0;
        String strM92642g;
        String strM92642g2;
        BigDecimal flDebtRatio;
        BigDecimal transferOutMaxDebtRatio;
        int i11;
        final SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(marginPosition.getTag());
        MarginIsolatedPositionFragment marginIsolatedPositionFragment = this.f33988j;
        int i12 = R$string.margin_single_symbol_account;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('-');
        sb2.append(C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null));
        String string = marginIsolatedPositionFragment.getString(i12, sb2.toString());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String strM66668h = C27041f.m66668h(marginPosition.getStatus());
        switch (strM66668h.hashCode()) {
            case -2033975059:
                if (!strM66668h.equals("LIABILITY")) {
                    c27096v0 = new C27096v0();
                    c27096v0.append(this.f33988j.getString(R$string.kc_margin_riskrate_description) + '\n');
                    c27096v0.append(this.f33988j.getString(R$string.kc_margin_pledge_rate_description) + '\n');
                    StringBuilder sb3 = new StringBuilder();
                    MarginIsolatedPositionFragment marginIsolatedPositionFragment2 = this.f33988j;
                    int i13 = R$string.kc_margin_pledge_rate_description2;
                    if (isolateMarginPositionConfig != null || (transferOutMaxDebtRatio = isolateMarginPositionConfig.getTransferOutMaxDebtRatio()) == null) {
                        strM92642g = null;
                    } else {
                        strM92642g = C42180b.m92642g(transferOutMaxDebtRatio, null, null, 0, false, false, false, 63, null);
                    }
                    sb3.append(marginIsolatedPositionFragment2.getString(i13, C42180b.m92649n(strM92642g)));
                    sb3.append('\n');
                    c27096v0.append(sb3.toString());
                    StringBuilder sb4 = new StringBuilder();
                    MarginIsolatedPositionFragment marginIsolatedPositionFragment3 = this.f33988j;
                    int i14 = R$string.kc_margin_riskrate_description2;
                    if (isolateMarginPositionConfig != null || (flDebtRatio = isolateMarginPositionConfig.getFlDebtRatio()) == null) {
                        strM92642g2 = null;
                    } else {
                        strM92642g2 = C42180b.m92642g(flDebtRatio, null, null, 0, false, false, false, 63, null);
                    }
                    sb4.append(marginIsolatedPositionFragment3.getString(i14, C42180b.m92649n(strM92642g2)));
                    sb4.append('\n');
                    c27096v0.append(sb4.toString());
                } else {
                    c27096v0 = new C27096v0().append(this.f33988j.getString(R$string.margin_dialog_liability_tips, string));
                    Intrinsics.checkNotNull(c27096v0);
                }
                break;
            case -1060904193:
                if (!strM66668h.equals("IN_LIQUIDATION")) {
                    c27096v0 = new C27096v0();
                    c27096v0.append(this.f33988j.getString(R$string.kc_margin_riskrate_description) + '\n');
                    c27096v0.append(this.f33988j.getString(R$string.kc_margin_pledge_rate_description) + '\n');
                    StringBuilder sb5 = new StringBuilder();
                    MarginIsolatedPositionFragment marginIsolatedPositionFragment4 = this.f33988j;
                    int i15 = R$string.kc_margin_pledge_rate_description2;
                    if (isolateMarginPositionConfig != null) {
                        strM92642g = null;
                    } else {
                        strM92642g = null;
                    }
                    sb5.append(marginIsolatedPositionFragment4.getString(i15, C42180b.m92649n(strM92642g)));
                    sb5.append('\n');
                    c27096v0.append(sb5.toString());
                    StringBuilder sb6 = new StringBuilder();
                    MarginIsolatedPositionFragment marginIsolatedPositionFragment5 = this.f33988j;
                    int i16 = R$string.kc_margin_riskrate_description2;
                    if (isolateMarginPositionConfig != null) {
                        strM92642g2 = null;
                    } else {
                        strM92642g2 = null;
                    }
                    sb6.append(marginIsolatedPositionFragment5.getString(i16, C42180b.m92649n(strM92642g2)));
                    sb6.append('\n');
                    c27096v0.append(sb6.toString());
                } else {
                    c27096v0 = new C27096v0().append(this.f33988j.getString(R$string.margin_dialog_liquidation_tips, string));
                    Intrinsics.checkNotNull(c27096v0);
                }
                break;
            case -1050123579:
                if (!strM66668h.equals("FROZEN_FL")) {
                    c27096v0 = new C27096v0();
                    c27096v0.append(this.f33988j.getString(R$string.kc_margin_riskrate_description) + '\n');
                    c27096v0.append(this.f33988j.getString(R$string.kc_margin_pledge_rate_description) + '\n');
                    StringBuilder sb7 = new StringBuilder();
                    MarginIsolatedPositionFragment marginIsolatedPositionFragment6 = this.f33988j;
                    int i17 = R$string.kc_margin_pledge_rate_description2;
                    if (isolateMarginPositionConfig != null) {
                        strM92642g = null;
                    } else {
                        strM92642g = null;
                    }
                    sb7.append(marginIsolatedPositionFragment6.getString(i17, C42180b.m92649n(strM92642g)));
                    sb7.append('\n');
                    c27096v0.append(sb7.toString());
                    StringBuilder sb8 = new StringBuilder();
                    MarginIsolatedPositionFragment marginIsolatedPositionFragment7 = this.f33988j;
                    int i18 = R$string.kc_margin_riskrate_description2;
                    if (isolateMarginPositionConfig != null) {
                        strM92642g2 = null;
                    } else {
                        strM92642g2 = null;
                    }
                    sb8.append(marginIsolatedPositionFragment7.getString(i18, C42180b.m92649n(strM92642g2)));
                    sb8.append('\n');
                    c27096v0.append(sb8.toString());
                } else {
                    c27096v0 = new C27096v0().append(this.f33988j.getString(R$string.margin_dialog_liquidation_tips, string));
                    Intrinsics.checkNotNull(c27096v0);
                }
                break;
            case 1461662585:
                if (!strM66668h.equals("BANKRUPTCY")) {
                    c27096v0 = new C27096v0();
                    c27096v0.append(this.f33988j.getString(R$string.kc_margin_riskrate_description) + '\n');
                    c27096v0.append(this.f33988j.getString(R$string.kc_margin_pledge_rate_description) + '\n');
                    StringBuilder sb9 = new StringBuilder();
                    MarginIsolatedPositionFragment marginIsolatedPositionFragment8 = this.f33988j;
                    int i19 = R$string.kc_margin_pledge_rate_description2;
                    if (isolateMarginPositionConfig != null) {
                        strM92642g = null;
                    } else {
                        strM92642g = null;
                    }
                    sb9.append(marginIsolatedPositionFragment8.getString(i19, C42180b.m92649n(strM92642g)));
                    sb9.append('\n');
                    c27096v0.append(sb9.toString());
                    StringBuilder sb10 = new StringBuilder();
                    MarginIsolatedPositionFragment marginIsolatedPositionFragment9 = this.f33988j;
                    int i110 = R$string.kc_margin_riskrate_description2;
                    if (isolateMarginPositionConfig != null) {
                        strM92642g2 = null;
                    } else {
                        strM92642g2 = null;
                    }
                    sb10.append(marginIsolatedPositionFragment9.getString(i110, C42180b.m92649n(strM92642g2)));
                    sb10.append('\n');
                    c27096v0.append(sb10.toString());
                } else {
                    c27096v0 = new C27096v0().append(this.f33988j.getString(R$string.margin_dialog_liability_tips, string));
                    Intrinsics.checkNotNull(c27096v0);
                }
                break;
            default:
                c27096v0 = new C27096v0();
                c27096v0.append(this.f33988j.getString(R$string.kc_margin_riskrate_description) + '\n');
                c27096v0.append(this.f33988j.getString(R$string.kc_margin_pledge_rate_description) + '\n');
                StringBuilder sb11 = new StringBuilder();
                MarginIsolatedPositionFragment marginIsolatedPositionFragment10 = this.f33988j;
                int i111 = R$string.kc_margin_pledge_rate_description2;
                if (isolateMarginPositionConfig != null) {
                    strM92642g = null;
                } else {
                    strM92642g = null;
                }
                sb11.append(marginIsolatedPositionFragment10.getString(i111, C42180b.m92649n(strM92642g)));
                sb11.append('\n');
                c27096v0.append(sb11.toString());
                StringBuilder sb12 = new StringBuilder();
                MarginIsolatedPositionFragment marginIsolatedPositionFragment11 = this.f33988j;
                int i112 = R$string.kc_margin_riskrate_description2;
                if (isolateMarginPositionConfig != null) {
                    strM92642g2 = null;
                } else {
                    strM92642g2 = null;
                }
                sb12.append(marginIsolatedPositionFragment11.getString(i112, C42180b.m92649n(strM92642g2)));
                sb12.append('\n');
                c27096v0.append(sb12.toString());
                break;
        }
        switch (strM66668h) {
            case "LIABILITY":
                i11 = R$string.liability;
                break;
            case "IN_LIQUIDATION":
            case "FROZEN_FL":
                i11 = R$string.margin_liq_ing;
                break;
            case "BANKRUPTCY":
                i11 = R$string.liability;
                break;
            default:
                i11 = R$string.debt_ratio;
                break;
        }
        if (i11 != R$string.debt_ratio) {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54163T4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(i11).m54155L4(c27096v0).m54150G4(new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.margin.trade.position.r
                @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                /* JADX INFO: renamed from: b3 */
                public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                    MarginIsolatedPositionAdapter.m40382l0(baseViewHolder, dialogFragmentHelper);
                }
            }).m54163T4(this.f33988j.getString(R$string.i_already_know), null);
            if (symbolInfoEntityM85601B != null) {
                if (Intrinsics.areEqual(strM66668h, "LIABILITY") || Intrinsics.areEqual(strM66668h, "BANKRUPTCY")) {
                    alertDialogFragmentHelperM54163T4.m54160Q4(this.f33988j.getString(R$string.go_transfer), new DialogInterface.OnClickListener() { // from class: com.kubi.margin.trade.position.s
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i21) {
                            MarginIsolatedPositionAdapter.m40384m0(symbolInfoEntityM85601B, dialogInterface, i21);
                        }
                    });
                }
                alertDialogFragmentHelperM54163T4.m54172c5(this.f33988j.getChildFragmentManager());
                return;
            }
            return;
        }
        C43608h c43608h = C43608h.f96261a;
        String string2 = this.f33988j.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String strValueOf = String.valueOf(c27096v0);
        String string3 = this.f33988j.getString(R$string.i_already_know);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        FragmentManager childFragmentManager = this.f33988j.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        c43608h.m95969d(childFragmentManager, string2, strValueOf, string3, new Function0() { // from class: com.kubi.margin.trade.position.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginIsolatedPositionAdapter.m40380k0();
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final Bitmap m40409n0(MarginPosition marginPosition, boolean z11) {
        String string;
        int i11;
        BigDecimal bigDecimalDivide;
        View viewInflate = LayoutInflater.from(this.f33988j.requireContext()).inflate(R$layout.bmargin_view_share_margin_position_image, (ViewGroup) null, false);
        BaseViewHolder baseViewHolder = new BaseViewHolder(viewInflate);
        baseViewHolder.setText(R$id.symbol, m40403W(marginPosition.getSymbol()) + "  " + C27017c.f54310a.m66516f(R$string.lever, new Object[0]));
        int i12 = R$id.side;
        Context context = viewInflate.getContext();
        Integer numValueOf = context != null ? Integer.valueOf(C22890g.m54281f(context, z11)) : null;
        int i13 = R$color.primary;
        baseViewHolder.setTextColor(i12, C27039d.m66651k(numValueOf, i13));
        int i14 = R$id.lever;
        Context context2 = viewInflate.getContext();
        baseViewHolder.setTextColor(i14, C27039d.m66651k(context2 != null ? Integer.valueOf(C22890g.m54281f(context2, z11)) : null, i13));
        try {
            StringBuilder sb2 = new StringBuilder();
            BigDecimal bigDecimal = marginPosition.totalConversionCompat();
            if (bigDecimal != null) {
                BigDecimal bigDecimal2 = marginPosition.totalConversionCompat();
                bigDecimalDivide = bigDecimal.divide(C41014a.m89921F(bigDecimal2 != null ? bigDecimal2.subtract(C41014a.m89922G(marginPosition.liabilityConversionCompat(), null, 1, null)) : null, "1"), 2, RoundingMode.UP);
            } else {
                bigDecimalDivide = null;
            }
            sb2.append(C42180b.m92640e(C41014a.m89921F(bigDecimalDivide, "1"), RoundingMode.UP, 1, false, false, false, 0, null, 124, null));
            sb2.append("x ");
            string = sb2.toString();
        } catch (Exception unused) {
            string = C33820nf.f71144W;
        }
        baseViewHolder.setText(R$id.lever, string);
        int i15 = R$id.side;
        C27017c c27017c = C27017c.f54310a;
        baseViewHolder.setText(i15, c27017c.m66516f(z11 ? R$string.long_stub : R$string.short_stub, ""));
        double dM66647g = C27039d.m66647g(marginPosition.calculatorProfitPercent());
        int i16 = R$id.percent;
        Context contextRequireContext = this.f33988j.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        baseViewHolder.setTextColor(i16, C22890g.m54278c(contextRequireContext, dM66647g, R$color.emphasis));
        baseViewHolder.setText(i16, C27041f.m66669i(marginPosition.getProfitRateString(), "--"));
        if (dM66647g >= 0.3d) {
            i11 = R$mipmap.ic_share_back_two;
        } else {
            i11 = dM66647g >= 0.0d ? R$mipmap.ic_share_back_one : R$mipmap.ic_share_back_three;
        }
        baseViewHolder.setImageDrawable(R$id.image, C27017c.m66510d(c27017c, i11, null, 2, null));
        int i17 = R$id.markPrice;
        C27096v0 c27096v0Append = new C27096v0().append(c27017c.m66516f(R$string.mark_price, new Object[0])).append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(marginPosition.getMarkPriceString());
        CurrencyBalance quoteAsset = marginPosition.getQuoteAsset();
        sb3.append(C27041f.m66668h(quoteAsset != null ? quoteAsset.getCurrencyName() : null));
        baseViewHolder.setText(i17, c27096v0Append.m66903c(sb3.toString(), new ForegroundColorSpan(c27017c.m66512a(R$color.c_e1e8f5)), new AbsoluteSizeSpan(14, true)));
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return ViewExtKt.m66593x(viewInflate, C27029c.m66603f(this.f33988j, TXVodDownloadDataSource.QUALITY_360P), C27029c.m66603f(this.f33988j, C33556b3.f69051i), 0, 4, null);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m40410o0(final String str, final String str2) {
        C43852m.m96591c("B4tradingIsolated", "orderManagement", "13", null, 8, null);
        MarginConfigManager.f33681a.m39880Z(this.f33988j, new Function0() { // from class: com.kubi.margin.trade.position.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginIsolatedPositionAdapter.m40388p0(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m40355G(MarginPosition marginPosition, MarginIsolatedPositionAdapter marginIsolatedPositionAdapter) {
        if (Intrinsics.areEqual(marginPosition.getTag(), marginIsolatedPositionAdapter.f33987i.getCode())) {
            return Unit.INSTANCE;
        }
        InterfaceC37754f.a.m85134f(C37304a.f82764a, marginPosition.getTag(), Boolean.TRUE, null, null, null, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m40356H(MarginIsolatedPositionAdapter marginIsolatedPositionAdapter, MarginPosition marginPosition, IsolateMarginPositionConfig isolateMarginPositionConfig) {
        marginIsolatedPositionAdapter.m40408j0(marginPosition, isolateMarginPositionConfig);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m40360L(MarginIsolatedPositionAdapter marginIsolatedPositionAdapter, MarginPosition marginPosition) {
        String currency;
        CurrencyBalance quoteAsset = marginPosition.getQuoteAsset();
        if (quoteAsset != null) {
            currency = quoteAsset.getCurrency();
        } else {
            currency = null;
        }
        marginIsolatedPositionAdapter.m40410o0(currency, marginPosition.getTag());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m40362N(MarginIsolatedPositionAdapter marginIsolatedPositionAdapter, MarginPosition marginPosition) {
        marginIsolatedPositionAdapter.m40404X(marginPosition);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m40366R(MarginIsolatedPositionAdapter marginIsolatedPositionAdapter, MarginPosition marginPosition) {
        marginIsolatedPositionAdapter.m40406a0(marginPosition);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m40369c0(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m40370d0(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m40375h0(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m40377i0(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r5.equals("BANKRUPTCY") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r5.equals("FROZEN_RENEW") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r5.equals("IN_AUTO_RENEW") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        r0 = new com.kubi.utils.C27096v0();
        r2 = new java.lang.StringBuilder();
        r3 = com.kubi.utils.C27017c.f54310a;
        r2.append(r3.m66516f(com.kubi.margin.R$string.margin_renew, new java.lang.Object[0]));
        r2.append(' ');
        r2.append(r1);
        r0 = r0.m66905e(r2.toString(), r3.m66512a(com.kubi.margin.R$color.secondary));
        p852kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        if (r5.equals("FROZEN_FL") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c0, code lost:
    
        if (r5.equals("IN_LIQUIDATION") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        r0 = new com.kubi.utils.C27096v0();
        r2 = new java.lang.StringBuilder();
        r3 = com.kubi.utils.C27017c.f54310a;
        r2.append(r3.m66516f(com.kubi.margin.R$string.margin_liq_ing, new java.lang.Object[0]));
        r2.append(' ');
        r2.append(r1);
        r0 = r0.m66905e(r2.toString(), r3.m66512a(com.kubi.margin.R$color.secondary));
        p852kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f8, code lost:
    
        if (r5.equals("LIABILITY") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014a, code lost:
    
        r0 = new com.kubi.utils.C27096v0();
        r2 = new java.lang.StringBuilder();
        r3 = com.kubi.utils.C27017c.f54310a;
        r2.append(r3.m66516f(com.kubi.margin.R$string.liability, new java.lang.Object[0]));
        r2.append(' ');
        r2.append(r1);
        r0 = r0.m66905e(r2.toString(), r3.m66512a(com.kubi.margin.R$color.secondary));
        p852kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0178, code lost:
    
        return r0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence m40401U(MarginPosition marginPosition) {
        Double dValueOf;
        BigDecimal bigDecimalCalculatorLiabilityRate = marginPosition.calculatorLiabilityRate();
        if (bigDecimalCalculatorLiabilityRate != null) {
            dValueOf = Double.valueOf(bigDecimalCalculatorLiabilityRate.doubleValue());
        } else {
            dValueOf = null;
        }
        double dM66646f = C27039d.m66646f(dValueOf);
        LeverBean.Companion companion = LeverBean.f33019a;
        List<Double> riskGradeByString = companion.getRiskGradeByString(C27041f.m66668h(marginPosition.getRiskGrade()));
        List list = riskGradeByString;
        if (riskGradeByString == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Double.valueOf(0.6d));
            arrayList.add(Double.valueOf(0.9d));
            list = arrayList;
        }
        if (list.size() < 2) {
            return "--";
        }
        String strM92649n = C42180b.m92649n(null);
        String strM66668h = C27041f.m66668h(marginPosition.getStatus());
        switch (strM66668h.hashCode()) {
            case -2033975059:
                break;
            case -1060904193:
                break;
            case -1050123579:
                break;
            case -311845065:
                break;
            case 321192974:
                break;
            case 1461662585:
                break;
            default:
                C27096v0 c27096v0 = new C27096v0();
                if (0.0d <= dM66646f && dM66646f <= 1.0d) {
                    strM92649n = C42180b.m92642g(new BigDecimal(String.valueOf(dM66646f)), null, null, 0, false, true, false, 47, null);
                }
                C27096v0 c27096v0M66905e = c27096v0.m66905e(strM92649n, C27017c.f54310a.m66512a(companion.getColorByRate(dM66646f, ((Number) list.get(0)).doubleValue(), ((Number) list.get(1)).doubleValue())));
                Intrinsics.checkNotNull(c27096v0M66905e);
                return c27096v0M66905e;
        }
    }
}
