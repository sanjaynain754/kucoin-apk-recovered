package p519oz;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.kubi.sdk.log.realtime.p116db.LogData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: oz.a */
/* JADX INFO: compiled from: LogMsgDao.kt */
/* JADX INFO: loaded from: classes3.dex */
@Dao
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\ba\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Loz/a;", "", "", TUIConstants.TUIContact.LIMIT, "", "Lcom/kubi/sdk/log/realtime/db/LogData;", "b", "(I)Ljava/util/List;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()I", "logs", "", "f", "(Ljava/util/List;)V", "deleteAll", "()V", "d", "", "expiredTime", "c", "(J)V", "e", "(I)V", "Logger-realtime_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC43338a {
    @Query("SELECT COUNT(*) FROM LogData")
    /* JADX INFO: renamed from: a */
    int mo95405a();

    @Query("SELECT * FROM LogData ORDER BY timestamp DESC LIMIT :limit")
    @NotNull
    /* JADX INFO: renamed from: b */
    List<LogData> mo95406b(int limit);

    @Query("DELETE FROM LogData WHERE timestamp < :expiredTime")
    /* JADX INFO: renamed from: c */
    void mo95407c(long expiredTime);

    @Delete
    /* JADX INFO: renamed from: d */
    void mo95408d(@NotNull List<LogData> logs);

    @Query("DELETE FROM LogData")
    void deleteAll();

    @Query("DELETE FROM LogData WHERE logId < (SELECT logId FROM LogData ORDER BY logId desc LIMIT :limit,1)")
    /* JADX INFO: renamed from: e */
    void mo95409e(int limit);

    @Insert
    /* JADX INFO: renamed from: f */
    void mo95410f(@NotNull List<LogData> logs);
}
