package androidx.credentials.provider.utils;

import android.content.pm.SigningInfo;
import android.service.credentials.ClearCredentialStateRequest;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.ProviderClearCredentialStateRequest;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClearCredentialUtil.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(34)
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Landroidx/credentials/provider/utils/ClearCredentialUtil;", "", "<init>", "()V", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ClearCredentialUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: ClearCredentialUtil.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\b¨\u0006\t"}, m90084d2 = {"Landroidx/credentials/provider/utils/ClearCredentialUtil$Companion;", "", "<init>", "()V", "convertToJetpackRequest", "Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "request", "Landroid/service/credentials/ClearCredentialStateRequest;", "convertToJetpackRequest$credentials", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final ProviderClearCredentialStateRequest convertToJetpackRequest$credentials(@NotNull ClearCredentialStateRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            CallingAppInfo.Companion companion = CallingAppInfo.INSTANCE;
            String packageName = request.getCallingAppInfo().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            SigningInfo signingInfo = request.getCallingAppInfo().getSigningInfo();
            Intrinsics.checkNotNullExpressionValue(signingInfo, "getSigningInfo(...)");
            return new ProviderClearCredentialStateRequest(companion.create(packageName, signingInfo, request.getCallingAppInfo().getOrigin()));
        }
    }
}
