package androidx.credentials.internal;

import android.annotation.SuppressLint;
import android.credentials.Credential;
import android.credentials.GetCredentialRequest;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.C1972e0;
import androidx.credentials.C1975f0;
import androidx.credentials.C1978g0;
import androidx.credentials.C1981h0;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialResponse;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FrameworkImplHelper.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(34)
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Landroidx/credentials/internal/FrameworkImplHelper;", "", "<init>", "()V", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class FrameworkImplHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: FrameworkImplHelper.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, m90084d2 = {"Landroidx/credentials/internal/FrameworkImplHelper$Companion;", "", "<init>", "()V", "convertGetResponseToJetpackClass", "Landroidx/credentials/GetCredentialResponse;", "response", "Landroid/credentials/GetCredentialResponse;", "convertGetRequestToFrameworkClass", "Landroid/credentials/GetCredentialRequest;", "request", "Landroidx/credentials/GetCredentialRequest;", "setOriginForGetRequest", "", "builder", "Landroid/credentials/GetCredentialRequest$Builder;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFrameworkImplHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkImplHelper.kt\nandroidx/credentials/internal/FrameworkImplHelper$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1869#2,2:81\n*S KotlinDebug\n*F\n+ 1 FrameworkImplHelper.kt\nandroidx/credentials/internal/FrameworkImplHelper$Companion\n*L\n50#1:81,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @RequiresApi(34)
        @NotNull
        public final GetCredentialRequest convertGetRequestToFrameworkClass(@NotNull androidx.credentials.GetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            C1978g0.m2641a();
            GetCredentialRequest.Builder builderM2635a = C1972e0.m2635a(androidx.credentials.GetCredentialRequest.INSTANCE.getRequestMetadataBundle(request));
            for (CredentialOption credentialOption : request.getCredentialOptions()) {
                C1981h0.m2643a();
                builderM2635a.addCredentialOption(C1975f0.m2638a(credentialOption.getType(), credentialOption.getRequestData(), credentialOption.getCandidateQueryData()).setIsSystemProviderRequired(credentialOption.getIsSystemProviderRequired()).setAllowedProviders(credentialOption.getAllowedProviders()).build());
            }
            setOriginForGetRequest(request, builderM2635a);
            GetCredentialRequest getCredentialRequestBuild = builderM2635a.build();
            Intrinsics.checkNotNullExpressionValue(getCredentialRequestBuild, "build(...)");
            return getCredentialRequestBuild;
        }

        @JvmStatic
        @RequiresApi(34)
        @NotNull
        public final GetCredentialResponse convertGetResponseToJetpackClass(@NotNull android.credentials.GetCredentialResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Credential credential = response.getCredential();
            Intrinsics.checkNotNullExpressionValue(credential, "getCredential(...)");
            androidx.credentials.Credential.Companion companion = androidx.credentials.Credential.INSTANCE;
            String type = credential.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Bundle data = credential.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return new GetCredentialResponse(companion.createFrom(type, data));
        }

        @JvmStatic
        @SuppressLint({"MissingPermission"})
        @VisibleForTesting
        @RequiresApi(34)
        public final void setOriginForGetRequest(@NotNull androidx.credentials.GetCredentialRequest request, @NotNull GetCredentialRequest.Builder builder) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (request.getOrigin() != null) {
                builder.setOrigin(request.getOrigin());
            }
        }
    }

    @JvmStatic
    @RequiresApi(34)
    @NotNull
    public static final GetCredentialRequest convertGetRequestToFrameworkClass(@NotNull androidx.credentials.GetCredentialRequest getCredentialRequest) {
        return INSTANCE.convertGetRequestToFrameworkClass(getCredentialRequest);
    }

    @JvmStatic
    @RequiresApi(34)
    @NotNull
    public static final GetCredentialResponse convertGetResponseToJetpackClass(@NotNull android.credentials.GetCredentialResponse getCredentialResponse) {
        return INSTANCE.convertGetResponseToJetpackClass(getCredentialResponse);
    }

    @JvmStatic
    @SuppressLint({"MissingPermission"})
    @VisibleForTesting
    @RequiresApi(34)
    public static final void setOriginForGetRequest(@NotNull androidx.credentials.GetCredentialRequest getCredentialRequest, @NotNull GetCredentialRequest.Builder builder) {
        INSTANCE.setOriginForGetRequest(getCredentialRequest, builder);
    }
}
