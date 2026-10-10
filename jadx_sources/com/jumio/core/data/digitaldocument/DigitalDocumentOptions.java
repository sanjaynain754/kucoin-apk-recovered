package com.jumio.core.data.digitaldocument;

import com.jumio.core.util.JsonUtilKt;
import com.kubi.kyc.KycKey;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, m90084d2 = {"Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;", "Ljava/io/Serializable;", KycKey.idType, "", "captureType", "fileType", "maxPages", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getIdType", "()Ljava/lang/String;", "getCaptureType", "getFileType", "getMaxPages", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;", "equals", "", "other", "", "hashCode", "toString", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DigitalDocumentOptions implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final String f13767a;

    /* JADX INFO: renamed from: b */
    public final String f13768b;

    /* JADX INFO: renamed from: c */
    public final String f13769c;

    /* JADX INFO: renamed from: d */
    public final Integer f13770d;

    /* JADX INFO: renamed from: e */
    public final String f13771e;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;", "options", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final DigitalDocumentOptions fromJson(@NotNull JSONObject options) {
            Intrinsics.checkNotNullParameter(options, "options");
            return new DigitalDocumentOptions(JsonUtilKt.stringOrNull(options, KycKey.idType), JsonUtilKt.stringOrNull(options, "captureType"), JsonUtilKt.stringOrNull(options, "fileType"), Integer.valueOf(options.optInt("maxPages", 0)), JsonUtilKt.stringOrNull(options, "url"));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DigitalDocumentOptions() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DigitalDocumentOptions)) {
            return false;
        }
        DigitalDocumentOptions digitalDocumentOptions = (DigitalDocumentOptions) other;
        return Intrinsics.areEqual(this.f13767a, digitalDocumentOptions.f13767a) && Intrinsics.areEqual(this.f13768b, digitalDocumentOptions.f13768b) && Intrinsics.areEqual(this.f13769c, digitalDocumentOptions.f13769c) && Intrinsics.areEqual(this.f13770d, digitalDocumentOptions.f13770d) && Intrinsics.areEqual(this.f13771e, digitalDocumentOptions.f13771e);
    }

    public DigitalDocumentOptions(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4) {
        this.f13767a = str;
        this.f13768b = str2;
        this.f13769c = str3;
        this.f13770d = num;
        this.f13771e = str4;
    }

    public static /* synthetic */ DigitalDocumentOptions copy$default(DigitalDocumentOptions digitalDocumentOptions, String str, String str2, String str3, Integer num, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = digitalDocumentOptions.f13767a;
        }
        if ((i11 & 2) != 0) {
            str2 = digitalDocumentOptions.f13768b;
        }
        if ((i11 & 4) != 0) {
            str3 = digitalDocumentOptions.f13769c;
        }
        if ((i11 & 8) != 0) {
            num = digitalDocumentOptions.f13770d;
        }
        if ((i11 & 16) != 0) {
            str4 = digitalDocumentOptions.f13771e;
        }
        String str5 = str4;
        String str6 = str3;
        return digitalDocumentOptions.copy(str, str2, str6, num, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF13767a() {
        return this.f13767a;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getF13768b() {
        return this.f13768b;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getF13769c() {
        return this.f13769c;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getF13770d() {
        return this.f13770d;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getF13771e() {
        return this.f13771e;
    }

    @NotNull
    public final DigitalDocumentOptions copy(@Nullable String idType, @Nullable String captureType, @Nullable String fileType, @Nullable Integer maxPages, @Nullable String url) {
        return new DigitalDocumentOptions(idType, captureType, fileType, maxPages, url);
    }

    @Nullable
    public final String getCaptureType() {
        return this.f13768b;
    }

    @Nullable
    public final String getFileType() {
        return this.f13769c;
    }

    @Nullable
    public final String getIdType() {
        return this.f13767a;
    }

    @Nullable
    public final Integer getMaxPages() {
        return this.f13770d;
    }

    @Nullable
    public final String getUrl() {
        return this.f13771e;
    }

    public int hashCode() {
        String str = this.f13767a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f13768b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13769c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f13770d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f13771e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DigitalDocumentOptions(idType=" + this.f13767a + ", captureType=" + this.f13768b + ", fileType=" + this.f13769c + ", maxPages=" + this.f13770d + ", url=" + this.f13771e + ')';
    }

    public /* synthetic */ DigitalDocumentOptions(String str, String str2, String str3, Integer num, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : str4);
    }
}
