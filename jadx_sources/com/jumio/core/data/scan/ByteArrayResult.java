package com.jumio.core.data.scan;

import com.jumio.core.models.automation.AutomationModel;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u001a\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018¨\u0006#"}, m90084d2 = {"Lcom/jumio/core/data/scan/ByteArrayResult;", "Lcom/jumio/core/data/scan/ScanResult;", "Lcom/jumio/core/data/scan/ByteArrayData;", "Ljava/io/Serializable;", "data", "<init>", "(Lcom/jumio/core/data/scan/ByteArrayData;)V", "getData", "()Lcom/jumio/core/data/scan/ByteArrayData;", "automationModel", "Lcom/jumio/core/models/automation/AutomationModel;", "getAutomationModel", "()Lcom/jumio/core/models/automation/AutomationModel;", "setAutomationModel", "(Lcom/jumio/core/models/automation/AutomationModel;)V", "state", "Lcom/jumio/core/data/scan/DataState;", "getState", "()Lcom/jumio/core/data/scan/DataState;", "setState", "(Lcom/jumio/core/data/scan/DataState;)V", "hasData", "", "getHasData", "()Z", "isComplete", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ByteArrayResult implements ScanResult<ByteArrayData>, Serializable {

    /* JADX INFO: renamed from: a */
    public final ByteArrayData f13822a;

    /* JADX INFO: renamed from: b */
    public AutomationModel f13823b;

    /* JADX INFO: renamed from: c */
    public DataState f13824c;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ByteArrayResult) && Intrinsics.areEqual(this.f13822a, ((ByteArrayResult) other).f13822a);
    }

    @Override // com.jumio.core.data.scan.ScanResult
    @NotNull
    public ByteArrayData getData() {
        return this.f13822a;
    }

    public ByteArrayResult(@NotNull ByteArrayData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f13822a = data;
        this.f13824c = DataState.TODO;
    }

    public static /* synthetic */ ByteArrayResult copy$default(ByteArrayResult byteArrayResult, ByteArrayData byteArrayData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            byteArrayData = byteArrayResult.f13822a;
        }
        return byteArrayResult.copy(byteArrayData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ByteArrayData getF13822a() {
        return this.f13822a;
    }

    @NotNull
    public final ByteArrayResult copy(@NotNull ByteArrayData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new ByteArrayResult(data);
    }

    @Override // com.jumio.core.data.scan.ScanResult
    @Nullable
    /* JADX INFO: renamed from: getAutomationModel, reason: from getter */
    public AutomationModel getF13823b() {
        return this.f13823b;
    }

    @Override // com.jumio.core.data.scan.ScanResult
    @NotNull
    /* JADX INFO: renamed from: getState, reason: from getter */
    public DataState getF13824c() {
        return this.f13824c;
    }

    public int hashCode() {
        return this.f13822a.hashCode();
    }

    @Override // com.jumio.core.data.scan.ScanResult
    public void setAutomationModel(@Nullable AutomationModel automationModel) {
        this.f13823b = automationModel;
    }

    @Override // com.jumio.core.data.scan.ScanResult
    public void setState(@NotNull DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "<set-?>");
        this.f13824c = dataState;
    }

    @NotNull
    public String toString() {
        return "ByteArrayResult(data=" + this.f13822a + ')';
    }

    @Override // com.jumio.core.data.scan.ScanResult
    public boolean getHasData() {
        if (getF13824c() != DataState.SKIPPED && !getData().getHasData() && !getF13824c().isAtLeast(DataState.SAVING)) {
            return false;
        }
        return true;
    }

    @Override // com.jumio.core.data.scan.ScanResult
    public boolean isComplete() {
        if (getF13824c() != DataState.SKIPPED) {
            if (!getData().getHasData() || !getF13824c().isAtLeast(DataState.UPLOADED)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
