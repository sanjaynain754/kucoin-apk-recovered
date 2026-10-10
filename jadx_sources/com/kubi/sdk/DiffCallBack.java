package com.kubi.sdk;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.sdk.i2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BaseAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ7\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/sdk/DiffCallBack;", ExifInterface.GPS_DIRECTION_TRUE, "", "areItemsTheSame", "", "oldPos", "", "oldItem", "newPos", "newItem", "(ILjava/lang/Object;ILjava/lang/Object;)Z", "areContentsTheSame", "getChangePayload", "", "(ILjava/lang/Object;ILjava/lang/Object;)Ljava/util/List;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface DiffCallBack<T> {
    /* JADX INFO: renamed from: a */
    boolean mo29353a(int i11, T t11, int i12, T t12);

    @Nullable
    /* JADX INFO: renamed from: b */
    default List<Object> mo30773b(int i11, T t11, int i12, T t12) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    boolean mo29354c(int i11, T t11, int i12, T t12);
}
