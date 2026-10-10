.class public final Lcom/kubi/futures/trade/welfare/f0;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "FuturesWelfareAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/futures/trade/welfare/f0$a;,
        Lcom/kubi/futures/trade/welfare/f0$b;,
        Lcom/kubi/futures/trade/welfare/f0$c;,
        Lcom/kubi/futures/trade/welfare/f0$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0015\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0004efghB\u00bb\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012O\u0008\u0002\u0010\u0007\u001aI\u0012\u0013\u0012\u00110\t\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000c\u0012\u0013\u0012\u00110\r\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000e\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0008\u0012O\u0008\u0002\u0010\u0012\u001aI\u0012\u0013\u0012\u00110\t\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000c\u0012\u0013\u0012\u00110\r\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000e\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\rH\u0016J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0008\u0010 \u001a\u00020\rH\u0016J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0014\u0010\"\u001a\u00020\u00112\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000f0$J\u0014\u0010%\u001a\u00020\u00112\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000f0$J\u0010\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\'\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u00112\u0006\u0010,\u001a\u00020-H\u0002J\u0012\u0010/\u001a\u00020\u00112\u0008\u00100\u001a\u0004\u0018\u000101H\u0002J\u0010\u00102\u001a\u00020\u00112\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u000205H\u0002J\u0018\u00106\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u00108\u001a\u000205H\u0002J\u0018\u00109\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010:\u001a\u00020\u0006H\u0002J \u0010;\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u00104\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0006H\u0002J9\u0010>\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0008\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010:\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u00062\u0008\u0008\u0002\u0010B\u001a\u00020\u0006H\u0002\u00a2\u0006\u0002\u0010CJ(\u0010D\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u00104\u001a\u00020<2\u0006\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u000201H\u0002J\u0010\u0010G\u001a\u0002012\u0006\u0010H\u001a\u00020@H\u0002J\u0018\u0010I\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010J\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010K\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u000207H\u0002J \u0010L\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-2\u0006\u0010:\u001a\u00020\u0006H\u0002J\u0018\u0010M\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-H\u0002J \u0010N\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010O\u001a\u0002012\u0006\u0010:\u001a\u00020\u0006H\u0002J\u0018\u0010P\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010Q\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-H\u0002J(\u0010R\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-2\u0006\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u000201H\u0002J(\u0010S\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-2\u0006\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u000201H\u0002J(\u0010T\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-2\u0006\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u000201H\u0002J)\u0010U\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020Y0W0V2\u0008\u0008\u0001\u0010Z\u001a\u00020\rH\u0002\u00a2\u0006\u0002\u0010[J(\u0010\\\u001a\u00020\u00112\u0006\u0010E\u001a\u00020\r2\u0006\u0010\u001f\u001a\u0002072\u0006\u0010,\u001a\u00020-2\u0006\u0010]\u001a\u00020\u0006H\u0002J\u0018\u0010^\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020_2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010`\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020a2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010b\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u0002072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010c\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020d2\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000RU\u0010\u0007\u001aI\u0012\u0013\u0012\u00110\t\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000c\u0012\u0013\u0012\u00110\r\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000e\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000RU\u0010\u0012\u001aI\u0012\u0013\u0012\u00110\t\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000c\u0012\u0013\u0012\u00110\r\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u000e\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006i"
    }
    d2 = {
        "Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "manager",
        "Landroidx/fragment/app/FragmentManager;",
        "select",
        "",
        "actionClick",
        "Lkotlin/Function3;",
        "Landroid/view/View;",
        "Lkotlin/ParameterName;",
        "name",
        "view",
        "",
        "position",
        "Lcom/kubi/kumex/data/platform/model/FuturesWelfareType;",
        "futuresWelfareType",
        "",
        "withdrawClick",
        "<init>",
        "(Landroidx/fragment/app/FragmentManager;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V",
        "realWidth",
        "",
        "realHeight",
        "datas",
        "",
        "onCreateViewHolder",
        "parent",
        "Landroid/view/ViewGroup;",
        "viewType",
        "onBindViewHolder",
        "holder",
        "getItemCount",
        "getItemViewType",
        "appendNotifyChanged",
        "list",
        "",
        "notifyChanged",
        "getItem",
        "createWelfareViewHolder",
        "createAssetsViewHolder",
        "createSubTitleViewHolder",
        "createFooterViewHolder",
        "showTrialRuleDialog",
        "trial",
        "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;",
        "showTradeProTrialRulePage",
        "showWithdrawRuleDialog",
        "message",
        "",
        "showAirdropRuleDialog",
        "showCouponRuleDialog",
        "coupon",
        "Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;",
        "bindCouponViewHolder",
        "Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter$WelfareViewHolder;",
        "entity",
        "setCouponLeftLeverageImage",
        "isExpired",
        "setCouponLeftData",
        "Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;",
        "isExpire",
        "setExpireTime",
        "expireTime",
        "",
        "isTrial",
        "useContentSpacer",
        "(Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter$WelfareViewHolder;Ljava/lang/Long;ZZZ)V",
        "setCouponDesc",
        "precision",
        "currency",
        "getTime",
        "time",
        "bindTrialViewHolder",
        "bindTradeProTrialViewHolder",
        "resetTradeProExclusiveViews",
        "bindTradeProTrialDetail",
        "bindAirdropViewHolder",
        "setTrialLeftLeverageImage",
        "type",
        "setTrialAction",
        "setAirdropDesc",
        "setTrialDesc",
        "setMiniTraAmount",
        "setMiniProRequirement",
        "getTagStyle",
        "",
        "Lkotlin/Pair;",
        "Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;",
        "Landroid/text/style/CharacterStyle;",
        "colorRes",
        "(I)[Lkotlin/Pair;",
        "bindTrialLeftData",
        "isAirdropTag",
        "bindSubTitleViewHolder",
        "Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter$SubTitleViewHolder;",
        "bindFooterViewHolder",
        "Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter$FooterViewHolder;",
        "bindWelfareViewHolder",
        "bindAssetsViewHolder",
        "Lcom/kubi/futures/trade/welfare/FuturesWelfareAdapter$AssetsViewHolder;",
        "WelfareViewHolder",
        "SubTitleViewHolder",
        "FooterViewHolder",
        "AssetsViewHolder",
        "KumexLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFuturesWelfareAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesWelfareAdapter.kt\ncom/kubi/futures/trade/welfare/FuturesWelfareAdapter\n+ 2 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1200:1\n20#2:1201\n20#2:1206\n20#2:1207\n20#2:1208\n20#2:1241\n326#3,4:1202\n326#3,4:1213\n310#3:1217\n326#3,4:1218\n311#3:1222\n310#3:1223\n326#3,4:1224\n311#3:1228\n310#3:1229\n326#3,4:1230\n311#3:1234\n310#3:1235\n326#3,4:1236\n311#3:1240\n37#4:1209\n36#4,3:1210\n*S KotlinDebug\n*F\n+ 1 FuturesWelfareAdapter.kt\ncom/kubi/futures/trade/welfare/FuturesWelfareAdapter\n*L\n363#1:1201\n561#1:1206\n626#1:1207\n706#1:1208\n1081#1:1241\n456#1:1202,4\n1024#1:1213,4\n1049#1:1217\n1049#1:1218,4\n1049#1:1222\n1054#1:1223\n1054#1:1224,4\n1054#1:1228\n1057#1:1229\n1057#1:1230,4\n1057#1:1234\n1062#1:1235\n1062#1:1236,4\n1062#1:1240\n971#1:1209\n971#1:1210,3\n*E\n"
    }
.end annotation


# instance fields
.field public final i:Landroidx/fragment/app/FragmentManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Z

.field public final k:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroid/view/View;",
            "Ljava/lang/Integer;",
            "Lbm/f;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final l:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroid/view/View;",
            "Ljava/lang/Integer;",
            "Lbm/f;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final m:F

.field public final n:I

