package th;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p023db.SupportSQLiteStatement;
import com.kubi.futures.data.platform.IPlatformDao;
import com.kubi.kumex.data.platform.model.DictEntity;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: th.b */
/* JADX INFO: compiled from: IPlatformDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C44976b implements IPlatformDao {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f101366a;

    /* JADX INFO: renamed from: b */
    public final EntityInsertionAdapter<DictEntity> f101367b;

    /* JADX INFO: renamed from: th.b$a */
    /* JADX INFO: compiled from: IPlatformDao_Impl.java */
    public class a extends EntityInsertionAdapter<DictEntity> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `dict` (`dict_key`,`dict_value`) VALUES (?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, DictEntity dictEntity) {
            if (dictEntity.getKey() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, dictEntity.getKey());
            }
            if (dictEntity.getValue() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, dictEntity.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static List<Class<?>> m99453c() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.kubi.futures.data.platform.IPlatformDao
    /* JADX INFO: renamed from: a */
    public void mo24890a(List<DictEntity> list) {
        this.f101366a.assertNotSuspendingTransaction();
        this.f101366a.beginTransaction();
        try {
            this.f101367b.insert(list);
            this.f101366a.setTransactionSuccessful();
        } finally {
            this.f101366a.endTransaction();
        }
    }

    @Override // com.kubi.futures.data.platform.IPlatformDao
    /* JADX INFO: renamed from: b */
    public DictEntity mo24891b(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from dict WHERE dict_key = ?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.f101366a.assertNotSuspendingTransaction();
        DictEntity dictEntity = null;
        String string = null;
        Cursor cursorQuery = DBUtil.query(this.f101366a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dict_key");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dict_value");
            if (cursorQuery.moveToFirst()) {
                DictEntity dictEntity2 = new DictEntity();
                dictEntity2.setKey(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow));
                if (!cursorQuery.isNull(columnIndexOrThrow2)) {
                    string = cursorQuery.getString(columnIndexOrThrow2);
                }
                dictEntity2.setValue(string);
                dictEntity = dictEntity2;
            }
            return dictEntity;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    public C44976b(RoomDatabase roomDatabase) {
        this.f101366a = roomDatabase;
        this.f101367b = new a(roomDatabase);
    }
}
