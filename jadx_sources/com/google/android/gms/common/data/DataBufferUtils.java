package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.tencent.bugly.proguard.C33724j3;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class DataBufferUtils {

    @NonNull
    @KeepForSdk
    public static final String KEY_NEXT_PAGE_TOKEN = "next_page_token";

    @NonNull
    @KeepForSdk
    public static final String KEY_PREV_PAGE_TOKEN = "prev_page_token";

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeAndClose(@NonNull DataBuffer<E> dataBuffer) {
        C33724j3.c cVar = (ArrayList<T>) new ArrayList(dataBuffer.getCount());
        try {
            Iterator<E> it = dataBuffer.iterator();
            while (it.hasNext()) {
                cVar.add(it.next().freeze());
            }
            dataBuffer.close();
            return cVar;
        } catch (Throwable th2) {
            dataBuffer.close();
            throw th2;
        }
    }

    public static boolean hasData(@NonNull DataBuffer<?> dataBuffer) {
        return dataBuffer != null && dataBuffer.getCount() > 0;
    }

    private DataBufferUtils() {
    }

    public static boolean hasNextPage(@NonNull DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        if (metadata != null && metadata.getString(KEY_NEXT_PAGE_TOKEN) != null) {
            return true;
        }
        return false;
    }

    public static boolean hasPrevPage(@NonNull DataBuffer<?> dataBuffer) {
        Bundle metadata = dataBuffer.getMetadata();
        if (metadata != null && metadata.getString(KEY_PREV_PAGE_TOKEN) != null) {
            return true;
        }
        return false;
    }
}
