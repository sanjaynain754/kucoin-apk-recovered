.class public abstract Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent;
.super Ljava/lang/Object;
.source "SpotSidebarTabContract.kt"

# interfaces
.implements Lcom/kubi/mvi/state/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$FetchTabList;,
        Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$ListItemRemoved;,
        Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$SortList;,
        Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$TabChecked;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0004\u0008\t\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent;",
        "Lcom/kubi/mvi/state/IIntent;",
        "<init>",
        "()V",
        "FetchTabList",
        "TabChecked",
        "ListItemRemoved",
        "SortList",
        "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$FetchTabList;",
        "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$ListItemRemoved;",
        "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$SortList;",
        "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$TabChecked;",
        "MartLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent;-><init>()V

    return-void
.end method
