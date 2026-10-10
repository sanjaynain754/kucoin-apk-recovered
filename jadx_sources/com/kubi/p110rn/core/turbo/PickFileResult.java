package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeFileTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/PickFileResult;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "files", "", "Lcom/kubi/rn/core/turbo/PickedFile;", "errorCode", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getFiles", "()Ljava/util/List;", "getErrorCode", "()Ljava/lang/String;", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeFileTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeFileTurboModule.kt\ncom/kubi/rn/core/turbo/PickFileResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1863#2,2:130\n1#3:132\n*S KotlinDebug\n*F\n+ 1 NativeFileTurboModule.kt\ncom/kubi/rn/core/turbo/PickFileResult\n*L\n20#1:130,2\n*E\n"})
public final /* data */ class PickFileResult implements WritableMapSerializable {

    @Nullable
    private final String errorCode;

    @Nullable
    private final List<PickedFile> files;

    /* JADX WARN: Multi-variable type inference failed */
    public PickFileResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickFileResult)) {
            return false;
        }
        PickFileResult pickFileResult = (PickFileResult) other;
        return Intrinsics.areEqual(this.files, pickFileResult.files) && Intrinsics.areEqual(this.errorCode, pickFileResult.errorCode);
    }

    public PickFileResult(@Nullable List<PickedFile> list, @Nullable String str) {
        this.files = list;
        this.errorCode = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PickFileResult copy$default(PickFileResult pickFileResult, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = pickFileResult.files;
        }
        if ((i11 & 2) != 0) {
            str = pickFileResult.errorCode;
        }
        return pickFileResult.copy(list, str);
    }

    @Nullable
    public final List<PickedFile> component1() {
        return this.files;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final PickFileResult copy(@Nullable List<PickedFile> files, @Nullable String errorCode) {
        return new PickFileResult(files, errorCode);
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final List<PickedFile> getFiles() {
        return this.files;
    }

    public int hashCode() {
        List<PickedFile> list = this.files;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.errorCode;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PickFileResult(files=" + this.files + ", errorCode=" + this.errorCode + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        List<PickedFile> list = this.files;
        if (list != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushMap(((PickedFile) it.next()).toWritableMap());
            }
            writableMapCreateMap.putArray("files", writableArrayCreateArray);
        }
        String str = this.errorCode;
        if (str != null) {
            writableMapCreateMap.putString("errorCode", str.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ PickFileResult(List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : str);
    }
}
