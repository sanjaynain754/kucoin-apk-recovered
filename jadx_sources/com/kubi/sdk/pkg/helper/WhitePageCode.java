package com.kubi.sdk.pkg.helper;

import p852kotlin.Metadata;

/* JADX INFO: compiled from: WhitePageCode.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/sdk/pkg/helper/WhitePageCode;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "WHITEPAGE_CODE", "NOT_WHITEPAGE_CODE", "INTERNET_NOT_WORK", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public enum WhitePageCode {
    WHITEPAGE_CODE(1),
    NOT_WHITEPAGE_CODE(0),
    INTERNET_NOT_WORK(2);

    private final int code;

    public final int getCode() {
        return this.code;
    }

    WhitePageCode(int i11) {
        this.code = i11;
    }
}
