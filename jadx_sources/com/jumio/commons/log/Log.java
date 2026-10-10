package com.jumio.commons.log;

import android.graphics.Bitmap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33757kf;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\"\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015H\u0086\bø\u0001\u0000J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\"\u0010\u0016\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J \u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0018H\u0007J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001a\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\"\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J \u0010\u001f\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0018H\u0007J\u0010\u0010 \u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001a\u0010 \u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0018\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J \u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0007J\"\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J \u0010 \u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0018H\u0007J\u0010\u0010#\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001a\u0010#\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\"\u0010#\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J \u0010#\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0018H\u0007J\u0010\u0010$\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001a\u0010$\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0018\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\"\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J \u0010$\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0018H\u0007J\u0012\u0010%\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0007J2\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020\"J\u001e\u0010,\u001a\u00020\f2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0018J\"\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u0005R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00060"}, m90084d2 = {"Lcom/jumio/commons/log/Log;", "", "<init>", "()V", "logLevel", "Lcom/jumio/commons/log/LogLevel;", "getLogLevel$annotations", "getLogLevel", "()Lcom/jumio/commons/log/LogLevel;", "setLogLevel", "(Lcom/jumio/commons/log/LogLevel;)V", "allowFileLogging", "", "fileLoggingAllowed", "", "isFileLoggingActivated", "isFileLoggingActivated$annotations", "()Z", "runIfLogLevelIs", FirebaseAnalytics.Param.LEVEL, "execute", "Lkotlin/Function0;", "i", TypedValues.Custom.S_STRING, "", "tr", "", "tag", "folder", "Ljava/io/File;", "fileName", "e", "d", "maxLogSize", "", "v", "w", "printStackTrace", "image", "bitmap", "Landroid/graphics/Bitmap;", "compressFormat", "Landroid/graphics/Bitmap$CompressFormat;", C33757kf.f70665k, "data", "", "logThreadInfoWithMessage", "message", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Log {

    @NotNull
    public static final Log INSTANCE = new Log();

    /* JADX INFO: renamed from: a */
    public static LogLevel f13595a = LogLevel.OFF;

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m14461d(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m14467e(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m14472i(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
    }

    public static final boolean isFileLoggingActivated() {
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final void m14477v(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final void m14482w(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m14462d(@NotNull String string, @NotNull File folder, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(folder, "folder");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m14468e(@NotNull String string, @NotNull File folder, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(folder, "folder");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
    }

    @NotNull
    public static final LogLevel getLogLevel() {
        return f13595a;
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m14473i(@NotNull String string, @NotNull File folder, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(folder, "folder");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
    }

    public static /* synthetic */ void image$default(Log log, Bitmap bitmap, File file, String str, Bitmap.CompressFormat compressFormat, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        if ((i12 & 16) != 0) {
            i11 = 80;
        }
        log.image(bitmap, file, str, compressFormat2, i11);
    }

    public static /* synthetic */ void logThreadInfoWithMessage$default(Log log, String str, String str2, LogLevel logLevel, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "ThreadInfo";
        }
        if ((i11 & 4) != 0) {
            logLevel = LogLevel.VERBOSE;
        }
        log.logThreadInfoWithMessage(str, str2, logLevel);
    }

    public static final void setLogLevel(@NotNull LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "<set-?>");
        f13595a = logLevel;
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final void m14478v(@NotNull String string, @NotNull File folder, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(folder, "folder");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final void m14483w(@NotNull String string, @NotNull File folder, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(folder, "folder");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
    }

    public final void data(@NotNull byte[] data, @NotNull File folder, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(folder, "folder");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
    }

    public final void image(@NotNull Bitmap bitmap, @NotNull File folder, @NotNull String fileName, @NotNull Bitmap.CompressFormat compressFormat, int quality) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(folder, "folder");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(compressFormat, "compressFormat");
    }

    public final void logThreadInfoWithMessage(@NotNull String message, @NotNull String tag, @NotNull LogLevel level) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(level, "level");
    }

    public final void runIfLogLevelIs(@NotNull LogLevel level, @NotNull Function0<Unit> execute) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(execute, "execute");
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m14463d(@NotNull String tag, @NotNull String string) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m14469e(@NotNull String tag, @NotNull String string) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m14474i(@NotNull String tag, @NotNull String string) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final void m14479v(@NotNull String tag, @NotNull String string) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final void m14484w(@NotNull String tag, @NotNull String string) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m14464d(@NotNull String tag, @NotNull String string, int maxLogSize) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m14470e(@NotNull String tag, @NotNull String string, @Nullable Throwable tr2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m14475i(@NotNull String tag, @NotNull String string, @Nullable Throwable tr2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final void m14480v(@NotNull String tag, @NotNull String string, @Nullable Throwable tr2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final void m14485w(@NotNull String tag, @NotNull String string, @Nullable Throwable tr2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m14465d(@NotNull String tag, @NotNull String string, @Nullable Throwable tr2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m14471e(@NotNull String string, @Nullable Throwable tr2) {
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m14476i(@NotNull String string, @Nullable Throwable tr2) {
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final void m14481v(@NotNull String string, @Nullable Throwable tr2) {
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final void m14486w(@NotNull String string, @Nullable Throwable tr2) {
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m14466d(@NotNull String string, @Nullable Throwable tr2) {
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @JvmStatic
    public static /* synthetic */ void getLogLevel$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void isFileLoggingActivated$annotations() {
    }

    @JvmStatic
    public static final void allowFileLogging(boolean fileLoggingAllowed) {
    }

    @JvmStatic
    public static final void printStackTrace(@Nullable Throwable e11) {
    }
}
