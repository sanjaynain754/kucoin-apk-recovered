package com.kubi.payment.precheck;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PreCheckResult.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/precheck/PreCheckResult;", "", "<init>", "()V", "Success", "Fail", "Lcom/kubi/payment/precheck/PreCheckResult$Fail;", "Lcom/kubi/payment/precheck/PreCheckResult$Success;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class PreCheckResult {

    /* JADX INFO: compiled from: PreCheckResult.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/precheck/PreCheckResult$Fail;", "Lcom/kubi/payment/precheck/PreCheckResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Fail extends PreCheckResult {

        @NotNull
        public static final Fail INSTANCE = new Fail();

        private Fail() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Fail);
        }

        @NotNull
        public String toString() {
            return "Fail";
        }

        public int hashCode() {
            return 1133375769;
        }
    }

    /* JADX INFO: compiled from: PreCheckResult.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/precheck/PreCheckResult$Success;", "Lcom/kubi/payment/precheck/PreCheckResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Success extends PreCheckResult {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Success);
        }

        @NotNull
        public String toString() {
            return "Success";
        }

        public int hashCode() {
            return 879140904;
        }
    }

    public /* synthetic */ PreCheckResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PreCheckResult() {
    }
}
