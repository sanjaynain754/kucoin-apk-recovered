package t80;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.widget.web.startup.PreparedConfig;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y00.C46361a;

/* JADX INFO: renamed from: t80.a */
/* JADX INFO: compiled from: ExperiSwitchManager.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0002\b\tJ\u001b\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0002\b\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/widget/web/manager/ExperiSwitchManager;", "", "<init>", "()V", "loadConfig", "", "prepareCatching", "Lcom/kubi/widget/web/startup/PreparedConfig;", "", "prepareCatching$LWebWidget_googleRelease", "applyCatching", "prepared", "applyCatching$LWebWidget_googleRelease", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nExperiSwitchManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExperiSwitchManager.kt\ncom/kubi/widget/web/manager/ExperiSwitchManager\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,34:1\n35#2,4:35\n39#2:41\n44#3,2:39\n*S KotlinDebug\n*F\n+ 1 ExperiSwitchManager.kt\ncom/kubi/widget/web/manager/ExperiSwitchManager\n*L\n16#1:35,4\n16#1:41\n16#1:39,2\n*E\n"})
public final class C44703a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44703a f99490a = new C44703a();

    /* JADX INFO: renamed from: t80.a$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes59.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final PreparedConfig<Boolean> m98903c() {
        Object objM20457a;
        try {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("h5_adjust_suc_event_report", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            Boolean bool = (Boolean) objM20457a;
            return new PreparedConfig.Value(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        } catch (Throwable th3) {
            return new PreparedConfig.Error(th3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m98901a(@NotNull PreparedConfig<Boolean> prepared) {
        Intrinsics.checkNotNullParameter(prepared, "prepared");
        try {
            if (prepared instanceof PreparedConfig.Value) {
                C46361a.f103951a.m102236b(((Boolean) ((PreparedConfig.Value) prepared).m67410a()).booleanValue());
            } else if (!Intrinsics.areEqual(prepared, PreparedConfig.b.f55253a)) {
                if (prepared instanceof PreparedConfig.Error) {
                    throw ((PreparedConfig.Error) prepared).getThrowable();
                }
                throw new NoWhenBranchMatchedException();
            }
        } catch (Throwable th2) {
            C43840a.m96548b("loadConfig", th2.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m98902b() {
        m98901a(m98903c());
    }
}
