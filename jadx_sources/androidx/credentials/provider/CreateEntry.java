package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.provider.utils.CryptoObjectUtils;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: CreateEntry.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(23)
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 .2\u00020\u0001:\u0005*+,-.Ba\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014Bk\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0018Bw\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0019J\r\u0010&\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010'J\r\u0010(\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010'J\r\u0010)\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006/"}, m90084d2 = {"Landroidx/credentials/provider/CreateEntry;", "", "accountName", "", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", TUIConstants.TUIChat.INPUT_MORE_ICON, "Landroid/graphics/drawable/Icon;", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "lastUsedTime", "Ljava/time/Instant;", "credentialCountInformationMap", "", "", "", "isAutoSelectAllowed", "", "biometricPromptData", "Landroidx/credentials/provider/BiometricPromptData;", "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Ljava/time/Instant;Ljava/util/Map;ZLandroidx/credentials/provider/BiometricPromptData;)V", "passwordCredentialCount", "publicKeyCredentialCount", "totalCredentialCount", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;Ljava/lang/CharSequence;Ljava/time/Instant;Landroid/graphics/drawable/Icon;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;Ljava/lang/CharSequence;Ljava/time/Instant;Landroid/graphics/drawable/Icon;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLandroidx/credentials/provider/BiometricPromptData;)V", "getAccountName", "()Ljava/lang/CharSequence;", "getPendingIntent", "()Landroid/app/PendingIntent;", "getIcon", "()Landroid/graphics/drawable/Icon;", "getDescription", "getLastUsedTime", "()Ljava/time/Instant;", "()Z", "getBiometricPromptData", "()Landroidx/credentials/provider/BiometricPromptData;", "getPasswordCredentialCount", "()Ljava/lang/Integer;", "getPublicKeyCredentialCount", "getTotalCredentialCount", "Builder", "Api34Impl", "Api35Impl", "Api28Impl", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCreateEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateEntry.kt\nandroidx/credentials/provider/CreateEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,789:1\n1#2:790\n*E\n"})
public final class CreateEntry {

    @NotNull
    private static final String AUTO_SELECT_FALSE_STRING = "false";

    @NotNull
    private static final String AUTO_SELECT_TRUE_STRING = "true";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DESCRIPTION_MAX_CHAR_LIMIT = 300;

    @NotNull
    private static final String EXTRA_CREATE_ACCOUNT_NAME_PREFIX = "androidx.credentials.provider.extra.ACCOUNT_NAME_";

    @NotNull
    private static final String EXTRA_CREATE_CREDENTIAL_COUNT_INFO_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_COUNT_INFO_";

    @NotNull
    private static final String EXTRA_CREATE_DESCRIPTION_PREFIX = "androidx.credentials.provider.extra.DESCRIPTION_";

    @NotNull
    private static final String EXTRA_CREATE_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX = "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_";

    @NotNull
    private static final String EXTRA_CREATE_ENTRY_LAST_USED_TIME_MILLIS_PREFIX = "androidx.credentials.provider.extra.LAST_USED_TIME_MILLIS_";

    @NotNull
    private static final String EXTRA_CREATE_ENTRY_PENDING_INTENT_PREFIX = "androidx.credentials.provider.extra.PENDING_INTENT_";

    @NotNull
    private static final String EXTRA_CREATE_ENTRY_SIZE = "androidx.credentials.provider.extra.CREATE_ENTRY_SIZE";

    @NotNull
    private static final String EXTRA_CREATE_TYPE_ICON_PREFIX = "androidx.credentials.provider.extra.ICON_";
    private static final int REVISION_ID = 1;

    @NotNull
    private static final String SLICE_HINT_ACCOUNT_NAME = "androidx.credentials.provider.createEntry.SLICE_HINT_USER_PROVIDER_ACCOUNT_NAME";

    @NotNull
    private static final String SLICE_HINT_ALLOWED_AUTHENTICATORS = "androidx.credentials.provider.createEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS";

    @NotNull
    private static final String SLICE_HINT_AUTO_SELECT_ALLOWED = "androidx.credentials.provider.createEntry.SLICE_HINT_AUTO_SELECT_ALLOWED";

