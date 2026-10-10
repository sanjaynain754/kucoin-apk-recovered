package com.kubi.sdk.site.jsapi;

import android.content.Context;
import com.kubi.mvi.common.MviExKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSiteSupportSiteItem;
import com.kubi.sdk.site.SiteBizConfigKey;
import com.kubi.sdk.site.SiteExtConfigKey;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.config.SiteConfigManager;
import com.kubi.sdk.site.config.SupportSiteManager;
import com.kubi.sdk.site.config.data.SiteTypeEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36591z;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCJSApiSiteModuleImpl.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JH\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JH\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JF\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JH\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JP\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JH\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/site/jsapi/KCJSApiSiteModuleImpl;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSiteModule;", "<init>", "()V", "startChangeSite", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "siteType", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "startChangeSiteDirectly", "isSiteTypeSupport", "getSupportSiteList", "", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSiteSupportSiteItem;", "querySiteBizConfig", "configKey", "querySiteExtConfig", "configType", "querySiteVisibleConfig", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJSApiSiteModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJSApiSiteModuleImpl.kt\ncom/kubi/sdk/site/jsapi/KCJSApiSiteModuleImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1563#2:104\n1634#2,3:105\n*S KotlinDebug\n*F\n+ 1 KCJSApiSiteModuleImpl.kt\ncom/kubi/sdk/site/jsapi/KCJSApiSiteModuleImpl\n*L\n64#1:104\n64#1:105,3\n*E\n"})
public final class KCJSApiSiteModuleImpl implements InterfaceC36591z {
    @Override // d00.InterfaceC36591z
    /* JADX INFO: renamed from: a */
    public void mo58117a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String configKey, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(SiteConfigManager.f47884a.m58046m(SiteBizConfigKey.INSTANCE.tryParse(configKey)), null);
    }

    @Override // d00.InterfaceC36591z
    /* JADX INFO: renamed from: b */
    public void mo58118b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String siteType, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(SupportSiteManager.m58057h(SupportSiteManager.f47892a, siteType, false, 2, null)), null);
    }

    @Override // d00.InterfaceC36591z
    /* JADX INFO: renamed from: c */
    public void mo58119c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String siteType, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCJSApiSiteModuleImpl$startChangeSiteDirectly$1(siteType, callback, null));
    }

    @Override // d00.InterfaceC36591z
    /* JADX INFO: renamed from: d */
    public void mo58120d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String configKey, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(SiteConfigManager.f47884a.m58042i(SiteVisibleConfigKey.INSTANCE.tryParse(configKey))), null);
    }

    @Override // d00.InterfaceC36591z
    /* JADX INFO: renamed from: e */
    public void mo58121e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String siteType, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCJSApiSiteModuleImpl$startChangeSite$1(siteType, callback, null));
    }

    @Override // d00.InterfaceC36591z
    /* JADX INFO: renamed from: f */
    public void mo58122f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String configType, @NotNull String configKey, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(configType, "configType");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(SiteConfigManager.f47884a.m58044k(SiteExtConfigKey.INSTANCE.tryParse(configType, configKey)), null);
    }

    @Override // d00.InterfaceC36591z
    /* JADX INFO: renamed from: g */
    public void mo58123g(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiSiteSupportSiteItem>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        List<SiteTypeEntity> listM58060d = SupportSiteManager.f47892a.m58060d();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM58060d, 10));
        for (SiteTypeEntity siteTypeEntity : listM58060d) {
            arrayList.add(new KCJSApiSiteSupportSiteItem(siteTypeEntity.getSiteType(), siteTypeEntity.getSiteName()));
        }
        callback.invoke(arrayList, null);
    }
}
