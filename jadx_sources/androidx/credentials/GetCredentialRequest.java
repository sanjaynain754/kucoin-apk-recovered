package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.kubi.p110rn.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GetCredentialRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017BC\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0018"}, m90084d2 = {"Landroidx/credentials/GetCredentialRequest;", "", "credentialOptions", "", "Landroidx/credentials/CredentialOption;", "origin", "", "preferIdentityDocUi", "", "preferUiBrandingComponentName", "Landroid/content/ComponentName;", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLandroid/content/ComponentName;Z)V", "getCredentialOptions", "()Ljava/util/List;", "getOrigin", "()Ljava/lang/String;", "getPreferIdentityDocUi", "()Z", "getPreferUiBrandingComponentName", "()Landroid/content/ComponentName;", "Builder", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGetCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCredentialRequest.kt\nandroidx/credentials/GetCredentialRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,276:1\n1#2:277\n1788#3,4:278\n*S KotlinDebug\n*F\n+ 1 GetCredentialRequest.kt\nandroidx/credentials/GetCredentialRequest\n*L\n81#1:278,4\n*E\n"})
public final class GetCredentialRequest {

    @NotNull
    private static final String BUNDLE_KEY_PREFER_IDENTITY_DOC_UI = "androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI";

    @NotNull
    public static final String BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS = "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS";

    @NotNull
    private static final String BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME = "androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<CredentialOption> credentialOptions;

    @Nullable
    private final String origin;
    private final boolean preferIdentityDocUi;
    private final boolean preferImmediatelyAvailableCredentials;

    @Nullable
    private final ComponentName preferUiBrandingComponentName;

