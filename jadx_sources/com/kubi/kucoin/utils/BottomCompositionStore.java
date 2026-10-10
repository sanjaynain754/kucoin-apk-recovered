package com.kubi.kucoin.utils;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.messaging.Constants;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BottomCompositionStore.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 '*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003%&'B1\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0005JD\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00052\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u00192\u001a\b\u0002\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0016\u0010\u001d\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0002J#\u0010\u001f\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010 \u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010!J\u001e\u0010\"\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010#\u001a\u00020\u000fH\u0002J\u0016\u0010$\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/kucoin/utils/BottomCompositionStore;", ExifInterface.GPS_DIRECTION_TRUE, "", "loadTask", "Lkotlin/Function1;", "", "Lcom/kubi/kucoin/utils/BottomCompositionTask;", "checkThread", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "completed", "", "failed", "", "inFlight", "Lcom/kubi/kucoin/utils/BottomCompositionStore$Entry;", "nextConsumerId", "", "preload", "assetName", "request", "Lcom/kubi/kucoin/utils/BottomCompositionRequest;", "onSuccess", "Lkotlin/Function2;", "Lcom/kubi/kucoin/utils/BottomLottieSource;", "onFailure", "createEntry", "attachTaskListeners", "entry", "completeSuccess", "value", "(Lcom/kubi/kucoin/utils/BottomCompositionStore$Entry;Ljava/lang/Object;)V", "completeFailure", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "detachTaskListeners", "Entry", "Consumer", "Companion", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBottomCompositionStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomCompositionStore.kt\ncom/kubi/kucoin/utils/BottomCompositionStore\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,173:1\n1869#2,2:174\n1869#2,2:176\n*S KotlinDebug\n*F\n+ 1 BottomCompositionStore.kt\ncom/kubi/kucoin/utils/BottomCompositionStore\n*L\n130#1:174,2\n142#1:176,2\n*E\n"})
public final class BottomCompositionStore<T> {

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Companion f28494g = new Companion(null);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final BottomCompositionRequest f28495h = new C15693a();

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function1<String, BottomCompositionTask<T>> f28496a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function0<Unit> f28497b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Map<String, T> f28498c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Map<String, Throwable> f28499d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Map<String, C15695c<T>> f28500e;

    /* JADX INFO: renamed from: f */
    public long f28501f;

