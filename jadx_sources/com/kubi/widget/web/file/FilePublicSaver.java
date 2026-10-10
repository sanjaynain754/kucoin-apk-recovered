package com.kubi.widget.web.file;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.core.content.ContextCompat;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.ByteStreamsKt;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: com.kubi.widget.web.file.o, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FilePublicSaver.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/widget/web/file/FilePublicSaver;", "", "<init>", "()V", "saveImage", "Lcom/kubi/widget/web/file/FileActionResult;", "context", "Landroid/content/Context;", "source", "Ljava/io/File;", "metadata", "Lcom/kubi/widget/web/file/FileMetadata;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFilePublicSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePublicSaver.kt\ncom/kubi/widget/web/file/FilePublicSaver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public final class FilePublicSaver {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FilePublicSaver f55132a = new FilePublicSaver();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final FileActionResult m67210a(@NotNull Context context, @NotNull File source, @NotNull FileMetadata metadata) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        if (!metadata.m67209d()) {
            return new FileActionResult(false, "UNSUPPORTED_TYPE");
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29 && ContextCompat.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return new FileActionResult(false, "PERMISSION_DENIED");
        }
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", metadata.getFileName());
        contentValues.put("mime_type", metadata.getMimeType());
        if (i11 >= 29) {
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/KuCoin");
            contentValues.put("is_pending", (Integer) 1);
        }
        Uri contentUri = i11 >= 29 ? MediaStore.Images.Media.getContentUri("external_primary") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(contentResolver.insert(contentUri, contentValues));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        Uri uri = (Uri) objM103844constructorimpl;
        if (uri == null) {
            return new FileActionResult(false, "SAVE_FAILED");
        }
        try {
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
            if (outputStreamOpenOutputStream == null) {
                throw new IllegalStateException("Cannot open MediaStore output");
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(source), 8192);
                try {
                    ByteStreamsKt.copyTo$default(bufferedInputStream, outputStreamOpenOutputStream, 0, 2, null);
                    CloseableKt.closeFinally(bufferedInputStream, null);
                    CloseableKt.closeFinally(outputStreamOpenOutputStream, null);
                    if (Build.VERSION.SDK_INT >= 29) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("is_pending", (Integer) 0);
                        Unit unit = Unit.INSTANCE;
                        contentResolver.update(uri, contentValues2, null, null);
                    }
                    objM103844constructorimpl2 = Result.m103844constructorimpl(new FileActionResult(true, null, 2, null));
                    if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl2) != null) {
                        contentResolver.delete(uri, null, null);
                        objM103844constructorimpl2 = new FileActionResult(false, "SAVE_FAILED");
                    }
                    return (FileActionResult) objM103844constructorimpl2;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(bufferedInputStream, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    CloseableKt.closeFinally(outputStreamOpenOutputStream, th5);
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th7));
        }
    }
}
