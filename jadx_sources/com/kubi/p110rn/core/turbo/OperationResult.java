package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeSystemSettingsTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/OperationResult;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "success", "", "errorMessage", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getErrorMessage", "()Ljava/lang/String;", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/OperationResult;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSystemSettingsTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSystemSettingsTurboModule.kt\ncom/kubi/rn/core/turbo/OperationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n1#2:324\n*E\n"})
public final /* data */ class OperationResult implements WritableMapSerializable {

    @Nullable
    private final String errorMessage;

    @Nullable
    private final Boolean success;

    /* JADX WARN: Multi-variable type inference failed */
    public OperationResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OperationResult)) {
            return false;
        }
        OperationResult operationResult = (OperationResult) other;
        return Intrinsics.areEqual(this.success, operationResult.success) && Intrinsics.areEqual(this.errorMessage, operationResult.errorMessage);
    }

    public OperationResult(@Nullable Boolean bool, @Nullable String str) {
        this.success = bool;
        this.errorMessage = str;
    }

    public static /* synthetic */ OperationResult copy$default(OperationResult operationResult, Boolean bool, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = operationResult.success;
        }
        if ((i11 & 2) != 0) {
            str = operationResult.errorMessage;
        }
        return operationResult.copy(bool, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final OperationResult copy(@Nullable Boolean success, @Nullable String errorMessage) {
        return new OperationResult(success, errorMessage);
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        Boolean bool = this.success;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.errorMessage;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OperationResult(success=" + this.success + ", errorMessage=" + this.errorMessage + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Boolean bool = this.success;
        if (bool != null) {
            writableMapCreateMap.putBoolean("success", bool.booleanValue());
        }
        String str = this.errorMessage;
        if (str != null) {
            writableMapCreateMap.putString("errorMessage", str.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ OperationResult(Boolean bool, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : str);
    }
}
