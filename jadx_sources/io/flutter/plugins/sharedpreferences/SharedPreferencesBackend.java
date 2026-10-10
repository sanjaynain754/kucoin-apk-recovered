package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.preference.PreferenceManager;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J \u0010\u001d\u001a\u00020\u000b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020!0 2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001f\u0010\"\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010#J\u001f\u0010$\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010%J\u001f\u0010&\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010'J\u001a\u0010(\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010+\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u001c2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesBackend;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "context", "Landroid/content/Context;", "listEncoder", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;)V", "tearDown", "", "createSharedPreferences", "Landroid/content/SharedPreferences;", "options", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "setBool", "key", "", "value", "", "setString", "setInt", "", "setDouble", "", "setEncodedStringList", "setDeprecatedStringList", "", "clear", "allowList", "getAll", "", "", "getInt", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Long;", "getBool", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Boolean;", "getDouble", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Double;", "getString", "getStringList", "Lio/flutter/plugins/sharedpreferences/StringListResult;", "getPlatformEncodedStringList", "getKeys", "shared_preferences_android_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSharedPreferencesPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesBackend\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,520:1\n1#2:521\n808#3,11:522\n535#4:533\n520#4,6:534\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesBackend\n*L\n453#1:522,11\n466#1:533\n466#1:534,6\n*E\n"})
public final class SharedPreferencesBackend implements SharedPreferencesAsyncApi {

    @NotNull
    private Context context;

    @NotNull
    private SharedPreferencesListEncoder listEncoder;

    @NotNull
    private BinaryMessenger messenger;

