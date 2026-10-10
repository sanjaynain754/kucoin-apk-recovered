package com.kubi.futures.data.platform;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.google.android.gms.actions.SearchIntents;
import com.kubi.kumex.data.platform.model.DictEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IPlatformDao.kt */
/* JADX INFO: loaded from: classes.dex */
@Dao
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/platform/IPlatformDao;", "", "insert", "", "list", "", "Lcom/kubi/kumex/data/platform/model/DictEntity;", SearchIntents.EXTRA_QUERY, "queryByKey", "key", "", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IPlatformDao {

    /* JADX INFO: compiled from: IPlatformDao.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/data/platform/IPlatformDao$Companion;", "", "<init>", "()V", "BASE_QUERY", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        @NotNull
        public static final String BASE_QUERY = "select * from dict";

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f22743a = new Companion();
    }

    @Insert(onConflict = 1)
    /* JADX INFO: renamed from: a */
    void mo24890a(@NotNull List<DictEntity> list);

    @Query("select * from dict WHERE dict_key = :key")
    @Nullable
    /* JADX INFO: renamed from: b */
    DictEntity mo24891b(@NotNull String str);
}
