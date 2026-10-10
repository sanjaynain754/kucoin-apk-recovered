package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class PersistedInstallationEntry {

    @NonNull
    public static PersistedInstallationEntry INSTANCE = builder().build();

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract PersistedInstallationEntry build();

        @NonNull
        public abstract Builder setAuthToken(@Nullable String str);

        @NonNull
        public abstract Builder setExpiresInSecs(long j11);

        @NonNull
        public abstract Builder setFirebaseInstallationId(@NonNull String str);

        @NonNull
        public abstract Builder setFisError(@Nullable String str);

        @NonNull
        public abstract Builder setRefreshToken(@Nullable String str);

        @NonNull
        public abstract Builder setRegistrationStatus(@NonNull PersistedInstallation.RegistrationStatus registrationStatus);

        @NonNull
        public abstract Builder setTokenCreationEpochInSecs(long j11);
    }

    @Nullable
    public abstract String getAuthToken();

    public abstract long getExpiresInSecs();

    @Nullable
    public abstract String getFirebaseInstallationId();

    @Nullable
    public abstract String getFisError();

    @Nullable
    public abstract String getRefreshToken();

    @NonNull
    public abstract PersistedInstallation.RegistrationStatus getRegistrationStatus();

    public abstract long getTokenCreationEpochInSecs();

    @NonNull
    public abstract Builder toBuilder();

    @NonNull
    public static Builder builder() {
        return new AutoValue_PersistedInstallationEntry.Builder().setTokenCreationEpochInSecs(0L).setRegistrationStatus(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).setExpiresInSecs(0L);
    }

    public boolean isErrored() {
        if (getRegistrationStatus() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    public boolean isNotGenerated() {
        if (getRegistrationStatus() != PersistedInstallation.RegistrationStatus.NOT_GENERATED && getRegistrationStatus() != PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
            return false;
        }
        return true;
    }

    public boolean isRegistered() {
        if (getRegistrationStatus() == PersistedInstallation.RegistrationStatus.REGISTERED) {
            return true;
        }
        return false;
    }

    public boolean isUnregistered() {
        if (getRegistrationStatus() == PersistedInstallation.RegistrationStatus.UNREGISTERED) {
            return true;
        }
        return false;
    }

    public boolean shouldAttemptMigration() {
        if (getRegistrationStatus() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    @NonNull
    public PersistedInstallationEntry withAuthToken(@NonNull String str, long j11, long j12) {
        return toBuilder().setAuthToken(str).setExpiresInSecs(j11).setTokenCreationEpochInSecs(j12).build();
    }

    @NonNull
    public PersistedInstallationEntry withClearedAuthToken() {
        return toBuilder().setAuthToken(null).build();
    }

    @NonNull
    public PersistedInstallationEntry withFisError(@NonNull String str) {
        return toBuilder().setFisError(str).setRegistrationStatus(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).build();
    }

    @NonNull
    public PersistedInstallationEntry withNoGeneratedFid() {
        return toBuilder().setRegistrationStatus(PersistedInstallation.RegistrationStatus.NOT_GENERATED).build();
    }

    @NonNull
    public PersistedInstallationEntry withRegisteredFid(@NonNull String str, @NonNull String str2, long j11, @Nullable String str3, long j12) {
        return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(PersistedInstallation.RegistrationStatus.REGISTERED).setAuthToken(str3).setRefreshToken(str2).setExpiresInSecs(j12).setTokenCreationEpochInSecs(j11).build();
    }

    @NonNull
    public PersistedInstallationEntry withUnregisteredFid(@NonNull String str) {
        return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(PersistedInstallation.RegistrationStatus.UNREGISTERED).build();
    }
}
