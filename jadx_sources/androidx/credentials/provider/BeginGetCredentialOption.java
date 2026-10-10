package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BeginGetCredentialOption.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m90084d2 = {"Landroidx/credentials/provider/BeginGetCredentialOption;", "", "id", "", "type", "candidateQueryData", "Landroid/os/Bundle;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "getId", "()Ljava/lang/String;", "getType", "getCandidateQueryData", "()Landroid/os/Bundle;", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class BeginGetCredentialOption {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Bundle candidateQueryData;

    @NotNull
    private final String id;

    @NotNull
    private final String type;

    /* JADX INFO: compiled from: BeginGetCredentialOption.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000b¨\u0006\f"}, m90084d2 = {"Landroidx/credentials/provider/BeginGetCredentialOption$Companion;", "", "<init>", "()V", "createFrom", "Landroidx/credentials/provider/BeginGetCredentialOption;", "id", "", "type", "candidateQueryData", "Landroid/os/Bundle;", "createFrom$credentials", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final BeginGetCredentialOption createFrom$credentials(@NotNull String id2, @NotNull String type, @NotNull Bundle candidateQueryData) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
            if (Intrinsics.areEqual(type, PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                return BeginGetPasswordOption.INSTANCE.createFrom$credentials(candidateQueryData, id2);
            }
            return Intrinsics.areEqual(type, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL) ? BeginGetPublicKeyCredentialOption.INSTANCE.createFrom$credentials(candidateQueryData, id2) : new BeginGetCustomCredentialOption(id2, type, candidateQueryData);
        }
    }

    public BeginGetCredentialOption(@NotNull String id2, @NotNull String type, @NotNull Bundle candidateQueryData) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        this.id = id2;
        this.type = type;
        this.candidateQueryData = candidateQueryData;
    }

    @NotNull
    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
