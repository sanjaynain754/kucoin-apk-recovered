package com.kubi.home.rank.impl.cache;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p023db.SupportSQLiteStatement;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.kubi.home.rank.impl.cache.c */
/* JADX INFO: compiled from: IRankDao_Impl.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C14776c implements IRankDao {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f26044a;

    /* JADX INFO: renamed from: b */
    public final EntityInsertionAdapter<RankDBEntity> f26045b;

    /* JADX INFO: renamed from: com.kubi.home.rank.impl.cache.c$a */
    /* JADX INFO: compiled from: IRankDao_Impl.java */
    public class a extends EntityInsertionAdapter<RankDBEntity> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `rank_coin_table` (`rank_coin_key`,`rank_coin_value`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, RankDBEntity rankDBEntity) {
            if (rankDBEntity.getKey() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, rankDBEntity.getKey());
            }
            if (rankDBEntity.getValue() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, rankDBEntity.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static List<Class<?>> m29969c() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.kubi.home.rank.impl.cache.IRankDao
    /* JADX INFO: renamed from: a */
    public void mo29934a(List<RankDBEntity> list) {
        this.f26044a.assertNotSuspendingTransaction();
        this.f26044a.beginTransaction();
        try {
            this.f26045b.insert(list);
            this.f26044a.setTransactionSuccessful();
        } finally {
            this.f26044a.endTransaction();
        }
    }

    @Override // com.kubi.home.rank.impl.cache.IRankDao
    /* JADX INFO: renamed from: b */
    public RankDBEntity mo29935b(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from rank_coin_table WHERE rank_coin_key = ?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.f26044a.assertNotSuspendingTransaction();
        RankDBEntity rankDBEntity = null;
        String string = null;
        Cursor cursorQuery = DBUtil.query(this.f26044a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rank_coin_key");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rank_coin_value");
            if (cursorQuery.moveToFirst()) {
                RankDBEntity rankDBEntity2 = new RankDBEntity();
                rankDBEntity2.setKey(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow));
                if (!cursorQuery.isNull(columnIndexOrThrow2)) {
                    string = cursorQuery.getString(columnIndexOrThrow2);
                }
                rankDBEntity2.setValue(string);
                rankDBEntity = rankDBEntity2;
            }
            return rankDBEntity;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    public C14776c(RoomDatabase roomDatabase) {
        this.f26044a = roomDatabase;
        this.f26045b = new a(roomDatabase);
    }
}
