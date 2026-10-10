package androidx.credentials.provider;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.GetPasswordOption;
import androidx.credentials.PasswordCredential;
import java.util.ArrayList;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BeginGetPasswordOption.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m90084d2 = {"Landroidx/credentials/provider/BeginGetPasswordOption;", "Landroidx/credentials/provider/BeginGetCredentialOption;", "allowedUserIds", "", "", "candidateQueryData", "Landroid/os/Bundle;", "id", "<init>", "(Ljava/util/Set;Landroid/os/Bundle;Ljava/lang/String;)V", "getAllowedUserIds", "()Ljava/util/Set;", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class BeginGetPasswordOption extends BeginGetCredentialOption {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Set<String> allowedUserIds;

    /* JADX INFO: compiled from: BeginGetPasswordOption.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001d\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, m90084d2 = {"Landroidx/credentials/provider/BeginGetPasswordOption$Companion;", "", "<init>", "()V", "createForTest", "Landroidx/credentials/provider/BeginGetPasswordOption;", "data", "Landroid/os/Bundle;", "id", "", "createFrom", "createFrom$credentials", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @VisibleForTesting
        @NotNull
        public final BeginGetPasswordOption createForTest(@NotNull Bundle data, @NotNull String id2) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(id2, "id");
            return createFrom$credentials(data, id2);
        }

        @NotNull
        public final BeginGetPasswordOption createFrom$credentials(@NotNull Bundle data, @NotNull String id2) {
            Set setEmptySet;
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(id2, "id");
            ArrayList<String> stringArrayList = data.getStringArrayList(GetPasswordOption.BUNDLE_KEY_ALLOWED_USER_IDS);
            if (stringArrayList == null || (setEmptySet = CollectionsKt.toSet(stringArrayList)) == null) {
                setEmptySet = SetsKt.emptySet();
            }
            return new BeginGetPasswordOption(setEmptySet, data, id2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginGetPasswordOption(@NotNull Set<String> allowedUserIds, @NotNull Bundle candidateQueryData, @NotNull String id2) {
        super(id2, PasswordCredential.TYPE_PASSWORD_CREDENTIAL, candidateQueryData);
        Intrinsics.checkNotNullParameter(allowedUserIds, "allowedUserIds");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.allowedUserIds = allowedUserIds;
    }

    @JvmStatic
    @VisibleForTesting
    @NotNull
    public static final BeginGetPasswordOption createForTest(@NotNull Bundle bundle, @NotNull String str) {
        return INSTANCE.createForTest(bundle, str);
    }

    @NotNull
    public final Set<String> getAllowedUserIds() {
        return this.allowedUserIds;
    }
}