.field public final o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lbm/f;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentManager;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V
    .locals 1
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function3;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function3;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentManager;",
            "Z",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroid/view/View;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Lbm/f;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroid/view/View;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Lbm/f;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "manager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/kubi/futures/trade/welfare/f0;->i:Landroidx/fragment/app/FragmentManager;

    .line 4
    iput-boolean p2, p0, Lcom/kubi/futures/trade/welfare/f0;->j:Z

    .line 5
    iput-object p3, p0, Lcom/kubi/futures/trade/welfare/f0;->k:Lkotlin/jvm/functions/Function3;

    .line 6
    iput-object p4, p0, Lcom/kubi/futures/trade/welfare/f0;->l:Lkotlin/jvm/functions/Function3;

    .line 7
    invoke-static {}, Lcom/blankj/utilcode/util/e0;->b()I

    move-result p1

    int-to-float p1, p1

    sget-object p2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    invoke-virtual {p2}, Lcom/kubi/utils/c;->b()Landroid/content/Context;

    move-result-object p2

    const/16 p3, 0x20

    invoke-static {p2, p3}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    move-result p2

    sub-float/2addr p1, p2

    iput p1, p0, Lcom/kubi/futures/trade/welfare/f0;->m:F

    const/16 p2, 0x108

    int-to-float p2, p2

    mul-float/2addr p1, p2

    const p2, 0x44068000    # 538.0f

    div-float/2addr p1, p2

    float-to-int p1, p1

    .line 8
    iput p1, p0, Lcom/kubi/futures/trade/welfare/f0;->n:I

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/kubi/futures/trade/welfare/f0;->o:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentManager;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    .line 1
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/kubi/futures/trade/welfare/f0;-><init>(Landroidx/fragment/app/FragmentManager;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V

    return-void
.end method

.method public static final A(Lcom/kubi/futures/trade/welfare/f0$a;Lcom/kubi/futures/trade/welfare/f0;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 4
    move-result p0

    .line 5
    .line 6
    if-gez p0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0

    .line 10
    .line 11
    :cond_0
    iget-object v0, p1, Lcom/kubi/futures/trade/welfare/f0;->o:Ljava/util/List;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    check-cast p0, Lbm/f;

    .line 18
    .line 19
    instance-of v0, p0, Lbm/b;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    return-object p0

    .line 25
    .line 26
    :cond_1
    check-cast p0, Lbm/b;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lbm/b;->a()Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;

    .line 30
    move-result-object p0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getWithDrawHelpText()Ljava/lang/String;

    .line 34
    move-result-object p0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p0}, Lcom/kubi/futures/trade/welfare/f0;->a0(Ljava/lang/String;)V

    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 40
    return-object p0
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
.end method

.method public static final E(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/futures/trade/welfare/f0;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 4
    move-result p0

    .line 5
    .line 6
    if-gez p0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0

    .line 10
    .line 11
    :cond_0
    iget-object v0, p1, Lcom/kubi/futures/trade/welfare/f0;->o:Ljava/util/List;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    check-cast p0, Lbm/f;

    .line 18
    .line 19
    instance-of v0, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    check-cast p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, Lcom/kubi/futures/trade/welfare/f0;->X(Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;)V

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_1
    instance-of v0, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;

    .line 30
    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    check-cast p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getPrizeType()Ljava/lang/String;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lcom/kubi/utils/t0;->b(Ljava/lang/String;)Z

    .line 41
    move-result v0

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, Lcom/kubi/futures/trade/welfare/f0;->W(Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V

    .line 47
    goto :goto_0

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->isTradeProTrial()Z

    .line 51
    move-result v0

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p0}, Lcom/kubi/futures/trade/welfare/f0;->Y(Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V

    .line 57
    goto :goto_0

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-virtual {p1, p0}, Lcom/kubi/futures/trade/welfare/f0;->Z(Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V

    .line 61
    .line 62
    :cond_4
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 63
    return-object p0
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
.end method

.method public static final F(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/futures/trade/welfare/f0;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-gez v0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0

    .line 10
    .line 11
    :cond_0
    iget-object v1, p1, Lcom/kubi/futures/trade/welfare/f0;->o:Ljava/util/List;

    .line 12
    .line 13
    .line 14
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    check-cast v1, Lbm/f;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/kubi/futures/trade/welfare/f0;->k:Lkotlin/jvm/functions/Function3;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 25
    move-result-object p0

    .line 26
    .line 27
    const-string v2, "<get-action>(...)"

    .line 28
    .line 29
    .line 30
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, p0, v0, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 40
    return-object p0
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
.end method

.method public static final G(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/futures/trade/welfare/f0;Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 4
    move-result p2

    .line 5
    .line 6
    if-gez p2, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    iget-object p3, p1, Lcom/kubi/futures/trade/welfare/f0;->o:Ljava/util/List;

    .line 10
    .line 11
    .line 12
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    move-result-object p3

    .line 14
    .line 15
    check-cast p3, Lbm/f;

    .line 16
    .line 17
    iget-object p1, p1, Lcom/kubi/futures/trade/welfare/f0;->k:Lkotlin/jvm/functions/Function3;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 23
    move-result-object p0

    .line 24
    .line 25
    const-string v0, "<get-checkBox>(...)"

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, p0, p2, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    :cond_1
    :goto_0
    return-void
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
.end method

.method public static synthetic Q(Lcom/kubi/futures/trade/welfare/f0;Lcom/kubi/futures/trade/welfare/f0$d;Ljava/lang/Long;ZZZILjava/lang/Object;)V
    .locals 6

    .line 1
    .line 2
    and-int/lit8 p6, p6, 0x10

    .line 3
    .line 4
    if-eqz p6, :cond_0

    .line 5
    const/4 p5, 0x0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move v3, p3

    .line 10
    move v4, p4

    .line 11
    move v5, p5

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/futures/trade/welfare/f0;->P(Lcom/kubi/futures/trade/welfare/f0$d;Ljava/lang/Long;ZZZ)V

    .line 15
    return-void
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
.end method

.method public static final b0(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

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
.end method

.method public static synthetic g(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/futures/trade/welfare/f0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/welfare/f0;->E(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/futures/trade/welfare/f0;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic h(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/futures/trade/welfare/f0;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/futures/trade/welfare/f0;->G(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/futures/trade/welfare/f0;Landroid/widget/CompoundButton;Z)V

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
.end method

.method public static synthetic i(Lcom/kubi/futures/trade/welfare/f0$a;Lcom/kubi/futures/trade/welfare/f0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/welfare/f0;->y(Lcom/kubi/futures/trade/welfare/f0$a;Lcom/kubi/futures/trade/welfare/f0;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic j(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/futures/trade/welfare/f0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/welfare/f0;->F(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/futures/trade/welfare/f0;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic k(Lcom/kubi/futures/trade/welfare/f0$a;Lcom/kubi/futures/trade/welfare/f0;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/welfare/f0;->A(Lcom/kubi/futures/trade/welfare/f0$a;Lcom/kubi/futures/trade/welfare/f0;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic l(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/welfare/f0;->b0(Landroid/content/DialogInterface;I)V

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
.end method

.method public static final y(Lcom/kubi/futures/trade/welfare/f0$a;Lcom/kubi/futures/trade/welfare/f0;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-gez v0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0

    .line 10
    .line 11
    :cond_0
    iget-object v1, p1, Lcom/kubi/futures/trade/welfare/f0;->o:Ljava/util/List;

    .line 12
    .line 13
    .line 14
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    check-cast v1, Lbm/f;

    .line 18
    .line 19
    instance-of v2, v1, Lbm/b;

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    return-object p0

    .line 25
    .line 26
    :cond_1
    iget-object p1, p1, Lcom/kubi/futures/trade/welfare/f0;->l:Lkotlin/jvm/functions/Function3;

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/futures/trade/welfare/f0$a;->f()Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    const-string v2, "<get-withdraw>(...)"

    .line 35
    .line 36
    .line 37
    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, p0, v0, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    :cond_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 47
    return-object p0
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
.end method


# virtual methods
.method public final B(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Landroidx/appcompat/widget/AppCompatTextView;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 14
    .line 15
    const/high16 v1, 0x41400000    # 12.0f

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 19
    .line 20
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 21
    .line 22
    sget v2, Lcom/kubi/kumex/R$color;->c_text40:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 26
    move-result v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    sget v2, Lcom/kubi/kumex/R$font;->regular:I

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 43
    .line 44
    new-instance v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 45
    const/4 v2, -0x1

    .line 46
    const/4 v3, -0x2

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    const-string v3, "getContext(...)"

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    const/16 v4, 0x10

    .line 61
    .line 62
    .line 63
    invoke-static {v2, v4}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 64
    move-result v2

    .line 65
    float-to-int v2, v2

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    const/16 v3, 0x8

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v3}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 78
    move-result p1

    .line 79
    float-to-int p1, p1

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 86
    .line 87
    iput p1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 88
    .line 89
    iput p1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    .line 94
    new-instance p1, Lcom/kubi/futures/trade/welfare/f0$b;

    .line 95
    .line 96
    .line 97
    invoke-direct {p1, v0}, Lcom/kubi/futures/trade/welfare/f0$b;-><init>(Landroid/view/View;)V

    .line 98
    return-object p1
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
.end method

.method public final C(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Landroidx/appcompat/widget/AppCompatTextView;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    const/high16 v1, 0x41600000    # 14.0f

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 15
    .line 16
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 17
    .line 18
    sget v2, Lcom/kubi/kumex/R$color;->c_text60:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 22
    move-result v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    sget v2, Lcom/kubi/kumex/R$font;->medium:I

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 39
    .line 40
    new-instance v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 41
    const/4 v2, -0x1

    .line 42
    const/4 v3, -0x2

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    const-string v2, "getContext(...)"

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    const/16 v2, 0x10

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v2}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 60
    move-result p1

    .line 61
    float-to-int p1, p1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 71
    .line 72
    new-instance p1, Lcom/kubi/futures/trade/welfare/f0$c;

    .line 73
    .line 74
    .line 75
    invoke-direct {p1, v0}, Lcom/kubi/futures/trade/welfare/f0$c;-><init>(Landroid/view/View;)V

    .line 76
    return-object p1
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
.end method

.method public final D(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sget v1, Lcom/kubi/kumex/R$layout;->bkumex_futures_welfare_trial_item:I

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    new-instance v0, Lcom/kubi/futures/trade/welfare/f0$d;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p1}, Lcom/kubi/futures/trade/welfare/f0$d;-><init>(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/kubi/futures/trade/welfare/f0$d;->g()Landroidx/appcompat/widget/AppCompatTextView;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    const-string p1, "<get-condition>(...)"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    new-instance v4, Lcom/kubi/futures/trade/welfare/b0;

    .line 35
    .line 36
    .line 37
    invoke-direct {v4, v0, p0}, Lcom/kubi/futures/trade/welfare/b0;-><init>(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/futures/trade/welfare/f0;)V

    .line 38
    const/4 v5, 0x1

    .line 39
    const/4 v6, 0x0

    .line 40
    .line 41
    const-wide/16 v2, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 48
    move-result-object v7

    .line 49
    .line 50
    const-string p1, "<get-action>(...)"

    .line 51
    .line 52
    .line 53
    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    new-instance v10, Lcom/kubi/futures/trade/welfare/c0;

    .line 56
    .line 57
    .line 58
    invoke-direct {v10, v0, p0}, Lcom/kubi/futures/trade/welfare/c0;-><init>(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/futures/trade/welfare/f0;)V

    .line 59
    const/4 v11, 0x1

    .line 60
    const/4 v12, 0x0

    .line 61
    .line 62
    const-wide/16 v8, 0x0

    .line 63
    .line 64
    .line 65
    invoke-static/range {v7 .. v12}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    new-instance v1, Lcom/kubi/futures/trade/welfare/d0;

    .line 72
    .line 73
    .line 74
    invoke-direct {v1, v0, p0}, Lcom/kubi/futures/trade/welfare/d0;-><init>(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/futures/trade/welfare/f0;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 78
    return-object v0
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
.end method

.method public final H(I)[Lkotlin/Pair;
    .locals 5
    .param p1    # I
        .annotation build Landroidx/annotation/ColorRes;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Lkotlin/Pair<",
            "Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;",
            "Landroid/text/style/CharacterStyle;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lkotlin/Pair;

    .line 8
    .line 9
    sget-object v2, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 10
    .line 11
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    .line 12
    .line 13
    sget-object v4, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, p1}, Lcom/kubi/utils/c;->a(I)I

    .line 17
    move-result p1

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v1, 0x1c

    .line 31
    .line 32
    if-le p1, v1, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Lcom/kubi/utils/c;->b()Landroid/content/Context;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    sget v1, Lcom/kubi/kumex/R$font;->medium:I

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v1}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Lcom/kubi/futures/trade/welfare/y;->a(Landroid/graphics/Typeface;)Landroid/text/style/TypefaceSpan;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    new-instance v1, Lkotlin/Pair;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    :cond_0
    const/4 p1, 0x0

    .line 58
    .line 59
    new-array p1, p1, [Lkotlin/Pair;

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    check-cast p1, [Lkotlin/Pair;

    .line 66
    return-object p1
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
.end method

.method public final I(J)Ljava/lang/String;
    .locals 8

    .line 1
    .line 2
    const/16 v6, 0xb

    .line 3
    const/4 v7, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    const/4 v5, 0x0

    .line 8
    move-wide v0, p1

    .line 9
    .line 10
    .line 11
    invoke-static/range {v0 .. v7}, Llf/a;->f(JLjava/util/Locale;ZZLjava/util/TimeZone;ILjava/lang/Object;)Ljava/lang/String;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method

.method public final J(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lbm/f;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "list"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0;->o:Ljava/util/List;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0;->o:Ljava/util/List;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 19
    return-void
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
.end method

.method public final K(Lcom/kubi/futures/trade/welfare/f0$d;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "<get-desc>(...)"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->k()Landroidx/appcompat/widget/AppCompatTextView;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    const-string v1, "<get-holdingPeriodDesc>(...)"

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->p()Landroid/widget/ProgressBar;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    const-string v1, "<get-progress>(...)"

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->i()Landroidx/appcompat/widget/AppCompatTextView;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    const-string v1, "<get-expireTag>(...)"

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->e()Landroidx/appcompat/widget/AppCompatTextView;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    const-string v1, "<get-api>(...)"

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->o()Landroidx/appcompat/widget/AppCompatTextView;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    const-string v1, "<get-miniTraAmount>(...)"

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->n()Landroidx/appcompat/widget/AppCompatTextView;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    const-string v0, "<get-miniProRequirement>(...)"

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 85
    return-void
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
.end method

.method public final L(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getContractList()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getSupportedContracts()Ljava/util/List;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 25
    move-result-object p2

    .line 26
    move-object v0, p2

    .line 27
    .line 28
    check-cast v0, Ljava/lang/String;

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v0, v1

    .line 31
    .line 32
    :cond_2
    :goto_0
    const-string p2, "<get-desc>(...)"

    .line 33
    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    invoke-static {v2, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 45
    .line 46
    sget-object v2, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 50
    move-result-object v2

    .line 51
    const/4 v3, 0x2

    .line 52
    const/4 v4, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static {v2, v0, v4, v3, v1}, Lth/d;->O(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    sget-object v2, Lcom/kubi/futures/a;->a:Lcom/kubi/futures/a;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v1}, Lcom/kubi/futures/a;->e(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Lcom/kubi/utils/v0;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    move-object v0, v1

    .line 68
    .line 69
    .line 70
    :cond_3
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    new-instance v2, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 79
    .line 80
    sget v5, Lcom/kubi/kumex/R$string;->kc_symbol_enable_title:I

    .line 81
    .line 82
    new-array v4, v4, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v5, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    move-result-object v3

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const/16 v3, 0x20

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    sget-object v0, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    .line 113
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    sget p2, Lcom/kubi/kumex/R$color;->c_text60:I

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p2}, Lcom/kubi/futures/trade/welfare/f0;->H(I)[Lkotlin/Pair;

    .line 119
    move-result-object p2

    .line 120
    array-length v1, p2

    .line 121
    .line 122
    .line 123
    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 124
    move-result-object p2

    .line 125
    .line 126
    check-cast p2, [Lkotlin/Pair;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, p1, p2}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 130
    return-void

    .line 131
    .line 132
    .line 133
    :cond_4
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 134
    move-result-object p1

    .line 135
    .line 136
    .line 137
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 141
    return-void
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
.end method

.method public final M(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;ILjava/lang/String;)V
    .locals 27

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p4

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    const/high16 v3, 0x3f800000    # 1.0f

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getDeductedAmount()Ljava/math/BigDecimal;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 21
    move-result-object v4

    .line 22
    .line 23
    .line 24
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getStatus()Ljava/lang/String;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    const-string v14, "EXPIRED"

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v2

    .line 32
    .line 33
    const-string v5, "<get-progress>(...)"

    .line 34
    .line 35
    const-string v15, "<get-desc>(...)"

    .line 36
    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    sget-object v2, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 43
    move-result v2

    .line 44
    .line 45
    if-lez v2, :cond_0

    .line 46
    .line 47
    .line 48
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->p()Landroid/widget/ProgressBar;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    .line 52
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 59
    move-result-object v2

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    sget-object v5, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 72
    .line 73
    sget v6, Lcom/kubi/kumex/R$color;->c_text60:I

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v6}, Lcom/kubi/utils/c;->a(I)I

    .line 77
    move-result v6

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 84
    move-result-object v2

    .line 85
    .line 86
    sget v6, Lcom/kubi/kumex/R$string;->kumex_welfare_coupon_item_amount:I

    .line 87
    .line 88
    const/16 v12, 0x79

    .line 89
    const/4 v13, 0x0

    .line 90
    move-object v7, v5

    .line 91
    const/4 v5, 0x0

    .line 92
    move-object v8, v7

    .line 93
    const/4 v7, 0x1

    .line 94
    move-object v9, v8

    .line 95
    const/4 v8, 0x0

    .line 96
    move-object v10, v9

    .line 97
    const/4 v9, 0x0

    .line 98
    move-object v11, v10

    .line 99
    const/4 v10, 0x0

    .line 100
    .line 101
    move-object/from16 v16, v11

    .line 102
    const/4 v11, 0x0

    .line 103
    .line 104
    move-object/from16 v3, v16

    .line 105
    .line 106
    move-object/from16 v16, v14

    .line 107
    move v14, v6

    .line 108
    .line 109
    move/from16 v6, p3

    .line 110
    .line 111
    .line 112
    invoke-static/range {v4 .. v13}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 113
    move-result-object v5

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getFaceValue()Ljava/math/BigDecimal;

    .line 117
    move-result-object v6

    .line 118
    .line 119
    .line 120
    invoke-static {v6}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 121
    move-result-object v17

    .line 122
    .line 123
    const/16 v25, 0x79

    .line 124
    .line 125
    const/16 v26, 0x0

    .line 126
    .line 127
    const/16 v18, 0x0

    .line 128
    .line 129
    const/16 v20, 0x1

    .line 130
    .line 131
    const/16 v21, 0x0

    .line 132
    .line 133
    const/16 v22, 0x0

    .line 134
    .line 135
    const/16 v23, 0x0

    .line 136
    .line 137
    const/16 v24, 0x0

    .line 138
    .line 139
    move/from16 v19, p3

    .line 140
    .line 141
    .line 142
    invoke-static/range {v17 .. v26}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 143
    move-result-object v6

    .line 144
    .line 145
    .line 146
    filled-new-array {v5, v6, v1}, [Ljava/lang/Object;

    .line 147
    move-result-object v1

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3, v14, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    move-result-object v1

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 155
    .line 156
    sget-object v1, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 160
    move-result-object v2

    .line 161
    .line 162
    .line 163
    invoke-static {v2, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    sget v3, Lcom/kubi/kumex/R$color;->c_text:I

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v3}, Lcom/kubi/futures/trade/welfare/f0;->H(I)[Lkotlin/Pair;

    .line 169
    move-result-object v3

    .line 170
    array-length v5, v3

    .line 171
    .line 172
    .line 173
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 174
    move-result-object v3

    .line 175
    .line 176
    check-cast v3, [Lkotlin/Pair;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v2, v3}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->p()Landroid/widget/ProgressBar;

    .line 183
    move-result-object v1

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getFaceValue()Ljava/math/BigDecimal;

    .line 187
    move-result-object v2

    .line 188
    .line 189
    const-string v3, "1"

    .line 190
    .line 191
    .line 192
    invoke-static {v2, v3}, Lkf/a;->F(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 193
    move-result-object v2

    .line 194
    const/4 v3, 0x4

    .line 195
    .line 196
    sget-object v5, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v4, v2, v3, v5}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 200
    move-result-object v2

    .line 201
    .line 202
    new-instance v3, Ljava/math/BigDecimal;

    .line 203
    .line 204
    const/16 v4, 0x64

    .line 205
    .line 206
    .line 207
    invoke-direct {v3, v4}, Ljava/math/BigDecimal;-><init>(I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 211
    move-result-object v2

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/math/BigDecimal;->intValue()I

    .line 215
    move-result v2

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 219
    .line 220
    goto/16 :goto_1

    .line 221
    .line 222
    :cond_0
    move-object/from16 v16, v14

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 226
    move-result-object v2

    .line 227
    .line 228
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 229
    .line 230
    sget v4, Lcom/kubi/kumex/R$color;->c_text40:I

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3, v4}, Lcom/kubi/utils/c;->a(I)I

    .line 234
    move-result v4

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->p()Landroid/widget/ProgressBar;

    .line 241
    move-result-object v2

    .line 242
    .line 243
    .line 244
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 251
    move-result-object v2

    .line 252
    .line 253
    .line 254
    invoke-static {v2, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 261
    move-result-object v2

    .line 262
    .line 263
    sget v4, Lcom/kubi/kumex/R$string;->kumex_welfare_select_fee:I

    .line 264
    .line 265
    new-instance v5, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getFaceValue()Ljava/math/BigDecimal;

    .line 272
    move-result-object v17

    .line 273
    .line 274
    if-eqz v17, :cond_1

    .line 275
    .line 276
    const/16 v25, 0x79

    .line 277
    .line 278
    const/16 v26, 0x0

    .line 279
    .line 280
    const/16 v18, 0x0

    .line 281
    .line 282
    const/16 v20, 0x1

    .line 283
    .line 284
    const/16 v21, 0x0

    .line 285
    .line 286
    const/16 v22, 0x0

    .line 287
    .line 288
    const/16 v23, 0x0

    .line 289
    .line 290
    const/16 v24, 0x0

    .line 291
    .line 292
    move/from16 v19, p3

    .line 293
    .line 294
    .line 295
    invoke-static/range {v17 .. v26}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 296
    move-result-object v6

    .line 297
    goto :goto_0

    .line 298
    :cond_1
    const/4 v6, 0x0

    .line 299
    .line 300
    :goto_0
    const-string v7, "0"

    .line 301
    .line 302
    .line 303
    invoke-static {v6, v7}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 304
    move-result-object v6

    .line 305
    .line 306
    .line 307
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    const/16 v6, 0x20

    .line 310
    .line 311
    .line 312
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    move-result-object v1

    .line 320
    .line 321
    .line 322
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 323
    move-result-object v1

    .line 324
    .line 325
    .line 326
    invoke-virtual {v3, v4, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 327
    move-result-object v1

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 331
    .line 332
    sget-object v1, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 336
    move-result-object v2

    .line 337
    .line 338
    .line 339
    invoke-static {v2, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    .line 341
    sget v3, Lcom/kubi/kumex/R$color;->c_text60:I

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, v3}, Lcom/kubi/futures/trade/welfare/f0;->H(I)[Lkotlin/Pair;

    .line 345
    move-result-object v3

    .line 346
    array-length v4, v3

    .line 347
    .line 348
    .line 349
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 350
    move-result-object v3

    .line 351
    .line 352
    check-cast v3, [Lkotlin/Pair;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1, v2, v3}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 356
    .line 357
    .line 358
    :goto_1
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getStatus()Ljava/lang/String;

    .line 359
    move-result-object v1

    .line 360
    .line 361
    move-object/from16 v2, v16

    .line 362
    .line 363
    .line 364
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 365
    move-result v1

    .line 366
    .line 367
    if-eqz v1, :cond_2

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 371
    move-result-object v1

    .line 372
    .line 373
    .line 374
    const v2, 0x3ecccccd    # 0.4f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 378
    return-void

    .line 379
    .line 380
    .line 381
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 382
    move-result-object v1

    .line 383
    .line 384
    const/high16 v2, 0x3f800000    # 1.0f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 388
    return-void
.end method

.method public final N(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;Z)V
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->c()Landroidx/appcompat/widget/AppCompatTextView;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getDeductionRatio()Ljava/math/BigDecimal;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    new-instance v1, Ljava/math/BigDecimal;

    .line 15
    .line 16
    const/16 v2, 0x64

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v2}, Ljava/math/BigDecimal;-><init>(I)V

    .line 20
    .line 21
    sget-object v2, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, v1, v2}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    const-string p2, "divide(...)"

    .line 28
    .line 29
    .line 30
    invoke-static {v3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    const/16 v10, 0x1f

    .line 33
    const/4 v11, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static/range {v3 .. v11}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 43
    move-result-object p2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->d()Landroidx/appcompat/widget/AppCompatTextView;

    .line 50
    move-result-object p2

    .line 51
    .line 52
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 53
    .line 54
    sget v1, Lcom/kubi/kumex/R$string;->kumex_fee_discount:I

    .line 55
    const/4 v2, 0x0

    .line 56
    .line 57
    new-array v2, v2, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    if-eqz p3, :cond_0

    .line 67
    .line 68
    sget p2, Lcom/kubi/kumex/R$color;->c_text40:I

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p2}, Lcom/kubi/utils/c;->a(I)I

    .line 72
    move-result p2

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->c()Landroidx/appcompat/widget/AppCompatTextView;

    .line 76
    move-result-object p3

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->d()Landroidx/appcompat/widget/AppCompatTextView;

    .line 83
    move-result-object p3

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->l()Landroid/widget/ImageView;

    .line 90
    move-result-object p2

    .line 91
    .line 92
    sget p3, Lcom/kubi/kumex/R$drawable;->bkumex_futures_trial_expire:I

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->c()Landroidx/appcompat/widget/AppCompatTextView;

    .line 99
    move-result-object p2

    .line 100
    .line 101
    .line 102
    const p3, 0x3ecccccd    # 0.4f

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, p3}, Landroid/view/View;->setAlpha(F)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->d()Landroidx/appcompat/widget/AppCompatTextView;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p3}, Landroid/view/View;->setAlpha(F)V

    .line 113
    return-void

    .line 114
    .line 115
    :cond_0
    const-string p2, "#7780DF"

    .line 116
    .line 117
    .line 118
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 119
    move-result p2

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->l()Landroid/widget/ImageView;

    .line 123
    move-result-object p3

    .line 124
    .line 125
    sget v0, Lcom/kubi/kumex/R$drawable;->bkumex_futures_coupon:I

    .line 126
    .line 127
    .line 128
    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->c()Landroidx/appcompat/widget/AppCompatTextView;

    .line 132
    move-result-object p3

    .line 133
    .line 134
    .line 135
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->d()Landroidx/appcompat/widget/AppCompatTextView;

    .line 139
    move-result-object p3

    .line 140
    .line 141
    .line 142
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->c()Landroidx/appcompat/widget/AppCompatTextView;

    .line 146
    move-result-object p2

    .line 147
    .line 148
    const/high16 p3, 0x3f800000    # 1.0f

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2, p3}, Landroid/view/View;->setAlpha(F)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->d()Landroidx/appcompat/widget/AppCompatTextView;

    .line 155
    move-result-object p1

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p3}, Landroid/view/View;->setAlpha(F)V

    .line 159
    return-void
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
.end method

.method public final O(Lcom/kubi/futures/trade/welfare/f0$d;Z)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->m()Landroid/widget/ImageView;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "<get-leftLeverage>(...)"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->m()Landroid/widget/ImageView;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    const-string p2, "#0d6971c8"

    .line 24
    .line 25
    .line 26
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 27
    move-result p2

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2}, Lcom/kubi/utils/extensions/k;->p(Landroid/widget/ImageView;I)V

    .line 31
    return-void

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->m()Landroid/widget/ImageView;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    const-string p2, "#0d93989f"

    .line 41
    .line 42
    .line 43
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 44
    move-result p2

    .line 45
    .line 46
    .line 47
    invoke-static {p1, p2}, Lcom/kubi/utils/extensions/k;->p(Landroid/widget/ImageView;I)V

    .line 48
    return-void
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public final P(Lcom/kubi/futures/trade/welfare/f0$d;Ljava/lang/Long;ZZZ)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->j()Landroidx/appcompat/widget/AppCompatTextView;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "<get-expireTime>(...)"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    if-eqz v1, :cond_5

    .line 16
    .line 17
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 18
    .line 19
    sget v2, Lcom/kubi/kumex/R$id;->top_content_barrier:I

    .line 20
    .line 21
    iput v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->topToBottom:I

    .line 22
    const/4 v2, 0x0

    .line 23
    .line 24
    if-eqz p5, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->j()Landroidx/appcompat/widget/AppCompatTextView;

    .line 28
    move-result-object p5

    .line 29
    .line 30
    .line 31
    invoke-virtual {p5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    move-result-object p5

    .line 33
    .line 34
    const-string v3, "getContext(...)"

    .line 35
    .line 36
    .line 37
    invoke-static {p5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    const/16 v3, 0x28

    .line 40
    .line 41
    .line 42
    invoke-static {p5, v3}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 43
    move-result p5

    .line 44
    float-to-int p5, p5

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move p5, v2

    .line 47
    .line 48
    :goto_0
    iput p5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 52
    .line 53
    sget-object p5, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p5}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 57
    move-result-object p5

    .line 58
    .line 59
    .line 60
    invoke-interface {p5}, Lth/d;->v()J

    .line 61
    move-result-wide v0

    .line 62
    .line 63
    .line 64
    invoke-static {p2}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 65
    move-result-wide v3

    .line 66
    .line 67
    sub-long v0, v3, v0

    .line 68
    .line 69
    const/high16 p2, 0x3f800000    # 1.0f

    .line 70
    .line 71
    const-string p5, "<get-expireTag>(...)"

    .line 72
    .line 73
    if-eqz p3, :cond_1

    .line 74
    .line 75
    if-nez p4, :cond_1

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->j()Landroidx/appcompat/widget/AppCompatTextView;

    .line 79
    move-result-object p4

    .line 80
    .line 81
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 82
    .line 83
    sget v1, Lcom/kubi/kumex/R$string;->bkumex_expired:I

    .line 84
    .line 85
    new-array v2, v2, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    .line 92
    invoke-virtual {p4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->i()Landroidx/appcompat/widget/AppCompatTextView;

    .line 96
    move-result-object p4

    .line 97
    .line 98
    .line 99
    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p4}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 103
    .line 104
    goto/16 :goto_2

    .line 105
    .line 106
    .line 107
    :cond_1
    const-wide/32 v5, 0x1b77400

    .line 108
    .line 109
    cmp-long p4, v0, v5

    .line 110
    .line 111
    if-gtz p4, :cond_3

    .line 112
    .line 113
    const-wide/16 v5, 0x0

    .line 114
    .line 115
    cmp-long p4, v0, v5

    .line 116
    .line 117
    if-lez p4, :cond_3

    .line 118
    .line 119
    if-eqz p3, :cond_2

    .line 120
    goto :goto_1

    .line 121
    .line 122
    :cond_2
    new-instance p4, Ljava/math/BigDecimal;

    .line 123
    long-to-float v0, v0

    .line 124
    mul-float/2addr v0, p2

    .line 125
    .line 126
    .line 127
    const v1, 0x36ee80

    .line 128
    int-to-float v1, v1

    .line 129
    div-float/2addr v0, v1

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 133
    move-result-object v0

    .line 134
    .line 135
    .line 136
    invoke-direct {p4, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    sget-object v0, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p4, v2, v0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 142
    move-result-object p4

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->j()Landroidx/appcompat/widget/AppCompatTextView;

    .line 146
    move-result-object v0

    .line 147
    .line 148
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 149
    .line 150
    sget v2, Lcom/kubi/kumex/R$color;->complementary:I

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 154
    move-result v2

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->i()Landroidx/appcompat/widget/AppCompatTextView;

    .line 161
    move-result-object v0

    .line 162
    .line 163
    .line 164
    invoke-static {v0, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->j()Landroidx/appcompat/widget/AppCompatTextView;

    .line 171
    move-result-object p5

    .line 172
    .line 173
    sget v0, Lcom/kubi/kumex/R$string;->kumex_welfare_coupon_item_expire_time:I

    .line 174
    .line 175
    .line 176
    filled-new-array {p4}, [Ljava/lang/Object;

    .line 177
    move-result-object p4

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v0, p4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 181
    move-result-object p4

    .line 182
    .line 183
    .line 184
    invoke-virtual {p5, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 185
    goto :goto_2

    .line 186
    .line 187
    .line 188
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->j()Landroidx/appcompat/widget/AppCompatTextView;

    .line 189
    move-result-object p4

    .line 190
    .line 191
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 192
    .line 193
    sget v1, Lcom/kubi/kumex/R$string;->kumex_expires_time:I

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v3, v4}, Lcom/kubi/futures/trade/welfare/f0;->I(J)Ljava/lang/String;

    .line 197
    move-result-object v2

    .line 198
    .line 199
    .line 200
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 201
    move-result-object v2

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v1, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 205
    move-result-object v1

    .line 206
    .line 207
    .line 208
    invoke-virtual {p4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->j()Landroidx/appcompat/widget/AppCompatTextView;

    .line 212
    move-result-object p4

    .line 213
    .line 214
    sget v1, Lcom/kubi/kumex/R$color;->c_text40:I

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v1}, Lcom/kubi/utils/c;->a(I)I

    .line 218
    move-result v0

    .line 219
    .line 220
    .line 221
    invoke-virtual {p4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->i()Landroidx/appcompat/widget/AppCompatTextView;

    .line 225
    move-result-object p4

    .line 226
    .line 227
    .line 228
    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-static {p4}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 232
    .line 233
    :goto_2
    if-eqz p3, :cond_4

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->j()Landroidx/appcompat/widget/AppCompatTextView;

    .line 237
    move-result-object p1

    .line 238
    .line 239
    .line 240
    const p2, 0x3ecccccd    # 0.4f

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 244
    return-void

    .line 245
    .line 246
    .line 247
    :cond_4
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->j()Landroidx/appcompat/widget/AppCompatTextView;

    .line 248
    move-result-object p1

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 252
    return-void

    .line 253
    .line 254
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    .line 255
    .line 256
    const-string p2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    .line 257
    .line 258
    .line 259
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 260
    throw p1
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
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
.end method

.method public final R(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;ILjava/lang/String;)V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->isTradeProTrial()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getMinCloseRealisedPnl()Ljava/math/BigDecimal;

    .line 11
    move-result-object p2

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    const/16 v8, 0x79

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    move v2, p3

    .line 26
    .line 27
    .line 28
    invoke-static/range {v0 .. v9}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->n()Landroidx/appcompat/widget/AppCompatTextView;

    .line 33
    move-result-object p3

    .line 34
    .line 35
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 36
    .line 37
    sget v1, Lcom/kubi/kumex/R$string;->kumex_minimum_profit_requirement:I

    .line 38
    .line 39
    .line 40
    filled-new-array {p2, p4}, [Ljava/lang/Object;

    .line 41
    move-result-object p2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, p2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    move-result-object p2

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    sget-object p2, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->n()Landroidx/appcompat/widget/AppCompatTextView;

    .line 54
    move-result-object p3

    .line 55
    .line 56
    const-string p4, "<get-miniProRequirement>(...)"

    .line 57
    .line 58
    .line 59
    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    sget v0, Lcom/kubi/kumex/R$color;->c_text60:I

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lcom/kubi/futures/trade/welfare/f0;->H(I)[Lkotlin/Pair;

    .line 65
    move-result-object v0

    .line 66
    array-length v1, v0

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    check-cast v0, [Lkotlin/Pair;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, p3, v0}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->n()Landroidx/appcompat/widget/AppCompatTextView;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    .line 82
    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 86
    return-void
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
.end method

.method public final S(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;ILjava/lang/String;)V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->isTradeProTrial()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getMinTotalAmount()Ljava/math/BigDecimal;

    .line 11
    move-result-object p2

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    const/16 v8, 0x79

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    move v2, p3

    .line 26
    .line 27
    .line 28
    invoke-static/range {v0 .. v9}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->o()Landroidx/appcompat/widget/AppCompatTextView;

    .line 33
    move-result-object p3

    .line 34
    .line 35
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 36
    .line 37
    sget v1, Lcom/kubi/kumex/R$string;->kumex_minimum_transaction_amount:I

    .line 38
    .line 39
    .line 40
    filled-new-array {p2, p4}, [Ljava/lang/Object;

    .line 41
    move-result-object p2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, p2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    move-result-object p2

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    sget-object p2, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->o()Landroidx/appcompat/widget/AppCompatTextView;

    .line 54
    move-result-object p3

    .line 55
    .line 56
    const-string p4, "<get-miniTraAmount>(...)"

    .line 57
    .line 58
    .line 59
    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    sget v0, Lcom/kubi/kumex/R$color;->c_text60:I

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lcom/kubi/futures/trade/welfare/f0;->H(I)[Lkotlin/Pair;

    .line 65
    move-result-object v0

    .line 66
    array-length v1, v0

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    check-cast v0, [Lkotlin/Pair;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, p3, v0}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->o()Landroidx/appcompat/widget/AppCompatTextView;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    .line 82
    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 86
    return-void
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
.end method

.method public final T(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getStatus()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const v1, 0x3ecccccd    # 0.4f

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 14
    move-result v3

    .line 15
    .line 16
    .line 17
    const v4, -0x4b8eecb7

    .line 18
    .line 19
    if-eq v3, v4, :cond_4

    .line 20
    .line 21
    .line 22
    const v4, -0x482ec3b6

    .line 23
    .line 24
    if-eq v3, v4, :cond_2

    .line 25
    .line 26
    .line 27
    const v4, 0x3b64fe3e

    .line 28
    .line 29
    if-eq v3, v4, :cond_0

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_0
    const-string v3, "ACTIVATE_FINISHED"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    move-result v0

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 48
    .line 49
    sget v4, Lcom/kubi/kumex/R$string;->go_view:I

    .line 50
    .line 51
    new-array v2, v2, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v4, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    sget v2, Lcom/kubi/kumex/R$color;->c_button_normal:I

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v2}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->setBackgroundColorRes(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    sget v2, Lcom/kubi/kumex/R$color;->c_textEmphasis:I

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 77
    move-result v2

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 81
    .line 82
    goto/16 :goto_1

    .line 83
    .line 84
    :cond_2
    const-string v3, "USE_FINISHED"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    move-result v0

    .line 89
    .line 90
    if-nez v0, :cond_3

    .line 91
    goto :goto_0

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 98
    .line 99
    sget v4, Lcom/kubi/kumex/R$string;->margin_coupons_state_used:I

    .line 100
    .line 101
    new-array v2, v2, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, v4, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    move-result-object v2

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    sget v2, Lcom/kubi/kumex/R$color;->c_button_normal:I

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v2}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->setBackgroundColorRes(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    sget v2, Lcom/kubi/kumex/R$color;->c_textEmphasis:I

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 127
    move-result v2

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 131
    goto :goto_1

    .line 132
    .line 133
    :cond_4
    const-string v3, "SEND_FINISHED"

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    move-result v0

    .line 138
    .line 139
    if-nez v0, :cond_5

    .line 140
    goto :goto_0

    .line 141
    .line 142
    .line 143
    :cond_5
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 147
    .line 148
    sget v4, Lcom/kubi/kumex/R$string;->kumex_welfare_activate:I

    .line 149
    .line 150
    new-array v2, v2, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v4, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 154
    move-result-object v2

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 161
    move-result-object v0

    .line 162
    .line 163
    sget v2, Lcom/kubi/kumex/R$color;->c_button_normal:I

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v2}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->setBackgroundColorRes(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 170
    move-result-object v0

    .line 171
    .line 172
    sget v2, Lcom/kubi/kumex/R$color;->c_textEmphasis:I

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 176
    move-result v2

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 180
    goto :goto_1

    .line 181
    .line 182
    .line 183
    :cond_6
    :goto_0
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 184
    move-result-object v0

    .line 185
    .line 186
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 187
    .line 188
    sget v4, Lcom/kubi/kumex/R$string;->bkumex_expired:I

    .line 189
    .line 190
    new-array v2, v2, [Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3, v4, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 194
    move-result-object v2

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    sget v2, Lcom/kubi/kumex/R$color;->c_cover4:I

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v2}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->setBackgroundColorRes(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 210
    move-result-object v0

    .line 211
    .line 212
    sget v2, Lcom/kubi/kumex/R$color;->c_text40:I

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 216
    move-result v2

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 223
    move-result-object v0

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 227
    .line 228
    .line 229
    :goto_1
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getStatus()Ljava/lang/String;

    .line 230
    move-result-object p2

    .line 231
    .line 232
    const-string v0, "RECYCLE_FINISHED"

    .line 233
    .line 234
    .line 235
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 236
    move-result p2

    .line 237
    .line 238
    if-eqz p2, :cond_7

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 242
    move-result-object p1

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 246
    return-void

    .line 247
    .line 248
    .line 249
    :cond_7
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 250
    move-result-object p1

    .line 251
    .line 252
    const/high16 p2, 0x3f800000    # 1.0f

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 256
    return-void
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
.end method

.method public final U(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;ILjava/lang/String;)V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p4

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->isTradeProTrial()Z

    .line 8
    move-result v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    const-string v3, "<get-desc>(...)"

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getStatus()Ljava/lang/String;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    const-string v4, "RECYCLE_FINISHED"

    .line 30
    .line 31
    if-eqz v2, :cond_5

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 35
    move-result v5

    .line 36
    .line 37
    .line 38
    const v6, -0x63778b42

    .line 39
    .line 40
    if-eq v5, v6, :cond_3

    .line 41
    .line 42
    .line 43
    const v6, -0x4b8eecb7

    .line 44
    .line 45
    if-eq v5, v6, :cond_2

    .line 46
    .line 47
    .line 48
    const v6, 0x3b64fe3e

    .line 49
    .line 50
    if-eq v5, v6, :cond_1

    .line 51
    goto :goto_1

    .line 52
    .line 53
    :cond_1
    const-string v5, "ACTIVATE_FINISHED"

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    move-result v2

    .line 58
    .line 59
    if-eqz v2, :cond_5

    .line 60
    goto :goto_0

    .line 61
    .line 62
    :cond_2
    const-string v5, "SEND_FINISHED"

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    move-result v2

    .line 67
    .line 68
    if-nez v2, :cond_4

    .line 69
    goto :goto_1

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    move-result v2

    .line 74
    .line 75
    if-nez v2, :cond_4

    .line 76
    goto :goto_1

    .line 77
    .line 78
    .line 79
    :cond_4
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getMaxValue()Ljava/math/BigDecimal;

    .line 80
    move-result-object v2

    .line 81
    .line 82
    .line 83
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    const/16 v13, 0x79

    .line 87
    const/4 v14, 0x0

    .line 88
    const/4 v6, 0x0

    .line 89
    const/4 v8, 0x1

    .line 90
    const/4 v9, 0x0

    .line 91
    const/4 v10, 0x0

    .line 92
    const/4 v11, 0x0

    .line 93
    const/4 v12, 0x0

    .line 94
    .line 95
    move/from16 v7, p3

    .line 96
    .line 97
    .line 98
    invoke-static/range {v5 .. v14}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 99
    move-result-object v2

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 103
    move-result-object v5

    .line 104
    .line 105
    sget-object v6, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 106
    .line 107
    sget v7, Lcom/kubi/kumex/R$string;->kumex_welfare_select_max:I

    .line 108
    .line 109
    .line 110
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 111
    move-result-object v1

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6, v7, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 115
    move-result-object v1

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    .line 120
    sget-object v1, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 124
    move-result-object v2

    .line 125
    .line 126
    .line 127
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    sget v3, Lcom/kubi/kumex/R$color;->c_text60:I

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v3}, Lcom/kubi/futures/trade/welfare/f0;->H(I)[Lkotlin/Pair;

    .line 133
    move-result-object v3

    .line 134
    array-length v5, v3

    .line 135
    .line 136
    .line 137
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 138
    move-result-object v3

    .line 139
    .line 140
    check-cast v3, [Lkotlin/Pair;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v2, v3}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 144
    move-object v3, v0

    .line 145
    .line 146
    move-object/from16 v17, v4

    .line 147
    .line 148
    goto/16 :goto_2

    .line 149
    .line 150
    .line 151
    :cond_5
    :goto_1
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getWithdrawnValue()Ljava/math/BigDecimal;

    .line 152
    move-result-object v2

    .line 153
    .line 154
    .line 155
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 156
    move-result-object v2

    .line 157
    .line 158
    sget-object v5, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v5}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 162
    move-result v2

    .line 163
    .line 164
    if-lez v2, :cond_6

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 168
    move-result-object v2

    .line 169
    .line 170
    sget-object v15, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 171
    .line 172
    sget v5, Lcom/kubi/kumex/R$string;->kumex_welfare_trial_withdrawed:I

    .line 173
    .line 174
    new-instance v6, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getWithdrawnValue()Ljava/math/BigDecimal;

    .line 181
    move-result-object v7

    .line 182
    .line 183
    .line 184
    invoke-static {v7}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 185
    move-result-object v7

    .line 186
    .line 187
    const/16 v13, 0x79

    .line 188
    const/4 v14, 0x0

    .line 189
    move-object v8, v6

    .line 190
    const/4 v6, 0x0

    .line 191
    move-object v9, v8

    .line 192
    const/4 v8, 0x1

    .line 193
    move-object v10, v9

    .line 194
    const/4 v9, 0x0

    .line 195
    move-object v11, v10

    .line 196
    const/4 v10, 0x0

    .line 197
    move-object v12, v11

    .line 198
    const/4 v11, 0x0

    .line 199
    .line 200
    move-object/from16 v16, v12

    .line 201
    const/4 v12, 0x0

    .line 202
    .line 203
    move-object/from16 v17, v4

    .line 204
    move v4, v5

    .line 205
    move-object v5, v7

    .line 206
    .line 207
    move-object/from16 v0, v16

    .line 208
    .line 209
    move/from16 v7, p3

    .line 210
    .line 211
    .line 212
    invoke-static/range {v5 .. v14}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 213
    move-result-object v5

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    const/16 v5, 0x20

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    move-result-object v0

    .line 229
    .line 230
    .line 231
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 232
    move-result-object v0

    .line 233
    .line 234
    .line 235
    invoke-virtual {v15, v4, v0}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 236
    move-result-object v0

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 240
    .line 241
    sget-object v0, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 245
    move-result-object v1

    .line 246
    .line 247
    .line 248
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    .line 250
    sget v2, Lcom/kubi/kumex/R$color;->c_text60:I

    .line 251
    .line 252
    move-object/from16 v3, p0

    .line 253
    .line 254
    .line 255
    invoke-virtual {v3, v2}, Lcom/kubi/futures/trade/welfare/f0;->H(I)[Lkotlin/Pair;

    .line 256
    move-result-object v2

    .line 257
    array-length v4, v2

    .line 258
    .line 259
    .line 260
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 261
    move-result-object v2

    .line 262
    .line 263
    check-cast v2, [Lkotlin/Pair;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 267
    goto :goto_2

    .line 268
    :cond_6
    move-object v3, v0

    .line 269
    .line 270
    move-object/from16 v17, v4

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 274
    move-result-object v0

    .line 275
    .line 276
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 277
    .line 278
    sget v2, Lcom/kubi/kumex/R$string;->kumex_welfare_trial_no_withdraw:I

    .line 279
    const/4 v4, 0x0

    .line 280
    .line 281
    new-array v4, v4, [Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, v2, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 285
    move-result-object v1

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 289
    .line 290
    .line 291
    :goto_2
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getStatus()Ljava/lang/String;

    .line 292
    move-result-object v0

    .line 293
    .line 294
    move-object/from16 v1, v17

    .line 295
    .line 296
    .line 297
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    move-result v0

    .line 299
    .line 300
    if-eqz v0, :cond_7

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 304
    move-result-object v0

    .line 305
    .line 306
    .line 307
    const v1, 0x3ecccccd    # 0.4f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 311
    return-void

    .line 312
    .line 313
    .line 314
    :cond_7
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$d;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 315
    move-result-object v0

    .line 316
    .line 317
    const/high16 v1, 0x3f800000    # 1.0f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 321
    return-void
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
.end method

.method public final V(Lcom/kubi/futures/trade/welfare/f0$d;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "NORMAL"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result p2

    .line 7
    .line 8
    const-string v0, "<get-leftLeverage>(...)"

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->m()Landroid/widget/ImageView;

    .line 14
    move-result-object p2

    .line 15
    .line 16
    .line 17
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 21
    .line 22
    if-nez p3, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->m()Landroid/widget/ImageView;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    const-string p2, "#0d00B47D"

    .line 32
    .line 33
    .line 34
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 35
    move-result p2

    .line 36
    .line 37
    .line 38
    invoke-static {p1, p2}, Lcom/kubi/utils/extensions/k;->p(Landroid/widget/ImageView;I)V

    .line 39
    return-void

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->m()Landroid/widget/ImageView;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    const-string p2, "#0d93989f"

    .line 49
    .line 50
    .line 51
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 52
    move-result p2

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p2}, Lcom/kubi/utils/extensions/k;->p(Landroid/widget/ImageView;I)V

    .line 56
    return-void

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->m()Landroid/widget/ImageView;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    .line 63
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 67
    return-void
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
.end method

.method public final W(Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/futures/trade/welfare/airdrop/AirdropRuleDialog;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropRuleDialog;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lkotlin/Pair;

    .line 8
    .line 9
    const-string v2, "data"

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getCode()Ljava/lang/String;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 28
    .line 29
    iget-object p1, p0, Lcom/kubi/futures/trade/welfare/f0;->i:Landroidx/fragment/app/FragmentManager;

    .line 30
    .line 31
    const-string v1, "FuturesTrialRulesDialog"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 35
    return-void
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
.end method

.method public final X(Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;)V
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0xc

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B11FuturesBonus"

    .line 6
    .line 7
    const-string v1, "discountCardDetails"

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 13
    .line 14
    new-instance v0, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;-><init>()V

    .line 18
    .line 19
    new-instance v1, Lkotlin/Pair;

    .line 20
    .line 21
    const-string v2, "data"

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;->getAttributes()Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 40
    .line 41
    iget-object p1, p0, Lcom/kubi/futures/trade/welfare/f0;->i:Landroidx/fragment/app/FragmentManager;

    .line 42
    .line 43
    const-string v1, "FuturesCouponRulesDialog"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 47
    return-void
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
.end method

.method public final Y(Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V
    .locals 16

    .line 1
    .line 2
    const/16 v4, 0xc

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B11FuturesBonus"

    .line 6
    .line 7
    const-string v1, "bonusCardDetails"

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 13
    .line 14
    sget-object v6, Lf00/a;->a:Lf00/a;

    .line 15
    .line 16
    sget-object v0, Lwl/l0;->a:Lwl/l0;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lwl/l0;->B0()Ljava/lang/String;

    .line 20
    move-result-object v7

    .line 21
    .line 22
    const/16 v14, 0x7e

    .line 23
    const/4 v15, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v10, 0x0

    .line 27
    const/4 v11, 0x0

    .line 28
    const/4 v12, 0x0

    .line 29
    const/4 v13, 0x0

    .line 30
    .line 31
    .line 32
    invoke-static/range {v6 .. v15}, Lg00/r$a;->a(Lg00/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 33
    return-void
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
.end method

.method public final Z(Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0xc

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B11FuturesBonus"

    .line 6
    .line 7
    const-string v1, "bonusCardDetails"

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 13
    .line 14
    new-instance v0, Lcom/kubi/futures/trade/welfare/FuturesTrialRulesDialog;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Lcom/kubi/futures/trade/welfare/FuturesTrialRulesDialog;-><init>()V

    .line 18
    .line 19
    new-instance v1, Lkotlin/Pair;

    .line 20
    .line 21
    const-string v2, "data"

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getCode()Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 40
    .line 41
    iget-object p1, p0, Lcom/kubi/futures/trade/welfare/f0;->i:Landroidx/fragment/app/FragmentManager;

    .line 42
    .line 43
    const-string v1, "FuturesTrialRulesDialog"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 47
    return-void
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
.end method

.method public final a0(Ljava/lang/String;)V
    .locals 7

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    const/16 v5, 0xc

    .line 12
    const/4 v6, 0x0

    .line 13
    .line 14
    const-string v1, "B11FuturesBonus"

    .line 15
    .line 16
    const-string v2, "withdrawCriteria"

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static/range {v1 .. v6}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 22
    .line 23
    sget-object v0, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    sget v0, Lcom/kubi/kumex/R$string;->notice_prompt:I

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    sget v0, Lcom/kubi/kumex/R$string;->i_already_know:I

    .line 40
    .line 41
    new-instance v1, Lcom/kubi/futures/trade/welfare/e0;

    .line 42
    .line 43
    .line 44
    invoke-direct {v1}, Lcom/kubi/futures/trade/welfare/e0;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0;->i:Landroidx/fragment/app/FragmentManager;

    .line 51
    .line 52
    const-string v1, "showWithdrawRuleDialog"

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 56
    :cond_1
    :goto_0
    return-void
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
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0;->o:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0;->o:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Lbm/f;

    .line 9
    .line 10
    instance-of v0, p1, Lbm/e;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    .line 16
    :cond_0
    instance-of v0, p1, Lbm/d;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    .line 22
    :cond_1
    instance-of v0, p1, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;

    .line 23
    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    instance-of v0, p1, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_2
    instance-of p1, p1, Lbm/b;

    .line 32
    const/4 p1, 0x3

    .line 33
    return p1

    .line 34
    :cond_3
    :goto_0
    const/4 p1, 0x2

    .line 35
    return p1
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
.end method

.method public final m(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lbm/f;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "list"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0;->o:Ljava/util/List;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 14
    return-void
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
.end method

.method public final n(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->s()Landroid/view/View;

    .line 4
    move-result-object v2

    .line 5
    .line 6
    const-string v3, "<get-tradeProLeverageRow>(...)"

    .line 7
    .line 8
    .line 9
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 13
    .line 14
    sget-object v2, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getCurrency()Ljava/lang/String;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    .line 25
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    move-result-object v3

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v4, 0x2

    .line 29
    const/4 v5, 0x0

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3, v8, v4, v5}, Lth/d;->E(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/CoinEntity;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/CoinEntity;->getProperties()Lcom/kubi/kumex/data/platform/model/PropertyEntity;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/PropertyEntity;->getShortDisplayPrecision()Ljava/lang/Integer;

    .line 45
    move-result-object v5

    .line 46
    :cond_0
    const/4 v2, 0x4

    .line 47
    .line 48
    .line 49
    invoke-static {v5, v2}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 50
    move-result v2

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getStatus()Ljava/lang/String;

    .line 54
    move-result-object v3

    .line 55
    .line 56
    const-string v4, "RECYCLE_FINISHED"

    .line 57
    .line 58
    .line 59
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    move-result v3

    .line 61
    .line 62
    const/high16 v9, 0x3f800000    # 1.0f

    .line 63
    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 68
    move-result-object v4

    .line 69
    .line 70
    .line 71
    const v5, 0x3ecccccd    # 0.4f

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v5}, Landroid/view/View;->setAlpha(F)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->g()Landroidx/appcompat/widget/AppCompatTextView;

    .line 78
    move-result-object v4

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v5}, Landroid/view/View;->setAlpha(F)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 85
    move-result-object v4

    .line 86
    .line 87
    sget-object v5, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 88
    .line 89
    sget v6, Lcom/kubi/kumex/R$color;->c_text60:I

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v6}, Lcom/kubi/utils/c;->a(I)I

    .line 93
    move-result v5

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 97
    goto :goto_0

    .line 98
    .line 99
    .line 100
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 101
    move-result-object v4

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v9}, Landroid/view/View;->setAlpha(F)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->g()Landroidx/appcompat/widget/AppCompatTextView;

    .line 108
    move-result-object v4

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, v9}, Landroid/view/View;->setAlpha(F)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 115
    move-result-object v4

    .line 116
    .line 117
    sget-object v5, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 118
    .line 119
    sget v6, Lcom/kubi/kumex/R$color;->c_text:I

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5, v6}, Lcom/kubi/utils/c;->a(I)I

    .line 123
    move-result v5

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 127
    .line 128
    .line 129
    :goto_0
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->p()Landroid/widget/ProgressBar;

    .line 130
    move-result-object v4

    .line 131
    .line 132
    const-string v5, "<get-progress>(...)"

    .line 133
    .line 134
    .line 135
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v4}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->i()Landroidx/appcompat/widget/AppCompatTextView;

    .line 142
    move-result-object v4

    .line 143
    .line 144
    const-string v5, "<get-expireTag>(...)"

    .line 145
    .line 146
    .line 147
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v4}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 154
    move-result-object v4

    .line 155
    .line 156
    const-string v5, "<get-checkBox>(...)"

    .line 157
    .line 158
    .line 159
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v4}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 166
    move-result-object v4

    .line 167
    .line 168
    const-string v5, "<get-action>(...)"

    .line 169
    .line 170
    .line 171
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v4}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->o()Landroidx/appcompat/widget/AppCompatTextView;

    .line 178
    move-result-object v4

    .line 179
    .line 180
    const-string v5, "<get-miniTraAmount>(...)"

    .line 181
    .line 182
    .line 183
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-static {v4}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->n()Landroidx/appcompat/widget/AppCompatTextView;

    .line 190
    move-result-object v4

    .line 191
    .line 192
    const-string v5, "<get-miniProRequirement>(...)"

    .line 193
    .line 194
    .line 195
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v4}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 202
    move-result-object v4

    .line 203
    const/4 v10, 0x1

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4, v10}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 210
    move-result-object v4

    .line 211
    .line 212
    sget-object v11, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 213
    .line 214
    sget v5, Lcom/kubi/kumex/R$string;->kumex_airdrop_card_title:I

    .line 215
    .line 216
    new-array v6, v8, [Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v11, v5, v6}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 220
    move-result-object v5

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getCouponAlias()Ljava/lang/String;

    .line 224
    move-result-object v6

    .line 225
    .line 226
    .line 227
    invoke-static {v5, v6}, Lcom/kubi/futures/trade/welfare/g0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 228
    move-result-object v5

    .line 229
    .line 230
    .line 231
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, v2, p1, p2, v10}, Lcom/kubi/futures/trade/welfare/f0;->u(ILcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;Z)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getExpiredPeriod()Ljava/lang/Long;

    .line 238
    move-result-object v2

    .line 239
    .line 240
    const/16 v6, 0x10

    .line 241
    const/4 v7, 0x0

    .line 242
    const/4 v4, 0x1

    .line 243
    const/4 v5, 0x0

    .line 244
    move-object v0, p0

    .line 245
    move-object v1, p1

    .line 246
    .line 247
    .line 248
    invoke-static/range {v0 .. v7}, Lcom/kubi/futures/trade/welfare/f0;->Q(Lcom/kubi/futures/trade/welfare/f0;Lcom/kubi/futures/trade/welfare/f0$d;Ljava/lang/Long;ZZZILjava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {p0 .. p2}, Lcom/kubi/futures/trade/welfare/f0;->L(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {p0 .. p2}, Lcom/kubi/futures/trade/welfare/f0;->T(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getType()Ljava/lang/String;

    .line 258
    move-result-object v2

    .line 259
    .line 260
    const-string v4, "NORMAL"

    .line 261
    .line 262
    .line 263
    invoke-static {v2, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 264
    move-result-object v2

    .line 265
    .line 266
    .line 267
    invoke-virtual {p0, p1, v2, v3}, Lcom/kubi/futures/trade/welfare/f0;->V(Lcom/kubi/futures/trade/welfare/f0$d;Ljava/lang/String;Z)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getStatus()Ljava/lang/String;

    .line 271
    move-result-object v2

    .line 272
    .line 273
    const-string v3, "SEND_FINISHED"

    .line 274
    .line 275
    .line 276
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    move-result v2

    .line 278
    .line 279
    const-string v3, "<get-holdingPeriodDesc>(...)"

    .line 280
    .line 281
    if-eqz v2, :cond_3

    .line 282
    .line 283
    .line 284
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->k()Landroidx/appcompat/widget/AppCompatTextView;

    .line 285
    move-result-object v2

    .line 286
    .line 287
    .line 288
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->k()Landroidx/appcompat/widget/AppCompatTextView;

    .line 295
    move-result-object v2

    .line 296
    .line 297
    sget v3, Lcom/kubi/kumex/R$string;->kumex_airdrop_card_hold_time:I

    .line 298
    .line 299
    .line 300
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getUseDurition()Ljava/lang/Integer;

    .line 301
    move-result-object v4

    .line 302
    .line 303
    .line 304
    invoke-static {v4}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 305
    move-result v4

    .line 306
    .line 307
    .line 308
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    move-result-object v4

    .line 310
    .line 311
    .line 312
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 313
    move-result-object v4

    .line 314
    .line 315
    .line 316
    invoke-virtual {v11, v3, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 317
    move-result-object v3

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->isLoading()Ljava/lang/Boolean;

    .line 324
    move-result-object v2

    .line 325
    .line 326
    .line 327
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 328
    move-result v2

    .line 329
    .line 330
    if-eqz v2, :cond_2

    .line 331
    .line 332
    .line 333
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 334
    move-result-object v2

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->o()V

    .line 338
    goto :goto_1

    .line 339
    .line 340
    .line 341
    :cond_2
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 342
    move-result-object v2

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;->l()V

    .line 346
    goto :goto_1

    .line 347
    .line 348
    .line 349
    :cond_3
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->k()Landroidx/appcompat/widget/AppCompatTextView;

    .line 350
    move-result-object v2

    .line 351
    .line 352
    .line 353
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 357
    .line 358
    .line 359
    :goto_1
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getStatus()Ljava/lang/String;

    .line 360
    move-result-object v2

    .line 361
    .line 362
    const-string v3, "ACTIVATE_FINISHED"

    .line 363
    .line 364
    .line 365
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 366
    move-result v2

    .line 367
    .line 368
    if-eqz v2, :cond_4

    .line 369
    .line 370
    .line 371
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 372
    move-result-object v2

    .line 373
    .line 374
    .line 375
    invoke-virtual {v2, v10}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 379
    move-result-object v2

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2, v9}, Landroid/view/View;->setAlpha(F)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 386
    move-result-object v2

    .line 387
    .line 388
    sget v3, Lcom/kubi/kumex/R$string;->go_view:I

    .line 389
    .line 390
    new-array v4, v8, [Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v11, v3, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 394
    move-result-object v3

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 401
    move-result-object v1

    .line 402
    .line 403
    sget v2, Lcom/kubi/kumex/R$color;->c_textEmphasis:I

    .line 404
    .line 405
    .line 406
    invoke-virtual {v11, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 407
    move-result v2

    .line 408
    .line 409
    .line 410
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 411
    :cond_4
    return-void
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
.end method

.method public final o(Lcom/kubi/futures/trade/welfare/f0$a;I)V
    .locals 23

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/kubi/futures/trade/welfare/f0;->o:Ljava/util/List;

    .line 5
    .line 6
    move/from16 v2, p2

    .line 7
    .line 8
    .line 9
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    check-cast v1, Lbm/f;

    .line 13
    .line 14
    instance-of v2, v1, Lbm/b;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    return-void

    .line 18
    .line 19
    :cond_0
    check-cast v1, Lbm/b;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lbm/b;->a()Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getCurrency()Ljava/lang/String;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    sget-object v2, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getCurrency()Ljava/lang/String;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    .line 48
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object v3

    .line 50
    const/4 v5, 0x2

    .line 51
    const/4 v9, 0x0

    .line 52
    const/4 v10, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static {v2, v3, v9, v5, v10}, Lth/d;->E(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/CoinEntity;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/CoinEntity;->getProperties()Lcom/kubi/kumex/data/platform/model/PropertyEntity;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/PropertyEntity;->getShortDisplayPrecision()Ljava/lang/Integer;

    .line 68
    move-result-object v2

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    move-object v2, v10

    .line 71
    :goto_0
    const/4 v3, 0x4

    .line 72
    .line 73
    .line 74
    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 75
    move-result v13

    .line 76
    .line 77
    .line 78
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$a;->c()Landroidx/appcompat/widget/AppCompatTextView;

    .line 79
    move-result-object v2

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getTrialFundBalance()Ljava/math/BigDecimal;

    .line 83
    move-result-object v3

    .line 84
    .line 85
    .line 86
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 87
    move-result-object v3

    .line 88
    .line 89
    sget-object v5, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v5}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 93
    move-result v3

    .line 94
    .line 95
    if-nez v3, :cond_2

    .line 96
    .line 97
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 98
    .line 99
    sget v6, Lcom/kubi/kumex/R$color;->c_text40:I

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v6}, Lcom/kubi/utils/c;->a(I)I

    .line 103
    move-result v3

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 107
    goto :goto_1

    .line 108
    .line 109
    :cond_2
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 110
    .line 111
    sget v6, Lcom/kubi/kumex/R$color;->c_text:I

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v6}, Lcom/kubi/utils/c;->a(I)I

    .line 115
    move-result v3

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 119
    .line 120
    .line 121
    :goto_1
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getTrialFundBalance()Ljava/math/BigDecimal;

    .line 122
    move-result-object v3

    .line 123
    .line 124
    .line 125
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 126
    move-result-object v11

    .line 127
    .line 128
    const/16 v19, 0x61

    .line 129
    .line 130
    const/16 v20, 0x0

    .line 131
    const/4 v12, 0x0

    .line 132
    const/4 v14, 0x1

    .line 133
    const/4 v15, 0x1

    .line 134
    .line 135
    const/16 v16, 0x1

    .line 136
    .line 137
    const/16 v17, 0x0

    .line 138
    .line 139
    const/16 v18, 0x0

    .line 140
    .line 141
    .line 142
    invoke-static/range {v11 .. v20}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 143
    move-result-object v3

    .line 144
    .line 145
    .line 146
    invoke-static {v3}, Lnf/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    move-result-object v3

    .line 148
    const/4 v7, 0x4

    .line 149
    const/4 v8, 0x0

    .line 150
    move-object v6, v5

    .line 151
    const/4 v5, 0x1

    .line 152
    move-object v11, v6

    .line 153
    const/4 v6, 0x0

    .line 154
    .line 155
    .line 156
    invoke-static/range {v3 .. v8}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 157
    move-result-object v3

    .line 158
    .line 159
    .line 160
    invoke-static {v3}, Lnf/b;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    move-result-object v3

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$a;->g()Landroidx/appcompat/widget/AppCompatTextView;

    .line 168
    move-result-object v2

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getAvailableCashAmount()Ljava/math/BigDecimal;

    .line 172
    move-result-object v3

    .line 173
    .line 174
    .line 175
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 176
    move-result-object v3

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v11}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 180
    move-result v3

    .line 181
    .line 182
    if-nez v3, :cond_3

    .line 183
    .line 184
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 185
    .line 186
    sget v5, Lcom/kubi/kumex/R$color;->c_text40:I

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3, v5}, Lcom/kubi/utils/c;->a(I)I

    .line 190
    move-result v3

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 194
    goto :goto_2

    .line 195
    .line 196
    :cond_3
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 197
    .line 198
    sget v5, Lcom/kubi/kumex/R$color;->c_text:I

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v5}, Lcom/kubi/utils/c;->a(I)I

    .line 202
    move-result v3

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 206
    .line 207
    .line 208
    :goto_2
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getAvailableCashAmount()Ljava/math/BigDecimal;

    .line 209
    move-result-object v3

    .line 210
    .line 211
    .line 212
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 213
    move-result-object v3

    .line 214
    .line 215
    const/16 v19, 0x61

    .line 216
    .line 217
    const/16 v20, 0x0

    .line 218
    const/4 v12, 0x0

    .line 219
    const/4 v14, 0x1

    .line 220
    const/4 v15, 0x1

    .line 221
    .line 222
    const/16 v16, 0x1

    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    const/16 v18, 0x0

    .line 227
    move-object v6, v11

    .line 228
    move-object v11, v3

    .line 229
    .line 230
    .line 231
    invoke-static/range {v11 .. v20}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 232
    move-result-object v3

    .line 233
    const/4 v7, 0x4

    .line 234
    const/4 v8, 0x0

    .line 235
    const/4 v5, 0x1

    .line 236
    move-object v11, v6

    .line 237
    const/4 v6, 0x0

    .line 238
    .line 239
    .line 240
    invoke-static/range {v3 .. v8}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 241
    move-result-object v3

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getAvailableCashAmount()Ljava/math/BigDecimal;

    .line 248
    move-result-object v2

    .line 249
    .line 250
    .line 251
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 252
    move-result-object v14

    .line 253
    .line 254
    const/16 v21, 0x7

    .line 255
    .line 256
    const/16 v22, 0x0

    .line 257
    const/4 v15, 0x0

    .line 258
    .line 259
    const/16 v16, 0x0

    .line 260
    .line 261
    const/16 v18, 0x0

    .line 262
    .line 263
    const/16 v19, 0x1

    .line 264
    .line 265
    const/16 v20, 0x1

    .line 266
    .line 267
    .line 268
    invoke-static/range {v14 .. v22}, Lkf/a;->g(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 269
    move-result-object v2

    .line 270
    .line 271
    const-string v3, "--"

    .line 272
    .line 273
    .line 274
    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 275
    move-result-object v2

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$a;->i()Landroidx/appcompat/widget/AppCompatTextView;

    .line 279
    move-result-object v3

    .line 280
    .line 281
    .line 282
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$a;->e()Landroidx/appcompat/widget/AppCompatTextView;

    .line 286
    move-result-object v2

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getRealisedPNL()Ljava/math/BigDecimal;

    .line 290
    move-result-object v3

    .line 291
    .line 292
    .line 293
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 294
    move-result-object v3

    .line 295
    .line 296
    const/16 v19, 0x61

    .line 297
    .line 298
    const/16 v20, 0x0

    .line 299
    const/4 v14, 0x1

    .line 300
    const/4 v15, 0x1

    .line 301
    .line 302
    const/16 v16, 0x1

    .line 303
    .line 304
    const/16 v18, 0x0

    .line 305
    move-object v6, v11

    .line 306
    move-object v11, v3

    .line 307
    .line 308
    .line 309
    invoke-static/range {v11 .. v20}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 310
    move-result-object v3

    .line 311
    .line 312
    .line 313
    invoke-static {v3}, Lnf/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 314
    move-result-object v3

    .line 315
    move-object v11, v6

    .line 316
    const/4 v6, 0x0

    .line 317
    .line 318
    .line 319
    invoke-static/range {v3 .. v8}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 320
    move-result-object v3

    .line 321
    .line 322
    .line 323
    invoke-static {v3}, Lnf/b;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 324
    move-result-object v3

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$a;->e()Landroidx/appcompat/widget/AppCompatTextView;

    .line 331
    move-result-object v2

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$a;->e()Landroidx/appcompat/widget/AppCompatTextView;

    .line 335
    move-result-object v3

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 339
    move-result-object v3

    .line 340
    .line 341
    const-string v5, "getContext(...)"

    .line 342
    .line 343
    .line 344
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getRealisedPNL()Ljava/math/BigDecimal;

    .line 348
    move-result-object v5

    .line 349
    .line 350
    .line 351
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 352
    move-result-object v5

    .line 353
    .line 354
    sget v6, Lcom/kubi/kumex/R$color;->c_text40:I

    .line 355
    .line 356
    .line 357
    invoke-static {v3, v5, v6}, Lcom/kubi/resources/g;->e(Landroid/content/Context;Ljava/math/BigDecimal;I)I

    .line 358
    move-result v3

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getRealisedPNL()Ljava/math/BigDecimal;

    .line 365
    move-result-object v2

    .line 366
    .line 367
    .line 368
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 369
    move-result-object v2

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getWithDrawHelpText()Ljava/lang/String;

    .line 373
    move-result-object v3

    .line 374
    const/4 v5, 0x1

    .line 375
    .line 376
    if-eqz v3, :cond_4

    .line 377
    .line 378
    .line 379
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 380
    move-result v3

    .line 381
    .line 382
    if-nez v3, :cond_5

    .line 383
    .line 384
    .line 385
    :cond_4
    invoke-virtual {v2, v11}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 386
    move-result v2

    .line 387
    .line 388
    if-lez v2, :cond_5

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$a;->f()Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 392
    move-result-object v2

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2, v5}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$a;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 399
    move-result-object v2

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$a;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 406
    move-result-object v2

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2, v10, v10, v10, v10}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 410
    goto :goto_3

    .line 411
    .line 412
    .line 413
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$a;->f()Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 414
    move-result-object v2

    .line 415
    .line 416
    .line 417
    invoke-virtual {v2, v9}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$a;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 421
    move-result-object v2

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$a;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 428
    move-result-object v2

    .line 429
    .line 430
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 431
    .line 432
    sget v5, Lcom/kubi/kumex/R$drawable;->ic_question_16:I

    .line 433
    .line 434
    sget v6, Lcom/kubi/kumex/R$color;->c_icon60:I

    .line 435
    .line 436
    .line 437
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 438
    move-result-object v6

    .line 439
    .line 440
    .line 441
    invoke-virtual {v3, v5, v6}, Lcom/kubi/utils/c;->c(ILjava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    .line 442
    move-result-object v3

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2, v10, v10, v3, v10}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 446
    .line 447
    .line 448
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$a;->b()Landroidx/appcompat/widget/AppCompatTextView;

    .line 449
    move-result-object v2

    .line 450
    .line 451
    .line 452
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getPrizeType()Ljava/lang/String;

    .line 453
    move-result-object v1

    .line 454
    .line 455
    .line 456
    invoke-static {v1}, Lcom/kubi/utils/t0;->b(Ljava/lang/String;)Z

    .line 457
    move-result v1

    .line 458
    .line 459
    const/16 v3, 0x29

    .line 460
    .line 461
    const-string v5, " ("

    .line 462
    .line 463
    if-eqz v1, :cond_6

    .line 464
    .line 465
    new-instance v1, Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 469
    .line 470
    sget-object v6, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 471
    .line 472
    sget v7, Lcom/kubi/kumex/R$string;->kumex_welfare_trial_amount:I

    .line 473
    .line 474
    new-array v8, v9, [Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v6, v7, v8}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 478
    move-result-object v6

    .line 479
    .line 480
    .line 481
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 494
    move-result-object v1

    .line 495
    goto :goto_4

    .line 496
    .line 497
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 501
    .line 502
    sget-object v6, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 503
    .line 504
    sget v7, Lcom/kubi/kumex/R$string;->airdrop_balance:I

    .line 505
    .line 506
    new-array v8, v9, [Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v6, v7, v8}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 510
    move-result-object v6

    .line 511
    .line 512
    .line 513
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 526
    move-result-object v1

    .line 527
    .line 528
    .line 529
    :goto_4
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$a;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 533
    move-result-object v1

    .line 534
    .line 535
    new-instance v2, Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 539
    .line 540
    sget-object v6, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 541
    .line 542
    sget v7, Lcom/kubi/kumex/R$string;->kumex_welfare_bonus_withdraw_amount:I

    .line 543
    .line 544
    new-array v8, v9, [Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v6, v7, v8}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 548
    move-result-object v7

    .line 549
    .line 550
    .line 551
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 564
    move-result-object v2

    .line 565
    .line 566
    .line 567
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/futures/trade/welfare/f0$a;->d()Landroidx/appcompat/widget/AppCompatTextView;

    .line 571
    move-result-object v1

    .line 572
    .line 573
    new-instance v2, Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 577
    .line 578
    sget v7, Lcom/kubi/kumex/R$string;->kumex_welfare_bonus_pnl:I

    .line 579
    .line 580
    new-array v8, v9, [Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v6, v7, v8}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 584
    move-result-object v6

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 600
    move-result-object v2

    .line 601
    .line 602
    .line 603
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 604
    return-void
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "holder"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    instance-of v0, p1, Lcom/kubi/futures/trade/welfare/f0$c;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Lcom/kubi/futures/trade/welfare/f0$c;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/kubi/futures/trade/welfare/f0;->r(Lcom/kubi/futures/trade/welfare/f0$c;I)V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    instance-of v0, p1, Lcom/kubi/futures/trade/welfare/f0$b;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    check-cast p1, Lcom/kubi/futures/trade/welfare/f0$b;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, Lcom/kubi/futures/trade/welfare/f0;->q(Lcom/kubi/futures/trade/welfare/f0$b;I)V

    .line 25
    return-void

    .line 26
    .line 27
    :cond_1
    instance-of v0, p1, Lcom/kubi/futures/trade/welfare/f0$a;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    check-cast p1, Lcom/kubi/futures/trade/welfare/f0$a;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1, p2}, Lcom/kubi/futures/trade/welfare/f0;->o(Lcom/kubi/futures/trade/welfare/f0$a;I)V

    .line 35
    return-void

    .line 36
    .line 37
    :cond_2
    check-cast p1, Lcom/kubi/futures/trade/welfare/f0$d;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1, p2}, Lcom/kubi/futures/trade/welfare/f0;->w(Lcom/kubi/futures/trade/welfare/f0$d;I)V

    .line 41
    return-void
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
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "parent"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x1

    .line 7
    .line 8
    if-eq p2, v0, :cond_2

    .line 9
    const/4 v0, 0x2

    .line 10
    .line 11
    if-eq p2, v0, :cond_1

    .line 12
    const/4 v0, 0x3

    .line 13
    .line 14
    if-eq p2, v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/welfare/f0;->C(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/welfare/f0;->x(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/welfare/f0;->D(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    .line 31
    .line 32
    :cond_2
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/welfare/f0;->B(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 33
    move-result-object p1

    .line 34
    return-object p1
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
.end method

.method public final p(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;)V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->s()Landroid/view/View;

    .line 4
    move-result-object v1

    .line 5
    .line 6
    const-string v2, "<get-tradeProLeverageRow>(...)"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->k()Landroidx/appcompat/widget/AppCompatTextView;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    const-string v2, "<get-holdingPeriodDesc>(...)"

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;->getAttributes()Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;

    .line 28
    move-result-object v8

    .line 29
    .line 30
    sget-object v1, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v8}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getCurrency()Ljava/lang/String;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object v2

    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v3, 0x2

    .line 45
    const/4 v4, 0x0

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v2, v9, v3, v4}, Lth/d;->E(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/CoinEntity;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/CoinEntity;->getProperties()Lcom/kubi/kumex/data/platform/model/PropertyEntity;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/PropertyEntity;->getShortDisplayPrecision()Ljava/lang/Integer;

    .line 61
    move-result-object v4

    .line 62
    :cond_0
    const/4 v1, 0x4

    .line 63
    .line 64
    .line 65
    invoke-static {v4, v1}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 66
    move-result v10

    .line 67
    .line 68
    iget-boolean v1, p0, Lcom/kubi/futures/trade/welfare/f0;->j:Z

    .line 69
    .line 70
    const-string v2, "<get-checkBox>(...)"

    .line 71
    .line 72
    .line 73
    const v4, 0x3ecccccd    # 0.4f

    .line 74
    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    .line 82
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    sget v2, Lcom/kubi/kumex/R$drawable;->ui_ic_checkbox_24:I

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/AppCompatCheckBox;->setBackgroundResource(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 98
    move-result-object v1

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v4}, Landroid/view/View;->setAlpha(F)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 109
    goto :goto_0

    .line 110
    .line 111
    .line 112
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 113
    move-result-object v1

    .line 114
    .line 115
    .line 116
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 120
    .line 121
    .line 122
    :goto_0
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 123
    move-result-object v1

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;->l()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 130
    move-result-object v1

    .line 131
    .line 132
    const-string v2, "<get-action>(...)"

    .line 133
    .line 134
    .line 135
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v8}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getStatus()Ljava/lang/String;

    .line 142
    move-result-object v1

    .line 143
    .line 144
    .line 145
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    move-result-object v1

    .line 147
    .line 148
    const-string v2, "EXPIRED"

    .line 149
    .line 150
    .line 151
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    move-result v1

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 156
    move-result-object v2

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 163
    move-result-object v2

    .line 164
    .line 165
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 166
    .line 167
    sget v5, Lcom/kubi/kumex/R$string;->kumex_welfare_coupon_rule_title:I

    .line 168
    .line 169
    new-array v6, v9, [Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3, v5, v6}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 173
    move-result-object v3

    .line 174
    .line 175
    .line 176
    invoke-virtual {v8}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getCouponAlias()Ljava/lang/String;

    .line 177
    move-result-object v5

    .line 178
    .line 179
    .line 180
    invoke-static {v3, v5}, Lcom/kubi/futures/trade/welfare/g0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    move-result-object v3

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    if-eqz v1, :cond_2

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->g()Landroidx/appcompat/widget/AppCompatTextView;

    .line 190
    move-result-object v2

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 197
    move-result-object v2

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 201
    goto :goto_1

    .line 202
    .line 203
    .line 204
    :cond_2
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->g()Landroidx/appcompat/widget/AppCompatTextView;

    .line 205
    move-result-object v2

    .line 206
    .line 207
    const/high16 v3, 0x3f800000    # 1.0f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 214
    move-result-object v2

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 218
    .line 219
    .line 220
    :goto_1
    invoke-virtual {v8}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getValidPeriod()Ljava/lang/Long;

    .line 221
    move-result-object v2

    .line 222
    .line 223
    const/16 v6, 0x10

    .line 224
    const/4 v7, 0x0

    .line 225
    const/4 v4, 0x0

    .line 226
    const/4 v5, 0x0

    .line 227
    move-object v0, p0

    .line 228
    move v3, v1

    .line 229
    move-object v1, p1

    .line 230
    .line 231
    .line 232
    invoke-static/range {v0 .. v7}, Lcom/kubi/futures/trade/welfare/f0;->Q(Lcom/kubi/futures/trade/welfare/f0;Lcom/kubi/futures/trade/welfare/f0$d;Ljava/lang/Long;ZZZILjava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v8}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getCurrency()Ljava/lang/String;

    .line 236
    move-result-object v2

    .line 237
    .line 238
    .line 239
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 240
    move-result-object v2

    .line 241
    .line 242
    .line 243
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    move-result-object v2

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, p1, v8, v10, v2}, Lcom/kubi/futures/trade/welfare/f0;->M(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;ILjava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0, p1, v8, v3}, Lcom/kubi/futures/trade/welfare/f0;->N(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;Z)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0, p1, v3}, Lcom/kubi/futures/trade/welfare/f0;->O(Lcom/kubi/futures/trade/welfare/f0$d;Z)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->e()Landroidx/appcompat/widget/AppCompatTextView;

    .line 257
    move-result-object v2

    .line 258
    .line 259
    const-string v3, "<get-api>(...)"

    .line 260
    .line 261
    .line 262
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v8}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getTradeMode()Ljava/lang/Integer;

    .line 266
    move-result-object v3

    .line 267
    .line 268
    .line 269
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 270
    move-result v3

    .line 271
    const/4 v4, 0x1

    .line 272
    .line 273
    if-ne v3, v4, :cond_3

    .line 274
    move v9, v4

    .line 275
    .line 276
    .line 277
    :cond_3
    invoke-static {v2, v9}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->o()Landroidx/appcompat/widget/AppCompatTextView;

    .line 281
    move-result-object v2

    .line 282
    .line 283
    const-string v3, "<get-miniTraAmount>(...)"

    .line 284
    .line 285
    .line 286
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->n()Landroidx/appcompat/widget/AppCompatTextView;

    .line 293
    move-result-object v1

    .line 294
    .line 295
    const-string v2, "<get-miniProRequirement>(...)"

    .line 296
    .line 297
    .line 298
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    invoke-static {v1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 302
    return-void
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
.end method

.method public final q(Lcom/kubi/futures/trade/welfare/f0$b;I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0;->o:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    check-cast p2, Lbm/f;

    .line 9
    .line 10
    instance-of v0, p2, Lbm/d;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 15
    .line 16
    const-string v0, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView"

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    check-cast p1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 22
    .line 23
    check-cast p2, Lbm/d;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Lbm/d;->a()Ljava/lang/String;

    .line 27
    move-result-object p2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    :cond_0
    return-void
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
.end method

.method public final r(Lcom/kubi/futures/trade/welfare/f0$c;I)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 3
    .line 4
    const-string v1, "itemView"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    const/4 v2, 0x0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    iget-object v2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    const-string v3, "getContext(...)"

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    const/16 v3, 0x14

    .line 33
    .line 34
    .line 35
    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 36
    move-result v2

    .line 37
    float-to-int v2, v2

    .line 38
    .line 39
    :goto_0
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 43
    .line 44
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0;->o:Ljava/util/List;

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    move-result-object p2

    .line 49
    .line 50
    check-cast p2, Lbm/f;

    .line 51
    .line 52
    instance-of v0, p2, Lbm/e;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 57
    .line 58
    const-string v0, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView"

    .line 59
    .line 60
    .line 61
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    check-cast p1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 64
    .line 65
    check-cast p2, Lbm/e;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Lbm/e;->a()Ljava/lang/String;

    .line 69
    move-result-object p2

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    :cond_1
    return-void

    .line 74
    .line 75
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 76
    .line 77
    const-string p2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 78
    .line 79
    .line 80
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 81
    throw p1
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
.end method

.method public final s(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;Z)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getMaxLeverage()Ljava/math/BigDecimal;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    const-string v0, "<get-tradeProLeverageRow>(...)"

    .line 7
    .line 8
    if-eqz p2, :cond_2

    .line 9
    .line 10
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 14
    move-result v1

    .line 15
    .line 16
    if-gtz v1, :cond_0

    .line 17
    goto :goto_1

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->s()Landroid/view/View;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->r()Landroidx/appcompat/widget/AppCompatTextView;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 34
    .line 35
    sget v2, Lcom/kubi/kumex/R$string;->kumex_trade_pro_max_leverage:I

    .line 36
    const/4 v3, 0x0

    .line 37
    .line 38
    new-array v4, v3, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->t()Landroidx/appcompat/widget/AppCompatTextView;

    .line 49
    move-result-object v0

    .line 50
    const/4 v1, 0x1

    .line 51
    const/4 v2, 0x0

    .line 52
    .line 53
    .line 54
    invoke-static {p2, v3, v1, v2}, Lcom/kubi/kumex/utils/k0;->d(Ljava/math/BigDecimal;ZILjava/lang/Object;)Ljava/lang/String;

    .line 55
    move-result-object p2

    .line 56
    .line 57
    .line 58
    invoke-static {p2}, Lnf/b;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    move-result-object p2

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->s()Landroid/view/View;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    if-eqz p3, :cond_1

    .line 69
    .line 70
    .line 71
    const p2, 0x3ecccccd    # 0.4f

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :cond_1
    const/high16 p2, 0x3f800000    # 1.0f

    .line 75
    .line 76
    .line 77
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 78
    return-void

    .line 79
    .line 80
    .line 81
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->s()Landroid/view/View;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    .line 85
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 89
    return-void
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
.end method

.method public final t(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/welfare/f0;->K(Lcom/kubi/futures/trade/welfare/f0$d;)V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getCurrency()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x2

    .line 20
    const/4 v4, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1, v2, v3, v4}, Lth/d;->E(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/CoinEntity;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/CoinEntity;->getProperties()Lcom/kubi/kumex/data/platform/model/PropertyEntity;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/PropertyEntity;->getShortDisplayPrecision()Ljava/lang/Integer;

    .line 36
    move-result-object v4

    .line 37
    :cond_0
    const/4 v0, 0x4

    .line 38
    .line 39
    .line 40
    invoke-static {v4, v0}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 41
    move-result v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getStatus()Ljava/lang/String;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    const-string v3, "RECYCLE_FINISHED"

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    move-result v7

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    const/high16 v3, 0x3f800000    # 1.0f

    .line 58
    .line 59
    .line 60
    const v4, 0x3ecccccd    # 0.4f

    .line 61
    .line 62
    if-eqz v7, :cond_1

    .line 63
    move v5, v4

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move v5, v3

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-virtual {v1, v5}, Landroid/view/View;->setAlpha(F)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->g()Landroidx/appcompat/widget/AppCompatTextView;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    if-eqz v7, :cond_2

    .line 75
    move v3, v4

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    sget-object v3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 85
    .line 86
    if-eqz v7, :cond_3

    .line 87
    .line 88
    sget v4, Lcom/kubi/kumex/R$color;->c_text60:I

    .line 89
    goto :goto_1

    .line 90
    .line 91
    :cond_3
    sget v4, Lcom/kubi/kumex/R$color;->c_text:I

    .line 92
    .line 93
    .line 94
    :goto_1
    invoke-virtual {v3, v4}, Lcom/kubi/utils/c;->a(I)I

    .line 95
    move-result v4

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getDisplayTitle()Ljava/lang/String;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    move-result-object v1

    .line 107
    .line 108
    .line 109
    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 110
    move-result v4

    .line 111
    .line 112
    if-eqz v4, :cond_4

    .line 113
    .line 114
    sget v1, Lcom/kubi/kumex/api/R$string;->kumex_trade_pro_trial_title:I

    .line 115
    .line 116
    new-array v4, v2, [Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v1, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    move-result-object v1

    .line 121
    .line 122
    .line 123
    :cond_4
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 124
    move-result-object v3

    .line 125
    const/4 v10, 0x1

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 132
    move-result-object v3

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getCouponAlias()Ljava/lang/String;

    .line 136
    move-result-object v4

    .line 137
    .line 138
    .line 139
    invoke-static {v1, v4}, Lcom/kubi/futures/trade/welfare/g0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    move-result-object v1

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v0, p1, p2, v2}, Lcom/kubi/futures/trade/welfare/f0;->u(ILcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, p1, p2, v7}, Lcom/kubi/futures/trade/welfare/f0;->s(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getExpiredPeriod()Ljava/lang/Long;

    .line 153
    move-result-object v6

    .line 154
    const/4 v8, 0x1

    .line 155
    const/4 v9, 0x1

    .line 156
    move-object v4, p0

    .line 157
    move-object v5, p1

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v4 .. v9}, Lcom/kubi/futures/trade/welfare/f0;->P(Lcom/kubi/futures/trade/welfare/f0$d;Ljava/lang/Long;ZZZ)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getType()Ljava/lang/String;

    .line 164
    move-result-object p1

    .line 165
    .line 166
    const-string v0, "NORMAL"

    .line 167
    .line 168
    .line 169
    invoke-static {p1, v0}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 170
    move-result-object p1

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, v5, p1, v7}, Lcom/kubi/futures/trade/welfare/f0;->V(Lcom/kubi/futures/trade/welfare/f0$d;Ljava/lang/String;Z)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5}, Lcom/kubi/futures/trade/welfare/f0$d;->g()Landroidx/appcompat/widget/AppCompatTextView;

    .line 177
    move-result-object p1

    .line 178
    .line 179
    const-string v0, "<get-condition>(...)"

    .line 180
    .line 181
    .line 182
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 186
    .line 187
    iget-boolean p1, v4, Lcom/kubi/futures/trade/welfare/f0;->j:Z

    .line 188
    .line 189
    const-string v0, "<get-action>(...)"

    .line 190
    .line 191
    const-string v1, "<get-checkBox>(...)"

    .line 192
    .line 193
    if-eqz p1, :cond_5

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getStatus()Ljava/lang/String;

    .line 197
    move-result-object p1

    .line 198
    .line 199
    const-string v3, "ACTIVATE_FINISHED"

    .line 200
    .line 201
    .line 202
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    move-result p1

    .line 204
    .line 205
    if-eqz p1, :cond_5

    .line 206
    .line 207
    .line 208
    invoke-virtual {v5}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 209
    move-result-object p1

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1, v10}, Landroid/view/View;->setEnabled(Z)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v5}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 216
    move-result-object p1

    .line 217
    .line 218
    sget v2, Lcom/kubi/kumex/R$drawable;->ui_selector_checkbox:I

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/AppCompatCheckBox;->setBackgroundResource(I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v5}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 225
    move-result-object p1

    .line 226
    .line 227
    .line 228
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getChecked()Z

    .line 229
    move-result p2

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v5}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 236
    move-result-object p1

    .line 237
    .line 238
    .line 239
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 246
    move-result-object p1

    .line 247
    .line 248
    .line 249
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v5}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 256
    move-result-object p1

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1}, Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;->l()V

    .line 260
    return-void

    .line 261
    .line 262
    .line 263
    :cond_5
    invoke-virtual {v5}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 264
    move-result-object p1

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v5}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 271
    move-result-object p1

    .line 272
    .line 273
    .line 274
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v5}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 281
    move-result-object p1

    .line 282
    .line 283
    .line 284
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p0, v5, p2}, Lcom/kubi/futures/trade/welfare/f0;->T(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->isLoading()Ljava/lang/Boolean;

    .line 294
    move-result-object p1

    .line 295
    .line 296
    .line 297
    invoke-static {p1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 298
    move-result p1

    .line 299
    .line 300
    if-eqz p1, :cond_6

    .line 301
    .line 302
    .line 303
    invoke-virtual {v5}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 304
    move-result-object p1

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->o()V

    .line 308
    return-void

    .line 309
    .line 310
    .line 311
    :cond_6
    invoke-virtual {v5}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 312
    move-result-object p1

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1}, Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;->l()V

    .line 316
    return-void
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
.end method

.method public final u(ILcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;Z)V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->c()Landroidx/appcompat/widget/AppCompatTextView;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getStatus()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const-string v2, "ACTIVATE_FINISHED"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    if-nez p4, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->isLeadTrialFund()Z

    .line 22
    move-result p4

    .line 23
    .line 24
    if-nez p4, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->isTradeProTrial()Z

    .line 28
    move-result p4

    .line 29
    .line 30
    if-nez p4, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getTrialFundBalance()Ljava/math/BigDecimal;

    .line 34
    move-result-object p4

    .line 35
    .line 36
    .line 37
    invoke-static {p4}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 38
    move-result-object p4

    .line 39
    :goto_0
    move-object v1, p4

    .line 40
    goto :goto_1

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p3}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getFaceValue()Ljava/math/BigDecimal;

    .line 44
    move-result-object p4

    .line 45
    .line 46
    .line 47
    invoke-static {p4}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 48
    move-result-object p4

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :goto_1
    const/16 v9, 0x69

    .line 52
    const/4 v10, 0x0

    .line 53
    const/4 v2, 0x0

    .line 54
    const/4 v4, 0x1

    .line 55
    const/4 v5, 0x0

    .line 56
    const/4 v6, 0x1

    .line 57
    const/4 v7, 0x0

    .line 58
    const/4 v8, 0x0

    .line 59
    move v3, p1

    .line 60
    .line 61
    .line 62
    invoke-static/range {v1 .. v10}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->d()Landroidx/appcompat/widget/AppCompatTextView;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getCurrency()Ljava/lang/String;

    .line 74
    move-result-object p4

    .line 75
    .line 76
    .line 77
    invoke-static {p4}, Lcom/kubi/utils/extensions/f;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    move-result-object p4

    .line 79
    .line 80
    .line 81
    invoke-static {p4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    move-result-object p4

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getStatus()Ljava/lang/String;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    const-string p4, "RECYCLE_FINISHED"

    .line 92
    .line 93
    .line 94
    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    move-result p1

    .line 96
    .line 97
    const-string p4, "VIP"

    .line 98
    .line 99
    if-eqz p1, :cond_2

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->c()Landroidx/appcompat/widget/AppCompatTextView;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 106
    .line 107
    sget v1, Lcom/kubi/kumex/R$color;->c_text60:I

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Lcom/kubi/utils/c;->a(I)I

    .line 111
    move-result v2

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->d()Landroidx/appcompat/widget/AppCompatTextView;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1}, Lcom/kubi/utils/c;->a(I)I

    .line 122
    move-result v0

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p3}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getType()Ljava/lang/String;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    .line 132
    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    move-result p1

    .line 134
    .line 135
    if-eqz p1, :cond_1

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->l()Landroid/widget/ImageView;

    .line 139
    move-result-object p1

    .line 140
    .line 141
    sget p3, Lcom/kubi/kumex/R$drawable;->bkumex_futures_vip_expire:I

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 145
    goto :goto_2

    .line 146
    .line 147
    .line 148
    :cond_1
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->l()Landroid/widget/ImageView;

    .line 149
    move-result-object p1

    .line 150
    .line 151
    sget p3, Lcom/kubi/kumex/R$drawable;->bkumex_futures_trial_expire:I

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 155
    .line 156
    .line 157
    :goto_2
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->c()Landroidx/appcompat/widget/AppCompatTextView;

    .line 158
    move-result-object p1

    .line 159
    .line 160
    .line 161
    const p3, 0x3ecccccd    # 0.4f

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, p3}, Landroid/view/View;->setAlpha(F)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->d()Landroidx/appcompat/widget/AppCompatTextView;

    .line 168
    move-result-object p1

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, p3}, Landroid/view/View;->setAlpha(F)V

    .line 172
    return-void

    .line 173
    .line 174
    .line 175
    :cond_2
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->c()Landroidx/appcompat/widget/AppCompatTextView;

    .line 176
    move-result-object p1

    .line 177
    .line 178
    const/high16 v0, 0x3f800000    # 1.0f

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->d()Landroidx/appcompat/widget/AppCompatTextView;

    .line 185
    move-result-object p1

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p3}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getType()Ljava/lang/String;

    .line 192
    move-result-object p1

    .line 193
    .line 194
    .line 195
    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 196
    move-result p1

    .line 197
    .line 198
    if-eqz p1, :cond_3

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->l()Landroid/widget/ImageView;

    .line 202
    move-result-object p1

    .line 203
    .line 204
    sget p3, Lcom/kubi/kumex/R$drawable;->bkumex_futures_vip:I

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->c()Landroidx/appcompat/widget/AppCompatTextView;

    .line 211
    move-result-object p1

    .line 212
    .line 213
    const-string p3, "#DB984B"

    .line 214
    .line 215
    .line 216
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 217
    move-result p4

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->d()Landroidx/appcompat/widget/AppCompatTextView;

    .line 224
    move-result-object p1

    .line 225
    .line 226
    .line 227
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 228
    move-result p2

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 232
    return-void

    .line 233
    .line 234
    .line 235
    :cond_3
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->l()Landroid/widget/ImageView;

    .line 236
    move-result-object p1

    .line 237
    .line 238
    sget p3, Lcom/kubi/kumex/R$drawable;->bkumex_futures_trial:I

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->c()Landroidx/appcompat/widget/AppCompatTextView;

    .line 245
    move-result-object p1

    .line 246
    .line 247
    sget-object p3, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 248
    .line 249
    sget p4, Lcom/kubi/kumex/R$color;->primary:I

    .line 250
    .line 251
    .line 252
    invoke-virtual {p3, p4}, Lcom/kubi/utils/c;->a(I)I

    .line 253
    move-result v0

    .line 254
    .line 255
    .line 256
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p2}, Lcom/kubi/futures/trade/welfare/f0$d;->d()Landroidx/appcompat/widget/AppCompatTextView;

    .line 260
    move-result-object p1

    .line 261
    .line 262
    .line 263
    invoke-virtual {p3, p4}, Lcom/kubi/utils/c;->a(I)I

    .line 264
    move-result p2

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 268
    return-void
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
.end method

.method public final v(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->s()Landroid/view/View;

    .line 4
    move-result-object v2

    .line 5
    .line 6
    const-string v3, "<get-tradeProLeverageRow>(...)"

    .line 7
    .line 8
    .line 9
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->k()Landroidx/appcompat/widget/AppCompatTextView;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    const-string v3, "<get-holdingPeriodDesc>(...)"

    .line 19
    .line 20
    .line 21
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 25
    .line 26
    sget-object v2, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getCurrency()Ljava/lang/String;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    .line 37
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    move-result-object v3

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v4, 0x2

    .line 41
    const/4 v5, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v3, v8, v4, v5}, Lth/d;->E(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/CoinEntity;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/CoinEntity;->getProperties()Lcom/kubi/kumex/data/platform/model/PropertyEntity;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/PropertyEntity;->getShortDisplayPrecision()Ljava/lang/Integer;

    .line 57
    move-result-object v5

    .line 58
    :cond_0
    const/4 v2, 0x4

    .line 59
    .line 60
    .line 61
    invoke-static {v5, v2}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 62
    move-result v9

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getCurrency()Ljava/lang/String;

    .line 66
    move-result-object v2

    .line 67
    .line 68
    .line 69
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    move-result-object v2

    .line 71
    .line 72
    .line 73
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    move-result-object v10

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getStatus()Ljava/lang/String;

    .line 78
    move-result-object v2

    .line 79
    .line 80
    const-string v3, "RECYCLE_FINISHED"

    .line 81
    .line 82
    .line 83
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    move-result v3

    .line 85
    .line 86
    if-eqz v3, :cond_1

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    .line 93
    const v4, 0x3ecccccd    # 0.4f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->g()Landroidx/appcompat/widget/AppCompatTextView;

    .line 100
    move-result-object v2

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    sget-object v4, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 110
    .line 111
    sget v5, Lcom/kubi/kumex/R$color;->c_text60:I

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, v5}, Lcom/kubi/utils/c;->a(I)I

    .line 115
    move-result v4

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 119
    goto :goto_0

    .line 120
    .line 121
    .line 122
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 123
    move-result-object v2

    .line 124
    .line 125
    const/high16 v4, 0x3f800000    # 1.0f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->g()Landroidx/appcompat/widget/AppCompatTextView;

    .line 132
    move-result-object v2

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 139
    move-result-object v2

    .line 140
    .line 141
    sget-object v4, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 142
    .line 143
    sget v5, Lcom/kubi/kumex/R$color;->c_text:I

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4, v5}, Lcom/kubi/utils/c;->a(I)I

    .line 147
    move-result v4

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 151
    .line 152
    :goto_0
    sget-object v2, Lcom/kubi/kumex/service/a;->a:Lcom/kubi/kumex/service/a;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Lcom/kubi/kumex/service/a;->b()Lcom/kubi/copytrading/ICopyTradingService;

    .line 156
    move-result-object v2

    .line 157
    .line 158
    .line 159
    invoke-interface {v2}, Lcom/kubi/copytrading/ICopyTradingService;->p()Z

    .line 160
    move-result v2

    .line 161
    .line 162
    if-nez v2, :cond_3

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->isLeadTrialFund()Z

    .line 166
    move-result v2

    .line 167
    .line 168
    if-eqz v2, :cond_2

    .line 169
    goto :goto_1

    .line 170
    .line 171
    :cond_2
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 172
    .line 173
    sget v4, Lcom/kubi/kumex/R$string;->kc_futures_trail_fund:I

    .line 174
    .line 175
    new-array v5, v8, [Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v4, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 179
    move-result-object v2

    .line 180
    goto :goto_2

    .line 181
    .line 182
    :cond_3
    :goto_1
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 183
    .line 184
    sget v4, Lcom/kubi/kumex/R$string;->kuemx_lead_trial_title:I

    .line 185
    .line 186
    new-array v5, v8, [Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v4, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 190
    move-result-object v2

    .line 191
    .line 192
    .line 193
    :goto_2
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 194
    move-result-object v4

    .line 195
    const/4 v11, 0x1

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->q()Landroidx/appcompat/widget/AppCompatTextView;

    .line 202
    move-result-object v4

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getCouponAlias()Ljava/lang/String;

    .line 206
    move-result-object v5

    .line 207
    .line 208
    .line 209
    invoke-static {v2, v5}, Lcom/kubi/futures/trade/welfare/g0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 210
    move-result-object v2

    .line 211
    .line 212
    .line 213
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0, v9, p1, p2, v8}, Lcom/kubi/futures/trade/welfare/f0;->u(ILcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;Z)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getExpiredPeriod()Ljava/lang/Long;

    .line 220
    move-result-object v2

    .line 221
    .line 222
    const/16 v6, 0x10

    .line 223
    const/4 v7, 0x0

    .line 224
    const/4 v4, 0x1

    .line 225
    const/4 v5, 0x0

    .line 226
    move-object v0, p0

    .line 227
    move-object v1, p1

    .line 228
    .line 229
    .line 230
    invoke-static/range {v0 .. v7}, Lcom/kubi/futures/trade/welfare/f0;->Q(Lcom/kubi/futures/trade/welfare/f0;Lcom/kubi/futures/trade/welfare/f0$d;Ljava/lang/Long;ZZZILjava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {p0 .. p2}, Lcom/kubi/futures/trade/welfare/f0;->T(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, p1, p2, v9, v10}, Lcom/kubi/futures/trade/welfare/f0;->U(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;ILjava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0, p1, p2, v9, v10}, Lcom/kubi/futures/trade/welfare/f0;->S(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;ILjava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, p1, p2, v9, v10}, Lcom/kubi/futures/trade/welfare/f0;->R(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;ILjava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getType()Ljava/lang/String;

    .line 246
    move-result-object v2

    .line 247
    .line 248
    const-string v4, "NORMAL"

    .line 249
    .line 250
    .line 251
    invoke-static {v2, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 252
    move-result-object v2

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0, p1, v2, v3}, Lcom/kubi/futures/trade/welfare/f0;->V(Lcom/kubi/futures/trade/welfare/f0$d;Ljava/lang/String;Z)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->p()Landroid/widget/ProgressBar;

    .line 259
    move-result-object v2

    .line 260
    .line 261
    const-string v3, "<get-progress>(...)"

    .line 262
    .line 263
    .line 264
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->i()Landroidx/appcompat/widget/AppCompatTextView;

    .line 271
    move-result-object v2

    .line 272
    .line 273
    const-string v3, "<get-expireTag>(...)"

    .line 274
    .line 275
    .line 276
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 280
    .line 281
    iget-boolean v2, p0, Lcom/kubi/futures/trade/welfare/f0;->j:Z

    .line 282
    .line 283
    const-string v3, "<get-action>(...)"

    .line 284
    .line 285
    const-string v4, "<get-checkBox>(...)"

    .line 286
    .line 287
    if-eqz v2, :cond_4

    .line 288
    .line 289
    .line 290
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getStatus()Ljava/lang/String;

    .line 291
    move-result-object v2

    .line 292
    .line 293
    const-string v5, "ACTIVATE_FINISHED"

    .line 294
    .line 295
    .line 296
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 297
    move-result v2

    .line 298
    .line 299
    if-eqz v2, :cond_4

    .line 300
    .line 301
    .line 302
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 303
    move-result-object v2

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v11}, Landroid/view/View;->setEnabled(Z)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 310
    move-result-object v2

    .line 311
    .line 312
    sget v5, Lcom/kubi/kumex/R$drawable;->ui_selector_checkbox:I

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v5}, Landroidx/appcompat/widget/AppCompatCheckBox;->setBackgroundResource(I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 319
    move-result-object v2

    .line 320
    .line 321
    .line 322
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getChecked()Z

    .line 323
    move-result v5

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v5}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 330
    move-result-object v2

    .line 331
    .line 332
    .line 333
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 340
    move-result-object v2

    .line 341
    .line 342
    .line 343
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 350
    move-result-object v1

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1}, Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;->l()V

    .line 354
    return-void

    .line 355
    .line 356
    .line 357
    :cond_4
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 358
    move-result-object v2

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2, v8}, Landroid/view/View;->setEnabled(Z)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->f()Landroidx/appcompat/widget/AppCompatCheckBox;

    .line 365
    move-result-object v2

    .line 366
    .line 367
    .line 368
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 375
    move-result-object v2

    .line 376
    .line 377
    .line 378
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->isLoading()Ljava/lang/Boolean;

    .line 385
    move-result-object v2

    .line 386
    .line 387
    .line 388
    invoke-static {v2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 389
    move-result v2

    .line 390
    .line 391
    if-eqz v2, :cond_5

    .line 392
    .line 393
    .line 394
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 395
    move-result-object v1

    .line 396
    .line 397
    .line 398
    invoke-virtual {v1}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->o()V

    .line 399
    return-void

    .line 400
    .line 401
    .line 402
    :cond_5
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->b()Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;

    .line 403
    move-result-object v1

    .line 404
    .line 405
    .line 406
    invoke-virtual {v1}, Lcom/kubi/futures/view/FuturesWelfarePrimaryButton;->l()V

    .line 407
    return-void
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
.end method

.method public final w(Lcom/kubi/futures/trade/welfare/f0$d;I)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/f0;->o:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    check-cast p2, Lbm/f;

    .line 9
    .line 10
    instance-of v0, p2, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;

    .line 11
    .line 12
    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 13
    .line 14
    const-string v2, "itemView"

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget v1, p0, Lcom/kubi/futures/trade/welfare/f0;->n:I

    .line 30
    .line 31
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 35
    .line 36
    check-cast p2, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, p2}, Lcom/kubi/futures/trade/welfare/f0;->p(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;)V

    .line 40
    return-void

    .line 41
    .line 42
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 46
    throw p1

    .line 47
    .line 48
    :cond_1
    instance-of v0, p2, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;

    .line 49
    .line 50
    if-eqz v0, :cond_7

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/kubi/futures/trade/welfare/f0$d;->e()Landroidx/appcompat/widget/AppCompatTextView;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    const-string v3, "<get-api>(...)"

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 63
    .line 64
    check-cast p2, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getPrizeType()Ljava/lang/String;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Lcom/kubi/utils/t0;->b(Ljava/lang/String;)Z

    .line 72
    move-result v0

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 83
    move-result-object v2

    .line 84
    .line 85
    if-eqz v2, :cond_2

    .line 86
    .line 87
    iget v1, p0, Lcom/kubi/futures/trade/welfare/f0;->n:I

    .line 88
    .line 89
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, Lcom/kubi/futures/trade/welfare/f0;->n(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V

    .line 96
    return-void

    .line 97
    .line 98
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 99
    .line 100
    .line 101
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 102
    throw p1

    .line 103
    .line 104
    .line 105
    :cond_3
    invoke-virtual {p2}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->isTradeProTrial()Z

    .line 106
    move-result v0

    .line 107
    .line 108
    const/16 v3, 0x1e

    .line 109
    .line 110
    const-string v4, "getContext(...)"

    .line 111
    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 115
    .line 116
    .line 117
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 121
    move-result-object v2

    .line 122
    .line 123
    if-eqz v2, :cond_4

    .line 124
    .line 125
    iget v1, p0, Lcom/kubi/futures/trade/welfare/f0;->n:I

    .line 126
    .line 127
    iget-object v5, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 131
    move-result-object v5

    .line 132
    .line 133
    .line 134
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v5, v3}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 138
    move-result v3

    .line 139
    float-to-int v3, v3

    .line 140
    add-int/2addr v1, v3

    .line 141
    .line 142
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, p1, p2}, Lcom/kubi/futures/trade/welfare/f0;->t(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V

    .line 149
    return-void

    .line 150
    .line 151
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 152
    .line 153
    .line 154
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 155
    throw p1

    .line 156
    .line 157
    :cond_5
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 158
    .line 159
    .line 160
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 164
    move-result-object v2

    .line 165
    .line 166
    if-eqz v2, :cond_6

    .line 167
    .line 168
    iget v1, p0, Lcom/kubi/futures/trade/welfare/f0;->n:I

    .line 169
    .line 170
    iget-object v5, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 174
    move-result-object v5

    .line 175
    .line 176
    .line 177
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-static {v5, v3}, Lcom/kubi/utils/extensions/c;->c(Landroid/content/Context;I)F

    .line 181
    move-result v3

    .line 182
    float-to-int v3, v3

    .line 183
    add-int/2addr v1, v3

    .line 184
    .line 185
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, p1, p2}, Lcom/kubi/futures/trade/welfare/f0;->v(Lcom/kubi/futures/trade/welfare/f0$d;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V

    .line 192
    return-void

    .line 193
    .line 194
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 195
    .line 196
    .line 197
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 198
    throw p1

    .line 199
    :cond_7
    return-void
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
.end method

.method public final x(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sget v1, Lcom/kubi/kumex/R$layout;->bkumex_futures_welfare_assets_item:I

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    new-instance v0, Lcom/kubi/futures/trade/welfare/f0$a;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p1}, Lcom/kubi/futures/trade/welfare/f0$a;-><init>(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/kubi/futures/trade/welfare/f0$a;->f()Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    const-string p1, "<get-withdraw>(...)"

    .line 30
    .line 31
    .line 32
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    new-instance v4, Lcom/kubi/futures/trade/welfare/z;

    .line 35
    .line 36
    .line 37
    invoke-direct {v4, v0, p0}, Lcom/kubi/futures/trade/welfare/z;-><init>(Lcom/kubi/futures/trade/welfare/f0$a;Lcom/kubi/futures/trade/welfare/f0;)V

    .line 38
    const/4 v5, 0x1

    .line 39
    const/4 v6, 0x0

    .line 40
    .line 41
    const-wide/16 v2, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/kubi/futures/trade/welfare/f0$a;->h()Landroidx/appcompat/widget/AppCompatTextView;

    .line 48
    move-result-object v7

    .line 49
    .line 50
    const-string p1, "<get-withdrawLabel>(...)"

    .line 51
    .line 52
    .line 53
    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    new-instance v10, Lcom/kubi/futures/trade/welfare/a0;

    .line 56
    .line 57
    .line 58
    invoke-direct {v10, v0, p0}, Lcom/kubi/futures/trade/welfare/a0;-><init>(Lcom/kubi/futures/trade/welfare/f0$a;Lcom/kubi/futures/trade/welfare/f0;)V

    .line 59
    const/4 v11, 0x1

    .line 60
    const/4 v12, 0x0

    .line 61
    .line 62
    const-wide/16 v8, 0x0

    .line 63
    .line 64
    .line 65
    invoke-static/range {v7 .. v12}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 66
    return-object v0
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
.end method
