package com.kubi.flutter.plugin.cloud_storage_plugin;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.api.client.googleapis.extensions.android.gms.auth.UserRecoverableAuthIOException;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.flutter.plugin.cloud_storage_plugin.c */
/* JADX INFO: compiled from: GoogleDriveHelper.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;", "", "Lcom/google/api/services/drive/Drive;", "drive", "<init>", "(Lcom/google/api/services/drive/Drive;)V", "Lcom/google/api/services/drive/model/FileList;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/google/api/services/drive/model/FileList;", "", "fileId", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/google/api/services/drive/model/File;", "dirFile", "jsonFile", "key", "newContent", "", "c", "(Lcom/google/api/services/drive/model/File;Lcom/google/api/services/drive/model/File;Ljava/lang/String;Ljava/lang/String;)Z", "Lcom/google/api/services/drive/Drive;", "cloud_storage_plugin_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGoogleDriveHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleDriveHelper.kt\ncom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class C12632c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Drive drive;

    public C12632c(@NotNull Drive drive) {
        Intrinsics.checkNotNullParameter(drive, "drive");
        this.drive = drive;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final FileList m23890a() {
        try {
            return this.drive.files().list().setSpaces("appDataFolder").execute();
        } catch (UserRecoverableAuthIOException unused) {
            return null;
        } catch (Throwable th2) {
            C12631b.f22061a.m23888a(th2, "CloudStoragePlugin");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.String] */
    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m23891b(@NotNull String fileId) {
        BufferedReader bufferedReader;
        Throwable th2;
        InputStream inputStreamExecuteMediaAsInputStream;
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        InputStream inputStream = null;
        try {
            inputStreamExecuteMediaAsInputStream = this.drive.files().get(fileId).executeMediaAsInputStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamExecuteMediaAsInputStream));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    while (true) {
                        ?? line = bufferedReader.readLine();
                        objectRef.element = line;
                        if (line == 0) {
                            break;
                        }
                        sb2.append((String) line);
                    }
                    String string = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    if (inputStreamExecuteMediaAsInputStream != null) {
                        C12631b.f22061a.m23889b(inputStreamExecuteMediaAsInputStream);
                    }
                    C12631b.f22061a.m23889b(bufferedReader);
                    return string;
                } catch (UserRecoverableAuthIOException unused) {
                    inputStream = inputStreamExecuteMediaAsInputStream;
                    if (inputStream != null) {
                        C12631b.f22061a.m23889b(inputStream);
                    }
                    if (bufferedReader != null) {
                        C12631b.f22061a.m23889b(bufferedReader);
                    }
                    return "";
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        C12631b c12631b = C12631b.f22061a;
                        c12631b.m23888a(th2, "CloudStoragePlugin");
                        if (inputStreamExecuteMediaAsInputStream != null) {
                            c12631b.m23889b(inputStreamExecuteMediaAsInputStream);
                        }
                        if (bufferedReader != null) {
                        }
                        return "";
                    } finally {
                        if (inputStreamExecuteMediaAsInputStream != null) {
                            C12631b.f22061a.m23889b(inputStreamExecuteMediaAsInputStream);
                        }
                        if (bufferedReader != null) {
                            C12631b.f22061a.m23889b(bufferedReader);
                        }
                    }
                }
            } catch (UserRecoverableAuthIOException unused2) {
                bufferedReader = null;
            } catch (Throwable th4) {
                bufferedReader = null;
                th2 = th4;
            }
        } catch (UserRecoverableAuthIOException unused3) {
            bufferedReader = null;
        } catch (Throwable th5) {
            bufferedReader = null;
            th2 = th5;
            inputStreamExecuteMediaAsInputStream = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m23892c(@Nullable File dirFile, @Nullable File jsonFile, @NotNull String key, @NotNull String newContent) {
        String id2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(newContent, "newContent");
        try {
            String id3 = dirFile != null ? dirFile.getId() : this.drive.files().create(new File().setParents(CollectionsKt.listOf("appDataFolder")).setMimeType("application/vnd.google-apps.folder").setName("KCStorageBackups")).execute().getId();
            String str = key + ".json";
            if (jsonFile != null) {
                id2 = jsonFile.getId();
            } else {
                id2 = this.drive.files().create(new File().setParents(CollectionsKt.listOf(id3)).setMimeType("application/json").setName(str)).execute().getId();
            }
            C44128b.m97265i("createOrUpdateContent");
            this.drive.files().update(id2, new File().setName(str), ByteArrayContent.fromString("application/json", newContent)).execute();
            return true;
        } catch (UserRecoverableAuthIOException unused) {
            return false;
        } catch (Throwable th2) {
            C12631b.f22061a.m23888a(th2, "CloudStoragePlugin");
            return false;
        }
    }
}
