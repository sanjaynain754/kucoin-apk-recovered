package com.jumio.core.util;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"concurrentMutableListOf", "Lcom/jumio/core/util/ConcurrentMutableList;", ExifInterface.GPS_DIRECTION_TRUE, "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ConcurrentMutableListKt {
    @NotNull
    public static final <T> ConcurrentMutableList<T> concurrentMutableListOf() {
        return new ConcurrentMutableList<>();
    }
}
