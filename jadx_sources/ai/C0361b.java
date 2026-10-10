package ai;

import com.google.firebase.perf.util.Constants;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ai.b */
/* JADX INFO: compiled from: FuturesRnMigrationSwitch.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/futures/entry/rn/FuturesRnMigrationSwitch;", "", "<init>", "()V", "REMOTE_CONFIG_KEY", "", Constants.ENABLE_DISABLE, "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesRnMigrationSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesRnMigrationSwitch.kt\ncom/kubi/futures/entry/rn/FuturesRnMigrationSwitch\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,27:1\n35#2,4:28\n39#2:34\n44#3,2:32\n*S KotlinDebug\n*F\n+ 1 FuturesRnMigrationSwitch.kt\ncom/kubi/futures/entry/rn/FuturesRnMigrationSwitch\n*L\n22#1:28,4\n22#1:34\n22#1:32,2\n*E\n"})
public final class C0361b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0361b f1076a = new C0361b();

    /* JADX INFO: renamed from: ai.b$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1423a() {
        Object objM103844constructorimpl;
        Object objM20457a;
        try {
            Result.Companion companion = Result.INSTANCE;
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("trade_rn_migration_futures_enabled", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(Intrinsics.areEqual(objM20457a, Boolean.TRUE)));
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = bool;
        }
        return C0321a.f818a.m1119a(((Boolean) objM103844constructorimpl).booleanValue());
    }
}
