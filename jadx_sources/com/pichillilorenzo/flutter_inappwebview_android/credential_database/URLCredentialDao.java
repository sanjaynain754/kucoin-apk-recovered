package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.content.ContentValues;
import android.database.Cursor;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class URLCredentialDao {
    CredentialDatabaseHelper credentialDatabaseHelper;
    String[] projection = {"_id", "username", "password", URLCredentialContract.FeedEntry.COLUMN_NAME_PROTECTION_SPACE_ID};

    public long insert(URLCredential uRLCredential) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", uRLCredential.getUsername());
        contentValues.put("password", uRLCredential.getPassword());
        contentValues.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PROTECTION_SPACE_ID, uRLCredential.getProtectionSpaceId());
        return this.credentialDatabaseHelper.getWritableDatabase().insert(URLCredentialContract.FeedEntry.TABLE_NAME, null, contentValues);
    }

    public long update(URLCredential uRLCredential) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", uRLCredential.getUsername());
        contentValues.put("password", uRLCredential.getPassword());
        return this.credentialDatabaseHelper.getWritableDatabase().update(URLCredentialContract.FeedEntry.TABLE_NAME, contentValues, "protection_space_id = ?", new String[]{uRLCredential.getProtectionSpaceId().toString()});
    }

    public URLCredentialDao(CredentialDatabaseHelper credentialDatabaseHelper) {
        this.credentialDatabaseHelper = credentialDatabaseHelper;
    }

    public long delete(URLCredential uRLCredential) {
        return this.credentialDatabaseHelper.getWritableDatabase().delete(URLCredentialContract.FeedEntry.TABLE_NAME, "_id = ?", new String[]{uRLCredential.getId().toString()});
    }

    public URLCredential find(String str, String str2, Long l11) {
        URLCredential uRLCredential;
        Cursor cursorQuery = this.credentialDatabaseHelper.getReadableDatabase().query(URLCredentialContract.FeedEntry.TABLE_NAME, this.projection, "username = ? AND password = ? AND protection_space_id = ?", new String[]{str, str2, l11.toString()}, null, null, null);
        if (cursorQuery.moveToNext()) {
            uRLCredential = new URLCredential(Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"))), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("username")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("password")), l11);
        } else {
            uRLCredential = null;
        }
        cursorQuery.close();
        return uRLCredential;
    }

    public List<URLCredential> getAllByProtectionSpaceId(Long l11) {
        Cursor cursorQuery = this.credentialDatabaseHelper.getReadableDatabase().query(URLCredentialContract.FeedEntry.TABLE_NAME, this.projection, "protection_space_id = ?", new String[]{l11.toString()}, null, null, null);
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            arrayList.add(new URLCredential(Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"))), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("username")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("password")), l11));
        }
        cursorQuery.close();
        return arrayList;
    }
}
