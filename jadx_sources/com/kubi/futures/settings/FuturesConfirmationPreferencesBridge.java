package com.kubi.futures.settings;

import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.utils.Persistence;
import com.kubi.user.config.UserInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import fm.C37568c;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import y70.C46392a;
import y70.C46396e;

/* JADX INFO: renamed from: com.kubi.futures.settings.m0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FuturesConfirmationPreferencesBridge.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0015J$\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0012H\u0002J\u001e\u0010\u001c\u001a\u00020\u00192\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0002J,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/futures/settings/FuturesConfirmationPreferencesBridge;", "", "<init>", "()V", "CONFIG_TAB", "", "UPDATE_ACTION", "UPDATE_ALL_ACTION", "CONTRACT_VERSION", "", "STATUS_READY", "VALUE_SOURCE_STORED", "VALUE_SOURCE_DEFAULT", "CLOSE_ALL_POSITION", "MARKET_CLOSE_ALL_POSITION", "REVERSE_POSITION", "CHASE_ORDER", "isAction", "", TUIConstants.TUIChat.INPUT_MORE_ACTION_ID, "snapshot", "", "handleAction", ReportDataTable.COLUMN_PARAMS, "write", "", "key", "enabled", "requireContractVersion", "closeAllPositionKey", "isReversePositionVisible", "isChaseOrderVisible", "item", ViewProps.VISIBLE, "stored", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesConfirmationPreferencesBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesConfirmationPreferencesBridge.kt\ncom/kubi/futures/settings/FuturesConfirmationPreferencesBridge\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n136#2:140\n136#2:141\n136#2:142\n126#2,2:144\n126#2,2:146\n126#2,2:148\n1#3:143\n*S KotlinDebug\n*F\n+ 1 FuturesConfirmationPreferencesBridge.kt\ncom/kubi/futures/settings/FuturesConfirmationPreferencesBridge\n*L\n53#1:140\n58#1:141\n63#1:142\n100#1:144,2\n103#1:146,2\n108#1:148,2\n*E\n"})
public final class FuturesConfirmationPreferencesBridge {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FuturesConfirmationPreferencesBridge f23389a = new FuturesConfirmationPreferencesBridge();

    /* JADX INFO: renamed from: g */
    public final void m26341g(Map<String, ? extends Object> map) {
        Object obj = map != null ? map.get("contractVersion") : null;
        Number number = obj instanceof Number ? (Number) obj : null;
        Integer numValueOf = number != null ? Integer.valueOf(number.intValue()) : null;
        if (numValueOf == null || numValueOf.intValue() != 1) {
            throw new IllegalArgumentException(("Unsupported contractVersion: " + numValueOf).toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m26335a() {
        String strI = UserInfo.a.i();
        if (StringsKt.isBlank(strI)) {
            throw new IllegalStateException("Current user is unavailable");
        }
        return "positions_close_all_tips" + strI;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m26336b(@NotNull String actionId, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        m26341g(map);
        if (map == null) {
            throw new IllegalArgumentException("params are required");
        }
        Object obj = map.get("enabled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool == null) {
            throw new IllegalArgumentException("enabled must be boolean");
        }
        boolean zBooleanValue = bool.booleanValue();
        if (Intrinsics.areEqual(actionId, "updateConfirmationPreference")) {
            Object obj2 = map.get("key");
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null) {
                throw new IllegalArgumentException("key must be string");
            }
            m26343i(str, zBooleanValue);
            return true;
        }
        if (!Intrinsics.areEqual(actionId, "updateAllConfirmationPreferences")) {
            return false;
        }
        m26343i("closeAllPosition", zBooleanValue);
        m26343i("marketCloseAllPosition", zBooleanValue);
        if (m26339e()) {
            m26343i("reversePosition", zBooleanValue);
        }
        if (m26338d()) {
            m26343i("chaseOrder", zBooleanValue);
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m26337c(@NotNull String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        return Intrinsics.areEqual(actionId, "updateConfirmationPreference") || Intrinsics.areEqual(actionId, "updateAllConfirmationPreferences");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m26339e() {
        return RepositoryServiceLocator.f19236a.m20288g().mo25020o();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m26338d() {
        return C37568c.m84643n();
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, Object> m26340f(boolean z11, boolean z12, boolean z13) {
        String str;
        Pair pairM90091to = TuplesKt.m90091to("enabled", Boolean.valueOf(z11));
        Pair pairM90091to2 = TuplesKt.m90091to(ViewProps.VISIBLE, Boolean.valueOf(z12));
        Pair pairM90091to3 = TuplesKt.m90091to("writable", Boolean.valueOf(z12));
        if (z13) {
            str = "stored";
        } else {
            str = "default";
        }
        return MapsKt.mapOf(pairM90091to, pairM90091to2, pairM90091to3, TuplesKt.m90091to("valueSource", str));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Map<String, Object> m26342h() {
        String strM26335a = m26335a();
        boolean zM26339e = m26339e();
        boolean zM26338d = m26338d();
        Pair pairM90091to = TuplesKt.m90091to("contractVersion", 1);
        Pair pairM90091to2 = TuplesKt.m90091to("status", "ready");
        Pair pairM90091to3 = TuplesKt.m90091to("closeAllPosition", m26340f(Persistence.f30799a.m36516a(strM26335a, true), true, C46396e.m102345b("BKuMex", strM26335a)));
        C46894j c46894j = C46894j.f104736a;
        return MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to(FirebaseAnalytics.Param.ITEMS, MapsKt.mapOf(pairM90091to3, TuplesKt.m90091to("marketCloseAllPosition", m26340f(C46392a.m102322d(c46894j.m103243H(), true), true, C46392a.m102320b(c46894j.m103243H()))), TuplesKt.m90091to("reversePosition", m26340f(C46392a.m102322d(c46894j.m103250O(), true), zM26339e, C46392a.m102320b(c46894j.m103250O()))), TuplesKt.m90091to("chaseOrder", m26340f(C46392a.m102322d(c46894j.m103280s(), true), zM26338d, C46392a.m102320b(c46894j.m103280s()))))));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: i */
    public final void m26343i(String str, boolean z11) {
        switch (str.hashCode()) {
            case -2066054144:
                if (str.equals("chaseOrder")) {
                    if (m26338d()) {
                        C46392a.m102328k(C46894j.f104736a.m103280s(), z11);
                        return;
                    }
                    throw new IllegalStateException("chaseOrder is unavailable");
                }
                break;
            case -739029461:
                if (str.equals("reversePosition")) {
                    if (m26339e()) {
                        C46392a.m102328k(C46894j.f104736a.m103250O(), z11);
                        return;
                    }
                    throw new IllegalStateException("reversePosition is unavailable");
                }
                break;
            case -613473070:
                if (str.equals("closeAllPosition")) {
                    Persistence.f30799a.m36519f(m26335a(), z11);
                    return;
                }
                break;
            case -320338642:
                if (str.equals("marketCloseAllPosition")) {
                    C46392a.m102328k(C46894j.f104736a.m103243H(), z11);
                    return;
                }
                break;
        }
        throw new IllegalArgumentException("Unknown confirmation preference: " + str);
    }
}
