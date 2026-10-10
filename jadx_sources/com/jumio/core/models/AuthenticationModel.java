package com.jumio.core.models;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import com.jumio.core.util.JsonUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m90084d2 = {"Lcom/jumio/core/models/AuthenticationModel;", "Lcom/jumio/core/model/StaticModel;", "decisionType", "Lcom/jumio/core/models/AuthenticationModel$DecisionType;", "<init>", "(Lcom/jumio/core/models/AuthenticationModel$DecisionType;)V", "getDecisionType", "()Lcom/jumio/core/models/AuthenticationModel$DecisionType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "DecisionType", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("AuthenticationModel")
public final /* data */ class AuthenticationModel implements StaticModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final DecisionType f14180a;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/AuthenticationModel$Companion;", "", "<init>", "()V", "fromString", "Lcom/jumio/core/models/AuthenticationModel;", TypedValues.Custom.S_STRING, "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final AuthenticationModel fromString(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            try {
                return new AuthenticationModel((DecisionType) JsonUtilKt.optEnum(new JSONObject(string), "decisionType", DecisionType.NOT_AVAILABLE));
            } catch (JSONException unused) {
                return new AuthenticationModel(null, 1, 0 == true ? 1 : 0);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.jumio.core.models.AuthenticationModel$DecisionType[], still in use, count: 1, list:
      (r0v1 com.jumio.core.models.AuthenticationModel$DecisionType[]) from 0x0024: INVOKE (r0v1 com.jumio.core.models.AuthenticationModel$DecisionType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:39)
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
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/jumio/core/models/AuthenticationModel$DecisionType;", "", "<init>", "(Ljava/lang/String;I)V", "PASS", "REJECT", "NOT_AVAILABLE", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DecisionType {
        PASS,
        REJECT,
        NOT_AVAILABLE;


        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ EnumEntries f14182b;

        static {
            f14182b = EnumEntriesKt.enumEntries(decisionTypeArr);
        }

        @NotNull
        public static EnumEntries<DecisionType> getEntries() {
            return f14182b;
        }

        public static DecisionType valueOf(String str) {
            return (DecisionType) Enum.valueOf(DecisionType.class, str);
        }

        public static DecisionType[] values() {
            return (DecisionType[]) f14181a.clone();
        }

        public DecisionType() {
            super(str, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthenticationModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AuthenticationModel) && this.f14180a == ((AuthenticationModel) other).f14180a;
    }

    public AuthenticationModel(@NotNull DecisionType decisionType) {
        Intrinsics.checkNotNullParameter(decisionType, "decisionType");
        this.f14180a = decisionType;
    }

    public static /* synthetic */ AuthenticationModel copy$default(AuthenticationModel authenticationModel, DecisionType decisionType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            decisionType = authenticationModel.f14180a;
        }
        return authenticationModel.copy(decisionType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DecisionType getF14180a() {
        return this.f14180a;
    }

    @NotNull
    public final AuthenticationModel copy(@NotNull DecisionType decisionType) {
        Intrinsics.checkNotNullParameter(decisionType, "decisionType");
        return new AuthenticationModel(decisionType);
    }

    @NotNull
    public final DecisionType getDecisionType() {
        return this.f14180a;
    }

    public int hashCode() {
        return this.f14180a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AuthenticationModel(decisionType=" + this.f14180a + ')';
    }

    public /* synthetic */ AuthenticationModel(DecisionType decisionType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? DecisionType.NOT_AVAILABLE : decisionType);
    }
}