    @NotNull
    private static final String SLICE_HINT_BIOMETRIC_PROMPT_DATA = "androidx.credentials.provider.createEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA";

    @NotNull
    private static final String SLICE_HINT_CREDENTIAL_COUNT_INFORMATION = "androidx.credentials.provider.createEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION";

    @NotNull
    private static final String SLICE_HINT_CRYPTO_OP_ID = "androidx.credentials.provider.createEntry.SLICE_HINT_CRYPTO_OP_ID";

    @NotNull
    private static final String SLICE_HINT_ICON = "androidx.credentials.provider.createEntry.SLICE_HINT_PROFILE_ICON";

    @NotNull
    private static final String SLICE_HINT_LAST_USED_TIME_MILLIS = "androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS";

    @NotNull
    private static final String SLICE_HINT_NOTE = "androidx.credentials.provider.createEntry.SLICE_HINT_NOTE";

    @NotNull
    private static final String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.createEntry.SLICE_HINT_PENDING_INTENT";

    @NotNull
    private static final String SLICE_SPEC_TYPE = "CreateEntry";

    @NotNull
    private static final String TAG = "CreateEntry";

    @NotNull
    public static final String TYPE_TOTAL_CREDENTIAL = "TOTAL_CREDENTIAL_COUNT_TYPE";

    @NotNull
    private final CharSequence accountName;

    @Nullable
    private final BiometricPromptData biometricPromptData;

    @NotNull
    private final Map<String, Integer> credentialCountInformationMap;

    @Nullable
    private final CharSequence description;

    @Nullable
    private final Icon icon;
    private final boolean isAutoSelectAllowed;

    @Nullable
    private final Instant lastUsedTime;

    @NotNull
    private final PendingIntent pendingIntent;