    /* JADX INFO: compiled from: BottomCompositionStore.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/utils/BottomCompositionStore$Companion;", "", "<init>", "()V", "EMPTY_REQUEST", "Lcom/kubi/kucoin/utils/BottomCompositionRequest;", "getEMPTY_REQUEST", "()Lcom/kubi/kucoin/utils/BottomCompositionRequest;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final BottomCompositionRequest getEMPTY_REQUEST() {
            return BottomCompositionStore.f28495h;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.utils.BottomCompositionStore$b */
    /* JADX INFO: compiled from: BottomCompositionStore.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/kucoin/utils/BottomCompositionStore$Consumer;", ExifInterface.GPS_DIRECTION_TRUE, "", "source", "Lcom/kubi/kucoin/utils/BottomLottieSource;", "onSuccess", "Lkotlin/Function2;", "", "onFailure", "", "<init>", "(Lcom/kubi/kucoin/utils/BottomLottieSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getSource", "()Lcom/kubi/kucoin/utils/BottomLottieSource;", "getOnSuccess", "()Lkotlin/jvm/functions/Function2;", "getOnFailure", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15694b<T> {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final BottomLottieSource f28503a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Function2<T, BottomLottieSource, Unit> f28504b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final Function2<Throwable, BottomLottieSource, Unit> f28505c;

        /* JADX WARN: Multi-variable type inference failed */
        public C15694b(@NotNull BottomLottieSource source, @NotNull Function2<? super T, ? super BottomLottieSource, Unit> onSuccess, @NotNull Function2<? super Throwable, ? super BottomLottieSource, Unit> onFailure) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
            Intrinsics.checkNotNullParameter(onFailure, "onFailure");
            this.f28503a = source;
            this.f28504b = onSuccess;
            this.f28505c = onFailure;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Function2<Throwable, BottomLottieSource, Unit> m33042a() {
            return this.f28505c;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Function2<T, BottomLottieSource, Unit> m33043b() {
            return this.f28504b;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final BottomLottieSource getF28503a() {
            return this.f28503a;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.utils.BottomCompositionStore$c */
    /* JADX INFO: compiled from: BottomCompositionStore.kt */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR9\u0010\u001d\u001a*\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 0\u001ej\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 `!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006$"}, m90084d2 = {"Lcom/kubi/kucoin/utils/BottomCompositionStore$Entry;", ExifInterface.GPS_DIRECTION_TRUE, "", "assetName", "", "task", "Lcom/kubi/kucoin/utils/BottomCompositionTask;", "<init>", "(Ljava/lang/String;Lcom/kubi/kucoin/utils/BottomCompositionTask;)V", "getAssetName", "()Ljava/lang/String;", "getTask", "()Lcom/kubi/kucoin/utils/BottomCompositionTask;", "successListener", "Lcom/kubi/kucoin/utils/BottomTaskListener;", "getSuccessListener", "()Lcom/kubi/kucoin/utils/BottomTaskListener;", "setSuccessListener", "(Lcom/kubi/kucoin/utils/BottomTaskListener;)V", "failureListener", "", "getFailureListener", "setFailureListener", "terminal", "", "getTerminal", "()Z", "setTerminal", "(Z)V", "consumers", "Ljava/util/LinkedHashMap;", "", "Lcom/kubi/kucoin/utils/BottomCompositionStore$Consumer;", "Lkotlin/collections/LinkedHashMap;", "getConsumers", "()Ljava/util/LinkedHashMap;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15695c<T> {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f28506a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final BottomCompositionTask<T> f28507b;

        /* JADX INFO: renamed from: c */
        public BottomTaskListener<T> f28508c;

        /* JADX INFO: renamed from: d */
        public BottomTaskListener<Throwable> f28509d;

        /* JADX INFO: renamed from: e */
        public boolean f28510e;

        /* JADX INFO: renamed from: f */
        @NotNull
        public final LinkedHashMap<Long, C15694b<T>> f28511f;

        public C15695c(@NotNull String assetName, @NotNull BottomCompositionTask<T> task) {
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            Intrinsics.checkNotNullParameter(task, "task");
            this.f28506a = assetName;
            this.f28507b = task;
            this.f28511f = new LinkedHashMap<>();
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF28506a() {
            return this.f28506a;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final LinkedHashMap<Long, C15694b<T>> m33046b() {
            return this.f28511f;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final BottomTaskListener<Throwable> m33047c() {
            BottomTaskListener<Throwable> bottomTaskListener = this.f28509d;
            if (bottomTaskListener != null) {
                return bottomTaskListener;
            }
            Intrinsics.throwUninitializedPropertyAccessException("failureListener");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final BottomTaskListener<T> m33048d() {
            BottomTaskListener<T> bottomTaskListener = this.f28508c;
            if (bottomTaskListener != null) {
                return bottomTaskListener;
            }
            Intrinsics.throwUninitializedPropertyAccessException("successListener");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final BottomCompositionTask<T> m33049e() {
            return this.f28507b;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getF28510e() {
            return this.f28510e;
        }

        /* JADX INFO: renamed from: g */
        public final void m33051g(@NotNull BottomTaskListener<Throwable> bottomTaskListener) {
            Intrinsics.checkNotNullParameter(bottomTaskListener, "<set-?>");
            this.f28509d = bottomTaskListener;
        }

        /* JADX INFO: renamed from: h */
        public final void m33052h(@NotNull BottomTaskListener<T> bottomTaskListener) {
            Intrinsics.checkNotNullParameter(bottomTaskListener, "<set-?>");
            this.f28508c = bottomTaskListener;
        }

        /* JADX INFO: renamed from: i */
        public final void m33053i(boolean z11) {
            this.f28510e = z11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.utils.BottomCompositionStore$d */
    /* JADX INFO: compiled from: BottomCompositionStore.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m90084d2 = {"com/kubi/kucoin/utils/BottomCompositionStore$request$4", "Lcom/kubi/kucoin/utils/BottomCompositionRequest;", "source", "Lcom/kubi/kucoin/utils/BottomLottieSource;", "getSource", "()Lcom/kubi/kucoin/utils/BottomLottieSource;", "cancel", "", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15696d implements BottomCompositionRequest {

        /* JADX INFO: renamed from: a */
        public final BottomLottieSource f28512a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BottomCompositionStore<T> f28513b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C15695c<T> f28514c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f28515d;

        public C15696d(BottomLottieSource bottomLottieSource, BottomCompositionStore<T> bottomCompositionStore, C15695c<T> c15695c, long j11) {
            this.f28513b = bottomCompositionStore;
            this.f28514c = c15695c;
            this.f28515d = j11;
            this.f28512a = bottomLottieSource;
        }

        @Override // com.kubi.kucoin.utils.BottomCompositionRequest
        public void cancel() {
            this.f28513b.f28497b.invoke();
            this.f28514c.m33046b().remove(Long.valueOf(this.f28515d));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomCompositionStore(@NotNull Function1<? super String, ? extends BottomCompositionTask<T>> loadTask, @NotNull Function0<Unit> checkThread) {
        Intrinsics.checkNotNullParameter(loadTask, "loadTask");
        Intrinsics.checkNotNullParameter(checkThread, "checkThread");
        this.f28496a = loadTask;
        this.f28497b = checkThread;
        this.f28498c = new LinkedHashMap();
        this.f28499d = new LinkedHashMap();
        this.f28500e = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: j */
    public static final void m33034j(BottomCompositionStore bottomCompositionStore, C15695c c15695c, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bottomCompositionStore.m33036f(c15695c, it);
    }

    /* JADX INFO: renamed from: h */
    public final C15695c<T> m33038h(String str) {
        final C15695c<T> c15695c = new C15695c<>(str, this.f28496a.invoke(str));
        this.f28500e.put(str, c15695c);
        c15695c.m33052h(new BottomTaskListener() { // from class: com.kubi.kucoin.utils.d
            @Override // com.kubi.kucoin.utils.BottomTaskListener
            public final void onResult(Object obj) {
                BottomCompositionStore.m33033i(this.f28561a, c15695c, obj);
            }
        });
        c15695c.m33051g(new BottomTaskListener() { // from class: com.kubi.kucoin.utils.e
            @Override // com.kubi.kucoin.utils.BottomTaskListener
            public final void onResult(Object obj) {
                BottomCompositionStore.m33034j(this.f28563a, c15695c, (Throwable) obj);
            }
        });
        return c15695c;
    }

    /* JADX INFO: renamed from: l */
    public final void m33040l(@NotNull String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        this.f28497b.invoke();
        if (this.f28498c.containsKey(assetName) || this.f28499d.containsKey(assetName) || this.f28500e.containsKey(assetName)) {
            return;
        }
        try {
            m33035e(m33038h(assetName));
        } catch (Throwable th2) {
            this.f28499d.put(assetName, th2);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final BottomCompositionRequest m33041m(@NotNull String assetName, @NotNull Function2<? super T, ? super BottomLottieSource, Unit> onSuccess, @NotNull Function2<? super Throwable, ? super BottomLottieSource, Unit> onFailure) {
        C15695c<T> c15695cM33038h;
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        this.f28497b.invoke();
        T t11 = this.f28498c.get(assetName);
        if (t11 != null) {
            onSuccess.invoke(t11, BottomLottieSource.MEMORY);
            return f28495h;
        }
        Throwable th2 = this.f28499d.get(assetName);
        if (th2 != null) {
            onFailure.invoke(th2, BottomLottieSource.FAILED_LATCH);
            return f28495h;
        }
        C15695c<T> c15695c = this.f28500e.get(assetName);
        BottomLottieSource bottomLottieSource = c15695c == null ? BottomLottieSource.PARSE : BottomLottieSource.IN_FLIGHT;
        if (c15695c == null) {
            try {
                c15695cM33038h = m33038h(assetName);
            } catch (Throwable th3) {
                this.f28499d.put(assetName, th3);
                onFailure.invoke(th3, BottomLottieSource.PARSE);
                return f28495h;
            }
        } else {
            c15695cM33038h = c15695c;
        }
        long j11 = this.f28501f;
        this.f28501f = 1 + j11;
        c15695cM33038h.m33046b().put(Long.valueOf(j11), new C15694b<>(bottomLottieSource, onSuccess, onFailure));
        if (c15695c == null) {
            m33035e(c15695cM33038h);
        }
        return c15695cM33038h.getF28510e() ? f28495h : new C15696d(bottomLottieSource, this, c15695cM33038h, j11);
    }

    /* JADX INFO: renamed from: i */
    public static final void m33033i(BottomCompositionStore bottomCompositionStore, C15695c c15695c, Object obj) {
        bottomCompositionStore.m33037g(c15695c, obj);
    }

    /* JADX INFO: renamed from: e */
    public final void m33035e(C15695c<T> c15695c) {
        c15695c.m33049e().mo33079c(c15695c.m33048d());
        if (c15695c.getF28510e()) {
            c15695c.m33049e().mo33078b(c15695c.m33048d());
        }
        c15695c.m33049e().mo33080d(c15695c.m33047c());
        if (c15695c.getF28510e()) {
            c15695c.m33049e().mo33077a(c15695c.m33047c());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m33036f(C15695c<T> c15695c, Throwable th2) {
        if (!c15695c.getF28510e()) {
            c15695c.m33053i(true);
            this.f28499d.put(c15695c.getF28506a(), th2);
            this.f28500e.remove(c15695c.getF28506a(), c15695c);
            m33039k(c15695c);
            Collection<C15694b<T>> collectionValues = c15695c.m33046b().values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            List<C15694b> list = CollectionsKt.toList(collectionValues);
            c15695c.m33046b().clear();
            for (C15694b c15694b : list) {
                c15694b.m33042a().invoke(th2, c15694b.getF28503a());
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m33037g(C15695c<T> c15695c, T t11) {
        if (!c15695c.getF28510e()) {
            c15695c.m33053i(true);
            this.f28498c.put(c15695c.getF28506a(), t11);
            this.f28500e.remove(c15695c.getF28506a(), c15695c);
            m33039k(c15695c);
            Collection<C15694b<T>> collectionValues = c15695c.m33046b().values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            List<C15694b> list = CollectionsKt.toList(collectionValues);
            c15695c.m33046b().clear();
            for (C15694b c15694b : list) {
                c15694b.m33043b().invoke(t11, c15694b.getF28503a());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m33039k(C15695c<T> c15695c) {
        c15695c.m33049e().mo33078b(c15695c.m33048d());
        c15695c.m33049e().mo33077a(c15695c.m33047c());
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.utils.BottomCompositionStore$a */
    /* JADX INFO: compiled from: BottomCompositionStore.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m90084d2 = {"com/kubi/kucoin/utils/BottomCompositionStore$Companion$EMPTY_REQUEST$1", "Lcom/kubi/kucoin/utils/BottomCompositionRequest;", "source", "Lcom/kubi/kucoin/utils/BottomLottieSource;", "getSource", "()Lcom/kubi/kucoin/utils/BottomLottieSource;", "cancel", "", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15693a implements BottomCompositionRequest {

        /* JADX INFO: renamed from: a */
        public final BottomLottieSource f28502a = BottomLottieSource.MEMORY;

        @Override // com.kubi.kucoin.utils.BottomCompositionRequest
        public void cancel() {
        }
    }
}
