package com.jumio.core.credentials;

import jumio.core.EnumC40517D0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/credentials/CredentialCapabilityType$Companion;", "", "<init>", "()V", "fromString", "Lcom/jumio/core/credentials/CredentialCapabilityType;", "name", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CredentialCapabilityType$Companion {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final EnumC40517D0 fromString(@Nullable String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2093886141:
                    if (str.equals("LIVENESS")) {
                        return EnumC40517D0.LIVENESS;
                    }
                    break;
                case -1750284680:
                    if (str.equals("AUTHENTICATION")) {
                        return EnumC40517D0.AUTHENTICATION;
                    }
                    break;
                case -1166291365:
                    if (str.equals("STORAGE")) {
                        return EnumC40517D0.STORAGE;
                    }
                    break;
                case -946804962:
                    if (str.equals("FRAUD_LOOKUPS")) {
                        return EnumC40517D0.FRAUD_LOOKUPS;
                    }
                    break;
                case 1236650983:
                    if (str.equals("EXTRACTION")) {
                        return EnumC40517D0.EXTRACTION;
                    }
                    break;
                case 1428120291:
                    if (str.equals("SIMILARITY")) {
                        return EnumC40517D0.SIMILARITY;
                    }
                    break;
            }
        }
        return EnumC40517D0.UNKNOWN;
    }

    public CredentialCapabilityType$Companion(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
