package com.kubi.sdk.log.realtime.p116db;

import android.app.Application;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.kubi.sdk.log.realtime.RealTimeReporter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p519oz.InterfaceC43338a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RealLogDBProxy.kt */
/* JADX INFO: loaded from: classes3.dex */
@Database(entities = {LogData.class}, exportSchema = false, version = 1)
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048 X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m90084d2 = {"Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Loz/a;", "d", "()Loz/a;", "logMsgDao", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "Logger-realtime_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class RealLogDBProxy extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy<RealLogDBProxy> f46983b = LazyKt.lazy(new Function0<RealLogDBProxy>() { // from class: com.kubi.sdk.log.realtime.db.RealLogDBProxy$Companion$db$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @Nullable
        public final RealLogDBProxy invoke() {
            Application applicationM57190k = RealTimeReporter.f46947a.m57190k();
            if (applicationM57190k != null) {
                return (RealLogDBProxy) Room.databaseBuilder(applicationM57190k, RealLogDBProxy.class, "RealLog.db").fallbackToDestructiveMigration().build();
            }
            return null;
        }
    });

    /* JADX INFO: compiled from: RealLogDBProxy.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy$Companion;", "", "<init>", "()V", "Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;", "getInstance", "()Lcom/kubi/sdk/log/realtime/db/RealLogDBProxy;", "db$delegate", "Lkotlin/Lazy;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "db", "Logger-realtime_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final RealLogDBProxy m57239a() {
            return (RealLogDBProxy) RealLogDBProxy.f46983b.getValue();
        }

        @Nullable
        public final RealLogDBProxy getInstance() {
            return m57239a();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract InterfaceC43338a mo57238d();
}
