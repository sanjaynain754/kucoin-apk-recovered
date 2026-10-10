package com.kubi.fingerprint.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FingerRequest.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/fingerprint/entity/FingerRequest;", "", "meta", "Lcom/kubi/fingerprint/entity/Meta;", "logs", "", "Lcom/kubi/fingerprint/entity/Item;", "(Lcom/kubi/fingerprint/entity/Meta;Ljava/util/List;)V", "getLogs", "()Ljava/util/List;", "getMeta", "()Lcom/kubi/fingerprint/entity/Meta;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Fingerprint_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class FingerRequest {

    @NotNull
    private final List<Item> logs;

    @NotNull
    private final Meta meta;

    public FingerRequest(@NotNull Meta meta, @NotNull List<Item> logs) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        Intrinsics.checkNotNullParameter(logs, "logs");
        this.meta = meta;
        this.logs = logs;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FingerRequest)) {
            return false;
        }
        FingerRequest fingerRequest = (FingerRequest) other;
        return Intrinsics.areEqual(this.meta, fingerRequest.meta) && Intrinsics.areEqual(this.logs, fingerRequest.logs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FingerRequest copy$default(FingerRequest fingerRequest, Meta meta, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            meta = fingerRequest.meta;
        }
        if ((i11 & 2) != 0) {
            list = fingerRequest.logs;
        }
        return fingerRequest.copy(meta, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    @NotNull
    public final List<Item> component2() {
        return this.logs;
    }

    @NotNull
    public final FingerRequest copy(@NotNull Meta meta, @NotNull List<Item> logs) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        Intrinsics.checkNotNullParameter(logs, "logs");
        return new FingerRequest(meta, logs);
    }

    @NotNull
    public final List<Item> getLogs() {
        return this.logs;
    }

    @NotNull
    public final Meta getMeta() {
        return this.meta;
    }

    public int hashCode() {
        return (this.meta.hashCode() * 31) + this.logs.hashCode();
    }

    @NotNull
    public String toString() {
        return "FingerRequest(meta=" + this.meta + ", logs=" + this.logs + ')';
    }

    public /* synthetic */ FingerRequest(Meta meta, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new Meta(null, null, null, 0, 15, null) : meta, list);
    }
}
