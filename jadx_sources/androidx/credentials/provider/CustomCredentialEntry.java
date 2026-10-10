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
import androidx.credentials.provider.utils.CryptoObjectUtils;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.time.Instant;
import java.util.Collections;
import java.util.Iterator;
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

/* JADX INFO: compiled from: CustomCredentialEntry.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(23)
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 32\u00020\u0001:\u000501234B¡\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bBa\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001eB\u0081\u0001\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001fBu\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010 R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010'R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010.\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010'R\u0011\u0010/\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b/\u0010'¨\u00065"}, m90084d2 = {"Landroidx/credentials/provider/CustomCredentialEntry;", "Landroidx/credentials/provider/CredentialEntry;", "type", "", "title", "", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "isAutoSelectAllowed", "", "subtitle", "typeDisplayName", TUIConstants.TUIChat.INPUT_MORE_ICON, "Landroid/graphics/drawable/Icon;", "lastUsedTime", "Ljava/time/Instant;", "beginGetCredentialOption", "Landroidx/credentials/provider/BeginGetCredentialOption;", "isDefaultIconPreferredAsSingleProvider", "entryGroupId", "affiliatedDomain", "biometricPromptData", "Landroidx/credentials/provider/BiometricPromptData;", "autoSelectAllowedFromOption", "isCreatedFromSlice", "isDefaultIconFromSlice", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Landroid/app/PendingIntent;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/drawable/Icon;Ljava/time/Instant;Landroidx/credentials/provider/BeginGetCredentialOption;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;Landroidx/credentials/provider/BiometricPromptData;ZZZ)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/BeginGetCredentialOption;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/time/Instant;Landroid/graphics/drawable/Icon;Z)V", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/BeginGetCredentialOption;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/time/Instant;Landroid/graphics/drawable/Icon;ZLjava/lang/CharSequence;ZLandroidx/credentials/provider/BiometricPromptData;)V", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/BeginGetCredentialOption;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/time/Instant;Landroid/graphics/drawable/Icon;ZLjava/lang/CharSequence;Z)V", "getType", "()Ljava/lang/String;", "getTitle", "()Ljava/lang/CharSequence;", "getPendingIntent", "()Landroid/app/PendingIntent;", "()Z", "getSubtitle", "getTypeDisplayName", "getIcon", "()Landroid/graphics/drawable/Icon;", "getLastUsedTime", "()Ljava/time/Instant;", "isAutoSelectAllowedFromOption", "hasDefaultIcon", "Api34Impl", "Api35Impl", "Api28Impl", "Companion", "Builder", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCustomCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomCredentialEntry.kt\nandroidx/credentials/provider/CustomCredentialEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,921:1\n1#2:922\n*E\n"})
public final class CustomCredentialEntry extends CredentialEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "CredentialEntry";

    @NotNull
    private final Icon icon;
    private final boolean isAutoSelectAllowed;
    private final boolean isAutoSelectAllowedFromOption;
    private boolean isCreatedFromSlice;
    private boolean isDefaultIconFromSlice;

    @Nullable
    private final Instant lastUsedTime;

    @NotNull
    private final PendingIntent pendingIntent;

    @Nullable
    private final CharSequence subtitle;

    @NotNull
    private final CharSequence title;

    @NotNull
    private final String type;

    @Nullable
    private final CharSequence typeDisplayName;

    /* JADX INFO: compiled from: CustomCredentialEntry.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\tH\u0007¨\u0006\u0010"}, m90084d2 = {"Landroidx/credentials/provider/CustomCredentialEntry$Api28Impl;", "", "<init>", "()V", "isDefaultIcon", "", "entry", "Landroidx/credentials/provider/CustomCredentialEntry;", "toSlice", "Landroid/app/slice/Slice;", "addToSlice", "", "sliceBuilder", "Landroid/app/slice/Slice$Builder;", "fromSlice", "slice", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @RequiresApi(28)
    @SourceDebugExtension({"SMAP\nCustomCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomCredentialEntry.kt\nandroidx/credentials/provider/CustomCredentialEntry$Api28Impl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,921:1\n1869#2,2:922\n*S KotlinDebug\n*F\n+ 1 CustomCredentialEntry.kt\nandroidx/credentials/provider/CustomCredentialEntry$Api28Impl\n*L\n531#1:922,2\n*E\n"})
    public static final class Api28Impl {

        @NotNull
        public static final Api28Impl INSTANCE = new Api28Impl();

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static final boolean isDefaultIcon(@NotNull CustomCredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (entry.isCreatedFromSlice) {
                return entry.isDefaultIconFromSlice;
            }
            return entry.getIcon().getType() == 2 && entry.getIcon().getResId() == C1958R.drawable.adx_ic_other_sign_in;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final Slice toSlice(@NotNull CustomCredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(entry.getType(), 1));
            INSTANCE.addToSlice(entry, builder);
            Slice sliceBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(sliceBuild, "build(...)");
            return sliceBuild;
        }

        public final void addToSlice(@NotNull CustomCredentialEntry entry, @NotNull Slice.Builder sliceBuilder) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(sliceBuilder, "sliceBuilder");
            BeginGetCredentialOption beginGetCredentialOption = entry.getBeginGetCredentialOption();
            CharSequence entryGroupId = entry.getEntryGroupId();
            boolean isDefaultIconPreferredAsSingleProvider = entry.getIsDefaultIconPreferredAsSingleProvider();
            CharSequence affiliatedDomain = entry.getAffiliatedDomain();
            String str = CredentialEntry.FALSE_STRING;
            sliceBuilder.addText(beginGetCredentialOption.getId(), null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_OPTION_ID)).addText(entryGroupId, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_DEDUPLICATION_ID)).addText(isDefaultIconPreferredAsSingleProvider ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED)).addText(affiliatedDomain, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_AFFILIATED_DOMAIN));
            CharSequence title = entry.getTitle();
            CharSequence subtitle = entry.getSubtitle();
            PendingIntent pendingIntent = entry.getPendingIntent();
            CharSequence typeDisplayName = entry.getTypeDisplayName();
            Instant lastUsedTime = entry.getLastUsedTime();
            Icon icon = entry.getIcon();
            if (entry.getIsAutoSelectAllowed()) {
                str = CredentialEntry.TRUE_STRING;
            }
            sliceBuilder.addText(typeDisplayName, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME)).addText(title, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_TITLE)).addText(subtitle, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_SUBTITLE)).addText(str, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_AUTO_ALLOWED)).addIcon(icon, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_ICON));
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
        public static final CustomCredentialEntry fromSlice(@NotNull Slice slice) {
            Iterator it;
            Intrinsics.checkNotNullParameter(slice, "slice");
            SliceSpec spec = slice.getSpec();
            Intrinsics.checkNotNull(spec);
            String type = spec.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            List<SliceItem> items = slice.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
            Iterator it2 = items.iterator();
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            CharSequence text = null;
            CharSequence text2 = null;
            PendingIntent action = null;
            CharSequence text3 = null;
            CharSequence text4 = null;
            Icon icon = null;
            Instant instantOfEpochMilli = null;
            CharSequence text5 = null;
            CharSequence text6 = null;
            while (it2.hasNext()) {
                SliceItem sliceItem = (SliceItem) it2.next();
                if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_OPTION_ID)) {
                    text = sliceItem.getText();
                } else {
                    if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_DEDUPLICATION_ID)) {
                        text5 = sliceItem.getText();
                    } else {
                        it = it2;
                        if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED)) {
                            if (Intrinsics.areEqual(sliceItem.getText(), CredentialEntry.TRUE_STRING)) {
                                z12 = true;
                            }
                        } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_AFFILIATED_DOMAIN)) {
                            text6 = sliceItem.getText();
                        } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME)) {
                            text4 = sliceItem.getText();
                        } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_TITLE)) {
                            text2 = sliceItem.getText();
                        } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_SUBTITLE)) {
                            text3 = sliceItem.getText();
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
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            try {
                Intrinsics.checkNotNull(text2);
                Intrinsics.checkNotNull(action);
                Intrinsics.checkNotNull(icon);
                Intrinsics.checkNotNull(text);
                return new CustomCredentialEntry(type, text2, action, z11, text3, text4, icon, instantOfEpochMilli, new BeginGetCustomCredentialOption(text.toString(), type, new Bundle()), z12, text5, text6, null, z13, true, z14, 4096, null);
            } catch (Exception e11) {
                Log.i(CustomCredentialEntry.TAG, "fromSlice failed with: " + e11.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: CustomCredentialEntry.kt */
    @RequiresApi(34)
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/provider/CustomCredentialEntry$Api34Impl;", "", "<init>", "()V", "fromCredentialEntry", "Landroidx/credentials/provider/CustomCredentialEntry;", "credentialEntry", "Landroid/service/credentials/CredentialEntry;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        @JvmStatic
        @Nullable
        public static final CustomCredentialEntry fromCredentialEntry(@NotNull android.service.credentials.CredentialEntry credentialEntry) {
            Intrinsics.checkNotNullParameter(credentialEntry, "credentialEntry");
            Slice slice = credentialEntry.getSlice();
            Intrinsics.checkNotNullExpressionValue(slice, "getSlice(...)");
            return CustomCredentialEntry.INSTANCE.fromSlice(slice);
        }

        private Api34Impl() {
        }
    }

    /* JADX INFO: compiled from: CustomCredentialEntry.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0007¨\u0006\u000e"}, m90084d2 = {"Landroidx/credentials/provider/CustomCredentialEntry$Api35Impl;", "", "<init>", "()V", "toSlice", "Landroid/app/slice/Slice;", "entry", "Landroidx/credentials/provider/CustomCredentialEntry;", "addToSlice", "", "sliceBuilder", "Landroid/app/slice/Slice$Builder;", "fromSlice", "slice", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @RequiresApi(35)
    @SourceDebugExtension({"SMAP\nCustomCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomCredentialEntry.kt\nandroidx/credentials/provider/CustomCredentialEntry$Api35Impl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,921:1\n1869#2,2:922\n*S KotlinDebug\n*F\n+ 1 CustomCredentialEntry.kt\nandroidx/credentials/provider/CustomCredentialEntry$Api35Impl\n*L\n370#1:922,2\n*E\n"})
    public static final class Api35Impl {

        @NotNull
        public static final Api35Impl INSTANCE = new Api35Impl();

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final Slice toSlice(@NotNull CustomCredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(entry.getType(), 1));
            Api28Impl.INSTANCE.addToSlice(entry, builder);
            INSTANCE.addToSlice(entry, builder);
            Slice sliceBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(sliceBuild, "build(...)");
            return sliceBuild;
        }

        public final void addToSlice(@NotNull CustomCredentialEntry entry, @NotNull Slice.Builder sliceBuilder) {
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
        public static final CustomCredentialEntry fromSlice(@NotNull Slice slice) {
            BiometricPromptData biometricPromptDataFromBundle;
            Intrinsics.checkNotNullParameter(slice, "slice");
            CustomCredentialEntry customCredentialEntryFromSlice = Api28Impl.fromSlice(slice);
            if (customCredentialEntryFromSlice == null) {
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
                String type = customCredentialEntryFromSlice.getType();
                CharSequence title = customCredentialEntryFromSlice.getTitle();
                PendingIntent pendingIntent = customCredentialEntryFromSlice.getPendingIntent();
                boolean isAutoSelectAllowed = customCredentialEntryFromSlice.getIsAutoSelectAllowed();
                CharSequence subtitle = customCredentialEntryFromSlice.getSubtitle();
                CharSequence typeDisplayName = customCredentialEntryFromSlice.getTypeDisplayName();
                Icon icon = customCredentialEntryFromSlice.getIcon();
                Instant lastUsedTime = customCredentialEntryFromSlice.getLastUsedTime();
                BeginGetCredentialOption beginGetCredentialOption = customCredentialEntryFromSlice.getBeginGetCredentialOption();
                boolean isDefaultIconPreferredAsSingleProvider = customCredentialEntryFromSlice.getIsDefaultIconPreferredAsSingleProvider();
                CharSequence entryGroupId = customCredentialEntryFromSlice.getEntryGroupId();
                CharSequence affiliatedDomain = customCredentialEntryFromSlice.getAffiliatedDomain();
                boolean isAutoSelectAllowedFromOption = customCredentialEntryFromSlice.getIsAutoSelectAllowedFromOption();
                boolean z11 = customCredentialEntryFromSlice.isDefaultIconFromSlice;
                if (bundle != null) {
                    biometricPromptDataFromBundle = BiometricPromptData.INSTANCE.fromBundle(bundle);
                } else {
                    biometricPromptDataFromBundle = null;
                }
                return new CustomCredentialEntry(type, title, pendingIntent, isAutoSelectAllowed, subtitle, typeDisplayName, icon, lastUsedTime, beginGetCredentialOption, isDefaultIconPreferredAsSingleProvider, entryGroupId, affiliatedDomain, biometricPromptDataFromBundle, isAutoSelectAllowedFromOption, true, z11);
            } catch (Exception e11) {
                Log.i(CustomCredentialEntry.TAG, "fromSlice failed with: " + e11.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: CustomCredentialEntry.kt */
    @Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u001d\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0007J\u0010\u0010 \u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Landroidx/credentials/provider/CustomCredentialEntry$Builder;", "", "context", "Landroid/content/Context;", "type", "", "title", "", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "beginGetCredentialOption", "Landroidx/credentials/provider/BeginGetCredentialOption;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/BeginGetCredentialOption;)V", "subtitle", "lastUsedTime", "Ljava/time/Instant;", "typeDisplayName", TUIConstants.TUIChat.INPUT_MORE_ICON, "Landroid/graphics/drawable/Icon;", "autoSelectAllowed", "", "entryGroupId", "isDefaultIconPreferredAsSingleProvider", "biometricPromptData", "Landroidx/credentials/provider/BiometricPromptData;", "setSubtitle", "setTypeDisplayName", "setIcon", "setBiometricPromptData", "setAutoSelectAllowed", "setEntryGroupId", "setLastUsedTime", "setDefaultIconPreferredAsSingleProvider", "build", "Landroidx/credentials/provider/CustomCredentialEntry;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCustomCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomCredentialEntry.kt\nandroidx/credentials/provider/CustomCredentialEntry$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,921:1\n1#2:922\n*E\n"})
    public static final class Builder {
        private boolean autoSelectAllowed;

        @NotNull
        private final BeginGetCredentialOption beginGetCredentialOption;

        @Nullable
        private BiometricPromptData biometricPromptData;

        @NotNull
        private final Context context;

        @NotNull
        private CharSequence entryGroupId;

        @Nullable
        private Icon icon;
        private boolean isDefaultIconPreferredAsSingleProvider;

        @Nullable
        private Instant lastUsedTime;

        @NotNull
        private final PendingIntent pendingIntent;

        @Nullable
        private CharSequence subtitle;

        @NotNull
        private final CharSequence title;

        @NotNull
        private final String type;

        @Nullable
        private CharSequence typeDisplayName;

        public Builder(@NotNull Context context, @NotNull String type, @NotNull CharSequence title, @NotNull PendingIntent pendingIntent, @NotNull BeginGetCredentialOption beginGetCredentialOption) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            Intrinsics.checkNotNullParameter(beginGetCredentialOption, "beginGetCredentialOption");
            this.context = context;
            this.type = type;
            this.title = title;
            this.pendingIntent = pendingIntent;
            this.beginGetCredentialOption = beginGetCredentialOption;
            this.entryGroupId = title;
        }

        @NotNull
        public final CustomCredentialEntry build() {
            if (this.icon == null) {
                this.icon = Icon.createWithResource(this.context, C1958R.drawable.adx_ic_other_sign_in);
            }
            String str = this.type;
            CharSequence charSequence = this.title;
            PendingIntent pendingIntent = this.pendingIntent;
            boolean z11 = this.autoSelectAllowed;
            CharSequence charSequence2 = this.subtitle;
            CharSequence charSequence3 = this.typeDisplayName;
            Icon icon = this.icon;
            Intrinsics.checkNotNull(icon);
            return new CustomCredentialEntry(str, charSequence, pendingIntent, z11, charSequence2, charSequence3, icon, this.lastUsedTime, this.beginGetCredentialOption, this.isDefaultIconPreferredAsSingleProvider, this.entryGroupId, null, this.biometricPromptData, false, false, false, 59392, null);
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
        public final Builder setEntryGroupId(@NotNull CharSequence entryGroupId) {
            Intrinsics.checkNotNullParameter(entryGroupId, "entryGroupId");
            if (entryGroupId.length() <= 0) {
                throw new IllegalArgumentException("entryGroupId must not be empty");
            }
            this.entryGroupId = entryGroupId;
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

        @NotNull
        public final Builder setSubtitle(@Nullable CharSequence subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        @NotNull
        public final Builder setTypeDisplayName(@Nullable CharSequence typeDisplayName) {
            this.typeDisplayName = typeDisplayName;
            return this;
        }
    }

    /* JADX INFO: compiled from: CustomCredentialEntry.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eH\u0007J!\u0010\u000f\u001a\u00020\u0010*\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J'\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Landroidx/credentials/provider/CustomCredentialEntry$Companion;", "", "<init>", "()V", "TAG", "", "toSlice", "Landroid/app/slice/Slice;", "entry", "Landroidx/credentials/provider/CustomCredentialEntry;", "fromSlice", "slice", "fromCredentialEntry", "credentialEntry", "Landroid/service/credentials/CredentialEntry;", "marshall", "", "bundle", "Landroid/os/Bundle;", "index", "", "marshall$credentials", "unmarshall", "type", "unmarshall$credentials", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @Nullable
        public final CustomCredentialEntry fromCredentialEntry(@NotNull android.service.credentials.CredentialEntry credentialEntry) {
            Intrinsics.checkNotNullParameter(credentialEntry, "credentialEntry");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromCredentialEntry(credentialEntry);
            }
            return null;
        }

        public final void marshall$credentials(@NotNull CustomCredentialEntry customCredentialEntry, @NotNull Bundle bundle, int i11) {
            Instant lastUsedTime;
            Intrinsics.checkNotNullParameter(customCredentialEntry, "<this>");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            CredentialEntry.INSTANCE.marshallCommonProperties$credentials(customCredentialEntry, bundle, i11);
            bundle.putParcelable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX + i11, customCredentialEntry.getPendingIntent());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX + i11, customCredentialEntry.getIsAutoSelectAllowed());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX + i11, customCredentialEntry.getIsAutoSelectAllowedFromOption());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX + i11, customCredentialEntry.hasDefaultIcon());
            bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TITLE_PREFIX + i11, customCredentialEntry.getTitle());
            bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX + i11, customCredentialEntry.getTypeDisplayName());
            bundle.putParcelable(CredentialEntry.EXTRA_CREDENTIAL_TYPE_ICON_PREFIX + i11, customCredentialEntry.getIcon());
            CharSequence subtitle = customCredentialEntry.getSubtitle();
            if (subtitle != null) {
                bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_SUBTITLE_PREFIX + i11, subtitle);
            }
            if (Build.VERSION.SDK_INT < 26 || (lastUsedTime = customCredentialEntry.getLastUsedTime()) == null) {
                return;
            }
            bundle.putLong(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_MILLIS_PREFIX + i11, lastUsedTime.toEpochMilli());
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final Slice toSlice(@NotNull CustomCredentialEntry entry) {
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
        public final CustomCredentialEntry unmarshall$credentials(@NotNull Bundle bundle, int index, @NotNull String type) {
            Instant instantOfEpochMilli;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(type, "type");
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
                Parcelable parcelable2 = bundle.getParcelable(CredentialEntry.EXTRA_CREDENTIAL_TYPE_ICON_PREFIX + index);
                Intrinsics.checkNotNull(parcelable2);
                Icon icon = (Icon) parcelable2;
                CharSequence charSequence5 = bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_SUBTITLE_PREFIX + index);
                if (Build.VERSION.SDK_INT < 26) {
                    return new CustomCredentialEntry(type, charSequence3, pendingIntent, z12, charSequence5, charSequence4, icon, null, new BeginGetCustomCredentialOption(string, type, bundle2), z11, charSequence, charSequence2, null, z13, true, z14);
                }
                if (bundle.containsKey(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_MILLIS_PREFIX + index)) {
                    try {
                        instantOfEpochMilli = Instant.ofEpochMilli(bundle.getLong(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_MILLIS_PREFIX + index));
                    } catch (Exception unused) {
                        instantOfEpochMilli = null;
                    }
                } else {
                    instantOfEpochMilli = null;
                }
                return new CustomCredentialEntry(type, charSequence3, pendingIntent, z12, charSequence5, charSequence4, icon, instantOfEpochMilli, new BeginGetCustomCredentialOption(string, type, bundle2), z11, charSequence, charSequence2, null, z13, true, z14);
            } catch (Exception unused2) {
                return null;
            }
        }

        @JvmStatic
        @SuppressLint({"WrongConstant"})
        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final CustomCredentialEntry fromSlice(@NotNull Slice slice) {
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
    public CustomCredentialEntry(@NotNull String type, @NotNull CharSequence title, @NotNull PendingIntent pendingIntent, boolean z11, @Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @NotNull Icon icon, @Nullable Instant instant, @NotNull BeginGetCredentialOption beginGetCredentialOption, boolean z12, @Nullable CharSequence charSequence3, @Nullable CharSequence charSequence4, @Nullable BiometricPromptData biometricPromptData, boolean z13, boolean z14, boolean z15) {
        super(type, beginGetCredentialOption, charSequence3 == null ? title : charSequence3, z12, charSequence4, biometricPromptData);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(beginGetCredentialOption, "beginGetCredentialOption");
        this.type = type;
        this.title = title;
        this.pendingIntent = pendingIntent;
        this.isAutoSelectAllowed = z11;
        this.subtitle = charSequence;
        this.typeDisplayName = charSequence2;
        this.icon = icon;
        this.lastUsedTime = instant;
        this.isCreatedFromSlice = z14;
        this.isDefaultIconFromSlice = z15;
        this.isAutoSelectAllowedFromOption = z13;
        if (getType().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
        if (title.length() <= 0) {
            throw new IllegalArgumentException("title must not be empty");
        }
    }

    @JvmStatic
    @Nullable
    public static final CustomCredentialEntry fromCredentialEntry(@NotNull android.service.credentials.CredentialEntry credentialEntry) {
        return INSTANCE.fromCredentialEntry(credentialEntry);
    }

    @JvmStatic
    @SuppressLint({"WrongConstant"})
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final CustomCredentialEntry fromSlice(@NotNull Slice slice) {
        return INSTANCE.fromSlice(slice);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public static final Slice toSlice(@NotNull CustomCredentialEntry customCredentialEntry) {
        return INSTANCE.toSlice(customCredentialEntry);
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

    @Nullable
    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final CharSequence getTitle() {
        return this.title;
    }

    @Override // androidx.credentials.provider.CredentialEntry
    @NotNull
    public String getType() {
        return this.type;
    }

    @Nullable
    public final CharSequence getTypeDisplayName() {
        return this.typeDisplayName;
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

    public /* synthetic */ CustomCredentialEntry(String str, CharSequence charSequence, PendingIntent pendingIntent, boolean z11, CharSequence charSequence2, CharSequence charSequence3, Icon icon, Instant instant, BeginGetCredentialOption beginGetCredentialOption, boolean z12, CharSequence charSequence4, CharSequence charSequence5, BiometricPromptData biometricPromptData, boolean z13, boolean z14, boolean z15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, charSequence, pendingIntent, z11, charSequence2, charSequence3, icon, instant, beginGetCredentialOption, z12, (i11 & 1024) != 0 ? charSequence : charSequence4, (i11 & 2048) != 0 ? null : charSequence5, (i11 & 4096) != 0 ? null : biometricPromptData, (i11 & 8192) != 0 ? CredentialOption.INSTANCE.extractAutoSelectValue$credentials(beginGetCredentialOption.getCandidateQueryData()) : z13, (i11 & 16384) != 0 ? false : z14, (i11 & 32768) != 0 ? false : z15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        charSequence2 = (i11 & 16) != 0 ? null : charSequence2;
        charSequence3 = (i11 & 32) != 0 ? null : charSequence3;
        instant = (i11 & 64) != 0 ? null : instant;
        if ((i11 & 128) != 0) {
            icon = Icon.createWithResource(context, C1958R.drawable.adx_ic_other_sign_in);
            Intrinsics.checkNotNullExpressionValue(icon, "createWithResource(...)");
        }
        this(context, charSequence, pendingIntent, beginGetCredentialOption, charSequence2, charSequence3, instant, icon, (i11 & 256) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the constructor that allows setting all parameters.", replaceWith = @ReplaceWith(expression = "CustomCredentialEntry(context, title, pendingIntent,beginGetCredentialOption, subtitle, typeDisplayName, lastUsedTime, icon, isAutoSelectAllowed, entryGroupId, isDefaultIconPreferredAsSingleProvider,biometricPromptData)", imports = {}))
    public /* synthetic */ CustomCredentialEntry(Context context, CharSequence title, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence, CharSequence charSequence2, Instant instant, Icon icon, boolean z11) {
        this(beginGetCredentialOption.getType(), title, pendingIntent, z11, charSequence, charSequence2, icon, instant, beginGetCredentialOption, false, null, null, null, false, false, false, 64512, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(beginGetCredentialOption, "beginGetCredentialOption");
        Intrinsics.checkNotNullParameter(icon, "icon");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z11, CharSequence charSequence4, boolean z12, BiometricPromptData biometricPromptData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        Context context2;
        Icon icon2;
        CharSequence charSequence5 = (i11 & 16) != 0 ? null : charSequence2;
        CharSequence charSequence6 = (i11 & 32) != 0 ? null : charSequence3;
        Instant instant2 = (i11 & 64) != 0 ? null : instant;
        if ((i11 & 128) != 0) {
            context2 = context;
            Icon iconCreateWithResource = Icon.createWithResource(context2, C1958R.drawable.adx_ic_other_sign_in);
            Intrinsics.checkNotNullExpressionValue(iconCreateWithResource, "createWithResource(...)");
            icon2 = iconCreateWithResource;
        } else {
            context2 = context;
            icon2 = icon;
        }
        this(context2, charSequence, pendingIntent, beginGetCredentialOption, charSequence5, charSequence6, instant2, icon2, (i11 & 256) != 0 ? false : z11, (i11 & 512) != 0 ? charSequence : charSequence4, (i11 & 1024) != 0 ? false : z12, (i11 & 2048) != 0 ? null : biometricPromptData);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi(35)
    public CustomCredentialEntry(@NotNull Context context, @NotNull CharSequence title, @NotNull PendingIntent pendingIntent, @NotNull BeginGetCredentialOption beginGetCredentialOption, @Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable Instant instant, @NotNull Icon icon, boolean z11, @NotNull CharSequence entryGroupId, boolean z12, @Nullable BiometricPromptData biometricPromptData) {
        this(beginGetCredentialOption.getType(), title, pendingIntent, z11, charSequence, charSequence2, icon, instant, beginGetCredentialOption, z12, entryGroupId.length() == 0 ? title : entryGroupId, null, biometricPromptData, false, false, false, 59392, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(beginGetCredentialOption, "beginGetCredentialOption");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(entryGroupId, "entryGroupId");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z11, CharSequence charSequence4, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        charSequence2 = (i11 & 16) != 0 ? null : charSequence2;
        charSequence3 = (i11 & 32) != 0 ? null : charSequence3;
        instant = (i11 & 64) != 0 ? null : instant;
        if ((i11 & 128) != 0) {
            icon = Icon.createWithResource(context, C1958R.drawable.adx_ic_other_sign_in);
            Intrinsics.checkNotNullExpressionValue(icon, "createWithResource(...)");
        }
        this(context, charSequence, pendingIntent, beginGetCredentialOption, charSequence2, charSequence3, instant, icon, (i11 & 256) != 0 ? false : z11, (i11 & 512) != 0 ? charSequence : charSequence4, (i11 & 1024) != 0 ? false : z12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomCredentialEntry(@NotNull Context context, @NotNull CharSequence title, @NotNull PendingIntent pendingIntent, @NotNull BeginGetCredentialOption beginGetCredentialOption, @Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable Instant instant, @NotNull Icon icon, boolean z11, @NotNull CharSequence entryGroupId, boolean z12) {
        this(beginGetCredentialOption.getType(), title, pendingIntent, z11, charSequence, charSequence2, icon, instant, beginGetCredentialOption, z12, entryGroupId.length() == 0 ? title : entryGroupId, null, null, false, false, false, 63488, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(beginGetCredentialOption, "beginGetCredentialOption");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(entryGroupId, "entryGroupId");
    }
}
