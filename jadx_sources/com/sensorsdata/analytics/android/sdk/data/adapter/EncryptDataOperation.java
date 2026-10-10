package com.sensorsdata.analytics.android.sdk.data.adapter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.encrypt.SensorsDataEncrypt;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
class EncryptDataOperation extends DataOperation {
    private SensorsDataEncrypt mSensorsDataEncrypt;

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public int insertData(Uri uri, JSONObject jSONObject) {
        try {
            if (deleteDataLowMemory(uri) != 0) {
                return -2;
            }
            JSONObject jSONObjectEncryptTrackData = this.mSensorsDataEncrypt.encryptTrackData(jSONObject);
            ContentValues contentValues = new ContentValues();
            contentValues.put("data", jSONObjectEncryptTrackData.toString() + "\t" + jSONObjectEncryptTrackData.toString().hashCode());
            contentValues.put(DbParams.KEY_CREATED_AT, Long.valueOf(System.currentTimeMillis()));
            this.contentResolver.insert(uri, contentValues);
            return 0;
        } catch (Throwable th2) {
            SALog.m68587d(this.TAG, th2.getMessage());
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0174  */
    /* JADX WARN: Code duplicated, block: B:71:0x0179 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public String[] queryData(Uri uri, int i11) throws Throwable {
        Cursor cursor;
        String str;
        String[] strArr;
        String[] strArr2;
        Cursor cursorQuery;
        String string;
        ?? string2;
        String string3;
        String str2 = "9";
        try {
            HashMap map = new HashMap();
            JSONArray jSONArray = new JSONArray();
            cursorQuery = this.contentResolver.query(uri, null, null, null, "created_at ASC LIMIT " + i11);
            if (cursorQuery != null) {
                string = null;
                while (cursorQuery.moveToNext()) {
                    try {
                        try {
                            try {
                                if (cursorQuery.isLast()) {
                                    string = cursorQuery.getString(cursorQuery.getColumnIndex("_id"));
                                }
                                try {
                                    String data = parseData(cursorQuery.getString(cursorQuery.getColumnIndex("data")));
                                    if (!TextUtils.isEmpty(data)) {
                                        JSONObject jSONObject = new JSONObject(data);
                                        if (!jSONObject.has("ekey")) {
                                            jSONObject = this.mSensorsDataEncrypt.encryptTrackData(jSONObject);
                                        }
                                        if (jSONObject.has("ekey")) {
                                            String str3 = jSONObject.getString("ekey") + "$" + jSONObject.getInt("pkv");
                                            if (map.containsKey(str3)) {
                                                ((JSONArray) map.get(str3)).put(jSONObject.getString("payloads"));
                                            } else {
                                                JSONArray jSONArray2 = new JSONArray();
                                                jSONArray2.put(jSONObject.getString("payloads"));
                                                map.put(str3, jSONArray2);
                                            }
                                        } else {
                                            jSONArray.put(jSONObject);
                                        }
                                    }
                                } catch (Exception e11) {
                                    SALog.printStackTrace(e11);
                                }
                            } catch (Exception e12) {
                                e = e12;
                                str = "9";
                                strArr2 = null;
                                strArr = null;
                                SALog.printStackTrace(e);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                string2 = strArr2;
                                str2 = str;
                                if (string != null) {
                                    return new String[]{string, string2, str2};
                                }
                                return strArr;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            str = str2;
                            strArr = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                JSONArray jSONArray3 = new JSONArray();
                for (String str4 : map.keySet()) {
                    JSONObject jSONObject2 = new JSONObject();
                    strArr = null;
                    try {
                        jSONObject2.put("ekey", str4.substring(0, str4.indexOf("$")));
                        jSONObject2.put("pkv", Integer.valueOf(str4.substring(str4.indexOf("$") + 1)));
                        jSONObject2.put("payloads", map.get(str4));
                        str = str2;
                        try {
                            jSONObject2.put("flush_time", System.currentTimeMillis());
                            jSONArray3.put(jSONObject2);
                            str2 = str;
                        } catch (Exception e14) {
                            e = e14;
                            strArr2 = strArr;
                            SALog.printStackTrace(e);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            string2 = strArr2;
                            str2 = str;
                            if (string != null) {
                                return new String[]{string, string2, str2};
                            }
                            return strArr;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        str = str2;
                    }
                }
                String str5 = str2;
                strArr = null;
                if (jSONArray3.length() > 0) {
                    string3 = jSONArray3.toString();
                    str2 = str5;
                } else {
                    str2 = "1";
                    string2 = jSONArray.toString();
                }
            } else {
                strArr = null;
                string2 = 0;
                string = null;
            }
            if (cursorQuery != null) {
                string2 = string3;
                cursorQuery.close();
            }
        } catch (Exception e16) {
            e = e16;
            str = "9";
            strArr = null;
            strArr2 = null;
            cursorQuery = null;
            string = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (string != null) {
            return new String[]{string, string2, str2};
        }
        return strArr;
    }

    public EncryptDataOperation(Context context, SensorsDataEncrypt sensorsDataEncrypt) {
        super(context);
        this.mSensorsDataEncrypt = sensorsDataEncrypt;
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public void deleteData(Uri uri, String str) {
        super.deleteData(uri, str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public int insertData(Uri uri, ContentValues contentValues) {
        try {
            if (deleteDataLowMemory(uri) != 0) {
                return -2;
            }
            this.contentResolver.insert(uri, contentValues);
            return 0;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return 0;
        }
    }
}
