package com.kubi.assets.overview.coin;

import android.content.Context;
import android.os.Vibrator;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$color;
import com.kubi.assets.R$font;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AssetCoinEntity;
import com.kubi.data.DataInitPlugins;
import com.kubi.data.entity.AlphaCurrencyInfoEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.CoinProperty;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.ColorClickSpan;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27057k;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import gf.C37885i;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;
import rs.AbstractC44173c;
import rs.C44172b;

/* JADX INFO: compiled from: AssetCoinAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0014J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u001f\u0010\u0013\u001a\u00020\u0014*\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010\u0017J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/assets/overview/coin/AssetCoinAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/AssetCoinEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "hideNumber", "", "getHideNumber", "()Z", "setHideNumber", "(Z)V", "convert", "", "helper", "item", "updateWSData", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "dealPrice", "", "", "coinOrSymbol", "(Ljava/lang/Double;Ljava/lang/String;)Ljava/lang/String;", "getTradeCode", "abbreviateAddress", "address", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetCoinAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCoinAdapter.kt\ncom/kubi/assets/overview/coin/AssetCoinAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,210:1\n295#2,2:211\n*S KotlinDebug\n*F\n+ 1 AssetCoinAdapter.kt\ncom/kubi/assets/overview/coin/AssetCoinAdapter\n*L\n182#1:211,2\n*E\n"})
public final class AssetCoinAdapter extends BaseQuickAdapter<AssetCoinEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public boolean f18250i;

    public AssetCoinAdapter() {
        super(R$layout.asset_item_coin);
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m18434o(AssetCoinEntity assetCoinEntity) {
        InterfaceC37749a.a.m85118m(C37304a.f82764a, assetCoinEntity != null ? assetCoinEntity.getCode() : null, null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m18435p() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m18436q(AssetCoinEntity assetCoinEntity, AssetCoinAdapter assetCoinAdapter) {
        C27057k.m66746b(C27041f.m66668h(assetCoinEntity != null ? assetCoinEntity.getTokenAddress() : null));
        Object systemService = assetCoinAdapter.mContext.getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService).vibrate(100L);
        ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.copy_success, new Object[0]), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m18437r(TextView textView, TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setTypeface(ResourcesCompat.getFont(textView.getContext(), R$font.regular));
        ds2.setColor(ContextCompat.getColor(textView.getContext(), R$color.brandGreen));
        ds2.setUnderlineText(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final void m18438s(AssetCoinEntity assetCoinEntity, View view) {
        KCFlutterRouteManager kCFlutterRouteManager = KCFlutterRouteManager.f46704a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("delistcoin?coin=");
        sb2.append(assetCoinEntity != null ? assetCoinEntity.getCode() : null);
        KCFlutterRouteManager.m56839j(kCFlutterRouteManager, sb2.toString(), false, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0193  */
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable final AssetCoinEntity assetCoinEntity) {
        BaseViewHolder gone;
        BaseViewHolder gone2;
        LinearLayout linearLayout;
        String strM85562a;
        BaseViewHolder gone3;
        BaseViewHolder gone4;
        BigDecimal totalAmountBaseUSDT;
        String totalAmount;
        BigDecimal bigDecimalM66535e;
        int i11;
        BaseViewHolder text;
        String strM92642g;
        Double changeRate;
        String totalAmount2;
        BigDecimal bigDecimalM66535e2;
        LinearLayout linearLayout2;
        CoinProperty properties;
        TextView textView;
        TextView textView2;
        if (baseViewHolder != null && (textView2 = (TextView) baseViewHolder.getView(R$id.tv_amount)) != null) {
            C44172b.m97383c(textView2, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        }
        if (baseViewHolder != null && (textView = (TextView) baseViewHolder.getView(R$id.tv_price)) != null) {
            C44172b.m97383c(textView, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        }
        CoinAvatarView coinAvatarView = baseViewHolder != null ? (CoinAvatarView) baseViewHolder.getView(R$id.iv_icon) : null;
        CoinAvatarView coinAvatarView2 = baseViewHolder != null ? (CoinAvatarView) baseViewHolder.getView(R$id.ivSubIcon) : null;
        C37890n c37890n = C37890n.f85269a;
        String code = assetCoinEntity != null ? assetCoinEntity.getCode() : null;
        String str = "";
        if (code == null) {
            code = "";
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(code);
        if (baseViewHolder != null && (linearLayout2 = (LinearLayout) baseViewHolder.getView(R$id.delistingTip)) != null) {
            AssetExKt.m15138z(linearLayout2, Intrinsics.areEqual((coinInfoEntityM85613u == null || (properties = coinInfoEntityM85613u.getProperties()) == null) ? null : properties.isDelisting(), "TRUE"));
            C27046k.m66711z(linearLayout2, 0L, new Function0() { // from class: com.kubi.assets.overview.coin.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetCoinAdapter.m18434o(assetCoinEntity);
                }
            }, 1, null);
        }
        String strM18441t = m18441t(assetCoinEntity != null ? assetCoinEntity.getLastTradedPrice() : null, m18442u(assetCoinEntity));
        if (baseViewHolder != null) {
            BaseViewHolder text2 = baseViewHolder.setText(R$id.tv_coin_name, C27041f.m66668h(assetCoinEntity != null ? assetCoinEntity.getCurrency() : null));
            if (text2 != null) {
                BaseViewHolder text3 = text2.setText(R$id.tv_amount, C27041f.m66669i((assetCoinEntity == null || (totalAmount2 = assetCoinEntity.getTotalAmount()) == null || (bigDecimalM66535e2 = DowngradeExKt.m66535e(totalAmount2, null, 1, null)) == null) ? null : C37885i.m85563b(bigDecimalM66535e2, assetCoinEntity.getCode(), 0, 2, null), "--"));
                if (text3 != null) {
                    BaseViewHolder text4 = text3.setText(R$id.tv_percentage, AssetExKt.m15120h(assetCoinEntity != null ? assetCoinEntity.getProportion() : null, RoundingMode.DOWN, false, false, 6, null));
                    if (text4 != null && (text = text4.setText((i11 = R$id.tv_current_price), strM18441t)) != null) {
                        int i12 = R$id.tv_rate;
                        if (assetCoinEntity == null || (changeRate = assetCoinEntity.getChangeRate()) == null || (strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(changeRate.doubleValue())), null, null, 0, true, false, false, 55, null)) == null) {
                            strM92642g = "--";
                        }
                        BaseViewHolder text5 = text.setText(i12, strM92642g);
                        if (text5 != null) {
                            Context mContext = this.mContext;
                            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                            BaseViewHolder textColor = text5.setTextColor(i12, C22890g.m54279d(mContext, C27039d.m66646f(assetCoinEntity != null ? assetCoinEntity.getChangeRate() : null), 0, 2, null));
                            if (textColor != null) {
                                BaseViewHolder gone5 = textColor.setGone(i11, strM18441t.length() > 0);
                                if (gone5 != null) {
                                    BaseViewHolder gone6 = gone5.setGone(i12, strM18441t.length() > 0);
                                    if (gone6 != null) {
                                        gone6.setGone(R$id.tv_current_price_name, strM18441t.length() > 0);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        String tokenAddress = assetCoinEntity != null ? assetCoinEntity.getTokenAddress() : null;
        if (tokenAddress == null || tokenAddress.length() == 0) {
            String code2 = assetCoinEntity != null ? assetCoinEntity.getCode() : null;
            CoinInfoEntity coinInfoEntityM85613u2 = c37890n.m85613u(code2 == null ? str : code2);
            C24277v.m58540e(this.mContext, coinInfoEntityM85613u2 != null ? coinInfoEntityM85613u2.getIconUrl() : null, coinAvatarView);
            if (coinAvatarView2 != null) {
                ViewExtKt.m66577h(coinAvatarView2);
            }
            if (baseViewHolder != null) {
                int i13 = R$id.tv_percentage;
                BaseViewHolder text6 = baseViewHolder.setText(i13, AssetExKt.m15120h(assetCoinEntity != null ? assetCoinEntity.getProportion() : null, RoundingMode.DOWN, false, false, 6, null));
                if (text6 != null) {
                    BaseViewHolder text7 = text6.setText(R$id.tv_price, C41014a.m89950x(C41014a.m89940n(DowngradeExKt.m66535e(assetCoinEntity != null ? assetCoinEntity.getTotalAmount() : null, null, 1, null), assetCoinEntity != null ? assetCoinEntity.getCode() : null), null, null, 0, false, false, false, true, 63, null));
                    if (text7 != null && (gone = text7.setGone(R$id.ivCopy, false)) != null && (gone2 = gone.setGone(R$id.tvTokenContract, false)) != null) {
                        gone2.setGone(i13, true);
                    }
                }
            }
            if (baseViewHolder != null) {
                View view = baseViewHolder.getView(R$id.ivCopy);
                Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
                View view2 = baseViewHolder.getView(R$id.tvTokenContract);
                Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
                C27046k.m66681D(new View[]{view, view2}, new Function0() { // from class: com.kubi.assets.overview.coin.c
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetCoinAdapter.m18435p();
                    }
                });
            }
        } else {
            AlphaCurrencyInfoEntity alphaCurrencyInfoEntityM85611s = c37890n.m85611s(DowngradeExKt.m66547q(assetCoinEntity != null ? assetCoinEntity.getCode() : null), Boolean.FALSE);
            Context context = this.mContext;
            String iconUrl = assetCoinEntity != null ? assetCoinEntity.getIconUrl() : null;
            if (iconUrl == null) {
                iconUrl = str;
            }
            C24277v.m58540e(context, iconUrl, coinAvatarView);
            C24277v.m58540e(this.mContext, C27041f.m66668h(assetCoinEntity != null ? assetCoinEntity.getChainIconUrl() : null), coinAvatarView2);
            if (coinAvatarView2 != null) {
                Context mContext2 = this.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
                coinAvatarView2.setStrokeColor(C27046k.m66699n(mContext2, R$color.c_overlay));
            }
            if (coinAvatarView2 != null) {
                ViewExtKt.m66594y(coinAvatarView2);
            }
            if (baseViewHolder != null) {
                int i14 = R$id.tv_amount;
                if (assetCoinEntity == null || (totalAmount = assetCoinEntity.getTotalAmount()) == null || (bigDecimalM66535e = DowngradeExKt.m66535e(totalAmount, null, 1, null)) == null) {
                    strM85562a = null;
                } else {
                    strM85562a = C37885i.m85562a(bigDecimalM66535e, null, C27039d.m66651k(alphaCurrencyInfoEntityM85611s != null ? alphaCurrencyInfoEntityM85611s.getTokenDecimal() : null, 8));
                }
                BaseViewHolder text8 = baseViewHolder.setText(i14, C27041f.m66669i(strM85562a, "--"));
                if (text8 != null) {
                    int i15 = R$id.tvTokenContract;
                    BaseViewHolder text9 = text8.setText(i15, m18433m(C27041f.m66669i(assetCoinEntity != null ? assetCoinEntity.getTokenAddress() : null, "--")));
                    if (text9 != null) {
                        BaseViewHolder text10 = text9.setText(R$id.tv_price, C27041f.m66669i((assetCoinEntity == null || (totalAmountBaseUSDT = assetCoinEntity.getTotalAmountBaseUSDT()) == null) ? null : C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89940n(totalAmountBaseUSDT, "USDT"))), null, null, 0, false, false, true, 31, null), "--"));
                        if (text10 != null && (gone3 = text10.setGone(R$id.ivCopy, true)) != null && (gone4 = gone3.setGone(i15, true)) != null) {
                            gone4.setGone(R$id.tv_percentage, false);
                        }
                    }
                }
            }
            if (baseViewHolder != null) {
                View view3 = baseViewHolder.getView(R$id.ivCopy);
                Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
                View view4 = baseViewHolder.getView(R$id.tvTokenContract);
                Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
                C27046k.m66681D(new View[]{view3, view4}, new Function0() { // from class: com.kubi.assets.overview.coin.d
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetCoinAdapter.m18436q(assetCoinEntity, this);
                    }
                });
            }
        }
        ShowHideTextView.m54778d(baseViewHolder != null ? baseViewHolder.itemView : null, this.f18250i);
        if (baseViewHolder != null && (linearLayout = (LinearLayout) baseViewHolder.getView(R$id.delistedTip)) != null) {
            AssetExKt.m15138z(linearLayout, assetCoinEntity != null ? Intrinsics.areEqual(assetCoinEntity.getDelisted(), Boolean.TRUE) : false);
            final TextView textView3 = (TextView) baseViewHolder.getView(R$id.delistedTipText);
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            Intrinsics.checkNotNull(textView3);
            highlightTextHelper.m54120f(textView3, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ColorClickSpan(new Function1() { // from class: com.kubi.assets.overview.coin.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetCoinAdapter.m18437r(textView3, (TextPaint) obj);
                }
            }, new View.OnClickListener() { // from class: com.kubi.assets.overview.coin.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    AssetCoinAdapter.m18438s(assetCoinEntity, view5);
                }
            })));
        }
        if (assetCoinEntity != null ? Intrinsics.areEqual(assetCoinEntity.getDelisted(), Boolean.TRUE) : false) {
            if (baseViewHolder != null) {
                baseViewHolder.setGone(R$id.tv_current_price, false);
            }
            if (baseViewHolder != null) {
                baseViewHolder.setGone(R$id.tv_rate, false);
            }
            if (baseViewHolder != null) {
                baseViewHolder.setGone(R$id.tv_current_price_name, false);
            }
            if (baseViewHolder != null) {
                int i16 = R$id.tv_price;
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                baseViewHolder.setText(i16, C41014a.m89950x(C41014a.m89940n(ZERO, assetCoinEntity != null ? assetCoinEntity.getCode() : null), null, null, 0, false, false, false, true, 63, null));
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final String m18441t(Double d11, String str) {
        BigDecimal bigDecimalOrNull;
        if (d11 == null || (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(d11.toString())) == null) {
            return "";
        }
        return C41014a.m89946t(bigDecimalOrNull, null, (str == null || str.length() == 0) ? bigDecimalOrNull.scale() : C27039d.m66651k(DataInitPlugins.f21489a.m23681b().m23685a(str), 8), true, false, false, false, false, null, 0, 473, null);
    }

    /* JADX INFO: renamed from: u */
    public final String m18442u(AssetCoinEntity assetCoinEntity) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(assetCoinEntity != null ? assetCoinEntity.getCode() : null);
        sb2.append('-');
        sb2.append(assetCoinEntity != null ? assetCoinEntity.getQuote() : null);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: v */
    public final void m18443v(boolean z11) {
        this.f18250i = z11;
    }

    /* JADX INFO: renamed from: w */
    public final void m18444w(@NotNull final WsMarketSnapshotEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        C27100x0.m66924e(new Function0() { // from class: com.kubi.assets.overview.coin.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetCoinAdapter.m18439x(this.f18274b, entity);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    private final String m18433m(String str) {
        if (str.length() > 8) {
            StringBuilder sb2 = new StringBuilder();
            String strSubstring = str.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            sb2.append(Typography.ellipsis);
            sb2.append(StringsKt.takeLast(str, 4));
            return sb2.toString();
        }
        return str;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m18439x(AssetCoinAdapter assetCoinAdapter, WsMarketSnapshotEntity wsMarketSnapshotEntity) {
        Object next;
        List<AssetCoinEntity> data = assetCoinAdapter.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator<T> it = data.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(assetCoinAdapter.m18442u((AssetCoinEntity) next), wsMarketSnapshotEntity.getSymbolCode()));
        AssetCoinEntity assetCoinEntity = (AssetCoinEntity) next;
        if (assetCoinEntity != null && !Intrinsics.areEqual(assetCoinEntity.getLastTradedPrice(), wsMarketSnapshotEntity.getLastTradedPrice()) && !Intrinsics.areEqual(assetCoinEntity.getChangeRate(), wsMarketSnapshotEntity.getChangeRate())) {
            assetCoinEntity.setLastTradedPrice(Double.valueOf(wsMarketSnapshotEntity.getLastTradedPrice()));
            assetCoinEntity.setChangeRate(Double.valueOf(wsMarketSnapshotEntity.getChangeRate()));
            assetCoinAdapter.notifyItemChanged(assetCoinAdapter.getData().indexOf(assetCoinEntity));
        }
        return Unit.INSTANCE;
    }
}
