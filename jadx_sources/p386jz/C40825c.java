package p386jz;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.p023db.SupportSQLiteStatement;
import com.kubi.sdk.lib.kunlun.sdk.p115db.KunlunDBEventData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: jz.c */
/* JADX INFO: compiled from: KunlunEventDao_Impl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C40825c implements InterfaceC40824b {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f90685a;

    /* JADX INFO: renamed from: b */
    public final EntityInsertionAdapter<KunlunDBEventData> f90686b;

    /* JADX INFO: renamed from: c */
    public final EntityDeletionOrUpdateAdapter<KunlunDBEventData> f90687c;

    /* JADX INFO: renamed from: d */
    public final SharedSQLiteStatement f90688d;

    /* JADX INFO: renamed from: e */
    public final SharedSQLiteStatement f90689e;

    /* JADX INFO: renamed from: jz.c$a */
    /* JADX INFO: compiled from: KunlunEventDao_Impl.java */
    public class a extends EntityInsertionAdapter<KunlunDBEventData> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR ABORT INTO `KunlunDBEventData` (`eventId`,`event`,`timestamp`) VALUES (nullif(?, 0),?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, KunlunDBEventData kunlunDBEventData) {
            supportSQLiteStatement.bindLong(1, kunlunDBEventData.getEventId());
            if (kunlunDBEventData.getEvent() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, kunlunDBEventData.getEvent());
            }
            supportSQLiteStatement.bindLong(3, kunlunDBEventData.getTimeStamp());
        }
    }

    /* JADX INFO: renamed from: jz.c$b */
    /* JADX INFO: compiled from: KunlunEventDao_Impl.java */
    public class b extends EntityDeletionOrUpdateAdapter<KunlunDBEventData> {
        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, KunlunDBEventData kunlunDBEventData) {
            supportSQLiteStatement.bindLong(1, kunlunDBEventData.getEventId());
        }

        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `KunlunDBEventData` WHERE `eventId` = ?";
        }
    }

    /* JADX INFO: renamed from: jz.c$c */
    /* JADX INFO: compiled from: KunlunEventDao_Impl.java */
    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM KunlunDBEventData";
        }
    }

    /* JADX INFO: renamed from: jz.c$d */
    /* JADX INFO: compiled from: KunlunEventDao_Impl.java */
    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM KunlunDBEventData WHERE timestamp < ?";
        }
    }

    /* JADX INFO: renamed from: e */
    public static List<Class<?>> m89312e() {
        return Collections.EMPTY_LIST;
    }

    @Override // p386jz.InterfaceC40824b
    /* JADX INFO: renamed from: a */
    public void mo89308a(List<KunlunDBEventData> list) {
        this.f90685a.assertNotSuspendingTransaction();
        this.f90685a.beginTransaction();
        try {
            this.f90686b.insert(list);
            this.f90685a.setTransactionSuccessful();
        } finally {
            this.f90685a.endTransaction();
        }
    }

    @Override // p386jz.InterfaceC40824b
    /* JADX INFO: renamed from: b */
    public List<KunlunDBEventData> mo89309b(int i11) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM KunlunDBEventData ORDER BY timestamp DESC LIMIT ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, i11);
        this.f90685a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f90685a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "event");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new KunlunDBEventData(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // p386jz.InterfaceC40824b
    /* JADX INFO: renamed from: c */
    public int mo89310c(long j11) {
        this.f90685a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f90689e.acquire();
        supportSQLiteStatementAcquire.bindLong(1, j11);
        this.f90685a.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            this.f90685a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.f90685a.endTransaction();
            this.f90689e.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // p386jz.InterfaceC40824b
    /* JADX INFO: renamed from: d */
    public void mo89311d(List<KunlunDBEventData> list) {
        this.f90685a.assertNotSuspendingTransaction();
        this.f90685a.beginTransaction();
        try {
            this.f90687c.handleMultiple(list);
            this.f90685a.setTransactionSuccessful();
        } finally {
            this.f90685a.endTransaction();
        }
    }

    @Override // p386jz.InterfaceC40824b
    public void deleteAll() {
        this.f90685a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f90688d.acquire();
        this.f90685a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.f90685a.setTransactionSuccessful();
        } finally {
            this.f90685a.endTransaction();
            this.f90688d.release(supportSQLiteStatementAcquire);
        }
    }

    public C40825c(RoomDatabase roomDatabase) {
        this.f90685a = roomDatabase;
        this.f90686b = new a(roomDatabase);
        this.f90687c = new b(roomDatabase);
        this.f90688d = new c(roomDatabase);
        this.f90689e = new d(roomDatabase);
    }
}
