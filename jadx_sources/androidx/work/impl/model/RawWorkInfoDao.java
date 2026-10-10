package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.RawQuery;
import androidx.sqlite.p023db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: RawWorkInfoDao.kt */
/* JADX INFO: loaded from: classes34.dex */
@Dao
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\b2\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\t"}, m90084d2 = {"Landroidx/work/impl/model/RawWorkInfoDao;", "", "getWorkInfoPojos", "", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", SearchIntents.EXTRA_QUERY, "Landroidx/sqlite/db/SupportSQLiteQuery;", "getWorkInfoPojosLiveData", "Landroidx/lifecycle/LiveData;", "work-runtime_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public interface RawWorkInfoDao {
    @RawQuery(observedEntities = {WorkSpec.class})
    @NotNull
    List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(@NotNull SupportSQLiteQuery query);

    @RawQuery(observedEntities = {WorkSpec.class})
    @NotNull
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(@NotNull SupportSQLiteQuery query);
}
