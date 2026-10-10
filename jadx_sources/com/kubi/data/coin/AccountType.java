package com.kubi.data.coin;

import com.kubi.app.router.R$string;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p368jf.InterfaceC40398a;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'FINANCE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: TransferType.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006!"}, m90084d2 = {"Lcom/kubi/data/coin/AccountType;", "", "strRes", "", "nickNameRes", "colorString", "", "supportTransfer", "", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Z)V", "getStrRes", "()I", "getNickNameRes", "getColorString", "()Ljava/lang/String;", "getSupportTransfer", "()Z", "MAIN", "TRADE", "UNIFIED", "CONTRACT", "MARGIN", SharedPositionInfo.MARGIN_MODE_ISOLATED, "FINANCE", "SAVINGS", "SUB", "TRADE_HF", "OPTION", "LEVER", "MINING", "UNKNOWN", "Companion", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTransferType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferType.kt\ncom/kubi/data/coin/AccountType\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,68:1\n17#2,2:69\n17#2,2:71\n17#2,2:73\n17#2,2:75\n*S KotlinDebug\n*F\n+ 1 TransferType.kt\ncom/kubi/data/coin/AccountType\n*L\n36#1:69,2\n39#1:71,2\n44#1:73,2\n47#1:75,2\n*E\n"})
public final class AccountType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AccountType FINANCE;
    public static final AccountType LEVER;
    public static final AccountType MINING;
    public static final AccountType OPTION;
    public static final AccountType SAVINGS;
    public static final AccountType SUB;
    public static final AccountType TRADE_HF;
    public static final AccountType UNKNOWN;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AccountType[] f21417b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f21418c;

    @NotNull
    private final String colorString;
    private final int nickNameRes;
    private final int strRes;
    private final boolean supportTransfer;
    public static final AccountType MAIN = new AccountType("MAIN", 0, R$string.save_account, R$string.save_account_label, "#18BB97", true);
    public static final AccountType TRADE = new AccountType("TRADE", 1, R$string.trade_account, R$string.trading, "#5C95E8", true);
    public static final AccountType UNIFIED = new AccountType("UNIFIED", 2, R$string.kc_unify_account, R$string.title_unify_trading, "#929DBC", true);
    public static final AccountType CONTRACT = new AccountType("CONTRACT", 3, R$string.futures_account, R$string.futures, "#72948A", true);
    public static final AccountType MARGIN = new AccountType("MARGIN", 4, R$string.margin_whole_account, R$string.margin_whole, "#7A78E4", true);
    public static final AccountType ISOLATED = new AccountType(SharedPositionInfo.MARGIN_MODE_ISOLATED, 5, R$string.margin_single_account, R$string.margin_single, "#7B78E3", true);

    /* JADX INFO: compiled from: TransferType.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/data/coin/AccountType$Companion;", "", "<init>", "()V", "ofName", "Lcom/kubi/data/coin/AccountType;", "name", "", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTransferType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferType.kt\ncom/kubi/data/coin/AccountType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final AccountType ofName(@Nullable String name) {
            AccountType[] accountTypeArrValues = AccountType.values();
            int length = accountTypeArrValues.length - 1;
            if (length < 0) {
                return null;
            }
            while (true) {
                int i11 = length - 1;
                AccountType accountType = accountTypeArrValues[length];
                if (Intrinsics.areEqual(accountType.name(), name)) {
                    return accountType;
                }
                if (i11 >= 0) {
                    length = i11;
                } else {
                    return null;
                }
            }
        }
    }

    static {
        Router router = Router.f46192a;
        SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
        Object objM56186h = router.m56186h(InterfaceC40398a.class, siteInfoManager.m58109c());
        int iMo89025a = objM56186h != null ? ((InterfaceC40398a) objM56186h).mo89025a() : R$string.kc_asset_earn_account;
        Object objM56186h2 = router.m56186h(InterfaceC40398a.class, siteInfoManager.m58109c());
        FINANCE = new AccountType("FINANCE", 6, iMo89025a, objM56186h2 != null ? ((InterfaceC40398a) objM56186h2).mo89026b() : R$string.kc_asset_earn, "#8CB2C0", false);
        Object objM56186h3 = router.m56186h(InterfaceC40398a.class, siteInfoManager.m58109c());
        int iMo89025a2 = objM56186h3 != null ? ((InterfaceC40398a) objM56186h3).mo89025a() : R$string.kc_asset_earn_account;
        Object objM56186h4 = router.m56186h(InterfaceC40398a.class, siteInfoManager.m58109c());
        SAVINGS = new AccountType("SAVINGS", 7, iMo89025a2, objM56186h4 != null ? ((InterfaceC40398a) objM56186h4).mo89026b() : R$string.kc_asset_earn, "#8CB2C0", true);
        int i11 = R$string.sub_account;
        SUB = new AccountType("SUB", 8, i11, i11, "#929DBC", false);
        TRADE_HF = new AccountType("TRADE_HF", 9, R$string.deposit_account_high, R$string.pro_account_name, "#929DBC", false);
        OPTION = new AccountType("OPTION", 10, R$string.kc_options_account, R$string.kc_options_title, "#929DBC", true);
        LEVER = new AccountType("LEVER", 11, R$string.lever_account, R$string.lever, "#929DBC", false);
        int i12 = R$string.kc_account_name_mining;
        MINING = new AccountType("MINING", 12, i12, i12, "#929DBC", false);
        int i13 = R$string.deposit_other_account;
        UNKNOWN = new AccountType("UNKNOWN", 13, i13, i13, "#929DBC", false);
        AccountType[] accountTypeArrM23479a = m23479a();
        f21417b = accountTypeArrM23479a;
        f21418c = EnumEntriesKt.enumEntries(accountTypeArrM23479a);
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AccountType[] m23479a() {
        return new AccountType[]{MAIN, TRADE, UNIFIED, CONTRACT, MARGIN, ISOLATED, FINANCE, SAVINGS, SUB, TRADE_HF, OPTION, LEVER, MINING, UNKNOWN};
    }

    @NotNull
    public static EnumEntries<AccountType> getEntries() {
        return f21418c;
    }

    public static AccountType valueOf(String str) {
        return (AccountType) Enum.valueOf(AccountType.class, str);
    }

    public static AccountType[] values() {
        return (AccountType[]) f21417b.clone();
    }

    @NotNull
    public final String getColorString() {
        return this.colorString;
    }

    public final int getNickNameRes() {
        return this.nickNameRes;
    }

    public final int getStrRes() {
        return this.strRes;
    }

    public final boolean getSupportTransfer() {
        return this.supportTransfer;
    }

    public AccountType(String str, int i11, int i12, int i13, String str2, boolean z11) {
        super(str, i11);
        this.strRes = i12;
        this.nickNameRes = i13;
        this.colorString = str2;
        this.supportTransfer = z11;
    }
}
