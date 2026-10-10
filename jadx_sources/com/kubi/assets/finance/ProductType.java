package com.kubi.assets.finance;

import com.kubi.assets.R$layout;
import com.kubi.assets.entity.EarnAccountItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DEMAND' uses external variables
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
/* JADX INFO: compiled from: ProductModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/finance/ProductType;", "", "layoutResId", "", "<init>", "(Ljava/lang/String;II)V", "getLayoutResId", "()I", "DEMAND", "STAKING", "ACTIVITY", "LOCKDROP", "POLKA_FUND", "ETH2", "NFT", "DUAL", "SHARKFIN", EarnAccountItem.TYPE_TWIN_WIN, EarnAccountItem.TYPE_FUTURE_PLUS, "PROTECTIVE_EARN", "CONVERT_PLUS", "KCS_STAKING", "DUAL_EXTRA", "DUAL_BOOSTER", "RANGE_BOUND", "LENDING", "DISCOUNT_BUY", "LOAN_PLEDGE", "UNKNOWN", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ProductType {
    public static final ProductType ACTIVITY;
    public static final ProductType CONVERT_PLUS;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ProductType DEMAND;
    public static final ProductType DISCOUNT_BUY;
    public static final ProductType DUAL;
    public static final ProductType DUAL_BOOSTER;
    public static final ProductType DUAL_EXTRA;
    public static final ProductType ETH2;
    public static final ProductType FUTURE_PLUS;
    public static final ProductType KCS_STAKING;
    public static final ProductType LENDING;
    public static final ProductType LOAN_PLEDGE;
    public static final ProductType LOCKDROP;
    public static final ProductType NFT;
    public static final ProductType POLKA_FUND;
    public static final ProductType PROTECTIVE_EARN;
    public static final ProductType RANGE_BOUND;
    public static final ProductType SHARKFIN;
    public static final ProductType STAKING;
    public static final ProductType TWIN_WIN;
    public static final ProductType UNKNOWN;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ProductType[] f17407b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f17408c;
    private final int layoutResId;

    /* JADX INFO: compiled from: ProductModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/finance/ProductType$Companion;", "", "<init>", "()V", "fromCategory", "Lcom/kubi/assets/finance/ProductType;", "category", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nProductModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductModel.kt\ncom/kubi/assets/finance/ProductType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001c  */
        /* JADX WARN: Code duplicated, block: B:12:0x001f A[RETURN] */
        @NotNull
        public final ProductType fromCategory(@Nullable String category) {
            for (ProductType productType : ProductType.values()) {
                if (StringsKt.equals(productType.name(), category, true)) {
                    if (productType == null) {
                        return ProductType.UNKNOWN;
                    }
                    return productType;
                }
            }
            productType = null;
            if (productType == null) {
                return ProductType.UNKNOWN;
            }
            return productType;
        }
    }

    static {
        int i11 = R$layout.asset_item_finance_coin_demand;
        DEMAND = new ProductType("DEMAND", 0, i11);
        int i12 = R$layout.asset_item_finance_coin_staking;
        STAKING = new ProductType("STAKING", 1, i12);
        ACTIVITY = new ProductType("ACTIVITY", 2, R$layout.asset_item_finance_coin_activity);
        int i13 = R$layout.asset_item_finance_coin_common;
        LOCKDROP = new ProductType("LOCKDROP", 3, i13);
        POLKA_FUND = new ProductType("POLKA_FUND", 4, R$layout.asset_item_finance_coin_polka_fund);
        ETH2 = new ProductType("ETH2", 5, i12);
        NFT = new ProductType("NFT", 6, i13);
        DUAL = new ProductType("DUAL", 7, i13);
        SHARKFIN = new ProductType("SHARKFIN", 8, i13);
        int i14 = R$layout.asset_item_finance_coin_twin_win;
        TWIN_WIN = new ProductType(EarnAccountItem.TYPE_TWIN_WIN, 9, i14);
        FUTURE_PLUS = new ProductType(EarnAccountItem.TYPE_FUTURE_PLUS, 10, i14);
        PROTECTIVE_EARN = new ProductType("PROTECTIVE_EARN", 11, i13);
        CONVERT_PLUS = new ProductType("CONVERT_PLUS", 12, i13);
        KCS_STAKING = new ProductType("KCS_STAKING", 13, i12);
        DUAL_EXTRA = new ProductType("DUAL_EXTRA", 14, i13);
        DUAL_BOOSTER = new ProductType("DUAL_BOOSTER", 15, i13);
        RANGE_BOUND = new ProductType("RANGE_BOUND", 16, i13);
        LENDING = new ProductType("LENDING", 17, i11);
        DISCOUNT_BUY = new ProductType("DISCOUNT_BUY", 18, R$layout.asset_item_finance_coin_buydiscount);
        LOAN_PLEDGE = new ProductType("LOAN_PLEDGE", 19, i11);
        UNKNOWN = new ProductType("UNKNOWN", 20, i13);
        ProductType[] productTypeArrM16750a = m16750a();
        f17407b = productTypeArrM16750a;
        f17408c = EnumEntriesKt.enumEntries(productTypeArrM16750a);
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ProductType[] m16750a() {
        return new ProductType[]{DEMAND, STAKING, ACTIVITY, LOCKDROP, POLKA_FUND, ETH2, NFT, DUAL, SHARKFIN, TWIN_WIN, FUTURE_PLUS, PROTECTIVE_EARN, CONVERT_PLUS, KCS_STAKING, DUAL_EXTRA, DUAL_BOOSTER, RANGE_BOUND, LENDING, DISCOUNT_BUY, LOAN_PLEDGE, UNKNOWN};
    }

    @NotNull
    public static EnumEntries<ProductType> getEntries() {
        return f17408c;
    }

    public static ProductType valueOf(String str) {
        return (ProductType) Enum.valueOf(ProductType.class, str);
    }

    public static ProductType[] values() {
        return (ProductType[]) f17407b.clone();
    }

    public final int getLayoutResId() {
        return this.layoutResId;
    }

    public ProductType(String str, int i11, int i12) {
        super(str, i11);
        this.layoutResId = i12;
    }
}
