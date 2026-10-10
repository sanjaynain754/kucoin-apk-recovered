package com.kubi.home.v2.card;

import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.exception.HomeException;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cards.BaseCardV2;
import com.kubi.kucoin.home.p090v2.cards.CardStyle;
import com.kubi.kucoin.home.p090v2.cardsconfig.CardListRspV2;
import com.kubi.user.config.UserInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.home.v2.card.n */
/* JADX INFO: compiled from: HomeCardsRegistryV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0010 \n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0003H\u0002\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0005\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0010\u0010\u000f\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00050\u0011¨\u0006\u0012"}, m90084d2 = {"kv", "Lkotlin/Pair;", "", "Lcom/kubi/kucoin/home/v2/cards/CardStyle;", "toBaseCardDataV2", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$AppWidgetConfigVO;", "styleName", "toUserCustomWidget", "Lcom/kubi/kucoin/home/v2/cardsconfig/CardListRspV2$UserCustomWidget;", "updateVisible", "", "Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;", ViewProps.VISIBLE, "", "getFixeCount", "", "", "HomeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeCardsRegistryV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCardsRegistryV2.kt\ncom/kubi/home/v2/card/HomeCardsRegistryV2Kt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,163:1\n1869#2,2:164\n47#3,2:166\n*S KotlinDebug\n*F\n+ 1 HomeCardsRegistryV2.kt\ncom/kubi/home/v2/card/HomeCardsRegistryV2Kt\n*L\n105#1:164,2\n125#1:166,2\n*E\n"})
public final class C15000n {
    /* JADX INFO: renamed from: b */
    public static final int m30812b(@NotNull List<BaseCardDataV2> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int i11 = 0;
        for (BaseCardDataV2 baseCardDataV2 : list) {
            if (baseCardDataV2.getDraggable() || Intrinsics.areEqual(baseCardDataV2.getCode(), "footer")) {
                break;
            }
            i11++;
        }
        return i11;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final BaseCardDataV2 m30814d(@NotNull CardListRspV2.AppWidgetConfigVO appWidgetConfigVO, @NotNull String styleName) {
        CardStyle cardStyle;
        CardStyle cardStyle2;
        Intrinsics.checkNotNullParameter(appWidgetConfigVO, "<this>");
        Intrinsics.checkNotNullParameter(styleName, "styleName");
        try {
            if (Intrinsics.areEqual(appWidgetConfigVO.getCode(), HomeWidgetCode.CopyTrading.getCode()) && !UserInfo.a.n()) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : appWidgetConfigVO.getStyle()) {
                Map<String, CardStyle> map = HomeCardsRegistryV2.f26511a.m30810a().get(appWidgetConfigVO.getCode());
                if (map != null && (cardStyle2 = map.get(str)) != null) {
                    linkedHashMap.put(str, cardStyle2);
                }
            }
            Map<String, CardStyle> map2 = HomeCardsRegistryV2.f26511a.m30810a().get(appWidgetConfigVO.getCode());
            if (map2 != null && (cardStyle = map2.get(styleName)) != null) {
                return new BaseCardDataV2(appWidgetConfigVO.getCode(), cardStyle, linkedHashMap, appWidgetConfigVO.getTitle(), appWidgetConfigVO.getSubTitle(), !appWidgetConfigVO.isFixed(), appWidgetConfigVO.getRepeatable(), null, appWidgetConfigVO.getDefaultData(), 128, null);
            }
            return null;
        } catch (Exception e11) {
            C43846g.m96568c(new HomeException(e11, "WidgetException", false, null, 8, null), null, 2, null);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final CardListRspV2.UserCustomWidget m30815e(@NotNull BaseCardDataV2 baseCardDataV2) {
        Intrinsics.checkNotNullParameter(baseCardDataV2, "<this>");
        return new CardListRspV2.UserCustomWidget(baseCardDataV2.getCode(), baseCardDataV2.getStyle().getName(), baseCardDataV2.getExtraData());
    }

    /* JADX INFO: renamed from: f */
    public static final void m30816f(@NotNull BaseCardV2 baseCardV2, boolean z11) {
        Intrinsics.checkNotNullParameter(baseCardV2, "<this>");
        View view = baseCardV2.getView();
        if (view != null) {
            view.setVisibility(z11 ? 0 : 8);
            if (view.isAttachedToWindow()) {
                C12572a.m23695d("com.kubi.home.v2.card.CardsViewModelV2_EVENT_WIDGET_VISIBLE_CHANGE", null, 0L, 6, null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Pair<String, CardStyle> m30813c(CardStyle cardStyle) {
        return TuplesKt.m90091to(cardStyle.getName(), cardStyle);
    }
}
