package com.sumsub.log.logger;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J$\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J$\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\r"}, m90084d2 = {"Lcom/sumsub/log/logger/Logger;", "", "e", "", "tag", "", "message", "throwable", "", "w", "d", "i", "v", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface Logger {

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void d$default(Logger logger, String str, String str2, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
            }
            if ((i11 & 4) != 0) {
                th2 = null;
            }
            logger.mo68955d(str, str2, th2);
        }

        public static /* synthetic */ void e$default(Logger logger, String str, String str2, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
            }
            if ((i11 & 4) != 0) {
                th2 = null;
            }
            logger.mo68956e(str, str2, th2);
        }

        public static /* synthetic */ void i$default(Logger logger, String str, String str2, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
            }
            if ((i11 & 4) != 0) {
                th2 = null;
            }
            logger.mo68957i(str, str2, th2);
        }

        public static /* synthetic */ void v$default(Logger logger, String str, String str2, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: v");
            }
            if ((i11 & 4) != 0) {
                th2 = null;
            }
            logger.mo68958v(str, str2, th2);
        }

        public static /* synthetic */ void w$default(Logger logger, String str, String str2, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
            }
            if ((i11 & 4) != 0) {
                th2 = null;
            }
            logger.mo68959w(str, str2, th2);
        }
    }

    /* JADX INFO: renamed from: d */
    void mo68955d(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable);

    /* JADX INFO: renamed from: e */
    void mo68956e(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable);

    /* JADX INFO: renamed from: i */
    void mo68957i(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable);

    /* JADX INFO: renamed from: v */
    void mo68958v(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable);

    /* JADX INFO: renamed from: w */
    void mo68959w(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable);
}
