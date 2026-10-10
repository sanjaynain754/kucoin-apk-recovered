package com.kubi.sdk.pkg.task;

/* JADX INFO: compiled from: DownloadTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@kotlin.Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/pkg/task/DownloadTask;", "", "Landroid/content/Context;", "context", "Lcom/kubi/sdk/pkg/task/d;", "info", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "priority", "<init>", "(Landroid/content/Context;Lcom/kubi/sdk/pkg/task/d;Lcom/kubi/sdk/pkg/task/DownloadPriority;)V", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "()V", "d", "f", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/kubi/sdk/pkg/task/d;", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "", "Ljava/lang/String;", "downloadPath", "e", "()Ljava/lang/String;", "downloadFile", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDownloadTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadTask.kt\ncom/kubi/sdk/pkg/task/DownloadTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 4 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n*L\n1#1,122:1\n1#2:123\n62#3:124\n22#4,2:125\n22#4,2:127\n*S KotlinDebug\n*F\n+ 1 DownloadTask.kt\ncom/kubi/sdk/pkg/task/DownloadTask\n*L\n31#1:124\n51#1:125,2\n116#1:127,2\n*E\n"})
public final class DownloadTask {

    /* JADX INFO: renamed from: a */
    @org.jetbrains.annotations.NotNull
    public final android.content.Context f47411a;

    /* JADX INFO: renamed from: b */
    @org.jetbrains.annotations.NotNull
    public final com.kubi.sdk.pkg.task.C23975d f47412b;

    /* JADX INFO: renamed from: c */
    @org.jetbrains.annotations.NotNull
    public final com.kubi.sdk.pkg.task.DownloadPriority f47413c;

    /* JADX INFO: renamed from: d */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String f47414d;

    /* JADX INFO: renamed from: e */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String f47415e;

    public DownloadTask(@org.jetbrains.annotations.NotNull android.content.Context r5, @org.jetbrains.annotations.NotNull com.kubi.sdk.pkg.task.C23975d r6, @org.jetbrains.annotations.NotNull com.kubi.sdk.pkg.task.DownloadPriority r7) {
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "info"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "priority"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r4.<init>()
            r4.f47411a = r5
            r4.f47412b = r6
            r4.f47413c = r7
            java.lang.String r5 = com.kubi.sdk.pkg.task.TaskCommonKt.m57795e(r5)
            java.lang.String r0 = r6.m57826a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.m57833h()
            int r3 = r2.length()
            if (r3 != 0) goto L33
            java.lang.String r2 = r6.m57831f()
        L33:
            r1.append(r2)
            com.kubi.sdk.pkg.task.DownloadPriority r2 = com.kubi.sdk.pkg.task.DownloadPriority.VERY_HIGH
            if (r7 != r2) goto L3d
            java.lang.String r7 = "_fg"
            goto L3f
        L3d:
            java.lang.String r7 = ""
        L3f:
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = "download"
            java.lang.String[] r7 = new java.lang.String[]{r0, r1, r7}
            java.lang.String r5 = com.kubi.sdk.pkg.task.TaskCommonKt.m57796f(r5, r7)
            r4.f47414d = r5
            java.lang.String r6 = r6.m57827b()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = java.io.File.separator
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            r4.f47415e = r5
            return
    }

    /* JADX INFO: renamed from: a */
    public final void m57768a() {
            r6 = this;
            r0 = 1506(0x5e2, float:2.11E-42)
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r2 = r6.f47415e     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            r1.<init>(r2)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            com.kubi.sdk.pkg.task.d r2 = r6.f47412b     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.Long r2 = r2.m57830e()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            if (r2 == 0) goto L63
            com.kubi.sdk.pkg.task.d r2 = r6.f47412b     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.Long r2 = r2.m57830e()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            long r2 = r2.longValue()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L63
            long r2 = r1.length()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            com.kubi.sdk.pkg.task.d r4 = r6.f47412b     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.Long r4 = r4.m57830e()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            if (r4 == 0) goto L3c
            long r4 = r4.longValue()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L3c
            goto L63
        L36:
            r1 = move-exception
            goto Ld8
        L39:
            r0 = move-exception
            goto Lf3
        L3c:
            com.kubi.sdk.pkg.task.TaskException r1 = new com.kubi.sdk.pkg.task.TaskException     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            r4.<init>()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r5 = "校验下载文件长度错误 "
            r4.append(r5)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            r4.append(r2)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r2 = "!="
            r4.append(r2)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            com.kubi.sdk.pkg.task.d r2 = r6.f47412b     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.Long r2 = r2.m57830e()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            r4.append(r2)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            r3 = 1504(0x5e0, float:2.108E-42)
            r1.<init>(r3, r2)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            throw r1     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
        L63:
            com.kubi.sdk.pkg.task.d r2 = r6.f47412b     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r2 = r2.m57828c()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r3 = "package_update"
            if (r2 == 0) goto Lb3
            int r2 = r2.length()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            if (r2 != 0) goto L74
            goto Lb3
        L74:
            com.kubi.sdk.pkg.task.d r2 = r6.f47412b     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            com.kubi.sdk.pkg.task.HashType r2 = r2.m57829d()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            com.kubi.sdk.pkg.task.d r4 = r6.f47412b     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r4 = r4.m57828c()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            boolean r1 = r2.compareFile(r1, r4)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            if (r1 == 0) goto Lab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            r1.<init>()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            com.kubi.sdk.pkg.task.d r2 = r6.f47412b     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r2 = r2.m57831f()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            r1.append(r2)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r2 = " 校验下载文件 "
            r1.append(r2)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r2 = r6.f47415e     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            r1.append(r2)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r2 = " 成功"
            r1.append(r2)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            p569qq.C43840a.m96550d(r1, r3)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            return
        Lab:
            com.kubi.sdk.pkg.task.TaskException r1 = new com.kubi.sdk.pkg.task.TaskException     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r2 = "校验下载文件hash错误"
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            throw r1     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
        Lb3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            r1.<init>()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            com.kubi.sdk.pkg.task.d r2 = r6.f47412b     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r2 = r2.m57831f()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            r1.append(r2)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r2 = " 无校验字段，跳过 "
            r1.append(r2)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r2 = r6.f47415e     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            r1.append(r2)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            r2 = 32
            r1.append(r2)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            p569qq.C43840a.m96552g(r1, r3)     // Catch: java.lang.Exception -> L36 com.kubi.sdk.pkg.task.TaskException -> L39
            return
        Ld8:
            com.kubi.sdk.pkg.task.TaskException r2 = new com.kubi.sdk.pkg.task.TaskException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "校验下载文件异常 "
            r3.append(r4)
            java.lang.String r4 = r1.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r0, r3, r1)
            throw r2
        Lf3:
            throw r0
    }

    /* JADX INFO: renamed from: b */
    public final void m57769b() {
            r9 = this;
            java.lang.String r1 = "package_update"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L51
            r0.<init>()     // Catch: java.lang.Exception -> L51
            com.kubi.sdk.pkg.task.d r2 = r9.f47412b     // Catch: java.lang.Exception -> L51
            java.lang.String r2 = r2.m57831f()     // Catch: java.lang.Exception -> L51
            r0.append(r2)     // Catch: java.lang.Exception -> L51
            java.lang.String r2 = " 清理下载目录 "
            r0.append(r2)     // Catch: java.lang.Exception -> L51
            java.lang.String r2 = r9.f47414d     // Catch: java.lang.Exception -> L51
            r0.append(r2)     // Catch: java.lang.Exception -> L51
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L51
            p569qq.C43840a.m96550d(r0, r1)     // Catch: java.lang.Exception -> L51
            com.kubi.sdk.pkg.util.a r0 = com.kubi.sdk.pkg.util.C23984a.f47488a     // Catch: java.lang.Exception -> L51
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L51
            java.lang.String r3 = r9.f47414d     // Catch: java.lang.Exception -> L51
            r2.<init>(r3)     // Catch: java.lang.Exception -> L51
            r0.m57863b(r2)     // Catch: java.lang.Exception -> L51
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L51
            java.lang.String r3 = r9.f47414d     // Catch: java.lang.Exception -> L51
            r2.<init>(r3)     // Catch: java.lang.Exception -> L51
            java.io.File r2 = r2.getParentFile()     // Catch: java.lang.Exception -> L51
            if (r2 == 0) goto L94
            boolean r3 = r2.exists()     // Catch: java.lang.Exception -> L51
            if (r3 == 0) goto L94
            boolean r3 = r2.isDirectory()     // Catch: java.lang.Exception -> L51
            if (r3 == 0) goto L94
            java.lang.String[] r3 = r2.list()     // Catch: java.lang.Exception -> L51
            if (r3 == 0) goto L54
            int r3 = r3.length     // Catch: java.lang.Exception -> L51
            if (r3 != 0) goto L50
            goto L54
        L50:
            return
        L51:
            r0 = move-exception
            r3 = r0
            goto L58
        L54:
            r0.m57863b(r2)     // Catch: java.lang.Exception -> L51
            return
        L58:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.kubi.sdk.pkg.task.d r2 = r9.f47412b
            java.lang.String r2 = r2.m57831f()
            r0.append(r2)
            java.lang.String r2 = " 清理下载目录异常 "
            r0.append(r2)
            java.lang.String r2 = r9.f47414d
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            java.lang.String r2 = r3.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            p569qq.C43840a.m96548b(r0, r1)
            com.kubi.sdk.pkg.util.PackageException r2 = new com.kubi.sdk.pkg.util.PackageException
            r7 = 8
            r8 = 0
            java.lang.String r4 = "package_update"
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = 2
            r1 = 0
            p569qq.C43846g.m96568c(r2, r1, r0, r1)
        L94:
            return
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c */
    public final java.lang.Object m57770c(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.kubi.sdk.pkg.task.TaskStatus> r14) {
            r13 = this;
            boolean r0 = r14 instanceof com.kubi.sdk.pkg.task.DownloadTask$execute$1
            if (r0 == 0) goto L13
            r0 = r14
            com.kubi.sdk.pkg.task.DownloadTask$execute$1 r0 = (com.kubi.sdk.pkg.task.DownloadTask$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kubi.sdk.pkg.task.DownloadTask$execute$1 r0 = new com.kubi.sdk.pkg.task.DownloadTask$execute$1
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1503(0x5df, float:2.106E-42)
            r4 = 1
            java.lang.String r5 = "package_update"
            if (r2 == 0) goto L4b
            if (r2 != r4) goto L43
            java.lang.Object r0 = r0.L$0
            r1 = r0
            com.kubi.sdk.pkg.task.DownloadTask r1 = (com.kubi.sdk.pkg.task.DownloadTask) r1
            kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            goto L5d
        L32:
            r0 = move-exception
            r14 = r0
        L34:
            r7 = r14
            goto La2
        L37:
            r0 = move-exception
            r14 = r0
            goto Le9
        L3b:
            r0 = move-exception
            r14 = r0
            goto Lf8
        L3f:
            r0 = move-exception
            r14 = r0
            goto L12e
        L43:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L4b:
            kotlin.ResultKt.throwOnFailure(r14)
            r13.m57773f()     // Catch: com.kubi.sdk.pkg.task.TaskException -> L37 java.lang.Exception -> L95 java.io.IOException -> L99 java.net.SocketTimeoutException -> L9d
            r0.L$0 = r13     // Catch: com.kubi.sdk.pkg.task.TaskException -> L37 java.lang.Exception -> L95 java.io.IOException -> L99 java.net.SocketTimeoutException -> L9d
            r0.label = r4     // Catch: com.kubi.sdk.pkg.task.TaskException -> L37 java.lang.Exception -> L95 java.io.IOException -> L99 java.net.SocketTimeoutException -> L9d
            java.lang.Object r14 = r13.m57771d(r0)     // Catch: com.kubi.sdk.pkg.task.TaskException -> L37 java.lang.Exception -> L95 java.io.IOException -> L99 java.net.SocketTimeoutException -> L9d
            if (r14 != r1) goto L5c
            return r1
        L5c:
            r1 = r13
        L5d:
            r1.m57768a()     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            r14.<init>()     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            com.kubi.sdk.pkg.task.d r0 = r1.f47412b     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            java.lang.String r0 = r0.m57831f()     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            r14.append(r0)     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            java.lang.String r0 = " 下载成功 "
            r14.append(r0)     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            java.lang.String r0 = r1.f47415e     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            r14.append(r0)     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            java.lang.String r0 = " [priority="
            r14.append(r0)     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            com.kubi.sdk.pkg.task.DownloadPriority r0 = r1.f47413c     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            r14.append(r0)     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            r0 = 93
            r14.append(r0)     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            p569qq.C43840a.m96550d(r14, r5)     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            com.kubi.sdk.pkg.task.TaskStatus$Companion r14 = com.kubi.sdk.pkg.task.TaskStatus.f47430e     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            com.kubi.sdk.pkg.task.TaskStatus r14 = r14.getOK()     // Catch: java.lang.Exception -> L32 com.kubi.sdk.pkg.task.TaskException -> L37 java.io.IOException -> L3b java.net.SocketTimeoutException -> L3f
            return r14
        L95:
            r0 = move-exception
            r14 = r0
            r1 = r13
            goto L34
        L99:
            r0 = move-exception
            r14 = r0
            r1 = r13
            goto Lf8
        L9d:
            r0 = move-exception
            r14 = r0
            r1 = r13
            goto L12e
        La2:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            com.kubi.sdk.pkg.task.d r0 = r1.f47412b
            java.lang.String r0 = r0.m57831f()
            r14.append(r0)
            java.lang.String r0 = " 下载遇到异常"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            p569qq.C43840a.m96548b(r14, r5)
            com.kubi.sdk.pkg.util.PackageException r6 = new com.kubi.sdk.pkg.util.PackageException
            r11 = 8
            r12 = 0
            java.lang.String r8 = "package_update"
            r9 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r14 = 2
            r0 = 0
            p569qq.C43846g.m96568c(r6, r0, r14, r0)
            com.kubi.sdk.pkg.task.TaskStatus$Companion r14 = com.kubi.sdk.pkg.task.TaskStatus.f47430e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "未知异常 "
            r0.append(r1)
            java.lang.String r1 = r7.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.kubi.sdk.pkg.task.TaskStatus r14 = r14.result(r3, r0)
            return r14
        Le9:
            com.kubi.sdk.pkg.task.TaskStatus$Companion r0 = com.kubi.sdk.pkg.task.TaskStatus.f47430e
            int r1 = r14.getCode()
            java.lang.String r14 = r14.getMessage()
            com.kubi.sdk.pkg.task.TaskStatus r14 = r0.result(r1, r14)
            return r14
        Lf8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.kubi.sdk.pkg.task.d r1 = r1.f47412b
            java.lang.String r1 = r1.m57831f()
            r0.append(r1)
            java.lang.String r1 = " 下载IO异常"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p569qq.C43840a.m96548b(r0, r5)
            com.kubi.sdk.pkg.task.TaskStatus$Companion r0 = com.kubi.sdk.pkg.task.TaskStatus.f47430e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "下载IO异常 "
            r1.append(r2)
            java.lang.String r14 = r14.getMessage()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            com.kubi.sdk.pkg.task.TaskStatus r14 = r0.result(r3, r14)
            return r14
        L12e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.kubi.sdk.pkg.task.d r1 = r1.f47412b
            java.lang.String r1 = r1.m57831f()
            r0.append(r1)
            java.lang.String r1 = " 下载超时"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p569qq.C43840a.m96548b(r0, r5)
            com.kubi.sdk.pkg.task.TaskStatus$Companion r0 = com.kubi.sdk.pkg.task.TaskStatus.f47430e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "下载超时 "
            r1.append(r2)
            java.lang.String r14 = r14.getMessage()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r1 = 1507(0x5e3, float:2.112E-42)
            com.kubi.sdk.pkg.task.TaskStatus r14 = r0.result(r1, r14)
            return r14
    }

    /* JADX INFO: renamed from: d */
    public final java.lang.Object m57771d(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r4 = this;
            com.kubi.sdk.pkg.task.d r0 = r4.f47412b
            java.lang.String r0 = r0.m57831f()
            com.kubi.sdk.pkg.task.d r1 = r4.f47412b
            java.lang.String r1 = r1.m57832g()
            java.lang.String r2 = r4.f47415e
            com.kubi.sdk.pkg.task.DownloadPriority r3 = r4.f47413c
            java.lang.Object r5 = com.kubi.sdk.pkg.task.HttpHelperKt.m57783i(r0, r1, r2, r3, r5)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r0) goto L1b
            return r5
        L1b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }

    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: e */
    public final java.lang.String m57772e() {
            r1 = this;
            java.lang.String r0 = r1.f47415e
            return r0
    }

    /* JADX INFO: renamed from: f */
    public final void m57773f() {
            r4 = this;
            java.lang.String r0 = "package_update"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3b
            r1.<init>()     // Catch: java.lang.Exception -> L3b
            com.kubi.sdk.pkg.task.d r2 = r4.f47412b     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = r2.m57831f()     // Catch: java.lang.Exception -> L3b
            r1.append(r2)     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = " 准备下载目录 "
            r1.append(r2)     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = r4.f47414d     // Catch: java.lang.Exception -> L3b
            r1.append(r2)     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3b
            p569qq.C43840a.m96550d(r1, r0)     // Catch: java.lang.Exception -> L3b
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = r4.f47414d     // Catch: java.lang.Exception -> L3b
            r1.<init>(r2)     // Catch: java.lang.Exception -> L3b
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L3b
            if (r2 == 0) goto L3d
            com.kubi.sdk.pkg.util.a r1 = com.kubi.sdk.pkg.util.C23984a.f47488a     // Catch: java.lang.Exception -> L3b
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = r4.f47414d     // Catch: java.lang.Exception -> L3b
            r2.<init>(r3)     // Catch: java.lang.Exception -> L3b
            r1.m57862a(r2)     // Catch: java.lang.Exception -> L3b
            return
        L3b:
            r1 = move-exception
            goto L41
        L3d:
            r1.mkdirs()     // Catch: java.lang.Exception -> L3b
            return
        L41:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.kubi.sdk.pkg.task.d r3 = r4.f47412b
            java.lang.String r3 = r3.m57831f()
            r2.append(r3)
            java.lang.String r3 = " 无法下载目录异常 "
            r2.append(r3)
            java.lang.String r3 = r4.f47414d
            r2.append(r3)
            r3 = 32
            r2.append(r3)
            java.lang.String r3 = r1.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            p569qq.C43840a.m96548b(r2, r0)
            throw r1
    }
}
