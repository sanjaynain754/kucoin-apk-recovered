package com.datavisorobfus;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.datavisor.vangogh.bridge.crypto;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.datavisorobfus.c */
/* JADX INFO: loaded from: classes34.dex */
public class C5405c {
    /* JADX INFO: renamed from: a */
    public static String m7114a(Context context, String str) {
        Throwable th2;
        Cursor cursorQuery;
        try {
            if (C5457z0.m7480a(str)) {
                return null;
            }
            cursorQuery = context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_display_name = '" + (str + ".mp3") + "'", null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
                            Uri uriWithAppendedPath = Uri.withAppendedPath(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, "" + i11);
                            if (uriWithAppendedPath != null) {
                                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriWithAppendedPath);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[512];
                                while (true) {
                                    int i12 = inputStreamOpenInputStream.read(bArr, 0, 512);
                                    if (i12 == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i12);
                                }
                                byte[] bArrA2d = crypto.a2d(byteArrayOutputStream.toByteArray());
                                if (bArrA2d == null) {
                                    try {
                                        cursorQuery.close();
                                        return null;
                                    } catch (Throwable th3) {
                                        C5415f0.m7139a(th3);
                                        return null;
                                    }
                                }
                                String str2 = new String(bArrA2d);
                                try {
                                    cursorQuery.close();
                                    return str2;
                                } catch (Throwable th4) {
                                    C5415f0.m7139a(th4);
                                    return str2;
                                }
                            }
                        } while (cursorQuery.moveToNext());
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                    return null;
                } catch (Throwable th6) {
                    C5415f0.m7139a(th6);
                }
            }
            return null;
        } catch (Throwable th7) {
            th2 = th7;
            cursorQuery = null;
        }
        try {
            C5415f0.m7139a(th2);
            return null;
        } finally {
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Throwable th8) {
                    C5415f0.m7139a(th8);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7115a(Context context, String str, String str2) {
        OutputStream outputStreamOpenOutputStream;
        try {
            if (!C5457z0.m7480a(str) && !C5457z0.m7480a(str2)) {
                String str3 = str + ".mp3";
                byte[] bArrD2a = crypto.d2a(str2.getBytes());
                if (bArrD2a == null) {
                    return false;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", str3);
                if (Build.VERSION.SDK_INT < 29) {
                    contentValues.put("_data", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath(), str3).getAbsolutePath());
                }
                Uri uriInsert = context.getContentResolver().insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues);
                if (uriInsert != null && (outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert)) != null) {
                    outputStreamOpenOutputStream.write(bArrD2a);
                    outputStreamOpenOutputStream.flush();
                    outputStreamOpenOutputStream.close();
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }
}
