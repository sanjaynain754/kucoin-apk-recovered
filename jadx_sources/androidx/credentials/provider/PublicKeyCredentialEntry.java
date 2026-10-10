package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.C1958R;
import androidx.credentials.CredentialOption;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.provider.utils.CryptoObjectUtils;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PublicKeyCredentialEntry.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(23)
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 /2\u00020\u0001:\u0005,-./0B\u0097\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019B_\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u001cBk\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u001dBU\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010)R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010*\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010+\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b+\u0010)¨\u00061"}, m90084d2 = {"Landroidx/credentials/provider/PublicKeyCredentialEntry;", "Landroidx/credentials/provider/CredentialEntry;", "username", "", "displayName", "typeDisplayName", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", TUIConstants.TUIChat.INPUT_MORE_ICON, "Landroid/graphics/drawable/Icon;", "lastUsedTime", "Ljava/time/Instant;", "isAutoSelectAllowed", "", "beginGetPublicKeyCredentialOption", "Landroidx/credentials/provider/BeginGetPublicKeyCredentialOption;", "isDefaultIconPreferredAsSingleProvider", "entryGroupId", "affiliatedDomain", "biometricPromptData", "Landroidx/credentials/provider/BiometricPromptData;", "autoSelectAllowedFromOption", "isCreatedFromSlice", "isDefaultIconFromSlice", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/graphics/drawable/Icon;Ljava/time/Instant;ZLandroidx/credentials/provider/BeginGetPublicKeyCredentialOption;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;Landroidx/credentials/provider/BiometricPromptData;ZZZ)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/BeginGetPublicKeyCredentialOption;Ljava/lang/CharSequence;Ljava/time/Instant;Landroid/graphics/drawable/Icon;ZZ)V", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/BeginGetPublicKeyCredentialOption;Ljava/lang/CharSequence;Ljava/time/Instant;Landroid/graphics/drawable/Icon;ZZLandroidx/credentials/provider/BiometricPromptData;)V", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/BeginGetPublicKeyCredentialOption;Ljava/lang/CharSequence;Ljava/time/Instant;Landroid/graphics/drawable/Icon;Z)V", "getUsername", "()Ljava/lang/CharSequence;", "getDisplayName", "getTypeDisplayName", "getPendingIntent", "()Landroid/app/PendingIntent;", "getIcon", "()Landroid/graphics/drawable/Icon;", "getLastUsedTime", "()Ljava/time/Instant;", "()Z", "isAutoSelectAllowedFromOption", "hasDefaultIcon", "Api34Impl", "Api35Impl", "Api28Impl", "Companion", "Builder", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPublicKeyCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicKeyCredentialEntry.kt\nandroidx/credentials/provider/PublicKeyCredentialEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,880:1\n1#2:881\n*E\n"})
public final class PublicKeyCredentialEntry extends CredentialEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "PublicKeyCredEntry";

    @Nullable
    private final CharSequence displayName;

    @NotNull
    private final Icon icon;
    private final boolean isAutoSelectAllowed;
    private final boolean isAutoSelectAllowedFromOption;
    private final boolean isCreatedFromSlice;
    private final boolean isDefaultIconFromSlice;

    @Nullable
    private final Instant lastUsedTime;

    @NotNull
    private final PendingIntent pendingIntent;

    @NotNull
    private final CharSequence typeDisplayName;

    @NotNull
    private final CharSequence username;

    /* JADX INFO: compiled from: PublicKeyCredentialEntry.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\tH\u0007¨\u0006\u0010"}, m90084d2 = {"Landroidx/credentials/provider/PublicKeyCredentialEntry$Api28Impl;", "", "<init>", "()V", "isDefaultIcon", "", "entry", "Landroidx/credentials/provider/PublicKeyCredentialEntry;", "toSlice", "Landroid/app/slice/Slice;", "addToSlice", "", "sliceBuilder", "Landroid/app/slice/Slice$Builder;", "fromSlice", "slice", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @RequiresApi(28)
    @SourceDebugExtension({"SMAP\nPublicKeyCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicKeyCredentialEntry.kt\nandroidx/credentials/provider/PublicKeyCredentialEntry$Api28Impl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,880:1\n1869#2,2:881\n*S KotlinDebug\n*F\n+ 1 PublicKeyCredentialEntry.kt\nandroidx/credentials/provider/PublicKeyCredentialEntry$Api28Impl\n*L\n531#1:881,2\n*E\n"})
    public static final class Api28Impl {

        @NotNull
        public static final Api28Impl INSTANCE = new Api28Impl();

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static final boolean isDefaultIcon(@NotNull PublicKeyCredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (entry.isCreatedFromSlice) {
                return entry.isDefaultIconFromSlice;
            }
            return entry.getIcon().getType() == 2 && entry.getIcon().getResId() == C1958R.drawable.adx_ic_passkey;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final Slice toSlice(@NotNull PublicKeyCredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(entry.getType(), 1));
            INSTANCE.addToSlice(entry, builder);
            Slice sliceBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(sliceBuild, "build(...)");
            return sliceBuild;
        }

        public final void addToSlice(@NotNull PublicKeyCredentialEntry entry, @NotNull Slice.Builder sliceBuilder) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(sliceBuilder, "sliceBuilder");
            BeginGetCredentialOption beginGetCredentialOption = entry.getBeginGetCredentialOption();
            CharSequence entryGroupId = entry.getEntryGroupId();
            boolean isDefaultIconPreferredAsSingleProvider = entry.getIsDefaultIconPreferredAsSingleProvider();
            CharSequence affiliatedDomain = entry.getAffiliatedDomain();
            String str = CredentialEntry.FALSE_STRING;
            sliceBuilder.addText(beginGetCredentialOption.getId(), null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_OPTION_ID)).addText(entryGroupId, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_DEDUPLICATION_ID)).addText(isDefaultIconPreferredAsSingleProvider ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED)).addText(affiliatedDomain, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_AFFILIATED_DOMAIN));
            CharSequence username = entry.getUsername();
            CharSequence displayName = entry.getDisplayName();
            PendingIntent pendingIntent = entry.getPendingIntent();
            CharSequence typeDisplayName = entry.getTypeDisplayName();
            Instant lastUsedTime = entry.getLastUsedTime();
            Icon icon = entry.getIcon();
            if (entry.getIsAutoSelectAllowed()) {
                str = CredentialEntry.TRUE_STRING;
            }
            sliceBuilder.addText(typeDisplayName, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME)).addText(username, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_TITLE)).addText(displayName, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_SUBTITLE)).addText(str, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_AUTO_ALLOWED)).addIcon(icon, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_ICON));
            try {
                if (entry.hasDefaultIcon()) {
                    sliceBuilder.addInt(1, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID));
                }
            } catch (IllegalStateException unused) {
            }
            if (entry.getIsAutoSelectAllowedFromOption()) {
                sliceBuilder.addInt(1, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION));
            }
            if (lastUsedTime != null) {
                sliceBuilder.addLong(lastUsedTime.toEpochMilli(), null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS));
            }
            sliceBuilder.addAction(pendingIntent, new Slice.Builder(sliceBuilder).addHints(Collections.singletonList(CredentialEntry.SLICE_HINT_PENDING_INTENT)).build(), null);
        }

        private Api28Impl() {
        }

        @JvmStatic
        @SuppressLint({"WrongConstant"})
        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static final PublicKeyCredentialEntry fromSlice(@NotNull Slice slice) {
            Intrinsics.checkNotNullParameter(slice, "slice");
            List<SliceItem> items = slice.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
            CharSequence text = null;
            CharSequence text2 = null;
            CharSequence text3 = null;
            PendingIntent action = null;
            Icon icon = null;
            Instant instantOfEpochMilli = null;
            CharSequence text4 = null;
            CharSequence text5 = null;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            CharSequence text6 = null;
            for (SliceItem sliceItem : items) {
                if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_OPTION_ID)) {
                    text6 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_DEDUPLICATION_ID)) {
                    text4 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED)) {
                    if (Intrinsics.areEqual(sliceItem.getText(), CredentialEntry.TRUE_STRING)) {
                        z12 = true;
                    }
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_AFFILIATED_DOMAIN)) {
                    text5 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME)) {
                    text3 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_TITLE)) {
                    text = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_SUBTITLE)) {
                    text2 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_ICON)) {
                    icon = sliceItem.getIcon();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_PENDING_INTENT)) {
                    action = sliceItem.getAction();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS)) {
                    instantOfEpochMilli = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_AUTO_ALLOWED)) {
                    if (Intrinsics.areEqual(sliceItem.getText(), CredentialEntry.TRUE_STRING)) {
                        z11 = true;
                    }
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION)) {
                    z13 = true;
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID)) {
                    z14 = true;
                }
            }
            try {
                Intrinsics.checkNotNull(text);
                Intrinsics.checkNotNull(text3);
                Intrinsics.checkNotNull(action);
                Intrinsics.checkNotNull(icon);
                BeginGetPublicKeyCredentialOption.Companion companion = BeginGetPublicKeyCredentialOption.INSTANCE;
                Bundle bundle = new Bundle();
                Intrinsics.checkNotNull(text6);
                return new PublicKeyCredentialEntry(text, text2, text3, action, icon, instantOfEpochMilli, z11, companion.createFromEntrySlice$credentials(bundle, text6.toString()), z12, text4, text5, null, z13, true, z14, 2048, null);
            } catch (Exception e11) {
                Log.i(PublicKeyCredentialEntry.TAG, "fromSlice failed with: " + e11.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: PublicKeyCredentialEntry.kt */
    @RequiresApi(34)
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/provider/PublicKeyCredentialEntry$Api34Impl;", "", "<init>", "()V", "fromCredentialEntry", "Landroidx/credentials/provider/PublicKeyCredentialEntry;", "credentialEntry", "Landroid/service/credentials/CredentialEntry;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        @JvmStatic
        @Nullable
        public static final PublicKeyCredentialEntry fromCredentialEntry(@NotNull android.service.credentials.CredentialEntry credentialEntry) {
            Intrinsics.checkNotNullParameter(credentialEntry, "credentialEntry");
            Slice slice = credentialEntry.getSlice();
            Intrinsics.checkNotNullExpressionValue(slice, "getSlice(...)");
            return PublicKeyCredentialEntry.INSTANCE.fromSlice(slice);
        }

        private Api34Impl() {
        }
    }

    /* JADX INFO: compiled from: PublicKeyCredentialEntry.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0007¨\u0006\u000e"}, m90084d2 = {"Landroidx/credentials/provider/PublicKeyCredentialEntry$Api35Impl;", "", "<init>", "()V", "toSlice", "Landroid/app/slice/Slice;", "entry", "Landroidx/credentials/provider/PublicKeyCredentialEntry;", "addToSlice", "", "sliceBuilder", "Landroid/app/slice/Slice$Builder;", "fromSlice", "slice", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @RequiresApi(35)
    @SourceDebugExtension({"SMAP\nPublicKeyCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicKeyCredentialEntry.kt\nandroidx/credentials/provider/PublicKeyCredentialEntry$Api35Impl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,880:1\n1869#2,2:881\n*S KotlinDebug\n*F\n+ 1 PublicKeyCredentialEntry.kt\nandroidx/credentials/provider/PublicKeyCredentialEntry$Api35Impl\n*L\n370#1:881,2\n*E\n"})
    public static final class Api35Impl {

        @NotNull
        public static final Api35Impl INSTANCE = new Api35Impl();

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final Slice toSlice(@NotNull PublicKeyCredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(entry.getType(), 1));
            Api28Impl.INSTANCE.addToSlice(entry, builder);
            INSTANCE.addToSlice(entry, builder);
            Slice sliceBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(sliceBuild, "build(...)");
            return sliceBuild;
        }

        public final void addToSlice(@NotNull PublicKeyCredentialEntry entry, @NotNull Slice.Builder sliceBuilder) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(sliceBuilder, "sliceBuilder");
            BiometricPromptData biometricPromptData = entry.getBiometricPromptData();
            if (biometricPromptData != null) {
                sliceBuilder.addInt(biometricPromptData.getAllowedAuthenticators(), null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS));
                if (biometricPromptData.getCryptoObject() != null) {
                    sliceBuilder.addLong(CryptoObjectUtils.INSTANCE.getOperationHandle(biometricPromptData.getCryptoObject()), null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_CRYPTO_OP_ID));
                }
                sliceBuilder.addBundle(BiometricPromptData.INSTANCE.toBundle(biometricPromptData), null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA));
            }
        }

        private Api35Impl() {
        }

        @JvmStatic
        @SuppressLint({"WrongConstant"})
        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static final PublicKeyCredentialEntry fromSlice(@NotNull Slice slice) {
            BiometricPromptData biometricPromptDataFromBundle;
            Intrinsics.checkNotNullParameter(slice, "slice");
            PublicKeyCredentialEntry publicKeyCredentialEntryFromSlice = Api28Impl.fromSlice(slice);
            if (publicKeyCredentialEntryFromSlice == null) {
                return null;
            }
            List<SliceItem> items = slice.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
            Bundle bundle = null;
            for (SliceItem sliceItem : items) {
                if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA)) {
                    bundle = sliceItem.getBundle();
                }
            }
            try {
                CharSequence username = publicKeyCredentialEntryFromSlice.getUsername();
                CharSequence displayName = publicKeyCredentialEntryFromSlice.getDisplayName();
                CharSequence typeDisplayName = publicKeyCredentialEntryFromSlice.getTypeDisplayName();
                PendingIntent pendingIntent = publicKeyCredentialEntryFromSlice.getPendingIntent();
                Icon icon = publicKeyCredentialEntryFromSlice.getIcon();
                Instant lastUsedTime = publicKeyCredentialEntryFromSlice.getLastUsedTime();
                boolean isAutoSelectAllowed = publicKeyCredentialEntryFromSlice.getIsAutoSelectAllowed();
                BeginGetCredentialOption beginGetCredentialOption = publicKeyCredentialEntryFromSlice.getBeginGetCredentialOption();
                Intrinsics.checkNotNull(beginGetCredentialOption, "null cannot be cast to non-null type androidx.credentials.provider.BeginGetPublicKeyCredentialOption");
                BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption = (BeginGetPublicKeyCredentialOption) beginGetCredentialOption;
                CharSequence entryGroupId = publicKeyCredentialEntryFromSlice.getEntryGroupId();
                boolean isDefaultIconPreferredAsSingleProvider = publicKeyCredentialEntryFromSlice.getIsDefaultIconPreferredAsSingleProvider();
                CharSequence affiliatedDomain = publicKeyCredentialEntryFromSlice.getAffiliatedDomain();
                boolean isAutoSelectAllowedFromOption = publicKeyCredentialEntryFromSlice.getIsAutoSelectAllowedFromOption();
                boolean z11 = publicKeyCredentialEntryFromSlice.isDefaultIconFromSlice;
                if (bundle != null) {
                    biometricPromptDataFromBundle = BiometricPromptData.INSTANCE.fromBundle(bundle);
                } else {
                    biometricPromptDataFromBundle = null;
                }
                return new PublicKeyCredentialEntry(username, displayName, typeDisplayName, pendingIntent, icon, lastUsedTime, isAutoSelectAllowed, beginGetPublicKeyCredentialOption, isDefaultIconPreferredAsSingleProvider, entryGroupId, affiliatedDomain, biometricPromptDataFromBundle, isAutoSelectAllowedFromOption, true, z11);
            } catch (Exception e11) {
                Log.i(PublicKeyCredentialEntry.TAG, "fromSlice failed with: " + e11.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: PublicKeyCredentialEntry.kt */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0018\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Landroidx/credentials/provider/PublicKeyCredentialEntry$Builder;", "", "context", "Landroid/content/Context;", "username", "", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "beginGetPublicKeyCredentialOption", "Landroidx/credentials/provider/BeginGetPublicKeyCredentialOption;", "<init>", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/BeginGetPublicKeyCredentialOption;)V", "displayName", "lastUsedTime", "Ljava/time/Instant;", TUIConstants.TUIChat.INPUT_MORE_ICON, "Landroid/graphics/drawable/Icon;", "autoSelectAllowed", "", "isDefaultIconPreferredAsSingleProvider", "biometricPromptData", "Landroidx/credentials/provider/BiometricPromptData;", "setDisplayName", "setIcon", "setBiometricPromptData", "setAutoSelectAllowed", "setLastUsedTime", "setDefaultIconPreferredAsSingleProvider", "build", "Landroidx/credentials/provider/PublicKeyCredentialEntry;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Builder {
        private boolean autoSelectAllowed;

        @NotNull
        private final BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption;

        @Nullable
        private BiometricPromptData biometricPromptData;

        @NotNull
        private final Context context;

        @Nullable
        private CharSequence displayName;

        @Nullable
        private Icon icon;
        private boolean isDefaultIconPreferredAsSingleProvider;

        @Nullable
        private Instant lastUsedTime;

        @NotNull
        private final PendingIntent pendingIntent;

        @NotNull
        private final CharSequence username;

        public Builder(@NotNull Context context, @NotNull CharSequence username, @NotNull PendingIntent pendingIntent, @NotNull BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            Intrinsics.checkNotNullParameter(beginGetPublicKeyCredentialOption, "beginGetPublicKeyCredentialOption");
            this.context = context;
            this.username = username;
            this.pendingIntent = pendingIntent;
            this.beginGetPublicKeyCredentialOption = beginGetPublicKeyCredentialOption;
        }

        @NotNull
        public final PublicKeyCredentialEntry build() {
            if (this.icon == null) {
                this.icon = Icon.createWithResource(this.context, C1958R.drawable.adx_ic_passkey);
            }
            String string = this.context.getString(C1958R.string.androidx_credentials_TYPE_PUBLIC_KEY_CREDENTIAL);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            CharSequence charSequence = this.username;
            CharSequence charSequence2 = this.displayName;
            PendingIntent pendingIntent = this.pendingIntent;
            Icon icon = this.icon;
            Intrinsics.checkNotNull(icon);
            return new PublicKeyCredentialEntry(charSequence, charSequence2, string, pendingIntent, icon, this.lastUsedTime, this.autoSelectAllowed, this.beginGetPublicKeyCredentialOption, this.isDefaultIconPreferredAsSingleProvider, null, null, this.biometricPromptData, false, false, false, 30208, null);
        }

        @NotNull
        public final Builder setAutoSelectAllowed(boolean autoSelectAllowed) {
            this.autoSelectAllowed = autoSelectAllowed;
            return this;
        }

        @RequiresApi(35)
        @NotNull
        public final Builder setBiometricPromptData(@Nullable BiometricPromptData biometricPromptData) {
            this.biometricPromptData = biometricPromptData;
            return this;
        }

        @NotNull
        public final Builder setDefaultIconPreferredAsSingleProvider(boolean isDefaultIconPreferredAsSingleProvider) {
            this.isDefaultIconPreferredAsSingleProvider = isDefaultIconPreferredAsSingleProvider;
            return this;
        }

        @NotNull
        public final Builder setDisplayName(@Nullable CharSequence displayName) {
            this.displayName = displayName;
            return this;
        }

        @NotNull
        public final Builder setIcon(@NotNull Icon icon) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            return this;
        }

        @NotNull
        public final Builder setLastUsedTime(@Nullable Instant lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
    }

    /* JADX INFO: compiled from: PublicKeyCredentialEntry.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eH\u0007J!\u0010\u000f\u001a\u00020\u0010*\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\u001f\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Landroidx/credentials/provider/PublicKeyCredentialEntry$Companion;", "", "<init>", "()V", "TAG", "", "toSlice", "Landroid/app/slice/Slice;", "entry", "Landroidx/credentials/provider/PublicKeyCredentialEntry;", "fromSlice", "slice", "fromCredentialEntry", "credentialEntry", "Landroid/service/credentials/CredentialEntry;", "marshall", "", "bundle", "Landroid/os/Bundle;", "index", "", "marshall$credentials", "unmarshall", "unmarshall$credentials", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final PublicKeyCredentialEntry fromCredentialEntry(@NotNull android.service.credentials.CredentialEntry credentialEntry) {
            Intrinsics.checkNotNullParameter(credentialEntry, "credentialEntry");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromCredentialEntry(credentialEntry);
            }
            return null;
        }

        public final void marshall$credentials(@NotNull PublicKeyCredentialEntry publicKeyCredentialEntry, @NotNull Bundle bundle, int i11) {
            Instant lastUsedTime;
            Intrinsics.checkNotNullParameter(publicKeyCredentialEntry, "<this>");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            CredentialEntry.INSTANCE.marshallCommonProperties$credentials(publicKeyCredentialEntry, bundle, i11);
            bundle.putParcelable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX + i11, publicKeyCredentialEntry.getPendingIntent());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX + i11, publicKeyCredentialEntry.getIsAutoSelectAllowed());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX + i11, publicKeyCredentialEntry.getIsAutoSelectAllowedFromOption());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX + i11, publicKeyCredentialEntry.hasDefaultIcon());
            bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TITLE_PREFIX + i11, publicKeyCredentialEntry.getUsername());
            bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX + i11, publicKeyCredentialEntry.getTypeDisplayName());
            bundle.putParcelable(CredentialEntry.EXTRA_CREDENTIAL_TYPE_ICON_PREFIX + i11, publicKeyCredentialEntry.getIcon());
            CharSequence displayName = publicKeyCredentialEntry.getDisplayName();
            if (displayName != null) {
                bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_SUBTITLE_PREFIX + i11, displayName);
            }
            if (Build.VERSION.SDK_INT < 26 || (lastUsedTime = publicKeyCredentialEntry.getLastUsedTime()) == null) {
                return;
            }
            bundle.putLong(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_MILLIS_PREFIX + i11, lastUsedTime.toEpochMilli());
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final Slice toSlice(@NotNull PublicKeyCredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 35) {
                return Api35Impl.toSlice(entry);
            }
            if (i11 >= 28) {
                return Api28Impl.toSlice(entry);
            }
            return null;
        }

        @Nullable
        public final PublicKeyCredentialEntry unmarshall$credentials(@NotNull Bundle bundle, int index) {
            Instant instantOfEpochMilli;
            Instant instant;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            try {
                String string = bundle.getString(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_ID_PREFIX + index);
                Intrinsics.checkNotNull(string);
                Bundle bundle2 = bundle.getBundle(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_DATA_PREFIX + index);
                Intrinsics.checkNotNull(bundle2);
                CharSequence charSequence = bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_GROUP_ID_PREFIX + index);
                boolean z11 = bundle.getBoolean(CredentialEntry.f2625xa327c1a7 + index, false);
                CharSequence charSequence2 = bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_PREFIX + index);
                Parcelable parcelable = bundle.getParcelable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX + index);
                Intrinsics.checkNotNull(parcelable);
                PendingIntent pendingIntent = (PendingIntent) parcelable;
                boolean z12 = bundle.getBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX + index, false);
                boolean z13 = bundle.getBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX + index, false);
                boolean z14 = bundle.getBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX + index, false);
                CharSequence charSequence3 = bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TITLE_PREFIX + index);
                Intrinsics.checkNotNull(charSequence3);
                CharSequence charSequence4 = bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX + index);
                Intrinsics.checkNotNull(charSequence4);
                Parcelable parcelable2 = bundle.getParcelable(CredentialEntry.EXTRA_CREDENTIAL_TYPE_ICON_PREFIX + index);
                Intrinsics.checkNotNull(parcelable2);
                Icon icon = (Icon) parcelable2;
                CharSequence charSequence5 = bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_SUBTITLE_PREFIX + index);
                if (Build.VERSION.SDK_INT < 26) {
                    return new PublicKeyCredentialEntry(charSequence3, charSequence5, charSequence4, pendingIntent, icon, null, z12, BeginGetPublicKeyCredentialOption.INSTANCE.createFrom$credentials(bundle2, string), z11, charSequence, charSequence2, null, z13, true, z14, 2048, null);
                }
                if (bundle.containsKey(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_MILLIS_PREFIX + index)) {
                    try {
                        instantOfEpochMilli = Instant.ofEpochMilli(bundle.getLong(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_MILLIS_PREFIX + index));
                    } catch (Exception unused) {
                        instantOfEpochMilli = null;
                    }
                    instant = instantOfEpochMilli;
                } else {
                    instant = null;
                }
                return new PublicKeyCredentialEntry(charSequence3, charSequence5, charSequence4, pendingIntent, icon, instant, z12, BeginGetPublicKeyCredentialOption.INSTANCE.createFrom$credentials(bundle2, string), z11, charSequence, charSequence2, null, z13, true, z14, 2048, null);
            } catch (Exception unused2) {
                return null;
            }
        }

        @JvmStatic
        @SuppressLint({"WrongConstant"})
        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final PublicKeyCredentialEntry fromSlice(@NotNull Slice slice) {
            Intrinsics.checkNotNullParameter(slice, "slice");
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 35) {
                return Api35Impl.fromSlice(slice);
            }
            if (i11 >= 28) {
                return Api28Impl.fromSlice(slice);
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublicKeyCredentialEntry(@NotNull CharSequence username, @Nullable CharSequence charSequence, @NotNull CharSequence typeDisplayName, @NotNull PendingIntent pendingIntent, @NotNull Icon icon, @Nullable Instant instant, boolean z11, @NotNull BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption, boolean z12, @Nullable CharSequence charSequence2, @Nullable CharSequence charSequence3, @Nullable BiometricPromptData biometricPromptData, boolean z13, boolean z14, boolean z15) {
        super(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, beginGetPublicKeyCredentialOption, charSequence2 == null ? username : charSequence2, z12, charSequence3, biometricPromptData);
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(typeDisplayName, "typeDisplayName");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(beginGetPublicKeyCredentialOption, "beginGetPublicKeyCredentialOption");
        this.username = username;
        this.displayName = charSequence;
        this.typeDisplayName = typeDisplayName;
        this.pendingIntent = pendingIntent;
        this.icon = icon;
        this.lastUsedTime = instant;
        this.isAutoSelectAllowed = z11;
        this.isCreatedFromSlice = z14;
        this.isDefaultIconFromSlice = z15;
        this.isAutoSelectAllowedFromOption = z13;
        if (username.length() <= 0) {
            throw new IllegalArgumentException("username must not be empty");
        }
        if (typeDisplayName.length() <= 0) {
            throw new IllegalArgumentException("typeDisplayName must not be empty");
        }
    }

    @JvmStatic
    @Nullable
    public static final PublicKeyCredentialEntry fromCredentialEntry(@NotNull android.service.credentials.CredentialEntry credentialEntry) {
        return INSTANCE.fromCredentialEntry(credentialEntry);
    }

    @JvmStatic
    @SuppressLint({"WrongConstant"})
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final PublicKeyCredentialEntry fromSlice(@NotNull Slice slice) {
        return INSTANCE.fromSlice(slice);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public static final Slice toSlice(@NotNull PublicKeyCredentialEntry publicKeyCredentialEntry) {
        return INSTANCE.toSlice(publicKeyCredentialEntry);
    }

    @Nullable
    public final CharSequence getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    @Nullable
    public final Instant getLastUsedTime() {
        return this.lastUsedTime;
    }

    @NotNull
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    @NotNull
    public final CharSequence getTypeDisplayName() {
        return this.typeDisplayName;
    }

    @NotNull
    public final CharSequence getUsername() {
        return this.username;
    }

    @JvmName(name = "hasDefaultIcon")
    public final boolean hasDefaultIcon() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.isDefaultIcon(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: isAutoSelectAllowed, reason: from getter */
    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    /* JADX INFO: renamed from: isAutoSelectAllowedFromOption, reason: from getter */
    public final boolean getIsAutoSelectAllowedFromOption() {
        return this.isAutoSelectAllowedFromOption;
    }

    public /* synthetic */ PublicKeyCredentialEntry(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, PendingIntent pendingIntent, Icon icon, Instant instant, boolean z11, BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption, boolean z12, CharSequence charSequence4, CharSequence charSequence5, BiometricPromptData biometricPromptData, boolean z13, boolean z14, boolean z15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, charSequence2, charSequence3, pendingIntent, icon, instant, z11, beginGetPublicKeyCredentialOption, z12, (i11 & 512) != 0 ? charSequence : charSequence4, (i11 & 1024) != 0 ? null : charSequence5, (i11 & 2048) != 0 ? null : biometricPromptData, (i11 & 4096) != 0 ? CredentialOption.INSTANCE.extractAutoSelectValue$credentials(beginGetPublicKeyCredentialOption.getCandidateQueryData()) : z13, (i11 & 8192) != 0 ? false : z14, (i11 & 16384) != 0 ? false : z15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PublicKeyCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        charSequence2 = (i11 & 16) != 0 ? null : charSequence2;
        instant = (i11 & 32) != 0 ? null : instant;
        if ((i11 & 64) != 0) {
            icon = Icon.createWithResource(context, C1958R.drawable.adx_ic_passkey);
            Intrinsics.checkNotNullExpressionValue(icon, "createWithResource(...)");
        }
        this(context, charSequence, pendingIntent, beginGetPublicKeyCredentialOption, charSequence2, instant, icon, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? false : z12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PublicKeyCredentialEntry(@NotNull Context context, @NotNull CharSequence username, @NotNull PendingIntent pendingIntent, @NotNull BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption, @Nullable CharSequence charSequence, @Nullable Instant instant, @NotNull Icon icon, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(beginGetPublicKeyCredentialOption, "beginGetPublicKeyCredentialOption");
        Intrinsics.checkNotNullParameter(icon, "icon");
        String string = context.getString(C1958R.string.androidx_credentials_TYPE_PUBLIC_KEY_CREDENTIAL);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this(username, charSequence, string, pendingIntent, icon, instant, z11, beginGetPublicKeyCredentialOption, z12, null, null, null, false, false, false, 32256, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PublicKeyCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z11, boolean z12, BiometricPromptData biometricPromptData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        charSequence2 = (i11 & 16) != 0 ? null : charSequence2;
        instant = (i11 & 32) != 0 ? null : instant;
        if ((i11 & 64) != 0) {
            icon = Icon.createWithResource(context, C1958R.drawable.adx_ic_passkey);
            Intrinsics.checkNotNullExpressionValue(icon, "createWithResource(...)");
        }
        this(context, charSequence, pendingIntent, beginGetPublicKeyCredentialOption, charSequence2, instant, icon, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? false : z12, (i11 & 512) != 0 ? null : biometricPromptData);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @RequiresApi(35)
    public PublicKeyCredentialEntry(@NotNull Context context, @NotNull CharSequence username, @NotNull PendingIntent pendingIntent, @NotNull BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption, @Nullable CharSequence charSequence, @Nullable Instant instant, @NotNull Icon icon, boolean z11, boolean z12, @Nullable BiometricPromptData biometricPromptData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(beginGetPublicKeyCredentialOption, "beginGetPublicKeyCredentialOption");
        Intrinsics.checkNotNullParameter(icon, "icon");
        String string = context.getString(C1958R.string.androidx_credentials_TYPE_PUBLIC_KEY_CREDENTIAL);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this(username, charSequence, string, pendingIntent, icon, instant, z11, beginGetPublicKeyCredentialOption, z12, null, null, biometricPromptData, false, false, false, 30208, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PublicKeyCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        charSequence2 = (i11 & 16) != 0 ? null : charSequence2;
        instant = (i11 & 32) != 0 ? null : instant;
        if ((i11 & 64) != 0) {
            icon = Icon.createWithResource(context, C1958R.drawable.adx_ic_passkey);
            Intrinsics.checkNotNullExpressionValue(icon, "createWithResource(...)");
        }
        this(context, charSequence, pendingIntent, beginGetPublicKeyCredentialOption, charSequence2, instant, icon, (i11 & 128) != 0 ? false : z11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the constructor with all parameters dependent on API levels", replaceWith = @ReplaceWith(expression = "PublicKeyCredentialEntry(context, username, pendingIntent,beginGetPublicKeyCredentialOption, displayName, lastUsedTime, icon, isAutoSelectAllowed, isDefaultIconPreferredAsSingleProvider, biometricPromptData)", imports = {}))
    public /* synthetic */ PublicKeyCredentialEntry(Context context, CharSequence username, PendingIntent pendingIntent, BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption, CharSequence charSequence, Instant instant, Icon icon, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(beginGetPublicKeyCredentialOption, "beginGetPublicKeyCredentialOption");
        Intrinsics.checkNotNullParameter(icon, "icon");
        String string = context.getString(C1958R.string.androidx_credentials_TYPE_PUBLIC_KEY_CREDENTIAL);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this(username, charSequence, string, pendingIntent, icon, instant, z11, beginGetPublicKeyCredentialOption, false, null, null, null, false, false, false, 32256, null);
    }
}
