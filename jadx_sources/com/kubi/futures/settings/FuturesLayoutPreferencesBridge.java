package com.kubi.futures.settings;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.utils.Persistence;
import com.kubi.otc.entity.OtcAd;
import com.kubi.utils.C27063n;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.futures.settings.n0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FuturesLayoutPreferencesBridge.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005J\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0019J$\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019J\b\u0010\u001c\u001a\u00020\u0005H\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0002J\u0012\u0010!\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0002J\u001e\u0010\"\u001a\u00020\u001f2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/futures/settings/FuturesLayoutPreferencesBridge;", "", "<init>", "()V", "CONFIG_TAB", "", "UPDATE_ACTION", "CONTRACT_VERSION", "", "STATUS_READY", "ORDER_PANEL_POSITION", "KLINE_POSITION", "KLINE_PANEL_OPEN", "ORDER_SIDE_LAYOUT", "LEFT", "RIGHT", "TOP", "BOTTOM", OtcAd.STATUS_HIDDEN, "TOGETHER", "SPLIT", "isAction", "", TUIConstants.TUIChat.INPUT_MORE_ACTION_ID, "snapshot", "", "handleAction", ReportDataTable.COLUMN_PARAMS, "readOrderPanelPosition", "readKlinePosition", "writeOrderPanelPosition", "", "value", "writeKlinePosition", "requireContractVersion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesLayoutPreferencesBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesLayoutPreferencesBridge.kt\ncom/kubi/futures/settings/FuturesLayoutPreferencesBridge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
public final class FuturesLayoutPreferencesBridge {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FuturesLayoutPreferencesBridge f23398a = new FuturesLayoutPreferencesBridge();

    /* JADX INFO: renamed from: c */
    public final String m26346c() {
        int iM66765c = C27063n.m66765c("k_panel_position", 0, 1, null);
        if (iM66765c != 1) {
            return iM66765c != 2 ? ViewProps.TOP : ViewProps.HIDDEN;
        }
        return ViewProps.BOTTOM;
    }

    /* JADX INFO: renamed from: e */
    public final void m26348e(Map<String, ? extends Object> map) {
        Object obj = map != null ? map.get("contractVersion") : null;
        Number number = obj instanceof Number ? (Number) obj : null;
        Integer numValueOf = number != null ? Integer.valueOf(number.intValue()) : null;
        if (numValueOf == null || numValueOf.intValue() != 1) {
            throw new IllegalArgumentException(("Unsupported contractVersion: " + numValueOf).toString());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Map<String, Object> m26349f() {
        Pair pairM90091to = TuplesKt.m90091to("contractVersion", 1);
        Pair pairM90091to2 = TuplesKt.m90091to("status", "ready");
        Pair pairM90091to3 = TuplesKt.m90091to("orderPanelPosition", m26347d());
        Pair pairM90091to4 = TuplesKt.m90091to("klinePosition", m26346c());
        Persistence persistence = Persistence.f30799a;
        return MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("values", MapsKt.mapOf(pairM90091to3, pairM90091to4, TuplesKt.m90091to("klinePanelOpen", Boolean.valueOf(persistence.m36516a("contract_small_k_line_expand", false))), TuplesKt.m90091to("orderSideLayout", persistence.m36517c("panel_long_short_type", 1) == 0 ? "together" : "split"))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: a */
    public final boolean m26344a(@NotNull String actionId, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        int i11 = 0;
        if (!Intrinsics.areEqual(actionId, "updateLayoutPreference")) {
            return false;
        }
        m26348e(map);
        if (map == null) {
            throw new IllegalArgumentException("params are required");
        }
        Object obj = map.get("key");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            throw new IllegalArgumentException("key must be string");
        }
        Object obj2 = map.get("value");
        switch (str) {
            case "klinePosition":
                m26350g(obj2);
                return true;
            case "klinePanelOpen":
                Persistence persistence = Persistence.f30799a;
                Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                if (bool == null) {
                    throw new IllegalArgumentException("klinePanelOpen must be boolean");
                }
                persistence.m36519f("contract_small_k_line_expand", bool.booleanValue());
                return true;
            case "orderPanelPosition":
                m26351h(obj2);
                return true;
            case "orderSideLayout":
                Persistence persistence2 = Persistence.f30799a;
                if (!Intrinsics.areEqual(obj2, "together")) {
                    if (!Intrinsics.areEqual(obj2, "split")) {
                        throw new IllegalArgumentException("Unknown orderSideLayout: " + obj2);
                    }
                    i11 = 1;
                }
                persistence2.m36520g("panel_long_short_type", i11);
                return true;
            default:
                if (str.equals("klinePosition")) {
                    m26350g(obj2);
                    return true;
                }
                throw new IllegalArgumentException("Unknown layout preference: " + str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m26345b(@NotNull String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        return Intrinsics.areEqual(actionId, "updateLayoutPreference");
    }

    /* JADX INFO: renamed from: d */
    public final String m26347d() {
        return C27063n.m66764b("trade_panel_position", 1) == 0 ? "left" : "right";
    }

    /* JADX INFO: renamed from: g */
    public final void m26350g(Object obj) {
        int i11;
        if (Intrinsics.areEqual(obj, ViewProps.TOP)) {
            i11 = 0;
        } else if (Intrinsics.areEqual(obj, ViewProps.BOTTOM)) {
            i11 = 1;
        } else {
            if (!Intrinsics.areEqual(obj, ViewProps.HIDDEN)) {
                throw new IllegalArgumentException("Unknown klinePosition: " + obj);
            }
            i11 = 2;
        }
        C27063n.m66770h(i11, "k_panel_position");
    }

    /* JADX INFO: renamed from: h */
    public final void m26351h(Object obj) {
        int i11;
        if (Intrinsics.areEqual(obj, "left")) {
            i11 = 0;
        } else {
            if (!Intrinsics.areEqual(obj, "right")) {
                throw new IllegalArgumentException("Unknown orderPanelPosition: " + obj);
            }
            i11 = 1;
        }
        C27063n.m66770h(i11, "trade_panel_position");
    }
}
