package com.kubi.home.deposit;

import com.kubi.home.R$mipmap;
import com.kubi.home.R$string;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.utils.C27059l;
import com.kubi.utils.extensions.C27023a;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37758j;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.deposit.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DepositManager.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u001a\u0010\f\u001a\u00020\b*\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/home/deposit/DepositManager;", "", "<init>", "()V", "AFTER_PAGE_ID", "", "NORM_VERSION", "isDirectlyJump", "", "getDepositList", "", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "addInto", "list", "", "str", "id", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DepositManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DepositManager f25628a = new DepositManager();

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<MultiItemEntity> m29126i() {
        final String strM96602n = C43852m.m96602n("Depositpage", "Depositpage", null, 4, null);
        final ArrayList arrayList = new ArrayList();
        m29125h(new DepositTitleEntity(m29128r(R$string.home_deposit_title_no_asset)), arrayList);
        C24129b.m58033e(SiteVisibleConfigKey.FastTrade, new Function0() { // from class: com.kubi.home.deposit.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DepositManager.m29119k(arrayList, strM96602n);
            }
        });
        C24129b.m58033e(SiteVisibleConfigKey.FiatDeposit, new Function0() { // from class: com.kubi.home.deposit.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DepositManager.m29121m(arrayList, strM96602n);
            }
        });
        C24129b.m58033e(SiteVisibleConfigKey.P2P, new Function0() { // from class: com.kubi.home.deposit.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DepositManager.m29123o(arrayList, strM96602n);
            }
        });
        m29125h(new DepositTitleEntity(m29128r(R$string.home_deposit_title_has_asset)), arrayList);
        m29125h(new DepositItemEntity(R$mipmap.home_deposit_crypto, m29128r(R$string.home_deposit_crypto_title), m29128r(R$string.home_deposit_crypto_tips), false, new Function0() { // from class: com.kubi.home.deposit.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DepositManager.m29118j(strM96602n);
            }
        }), arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m29118j(String str) throws JSONException {
        InterfaceC37749a.a.m85110e(C37304a.f82764a, null, Long.valueOf(C24129b.m58030b(SiteVisibleConfigKey.FiatDeposit) ? 1L : 0L), 0L, str, null, null, 49, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("buttn", "DepositCrypton");
        jSONObject.put("after_page_id", "B1depositCoinList");
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b("Depositpage", "Depositpage", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m29119k(List list, final String str) {
        DepositManager depositManager = f25628a;
        depositManager.m29125h(new DepositItemEntity(R$mipmap.home_deposit_card, depositManager.m29128r(R$string.home_deposit_ft_title), depositManager.m29128r(R$string.home_deposit_ft_tips), true, new Function0() { // from class: com.kubi.home.deposit.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DepositManager.m29120l(str);
            }
        }), list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m29120l(String str) throws JSONException {
        InterfaceC37758j.a.m85163l(C37304a.f82764a, 2L, null, null, null, str, null, null, 110, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("buttn", "BuyCryptodirectly");
        jSONObject.put("after_page_id", "B7FastTrade");
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b("Depositpage", "Depositpage", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m29121m(List list, final String str) {
        DepositManager depositManager = f25628a;
        depositManager.m29125h(new DepositItemEntity(R$mipmap.home_deposit_fiat, depositManager.m29128r(R$string.home_deposit_fiat_title), depositManager.m29128r(R$string.home_deposit_fiat_tips), false, new Function0() { // from class: com.kubi.home.deposit.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DepositManager.m29122n(str);
            }
        }), list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m29122n(String str) throws JSONException {
        InterfaceC37749a.a.m85110e(C37304a.f82764a, null, 1L, 1L, str, null, null, 49, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("buttn", "Fiat");
        jSONObject.put("after_page_id", "B7FiatList");
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b("Depositpage", "Depositpage", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m29123o(List list, final String str) {
        DepositManager depositManager = f25628a;
        depositManager.m29125h(new DepositItemEntity(R$mipmap.home_deposit_p2p, depositManager.m29128r(R$string.home_deposit_p2p_title), depositManager.m29128r(R$string.home_deposit_p2p_tips), false, new Function0() { // from class: com.kubi.home.deposit.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DepositManager.m29124p(str);
            }
        }), list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m29124p(String str) throws JSONException {
        InterfaceC37758j.a.m85163l(C37304a.f82764a, 0L, null, null, null, str, null, null, 110, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("buttn", FastQuoteModel.PAY_P2P);
        jSONObject.put("after_page_id", "B7P2P");
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b("Depositpage", "Depositpage", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m29127q() {
        return (C24129b.m58030b(SiteVisibleConfigKey.FastTrade) || C24129b.m58030b(SiteVisibleConfigKey.FiatDeposit) || C24129b.m58030b(SiteVisibleConfigKey.P2P)) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    public final String m29128r(int i11) {
        String string = C27059l.f54343a.m66757a().getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m29125h(MultiItemEntity multiItemEntity, List<MultiItemEntity> list) {
        return list.add(multiItemEntity);
    }
}
