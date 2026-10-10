package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeCommonTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/AppCpsInfo;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "clientId", "", "clickId", "utmSource", "utmMedium", "utmCampaign", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getClickId", "getUtmSource", "getUtmMedium", "getUtmCampaign", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeCommonTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeCommonTurboModule.kt\ncom/kubi/rn/core/turbo/AppCpsInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n1#2:388\n*E\n"})
public final /* data */ class AppCpsInfo implements WritableMapSerializable {

    @Nullable
    private final String clickId;

    @Nullable
    private final String clientId;

    @Nullable
    private final String utmCampaign;

    @Nullable
    private final String utmMedium;

    @Nullable
    private final String utmSource;

    public AppCpsInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppCpsInfo)) {
            return false;
        }
        AppCpsInfo appCpsInfo = (AppCpsInfo) other;
        return Intrinsics.areEqual(this.clientId, appCpsInfo.clientId) && Intrinsics.areEqual(this.clickId, appCpsInfo.clickId) && Intrinsics.areEqual(this.utmSource, appCpsInfo.utmSource) && Intrinsics.areEqual(this.utmMedium, appCpsInfo.utmMedium) && Intrinsics.areEqual(this.utmCampaign, appCpsInfo.utmCampaign);
    }

    public AppCpsInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.clientId = str;
        this.clickId = str2;
        this.utmSource = str3;
        this.utmMedium = str4;
        this.utmCampaign = str5;
    }

    public static /* synthetic */ AppCpsInfo copy$default(AppCpsInfo appCpsInfo, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = appCpsInfo.clientId;
        }
        if ((i11 & 2) != 0) {
            str2 = appCpsInfo.clickId;
        }
        if ((i11 & 4) != 0) {
            str3 = appCpsInfo.utmSource;
        }
        if ((i11 & 8) != 0) {
            str4 = appCpsInfo.utmMedium;
        }
        if ((i11 & 16) != 0) {
            str5 = appCpsInfo.utmCampaign;
        }
        String str6 = str5;
        String str7 = str3;
        return appCpsInfo.copy(str, str2, str7, str4, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClickId() {
        return this.clickId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUtmSource() {
        return this.utmSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUtmMedium() {
        return this.utmMedium;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUtmCampaign() {
        return this.utmCampaign;
    }

    @NotNull
    public final AppCpsInfo copy(@Nullable String clientId, @Nullable String clickId, @Nullable String utmSource, @Nullable String utmMedium, @Nullable String utmCampaign) {
        return new AppCpsInfo(clientId, clickId, utmSource, utmMedium, utmCampaign);
    }

    @Nullable
    public final String getClickId() {
        return this.clickId;
    }

    @Nullable
    public final String getClientId() {
        return this.clientId;
    }

    @Nullable
    public final String getUtmCampaign() {
        return this.utmCampaign;
    }

    @Nullable
    public final String getUtmMedium() {
        return this.utmMedium;
    }

    @Nullable
    public final String getUtmSource() {
        return this.utmSource;
    }

    public int hashCode() {
        String str = this.clientId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clickId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.utmSource;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.utmMedium;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.utmCampaign;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AppCpsInfo(clientId=" + this.clientId + ", clickId=" + this.clickId + ", utmSource=" + this.utmSource + ", utmMedium=" + this.utmMedium + ", utmCampaign=" + this.utmCampaign + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.clientId;
        if (str != null) {
            writableMapCreateMap.putString("clientId", str.toString());
        }
        String str2 = this.clickId;
        if (str2 != null) {
            writableMapCreateMap.putString("clickId", str2.toString());
        }
        String str3 = this.utmSource;
        if (str3 != null) {
            writableMapCreateMap.putString("utmSource", str3.toString());
        }
        String str4 = this.utmMedium;
        if (str4 != null) {
            writableMapCreateMap.putString("utmMedium", str4.toString());
        }
        String str5 = this.utmCampaign;
        if (str5 != null) {
            writableMapCreateMap.putString("utmCampaign", str5.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ AppCpsInfo(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5);
    }
}
