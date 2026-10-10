.class public final Ltk/a;
.super Ljava/lang/Object;
.source "HedgeCrossCalculator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u001e\n\u0002\u0010\u0008\n\u0002\u0008\u001a\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000bJ/\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J7\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ7\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ5\u0010$\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004\u00a2\u0006\u0004\u0008$\u0010\u000bJO\u0010\'\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\'\u0010(JG\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004\u00a2\u0006\u0004\u0008*\u0010+J/\u00100\u001a\u0004\u0018\u00010\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004\u00a2\u0006\u0004\u00080\u0010\u0011J\u001f\u00103\u001a\u0004\u0018\u00010\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0004\u00a2\u0006\u0004\u00083\u00104J\u00a1\u0001\u0010=\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00106\u001a\u0002052\u0006\u0010*\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0008\u0010<\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008=\u0010>Jg\u0010E\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u0002052\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0004\u00a2\u0006\u0004\u0008E\u0010FJ\u0087\u0001\u0010M\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u00042\u0006\u0010B\u001a\u0002052\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u0004\u00a2\u0006\u0004\u0008M\u0010N\u00a8\u0006O"
    }
    d2 = {
        "Ltk/a;",
        "",
        "<init>",
        "()V",
        "Lrk/b;",
        "multiplier",
        "bidOrderQty",
        "bidPositionQty",
        "askOrderQty",
        "askPositionQty",
        "i",
        "(Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "maintainMarginRateLimit",
        "factor",
        "maxLeverage",
        "posOrderQty",
        "f",
        "(Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "leverage",
        "maintainMarginRate",
        "b",
        "(Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "",
        "isInverse",
        "qty",
        "price",
        "initMarginRate",
        "a",
        "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "maintainRate",
        "e",
        "bidOrderMaintainMargin",
        "askOrderMaintainMargin",
        "bidPositionMaintainMargin",
        "askPositionMaintainMargin",
        "maintainMarginRateDiscount",
        "h",
        "markPrice",
        "takerFeeRate",
        "j",
        "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "taxRate",
        "k",
        "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "totalMargin",
        "posOrderMM",
        "closeFee",
        "openFee",
        "l",
        "unrealizedPnl",
        "initMargin",
        "m",
        "(Lrk/b;Lrk/b;)Lrk/b;",
        "",
        "lotPrecision",
        "buffer",
        "availableBalance",
        "otherSymbolsOccupiedMargin",
        "estimatedPrice",
        "occupiedMarginDiscount",
        "calcCrossRiskLimit",
        "g",
        "(ZLrk/b;ILrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "amr",
        "buyQty",
        "sellQty",
        "indexPricePrecision",
        "minPrice",
        "maxPrice",
        "d",
        "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;ILrk/b;Lrk/b;)Lrk/b;",
        "maxQty",
        "otherSymbolSumMarkValue",
        "delegationPrice",
        "delegationQty",
        "buyPositionQty",
        "sellPositionQty",
        "c",
        "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;ILrk/b;Lrk/b;)Lrk/b;",
        "shared_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHedgeCrossCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HedgeCrossCalculator.kt\ncom/kubi/kmm/trade/futures/hedge/HedgeCrossCalculator\n+ 2 NumberEx.kt\ncom/kubi/kmm/trade/utils/NumberExKt\n*L\n1#1,657:1\n38#2,2:658\n55#2,2:660\n41#2:662\n38#2,2:663\n55#2,2:665\n41#2,9:667\n38#2,2:676\n55#2,2:678\n41#2:680\n52#2:681\n52#2:682\n30#2,4:683\n30#2,4:687\n46#2:691\n52#2:692\n30#2,4:693\n49#2:697\n38#2,2:698\n55#2,2:700\n41#2:702\n38#2,2:703\n55#2,2:705\n41#2:707\n38#2,2:708\n55#2,2:710\n41#2:712\n46#2:713\n38#2,2:714\n55#2,2:716\n41#2:718\n55#2,2:719\n41#2:721\n38#2,2:722\n55#2,2:724\n41#2:726\n38#2,2:727\n55#2,2:729\n41#2:731\n55#2,2:732\n41#2:734\n38#2,2:735\n55#2,2:737\n41#2:739\n30#2,4:740\n52#2:744\n30#2,4:745\n52#2:749\n52#2:750\n38#2,2:751\n55#2,2:753\n41#2:755\n38#2,2:756\n55#2,2:758\n41#2:760\n38#2,2:761\n55#2,2:763\n41#2:765\n38#2,2:766\n55#2,2:768\n41#2:770\n38#2,2:771\n55#2,2:773\n41#2:775\n38#2,2:776\n55#2,2:778\n41#2,6:780\n49#2:786\n49#2:787\n52#2:788\n30#2,4:789\n52#2:793\n30#2,4:794\n52#2:798\n30#2,4:799\n38#2,2:803\n55#2,2:805\n41#2:807\n38#2,2:808\n55#2,2:810\n41#2,6:812\n38#2,2:818\n55#2,2:820\n41#2:822\n46#2:823\n49#2:824\n52#2:825\n38#2,2:826\n55#2,2:828\n41#2:830\n30#2,4:831\n49#2:835\n38#2,2:836\n55#2,2:838\n41#2:840\n55#2,2:841\n41#2:843\n55#2,2:844\n55#2,2:846\n38#2,2:848\n55#2,2:850\n41#2:852\n38#2,2:853\n55#2,2:855\n41#2,9:857\n38#2,2:866\n55#2,2:868\n41#2,9:870\n38#2,2:879\n55#2,2:881\n41#2:883\n38#2,2:884\n55#2,2:886\n41#2,9:888\n38#2,2:897\n55#2,2:899\n41#2:901\n38#2,2:902\n55#2,2:904\n41#2,6:906\n52#2:912\n30#2,4:913\n52#2:917\n30#2,4:918\n38#2,2:922\n55#2,2:924\n41#2:926\n38#2,2:927\n55#2,2:929\n41#2:931\n38#2,2:932\n55#2,2:934\n41#2:936\n38#2,2:937\n55#2,2:939\n41#2,9:941\n38#2,2:950\n55#2,2:952\n41#2,6:954\n38#2,2:960\n55#2,2:962\n41#2:964\n38#2,2:965\n55#2,2:967\n41#2,9:969\n52#2:978\n30#2,4:979\n30#2,4:983\n55#2,2:987\n38#2,2:989\n55#2,2:991\n41#2:993\n52#2:994\n30#2,4:995\n38#2,2:999\n55#2,2:1001\n41#2:1003\n30#2,4:1004\n38#2,2:1008\n55#2,2:1010\n41#2:1012\n52#2:1013\n30#2,4:1014\n30#2,4:1018\n*S KotlinDebug\n*F\n+ 1 HedgeCrossCalculator.kt\ncom/kubi/kmm/trade/futures/hedge/HedgeCrossCalculator\n*L\n42#1:658,2\n42#1:660,2\n42#1:662\n43#1:663,2\n43#1:665,2\n43#1:667,9\n44#1:676,2\n44#1:678,2\n44#1:680\n67#1:681\n68#1:682\n73#1:683,4\n74#1:687,4\n76#1:691\n96#1:692\n97#1:693,4\n98#1:697\n125#1:698,2\n125#1:700,2\n125#1:702\n126#1:703,2\n126#1:705,2\n126#1:707\n153#1:708,2\n153#1:710,2\n153#1:712\n182#1:713\n216#1:714,2\n216#1:716,2\n216#1:718\n216#1:719,2\n216#1:721\n219#1:722,2\n219#1:724,2\n219#1:726\n250#1:727,2\n250#1:729,2\n250#1:731\n250#1:732,2\n250#1:734\n253#1:735,2\n253#1:737,2\n253#1:739\n275#1:740,4\n292#1:744\n295#1:745,4\n349#1:749\n350#1:750\n353#1:751,2\n353#1:753,2\n353#1:755\n353#1:756,2\n353#1:758,2\n353#1:760\n354#1:761,2\n354#1:763,2\n354#1:765\n354#1:766,2\n354#1:768,2\n354#1:770\n356#1:771,2\n356#1:773,2\n356#1:775\n356#1:776,2\n356#1:778,2\n356#1:780,6\n359#1:786\n362#1:787\n370#1:788\n370#1:789,4\n376#1:793\n377#1:794,4\n380#1:798\n381#1:799,4\n389#1:803,2\n389#1:805,2\n389#1:807\n390#1:808,2\n390#1:810,2\n390#1:812,6\n393#1:818,2\n393#1:820,2\n393#1:822\n394#1:823\n395#1:824\n396#1:825\n399#1:826,2\n399#1:828,2\n399#1:830\n399#1:831,4\n411#1:835\n456#1:836,2\n456#1:838,2\n456#1:840\n456#1:841,2\n456#1:843\n460#1:844,2\n464#1:846,2\n466#1:848,2\n466#1:850,2\n466#1:852\n466#1:853,2\n466#1:855,2\n466#1:857,9\n469#1:866,2\n469#1:868,2\n469#1:870,9\n473#1:879,2\n473#1:881,2\n473#1:883\n473#1:884,2\n473#1:886,2\n473#1:888,9\n474#1:897,2\n474#1:899,2\n474#1:901\n474#1:902,2\n474#1:904,2\n474#1:906,6\n481#1:912\n484#1:913,4\n489#1:917\n492#1:918,4\n576#1:922,2\n576#1:924,2\n576#1:926\n588#1:927,2\n588#1:929,2\n588#1:931\n588#1:932,2\n588#1:934,2\n588#1:936\n591#1:937,2\n591#1:939,2\n591#1:941,9\n592#1:950,2\n592#1:952,2\n592#1:954,6\n595#1:960,2\n595#1:962,2\n595#1:964\n595#1:965,2\n595#1:967,2\n595#1:969,9\n601#1:978\n602#1:979,4\n603#1:983,4\n613#1:987,2\n614#1:989,2\n614#1:991,2\n614#1:993\n615#1:994\n619#1:995,4\n621#1:999,2\n621#1:1001,2\n621#1:1003\n622#1:1004,4\n625#1:1008,2\n625#1:1010,2\n625#1:1012\n628#1:1013\n636#1:1014,4\n638#1:1018,4\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Ltk/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ltk/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ltk/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Ltk/a;->a:Ltk/a;

    .line 8
    return-void
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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
    .line 5
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
.end method


# virtual methods
.method public final a(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 2
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "multiplier"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "qty"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "price"

    .line 13
    .line 14
    .line 15
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "initMarginRate"

    .line 18
    .line 19
    .line 20
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    const/4 v0, 0x0

    .line 22
    .line 23
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 24
    .line 25
    sget-object v1, Luk/b;->a:Luk/b;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1, p2, p4, p3}, Luk/b;->g(ZLrk/b;Lrk/b;Lrk/b;)Lrk/b;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    sget-object p2, Lrk/a;->a:Lrk/a;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Lrk/a;->b()Lrk/b;

    .line 37
    move-result-object p3

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p3}, Lrk/b;->b(Lrk/b;)I

    .line 41
    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    const-string p4, "-1"

    .line 44
    .line 45
    if-ltz p3, :cond_0

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_0
    :try_start_1
    new-instance p3, Lrk/b;

    .line 49
    .line 50
    .line 51
    invoke-direct {p3, p4}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    :goto_0
    if-nez p1, :cond_1

    .line 58
    goto :goto_1

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-virtual {p1, p5}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Lrk/a;->b()Lrk/b;

    .line 66
    move-result-object p2

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p2}, Lrk/b;->b(Lrk/b;)I

    .line 70
    move-result p2

    .line 71
    .line 72
    if-ltz p2, :cond_2

    .line 73
    return-object p1

    .line 74
    .line 75
    :cond_2
    new-instance p2, Lrk/b;

    .line 76
    .line 77
    .line 78
    invoke-direct {p2, p4}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 82
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    return-object p1

    .line 84
    :catchall_0
    move-exception p1

    .line 85
    goto :goto_2

    .line 86
    :cond_3
    :goto_1
    return-object v0

    .line 87
    .line 88
    :goto_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 92
    move-result-object p1

    .line 93
    .line 94
    .line 95
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    .line 99
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 100
    move-result p2

    .line 101
    .line 102
    if-eqz p2, :cond_4

    .line 103
    goto :goto_3

    .line 104
    :cond_4
    move-object v0, p1

    .line 105
    .line 106
    :goto_3
    check-cast v0, Lrk/b;

    .line 107
    return-object v0
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
.end method

