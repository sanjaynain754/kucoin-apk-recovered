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

/* JADX INFO: compiled from: RemoteEntry.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0003\u0012\u0013\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0006\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, m90084d2 = {"Landroidx/credentials/provider/RemoteEntry;", "", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "<init>", "(Landroid/app/PendingIntent;)V", "isAutoSelect", "", "(Landroid/app/PendingIntent;Z)V", "getPendingIntent", "()Landroid/app/PendingIntent;", "()Z", "setAutoSelect", "(Z)V", "equals", "other", "hashCode", "", "Builder", "Api34Impl", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class RemoteEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_REMOTE_ENTRY_PENDING_INTENT = "androidx.credentials.provider.extra.REMOTE_ENTRY_PENDING_INTENT";
    private static final int REVISION_ID = 1;

    @NotNull
    private static final String SLICE_HINT_IS_AUTO_SELECT = "androidx.credentials.provider.remoteEntry.SLICE_HINT_IS_AUTO_SELECT";

    @NotNull
    private static final String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.remoteEntry.SLICE_HINT_PENDING_INTENT";

    @NotNull
    private static final String SLICE_SPEC_TYPE = "RemoteEntry";

    @NotNull
    private static final String TAG = "RemoteEntry";
    private boolean isAutoSelect;

    @NotNull
    private final PendingIntent pendingIntent;

    /* JADX INFO: compiled from: RemoteEntry.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/provider/RemoteEntry$Builder;", "", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "<init>", "(Landroid/app/PendingIntent;)V", "build", "Landroidx/credentials/provider/RemoteEntry;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Builder {

        @NotNull
        private final PendingIntent pendingIntent;

        @NotNull
        public final RemoteEntry build() {
            return new RemoteEntry(this.pendingIntent);
        }

        public Builder(@NotNull PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            this.pendingIntent = pendingIntent;
        }
    }

    /* JADX INFO: compiled from: RemoteEntry.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0012H\u0007J\u0019\u0010\u0014\u001a\u00020\u0015*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000e*\u00020\u0017H\u0000¢\u0006\u0002\b\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Landroidx/credentials/provider/RemoteEntry$Companion;", "", "<init>", "()V", "TAG", "", "SLICE_HINT_PENDING_INTENT", "SLICE_HINT_IS_AUTO_SELECT", "SLICE_SPEC_TYPE", "REVISION_ID", "", "toSlice", "Landroid/app/slice/Slice;", "remoteEntry", "Landroidx/credentials/provider/RemoteEntry;", "fromSlice", "slice", "fromRemoteEntry", "Landroid/service/credentials/RemoteEntry;", "EXTRA_REMOTE_ENTRY_PENDING_INTENT", "marshall", "", "bundle", "Landroid/os/Bundle;", "marshall$credentials", "unmarshallRemoteEntry", "unmarshallRemoteEntry$credentials", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteEntry.kt\nandroidx/credentials/provider/RemoteEntry$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n1869#2,2:203\n*S KotlinDebug\n*F\n+ 1 RemoteEntry.kt\nandroidx/credentials/provider/RemoteEntry$Companion\n*L\n143#1:203,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void marshall$credentials(@NotNull RemoteEntry remoteEntry, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(remoteEntry, "<this>");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putParcelable(RemoteEntry.EXTRA_REMOTE_ENTRY_PENDING_INTENT, remoteEntry.getPendingIntent());
        }

        @Nullable
        public final RemoteEntry unmarshallRemoteEntry$credentials(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(RemoteEntry.EXTRA_REMOTE_ENTRY_PENDING_INTENT);
            if (pendingIntent == null) {
                return null;
            }
            return new RemoteEntry(pendingIntent);
        }

        @JvmStatic
        @Nullable
        public final RemoteEntry fromRemoteEntry(@NotNull android.service.credentials.RemoteEntry remoteEntry) {
            Intrinsics.checkNotNullParameter(remoteEntry, "remoteEntry");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromRemoteEntry(remoteEntry);
            }
            return null;
        }

        @JvmStatic
        @SuppressLint({"WrongConstant"})
        @Nullable
        @RequiresApi(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final RemoteEntry fromSlice(@NotNull Slice slice) {
            Intrinsics.checkNotNullParameter(slice, "slice");
            List items = slice.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
            Iterator it = items.iterator();
            boolean z11 = false;
            PendingIntent action = null;
            while (it.hasNext()) {
                SliceItem sliceItemM1596a = C0609b.m1596a(it.next());
                if (sliceItemM1596a.hasHint(RemoteEntry.SLICE_HINT_PENDING_INTENT)) {
                    action = sliceItemM1596a.getAction();
                } else if (sliceItemM1596a.hasHint(RemoteEntry.SLICE_HINT_IS_AUTO_SELECT)) {
                    z11 = true;
                }
            }
            try {
                Intrinsics.checkNotNull(action);
                return new RemoteEntry(action, z11);
            } catch (Exception e11) {
                Log.i("RemoteEntry", "fromSlice failed with: " + e11.getMessage());
                return null;
            }
        }

        @JvmStatic
        @NotNull
        @RequiresApi(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final Slice toSlice(@NotNull RemoteEntry remoteEntry) {
            Intrinsics.checkNotNullParameter(remoteEntry, "remoteEntry");
            PendingIntent pendingIntent = remoteEntry.getPendingIntent();
            C0607e.m1594a();
            Slice.Builder builderM1593a = C0606d.m1593a(Uri.EMPTY, C0605c.m1592a("RemoteEntry", 1));
            builderM1593a.addAction(pendingIntent, C0620m.m1607a(builderM1593a).addHints(Collections.singletonList(RemoteEntry.SLICE_HINT_PENDING_INTENT)).build(), null);
            if (remoteEntry.getIsAutoSelect()) {
                builderM1593a.addInt(1, null, CollectionsKt.listOf(RemoteEntry.SLICE_HINT_IS_AUTO_SELECT));
            }
            Slice sliceBuild = builderM1593a.build();
            Intrinsics.checkNotNullExpressionValue(sliceBuild, "build(...)");
            return sliceBuild;
        }
    }

    public RemoteEntry(@NotNull PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        this.pendingIntent = pendingIntent;
    }

    /* JADX INFO: compiled from: RemoteEntry.kt */
    @RequiresApi(34)
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/provider/RemoteEntry$Api34Impl;", "", "<init>", "()V", "fromRemoteEntry", "Landroidx/credentials/provider/RemoteEntry;", "remoteEntry", "Landroid/service/credentials/RemoteEntry;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        @JvmStatic
        @Nullable
        public static final RemoteEntry fromRemoteEntry(@NotNull android.service.credentials.RemoteEntry remoteEntry) {
            Intrinsics.checkNotNullParameter(remoteEntry, "remoteEntry");
            Slice slice = remoteEntry.getSlice();
            Intrinsics.checkNotNullExpressionValue(slice, "getSlice(...)");
            return RemoteEntry.INSTANCE.fromSlice(slice);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public RemoteEntry(@NotNull PendingIntent pendingIntent, boolean z11) {
        this(pendingIntent);
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        this.isAutoSelect = z11;
    }

    @JvmStatic
    @Nullable
    public static final RemoteEntry fromRemoteEntry(@NotNull android.service.credentials.RemoteEntry remoteEntry) {
        return INSTANCE.fromRemoteEntry(remoteEntry);
    }

    @JvmStatic
    @SuppressLint({"WrongConstant"})
    @Nullable
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final RemoteEntry fromSlice(@NotNull Slice slice) {
        return INSTANCE.fromSlice(slice);
    }

    @JvmStatic
    @NotNull
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final Slice toSlice(@NotNull RemoteEntry remoteEntry) {
        return INSTANCE.toSlice(remoteEntry);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof RemoteEntry) {
            return Intrinsics.areEqual(this.pendingIntent, ((RemoteEntry) other).pendingIntent);
        }
        return false;
    }

    @NotNull
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public int hashCode() {
        return this.pendingIntent.hashCode();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: isAutoSelect, reason: from getter */
    public final boolean getIsAutoSelect() {
        return this.isAutoSelect;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void setAutoSelect(boolean z11) {
        this.isAutoSelect = z11;
    }
}
