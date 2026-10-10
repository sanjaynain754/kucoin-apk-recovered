.class public Lio/flutter/embedding/android/FlutterActivityLaunchConfigs;
.super Ljava/lang/Object;
.source "FlutterActivityLaunchConfigs.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/android/FlutterActivityLaunchConfigs$BackgroundMode;
    }
.end annotation


# static fields
.field static final DART_ENTRYPOINT_META_DATA_KEY:Ljava/lang/String; = "io.flutter.Entrypoint"

.field static final DART_ENTRYPOINT_URI_META_DATA_KEY:Ljava/lang/String; = "io.flutter.EntrypointUri"

.field static final DEFAULT_BACKGROUND_MODE:Ljava/lang/String;

.field static final DEFAULT_DART_ENTRYPOINT:Ljava/lang/String; = "main"

.field static final DEFAULT_INITIAL_ROUTE:Ljava/lang/String; = "/"

.field static final EXTRA_BACKGROUND_MODE:Ljava/lang/String; = "background_mode"

.field static final EXTRA_CACHED_ENGINE_GROUP_ID:Ljava/lang/String; = "cached_engine_group_id"

.field static final EXTRA_CACHED_ENGINE_ID:Ljava/lang/String; = "cached_engine_id"

.field static final EXTRA_DART_ENTRYPOINT:Ljava/lang/String; = "dart_entrypoint"

.field static final EXTRA_DART_ENTRYPOINT_ARGS:Ljava/lang/String; = "dart_entrypoint_args"

.field static final EXTRA_DESTROY_ENGINE_WITH_ACTIVITY:Ljava/lang/String; = "destroy_engine_with_activity"

.field static final EXTRA_ENABLE_STATE_RESTORATION:Ljava/lang/String; = "enable_state_restoration"

.field static final EXTRA_INITIAL_ROUTE:Ljava/lang/String; = "route"

.field static final HANDLE_DEEPLINKING_META_DATA_KEY:Ljava/lang/String; = "flutter_deeplinking_enabled"

.field static final INITIAL_ROUTE_META_DATA_KEY:Ljava/lang/String; = "io.flutter.InitialRoute"

.field static final NORMAL_THEME_META_DATA_KEY:Ljava/lang/String; = "io.flutter.embedding.android.NormalTheme"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lio/flutter/embedding/android/FlutterActivityLaunchConfigs$BackgroundMode;->opaque:Lio/flutter/embedding/android/FlutterActivityLaunchConfigs$BackgroundMode;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lio/flutter/embedding/android/FlutterActivityLaunchConfigs;->DEFAULT_BACKGROUND_MODE:Ljava/lang/String;

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
.end method

.method public static deepLinkEnabled(Landroid/os/Bundle;)Z
    .locals 2

    .line 1
    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const-string v0, "flutter_deeplinking_enabled"

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x1

    .line 17
    return p0
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
.end method
