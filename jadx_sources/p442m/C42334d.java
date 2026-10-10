package p442m;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.bugly.proguard.C33820nf;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: m.d */
/* JADX INFO: loaded from: classes23.dex */
public class C42334d extends C42331a {
    /* JADX INFO: renamed from: b */
    public static String m92894b(Context context) {
        StringBuilder sb2 = new StringBuilder();
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest((m92897e().toString() + System.currentTimeMillis()).getBytes());
            int length = bArrDigest.length;
            for (int i11 = 0; i11 < length; i11++) {
                String hexString = Integer.toHexString(bArrDigest[i11] & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                sb2.append(hexString);
            }
        } catch (Exception unused) {
        }
        String string = sb2.toString();
        if (TextUtils.isEmpty(string)) {
            string = "random2-" + UUID.randomUUID().toString();
        }
        try {
            context.deleteFile("advtn.tk");
            context.openFileOutput("advtn.tk", 0).write(string.getBytes());
        } catch (IOException unused2) {
        }
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static String m92895c(Context context) {
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput("advtn.tk");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, fileInputStreamOpenFileInput.available()));
            byte[] bArr = new byte[8192];
            while (true) {
                int i11 = fileInputStreamOpenFileInput.read(bArr);
                if (i11 < 0) {
                    return new String(byteArrayOutputStream.toByteArray());
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m92897e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C33820nf.f71125D, Build.BRAND);
            jSONObject.put("ABI", Build.CPU_ABI);
            jSONObject.put("CPU", Build.HARDWARE);
            jSONObject.put("display", Build.DISPLAY);
            jSONObject.put("manufacturer", Build.MANUFACTURER);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("androidVersion", Build.VERSION.SDK_INT);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public static String m92896d(Context context) {
        String strM92895c = m92895c(context);
        if (TextUtils.isEmpty(strM92895c)) {
            return m92894b(context);
        }
        return strM92895c;
    }
}
