package com.kubi.kumex.data;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.futures.data.platform.IPlatformDao;
import com.kubi.kumex.data.BKuMexDatabaseProxy;
import com.kubi.kumex.data.platform.model.DictEntity;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.site.SiteUtils;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BKuMexDatabaseProxy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Database(entities = {DictEntity.class}, exportSchema = false, version = 1)
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kumex/data/BKuMexDatabaseProxy;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "platformDao", "Lcom/kubi/futures/data/platform/IPlatformDao;", "getPlatformDao", "()Lcom/kubi/futures/data/platform/IPlatformDao;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BKuMexDatabaseProxy extends RoomDatabase {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f28810a = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy<BKuMexDatabaseProxy> f28811b = LazyKt.lazy(new Function0() { // from class: zl.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BKuMexDatabaseProxy.m33312f();
        }
    });

    /* JADX INFO: compiled from: BKuMexDatabaseProxy.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kumex/data/BKuMexDatabaseProxy$Companion;", "", "<init>", "()V", "db", "Lcom/kubi/kumex/data/BKuMexDatabaseProxy;", "getDb", "()Lcom/kubi/kumex/data/BKuMexDatabaseProxy;", "db$delegate", "Lkotlin/Lazy;", "getInstance", "needLog", "", "sql", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBKuMexDatabaseProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BKuMexDatabaseProxy.kt\ncom/kubi/kumex/data/BKuMexDatabaseProxy$Companion\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,59:1\n35#2,4:60\n39#2:66\n44#3,2:64\n*S KotlinDebug\n*F\n+ 1 BKuMexDatabaseProxy.kt\ncom/kubi/kumex/data/BKuMexDatabaseProxy$Companion\n*L\n50#1:60,4\n50#1:66\n50#1:64,2\n*E\n"})
    public static final class Companion {

        /* JADX INFO: renamed from: com.kubi.kumex.data.BKuMexDatabaseProxy$Companion$a */
        /* JADX INFO: compiled from: RemoteConfig.kt */
        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
        public static final class C15771a extends TypeToken<Boolean> {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final boolean needLog(@NotNull String sql) {
            Object objM20457a;
            Intrinsics.checkNotNullParameter(sql, "sql");
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C15771a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("kc_apm_room", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            if (!C27025c.m66567e((Boolean) objM20457a, true)) {
                return false;
            }
            String upperCase = sql.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return (!StringsKt.startsWith$default(upperCase, "SELECT", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "LIMIT", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "COUNT", false, 2, (Object) null)) ? false : true;
        }

        /* JADX INFO: renamed from: a */
        public final BKuMexDatabaseProxy m33315a() {
            return (BKuMexDatabaseProxy) BKuMexDatabaseProxy.f28811b.getValue();
        }

        @NotNull
        public final BKuMexDatabaseProxy getInstance() {
            return m33315a();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public abstract IPlatformDao mo33314h();

    /* JADX INFO: renamed from: f */
    public static final BKuMexDatabaseProxy m33312f() {
        return (BKuMexDatabaseProxy) Room.databaseBuilder(BaseApplication.INSTANCE.get(), BKuMexDatabaseProxy.class, SiteUtils.m58088c(SiteUtils.f47907a, "BKuMex", "db", null, 4, null)).setJournalMode(RoomDatabase.JournalMode.TRUNCATE).fallbackToDestructiveMigration().allowMainThreadQueries().setQueryCallback(new RoomDatabase.QueryCallback() { // from class: zl.b
            @Override // androidx.room.RoomDatabase.QueryCallback
            public final void onQuery(String str, List list) {
                BKuMexDatabaseProxy.m33313g(str, list);
            }
        }, Executors.newSingleThreadExecutor()).build();
    }

    /* JADX INFO: renamed from: g */
    public static final void m33313g(String sql, List args) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(args, "args");
        if (f28810a.needLog(sql)) {
            C43840a.m96550d("sql=" + sql, "BKuMex.db");
        }
    }
}
