.class public final Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget$createAdapter$1;
.super Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;
.source "HomeCalendarBaseWidget.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;->F3()Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter<",
        "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001c\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014\u00a8\u0006\u0008"
    }
    d2 = {
        "com/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget$createAdapter$1",
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;",
        "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "convert",
        "",
        "helper",
        "item",
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
        "SMAP\nHomeCalendarBaseWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCalendarBaseWidget.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget$createAdapter$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,145:1\n216#2,2:146\n*S KotlinDebug\n*F\n+ 1 HomeCalendarBaseWidget.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget$createAdapter$1\n*L\n84#1:146,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic i:Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;


# direct methods
.method public constructor <init>(Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget$createAdapter$1;->i:Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    .line 6
    const/4 p1, 0x1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->setHasStableIds(Z)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Ltv/a;->a()Ljava/util/Map;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    move-result p2

    .line 26
    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    move-result-object p2

    .line 32
    .line 33
    check-cast p2, Ljava/util/Map$Entry;

    .line 34
    .line 35
    .line 36
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    check-cast v0, Ljava/lang/Number;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 43
    move-result v0

    .line 44
    .line 45
    .line 46
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 47
    move-result-object p2

    .line 48
    .line 49
    check-cast p2, Ljava/lang/Number;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 53
    move-result p2

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    return-void
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
.end method


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget$createAdapter$1;->g(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;)V

    .line 6
    return-void
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
.end method

.method public g(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;)V
    .locals 2

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    :cond_0
    if-nez p2, :cond_1

    .line 6
    goto :goto_0

    .line 7
    .line 8
    .line 9
    :cond_1
    invoke-static {}, Ltv/a;->a()Ljava/util/Map;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;->getItemType()I

    .line 14
    move-result v1

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    goto :goto_0

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-virtual {p2}, Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;->getItemType()I

    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x1

    .line 31
    .line 32
    if-eq v0, v1, :cond_5

    .line 33
    const/4 v1, 0x2

    .line 34
    .line 35
    if-eq v0, v1, :cond_4

    .line 36
    const/4 v1, 0x3

    .line 37
    .line 38
    if-eq v0, v1, :cond_3

    .line 39
    const/4 v1, 0x4

    .line 40
    .line 41
    if-eq v0, v1, :cond_3

    .line 42
    :goto_0
    return-void

    .line 43
    .line 44
    :cond_3
    iget-object v0, p0, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget$createAdapter$1;->i:Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;->a()Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;

    .line 48
    move-result-object p2

    .line 49
    .line 50
    .line 51
    invoke-static {v0, p1, p2}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;->s3(Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;)V

    .line 52
    return-void

    .line 53
    .line 54
    :cond_4
    iget-object v0, p0, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget$createAdapter$1;->i:Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;->a()Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;

    .line 58
    move-result-object p2

    .line 59
    .line 60
    .line 61
    invoke-static {v0, p1, p2}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;->t3(Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;)V

    .line 62
    return-void

    .line 63
    .line 64
    :cond_5
    iget-object v0, p0, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget$createAdapter$1;->i:Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;->a()Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;

    .line 68
    move-result-object p2

    .line 69
    .line 70
    .line 71
    invoke-static {v0, p1, p2}, Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;->u3(Lcom/kubi/quotefacade/widgets/calendar/HomeCalendarBaseWidget;Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventEntity;)V

    .line 72
    return-void
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
.end method