    public SharedPreferencesBackend(@NotNull BinaryMessenger messenger, @NotNull Context context, @NotNull SharedPreferencesListEncoder listEncoder) {
        Intrinsics.checkNotNullParameter(messenger, "messenger");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listEncoder, "listEncoder");
        this.messenger = messenger;
        this.context = context;
        this.listEncoder = listEncoder;
        try {
            SharedPreferencesAsyncApi.INSTANCE.setUp(messenger, this, "shared_preferences");
        } catch (Exception e11) {
            Log.e(SharedPreferencesPluginKt.TAG, "Received exception while setting up SharedPreferencesBackend", e11);
        }
    }

    public final void tearDown() {
        SharedPreferencesAsyncApi.INSTANCE.setUp(this.messenger, null, "shared_preferences");
    }

    private final SharedPreferences createSharedPreferences(SharedPreferencesPigeonOptions options) {
        if (options.getFileName() == null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.context);
            Intrinsics.checkNotNull(defaultSharedPreferences);
            return defaultSharedPreferences;
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(options.getFileName(), 0);
        Intrinsics.checkNotNull(sharedPreferences);
        return sharedPreferences;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void clear(@Nullable List<String> allowList, @NotNull SharedPreferencesPigeonOptions options) {
        Set set;
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
        SharedPreferences.Editor editorEdit = sharedPreferencesCreateSharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        Map<String, ?> all = sharedPreferencesCreateSharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            Object obj = all.get(str);
            if (allowList != null) {
                set = CollectionsKt.toSet(allowList);
            } else {
                set = null;
            }
            if (SharedPreferencesPluginKt.preferencesFilter(str, obj, set)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            editorEdit.remove((String) next);
        }
        editorEdit.apply();
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @NotNull
    public Map<String, Object> getAll(@Nullable List<String> allowList, @NotNull SharedPreferencesPigeonOptions options) {
        Set set;
        Object value;
        Intrinsics.checkNotNullParameter(options, "options");
        Map<String, ?> all = createSharedPreferences(options).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value2 = entry.getValue();
            if (allowList != null) {
                set = CollectionsKt.toSet(allowList);
            } else {
                set = null;
            }
            if (SharedPreferencesPluginKt.preferencesFilter(key, value2, set) && (value = entry.getValue()) != null) {
                String key2 = entry.getKey();
                Object objTransformPref = SharedPreferencesPluginKt.transformPref(value, this.listEncoder);
                Intrinsics.checkNotNull(objTransformPref, "null cannot be cast to non-null type kotlin.Any");
                map.put(key2, objTransformPref);
            }
        }
        return map;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @Nullable
    public Boolean getBool(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
        if (sharedPreferencesCreateSharedPreferences.contains(key)) {
            return Boolean.valueOf(sharedPreferencesCreateSharedPreferences.getBoolean(key, true));
        }
        return null;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @Nullable
    public Double getDouble(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
        if (sharedPreferencesCreateSharedPreferences.contains(key)) {
            Object objTransformPref = SharedPreferencesPluginKt.transformPref(sharedPreferencesCreateSharedPreferences.getString(key, ""), this.listEncoder);
            Intrinsics.checkNotNull(objTransformPref, "null cannot be cast to non-null type kotlin.Double");
            return (Double) objTransformPref;
        }
        return null;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @Nullable
    public Long getInt(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options) {
        long j11;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
        if (sharedPreferencesCreateSharedPreferences.contains(key)) {
            try {
                j11 = sharedPreferencesCreateSharedPreferences.getLong(key, 0L);
            } catch (ClassCastException unused) {
                j11 = sharedPreferencesCreateSharedPreferences.getInt(key, 0);
            }
            return Long.valueOf(j11);
        }
        return null;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @NotNull
    public List<String> getKeys(@Nullable List<String> allowList, @NotNull SharedPreferencesPigeonOptions options) {
        Set set;
        Intrinsics.checkNotNullParameter(options, "options");
        Map<String, ?> all = createSharedPreferences(options).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            String str = key;
            Object value = entry.getValue();
            if (allowList != null) {
                set = CollectionsKt.toSet(allowList);
            } else {
                set = null;
            }
            if (SharedPreferencesPluginKt.preferencesFilter(str, value, set)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return CollectionsKt.toList(linkedHashMap.keySet());
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @Nullable
    public List<String> getPlatformEncodedStringList(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options) {
        List list;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
        if (sharedPreferencesCreateSharedPreferences.contains(key)) {
            String string = sharedPreferencesCreateSharedPreferences.getString(key, "");
            Intrinsics.checkNotNull(string);
            if (StringsKt.startsWith$default(string, SharedPreferencesPluginKt.LIST_PREFIX, false, 2, (Object) null) && !StringsKt.startsWith$default(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false, 2, (Object) null) && (list = (List) SharedPreferencesPluginKt.transformPref(sharedPreferencesCreateSharedPreferences.getString(key, ""), this.listEncoder)) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }
        return null;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @Nullable
    public String getString(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
        if (sharedPreferencesCreateSharedPreferences.contains(key)) {
            return sharedPreferencesCreateSharedPreferences.getString(key, "");
        }
        return null;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @Nullable
    public StringListResult getStringList(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
        if (!sharedPreferencesCreateSharedPreferences.contains(key)) {
            return null;
        }
        String string = sharedPreferencesCreateSharedPreferences.getString(key, "");
        Intrinsics.checkNotNull(string);
        if (StringsKt.startsWith$default(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false, 2, (Object) null)) {
            return new StringListResult(string, StringListLookupResultType.JSON_ENCODED);
        }
        if (StringsKt.startsWith$default(string, SharedPreferencesPluginKt.LIST_PREFIX, false, 2, (Object) null)) {
            return new StringListResult(null, StringListLookupResultType.PLATFORM_ENCODED);
        }
        return new StringListResult(null, StringListLookupResultType.UNEXPECTED_STRING);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setBool(@NotNull String key, boolean value, @NotNull SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        createSharedPreferences(options).edit().putBoolean(key, value).apply();
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @Deprecated(message = "This is just for testing, use `setEncodedStringList`")
    public void setDeprecatedStringList(@NotNull String key, @NotNull List<String> value, @NotNull SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        createSharedPreferences(options).edit().putString(key, SharedPreferencesPluginKt.LIST_PREFIX + this.listEncoder.encode(value)).apply();
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDouble(@NotNull String key, double value, @NotNull SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        createSharedPreferences(options).edit().putString(key, SharedPreferencesPluginKt.DOUBLE_PREFIX + value).apply();
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setEncodedStringList(@NotNull String key, @NotNull String value, @NotNull SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        createSharedPreferences(options).edit().putString(key, value).apply();
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setInt(@NotNull String key, long value, @NotNull SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        createSharedPreferences(options).edit().putLong(key, value).apply();
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setString(@NotNull String key, @NotNull String value, @NotNull SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        createSharedPreferences(options).edit().putString(key, value).apply();
    }

    public /* synthetic */ SharedPreferencesBackend(BinaryMessenger binaryMessenger, Context context, SharedPreferencesListEncoder sharedPreferencesListEncoder, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(binaryMessenger, context, (i11 & 4) != 0 ? new ListEncoder() : sharedPreferencesListEncoder);
    }
}