    /* JADX INFO: compiled from: GetCredentialRequest.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0006J\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\u0018R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Landroidx/credentials/GetCredentialRequest$Builder;", "", "<init>", "()V", "credentialOptions", "", "Landroidx/credentials/CredentialOption;", "origin", "", "preferIdentityDocUi", "", "preferImmediatelyAvailableCredentials", "preferUiBrandingComponentName", "Landroid/content/ComponentName;", "addCredentialOption", "credentialOption", "setCredentialOptions", "", "setOrigin", "setPreferImmediatelyAvailableCredentials", "setPreferUiBrandingComponentName", Constants.COMPONENT, "setPreferIdentityDocUi", "build", "Landroidx/credentials/GetCredentialRequest;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Builder {

        @NotNull
        private List<CredentialOption> credentialOptions = new ArrayList();

        @Nullable
        private String origin;
        private boolean preferIdentityDocUi;
        private boolean preferImmediatelyAvailableCredentials;

        @Nullable
        private ComponentName preferUiBrandingComponentName;

        @NotNull
        public final Builder addCredentialOption(@NotNull CredentialOption credentialOption) {
            Intrinsics.checkNotNullParameter(credentialOption, "credentialOption");
            this.credentialOptions.add(credentialOption);
            return this;
        }

        @NotNull
        public final GetCredentialRequest build() {
            return new GetCredentialRequest(CollectionsKt.toList(this.credentialOptions), this.origin, this.preferIdentityDocUi, this.preferUiBrandingComponentName, this.preferImmediatelyAvailableCredentials);
        }

        @NotNull
        public final Builder setCredentialOptions(@NotNull List<? extends CredentialOption> credentialOptions) {
            Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
            this.credentialOptions = CollectionsKt.toMutableList((Collection) credentialOptions);
            return this;
        }

        @NotNull
        public final Builder setPreferIdentityDocUi(boolean preferIdentityDocUi) {
            this.preferIdentityDocUi = preferIdentityDocUi;
            return this;
        }

        @NotNull
        public final Builder setPreferImmediatelyAvailableCredentials(boolean preferImmediatelyAvailableCredentials) {
            this.preferImmediatelyAvailableCredentials = preferImmediatelyAvailableCredentials;
            return this;
        }

        @NotNull
        public final Builder setPreferUiBrandingComponentName(@Nullable ComponentName component) {
            this.preferUiBrandingComponentName = component;
            return this;
        }

        @NotNull
        public final Builder setOrigin(@NotNull String origin) {
            Intrinsics.checkNotNullParameter(origin, "origin");
            this.origin = origin;
            return this;
        }
    }

    /* JADX INFO: compiled from: GetCredentialRequest.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\rH\u0007J(\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Landroidx/credentials/GetCredentialRequest$Companion;", "", "<init>", "()V", "BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", "", "BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", "BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", "getRequestMetadataBundle", "Landroid/os/Bundle;", "request", "Landroidx/credentials/GetCredentialRequest;", "createFrom", "Landroid/credentials/GetCredentialRequest;", "credentialOptions", "", "Landroidx/credentials/CredentialOption;", "origin", "metadata", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGetCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCredentialRequest.kt\nandroidx/credentials/GetCredentialRequest$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,276:1\n1563#2:277\n1634#2,3:278\n*S KotlinDebug\n*F\n+ 1 GetCredentialRequest.kt\nandroidx/credentials/GetCredentialRequest$Companion\n*L\n226#1:277\n226#1:278,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @RequiresApi(34)
        @NotNull
        public final GetCredentialRequest createFrom(@NotNull android.credentials.GetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            List credentialOptions = request.getCredentialOptions();
            Intrinsics.checkNotNullExpressionValue(credentialOptions, "getCredentialOptions(...)");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(credentialOptions, 10));
            Iterator it = credentialOptions.iterator();
            while (it.hasNext()) {
                android.credentials.CredentialOption credentialOptionM2639a = C1976f1.m2639a(it.next());
                CredentialOption.Companion companion = CredentialOption.INSTANCE;
                Intrinsics.checkNotNull(credentialOptionM2639a);
                arrayList.add(companion.createFrom(credentialOptionM2639a));
            }
            String origin = request.getOrigin();
            Bundle data = request.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return createFrom(arrayList, origin, data);
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final Bundle getRequestMetadataBundle(@NotNull GetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Bundle bundle = new Bundle();
            bundle.putBoolean(GetCredentialRequest.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI, request.getPreferIdentityDocUi());
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", request.getPreferImmediatelyAvailableCredentials());
            bundle.putParcelable(GetCredentialRequest.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME, request.getPreferUiBrandingComponentName());
            return bundle;
        }

        @JvmStatic
        @NotNull
        public final GetCredentialRequest createFrom(@NotNull List<? extends CredentialOption> credentialOptions, @Nullable String origin, @NotNull Bundle metadata) throws FrameworkClassParsingException {
            Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            try {
                boolean z11 = metadata.getBoolean(GetCredentialRequest.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI);
                Builder preferImmediatelyAvailableCredentials = new Builder().setCredentialOptions(credentialOptions).setPreferIdentityDocUi(z11).setPreferUiBrandingComponentName((ComponentName) metadata.getParcelable(GetCredentialRequest.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME)).setPreferImmediatelyAvailableCredentials(metadata.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS"));
                if (origin != null) {
                    preferImmediatelyAvailableCredentials.setOrigin(origin);
                }
                return preferImmediatelyAvailableCredentials.build();
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetCredentialRequest(@NotNull List<? extends CredentialOption> credentialOptions) {
        this(credentialOptions, null, false, null, false, 30, null);
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
    }

    @JvmStatic
    @RequiresApi(34)
    @NotNull
    public static final GetCredentialRequest createFrom(@NotNull android.credentials.GetCredentialRequest getCredentialRequest) {
        return INSTANCE.createFrom(getCredentialRequest);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetCredentialRequest(@NotNull List<? extends CredentialOption> credentialOptions, @Nullable String str) {
        this(credentialOptions, str, false, null, false, 28, null);
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
    }

    @JvmStatic
    @NotNull
    public static final GetCredentialRequest createFrom(@NotNull List<? extends CredentialOption> list, @Nullable String str, @NotNull Bundle bundle) {
        return INSTANCE.createFrom(list, str, bundle);
    }

    @JvmStatic
    @NotNull
    public static final Bundle getRequestMetadataBundle(@NotNull GetCredentialRequest getCredentialRequest) {
        return INSTANCE.getRequestMetadataBundle(getCredentialRequest);
    }

    @NotNull
    public final List<CredentialOption> getCredentialOptions() {
        return this.credentialOptions;
    }

    @Nullable
    public final String getOrigin() {
        return this.origin;
    }

    public final boolean getPreferIdentityDocUi() {
        return this.preferIdentityDocUi;
    }

    @Nullable
    public final ComponentName getPreferUiBrandingComponentName() {
        return this.preferUiBrandingComponentName;
    }

    @JvmName(name = "preferImmediatelyAvailableCredentials")
    /* JADX INFO: renamed from: preferImmediatelyAvailableCredentials, reason: from getter */
    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetCredentialRequest(@NotNull List<? extends CredentialOption> credentialOptions, @Nullable String str, boolean z11) {
        this(credentialOptions, str, z11, null, false, 24, null);
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GetCredentialRequest(@NotNull List<? extends CredentialOption> credentialOptions, @Nullable String str, boolean z11, @Nullable ComponentName componentName) {
        this(credentialOptions, str, z11, componentName, false, 16, null);
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public GetCredentialRequest(@NotNull List<? extends CredentialOption> credentialOptions, @Nullable String str, boolean z11, @Nullable ComponentName componentName, boolean z12) {
        Intrinsics.checkNotNullParameter(credentialOptions, "credentialOptions");
        this.credentialOptions = credentialOptions;
        this.origin = str;
        this.preferIdentityDocUi = z11;
        this.preferUiBrandingComponentName = componentName;
        this.preferImmediatelyAvailableCredentials = z12;
        if (!credentialOptions.isEmpty()) {
            if (credentialOptions.size() > 1) {
                int i11 = 0;
                if (credentialOptions == 0 || !credentialOptions.isEmpty()) {
                    Iterator it = credentialOptions.iterator();
                    while (it.hasNext()) {
                        if ((((CredentialOption) it.next()) instanceof GetDigitalCredentialOption) && (i11 = i11 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                if (i11 > 0 && i11 != this.credentialOptions.size()) {
                    throw new IllegalArgumentException("Digital Credential Option cannot be used with other credential option.");
                }
                Iterator<CredentialOption> it2 = this.credentialOptions.iterator();
                while (it2.hasNext()) {
                    if (it2.next() instanceof GetRestoreCredentialOption) {
                        throw new IllegalArgumentException("Only a single GetRestoreCredentialOption should be provided.");
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("credentialOptions should not be empty");
    }

    public /* synthetic */ GetCredentialRequest(List list, String str, boolean z11, ComponentName componentName, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : componentName, (i11 & 16) != 0 ? false : z12);
    }
}
