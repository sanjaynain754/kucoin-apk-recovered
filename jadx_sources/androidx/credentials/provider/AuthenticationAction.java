package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.autofill.inline.common.C0605c;
import androidx.autofill.inline.common.C0606d;
import androidx.autofill.inline.common.C0607e;
import androidx.autofill.inline.p019v1.C0609b;
import androidx.autofill.inline.p019v1.C0620m;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AuthenticationAction.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0003\u0011\u0012\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Landroidx/credentials/provider/AuthenticationAction;", "", "title", "", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V", "getTitle", "()Ljava/lang/CharSequence;", "getPendingIntent", "()Landroid/app/PendingIntent;", "equals", "", "other", "hashCode", "", "Builder", "Api34Impl", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAuthenticationAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationAction.kt\nandroidx/credentials/provider/AuthenticationAction\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
public final class AuthenticationAction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_AUTH_ACTION_PENDING_INTENT_PREFIX = "androidx.credentials.provider.extra.AUTH_ACTION_PENDING_INTENT_";

    @NotNull
    private static final String EXTRA_AUTH_ACTION_SIZE = "androidx.credentials.provider.extra.AUTH_ACTION_SIZE";

    @NotNull
    private static final String EXTRA_AUTH_ACTION_TITLE_PREFIX = "androidx.credentials.provider.extra.AUTH_ACTION_TITLE_";

    @NotNull
    private static final String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.authenticationAction.SLICE_HINT_PENDING_INTENT";

    @NotNull
    private static final String SLICE_HINT_TITLE = "androidx.credentials.provider.authenticationAction.SLICE_HINT_TITLE";
    private static final int SLICE_SPEC_REVISION = 0;

    @NotNull
    private static final String SLICE_SPEC_TYPE = "AuthenticationAction";

    @NotNull
    private static final String TAG = "AuthenticationAction";

    @NotNull
    private final PendingIntent pendingIntent;

    @NotNull
    private final CharSequence title;

    /* JADX INFO: compiled from: AuthenticationAction.kt */
    @RequiresApi(34)
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/provider/AuthenticationAction$Api34Impl;", "", "<init>", "()V", "fromAction", "Landroidx/credentials/provider/AuthenticationAction;", "authenticationAction", "Landroid/service/credentials/Action;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        @JvmStatic
        @Nullable
        public static final AuthenticationAction fromAction(@NotNull android.service.credentials.Action authenticationAction) {
            Intrinsics.checkNotNullParameter(authenticationAction, "authenticationAction");
            Slice slice = authenticationAction.getSlice();
            Intrinsics.checkNotNullExpressionValue(slice, "getSlice(...)");
            return AuthenticationAction.INSTANCE.fromSlice(slice);
        }

        private Api34Impl() {
        }
    }

    /* JADX INFO: compiled from: AuthenticationAction.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Landroidx/credentials/provider/AuthenticationAction$Builder;", "", "title", "", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V", "build", "Landroidx/credentials/provider/AuthenticationAction;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Builder {

        @NotNull
        private final PendingIntent pendingIntent;

        @NotNull
        private final CharSequence title;

        @NotNull
        public final AuthenticationAction build() {
            return new AuthenticationAction(this.title, this.pendingIntent);
        }

        public Builder(@NotNull CharSequence title, @NotNull PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            this.title = title;
            this.pendingIntent = pendingIntent;
        }
    }

    /* JADX INFO: compiled from: AuthenticationAction.kt */
    @Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0012H\u0007J\u001f\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u000e0\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018*\u00020\u001aH\u0000¢\u0006\u0002\b\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Landroidx/credentials/provider/AuthenticationAction$Companion;", "", "<init>", "()V", "TAG", "", "SLICE_SPEC_REVISION", "", "SLICE_SPEC_TYPE", "SLICE_HINT_TITLE", "SLICE_HINT_PENDING_INTENT", "toSlice", "Landroid/app/slice/Slice;", "authenticationAction", "Landroidx/credentials/provider/AuthenticationAction;", "fromSlice", "slice", "fromAction", "Landroid/service/credentials/Action;", "EXTRA_AUTH_ACTION_SIZE", "EXTRA_AUTH_ACTION_PENDING_INTENT_PREFIX", "EXTRA_AUTH_ACTION_TITLE_PREFIX", "marshall", "", "", "bundle", "Landroid/os/Bundle;", "marshall$credentials", "unmarshallAuthActionList", "unmarshallAuthActionList$credentials", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAuthenticationAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationAction.kt\nandroidx/credentials/provider/AuthenticationAction$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1869#2,2:229\n*S KotlinDebug\n*F\n+ 1 AuthenticationAction.kt\nandroidx/credentials/provider/AuthenticationAction$Companion\n*L\n140#1:229,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @RequiresApi(34)
        @Nullable
        public final AuthenticationAction fromAction(@NotNull android.service.credentials.Action authenticationAction) {
            Intrinsics.checkNotNullParameter(authenticationAction, "authenticationAction");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromAction(authenticationAction);
            }
            return null;
        }

        public final void marshall$credentials(@NotNull List<AuthenticationAction> list, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putInt(AuthenticationAction.EXTRA_AUTH_ACTION_SIZE, list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                bundle.putParcelable(AuthenticationAction.EXTRA_AUTH_ACTION_PENDING_INTENT_PREFIX + i11, list.get(i11).getPendingIntent());
                bundle.putCharSequence(AuthenticationAction.EXTRA_AUTH_ACTION_TITLE_PREFIX + i11, list.get(i11).getTitle());
            }
        }

        @JvmStatic
        @NotNull
        @RequiresApi(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final Slice toSlice(@NotNull AuthenticationAction authenticationAction) {
            Intrinsics.checkNotNullParameter(authenticationAction, "authenticationAction");
            CharSequence title = authenticationAction.getTitle();
            PendingIntent pendingIntent = authenticationAction.getPendingIntent();
            C0607e.m1594a();
            Slice.Builder builderM1593a = C0606d.m1593a(Uri.EMPTY, C0605c.m1592a("AuthenticationAction", 0));
            builderM1593a.addAction(pendingIntent, C0620m.m1607a(builderM1593a).addHints(Collections.singletonList(AuthenticationAction.SLICE_HINT_PENDING_INTENT)).build(), null).addText(title, null, CollectionsKt.listOf(AuthenticationAction.SLICE_HINT_TITLE));
            Slice sliceBuild = builderM1593a.build();
            Intrinsics.checkNotNullExpressionValue(sliceBuild, "build(...)");
            return sliceBuild;
        }

        @NotNull
        public final List<AuthenticationAction> unmarshallAuthActionList$credentials(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            ArrayList arrayList = new ArrayList();
            int i11 = bundle.getInt(AuthenticationAction.EXTRA_AUTH_ACTION_SIZE, 0);
            for (int i12 = 0; i12 < i11; i12++) {
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(AuthenticationAction.EXTRA_AUTH_ACTION_PENDING_INTENT_PREFIX + i12);
                CharSequence charSequence = bundle.getCharSequence(AuthenticationAction.EXTRA_AUTH_ACTION_TITLE_PREFIX + i12);
                if (pendingIntent == null || charSequence == null) {
                    return CollectionsKt.emptyList();
                }
                arrayList.add(new AuthenticationAction(charSequence, pendingIntent));
            }
            return arrayList;
        }

        @JvmStatic
        @SuppressLint({"WrongConstant"})
        @Nullable
        @RequiresApi(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final AuthenticationAction fromSlice(@NotNull Slice slice) {
            Intrinsics.checkNotNullParameter(slice, "slice");
            List items = slice.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
            Iterator it = items.iterator();
            CharSequence text = null;
            PendingIntent action = null;
            while (it.hasNext()) {
                SliceItem sliceItemM1596a = C0609b.m1596a(it.next());
                if (sliceItemM1596a.hasHint(AuthenticationAction.SLICE_HINT_PENDING_INTENT)) {
                    action = sliceItemM1596a.getAction();
                } else if (sliceItemM1596a.hasHint(AuthenticationAction.SLICE_HINT_TITLE)) {
                    text = sliceItemM1596a.getText();
                }
            }
            try {
                Intrinsics.checkNotNull(text);
                Intrinsics.checkNotNull(action);
                return new AuthenticationAction(text, action);
            } catch (Exception e11) {
                Log.i("AuthenticationAction", "fromSlice failed with: " + e11.getMessage());
                return null;
            }
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationAction)) {
            return false;
        }
        AuthenticationAction authenticationAction = (AuthenticationAction) other;
        return Intrinsics.areEqual(this.title, authenticationAction.title) && Intrinsics.areEqual(this.pendingIntent, authenticationAction.pendingIntent);
    }

    @JvmStatic
    @RequiresApi(34)
    @Nullable
    public static final AuthenticationAction fromAction(@NotNull android.service.credentials.Action action) {
        return INSTANCE.fromAction(action);
    }

    @JvmStatic
    @SuppressLint({"WrongConstant"})
    @Nullable
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final AuthenticationAction fromSlice(@NotNull Slice slice) {
        return INSTANCE.fromSlice(slice);
    }

    @JvmStatic
    @NotNull
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final Slice toSlice(@NotNull AuthenticationAction authenticationAction) {
        return INSTANCE.toSlice(authenticationAction);
    }

    @NotNull
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    @NotNull
    public final CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.pendingIntent.hashCode();
    }

    public AuthenticationAction(@NotNull CharSequence title, @NotNull PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        this.title = title;
        this.pendingIntent = pendingIntent;
        if (title.length() > 0) {
        } else {
            throw new IllegalArgumentException("title must not be empty");
        }
    }
}
