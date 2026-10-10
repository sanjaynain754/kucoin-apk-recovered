package com.kubi.sdk.site;

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
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/site/SiteBizConfigKey;", "", "configKey", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getConfigKey", "()Ljava/lang/String;", "None", "SpotLiquidity", "ContractLiquidity", "RebateRange", "IsAllowedMultilevelRebate", "QuoteCurrency", "ShieldCurrency", "CustomParam", "DefaultLanguage", "Companion", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum SiteBizConfigKey {
    None("none"),
    SpotLiquidity("spot_liquidity"),
    ContractLiquidity("contract_liquidity"),
    RebateRange("rebate_range"),
    IsAllowedMultilevelRebate("is_allowed_multilevel_rebate"),
    QuoteCurrency("quote_currency"),
    ShieldCurrency("shield_currency"),
    CustomParam("custom_param"),
    DefaultLanguage("default_language");


    @NotNull
    private final String configKey;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f47790c = EnumEntriesKt.enumEntries(m57978a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: SiteConfigKey.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/site/SiteBizConfigKey$Companion;", "", "<init>", "()V", "tryParse", "Lcom/kubi/sdk/site/SiteBizConfigKey;", "configKey", "", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSiteConfigKey.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteConfigKey.kt\ncom/kubi/sdk/site/SiteBizConfigKey$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SiteConfigIssue.kt\ncom/kubi/sdk/site/issue/SiteConfigIssueKt\n*L\n1#1,540:1\n295#2,2:541\n48#3,2:543\n*S KotlinDebug\n*F\n+ 1 SiteConfigKey.kt\ncom/kubi/sdk/site/SiteBizConfigKey$Companion\n*L\n475#1:541,2\n477#1:543,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final SiteBizConfigKey tryParse(@NotNull String configKey) {
            SiteBizConfigKey next;
            Intrinsics.checkNotNullParameter(configKey, "configKey");
            Iterator<SiteBizConfigKey> it = SiteBizConfigKey.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next.getConfigKey(), configKey));
            SiteBizConfigKey siteBizConfigKey = next;
            if (siteBizConfigKey != null) {
                return siteBizConfigKey;
            }
            C43846g.m96568c(new SiteConfigMessage("SiteBizConfigKey", "SiteBizConfigKey: " + configKey, false, 4, null), null, 2, null);
            return SiteBizConfigKey.None;
        }
    }

    @NotNull
    public static EnumEntries<SiteBizConfigKey> getEntries() {
        return f47790c;
    }

    @NotNull
    public final String getConfigKey() {
        return this.configKey;
    }

    SiteBizConfigKey(String str) {
        this.configKey = str;
    }
}
