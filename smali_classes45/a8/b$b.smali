.class public La8/b$b;
.super Ljava/lang/Object;
.source "APNGDecoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:B

.field public b:Landroid/graphics/Rect;

.field public c:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, La8/b$b;->b:Landroid/graphics/Rect;

    return-void
.end method

.method public synthetic constructor <init>(La8/b$a;)V
    .locals 0

    .line 3
    invoke-direct {p0}, La8/b$b;-><init>()V

    return-void
.end method
