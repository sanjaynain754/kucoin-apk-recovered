package androidx.credentials;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.internal.FrameworkClassParsingException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CreateCredentialRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aBK\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\r\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0015¨\u0006\u001b"}, m90084d2 = {"Landroidx/credentials/CreateCredentialRequest;", "", "type", "", "credentialData", "Landroid/os/Bundle;", "candidateQueryData", "isSystemProviderRequired", "", "isAutoSelectAllowed", "displayInfo", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "origin", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLandroidx/credentials/CreateCredentialRequest$DisplayInfo;Ljava/lang/String;Z)V", "getType", "()Ljava/lang/String;", "getCredentialData", "()Landroid/os/Bundle;", "getCandidateQueryData", "()Z", "getDisplayInfo", "()Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "getOrigin", "DisplayInfo", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class CreateCredentialRequest {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final String BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED = "androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final String BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS = "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Bundle candidateQueryData;

    @NotNull
    private final Bundle credentialData;

    @NotNull
    private final DisplayInfo displayInfo;
    private final boolean isAutoSelectAllowed;
    private final boolean isSystemProviderRequired;

    @Nullable
    private final String origin;
    private final boolean preferImmediatelyAvailableCredentials;

    @NotNull
    private final String type;

    /* JADX INFO: compiled from: CreateCredentialRequest.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Landroidx/credentials/CreateCredentialRequest$Companion;", "", "<init>", "()V", "BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", "", "BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", "createFrom", "Landroidx/credentials/CreateCredentialRequest;", "request", "Landroid/credentials/CreateCredentialRequest;", "type", "credentialData", "Landroid/os/Bundle;", "candidateQueryData", "requireSystemProvider", "", "origin", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        @JvmOverloads
        @RequiresApi(23)
        public final CreateCredentialRequest createFrom(@NotNull String type, @NotNull Bundle credentialData, @NotNull Bundle candidateQueryData, boolean z11) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(credentialData, "credentialData");
            Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
            return createFrom$default(this, type, credentialData, candidateQueryData, z11, null, 16, null);
        }

        private Companion() {
        }

        public static /* synthetic */ CreateCredentialRequest createFrom$default(Companion companion, String str, Bundle bundle, Bundle bundle2, boolean z11, String str2, int i11, Object obj) {
            if ((i11 & 16) != 0) {
                str2 = null;
            }
            return companion.createFrom(str, bundle, bundle2, z11, str2);
        }

        @JvmStatic
        @RequiresApi(34)
        @NotNull
        public final CreateCredentialRequest createFrom(@NotNull android.credentials.CreateCredentialRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            String type = request.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Bundle credentialData = request.getCredentialData();
            Intrinsics.checkNotNullExpressionValue(credentialData, "getCredentialData(...)");
            Bundle candidateQueryData = request.getCandidateQueryData();
            Intrinsics.checkNotNullExpressionValue(candidateQueryData, "getCandidateQueryData(...)");
            return createFrom(type, credentialData, candidateQueryData, request.isSystemProviderRequired(), request.getOrigin());
        }

        @JvmStatic
        @NotNull
        @JvmOverloads
        @RequiresApi(23)
        public final CreateCredentialRequest createFrom(@NotNull String type, @NotNull Bundle credentialData, @NotNull Bundle candidateQueryData, boolean requireSystemProvider, @Nullable String origin) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(credentialData, "credentialData");
            Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
            try {
                int iHashCode = type.hashCode();
                if (iHashCode != -1678407252) {
                    if (iHashCode != -543568185) {
                        if (iHashCode == -95037569 && type.equals(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                            String string = credentialData.getString(PublicKeyCredential.BUNDLE_KEY_SUBTYPE);
                            if (string != null && string.hashCode() == 589054771 && string.equals(CreatePublicKeyCredentialRequest.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST)) {
                                return CreatePublicKeyCredentialRequest.INSTANCE.createFrom$credentials(credentialData, origin, candidateQueryData);
                            }
                            throw new FrameworkClassParsingException();
                        }
                    } else if (type.equals(PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                        return CreatePasswordRequest.INSTANCE.createFrom$credentials(credentialData, origin, candidateQueryData);
                    }
                } else if (type.equals(DigitalCredential.TYPE_DIGITAL_CREDENTIAL)) {
                    return CreateDigitalCredentialRequest.Companion.createFrom$credentials(credentialData, origin, candidateQueryData);
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new CreateCustomCredentialRequest(type, credentialData, candidateQueryData, requireSystemProvider, DisplayInfo.INSTANCE.createFrom(credentialData), credentialData.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), origin, credentialData.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false));
            }
        }
    }

    /* JADX INFO: compiled from: CreateCredentialRequest.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\u000bB%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\fJ\b\u0010\u0014\u001a\u00020\u0015H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m90084d2 = {"Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "", "userId", "", "userDisplayName", "credentialTypeIcon", "Landroid/graphics/drawable/Icon;", "preferDefaultProvider", "", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/drawable/Icon;Ljava/lang/String;)V", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/CharSequence;", "getUserDisplayName", "getCredentialTypeIcon", "()Landroid/graphics/drawable/Icon;", "getPreferDefaultProvider", "()Ljava/lang/String;", "toBundle", "Landroid/os/Bundle;", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCreateCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateCredentialRequest.kt\nandroidx/credentials/CreateCredentialRequest$DisplayInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n1#2:306\n*E\n"})
    public static final class DisplayInfo {

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final String BUNDLE_KEY_CREDENTIAL_TYPE_ICON = "androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON";

        @NotNull
        public static final String BUNDLE_KEY_DEFAULT_PROVIDER = "androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER";

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final String BUNDLE_KEY_REQUEST_DISPLAY_INFO = "androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO";

        @NotNull
        public static final String BUNDLE_KEY_USER_DISPLAY_NAME = "androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME";

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final String BUNDLE_KEY_USER_ID = "androidx.credentials.BUNDLE_KEY_USER_ID";

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Icon credentialTypeIcon;

        @Nullable
        private final String preferDefaultProvider;

        @Nullable
        private final CharSequence userDisplayName;

        @NotNull
        private final CharSequence userId;

        /* JADX INFO: compiled from: CreateCredentialRequest.kt */
        @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Landroidx/credentials/CreateCredentialRequest$DisplayInfo$Companion;", "", "<init>", "()V", "BUNDLE_KEY_REQUEST_DISPLAY_INFO", "", "BUNDLE_KEY_USER_ID", "BUNDLE_KEY_USER_DISPLAY_NAME", "BUNDLE_KEY_CREDENTIAL_TYPE_ICON", "BUNDLE_KEY_DEFAULT_PROVIDER", "createFrom", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "from", "Landroid/os/Bundle;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            @RequiresApi(23)
            @NotNull
            public final DisplayInfo createFrom(@NotNull Bundle from) {
                Intrinsics.checkNotNullParameter(from, "from");
                try {
                    Bundle bundle = from.getBundle(DisplayInfo.BUNDLE_KEY_REQUEST_DISPLAY_INFO);
                    Intrinsics.checkNotNull(bundle);
                    CharSequence charSequence = bundle.getCharSequence(DisplayInfo.BUNDLE_KEY_USER_ID);
                    CharSequence charSequence2 = bundle.getCharSequence(DisplayInfo.BUNDLE_KEY_USER_DISPLAY_NAME);
                    Icon icon = (Icon) bundle.getParcelable(DisplayInfo.BUNDLE_KEY_CREDENTIAL_TYPE_ICON);
                    String string = bundle.getString(DisplayInfo.BUNDLE_KEY_DEFAULT_PROVIDER);
                    Intrinsics.checkNotNull(charSequence);
                    return new DisplayInfo(charSequence, charSequence2, icon, string);
                } catch (Exception e11) {
                    throw new IllegalArgumentException(e11);
                }
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        public DisplayInfo(@NotNull CharSequence userId) {
            this(userId, (CharSequence) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            Intrinsics.checkNotNullParameter(userId, "userId");
        }

        public DisplayInfo(@NotNull CharSequence userId, @Nullable CharSequence charSequence, @Nullable Icon icon, @Nullable String str) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.userId = userId;
            this.userDisplayName = charSequence;
            this.credentialTypeIcon = icon;
            this.preferDefaultProvider = str;
            if (userId.length() <= 0) {
                throw new IllegalArgumentException("userId should not be empty");
            }
        }

        @JvmStatic
        @RequiresApi(23)
        @NotNull
        public static final DisplayInfo createFrom(@NotNull Bundle bundle) {
            return INSTANCE.createFrom(bundle);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final Icon getCredentialTypeIcon() {
            return this.credentialTypeIcon;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final String getPreferDefaultProvider() {
            return this.preferDefaultProvider;
        }

        @Nullable
        public final CharSequence getUserDisplayName() {
            return this.userDisplayName;
        }

        @NotNull
        public final CharSequence getUserId() {
            return this.userId;
        }

        @RequiresApi(23)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putCharSequence(BUNDLE_KEY_USER_ID, this.userId);
            if (!TextUtils.isEmpty(this.userDisplayName)) {
                bundle.putCharSequence(BUNDLE_KEY_USER_DISPLAY_NAME, this.userDisplayName);
            }
            if (!TextUtils.isEmpty(this.preferDefaultProvider)) {
                bundle.putString(BUNDLE_KEY_DEFAULT_PROVIDER, this.preferDefaultProvider);
            }
            return bundle;
        }

        public /* synthetic */ DisplayInfo(CharSequence charSequence, CharSequence charSequence2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(charSequence, (i11 & 2) != 0 ? null : charSequence2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public DisplayInfo(@NotNull CharSequence userId, @Nullable CharSequence charSequence) {
            this(userId, charSequence, (Icon) null, (String) null);
            Intrinsics.checkNotNullParameter(userId, "userId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DisplayInfo(@NotNull CharSequence userId, @Nullable CharSequence charSequence, @Nullable String str) {
            this(userId, charSequence, (Icon) null, str);
            Intrinsics.checkNotNullParameter(userId, "userId");
        }
    }

    @JvmStatic
    @RequiresApi(34)
    @NotNull
    public static final CreateCredentialRequest createFrom(@NotNull android.credentials.CreateCredentialRequest createCredentialRequest) {
        return INSTANCE.createFrom(createCredentialRequest);
    }

    @JvmStatic
    @NotNull
    @JvmOverloads
    @RequiresApi(23)
    public static final CreateCredentialRequest createFrom(@NotNull String str, @NotNull Bundle bundle, @NotNull Bundle bundle2, boolean z11) {
        return INSTANCE.createFrom(str, bundle, bundle2, z11);
    }

    @NotNull
    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    @NotNull
    public final Bundle getCredentialData() {
        return this.credentialData;
    }

    @NotNull
    public final DisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    @Nullable
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isAutoSelectAllowed, reason: from getter */
    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    /* JADX INFO: renamed from: isSystemProviderRequired, reason: from getter */
    public final boolean getIsSystemProviderRequired() {
        return this.isSystemProviderRequired;
    }

    @JvmName(name = "preferImmediatelyAvailableCredentials")
    /* JADX INFO: renamed from: preferImmediatelyAvailableCredentials, reason: from getter */
    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    public CreateCredentialRequest(@NotNull String type, @NotNull Bundle credentialData, @NotNull Bundle candidateQueryData, boolean z11, boolean z12, @NotNull DisplayInfo displayInfo, @Nullable String str, boolean z13) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(credentialData, "credentialData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(displayInfo, "displayInfo");
        this.type = type;
        this.credentialData = credentialData;
        this.candidateQueryData = candidateQueryData;
        this.isSystemProviderRequired = z11;
        this.isAutoSelectAllowed = z12;
        this.displayInfo = displayInfo;
        this.origin = str;
        this.preferImmediatelyAvailableCredentials = z13;
        credentialData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z12);
        credentialData.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z13);
        candidateQueryData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z12);
    }

    @JvmStatic
    @NotNull
    @JvmOverloads
    @RequiresApi(23)
    public static final CreateCredentialRequest createFrom(@NotNull String str, @NotNull Bundle bundle, @NotNull Bundle bundle2, boolean z11, @Nullable String str2) {
        return INSTANCE.createFrom(str, bundle, bundle2, z11, str2);
    }
}
