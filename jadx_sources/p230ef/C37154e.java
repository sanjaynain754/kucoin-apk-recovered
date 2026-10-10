package p230ef;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ef.e */
/* JADX INFO: compiled from: CreatePublicKeyCredentialRequest.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\f\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lef/e;", "Lef/a;", "", "requestJson", "", "clientDataHash", "origin", "", "isAutoSelectAllowed", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/lang/String;[BLjava/lang/String;ZZ)V", "d", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "[B", "()[B", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37154e extends AbstractC37150a {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String requestJson;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final byte[] clientDataHash;

    public /* synthetic */ C37154e(String str, byte[] bArr, String str2, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : bArr, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37154e(@NotNull String requestJson, @Nullable byte[] bArr, @Nullable String str, boolean z11, boolean z12) {
        super(str, z11, z12);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        this.requestJson = requestJson;
        this.clientDataHash = bArr;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRequestJson() {
        return this.requestJson;
    }
}
