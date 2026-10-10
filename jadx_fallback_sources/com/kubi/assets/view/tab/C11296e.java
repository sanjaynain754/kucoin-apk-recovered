package com.kubi.assets.view.tab;

/* JADX INFO: renamed from: com.kubi.assets.view.tab.e */
/* JADX INFO: compiled from: AssetTabSortHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0001\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0001¨\u0006\t"}, m90084d2 = {"getTabKey", "", "getAccountAssets", "Ljava/math/BigDecimal;", "data", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "isCustom", "", "toSortAccountName", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C11296e {
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: a */
    public static final java.math.BigDecimal m20094a(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable com.kubi.assets.entity.AssetV2OverviewEntity r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.hashCode()
            r1 = 0
            switch(r0) {
                case -1690185748: goto L133;
                case -1081309778: goto L101;
                case -1074038704: goto Leb;
                case -1010136971: goto Ld5;
                case -853258278: goto Lbd;
                case -503567600: goto La5;
                case -286932590: goto L8d;
                case 3029900: goto L75;
                case 3105752: goto L6b;
                case 3343801: goto L53;
                case 92909918: goto L3b;
                case 102410294: goto L31;
                case 108685930: goto L27;
                case 110621028: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto L13b
        Lf:
            java.lang.String r0 = "trade"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L19
            goto L13b
        L19:
            if (r3 == 0) goto L14a
            com.kubi.data.entity.AssetSingleEntity r2 = r3.getSpotAsset()
            if (r2 == 0) goto L14a
            java.math.BigDecimal r1 = r2.getTotalBalance()
            goto L14a
        L27:
            java.lang.String r0 = "robot"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7f
            goto L13b
        L31:
            java.lang.String r0 = "kumex"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Laf
            goto L13b
        L3b:
            java.lang.String r0 = "alpha"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L45
            goto L13b
        L45:
            if (r3 == 0) goto L14a
            com.kubi.assets.entity.CommonAccountEntity r2 = r3.getAlphaAsset()
            if (r2 == 0) goto L14a
            java.math.BigDecimal r1 = r2.getTotalBalance()
            goto L14a
        L53:
            java.lang.String r0 = "main"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5d
            goto L13b
        L5d:
            if (r3 == 0) goto L14a
            com.kubi.data.entity.AssetSingleEntity r2 = r3.getMainAsset()
            if (r2 == 0) goto L14a
            java.math.BigDecimal r1 = r2.getTotalBalance()
            goto L14a
        L6b:
            java.lang.String r0 = "earn"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lc7
            goto L13b
        L75:
            java.lang.String r0 = "bots"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7f
            goto L13b
        L7f:
            if (r3 == 0) goto L14a
            com.kubi.data.entity.SubAssetEntity r2 = r3.getRobotAsset()
            if (r2 == 0) goto L14a
            java.math.BigDecimal r1 = r2.getTotalBalance()
            goto L14a
        L8d:
            java.lang.String r0 = "unified"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L97
            goto L13b
        L97:
            if (r3 == 0) goto L14a
            com.kubi.data.entity.UnifiedAssetEntity r2 = r3.getUnifiedAsset()
            if (r2 == 0) goto L14a
            java.math.BigDecimal r1 = r2.getTotalBalance()
            goto L14a
        La5:
            java.lang.String r0 = "futures"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Laf
            goto L13b
        Laf:
            if (r3 == 0) goto L14a
            com.kubi.assets.entity.EquityEntity r2 = r3.getFutureAsset()
            if (r2 == 0) goto L14a
            java.math.BigDecimal r1 = r2.getTotalEquity()
            goto L14a
        Lbd:
            java.lang.String r0 = "finance"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lc7
            goto L13b
        Lc7:
            if (r3 == 0) goto L14a
            com.kubi.assets.entity.EarnBalance r2 = r3.getFinanceAsset()
            if (r2 == 0) goto L14a
            java.math.BigDecimal r1 = r2.getTotalValue()
            goto L14a
        Ld5:
            java.lang.String r0 = "option"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lde
            goto L13b
        Lde:
            if (r3 == 0) goto L14a
            com.kubi.assets.entity.CommonAccountEntity r2 = r3.getOptionsAsset()
            if (r2 == 0) goto L14a
            java.math.BigDecimal r1 = r2.getTotalBalance()
            goto L14a
        Leb:
            java.lang.String r0 = "mining"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lf4
            goto L13b
        Lf4:
            if (r3 == 0) goto L14a
            com.kubi.assets.entity.CommonAccountEntity r2 = r3.getMiningAsset()
            if (r2 == 0) goto L14a
            java.math.BigDecimal r1 = r2.getTotalBalance()
            goto L14a
        L101:
            java.lang.String r0 = "margin"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L10a
            goto L13b
        L10a:
            if (r3 == 0) goto L14a
            com.kubi.margin.api.entity.LeverBalance r2 = r3.getCrossMarginAsset()
            if (r2 == 0) goto L14a
            java.math.BigDecimal r2 = r2.getTotalBalance()
            if (r2 == 0) goto L14a
            com.kubi.margin.api.entity.IsolateMarginPosition r3 = r3.getIsolatedMarginAsset()
            if (r3 == 0) goto L124
            java.math.BigDecimal r3 = r3.getTotalBalance()
            if (r3 != 0) goto L126
        L124:
            java.math.BigDecimal r3 = java.math.BigDecimal.ZERO
        L126:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.math.BigDecimal r1 = r2.add(r3)
            java.lang.String r2 = "add(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            goto L14a
        L133:
            java.lang.String r0 = "copyTrading"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L13e
        L13b:
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO
            goto L14a
        L13e:
            if (r3 == 0) goto L14a
            com.kubi.data.entity.SubAssetEntity r2 = r3.getCopyTradingAsset()
            if (r2 == 0) goto L14a
            java.math.BigDecimal r1 = r2.getTotalBalance()
        L14a:
            if (r1 != 0) goto L154
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO
            java.lang.String r3 = "ZERO"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
        L154:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: b */
    public static final java.lang.String m20095b(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1690185748: goto L79;
                case -1081309778: goto L6f;
                case -1074038704: goto L65;
                case -1010136971: goto L5b;
                case -286932590: goto L51;
                case 3105752: goto L45;
                case 3343801: goto L3b;
                case 92909918: goto L31;
                case 102410294: goto L25;
                case 108685930: goto L19;
                case 110621028: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L81
        Le:
            java.lang.String r0 = "trade"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L18
            goto L81
        L18:
            return r0
        L19:
            java.lang.String r0 = "robot"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L22
            goto L81
        L22:
            java.lang.String r1 = "bots"
            return r1
        L25:
            java.lang.String r0 = "kumex"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2e
            goto L81
        L2e:
            java.lang.String r1 = "futures"
            return r1
        L31:
            java.lang.String r0 = "alpha"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L3a
            goto L81
        L3a:
            return r0
        L3b:
            java.lang.String r0 = "main"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L44
            goto L81
        L44:
            return r0
        L45:
            java.lang.String r0 = "earn"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4e
            goto L81
        L4e:
            java.lang.String r1 = "finance"
            return r1
        L51:
            java.lang.String r0 = "unified"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5a
            goto L81
        L5a:
            return r0
        L5b:
            java.lang.String r0 = "option"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L64
            goto L81
        L64:
            return r0
        L65:
            java.lang.String r0 = "mining"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            goto L81
        L6e:
            return r0
        L6f:
            java.lang.String r0 = "margin"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L78
            goto L81
        L78:
            return r0
        L79:
            java.lang.String r0 = "copyTrading"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L84
        L81:
            java.lang.String r1 = "UNKNOWN"
            return r1
        L84:
            return r0
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m20096c(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "MANUAL"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: d */
    public static final java.lang.String m20097d(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.hashCode()
            r1 = 0
            switch(r0) {
                case -1690185748: goto Le0;
                case -1081309778: goto Lcc;
                case -1074038704: goto Lb8;
                case -1010136971: goto La4;
                case -286932590: goto L90;
                case 3105752: goto L78;
                case 3343801: goto L63;
                case 92909918: goto L4e;
                case 102410294: goto L39;
                case 108685930: goto L24;
                case 110621028: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto Le8
        Lf:
            java.lang.String r0 = "trade"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L19
            goto Le8
        L19:
            com.kubi.utils.c r2 = com.kubi.utils.C27017c.f54310a
            int r0 = com.kubi.assets.R$string.trading
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.m66516f(r0, r1)
            return r2
        L24:
            java.lang.String r0 = "robot"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2e
            goto Le8
        L2e:
            com.kubi.utils.c r2 = com.kubi.utils.C27017c.f54310a
            int r0 = com.kubi.assets.R$string.kc_tb_asset_bot
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.m66516f(r0, r1)
            return r2
        L39:
            java.lang.String r0 = "kumex"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L43
            goto Le8
        L43:
            com.kubi.utils.c r2 = com.kubi.utils.C27017c.f54310a
            int r0 = com.kubi.assets.R$string.futures
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.m66516f(r0, r1)
            return r2
        L4e:
            java.lang.String r0 = "alpha"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L58
            goto Le8
        L58:
            com.kubi.utils.c r2 = com.kubi.utils.C27017c.f54310a
            int r0 = com.kubi.assets.R$string.asset_alpha_title
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.m66516f(r0, r1)
            return r2
        L63:
            java.lang.String r0 = "main"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6d
            goto Le8
        L6d:
            com.kubi.utils.c r2 = com.kubi.utils.C27017c.f54310a
            int r0 = com.kubi.assets.R$string.save_account_label
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.m66516f(r0, r1)
            return r2
        L78:
            java.lang.String r0 = "earn"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L81
            goto Le8
        L81:
            com.kubi.utils.c r2 = com.kubi.utils.C27017c.f54310a
            com.kubi.data.coin.AccountType r0 = com.kubi.data.coin.AccountType.FINANCE
            int r0 = r0.getNickNameRes()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.m66516f(r0, r1)
            return r2
        L90:
            java.lang.String r0 = "unified"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L99
            goto Le8
        L99:
            com.kubi.utils.c r2 = com.kubi.utils.C27017c.f54310a
            int r0 = com.kubi.assets.R$string.kc_unify_account
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.m66516f(r0, r1)
            return r2
        La4:
            java.lang.String r0 = "option"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lad
            goto Le8
        Lad:
            com.kubi.utils.c r2 = com.kubi.utils.C27017c.f54310a
            int r0 = com.kubi.assets.R$string.kc_options_title
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.m66516f(r0, r1)
            return r2
        Lb8:
            java.lang.String r0 = "mining"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lc1
            goto Le8
        Lc1:
            com.kubi.utils.c r2 = com.kubi.utils.C27017c.f54310a
            int r0 = com.kubi.assets.R$string.kc_account_name_mining
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.m66516f(r0, r1)
            return r2
        Lcc:
            java.lang.String r0 = "margin"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Ld5
            goto Le8
        Ld5:
            com.kubi.utils.c r2 = com.kubi.utils.C27017c.f54310a
            int r0 = com.kubi.assets.R$string.lever_margin
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.m66516f(r0, r1)
            return r2
        Le0:
            java.lang.String r0 = "copyTrading"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lf3
        Le8:
            com.kubi.utils.c r2 = com.kubi.utils.C27017c.f54310a
            int r0 = com.kubi.assets.R$string.deposit_other_account
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.m66516f(r0, r1)
            return r2
        Lf3:
            com.kubi.utils.c r2 = com.kubi.utils.C27017c.f54310a
            int r0 = com.kubi.assets.R$string.copytd_copy_trading
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.m66516f(r0, r1)
            return r2
    }
}
