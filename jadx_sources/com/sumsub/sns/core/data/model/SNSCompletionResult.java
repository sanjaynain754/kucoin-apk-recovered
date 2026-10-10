package com.sumsub.sns.core.data.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "", "<init>", "()V", "SuccessTermination", "AbnormalTermination", "Lcom/sumsub/sns/core/data/model/SNSCompletionResult$AbnormalTermination;", "Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class SNSCompletionResult {

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSCompletionResult$AbnormalTermination;", "Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class AbnormalTermination extends SNSCompletionResult {

        @Nullable
        private final Throwable exception;

        /* JADX WARN: Multi-variable type inference failed */
        public AbnormalTermination() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AbnormalTermination) && Intrinsics.areEqual(this.exception, ((AbnormalTermination) other).exception);
        }

        public AbnormalTermination(@Nullable Throwable th2) {
            super(null);
            this.exception = th2;
        }

        @Nullable
        public final Throwable getException() {
            return this.exception;
        }

        public int hashCode() {
            Throwable th2 = this.exception;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @NotNull
        public String toString() {
            return "AbnormalTermination(exception=" + this.exception + ")";
        }

        public /* synthetic */ AbnormalTermination(Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;", "Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class SuccessTermination extends SNSCompletionResult {

        @NotNull
        public static final SuccessTermination INSTANCE = new SuccessTermination();

        private SuccessTermination() {
            super(null);
        }
    }

    public /* synthetic */ SNSCompletionResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SNSCompletionResult() {
    }
}
