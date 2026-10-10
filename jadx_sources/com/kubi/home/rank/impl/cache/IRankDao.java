package com.kubi.home.rank.impl.cache;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IRankDao.kt */
/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0007\"\u00020\u0006H'¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\fH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/rank/impl/cache/IRankDao;", "", "insert", "", "list", "", "Lcom/kubi/home/rank/impl/cache/RankDBEntity;", "", "([Lcom/kubi/home/rank/impl/cache/RankDBEntity;)V", SearchIntents.EXTRA_QUERY, "queryByKey", "key", "", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IRankDao {

    /* JADX INFO: compiled from: IRankDao.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/rank/impl/cache/IRankDao$Companion;", "", "<init>", "()V", "BASE_QUERY", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        @NotNull
        public static final String BASE_QUERY = "select * from rank_coin_table";

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f26030a = new Companion();
    }

    @Insert(onConflict = 1)
    /* JADX INFO: renamed from: a */
    void mo29934a(@NotNull List<RankDBEntity> list);

    @Query("select * from rank_coin_table WHERE rank_coin_key = :key")
    @Nullable
    /* JADX INFO: renamed from: b */
    RankDBEntity mo29935b(@NotNull String str);
}
