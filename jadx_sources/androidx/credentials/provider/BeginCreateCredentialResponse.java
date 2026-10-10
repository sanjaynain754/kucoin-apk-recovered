package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BeginCreateCredentialResponse.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00102\u00020\u0001:\u0004\r\u000e\u000f\u0010B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m90084d2 = {"Landroidx/credentials/provider/BeginCreateCredentialResponse;", "", "createEntries", "", "Landroidx/credentials/provider/CreateEntry;", "remoteEntry", "Landroidx/credentials/provider/RemoteEntry;", "<init>", "(Ljava/util/List;Landroidx/credentials/provider/RemoteEntry;)V", "getCreateEntries", "()Ljava/util/List;", "getRemoteEntry", "()Landroidx/credentials/provider/RemoteEntry;", "Builder", "Api34Impl", "Api23Impl", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class BeginCreateCredentialResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<CreateEntry> createEntries;

    @Nullable
    private final RemoteEntry remoteEntry;

    /* JADX INFO: compiled from: BeginCreateCredentialResponse.kt */
    @RequiresApi(23)
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, m90084d2 = {"Landroidx/credentials/provider/BeginCreateCredentialResponse$Api23Impl;", "", "<init>", "()V", "asBundle", "", "bundle", "Landroid/os/Bundle;", "response", "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "fromBundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api23Impl {

        @NotNull
        public static final Api23Impl INSTANCE = new Api23Impl();

        @JvmStatic
        public static final void asBundle(@NotNull Bundle bundle, @NotNull BeginCreateCredentialResponse response) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(response, "response");
            CreateEntry.INSTANCE.marshall(response.getCreateEntries(), bundle);
            RemoteEntry remoteEntry = response.getRemoteEntry();
            if (remoteEntry != null) {
                RemoteEntry.INSTANCE.marshall$credentials(remoteEntry, bundle);
            }
        }

        @JvmStatic
        @Nullable
        public static final BeginCreateCredentialResponse fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            List<CreateEntry> listUnmarshallCreateEntries = CreateEntry.INSTANCE.unmarshallCreateEntries(bundle);
            RemoteEntry remoteEntryUnmarshallRemoteEntry$credentials = RemoteEntry.INSTANCE.unmarshallRemoteEntry$credentials(bundle);
            if (listUnmarshallCreateEntries.isEmpty() && remoteEntryUnmarshallRemoteEntry$credentials == null) {
                return null;
            }
            return new BeginCreateCredentialResponse(listUnmarshallCreateEntries, remoteEntryUnmarshallRemoteEntry$credentials);
        }

        private Api23Impl() {
        }
    }

    /* JADX INFO: compiled from: BeginCreateCredentialResponse.kt */
    @RequiresApi(34)
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Landroidx/credentials/provider/BeginCreateCredentialResponse$Api34Impl;", "", "<init>", "()V", "REQUEST_KEY", "", "asBundle", "", "bundle", "Landroid/os/Bundle;", "response", "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "fromBundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        @NotNull
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginCreateCredentialResponse";

        @JvmStatic
        public static final void asBundle(@NotNull Bundle bundle, @NotNull BeginCreateCredentialResponse response) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(response, "response");
            bundle.putParcelable(REQUEST_KEY, BeginCreateCredentialUtil.INSTANCE.convertToFrameworkResponse(response));
        }

        @JvmStatic
        @Nullable
        public static final BeginCreateCredentialResponse fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            android.service.credentials.BeginCreateCredentialResponse beginCreateCredentialResponse = (android.service.credentials.BeginCreateCredentialResponse) bundle.getParcelable(REQUEST_KEY, android.service.credentials.BeginCreateCredentialResponse.class);
            if (beginCreateCredentialResponse != null) {
                return BeginCreateCredentialUtil.INSTANCE.convertToJetpackResponse(beginCreateCredentialResponse);
            }
            return null;
        }

        private Api34Impl() {
        }
    }

    /* JADX INFO: compiled from: BeginCreateCredentialResponse.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Landroidx/credentials/provider/BeginCreateCredentialResponse$Builder;", "", "<init>", "()V", "createEntries", "", "Landroidx/credentials/provider/CreateEntry;", "remoteEntry", "Landroidx/credentials/provider/RemoteEntry;", "setCreateEntries", "", "addCreateEntry", "createEntry", "setRemoteEntry", "build", "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Builder {

        @NotNull
        private List<CreateEntry> createEntries = new ArrayList();

        @Nullable
        private RemoteEntry remoteEntry;

        @NotNull
        public final Builder addCreateEntry(@NotNull CreateEntry createEntry) {
            Intrinsics.checkNotNullParameter(createEntry, "createEntry");
            this.createEntries.add(createEntry);
            return this;
        }

        @NotNull
        public final BeginCreateCredentialResponse build() {
            return new BeginCreateCredentialResponse(CollectionsKt.toList(this.createEntries), this.remoteEntry);
        }

        @NotNull
        public final Builder setCreateEntries(@NotNull List<CreateEntry> createEntries) {
            Intrinsics.checkNotNullParameter(createEntries, "createEntries");
            this.createEntries = CollectionsKt.toMutableList((Collection) createEntries);
            return this;
        }

        @NotNull
        public final Builder setRemoteEntry(@Nullable RemoteEntry remoteEntry) {
            this.remoteEntry = remoteEntry;
            return this;
        }
    }

    /* JADX INFO: compiled from: BeginCreateCredentialResponse.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, m90084d2 = {"Landroidx/credentials/provider/BeginCreateCredentialResponse$Companion;", "", "<init>", "()V", "asBundle", "Landroid/os/Bundle;", "response", "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "fromBundle", "bundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final BeginCreateCredentialResponse fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.fromBundle(bundle) : Api23Impl.fromBundle(bundle);
        }

        @JvmStatic
        @NotNull
        public final Bundle asBundle(@NotNull BeginCreateCredentialResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.asBundle(bundle, response);
                return bundle;
            }
            Api23Impl.asBundle(bundle, response);
            return bundle;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeginCreateCredentialResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public BeginCreateCredentialResponse(@NotNull List<CreateEntry> createEntries, @Nullable RemoteEntry remoteEntry) {
        Intrinsics.checkNotNullParameter(createEntries, "createEntries");
        this.createEntries = createEntries;
        this.remoteEntry = remoteEntry;
    }

    @JvmStatic
    @NotNull
    public static final Bundle asBundle(@NotNull BeginCreateCredentialResponse beginCreateCredentialResponse) {
        return INSTANCE.asBundle(beginCreateCredentialResponse);
    }

    @JvmStatic
    @Nullable
    public static final BeginCreateCredentialResponse fromBundle(@NotNull Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @NotNull
    public final List<CreateEntry> getCreateEntries() {
        return this.createEntries;
    }

    @Nullable
    public final RemoteEntry getRemoteEntry() {
        return this.remoteEntry;
    }

    public /* synthetic */ BeginCreateCredentialResponse(List list, RemoteEntry remoteEntry, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list, (i11 & 2) != 0 ? null : remoteEntry);
    }
}
