.class public Lcn/jiguang/privates/analysis/global/JAnalysisGlobal;
.super Ljava/lang/Object;
.source "JAnalysisGlobal.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "JAnalysisGlobal"

.field private static config:Lcn/jiguang/privates/analysis/api/Config;


# direct methods
.method public constructor <init>()V
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
    .line 18
.end method

.method public static getConfig()Lcn/jiguang/privates/analysis/api/Config;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcn/jiguang/privates/analysis/global/JAnalysisGlobal;->config:Lcn/jiguang/privates/analysis/api/Config;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcn/jiguang/privates/analysis/api/Config;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcn/jiguang/privates/analysis/api/Config;-><init>()V

    .line 10
    .line 11
    sput-object v0, Lcn/jiguang/privates/analysis/global/JAnalysisGlobal;->config:Lcn/jiguang/privates/analysis/api/Config;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcn/jiguang/privates/analysis/global/JAnalysisGlobal;->config:Lcn/jiguang/privates/analysis/api/Config;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public static setConfig(Lcn/jiguang/privates/analysis/api/Config;)V
    .locals 0

    .line 1
    .line 2
    sput-object p0, Lcn/jiguang/privates/analysis/global/JAnalysisGlobal;->config:Lcn/jiguang/privates/analysis/api/Config;

    .line 3
    return-void
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
.end method
