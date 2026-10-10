package androidx.credentials;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.credentials.internal.FormFactorHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CredentialProviderFactory.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\tJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\tJ\n\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0003J \u0010\u001c\u001a\u0004\u0018\u00010\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\""}, m90084d2 = {"Landroidx/credentials/CredentialProviderFactory;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "testMode", "", "getTestMode", "()Z", "setTestMode", "(Z)V", "testPostUProvider", "Landroidx/credentials/CredentialProvider;", "getTestPostUProvider", "()Landroidx/credentials/CredentialProvider;", "setTestPostUProvider", "(Landroidx/credentials/CredentialProvider;)V", "testPreUProvider", "getTestPreUProvider", "setTestPreUProvider", "getBestAvailableProvider", "request", "shouldFallbackToPreU", "tryCreateClosedSourceProviderFromManifest", "tryCreatePostUProvider", "instantiatePreUProvider", "classNames", "", "", "getAllowedProvidersFromManifest", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class CredentialProviderFactory {

    @NotNull
    private static final String CREDENTIAL_PROVIDER_KEY = "androidx.credentials.CREDENTIAL_PROVIDER_KEY";
    private static final int MAX_CRED_MAN_PRE_FRAMEWORK_API_LEVEL = 33;

    @NotNull
    private static final String TAG = "CredProviderFactory";

    @NotNull
    private final Context context;
    private boolean testMode;

    @Nullable
    private CredentialProvider testPostUProvider;

    @Nullable
    private CredentialProvider testPreUProvider;

    public static /* synthetic */ CredentialProvider getBestAvailableProvider$default(CredentialProviderFactory credentialProviderFactory, Object obj, boolean z11, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return credentialProviderFactory.getBestAvailableProvider(obj, z11);
    }

    @Nullable
    public final CredentialProvider getBestAvailableProvider(@NotNull Object request, boolean shouldFallbackToPreU) {
        Intrinsics.checkNotNullParameter(request, "request");
        if ((request instanceof CreateRestoreCredentialRequest) || Intrinsics.areEqual(request, ClearCredentialStateRequest.TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            return tryCreateClosedSourceProviderFromManifest();
        }
        if (request instanceof GetCredentialRequest) {
            for (CredentialOption credentialOption : ((GetCredentialRequest) request).getCredentialOptions()) {
                if ((credentialOption instanceof GetRestoreCredentialOption) || (credentialOption instanceof GetDigitalCredentialOption)) {
                    return tryCreateClosedSourceProviderFromManifest();
                }
            }
        } else {
            if ((request instanceof SignalCredentialStateRequest) || ((request instanceof CreatePublicKeyCredentialRequest) && ((CreatePublicKeyCredentialRequest) request).getIsConditional())) {
                return tryCreateClosedSourceProviderFromManifest();
            }
            if (request instanceof CreateDigitalCredentialRequest) {
                return tryCreateClosedSourceProviderFromManifest();
            }
        }
        return getBestAvailableProvider(shouldFallbackToPreU);
    }

    public CredentialProviderFactory(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public static /* synthetic */ CredentialProvider getBestAvailableProvider$default(CredentialProviderFactory credentialProviderFactory, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return credentialProviderFactory.getBestAvailableProvider(z11);
    }

    private final CredentialProvider tryCreateClosedSourceProviderFromManifest() throws PackageManager.NameNotFoundException {
        if (!this.testMode) {
            List<String> allowedProvidersFromManifest = getAllowedProvidersFromManifest(this.context);
            if (allowedProvidersFromManifest.isEmpty()) {
                return null;
            }
            return instantiatePreUProvider(allowedProvidersFromManifest, this.context);
        }
        CredentialProvider credentialProvider = this.testPreUProvider;
        if (credentialProvider == null) {
            return null;
        }
        Intrinsics.checkNotNull(credentialProvider);
        if (credentialProvider.isAvailableOnDevice()) {
            return this.testPreUProvider;
        }
        return null;
    }

    @RequiresApi(34)
    private final CredentialProvider tryCreatePostUProvider() {
        if (!this.testMode) {
            CredentialProviderFrameworkImpl credentialProviderFrameworkImpl = new CredentialProviderFrameworkImpl(this.context);
            if (credentialProviderFrameworkImpl.isAvailableOnDevice()) {
                return credentialProviderFrameworkImpl;
            }
            return null;
        }
        CredentialProvider credentialProvider = this.testPostUProvider;
        if (credentialProvider == null) {
            return null;
        }
        Intrinsics.checkNotNull(credentialProvider);
        if (credentialProvider.isAvailableOnDevice()) {
            return this.testPostUProvider;
        }
        return null;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public final boolean getTestMode() {
        return this.testMode;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    @Nullable
    public final CredentialProvider getTestPostUProvider() {
        return this.testPostUProvider;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    @Nullable
    public final CredentialProvider getTestPreUProvider() {
        return this.testPreUProvider;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public final void setTestMode(boolean z11) {
        this.testMode = z11;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public final void setTestPostUProvider(@Nullable CredentialProvider credentialProvider) {
        this.testPostUProvider = credentialProvider;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public final void setTestPreUProvider(@Nullable CredentialProvider credentialProvider) {
        this.testPreUProvider = credentialProvider;
    }

    private final List<String> getAllowedProvidersFromManifest(Context context) throws PackageManager.NameNotFoundException {
        String string;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            Intrinsics.checkNotNull(serviceInfoArr);
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString(CREDENTIAL_PROVIDER_KEY)) != null) {
                    arrayList.add(string);
                }
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    private final CredentialProvider instantiatePreUProvider(List<String> classNames, Context context) {
        Iterator<String> it = classNames.iterator();
        CredentialProvider credentialProvider = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName(it.next()).getConstructor(Context.class).newInstance(context);
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                CredentialProvider credentialProvider2 = (CredentialProvider) objNewInstance;
                if (!credentialProvider2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (credentialProvider != null) {
                        Log.i(TAG, "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    credentialProvider = credentialProvider2;
                }
            } catch (Throwable unused) {
            }
        }
        return credentialProvider;
    }

    @Nullable
    public final CredentialProvider getBestAvailableProvider(boolean shouldFallbackToPreU) {
        if (!FormFactorHelper.isTV(this.context) && !FormFactorHelper.isAuto(this.context)) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                CredentialProvider credentialProviderTryCreatePostUProvider = tryCreatePostUProvider();
                return (credentialProviderTryCreatePostUProvider == null && shouldFallbackToPreU) ? tryCreateClosedSourceProviderFromManifest() : credentialProviderTryCreatePostUProvider;
            }
            if (i11 <= 33) {
                return tryCreateClosedSourceProviderFromManifest();
            }
            return null;
        }
        return tryCreateClosedSourceProviderFromManifest();
    }
}
