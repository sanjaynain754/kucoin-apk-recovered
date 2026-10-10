package com.jumio.core.util;

import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"closeQuietly", "", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/io/Closeable;", "(Ljava/io/Closeable;)V", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CloseableExtKt {
    public static final <T extends Closeable> void closeQuietly(@NotNull T t11) {
        Intrinsics.checkNotNullParameter(t11, "<this>");
        try {
            t11.close();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }
}
