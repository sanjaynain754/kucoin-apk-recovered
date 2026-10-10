package com.kubi.utils;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GsonUtils.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/utils/ShortAdapter;", "Lcom/kubi/utils/NumberAdapter;", "", "<init>", "()V", "", "value", "b", "(Ljava/lang/String;)Ljava/lang/Short;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
final class ShortAdapter extends NumberAdapter<Short> {
    @Override // com.kubi.utils.NumberAdapter
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Short mo66363a(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return Short.valueOf(new BigDecimal(value).shortValue());
    }
}
