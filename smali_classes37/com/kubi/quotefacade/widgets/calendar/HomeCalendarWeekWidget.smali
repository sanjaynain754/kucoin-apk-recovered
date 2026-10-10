.class public Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;
.super Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;
.source "HomeCalendarWeekWidget.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0012\u001a\u00020\u0013H\u0014J\u0008\u0010\u0014\u001a\u00020\u0015H\u0014J\u0008\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u0017\u001a\u00020\u00152\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0016J\u0008\u0010\u001b\u001a\u00020\u0015H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;",
        "Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;",
        "<init>",
        "()V",
        "binding",
        "Lcom/kubi/quotefacade/databinding/WidgetHomeCalendarWeekBinding;",
        "getBinding$QuoteFacadeLib_googleRelease",
        "()Lcom/kubi/quotefacade/databinding/WidgetHomeCalendarWeekBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "curDayListAdapter",
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;",
        "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "curWeekListAdapter",
        "curWeekAdapter",
        "Lio/chad/library/adapter/base/BaseQuickAdapter;",
        "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarWeekItemWrapper;",
        "getLayout",
        "",
        "initView",
        "",
        "onPullRefresh",
        "onEventDataUpdate",
        "dataList",
        "",
        "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;",
        "updateShowDate",
        "QuoteFacadeLib_googleRelease"
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
        "SMAP\nHomeCalendarWeekWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCalendarWeekWidget.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n147#2,16:119\n1#3:135\n*S KotlinDebug\n*F\n+ 1 HomeCalendarWeekWidget.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget\n*L\n28#1:119,16\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic c0:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final Y:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public Z:Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter<",
            "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;",
            "Lio/chad/library/adapter/base/BaseViewHolder;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public a0:Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter<",
            "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;",
            "Lio/chad/library/adapter/base/BaseViewHolder;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public b0:Lio/chad/library/adapter/base/BaseQuickAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/chad/library/adapter/base/BaseQuickAdapter<",
            "Ltv/b;",
            "Lio/chad/library/adapter/base/BaseViewHolder;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 3
    .line 4
    const-string v1, "getBinding$QuoteFacadeLib_googleRelease()Lcom/kubi/quotefacade/databinding/WidgetHomeCalendarWeekBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;

    .line 8
    .line 9
    const-string v4, "binding"

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    new-array v1, v1, [Lkotlin/reflect/KProperty;

    .line 20
    .line 21
    aput-object v0, v1, v2

    .line 22
    .line 23
    sput-object v1, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->c0:[Lkotlin/reflect/KProperty;

    .line 24
    return-void
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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget$special$$inlined$viewBindingFragment$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget$special$$inlined$viewBindingFragment$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->Y:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    return-void
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
.end method

.method private final L3()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->K3()Lbv/c1;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lbv/c1;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v1

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->K3()Lbv/c1;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v2, v2, Lbv/c1;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object v2, v1

    .line 22
    .line 23
    .line 24
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->K3()Lbv/c1;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Lbv/c1;->b()Lcom/google/android/material/card/MaterialCardView;

    .line 31
    move-result-object v1

    .line 32
    :cond_2
    const/4 v3, 0x1

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v2, v1, v3}, Lcom/kubi/quotefacade/widgets/calendar/k;->b(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Z)V

    .line 36
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
.end method


# virtual methods
.method public J3()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;->J3()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->L3()V

    .line 7
    return-void
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
.end method

.method public final K3()Lbv/c1;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->Y:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->c0:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/a;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lbv/c1;

    .line 14
    return-object v0
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
.end method

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/quotefacade/R$layout;->widget_home_calendar_week:I

    .line 3
    return v0
    .line 4
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
.end method

.method public initView()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/kucoin/home/v2/cards/BaseStateCardV2;->initView()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->L3()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->K3()Lbv/c1;

    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lbv/c1;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/kubi/resources/t;->g(Landroidx/recyclerview/widget/RecyclerView;Z)V

    .line 21
    .line 22
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;->F3()Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    iput-object v2, p0, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->Z:Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->K3()Lbv/c1;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    iget-object v0, v0, Lbv/c1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v1}, Lcom/kubi/resources/t;->g(Landroidx/recyclerview/widget/RecyclerView;Z)V

    .line 55
    .line 56
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 60
    move-result-object v3

    .line 61
    .line 62
    .line 63
    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;->F3()Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;

    .line 70
    move-result-object v2

    .line 71
    .line 72
    iput-object v2, p0, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->a0:Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->K3()Lbv/c1;

    .line 79
    move-result-object v0

    .line 80
    const/4 v2, 0x1

    .line 81
    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    iget-object v0, v0, Lbv/c1;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 85
    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    .line 89
    invoke-static {v0, v1}, Lcom/kubi/resources/t;->g(Landroidx/recyclerview/widget/RecyclerView;Z)V

    .line 90
    .line 91
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 95
    move-result-object v3

    .line 96
    const/4 v4, 0x7

    .line 97
    .line 98
    .line 99
    invoke-direct {v1, v3, v4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 103
    .line 104
    sget v1, Lcom/kubi/quotefacade/R$layout;->item_home_calendar_week:I

    .line 105
    const/4 v3, 0x0

    .line 106
    .line 107
    .line 108
    invoke-static {v3, v2, v3}, Lcom/kubi/quotefacade/widgets/calendar/k;->g(Ljava/util/List;ILjava/lang/Object;)Ljava/util/List;

    .line 109
    move-result-object v3

    .line 110
    .line 111
    new-instance v4, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget$initView$3$1;

    .line 112
    .line 113
    .line 114
    invoke-direct {v4, v1, v3}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget$initView$3$1;-><init>(ILjava/util/List;)V

    .line 115
    .line 116
    iput-object v4, p0, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->b0:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 120
    .line 121
    .line 122
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->hashCode()I

    .line 123
    move-result v0

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 127
    move-result-object v0

    .line 128
    .line 129
    .line 130
    invoke-static {v2, v0}, Lcom/kubi/quotefacade/widgets/calendar/n;->b(ZLjava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 134
    move-result v0

    .line 135
    .line 136
    if-eqz v0, :cond_3

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->K3()Lbv/c1;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    if-eqz v0, :cond_3

    .line 143
    .line 144
    iget-object v0, v0, Lbv/c1;->h:Landroid/view/View;

    .line 145
    .line 146
    if-eqz v0, :cond_3

    .line 147
    .line 148
    sget v1, Lcom/kubi/quotefacade/R$drawable;->home_calendar_week_day_rtl_bg_gradient:I

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 152
    :cond_3
    return-void
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
.end method

.method public onEventDataUpdate(Ljava/util/List;)V
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->Z:Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v1

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-static {v0}, Lcom/kubi/quotefacade/widgets/calendar/n;->e(Ljava/util/List;)V

    .line 15
    .line 16
    iget-object v0, p0, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->Z:Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    const/4 v2, 0x1

    .line 20
    const/4 v3, 0x4

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v2, v3}, Lcom/kubi/quotefacade/widgets/calendar/k;->p(Ljava/util/List;ZI)Ljava/util/List;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->a0:Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 35
    move-result-object v0

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move-object v0, v1

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-static {v0}, Lcom/kubi/quotefacade/widgets/calendar/n;->e(Ljava/util/List;)V

    .line 41
    .line 42
    iget-object v0, p0, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->a0:Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    const/4 v2, 0x0

    .line 46
    const/4 v3, 0x2

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v2, v3, v1}, Lcom/kubi/quotefacade/widgets/calendar/k;->z(Ljava/util/List;IILjava/lang/Object;)Ljava/util/List;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 54
    .line 55
    :cond_3
    iget-object v0, p0, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarWeekWidget;->b0:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, Lcom/kubi/quotefacade/widgets/calendar/k;->f(Ljava/util/List;)Ljava/util/List;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 65
    :cond_4
    return-void
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
.end method
