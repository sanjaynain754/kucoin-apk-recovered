package com.jumio.core.models.automation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import com.jumio.core.util.JsonUtilKt;
import jumio.core.AbstractC40511C;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002%&B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, m90084d2 = {"Lcom/jumio/core/models/automation/AutomationModel;", "Lcom/jumio/core/model/StaticModel;", "decisionType", "Lcom/jumio/core/models/automation/AutomationModel$DecisionType;", "rejectReason", "Lcom/jumio/core/models/automation/RejectReason;", "extractedData", "Lcom/jumio/core/models/automation/ExtractedData;", "additionalInformation", "", "nfcProperties", "Lcom/jumio/core/models/automation/NfcProperties;", "<init>", "(Lcom/jumio/core/models/automation/AutomationModel$DecisionType;Lcom/jumio/core/models/automation/RejectReason;Lcom/jumio/core/models/automation/ExtractedData;Ljava/lang/String;Lcom/jumio/core/models/automation/NfcProperties;)V", "getDecisionType", "()Lcom/jumio/core/models/automation/AutomationModel$DecisionType;", "getRejectReason", "()Lcom/jumio/core/models/automation/RejectReason;", "getExtractedData", "()Lcom/jumio/core/models/automation/ExtractedData;", "getAdditionalInformation", "()Ljava/lang/String;", "getNfcProperties", "()Lcom/jumio/core/models/automation/NfcProperties;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "DecisionType", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("AutomationModel")
public final /* data */ class AutomationModel implements StaticModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final DecisionType f14384a;

    /* JADX INFO: renamed from: b */
    public final RejectReason f14385b;

    /* JADX INFO: renamed from: c */
    public final ExtractedData f14386c;

    /* JADX INFO: renamed from: d */
    public final String f14387d;

    /* JADX INFO: renamed from: e */
    public final NfcProperties f14388e;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/automation/AutomationModel$Companion;", "", "<init>", "()V", "fromString", "Lcom/jumio/core/models/automation/AutomationModel;", TypedValues.Custom.S_STRING, "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAutomationModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutomationModel.kt\ncom/jumio/core/models/automation/AutomationModel$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
    public static final class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final AutomationModel fromString(@NotNull String string) {
            RejectReason rejectReason;
            ExtractedData extractedData;
            NfcProperties nfcProperties;
            Intrinsics.checkNotNullParameter(string, "string");
            try {
                JSONObject jSONObject = new JSONObject(string);
                DecisionType decisionType = (DecisionType) JsonUtilKt.optEnum(jSONObject, "decisionType", DecisionType.NOT_AVAILABLE);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("rejectReason");
                int i11 = 3;
                String str = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (jSONObjectOptJSONObject == null || (rejectReason = RejectReason.INSTANCE.fromJson(jSONObjectOptJSONObject)) == null) {
                    rejectReason = new RejectReason(str, objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("extractedData");
                if (jSONObjectOptJSONObject2 == null || (extractedData = ExtractedData.INSTANCE.fromJson(jSONObjectOptJSONObject2)) == null) {
                    extractedData = new ExtractedData(null, null, null, null, null, null, null, null, 255, null);
                }
                String strOptString = jSONObject.optString("additionalInformation", "");
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("nfcProperties");
                if (jSONObjectOptJSONObject3 == null || (nfcProperties = NfcProperties.INSTANCE.fromJson(jSONObjectOptJSONObject3)) == null) {
                    nfcProperties = new NfcProperties(false, null, 3, null);
                }
                NfcProperties nfcProperties2 = nfcProperties;
                Intrinsics.checkNotNull(strOptString);
                return new AutomationModel(decisionType, rejectReason, extractedData, strOptString, nfcProperties2);
            } catch (JSONException unused) {
                return new AutomationModel(null, null, null, null, null, 31, null);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.jumio.core.models.automation.AutomationModel$DecisionType[], still in use, count: 1, list:
      (r0v1 com.jumio.core.models.automation.AutomationModel$DecisionType[]) from 0x0024: INVOKE (r0v1 com.jumio.core.models.automation.AutomationModel$DecisionType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:39)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/jumio/core/models/automation/AutomationModel$DecisionType;", "", "<init>", "(Ljava/lang/String;I)V", "PASS", "REJECT", "NOT_AVAILABLE", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DecisionType {
        PASS,
        REJECT,
        NOT_AVAILABLE;


        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ EnumEntries f14390b;

        static {
            f14390b = EnumEntriesKt.enumEntries(decisionTypeArr);
        }

        @NotNull
        public static EnumEntries<DecisionType> getEntries() {
            return f14390b;
        }

        public static DecisionType valueOf(String str) {
            return (DecisionType) Enum.valueOf(DecisionType.class, str);
        }

        public static DecisionType[] values() {
            return (DecisionType[]) f14389a.clone();
        }

        public DecisionType() {
            super(str, i);
        }
    }

    public AutomationModel() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutomationModel)) {
            return false;
        }
        AutomationModel automationModel = (AutomationModel) other;
        return this.f14384a == automationModel.f14384a && Intrinsics.areEqual(this.f14385b, automationModel.f14385b) && Intrinsics.areEqual(this.f14386c, automationModel.f14386c) && Intrinsics.areEqual(this.f14387d, automationModel.f14387d) && Intrinsics.areEqual(this.f14388e, automationModel.f14388e);
    }

    public AutomationModel(@NotNull DecisionType decisionType, @NotNull RejectReason rejectReason, @NotNull ExtractedData extractedData, @NotNull String additionalInformation, @NotNull NfcProperties nfcProperties) {
        Intrinsics.checkNotNullParameter(decisionType, "decisionType");
        Intrinsics.checkNotNullParameter(rejectReason, "rejectReason");
        Intrinsics.checkNotNullParameter(extractedData, "extractedData");
        Intrinsics.checkNotNullParameter(additionalInformation, "additionalInformation");
        Intrinsics.checkNotNullParameter(nfcProperties, "nfcProperties");
        this.f14384a = decisionType;
        this.f14385b = rejectReason;
        this.f14386c = extractedData;
        this.f14387d = additionalInformation;
        this.f14388e = nfcProperties;
    }

    public static /* synthetic */ AutomationModel copy$default(AutomationModel automationModel, DecisionType decisionType, RejectReason rejectReason, ExtractedData extractedData, String str, NfcProperties nfcProperties, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            decisionType = automationModel.f14384a;
        }
        if ((i11 & 2) != 0) {
            rejectReason = automationModel.f14385b;
        }
        if ((i11 & 4) != 0) {
            extractedData = automationModel.f14386c;
        }
        if ((i11 & 8) != 0) {
            str = automationModel.f14387d;
        }
        if ((i11 & 16) != 0) {
            nfcProperties = automationModel.f14388e;
        }
        NfcProperties nfcProperties2 = nfcProperties;
        ExtractedData extractedData2 = extractedData;
        return automationModel.copy(decisionType, rejectReason, extractedData2, str, nfcProperties2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DecisionType getF14384a() {
        return this.f14384a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RejectReason getF14385b() {
        return this.f14385b;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ExtractedData getF14386c() {
        return this.f14386c;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getF14387d() {
        return this.f14387d;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final NfcProperties getF14388e() {
        return this.f14388e;
    }

    @NotNull
    public final AutomationModel copy(@NotNull DecisionType decisionType, @NotNull RejectReason rejectReason, @NotNull ExtractedData extractedData, @NotNull String additionalInformation, @NotNull NfcProperties nfcProperties) {
        Intrinsics.checkNotNullParameter(decisionType, "decisionType");
        Intrinsics.checkNotNullParameter(rejectReason, "rejectReason");
        Intrinsics.checkNotNullParameter(extractedData, "extractedData");
        Intrinsics.checkNotNullParameter(additionalInformation, "additionalInformation");
        Intrinsics.checkNotNullParameter(nfcProperties, "nfcProperties");
        return new AutomationModel(decisionType, rejectReason, extractedData, additionalInformation, nfcProperties);
    }

    @NotNull
    public final String getAdditionalInformation() {
        return this.f14387d;
    }

    @NotNull
    public final DecisionType getDecisionType() {
        return this.f14384a;
    }

    @NotNull
    public final ExtractedData getExtractedData() {
        return this.f14386c;
    }

    @NotNull
    public final NfcProperties getNfcProperties() {
        return this.f14388e;
    }

    @NotNull
    public final RejectReason getRejectReason() {
        return this.f14385b;
    }

    public int hashCode() {
        return this.f14388e.hashCode() + AbstractC40511C.m89148a(this.f14387d, (this.f14386c.hashCode() + ((this.f14385b.hashCode() + (this.f14384a.hashCode() * 31)) * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "AutomationModel(decisionType=" + this.f14384a + ", rejectReason=" + this.f14385b + ", extractedData=" + this.f14386c + ", additionalInformation=" + this.f14387d + ", nfcProperties=" + this.f14388e + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AutomationModel(DecisionType decisionType, RejectReason rejectReason, ExtractedData extractedData, String str, NfcProperties nfcProperties, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        RejectReason rejectReason2;
        DecisionType decisionType2 = (i11 & 1) != 0 ? DecisionType.NOT_AVAILABLE : decisionType;
        int i12 = 3;
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if ((i11 & 2) != 0) {
            rejectReason2 = new RejectReason(str2, objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
        } else {
            rejectReason2 = rejectReason;
        }
        this(decisionType2, rejectReason2, (i11 & 4) != 0 ? new ExtractedData(null, null, null, null, null, null, null, null, 255, null) : extractedData, (i11 & 8) != 0 ? "" : str, (i11 & 16) != 0 ? new NfcProperties(false, null, 3, null) : nfcProperties);
    }
}
