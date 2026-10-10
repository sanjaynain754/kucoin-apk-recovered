package androidx.credentials.provider;

import android.content.Intent;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import androidx.annotation.RequiresApi;
import androidx.credentials.C1961a1;
import androidx.credentials.C1964b1;
import androidx.credentials.C1967c1;
import androidx.credentials.C2296y0;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IntentHandlerConverters.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0007\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0007\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u0002H\u0007\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u0002H\u0007¨\u0006\u000b"}, m90084d2 = {"getCreateCredentialException", "Landroid/credentials/CreateCredentialException;", "Landroid/content/Intent;", "getGetCredentialException", "Landroid/credentials/GetCredentialException;", "getBeginGetResponse", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "getGetCredentialResponse", "Landroid/credentials/GetCredentialResponse;", "getCreateCredentialCredentialResponse", "Landroid/credentials/CreateCredentialResponse;", "credentials"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@JvmName(name = "IntentHandlerConverters")
public final class IntentHandlerConverters {
    @RequiresApi(34)
    @Nullable
    public static final BeginGetCredentialResponse getBeginGetResponse(@NotNull Intent intent) {
        android.service.credentials.BeginGetCredentialResponse beginGetCredentialResponseM2696a;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE") && (beginGetCredentialResponseM2696a = C2194q.m2696a(intent.getParcelableExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE", C2193p.m2695a()))) != null) {
            return BeginGetCredentialUtil.INSTANCE.convertToJetpackResponse(beginGetCredentialResponseM2696a);
        }
        return null;
    }

    @RequiresApi(34)
    @Nullable
    public static final CreateCredentialResponse getCreateCredentialCredentialResponse(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE")) {
            return C1961a1.m2624a(intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", C2197t.m2699a()));
        }
        return null;
    }

    @RequiresApi(34)
    @Nullable
    public static final CreateCredentialException getCreateCredentialException(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION")) {
            return C2296y0.m2792a(intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", C2195r.m2697a()));
        }
        return null;
    }

    @RequiresApi(34)
    @Nullable
    public static final GetCredentialException getGetCredentialException(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION")) {
            return C1967c1.m2630a(intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", C2196s.m2698a()));
        }
        return null;
    }

    @RequiresApi(34)
    @Nullable
    public static final GetCredentialResponse getGetCredentialResponse(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE")) {
            return C1964b1.m2627a(intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", C2191n.m2693a()));
        }
        return null;
    }
}
