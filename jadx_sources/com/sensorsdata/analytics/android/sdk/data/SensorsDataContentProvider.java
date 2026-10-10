package com.sensorsdata.analytics.android.sdk.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.gms.actions.SearchIntents;
import com.kubi.sdk.util.ProviderAspect;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import dh0.C36686b;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.AbstractC43178a;

/* JADX INFO: loaded from: classes23.dex */
public class SensorsDataContentProvider extends ContentProvider {
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_0;
    private static final UriMatcher uriMatcher;
    private SensorsDataDBHelper dbHelper;
    private SAProviderHelper mProviderHelper;

    public class AjcClosure1 extends AbstractC43178a {
        @Override // org.aspectj.runtime.internal.AbstractC43178a
        public Object run(Object[] objArr) {
            Object[] objArr2 = this.state;
            return SensorsDataContentProvider.query_aroundBody0((SensorsDataContentProvider) objArr2[0], (Uri) objArr2[1], (String[]) objArr2[2], (String) objArr2[3], (String[]) objArr2[4], (String) objArr2[5], (InterfaceC43175a) objArr2[6]);
        }

        public AjcClosure1(Object[] objArr) {
            super(objArr);
        }
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
                writableDatabase.beginTransaction();
                int length = contentValuesArr.length;
                for (ContentValues contentValues : contentValuesArr) {
                    insert(uri, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return length;
            } catch (SQLiteException e11) {
                SALog.printStackTrace(e11);
                return 0;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                sQLiteDatabase.endTransaction();
            }
            throw th2;
        }
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("SensorsDataContentProvider.java", SensorsDataContentProvider.class);
        ajc$tjp_0 = c36686b.m82128h("method-execution", c36686b.m82127g("1", SearchIntents.EXTRA_QUERY, "com.sensorsdata.analytics.android.sdk.data.SensorsDataContentProvider", "android.net.Uri:[Ljava.lang.String;:java.lang.String:[Ljava.lang.String;:java.lang.String", "uri:projection:selection:selectionArgs:sortOrder", "", "android.database.Cursor"), 130);
    }

    public static final /* synthetic */ Cursor query_aroundBody0(SensorsDataContentProvider sensorsDataContentProvider, Uri uri, String[] strArr, String str, String[] strArr2, String str2, InterfaceC43175a interfaceC43175a) {
        try {
            int iMatch = uriMatcher.match(uri);
            if (iMatch == 1) {
                return sensorsDataContentProvider.mProviderHelper.queryByTable(DbParams.TABLE_EVENTS, strArr, str, strArr2, str2);
            }
            return iMatch == 8 ? sensorsDataContentProvider.mProviderHelper.queryByTable(DbParams.TABLE_CHANNEL_PERSISTENT, strArr, str, strArr2, str2) : sensorsDataContentProvider.mProviderHelper.queryPersistent(iMatch);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        try {
            if (1 == uriMatcher.match(uri)) {
                return this.mProviderHelper.deleteEvents(str, strArr);
            }
            return 0;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        if (contentValues != null && contentValues.size() != 0) {
            try {
                int iMatch = uriMatcher.match(uri);
                if (iMatch == 1) {
                    return this.mProviderHelper.insertEvent(uri, contentValues);
                }
                if (iMatch == 8) {
                    return this.mProviderHelper.insertChannelPersistent(uri, contentValues);
                }
                this.mProviderHelper.insertPersistent(iMatch, uri, contentValues);
                return uri;
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
        return uri;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return (Cursor) ProviderAspect.m58515b().m58516c(new AjcClosure1(new Object[]{this, uri, strArr, str, strArr2, str2, C36686b.m82125e(ajc$tjp_0, this, this, new Object[]{uri, strArr, str, strArr2, str2})}).linkClosureAndJoinPoint(69648));
    }

    static {
        ajc$preClinit();
        uriMatcher = new UriMatcher(-1);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        String packageName;
        try {
            Context context = getContext();
            if (context != null) {
                try {
                    packageName = context.getApplicationContext().getPackageName();
                } catch (UnsupportedOperationException unused) {
                    packageName = "com.sensorsdata.analytics.android.sdk.test";
                }
                SensorsDataDBHelper sensorsDataDBHelper = new SensorsDataDBHelper(context);
                this.dbHelper = sensorsDataDBHelper;
                SAProviderHelper sAProviderHelper = new SAProviderHelper(context, sensorsDataDBHelper);
                this.mProviderHelper = sAProviderHelper;
                sAProviderHelper.appendUri(uriMatcher, packageName + ".SensorsDataContentProvider");
                this.mProviderHelper.migratingDB(context, packageName);
                return true;
            }
            return true;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return true;
        }
    }
}
