package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeFileTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/PickedFile;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "path", "", "name", "mimeType", "fileExtension", "size", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getPath", "()Ljava/lang/String;", "getName", "getMimeType", "getFileExtension", "getSize", "()Ljava/lang/Double;", "Ljava/lang/Double;", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/kubi/rn/core/turbo/PickedFile;", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeFileTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeFileTurboModule.kt\ncom/kubi/rn/core/turbo/PickedFile\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
public final /* data */ class PickedFile implements WritableMapSerializable {

    @Nullable
    private final String fileExtension;

    @Nullable
    private final String mimeType;

    @Nullable
    private final String name;

    @Nullable
    private final String path;

    @Nullable
    private final Double size;

    public PickedFile() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickedFile)) {
            return false;
        }
        PickedFile pickedFile = (PickedFile) other;
        return Intrinsics.areEqual(this.path, pickedFile.path) && Intrinsics.areEqual(this.name, pickedFile.name) && Intrinsics.areEqual(this.mimeType, pickedFile.mimeType) && Intrinsics.areEqual(this.fileExtension, pickedFile.fileExtension) && Intrinsics.areEqual((Object) this.size, (Object) pickedFile.size);
    }

    public PickedFile(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Double d11) {
        this.path = str;
        this.name = str2;
        this.mimeType = str3;
        this.fileExtension = str4;
        this.size = d11;
    }

    public static /* synthetic */ PickedFile copy$default(PickedFile pickedFile, String str, String str2, String str3, String str4, Double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pickedFile.path;
        }
        if ((i11 & 2) != 0) {
            str2 = pickedFile.name;
        }
        if ((i11 & 4) != 0) {
            str3 = pickedFile.mimeType;
        }
        if ((i11 & 8) != 0) {
            str4 = pickedFile.fileExtension;
        }
        if ((i11 & 16) != 0) {
            d11 = pickedFile.size;
        }
        Double d12 = d11;
        String str5 = str3;
        return pickedFile.copy(str, str2, str5, str4, d12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileExtension() {
        return this.fileExtension;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getSize() {
        return this.size;
    }

    @NotNull
    public final PickedFile copy(@Nullable String path, @Nullable String name, @Nullable String mimeType, @Nullable String fileExtension, @Nullable Double size) {
        return new PickedFile(path, name, mimeType, fileExtension, size);
    }

    @Nullable
    public final String getFileExtension() {
        return this.fileExtension;
    }

    @Nullable
    public final String getMimeType() {
        return this.mimeType;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final Double getSize() {
        return this.size;
    }

    public int hashCode() {
        String str = this.path;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mimeType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fileExtension;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d11 = this.size;
        return iHashCode4 + (d11 != null ? d11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PickedFile(path=" + this.path + ", name=" + this.name + ", mimeType=" + this.mimeType + ", fileExtension=" + this.fileExtension + ", size=" + this.size + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.path;
        if (str != null) {
            writableMapCreateMap.putString("path", str.toString());
        }
        String str2 = this.name;
        if (str2 != null) {
            writableMapCreateMap.putString("name", str2.toString());
        }
        String str3 = this.mimeType;
        if (str3 != null) {
            writableMapCreateMap.putString("mimeType", str3.toString());
        }
        String str4 = this.fileExtension;
        if (str4 != null) {
            writableMapCreateMap.putString("fileExtension", str4.toString());
        }
        Double d11 = this.size;
        if (d11 != null) {
            writableMapCreateMap.putDouble("size", d11.doubleValue());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ PickedFile(String str, String str2, String str3, String str4, Double d11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : d11);
    }
}
