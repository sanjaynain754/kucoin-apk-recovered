package com.facebook.react.internal;

import com.facebook.systrace.Systrace;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SystraceSection.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"Lcom/facebook/react/internal/SystraceSection;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "sectionName", "", "<init>", "(Ljava/lang/String;)V", "close", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SystraceSection implements AutoCloseable {
    @Override // java.lang.AutoCloseable
    public void close() {
        Systrace.m10667i(0L);
    }

    public SystraceSection(@NotNull String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Systrace.m10662c(0L, sectionName);
    }
}
