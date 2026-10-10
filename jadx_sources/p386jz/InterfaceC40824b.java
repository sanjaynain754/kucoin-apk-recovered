package p386jz;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.kubi.sdk.lib.kunlun.sdk.p115db.KunlunDBEventData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: jz.b */
/* JADX INFO: compiled from: KunlunEventDao.kt */
/* JADX INFO: loaded from: classes3.dex */
@Dao
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Ljz/b;", "", "", TUIConstants.TUIContact.LIMIT, "", "Lcom/kubi/sdk/lib/kunlun/sdk/db/KunlunDBEventData;", "b", "(I)Ljava/util/List;", DbParams.TABLE_EVENTS, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/List;)V", "deleteAll", "()V", "d", "", "expiredTime", "c", "(J)I", "kunlun-sdk_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC40824b {
    @Insert
    /* JADX INFO: renamed from: a */
    void mo89308a(@NotNull List<KunlunDBEventData> events);

    @Query("SELECT * FROM KunlunDBEventData ORDER BY timestamp DESC LIMIT :limit")
    @NotNull
    /* JADX INFO: renamed from: b */
    List<KunlunDBEventData> mo89309b(int limit);

    @Query("DELETE FROM KunlunDBEventData WHERE timestamp < :expiredTime")
    /* JADX INFO: renamed from: c */
    int mo89310c(long expiredTime);

    @Delete
    /* JADX INFO: renamed from: d */
    void mo89311d(@NotNull List<KunlunDBEventData> events);

    @Query("DELETE FROM KunlunDBEventData")
    void deleteAll();
}
