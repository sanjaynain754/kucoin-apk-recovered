package com.kubi.sdk.lib.kunlun.sdk;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: KunLunConstant.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/lib/kunlun/sdk/LabelKey;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "COST_TYPE", "kunlun-sdk_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public enum LabelKey {
    COST_TYPE("cost_type");


    @NotNull
    private final String key;

    @NotNull
    public final String getKey() {
        return this.key;
    }

    LabelKey(String str) {
        this.key = str;
    }
}
