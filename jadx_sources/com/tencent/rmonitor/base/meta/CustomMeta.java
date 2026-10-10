package com.tencent.rmonitor.base.meta;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, m90084d2 = {"Lcom/tencent/rmonitor/base/meta/CustomMeta;", "", "firstCustomField", "", "secondCustomField", "(Ljava/lang/String;Ljava/lang/String;)V", "getFirstCustomField", "()Ljava/lang/String;", "getSecondCustomField", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class CustomMeta {

    @NotNull
    private final String firstCustomField;

    @NotNull
    private final String secondCustomField;

    public CustomMeta(@NotNull String firstCustomField, @NotNull String secondCustomField) {
        Intrinsics.checkNotNullParameter(firstCustomField, "firstCustomField");
        Intrinsics.checkNotNullParameter(secondCustomField, "secondCustomField");
        this.firstCustomField = firstCustomField;
        this.secondCustomField = secondCustomField;
    }

    @NotNull
    public final String getFirstCustomField() {
        return this.firstCustomField;
    }

    @NotNull
    public final String getSecondCustomField() {
        return this.secondCustomField;
    }
}
