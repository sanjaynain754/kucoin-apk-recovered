package com.kubi.payment.channel.precheck;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.kubi.payment.channel.precheck.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PreCheckResult.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/channel/precheck/PreCheckResult;", "", "<init>", "()V", "Success", "VersionCheckFail", "KycCheckFail", "SecurityCheckFail", "Lcom/kubi/payment/channel/precheck/PreCheckResult$KycCheckFail;", "Lcom/kubi/payment/channel/precheck/PreCheckResult$SecurityCheckFail;", "Lcom/kubi/payment/channel/precheck/PreCheckResult$Success;", "Lcom/kubi/payment/channel/precheck/PreCheckResult$VersionCheckFail;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class PreCheckResult {

    /* JADX INFO: renamed from: com.kubi.payment.channel.precheck.b$a */
    /* JADX INFO: compiled from: PreCheckResult.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/channel/precheck/PreCheckResult$KycCheckFail;", "Lcom/kubi/payment/channel/precheck/PreCheckResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class a extends PreCheckResult {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f38376a = new a();

        public a() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof a);
        }

        @NotNull
        public String toString() {
            return "KycCheckFail";
        }

        public int hashCode() {
            return 1092909079;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.channel.precheck.b$b */
    /* JADX INFO: compiled from: PreCheckResult.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/channel/precheck/PreCheckResult$SecurityCheckFail;", "Lcom/kubi/payment/channel/precheck/PreCheckResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class b extends PreCheckResult {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f38377a = new b();

        public b() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        @NotNull
        public String toString() {
            return "SecurityCheckFail";
        }

        public int hashCode() {
            return -1310367840;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.channel.precheck.b$c */
    /* JADX INFO: compiled from: PreCheckResult.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/channel/precheck/PreCheckResult$Success;", "Lcom/kubi/payment/channel/precheck/PreCheckResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class c extends PreCheckResult {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final c f38378a = new c();

        public c() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof c);
        }

        @NotNull
        public String toString() {
            return "Success";
        }

        public int hashCode() {
            return -1180916931;
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.channel.precheck.b$d */
    /* JADX INFO: compiled from: PreCheckResult.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/channel/precheck/PreCheckResult$VersionCheckFail;", "Lcom/kubi/payment/channel/precheck/PreCheckResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class d extends PreCheckResult {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final d f38379a = new d();

        public d() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof d);
        }

        @NotNull
        public String toString() {
            return "VersionCheckFail";
        }

        public int hashCode() {
            return 243990612;
        }
    }

    public /* synthetic */ PreCheckResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public PreCheckResult() {
    }
}
