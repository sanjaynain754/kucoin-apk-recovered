package p519oz;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p023db.SupportSQLiteStatement;
import com.kubi.sdk.log.realtime.p116db.LogData;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: oz.b */
/* JADX INFO: compiled from: LogMsgDao_Impl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C43339b implements InterfaceC43338a {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f95672a;

    /* JADX INFO: renamed from: b */
    public final EntityInsertionAdapter<LogData> f95673b;

    /* JADX INFO: renamed from: c */
    public final EntityDeletionOrUpdateAdapter<LogData> f95674c;

    /* JADX INFO: renamed from: d */
    public final SharedSQLiteStatement f95675d;

    /* JADX INFO: renamed from: e */
    public final SharedSQLiteStatement f95676e;

    /* JADX INFO: renamed from: f */
    public final SharedSQLiteStatement f95677f;

    /* JADX INFO: renamed from: oz.b$a */
    /* JADX INFO: compiled from: LogMsgDao_Impl.java */
    public class a extends EntityInsertionAdapter<LogData> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR ABORT INTO `LogData` (`logId`,`message`,`type`,`timestamp`,`thread`) VALUES (?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, LogData logData) {
            if (logData.getLogId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, logData.getLogId().longValue());
            }
            if (logData.getContent() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, logData.getContent());
            }
            supportSQLiteStatement.bindLong(3, logData.getType());
            supportSQLiteStatement.bindLong(4, logData.getTimeStamp());
            if (logData.getThreadName() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, logData.getThreadName());
            }
        }
    }

    /* JADX INFO: renamed from: oz.b$b */
    /* JADX INFO: compiled from: LogMsgDao_Impl.java */
    public class b extends EntityDeletionOrUpdateAdapter<LogData> {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `LogData` WHERE `logId` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, LogData logData) {
            if (logData.getLogId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, logData.getLogId().longValue());
            }
        }
    }

    /* JADX INFO: renamed from: oz.b$c */
    /* JADX INFO: compiled from: LogMsgDao_Impl.java */
    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM LogData";
        }
    }

    /* JADX INFO: renamed from: oz.b$d */
    /* JADX INFO: compiled from: LogMsgDao_Impl.java */
    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM LogData WHERE timestamp < ?";
        }
    }

    /* JADX INFO: renamed from: oz.b$e */
    /* JADX INFO: compiled from: LogMsgDao_Impl.java */
    public class e extends SharedSQLiteStatement {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM LogData WHERE logId < (SELECT logId FROM LogData ORDER BY logId desc LIMIT ?,1)";
        }
    }

    /* JADX INFO: renamed from: g */
    public static List<Class<?>> m95411g() {
        return Collections.EMPTY_LIST;
    }

    @Override // p519oz.InterfaceC43338a
    /* JADX INFO: renamed from: a */
    public int mo95405a() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM LogData", 0);
        this.f95672a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f95672a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // p519oz.InterfaceC43338a
    /* JADX INFO: renamed from: b */
    public List<LogData> mo95406b(int i11) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM LogData ORDER BY timestamp DESC LIMIT ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, i11);
        this.f95672a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f95672a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "logId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "message");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, InterfaceC33953u5.f72225u);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new LogData(cursorQuery.isNull(columnIndexOrThrow) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow)), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // p519oz.InterfaceC43338a
    /* JADX INFO: renamed from: c */
    public void mo95407c(long j11) {
        this.f95672a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f95676e.acquire();
        supportSQLiteStatementAcquire.bindLong(1, j11);
        this.f95672a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.f95672a.setTransactionSuccessful();
        } finally {
            this.f95672a.endTransaction();
            this.f95676e.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // p519oz.InterfaceC43338a
    /* JADX INFO: renamed from: d */
    public void mo95408d(List<LogData> list) {
        this.f95672a.assertNotSuspendingTransaction();
        this.f95672a.beginTransaction();
        try {
            this.f95674c.handleMultiple(list);
            this.f95672a.setTransactionSuccessful();
        } finally {
            this.f95672a.endTransaction();
        }
    }

    @Override // p519oz.InterfaceC43338a
    public void deleteAll() {
        this.f95672a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f95675d.acquire();
        this.f95672a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.f95672a.setTransactionSuccessful();
        } finally {
            this.f95672a.endTransaction();
            this.f95675d.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // p519oz.InterfaceC43338a
    /* JADX INFO: renamed from: e */
    public void mo95409e(int i11) {
        this.f95672a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f95677f.acquire();
        supportSQLiteStatementAcquire.bindLong(1, i11);
        this.f95672a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.f95672a.setTransactionSuccessful();
        } finally {
            this.f95672a.endTransaction();
            this.f95677f.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // p519oz.InterfaceC43338a
    /* JADX INFO: renamed from: f */
    public void mo95410f(List<LogData> list) {
        this.f95672a.assertNotSuspendingTransaction();
        this.f95672a.beginTransaction();
        try {
            this.f95673b.insert(list);
            this.f95672a.setTransactionSuccessful();
        } finally {
            this.f95672a.endTransaction();
        }
    }

    public C43339b(RoomDatabase roomDatabase) {
        this.f95672a = roomDatabase;
        this.f95673b = new a(roomDatabase);
        this.f95674c = new b(roomDatabase);
        this.f95675d = new c(roomDatabase);
        this.f95676e = new d(roomDatabase);
        this.f95677f = new e(roomDatabase);
    }
}
