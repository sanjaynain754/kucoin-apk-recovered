package com.kubi.sdk.pkg.task;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.task.a, reason: from toString */
/* JADX INFO: compiled from: HttpHelper.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/a;", "", "", "notModified", "", TtmlNode.TAG_BODY, "etag", "lastModified", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "d", "()Z", "b", "Ljava/lang/String;", "c", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class ConditionalJsonResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean notModified;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String body;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final String etag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String lastModified;

    public ConditionalJsonResponse(boolean z11, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.notModified = z11;
        this.body = str;
        this.etag = str2;
        this.lastModified = str3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConditionalJsonResponse)) {
            return false;
        }
        ConditionalJsonResponse conditionalJsonResponse = (ConditionalJsonResponse) other;
        return this.notModified == conditionalJsonResponse.notModified && Intrinsics.areEqual(this.body, conditionalJsonResponse.body) && Intrinsics.areEqual(this.etag, conditionalJsonResponse.etag) && Intrinsics.areEqual(this.lastModified, conditionalJsonResponse.lastModified);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEtag() {
        return this.etag;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLastModified() {
        return this.lastModified;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getNotModified() {
        return this.notModified;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z11 = this.notModified;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = r11 * 31;
        String str = this.body;
        int iHashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.etag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastModified;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ConditionalJsonResponse(notModified=" + this.notModified + ", body=" + this.body + ", etag=" + this.etag + ", lastModified=" + this.lastModified + ')';
    }

    public /* synthetic */ ConditionalJsonResponse(boolean z11, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
    }
}
