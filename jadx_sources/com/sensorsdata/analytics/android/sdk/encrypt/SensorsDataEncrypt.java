package com.sensorsdata.analytics.android.sdk.encrypt;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import com.tencent.bugly.proguard.C33844oi;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class SensorsDataEncrypt {
    private static final int KEY_VERSION_DEFAULT = 0;
    private static final String SP_SECRET_KEY = "secret_key";
    private static final String TAG = "SensorsDataEncrypt";
    private Context mContext;
    private SAEncryptListener mEncryptListener;
    private List<SAEncryptListener> mListeners;
    private IPersistentSecretKey mPersistentSecretKey;
    private SecreteKey mSecreteKey;

    /* JADX WARN: Code duplicated, block: B:31:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0023: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:36), block:B:11:0x0023 */
    private byte[] gzipEventData(String str) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        OutputStream outputStream;
        OutputStream outputStream2 = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(str.getBytes());
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        gZIPOutputStream.close();
                        return byteArray;
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                        return byteArray;
                    }
                } catch (Exception e12) {
                    e = e12;
                    SALog.printStackTrace(e);
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception e13) {
                            SALog.printStackTrace(e13);
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream2 = outputStream;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (Exception e14) {
                        SALog.printStackTrace(e14);
                    }
                }
                throw th;
            }
        } catch (Exception e15) {
            e = e15;
            gZIPOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (outputStream2 != null) {
                outputStream2.close();
            }
            throw th;
        }
    }

    private boolean isSecretKeyNull(SecreteKey secreteKey) {
        return secreteKey == null || TextUtils.isEmpty(secreteKey.key) || secreteKey.version == 0;
    }

    private SecreteKey loadSecretKey() throws JSONException {
        return this.mPersistentSecretKey != null ? readAppKey() : readLocalKey();
    }

    private SecreteKey readAppKey() {
        String str;
        int i11;
        String str2;
        String str3;
        SecreteKey secreteKeyLoadSecretKey = this.mPersistentSecretKey.loadSecretKey();
        if (secreteKeyLoadSecretKey != null) {
            str = secreteKeyLoadSecretKey.key;
            i11 = secreteKeyLoadSecretKey.version;
            str3 = secreteKeyLoadSecretKey.symmetricEncryptType;
            str2 = secreteKeyLoadSecretKey.asymmetricEncryptType;
        } else {
            str = null;
            i11 = 0;
            str2 = null;
            str3 = null;
        }
        SALog.m68589i(TAG, "readAppKey [key = " + str + " ,v = " + i11 + " ,symmetricEncryptType = " + str3 + " ,asymmetricEncryptType = " + str2 + "]");
        return new SecreteKey(str, i11, str3, str2);
    }

    private SecreteKey readLocalKey() throws JSONException {
        String strOptString;
        String strOptString2;
        String strOptString3;
        String string = SensorsDataUtils.getSharedPreferences(this.mContext).getString(SP_SECRET_KEY, "");
        int iOptInt = 0;
        if (TextUtils.isEmpty(string)) {
            strOptString = null;
            strOptString2 = null;
            strOptString3 = null;
        } else {
            JSONObject jSONObject = new JSONObject(string);
            strOptString = jSONObject.optString("key", "");
            iOptInt = jSONObject.optInt("version", 0);
            strOptString3 = jSONObject.optString("symmetricEncryptType", "");
            strOptString2 = jSONObject.optString("asymmetricEncryptType", "");
        }
        SALog.m68589i(TAG, "readLocalKey [key = " + strOptString + " ,v = " + iOptInt + " ,symmetricEncryptType = " + strOptString3 + " ,asymmetricEncryptType = " + strOptString2 + "]");
        return new SecreteKey(strOptString, iOptInt, strOptString3, strOptString2);
    }

    private void saveLocalSecretKey(String str) {
        SharedPreferences.Editor editorEdit = SensorsDataUtils.getSharedPreferences(this.mContext).edit();
        editorEdit.putString(SP_SECRET_KEY, str);
        editorEdit.apply();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:2:0x0000, B:4:0x0008, B:9:0x0017, B:11:0x0021, B:12:0x0029, B:15:0x002e, B:17:0x003a, B:18:0x0046, B:21:0x0053, B:24:0x0068), top: B:28:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x002e A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:2:0x0000, B:4:0x0008, B:9:0x0017, B:11:0x0021, B:12:0x0029, B:15:0x002e, B:17:0x003a, B:18:0x0046, B:21:0x0053, B:24:0x0068), top: B:28:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x003a A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:2:0x0000, B:4:0x0008, B:9:0x0017, B:11:0x0021, B:12:0x0029, B:15:0x002e, B:17:0x003a, B:18:0x0046, B:21:0x0053, B:24:0x0068), top: B:28:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:2:0x0000, B:4:0x0008, B:9:0x0017, B:11:0x0021, B:12:0x0029, B:15:0x002e, B:17:0x003a, B:18:0x0046, B:21:0x0053, B:24:0x0068), top: B:28:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0068 A[Catch: Exception -> 0x0015, TRY_LEAVE, TryCatch #0 {Exception -> 0x0015, blocks: (B:2:0x0000, B:4:0x0008, B:9:0x0017, B:11:0x0021, B:12:0x0029, B:15:0x002e, B:17:0x003a, B:18:0x0046, B:21:0x0053, B:24:0x0068), top: B:28:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0017 A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:2:0x0000, B:4:0x0008, B:9:0x0017, B:11:0x0021, B:12:0x0029, B:15:0x002e, B:17:0x003a, B:18:0x0046, B:21:0x0053, B:24:0x0068), top: B:28:0x0000 }] */
    public JSONObject encryptTrackData(JSONObject jSONObject) {
        String strSubstring;
        String strEncryptSymmetricKeyWithPublicKey;
        String strEncryptEvent;
        try {
            if (isSecretKeyNull(this.mSecreteKey)) {
                SecreteKey secreteKeyLoadSecretKey = loadSecretKey();
                this.mSecreteKey = secreteKeyLoadSecretKey;
                if (!isSecretKeyNull(secreteKeyLoadSecretKey)) {
                    if (!isMatchEncryptType(this.mEncryptListener, this.mSecreteKey)) {
                        this.mEncryptListener = getEncryptListener(this.mSecreteKey);
                    }
                    if (this.mEncryptListener == null) {
                        strSubstring = this.mSecreteKey.key;
                        if (strSubstring.startsWith("EC:")) {
                            strSubstring = strSubstring.substring(strSubstring.indexOf(C33844oi.f71346o) + 1);
                        }
                        strEncryptSymmetricKeyWithPublicKey = this.mEncryptListener.encryptSymmetricKeyWithPublicKey(strSubstring);
                        if (!TextUtils.isEmpty(strEncryptSymmetricKeyWithPublicKey)) {
                            strEncryptEvent = this.mEncryptListener.encryptEvent(gzipEventData(jSONObject.toString()));
                            if (TextUtils.isEmpty(strEncryptEvent)) {
                                return jSONObject;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("ekey", strEncryptSymmetricKeyWithPublicKey);
                            jSONObject2.put("pkv", this.mSecreteKey.version);
                            jSONObject2.put("payloads", strEncryptEvent);
                            return jSONObject2;
                        }
                    }
                }
            } else {
                if (!isMatchEncryptType(this.mEncryptListener, this.mSecreteKey)) {
                    this.mEncryptListener = getEncryptListener(this.mSecreteKey);
                }
                if (this.mEncryptListener == null) {
                    strSubstring = this.mSecreteKey.key;
                    if (strSubstring.startsWith("EC:")) {
                        strSubstring = strSubstring.substring(strSubstring.indexOf(C33844oi.f71346o) + 1);
                    }
                    strEncryptSymmetricKeyWithPublicKey = this.mEncryptListener.encryptSymmetricKeyWithPublicKey(strSubstring);
                    if (!TextUtils.isEmpty(strEncryptSymmetricKeyWithPublicKey)) {
                        strEncryptEvent = this.mEncryptListener.encryptEvent(gzipEventData(jSONObject.toString()));
                        if (TextUtils.isEmpty(strEncryptEvent)) {
                            return jSONObject;
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("ekey", strEncryptSymmetricKeyWithPublicKey);
                        jSONObject3.put("pkv", this.mSecreteKey.version);
                        jSONObject3.put("payloads", strEncryptEvent);
                        return jSONObject3;
                    }
                }
            }
            return jSONObject;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return jSONObject;
        }
    }

    public boolean isMatchEncryptType(SAEncryptListener sAEncryptListener, SecreteKey secreteKey) {
        return (sAEncryptListener == null || isSecretKeyNull(secreteKey) || isEncryptorTypeNull(sAEncryptListener) || !sAEncryptListener.asymmetricEncryptType().equals(secreteKey.asymmetricEncryptType) || !sAEncryptListener.symmetricEncryptType().equals(secreteKey.symmetricEncryptType)) ? false : true;
    }

    public void saveSecretKey(SecreteKey secreteKey) {
        try {
            SALog.m68589i(TAG, "[saveSecretKey] publicKey = " + secreteKey.toString());
            if (getEncryptListener(secreteKey) != null) {
                IPersistentSecretKey iPersistentSecretKey = this.mPersistentSecretKey;
                if (iPersistentSecretKey == null) {
                    saveLocalSecretKey(secreteKey.toString());
                } else {
                    iPersistentSecretKey.saveSecretKey(secreteKey);
                    saveLocalSecretKey("");
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public SensorsDataEncrypt(Context context, IPersistentSecretKey iPersistentSecretKey, List<SAEncryptListener> list) {
        this.mPersistentSecretKey = iPersistentSecretKey;
        this.mContext = context;
        this.mListeners = list;
        list.add(new SARSAEncrypt());
        if (isECEncrypt()) {
            this.mListeners.add(new SAECEncrypt());
        }
    }

    public static boolean isECEncrypt() {
        try {
            Class.forName("org.spongycastle.jce.provider.BouncyCastleProvider");
            return true;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return false;
        }
    }

    private boolean isEncryptorTypeNull(SAEncryptListener sAEncryptListener) {
        if (!TextUtils.isEmpty(sAEncryptListener.asymmetricEncryptType()) && !TextUtils.isEmpty(sAEncryptListener.symmetricEncryptType())) {
            return false;
        }
        return true;
    }

    public String checkPublicSecretKey(String str, String str2, String str3, String str4) {
        try {
            SecreteKey secreteKeyLoadSecretKey = loadSecretKey();
            if (secreteKeyLoadSecretKey != null && !TextUtils.isEmpty(secreteKeyLoadSecretKey.key)) {
                if (str.equals(secreteKeyLoadSecretKey.version + "") && disposeECPublicKey(str2).equals(disposeECPublicKey(secreteKeyLoadSecretKey.key))) {
                    if (str3 != null && str4 != null) {
                        if (!str3.equals(secreteKeyLoadSecretKey.symmetricEncryptType) || !str4.equals(secreteKeyLoadSecretKey.asymmetricEncryptType)) {
                            return "密钥验证不通过，所选密钥类型与 App 端密钥类型不相同。所选密钥对称算法类型:" + str3 + "，非对称算法类型:" + str4 + "，App 端密钥对称算法类型:" + secreteKeyLoadSecretKey.symmetricEncryptType + "，非对称算法类型:" + secreteKeyLoadSecretKey.asymmetricEncryptType;
                        }
                        return "密钥验证通过，所选密钥与 App 端密钥相同";
                    }
                    return "密钥验证通过，所选密钥与 App 端密钥相同";
                }
                return "密钥验证不通过，所选密钥与 App 端密钥不相同。所选密钥版本:" + str + "，App 端密钥版本:" + secreteKeyLoadSecretKey.version;
            }
            return "密钥验证不通过，App 端密钥为空";
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return "";
        }
    }

    public String disposeECPublicKey(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("EC:")) {
            return str.substring(str.indexOf(C33844oi.f71346o) + 1);
        }
        return str;
    }

    public SAEncryptListener getEncryptListener(SecreteKey secreteKey) {
        if (!isSecretKeyNull(secreteKey)) {
            for (SAEncryptListener sAEncryptListener : this.mListeners) {
                if (sAEncryptListener != null && isMatchEncryptType(sAEncryptListener, secreteKey)) {
                    return sAEncryptListener;
                }
            }
            return null;
        }
        return null;
    }

    public boolean isPublicSecretKeyNull() {
        try {
            return TextUtils.isEmpty(loadSecretKey().key);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return true;
        }
    }
}
