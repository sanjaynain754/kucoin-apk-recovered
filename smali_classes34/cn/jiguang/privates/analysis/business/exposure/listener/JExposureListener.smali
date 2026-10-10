.class public Lcn/jiguang/privates/analysis/business/exposure/listener/JExposureListener;
.super Ljava/lang/Object;
.source "JExposureListener.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnDrawListener;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private lastDrawTime:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcn/jiguang/privates/analysis/business/exposure/listener/JExposureListener;->context:Landroid/content/Context;

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
.end method


# virtual methods
.method public onDraw()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, Lcn/jiguang/privates/analysis/business/exposure/listener/JExposureListener;->lastDrawTime:J

    .line 7
    .line 8
    sub-long v2, v0, v2

    .line 9
    .line 10
    const-wide/16 v4, 0x64

    .line 11
    .line 12
    cmp-long v2, v2, v4

    .line 13
    .line 14
    const/16 v3, 0xfa5

    .line 15
    .line 16
    const-string v4, "JIGUANG-PRIVATES-ANALYSIS"

    .line 17
    .line 18
    if-gez v2, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, Lcn/jiguang/privates/analysis/business/exposure/listener/JExposureListener;->context:Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v4, v3}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->removeMessages(Landroid/content/Context;Ljava/lang/String;I)V

    .line 24
    .line 25
    :cond_0
    iput-wide v0, p0, Lcn/jiguang/privates/analysis/business/exposure/listener/JExposureListener;->lastDrawTime:J

    .line 26
    .line 27
    iget-object v0, p0, Lcn/jiguang/privates/analysis/business/exposure/listener/JExposureListener;->context:Landroid/content/Context;

    .line 28
    const/4 v1, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v4, v3, v1}, Lcn/jiguang/privates/common/api/JCommonPrivatesApi;->sendMessage(Landroid/content/Context;Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 32
    return-void
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
.end method
