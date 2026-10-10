package com.kubi.sdk.site;

import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.kubi.sdk.site.issue.SiteConfigMessage;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SiteConfigKey.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001aB!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/site/SiteExtConfigKey;", "", "configType", "", "configKey", ReactTextInputShadowNode.PROP_PLACEHOLDER, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getConfigType", "()Ljava/lang/String;", "getConfigKey", "getPlaceholder", "()I", "None", "LogoGeneralGreenPng", "LogoGeneralWhitePng", "LogoGeneralGrayPng", "LogoGeneralBlackPng", "LogoSmallPng", "LogoBigGreenPng", "LogoBigGrayPng", "LogoFuturePng", "LogoCollegePng", "LogoOrganWhitePng", "LogoOrganBlackPng", "Companion", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum SiteExtConfigKey {
    None("none", "none", 0),
    LogoGeneralGreenPng("LOGO_URL", "logo_general_green_png", com.kubi.sdk.site.config.R$mipmap.ic_logo_general_green_png),
    LogoGeneralWhitePng("LOGO_URL", "logo_general_white_png", com.kubi.sdk.site.config.R$mipmap.ic_logo_general_white_png),
    LogoGeneralGrayPng("LOGO_URL", "logo_general_gray_png", com.kubi.sdk.site.config.R$mipmap.ic_logo_general_gray_png),
    LogoGeneralBlackPng("LOGO_URL", "logo_general_black_png", com.kubi.sdk.site.config.R$mipmap.ic_logo_general_black_png),
    LogoSmallPng("LOGO_URL", "logo_small_png", com.kubi.sdk.site.config.R$mipmap.ic_logo_small_png),
    LogoBigGreenPng("LOGO_URL", "logo_big_green_png", com.kubi.sdk.site.config.R$mipmap.ic_logo_big_green_png),
    LogoBigGrayPng("LOGO_URL", "logo_big_gray_png", com.kubi.sdk.site.config.R$mipmap.ic_logo_big_gray_png),
    LogoFuturePng("LOGO_URL", "logo_future_png", com.kubi.sdk.site.config.R$mipmap.ic_logo_future_png),
    LogoCollegePng("LOGO_URL", "logo_college_png", com.kubi.sdk.site.config.R$mipmap.ic_logo_college_png),
    LogoOrganWhitePng("LOGO_URL", "logo_organ_white_png", com.kubi.sdk.site.config.R$mipmap.ic_logo_organ_white_png),
    LogoOrganBlackPng("LOGO_URL", "logo_organ_black_png", com.kubi.sdk.site.config.R$mipmap.ic_logo_organ_black_png);


    @NotNull
    private final String configKey;

    @NotNull
    private final String configType;
    private final int placeholder;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f47792c = EnumEntriesKt.enumEntries(m57979a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: SiteConfigKey.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/site/SiteExtConfigKey$Companion;", "", "<init>", "()V", "tryParse", "Lcom/kubi/sdk/site/SiteExtConfigKey;", "configType", "", "configKey", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSiteConfigKey.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteConfigKey.kt\ncom/kubi/sdk/site/SiteExtConfigKey$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SiteConfigIssue.kt\ncom/kubi/sdk/site/issue/SiteConfigIssueKt\n*L\n1#1,540:1\n295#2,2:541\n48#3,2:543\n*S KotlinDebug\n*F\n+ 1 SiteConfigKey.kt\ncom/kubi/sdk/site/SiteExtConfigKey$Companion\n*L\n526#1:541,2\n528#1:543,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final SiteExtConfigKey tryParse(@NotNull String configType, @NotNull String configKey) {
            SiteExtConfigKey next;
            Intrinsics.checkNotNullParameter(configType, "configType");
            Intrinsics.checkNotNullParameter(configKey, "configKey");
            Iterator<SiteExtConfigKey> it = SiteExtConfigKey.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                SiteExtConfigKey siteExtConfigKey = next;
                if (Intrinsics.areEqual(siteExtConfigKey.getConfigType(), configType) && Intrinsics.areEqual(siteExtConfigKey.getConfigKey(), configKey)) {
                    break;
                }
            }
            SiteExtConfigKey siteExtConfigKey2 = next;
            if (siteExtConfigKey2 != null) {
                return siteExtConfigKey2;
            }
            C43846g.m96568c(new SiteConfigMessage("SiteExtConfigKey", "未找到SiteExtConfigKey: " + configType + '-' + configKey, false, 4, null), null, 2, null);
            return SiteExtConfigKey.None;
        }
    }

    @NotNull
    public static EnumEntries<SiteExtConfigKey> getEntries() {
        return f47792c;
    }

    @NotNull
    public final String getConfigKey() {
        return this.configKey;
    }

    @NotNull
    public final String getConfigType() {
        return this.configType;
    }

    public final int getPlaceholder() {
        return this.placeholder;
    }

    SiteExtConfigKey(String str, String str2, int i11) {
        this.configType = str;
        this.configKey = str2;
        this.placeholder = i11;
    }
}