.method public final b(Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 4
    .param p1    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "0"

    .line 3
    .line 4
    const-string v1, "leverage"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v1, "maintainMarginRate"

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    const-string v1, "factor"

    .line 15
    .line 16
    .line 17
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 20
    .line 21
    new-instance v1, Lrk/b;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lrk/b;->b(Lrk/b;)I

    .line 28
    move-result v1

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    new-instance p1, Lrk/b;

    .line 33
    .line 34
    .line 35
    invoke-direct {p1, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 36
    return-object p1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_0
    new-instance v1, Lrk/b;

    .line 41
    .line 42
    const-string v2, "1"

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, v2}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    sget-object v2, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 48
    .line 49
    const/16 v3, 0x14

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p1, v3, v2}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 57
    move-result-object p2

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p2}, Lrk/b;->b(Lrk/b;)I

    .line 61
    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    if-lez p3, :cond_1

    .line 64
    return-object p1

    .line 65
    :cond_1
    return-object p2

    .line 66
    .line 67
    :goto_0
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    .line 78
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 79
    move-result p2

    .line 80
    .line 81
    if-eqz p2, :cond_2

    .line 82
    const/4 p1, 0x0

    .line 83
    .line 84
    :cond_2
    check-cast p1, Ljava/lang/Void;

    .line 85
    .line 86
    if-eqz p1, :cond_3

    .line 87
    .line 88
    check-cast p1, Lrk/b;

    .line 89
    goto :goto_1

    .line 90
    .line 91
    :cond_3
    new-instance p1, Lrk/b;

    .line 92
    .line 93
    .line 94
    invoke-direct {p1, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 95
    :goto_1
    return-object p1
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
.end method

.method public final c(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;ILrk/b;Lrk/b;)Lrk/b;
    .locals 19
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p15    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    move-object/from16 v11, p14

    move-object/from16 v12, p15

    const-string v13, "0"

    const-string v14, "multiplier"

    invoke-static {v1, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "maintainRate"

    move-object/from16 v15, p3

    invoke-static {v15, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "takerFeeRate"

    invoke-static {v2, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "totalMargin"

    invoke-static {v3, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "maxQty"

    invoke-static {v4, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "otherSymbolSumMarkValue"

    invoke-static {v5, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "markPrice"

    invoke-static {v6, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "delegationPrice"

    invoke-static {v7, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "delegationQty"

    invoke-static {v8, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "buyPositionQty"

    invoke-static {v9, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "sellPositionQty"

    invoke-static {v10, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "minPrice"

    invoke-static {v11, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "maxPrice"

    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    sget-object v16, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 2
    sget-object v16, Lrk/a;->a:Lrk/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v17, 0x0

    :try_start_1
    invoke-virtual/range {v16 .. v16}, Lrk/a;->b()Lrk/b;

    move-result-object v14

    invoke-virtual {v8, v14}, Lrk/b;->b(Lrk/b;)I

    move-result v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move/from16 v18, v14

    const-string v14, "-1"

    if-ltz v18, :cond_0

    move-object v15, v8

    goto :goto_0

    .line 3
    :cond_0
    :try_start_2
    new-instance v15, Lrk/b;

    invoke-direct {v15, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v15}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v15

    .line 4
    :goto_0
    invoke-virtual {v15, v4}, Lrk/b;->b(Lrk/b;)I

    move-result v4

    if-lez v4, :cond_1

    return-object v17

    .line 5
    :cond_1
    new-instance v4, Lrk/b;

    invoke-direct {v4, v13}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v8, v4}, Lrk/b;->b(Lrk/b;)I

    move-result v15

    if-ltz v15, :cond_2

    .line 7
    invoke-virtual {v9, v8}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v8

    move-object v15, v10

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_17

    .line 8
    :cond_2
    invoke-virtual {v10, v8}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v8

    move-object v15, v8

    move-object v8, v9

    .line 9
    :goto_1
    invoke-virtual/range {v16 .. v16}, Lrk/a;->b()Lrk/b;

    move-result-object v11

    invoke-virtual {v8, v11}, Lrk/b;->b(Lrk/b;)I

    move-result v11

    if-ltz v11, :cond_3

    move-object v11, v8

    goto :goto_2

    .line 10
    :cond_3
    new-instance v11, Lrk/b;

    invoke-direct {v11, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v11}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v11

    .line 11
    :goto_2
    invoke-virtual/range {v16 .. v16}, Lrk/a;->b()Lrk/b;

    move-result-object v12

    invoke-virtual {v15, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v12

    if-ltz v12, :cond_4

    move-object v12, v15

    goto :goto_3

    .line 12
    :cond_4
    new-instance v12, Lrk/b;

    invoke-direct {v12, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v12}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v12

    .line 13
    :goto_3
    invoke-virtual {v11, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v11

    if-ltz v11, :cond_5

    const/4 v11, 0x1

    goto :goto_4

    :cond_5
    const/4 v11, 0x0

    .line 14
    :goto_4
    invoke-virtual/range {v16 .. v16}, Lrk/a;->b()Lrk/b;

    move-result-object v12

    invoke-virtual {v15, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v12

    if-ltz v12, :cond_6

    move-object v12, v15

    goto :goto_5

    .line 15
    :cond_6
    new-instance v12, Lrk/b;

    invoke-direct {v12, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v12}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v12

    .line 16
    :goto_5
    invoke-virtual {v8, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v18

    if-lez v18, :cond_7

    move-object v12, v8

    :cond_7
    move/from16 p6, v11

    .line 17
    invoke-virtual/range {p3 .. p4}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v11

    invoke-virtual {v12, v11}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v11

    .line 18
    invoke-virtual/range {v16 .. v16}, Lrk/a;->b()Lrk/b;

    move-result-object v12

    invoke-virtual {v15, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v12

    if-ltz v12, :cond_8

    move-object v12, v15

    goto :goto_6

    .line 19
    :cond_8
    new-instance v12, Lrk/b;

    invoke-direct {v12, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v12}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v12

    .line 20
    :goto_6
    invoke-virtual {v8, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v18

    if-gez v18, :cond_9

    move-object v12, v8

    .line 21
    :cond_9
    invoke-virtual {v12, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    invoke-virtual {v11, v2}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v2

    invoke-virtual {v2, v8}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v2

    .line 22
    invoke-virtual {v2, v15}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    .line 23
    invoke-virtual/range {v16 .. v16}, Lrk/a;->b()Lrk/b;

    move-result-object v11

    invoke-virtual {v8, v11}, Lrk/b;->b(Lrk/b;)I

    move-result v11

    if-ltz v11, :cond_a

    move-object v11, v8

    goto :goto_7

    .line 24
    :cond_a
    new-instance v11, Lrk/b;

    invoke-direct {v11, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v11}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v11

    .line 25
    :goto_7
    invoke-virtual/range {v16 .. v16}, Lrk/a;->b()Lrk/b;

    move-result-object v12

    invoke-virtual {v15, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v12

    if-ltz v12, :cond_b

    move-object v12, v15

    goto :goto_8

    .line 26
    :cond_b
    new-instance v12, Lrk/b;

    invoke-direct {v12, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v12}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v12

    .line 27
    :goto_8
    invoke-virtual {v11, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v18

    if-lez v18, :cond_c

    goto :goto_9

    :cond_c
    move-object v11, v12

    :goto_9
    if-nez v0, :cond_d

    .line 28
    invoke-virtual {v10, v9}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v9

    invoke-virtual {v7, v6}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v6

    invoke-virtual {v9, v6}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v6

    .line 29
    invoke-virtual {v6, v1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v6

    move-object/from16 v18, v4

    goto :goto_b

    .line 30
    :cond_d
    new-instance v12, Lrk/b;

    invoke-direct {v12, v13}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v12

    if-nez v12, :cond_e

    goto :goto_a

    :cond_e
    new-instance v12, Lrk/b;

    invoke-direct {v12, v13}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v12

    if-nez v12, :cond_f

    :goto_a
    return-object v17

    .line 31
    :cond_f
    invoke-virtual/range {p11 .. p12}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v12

    .line 32
    sget-object v9, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    const/16 v10, 0x14

    .line 33
    invoke-virtual {v12, v7, v10, v9}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v12

    move-object/from16 v18, v4

    .line 34
    invoke-virtual/range {p11 .. p12}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v4

    .line 35
    invoke-virtual {v4, v6, v10, v9}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v4

    .line 36
    invoke-virtual {v12, v4}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v4

    .line 37
    invoke-virtual {v4, v1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v6

    .line 38
    :goto_b
    sget-object v4, Luk/b;->a:Luk/b;

    invoke-virtual {v4, v0, v1, v7, v11}, Luk/b;->g(ZLrk/b;Lrk/b;Lrk/b;)Lrk/b;

    move-result-object v4

    if-nez v4, :cond_10

    .line 39
    new-instance v4, Lrk/b;

    invoke-direct {v4, v13}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 40
    :cond_10
    invoke-virtual/range {v16 .. v16}, Lrk/a;->b()Lrk/b;

    move-result-object v9

    invoke-virtual {v4, v9}, Lrk/b;->b(Lrk/b;)I

    move-result v9

    if-ltz v9, :cond_11

    move-object v9, v4

    goto :goto_c

    .line 41
    :cond_11
    new-instance v9, Lrk/b;

    invoke-direct {v9, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v9}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v9

    .line 42
    :goto_c
    invoke-virtual {v5, v9}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v5

    .line 43
    new-instance v9, Lrk/b;

    invoke-direct {v9, v13}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v9}, Lrk/b;->b(Lrk/b;)I

    move-result v9

    if-nez v9, :cond_12

    return-object v17

    .line 44
    :cond_12
    invoke-virtual {v3, v6}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v3

    .line 45
    sget-object v6, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    const/16 v10, 0x14

    .line 46
    invoke-virtual {v3, v5, v10, v6}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v3

    if-eqz v0, :cond_14

    .line 47
    invoke-virtual/range {v16 .. v16}, Lrk/a;->b()Lrk/b;

    move-result-object v5

    invoke-virtual {v4, v5}, Lrk/b;->b(Lrk/b;)I

    move-result v5

    if-ltz v5, :cond_13

    goto :goto_d

    .line 48
    :cond_13
    new-instance v5, Lrk/b;

    invoke-direct {v5, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v4

    .line 49
    :goto_d
    invoke-virtual {v3, v4}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v3

    .line 50
    invoke-virtual {v8, v15}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v4

    const/16 v10, 0x14

    .line 51
    invoke-virtual {v4, v7, v10, v6}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v4

    .line 52
    invoke-virtual {v4, v1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v1

    .line 53
    invoke-virtual {v3, v1}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v1

    goto :goto_f

    .line 54
    :cond_14
    invoke-virtual/range {v16 .. v16}, Lrk/a;->b()Lrk/b;

    move-result-object v5

    invoke-virtual {v4, v5}, Lrk/b;->b(Lrk/b;)I

    move-result v5

    if-ltz v5, :cond_15

    goto :goto_e

    .line 55
    :cond_15
    new-instance v5, Lrk/b;

    invoke-direct {v5, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v4

    .line 56
    :goto_e
    invoke-virtual {v3, v4}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v3

    .line 57
    invoke-virtual {v8, v15}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v4

    invoke-virtual {v4, v7}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v4

    invoke-virtual {v4, v1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v1

    invoke-virtual {v3, v1}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v1

    .line 58
    :goto_f
    new-instance v3, Lrk/b;

    invoke-direct {v3, v13}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lrk/b;->b(Lrk/b;)I

    move-result v3

    if-nez v3, :cond_17

    if-eqz v0, :cond_16

    return-object p15

    :cond_16
    return-object p14

    :cond_17
    if-eqz v0, :cond_18

    const/16 v10, 0x14

    .line 59
    invoke-virtual {v2, v1, v10, v6}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v1

    :goto_10
    move-object/from16 v2, v18

    goto :goto_11

    :cond_18
    const/16 v10, 0x14

    .line 60
    invoke-virtual {v1, v2, v10, v6}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v1

    goto :goto_10

    .line 61
    :goto_11
    invoke-virtual {v1, v2}, Lrk/b;->b(Lrk/b;)I

    move-result v2

    if-gez v2, :cond_1a

    if-eqz v0, :cond_19

    move-object/from16 v12, p15

    goto :goto_12

    :cond_19
    move-object/from16 v11, p14

    goto :goto_13

    :cond_1a
    move-object/from16 v12, p15

    .line 62
    invoke-virtual {v1, v12}, Lrk/b;->b(Lrk/b;)I

    move-result v0

    if-lez v0, :cond_1b

    :goto_12
    move-object v1, v12

    goto :goto_14

    :cond_1b
    move-object/from16 v11, p14

    .line 63
    invoke-virtual {v1, v11}, Lrk/b;->b(Lrk/b;)I

    move-result v0

    if-gez v0, :cond_1c

    :goto_13
    move-object v1, v11

    :cond_1c
    :goto_14
    if-eqz p6, :cond_1d

    .line 64
    sget-object v0, Lcom/kubi/kmm/trade/KMMRoundingMode;->UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    :goto_15
    move/from16 v2, p13

    goto :goto_16

    :cond_1d
    sget-object v0, Lcom/kubi/kmm/trade/KMMRoundingMode;->DOWN:Lcom/kubi/kmm/trade/KMMRoundingMode;

    goto :goto_15

    :goto_16
    invoke-virtual {v1, v2, v0}, Lrk/b;->f(ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v0

    :catchall_1
    move-exception v0

    const/16 v17, 0x0

    .line 65
    :goto_17
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 66
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1e

    move-object/from16 v14, v17

    goto :goto_18

    :cond_1e
    move-object v14, v0

    :goto_18
    check-cast v14, Lrk/b;

    return-object v14
.end method

.method public final d(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;ILrk/b;Lrk/b;)Lrk/b;
    .locals 17
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    const-string v10, "multiplier"

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "maintainRate"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "takerFeeRate"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "amr"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "markPrice"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "buyQty"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "sellQty"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "minPrice"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "maxPrice"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    sget-object v10, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 2
    sget-object v10, Lrk/a;->a:Lrk/a;

    invoke-virtual {v10}, Lrk/a;->b()Lrk/b;

    move-result-object v11

    invoke-virtual {v6, v11}, Lrk/b;->b(Lrk/b;)I

    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v12, "-1"

    if-ltz v11, :cond_0

    move-object v11, v6

    goto :goto_0

    .line 3
    :cond_0
    :try_start_1
    new-instance v11, Lrk/b;

    invoke-direct {v11, v12}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v11}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v11

    .line 4
    :goto_0
    invoke-virtual {v10}, Lrk/a;->b()Lrk/b;

    move-result-object v13

    invoke-virtual {v7, v13}, Lrk/b;->b(Lrk/b;)I

    move-result v13

    if-ltz v13, :cond_1

    move-object v13, v7

    goto :goto_1

    .line 5
    :cond_1
    new-instance v13, Lrk/b;

    invoke-direct {v13, v12}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v13}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v13

    .line 6
    :goto_1
    invoke-virtual {v11, v13}, Lrk/b;->b(Lrk/b;)I

    move-result v11

    if-ltz v11, :cond_2

    const/4 v11, 0x1

    goto :goto_2

    :cond_2
    const/4 v11, 0x0

    .line 7
    :goto_2
    sget-object v13, Luk/b;->a:Luk/b;

    invoke-virtual {v13, v0, v1, v5, v6}, Luk/b;->g(ZLrk/b;Lrk/b;Lrk/b;)Lrk/b;

    move-result-object v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    const-string v15, "0"

    if-nez v14, :cond_3

    :try_start_2
    new-instance v14, Lrk/b;

    invoke-direct {v14, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_13

    .line 9
    :cond_3
    :goto_3
    invoke-virtual {v13, v0, v1, v5, v7}, Luk/b;->g(ZLrk/b;Lrk/b;Lrk/b;)Lrk/b;

    move-result-object v5

    if-nez v5, :cond_4

    .line 10
    new-instance v5, Lrk/b;

    invoke-direct {v5, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 11
    :cond_4
    invoke-virtual {v10}, Lrk/a;->b()Lrk/b;

    move-result-object v13

    invoke-virtual {v14, v13}, Lrk/b;->b(Lrk/b;)I

    move-result v13

    if-ltz v13, :cond_5

    move-object v13, v14

    goto :goto_4

    .line 12
    :cond_5
    new-instance v13, Lrk/b;

    invoke-direct {v13, v12}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v13}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v13

    .line 13
    :goto_4
    invoke-virtual {v10}, Lrk/a;->b()Lrk/b;

    move-result-object v0

    invoke-virtual {v5, v0}, Lrk/b;->b(Lrk/b;)I

    move-result v0

    if-ltz v0, :cond_6

    move-object v0, v5

    goto :goto_5

    .line 14
    :cond_6
    new-instance v0, Lrk/b;

    invoke-direct {v0, v12}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v0

    .line 15
    :goto_5
    invoke-virtual {v13, v0}, Lrk/b;->b(Lrk/b;)I

    move-result v16

    if-lez v16, :cond_7

    goto :goto_6

    :cond_7
    move-object v13, v0

    :goto_6
    if-nez p1, :cond_a

    .line 16
    invoke-virtual/range {p7 .. p8}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v0

    .line 17
    invoke-virtual {v10}, Lrk/a;->b()Lrk/b;

    move-result-object v10

    invoke-virtual {v7, v10}, Lrk/b;->b(Lrk/b;)I

    move-result v10

    if-ltz v10, :cond_8

    move-object v10, v7

    goto :goto_7

    .line 18
    :cond_8
    new-instance v10, Lrk/b;

    invoke-direct {v10, v12}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v10}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v10

    .line 19
    :goto_7
    invoke-virtual {v6, v10}, Lrk/b;->b(Lrk/b;)I

    move-result v12

    if-lez v12, :cond_9

    move-object v10, v6

    .line 20
    :cond_9
    invoke-virtual {v10, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    invoke-virtual {v0, v2}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v0

    .line 21
    invoke-virtual/range {p7 .. p8}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v2

    invoke-virtual {v2, v3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    invoke-virtual {v0, v2}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v0

    goto/16 :goto_e

    .line 22
    :cond_a
    invoke-virtual {v10}, Lrk/a;->b()Lrk/b;

    move-result-object v0

    invoke-virtual {v6, v0}, Lrk/b;->b(Lrk/b;)I

    move-result v0

    if-ltz v0, :cond_b

    move-object v0, v6

    goto :goto_8

    .line 23
    :cond_b
    new-instance v0, Lrk/b;

    invoke-direct {v0, v12}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v0

    .line 24
    :goto_8
    invoke-virtual {v10}, Lrk/a;->b()Lrk/b;

    move-result-object v2

    invoke-virtual {v7, v2}, Lrk/b;->b(Lrk/b;)I

    move-result v2

    if-ltz v2, :cond_c

    move-object v2, v7

    goto :goto_9

    .line 25
    :cond_c
    new-instance v2, Lrk/b;

    invoke-direct {v2, v12}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    .line 26
    :goto_9
    invoke-virtual {v0, v2}, Lrk/b;->b(Lrk/b;)I

    move-result v16

    if-lez v16, :cond_d

    goto :goto_a

    :cond_d
    move-object v0, v2

    .line 27
    :goto_a
    invoke-virtual/range {p3 .. p4}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v2

    invoke-virtual {v0, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v0

    .line 28
    invoke-virtual {v10}, Lrk/a;->b()Lrk/b;

    move-result-object v2

    invoke-virtual {v7, v2}, Lrk/b;->b(Lrk/b;)I

    move-result v2

    if-ltz v2, :cond_e

    move-object v2, v7

    goto :goto_b

    .line 29
    :cond_e
    new-instance v2, Lrk/b;

    invoke-direct {v2, v12}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    .line 30
    :goto_b
    invoke-virtual {v10}, Lrk/a;->b()Lrk/b;

    move-result-object v10

    invoke-virtual {v6, v10}, Lrk/b;->b(Lrk/b;)I

    move-result v10

    if-ltz v10, :cond_f

    move-object v10, v6

    goto :goto_c

    .line 31
    :cond_f
    new-instance v10, Lrk/b;

    invoke-direct {v10, v12}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v10}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v10

    .line 32
    :goto_c
    invoke-virtual {v2, v10}, Lrk/b;->b(Lrk/b;)I

    move-result v12

    if-gez v12, :cond_10

    goto :goto_d

    :cond_10
    move-object v2, v10

    .line 33
    :goto_d
    invoke-virtual {v2, v3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    invoke-virtual {v0, v2}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v0

    .line 34
    invoke-virtual {v6, v1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    invoke-virtual {v0, v2}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v0

    invoke-virtual {v7, v1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v0

    :goto_e
    const/16 v1, 0x14

    if-eqz p1, :cond_12

    .line 35
    invoke-virtual {v4, v13}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    invoke-virtual {v2, v14}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v2

    invoke-virtual {v2, v5}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v2

    .line 36
    new-instance v3, Lrk/b;

    invoke-direct {v3, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lrk/b;->b(Lrk/b;)I

    move-result v3

    if-nez v3, :cond_11

    return-object v9

    .line 37
    :cond_11
    sget-object v3, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 38
    invoke-virtual {v0, v2, v1, v3}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v0

    goto :goto_f

    .line 39
    :cond_12
    invoke-virtual {v14, v5}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v2

    invoke-virtual {v4, v13}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v3

    invoke-virtual {v2, v3}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v2

    .line 40
    new-instance v3, Lrk/b;

    invoke-direct {v3, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lrk/b;->b(Lrk/b;)I

    move-result v3

    if-nez v3, :cond_13

    return-object v8

    .line 41
    :cond_13
    sget-object v3, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 42
    invoke-virtual {v2, v0, v1, v3}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v0

    .line 43
    :goto_f
    new-instance v1, Lrk/b;

    invoke-direct {v1, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lrk/b;->b(Lrk/b;)I

    move-result v1

    if-gez v1, :cond_14

    if-nez p1, :cond_15

    goto :goto_10

    .line 44
    :cond_14
    invoke-virtual {v0, v9}, Lrk/b;->b(Lrk/b;)I

    move-result v1

    if-lez v1, :cond_16

    :cond_15
    move-object v8, v9

    goto :goto_10

    .line 45
    :cond_16
    invoke-virtual {v0, v8}, Lrk/b;->b(Lrk/b;)I

    move-result v1

    if-gez v1, :cond_17

    goto :goto_10

    :cond_17
    move-object v8, v0

    :goto_10
    if-eqz v11, :cond_18

    .line 46
    sget-object v0, Lcom/kubi/kmm/trade/KMMRoundingMode;->UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    :goto_11
    move/from16 v1, p9

    goto :goto_12

    :cond_18
    sget-object v0, Lcom/kubi/kmm/trade/KMMRoundingMode;->DOWN:Lcom/kubi/kmm/trade/KMMRoundingMode;

    goto :goto_11

    :goto_12
    invoke-virtual {v8, v1, v0}, Lrk/b;->f(ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v0

    .line 47
    :goto_13
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 48
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    const/4 v0, 0x0

    :cond_19
    check-cast v0, Lrk/b;

    return-object v0
.end method

.method public final e(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 2
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "multiplier"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "qty"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "price"

    .line 13
    .line 14
    .line 15
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "maintainRate"

    .line 18
    .line 19
    .line 20
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    const/4 v0, 0x0

    .line 22
    .line 23
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 24
    .line 25
    sget-object v1, Luk/b;->a:Luk/b;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1, p2, p4, p3}, Luk/b;->g(ZLrk/b;Lrk/b;Lrk/b;)Lrk/b;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    return-object v0

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p1, p5}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    sget-object p2, Lrk/a;->a:Lrk/a;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Lrk/a;->b()Lrk/b;

    .line 42
    move-result-object p2

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, Lrk/b;->b(Lrk/b;)I

    .line 46
    move-result p2

    .line 47
    .line 48
    if-ltz p2, :cond_1

    .line 49
    return-object p1

    .line 50
    .line 51
    :cond_1
    new-instance p2, Lrk/b;

    .line 52
    .line 53
    const-string p3, "-1"

    .line 54
    .line 55
    .line 56
    invoke-direct {p2, p3}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 60
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    return-object p1

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    .line 64
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 76
    move-result p2

    .line 77
    .line 78
    if-eqz p2, :cond_2

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    move-object v0, p1

    .line 81
    .line 82
    :goto_0
    check-cast v0, Lrk/b;

    .line 83
    return-object v0
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
.end method

.method public final f(Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 5
    .param p1    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "1"

    .line 3
    .line 4
    const-string v1, "0"

    .line 5
    .line 6
    const-string v2, "maintainMarginRateLimit"

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    const-string v2, "factor"

    .line 12
    .line 13
    .line 14
    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    const-string v2, "maxLeverage"

    .line 17
    .line 18
    .line 19
    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    const-string v2, "posOrderQty"

    .line 22
    .line 23
    .line 24
    invoke-static {p4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    :try_start_0
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 28
    .line 29
    new-instance v3, Lrk/b;

    .line 30
    .line 31
    .line 32
    invoke-direct {v3, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3, v3}, Lrk/b;->b(Lrk/b;)I

    .line 36
    move-result v3

    .line 37
    .line 38
    if-nez v3, :cond_0

    .line 39
    return-object v2

    .line 40
    .line 41
    :cond_0
    new-instance v3, Lrk/b;

    .line 42
    .line 43
    .line 44
    invoke-direct {v3, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v3}, Lrk/b;->b(Lrk/b;)I

    .line 48
    move-result v1

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    return-object v2

    .line 52
    .line 53
    :cond_1
    new-instance v1, Lrk/b;

    .line 54
    .line 55
    .line 56
    invoke-direct {v1, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    sget-object v3, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 59
    .line 60
    const/16 v4, 0x14

    .line 61
    .line 62
    .line 63
    invoke-virtual {p4, p2, v4, v3}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 64
    move-result-object p2

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, p2}, Lrk/b;->a(Lrk/b;)Lrk/b;

    .line 68
    move-result-object p2

    .line 69
    .line 70
    new-instance p4, Lrk/b;

    .line 71
    .line 72
    .line 73
    invoke-direct {p4, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    new-instance v0, Lrk/b;

    .line 76
    .line 77
    const-string v1, "2"

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 84
    move-result-object p3

    .line 85
    .line 86
    .line 87
    invoke-virtual {p4, p3, v4, v3}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 88
    move-result-object p3

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, p1}, Lrk/b;->b(Lrk/b;)I

    .line 96
    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    .line 98
    if-gez p3, :cond_2

    .line 99
    return-object p2

    .line 100
    :cond_2
    return-object p1

    .line 101
    :catchall_0
    move-exception p1

    .line 102
    .line 103
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 104
    .line 105
    .line 106
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    .line 110
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 115
    move-result p2

    .line 116
    .line 117
    if-eqz p2, :cond_3

    .line 118
    goto :goto_0

    .line 119
    :cond_3
    move-object v2, p1

    .line 120
    .line 121
    :goto_0
    check-cast v2, Lrk/b;

    .line 122
    return-object v2
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
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method

.method public final g(ZLrk/b;ILrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 18
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p13    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p15    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p16    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p17    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p18    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p9

    move-object/from16 v6, p10

    move-object/from16 v7, p11

    move-object/from16 v8, p12

    move-object/from16 v9, p13

    move-object/from16 v10, p14

    move-object/from16 v11, p15

    move-object/from16 v12, p16

    move-object/from16 v13, p17

    const-string v15, "1"

    const-string v1, "0"

    const-string v14, "multiplier"

    invoke-static {v0, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "k"

    invoke-static {v2, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "buffer"

    invoke-static {v3, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "availableBalance"

    invoke-static {v4, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "totalMargin"

    move-object/from16 v3, p7

    invoke-static {v3, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "otherSymbolsOccupiedMargin"

    move-object/from16 v3, p8

    invoke-static {v3, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "estimatedPrice"

    invoke-static {v5, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "leverage"

    invoke-static {v6, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "takerFeeRate"

    invoke-static {v7, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "taxRate"

    invoke-static {v8, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "occupiedMarginDiscount"

    invoke-static {v9, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "bidOrderQty"

    invoke-static {v10, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "bidPositionQty"

    invoke-static {v11, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "askOrderQty"

    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "askPositionQty"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    sget-object v16, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v16, 0x0

    .line 2
    :try_start_1
    new-instance v14, Lrk/b;

    invoke-direct {v14, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v14}, Lrk/b;->b(Lrk/b;)I

    move-result v14

    if-nez v14, :cond_0

    goto :goto_0

    :cond_0
    new-instance v14, Lrk/b;

    invoke-direct {v14, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v14}, Lrk/b;->b(Lrk/b;)I

    move-result v14

    if-nez v14, :cond_1

    goto :goto_0

    :cond_1
    new-instance v14, Lrk/b;

    invoke-direct {v14, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Lrk/b;->b(Lrk/b;)I

    move-result v14

    if-nez v14, :cond_2

    :goto_0
    return-object v16

    .line 3
    :cond_2
    new-instance v14, Lrk/b;

    invoke-direct {v14, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v14}, Lrk/b;->b(Lrk/b;)I

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v14, "-1"

    if-nez v4, :cond_b

    .line 4
    :try_start_2
    new-instance v0, Lrk/b;

    invoke-direct {v0, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 5
    sget-object v2, Lrk/a;->a:Lrk/a;

    invoke-virtual {v2}, Lrk/a;->b()Lrk/b;

    move-result-object v3

    invoke-virtual {v10, v3}, Lrk/b;->b(Lrk/b;)I

    move-result v3

    if-ltz v3, :cond_3

    move-object v3, v10

    goto :goto_1

    .line 6
    :cond_3
    new-instance v3, Lrk/b;

    invoke-direct {v3, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v3

    .line 7
    :goto_1
    invoke-virtual {v2}, Lrk/a;->b()Lrk/b;

    move-result-object v4

    invoke-virtual {v12, v4}, Lrk/b;->b(Lrk/b;)I

    move-result v4

    if-ltz v4, :cond_4

    move-object v4, v12

    goto :goto_2

    .line 8
    :cond_4
    new-instance v4, Lrk/b;

    invoke-direct {v4, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v4}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v4

    .line 9
    :goto_2
    invoke-virtual {v3, v4}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v3

    invoke-virtual {v0, v3}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v0

    .line 10
    invoke-virtual {v2}, Lrk/a;->b()Lrk/b;

    move-result-object v3

    invoke-virtual {v11, v3}, Lrk/b;->b(Lrk/b;)I

    move-result v3

    if-ltz v3, :cond_5

    move-object v3, v11

    goto :goto_3

    .line 11
    :cond_5
    new-instance v3, Lrk/b;

    invoke-direct {v3, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v3

    .line 12
    :goto_3
    invoke-virtual {v2}, Lrk/a;->b()Lrk/b;

    move-result-object v4

    invoke-virtual {v13, v4}, Lrk/b;->b(Lrk/b;)I

    move-result v4

    if-ltz v4, :cond_6

    move-object v4, v13

    goto :goto_4

    .line 13
    :cond_6
    new-instance v4, Lrk/b;

    invoke-direct {v4, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v4}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v4

    .line 14
    :goto_4
    invoke-virtual {v3, v4}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v3

    .line 15
    invoke-virtual {v0, v3}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v0

    .line 16
    invoke-virtual {v2}, Lrk/a;->b()Lrk/b;

    move-result-object v3

    invoke-virtual {v11, v3}, Lrk/b;->b(Lrk/b;)I

    move-result v3

    if-ltz v3, :cond_7

    move-object v3, v11

    goto :goto_5

    .line 17
    :cond_7
    new-instance v3, Lrk/b;

    invoke-direct {v3, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v3

    .line 18
    :goto_5
    invoke-virtual {v2}, Lrk/a;->b()Lrk/b;

    move-result-object v2

    invoke-virtual {v13, v2}, Lrk/b;->b(Lrk/b;)I

    move-result v2

    if-ltz v2, :cond_8

    goto :goto_6

    .line 19
    :cond_8
    new-instance v2, Lrk/b;

    invoke-direct {v2, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    move-object v13, v2

    .line 20
    :goto_6
    invoke-virtual {v3, v13}, Lrk/b;->b(Lrk/b;)I

    move-result v2

    if-gez v2, :cond_9

    goto :goto_7

    :cond_9
    move-object v3, v13

    .line 21
    :goto_7
    invoke-virtual {v3, v9}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    .line 22
    invoke-virtual {v0, v2}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v0

    .line 23
    new-instance v2, Lrk/b;

    invoke-direct {v2, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 24
    invoke-virtual {v2, v0}, Lrk/b;->b(Lrk/b;)I

    move-result v1

    if-lez v1, :cond_a

    return-object v2

    :cond_a
    return-object v0

    :catchall_0
    move-exception v0

    goto/16 :goto_13

    .line 25
    :cond_b
    invoke-virtual/range {p7 .. p8}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v3

    new-instance v4, Lrk/b;

    invoke-direct {v4, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v3, v4}, Lrk/b;->b(Lrk/b;)I

    move-result v17

    if-lez v17, :cond_c

    goto :goto_8

    :cond_c
    move-object v3, v4

    .line 27
    :goto_8
    invoke-virtual {v3, v6}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v3

    .line 28
    new-instance v4, Lrk/b;

    invoke-direct {v4, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 29
    invoke-virtual {v7, v6}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v6

    new-instance v7, Lrk/b;

    invoke-direct {v7, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v7

    invoke-virtual {v6, v7}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v6

    .line 30
    invoke-virtual {v4, v6}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v4

    const/16 v6, 0x14

    if-eqz p1, :cond_e

    .line 31
    new-instance v7, Lrk/b;

    invoke-direct {v7, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Lrk/b;->b(Lrk/b;)I

    move-result v7

    if-nez v7, :cond_d

    return-object v16

    .line 32
    :cond_d
    sget-object v7, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 33
    invoke-virtual {v5, v4, v6, v7}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v4

    goto :goto_9

    .line 34
    :cond_e
    invoke-virtual {v5, v4}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v4

    :goto_9
    if-eqz p1, :cond_10

    .line 35
    new-instance v5, Lrk/b;

    invoke-direct {v5, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Lrk/b;->b(Lrk/b;)I

    move-result v5

    if-nez v5, :cond_f

    return-object v16

    .line 36
    :cond_f
    invoke-virtual {v3, v4}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v3

    .line 37
    sget-object v4, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 38
    invoke-virtual {v3, v2, v6, v4}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v3

    .line 39
    new-instance v4, Lrk/b;

    invoke-direct {v4, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v3

    goto :goto_a

    .line 40
    :cond_10
    invoke-virtual {v4, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v4

    .line 41
    new-instance v5, Lrk/b;

    invoke-direct {v5, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lrk/b;->b(Lrk/b;)I

    move-result v5

    if-nez v5, :cond_11

    return-object v16

    .line 42
    :cond_11
    sget-object v5, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 43
    invoke-virtual {v3, v4, v6, v5}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v3

    .line 44
    new-instance v4, Lrk/b;

    invoke-direct {v4, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v3

    .line 45
    :goto_a
    new-instance v4, Lrk/b;

    invoke-direct {v4, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lrk/b;->b(Lrk/b;)I

    move-result v4

    if-gtz v4, :cond_12

    return-object v16

    .line 46
    :cond_12
    new-instance v4, Lrk/b;

    invoke-virtual {v3}, Lrk/b;->h()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->log(D)D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v2

    .line 47
    invoke-virtual {v10, v12}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v3

    new-instance v4, Lrk/b;

    invoke-direct {v4, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v3

    .line 48
    sget-object v4, Lrk/a;->a:Lrk/a;

    invoke-virtual {v4}, Lrk/a;->b()Lrk/b;

    move-result-object v5

    invoke-virtual {v13, v5}, Lrk/b;->b(Lrk/b;)I

    move-result v5

    if-ltz v5, :cond_13

    move-object v5, v13

    goto :goto_b

    .line 49
    :cond_13
    new-instance v5, Lrk/b;

    invoke-direct {v5, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v5}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v5

    .line 50
    :goto_b
    invoke-virtual {v11, v5}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v5

    .line 51
    invoke-virtual {v4}, Lrk/a;->b()Lrk/b;

    move-result-object v7

    invoke-virtual {v13, v7}, Lrk/b;->b(Lrk/b;)I

    move-result v7

    if-ltz v7, :cond_14

    goto :goto_c

    .line 52
    :cond_14
    new-instance v7, Lrk/b;

    invoke-direct {v7, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v7}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v7

    move-object v13, v7

    .line 53
    :goto_c
    invoke-virtual {v11, v13}, Lrk/b;->b(Lrk/b;)I

    move-result v7

    if-gez v7, :cond_15

    move-object v13, v11

    .line 54
    :cond_15
    invoke-virtual {v13, v9}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v7

    .line 55
    invoke-virtual {v5, v7}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v5

    .line 56
    invoke-virtual {v3, v5}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v3

    .line 57
    invoke-virtual {v4}, Lrk/a;->b()Lrk/b;

    move-result-object v5

    invoke-virtual {v0, v5}, Lrk/b;->b(Lrk/b;)I

    move-result v5

    if-ltz v5, :cond_16

    move-object v5, v0

    goto :goto_d

    .line 58
    :cond_16
    new-instance v5, Lrk/b;

    invoke-direct {v5, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v5

    .line 59
    :goto_d
    invoke-virtual {v3, v5}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v3

    if-eqz p18, :cond_19

    move-object/from16 v5, p18

    .line 60
    invoke-virtual {v5, v2}, Lrk/b;->b(Lrk/b;)I

    move-result v7

    if-gez v7, :cond_17

    goto :goto_e

    :cond_17
    move-object v5, v2

    :goto_e
    if-nez v5, :cond_18

    goto :goto_f

    :cond_18
    move-object v2, v5

    .line 61
    :cond_19
    :goto_f
    invoke-virtual {v2, v3}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object v2

    new-instance v3, Lrk/b;

    invoke-direct {v3, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 62
    invoke-virtual {v2, v3}, Lrk/b;->b(Lrk/b;)I

    move-result v5

    if-lez v5, :cond_1a

    goto :goto_10

    :cond_1a
    move-object v2, v3

    .line 63
    :goto_10
    new-instance v3, Lrk/b;

    invoke-direct {v3, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lrk/b;->b(Lrk/b;)I

    move-result v3

    if-nez v3, :cond_1b

    return-object v16

    .line 64
    :cond_1b
    invoke-virtual {v4}, Lrk/a;->b()Lrk/b;

    move-result-object v3

    invoke-virtual {v0, v3}, Lrk/b;->b(Lrk/b;)I

    move-result v3

    if-ltz v3, :cond_1c

    goto :goto_11

    .line 65
    :cond_1c
    new-instance v3, Lrk/b;

    invoke-direct {v3, v14}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v0

    .line 66
    :goto_11
    sget-object v3, Lcom/kubi/kmm/trade/KMMRoundingMode;->DOWN:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 67
    invoke-virtual {v2, v0, v6, v3}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v0

    move-object/from16 v2, p5

    .line 68
    invoke-virtual {v0, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object v4

    move/from16 v5, p3

    invoke-virtual {v4, v5, v3}, Lrk/b;->f(ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v4

    .line 69
    invoke-virtual {v0, v5, v3}, Lrk/b;->f(ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object v0

    .line 70
    new-instance v3, Lrk/b;

    invoke-direct {v3, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lrk/b;->b(Lrk/b;)I

    move-result v3

    if-eqz v3, :cond_20

    .line 71
    new-instance v3, Lrk/b;

    invoke-direct {v3, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 72
    invoke-virtual {v2, v3}, Lrk/b;->b(Lrk/b;)I

    move-result v2

    if-nez v2, :cond_1d

    goto :goto_12

    .line 73
    :cond_1d
    invoke-virtual {v4, v0}, Lrk/b;->b(Lrk/b;)I

    move-result v0

    if-nez v0, :cond_1f

    .line 74
    new-instance v0, Lrk/b;

    invoke-direct {v0, v15}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object v0

    new-instance v2, Lrk/b;

    invoke-direct {v2, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 75
    invoke-virtual {v0, v2}, Lrk/b;->b(Lrk/b;)I

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-lez v1, :cond_1e

    return-object v0

    :cond_1e
    return-object v2

    :cond_1f
    return-object v4

    :cond_20
    :goto_12
    return-object v0

    :catchall_1
    move-exception v0

    const/16 v16, 0x0

    .line 76
    :goto_13
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 77
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_21

    move-object/from16 v14, v16

    goto :goto_14

    :cond_21
    move-object v14, v0

    :goto_14
    check-cast v14, Lrk/b;

    return-object v14
.end method

.method public final h(Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 1
    .param p1    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "bidOrderMaintainMargin"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "askOrderMaintainMargin"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "bidPositionMaintainMargin"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "askPositionMaintainMargin"

    .line 18
    .line 19
    .line 20
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    const-string v0, "maintainMarginRateDiscount"

    .line 23
    .line 24
    .line 25
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p3}, Lrk/b;->a(Lrk/b;)Lrk/b;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, p4}, Lrk/b;->a(Lrk/b;)Lrk/b;

    .line 35
    move-result-object p2

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2}, Lrk/b;->a(Lrk/b;)Lrk/b;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3, p4}, Lrk/b;->b(Lrk/b;)I

    .line 43
    move-result p2

    .line 44
    .line 45
    if-gez p2, :cond_0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object p3, p4

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-virtual {p3, p5}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 51
    move-result-object p2

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2}, Lrk/b;->g(Lrk/b;)Lrk/b;

    .line 55
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    return-object p1

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    .line 59
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 71
    move-result p2

    .line 72
    .line 73
    if-eqz p2, :cond_1

    .line 74
    const/4 p1, 0x0

    .line 75
    .line 76
    :cond_1
    check-cast p1, Ljava/lang/Void;

    .line 77
    .line 78
    if-eqz p1, :cond_2

    .line 79
    .line 80
    check-cast p1, Lrk/b;

    .line 81
    goto :goto_1

    .line 82
    .line 83
    :cond_2
    new-instance p1, Lrk/b;

    .line 84
    .line 85
    const-string p2, "0"

    .line 86
    .line 87
    .line 88
    invoke-direct {p1, p2}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 89
    :goto_1
    return-object p1
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
.end method

.method public final i(Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 3
    .param p1    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "multiplier"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "bidOrderQty"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "bidPositionQty"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "askOrderQty"

    .line 18
    .line 19
    .line 20
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    const-string v0, "askPositionQty"

    .line 23
    .line 24
    .line 25
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 28
    .line 29
    sget-object v0, Lrk/a;->a:Lrk/a;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lrk/a;->b()Lrk/b;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3, v1}, Lrk/b;->b(Lrk/b;)I

    .line 37
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    const-string v2, "-1"

    .line 40
    .line 41
    if-ltz v1, :cond_0

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :cond_0
    :try_start_1
    new-instance v1, Lrk/b;

    .line 45
    .line 46
    .line 47
    invoke-direct {v1, v2}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3, v1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 51
    move-result-object p3

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {p2, p3}, Lrk/b;->a(Lrk/b;)Lrk/b;

    .line 55
    move-result-object p2

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lrk/a;->b()Lrk/b;

    .line 59
    move-result-object p3

    .line 60
    .line 61
    .line 62
    invoke-virtual {p5, p3}, Lrk/b;->b(Lrk/b;)I

    .line 63
    move-result p3

    .line 64
    .line 65
    if-ltz p3, :cond_1

    .line 66
    goto :goto_1

    .line 67
    .line 68
    :cond_1
    new-instance p3, Lrk/b;

    .line 69
    .line 70
    .line 71
    invoke-direct {p3, v2}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p5, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 75
    move-result-object p5

    .line 76
    .line 77
    .line 78
    :goto_1
    invoke-virtual {p4, p5}, Lrk/b;->a(Lrk/b;)Lrk/b;

    .line 79
    move-result-object p3

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, p3}, Lrk/b;->b(Lrk/b;)I

    .line 83
    move-result p4

    .line 84
    .line 85
    if-lez p4, :cond_2

    .line 86
    goto :goto_2

    .line 87
    :cond_2
    move-object p2, p3

    .line 88
    .line 89
    .line 90
    :goto_2
    invoke-virtual {v0}, Lrk/a;->b()Lrk/b;

    .line 91
    move-result-object p3

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p3}, Lrk/b;->b(Lrk/b;)I

    .line 95
    move-result p3

    .line 96
    .line 97
    if-ltz p3, :cond_3

    .line 98
    goto :goto_3

    .line 99
    .line 100
    :cond_3
    new-instance p3, Lrk/b;

    .line 101
    .line 102
    .line 103
    invoke-direct {p3, v2}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    .line 110
    :goto_3
    invoke-virtual {p2, p1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    goto :goto_4

    .line 117
    :catchall_0
    move-exception p1

    .line 118
    .line 119
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 120
    .line 121
    .line 122
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    .line 126
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    move-result-object p1

    .line 128
    .line 129
    .line 130
    :goto_4
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 131
    move-result p2

    .line 132
    .line 133
    if-eqz p2, :cond_4

    .line 134
    const/4 p1, 0x0

    .line 135
    .line 136
    :cond_4
    check-cast p1, Lrk/b;

    .line 137
    .line 138
    if-nez p1, :cond_5

    .line 139
    .line 140
    new-instance p1, Lrk/b;

    .line 141
    .line 142
    const-string p2, "0"

    .line 143
    .line 144
    .line 145
    invoke-direct {p1, p2}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 146
    :cond_5
    return-object p1
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
.end method

.method public final j(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 4
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "multiplier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bidOrderQty"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bidPositionQty"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "askOrderQty"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "askPositionQty"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markPrice"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "takerFeeRate"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 2
    sget-object v1, Lrk/a;->a:Lrk/a;

    invoke-virtual {v1}, Lrk/a;->b()Lrk/b;

    move-result-object v2

    invoke-virtual {p4, v2}, Lrk/b;->b(Lrk/b;)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, "-1"

    if-ltz v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    :try_start_1
    new-instance v2, Lrk/b;

    invoke-direct {v2, v3}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p4

    .line 4
    :goto_0
    invoke-virtual {p3, p4}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object p3

    .line 5
    invoke-virtual {v1}, Lrk/a;->b()Lrk/b;

    move-result-object p4

    invoke-virtual {p6, p4}, Lrk/b;->b(Lrk/b;)I

    move-result p4

    if-ltz p4, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    new-instance p4, Lrk/b;

    invoke-direct {p4, v3}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p6, p4}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p6

    .line 7
    :goto_1
    invoke-virtual {p5, p6}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object p4

    invoke-virtual {p3, p4}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object p3

    .line 8
    sget-object p4, Luk/b;->a:Luk/b;

    .line 9
    invoke-virtual {p4, p1, p2, p7, p3}, Luk/b;->g(ZLrk/b;Lrk/b;Lrk/b;)Lrk/b;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v0

    .line 10
    :cond_2
    invoke-virtual {v1}, Lrk/a;->b()Lrk/b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lrk/b;->b(Lrk/b;)I

    move-result p2

    if-ltz p2, :cond_3

    goto :goto_2

    .line 11
    :cond_3
    new-instance p2, Lrk/b;

    invoke-direct {p2, v3}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p1

    .line 12
    :goto_2
    invoke-virtual {p1, p8}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 13
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_3

    :cond_4
    move-object v0, p1

    :goto_3
    check-cast v0, Lrk/b;

    return-object v0
.end method

.method public final k(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 4
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "multiplier"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "bidOrderQty"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "askOrderQty"

    .line 13
    .line 14
    .line 15
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "markPrice"

    .line 18
    .line 19
    .line 20
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    const-string v0, "takerFeeRate"

    .line 23
    .line 24
    .line 25
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    const-string v0, "taxRate"

    .line 28
    .line 29
    .line 30
    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    const/4 v0, 0x0

    .line 32
    .line 33
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 34
    .line 35
    sget-object v1, Lrk/a;->a:Lrk/a;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lrk/a;->b()Lrk/b;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3, v2}, Lrk/b;->b(Lrk/b;)I

    .line 43
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    const-string v3, "-1"

    .line 46
    .line 47
    if-ltz v2, :cond_0

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_0
    :try_start_1
    new-instance v2, Lrk/b;

    .line 51
    .line 52
    .line 53
    invoke-direct {v2, v3}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 57
    move-result-object p3

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-virtual {v1}, Lrk/a;->b()Lrk/b;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    .line 64
    invoke-virtual {p4, v2}, Lrk/b;->b(Lrk/b;)I

    .line 65
    move-result v2

    .line 66
    .line 67
    if-ltz v2, :cond_1

    .line 68
    goto :goto_1

    .line 69
    .line 70
    :cond_1
    new-instance v2, Lrk/b;

    .line 71
    .line 72
    .line 73
    invoke-direct {v2, v3}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p4, v2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 77
    move-result-object p4

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-virtual {p3, p4}, Lrk/b;->a(Lrk/b;)Lrk/b;

    .line 81
    move-result-object p3

    .line 82
    .line 83
    sget-object p4, Luk/b;->a:Luk/b;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p4, p1, p2, p5, p3}, Luk/b;->g(ZLrk/b;Lrk/b;Lrk/b;)Lrk/b;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    if-nez p1, :cond_2

    .line 90
    return-object v0

    .line 91
    .line 92
    .line 93
    :cond_2
    invoke-virtual {v1}, Lrk/a;->b()Lrk/b;

    .line 94
    move-result-object p2

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p2}, Lrk/b;->b(Lrk/b;)I

    .line 98
    move-result p2

    .line 99
    .line 100
    if-ltz p2, :cond_3

    .line 101
    goto :goto_2

    .line 102
    .line 103
    :cond_3
    new-instance p2, Lrk/b;

    .line 104
    .line 105
    .line 106
    invoke-direct {p2, v3}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    :goto_2
    new-instance p2, Lrk/b;

    .line 113
    .line 114
    const-string p3, "1"

    .line 115
    .line 116
    .line 117
    invoke-direct {p2, p3}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2, p7}, Lrk/b;->a(Lrk/b;)Lrk/b;

    .line 121
    move-result-object p2

    .line 122
    .line 123
    .line 124
    invoke-virtual {p6, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 125
    move-result-object p2

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, p2}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 129
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    return-object p1

    .line 131
    :catchall_0
    move-exception p1

    .line 132
    .line 133
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 134
    .line 135
    .line 136
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 137
    move-result-object p1

    .line 138
    .line 139
    .line 140
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    move-result-object p1

    .line 142
    .line 143
    .line 144
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 145
    move-result p2

    .line 146
    .line 147
    if-eqz p2, :cond_4

    .line 148
    goto :goto_3

    .line 149
    :cond_4
    move-object v0, p1

    .line 150
    .line 151
    :goto_3
    check-cast v0, Lrk/b;

    .line 152
    return-object v0
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
.end method

.method public final l(Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 1
    .param p1    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "totalMargin"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "posOrderMM"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "closeFee"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "openFee"

    .line 18
    .line 19
    .line 20
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, p3}, Lrk/b;->a(Lrk/b;)Lrk/b;

    .line 26
    move-result-object p2

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p4}, Lrk/b;->g(Lrk/b;)Lrk/b;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    sget-object p3, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 33
    .line 34
    const/16 p4, 0x14

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, p1, p4, p3}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    .line 46
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    .line 57
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 58
    move-result p2

    .line 59
    .line 60
    if-eqz p2, :cond_0

    .line 61
    const/4 p1, 0x0

    .line 62
    .line 63
    :cond_0
    check-cast p1, Lrk/b;

    .line 64
    return-object p1
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
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method

.method public final m(Lrk/b;Lrk/b;)Lrk/b;
    .locals 3
    .param p1    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "unrealizedPnl"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "initMargin"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 14
    .line 15
    new-instance v1, Lrk/b;

    .line 16
    .line 17
    const-string v2, "0"

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, v1}, Lrk/b;->b(Lrk/b;)I

    .line 24
    move-result v1

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    return-object v0

    .line 28
    .line 29
    :cond_0
    sget-object v1, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 30
    .line 31
    const/16 v2, 0x14

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2, v2, v1}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 35
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    return-object p1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    .line 39
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 51
    move-result p2

    .line 52
    .line 53
    if-eqz p2, :cond_1

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v0, p1

    .line 56
    .line 57
    :goto_0
    check-cast v0, Lrk/b;

    .line 58
    return-object v0
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
.end method
