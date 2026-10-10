package com.kubi.sdk.mode;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import tz.C45079a;
import y70.C46392a;

/* JADX INFO: compiled from: AppMode.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/mode/AppMode;", "", "modeType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getModeType", "()Ljava/lang/String;", "Pro", "Lite", "Web3", "toString", "Companion", "LModeConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum AppMode {
    Pro("Pro"),
    Lite("Lite"),
    Web3("Web3");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static AppMode f46989b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final MutableLiveData<AppMode> f46990c;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumEntries f46992e = EnumEntriesKt.enumEntries(m57253a());

    @NotNull
    private final String modeType;

    /* JADX INFO: compiled from: AppMode.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005H\u0007J\u0012\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005H\u0007J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\f\u001a\u00020\u0005J\b\u0010\u001c\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/mode/AppMode$Companion;", "", "<init>", "()V", "_currentModeValue", "Lcom/kubi/sdk/mode/AppMode;", "_currentMode", "Landroidx/lifecycle/MutableLiveData;", "currentMode", "Landroidx/lifecycle/LiveData;", "getCurrentMode", "()Landroidx/lifecycle/LiveData;", "default", "getCurrentBizMode", "getCurMode", "isLiteMode", "", "isWeb3Mode", "isProMode", "modeConvert", "appMode", "updateCurrentMode", "", "mode", "fromString", "modeType", "", "fromStringDefault", "loadSavedMode", "LModeConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAppMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppMode.kt\ncom/kubi/sdk/mode/AppMode$Companion\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n23#2,2:115\n32#2:119\n295#3,2:117\n*S KotlinDebug\n*F\n+ 1 AppMode.kt\ncom/kubi/sdk/mode/AppMode$Companion\n*L\n86#1:115,2\n108#1:119\n95#1:117,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final AppMode fromString(@Nullable String modeType) {
            AppMode appMode = null;
            if (modeType == null) {
                return null;
            }
            for (AppMode appMode2 : AppMode.getEntries()) {
                if (StringsKt.equals(appMode2.getModeType(), modeType, true)) {
                    appMode = appMode2;
                    break;
                }
            }
            return appMode;
        }

        @NotNull
        public final LiveData<AppMode> getCurrentMode() {
            return AppMode.f46990c;
        }

        public final boolean isLiteMode() {
            return getCurrentMode$default(this, null, 1, null) == AppMode.Lite;
        }

        public Companion() {
        }

        public static /* synthetic */ AppMode fromStringDefault$default(Companion companion, String str, AppMode appMode, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                appMode = AppMode.Pro;
            }
            return companion.fromStringDefault(str, appMode);
        }

        public static /* synthetic */ AppMode getCurrentBizMode$default(Companion companion, AppMode appMode, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                appMode = AppMode.Pro;
            }
            return companion.getCurrentBizMode(appMode);
        }

        public static /* synthetic */ AppMode getCurrentMode$default(Companion companion, AppMode appMode, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                appMode = AppMode.Pro;
            }
            return companion.getCurrentMode(appMode);
        }

        /* JADX INFO: renamed from: b */
        public final AppMode m57255b() {
            AppMode appModeFromStringDefault$default = fromStringDefault$default(this, C46392a.m102326h(C45079a.f101482a.m99689c(), ""), null, 2, null);
            C44128b.m97266j("LiteTag", "loadSavedMode kv=" + appModeFromStringDefault$default);
            return appModeFromStringDefault$default;
        }

        /* JADX INFO: renamed from: c */
        public final AppMode m57256c(AppMode appMode) {
            return appMode == AppMode.Web3 ? AppMode.Pro : appMode;
        }

        @NotNull
        public final AppMode fromStringDefault(@Nullable String modeType, @NotNull AppMode appMode) {
            Intrinsics.checkNotNullParameter(appMode, "default");
            AppMode appModeFromString = fromString(modeType);
            return appModeFromString == null ? appMode : appModeFromString;
        }

        @JvmStatic
        @NotNull
        public final AppMode getCurrentBizMode(@NotNull AppMode appMode) {
            Intrinsics.checkNotNullParameter(appMode, "default");
            AppMode appModeM57254a = m57254a();
            C44128b.m97266j("LiteTag", "cur=" + appModeM57254a);
            return appModeM57254a;
        }

        @JvmStatic
        @NotNull
        public final AppMode getCurrentMode(@NotNull AppMode appMode) {
            Intrinsics.checkNotNullParameter(appMode, "default");
            return m57256c(m57254a());
        }

        @JvmStatic
        public final void updateCurrentMode(@NotNull AppMode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            AppMode.f46989b = mode;
            if (AppMode.f46990c.getValue() != mode) {
                AppMode.f46990c.postValue(mode);
                C46392a.m102333p(C45079a.f101482a.m99689c(), mode.getModeType());
            }
        }

        /* JADX INFO: renamed from: a */
        public final AppMode m57254a() {
            return AppMode.f46989b;
        }

        public final boolean isProMode() {
            if (m57254a() == AppMode.Pro) {
                return true;
            }
            return false;
        }

        public final boolean isWeb3Mode() {
            if (m57254a() == AppMode.Web3) {
                return true;
            }
            return false;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f46989b = companion.m57255b();
        f46990c = new MutableLiveData<>(f46989b);
    }

    @JvmStatic
    @NotNull
    public static final AppMode getCurrentBizMode(@NotNull AppMode appMode) {
        return INSTANCE.getCurrentBizMode(appMode);
    }

    @JvmStatic
    @NotNull
    public static final AppMode getCurrentMode(@NotNull AppMode appMode) {
        return INSTANCE.getCurrentMode(appMode);
    }

    @NotNull
    public static EnumEntries<AppMode> getEntries() {
        return f46992e;
    }

    @JvmStatic
    public static final void updateCurrentMode(@NotNull AppMode appMode) {
        INSTANCE.updateCurrentMode(appMode);
    }

    @NotNull
    public final String getModeType() {
        return this.modeType;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.modeType;
    }

    AppMode(String str) {
        this.modeType = str;
    }
}
