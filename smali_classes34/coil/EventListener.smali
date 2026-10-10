.class public interface abstract Lcoil/EventListener;
.super Ljava/lang/Object;
.source "EventListener.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcoil/EventListener$Factory;,
        Lcoil/EventListener$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008f\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcoil/EventListener;",
        "",
        "a",
        "b",
        "Factory",
        "coil-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcoil/EventListener$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lcoil/EventListener;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcoil/EventListener$b;->a:Lcoil/EventListener$b;

    .line 3
    .line 4
    sput-object v0, Lcoil/EventListener;->a:Lcoil/EventListener$b;

    .line 5
    .line 6
    new-instance v0, Lcoil/EventListener$a;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcoil/EventListener$a;-><init>()V

    .line 10
    .line 11
    sput-object v0, Lcoil/EventListener;->b:Lcoil/EventListener;

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
