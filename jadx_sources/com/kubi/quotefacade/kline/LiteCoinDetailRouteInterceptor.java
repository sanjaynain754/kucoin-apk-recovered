package com.kubi.quotefacade.kline;

import android.net.Uri;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p569qq.C43846g;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LiteCoinDetailRouteInterceptor.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "liteRnCoinDetailEnable", "", "intercept", "chain", "Lcom/kubi/router/interceptor/IChain;", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiteCoinDetailRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteCoinDetailRouteInterceptor.kt\ncom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,51:1\n35#2,4:52\n39#2:58\n44#3,2:56\n*S KotlinDebug\n*F\n+ 1 LiteCoinDetailRouteInterceptor.kt\ncom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor\n*L\n26#1:52,4\n26#1:58\n26#1:56,2\n*E\n"})
public final class LiteCoinDetailRouteInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f42143b = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final boolean f42144a;

    /* JADX INFO: compiled from: LiteCoinDetailRouteInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/quotefacade/kline/LiteCoinDetailRouteInterceptor$Companion;", "", "<init>", "()V", "REMOTE_CONFIG_KEY", "", "LITE_COIN_DETAIL_PATH", "RN_COIN_DETAIL_URL", "FLUTTER_COIN_DETAIL_URL", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.kline.LiteCoinDetailRouteInterceptor$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C22248a extends TypeToken<Boolean> {
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        Uri uri = Uri.parse(this.f42144a ? "kucoin://krn/router?biz=trade_center&entry=main&component=kc_trade_center_next&route=lite/market/coin/details" : "kucoin://flutter?route=lite/market/coin/details");
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        return chain.mo103413a(new C4400a(uri, postcard.getBundle()));
    }

    public LiteCoinDetailRouteInterceptor() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C22248a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_lite_rn_coin_detail_page", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        this.f42144a = C27025c.m66567e((Boolean) objM20457a, false);
    }
}
