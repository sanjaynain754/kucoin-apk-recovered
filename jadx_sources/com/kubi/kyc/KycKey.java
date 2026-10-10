package com.kubi.kyc;

import androidx.annotation.Keep;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: KycEnum.kt */
/* JADX INFO: loaded from: classes21.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/kyc/KycKey;", "", "<init>", "()V", KycKey.nationality, "", KycKey.lastName, KycKey.firstName, KycKey.idNumber, KycKey.idType, KycKey.identityVerification, KycKey.frontPhoto, KycKey.backPhoto, KycKey.backendPhoto, KycKey.handlePhoto, KycKey.faceDetection, KycKey.facePhoto, "getLevel", "", "keys", "", "containsPrimary", "", "containsSenior", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KycKey {

    @NotNull
    public static final KycKey INSTANCE = new KycKey();

    @NotNull
    public static final String backPhoto = "backPhoto";

    @NotNull
    public static final String backendPhoto = "backendPhoto";

    @NotNull
    public static final String faceDetection = "faceDetection";

    @NotNull
    public static final String facePhoto = "facePhoto";

    @NotNull
    public static final String firstName = "firstName";

    @NotNull
    public static final String frontPhoto = "frontPhoto";

    @NotNull
    public static final String handlePhoto = "handlePhoto";

    @NotNull
    public static final String idNumber = "idNumber";

    @NotNull
    public static final String idType = "idType";

    @NotNull
    public static final String identityVerification = "identityVerification";

    @NotNull
    public static final String lastName = "lastName";

    @NotNull
    public static final String nationality = "nationality";

    private final boolean containsSenior(Set<String> keys) {
        if (keys == null || keys.isEmpty()) {
            return false;
        }
        return keys.contains(frontPhoto) || keys.contains(backPhoto) || keys.contains(handlePhoto) || keys.contains(faceDetection) || keys.contains(backendPhoto);
    }

    public final boolean containsPrimary(@Nullable Set<String> keys) {
        if (keys == null || keys.isEmpty()) {
            return false;
        }
        return keys.contains(nationality) || keys.contains(lastName) || keys.contains(firstName) || keys.contains(idType) || keys.contains(idNumber) || keys.contains(identityVerification) || keys.contains(facePhoto);
    }

    public final int getLevel(@Nullable Set<String> keys) {
        if (keys != null && !keys.isEmpty()) {
            if (containsPrimary(keys)) {
                return containsSenior(keys) ? 2 : 1;
            }
            if (containsSenior(keys)) {
                return 2;
            }
        }
        return -1;
    }

    private KycKey() {
    }
}
