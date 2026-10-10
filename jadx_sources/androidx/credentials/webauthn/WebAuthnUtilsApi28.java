package androidx.credentials.webauthn;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.provider.CallingAppInfo;
import java.security.MessageDigest;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WebAuthnUtilsApi28.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(28)
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Landroidx/credentials/webauthn/WebAuthnUtilsApi28;", "", "<init>", "()V", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class WebAuthnUtilsApi28 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: WebAuthnUtilsApi28.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/webauthn/WebAuthnUtilsApi28$Companion;", "", "<init>", "()V", "appInfoToOrigin", "", "info", "Landroidx/credentials/provider/CallingAppInfo;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final String appInfoToOrigin(@NotNull CallingAppInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(info.getSigningInfo().getApkContentsSigners()[0].toByteArray());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("android:apk-key-hash:");
            WebAuthnUtils.Companion companion = WebAuthnUtils.INSTANCE;
            Intrinsics.checkNotNull(bArrDigest);
            sb2.append(companion.b64Encode(bArrDigest));
            return sb2.toString();
        }
    }
}
