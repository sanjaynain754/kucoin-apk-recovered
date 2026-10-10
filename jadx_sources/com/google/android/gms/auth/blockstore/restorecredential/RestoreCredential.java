package com.google.android.gms.auth.blockstore.restorecredential;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/google/android/gms/auth/blockstore/restorecredential/RestoreCredential;", "", "<init>", "()V", "getRestoreCredentialClient", "Lcom/google/android/gms/auth/blockstore/restorecredential/RestoreCredentialClient;", "context", "Landroid/content/Context;", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class RestoreCredential {

    @NotNull
    public static final RestoreCredential INSTANCE = new RestoreCredential();

    @JvmStatic
    @NotNull
    public static final RestoreCredentialClient getRestoreCredentialClient(@NonNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new InternalRestoreCredentialClient(context);
    }

    private RestoreCredential() {
    }
}
