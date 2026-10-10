package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.qcloud.tuicore.TUIConstants;
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

/* JADX INFO: compiled from: BeginGetCredentialResponse.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00162\u00020\u0001:\u0004\u0013\u0014\u0015\u0016BC\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m90084d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse;", "", "credentialEntries", "", "Landroidx/credentials/provider/CredentialEntry;", "actions", "Landroidx/credentials/provider/Action;", "authenticationActions", "Landroidx/credentials/provider/AuthenticationAction;", "remoteEntry", "Landroidx/credentials/provider/RemoteEntry;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/credentials/provider/RemoteEntry;)V", "getCredentialEntries", "()Ljava/util/List;", "getActions", "getAuthenticationActions", "getRemoteEntry", "()Landroidx/credentials/provider/RemoteEntry;", "Builder", "Api34Impl", "Api23Impl", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class BeginGetCredentialResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<Action> actions;

    @NotNull
    private final List<AuthenticationAction> authenticationActions;

    @NotNull
    private final List<CredentialEntry> credentialEntries;

    @Nullable
    private final RemoteEntry remoteEntry;

    /* JADX INFO: compiled from: BeginGetCredentialResponse.kt */
    @RequiresApi(23)
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, m90084d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse$Api23Impl;", "", "<init>", "()V", "asBundle", "", "bundle", "Landroid/os/Bundle;", "response", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "fromBundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api23Impl {

        @NotNull
        public static final Api23Impl INSTANCE = new Api23Impl();

        @JvmStatic
        public static final void asBundle(@NotNull Bundle bundle, @NotNull BeginGetCredentialResponse response) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(response, "response");
            CredentialEntry.INSTANCE.marshall(response.getCredentialEntries(), bundle);
            Action.INSTANCE.marshall$credentials(response.getActions(), bundle);
            AuthenticationAction.INSTANCE.marshall$credentials(response.getAuthenticationActions(), bundle);
            RemoteEntry remoteEntry = response.getRemoteEntry();
            if (remoteEntry != null) {
                RemoteEntry.INSTANCE.marshall$credentials(remoteEntry, bundle);
            }
        }

        @JvmStatic
        @Nullable
        public static final BeginGetCredentialResponse fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            List<CredentialEntry> listUnmarshallCredentialEntries = CredentialEntry.INSTANCE.unmarshallCredentialEntries(bundle);
            List<Action> listUnmarshallActionList$credentials = Action.INSTANCE.unmarshallActionList$credentials(bundle);
            List<AuthenticationAction> listUnmarshallAuthActionList$credentials = AuthenticationAction.INSTANCE.unmarshallAuthActionList$credentials(bundle);
            RemoteEntry remoteEntryUnmarshallRemoteEntry$credentials = RemoteEntry.INSTANCE.unmarshallRemoteEntry$credentials(bundle);
            if (listUnmarshallCredentialEntries.isEmpty() && listUnmarshallActionList$credentials.isEmpty() && listUnmarshallAuthActionList$credentials.isEmpty() && remoteEntryUnmarshallRemoteEntry$credentials == null) {
                return null;
            }
            return new BeginGetCredentialResponse(listUnmarshallCredentialEntries, listUnmarshallActionList$credentials, listUnmarshallAuthActionList$credentials, remoteEntryUnmarshallRemoteEntry$credentials);
        }

        private Api23Impl() {
        }
    }

    /* JADX INFO: compiled from: BeginGetCredentialResponse.kt */
    @RequiresApi(34)
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse$Api34Impl;", "", "<init>", "()V", "REQUEST_KEY", "", "asBundle", "", "bundle", "Landroid/os/Bundle;", "response", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "fromBundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        @NotNull
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginGetCredentialResponse";

        @JvmStatic
        public static final void asBundle(@NotNull Bundle bundle, @NotNull BeginGetCredentialResponse response) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(response, "response");
            bundle.putParcelable(REQUEST_KEY, BeginGetCredentialUtil.INSTANCE.convertToFrameworkResponse(response));
        }

        @JvmStatic
        @Nullable
        public static final BeginGetCredentialResponse fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            android.service.credentials.BeginGetCredentialResponse beginGetCredentialResponse = (android.service.credentials.BeginGetCredentialResponse) bundle.getParcelable(REQUEST_KEY, android.service.credentials.BeginGetCredentialResponse.class);
            if (beginGetCredentialResponse != null) {
                return BeginGetCredentialUtil.INSTANCE.convertToJetpackResponse(beginGetCredentialResponse);
            }
            return null;
        }

        private Api34Impl() {
        }
    }

    /* JADX INFO: compiled from: BeginGetCredentialResponse.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0006J\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\bJ\u0014\u0010\u0015\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0012J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\nJ\u0014\u0010\u0018\u001a\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0012J\u0006\u0010\u001a\u001a\u00020\u001bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse$Builder;", "", "<init>", "()V", "credentialEntries", "", "Landroidx/credentials/provider/CredentialEntry;", "actions", "Landroidx/credentials/provider/Action;", "authenticationActions", "Landroidx/credentials/provider/AuthenticationAction;", "remoteEntry", "Landroidx/credentials/provider/RemoteEntry;", "setRemoteEntry", "addCredentialEntry", "entry", "setCredentialEntries", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "addAction", TUIConstants.TIMPush.NOTIFICATION.ACTION, "setActions", "addAuthenticationAction", "authenticationAction", "setAuthenticationActions", "authenticationEntries", "build", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Builder {

        @Nullable
        private RemoteEntry remoteEntry;

        @NotNull
        private List<CredentialEntry> credentialEntries = new ArrayList();

        @NotNull
        private List<Action> actions = new ArrayList();

        @NotNull
        private List<AuthenticationAction> authenticationActions = new ArrayList();

        @NotNull
        public final Builder addAction(@NotNull Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.actions.add(action);
            return this;
        }

        @NotNull
        public final Builder addAuthenticationAction(@NotNull AuthenticationAction authenticationAction) {
            Intrinsics.checkNotNullParameter(authenticationAction, "authenticationAction");
            this.authenticationActions.add(authenticationAction);
            return this;
        }

        @NotNull
        public final Builder addCredentialEntry(@NotNull CredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.credentialEntries.add(entry);
            return this;
        }

        @NotNull
        public final BeginGetCredentialResponse build() {
            return new BeginGetCredentialResponse(CollectionsKt.toList(this.credentialEntries), CollectionsKt.toList(this.actions), CollectionsKt.toList(this.authenticationActions), this.remoteEntry);
        }

        @NotNull
        public final Builder setActions(@NotNull List<Action> actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.actions = CollectionsKt.toMutableList((Collection) actions);
            return this;
        }

        @NotNull
        public final Builder setAuthenticationActions(@NotNull List<AuthenticationAction> authenticationEntries) {
            Intrinsics.checkNotNullParameter(authenticationEntries, "authenticationEntries");
            this.authenticationActions = CollectionsKt.toMutableList((Collection) authenticationEntries);
            return this;
        }

        @NotNull
        public final Builder setCredentialEntries(@NotNull List<? extends CredentialEntry> entries) {
            Intrinsics.checkNotNullParameter(entries, "entries");
            this.credentialEntries = CollectionsKt.toMutableList((Collection) entries);
            return this;
        }

        @NotNull
        public final Builder setRemoteEntry(@Nullable RemoteEntry remoteEntry) {
            this.remoteEntry = remoteEntry;
            return this;
        }
    }

    /* JADX INFO: compiled from: BeginGetCredentialResponse.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, m90084d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse$Companion;", "", "<init>", "()V", "asBundle", "Landroid/os/Bundle;", "response", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "fromBundle", "bundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final BeginGetCredentialResponse fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.fromBundle(bundle) : Api23Impl.fromBundle(bundle);
        }

        @JvmStatic
        @NotNull
        public final Bundle asBundle(@NotNull BeginGetCredentialResponse response) {
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

    public BeginGetCredentialResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeginGetCredentialResponse(@NotNull List<? extends CredentialEntry> credentialEntries, @NotNull List<Action> actions, @NotNull List<AuthenticationAction> authenticationActions, @Nullable RemoteEntry remoteEntry) {
        Intrinsics.checkNotNullParameter(credentialEntries, "credentialEntries");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(authenticationActions, "authenticationActions");
        this.credentialEntries = credentialEntries;
        this.actions = actions;
        this.authenticationActions = authenticationActions;
        this.remoteEntry = remoteEntry;
    }

    @JvmStatic
    @NotNull
    public static final Bundle asBundle(@NotNull BeginGetCredentialResponse beginGetCredentialResponse) {
        return INSTANCE.asBundle(beginGetCredentialResponse);
    }

    @JvmStatic
    @Nullable
    public static final BeginGetCredentialResponse fromBundle(@NotNull Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @NotNull
    public final List<Action> getActions() {
        return this.actions;
    }

    @NotNull
    public final List<AuthenticationAction> getAuthenticationActions() {
        return this.authenticationActions;
    }

    @NotNull
    public final List<CredentialEntry> getCredentialEntries() {
        return this.credentialEntries;
    }

    @Nullable
    public final RemoteEntry getRemoteEntry() {
        return this.remoteEntry;
    }

    public /* synthetic */ BeginGetCredentialResponse(List list, List list2, List list3, RemoteEntry remoteEntry, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 4) != 0 ? CollectionsKt.emptyList() : list3, (i11 & 8) != 0 ? null : remoteEntry);
    }
}
