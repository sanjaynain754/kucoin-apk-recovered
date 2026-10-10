.class public final Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder;
.super Ljava/lang/Object;
.source "StickyDecoration.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/assets/view/stickydecoration/StickyDecoration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u000c\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000eJ\u0010\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u000eJ\u0006\u0010\u0018\u001a\u00020\u0007R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder;",
        "",
        "listener",
        "Lcom/kubi/assets/view/stickydecoration/StickyDecorationListener;",
        "<init>",
        "(Lcom/kubi/assets/view/stickydecoration/StickyDecorationListener;)V",
        "mDecoration",
        "Lcom/kubi/assets/view/stickydecoration/StickyDecoration;",
        "getMDecoration",
        "()Lcom/kubi/assets/view/stickydecoration/StickyDecoration;",
        "setMDecoration",
        "(Lcom/kubi/assets/view/stickydecoration/StickyDecoration;)V",
        "setGroupHeight",
        "groutHeight",
        "",
        "setGroupBackground",
        "background",
        "isAlignLeft",
        "b",
        "",
        "setDivideHeight",
        "height",
        "setDivideColor",
        "color",
        "build",
        "Companion",
        "AssetsCenterLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:Lcom/kubi/assets/view/stickydecoration/StickyDecoration;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder;->b:Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder$Companion;

    .line 9
    return-void
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
.end method

.method public constructor <init>(Lmb/b;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/kubi/assets/view/stickydecoration/StickyDecoration;-><init>(Lmb/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder;->a:Lcom/kubi/assets/view/stickydecoration/StickyDecoration;

    return-void
.end method

.method public synthetic constructor <init>(Lmb/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder;-><init>(Lmb/b;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/kubi/assets/view/stickydecoration/StickyDecoration;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder;->a:Lcom/kubi/assets/view/stickydecoration/StickyDecoration;

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
.end method

.method public final b(I)Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/view/stickydecoration/StickyDecoration$Builder;->a:Lcom/kubi/assets/view/stickydecoration/StickyDecoration;

    .line 3
    .line 4
    iput p1, v0, Lmb/a;->e:I

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
.end method