    /* JADX INFO: compiled from: CreateEntry.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0007¨\u0006\f"}, m90084d2 = {"Landroidx/credentials/provider/CreateEntry$Api28Impl;", "", "<init>", "()V", "toSlice", "Landroid/app/slice/Slice;", "createEntry", "Landroidx/credentials/provider/CreateEntry;", "addToSlice", "Landroid/app/slice/Slice$Builder;", "fromSlice", "slice", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @RequiresApi(28)
    @SourceDebugExtension({"SMAP\nCreateEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateEntry.kt\nandroidx/credentials/provider/CreateEntry$Api28Impl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,789:1\n1869#2,2:790\n*S KotlinDebug\n*F\n+ 1 CreateEntry.kt\nandroidx/credentials/provider/CreateEntry$Api28Impl\n*L\n505#1:790,2\n*E\n"})
    public static final class Api28Impl {

        @NotNull
        public static final Api28Impl INSTANCE = new Api28Impl();

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final Slice toSlice(@NotNull CreateEntry createEntry) {
            Intrinsics.checkNotNullParameter(createEntry, "createEntry");
            Slice sliceBuild = INSTANCE.addToSlice(createEntry).build();
            Intrinsics.checkNotNullExpressionValue(sliceBuild, "build(...)");
            return sliceBuild;
        }

        @NotNull
        public final Slice.Builder addToSlice(@NotNull CreateEntry createEntry) {
            Intrinsics.checkNotNullParameter(createEntry, "createEntry");
            CharSequence accountName = createEntry.getAccountName();
            Icon icon = createEntry.getIcon();
            CharSequence description = createEntry.getDescription();
            Instant lastUsedTime = createEntry.getLastUsedTime();
            Map<String, Integer> map = createEntry.credentialCountInformationMap;
            PendingIntent pendingIntent = createEntry.getPendingIntent();
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec("CreateEntry", 1));
            String str = createEntry.getIsAutoSelectAllowed() ? "true" : "false";
            builder.addText(accountName, null, CollectionsKt.listOf(CreateEntry.SLICE_HINT_ACCOUNT_NAME));
            if (lastUsedTime != null) {
                builder.addLong(lastUsedTime.toEpochMilli(), null, CollectionsKt.listOf(CreateEntry.SLICE_HINT_LAST_USED_TIME_MILLIS));
            }
            if (description != null) {
                builder.addText(description, null, CollectionsKt.listOf(CreateEntry.SLICE_HINT_NOTE));
            }
            if (icon != null) {
                builder.addIcon(icon, null, CollectionsKt.listOf(CreateEntry.SLICE_HINT_ICON));
            }
            Companion companion = CreateEntry.INSTANCE;
            if (companion.convertCredentialCountInfoToBundle$credentials(map) != null) {
                builder.addBundle(companion.convertCredentialCountInfoToBundle$credentials(map), null, CollectionsKt.listOf(CreateEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION));
            }
            builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList(CreateEntry.SLICE_HINT_PENDING_INTENT)).build(), null).addText(str, null, CollectionsKt.listOf(CreateEntry.SLICE_HINT_AUTO_SELECT_ALLOWED));
            return builder;
        }

        private Api28Impl() {
        }

        @JvmStatic
        @SuppressLint({"WrongConstant"})
        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static final CreateEntry fromSlice(@NotNull Slice slice) {
            Intrinsics.checkNotNullParameter(slice, "slice");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<SliceItem> items = slice.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
            Map mapAsMutableMap = linkedHashMap;
            CharSequence text = null;
            PendingIntent action = null;
            Icon icon = null;
            CharSequence text2 = null;
            Instant instantOfEpochMilli = null;
            boolean z11 = false;
            for (SliceItem sliceItem : items) {
                if (sliceItem.hasHint(CreateEntry.SLICE_HINT_ACCOUNT_NAME)) {
                    text = sliceItem.getText();
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_ICON)) {
                    icon = sliceItem.getIcon();
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_PENDING_INTENT)) {
                    action = sliceItem.getAction();
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION)) {
                    Map<String, Integer> mapConvertBundleToCredentialCountInfo$credentials = CreateEntry.INSTANCE.convertBundleToCredentialCountInfo$credentials(sliceItem.getBundle());
                    Intrinsics.checkNotNull(mapConvertBundleToCredentialCountInfo$credentials, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Int?>");
                    mapAsMutableMap = TypeIntrinsics.asMutableMap(mapConvertBundleToCredentialCountInfo$credentials);
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_LAST_USED_TIME_MILLIS)) {
                    instantOfEpochMilli = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_NOTE)) {
                    text2 = sliceItem.getText();
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_LAST_USED_TIME_MILLIS)) {
                    instantOfEpochMilli = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_AUTO_SELECT_ALLOWED) && Intrinsics.areEqual(sliceItem.getText(), "true")) {
                    z11 = true;
                }
            }
            try {
                Intrinsics.checkNotNull(text);
                Intrinsics.checkNotNull(action);
                return new CreateEntry(text, action, icon, text2, instantOfEpochMilli, mapAsMutableMap, z11, (BiometricPromptData) null, 128, (DefaultConstructorMarker) null);
            } catch (Exception e11) {
                Log.i("CreateEntry", "fromSlice failed with: " + e11.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: CreateEntry.kt */
    @RequiresApi(34)
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/provider/CreateEntry$Api34Impl;", "", "<init>", "()V", "fromCreateEntry", "Landroidx/credentials/provider/CreateEntry;", "createEntry", "Landroid/service/credentials/CreateEntry;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        @JvmStatic
        @Nullable
        public static final CreateEntry fromCreateEntry(@NotNull android.service.credentials.CreateEntry createEntry) {
            Intrinsics.checkNotNullParameter(createEntry, "createEntry");
            Slice slice = createEntry.getSlice();
            Intrinsics.checkNotNullExpressionValue(slice, "getSlice(...)");
            return CreateEntry.INSTANCE.fromSlice(slice);
        }

