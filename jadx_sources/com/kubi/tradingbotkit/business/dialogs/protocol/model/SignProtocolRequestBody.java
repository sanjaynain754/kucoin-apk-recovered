package com.kubi.tradingbotkit.business.dialogs.protocol.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/dialogs/protocol/model/SignProtocolRequestBody;", "", "templateId", "", "<init>", "(Ljava/lang/Long;)V", "getTemplateId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lcom/kubi/tradingbotkit/business/dialogs/protocol/model/SignProtocolRequestBody;", "equals", "", "other", "hashCode", "", "toString", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SignProtocolRequestBody {

    @Nullable
    private final Long templateId;

    /* JADX WARN: Multi-variable type inference failed */
    public SignProtocolRequestBody() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SignProtocolRequestBody) && Intrinsics.areEqual(this.templateId, ((SignProtocolRequestBody) other).templateId);
    }

    public SignProtocolRequestBody(@Nullable Long l11) {
        this.templateId = l11;
    }

    public static /* synthetic */ SignProtocolRequestBody copy$default(SignProtocolRequestBody signProtocolRequestBody, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = signProtocolRequestBody.templateId;
        }
        return signProtocolRequestBody.copy(l11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTemplateId() {
        return this.templateId;
    }

    @NotNull
    public final SignProtocolRequestBody copy(@Nullable Long templateId) {
        return new SignProtocolRequestBody(templateId);
    }

    @Nullable
    public final Long getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        Long l11 = this.templateId;
        if (l11 == null) {
            return 0;
        }
        return l11.hashCode();
    }

    @NotNull
    public String toString() {
        return "SignProtocolRequestBody(templateId=" + this.templateId + ')';
    }

    public /* synthetic */ SignProtocolRequestBody(Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11);
    }
}
