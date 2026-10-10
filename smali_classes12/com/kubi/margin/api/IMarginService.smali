.class public interface abstract Lcom/kubi/margin/api/IMarginService;
.super Ljava/lang/Object;
.source "IMarginService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/margin/api/IMarginService$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008g\u0018\u0000 \u00bc\u00012\u00020\u0001:\u0002\u00bc\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0008\u0010\u0004\u001a\u00020\u0003H&J\u0008\u0010\u0005\u001a\u00020\u0003H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J&\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH&J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000bH&\u00a2\u0006\u0002\u0010\u0012J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH&J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH&J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH&J\n\u0010\u001a\u001a\u0004\u0018\u00010\u000bH&J\u0008\u0010\u001b\u001a\u00020\u001cH&J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u000e\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0 H&J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH&J\u001e\u0010!\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\"0\r2\u0006\u0010#\u001a\u00020\u000bH&J\u001a\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\tH&J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+H&J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+H&J\u0012\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010*\u001a\u00020+H&J\u0008\u0010/\u001a\u000200H&J!\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\r2\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\tH&\u00a2\u0006\u0002\u00104J\u001a\u00105\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u001a\u00106\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0012\u00107\u001a\u0004\u0018\u0001082\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0016\u00109\u001a\u0008\u0012\u0004\u0012\u0002080\r2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H&J\"\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020?0 0\"0\r2\u0006\u0010\u0017\u001a\u00020\u000bH&J\u0016\u0010@\u001a\u0008\u0012\u0004\u0012\u00020?0 2\u0006\u0010\u0017\u001a\u00020\u000bH&J\u001c\u0010A\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\"0\r2\u0006\u0010B\u001a\u00020\tH&J$\u0010C\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\"0\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\tH&J\u001c\u0010D\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020E0\"0\r2\u0006\u0010\u0017\u001a\u00020\u000bH&J\u0010\u0010F\u001a\u00020E2\u0006\u0010\u0017\u001a\u00020\u000bH&J\u0014\u0010G\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020H0\"0\rH&J\u0008\u0010I\u001a\u00020HH&J$\u0010J\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020K0\"0\r2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0010\u0010L\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\'H&J\u0014\u0010N\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020O0\"0\rH&J\u0014\u0010P\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Q0\"0\rH&J/\u0010R\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002080\"0\r2\u0008\u0010S\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010T\u001a\u0004\u0018\u00010\tH&\u00a2\u0006\u0002\u0010UJ#\u0010V\u001a\u0002082\u0008\u0010S\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010T\u001a\u0004\u0018\u00010\tH&\u00a2\u0006\u0002\u0010WJ \u0010X\u001a\u0008\u0012\u0004\u0012\u00020Y0 2\u0010\u0008\u0001\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0 H&J/\u0010[\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020E0]j\u0008\u0012\u0004\u0012\u00020E`^0\\2\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\tH&\u00a2\u0006\u0002\u0010_J\u0008\u0010`\u001a\u00020=H&J\u0008\u0010a\u001a\u00020=H&J\u0008\u0010b\u001a\u00020\u000bH&J\u0008\u0010c\u001a\u00020\u000bH&J\u0010\u0010d\u001a\u00020\'2\u0006\u0010<\u001a\u00020=H&J\u0010\u0010e\u001a\u00020\t2\u0006\u0010<\u001a\u00020=H&J\u0010\u0010f\u001a\u00020;2\u0006\u0010<\u001a\u00020=H&J\u0008\u0010g\u001a\u00020;H&J\u001a\u0010h\u001a\u00020;2\u0006\u0010i\u001a\u00020j2\u0008\u0010k\u001a\u0004\u0018\u00010\u000bH&J\u001a\u0010l\u001a\u00020;2\u0006\u0010i\u001a\u00020j2\u0008\u0010k\u001a\u0004\u0018\u00010\u000bH&J.\u0010m\u001a\u00020;2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010n\u001a\u00020\t2\u0008\u0008\u0002\u0010o\u001a\u00020\t2\n\u0008\u0002\u0010p\u001a\u0004\u0018\u00010\u000bH&Jn\u0010q\u001a\u00020;2\u0008\u0010r\u001a\u0004\u0018\u00010s2\u0006\u0010<\u001a\u00020=2\u0006\u0010t\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020\u000b2\u0008\u0010x\u001a\u0004\u0018\u00010+2\u0008\u0010y\u001a\u0004\u0018\u00010\u00072\u0008\u0010z\u001a\u0004\u0018\u00010\u00072\u0006\u0010{\u001a\u00020\t2\n\u0008\u0002\u0010|\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010}\u001a\u00020\tH&J1\u0010~\u001a\u00020;2\u0008\u0010r\u001a\u0004\u0018\u00010s2\u0006\u0010<\u001a\u00020=2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u00012\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001H&J(\u0010\u0082\u0001\u001a\u00020;2\u0008\u0010r\u001a\u0004\u0018\u00010s2\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u000bH&J\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\t2\u0008\u0010r\u001a\u0004\u0018\u00010sH&\u00a2\u0006\u0003\u0010\u0087\u0001J\t\u0010\u0088\u0001\u001a\u00020;H&J\u001b\u0010\u0089\u0001\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0008\u0010r\u001a\u0004\u0018\u00010sH&J\'\u0010\u008a\u0001\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0008\u0010r\u001a\u0004\u0018\u00010s2\n\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008c\u0001H&J\t\u0010\u008d\u0001\u001a\u00020\tH&J\u0011\u0010\u008e\u0001\u001a\u0002002\u0006\u0010k\u001a\u00020\u000bH&J\u0013\u0010\u008f\u0001\u001a\u00020\t2\u0008\u0010<\u001a\u0004\u0018\u000100H&J0\u0010\u0090\u0001\u001a\u00020;2\u0007\u0010\u0091\u0001\u001a\u00020=2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0007\u0010\u0092\u0001\u001a\u00020\u000b2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000bH&JA\u0010\u0094\u0001\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0007\u0010\u0092\u0001\u001a\u00020\u000b2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\u0095\u0001\u001a\u000c\u0012\u0007\u0012\u0005\u0018\u00010\u0097\u00010\u0096\u0001H&J4\u0010\u0098\u0001\u001a\u00020;2\u0008\u0010\u0099\u0001\u001a\u00030\u009a\u00012\u0008\u0010\u009b\u0001\u001a\u00030\u009c\u00012\u0008\u0010\u0010\u001a\u0004\u0018\u00010+2\u000b\u0008\u0002\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u000bH&J(\u0010\u009e\u0001\u001a\u00020;2\u0007\u0010\u009f\u0001\u001a\u00020\u000b2\u0014\u0008\u0002\u0010\u00a0\u0001\u001a\r\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0096\u0001H&J*\u0010\u00a1\u0001\u001a\u00020;2\u0008\u0010\u00a2\u0001\u001a\u00030\u00a3\u00012\u0008\u0010\u00a4\u0001\u001a\u00030\u00a5\u00012\u000b\u0008\u0002\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H&J#\u0010\u00a6\u0001\u001a\u00020;2\u0006\u0010<\u001a\u0002002\u0007\u0010\u00a7\u0001\u001a\u00020\t2\u0007\u0010\u00a8\u0001\u001a\u00020\tH&J>\u0010\u00a9\u0001\u001a\u00020;2\u0007\u0010\u00aa\u0001\u001a\u00020j2\u0006\u0010\u0010\u001a\u00020\u000b2\u0007\u0010\u00ab\u0001\u001a\u00020\t2\u0007\u0010\u00ac\u0001\u001a\u00020\t2\u0007\u0010\u00ad\u0001\u001a\u00020\t2\u0007\u0010\u00ae\u0001\u001a\u00020\u000bH&J4\u0010\u00af\u0001\u001a\u00020=2\u000b\u0008\u0002\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\u00032\t\u0008\u0002\u0010\u00b1\u0001\u001a\u00020\t2\u000b\u0008\u0002\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\'H&\u00a2\u0006\u0003\u0010\u00b3\u0001J\t\u0010\u00b4\u0001\u001a\u00020\tH&J\t\u0010\u00b5\u0001\u001a\u00020;H&J!\u0010\u00b6\u0001\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u000e\u0010\u00b7\u0001\u001a\t\u0012\u0004\u0012\u00020;0\u00b8\u0001H&J\u0014\u0010\u00b9\u0001\u001a\u0005\u0018\u00010\u00ba\u00012\u0006\u0010\u0010\u001a\u00020\u000bH&J\t\u0010\u00bb\u0001\u001a\u00020\tH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u00bd\u0001\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/margin/api/IMarginService;",
        "",
        "getLeverType",
        "",
        "getMarginType",
        "getIsolatedMarginType",
        "fetchUserLeverage",
        "Ljava/math/BigDecimal;",
        "isIsolated",
        "",
        "code",
        "",
        "modifyUserLeverage",
        "Lio/reactivex/Observable;",
        "leverage",
        "getMarginMaxLever",
        "symbol",
        "getPnlPrecision",
        "(Ljava/lang/String;)Ljava/lang/Integer;",
        "getMarginRiskLever",
        "getMarginPositionLever",
        "getMarginMaxAutoLoanDebtRatio",
        "getIsolatedMaxBorrowAmount",
        "currency",
        "getIsolatedBorrowEnable",
        "getIsolatedBorrowEnableOnSymbol",
        "getMarginRiskGrade",
        "getMarginConfigForBridge",
        "Lcom/kubi/margin/api/entity/MarginBridgeConfig;",
        "getIsolatedMarginConfigForBridge",
        "Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;",
        "getIsolatedMarginConfigListForBridge",
        "",
        "fetchEtfTicker",
        "Lcom/kubi/sdk/base/entity/BaseEntity;",
        "baseCurrency",
        "getTradeFeeData",
        "Lio/reactivex/disposables/Disposable;",
        "currentSymbol",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "isRefresh",
        "getTakerFee",
        "currentSymbolInfo",
        "Lcom/kubi/data/entity/SymbolInfoEntity;",
        "getMakerFee",
        "getFeeInfo",
        "Lcom/kubi/margin/api/entity/FeeEntity;",
        "getIndexPriceListFragment",
        "Landroidx/fragment/app/Fragment;",
        "fetchAllIsolatePositionList",
        "Lcom/kubi/margin/api/entity/IsolateMarginPosition;",
        "filterNotLoan",
        "(Ljava/lang/Boolean;)Lio/reactivex/Observable;",
        "getTransferableAmountDebtRatio",
        "getLiquidationDebtRatio",
        "getIsolatePositionBySymbol",
        "Lcom/kubi/margin/api/entity/MarginPosition;",
        "fetchIsolatePosition",
        "profitIllegalDialog",
        "",
        "fragment",
        "Lcom/kubi/sdk/BaseFragment;",
        "fetchIsoLatePositionTags",
        "Lcom/kubi/margin/api/entity/IsolateMarginPositionTag;",
        "fetchIsoLatePositionTagsBorrow",
        "setMarginAutoReturn",
        "isOpen",
        "setIsolateMarginAutoReturn",
        "singlePositionInfo",
        "Lcom/kubi/margin/api/entity/FundsInfo;",
        "singlePositionInfoSync",
        "leverPositionInfo",
        "Lcom/kubi/margin/api/entity/LeverBalance;",
        "leverPositionInfoSync",
        "getIsolatedTransfer",
        "Lcom/kubi/margin/api/entity/MarginTransfer;",
        "getMarginMaxLeverString",
        "item",
        "getTargetLend",
        "Lcom/kubi/margin/api/entity/MarginCouponConfig;",
        "fetchMarginBonus",
        "Lcom/kubi/margin/api/entity/MarginBonusConfig;",
        "getSingleMarginPositionByCode",
        "symbolCode",
        "withCache",
        "(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/Observable;",
        "getSingleMarginPositionByCodeSync",
        "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/margin/api/entity/MarginPosition;",
        "getMarginMarkPricesSync",
        "Lcom/kubi/margin/api/entity/MarkPrice;",
        "symbolList",
        "fetchCrossAssetsList",
        "Lkotlinx/coroutines/flow/Flow;",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "(Ljava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;",
        "getMarginTradeFragment",
        "getIsolatedMarginTradeFragment",
        "getCrossPageId",
        "getIsolatedPageId",
        "getTradeItemBean",
        "isBaseMarginFragment",
        "marginTradeFragmentScrollToTop",
        "toAgreeEtf",
        "toEtfApply",
        "requireContext",
        "Landroid/content/Context;",
        "coin",
        "toEftRedeem",
        "toMarginTradeTab",
        "isolated",
        "isBuy",
        "spmId",
        "joinMarginRiskView",
        "viewGroup",
        "Landroid/view/ViewGroup;",
        "status",
        "value",
        "",
        "riskGrade",
        "symbolInfo",
        "transferableAmountDebtRatio",
        "flDebtRatio",
        "isIsolateMargin",
        "quoteCurrency",
        "showDashBoardView",
        "joinLeverGiftView",
        "action",
        "Lio/reactivex/functions/Action;",
        "dismissCallback",
        "checkShowLeverGiftView",
        "config",
        "Lcom/kubi/margin/api/entity/MarginWelfare;",
        "page",
        "isTypeBonus",
        "(Landroid/view/ViewGroup;)Ljava/lang/Boolean;",
        "clearGiftView",
        "showMarginTicketGuide",
        "fetchMarginWelfare",
        "iv_bonus",
        "Landroid/view/View;",
        "isShowExperienceIcon",
        "getEtfInfoFragment",
        "isEtfInfo",
        "showCouponsDialog",
        "assetBorrowFragment",
        "positionType",
        "positionTag",
        "requestCouponsData",
        "callBack",
        "Lio/reactivex/functions/Consumer;",
        "Lcom/kubi/margin/api/entity/CouponsOverview;",
        "jumpToTradeHistoryOfOpenOrder",
        "type",
        "Lcom/kubi/margin/api/define/MarginType;",
        "tab",
        "Lcom/kubi/margin/api/define/MarginTradeHistoryType;",
        "spm",
        "getTaxAdvice",
        "bizType",
        "consumer",
        "showErrorAgreementDialog",
        "childFragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "throwable",
        "",
        "showSwitchMarginTradeDialog",
        "isSupportCrossMargin",
        "isSupportIsolateMargin",
        "jump2MarginHorizontalKlinePage",
        "ctx",
        "showHistoryOrder",
        "showActivityOrder",
        "isFrom",
        "klineType",
        "getMarginToggleSymbolsFragment",
        "tradeType",
        "isMarket",
        "tradeItemBean",
        "(Ljava/lang/Integer;ZLcom/kubi/data/entity/TradeItemBean;)Lcom/kubi/sdk/BaseFragment;",
        "isSupportGuideTab",
        "jumpToLoanRateDescPage",
        "checkEuMarginRiskAgreement",
        "onPassed",
        "Lkotlin/Function0;",
        "fetchMarginCurrencyInfo",
        "Lcom/kubi/data/entity/MarginSymbolInfo;",
        "isSupportCrossOneClickLiquidation",
        "Companion",
        "MarginApi_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lvx/b;
