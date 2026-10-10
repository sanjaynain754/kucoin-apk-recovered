package com.kubi.kucoin.manager;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.WsAlphaSnapshotEntity;
import com.kubi.network.restful.C19321b;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kucoin.discover.alpha.AlphaTickerOuterClass$AlphaTicker;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import er.C37237b;
import gr.C38000b;
import gr.C38003e;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p830zf.InterfaceC46830z;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kucoin.manager.i */
/* JADX INFO: compiled from: MarketAlphaTickerPbWsApi.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0004\u001a\b\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\b\u0010\u0007\u001a\u00020\u0006H\u0000\u001aC\u0010\t\u001a\u0002H\n\"\u0006\b\u0000\u0010\u000b\u0018\u0001\"\u0004\b\u0001\u0010\n2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\n0\r¢\u0006\u0002\b\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\n0\u0010H\u0082\b¢\u0006\u0002\u0010\u0011\u001a\u000e\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001\u001a\n\u0010\u0014\u001a\u00020\u0015*\u00020\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"ALPHA_TICKER_PB_PREFIX", "", "DEFAULT_ALPHA_SPAN", "buildMarketAlphaTickerPbWsApi", "Lcom/kubi/kucoin/manager/IMarketAlphaTickerPbWsApi;", "isMarketFuturePBV2Enable", "", "isMarketPBV2AlphaEnable", "defaultMarketPbV2OpenEnable", "flavor", "R", "F", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "default", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "normalizeAlphaSpan", TtmlNode.TAG_SPAN, "toWsAlphaSnapshotEntity", "Lcom/kubi/data/entity/WsAlphaSnapshotEntity;", "Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketAlphaTickerPbWsApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketAlphaTickerPbWsApi.kt\ncom/kubi/kucoin/manager/MarketAlphaTickerPbWsApiKt\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n68#1,2:115\n35#2,4:100\n39#2:106\n35#2,4:107\n39#2:113\n44#3,2:104\n44#3,2:111\n1#4:114\n*S KotlinDebug\n*F\n+ 1 MarketAlphaTickerPbWsApi.kt\ncom/kubi/kucoin/manager/MarketAlphaTickerPbWsApiKt\n*L\n65#1:115,2\n53#1:100,4\n53#1:106\n59#1:107,4\n59#1:113\n53#1:104,2\n59#1:111,2\n*E\n"})
public final class C15506i {

    /* JADX INFO: renamed from: a */
    public static final boolean f28132a;

    /* JADX INFO: renamed from: com.kubi.kucoin.manager.i$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.manager.i$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<Boolean> {
    }

    static {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46830z.class, SiteInfoManager.f47913a.m58109c());
        f28132a = objM56186h != null ? ((InterfaceC46830z) objM56186h).mo102970a() : false;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final IMarketAlphaTickerPbWsApi m32605a() {
        return (IMarketAlphaTickerPbWsApi) new C19321b.a().m42777b(new C38000b(C37237b.m83278a())).m42778c(new C38003e()).m42776a().m42772b(IMarketAlphaTickerPbWsApi.class);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m32606b() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("enable_socket_protobuf_market_v2", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return Intrinsics.areEqual(objM20457a, Boolean.TRUE) && f28132a;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m32607c() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("enable_socket_protobuf_market_alpha_v2", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return Intrinsics.areEqual(objM20457a, Boolean.TRUE) && f28132a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m32608d(@NotNull String span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return Intrinsics.areEqual(span, "5m") ? "5min" : span;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final WsAlphaSnapshotEntity m32609e(@NotNull AlphaTickerOuterClass$AlphaTicker alphaTickerOuterClass$AlphaTicker) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        Object objM103844constructorimpl3;
        Intrinsics.checkNotNullParameter(alphaTickerOuterClass$AlphaTicker, "<this>");
        String strValueOf = String.valueOf(alphaTickerOuterClass$AlphaTicker.getTokenBridgeId());
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(new BigDecimal(alphaTickerOuterClass$AlphaTicker.getClosePrice()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            objM103844constructorimpl = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNullExpressionValue(objM103844constructorimpl, "getOrElse(...)");
        BigDecimal bigDecimal = (BigDecimal) objM103844constructorimpl;
        try {
            objM103844constructorimpl2 = Result.m103844constructorimpl(new BigDecimal(alphaTickerOuterClass$AlphaTicker.getTradingVolume()));
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl2) != null) {
            objM103844constructorimpl2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNullExpressionValue(objM103844constructorimpl2, "getOrElse(...)");
        BigDecimal bigDecimal2 = (BigDecimal) objM103844constructorimpl2;
        try {
            objM103844constructorimpl3 = Result.m103844constructorimpl(new BigDecimal(String.valueOf(alphaTickerOuterClass$AlphaTicker.getRate())));
        } catch (Throwable th4) {
            Result.Companion companion4 = Result.INSTANCE;
            objM103844constructorimpl3 = Result.m103844constructorimpl(ResultKt.createFailure(th4));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl3) != null) {
            objM103844constructorimpl3 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNullExpressionValue(objM103844constructorimpl3, "getOrElse(...)");
        return new WsAlphaSnapshotEntity(null, null, strValueOf, bigDecimal, bigDecimal2, (BigDecimal) objM103844constructorimpl3, null, null, TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_LOSSLESS, null);
    }
}
