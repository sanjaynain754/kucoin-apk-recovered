package com.kubi.assets.sort;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import p569qq.C43846g;
import p830zf.InterfaceC46786a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.assets.sort.l */
/* JADX INFO: compiled from: AccountTabSortManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0006\u0010\u0000\u001a\u00020\u0001\"\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"isDisappearAccountOpen", "", "showNewSort", "getShowNewSort", "()Z", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountTabSortManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountTabSortManager.kt\ncom/kubi/assets/sort/AccountTabSortManagerKt\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,312:1\n35#2,4:313\n39#2:319\n44#3,2:317\n17#4,2:320\n*S KotlinDebug\n*F\n+ 1 AccountTabSortManager.kt\ncom/kubi/assets/sort/AccountTabSortManagerKt\n*L\n23#1:313,4\n23#1:319\n23#1:317,2\n28#1:320,2\n*E\n"})
public final class C10997l {

    /* JADX INFO: renamed from: a */
    public static final boolean f18791a;

    /* JADX INFO: renamed from: com.kubi.assets.sort.l$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    static {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46786a.class, SiteInfoManager.f47913a.m58109c());
        f18791a = objM56186h != null ? ((InterfaceC46786a) objM56186h).mo102969a() : false;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m19368a() {
        Object objM20457a;
        if (!f18791a) {
            return false;
        }
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_asset_disappear_account", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }
}
