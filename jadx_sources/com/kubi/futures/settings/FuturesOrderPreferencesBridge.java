package com.kubi.futures.settings;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.PreferencesEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p663uh.InterfaceC45238b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.futures.settings.o0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FuturesOrderPreferencesBridge.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005J\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000fJ$\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fJ\u001e\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/futures/settings/FuturesOrderPreferencesBridge;", "", "<init>", "()V", "CONFIG_TAB", "", "UPDATE_ACTION", "CONTRACT_VERSION", "", "STATUS_READY", "TWAP_ORDER", "isAction", "", TUIConstants.TUIChat.INPUT_MORE_ACTION_ID, "snapshot", "", "handleAction", ReportDataTable.COLUMN_PARAMS, "requireContractVersion", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesOrderPreferencesBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesOrderPreferencesBridge.kt\ncom/kubi/futures/settings/FuturesOrderPreferencesBridge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
public final class FuturesOrderPreferencesBridge {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FuturesOrderPreferencesBridge f23409a = new FuturesOrderPreferencesBridge();

    /* JADX INFO: renamed from: c */
    public final void m26354c(Map<String, ? extends Object> map) {
        Object obj = map != null ? map.get("contractVersion") : null;
        Number number = obj instanceof Number ? (Number) obj : null;
        Integer numValueOf = number != null ? Integer.valueOf(number.intValue()) : null;
        if (numValueOf == null || numValueOf.intValue() != 1) {
            throw new IllegalArgumentException(("Unsupported contractVersion: " + numValueOf).toString());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Map<String, Object> m26355d() {
        Pair pairM90091to = TuplesKt.m90091to("contractVersion", 1);
        Pair pairM90091to2 = TuplesKt.m90091to("status", "ready");
        Boolean twapOrder = RepositoryServiceLocator.f19236a.m20290i().mo99988m().getTwapOrder();
        return MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("values", MapsKt.mapOf(TuplesKt.m90091to("twapOrder", Boolean.valueOf(twapOrder != null ? twapOrder.booleanValue() : true)))));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26352a(@NotNull String actionId, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        if (!Intrinsics.areEqual(actionId, "updateOrderPreference")) {
            return false;
        }
        m26354c(map);
        if (map == null) {
            throw new IllegalArgumentException("params are required");
        }
        Object obj = map.get("key");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            throw new IllegalArgumentException("key must be string");
        }
        if (!Intrinsics.areEqual(str, "twapOrder")) {
            throw new IllegalArgumentException(("Unknown order preference: " + str).toString());
        }
        Object obj2 = map.get("enabled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        if (bool == null) {
            throw new IllegalArgumentException("enabled must be boolean");
        }
        InterfaceC45238b interfaceC45238bM20290i = RepositoryServiceLocator.f19236a.m20290i();
        PreferencesEntity preferencesEntityMo99988m = interfaceC45238bM20290i.mo99988m();
        preferencesEntityMo99988m.setTwapOrder(bool);
        interfaceC45238bM20290i.mo99986i(preferencesEntityMo99988m);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m26353b(@NotNull String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        return Intrinsics.areEqual(actionId, "updateOrderPreference");
    }
}
