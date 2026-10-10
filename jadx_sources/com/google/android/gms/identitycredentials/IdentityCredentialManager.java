package com.google.android.gms.identitycredentials;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/google/android/gms/identitycredentials/IdentityCredentialManager;", "", "<init>", "()V", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class IdentityCredentialManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m90084d2 = {"Lcom/google/android/gms/identitycredentials/IdentityCredentialManager$Companion;", "", "<init>", "()V", "getClient", "Lcom/google/android/gms/identitycredentials/IdentityCredentialClient;", "activity", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final IdentityCredentialClient getClient(@NonNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new InternalIdentityCredentialClient(activity);
        }

        public /* synthetic */ Companion(@NonNull DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final IdentityCredentialClient getClient(@NonNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new InternalIdentityCredentialClient(context);
        }
    }

    @JvmStatic
    @NotNull
    public static final IdentityCredentialClient getClient(@NonNull Activity activity) {
        return INSTANCE.getClient(activity);
    }

    @JvmStatic
    @NotNull
    public static final IdentityCredentialClient getClient(@NonNull Context context) {
        return INSTANCE.getClient(context);
    }

    private IdentityCredentialManager() {
    }
}
