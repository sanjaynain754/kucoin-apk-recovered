package com.kubi.experiment.data;

import com.kubi.experiment.core.ExperimentConfig;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: ExperimentConfigRepository.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 Bg\u0012\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J \u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u001cJ \u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0002\u0010\u0018R&\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/experiment/data/ExperimentConfigRepository;", "", "fetchRemote", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/kubi/experiment/core/ExperimentConfig;", "readLocal", "Lkotlin/Function0;", "writeLocal", "", "clearLocal", "currentVersion", "", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lkotlin/jvm/functions/Function1;", "requestMutex", "Lkotlinx/coroutines/sync/Mutex;", "runningRequest", "Lkotlinx/coroutines/CompletableDeferred;", "refreshConfig", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExperimentResult", "code", "defaultValue", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCachedExperimentResult", "readCachedConfig", "fetchAndCache", "Companion", "LExperiment_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nExperimentConfigRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExperimentConfigRepository.kt\ncom/kubi/experiment/data/ExperimentConfigRepository\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n116#2,8:140\n125#2,2:149\n116#2,11:151\n1#3:148\n*S KotlinDebug\n*F\n+ 1 ExperimentConfigRepository.kt\ncom/kubi/experiment/data/ExperimentConfigRepository\n*L\n75#1:140,8\n75#1:149,2\n103#1:151,11\n*E\n"})
public final class ExperimentConfigRepository {

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Companion f21688i = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function1<Continuation<? super ExperimentConfig>, Object> f21689a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function0<ExperimentConfig> f21690b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function1<ExperimentConfig, Unit> f21691c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Function0<Unit> f21692d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final String f21693e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final AbstractC41697j0 f21694f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final InterfaceC44082a f21695g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public InterfaceC41769w<ExperimentConfig> f21696h;

    /* JADX INFO: compiled from: ExperimentConfigRepository.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/experiment/data/ExperimentConfigRepository$Companion;", "", "<init>", "()V", "TAG", "", "STORAGE_CATEGORY", "STORAGE_KEY", "create", "Lcom/kubi/experiment/data/ExperimentConfigRepository;", "LExperiment_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nExperimentConfigRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExperimentConfigRepository.kt\ncom/kubi/experiment/data/ExperimentConfigRepository$Companion\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,139:1\n153#2,2:140\n144#2,2:143\n15#2:145\n178#3:142\n*S KotlinDebug\n*F\n+ 1 ExperimentConfigRepository.kt\ncom/kubi/experiment/data/ExperimentConfigRepository$Companion\n*L\n130#1:140,2\n131#1:143,2\n132#1:145\n130#1:142\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: d */
        public static final ExperimentConfig m23736d(StorageId storageId) {
            return (ExperimentConfig) C46392a.f104043a.m102336j(storageId, ExperimentConfig.class, null);
        }

