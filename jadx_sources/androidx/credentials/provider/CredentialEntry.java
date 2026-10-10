package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CredentialEntry.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u0000 \u001c2\u00020\u0001:\u0004\u0019\u001a\u001b\u001cBA\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, m90084d2 = {"Landroidx/credentials/provider/CredentialEntry;", "", "type", "", "beginGetCredentialOption", "Landroidx/credentials/provider/BeginGetCredentialOption;", "entryGroupId", "", "isDefaultIconPreferredAsSingleProvider", "", "affiliatedDomain", "biometricPromptData", "Landroidx/credentials/provider/BiometricPromptData;", "<init>", "(Ljava/lang/String;Landroidx/credentials/provider/BeginGetCredentialOption;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Landroidx/credentials/provider/BiometricPromptData;)V", "getType", "()Ljava/lang/String;", "getBeginGetCredentialOption", "()Landroidx/credentials/provider/BeginGetCredentialOption;", "getEntryGroupId", "()Ljava/lang/CharSequence;", "()Z", "getAffiliatedDomain", "getBiometricPromptData", "()Landroidx/credentials/provider/BiometricPromptData;", "Api34Impl", "Api35Impl", "Api28Impl", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class CredentialEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_";

    @NotNull
    public static final String EXTRA_CREDENTIAL_ENTRY_ENTRY_GROUP_ID_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_ENTRY_GROUP_ID_";

    @NotNull
    public static final String EXTRA_CREDENTIAL_ENTRY_ENTRY_TYPE_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_TYPE_";

    @NotNull
    public static final String EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX = "androidx.credentials.provider.extra.HAS_DEFAULT_ICON_";

    @NotNull
    public static final String EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX = "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_FROM_OPTION_";

    @NotNull
    public static final String EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX = "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_";

    /* JADX INFO: renamed from: EXTRA_CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_PREFIX */
    @NotNull
    public static final String f2625xa327c1a7 = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_";

    @NotNull
    public static final String EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_MILLIS_PREFIX = "androidx.credentials.provider.extra.LAST_USED_TIME_MILLIS_";

    @NotNull
    public static final String EXTRA_CREDENTIAL_ENTRY_OPTION_DATA_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_DATA_";

    @NotNull
    public static final String EXTRA_CREDENTIAL_ENTRY_OPTION_ID_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_ID_";

    @NotNull
    public static final String EXTRA_CREDENTIAL_ENTRY_OPTION_TYPE_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_";

    @NotNull
    public static final String EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX = "androidx.credentials.provider.extra.PENDING_INTENT_";

    @NotNull
    public static final String EXTRA_CREDENTIAL_ENTRY_SIZE = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_SIZE";

    @NotNull
    public static final String EXTRA_CREDENTIAL_SUBTITLE_PREFIX = "androidx.credentials.provider.extra.SUBTITLE_";

    @NotNull
    public static final String EXTRA_CREDENTIAL_TITLE_PREFIX = "androidx.credentials.provider.extra.TITLE_";

    @NotNull
    public static final String EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX = "androidx.credentials.provider.extra.TYPE_DISPLAY_NAME_";

    @NotNull
    public static final String EXTRA_CREDENTIAL_TYPE_ICON_PREFIX = "androidx.credentials.provider.extra.ICON_";

    @NotNull
    public static final String FALSE_STRING = "false";
    public static final int REVISION_ID = 1;

    @NotNull
    public static final String SLICE_HINT_AFFILIATED_DOMAIN = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN";

    @NotNull
    public static final String SLICE_HINT_ALLOWED_AUTHENTICATORS = "androidx.credentials.provider.credentialEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS";

    @NotNull
    public static final String SLICE_HINT_AUTO_ALLOWED = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED";

    @NotNull
    public static final String SLICE_HINT_AUTO_SELECT_FROM_OPTION = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION";

    @NotNull
    public static final String SLICE_HINT_BIOMETRIC_PROMPT_DATA = "androidx.credentials.provider.credentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA";

    @NotNull
    public static final String SLICE_HINT_CRYPTO_OP_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_CRYPTO_OP_ID";

    @NotNull
    public static final String SLICE_HINT_DEDUPLICATION_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID";

    @NotNull
    public static final String SLICE_HINT_DEFAULT_ICON_RES_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID";

    @NotNull
    public static final String SLICE_HINT_ICON = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON";

    @NotNull
    public static final String SLICE_HINT_IS_DEFAULT_ICON_PREFERRED = "androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED";

    @NotNull
    public static final String SLICE_HINT_LAST_USED_TIME_MILLIS = "androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS";

    @NotNull
    public static final String SLICE_HINT_OPTION_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID";

    @NotNull
    public static final String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT";

    @NotNull
    public static final String SLICE_HINT_SUBTITLE = "androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME";

    @NotNull
    public static final String SLICE_HINT_TITLE = "androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME";

    @NotNull
    public static final String SLICE_HINT_TYPE_DISPLAY_NAME = "androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME";

    @NotNull
    public static final String TRUE_STRING = "true";

    @Nullable
    private final CharSequence affiliatedDomain;

    @NotNull
    private final BeginGetCredentialOption beginGetCredentialOption;

    @Nullable
    private final BiometricPromptData biometricPromptData;

    @NotNull
    private final CharSequence entryGroupId;
    private final boolean isDefaultIconPreferredAsSingleProvider;

    @NotNull
    private final String type;

    /* JADX INFO: compiled from: CredentialEntry.kt */
    @RequiresApi(28)
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, m90084d2 = {"Landroidx/credentials/provider/CredentialEntry$Api28Impl;", "", "<init>", "()V", "toSlice", "Landroid/app/slice/Slice;", "entry", "Landroidx/credentials/provider/CredentialEntry;", "fromSlice", "slice", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api28Impl {

        @NotNull
        public static final Api28Impl INSTANCE = new Api28Impl();

        @JvmStatic
        @Nullable
        public static final Slice toSlice(@NotNull CredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (entry instanceof PasswordCredentialEntry) {
                return PasswordCredentialEntry.INSTANCE.toSlice((PasswordCredentialEntry) entry);
            }
            if (entry instanceof PublicKeyCredentialEntry) {
                return PublicKeyCredentialEntry.INSTANCE.toSlice((PublicKeyCredentialEntry) entry);
            }
            if (entry instanceof CustomCredentialEntry) {
                return CustomCredentialEntry.INSTANCE.toSlice((CustomCredentialEntry) entry);
            }
            return null;
        }

        private Api28Impl() {
        }

        @JvmStatic
        @SuppressLint({"WrongConstant"})
        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static final CredentialEntry fromSlice(@NotNull Slice slice) {
            String type;
            Intrinsics.checkNotNullParameter(slice, "slice");
            try {
                SliceSpec spec = slice.getSpec();
                if (spec != null) {
                    type = spec.getType();
                } else {
                    type = null;
                }
                if (Intrinsics.areEqual(type, PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                    PasswordCredentialEntry passwordCredentialEntryFromSlice = PasswordCredentialEntry.INSTANCE.fromSlice(slice);
                    Intrinsics.checkNotNull(passwordCredentialEntryFromSlice);
                    return passwordCredentialEntryFromSlice;
                }
                if (Intrinsics.areEqual(type, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                    PublicKeyCredentialEntry publicKeyCredentialEntryFromSlice = PublicKeyCredentialEntry.INSTANCE.fromSlice(slice);
                    Intrinsics.checkNotNull(publicKeyCredentialEntryFromSlice);
                    return publicKeyCredentialEntryFromSlice;
                }
                CustomCredentialEntry customCredentialEntryFromSlice = CustomCredentialEntry.INSTANCE.fromSlice(slice);
                Intrinsics.checkNotNull(customCredentialEntryFromSlice);
                return customCredentialEntryFromSlice;
            } catch (Exception unused) {
                return CustomCredentialEntry.INSTANCE.fromSlice(slice);
            }
        }
    }

    /* JADX INFO: compiled from: CredentialEntry.kt */
    @RequiresApi(34)
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/provider/CredentialEntry$Api34Impl;", "", "<init>", "()V", "fromCredentialEntry", "Landroidx/credentials/provider/CredentialEntry;", "credentialEntry", "Landroid/service/credentials/CredentialEntry;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        @JvmStatic
        @Nullable
        public static final CredentialEntry fromCredentialEntry(@NotNull android.service.credentials.CredentialEntry credentialEntry) {
            Intrinsics.checkNotNullParameter(credentialEntry, "credentialEntry");
            Slice slice = credentialEntry.getSlice();
            Intrinsics.checkNotNullExpressionValue(slice, "getSlice(...)");
            return CredentialEntry.INSTANCE.fromSlice$credentials(slice);
        }

        private Api34Impl() {
        }
    }

    /* JADX INFO: compiled from: CredentialEntry.kt */
    @RequiresApi(35)
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, m90084d2 = {"Landroidx/credentials/provider/CredentialEntry$Api35Impl;", "", "<init>", "()V", "toSlice", "Landroid/app/slice/Slice;", "entry", "Landroidx/credentials/provider/CredentialEntry;", "fromSlice", "slice", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api35Impl {

        @NotNull
        public static final Api35Impl INSTANCE = new Api35Impl();

        @JvmStatic
        @Nullable
        public static final Slice toSlice(@NotNull CredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (entry instanceof PasswordCredentialEntry) {
                return PasswordCredentialEntry.INSTANCE.toSlice((PasswordCredentialEntry) entry);
            }
            if (entry instanceof PublicKeyCredentialEntry) {
                return PublicKeyCredentialEntry.INSTANCE.toSlice((PublicKeyCredentialEntry) entry);
            }
            if (entry instanceof CustomCredentialEntry) {
                return CustomCredentialEntry.INSTANCE.toSlice((CustomCredentialEntry) entry);
            }
            return null;
        }

        private Api35Impl() {
        }

        @JvmStatic
        @SuppressLint({"WrongConstant"})
        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static final CredentialEntry fromSlice(@NotNull Slice slice) {
            String type;
            Intrinsics.checkNotNullParameter(slice, "slice");
            try {
                SliceSpec spec = slice.getSpec();
                if (spec != null) {
                    type = spec.getType();
                } else {
                    type = null;
                }
                if (Intrinsics.areEqual(type, PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                    PasswordCredentialEntry passwordCredentialEntryFromSlice = PasswordCredentialEntry.INSTANCE.fromSlice(slice);
                    Intrinsics.checkNotNull(passwordCredentialEntryFromSlice);
                    return passwordCredentialEntryFromSlice;
                }
                if (Intrinsics.areEqual(type, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                    PublicKeyCredentialEntry publicKeyCredentialEntryFromSlice = PublicKeyCredentialEntry.INSTANCE.fromSlice(slice);
                    Intrinsics.checkNotNull(publicKeyCredentialEntryFromSlice);
                    return publicKeyCredentialEntryFromSlice;
                }
                CustomCredentialEntry customCredentialEntryFromSlice = CustomCredentialEntry.INSTANCE.fromSlice(slice);
                Intrinsics.checkNotNull(customCredentialEntryFromSlice);
                return customCredentialEntryFromSlice;
            } catch (Exception unused) {
                return CustomCredentialEntry.INSTANCE.fromSlice(slice);
            }
        }
    }

    /* JADX INFO: compiled from: CredentialEntry.kt */
    @Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b J\u0017\u0010!\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020\u001aH\u0001¢\u0006\u0002\b#J\u001a\u00105\u001a\u000206*\b\u0012\u0004\u0012\u00020\u001a072\u0006\u00108\u001a\u000209H\u0007J!\u0010:\u001a\u000206*\u00020\u001a2\u0006\u00108\u001a\u0002092\u0006\u0010;\u001a\u00020\bH\u0000¢\u0006\u0002\b<J\u0012\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001a07*\u000209H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006>"}, m90084d2 = {"Landroidx/credentials/provider/CredentialEntry$Companion;", "", "<init>", "()V", "TRUE_STRING", "", "FALSE_STRING", "REVISION_ID", "", "SLICE_HINT_TYPE_DISPLAY_NAME", "SLICE_HINT_TITLE", "SLICE_HINT_SUBTITLE", "SLICE_HINT_LAST_USED_TIME_MILLIS", "SLICE_HINT_ICON", "SLICE_HINT_PENDING_INTENT", "SLICE_HINT_AUTO_ALLOWED", "SLICE_HINT_IS_DEFAULT_ICON_PREFERRED", "SLICE_HINT_OPTION_ID", "SLICE_HINT_AUTO_SELECT_FROM_OPTION", "SLICE_HINT_DEFAULT_ICON_RES_ID", "SLICE_HINT_AFFILIATED_DOMAIN", "SLICE_HINT_DEDUPLICATION_ID", "SLICE_HINT_BIOMETRIC_PROMPT_DATA", "SLICE_HINT_ALLOWED_AUTHENTICATORS", "SLICE_HINT_CRYPTO_OP_ID", "fromCredentialEntry", "Landroidx/credentials/provider/CredentialEntry;", "credentialEntry", "Landroid/service/credentials/CredentialEntry;", "fromSlice", "slice", "Landroid/app/slice/Slice;", "fromSlice$credentials", "toSlice", "entry", "toSlice$credentials", "EXTRA_CREDENTIAL_ENTRY_SIZE", "EXTRA_CREDENTIAL_ENTRY_ENTRY_TYPE_PREFIX", "EXTRA_CREDENTIAL_ENTRY_ENTRY_GROUP_ID_PREFIX", "EXTRA_CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_PREFIX", "EXTRA_CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_PREFIX", "EXTRA_CREDENTIAL_ENTRY_OPTION_ID_PREFIX", "EXTRA_CREDENTIAL_ENTRY_OPTION_TYPE_PREFIX", "EXTRA_CREDENTIAL_ENTRY_OPTION_DATA_PREFIX", "EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX", "EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX", "EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX", "EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_MILLIS_PREFIX", "EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX", "EXTRA_CREDENTIAL_TITLE_PREFIX", "EXTRA_CREDENTIAL_SUBTITLE_PREFIX", "EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX", "EXTRA_CREDENTIAL_TYPE_ICON_PREFIX", "marshall", "", "", "bundle", "Landroid/os/Bundle;", "marshallCommonProperties", "index", "marshallCommonProperties$credentials", "unmarshallCredentialEntries", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final CredentialEntry fromCredentialEntry(@NotNull android.service.credentials.CredentialEntry credentialEntry) {
            Intrinsics.checkNotNullParameter(credentialEntry, "credentialEntry");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromCredentialEntry(credentialEntry);
            }
            return null;
        }

        @RequiresApi(23)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final void marshall(@NotNull List<? extends CredentialEntry> list, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putInt(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_SIZE, list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                CredentialEntry credentialEntry = list.get(i11);
                if (credentialEntry instanceof PasswordCredentialEntry) {
                    PasswordCredentialEntry.INSTANCE.marshall$credentials((PasswordCredentialEntry) credentialEntry, bundle, i11);
                } else if (credentialEntry instanceof PublicKeyCredentialEntry) {
                    PublicKeyCredentialEntry.INSTANCE.marshall$credentials((PublicKeyCredentialEntry) credentialEntry, bundle, i11);
                } else if (credentialEntry instanceof CustomCredentialEntry) {
                    CustomCredentialEntry.INSTANCE.marshall$credentials((CustomCredentialEntry) credentialEntry, bundle, i11);
                }
            }
        }

        public final void marshallCommonProperties$credentials(@NotNull CredentialEntry credentialEntry, @NotNull Bundle bundle, int i11) {
            Intrinsics.checkNotNullParameter(credentialEntry, "<this>");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putString(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_TYPE_PREFIX + i11, credentialEntry.getType());
            bundle.putString(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_ID_PREFIX + i11, credentialEntry.getBeginGetCredentialOption().getId());
            bundle.putString(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_TYPE_PREFIX + i11, credentialEntry.getBeginGetCredentialOption().getType());
            bundle.putBundle(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_DATA_PREFIX + i11, credentialEntry.getBeginGetCredentialOption().getCandidateQueryData());
            bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_GROUP_ID_PREFIX + i11, credentialEntry.getEntryGroupId());
            bundle.putBoolean(CredentialEntry.f2625xa327c1a7 + i11, credentialEntry.getIsDefaultIconPreferredAsSingleProvider());
            CharSequence affiliatedDomain = credentialEntry.getAffiliatedDomain();
            if (affiliatedDomain != null) {
                bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_PREFIX + i11, affiliatedDomain);
            }
        }

        @JvmStatic
        @Nullable
        public final Slice toSlice$credentials(@NotNull CredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 35) {
                return Api35Impl.toSlice(entry);
            }
            if (i11 >= 28) {
                return Api28Impl.toSlice(entry);
            }
            return null;
        }

        @RequiresApi(23)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public final List<CredentialEntry> unmarshallCredentialEntries(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            ArrayList arrayList = new ArrayList();
            int i11 = bundle.getInt(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_SIZE, 0);
            for (int i12 = 0; i12 < i11; i12++) {
                String string = bundle.getString(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_TYPE_PREFIX + i12);
                if (string == null) {
                    return CollectionsKt.emptyList();
                }
                Object objUnmarshall$credentials = Intrinsics.areEqual(string, PasswordCredential.TYPE_PASSWORD_CREDENTIAL) ? PasswordCredentialEntry.INSTANCE.unmarshall$credentials(bundle, i12) : Intrinsics.areEqual(string, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL) ? PublicKeyCredentialEntry.INSTANCE.unmarshall$credentials(bundle, i12) : CustomCredentialEntry.INSTANCE.unmarshall$credentials(bundle, i12, string);
                if (objUnmarshall$credentials == null) {
                    return CollectionsKt.emptyList();
                }
                arrayList.add(objUnmarshall$credentials);
            }
            return arrayList;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final CredentialEntry fromSlice$credentials(@NotNull Slice slice) {
            Intrinsics.checkNotNullParameter(slice, "slice");
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 35) {
                return Api35Impl.fromSlice(slice);
            }
            if (i11 >= 28) {
                return Api28Impl.fromSlice(slice);
            }
            return null;
        }
    }

    public CredentialEntry(@NotNull String type, @NotNull BeginGetCredentialOption beginGetCredentialOption, @NotNull CharSequence entryGroupId, boolean z11, @Nullable CharSequence charSequence, @Nullable BiometricPromptData biometricPromptData) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(beginGetCredentialOption, "beginGetCredentialOption");
        Intrinsics.checkNotNullParameter(entryGroupId, "entryGroupId");
        this.type = type;
        this.beginGetCredentialOption = beginGetCredentialOption;
        this.entryGroupId = entryGroupId;
        this.isDefaultIconPreferredAsSingleProvider = z11;
        this.affiliatedDomain = charSequence;
        this.biometricPromptData = biometricPromptData;
    }

    @JvmStatic
    @Nullable
    public static final CredentialEntry fromCredentialEntry(@NotNull android.service.credentials.CredentialEntry credentialEntry) {
        return INSTANCE.fromCredentialEntry(credentialEntry);
    }

    @Nullable
    public final CharSequence getAffiliatedDomain() {
        return this.affiliatedDomain;
    }

    @NotNull
    public final BeginGetCredentialOption getBeginGetCredentialOption() {
        return this.beginGetCredentialOption;
    }

    @Nullable
    public final BiometricPromptData getBiometricPromptData() {
        return this.biometricPromptData;
    }

    @NotNull
    public final CharSequence getEntryGroupId() {
        return this.entryGroupId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isDefaultIconPreferredAsSingleProvider, reason: from getter */
    public final boolean getIsDefaultIconPreferredAsSingleProvider() {
        return this.isDefaultIconPreferredAsSingleProvider;
    }

    public /* synthetic */ CredentialEntry(String str, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence, boolean z11, CharSequence charSequence2, BiometricPromptData biometricPromptData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, beginGetCredentialOption, charSequence, z11, (i11 & 16) != 0 ? null : charSequence2, (i11 & 32) != 0 ? null : biometricPromptData);
    }
}
