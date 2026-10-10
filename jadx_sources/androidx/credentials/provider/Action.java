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
import com.tencent.qcloud.tuicore.TUIConstants;
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

/* JADX INFO: compiled from: Action.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0003\u0013\u0014\u0015B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0016"}, m90084d2 = {"Landroidx/credentials/provider/Action;", "", "title", "", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "subtitle", "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;Ljava/lang/CharSequence;)V", "getTitle", "()Ljava/lang/CharSequence;", "getPendingIntent", "()Landroid/app/PendingIntent;", "getSubtitle", "equals", "", "other", "hashCode", "", "Builder", "Api34Impl", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Action.kt\nandroidx/credentials/provider/Action\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1#2:262\n*E\n"})
public final class Action {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_ACTION_PENDING_INTENT_PREFIX = "androidx.credentials.provider.extra.ACTION_PENDING_INTENT_";

    @NotNull
    private static final String EXTRA_ACTION_SIZE = "androidx.credentials.provider.extra.ACTION_SIZE";

    @NotNull
    private static final String EXTRA_ACTION_SUBTITLE_PREFIX = "androidx.credentials.provider.extra.ACTION_SUBTITLE_";

    @NotNull
    private static final String EXTRA_ACTION_TITLE_PREFIX = "androidx.credentials.provider.extra.ACTION_TITLE_";

    @NotNull
    private static final String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT";

    @NotNull
    private static final String SLICE_HINT_SUBTITLE = "androidx.credentials.provider.action.HINT_ACTION_SUBTEXT";

    @NotNull
    private static final String SLICE_HINT_TITLE = "androidx.credentials.provider.action.HINT_ACTION_TITLE";
    private static final int SLICE_SPEC_REVISION = 0;

    @NotNull
    private static final String SLICE_SPEC_TYPE = "Action";

    @NotNull
    private static final String TAG = "Action";

    @NotNull
    private final PendingIntent pendingIntent;

    @Nullable
    private final CharSequence subtitle;

    @NotNull
    private final CharSequence title;

    /* JADX INFO: compiled from: Action.kt */
    @RequiresApi(34)
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/provider/Action$Api34Impl;", "", "<init>", "()V", "fromAction", "Landroidx/credentials/provider/Action;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Landroid/service/credentials/Action;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        @JvmStatic
        @Nullable
        public static final Action fromAction(@NotNull android.service.credentials.Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            Slice slice = action.getSlice();
            Intrinsics.checkNotNullExpressionValue(slice, "getSlice(...)");
            return Action.INSTANCE.fromSlice(slice);
        }

        private Api34Impl() {
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Landroidx/credentials/provider/Action$Builder;", "", "title", "", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V", "subtitle", "setSubtitle", "build", "Landroidx/credentials/provider/Action;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Builder {

        @NotNull
        private final PendingIntent pendingIntent;

        @Nullable
        private CharSequence subtitle;

        @NotNull
        private final CharSequence title;

        @NotNull
        public final Action build() {
            return new Action(this.title, this.pendingIntent, this.subtitle);
        }

        @NotNull
        public final Builder setSubtitle(@Nullable CharSequence subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public Builder(@NotNull CharSequence title, @NotNull PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            this.title = title;
            this.pendingIntent = pendingIntent;
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0007J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0013H\u0007J\u001f\u0010\u0018\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a*\u00020\u001cH\u0000¢\u0006\u0002\b\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Landroidx/credentials/provider/Action$Companion;", "", "<init>", "()V", "TAG", "", "SLICE_SPEC_REVISION", "", "SLICE_SPEC_TYPE", "SLICE_HINT_TITLE", "SLICE_HINT_SUBTITLE", "SLICE_HINT_PENDING_INTENT", "toSlice", "Landroid/app/slice/Slice;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Landroidx/credentials/provider/Action;", "fromSlice", "slice", "fromAction", "Landroid/service/credentials/Action;", "EXTRA_ACTION_SIZE", "EXTRA_ACTION_PENDING_INTENT_PREFIX", "EXTRA_ACTION_TITLE_PREFIX", "EXTRA_ACTION_SUBTITLE_PREFIX", "marshall", "", "", "bundle", "Landroid/os/Bundle;", "marshall$credentials", "unmarshallActionList", "unmarshallActionList$credentials", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Action.kt\nandroidx/credentials/provider/Action$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n1869#2,2:262\n*S KotlinDebug\n*F\n+ 1 Action.kt\nandroidx/credentials/provider/Action$Companion\n*L\n169#1:262,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final Action fromAction(@NotNull android.service.credentials.Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromAction(action);
            }
            return null;
        }

        public final void marshall$credentials(@NotNull List<Action> list, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putInt(Action.EXTRA_ACTION_SIZE, list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                bundle.putParcelable(Action.EXTRA_ACTION_PENDING_INTENT_PREFIX + i11, list.get(i11).getPendingIntent());
                bundle.putCharSequence(Action.EXTRA_ACTION_TITLE_PREFIX + i11, list.get(i11).getTitle());
                bundle.putCharSequence(Action.EXTRA_ACTION_SUBTITLE_PREFIX + i11, list.get(i11).getSubtitle());
            }
        }

        @JvmStatic
        @NotNull
        @RequiresApi(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final Slice toSlice(@NotNull Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            CharSequence title = action.getTitle();
            CharSequence subtitle = action.getSubtitle();
            PendingIntent pendingIntent = action.getPendingIntent();
            C0607e.m1594a();
            Slice.Builder builderAddText = C0606d.m1593a(Uri.EMPTY, C0605c.m1592a("Action", 0)).addText(title, null, CollectionsKt.listOf(Action.SLICE_HINT_TITLE)).addText(subtitle, null, CollectionsKt.listOf(Action.SLICE_HINT_SUBTITLE));
            builderAddText.addAction(pendingIntent, C0620m.m1607a(builderAddText).addHints(Collections.singletonList(Action.SLICE_HINT_PENDING_INTENT)).build(), null);
            Slice sliceBuild = builderAddText.build();
            Intrinsics.checkNotNullExpressionValue(sliceBuild, "build(...)");
            return sliceBuild;
        }

        @NotNull
        public final List<Action> unmarshallActionList$credentials(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            ArrayList arrayList = new ArrayList();
            int i11 = bundle.getInt(Action.EXTRA_ACTION_SIZE, 0);
            for (int i12 = 0; i12 < i11; i12++) {
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(Action.EXTRA_ACTION_PENDING_INTENT_PREFIX + i12);
                CharSequence charSequence = bundle.getCharSequence(Action.EXTRA_ACTION_TITLE_PREFIX + i12);
                CharSequence charSequence2 = bundle.getCharSequence(Action.EXTRA_ACTION_SUBTITLE_PREFIX + i12);
                if (pendingIntent == null || charSequence == null) {
                    return CollectionsKt.emptyList();
                }
                arrayList.add(new Action(charSequence, pendingIntent, charSequence2));
            }
            return arrayList;
        }

        @JvmStatic
        @SuppressLint({"WrongConstant"})
        @Nullable
        @RequiresApi(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final Action fromSlice(@NotNull Slice slice) {
            Intrinsics.checkNotNullParameter(slice, "slice");
            List items = slice.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
            Iterator it = items.iterator();
            CharSequence text = "";
            PendingIntent action = null;
            CharSequence text2 = null;
            while (it.hasNext()) {
                SliceItem sliceItemM1596a = C0609b.m1596a(it.next());
                if (sliceItemM1596a.hasHint(Action.SLICE_HINT_TITLE)) {
                    text = sliceItemM1596a.getText();
                    Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                } else if (sliceItemM1596a.hasHint(Action.SLICE_HINT_SUBTITLE)) {
                    text2 = sliceItemM1596a.getText();
                } else if (sliceItemM1596a.hasHint(Action.SLICE_HINT_PENDING_INTENT)) {
                    action = sliceItemM1596a.getAction();
                }
            }
            try {
                Intrinsics.checkNotNull(action);
                return new Action(text, action, text2);
            } catch (Exception e11) {
                Log.i("Action", "fromSlice failed with: " + e11.getMessage());
                return null;
            }
        }
    }

    public Action(@NotNull CharSequence title, @NotNull PendingIntent pendingIntent, @Nullable CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        this.title = title;
        this.pendingIntent = pendingIntent;
        this.subtitle = charSequence;
        if (title.length() <= 0) {
            throw new IllegalArgumentException("title must not be empty");
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Action)) {
            return false;
        }
        Action action = (Action) other;
        return Intrinsics.areEqual(this.title, action.title) && Intrinsics.areEqual(this.pendingIntent, action.pendingIntent) && Intrinsics.areEqual(this.subtitle, action.subtitle);
    }

    @JvmStatic
    @Nullable
    public static final Action fromAction(@NotNull android.service.credentials.Action action) {
        return INSTANCE.fromAction(action);
    }

    @JvmStatic
    @SuppressLint({"WrongConstant"})
    @Nullable
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final Action fromSlice(@NotNull Slice slice) {
        return INSTANCE.fromSlice(slice);
    }

    @JvmStatic
    @NotNull
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final Slice toSlice(@NotNull Action action) {
        return INSTANCE.toSlice(action);
    }

    @NotNull
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    @Nullable
    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.pendingIntent.hashCode()) * 31;
        CharSequence charSequence = this.subtitle;
        return iHashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public /* synthetic */ Action(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, pendingIntent, (i11 & 4) != 0 ? null : charSequence2);
    }
}
