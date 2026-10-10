package com.jumio.core.data.scan;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0002X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m90084d2 = {"Lcom/jumio/core/data/scan/ByteArrayData;", "Lcom/jumio/core/data/scan/DataInterface;", "", "Ljava/io/Serializable;", "<init>", "()V", "hasData", "", "getHasData", "()Z", "mimeType", "", "getMimeType", "()Ljava/lang/String;", "setMimeType", "(Ljava/lang/String;)V", "data", "getData", "()[B", "setData", "([B)V", "timestamp", "", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "clear", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ByteArrayData implements DataInterface<byte[]>, Serializable {

    /* JADX INFO: renamed from: a */
    public String f13819a = "";

    /* JADX INFO: renamed from: b */
    public byte[] f13820b = new byte[0];

    /* JADX INFO: renamed from: c */
    public Long f13821c;

    @Override // com.jumio.core.data.scan.DataInterface
    public void clear() {
        setData(new byte[0]);
        setMimeType("");
        setTimestamp(null);
    }

    @Override // com.jumio.core.data.scan.DataInterface
    @NotNull
    /* JADX INFO: renamed from: getData, reason: avoid collision after fix types in other method and from getter */
    public byte[] getF13820b() {
        return this.f13820b;
    }

    @Override // com.jumio.core.data.scan.DataInterface
    @NotNull
    /* JADX INFO: renamed from: getMimeType, reason: from getter */
    public String getF13819a() {
        return this.f13819a;
    }

    @Override // com.jumio.core.data.scan.DataInterface
    @Nullable
    /* JADX INFO: renamed from: getTimestamp, reason: from getter */
    public Long getF13821c() {
        return this.f13821c;
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public void setData(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.f13820b = bArr;
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public void setMimeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f13819a = str;
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public void setTimestamp(@Nullable Long l11) {
        this.f13821c = l11;
    }

    @Override // com.jumio.core.data.scan.DataInterface
    public boolean getHasData() {
        boolean z11;
        if (getF13820b().length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        return !z11;
    }
}
