package io.opencensus.trace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import tf0.C44941b;

/* JADX INFO: loaded from: classes60.dex */
public final class Status {

    /* JADX INFO: renamed from: c */
    public static final List<Status> f87072c = m87953b();

    /* JADX INFO: renamed from: d */
    public static final Status f87073d = CanonicalCode.OK.toStatus();

    /* JADX INFO: renamed from: e */
    public static final Status f87074e = CanonicalCode.CANCELLED.toStatus();

    /* JADX INFO: renamed from: f */
    public static final Status f87075f = CanonicalCode.UNKNOWN.toStatus();

    /* JADX INFO: renamed from: g */
    public static final Status f87076g = CanonicalCode.INVALID_ARGUMENT.toStatus();

    /* JADX INFO: renamed from: h */
    public static final Status f87077h = CanonicalCode.DEADLINE_EXCEEDED.toStatus();

    /* JADX INFO: renamed from: i */
    public static final Status f87078i = CanonicalCode.NOT_FOUND.toStatus();

    /* JADX INFO: renamed from: j */
    public static final Status f87079j = CanonicalCode.ALREADY_EXISTS.toStatus();

    /* JADX INFO: renamed from: k */
    public static final Status f87080k = CanonicalCode.PERMISSION_DENIED.toStatus();

    /* JADX INFO: renamed from: l */
    public static final Status f87081l = CanonicalCode.UNAUTHENTICATED.toStatus();

    /* JADX INFO: renamed from: m */
    public static final Status f87082m = CanonicalCode.RESOURCE_EXHAUSTED.toStatus();

    /* JADX INFO: renamed from: n */
    public static final Status f87083n = CanonicalCode.FAILED_PRECONDITION.toStatus();

    /* JADX INFO: renamed from: o */
    public static final Status f87084o = CanonicalCode.ABORTED.toStatus();

    /* JADX INFO: renamed from: p */
    public static final Status f87085p = CanonicalCode.OUT_OF_RANGE.toStatus();

    /* JADX INFO: renamed from: q */
    public static final Status f87086q = CanonicalCode.UNIMPLEMENTED.toStatus();

    /* JADX INFO: renamed from: r */
    public static final Status f87087r = CanonicalCode.INTERNAL.toStatus();

    /* JADX INFO: renamed from: s */
    public static final Status f87088s = CanonicalCode.UNAVAILABLE.toStatus();

    /* JADX INFO: renamed from: t */
    public static final Status f87089t = CanonicalCode.DATA_LOSS.toStatus();

    /* JADX INFO: renamed from: a */
    public final CanonicalCode f87090a;

    /* JADX INFO: renamed from: b */
    public final String f87091b;

    public enum CanonicalCode {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        private final int value;

        public int value() {
            return this.value;
        }

        CanonicalCode(int i11) {
            this.value = i11;
        }

        public Status toStatus() {
            return (Status) Status.f87072c.get(this.value);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f87090a == status.f87090a && C44941b.m99391d(this.f87091b, status.f87091b);
    }

    /* JADX INFO: renamed from: b */
    public static List<Status> m87953b() {
        TreeMap treeMap = new TreeMap();
        for (CanonicalCode canonicalCode : CanonicalCode.values()) {
            Status status = (Status) treeMap.put(Integer.valueOf(canonicalCode.value()), new Status(canonicalCode, null));
            if (status != null) {
                throw new IllegalStateException("Code value duplication between " + status.m87954c().name() + " & " + canonicalCode.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    /* JADX INFO: renamed from: c */
    public CanonicalCode m87954c() {
        return this.f87090a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f87090a, this.f87091b});
    }

    public String toString() {
        return "Status{canonicalCode=" + this.f87090a + ", description=" + this.f87091b + "}";
    }

    public Status(CanonicalCode canonicalCode, String str) {
        this.f87090a = (CanonicalCode) C44941b.m99389b(canonicalCode, "canonicalCode");
        this.f87091b = str;
    }
}
