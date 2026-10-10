package com.kubi.spot.business.discover;

import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.storage.StorageType;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p830zf.InterfaceC46828x;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.StorageId;

/* JADX INFO: compiled from: MarketChangeSettingManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/spot/business/discover/MarketChangeSettingManager;", "", "<init>", "()V", "TAG", "", "MMKV_KEY", "Lcom/kubi/utils/storage/StorageId;", "SPOT_KLINE", "setting", "", "", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "init", "", "updateSettingAsync", "getMarketChangeStatus", "key", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketChangeSettingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketChangeSettingManager.kt\ncom/kubi/spot/business/discover/MarketChangeSettingManager\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,121:1\n47#2,4:122\n47#2,4:126\n17#3,2:130\n*S KotlinDebug\n*F\n+ 1 MarketChangeSettingManager.kt\ncom/kubi/spot/business/discover/MarketChangeSettingManager\n*L\n60#1:122,4\n80#1:126,4\n96#1:130,2\n*E\n"})
public final class MarketChangeSettingManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MarketChangeSettingManager f50135a = new MarketChangeSettingManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<String> f50136b = new StorageId<>("Discover", "MarketChangeSetting", StorageType.Shared, false, 8, null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static Map<String, Boolean> f50137c = MapsKt.emptyMap();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static AtomicBoolean f50138d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.kubi.spot.business.discover.MarketChangeSettingManager$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 MarketChangeSettingManager.kt\ncom/kubi/spot/business/discover/MarketChangeSettingManager\n*L\n1#1,49:1\n81#2,2:50\n*E\n"})
    public static final class C24929b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44128b.m97262f("Discover::MarketChangeSettingManager", "updateSettingAsync response error", exception);
        }

        public C24929b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.discover.MarketChangeSettingManager$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 MarketChangeSettingManager.kt\ncom/kubi/spot/business/discover/MarketChangeSettingManager\n*L\n1#1,49:1\n61#2,2:50\n*E\n"})
    public static final class C24928a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C24928a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            exception.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m61011d(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46828x.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC46828x) objM56186h).mo1058a();
        }
        if (!f50138d.get()) {
            f50135a.m61012e();
        }
        return C27025c.m66567e(f50137c.get(key), false);
    }

    /* JADX INFO: renamed from: e */
    public final void m61012e() {
        if (f50138d.get()) {
            C44128b.m97266j("Discover::MarketChangeSettingManager", "多次重复初始化");
        } else {
            C41696j.m91104d(C41713n0.m91125a(new CoroutineName("MarketChangeSettingManager").plus(C42911a.m94120b()).plus(new C24928a(CoroutineExceptionHandler.INSTANCE))), null, null, new MarketChangeSettingManager$init$2(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m61013f() {
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("MarketChangeSettingManager").plus(C42911a.m94120b()).plus(new C24929b(CoroutineExceptionHandler.INSTANCE))), null, null, new MarketChangeSettingManager$updateSettingAsync$2(null), 3, null);
    }
}
