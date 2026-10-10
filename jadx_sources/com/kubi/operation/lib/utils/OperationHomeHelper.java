package com.kubi.operation.lib.utils;

import com.kubi.home.api.IHomeService;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.utils.extensions.C27023a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.operation.lib.utils.v, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OperationHomeHelper.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\u000b*\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ1\u0010\u0010\u001a\u00020\u000b*\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0012J!\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/operation/lib/utils/OperationHomeHelper;", "", "<init>", "()V", "homePageId", "", "getHomePageId", "()Ljava/lang/String;", "homePageId$delegate", "Lkotlin/Lazy;", "homeExpose", "", "locationId", "contentType", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "homeClick", "tradeCurrency", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "filtered", "", "blockId", "(Ljava/lang/String;Ljava/lang/Integer;)Z", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOperationHomeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperationHomeHelper.kt\ncom/kubi/operation/lib/utils/OperationHomeHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class OperationHomeHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final OperationHomeHelper f36890a = new OperationHomeHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f36891b = LazyKt.lazy(new Function0() { // from class: com.kubi.operation.lib.utils.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OperationHomeHelper.m43675h();
        }
    });

    /* JADX INFO: renamed from: b */
    public final boolean m43676b(String str, Integer num) {
        if (str == null || str.length() == 0) {
            return true;
        }
        if (Intrinsics.areEqual(str, "noLoginedWelfare") || Intrinsics.areEqual(str, "noLoginedCurrency")) {
            return (num == null || num.intValue() != 2) && (num == null || num.intValue() != 3) && (num == null || num.intValue() != -1);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m43673e(OperationHomeHelper operationHomeHelper, String str, String str2, Integer num, String str3, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            str2 = "1";
        }
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        operationHomeHelper.m43678d(str, str2, num, str3);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m43674g(OperationHomeHelper operationHomeHelper, String str, String str2, Integer num, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            str2 = "1";
        }
        if ((i11 & 2) != 0) {
            num = null;
        }
        operationHomeHelper.m43679f(str, str2, num);
    }

    /* JADX INFO: renamed from: h */
    public static final String m43675h() {
        return HomeCardViewHolderProxy.PAGE_ID;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m43677c() {
        return (String) f36891b.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m43678d(@NotNull String str, @NotNull String locationId, @Nullable Integer num, @Nullable String str2) throws JSONException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        int iIntValue = (num == null && (num = IHomeService.f25434a.get().mo28954j()) == null) ? -1 : num.intValue();
        if (m43676b(str, Integer.valueOf(iIntValue))) {
            return;
        }
        String strM43677c = m43677c();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("contentType", String.valueOf(iIntValue));
        if (str2 != null) {
            jSONObject.put("trade_currency", str2);
        }
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a(strM43677c, str, locationId, jSONObject);
    }

    /* JADX INFO: renamed from: f */
    public final void m43679f(@NotNull String str, @NotNull String locationId, @Nullable Integer num) throws JSONException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        int iIntValue = (num == null && (num = IHomeService.f25434a.get().mo28954j()) == null) ? -1 : num.intValue();
        if (m43676b(str, Integer.valueOf(iIntValue))) {
            return;
        }
        String strM43677c = m43677c();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("contentType", String.valueOf(iIntValue));
        Unit unit = Unit.INSTANCE;
        C27023a.m66556c(strM43677c, str, locationId, jSONObject);
    }
}
