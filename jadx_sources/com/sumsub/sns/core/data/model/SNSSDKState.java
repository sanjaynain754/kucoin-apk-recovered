package com.sumsub.sns.core.data.model;

import androidx.annotation.Keep;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState;", "", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "name", "getName", "Ready", "Failed", "Initial", "Incomplete", "Pending", "TemporarilyDeclined", "FinallyRejected", "Approved", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Approved;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$FinallyRejected;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Incomplete;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Initial;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Pending;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Ready;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$TemporarilyDeclined;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class SNSSDKState {

    @NotNull
    private final String message;

    @NotNull
    private final String name;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState$Approved;", "Lcom/sumsub/sns/core/data/model/SNSSDKState;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Approved extends SNSSDKState {

        @NotNull
        public static final Approved INSTANCE = new Approved();

        private Approved() {
            super("Applicant has been approved", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u000b\f\r\u000e\u000f\u0010\u0011B#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;", "Lcom/sumsub/sns/core/data/model/SNSSDKState;", "message", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "ApplicantNotFound", "ApplicantMisconfigured", "InitialLoadingFailed", "InvalidParameters", "NetworkError", "Unauthorized", "Unknown", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$ApplicantMisconfigured;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$ApplicantNotFound;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$InitialLoadingFailed;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$InvalidParameters;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$NetworkError;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$Unauthorized;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$Unknown;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static abstract class Failed extends SNSSDKState {

        @Nullable
        private final Exception exception;

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$ApplicantMisconfigured;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class ApplicantMisconfigured extends Failed {

            @NotNull
            public static final ApplicantMisconfigured INSTANCE = new ApplicantMisconfigured();

            /* JADX WARN: Multi-variable type inference failed */
            private ApplicantMisconfigured() {
                super("Applicant is found, but is misconfigured (most likely lacks of idDocs)", null, 2, 0 == true ? 1 : 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$ApplicantNotFound;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class ApplicantNotFound extends Failed {
            public ApplicantNotFound(@NotNull Exception exc) {
                super("No applicant is found for the given parameters", exc, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$InitialLoadingFailed;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class InitialLoadingFailed extends Failed {
            public InitialLoadingFailed(@NotNull Exception exc) {
                super("An error while initial loading the SDK", exc, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$InvalidParameters;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;", "messages", "", "", "<init>", "(Ljava/util/List;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class InvalidParameters extends Failed {
            /* JADX WARN: Multi-variable type inference failed */
            public InvalidParameters(@NotNull List<String> list) {
                super("An attempt to setup with invalid parameters.\n" + CollectionsKt.joinToString$default(list, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, null, 62, null), null, 2, 0 == true ? 1 : 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$NetworkError;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class NetworkError extends Failed {
            public NetworkError(@NotNull Exception exc) {
                super("A network error occured (the user will be presented with Network Oops screen)", exc, null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$Unauthorized;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class Unauthorized extends Failed {

            @NotNull
            public static final Unauthorized INSTANCE = new Unauthorized();

            /* JADX WARN: Multi-variable type inference failed */
            private Unauthorized() {
                super("Your token isn't valid or the SDK can't refresh your token. Do you have a valid token updater?", null, 2, 0 == true ? 1 : 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
        @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$Unknown;", "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class Unknown extends Failed {
            public Unknown(@NotNull Exception exc) {
                super("Unknown error", exc, null);
            }
        }

        public /* synthetic */ Failed(String str, Exception exc, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, exc);
        }

        private Failed(String str, Exception exc) {
            super(str, null);
            this.exception = exc;
        }

        @Nullable
        public final Exception getException() {
            return this.exception;
        }

        public /* synthetic */ Failed(String str, Exception exc, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : exc, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState$FinallyRejected;", "Lcom/sumsub/sns/core/data/model/SNSSDKState;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class FinallyRejected extends SNSSDKState {

        @NotNull
        public static final FinallyRejected INSTANCE = new FinallyRejected();

        private FinallyRejected() {
            super("Applicant has been finally rejected", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState$Incomplete;", "Lcom/sumsub/sns/core/data/model/SNSSDKState;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Incomplete extends SNSSDKState {

        @NotNull
        public static final Incomplete INSTANCE = new Incomplete();

        private Incomplete() {
            super("Some but not all verification steps are passed over", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState$Initial;", "Lcom/sumsub/sns/core/data/model/SNSSDKState;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Initial extends SNSSDKState {

        @NotNull
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super("No verification steps are passed yet", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState$Pending;", "Lcom/sumsub/sns/core/data/model/SNSSDKState;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Pending extends SNSSDKState {

        @NotNull
        public static final Pending INSTANCE = new Pending();

        private Pending() {
            super("Verification is in pending state", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState$Ready;", "Lcom/sumsub/sns/core/data/model/SNSSDKState;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Ready extends SNSSDKState {

        @NotNull
        public static final Ready INSTANCE = new Ready();

        private Ready() {
            super("SDK is ready", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSSDKState$TemporarilyDeclined;", "Lcom/sumsub/sns/core/data/model/SNSSDKState;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class TemporarilyDeclined extends SNSSDKState {

        @NotNull
        public static final TemporarilyDeclined INSTANCE = new TemporarilyDeclined();

        private TemporarilyDeclined() {
            super("Applicant has been declined temporarily", null);
        }
    }

    public /* synthetic */ SNSSDKState(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private SNSSDKState(String str) {
        this.message = str;
        String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        this.name = simpleName == null ? "" : simpleName;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }
}