        private Api34Impl() {
        }
    }

    /* JADX INFO: compiled from: CreateEntry.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000bH\u0007¨\u0006\u000e"}, m90084d2 = {"Landroidx/credentials/provider/CreateEntry$Api35Impl;", "", "<init>", "()V", "addToSlice", "", "createEntry", "Landroidx/credentials/provider/CreateEntry;", "sliceBuilder", "Landroid/app/slice/Slice$Builder;", "toSlice", "Landroid/app/slice/Slice;", "fromSlice", "slice", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @RequiresApi(35)
    @SourceDebugExtension({"SMAP\nCreateEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateEntry.kt\nandroidx/credentials/provider/CreateEntry$Api35Impl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,789:1\n1869#2,2:790\n*S KotlinDebug\n*F\n+ 1 CreateEntry.kt\nandroidx/credentials/provider/CreateEntry$Api35Impl\n*L\n405#1:790,2\n*E\n"})
    public static final class Api35Impl {

        @NotNull
        public static final Api35Impl INSTANCE = new Api35Impl();

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final Slice toSlice(@NotNull CreateEntry createEntry) {
            Intrinsics.checkNotNullParameter(createEntry, "createEntry");
            Slice.Builder builderAddToSlice = Api28Impl.INSTANCE.addToSlice(createEntry);
            INSTANCE.addToSlice(createEntry, builderAddToSlice);
            Slice sliceBuild = builderAddToSlice.build();
            Intrinsics.checkNotNullExpressionValue(sliceBuild, "build(...)");
            return sliceBuild;
        }

        private Api35Impl() {
        }

        private final void addToSlice(CreateEntry createEntry, Slice.Builder sliceBuilder) {
            BiometricPromptData biometricPromptData = createEntry.getBiometricPromptData();
            if (biometricPromptData != null) {
                sliceBuilder.addInt(biometricPromptData.getAllowedAuthenticators(), null, CollectionsKt.listOf(CreateEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS));
                if (biometricPromptData.getCryptoObject() != null) {
                    sliceBuilder.addLong(CryptoObjectUtils.INSTANCE.getOperationHandle(biometricPromptData.getCryptoObject()), null, CollectionsKt.listOf(CreateEntry.SLICE_HINT_CRYPTO_OP_ID));
                }
                sliceBuilder.addBundle(BiometricPromptData.INSTANCE.toBundle(biometricPromptData), null, CollectionsKt.listOf(CreateEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA));
            }
        }

        @JvmStatic
        @SuppressLint({"WrongConstant"})
        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static final CreateEntry fromSlice(@NotNull Slice slice) {
            BiometricPromptData biometricPromptDataFromBundle;
            Intrinsics.checkNotNullParameter(slice, "slice");
            CreateEntry createEntryFromSlice = Api28Impl.fromSlice(slice);
            if (createEntryFromSlice == null) {
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
                CharSequence accountName = createEntryFromSlice.getAccountName();
                PendingIntent pendingIntent = createEntryFromSlice.getPendingIntent();
                Icon icon = createEntryFromSlice.getIcon();
                CharSequence description = createEntryFromSlice.getDescription();
                Instant lastUsedTime = createEntryFromSlice.getLastUsedTime();
                Map map = createEntryFromSlice.credentialCountInformationMap;
                boolean isAutoSelectAllowed = createEntryFromSlice.getIsAutoSelectAllowed();
                if (bundle != null) {
                    biometricPromptDataFromBundle = BiometricPromptData.INSTANCE.fromBundle(bundle);
                } else {
                    biometricPromptDataFromBundle = null;
                }
                return new CreateEntry(accountName, pendingIntent, icon, description, lastUsedTime, map, isAutoSelectAllowed, biometricPromptDataFromBundle);
            } catch (Exception e11) {
                Log.i("CreateEntry", "fromSlice failed with: " + e11.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: CreateEntry.kt */
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bJ\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003J\u0010\u0010 \u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0012\u0010!\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Landroidx/credentials/provider/CreateEntry$Builder;", "", "accountName", "", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V", "credentialCountInformationMap", "", "", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "Landroid/graphics/drawable/Icon;", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "lastUsedTime", "Ljava/time/Instant;", "passwordCredentialCount", "Ljava/lang/Integer;", "publicKeyCredentialCount", "totalCredentialCount", "autoSelectAllowed", "", "biometricPromptData", "Landroidx/credentials/provider/BiometricPromptData;", "setAutoSelectAllowed", "setPasswordCredentialCount", "count", "setPublicKeyCredentialCount", "setTotalCredentialCount", "setIcon", "setDescription", "setLastUsedTime", "setBiometricPromptData", "build", "Landroidx/credentials/provider/CreateEntry;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Builder {

        @NotNull
        private final CharSequence accountName;
        private boolean autoSelectAllowed;

        @Nullable
        private BiometricPromptData biometricPromptData;

        @NotNull
        private Map<String, Integer> credentialCountInformationMap;

        @Nullable
        private CharSequence description;

        @Nullable
        private Icon icon;

        @Nullable
        private Instant lastUsedTime;

        @Nullable
        private Integer passwordCredentialCount;

        @NotNull
        private final PendingIntent pendingIntent;

        @Nullable
        private Integer publicKeyCredentialCount;

        @Nullable
        private Integer totalCredentialCount;

        public Builder(@NotNull CharSequence accountName, @NotNull PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(accountName, "accountName");
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            this.accountName = accountName;
            this.pendingIntent = pendingIntent;
            this.credentialCountInformationMap = new LinkedHashMap();
        }

        @NotNull
        public final CreateEntry build() {
            return new CreateEntry(this.accountName, this.pendingIntent, this.icon, this.description, this.lastUsedTime, this.credentialCountInformationMap, this.autoSelectAllowed, this.biometricPromptData);
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
        public final Builder setDescription(@Nullable CharSequence description) {
            if ((description != null ? Integer.valueOf(description.length()) : null) != null && description.length() > 300) {
                throw new IllegalArgumentException("Description must follow a limit of 300 characters.");
            }
            this.description = description;
            return this;
        }

        @NotNull
        public final Builder setIcon(@Nullable Icon icon) {
            this.icon = icon;
            return this;
        }

        @NotNull
        public final Builder setLastUsedTime(@Nullable Instant lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }

        @NotNull
        public final Builder setPasswordCredentialCount(int count) {
            this.passwordCredentialCount = Integer.valueOf(count);
            this.credentialCountInformationMap.put(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, Integer.valueOf(count));
            return this;
        }

        @NotNull
        public final Builder setPublicKeyCredentialCount(int count) {
            this.publicKeyCredentialCount = Integer.valueOf(count);
            this.credentialCountInformationMap.put(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, Integer.valueOf(count));
            return this;
        }

        @NotNull
        public final Builder setTotalCredentialCount(int count) {
            this.totalCredentialCount = Integer.valueOf(count);
            this.credentialCountInformationMap.put(CreateEntry.TYPE_TOTAL_CREDENTIAL, Integer.valueOf(count));
            return this;
        }
    }

    /* JADX INFO: compiled from: CreateEntry.kt */
    @Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0018H\u0007J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u001eH\u0007J%\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0001¢\u0006\u0002\b#J%\u0010$\u001a\u0004\u0018\u00010\"2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070 H\u0001¢\u0006\u0002\b&J\u001a\u0010/\u001a\u000200*\b\u0012\u0004\u0012\u00020\u001a012\u0006\u0010!\u001a\u00020\"H\u0007J\u0012\u00102\u001a\b\u0012\u0004\u0012\u00020\u001a01*\u00020\"H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00063"}, m90084d2 = {"Landroidx/credentials/provider/CreateEntry$Companion;", "", "<init>", "()V", "TAG", "", "DESCRIPTION_MAX_CHAR_LIMIT", "", "TYPE_TOTAL_CREDENTIAL", "SLICE_HINT_ACCOUNT_NAME", "SLICE_HINT_NOTE", "SLICE_HINT_ICON", "SLICE_HINT_CREDENTIAL_COUNT_INFORMATION", "SLICE_HINT_LAST_USED_TIME_MILLIS", "SLICE_HINT_PENDING_INTENT", "SLICE_HINT_AUTO_SELECT_ALLOWED", "SLICE_HINT_BIOMETRIC_PROMPT_DATA", "SLICE_HINT_ALLOWED_AUTHENTICATORS", "SLICE_HINT_CRYPTO_OP_ID", "AUTO_SELECT_TRUE_STRING", "AUTO_SELECT_FALSE_STRING", "SLICE_SPEC_TYPE", "REVISION_ID", "toSlice", "Landroid/app/slice/Slice;", "createEntry", "Landroidx/credentials/provider/CreateEntry;", "fromSlice", "slice", "fromCreateEntry", "Landroid/service/credentials/CreateEntry;", "convertBundleToCredentialCountInfo", "", "bundle", "Landroid/os/Bundle;", "convertBundleToCredentialCountInfo$credentials", "convertCredentialCountInfoToBundle", "credentialCountInformationMap", "convertCredentialCountInfoToBundle$credentials", "EXTRA_CREATE_ENTRY_SIZE", "EXTRA_CREATE_ACCOUNT_NAME_PREFIX", "EXTRA_CREATE_ENTRY_PENDING_INTENT_PREFIX", "EXTRA_CREATE_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX", "EXTRA_CREATE_ENTRY_LAST_USED_TIME_MILLIS_PREFIX", "EXTRA_CREATE_DESCRIPTION_PREFIX", "EXTRA_CREATE_TYPE_ICON_PREFIX", "EXTRA_CREATE_CREDENTIAL_COUNT_INFO_PREFIX", "marshall", "", "", "unmarshallCreateEntries", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCreateEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateEntry.kt\nandroidx/credentials/provider/CreateEntry$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,789:1\n1869#2,2:790\n1878#2,2:794\n1880#2:797\n216#3,2:792\n1#4:796\n*S KotlinDebug\n*F\n+ 1 CreateEntry.kt\nandroidx/credentials/provider/CreateEntry$Companion\n*L\n631#1:790,2\n680#1:794,2\n680#1:797\n647#1:792,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final Map<String, Integer> convertBundleToCredentialCountInfo$credentials(@Nullable Bundle bundle) {
            HashMap map = new HashMap();
            if (bundle != null) {
                Set<String> setKeySet = bundle.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
                for (String str : setKeySet) {
                    try {
                        map.put(str, Integer.valueOf(bundle.getInt(str)));
                    } catch (Exception e11) {
                        Log.i("CreateEntry", "Issue unpacking credential count info bundle: " + e11.getMessage());
                    }
                }
            }
            return map;
        }

        @JvmStatic
        @Nullable
        public final Bundle convertCredentialCountInfoToBundle$credentials(@NotNull Map<String, Integer> credentialCountInformationMap) {
            Intrinsics.checkNotNullParameter(credentialCountInformationMap, "credentialCountInformationMap");
            Bundle bundle = new Bundle();
            boolean z11 = false;
            for (Map.Entry<String, Integer> entry : credentialCountInformationMap.entrySet()) {
                if (entry.getValue() != null) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    Intrinsics.checkNotNull(value);
                    bundle.putInt(key, value.intValue());
                    z11 = true;
                }
            }
            if (z11) {
                return bundle;
            }
            return null;
        }

        @JvmStatic
        @Nullable
        public final CreateEntry fromCreateEntry(@NotNull android.service.credentials.CreateEntry createEntry) {
            Intrinsics.checkNotNullParameter(createEntry, "createEntry");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromCreateEntry(createEntry);
            }
            return null;
        }

        @RequiresApi(23)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final void marshall(@NotNull List<CreateEntry> list, @NotNull Bundle bundle) {
            Instant lastUsedTime;
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putInt(CreateEntry.EXTRA_CREATE_ENTRY_SIZE, list.size());
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                CreateEntry createEntry = (CreateEntry) obj;
                bundle.putCharSequence(CreateEntry.EXTRA_CREATE_ACCOUNT_NAME_PREFIX + i11, createEntry.getAccountName());
                bundle.putParcelable("androidx.credentials.provider.extra.PENDING_INTENT_" + i11, createEntry.getPendingIntent());
                Icon icon = createEntry.getIcon();
                if (icon != null) {
                    bundle.putParcelable("androidx.credentials.provider.extra.ICON_" + i11, icon);
                }
                CharSequence description = createEntry.getDescription();
                if (description != null) {
                    bundle.putCharSequence(CreateEntry.EXTRA_CREATE_DESCRIPTION_PREFIX + i11, description);
                }
                if (Build.VERSION.SDK_INT >= 26 && (lastUsedTime = createEntry.getLastUsedTime()) != null) {
                    bundle.putLong("androidx.credentials.provider.extra.LAST_USED_TIME_MILLIS_" + i11, lastUsedTime.toEpochMilli());
                }
                Bundle bundleConvertCredentialCountInfoToBundle$credentials = CreateEntry.INSTANCE.convertCredentialCountInfoToBundle$credentials(createEntry.credentialCountInformationMap);
                if (bundleConvertCredentialCountInfoToBundle$credentials != null) {
                    bundle.putBundle(CreateEntry.EXTRA_CREATE_CREDENTIAL_COUNT_INFO_PREFIX + i11, bundleConvertCredentialCountInfoToBundle$credentials);
                }
                bundle.putBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_" + i11, createEntry.getIsAutoSelectAllowed());
                i11 = i12;
            }
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final Slice toSlice(@NotNull CreateEntry createEntry) {
            Intrinsics.checkNotNullParameter(createEntry, "createEntry");
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 35) {
                return Api35Impl.toSlice(createEntry);
            }
            if (i11 >= 28) {
                return Api28Impl.toSlice(createEntry);
            }
            return null;
        }

        @RequiresApi(23)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public final List<CreateEntry> unmarshallCreateEntries(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            try {
                ArrayList arrayList = new ArrayList();
                int i11 = bundle.getInt(CreateEntry.EXTRA_CREATE_ENTRY_SIZE, 0);
                for (int i12 = 0; i12 < i11; i12++) {
                    CharSequence charSequence = bundle.getCharSequence(CreateEntry.EXTRA_CREATE_ACCOUNT_NAME_PREFIX + i12);
                    if (charSequence == null) {
                        return CollectionsKt.emptyList();
                    }
                    PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("androidx.credentials.provider.extra.PENDING_INTENT_" + i12);
                    if (pendingIntent == null) {
                        return CollectionsKt.emptyList();
                    }
                    Icon icon = (Icon) bundle.getParcelable("androidx.credentials.provider.extra.ICON_" + i12);
                    CharSequence charSequence2 = bundle.getCharSequence(CreateEntry.EXTRA_CREATE_DESCRIPTION_PREFIX + i12);
                    Map mutableMap = MapsKt.toMutableMap(convertBundleToCredentialCountInfo$credentials(bundle.getBundle(CreateEntry.EXTRA_CREATE_CREDENTIAL_COUNT_INFO_PREFIX + i12)));
                    boolean z11 = bundle.getBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_" + i12, false);
                    if (Build.VERSION.SDK_INT >= 26) {
                        Instant instantOfEpochMilli = null;
                        if (bundle.containsKey("androidx.credentials.provider.extra.LAST_USED_TIME_MILLIS_" + i12)) {
                            try {
                                instantOfEpochMilli = Instant.ofEpochMilli(bundle.getLong("androidx.credentials.provider.extra.LAST_USED_TIME_MILLIS_" + i12));
                            } catch (Exception unused) {
                            }
                        }
                        arrayList.add(new CreateEntry(charSequence, pendingIntent, icon, charSequence2, instantOfEpochMilli, mutableMap, z11, (BiometricPromptData) null, 128, (DefaultConstructorMarker) null));
                    } else {
                        arrayList.add(new CreateEntry(charSequence, pendingIntent, icon, charSequence2, (Instant) null, mutableMap, z11, (BiometricPromptData) null, 128, (DefaultConstructorMarker) null));
                    }
                }
                return arrayList;
            } catch (Exception unused2) {
                return CollectionsKt.emptyList();
            }
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final CreateEntry fromSlice(@NotNull Slice slice) {
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

    public CreateEntry(@NotNull CharSequence accountName, @NotNull PendingIntent pendingIntent, @Nullable Icon icon, @Nullable CharSequence charSequence, @Nullable Instant instant, @NotNull Map<String, Integer> credentialCountInformationMap, boolean z11, @Nullable BiometricPromptData biometricPromptData) {
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(credentialCountInformationMap, "credentialCountInformationMap");
        this.accountName = accountName;
        this.pendingIntent = pendingIntent;
        this.icon = icon;
        this.description = charSequence;
        this.lastUsedTime = instant;
        this.credentialCountInformationMap = credentialCountInformationMap;
        this.isAutoSelectAllowed = z11;
        this.biometricPromptData = biometricPromptData;
        if (accountName.length() <= 0) {
            throw new IllegalArgumentException("accountName must not be empty");
        }
        if (charSequence != null && charSequence.length() > 300) {
            throw new IllegalArgumentException("Description must follow a limit of 300 characters.");
        }
    }

    @JvmStatic
    @Nullable
    public static final CreateEntry fromCreateEntry(@NotNull android.service.credentials.CreateEntry createEntry) {
        return INSTANCE.fromCreateEntry(createEntry);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public static final CreateEntry fromSlice(@NotNull Slice slice) {
        return INSTANCE.fromSlice(slice);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public static final Slice toSlice(@NotNull CreateEntry createEntry) {
        return INSTANCE.toSlice(createEntry);
    }

    @NotNull
    public final CharSequence getAccountName() {
        return this.accountName;
    }

    @Nullable
    public final BiometricPromptData getBiometricPromptData() {
        return this.biometricPromptData;
    }

    @Nullable
    public final CharSequence getDescription() {
        return this.description;
    }

    @Nullable
    public final Icon getIcon() {
        return this.icon;
    }

    @Nullable
    public final Instant getLastUsedTime() {
        return this.lastUsedTime;
    }

    @Nullable
    public final Integer getPasswordCredentialCount() {
        return this.credentialCountInformationMap.get(PasswordCredential.TYPE_PASSWORD_CREDENTIAL);
    }

    @NotNull
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    @Nullable
    public final Integer getPublicKeyCredentialCount() {
        return this.credentialCountInformationMap.get(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL);
    }

    @Nullable
    public final Integer getTotalCredentialCount() {
        return this.credentialCountInformationMap.get(TYPE_TOTAL_CREDENTIAL);
    }

    /* JADX INFO: renamed from: isAutoSelectAllowed, reason: from getter */
    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    public /* synthetic */ CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, Icon icon, CharSequence charSequence2, Instant instant, Map map, boolean z11, BiometricPromptData biometricPromptData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, pendingIntent, icon, charSequence2, instant, map, z11, (i11 & 128) != 0 ? null : biometricPromptData);
    }

    public /* synthetic */ CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, Instant instant, Icon icon, Integer num, Integer num2, Integer num3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, pendingIntent, (i11 & 4) != 0 ? null : charSequence2, (i11 & 8) != 0 ? null : instant, (i11 & 16) != 0 ? null : icon, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : num2, (i11 & 128) != 0 ? null : num3, (i11 & 256) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateEntry(@NotNull CharSequence accountName, @NotNull PendingIntent pendingIntent, @Nullable CharSequence charSequence, @Nullable Instant instant, @Nullable Icon icon, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, boolean z11) {
        this(accountName, pendingIntent, icon, charSequence, instant, MapsKt.mutableMapOf(TuplesKt.m90091to(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, num), TuplesKt.m90091to(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, num2), TuplesKt.m90091to(TYPE_TOTAL_CREDENTIAL, num3)), z11, (BiometricPromptData) null, 128, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
    }

    public /* synthetic */ CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, Instant instant, Icon icon, Integer num, Integer num2, Integer num3, boolean z11, BiometricPromptData biometricPromptData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, pendingIntent, (i11 & 4) != 0 ? null : charSequence2, (i11 & 8) != 0 ? null : instant, (i11 & 16) != 0 ? null : icon, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : num2, (i11 & 128) != 0 ? null : num3, (i11 & 256) != 0 ? false : z11, (i11 & 512) != 0 ? null : biometricPromptData);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi(35)
    public CreateEntry(@NotNull CharSequence accountName, @NotNull PendingIntent pendingIntent, @Nullable CharSequence charSequence, @Nullable Instant instant, @Nullable Icon icon, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, boolean z11, @Nullable BiometricPromptData biometricPromptData) {
        this(accountName, pendingIntent, icon, charSequence, instant, MapsKt.mutableMapOf(TuplesKt.m90091to(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, num), TuplesKt.m90091to(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, num2), TuplesKt.m90091to(TYPE_TOTAL_CREDENTIAL, num3)), z11, biometricPromptData);
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
    }
}
