.class public Lcom/blankj/utilcode/util/SpanUtils$h;
.super Landroid/text/style/CharacterStyle;
.source "SpanUtils.java"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/SpanUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public b:F

.field public c:F

.field public d:F

.field public e:I


# direct methods
.method public constructor <init>(FFFI)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 3
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils$h;->b:F

    .line 4
    iput p2, p0, Lcom/blankj/utilcode/util/SpanUtils$h;->c:F

    .line 5
    iput p3, p0, Lcom/blankj/utilcode/util/SpanUtils$h;->d:F

    .line 6
    iput p4, p0, Lcom/blankj/utilcode/util/SpanUtils$h;->e:I

    return-void
.end method

.method public synthetic constructor <init>(FFFILcom/blankj/utilcode/util/SpanUtils$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/blankj/utilcode/util/SpanUtils$h;-><init>(FFFI)V

    return-void
.end method


# virtual methods
.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/blankj/utilcode/util/SpanUtils$h;->b:F

    .line 3
    .line 4
    iget v1, p0, Lcom/blankj/utilcode/util/SpanUtils$h;->c:F

    .line 5
    .line 6
    iget v2, p0, Lcom/blankj/utilcode/util/SpanUtils$h;->d:F

    .line 7
    .line 8
    iget v3, p0, Lcom/blankj/utilcode/util/SpanUtils$h;->e:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 12
    return-void
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
.end method
