package p507on;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: on.a */
/* JADX INFO: compiled from: KycPrecheckDestination.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kyc/ui/dispatch/KycPrecheckDestination;", "", "<init>", "()V", "NetworkError", "KybHome", "ClearPage", "H5Home", "Lcom/kubi/kyc/ui/dispatch/KycPrecheckDestination$ClearPage;", "Lcom/kubi/kyc/ui/dispatch/KycPrecheckDestination$H5Home;", "Lcom/kubi/kyc/ui/dispatch/KycPrecheckDestination$KybHome;", "Lcom/kubi/kyc/ui/dispatch/KycPrecheckDestination$NetworkError;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AbstractC43158a {

    /* JADX INFO: renamed from: on.a$a, reason: from toString */
    /* JADX INFO: compiled from: KycPrecheckDestination.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/kyc/ui/dispatch/KycPrecheckDestination$ClearPage;", "Lcom/kubi/kyc/ui/dispatch/KycPrecheckDestination;", "flutterRoute", "", "<init>", "(Ljava/lang/String;)V", "getFlutterRoute", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ClearPage extends AbstractC43158a {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String flutterRoute;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClearPage) && Intrinsics.areEqual(this.flutterRoute, ((ClearPage) other).flutterRoute);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearPage(@NotNull String flutterRoute) {
            super(null);
            Intrinsics.checkNotNullParameter(flutterRoute, "flutterRoute");
            this.flutterRoute = flutterRoute;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFlutterRoute() {
            return this.flutterRoute;
        }

        public int hashCode() {
            return this.flutterRoute.hashCode();
        }

        @NotNull
        public String toString() {
            return "ClearPage(flutterRoute=" + this.flutterRoute + ')';
        }
    }

    /* JADX INFO: renamed from: on.a$b */
    /* JADX INFO: compiled from: KycPrecheckDestination.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kyc/ui/dispatch/KycPrecheckDestination$H5Home;", "Lcom/kubi/kyc/ui/dispatch/KycPrecheckDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class b extends AbstractC43158a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f95314a = new b();

        public b() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof b);
        }

        @NotNull
        public String toString() {
            return "H5Home";
        }

        public int hashCode() {
            return -1867033437;
        }
    }

    /* JADX INFO: renamed from: on.a$c */
    /* JADX INFO: compiled from: KycPrecheckDestination.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kyc/ui/dispatch/KycPrecheckDestination$KybHome;", "Lcom/kubi/kyc/ui/dispatch/KycPrecheckDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class c extends AbstractC43158a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final c f95315a = new c();

        public c() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof c);
        }

        @NotNull
        public String toString() {
            return "KybHome";
        }

        public int hashCode() {
            return -1706283716;
        }
    }

    /* JADX INFO: renamed from: on.a$d */
    /* JADX INFO: compiled from: KycPrecheckDestination.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kyc/ui/dispatch/KycPrecheckDestination$NetworkError;", "Lcom/kubi/kyc/ui/dispatch/KycPrecheckDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class d extends AbstractC43158a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final d f95316a = new d();

        public d() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof d);
        }

        @NotNull
        public String toString() {
            return "NetworkError";
        }

        public int hashCode() {
            return 391783569;
        }
    }

    public /* synthetic */ AbstractC43158a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC43158a() {
    }
}
