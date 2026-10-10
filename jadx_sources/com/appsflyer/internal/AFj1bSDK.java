package com.appsflyer.internal;

import android.database.Cursor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1bSDK {
    @Nullable
    /* JADX INFO: renamed from: P_ */
    public static final String m5991P_(@NotNull Cursor cursor, @NotNull String str) {
        Intrinsics.checkNotNullParameter(cursor, "");
        Intrinsics.checkNotNullParameter(str, "");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getString(columnIndex);
        }
        return null;
    }
}
