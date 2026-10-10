package a40;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import x30.InterfaceC46005d;

/* JADX INFO: renamed from: a40.b */
/* JADX INFO: compiled from: TabOrderFeatureManager.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/TabOrderFeatureManager;", "", "<init>", "()V", "isRemoteSupportSortTab", "", "()Z", "isRemoteSupportSortTab$delegate", "Lkotlin/Lazy;", "isSupportSortTab", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTabOrderFeatureManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabOrderFeatureManager.kt\ncom/kubi/tradefacade/tabs/TabOrderFeatureManager\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,20:1\n17#2,2:21\n35#3,4:23\n39#3:29\n44#4,2:27\n*S KotlinDebug\n*F\n+ 1 TabOrderFeatureManager.kt\ncom/kubi/tradefacade/tabs/TabOrderFeatureManager\n*L\n17#1:21,2\n11#1:23,4\n11#1:29\n11#1:27,2\n*E\n"})
public final class C0119b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0119b f446a = new C0119b();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f447b = LazyKt.lazy(new Function0() { // from class: a40.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C0119b.m575c());
        }
    });

    /* JADX INFO: renamed from: a40.b$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m575c() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_trade_tab_sort", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m576b() {
        return ((Boolean) f447b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m577d() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46005d.class, SiteInfoManager.f47913a.m58109c());
        return m576b() && (objM56186h != null ? ((InterfaceC46005d) objM56186h).mo101538a() : false);
    }
}
