package okio.internal;

/* JADX INFO: renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes61.dex */
@kotlin.Metadata(m90083d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0016\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0003*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m90084d2 = {"collectRecursively", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "stack", "Lkotlin/collections/ArrayDeque;", "path", "followSymlinks", "", "postorder", "(Lkotlin/sequences/SequenceScope;Lokio/FileSystem;Lkotlin/collections/ArrayDeque;Lokio/Path;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commonCopy", "source", "target", "commonCreateDirectories", "dir", "mustCreate", "commonDeleteRecursively", "fileOrDirectory", "mustExist", "commonExists", "commonListRecursively", "Lkotlin/sequences/Sequence;", "commonMetadata", "Lokio/FileMetadata;", "symlinkTarget", "okio"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
@kotlin.jvm.JvmName(name = "-FileSystem")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n52#2,5:156\n52#2,21:161\n60#2,10:182\n57#2,2:192\n71#2,2:194\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,5\n66#1:161,21\n65#1:182,10\n65#1:192,2\n65#1:194,2\n*E\n"})
public final class FileSystem {

    /* JADX INFO: renamed from: okio.internal.-FileSystem$collectRecursively$1 */
    /* JADX INFO: compiled from: FileSystem.kt */
    @kotlin.Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "okio.internal.-FileSystem", m90122f = "FileSystem.kt", m90123i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m90124l = {116, 135, 145}, m90125m = "collectRecursively", m90126n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
    public static final class C431481 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C431481(kotlin.coroutines.Continuation<? super okio.internal.FileSystem.C431481> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                r7 = this;
                r7.result = r8
                int r8 = r7.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r8 = r8 | r0
                r7.label = r8
                r4 = 0
                r5 = 0
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r6 = r7
                java.lang.Object r8 = okio.internal.FileSystem.collectRecursively(r0, r1, r2, r3, r4, r5, r6)
                return r8
        }
    }

    /* JADX INFO: renamed from: okio.internal.-FileSystem$commonListRecursively$1 */
    /* JADX INFO: compiled from: FileSystem.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m90084d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;"}, m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "okio.internal.-FileSystem$commonListRecursively$1", m90122f = "FileSystem.kt", m90123i = {0, 0}, m90124l = {96}, m90125m = "invokeSuspend", m90126n = {"$this$sequence", "stack"}, m90127s = {"L$0", "L$1"})
    public static final class C431491 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super okio.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ okio.Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        public C431491(okio.Path r1, okio.FileSystem r2, boolean r3, kotlin.coroutines.Continuation<? super okio.internal.FileSystem.C431491> r4) {
                r0 = this;
                r0.$dir = r1
                r0.$this_commonListRecursively = r2
                r0.$followSymlinks = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                okio.internal.-FileSystem$commonListRecursively$1 r0 = new okio.internal.-FileSystem$commonListRecursively$1
                okio.Path r1 = r4.$dir
                okio.FileSystem r2 = r4.$this_commonListRecursively
                boolean r3 = r4.$followSymlinks
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                return r0
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super okio.Path> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlin.sequences.SequenceScope<? super okio.Path> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                okio.internal.-FileSystem$commonListRecursively$1 r1 = (okio.internal.FileSystem.C431491) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 1
                if (r1 == 0) goto L24
                if (r1 != r2) goto L1c
                java.lang.Object r1 = r11.L$2
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r11.L$1
                kotlin.collections.ArrayDeque r3 = (kotlin.collections.ArrayDeque) r3
                java.lang.Object r4 = r11.L$0
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.ResultKt.throwOnFailure(r12)
                r6 = r3
                goto L44
            L1c:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L24:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.L$0
                kotlin.sequences.SequenceScope r12 = (kotlin.sequences.SequenceScope) r12
                kotlin.collections.ArrayDeque r1 = new kotlin.collections.ArrayDeque
                r1.<init>()
                okio.Path r3 = r11.$dir
                r1.addLast(r3)
                okio.FileSystem r3 = r11.$this_commonListRecursively
                okio.Path r4 = r11.$dir
                java.util.List r3 = r3.list(r4)
                java.util.Iterator r3 = r3.iterator()
                r4 = r12
                r6 = r1
                r1 = r3
            L44:
                boolean r12 = r1.hasNext()
                if (r12 == 0) goto L66
                java.lang.Object r12 = r1.next()
                r7 = r12
                okio.Path r7 = (okio.Path) r7
                okio.FileSystem r5 = r11.$this_commonListRecursively
                boolean r8 = r11.$followSymlinks
                r11.L$0 = r4
                r11.L$1 = r6
                r11.L$2 = r1
                r11.label = r2
                r9 = 0
                r10 = r11
                java.lang.Object r12 = okio.internal.FileSystem.collectRecursively(r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L44
                return r0
            L66:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
        }
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object collectRecursively(@org.jetbrains.annotations.NotNull kotlin.sequences.SequenceScope<? super okio.Path> r15, @org.jetbrains.annotations.NotNull okio.FileSystem r16, @org.jetbrains.annotations.NotNull kotlin.collections.ArrayDeque<okio.Path> r17, @org.jetbrains.annotations.NotNull okio.Path r18, boolean r19, boolean r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r21) {
            r1 = r18
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof okio.internal.FileSystem.C431481
            if (r4 == 0) goto L19
            r4 = r3
            okio.internal.-FileSystem$collectRecursively$1 r4 = (okio.internal.FileSystem.C431481) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L19
            int r5 = r5 - r6
            r4.label = r5
            goto L1e
        L19:
            okio.internal.-FileSystem$collectRecursively$1 r4 = new okio.internal.-FileSystem$collectRecursively$1
            r4.<init>(r3)
        L1e:
            java.lang.Object r3 = r4.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.label
            r7 = 0
            r8 = 3
            r9 = 2
            r10 = 1
            if (r6 == 0) goto L80
            if (r6 == r10) goto L64
            if (r6 == r9) goto L3f
            if (r6 != r8) goto L37
            kotlin.ResultKt.throwOnFailure(r3)
            goto L15e
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3f:
            boolean r0 = r4.Z$1
            boolean r1 = r4.Z$0
            java.lang.Object r2 = r4.L$4
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r6 = r4.L$3
            okio.Path r6 = (okio.Path) r6
            java.lang.Object r7 = r4.L$2
            kotlin.collections.ArrayDeque r7 = (kotlin.collections.ArrayDeque) r7
            java.lang.Object r10 = r4.L$1
            okio.FileSystem r10 = (okio.FileSystem) r10
            java.lang.Object r11 = r4.L$0
            kotlin.sequences.SequenceScope r11 = (kotlin.sequences.SequenceScope) r11
            kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L61
            r3 = r1
            r1 = r0
            r0 = r3
            r3 = r6
        L5e:
            r6 = r7
            goto Lf1
        L61:
            r0 = move-exception
            goto L13f
        L64:
            boolean r0 = r4.Z$1
            boolean r1 = r4.Z$0
            java.lang.Object r2 = r4.L$3
            okio.Path r2 = (okio.Path) r2
            java.lang.Object r6 = r4.L$2
            kotlin.collections.ArrayDeque r6 = (kotlin.collections.ArrayDeque) r6
            java.lang.Object r10 = r4.L$1
            okio.FileSystem r10 = (okio.FileSystem) r10
            java.lang.Object r11 = r4.L$0
            kotlin.sequences.SequenceScope r11 = (kotlin.sequences.SequenceScope) r11
            kotlin.ResultKt.throwOnFailure(r3)
            r14 = r2
            r2 = r0
            r0 = r1
            r1 = r14
            goto Laa
        L80:
            kotlin.ResultKt.throwOnFailure(r3)
            if (r2 != 0) goto La1
            r4.L$0 = r15
            r3 = r16
            r4.L$1 = r3
            r6 = r17
            r4.L$2 = r6
            r4.L$3 = r1
            r11 = r19
            r4.Z$0 = r11
            r4.Z$1 = r2
            r4.label = r10
            java.lang.Object r10 = r15.yield(r1, r4)
            if (r10 != r5) goto La7
            goto L15d
        La1:
            r3 = r16
            r6 = r17
            r11 = r19
        La7:
            r10 = r3
            r0 = r11
            r11 = r15
        Laa:
            java.util.List r3 = r10.listOrNull(r1)
            if (r3 != 0) goto Lb4
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        Lb4:
            boolean r12 = r3.isEmpty()
            if (r12 != 0) goto L148
            r12 = r1
        Lbb:
            if (r0 == 0) goto Ldc
            boolean r13 = r6.contains(r12)
            if (r13 != 0) goto Lc4
            goto Ldc
        Lc4:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "symlink cycle at "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Ldc:
            okio.Path r13 = symlinkTarget(r10, r12)
            if (r13 != 0) goto L143
            if (r0 != 0) goto Le6
            if (r7 != 0) goto L148
        Le6:
            r6.addLast(r12)
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L134
            r14 = r3
            r3 = r1
            r1 = r2
            r2 = r14
        Lf1:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L134
            if (r7 == 0) goto L137
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L134
            okio.Path r7 = (okio.Path) r7     // Catch: java.lang.Throwable -> L134
            r4.L$0 = r11     // Catch: java.lang.Throwable -> L134
            r4.L$1 = r10     // Catch: java.lang.Throwable -> L134
            r4.L$2 = r6     // Catch: java.lang.Throwable -> L134
            r4.L$3 = r3     // Catch: java.lang.Throwable -> L134
            r4.L$4 = r2     // Catch: java.lang.Throwable -> L134
            r4.Z$0 = r0     // Catch: java.lang.Throwable -> L134
            r4.Z$1 = r1     // Catch: java.lang.Throwable -> L134
            r4.label = r9     // Catch: java.lang.Throwable -> L134
            r19 = r0
            r20 = r1
            r21 = r4
            r17 = r6
            r18 = r7
            r16 = r10
            r15 = r11
            java.lang.Object r0 = collectRecursively(r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L130
            r11 = r15
            r10 = r16
            r7 = r17
            r4 = r19
            r1 = r20
            r6 = r21
            if (r0 != r5) goto L12c
            goto L15d
        L12c:
            r0 = r4
            r4 = r6
            goto L5e
        L130:
            r0 = move-exception
            r7 = r17
            goto L13f
        L134:
            r0 = move-exception
            r7 = r6
            goto L13f
        L137:
            r7 = r6
            r6 = r4
            r7.removeLast()
            r2 = r1
            r1 = r3
            goto L148
        L13f:
            r7.removeLast()
            throw r0
        L143:
            int r7 = r7 + 1
            r12 = r13
            goto Lbb
        L148:
            if (r2 == 0) goto L161
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.L$4 = r0
            r4.label = r8
            java.lang.Object r0 = r11.yield(r1, r4)
            if (r0 != r5) goto L15e
        L15d:
            return r5
        L15e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L161:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public static final void commonCopy(@org.jetbrains.annotations.NotNull okio.FileSystem r4, @org.jetbrains.annotations.NotNull okio.Path r5, @org.jetbrains.annotations.NotNull okio.Path r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okio.Source r5 = r4.source(r5)
            r0 = 0
            okio.Sink r4 = r4.sink(r6)     // Catch: java.lang.Throwable -> L3c
            okio.BufferedSink r4 = okio.Okio.buffer(r4)     // Catch: java.lang.Throwable -> L3c
            long r1 = r4.writeAll(r5)     // Catch: java.lang.Throwable -> L30
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L2e
            r4.close()     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r4 = move-exception
            goto L40
        L2e:
            r4 = r0
            goto L40
        L30:
            r6 = move-exception
            if (r4 == 0) goto L3e
            r4.close()     // Catch: java.lang.Throwable -> L37
            goto L3e
        L37:
            r4 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r6, r4)     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r4 = move-exception
            goto L56
        L3e:
            r4 = r6
            r6 = r0
        L40:
            if (r4 != 0) goto L55
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Throwable -> L3c
            long r1 = r6.longValue()     // Catch: java.lang.Throwable -> L3c
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L63
            r5.close()     // Catch: java.lang.Throwable -> L53
            goto L63
        L53:
            r0 = move-exception
            goto L63
        L55:
            throw r4     // Catch: java.lang.Throwable -> L3c
        L56:
            if (r5 == 0) goto L60
            r5.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r5 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r4, r5)
        L60:
            r3 = r0
            r0 = r4
            r4 = r3
        L63:
            if (r0 != 0) goto L69
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            return
        L69:
            throw r0
    }

    public static final void commonCreateDirectories(@org.jetbrains.annotations.NotNull okio.FileSystem r3, @org.jetbrains.annotations.NotNull okio.Path r4, boolean r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.collections.ArrayDeque r0 = new kotlin.collections.ArrayDeque
            r0.<init>()
            r1 = r4
        L10:
            if (r1 == 0) goto L20
            boolean r2 = r3.exists(r1)
            if (r2 != 0) goto L20
            r0.addFirst(r1)
            okio.Path r1 = r1.parent()
            goto L10
        L20:
            if (r5 == 0) goto L40
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L29
            goto L40
        L29:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " already exists."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L40:
            java.util.Iterator r4 = r0.iterator()
        L44:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L54
            java.lang.Object r5 = r4.next()
            okio.Path r5 = (okio.Path) r5
            r3.createDirectory(r5)
            goto L44
        L54:
            return
    }

    public static final void commonDeleteRecursively(@org.jetbrains.annotations.NotNull okio.FileSystem r2, @org.jetbrains.annotations.NotNull okio.Path r3, boolean r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "fileOrDirectory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.internal.-FileSystem$commonDeleteRecursively$sequence$1 r0 = new okio.internal.-FileSystem$commonDeleteRecursively$sequence$1
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.sequence(r0)
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r3.next()
            okio.Path r0 = (okio.Path) r0
            if (r4 == 0) goto L2e
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L2e
            r1 = 1
            goto L2f
        L2e:
            r1 = 0
        L2f:
            r2.delete(r0, r1)
            goto L18
        L33:
            return
    }

    public static final boolean commonExists(@org.jetbrains.annotations.NotNull okio.FileSystem r1, @org.jetbrains.annotations.NotNull okio.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.FileMetadata r1 = r1.metadataOrNull(r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.Sequence<okio.Path> commonListRecursively(@org.jetbrains.annotations.NotNull okio.FileSystem r2, @org.jetbrains.annotations.NotNull okio.Path r3, boolean r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.internal.-FileSystem$commonListRecursively$1 r0 = new okio.internal.-FileSystem$commonListRecursively$1
            r1 = 0
            r0.<init>(r3, r2, r4, r1)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.sequence(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.FileMetadata commonMetadata(@org.jetbrains.annotations.NotNull okio.FileSystem r2, @org.jetbrains.annotations.NotNull okio.Path r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.FileMetadata r2 = r2.metadataOrNull(r3)
            if (r2 == 0) goto L11
            return r2
        L11:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no such file: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @org.jetbrains.annotations.Nullable
    public static final okio.Path symlinkTarget(@org.jetbrains.annotations.NotNull okio.FileSystem r1, @org.jetbrains.annotations.NotNull okio.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.FileMetadata r1 = r1.metadata(r2)
            okio.Path r1 = r1.getSymlinkTarget()
            if (r1 != 0) goto L16
            r1 = 0
            return r1
        L16:
            okio.Path r2 = r2.parent()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okio.Path r1 = r2.resolve(r1)
            return r1
    }
}
