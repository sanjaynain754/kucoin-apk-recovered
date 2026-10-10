package androidx.credentials;

import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Credential.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m90084d2 = {"Landroidx/credentials/Credential;", "", "type", "", "data", "Landroid/os/Bundle;", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "getType", "()Ljava/lang/String;", "getData", "()Landroid/os/Bundle;", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class Credential {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Bundle data;

    @NotNull
    private final String type;

    /* JADX INFO: compiled from: Credential.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, m90084d2 = {"Landroidx/credentials/Credential$Companion;", "", "<init>", "()V", "createFrom", "Landroidx/credentials/Credential;", "type", "", "data", "Landroid/os/Bundle;", URLCredentialContract.FeedEntry.TABLE_NAME, "Landroid/credentials/Credential;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JvmStatic
        @NotNull
        public final Credential createFrom(@NotNull String type, @NotNull Bundle data) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                switch (type.hashCode()) {
                    case -1678407252:
                        if (type.equals(DigitalCredential.TYPE_DIGITAL_CREDENTIAL)) {
                            return DigitalCredential.INSTANCE.createFrom$credentials(data);
                        }
                        break;
                    case -1072734346:
                        if (type.equals(RestoreCredential.TYPE_RESTORE_CREDENTIAL)) {
                            return RestoreCredential.INSTANCE.createFrom$credentials(data);
                        }
                        break;
                    case -543568185:
                        if (type.equals(PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                            return PasswordCredential.INSTANCE.createFrom$credentials(data);
                        }
                        break;
                    case -95037569:
                        if (type.equals(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                            return PublicKeyCredential.INSTANCE.createFrom$credentials(data);
                        }
                        break;
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new CustomCredential(type, data);
            }
        }

        private Companion() {
        }

        @JvmStatic
        @RequiresApi(34)
        @NotNull
        public final Credential createFrom(@NotNull android.credentials.Credential credential) {
            Intrinsics.checkNotNullParameter(credential, "credential");
            String type = credential.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Bundle data = credential.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return createFrom(type, data);
        }
    }

    @JvmStatic
    @RequiresApi(34)
    @NotNull
    public static final Credential createFrom(@NotNull android.credentials.Credential credential) {
        return INSTANCE.createFrom(credential);
    }

    @JvmStatic
    @NotNull
    public static final Credential createFrom(@NotNull String str, @NotNull Bundle bundle) {
        return INSTANCE.createFrom(str, bundle);
    }

    @NotNull
    public final Bundle getData() {
        return this.data;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public Credential(@NotNull String type, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        this.type = type;
        this.data = data;
    }
}
