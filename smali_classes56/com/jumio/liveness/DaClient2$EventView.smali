.class public final Lcom/jumio/liveness/DaClient2$EventView;
.super Ljava/lang/Object;
.source "DaClient2.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jumio/liveness/DaClient2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "EventView"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/liveness/DaClient2$EventView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0086 J\t\u0010\u0008\u001a\u00020\u0003H\u0086 J\t\u0010\t\u001a\u00020\nH\u0086 J\u0011\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\nH\u0086 J\u0013\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000c\u001a\u00020\nH\u0086 J\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000c\u001a\u00020\nH\u0086 J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/jumio/liveness/DaClient2$EventView;",
        "",
        "ptr",
        "",
        "<init>",
        "(J)V",
        "getName",
        "",
        "getTimestamp",
        "getAttributeCount",
        "",
        "getAttributeName",
        "index",
        "getAttributeValueString",
        "getAttributeValueDataView",
        "Ljava/nio/ByteBuffer;",
        "copy",
        "Lcom/jumio/liveness/DaClient2$Event;",
        "Companion",
        "dasdk_withoutAssetsRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/jumio/liveness/DaClient2$EventView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final ptr:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/liveness/DaClient2$EventView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/liveness/DaClient2$EventView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/liveness/DaClient2$EventView;->Companion:Lcom/jumio/liveness/DaClient2$EventView$Companion;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/jumio/liveness/DaClient2$EventView$Companion;->access$loadType(Lcom/jumio/liveness/DaClient2$EventView$Companion;)V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-wide p1, p0, Lcom/jumio/liveness/DaClient2$EventView;->ptr:J

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
.end method

.method public static final synthetic access$loadType()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/jumio/liveness/DaClient2$EventView;->loadType()V

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
.end method

.method private static final native loadType()V
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation
.end method


# virtual methods
.method public final copy()Lcom/jumio/liveness/DaClient2$Event;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/liveness/DaClient2$Event;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/jumio/liveness/DaClient2$Event;-><init>(Lcom/jumio/liveness/DaClient2$EventView;)V

    .line 6
    return-object v0
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
.end method

.method public final native getAttributeCount()I
.end method

.method public final native getAttributeName(I)Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final native getAttributeValueDataView(I)Ljava/nio/ByteBuffer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public final native getAttributeValueString(I)Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public final native getName()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final native getTimestamp()J
.end method
