.class Lcom/sensorsdata/analytics/android/sdk/util/WeakSet$EmptyIterator;
.super Ljava/lang/Object;
.source "WeakSet.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sensorsdata/analytics/android/sdk/util/WeakSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EmptyIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TE;>;"
    }
.end annotation


# static fields
.field private static EMPTY_ITERATOR:Lcom/sensorsdata/analytics/android/sdk/util/WeakSet$EmptyIterator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sensorsdata/analytics/android/sdk/util/WeakSet$EmptyIterator;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sensorsdata/analytics/android/sdk/util/WeakSet$EmptyIterator;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sensorsdata/analytics/android/sdk/util/WeakSet$EmptyIterator;->EMPTY_ITERATOR:Lcom/sensorsdata/analytics/android/sdk/util/WeakSet$EmptyIterator;

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
.end method

.method private constructor <init>()V
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
.end method

.method public static synthetic access$000()Lcom/sensorsdata/analytics/android/sdk/util/WeakSet$EmptyIterator;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sensorsdata/analytics/android/sdk/util/WeakSet$EmptyIterator;->EMPTY_ITERATOR:Lcom/sensorsdata/analytics/android/sdk/util/WeakSet$EmptyIterator;

    .line 3
    return-object v0
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
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 3
    .line 4
    const-string v1, "EmptyIterator should not call this method directly"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 8
    throw v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
