package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BeginGetCredentialRequest.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u000f2\u00020\u0001:\u0003\r\u000e\u000fB#\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m90084d2 = {"Landroidx/credentials/provider/BeginGetCredentialRequest;", "", "beginGetCredentialOptions", "", "Landroidx/credentials/provider/BeginGetCredentialOption;", "callingAppInfo", "Landroidx/credentials/provider/CallingAppInfo;", "<init>", "(Ljava/util/List;Landroidx/credentials/provider/CallingAppInfo;)V", "getBeginGetCredentialOptions", "()Ljava/util/List;", "getCallingAppInfo", "()Landroidx/credentials/provider/CallingAppInfo;", "Api34Impl", "Api21Impl", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class BeginGetCredentialRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<BeginGetCredentialOption> beginGetCredentialOptions;

    @Nullable
    private final CallingAppInfo callingAppInfo;

    /* JADX INFO: compiled from: BeginGetCredentialRequest.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Landroidx/credentials/provider/BeginGetCredentialRequest$Api21Impl;", "", "<init>", "()V", "EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE", "", "EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_PREFIX", "EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_PREFIX", "EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX", "asBundle", "", "bundle", "Landroid/os/Bundle;", "request", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "fromBundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBeginGetCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginGetCredentialRequest.kt\nandroidx/credentials/provider/BeginGetCredentialRequest$Api21Impl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"})
    public static final class Api21Impl {

        @NotNull
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX = "androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_";

        @NotNull
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_PREFIX = "androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_";

        @NotNull
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE = "androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE";

        @NotNull
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_PREFIX = "androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_";

        @NotNull
        public static final Api21Impl INSTANCE = new Api21Impl();

        @JvmStatic
        public static final void asBundle(@NotNull Bundle bundle, @NotNull BeginGetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(request, "request");
            int size = request.getBeginGetCredentialOptions().size();
            bundle.putInt(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE, size);
            for (int i11 = 0; i11 < size; i11++) {
                bundle.putString(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_PREFIX + i11, request.getBeginGetCredentialOptions().get(i11).getId());
                bundle.putString(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_PREFIX + i11, request.getBeginGetCredentialOptions().get(i11).getType());
                bundle.putBundle(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX + i11, request.getBeginGetCredentialOptions().get(i11).getCandidateQueryData());
                CallingAppInfo callingAppInfo = request.getCallingAppInfo();
                if (callingAppInfo != null) {
                    CallingAppInfo.INSTANCE.setCallingAppInfo$credentials(bundle, callingAppInfo);
                }
            }
        }

        @JvmStatic
        @Nullable
        public static final BeginGetCredentialRequest fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            CallingAppInfo callingAppInfoExtractCallingAppInfo = CallingAppInfo.INSTANCE.extractCallingAppInfo(bundle);
            int i11 = bundle.getInt(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE, -1);
            if (i11 < 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < i11; i12++) {
                String string = bundle.getString(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_PREFIX + i12);
                if (string == null) {
                    return null;
                }
                String string2 = bundle.getString(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_PREFIX + i12);
                if (string2 == null) {
                    return null;
                }
                Bundle bundle2 = bundle.getBundle(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX + i12);
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                arrayList.add(BeginGetCredentialOption.INSTANCE.createFrom$credentials(string, string2, bundle2));
            }
            return new BeginGetCredentialRequest(arrayList, callingAppInfoExtractCallingAppInfo);
        }

        private Api21Impl() {
        }
    }

    /* JADX INFO: compiled from: BeginGetCredentialRequest.kt */
    @RequiresApi(34)
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Landroidx/credentials/provider/BeginGetCredentialRequest$Api34Impl;", "", "<init>", "()V", "REQUEST_KEY", "", "asBundle", "", "bundle", "Landroid/os/Bundle;", "request", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "fromBundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        @NotNull
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginGetCredentialRequest";

        @JvmStatic
        public static final void asBundle(@NotNull Bundle bundle, @NotNull BeginGetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(request, "request");
            bundle.putParcelable(REQUEST_KEY, BeginGetCredentialUtil.INSTANCE.convertToFrameworkRequest(request));
        }

        @JvmStatic
        @Nullable
        public static final BeginGetCredentialRequest fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            android.service.credentials.BeginGetCredentialRequest beginGetCredentialRequest = (android.service.credentials.BeginGetCredentialRequest) bundle.getParcelable(REQUEST_KEY, android.service.credentials.BeginGetCredentialRequest.class);
            if (beginGetCredentialRequest != null) {
                return BeginGetCredentialUtil.INSTANCE.convertToJetpackRequest$credentials(beginGetCredentialRequest);
            }
            return null;
        }

        private Api34Impl() {
        }
    }

    /* JADX INFO: compiled from: BeginGetCredentialRequest.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\nH\u0007¨\u0006\u0010"}, m90084d2 = {"Landroidx/credentials/provider/BeginGetCredentialRequest$Companion;", "", "<init>", "()V", "createFrom", "Landroidx/credentials/provider/BeginGetCredentialOption;", "id", "", "type", "candidateQueryData", "Landroid/os/Bundle;", "asBundle", "request", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "fromBundle", "bundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public final BeginGetCredentialOption createFrom(@NotNull String id2, @NotNull String type, @NotNull Bundle candidateQueryData) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
            return BeginGetCredentialOption.INSTANCE.createFrom$credentials(id2, type, candidateQueryData);
        }

        @JvmStatic
        @Nullable
        public final BeginGetCredentialRequest fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.fromBundle(bundle) : Api21Impl.fromBundle(bundle);
        }

        @JvmStatic
        @NotNull
        public final Bundle asBundle(@NotNull BeginGetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.asBundle(bundle, request);
                return bundle;
            }
            Api21Impl.asBundle(bundle, request);
            return bundle;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BeginGetCredentialRequest(@NotNull List<? extends BeginGetCredentialOption> beginGetCredentialOptions) {
        this(beginGetCredentialOptions, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(beginGetCredentialOptions, "beginGetCredentialOptions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BeginGetCredentialRequest(@NotNull List<? extends BeginGetCredentialOption> beginGetCredentialOptions, @Nullable CallingAppInfo callingAppInfo) {
        Intrinsics.checkNotNullParameter(beginGetCredentialOptions, "beginGetCredentialOptions");
        this.beginGetCredentialOptions = beginGetCredentialOptions;
        this.callingAppInfo = callingAppInfo;
    }

    @JvmStatic
    @NotNull
    public static final Bundle asBundle(@NotNull BeginGetCredentialRequest beginGetCredentialRequest) {
        return INSTANCE.asBundle(beginGetCredentialRequest);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final BeginGetCredentialOption createFrom(@NotNull String str, @NotNull String str2, @NotNull Bundle bundle) {
        return INSTANCE.createFrom(str, str2, bundle);
    }

    @JvmStatic
    @Nullable
    public static final BeginGetCredentialRequest fromBundle(@NotNull Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @NotNull
    public final List<BeginGetCredentialOption> getBeginGetCredentialOptions() {
        return this.beginGetCredentialOptions;
    }

    @Nullable
    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    public /* synthetic */ BeginGetCredentialRequest(List list, CallingAppInfo callingAppInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : callingAppInfo);
    }
}
