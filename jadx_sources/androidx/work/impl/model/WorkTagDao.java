package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.tencent.bugly.proguard.C33616e0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WorkTagDao.kt */
/* JADX INFO: loaded from: classes34.dex */
@Dao
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\t\u001a\u00020\u0005H'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH'J\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0016¨\u0006\u0010"}, m90084d2 = {"Landroidx/work/impl/model/WorkTagDao;", "", "deleteByWorkSpecId", "", "id", "", "getTagsForWorkSpecId", "", "getWorkSpecIdsWithTag", "tag", "insert", "workTag", "Landroidx/work/impl/model/WorkTag;", "insertTags", C33616e0.f69644s, "", "work-runtime_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public interface WorkTagDao {

    /* JADX INFO: compiled from: WorkTagDao.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 7, 1}, m90088xi = 48)
    public static final class DefaultImpls {
        public static void insertTags(@NotNull WorkTagDao workTagDao, @NotNull String id2, @NotNull Set<String> tags) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Iterator<T> it = tags.iterator();
            while (it.hasNext()) {
                workTagDao.insert(new WorkTag((String) it.next(), id2));
            }
        }
    }

    @Query("DELETE FROM worktag WHERE work_spec_id=:id")
    void deleteByWorkSpecId(@NotNull String id2);

    @Query("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    @NotNull
    List<String> getTagsForWorkSpecId(@NotNull String id2);

    @Query("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    @NotNull
    List<String> getWorkSpecIdsWithTag(@NotNull String tag);

    @Insert(onConflict = 5)
    void insert(@NotNull WorkTag workTag);

    void insertTags(@NotNull String id2, @NotNull Set<String> tags);
}
