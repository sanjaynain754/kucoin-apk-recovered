package androidx.credentials;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CreateCustomCredentialRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Landroidx/credentials/CreateCustomCredentialRequest;", "Landroidx/credentials/CreateCredentialRequest;", "type", "", "credentialData", "Landroid/os/Bundle;", "candidateQueryData", "isSystemProviderRequired", "", "displayInfo", "Landroidx/credentials/CreateCredentialRequest$DisplayInfo;", "isAutoSelectAllowed", "origin", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLandroidx/credentials/CreateCredentialRequest$DisplayInfo;ZLjava/lang/String;Z)V", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCreateCustomCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateCustomCredentialRequest.kt\nandroidx/credentials/CreateCustomCredentialRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
public class CreateCustomCredentialRequest extends CreateCredentialRequest {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateCustomCredentialRequest(@NotNull String type, @NotNull Bundle credentialData, @NotNull Bundle candidateQueryData, boolean z11, @NotNull CreateCredentialRequest.DisplayInfo displayInfo) {
        this(type, credentialData, candidateQueryData, z11, displayInfo, false, null, false, 224, null);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(credentialData, "credentialData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(displayInfo, "displayInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateCustomCredentialRequest(@NotNull String type, @NotNull Bundle credentialData, @NotNull Bundle candidateQueryData, boolean z11, @NotNull CreateCredentialRequest.DisplayInfo displayInfo, boolean z12) {
        this(type, credentialData, candidateQueryData, z11, displayInfo, z12, null, false, 192, null);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(credentialData, "credentialData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(displayInfo, "displayInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateCustomCredentialRequest(@NotNull String type, @NotNull Bundle credentialData, @NotNull Bundle candidateQueryData, boolean z11, @NotNull CreateCredentialRequest.DisplayInfo displayInfo, boolean z12, @Nullable String str) {
        this(type, credentialData, candidateQueryData, z11, displayInfo, z12, str, false, 128, null);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(credentialData, "credentialData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(displayInfo, "displayInfo");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CreateCustomCredentialRequest(@NotNull String type, @NotNull Bundle credentialData, @NotNull Bundle candidateQueryData, boolean z11, @NotNull CreateCredentialRequest.DisplayInfo displayInfo, boolean z12, @Nullable String str, boolean z13) {
        super(type, credentialData, candidateQueryData, z11, z12, displayInfo, str, z13);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(credentialData, "credentialData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(displayInfo, "displayInfo");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }

    public /* synthetic */ CreateCustomCredentialRequest(String str, Bundle bundle, Bundle bundle2, boolean z11, CreateCredentialRequest.DisplayInfo displayInfo, boolean z12, String str2, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle, bundle2, z11, displayInfo, (i11 & 32) != 0 ? false : z12, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? false : z13);
    }
}
