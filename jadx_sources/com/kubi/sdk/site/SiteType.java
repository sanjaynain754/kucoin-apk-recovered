package com.kubi.sdk.site;

import com.kubi.sdk.site.info.SiteInfoManager;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SiteType.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/site/SiteType;", "", "siteType", "", "isShared", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getSiteType", "()Ljava/lang/String;", "()Z", "Turkey", "Thailand", "Global", "Australia", "Europe", "EuropeStaging", "Hongkong", "Demo", "toString", "Companion", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum SiteType {
    Turkey(TURKEY_NAME, false),
    Thailand(THAILAND_NAME, false),
    Global("global", true),
    Australia(AUSTRALIA_NAME, true),
    Europe(EUROPE_NAME, true),
    EuropeStaging(EUROPE_STAGING_NAME, true),
    Hongkong("hongkong", true),
    Demo(DEMO_NAME, true);


    @NotNull
    public static final String AUSTRALIA_NAME = "australia";

    @NotNull
    public static final String DEMO_NAME = "demo";

    @NotNull
    public static final String EUROPE_NAME = "europe";

    @NotNull
    public static final String EUROPE_STAGING_NAME = "eustaging";

    @NotNull
    public static final String GLOBAL_NAME = "global";

    @NotNull
    public static final String THAILAND_NAME = "thailand";

    @NotNull
    public static final String TURKEY_NAME = "turkey";
    private final boolean isShared;

    @NotNull
    private final String siteType;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f47822c = EnumEntriesKt.enumEntries(m58026a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: SiteType.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/site/SiteType$Companion;", "", "<init>", "()V", "THAILAND_NAME", "", "TURKEY_NAME", "GLOBAL_NAME", "EUROPE_NAME", "EUROPE_STAGING_NAME", "AUSTRALIA_NAME", "DEMO_NAME", "currentSiteType", "getCurrentSiteType", "()Ljava/lang/String;", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final String getCurrentSiteType() {
            return SiteInfoManager.f47913a.m58109c();
        }
    }

    @NotNull
    public static EnumEntries<SiteType> getEntries() {
        return f47822c;
    }

    @NotNull
    public final String getSiteType() {
        return this.siteType;
    }

    /* JADX INFO: renamed from: isShared, reason: from getter */
    public final boolean getIsShared() {
        return this.isShared;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.siteType;
    }

    SiteType(String str, boolean z11) {
        this.siteType = str;
        this.isShared = z11;
    }
}
