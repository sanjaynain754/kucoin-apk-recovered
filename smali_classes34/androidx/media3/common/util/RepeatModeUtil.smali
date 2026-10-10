.class public final Landroidx/media3/common/util/RepeatModeUtil;
.super Ljava/lang/Object;
.source "RepeatModeUtil.java"


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/common/util/RepeatModeUtil$RepeatToggleModes;
    }
.end annotation


# static fields
.field public static final REPEAT_TOGGLE_MODE_ALL:I = 0x2

.field public static final REPEAT_TOGGLE_MODE_NONE:I = 0x0

.field public static final REPEAT_TOGGLE_MODE_ONE:I = 0x1


# direct methods
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
.end method

.method public static getNextRepeatMode(II)I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    :goto_0
    const/4 v1, 0x2

    .line 3
    .line 4
    if-gt v0, v1, :cond_1

    .line 5
    .line 6
    add-int v1, p0, v0

    .line 7
    .line 8
    rem-int/lit8 v1, v1, 0x3

    .line 9
    .line 10
    .line 11
    invoke-static {v1, p1}, Landroidx/media3/common/util/RepeatModeUtil;->isRepeatModeEnabled(II)Z

    .line 12
    move-result v2

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    return v1

    .line 16
    .line 17
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return p0
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

.method public static isRepeatModeEnabled(II)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-eqz p0, :cond_4

    .line 4
    const/4 v1, 0x0

    .line 5
    .line 6
    if-eq p0, v0, :cond_2

    .line 7
    const/4 v2, 0x2

    .line 8
    .line 9
    if-eq p0, v2, :cond_0

    .line 10
    return v1

    .line 11
    .line 12
    :cond_0
    and-int/lit8 p0, p1, 0x2

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    return v0

    .line 16
    :cond_1
    return v1

    .line 17
    .line 18
    :cond_2
    and-int/lit8 p0, p1, 0x1

    .line 19
    .line 20
    if-eqz p0, :cond_3

    .line 21
    return v0

    .line 22
    :cond_3
    return v1

    .line 23
    :cond_4
    return v0
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
