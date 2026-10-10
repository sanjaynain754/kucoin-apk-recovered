package com.kubi.search.utils;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.search.entity.ExtendEntity;
import com.kubi.search.entity.SearchItemData;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.search.utils.d0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SearchTrack.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J>\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J6\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0007J?\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0012¢\u0006\u0002\u0010\"J\u000e\u0010#\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007J\u0016\u0010$\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0007¨\u0006)"}, m90084d2 = {"Lcom/kubi/search/utils/SearchTrack;", "", "<init>", "()V", "exposeInput", "", "contentItem", "", "trackItem", "item", "Lcom/kubi/search/entity/SearchItemData;", "indexInGroup", "", "indexInList", "currentTab", "currentSearchKey", "clickPosition", "click", "", "exposeSearchResult", "loadingTime", "", "allItemAmount", "likes", "replies", "earns", "resultType", "trackTopSearch", "blockId", "postTitle", "sortPosition", "intervals", "", "isClick", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;Ljava/lang/String;Z)V", "resultTabClick", "nullSearchResultExpose", "moreResultClick", "type", "enterKeywordExpose", "inputWords", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchTrack {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SearchTrack f49158a = new SearchTrack();

    /* JADX INFO: renamed from: g */
    public final void m59611g(@NotNull SearchItemData item, int i11, int i12, @NotNull String currentTab, @NotNull String currentSearchKey, @NotNull String clickPosition, boolean z11) throws JSONException {
        String string;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(currentTab, "currentTab");
        Intrinsics.checkNotNullParameter(currentSearchKey, "currentSearchKey");
        Intrinsics.checkNotNullParameter(clickPosition, "clickPosition");
        String symbol = item.getSymbol();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("groupId", SearchConst.f49150a.m59592a());
        jSONObject.put("postId", symbol);
        if (item.getIsSpot()) {
            string = SearchCategory$Companion.SPOT;
        } else if (item.getIsFuture()) {
            string = SearchCategory$Companion.FUTURES;
        } else if (item.getIsEarn()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("earn_");
            ExtendEntity beanEarn = item.getBeanEarn();
            sb2.append(C27041f.m66668h(beanEarn != null ? beanEarn.getProductCategoryStr() : null));
            string = sb2.toString();
        } else {
            string = item.getIsWeb3() ? SearchCategory$Companion.WEB3 : "";
        }
        jSONObject.put("postType", string);
        if (item.getIsSpot()) {
            symbol = item.getShowSymbol();
        }
        jSONObject.put("trade_pair", symbol);
        jSONObject.put(ViewProps.POSITION, currentTab);
        jSONObject.put("sortPosition", i11);
        jSONObject.put("commentPosition", i12);
        jSONObject.put("contentItem", currentSearchKey);
        if (z11) {
            jSONObject.put("clickPosition", clickPosition);
        }
        if (z11) {
            C27023a.m66555b("B1SearchOrSearchResultPage", "searchResult", null, jSONObject, 4, null);
        } else {
            C27023a.m66557d("B1SearchOrSearchResultPage", "searchResult", null, jSONObject, 4, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m59605a(@NotNull String inputWords) throws JSONException {
        Intrinsics.checkNotNullParameter(inputWords, "inputWords");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("groupId", SearchConst.f49150a.m59592a());
        jSONObject.put("contentItem", inputWords);
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d("B1SearchOrSearchResultPage", "enterKeyword", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m59606b(@NotNull String contentItem) throws JSONException {
        Intrinsics.checkNotNullParameter(contentItem, "contentItem");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("groupId", SearchConst.f49150a.m59592a());
        jSONObject.put("contentItem", contentItem);
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d("B1SearchOrSearchResultPage", "enterValidKeyword", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m59607c(long j11, int i11, int i12, int i13, int i14, @NotNull String resultType) throws JSONException {
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("groupId", SearchConst.f49150a.m59592a());
        jSONObject.put("loadingTime", String.valueOf(j11));
        jSONObject.put("allItemAmount", String.valueOf(i11));
        jSONObject.put("likes", String.valueOf(i12));
        jSONObject.put("replies", String.valueOf(i13));
        jSONObject.put("intervals", String.valueOf(i14));
        jSONObject.put("resultType", resultType);
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d("B1SearchOrSearchResultPage", "resultReturn", null, jSONObject, 4, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX INFO: renamed from: d */
    public final void m59608d(@NotNull String type) throws JSONException {
        String str;
        Intrinsics.checkNotNullParameter(type, "type");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("groupId", SearchConst.f49150a.m59592a());
        switch (type.hashCode()) {
            case -503567600:
                str = SearchCategory$Companion.FUTURES;
                if (!type.equals(SearchCategory$Companion.FUTURES)) {
                    str = "";
                }
                break;
            case 3105752:
                str = SearchCategory$Companion.EARN;
                if (!type.equals(SearchCategory$Companion.EARN)) {
                    str = "";
                }
                break;
            case 3537154:
                str = SearchCategory$Companion.SPOT;
                if (!type.equals(SearchCategory$Companion.SPOT)) {
                    str = "";
                }
                break;
            case 3645279:
                str = SearchCategory$Companion.WEB3;
                if (!type.equals(SearchCategory$Companion.WEB3)) {
                    str = "";
                }
                break;
            case 92909918:
                str = "alpha";
                if (!type.equals("alpha")) {
                    str = "";
                }
                break;
            default:
                str = "";
                break;
        }
        jSONObject.put(ViewProps.POSITION, str);
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b("B1SearchOrSearchResultPage", "moreResult", null, jSONObject, 4, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX INFO: renamed from: e */
    public final void m59609e(@NotNull String currentTab, @NotNull String currentSearchKey) throws JSONException {
        String str;
        Intrinsics.checkNotNullParameter(currentTab, "currentTab");
        Intrinsics.checkNotNullParameter(currentSearchKey, "currentSearchKey");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("groupId", SearchConst.f49150a.m59592a());
        switch (currentTab.hashCode()) {
            case -503567600:
                str = SearchCategory$Companion.FUTURES;
                if (!currentTab.equals(SearchCategory$Companion.FUTURES)) {
                    str = TtmlNode.COMBINE_ALL;
                }
                break;
            case 3105752:
                str = SearchCategory$Companion.EARN;
                if (!currentTab.equals(SearchCategory$Companion.EARN)) {
                    str = TtmlNode.COMBINE_ALL;
                }
                break;
            case 3537154:
                str = SearchCategory$Companion.SPOT;
                if (!currentTab.equals(SearchCategory$Companion.SPOT)) {
                    str = TtmlNode.COMBINE_ALL;
                }
                break;
            case 3645279:
                str = SearchCategory$Companion.WEB3;
                if (!currentTab.equals(SearchCategory$Companion.WEB3)) {
                    str = TtmlNode.COMBINE_ALL;
                }
                break;
            case 92909918:
                str = "alpha";
                if (!currentTab.equals("alpha")) {
                    str = TtmlNode.COMBINE_ALL;
                }
                break;
            default:
                str = TtmlNode.COMBINE_ALL;
                break;
        }
        jSONObject.put(ViewProps.POSITION, str);
        jSONObject.put("contentItem", currentSearchKey);
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d("B1SearchOrSearchResultPage", "nullSearchResult", null, jSONObject, 4, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX INFO: renamed from: f */
    public final void m59610f(@NotNull String currentTab) throws JSONException {
        String str;
        Intrinsics.checkNotNullParameter(currentTab, "currentTab");
        JSONObject jSONObject = new JSONObject();
        switch (currentTab.hashCode()) {
            case -503567600:
                str = SearchCategory$Companion.FUTURES;
                if (!currentTab.equals(SearchCategory$Companion.FUTURES)) {
                    str = TtmlNode.COMBINE_ALL;
                }
                break;
            case 3105752:
                str = SearchCategory$Companion.EARN;
                if (!currentTab.equals(SearchCategory$Companion.EARN)) {
                    str = TtmlNode.COMBINE_ALL;
                }
                break;
            case 3537154:
                str = SearchCategory$Companion.SPOT;
                if (!currentTab.equals(SearchCategory$Companion.SPOT)) {
                    str = TtmlNode.COMBINE_ALL;
                }
                break;
            case 3645279:
                str = SearchCategory$Companion.WEB3;
                if (!currentTab.equals(SearchCategory$Companion.WEB3)) {
                    str = TtmlNode.COMBINE_ALL;
                }
                break;
            case 92909918:
                str = "alpha";
                if (!currentTab.equals("alpha")) {
                    str = TtmlNode.COMBINE_ALL;
                }
                break;
            default:
                str = TtmlNode.COMBINE_ALL;
                break;
        }
        jSONObject.put(ViewProps.POSITION, str);
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b("B1SearchOrSearchResultPage", "resultTab", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m59612h(@NotNull String blockId, @NotNull String postTitle, int i11, @Nullable Double d11, @NotNull String clickPosition, boolean z11) throws JSONException {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(postTitle, "postTitle");
        Intrinsics.checkNotNullParameter(clickPosition, "clickPosition");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("postTitle", postTitle);
        jSONObject.put("sortPosition", String.valueOf(i11));
        jSONObject.put("intervals", C27039d.m66646f(d11));
        jSONObject.put("clickPosition", clickPosition);
        if (z11) {
            C27023a.m66555b("B1SearchOrSearchResultPage", blockId, null, jSONObject, 4, null);
        } else {
            C27023a.m66557d("B1SearchOrSearchResultPage", blockId, null, jSONObject, 4, null);
        }
    }
}
