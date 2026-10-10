package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.p023db.SupportSQLiteCompat;
import androidx.sqlite.p023db.SupportSQLiteDatabase;
import androidx.sqlite.p023db.SupportSQLiteQuery;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class DBUtil {
    @NonNull
    @Deprecated
    public static Cursor query(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, boolean z11) {
        return query(roomDatabase, supportSQLiteQuery, z11, null);
    }

    public static int readVersion(@NonNull File file) throws Throwable {
        Throwable th2;
        FileChannel fileChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                channel.tryLock(60L, 4L, true);
                channel.position(60L);
                if (channel.read(byteBufferAllocate) != 4) {
                    throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
                }
                byteBufferAllocate.rewind();
                int i11 = byteBufferAllocate.getInt();
                channel.close();
                return i11;
            } catch (Throwable th3) {
                th2 = th3;
                fileChannel = channel;
                if (fileChannel == null) {
                    throw th2;
                }
                fileChannel.close();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public static void dropFtsSyncTriggers(SupportSQLiteDatabase supportSQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor cursorQuery = supportSQLiteDatabase.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(cursorQuery.getString(0));
            } catch (Throwable th2) {
                cursorQuery.close();
                throw th2;
            }
        }
        cursorQuery.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                supportSQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static void foreignKeyCheck(@NonNull SupportSQLiteDatabase supportSQLiteDatabase, @NonNull String str) {
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA foreign_key_check(`" + str + "`)");
        try {
            if (cursorQuery.getCount() > 0) {
                throw new IllegalStateException(processForeignKeyCheckFailure(cursorQuery));
            }
            cursorQuery.close();
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    @NonNull
    public static Cursor query(@NonNull RoomDatabase roomDatabase, @NonNull SupportSQLiteQuery supportSQLiteQuery, boolean z11, @Nullable CancellationSignal cancellationSignal) {
        Cursor cursorQuery = roomDatabase.query(supportSQLiteQuery, cancellationSignal);
        if (!z11 || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? CursorUtil.copyAndClose(abstractWindowedCursor) : cursorQuery;
    }

    private DBUtil() {
    }

    @Nullable
    public static CancellationSignal createCancellationSignal() {
        return SupportSQLiteCompat.Api16Impl.createCancellationSignal();
    }

    private static String processForeignKeyCheckFailure(Cursor cursor) {
        int count = cursor.getCount();
        HashMap map = new HashMap();
        String string = null;
        while (cursor.moveToNext()) {
            if (string == null) {
                string = cursor.getString(0);
            }
            String string2 = cursor.getString(3);
            if (!map.containsKey(string2)) {
                map.put(string2, cursor.getString(2));
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Foreign key violation(s) detected in '");
        sb2.append(string);
        sb2.append("'.\n");
        sb2.append("Number of different violations discovered: ");
        sb2.append(map.keySet().size());
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("Number of rows in violation: ");
        sb2.append(count);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : map.entrySet()) {
            sb2.append("\tParent Table = ");
            sb2.append((String) entry.getValue());
            sb2.append(", Foreign Key Constraint Index = ");
            sb2.append((String) entry.getKey());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        return sb2.toString();
    }
}
