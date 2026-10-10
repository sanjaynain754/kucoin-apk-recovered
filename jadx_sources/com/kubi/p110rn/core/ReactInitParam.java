package com.kubi.p110rn.core;

import android.os.Bundle;
import androidx.credentials.provider.CredentialEntry;
import com.kubi.p110rn.Constants;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.utils.ToastCompat;
import com.tencent.bugly.proguard.C33844oi;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import y70.C46396e;

/* JADX INFO: compiled from: ReactInitParam.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010%J\u009c\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0007\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001eR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%¨\u0006<"}, m90084d2 = {"Lcom/kubi/rn/core/ReactInitParam;", "", Constants.BIZ, "", "entry", Constants.COMPONENT, "backup", "isDarkTheme", "", "language", "present", "appPresent", "isDebug", "titleBarHidden", "transparent", "customParameters", "Landroid/os/Bundle;", "timeout", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;ZZZLandroid/os/Bundle;Ljava/lang/Long;)V", "getBiz", "()Ljava/lang/String;", "getEntry", "getComponent", "getBackup", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLanguage", "getPresent", "()Z", "getAppPresent", "getTitleBarHidden", "getTransparent", "getCustomParameters", "()Landroid/os/Bundle;", "getTimeout", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;ZZZLandroid/os/Bundle;Ljava/lang/Long;)Lcom/kubi/rn/core/ReactInitParam;", "equals", "other", "hashCode", "", "toString", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ReactInitParam {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String appPresent;

    @Nullable
    private final String backup;

    @NotNull
    private final String biz;

    @NotNull
    private final String component;

    @Nullable
    private final Bundle customParameters;

    @NotNull
    private final String entry;

    @Nullable
    private final Boolean isDarkTheme;
    private final boolean isDebug;

    @Nullable
    private final String language;
    private final boolean present;

    @Nullable
    private final Long timeout;
    private final boolean titleBarHidden;
    private final boolean transparent;

    /* JADX INFO: compiled from: ReactInitParam.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0014\u0010\b\u001a\u00020\t*\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, m90084d2 = {"Lcom/kubi/rn/core/ReactInitParam$Companion;", "", "<init>", "()V", "fromBundle", "Lcom/kubi/rn/core/ReactInitParam;", "bundle", "Landroid/os/Bundle;", "getBooleanParam", "", "key", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nReactInitParam.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactInitParam.kt\ncom/kubi/rn/core/ReactInitParam$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
        @Nullable
        public final ReactInitParam fromBundle(@Nullable Bundle bundle) {
            String strM56239b0;
            boolean z11;
            boolean zAreEqual;
            if (bundle == null || (strM56239b0 = RouteExKt.m56239b0(bundle, Constants.BIZ)) == null) {
                return null;
            }
            String strM56239b1 = RouteExKt.m56239b0(bundle, "entry");
            if (strM56239b1 == null) {
                strM56239b1 = "index";
            }
            String str = strM56239b1;
            String strM56239b2 = RouteExKt.m56239b0(bundle, Constants.COMPONENT);
            String str2 = strM56239b2 == null ? strM56239b0 : strM56239b2;
            String strM56239b3 = RouteExKt.m56239b0(bundle, "backup");
            String strM56239b4 = RouteExKt.m56239b0(bundle, BaseActivity.THEME);
            Boolean boolValueOf = strM56239b4 != null ? Boolean.valueOf(Intrinsics.areEqual(strM56239b4, "dark")) : null;
            String strM56239b5 = RouteExKt.m56239b0(bundle, "language");
            boolean zAreEqual2 = Intrinsics.areEqual(RouteExKt.m56239b0(bundle, "present"), CredentialEntry.TRUE_STRING);
            String strM56239b6 = RouteExKt.m56239b0(bundle, "appPresent");
            if (!bundle.containsKey("isDebug")) {
                if (ReactConstKt.getDeveloperSupport()) {
                    boolean zM102347d = C46396e.m102347d("rn_debug", "switch_rn_debug", false);
                    String strM102351h = C46396e.m102351h("rn_debug_bundle", "rn_debug_bundle_info", "");
                    List listSplit$default = StringsKt.split$default((CharSequence) strM102351h, new String[]{C33844oi.f71346o}, false, 0, 6, (Object) null);
                    zAreEqual = zM102347d && ((listSplit$default.size() == 2 && Intrinsics.areEqual(CollectionsKt.getOrNull(listSplit$default, 0), strM56239b0) && Intrinsics.areEqual(CollectionsKt.getOrNull(listSplit$default, 1), str2)) || strM102351h == null || strM102351h.length() == 0);
                    if (zAreEqual) {
                        ToastCompat.m66441G("加载本地调试bundle", new Object[0]);
                    }
                } else {
                    z11 = false;
                }
                String strM56239b7 = RouteExKt.m56239b0(bundle, "titleBarHidden");
                boolean zAreEqual3 = strM56239b7 != null ? true ^ Intrinsics.areEqual(strM56239b7, CredentialEntry.FALSE_STRING) : true;
                boolean booleanParam = getBooleanParam(bundle, "transparent");
                Bundle bundle2 = new Bundle(bundle);
                bundle.containsKey("timeout");
                String strM56239b8 = RouteExKt.m56239b0(bundle, "timeout");
                return new ReactInitParam(strM56239b0, str, str2, strM56239b3, boolValueOf, strM56239b5, zAreEqual2, strM56239b6, z11, zAreEqual3, booleanParam, bundle2, strM56239b8 != null ? StringsKt.toLongOrNull(strM56239b8) : null);
            }
            zAreEqual = Intrinsics.areEqual(bundle.getString("isDebug"), CredentialEntry.TRUE_STRING);
            z11 = zAreEqual;
            String strM56239b9 = RouteExKt.m56239b0(bundle, "titleBarHidden");
            if (strM56239b9 != null) {
            }
            boolean booleanParam2 = getBooleanParam(bundle, "transparent");
            Bundle bundle3 = new Bundle(bundle);
            bundle.containsKey("timeout");
            String strM56239b10 = RouteExKt.m56239b0(bundle, "timeout");
            return new ReactInitParam(strM56239b0, str, str2, strM56239b3, boolValueOf, strM56239b5, zAreEqual2, strM56239b6, z11, zAreEqual3, booleanParam2, bundle3, strM56239b10 != null ? StringsKt.toLongOrNull(strM56239b10) : null);
        }

        private final boolean getBooleanParam(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (Intrinsics.areEqual(obj, Boolean.TRUE) || Intrinsics.areEqual(obj, CredentialEntry.TRUE_STRING)) {
                return true;
            }
            return false;
        }
    }

    public ReactInitParam(@NotNull String biz, @NotNull String entry, @NotNull String component, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, boolean z11, @Nullable String str3, boolean z12, boolean z13, boolean z14, @Nullable Bundle bundle, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(component, "component");
        this.biz = biz;
        this.entry = entry;
        this.component = component;
        this.backup = str;
        this.isDarkTheme = bool;
        this.language = str2;
        this.present = z11;
        this.appPresent = str3;
        this.isDebug = z12;
        this.titleBarHidden = z13;
        this.transparent = z14;
        this.customParameters = bundle;
        this.timeout = l11;
    }

    public static /* synthetic */ ReactInitParam copy$default(ReactInitParam reactInitParam, String str, String str2, String str3, String str4, Boolean bool, String str5, boolean z11, String str6, boolean z12, boolean z13, boolean z14, Bundle bundle, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reactInitParam.biz;
        }
        return reactInitParam.copy(str, (i11 & 2) != 0 ? reactInitParam.entry : str2, (i11 & 4) != 0 ? reactInitParam.component : str3, (i11 & 8) != 0 ? reactInitParam.backup : str4, (i11 & 16) != 0 ? reactInitParam.isDarkTheme : bool, (i11 & 32) != 0 ? reactInitParam.language : str5, (i11 & 64) != 0 ? reactInitParam.present : z11, (i11 & 128) != 0 ? reactInitParam.appPresent : str6, (i11 & 256) != 0 ? reactInitParam.isDebug : z12, (i11 & 512) != 0 ? reactInitParam.titleBarHidden : z13, (i11 & 1024) != 0 ? reactInitParam.transparent : z14, (i11 & 2048) != 0 ? reactInitParam.customParameters : bundle, (i11 & 4096) != 0 ? reactInitParam.timeout : l11);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactInitParam)) {
            return false;
        }
        ReactInitParam reactInitParam = (ReactInitParam) other;
        return Intrinsics.areEqual(this.biz, reactInitParam.biz) && Intrinsics.areEqual(this.entry, reactInitParam.entry) && Intrinsics.areEqual(this.component, reactInitParam.component) && Intrinsics.areEqual(this.backup, reactInitParam.backup) && Intrinsics.areEqual(this.isDarkTheme, reactInitParam.isDarkTheme) && Intrinsics.areEqual(this.language, reactInitParam.language) && this.present == reactInitParam.present && Intrinsics.areEqual(this.appPresent, reactInitParam.appPresent) && this.isDebug == reactInitParam.isDebug && this.titleBarHidden == reactInitParam.titleBarHidden && this.transparent == reactInitParam.transparent && Intrinsics.areEqual(this.customParameters, reactInitParam.customParameters) && Intrinsics.areEqual(this.timeout, reactInitParam.timeout);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBiz() {
        return this.biz;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getTitleBarHidden() {
        return this.titleBarHidden;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getTransparent() {
        return this.transparent;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Bundle getCustomParameters() {
        return this.customParameters;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getTimeout() {
        return this.timeout;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEntry() {
        return this.entry;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getComponent() {
        return this.component;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBackup() {
        return this.backup;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsDarkTheme() {
        return this.isDarkTheme;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getPresent() {
        return this.present;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAppPresent() {
        return this.appPresent;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsDebug() {
        return this.isDebug;
    }

    @NotNull
    public final ReactInitParam copy(@NotNull String biz, @NotNull String entry, @NotNull String component, @Nullable String backup, @Nullable Boolean isDarkTheme, @Nullable String language, boolean present, @Nullable String appPresent, boolean isDebug, boolean titleBarHidden, boolean transparent, @Nullable Bundle customParameters, @Nullable Long timeout) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(component, "component");
        return new ReactInitParam(biz, entry, component, backup, isDarkTheme, language, present, appPresent, isDebug, titleBarHidden, transparent, customParameters, timeout);
    }

    @Nullable
    public final String getAppPresent() {
        return this.appPresent;
    }

    @Nullable
    public final String getBackup() {
        return this.backup;
    }

    @NotNull
    public final String getBiz() {
        return this.biz;
    }

    @NotNull
    public final String getComponent() {
        return this.component;
    }

    @Nullable
    public final Bundle getCustomParameters() {
        return this.customParameters;
    }

    @NotNull
    public final String getEntry() {
        return this.entry;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    public final boolean getPresent() {
        return this.present;
    }

    @Nullable
    public final Long getTimeout() {
        return this.timeout;
    }

    public final boolean getTitleBarHidden() {
        return this.titleBarHidden;
    }

    public final boolean getTransparent() {
        return this.transparent;
    }

    public int hashCode() {
        int iHashCode = ((((this.biz.hashCode() * 31) + this.entry.hashCode()) * 31) + this.component.hashCode()) * 31;
        String str = this.backup;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isDarkTheme;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.language;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.present)) * 31;
        String str3 = this.appPresent;
        int iHashCode5 = (((((((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isDebug)) * 31) + Boolean.hashCode(this.titleBarHidden)) * 31) + Boolean.hashCode(this.transparent)) * 31;
        Bundle bundle = this.customParameters;
        int iHashCode6 = (iHashCode5 + (bundle == null ? 0 : bundle.hashCode())) * 31;
        Long l11 = this.timeout;
        return iHashCode6 + (l11 != null ? l11.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDarkTheme() {
        return this.isDarkTheme;
    }

    public final boolean isDebug() {
        return this.isDebug;
    }

    @NotNull
    public String toString() {
        return "ReactInitParam(biz=" + this.biz + ", entry=" + this.entry + ", component=" + this.component + ", backup=" + this.backup + ", isDarkTheme=" + this.isDarkTheme + ", language=" + this.language + ", present=" + this.present + ", appPresent=" + this.appPresent + ", isDebug=" + this.isDebug + ", titleBarHidden=" + this.titleBarHidden + ", transparent=" + this.transparent + ", customParameters=" + this.customParameters + ", timeout=" + this.timeout + ')';
    }

    public /* synthetic */ ReactInitParam(String str, String str2, String str3, String str4, Boolean bool, String str5, boolean z11, String str6, boolean z12, boolean z13, boolean z14, Bundle bundle, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, bool, str5, (i11 & 64) != 0 ? false : z11, str6, (i11 & 256) != 0 ? false : z12, (i11 & 512) != 0 ? true : z13, (i11 & 1024) != 0 ? false : z14, bundle, (i11 & 4096) != 0 ? null : l11);
    }
}
