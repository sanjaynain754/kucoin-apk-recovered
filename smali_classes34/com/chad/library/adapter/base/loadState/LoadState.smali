.class public abstract Lcom/chad/library/adapter/base/loadState/LoadState;
.super Ljava/lang/Object;
.source "LoadState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chad/library/adapter/base/loadState/LoadState$Error;,
        Lcom/chad/library/adapter/base/loadState/LoadState$Loading;,
        Lcom/chad/library/adapter/base/loadState/LoadState$None;,
        Lcom/chad/library/adapter/base/loadState/LoadState$NotLoading;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0004\u0007\u0008\t\nB\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0004\u000b\u000c\r\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/chad/library/adapter/base/loadState/LoadState;",
        "",
        "endOfPaginationReached",
        "",
        "(Z)V",
        "getEndOfPaginationReached",
        "()Z",
        "Error",
        "Loading",
        "None",
        "NotLoading",
        "Lcom/chad/library/adapter/base/loadState/LoadState$Error;",
        "Lcom/chad/library/adapter/base/loadState/LoadState$Loading;",
        "Lcom/chad/library/adapter/base/loadState/LoadState$None;",
        "Lcom/chad/library/adapter/base/loadState/LoadState$NotLoading;",
        "com.github.CymChad.brvah"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final endOfPaginationReached:Z


# direct methods
.method private constructor <init>(Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/chad/library/adapter/base/loadState/LoadState;->endOfPaginationReached:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/chad/library/adapter/base/loadState/LoadState;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final getEndOfPaginationReached()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/chad/library/adapter/base/loadState/LoadState;->endOfPaginationReached:Z

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
.end method
