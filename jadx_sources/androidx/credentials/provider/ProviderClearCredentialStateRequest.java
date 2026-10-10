package androidx.credentials.provider;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProviderClearCredentialStateRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m90084d2 = {"Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "", "callingAppInfo", "Landroidx/credentials/provider/CallingAppInfo;", "<init>", "(Landroidx/credentials/provider/CallingAppInfo;)V", "getCallingAppInfo", "()Landroidx/credentials/provider/CallingAppInfo;", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class ProviderClearCredentialStateRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final CallingAppInfo callingAppInfo;

    /* JADX INFO: compiled from: ProviderClearCredentialStateRequest.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, m90084d2 = {"Landroidx/credentials/provider/ProviderClearCredentialStateRequest$Companion;", "", "<init>", "()V", "asBundle", "Landroid/os/Bundle;", "request", "Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "fromBundle", "bundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final ProviderClearCredentialStateRequest fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            CallingAppInfo callingAppInfoExtractCallingAppInfo = CallingAppInfo.INSTANCE.extractCallingAppInfo(bundle);
            if (callingAppInfoExtractCallingAppInfo != null) {
                return new ProviderClearCredentialStateRequest(callingAppInfoExtractCallingAppInfo);
            }
            throw new IllegalArgumentException("Bundle was missing CallingAppInfo.");
        }

        @JvmStatic
        @NotNull
        public final Bundle asBundle(@NotNull ProviderClearCredentialStateRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Bundle bundle = new Bundle();
            CallingAppInfo.INSTANCE.setCallingAppInfo$credentials(bundle, request.getCallingAppInfo());
            return bundle;
        }
    }

    public ProviderClearCredentialStateRequest(@NotNull CallingAppInfo callingAppInfo) {
        Intrinsics.checkNotNullParameter(callingAppInfo, "callingAppInfo");
        this.callingAppInfo = callingAppInfo;
    }

    @JvmStatic
    @NotNull
    public static final Bundle asBundle(@NotNull ProviderClearCredentialStateRequest providerClearCredentialStateRequest) {
        return INSTANCE.asBundle(providerClearCredentialStateRequest);
    }

    @JvmStatic
    @NotNull
    public static final ProviderClearCredentialStateRequest fromBundle(@NotNull Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @NotNull
    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }
}