        /* JADX INFO: renamed from: e */
        public static final Unit m23737e(StorageId storageId, ExperimentConfig it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C46392a.m102331n(storageId, it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m23738f(StorageId storageId) {
            C46392a.m102335r(storageId);
            return Unit.INSTANCE;
        }

        @NotNull
        public final ExperimentConfigRepository create() {
            ExperimentApi experimentApi = (ExperimentApi) C42597a.m93388d().create(ExperimentApi.class);
            final StorageId storageId = new StorageId("experiment", "app_review_config", null, false, 12, null);
            return new ExperimentConfigRepository(new ExperimentConfigRepository$Companion$create$1(experimentApi, null), new Function0() { // from class: com.kubi.experiment.data.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ExperimentConfigRepository.Companion.m23736d(storageId);
                }
            }, new Function1() { // from class: com.kubi.experiment.data.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ExperimentConfigRepository.Companion.m23737e(storageId, (ExperimentConfig) obj);
                }
            }, new Function0() { // from class: com.kubi.experiment.data.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ExperimentConfigRepository.Companion.m23738f(storageId);
                }
            }, C45590s.f102687a.m100675Z(), C42911a.m94120b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExperimentConfigRepository(@NotNull Function1<? super Continuation<? super ExperimentConfig>, ? extends Object> fetchRemote, @NotNull Function0<ExperimentConfig> readLocal, @NotNull Function1<? super ExperimentConfig, Unit> writeLocal, @NotNull Function0<Unit> clearLocal, @NotNull String currentVersion, @NotNull AbstractC41697j0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(fetchRemote, "fetchRemote");
        Intrinsics.checkNotNullParameter(readLocal, "readLocal");
        Intrinsics.checkNotNullParameter(writeLocal, "writeLocal");
        Intrinsics.checkNotNullParameter(clearLocal, "clearLocal");
        Intrinsics.checkNotNullParameter(currentVersion, "currentVersion");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f21689a = fetchRemote;
        this.f21690b = readLocal;
        this.f21691c = writeLocal;
        this.f21692d = clearLocal;
        this.f21693e = currentVersion;
        this.f21694f = ioDispatcher;
        this.f21695g = C44087f.m97144b(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009b A[Catch: all -> 0x00a4, TryCatch #4 {all -> 0x00a4, blocks: (B:30:0x0097, B:32:0x009b, B:35:0x00a7), top: B:97:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7 A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #4 {all -> 0x00a4, blocks: (B:30:0x0097, B:32:0x009b, B:35:0x00a7), top: B:97:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00df A[Catch: all -> 0x0068, Exception -> 0x006e, CancellationException -> 0x0071, TRY_ENTER, TryCatch #7 {CancellationException -> 0x0071, Exception -> 0x006e, blocks: (B:16:0x0063, B:45:0x00f5, B:42:0x00df), top: B:98:0x0023, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5 A[Catch: all -> 0x0068, Exception -> 0x006e, CancellationException -> 0x0071, PHI: r2 r3 r11
      0x00f5: PHI (r2v12 ??) = (r2v21 ??), (r2v22 ??) binds: [B:43:0x00f1, B:16:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r3v8 ??) = (r3v14 ??), (r3v15 ??) binds: [B:43:0x00f1, B:16:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r11v31 java.lang.Object) = (r11v26 java.lang.Object), (r11v1 java.lang.Object) binds: [B:43:0x00f1, B:16:0x0063] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #7 {CancellationException -> 0x0071, Exception -> 0x006e, blocks: (B:16:0x0063, B:45:0x00f5, B:42:0x00df), top: B:98:0x0023, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118 A[Catch: all -> 0x011b, TryCatch #6 {all -> 0x011b, blocks: (B:50:0x0114, B:52:0x0118, B:55:0x011d), top: B:99:0x0114 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlinx.coroutines.w] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlinx.coroutines.w] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlinx.coroutines.w] */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    /* JADX INFO: renamed from: g */
    public final Object m23728g(Continuation<? super ExperimentConfig> continuation) throws Throwable {
        ExperimentConfigRepository$fetchAndCache$1 experimentConfigRepository$fetchAndCache$1;
        InterfaceC44082a interfaceC44082a;
        ?? r11;
        Throwable th2;
        ?? r12;
        InterfaceC44082a interfaceC44082a2;
        InterfaceC44082a interfaceC44082a3;
        InterfaceC41769w<ExperimentConfig> interfaceC41769w;
        Pair pairM90091to;
        InterfaceC41769w interfaceC41769w2;
        boolean zBooleanValue;
        Object objMo91198h;
        ExperimentConfig experimentConfig;
        InterfaceC44082a interfaceC44082a4;
        ExperimentConfig experimentConfig2;
        ?? r13;
        InterfaceC44082a interfaceC44082a5;
        if (continuation instanceof ExperimentConfigRepository$fetchAndCache$1) {
            experimentConfigRepository$fetchAndCache$1 = (ExperimentConfigRepository$fetchAndCache$1) continuation;
            int i11 = experimentConfigRepository$fetchAndCache$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                experimentConfigRepository$fetchAndCache$1.label = i11 - Integer.MIN_VALUE;
            } else {
                experimentConfigRepository$fetchAndCache$1 = new ExperimentConfigRepository$fetchAndCache$1(this, continuation);
            }
        } else {
            experimentConfigRepository$fetchAndCache$1 = new ExperimentConfigRepository$fetchAndCache$1(this, continuation);
        }
        Object objM91049g = experimentConfigRepository$fetchAndCache$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r14 = experimentConfigRepository$fetchAndCache$1.label;
        ?? r15 = 1;
        r15 = 1;
        r15 = 1;
        try {
            try {
                switch (r14) {
                    case 0:
                        ResultKt.throwOnFailure(objM91049g);
                        interfaceC44082a3 = this.f21695g;
                        experimentConfigRepository$fetchAndCache$1.L$0 = interfaceC44082a3;
                        experimentConfigRepository$fetchAndCache$1.I$0 = 0;
                        experimentConfigRepository$fetchAndCache$1.label = 1;
                        if (interfaceC44082a3.mo91344d(null, experimentConfigRepository$fetchAndCache$1) != coroutine_suspended) {
                            try {
                                interfaceC41769w = this.f21696h;
                                if (interfaceC41769w != null) {
                                    pairM90091to = TuplesKt.m90091to(interfaceC41769w, Boxing.boxBoolean(false));
                                } else {
                                    InterfaceC41769w<ExperimentConfig> interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
                                    this.f21696h = interfaceC41769wM91388c;
                                    pairM90091to = TuplesKt.m90091to(interfaceC41769wM91388c, Boxing.boxBoolean(true));
                                }
                                interfaceC44082a3.mo91345e(null);
                                interfaceC41769w2 = (InterfaceC41769w) pairM90091to.component1();
                                zBooleanValue = ((Boolean) pairM90091to.component2()).booleanValue();
                                if (zBooleanValue) {
                                    AbstractC41697j0 abstractC41697j0 = this.f21694f;
                                    ExperimentConfigRepository$fetchAndCache$config$1 experimentConfigRepository$fetchAndCache$config$1 = new ExperimentConfigRepository$fetchAndCache$config$1(this, null);
                                    experimentConfigRepository$fetchAndCache$1.L$0 = interfaceC41769w2;
                                    experimentConfigRepository$fetchAndCache$1.Z$0 = zBooleanValue;
                                    experimentConfigRepository$fetchAndCache$1.label = 3;
                                    objM91049g = C41686h.m91049g(abstractC41697j0, experimentConfigRepository$fetchAndCache$config$1, experimentConfigRepository$fetchAndCache$1);
                                    if (objM91049g == coroutine_suspended) {
                                        r14 = zBooleanValue;
                                        r15 = interfaceC41769w2;
                                    } else {
                                        r14 = zBooleanValue;
                                        r15 = interfaceC41769w2;
                                        experimentConfig = (ExperimentConfig) objM91049g;
                                        r15.mo91370n(experimentConfig);
                                        interfaceC44082a4 = this.f21695g;
                                        experimentConfigRepository$fetchAndCache$1.L$0 = r15;
                                        experimentConfigRepository$fetchAndCache$1.L$1 = experimentConfig;
                                        experimentConfigRepository$fetchAndCache$1.L$2 = interfaceC44082a4;
                                        experimentConfigRepository$fetchAndCache$1.Z$0 = r14;
                                        experimentConfigRepository$fetchAndCache$1.I$0 = 0;
                                        experimentConfigRepository$fetchAndCache$1.label = 4;
                                        if (interfaceC44082a4.mo91344d(null, experimentConfigRepository$fetchAndCache$1) != coroutine_suspended) {
                                            experimentConfig2 = experimentConfig;
                                            r13 = r15;
                                            interfaceC44082a5 = interfaceC44082a4;
                                            try {
                                                if (this.f21696h == r13) {
                                                    this.f21696h = null;
                                                }
                                                Unit unit = Unit.INSTANCE;
                                                return experimentConfig2;
                                            } finally {
                                                interfaceC44082a5.mo91345e(null);
                                            }
                                        }
                                    }
                                } else {
                                    experimentConfigRepository$fetchAndCache$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41769w2);
                                    experimentConfigRepository$fetchAndCache$1.Z$0 = zBooleanValue;
                                    experimentConfigRepository$fetchAndCache$1.label = 2;
                                    objMo91198h = interfaceC41769w2.mo91198h(experimentConfigRepository$fetchAndCache$1);
                                    if (objMo91198h == coroutine_suspended) {
                                        return objMo91198h;
                                    }
                                }
                            } catch (Throwable th3) {
                                interfaceC44082a3.mo91345e(null);
                                throw th3;
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        interfaceC44082a3 = (InterfaceC44082a) experimentConfigRepository$fetchAndCache$1.L$0;
                        ResultKt.throwOnFailure(objM91049g);
                        interfaceC41769w = this.f21696h;
                        if (interfaceC41769w != null) {
                            pairM90091to = TuplesKt.m90091to(interfaceC41769w, Boxing.boxBoolean(false));
                        } else {
                            InterfaceC41769w<ExperimentConfig> interfaceC41769wM91388c2 = C41777y.m91388c(null, 1, null);
                            this.f21696h = interfaceC41769wM91388c2;
                            pairM90091to = TuplesKt.m90091to(interfaceC41769wM91388c2, Boxing.boxBoolean(true));
                        }
                        interfaceC44082a3.mo91345e(null);
                        interfaceC41769w2 = (InterfaceC41769w) pairM90091to.component1();
                        zBooleanValue = ((Boolean) pairM90091to.component2()).booleanValue();
                        if (zBooleanValue) {
                            experimentConfigRepository$fetchAndCache$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41769w2);
                            experimentConfigRepository$fetchAndCache$1.Z$0 = zBooleanValue;
                            experimentConfigRepository$fetchAndCache$1.label = 2;
                            objMo91198h = interfaceC41769w2.mo91198h(experimentConfigRepository$fetchAndCache$1);
                            if (objMo91198h == coroutine_suspended) {
                                return objMo91198h;
                            }
                        } else {
                            AbstractC41697j0 abstractC41697j1 = this.f21694f;
                            ExperimentConfigRepository$fetchAndCache$config$1 experimentConfigRepository$fetchAndCache$config$2 = new ExperimentConfigRepository$fetchAndCache$config$1(this, null);
                            experimentConfigRepository$fetchAndCache$1.L$0 = interfaceC41769w2;
                            experimentConfigRepository$fetchAndCache$1.Z$0 = zBooleanValue;
                            experimentConfigRepository$fetchAndCache$1.label = 3;
                            objM91049g = C41686h.m91049g(abstractC41697j1, experimentConfigRepository$fetchAndCache$config$2, experimentConfigRepository$fetchAndCache$1);
                            if (objM91049g == coroutine_suspended) {
                                r14 = zBooleanValue;
                                r15 = interfaceC41769w2;
                            } else {
                                r14 = zBooleanValue;
                                r15 = interfaceC41769w2;
                                experimentConfig = (ExperimentConfig) objM91049g;
                                r15.mo91370n(experimentConfig);
                                interfaceC44082a4 = this.f21695g;
                                experimentConfigRepository$fetchAndCache$1.L$0 = r15;
                                experimentConfigRepository$fetchAndCache$1.L$1 = experimentConfig;
                                experimentConfigRepository$fetchAndCache$1.L$2 = interfaceC44082a4;
                                experimentConfigRepository$fetchAndCache$1.Z$0 = r14;
                                experimentConfigRepository$fetchAndCache$1.I$0 = 0;
                                experimentConfigRepository$fetchAndCache$1.label = 4;
                                if (interfaceC44082a4.mo91344d(null, experimentConfigRepository$fetchAndCache$1) != coroutine_suspended) {
                                    experimentConfig2 = experimentConfig;
                                    r13 = r15;
                                    interfaceC44082a5 = interfaceC44082a4;
                                    if (this.f21696h == r13) {
                                        this.f21696h = null;
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    return experimentConfig2;
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 2:
                        ResultKt.throwOnFailure(objM91049g);
                        return objM91049g;
                    case 3:
                        boolean z11 = experimentConfigRepository$fetchAndCache$1.Z$0;
                        InterfaceC41769w interfaceC41769w3 = (InterfaceC41769w) experimentConfigRepository$fetchAndCache$1.L$0;
                        ResultKt.throwOnFailure(objM91049g);
                        r14 = z11;
                        r15 = interfaceC41769w3;
                        r14 = zBooleanValue;
                        r15 = interfaceC41769w2;
                        experimentConfig = (ExperimentConfig) objM91049g;
                        r15.mo91370n(experimentConfig);
                        interfaceC44082a4 = this.f21695g;
                        experimentConfigRepository$fetchAndCache$1.L$0 = r15;
                        experimentConfigRepository$fetchAndCache$1.L$1 = experimentConfig;
                        experimentConfigRepository$fetchAndCache$1.L$2 = interfaceC44082a4;
                        experimentConfigRepository$fetchAndCache$1.Z$0 = r14;
                        experimentConfigRepository$fetchAndCache$1.I$0 = 0;
                        experimentConfigRepository$fetchAndCache$1.label = 4;
                        if (interfaceC44082a4.mo91344d(null, experimentConfigRepository$fetchAndCache$1) != coroutine_suspended) {
                            experimentConfig2 = experimentConfig;
                            r13 = r15;
                            interfaceC44082a5 = interfaceC44082a4;
                            if (this.f21696h == r13) {
                                this.f21696h = null;
                            }
                            Unit unit3 = Unit.INSTANCE;
                            return experimentConfig2;
                        }
                        return coroutine_suspended;
                    case 4:
                        interfaceC44082a5 = (InterfaceC44082a) experimentConfigRepository$fetchAndCache$1.L$2;
                        experimentConfig2 = (ExperimentConfig) experimentConfigRepository$fetchAndCache$1.L$1;
                        InterfaceC41769w interfaceC41769w4 = (InterfaceC41769w) experimentConfigRepository$fetchAndCache$1.L$0;
                        ResultKt.throwOnFailure(objM91049g);
                        r13 = interfaceC41769w4;
                        if (this.f21696h == r13) {
                            this.f21696h = null;
                        }
                        Unit unit4 = Unit.INSTANCE;
                        return experimentConfig2;
                    case 5:
                        interfaceC44082a = (InterfaceC44082a) experimentConfigRepository$fetchAndCache$1.L$1;
                        InterfaceC41769w interfaceC41769w5 = (InterfaceC41769w) experimentConfigRepository$fetchAndCache$1.L$0;
                        ResultKt.throwOnFailure(objM91049g);
                        r11 = interfaceC41769w5;
                        try {
                            if (this.f21696h == r11) {
                                this.f21696h = null;
                            }
                            Unit unit5 = Unit.INSTANCE;
                            return null;
                        } finally {
                            interfaceC44082a.mo91345e(null);
                        }
                    case 6:
                        interfaceC44082a2 = (InterfaceC44082a) experimentConfigRepository$fetchAndCache$1.L$2;
                        th2 = (Throwable) experimentConfigRepository$fetchAndCache$1.L$1;
                        InterfaceC41769w interfaceC41769w6 = (InterfaceC41769w) experimentConfigRepository$fetchAndCache$1.L$0;
                        ResultKt.throwOnFailure(objM91049g);
                        r12 = interfaceC41769w6;
                        try {
                            if (this.f21696h == r12) {
                                this.f21696h = null;
                            }
                            Unit unit6 = Unit.INSTANCE;
                            throw th2;
                        } finally {
                            interfaceC44082a2.mo91345e(null);
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th4) {
                ?? r16 = r14;
                th2 = th4;
                InterfaceC44082a interfaceC44082a6 = this.f21695g;
                experimentConfigRepository$fetchAndCache$1.L$0 = r15;
                experimentConfigRepository$fetchAndCache$1.L$1 = th2;
                experimentConfigRepository$fetchAndCache$1.L$2 = interfaceC44082a6;
                experimentConfigRepository$fetchAndCache$1.Z$0 = r16;
                experimentConfigRepository$fetchAndCache$1.I$0 = 0;
                experimentConfigRepository$fetchAndCache$1.label = 6;
                if (interfaceC44082a6.mo91344d(null, experimentConfigRepository$fetchAndCache$1) != coroutine_suspended) {
                    r12 = r15;
                    interfaceC44082a2 = interfaceC44082a6;
                }
                return coroutine_suspended;
            }
        } catch (CancellationException e11) {
            r15.mo91369m(e11);
            throw e11;
        } catch (Exception e12) {
            C44128b.m97270n("ExperimentConfigRepository", "fetch experiment config failed: " + e12.getMessage());
            r15.mo91370n(null);
            InterfaceC44082a interfaceC44082a7 = this.f21695g;
            experimentConfigRepository$fetchAndCache$1.L$0 = r15;
            experimentConfigRepository$fetchAndCache$1.L$1 = interfaceC44082a7;
            experimentConfigRepository$fetchAndCache$1.Z$0 = r14;
            experimentConfigRepository$fetchAndCache$1.I$0 = 0;
            experimentConfigRepository$fetchAndCache$1.label = 5;
            if (interfaceC44082a7.mo91344d(null, experimentConfigRepository$fetchAndCache$1) != coroutine_suspended) {
                interfaceC44082a = interfaceC44082a7;
                r11 = r15;
            }
            return coroutine_suspended;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: h */
    public final Object m23729h(@NotNull String str, boolean z11, @NotNull Continuation<? super Boolean> continuation) {
        ExperimentConfigRepository$getCachedExperimentResult$1 experimentConfigRepository$getCachedExperimentResult$1;
        Boolean boolValueOf$LExperiment_googleRelease;
        if (continuation instanceof ExperimentConfigRepository$getCachedExperimentResult$1) {
            experimentConfigRepository$getCachedExperimentResult$1 = (ExperimentConfigRepository$getCachedExperimentResult$1) continuation;
            int i11 = experimentConfigRepository$getCachedExperimentResult$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                experimentConfigRepository$getCachedExperimentResult$1.label = i11 - Integer.MIN_VALUE;
            } else {
                experimentConfigRepository$getCachedExperimentResult$1 = new ExperimentConfigRepository$getCachedExperimentResult$1(this, continuation);
            }
        } else {
            experimentConfigRepository$getCachedExperimentResult$1 = new ExperimentConfigRepository$getCachedExperimentResult$1(this, continuation);
        }
        Object objM23731j = experimentConfigRepository$getCachedExperimentResult$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = experimentConfigRepository$getCachedExperimentResult$1.label;
        boolean zBooleanValue = true;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM23731j);
            experimentConfigRepository$getCachedExperimentResult$1.L$0 = str;
            experimentConfigRepository$getCachedExperimentResult$1.Z$0 = z11;
            experimentConfigRepository$getCachedExperimentResult$1.label = 1;
            objM23731j = m23731j(experimentConfigRepository$getCachedExperimentResult$1);
            if (objM23731j == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = experimentConfigRepository$getCachedExperimentResult$1.Z$0;
            str = (String) experimentConfigRepository$getCachedExperimentResult$1.L$0;
            ResultKt.throwOnFailure(objM23731j);
        }
        ExperimentConfig experimentConfig = (ExperimentConfig) objM23731j;
        if (experimentConfig != null && (boolValueOf$LExperiment_googleRelease = experimentConfig.valueOf$LExperiment_googleRelease(str)) != null) {
            zBooleanValue = boolValueOf$LExperiment_googleRelease.booleanValue();
        } else if (!z11) {
            zBooleanValue = false;
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m23730i(@NotNull String str, boolean z11, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        ExperimentConfigRepository$getExperimentResult$1 experimentConfigRepository$getExperimentResult$1;
        ExperimentConfig experimentConfig;
        String str2;
        boolean z12;
        Boolean boolValueOf$LExperiment_googleRelease;
        if (continuation instanceof ExperimentConfigRepository$getExperimentResult$1) {
            experimentConfigRepository$getExperimentResult$1 = (ExperimentConfigRepository$getExperimentResult$1) continuation;
            int i11 = experimentConfigRepository$getExperimentResult$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                experimentConfigRepository$getExperimentResult$1.label = i11 - Integer.MIN_VALUE;
            } else {
                experimentConfigRepository$getExperimentResult$1 = new ExperimentConfigRepository$getExperimentResult$1(this, continuation);
            }
        } else {
            experimentConfigRepository$getExperimentResult$1 = new ExperimentConfigRepository$getExperimentResult$1(this, continuation);
        }
        Object objM23731j = experimentConfigRepository$getExperimentResult$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = experimentConfigRepository$getExperimentResult$1.label;
        boolean zBooleanValue = true;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM23731j);
            experimentConfigRepository$getExperimentResult$1.L$0 = str;
            experimentConfigRepository$getExperimentResult$1.Z$0 = z11;
            experimentConfigRepository$getExperimentResult$1.label = 1;
            objM23731j = m23731j(experimentConfigRepository$getExperimentResult$1);
            if (objM23731j != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            z11 = experimentConfigRepository$getExperimentResult$1.Z$0;
            str = (String) experimentConfigRepository$getExperimentResult$1.L$0;
            ResultKt.throwOnFailure(objM23731j);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z12 = experimentConfigRepository$getExperimentResult$1.Z$0;
            str2 = (String) experimentConfigRepository$getExperimentResult$1.L$0;
            ResultKt.throwOnFailure(objM23731j);
        }
        experimentConfig = (ExperimentConfig) objM23731j;
        String str3 = str2;
        z11 = z12;
        str = str3;
        if (experimentConfig == null && (boolValueOf$LExperiment_googleRelease = experimentConfig.valueOf$LExperiment_googleRelease(str)) != null) {
            zBooleanValue = boolValueOf$LExperiment_googleRelease.booleanValue();
        } else if (!z11) {
            zBooleanValue = false;
        }
        return Boxing.boxBoolean(zBooleanValue);
        experimentConfig = (ExperimentConfig) objM23731j;
        if (experimentConfig == null) {
            experimentConfigRepository$getExperimentResult$1.L$0 = str;
            experimentConfigRepository$getExperimentResult$1.Z$0 = z11;
            experimentConfigRepository$getExperimentResult$1.label = 2;
            objM23731j = m23728g(experimentConfigRepository$getExperimentResult$1);
            if (objM23731j != coroutine_suspended) {
                boolean z13 = z11;
                str2 = str;
                z12 = z13;
                experimentConfig = (ExperimentConfig) objM23731j;
                String str4 = str2;
                z11 = z12;
                str = str4;
            }
            return coroutine_suspended;
        }
        if (experimentConfig == null) {
            if (!z11) {
                zBooleanValue = false;
            }
        } else if (!z11) {
            zBooleanValue = false;
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX INFO: renamed from: j */
    public final Object m23731j(Continuation<? super ExperimentConfig> continuation) {
        return C41686h.m91049g(this.f21694f, new ExperimentConfigRepository$readCachedConfig$2(this, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: k */
    public final Object m23732k(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        ExperimentConfigRepository$refreshConfig$1 experimentConfigRepository$refreshConfig$1;
        if (continuation instanceof ExperimentConfigRepository$refreshConfig$1) {
            experimentConfigRepository$refreshConfig$1 = (ExperimentConfigRepository$refreshConfig$1) continuation;
            int i11 = experimentConfigRepository$refreshConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                experimentConfigRepository$refreshConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                experimentConfigRepository$refreshConfig$1 = new ExperimentConfigRepository$refreshConfig$1(this, continuation);
            }
        } else {
            experimentConfigRepository$refreshConfig$1 = new ExperimentConfigRepository$refreshConfig$1(this, continuation);
        }
        Object objM23728g = experimentConfigRepository$refreshConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = experimentConfigRepository$refreshConfig$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM23728g);
            experimentConfigRepository$refreshConfig$1.label = 1;
            objM23728g = m23728g(experimentConfigRepository$refreshConfig$1);
            if (objM23728g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM23728g);
        }
        return Boxing.boxBoolean(objM23728g != null);
    }
}
