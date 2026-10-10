package com.kubi.sdk.site.migration;

import androidx.annotation.Keep;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.sdk.site.C24136d;
import com.kubi.user.config.UserInfo;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: SiteMigrationConfig.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/site/migration/SiteMigrationConfig;", "", "<init>", "()V", "SECONDS", "", "config", "Lcom/kubi/sdk/site/migration/SiteMigrationConfig$TimespanConfig;", "getConfig", "()Lcom/kubi/sdk/site/migration/SiteMigrationConfig$TimespanConfig;", "config$delegate", "Lkotlin/Lazy;", "hasShowed", "", "from", "", "updateShowed", "", "TimespanConfig", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSiteMigrationConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteMigrationConfig.kt\ncom/kubi/sdk/site/migration/SiteMigrationConfig\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,66:1\n84#2:67\n84#2:68\n75#2,2:69\n75#2,2:71\n35#3,4:73\n39#3:79\n44#4,2:77\n*S KotlinDebug\n*F\n+ 1 SiteMigrationConfig.kt\ncom/kubi/sdk/site/migration/SiteMigrationConfig\n*L\n48#1:67\n50#1:68\n61#1:69,2\n63#1:71,2\n36#1:73,4\n36#1:79\n36#1:77,2\n*E\n"})
public final class SiteMigrationConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SiteMigrationConfig f47922a = new SiteMigrationConfig();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f47923b = LazyKt.lazy(new Function0() { // from class: com.kubi.sdk.site.migration.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SiteMigrationConfig.m58136b();
        }
    });

    /* JADX INFO: compiled from: SiteMigrationConfig.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/site/migration/SiteMigrationConfig$TimespanConfig;", "", "homeDialogTimeSpan", "", "otherDialogTimeSpan", "<init>", "(JJ)V", "getHomeDialogTimeSpan", "()J", "getOtherDialogTimeSpan", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TimespanConfig {
        private final long homeDialogTimeSpan;
        private final long otherDialogTimeSpan;

        public TimespanConfig() {
            this(0L, 0L, 3, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimespanConfig)) {
                return false;
            }
            TimespanConfig timespanConfig = (TimespanConfig) other;
            return this.homeDialogTimeSpan == timespanConfig.homeDialogTimeSpan && this.otherDialogTimeSpan == timespanConfig.otherDialogTimeSpan;
        }

        public TimespanConfig(long j11, long j12) {
            this.homeDialogTimeSpan = j11;
            this.otherDialogTimeSpan = j12;
        }

        public static /* synthetic */ TimespanConfig copy$default(TimespanConfig timespanConfig, long j11, long j12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = timespanConfig.homeDialogTimeSpan;
            }
            if ((i11 & 2) != 0) {
                j12 = timespanConfig.otherDialogTimeSpan;
            }
            return timespanConfig.copy(j11, j12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getHomeDialogTimeSpan() {
            return this.homeDialogTimeSpan;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getOtherDialogTimeSpan() {
            return this.otherDialogTimeSpan;
        }

        @NotNull
        public final TimespanConfig copy(long homeDialogTimeSpan, long otherDialogTimeSpan) {
            return new TimespanConfig(homeDialogTimeSpan, otherDialogTimeSpan);
        }

        public final long getHomeDialogTimeSpan() {
            return this.homeDialogTimeSpan;
        }

        public final long getOtherDialogTimeSpan() {
            return this.otherDialogTimeSpan;
        }

        public int hashCode() {
            return (Long.hashCode(this.homeDialogTimeSpan) * 31) + Long.hashCode(this.otherDialogTimeSpan);
        }

        @NotNull
        public String toString() {
            return "TimespanConfig(homeDialogTimeSpan=" + this.homeDialogTimeSpan + ", otherDialogTimeSpan=" + this.otherDialogTimeSpan + ')';
        }

        public /* synthetic */ TimespanConfig(long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 259200L : j11, (i11 & 2) != 0 ? 86400L : j12);
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.migration.SiteMigrationConfig$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C24151a extends TypeToken<TimespanConfig> {
    }

    /* JADX INFO: renamed from: c */
    public final TimespanConfig m58137c() {
        return (TimespanConfig) f47923b.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m58138d(@NotNull String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        String strH = UserInfo.a.h();
        if (strH == null) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimespanConfig timespanConfigM58137c = m58137c();
        if (Intrinsics.areEqual(from, "home")) {
            return timespanConfigM58137c.getHomeDialogTimeSpan() <= 0 || jCurrentTimeMillis - C46392a.m102324f(C24136d.m58085b().m102384f(strH), 0L) < timespanConfigM58137c.getHomeDialogTimeSpan() * 1000;
        }
        return timespanConfigM58137c.getOtherDialogTimeSpan() <= 0 || jCurrentTimeMillis - C46392a.m102324f(C24136d.m58086c().m102384f(strH), 0L) < timespanConfigM58137c.getOtherDialogTimeSpan() * 1000;
    }

    /* JADX INFO: renamed from: e */
    public final void m58139e(@NotNull String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        String strH = UserInfo.a.h();
        if (strH == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Intrinsics.areEqual(from, "home")) {
            C46392a.m102330m(C24136d.m58085b().m102384f(strH), jCurrentTimeMillis);
        } else {
            C46392a.m102330m(C24136d.m58086c().m102384f(strH), jCurrentTimeMillis);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final TimespanConfig m58136b() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C24151a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("site_migration_dialog", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        TimespanConfig timespanConfig = (TimespanConfig) objM20457a;
        if (timespanConfig == null) {
            return new TimespanConfig(0L, 0L, 3, null);
        }
        return timespanConfig;
    }
}
