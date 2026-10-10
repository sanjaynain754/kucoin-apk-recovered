package com.kubi.search.bridge;

import android.content.Context;
import b00.InterfaceC4413b0;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.margin.api.IMarginService;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38183a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import s10.InterfaceC44269c;

/* JADX INFO: compiled from: KCFlutterBridgeSearchCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2(\u0010\u000b\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\fH\u0016JW\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122(\u0010\u000b\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\fH\u0016¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/search/bridge/KCFlutterBridgeSearchCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeSearchCall;", "<init>", "()V", "getMexSymbolShow", "", "ctx", "Landroid/content/Context;", "symbol", "", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "getSymbolLevel", "type", "", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "Companion", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgeSearchCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeSearchCallImpl.kt\ncom/kubi/search/bridge/KCFlutterBridgeSearchCallImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,74:1\n1869#2,2:75\n1869#2,2:80\n25#3,3:77\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeSearchCallImpl.kt\ncom/kubi/search/bridge/KCFlutterBridgeSearchCallImpl\n*L\n34#1:75,2\n63#1:80,2\n52#1:77,3\n*E\n"})
public final class KCFlutterBridgeSearchCallImpl implements InterfaceC4413b0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f48853a = new Companion(null);

    /* JADX INFO: compiled from: KCFlutterBridgeSearchCallImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/search/bridge/KCFlutterBridgeSearchCallImpl$Companion;", "", "<init>", "()V", "TAG", "", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // b00.InterfaceC4413b0
    /* JADX INFO: renamed from: a */
    public void mo4090a(@NotNull Context ctx, @NotNull List<String> symbol, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C44128b.m97259c("KCFlutterBridgeSearch", "[getMexSymbolShow] symbol:" + symbol);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : symbol) {
            if (str.length() > 0) {
                linkedHashMap.put(str, IKuMexService.f28731a.get().mo33264M(C27041f.m66668h(str)));
            }
        }
        C44128b.m97259c("KCFlutterBridgeSearch", "[getMexSymbolShow] map:" + linkedHashMap);
        callback.invoke(linkedHashMap, null);
    }

    @Override // b00.InterfaceC4413b0
    /* JADX INFO: renamed from: b */
    public void mo4091b(@NotNull Context ctx, @NotNull List<String> symbol, @Nullable Long l11, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C44128b.m97259c("KCFlutterBridgeSearch", "[getSymbolLevel] type:" + l11 + ", symbol:" + symbol);
        Object objM56186h = Router.f46192a.m56186h(InterfaceC44269c.class, SiteInfoManager.f47913a.m58109c());
        if (!(objM56186h != null ? ((InterfaceC44269c) objM56186h).m97689b() && C38183a.m86145a() : C38183a.m86145a())) {
            C44128b.m97259c("KCFlutterBridgeSearch", "[getSymbolLevel] showLevel is false");
            callback.invoke(null, null);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : symbol) {
            if (str.length() > 0) {
                TradeItemBean tradeItemBean = new TradeItemBean(str);
                if (tradeItemBean.getSymbolInfoEntity().isShowMarginLeverLabel()) {
                    linkedHashMap.put(str, IMarginService.f32724a.get().mo37960t(tradeItemBean));
                }
            }
        }
        C44128b.m97259c("KCFlutterBridgeSearch", "[getSymbolLevel] map:" + linkedHashMap);
        callback.invoke(linkedHashMap, null);
    }
}