.end annotation


# static fields
.field public static final a:Lcom/kubi/margin/api/IMarginService$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/margin/api/IMarginService$Companion;->a:Lcom/kubi/margin/api/IMarginService$Companion;

    .line 3
    .line 4
    sput-object v0, Lcom/kubi/margin/api/IMarginService;->a:Lcom/kubi/margin/api/IMarginService$Companion;

    .line 5
    return-void
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static synthetic A0(Lcom/kubi/margin/api/IMarginService;Ljava/lang/Boolean;ILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 0

    .line 1
    .line 2
    if-nez p3, :cond_1

    .line 3
    .line 4
    and-int/lit8 p2, p2, 0x1

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    const/4 p1, 0x0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-interface {p0, p1}, Lcom/kubi/margin/api/IMarginService;->i0(Ljava/lang/Boolean;)Lio/reactivex/Observable;

    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    .line 14
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string p1, "Super calls with default arguments not supported in this target, function: fetchAllIsolatePositionList"

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    throw p0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
.end method

.method public static synthetic B(Lcom/kubi/margin/api/IMarginService;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 0

    .line 1
    .line 2
    if-nez p4, :cond_1

    .line 3
    .line 4
    and-int/lit8 p3, p3, 0x2

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {p0, p1, p2}, Lcom/kubi/margin/api/IMarginService;->j(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/Observable;

    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    .line 15
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 16
    .line 17
    const-string p1, "Super calls with default arguments not supported in this target, function: getSingleMarginPositionByCode"

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 21
    throw p0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
.end method

.method public static synthetic R(Lcom/kubi/margin/api/IMarginService;Landroid/view/ViewGroup;Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;DLjava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;ZILjava/lang/Object;)V
    .locals 15

    .line 1
    .line 2
    move/from16 v0, p13

    .line 3
    .line 4
    if-nez p14, :cond_2

    .line 5
    .line 6
    and-int/lit16 v1, v0, 0x200

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    const/4 v1, 0x0

    .line 10
    move-object v13, v1

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    move-object/from16 v13, p11

    .line 14
    .line 15
    :goto_0
    and-int/lit16 v0, v0, 0x400

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    const/4 v0, 0x1

    .line 19
    move v14, v0

    .line 20
    :goto_1
    move-object v2, p0

    .line 21
    .line 22
    move-object/from16 v3, p1

    .line 23
    .line 24
    move-object/from16 v4, p2

    .line 25
    .line 26
    move-object/from16 v5, p3

    .line 27
    .line 28
    move-wide/from16 v6, p4

    .line 29
    .line 30
    move-object/from16 v8, p6

    .line 31
    .line 32
    move-object/from16 v9, p7

    .line 33
    .line 34
    move-object/from16 v10, p8

    .line 35
    .line 36
    move-object/from16 v11, p9

    .line 37
    .line 38
    move/from16 v12, p10

    .line 39
    goto :goto_2

    .line 40
    .line 41
    :cond_1
    move/from16 v14, p12

    .line 42
    goto :goto_1

    .line 43
    .line 44
    .line 45
    :goto_2
    invoke-interface/range {v2 .. v14}, Lcom/kubi/margin/api/IMarginService;->q0(Landroid/view/ViewGroup;Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;DLjava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;Z)V

    .line 46
    return-void

    .line 47
    .line 48
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 49
    .line 50
    const-string v0, "Super calls with default arguments not supported in this target, function: joinMarginRiskView"

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 54
    throw p0
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public static synthetic d0(Lcom/kubi/margin/api/IMarginService;Ljava/lang/String;ZZLjava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    if-nez p6, :cond_2

    .line 3
    .line 4
    and-int/lit8 p6, p5, 0x4

    .line 5
    .line 6
    if-eqz p6, :cond_0

    .line 7
    const/4 p3, 0x1

    .line 8
    .line 9
    :cond_0
    and-int/lit8 p5, p5, 0x8

    .line 10
    .line 11
    if-eqz p5, :cond_1

    .line 12
    const/4 p4, 0x0

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-interface {p0, p1, p2, p3, p4}, Lcom/kubi/margin/api/IMarginService;->O(Ljava/lang/String;ZZLjava/lang/String;)V

    .line 16
    return-void

    .line 17
    .line 18
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p1, "Super calls with default arguments not supported in this target, function: toMarginTradeTab"

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 24
    throw p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
.end method

.method public static synthetic e0(Lcom/kubi/margin/api/IMarginService;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/kubi/margin/api/entity/MarginPosition;
    .locals 0

    .line 1
    .line 2
    if-nez p4, :cond_1

    .line 3
    .line 4
    and-int/lit8 p3, p3, 0x2

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {p0, p1, p2}, Lcom/kubi/margin/api/IMarginService;->c(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/margin/api/entity/MarginPosition;

    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    .line 15
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 16
    .line 17
    const-string p1, "Super calls with default arguments not supported in this target, function: getSingleMarginPositionByCodeSync"

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 21
    throw p0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
.end method

.method public static synthetic k0(Lcom/kubi/margin/api/IMarginService;Ljava/lang/Boolean;ILjava/lang/Object;)Lkotlinx/coroutines/flow/e;
    .locals 0

    .line 1
    .line 2
    if-nez p3, :cond_1

    .line 3
    .line 4
    and-int/lit8 p2, p2, 0x1

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    const/4 p1, 0x0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-interface {p0, p1}, Lcom/kubi/margin/api/IMarginService;->b(Ljava/lang/Boolean;)Lkotlinx/coroutines/flow/e;

    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    .line 14
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string p1, "Super calls with default arguments not supported in this target, function: fetchCrossAssetsList"

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 20
    throw p0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
.end method


# virtual methods
.method public abstract A()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract C(Ljava/lang/String;)Lcom/kubi/margin/api/entity/MarginPosition;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract D(ZLjava/lang/String;)Ljava/math/BigDecimal;
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract E()Lcom/kubi/margin/api/entity/MarginBridgeConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract F(Ljava/lang/String;)Z
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract G(Landroid/view/ViewGroup;)Ljava/lang/Boolean;
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract H(Ljava/lang/String;)Ljava/util/List;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/kubi/margin/api/entity/IsolateMarginPositionTag;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract I(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract J(Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/math/BigDecimal;
    .param p1    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract K(Ljava/lang/String;Lio/reactivex/functions/Consumer;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/reactivex/functions/Consumer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/reactivex/functions/Consumer<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract L()Lcom/kubi/sdk/BaseFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract M(Landroid/view/ViewGroup;Lcom/kubi/sdk/BaseFragment;Lio/reactivex/functions/Action;Lio/reactivex/functions/Action;)V
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/reactivex/functions/Action;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lio/reactivex/functions/Action;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract N(Lcom/kubi/sdk/BaseFragment;Landroid/view/ViewGroup;Landroid/view/View;)V
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract O(Ljava/lang/String;ZZLjava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract P()V
.end method

.method public abstract Q()Z
.end method

.method public abstract S(Ljava/lang/String;)Lcom/kubi/margin/api/entity/IsolatedMarginBridgeConfig;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract T()V
.end method

.method public abstract U()Z
.end method

.method public abstract V()I
.end method

.method public abstract W()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract X(Lcom/kubi/data/entity/TradeItemBean;Z)Lio/reactivex/disposables/Disposable;
    .param p1    # Lcom/kubi/data/entity/TradeItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract Y(Ljava/lang/String;)Lcom/kubi/data/entity/MarginSymbolInfo;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract Z()Lcom/kubi/sdk/BaseFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract a()Z
.end method

.method public abstract a0(Ljava/lang/String;Ljava/lang/String;)Ljava/math/BigDecimal;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract b(Ljava/lang/Boolean;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/margin/api/entity/FundsInfo;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract b0(ZLjava/lang/String;)Ljava/math/BigDecimal;
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/margin/api/entity/MarginPosition;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract c0()I
.end method

.method public abstract d(Ljava/lang/String;)Lio/reactivex/Observable;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/margin/api/entity/FundsInfo;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;)Lcom/kubi/margin/api/entity/FundsInfo;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract f()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/margin/api/entity/LeverBalance;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract f0()I
.end method

.method public abstract g0(ZLjava/lang/String;)Ljava/math/BigDecimal;
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract h0(Lcom/kubi/sdk/BaseFragment;Lkotlin/jvm/functions/Function0;)V
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/sdk/BaseFragment;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract i()Lcom/kubi/margin/api/entity/LeverBalance;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract i0(Ljava/lang/Boolean;)Lio/reactivex/Observable;
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/margin/api/entity/IsolateMarginPosition;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract j(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/Observable;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ")",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/margin/api/entity/MarginPosition;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract j0(Ljava/lang/Integer;ZLcom/kubi/data/entity/TradeItemBean;)Lcom/kubi/sdk/BaseFragment;
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/data/entity/TradeItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract k(Ljava/lang/String;)Lio/reactivex/Observable;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Ljava/math/BigDecimal;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract l(Ljava/util/List;)Ljava/util/List;
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "symbolList"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/kubi/margin/api/entity/MarkPrice;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract l0()V
.end method

.method public abstract m(ZLjava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract m0(Lcom/kubi/data/entity/SymbolInfoEntity;)Lcom/kubi/margin/api/entity/FeeEntity;
    .param p1    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract n(Lcom/kubi/sdk/BaseFragment;Landroid/view/ViewGroup;)V
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract n0()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract o()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract o0(Ljava/lang/String;)Lio/reactivex/Observable;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/margin/api/entity/MarginPosition;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract p(Landroidx/fragment/app/FragmentManager;Ljava/lang/Throwable;Lio/reactivex/functions/Action;)V
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/reactivex/functions/Action;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract p0(Lyo/b;Lyo/a;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/lang/String;)V
    .param p1    # Lyo/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lyo/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract q(Ljava/lang/String;)Ljava/math/BigDecimal;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract q0(Landroid/view/ViewGroup;Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;DLjava/lang/String;Lcom/kubi/data/entity/SymbolInfoEntity;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;Z)V
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract r(Lcom/kubi/data/entity/SymbolInfoEntity;)Ljava/math/BigDecimal;
    .param p1    # Lcom/kubi/data/entity/SymbolInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract r0(Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract s(Landroid/content/Context;Ljava/lang/String;)V
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract s0(Landroid/content/Context;Ljava/lang/String;)V
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract t(Lcom/kubi/data/entity/TradeItemBean;)Ljava/lang/String;
    .param p1    # Lcom/kubi/data/entity/TradeItemBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract t0(Landroidx/fragment/app/Fragment;)Z
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract u(ZLjava/lang/String;)Ljava/math/BigDecimal;
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract u0(ZLjava/lang/String;)Ljava/math/BigDecimal;
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract v(ZLjava/lang/String;)Ljava/math/BigDecimal;
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract v0(Lcom/kubi/sdk/BaseFragment;)Lcom/kubi/data/entity/TradeItemBean;
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract w(Lcom/kubi/sdk/BaseFragment;)V
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract w0(Landroid/content/Context;Ljava/lang/String;ZZZLjava/lang/String;)V
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract x(Lcom/kubi/sdk/BaseFragment;)V
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract x0(Ljava/lang/String;Ljava/lang/String;)Z
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract y(Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/reactivex/functions/Consumer;)V
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lio/reactivex/functions/Consumer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/sdk/BaseFragment;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/reactivex/functions/Consumer<",
            "Lcom/kubi/margin/api/entity/CouponsOverview;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract y0(Lcom/kubi/sdk/BaseFragment;)Z
    .param p1    # Lcom/kubi/sdk/BaseFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract z(Ljava/lang/String;)Ljava/lang/Integer;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract z0(Landroidx/fragment/app/Fragment;ZZ)V
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
