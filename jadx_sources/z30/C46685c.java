package z30;

import com.google.firebase.perf.util.Constants;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import x30.InterfaceC46006e;

/* JADX INFO: renamed from: z30.c */
/* JADX INFO: compiled from: TradeRnMigrationSwitch.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/tradefacade/service/TradeRnMigrationSwitch;", "", "<init>", "()V", "KEY_RN_MIGRATION_ENABLED", "", Constants.ENABLE_DISABLE, "", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeRnMigrationSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeRnMigrationSwitch.kt\ncom/kubi/tradefacade/service/TradeRnMigrationSwitch\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,25:1\n35#2,4:26\n39#2:32\n44#3,2:30\n17#4,2:33\n*S KotlinDebug\n*F\n+ 1 TradeRnMigrationSwitch.kt\ncom/kubi/tradefacade/service/TradeRnMigrationSwitch\n*L\n18#1:26,4\n18#1:32\n18#1:30,2\n21#1:33,2\n*E\n"})
public final class C46685c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46685c f104522a = new C46685c();

    /* JADX INFO: renamed from: z30.c$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m102909a() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("trade_rn_migration_trade_spotTrade_enabled", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        boolean zM66567e = C27025c.m66567e((Boolean) objM20457a, false);
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46006e.class, SiteInfoManager.f47913a.m58109c());
        return C46684b.f104521a.m102908a(zM66567e) && (objM56186h != null ? ((InterfaceC46006e) objM56186h).m101539a() : true);
    }
}
