package com.google.mlkit.common.internal.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzh;
import com.google.android.gms.internal.mlkit_common.zzi;
import com.google.android.gms.internal.mlkit_common.zzu;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes56.dex */
@KeepForSdk
@WorkerThread
public class ModelUtils {
    private static final GmsLogger zza = new GmsLogger("ModelUtils", "");

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    @KeepForSdk
    public static abstract class AutoMLManifest {
        @NonNull
        @KeepForSdk
        public abstract String getLabelsFile();

        @NonNull
        @KeepForSdk
        public abstract String getModelFile();

        @NonNull
        @KeepForSdk
        public abstract String getModelType();
    }

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    @KeepForSdk
    public static abstract class ModelLoggingInfo {
        @NonNull
        @KeepForSdk
        public abstract String getHash();

        @KeepForSdk
        public abstract long getSize();

        @KeepForSdk
        public abstract boolean isManifestModel();

        public static ModelLoggingInfo zza(long j11, @Nullable String str, boolean z11) {
            return new AutoValue_ModelUtils_ModelLoggingInfo(j11, zzu.zzb(str), z11);
        }
    }

    @Nullable
    @KeepForSdk
    public static String getSHA256(@NonNull File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                String strZzc = zzc(fileInputStream);
                fileInputStream.close();
                return strZzc;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            zza.m12880e("ModelUtils", "Failed to create FileInputStream for model: ".concat(e11.toString()));
            return null;
        }
    }

    @Nullable
    private static String zzc(InputStream inputStream) {
        int i11;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[1048576];
            while (true) {
                int i12 = inputStream.read(bArr);
                if (i12 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i12);
            }
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : bArrDigest) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (IOException unused) {
            zza.m12880e("ModelUtils", "Failed to read model file");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            zza.m12880e("ModelUtils", "Do not have SHA-256 algorithm");
            return null;
        }
    }

    private ModelUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    @KeepForSdk
    public static ModelLoggingInfo getModelLoggingInfo(@NonNull Context context, @NonNull LocalModel localModel) throws Throwable {
        long length;
        String string;
        Throwable th2;
        IOException e11;
        InputStream inputStreamZzb;
        String strZzc;
        String assetFilePath = localModel.getAssetFilePath();
        String absoluteFilePath = localModel.getAbsoluteFilePath();
        Uri uri = localModel.getUri();
        InputStream inputStream = null;
        if (assetFilePath != null) {
            if (localModel.isManifestFile() && (assetFilePath = zzb(context, assetFilePath, true)) == null) {
                return null;
            }
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(assetFilePath);
                try {
                    length = assetFileDescriptorOpenFd.getLength();
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th3) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (IOException e12) {
                zza.m12881e("ModelUtils", "Failed to open model file", e12);
                return null;
            }
        } else if (absoluteFilePath != null) {
            if (localModel.isManifestFile() && (absoluteFilePath = zzb(context, absoluteFilePath, false)) == null) {
                return null;
            }
            length = new File(absoluteFilePath).length();
        } else if (uri != null) {
            try {
                AssetFileDescriptor assetFileDescriptorZza = zzi.zza(context, uri, "r");
                try {
                    length = assetFileDescriptorZza.getLength();
                    assetFileDescriptorZza.close();
                } catch (Throwable th5) {
                    if (assetFileDescriptorZza != null) {
                        try {
                            assetFileDescriptorZza.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                    }
                    throw th5;
                }
            } catch (IOException e13) {
                zza.m12881e("ModelUtils", "Failed to open model file", e13);
                return null;
            }
        } else {
            zza.m12880e("ModelUtils", "Local model doesn't have any valid path.");
            return null;
        }
        SharedPrefManager sharedPrefManager = (SharedPrefManager) MlKitContext.getInstance().get(SharedPrefManager.class);
        if (assetFilePath != null) {
            string = assetFilePath;
        } else if (absoluteFilePath != null) {
            string = absoluteFilePath;
        } else {
            string = ((Uri) Preconditions.checkNotNull(uri)).toString();
        }
        String strZzb = sharedPrefManager.zzb(string, length);
        if (strZzb != null) {
            return ModelLoggingInfo.zza(length, strZzb, localModel.isManifestFile());
        }
        try {
            if (assetFilePath != null) {
                inputStreamZzb = context.getAssets().open(assetFilePath);
            } else if (absoluteFilePath != null) {
                inputStreamZzb = new FileInputStream(new File(absoluteFilePath));
            } else {
                Uri uri2 = (Uri) Preconditions.checkNotNull(uri);
                int i11 = zzi.zza;
                inputStreamZzb = zzi.zzb(context, uri2, zzh.zza);
            }
            if (inputStreamZzb != null) {
                try {
                    try {
                        strZzc = zzc(inputStreamZzb);
                    } catch (IOException e14) {
                        e11 = e14;
                        zza.m12881e("ModelUtils", "Failed to open model file", e11);
                        if (inputStreamZzb != null) {
                            try {
                                inputStreamZzb.close();
                            } catch (IOException e15) {
                                zza.m12881e("ModelUtils", "Failed to close model file", e15);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th7) {
                    th2 = th7;
                    inputStream = inputStreamZzb;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e16) {
                            zza.m12881e("ModelUtils", "Failed to close model file", e16);
                        }
                    }
                    throw th2;
                }
            } else {
                strZzc = null;
            }
            if (strZzc != null) {
                sharedPrefManager.zzc(string, length, strZzc);
            }
            ModelLoggingInfo modelLoggingInfoZza = ModelLoggingInfo.zza(length, strZzc, localModel.isManifestFile());
            if (inputStreamZzb != null) {
                try {
                    inputStreamZzb.close();
                    return modelLoggingInfoZza;
                } catch (IOException e17) {
                    zza.m12881e("ModelUtils", "Failed to close model file", e17);
                }
            }
            return modelLoggingInfoZza;
        } catch (IOException e18) {
            e11 = e18;
            inputStreamZzb = null;
        } catch (Throwable th8) {
            th2 = th8;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (new java.io.File(r5).exists() == false) goto L10;
     */
    @Nullable
    @KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AutoMLManifest parseManifestFile(@NonNull String str, boolean z11, @NonNull Context context) {
        InputStream fileInputStream;
        byte[] bArr;
        String strValueOf = String.valueOf(str);
        GmsLogger gmsLogger = zza;
        gmsLogger.m12878d("ModelUtils", "Manifest file path: ".concat(strValueOf));
        if (z11) {
            try {
                InputStream inputStreamOpen = context.getAssets().open(str);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } catch (IOException unused) {
                zza.m12880e("ModelUtils", "Manifest file does not exist.");
                return null;
            }
        }
        try {
            if (str.isEmpty()) {
                bArr = new byte[0];
            } else {
                if (z11) {
                    fileInputStream = context.getAssets().open(str);
                } else {
                    fileInputStream = new FileInputStream(new File(str));
                }
                try {
                    int iAvailable = fileInputStream.available();
                    byte[] bArr2 = new byte[iAvailable];
                    fileInputStream.read(bArr2, 0, iAvailable);
                    fileInputStream.close();
                    bArr = bArr2;
                } catch (Throwable th2) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            String str2 = new String(bArr, "UTF-8");
            gmsLogger.m12878d("ModelUtils", "Json string from the manifest file: " + str2);
            JSONObject jSONObject = new JSONObject(str2);
            return new AutoValue_ModelUtils_AutoMLManifest(jSONObject.getString("modelType"), jSONObject.getString("modelFile"), jSONObject.getString("labelsFile"));
        } catch (IOException e11) {
            e = e11;
            zza.m12881e("ModelUtils", "Error parsing the manifest file.", e);
            return null;
        } catch (JSONException e12) {
            e = e12;
            zza.m12881e("ModelUtils", "Error parsing the manifest file.", e);
            return null;
        }
    }

    public static boolean zza(@NonNull File file, @NonNull String str) {
        String sha256 = getSHA256(file);
        zza.m12878d("ModelUtils", "Calculated hash value is: ".concat(String.valueOf(sha256)));
        return str.equals(sha256);
    }

    @Nullable
    private static String zzb(Context context, String str, boolean z11) {
        AutoMLManifest manifestFile = parseManifestFile(str, z11, context);
        if (manifestFile == null) {
            zza.m12880e("ModelUtils", "Failed to parse manifest file.");
            return null;
        }
        return new File(new File(str).getParent(), manifestFile.getModelFile()).toString();
    }
}
