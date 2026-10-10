package com.kubi.home.rank.impl.cache;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: RankDatabaseProxy.kt */
/* JADX INFO: loaded from: classes15.dex */
@Database(entities = {RankDBEntity.class}, exportSchema = false, version = 1)
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/home/rank/impl/cache/RankDatabaseProxy;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "platformDao", "Lcom/kubi/home/rank/impl/cache/IRankDao;", "getPlatformDao", "()Lcom/kubi/home/rank/impl/cache/IRankDao;", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class RankDatabaseProxy extends RoomDatabase {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f26038a = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public static RankDatabaseProxy f26039b;

    /* JADX INFO: compiled from: RankDatabaseProxy.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/home/rank/impl/cache/RankDatabaseProxy$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/home/rank/impl/cache/RankDatabaseProxy;", "create", "", "context", "Landroid/content/Context;", "getInstance", "needLog", "", "sql", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRankDatabaseProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankDatabaseProxy.kt\ncom/kubi/home/rank/impl/cache/RankDatabaseProxy$Companion\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,56:1\n35#2,4:57\n39#2:63\n44#3,2:61\n*S KotlinDebug\n*F\n+ 1 RankDatabaseProxy.kt\ncom/kubi/home/rank/impl/cache/RankDatabaseProxy$Companion\n*L\n47#1:57,4\n47#1:63\n47#1:61,2\n*E\n"})
    public static final class Companion {

        /* JADX INFO: renamed from: com.kubi.home.rank.impl.cache.RankDatabaseProxy$Companion$a */
        /* JADX INFO: compiled from: RemoteConfig.kt */
        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
        public static final class C14772a extends TypeToken<Boolean> {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: b */
        public static final void m29950b(String sql, List args) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(args, "args");
            if (RankDatabaseProxy.f26038a.needLog(sql)) {
                C43840a.m96550d("sql=" + sql, "rank_coin_list.db");
            }
        }

        public final void create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            RankDatabaseProxy.f26039b = (RankDatabaseProxy) Room.databaseBuilder(context, RankDatabaseProxy.class, "rank_coin_list.db").fallbackToDestructiveMigration().allowMainThreadQueries().setQueryCallback(new RoomDatabase.QueryCallback() { // from class: com.kubi.home.rank.impl.cache.e
                @Override // androidx.room.RoomDatabase.QueryCallback
                public final void onQuery(String str, List list) {
                    RankDatabaseProxy.Companion.m29950b(str, list);
                }
            }, Executors.newSingleThreadExecutor()).build();
        }

        public final boolean needLog(@NotNull String sql) {
            Object objM20457a;
            Intrinsics.checkNotNullParameter(sql, "sql");
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C14772a().getType();
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

        @Nullable
        public final RankDatabaseProxy getInstance() {
            if (RankDatabaseProxy.f26039b == null) {
                create(BaseApplication.INSTANCE.get());
            }
            return RankDatabaseProxy.f26039b;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public abstract IRankDao mo29948e();
}
