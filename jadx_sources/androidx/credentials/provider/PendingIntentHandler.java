package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Bundle;
import android.service.credentials.CreateCredentialRequest;
import android.service.credentials.GetCredentialRequest;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.Credential;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.internal.ConversionUtilsKt;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PendingIntentHandler.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(23)
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m90084d2 = {"Landroidx/credentials/provider/PendingIntentHandler;", "", "<init>", "()V", "Companion", "Api23Impl", "Api34Impl", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class PendingIntentHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "PendingIntentHandler";

    /* JADX INFO: compiled from: PendingIntentHandler.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Landroidx/credentials/provider/PendingIntentHandler$Api23Impl;", "", "<init>", "()V", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SuppressLint({"ObsoleteSdkInt"})
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final class Api23Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_REQUEST = "android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST";

        @NotNull
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE = "android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE";

        @NotNull
        private static final String EXTRA_CREATE_CREDENTIAL_EXCEPTION = "android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION";

        @NotNull
        private static final String EXTRA_CREATE_CREDENTIAL_REQUEST = "android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST";

        @NotNull
        private static final String EXTRA_CREATE_CREDENTIAL_RESPONSE = "android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE";

        @NotNull
        private static final String EXTRA_GET_CREDENTIAL_EXCEPTION = "android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION";

        @NotNull
        private static final String EXTRA_GET_CREDENTIAL_REQUEST = "android.service.credentials.extra.GET_CREDENTIAL_REQUEST";

        @NotNull
        private static final String EXTRA_GET_CREDENTIAL_RESPONSE = "android.service.credentials.extra.GET_CREDENTIAL_RESPONSE";

        /* JADX INFO: compiled from: PendingIntentHandler.kt */
        @Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000fH\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0013H\u0007J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0018H\u0007J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001cH\u0007J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020 H\u0007J\u0012\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010%\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010&\u001a\u00020$H\u0007J\u0012\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010*\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010&\u001a\u00020)H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Landroidx/credentials/provider/PendingIntentHandler$Api23Impl$Companion;", "", "<init>", "()V", "EXTRA_CREATE_CREDENTIAL_REQUEST", "", "setProviderCreateCredentialRequest", "", "intent", "Landroid/content/Intent;", "request", "Landroidx/credentials/provider/ProviderCreateCredentialRequest;", "retrieveProviderCreateCredentialRequest", "EXTRA_BEGIN_GET_CREDENTIAL_REQUEST", "setBeginGetCredentialRequest", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "retrieveBeginGetCredentialRequest", "EXTRA_CREATE_CREDENTIAL_RESPONSE", "extractCreateCredentialResponse", "Landroidx/credentials/CreateCredentialResponse;", "setCreateCredentialResponse", "response", "EXTRA_GET_CREDENTIAL_REQUEST", "setProviderGetCredentialRequest", "Landroidx/credentials/provider/ProviderGetCredentialRequest;", "retrieveProviderGetCredentialRequest", "EXTRA_GET_CREDENTIAL_RESPONSE", "extractGetCredentialResponse", "Landroidx/credentials/GetCredentialResponse;", "setGetCredentialResponse", "EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE", "extractBeginGetCredentialResponse", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "setBeginGetCredentialResponse", "EXTRA_GET_CREDENTIAL_EXCEPTION", "extractGetCredentialException", "Landroidx/credentials/exceptions/GetCredentialException;", "setGetCredentialException", "exception", "EXTRA_CREATE_CREDENTIAL_EXCEPTION", "extractCreateCredentialException", "Landroidx/credentials/exceptions/CreateCredentialException;", "setCreateCredentialException", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            @Nullable
            public final BeginGetCredentialResponse extractBeginGetCredentialResponse(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                BeginGetCredentialResponse.Companion companion = BeginGetCredentialResponse.INSTANCE;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            @JvmStatic
            @Nullable
            public final CreateCredentialException extractCreateCredentialException(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                CreateCredentialException.Companion companion = CreateCredentialException.INSTANCE;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_EXCEPTION);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            @JvmStatic
            @Nullable
            public final CreateCredentialResponse extractCreateCredentialResponse(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                CreateCredentialResponse.Companion companion = CreateCredentialResponse.INSTANCE;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_RESPONSE);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            @JvmStatic
            @Nullable
            public final GetCredentialException extractGetCredentialException(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                GetCredentialException.Companion companion = GetCredentialException.INSTANCE;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_GET_CREDENTIAL_EXCEPTION);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            @JvmStatic
            @Nullable
            public final GetCredentialResponse extractGetCredentialResponse(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                GetCredentialResponse.Companion companion = GetCredentialResponse.INSTANCE;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_GET_CREDENTIAL_RESPONSE);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            @JvmStatic
            @Nullable
            public final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                BeginGetCredentialRequest.Companion companion = BeginGetCredentialRequest.INSTANCE;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_BEGIN_GET_CREDENTIAL_REQUEST);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            @JvmStatic
            @Nullable
            public final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                try {
                    ProviderCreateCredentialRequest.Companion companion = ProviderCreateCredentialRequest.INSTANCE;
                    Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_REQUEST);
                    if (bundleExtra == null) {
                        return null;
                    }
                    return companion.fromBundle(bundleExtra);
                } catch (Exception unused) {
                    return null;
                }
            }

            @JvmStatic
            @Nullable
            public final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                try {
                    ProviderGetCredentialRequest.Companion companion = ProviderGetCredentialRequest.INSTANCE;
                    Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_GET_CREDENTIAL_REQUEST);
                    if (bundleExtra == null) {
                        return null;
                    }
                    return companion.fromBundle(bundleExtra);
                } catch (Exception unused) {
                    return null;
                }
            }

            @JvmStatic
            public final void setBeginGetCredentialRequest(@NotNull Intent intent, @NotNull BeginGetCredentialRequest request) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(request, "request");
                intent.putExtra(Api23Impl.EXTRA_BEGIN_GET_CREDENTIAL_REQUEST, BeginGetCredentialRequest.INSTANCE.asBundle(request));
            }

            @JvmStatic
            public final void setBeginGetCredentialResponse(@NotNull Intent intent, @NotNull BeginGetCredentialResponse response) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(response, "response");
                intent.putExtra(Api23Impl.EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE, BeginGetCredentialResponse.INSTANCE.asBundle(response));
            }

            @JvmStatic
            public final void setCreateCredentialException(@NotNull Intent intent, @NotNull CreateCredentialException exception) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(exception, "exception");
                intent.putExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_EXCEPTION, CreateCredentialException.INSTANCE.asBundle(exception));
            }

            @JvmStatic
            public final void setCreateCredentialResponse(@NotNull Intent intent, @NotNull CreateCredentialResponse response) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(response, "response");
                intent.putExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_RESPONSE, CreateCredentialResponse.INSTANCE.asBundle(response));
            }

            @JvmStatic
            public final void setGetCredentialException(@NotNull Intent intent, @NotNull GetCredentialException exception) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(exception, "exception");
                intent.putExtra(Api23Impl.EXTRA_GET_CREDENTIAL_EXCEPTION, GetCredentialException.INSTANCE.asBundle(exception));
            }

            @JvmStatic
            public final void setGetCredentialResponse(@NotNull Intent intent, @NotNull GetCredentialResponse response) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(response, "response");
                intent.putExtra(Api23Impl.EXTRA_GET_CREDENTIAL_RESPONSE, GetCredentialResponse.INSTANCE.asBundle(response));
            }

            @JvmStatic
            public final void setProviderCreateCredentialRequest(@NotNull Intent intent, @NotNull ProviderCreateCredentialRequest request) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(request, "request");
                intent.putExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_REQUEST, ProviderCreateCredentialRequest.INSTANCE.asBundle(request));
            }

            @JvmStatic
            public final void setProviderGetCredentialRequest(@NotNull Intent intent, @NotNull ProviderGetCredentialRequest request) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(request, "request");
                intent.putExtra(Api23Impl.EXTRA_GET_CREDENTIAL_REQUEST, ProviderGetCredentialRequest.INSTANCE.asBundle(request));
            }
        }

        @JvmStatic
        @Nullable
        public static final BeginGetCredentialResponse extractBeginGetCredentialResponse(@NotNull Intent intent) {
            return INSTANCE.extractBeginGetCredentialResponse(intent);
        }

        @JvmStatic
        @Nullable
        public static final CreateCredentialException extractCreateCredentialException(@NotNull Intent intent) {
            return INSTANCE.extractCreateCredentialException(intent);
        }

        @JvmStatic
        @Nullable
        public static final CreateCredentialResponse extractCreateCredentialResponse(@NotNull Intent intent) {
            return INSTANCE.extractCreateCredentialResponse(intent);
        }

        @JvmStatic
        @Nullable
        public static final GetCredentialException extractGetCredentialException(@NotNull Intent intent) {
            return INSTANCE.extractGetCredentialException(intent);
        }

        @JvmStatic
        @Nullable
        public static final GetCredentialResponse extractGetCredentialResponse(@NotNull Intent intent) {
            return INSTANCE.extractGetCredentialResponse(intent);
        }

        @JvmStatic
        @Nullable
        public static final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(@NotNull Intent intent) {
            return INSTANCE.retrieveBeginGetCredentialRequest(intent);
        }

        @JvmStatic
        @Nullable
        public static final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(@NotNull Intent intent) {
            return INSTANCE.retrieveProviderCreateCredentialRequest(intent);
        }

        @JvmStatic
        @Nullable
        public static final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(@NotNull Intent intent) {
            return INSTANCE.retrieveProviderGetCredentialRequest(intent);
        }

        @JvmStatic
        public static final void setBeginGetCredentialRequest(@NotNull Intent intent, @NotNull BeginGetCredentialRequest beginGetCredentialRequest) {
            INSTANCE.setBeginGetCredentialRequest(intent, beginGetCredentialRequest);
        }

        @JvmStatic
        public static final void setBeginGetCredentialResponse(@NotNull Intent intent, @NotNull BeginGetCredentialResponse beginGetCredentialResponse) {
            INSTANCE.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
        }

        @JvmStatic
        public static final void setCreateCredentialException(@NotNull Intent intent, @NotNull CreateCredentialException createCredentialException) {
            INSTANCE.setCreateCredentialException(intent, createCredentialException);
        }

        @JvmStatic
        public static final void setCreateCredentialResponse(@NotNull Intent intent, @NotNull CreateCredentialResponse createCredentialResponse) {
            INSTANCE.setCreateCredentialResponse(intent, createCredentialResponse);
        }

        @JvmStatic
        public static final void setGetCredentialException(@NotNull Intent intent, @NotNull GetCredentialException getCredentialException) {
            INSTANCE.setGetCredentialException(intent, getCredentialException);
        }

        @JvmStatic
        public static final void setGetCredentialResponse(@NotNull Intent intent, @NotNull GetCredentialResponse getCredentialResponse) {
            INSTANCE.setGetCredentialResponse(intent, getCredentialResponse);
        }

        @JvmStatic
        public static final void setProviderCreateCredentialRequest(@NotNull Intent intent, @NotNull ProviderCreateCredentialRequest providerCreateCredentialRequest) {
            INSTANCE.setProviderCreateCredentialRequest(intent, providerCreateCredentialRequest);
        }

        @JvmStatic
        public static final void setProviderGetCredentialRequest(@NotNull Intent intent, @NotNull ProviderGetCredentialRequest providerGetCredentialRequest) {
            INSTANCE.setProviderGetCredentialRequest(intent, providerGetCredentialRequest);
        }
    }

    /* JADX INFO: compiled from: PendingIntentHandler.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Landroidx/credentials/provider/PendingIntentHandler$Api34Impl;", "", "<init>", "()V", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @RequiresApi(34)
    public static final class Api34Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: compiled from: PendingIntentHandler.kt */
        @Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J6\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u001aH\u0007J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u001dH\u0007J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\"\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010#\u001a\u00020!H\u0007J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001fH\u0007¨\u0006%"}, m90084d2 = {"Landroidx/credentials/provider/PendingIntentHandler$Api34Impl$Companion;", "", "<init>", "()V", "retrieveProviderCreateCredentialRequest", "Landroidx/credentials/provider/ProviderCreateCredentialRequest;", "intent", "Landroid/content/Intent;", "retrieveBiometricPromptResult", "Landroidx/credentials/provider/BiometricPromptResult;", "resultKey", "", "errorKey", "errorMessageKey", "retrieveBiometricPromptResultFallback", "retrieveBeginGetCredentialRequest", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "setCreateCredentialResponse", "", "response", "Landroidx/credentials/CreateCredentialResponse;", "retrieveProviderGetCredentialRequest", "Landroidx/credentials/provider/ProviderGetCredentialRequest;", "extractCreateCredentialResponse", "type", "extractGetCredentialResponse", "Landroidx/credentials/GetCredentialResponse;", "setGetCredentialResponse", "setBeginGetCredentialResponse", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "extractCreateCredentialException", "Landroidx/credentials/exceptions/CreateCredentialException;", "extractGetCredentialException", "Landroidx/credentials/exceptions/GetCredentialException;", "setGetCredentialException", "exception", "setCreateCredentialException", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nPendingIntentHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PendingIntentHandler.kt\nandroidx/credentials/provider/PendingIntentHandler$Api34Impl$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public static /* synthetic */ BiometricPromptResult retrieveBiometricPromptResult$default(Companion companion, Intent intent, String str, String str2, String str3, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    str = AuthenticationResult.EXTRA_BIOMETRIC_AUTH_RESULT_TYPE;
                }
                if ((i11 & 4) != 0) {
                    str2 = AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR;
                }
                if ((i11 & 8) != 0) {
                    str3 = AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE;
                }
                return companion.retrieveBiometricPromptResult(intent, str, str2, str3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CredentialOption retrieveProviderGetCredentialRequest$lambda$0(android.credentials.CredentialOption credentialOption) {
                CredentialOption.Companion companion = CredentialOption.INSTANCE;
                String type = credentialOption.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                Bundle credentialRetrievalData = credentialOption.getCredentialRetrievalData();
                Intrinsics.checkNotNullExpressionValue(credentialRetrievalData, "getCredentialRetrievalData(...)");
                Bundle candidateQueryData = credentialOption.getCandidateQueryData();
                Intrinsics.checkNotNullExpressionValue(candidateQueryData, "getCandidateQueryData(...)");
                boolean zIsSystemProviderRequired = credentialOption.isSystemProviderRequired();
                Set<ComponentName> allowedProviders = credentialOption.getAllowedProviders();
                Intrinsics.checkNotNullExpressionValue(allowedProviders, "getAllowedProviders(...)");
                return companion.createFrom(type, credentialRetrievalData, candidateQueryData, zIsSystemProviderRequired, allowedProviders);
            }

            @JvmStatic
            @Nullable
            public final CreateCredentialException extractCreateCredentialException(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                android.credentials.CreateCredentialException createCredentialException = (android.credentials.CreateCredentialException) intent.getSerializableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", android.credentials.CreateCredentialException.class);
                if (createCredentialException == null) {
                    return null;
                }
                String type = createCredentialException.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return ConversionUtilsKt.toJetpackCreateException(type, createCredentialException.getMessage());
            }

            @JvmStatic
            @Nullable
            public final GetCredentialException extractGetCredentialException(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                android.credentials.GetCredentialException getCredentialException = (android.credentials.GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", android.credentials.GetCredentialException.class);
                if (getCredentialException == null) {
                    return null;
                }
                String type = getCredentialException.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return ConversionUtilsKt.toJetpackGetException(type, getCredentialException.getMessage());
            }

            @JvmStatic
            @Nullable
            public final GetCredentialResponse extractGetCredentialResponse(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                android.credentials.GetCredentialResponse getCredentialResponse = (android.credentials.GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", android.credentials.GetCredentialResponse.class);
                if (getCredentialResponse == null) {
                    return null;
                }
                Credential.Companion companion = Credential.INSTANCE;
                android.credentials.Credential credential = getCredentialResponse.getCredential();
                Intrinsics.checkNotNullExpressionValue(credential, "getCredential(...)");
                return new GetCredentialResponse(companion.createFrom(credential));
            }

            @JvmStatic
            @Nullable
            public final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                android.service.credentials.BeginGetCredentialRequest beginGetCredentialRequest = (android.service.credentials.BeginGetCredentialRequest) intent.getParcelableExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST", android.service.credentials.BeginGetCredentialRequest.class);
                if (beginGetCredentialRequest != null) {
                    return BeginGetCredentialUtil.INSTANCE.convertToJetpackRequest$credentials(beginGetCredentialRequest);
                }
                return null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @JvmStatic
            @Nullable
            public final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                CreateCredentialRequest createCredentialRequest = (CreateCredentialRequest) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST", CreateCredentialRequest.class);
                if (createCredentialRequest == 0) {
                    Log.i(PendingIntentHandler.TAG, "Request not found in pendingIntent");
                    return (ProviderCreateCredentialRequest) createCredentialRequest;
                }
                BiometricPromptResult biometricPromptResultRetrieveBiometricPromptResult$default = retrieveBiometricPromptResult$default(this, intent, null, null, null, 14, null);
                if (biometricPromptResultRetrieveBiometricPromptResult$default == null) {
                    biometricPromptResultRetrieveBiometricPromptResult$default = retrieveBiometricPromptResultFallback(intent);
                }
                try {
                    androidx.credentials.CreateCredentialRequest.Companion companion = androidx.credentials.CreateCredentialRequest.INSTANCE;
                    String type = createCredentialRequest.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    Bundle data = createCredentialRequest.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                    Bundle data2 = createCredentialRequest.getData();
                    Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
                    androidx.credentials.CreateCredentialRequest createCredentialRequestCreateFrom = companion.createFrom(type, data, data2, false, createCredentialRequest.getCallingAppInfo().getOrigin());
                    CallingAppInfo.Companion companion2 = CallingAppInfo.INSTANCE;
                    String packageName = createCredentialRequest.getCallingAppInfo().getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                    SigningInfo signingInfo = createCredentialRequest.getCallingAppInfo().getSigningInfo();
                    Intrinsics.checkNotNullExpressionValue(signingInfo, "getSigningInfo(...)");
                    return new ProviderCreateCredentialRequest(createCredentialRequestCreateFrom, companion2.create(packageName, signingInfo, createCredentialRequest.getCallingAppInfo().getOrigin()), biometricPromptResultRetrieveBiometricPromptResult$default, intent.getExtras());
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }

            @JvmStatic
            @Nullable
            public final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_REQUEST", GetCredentialRequest.class);
                if (getCredentialRequest == null) {
                    Log.i(PendingIntentHandler.TAG, "Get request from framework is null");
                    return null;
                }
                BiometricPromptResult biometricPromptResultRetrieveBiometricPromptResult$default = retrieveBiometricPromptResult$default(this, intent, null, null, null, 14, null);
                if (biometricPromptResultRetrieveBiometricPromptResult$default == null) {
                    biometricPromptResultRetrieveBiometricPromptResult$default = retrieveBiometricPromptResultFallback(intent);
                }
                ProviderGetCredentialRequest.Companion companion = ProviderGetCredentialRequest.INSTANCE;
                Stream<android.credentials.CredentialOption> stream = getCredentialRequest.getCredentialOptions().stream();
                final Function1 function1 = new Function1() { // from class: androidx.credentials.provider.u
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PendingIntentHandler.Api34Impl.Companion.retrieveProviderGetCredentialRequest$lambda$0((android.credentials.CredentialOption) obj);
                    }
                };
                Object objCollect = stream.map(new Function() { // from class: androidx.credentials.provider.v
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return PendingIntentHandler.Api34Impl.Companion.retrieveProviderGetCredentialRequest$lambda$1(function1, obj);
                    }
                }).collect(Collectors.toList());
                Intrinsics.checkNotNullExpressionValue(objCollect, "collect(...)");
                CallingAppInfo.Companion companion2 = CallingAppInfo.INSTANCE;
                String packageName = getCredentialRequest.getCallingAppInfo().getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                SigningInfo signingInfo = getCredentialRequest.getCallingAppInfo().getSigningInfo();
                Intrinsics.checkNotNullExpressionValue(signingInfo, "getSigningInfo(...)");
                return companion.createFrom$credentials((List) objCollect, companion2.create(packageName, signingInfo, getCredentialRequest.getCallingAppInfo().getOrigin()), biometricPromptResultRetrieveBiometricPromptResult$default, intent.getExtras());
            }

            @JvmStatic
            public final void setBeginGetCredentialResponse(@NotNull Intent intent, @NotNull BeginGetCredentialResponse response) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(response, "response");
                intent.putExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE", BeginGetCredentialUtil.INSTANCE.convertToFrameworkResponse(response));
            }

            @JvmStatic
            public final void setCreateCredentialException(@NotNull Intent intent, @NotNull CreateCredentialException exception) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(exception, "exception");
                intent.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", new android.credentials.CreateCredentialException(exception.getType(), exception.getMessage()));
            }

            @JvmStatic
            public final void setCreateCredentialResponse(@NotNull Intent intent, @NotNull CreateCredentialResponse response) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(response, "response");
                intent.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", new android.credentials.CreateCredentialResponse(response.getData()));
            }

            @JvmStatic
            public final void setGetCredentialException(@NotNull Intent intent, @NotNull GetCredentialException exception) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(exception, "exception");
                intent.putExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", new android.credentials.GetCredentialException(exception.getType(), exception.getMessage()));
            }

            @JvmStatic
            public final void setGetCredentialResponse(@NotNull Intent intent, @NotNull GetCredentialResponse response) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(response, "response");
                intent.putExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", new android.credentials.GetCredentialResponse(new android.credentials.Credential(response.getCredential().getType(), response.getCredential().getData())));
            }

            private final BiometricPromptResult retrieveBiometricPromptResult(Intent intent, String resultKey, String errorKey, String errorMessageKey) {
                CharSequence charSequence = null;
                if (intent.getExtras() == null) {
                    return null;
                }
                Bundle extras = intent.getExtras();
                Intrinsics.checkNotNull(extras);
                if (extras.containsKey(resultKey)) {
                    Bundle extras2 = intent.getExtras();
                    Intrinsics.checkNotNull(extras2);
                    return new BiometricPromptResult(new AuthenticationResult(extras2.getInt(resultKey)));
                }
                Bundle extras3 = intent.getExtras();
                Intrinsics.checkNotNull(extras3);
                if (!extras3.containsKey(errorKey)) {
                    return null;
                }
                Bundle extras4 = intent.getExtras();
                Intrinsics.checkNotNull(extras4);
                int i11 = extras4.getInt(errorKey);
                Bundle extras5 = intent.getExtras();
                if (extras5 != null) {
                    charSequence = extras5.getCharSequence(errorMessageKey);
                }
                return new BiometricPromptResult(new AuthenticationError(i11, charSequence));
            }

            private final BiometricPromptResult retrieveBiometricPromptResultFallback(Intent intent) {
                if (intent.getExtras() != null) {
                    Bundle extras = intent.getExtras();
                    Intrinsics.checkNotNull(extras);
                    if (!extras.containsKey(AuthenticationResult.EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK)) {
                        Bundle extras2 = intent.getExtras();
                        Intrinsics.checkNotNull(extras2);
                        if (!extras2.containsKey(AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK)) {
                            return null;
                        }
                    }
                    return retrieveBiometricPromptResult(intent, AuthenticationResult.EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK, AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK, AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE_FALLBACK);
                }
                return null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CredentialOption retrieveProviderGetCredentialRequest$lambda$1(Function1 function1, Object obj) {
                return (CredentialOption) function1.invoke(obj);
            }

            @JvmStatic
            @Nullable
            public final CreateCredentialResponse extractCreateCredentialResponse(@NotNull String type, @NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(intent, "intent");
                android.credentials.CreateCredentialResponse createCredentialResponse = (android.credentials.CreateCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", android.credentials.CreateCredentialResponse.class);
                if (createCredentialResponse == null) {
                    return null;
                }
                CreateCredentialResponse.Companion companion = CreateCredentialResponse.INSTANCE;
                Bundle data = createCredentialResponse.getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                return companion.createFrom(type, data);
            }
        }

        @JvmStatic
        @Nullable
        public static final CreateCredentialException extractCreateCredentialException(@NotNull Intent intent) {
            return INSTANCE.extractCreateCredentialException(intent);
        }

        @JvmStatic
        @Nullable
        public static final CreateCredentialResponse extractCreateCredentialResponse(@NotNull String str, @NotNull Intent intent) {
            return INSTANCE.extractCreateCredentialResponse(str, intent);
        }

        @JvmStatic
        @Nullable
        public static final GetCredentialException extractGetCredentialException(@NotNull Intent intent) {
            return INSTANCE.extractGetCredentialException(intent);
        }

        @JvmStatic
        @Nullable
        public static final GetCredentialResponse extractGetCredentialResponse(@NotNull Intent intent) {
            return INSTANCE.extractGetCredentialResponse(intent);
        }

        @JvmStatic
        @Nullable
        public static final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(@NotNull Intent intent) {
            return INSTANCE.retrieveBeginGetCredentialRequest(intent);
        }

        @JvmStatic
        @Nullable
        public static final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(@NotNull Intent intent) {
            return INSTANCE.retrieveProviderCreateCredentialRequest(intent);
        }

        @JvmStatic
        @Nullable
        public static final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(@NotNull Intent intent) {
            return INSTANCE.retrieveProviderGetCredentialRequest(intent);
        }

        @JvmStatic
        public static final void setBeginGetCredentialResponse(@NotNull Intent intent, @NotNull BeginGetCredentialResponse beginGetCredentialResponse) {
            INSTANCE.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
        }

        @JvmStatic
        public static final void setCreateCredentialException(@NotNull Intent intent, @NotNull CreateCredentialException createCredentialException) {
            INSTANCE.setCreateCredentialException(intent, createCredentialException);
        }

        @JvmStatic
        public static final void setCreateCredentialResponse(@NotNull Intent intent, @NotNull CreateCredentialResponse createCredentialResponse) {
            INSTANCE.setCreateCredentialResponse(intent, createCredentialResponse);
        }

        @JvmStatic
        public static final void setGetCredentialException(@NotNull Intent intent, @NotNull GetCredentialException getCredentialException) {
            INSTANCE.setGetCredentialException(intent, getCredentialException);
        }

        @JvmStatic
        public static final void setGetCredentialResponse(@NotNull Intent intent, @NotNull GetCredentialResponse getCredentialResponse) {
            INSTANCE.setGetCredentialResponse(intent, getCredentialResponse);
        }
    }

    /* JADX INFO: compiled from: PendingIntentHandler.kt */
    @Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0015H\u0007J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0018H\u0007J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001eH\u0007J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Landroidx/credentials/provider/PendingIntentHandler$Companion;", "", "<init>", "()V", "TAG", "", "retrieveProviderCreateCredentialRequest", "Landroidx/credentials/provider/ProviderCreateCredentialRequest;", "intent", "Landroid/content/Intent;", "retrieveBeginGetCredentialRequest", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "setCreateCredentialResponse", "", "response", "Landroidx/credentials/CreateCredentialResponse;", "retrieveCreateCredentialResponse", "type", "retrieveProviderGetCredentialRequest", "Landroidx/credentials/provider/ProviderGetCredentialRequest;", "setGetCredentialResponse", "Landroidx/credentials/GetCredentialResponse;", "retrieveGetCredentialResponse", "setBeginGetCredentialResponse", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "setGetCredentialException", "exception", "Landroidx/credentials/exceptions/GetCredentialException;", "retrieveGetCredentialException", "setCreateCredentialException", "Landroidx/credentials/exceptions/CreateCredentialException;", "retrieveCreateCredentialException", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.INSTANCE.retrieveBeginGetCredentialRequest(intent) : Api23Impl.INSTANCE.retrieveBeginGetCredentialRequest(intent);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final CreateCredentialException retrieveCreateCredentialException(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.INSTANCE.extractCreateCredentialException(intent) : Api23Impl.INSTANCE.extractCreateCredentialException(intent);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final GetCredentialException retrieveGetCredentialException(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.INSTANCE.extractGetCredentialException(intent) : Api23Impl.INSTANCE.extractGetCredentialException(intent);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final GetCredentialResponse retrieveGetCredentialResponse(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.INSTANCE.extractGetCredentialResponse(intent) : Api23Impl.INSTANCE.extractGetCredentialResponse(intent);
        }

        @JvmStatic
        @Nullable
        public final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.INSTANCE.retrieveProviderCreateCredentialRequest(intent) : Api23Impl.INSTANCE.retrieveProviderCreateCredentialRequest(intent);
        }

        @JvmStatic
        @Nullable
        public final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.INSTANCE.retrieveProviderGetCredentialRequest(intent) : Api23Impl.INSTANCE.retrieveProviderGetCredentialRequest(intent);
        }

        @JvmStatic
        public final void setBeginGetCredentialResponse(@NotNull Intent intent, @NotNull BeginGetCredentialResponse response) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(response, "response");
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.INSTANCE.setBeginGetCredentialResponse(intent, response);
            } else {
                Api23Impl.INSTANCE.setBeginGetCredentialResponse(intent, response);
            }
        }

        @JvmStatic
        public final void setCreateCredentialException(@NotNull Intent intent, @NotNull CreateCredentialException exception) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(exception, "exception");
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.INSTANCE.setCreateCredentialException(intent, exception);
            } else {
                Api23Impl.INSTANCE.setCreateCredentialException(intent, exception);
            }
        }

        @JvmStatic
        public final void setCreateCredentialResponse(@NotNull Intent intent, @NotNull CreateCredentialResponse response) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(response, "response");
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.INSTANCE.setCreateCredentialResponse(intent, response);
            } else {
                Api23Impl.INSTANCE.setCreateCredentialResponse(intent, response);
            }
        }

        @JvmStatic
        public final void setGetCredentialException(@NotNull Intent intent, @NotNull GetCredentialException exception) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(exception, "exception");
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.INSTANCE.setGetCredentialException(intent, exception);
            } else {
                Api23Impl.INSTANCE.setGetCredentialException(intent, exception);
            }
        }

        @JvmStatic
        public final void setGetCredentialResponse(@NotNull Intent intent, @NotNull GetCredentialResponse response) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(response, "response");
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.INSTANCE.setGetCredentialResponse(intent, response);
            } else {
                Api23Impl.INSTANCE.setGetCredentialResponse(intent, response);
            }
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final CreateCredentialResponse retrieveCreateCredentialResponse(@NotNull String type, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.INSTANCE.extractCreateCredentialResponse(type, intent);
            }
            return Api23Impl.INSTANCE.extractCreateCredentialResponse(intent);
        }
    }

    @JvmStatic
    @Nullable
    public static final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(@NotNull Intent intent) {
        return INSTANCE.retrieveBeginGetCredentialRequest(intent);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public static final CreateCredentialException retrieveCreateCredentialException(@NotNull Intent intent) {
        return INSTANCE.retrieveCreateCredentialException(intent);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public static final CreateCredentialResponse retrieveCreateCredentialResponse(@NotNull String str, @NotNull Intent intent) {
        return INSTANCE.retrieveCreateCredentialResponse(str, intent);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public static final GetCredentialException retrieveGetCredentialException(@NotNull Intent intent) {
        return INSTANCE.retrieveGetCredentialException(intent);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public static final GetCredentialResponse retrieveGetCredentialResponse(@NotNull Intent intent) {
        return INSTANCE.retrieveGetCredentialResponse(intent);
    }

    @JvmStatic
    @Nullable
    public static final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(@NotNull Intent intent) {
        return INSTANCE.retrieveProviderCreateCredentialRequest(intent);
    }

    @JvmStatic
    @Nullable
    public static final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(@NotNull Intent intent) {
        return INSTANCE.retrieveProviderGetCredentialRequest(intent);
    }

    @JvmStatic
    public static final void setBeginGetCredentialResponse(@NotNull Intent intent, @NotNull BeginGetCredentialResponse beginGetCredentialResponse) {
        INSTANCE.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
    }

    @JvmStatic
    public static final void setCreateCredentialException(@NotNull Intent intent, @NotNull CreateCredentialException createCredentialException) {
        INSTANCE.setCreateCredentialException(intent, createCredentialException);
    }

    @JvmStatic
    public static final void setCreateCredentialResponse(@NotNull Intent intent, @NotNull CreateCredentialResponse createCredentialResponse) {
        INSTANCE.setCreateCredentialResponse(intent, createCredentialResponse);
    }

    @JvmStatic
    public static final void setGetCredentialException(@NotNull Intent intent, @NotNull GetCredentialException getCredentialException) {
        INSTANCE.setGetCredentialException(intent, getCredentialException);
    }

    @JvmStatic
    public static final void setGetCredentialResponse(@NotNull Intent intent, @NotNull GetCredentialResponse getCredentialResponse) {
        INSTANCE.setGetCredentialResponse(intent, getCredentialResponse);
    }
}
