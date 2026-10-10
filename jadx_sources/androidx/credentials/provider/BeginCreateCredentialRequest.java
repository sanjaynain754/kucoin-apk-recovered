package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BeginCreateCredentialRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 \u00122\u00020\u0001:\u0003\u0010\u0011\u0012B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m90084d2 = {"Landroidx/credentials/provider/BeginCreateCredentialRequest;", "", "type", "", "candidateQueryData", "Landroid/os/Bundle;", "callingAppInfo", "Landroidx/credentials/provider/CallingAppInfo;", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroidx/credentials/provider/CallingAppInfo;)V", "getType", "()Ljava/lang/String;", "getCandidateQueryData", "()Landroid/os/Bundle;", "getCallingAppInfo", "()Landroidx/credentials/provider/CallingAppInfo;", "Api34Impl", "Api21Impl", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class BeginCreateCredentialRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final CallingAppInfo callingAppInfo;

    @NotNull
    private final Bundle candidateQueryData;

    @NotNull
    private final String type;

    /* JADX INFO: compiled from: BeginCreateCredentialRequest.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Landroidx/credentials/provider/BeginCreateCredentialRequest$Api21Impl;", "", "<init>", "()V", "EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE", "", "EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA", "asBundle", "", "bundle", "Landroid/os/Bundle;", "request", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "fromBundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBeginCreateCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginCreateCredentialRequest.kt\nandroidx/credentials/provider/BeginCreateCredentialRequest$Api21Impl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
    public static final class Api21Impl {

        @NotNull
        private static final String EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA = "androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA";

        @NotNull
        private static final String EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE = "androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE";

        @NotNull
        public static final Api21Impl INSTANCE = new Api21Impl();

        @JvmStatic
        public static final void asBundle(@NotNull Bundle bundle, @NotNull BeginCreateCredentialRequest request) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(request, "request");
            bundle.putString(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE, request.getType());
            bundle.putBundle(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA, request.getCandidateQueryData());
            CallingAppInfo callingAppInfo = request.getCallingAppInfo();
            if (callingAppInfo != null) {
                CallingAppInfo.INSTANCE.setCallingAppInfo$credentials(bundle, callingAppInfo);
            }
        }

        @JvmStatic
        @Nullable
        public static final BeginCreateCredentialRequest fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String string = bundle.getString(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE);
            if (string == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            return BeginCreateCredentialRequest.INSTANCE.createFrom(string, bundle2, CallingAppInfo.INSTANCE.extractCallingAppInfo(bundle));
        }

        private Api21Impl() {
        }
    }

    /* JADX INFO: compiled from: BeginCreateCredentialRequest.kt */
    @RequiresApi(34)
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Landroidx/credentials/provider/BeginCreateCredentialRequest$Api34Impl;", "", "<init>", "()V", "REQUEST_KEY", "", "asBundle", "", "bundle", "Landroid/os/Bundle;", "request", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "fromBundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        @NotNull
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginCreateCredentialRequest";

        @JvmStatic
        public static final void asBundle(@NotNull Bundle bundle, @NotNull BeginCreateCredentialRequest request) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(request, "request");
            bundle.putParcelable(REQUEST_KEY, BeginCreateCredentialUtil.INSTANCE.convertToFrameworkRequest(request));
        }

        @JvmStatic
        @Nullable
        public static final BeginCreateCredentialRequest fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            android.service.credentials.BeginCreateCredentialRequest beginCreateCredentialRequest = (android.service.credentials.BeginCreateCredentialRequest) bundle.getParcelable(REQUEST_KEY, android.service.credentials.BeginCreateCredentialRequest.class);
            if (beginCreateCredentialRequest != null) {
                return BeginCreateCredentialUtil.INSTANCE.convertToJetpackRequest$credentials(beginCreateCredentialRequest);
            }
            return null;
        }

        private Api34Impl() {
        }
    }

    /* JADX INFO: compiled from: BeginCreateCredentialRequest.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\tH\u0007¨\u0006\u0010"}, m90084d2 = {"Landroidx/credentials/provider/BeginCreateCredentialRequest$Companion;", "", "<init>", "()V", "createFrom", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "type", "", "candidateQueryData", "Landroid/os/Bundle;", "callingAppInfo", "Landroidx/credentials/provider/CallingAppInfo;", "asBundle", "request", "fromBundle", "bundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final BeginCreateCredentialRequest fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.fromBundle(bundle) : Api21Impl.fromBundle(bundle);
        }

        @JvmStatic
        @NotNull
        public final Bundle asBundle(@NotNull BeginCreateCredentialRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.asBundle(bundle, request);
                return bundle;
            }
            Api21Impl.asBundle(bundle, request);
            return bundle;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public final BeginCreateCredentialRequest createFrom(@NotNull String type, @NotNull Bundle candidateQueryData, @Nullable CallingAppInfo callingAppInfo) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
            try {
                if (Intrinsics.areEqual(type, PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                    return BeginCreatePasswordCredentialRequest.INSTANCE.createFrom$credentials(candidateQueryData, callingAppInfo);
                }
                if (Intrinsics.areEqual(type, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                    return BeginCreatePublicKeyCredentialRequest.INSTANCE.createFrom$credentials(candidateQueryData, callingAppInfo);
                }
                return new BeginCreateCustomCredentialRequest(type, candidateQueryData, callingAppInfo);
            } catch (FrameworkClassParsingException unused) {
                return new BeginCreateCustomCredentialRequest(type, candidateQueryData, callingAppInfo);
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final Bundle asBundle(@NotNull BeginCreateCredentialRequest beginCreateCredentialRequest) {
        return INSTANCE.asBundle(beginCreateCredentialRequest);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final BeginCreateCredentialRequest createFrom(@NotNull String str, @NotNull Bundle bundle, @Nullable CallingAppInfo callingAppInfo) {
        return INSTANCE.createFrom(str, bundle, callingAppInfo);
    }

    @JvmStatic
    @Nullable
    public static final BeginCreateCredentialRequest fromBundle(@NotNull Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @Nullable
    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    @NotNull
    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public BeginCreateCredentialRequest(@NotNull String type, @NotNull Bundle candidateQueryData, @Nullable CallingAppInfo callingAppInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        this.type = type;
        this.candidateQueryData = candidateQueryData;
        this.callingAppInfo = callingAppInfo;
    }
}
