.class public Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;
.super Ljava/lang/Object;
.source "TouchEventCoalescingKeyHelper.java"


# instance fields
.field private final mDownTimeToCoalescingKey:Landroid/util/SparseIntArray;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/util/SparseIntArray;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;->mDownTimeToCoalescingKey:Landroid/util/SparseIntArray;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method


# virtual methods
.method public addCoalescingKey(J)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;->mDownTimeToCoalescingKey:Landroid/util/SparseIntArray;

    .line 3
    long-to-int p1, p1

    .line 4
    const/4 p2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseIntArray;->put(II)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public getCoalescingKey(J)S
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;->mDownTimeToCoalescingKey:Landroid/util/SparseIntArray;

    .line 3
    long-to-int p1, p1

    .line 4
    const/4 p2, -0x1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseIntArray;->get(II)I

    .line 8
    move-result p1

    .line 9
    .line 10
    if-eq p1, p2, :cond_0

    .line 11
    .line 12
    .line 13
    const p2, 0xffff

    .line 14
    and-int/2addr p1, p2

    .line 15
    int-to-short p1, p1

    .line 16
    return p1

    .line 17
    .line 18
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    const-string p2, "Tried to get non-existent cookie"

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 24
    throw p1
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
    .line 78
.end method

.method public hasCoalescingKey(J)Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;->mDownTimeToCoalescingKey:Landroid/util/SparseIntArray;

    .line 3
    long-to-int p1, p1

    .line 4
    const/4 p2, -0x1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseIntArray;->get(II)I

    .line 8
    move-result p1

    .line 9
    .line 10
    if-ne p1, p2, :cond_0

    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x1

    .line 14
    return p1
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

.method public incrementCoalescingKey(J)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;->mDownTimeToCoalescingKey:Landroid/util/SparseIntArray;

    .line 3
    long-to-int p1, p1

    .line 4
    const/4 p2, -0x1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseIntArray;->get(II)I

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eq v0, p2, :cond_0

    .line 11
    .line 12
    iget-object p2, p0, Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;->mDownTimeToCoalescingKey:Landroid/util/SparseIntArray;

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, p1, v0}, Landroid/util/SparseIntArray;->put(II)V

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 21
    .line 22
    const-string p2, "Tried to increment non-existent cookie"

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 26
    throw p1
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
    .line 78
.end method

.method public removeCoalescingKey(J)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;->mDownTimeToCoalescingKey:Landroid/util/SparseIntArray;

    .line 3
    long-to-int p1, p1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/util/SparseIntArray;->delete(I)V

    .line 7
    return-void
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
