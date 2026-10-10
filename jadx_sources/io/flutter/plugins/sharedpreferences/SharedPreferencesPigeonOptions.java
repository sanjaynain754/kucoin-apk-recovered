package io.flutter.plugins.sharedpreferences;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessagesAsync.g.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "", "fileName", "", "useDataStore", "", "<init>", "(Ljava/lang/String;Z)V", "getFileName", "()Ljava/lang/String;", "getUseDataStore", "()Z", "toList", "", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "shared_preferences_android_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* data */ class SharedPreferencesPigeonOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String fileName;
    private final boolean useDataStore;

    /* JADX INFO: compiled from: MessagesAsync.g.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions$Companion;", "", "<init>", "()V", "fromList", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "pigeonVar_list", "", "shared_preferences_android_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final SharedPreferencesPigeonOptions fromList(@NotNull List<? extends Object> pigeonVar_list) {
            Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
            String str = (String) pigeonVar_list.get(0);
            Object obj = pigeonVar_list.get(1);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new SharedPreferencesPigeonOptions(str, ((Boolean) obj).booleanValue());
        }
    }

    public SharedPreferencesPigeonOptions(@Nullable String str, boolean z11) {
        this.fileName = str;
        this.useDataStore = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedPreferencesPigeonOptions)) {
            return false;
        }
        SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions = (SharedPreferencesPigeonOptions) other;
        return Intrinsics.areEqual(this.fileName, sharedPreferencesPigeonOptions.fileName) && this.useDataStore == sharedPreferencesPigeonOptions.useDataStore;
    }

    public /* synthetic */ SharedPreferencesPigeonOptions(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, z11);
    }

    public static /* synthetic */ SharedPreferencesPigeonOptions copy$default(SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sharedPreferencesPigeonOptions.fileName;
        }
        if ((i11 & 2) != 0) {
            z11 = sharedPreferencesPigeonOptions.useDataStore;
        }
        return sharedPreferencesPigeonOptions.copy(str, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getUseDataStore() {
        return this.useDataStore;
    }

    @NotNull
    public final SharedPreferencesPigeonOptions copy(@Nullable String fileName, boolean useDataStore) {
        return new SharedPreferencesPigeonOptions(fileName, useDataStore);
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    public final boolean getUseDataStore() {
        return this.useDataStore;
    }

    public int hashCode() {
        String str = this.fileName;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.useDataStore);
    }

    @NotNull
    public final List<Object> toList() {
        return CollectionsKt.listOf(this.fileName, Boolean.valueOf(this.useDataStore));
    }

    @NotNull
    public String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.fileName + ", useDataStore=" + this.useDataStore + ")";
    }
}
