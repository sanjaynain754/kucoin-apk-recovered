package com.jumio.commons.log;

import android.graphics.Bitmap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.analytics.AnalyticsEvent;
import com.tencent.bugly.proguard.C33757kf;
import java.io.File;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J(\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0005J\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bJ \u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005J:\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010%\u001a\u00020&J\u001e\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005J\u001e\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/jumio/commons/log/LogUtils;", "", "<init>", "()V", "NEW_LINE", "", "init", "", "setSessionLogFolderName", "folderName", "getDebugFileRoot", "Ljava/io/File;", "logAnalytics", "event", "Lcom/jumio/analytics/AnalyticsEvent;", "logServerRequest", "taskName", "request", "logServerResponse", "status", "", "time", "", "response", "getSubFolder", "getLogFolder", "logInfoInSubfolder", TypedValues.Custom.S_STRING, "subFolderName", "fileName", "dumpImageInSubfolder", "bitmap", "Landroid/graphics/Bitmap;", "compressFormat", "Landroid/graphics/Bitmap$CompressFormat;", C33757kf.f70665k, "filenamePrefix", "recycle", "", "dumpDataInSubfolder", "data", "", "filename", "Ljava/nio/ByteBuffer;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LogUtils {

    @NotNull
    public static final LogUtils INSTANCE = new LogUtils();

    @NotNull
    public static final String NEW_LINE = "\r\n";

    public final void dumpDataInSubfolder(@NotNull ByteBuffer data, @NotNull String subFolderName, @NotNull String filename) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(subFolderName, "subFolderName");
        Intrinsics.checkNotNullParameter(filename, "filename");
    }

    @Nullable
    public final File getLogFolder() {
        return null;
    }

    public static /* synthetic */ void dumpImageInSubfolder$default(LogUtils logUtils, Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i11, String str2, boolean z11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            z11 = false;
        }
        logUtils.dumpImageInSubfolder(bitmap, str, compressFormat, i11, str2, z11);
    }

    public final void dumpDataInSubfolder(@NotNull byte[] data, @NotNull String subFolderName, @NotNull String filename) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(subFolderName, "subFolderName");
        Intrinsics.checkNotNullParameter(filename, "filename");
    }

    public final void dumpImageInSubfolder(@NotNull Bitmap bitmap, @NotNull String subFolderName, @NotNull Bitmap.CompressFormat compressFormat, int quality, @Nullable String filenamePrefix, boolean recycle) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(subFolderName, "subFolderName");
        Intrinsics.checkNotNullParameter(compressFormat, "compressFormat");
    }

    @Nullable
    public final File getDebugFileRoot(@NotNull String folderName) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        return null;
    }

    @Nullable
    public final File getSubFolder(@NotNull String folderName) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        return null;
    }

    public final void logAnalytics(@NotNull AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    public final void logInfoInSubfolder(@NotNull String string, @NotNull String subFolderName, @Nullable String fileName) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(subFolderName, "subFolderName");
    }

    public final void logServerRequest(@NotNull String taskName, @NotNull String request) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public final void logServerResponse(@NotNull String taskName, int status, long time, @Nullable String response) {
        Intrinsics.checkNotNullParameter(taskName, "taskName");
    }

    public final void setSessionLogFolderName(@NotNull String folderName) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
    }

    public final void init() {
    }
}
