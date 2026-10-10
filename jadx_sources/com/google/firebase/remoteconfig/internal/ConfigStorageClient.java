package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
public class ConfigStorageClient {
    private static final String JSON_STRING_ENCODING = "UTF-8";

    @GuardedBy("ConfigStorageClient.class")
    private static final Map<String, ConfigStorageClient> clientInstances = new HashMap();
    private final Context context;
    private final String fileName;

    public synchronized Void clear() {
        this.context.deleteFile(this.fileName);
        return null;
    }

    public synchronized ConfigContainer read() throws IOException {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        try {
            try {
                fileInputStreamOpenFileInput = this.context.openFileInput(this.fileName);
                try {
                    int iAvailable = fileInputStreamOpenFileInput.available();
                    byte[] bArr = new byte[iAvailable];
                    fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                    ConfigContainer configContainerCopyOf = ConfigContainer.copyOf(new JSONObject(new String(bArr, "UTF-8")));
                    fileInputStreamOpenFileInput.close();
                    return configContainerCopyOf;
                } catch (FileNotFoundException | JSONException unused) {
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th5) {
            fileInputStreamOpenFileInput = null;
            th2 = th5;
        }
    }

    public synchronized Void write(ConfigContainer configContainer) throws IOException {
        FileOutputStream fileOutputStreamOpenFileOutput = this.context.openFileOutput(this.fileName, 0);
        try {
            fileOutputStreamOpenFileOutput.write(configContainer.toString().getBytes("UTF-8"));
            fileOutputStreamOpenFileOutput.close();
        } catch (Throwable th2) {
            fileOutputStreamOpenFileOutput.close();
            throw th2;
        }
        return null;
    }

    @VisibleForTesting
    public static synchronized void clearInstancesForTest() {
        clientInstances.clear();
    }

    public static synchronized ConfigStorageClient getInstance(Context context, String str) {
        Map<String, ConfigStorageClient> map;
        try {
            map = clientInstances;
            if (!map.containsKey(str)) {
                map.put(str, new ConfigStorageClient(context, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map.get(str);
    }

    public String getFileName() {
        return this.fileName;
    }

    private ConfigStorageClient(Context context, String str) {
        this.context = context;
        this.fileName = str;
    }
}
