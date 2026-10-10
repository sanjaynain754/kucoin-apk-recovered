package com.jumio.core.data.scan;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0004"}, m90084d2 = {"copyFrom", "", "Lcom/jumio/core/data/scan/ByteArrayData;", "other", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ByteArrayDataKt {
    public static final void copyFrom(@NotNull ByteArrayData byteArrayData, @NotNull ByteArrayData other) {
        Intrinsics.checkNotNullParameter(byteArrayData, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (Intrinsics.areEqual(byteArrayData, other)) {
            return;
        }
        byteArrayData.setData(other.getF13820b());
        byteArrayData.setMimeType(other.getF13819a());
        byteArrayData.setTimestamp(other.getF13821c());
    }
}
