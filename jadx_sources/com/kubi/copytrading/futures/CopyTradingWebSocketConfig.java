package com.kubi.copytrading.futures;

import android.annotation.SuppressLint;
import androidx.credentials.provider.CredentialEntry;
import com.kubi.network.socket.WebSocketClient;
import com.kubi.network.subscribe.codec.SubscribeSocketKCCodec;
import com.kubi.network.subscribe.token.SubscribeTokenConfig;
import com.kubi.network.subscribe.token.SubscribeTokenProvider;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.BaseApplication;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27041f;
import er.C37237b;
import er.InterfaceC37236a;
import java.util.ArrayList;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import p672ur.C45291a;
import p672ur.C45292b;
import p672ur.C45293c;
import p700vr.C45623a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.copytrading.futures.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CopyTradingWebSocketConfig.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\tj\b\u0012\u0004\u0012\u00020\u0006`\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/copytrading/futures/CopyTradingWebSocketConfig;", "", "<init>", "()V", "cacheKey", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "getCopyTradingPrivateTopic", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "configWebsocket", "", "clearClient", "connectClient", "getChannelKey", "uid", "getCopyTradingWs", "Lcom/kubi/network/api/IWebSocketClient;", "subUid", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCopyTradingWebSocketConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingWebSocketConfig.kt\ncom/kubi/copytrading/futures/CopyTradingWebSocketConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1#2:117\n1869#3,2:118\n1869#3,2:120\n*S KotlinDebug\n*F\n+ 1 CopyTradingWebSocketConfig.kt\ncom/kubi/copytrading/futures/CopyTradingWebSocketConfig\n*L\n80#1:118,2\n88#1:120,2\n*E\n"})
public final class CopyTradingWebSocketConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CopyTradingWebSocketConfig f19918a = new CopyTradingWebSocketConfig();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final HashSet<String> f19919b = new HashSet<>();

    @SuppressLint({"KCSynchronizedCheck"})
    @NotNull
    /* JADX INFO: renamed from: h */
    public final synchronized InterfaceC37236a m20888h(@NotNull String subUid) {
        InterfaceC37236a interfaceC37236aM83282e;
        Intrinsics.checkNotNullParameter(subUid, "subUid");
        try {
            interfaceC37236aM83282e = C37237b.m83282e(m20886f(subUid));
        } catch (Exception unused) {
            m20884c();
            interfaceC37236aM83282e = C37237b.m83282e(m20886f(subUid));
        }
        f19919b.add(f19918a.m20886f(subUid));
        return interfaceC37236aM83282e;
    }

    /* JADX INFO: renamed from: d */
    public static final String m20881d(String str) {
        return C27041f.m66668h(UserInfo.c().id) + str;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ InterfaceC37236a m20882i(CopyTradingWebSocketConfig copyTradingWebSocketConfig, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = FutureCopyTradingConfig.f19902a.m20876k();
        }
        return copyTradingWebSocketConfig.m20888h(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m20883b() {
        for (String str : f19919b) {
            try {
                Result.Companion companion = Result.INSTANCE;
                C37237b.m83282e(str).disconnect();
                Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20884c() {
        final String strM20876k = FutureCopyTradingConfig.f19902a.m20876k();
        SubscribeTokenProvider subscribeTokenProvider = new SubscribeTokenProvider(new SubscribeTokenConfig(null, MapsKt.mapOf(TuplesKt.m90091to("encrypt", CredentialEntry.TRUE_STRING), TuplesKt.m90091to("protocol", "websocket"), TuplesKt.m90091to("source", "android"), TuplesKt.m90091to("sub_uid", strM20876k)), MapsKt.mapOf(TuplesKt.m90091to("isWs", CredentialEntry.TRUE_STRING), TuplesKt.m90091to(Constants.BIZ, "kumex")), null, new Function0() { // from class: com.kubi.copytrading.futures.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CopyTradingWebSocketConfig.m20881d(strM20876k);
            }
        }, 9, null), null, 2, null);
        String strM20886f = m20886f(strM20876k);
        WebSocketClient webSocketClientM42867a = new WebSocketClient.C19339a().m42865A(new C45623a()).m42888v(new SubscribeSocketKCCodec(subscribeTokenProvider, m20887g())).m42886t(new C45291a("contract_copy_trading", 0L, 2, null)).m42890x(new C45292b("contract_copy_trading")).m42892z(new C45293c("contract_copy_trading")).m42866B(subscribeTokenProvider).m42867a(BaseApplication.INSTANCE.get());
        webSocketClientM42867a.connect();
        C37237b.m83284g(strM20886f, webSocketClientM42867a);
    }

    /* JADX INFO: renamed from: e */
    public final void m20885e() {
        for (String str : f19919b) {
            try {
                Result.Companion companion = Result.INSTANCE;
                C37237b.m83282e(str).connect();
                Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m20886f(String str) {
        return "network/channel_futures_copy_" + str;
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList<String> m20887g() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("/contractAccount/wallet");
        arrayList.add("/contractMarket/userActiveOrder");
        arrayList.add("/contractMarket/stopOrder");
        arrayList.add("/contract/positionAll");
        arrayList.add("/contract/position:%s");
        arrayList.add("/contract/crossLeverage");
        arrayList.add("/contract/marginModeV2");
        arrayList.add("/contract/positionMode");
        arrayList.add("/futuresTrial/positionAll");
        arrayList.add("/futuresTrial/wallet");
        arrayList.add("/futuresTrial/userActiveOrder");
        arrayList.add("/futuresTrial/stopOrder");
        return arrayList;
    }
}
