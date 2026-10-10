package com.kubi.kucoin.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.exifinterface.media.ExifInterface;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.C5102p0;
import com.airbnb.lottie.C5107r;
import com.airbnb.lottie.InterfaceC5085j0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.RenderMode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: BottomMenuHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0007J\u0006\u0010\u0015\u001a\u00020\fJ\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0007J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0005H\u0007JH\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00052\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00130 2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00130#H\u0007J\u0010\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0011H\u0007J\u000e\u0010'\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000eJ\u0016\u0010(\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0005J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010+\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/kubi/kucoin/utils/BottomMenuHelper;", "", "<init>", "()V", "TAG", "", "cacheLottieComposition", "Ljava/util/WeakHashMap;", "Lcom/airbnb/lottie/LottieDrawable;", "mode", "Lcom/kubi/kucoin/utils/BottomLottieMode;", "modeInitialized", "", "applicationContext", "Landroid/content/Context;", "compositionStore", "Lcom/kubi/kucoin/utils/BottomCompositionStore;", "Lcom/airbnb/lottie/LottieComposition;", "initializeMode", "", "newMode", "isAsyncMode", "createSelectedFallbackDrawable", "Landroid/graphics/drawable/Drawable;", "context", "normalRes", "", "preload", "assetName", "requestComposition", "Lcom/kubi/kucoin/utils/BottomLottieRequest;", "onSuccess", "Lkotlin/Function2;", "Lcom/kubi/kucoin/utils/BottomLottieSource;", "onFailure", "Lkotlin/Function1;", "", "createDrawable", "composition", "initLottieRes", "getLottieDrawable", "key", "ensureContext", "checkMainThread", "LottieCompositionTask", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBottomMenuHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomMenuHelper.kt\ncom/kubi/kucoin/utils/BottomMenuHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n1#2:260\n*E\n"})
public final class BottomMenuHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BottomMenuHelper f28520a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final WeakHashMap<String, LottieDrawable> f28521b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static BottomLottieMode f28522c;

    /* JADX INFO: renamed from: d */
    public static boolean f28523d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public static Context f28524e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final BottomCompositionStore<C5080h> f28525f;

    /* JADX INFO: compiled from: BottomMenuHelper.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\u0016\u0010\u0013\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\u0016\u0010\u0014\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0016J\u0016\u0010\u0015\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kucoin/utils/BottomMenuHelper$LottieCompositionTask;", "Lcom/kubi/kucoin/utils/BottomCompositionTask;", "Lcom/airbnb/lottie/LottieComposition;", "task", "Lcom/airbnb/lottie/LottieTask;", "<init>", "(Lcom/airbnb/lottie/LottieTask;)V", "successDelegates", "Ljava/util/IdentityHashMap;", "Lcom/kubi/kucoin/utils/BottomTaskListener;", "Lcom/airbnb/lottie/LottieListener;", "failureDelegates", "", "addingSuccess", "", "addingFailure", "addSuccessListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeSuccessListener", "addFailureListener", "removeFailureListener", "Companion", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class LottieCompositionTask implements BottomCompositionTask<C5080h> {

        /* JADX INFO: renamed from: f */
        @NotNull
        public static final Companion f28526f = new Companion(null);

        /* JADX INFO: renamed from: a */
        @NotNull
        public final C5102p0<C5080h> f28527a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final IdentityHashMap<BottomTaskListener<C5080h>, InterfaceC5085j0<C5080h>> f28528b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final IdentityHashMap<BottomTaskListener<Throwable>, InterfaceC5085j0<Throwable>> f28529c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final Set<BottomTaskListener<C5080h>> f28530d;

        /* JADX INFO: renamed from: e */
        @NotNull
        public final Set<BottomTaskListener<Throwable>> f28531e;

        /* JADX INFO: compiled from: BottomMenuHelper.kt */
        @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/kucoin/utils/BottomMenuHelper$LottieCompositionTask$Companion;", "", "<init>", "()V", "newIdentitySet", "", ExifInterface.GPS_DIRECTION_TRUE, "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            @NotNull
            public final <T> Set<T> newIdentitySet() {
                Set<T> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(...)");
                return setNewSetFromMap;
            }
        }

        public LottieCompositionTask(@NotNull C5102p0<C5080h> task) {
            Intrinsics.checkNotNullParameter(task, "task");
            this.f28527a = task;
            this.f28528b = new IdentityHashMap<>();
            this.f28529c = new IdentityHashMap<>();
            Companion companion = f28526f;
            this.f28530d = companion.newIdentitySet();
            this.f28531e = companion.newIdentitySet();
        }

        @Override // com.kubi.kucoin.utils.BottomCompositionTask
        /* JADX INFO: renamed from: a */
        public void mo33077a(@NotNull BottomTaskListener<Throwable> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            InterfaceC5085j0<Throwable> interfaceC5085j0Remove = this.f28529c.remove(listener);
            if (interfaceC5085j0Remove == null || this.f28531e.contains(listener)) {
                return;
            }
            this.f28527a.m5822j(interfaceC5085j0Remove);
        }

        @Override // com.kubi.kucoin.utils.BottomCompositionTask
        /* JADX INFO: renamed from: b */
        public void mo33078b(@NotNull BottomTaskListener<C5080h> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            InterfaceC5085j0<C5080h> interfaceC5085j0Remove = this.f28528b.remove(listener);
            if (interfaceC5085j0Remove == null || this.f28530d.contains(listener)) {
                return;
            }
            this.f28527a.m5823k(interfaceC5085j0Remove);
        }

        @Override // com.kubi.kucoin.utils.BottomCompositionTask
        /* JADX INFO: renamed from: c */
        public void mo33079c(@NotNull final BottomTaskListener<C5080h> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            InterfaceC5085j0<C5080h> interfaceC5085j0 = new InterfaceC5085j0() { // from class: com.kubi.kucoin.utils.l
                @Override // com.airbnb.lottie.InterfaceC5085j0
                public final void onResult(Object obj) {
                    BottomMenuHelper.LottieCompositionTask.m33076h(listener, (C5080h) obj);
                }
            };
            this.f28528b.put(listener, interfaceC5085j0);
            this.f28530d.add(listener);
            this.f28527a.m5816d(interfaceC5085j0);
            this.f28530d.remove(listener);
            if (this.f28528b.containsKey(listener)) {
                return;
            }
            this.f28527a.m5823k(interfaceC5085j0);
        }

        @Override // com.kubi.kucoin.utils.BottomCompositionTask
        /* JADX INFO: renamed from: d */
        public void mo33080d(@NotNull final BottomTaskListener<Throwable> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            InterfaceC5085j0<Throwable> interfaceC5085j0 = new InterfaceC5085j0() { // from class: com.kubi.kucoin.utils.m
                @Override // com.airbnb.lottie.InterfaceC5085j0
                public final void onResult(Object obj) {
                    BottomMenuHelper.LottieCompositionTask.m33075g(listener, (Throwable) obj);
                }
            };
            this.f28529c.put(listener, interfaceC5085j0);
            this.f28531e.add(listener);
            this.f28527a.m5815c(interfaceC5085j0);
            this.f28531e.remove(listener);
            if (this.f28529c.containsKey(listener)) {
                return;
            }
            this.f28527a.m5822j(interfaceC5085j0);
        }

        /* JADX INFO: renamed from: g */
        public static final void m33075g(BottomTaskListener bottomTaskListener, Throwable th2) {
            Intrinsics.checkNotNull(th2);
            bottomTaskListener.onResult(th2);
        }

        /* JADX INFO: renamed from: h */
        public static final void m33076h(BottomTaskListener bottomTaskListener, C5080h c5080h) {
            Intrinsics.checkNotNull(c5080h);
            bottomTaskListener.onResult(c5080h);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.utils.BottomMenuHelper$a */
    /* JADX INFO: compiled from: BottomMenuHelper.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/kucoin/utils/BottomMenuHelper$requestComposition$2", "Lcom/kubi/kucoin/utils/BottomLottieRequest;", "cancel", "", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15697a implements BottomLottieRequest {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref.BooleanRef f28532a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BottomCompositionRequest f28533b;

        public C15697a(Ref.BooleanRef booleanRef, BottomCompositionRequest bottomCompositionRequest) {
            this.f28532a = booleanRef;
            this.f28533b = bottomCompositionRequest;
        }

        @Override // com.kubi.kucoin.utils.BottomLottieRequest
        public void cancel() {
            BottomMenuHelper.f28520a.m33063e();
            Ref.BooleanRef booleanRef = this.f28532a;
            if (booleanRef.element) {
                return;
            }
            booleanRef.element = true;
            this.f28533b.cancel();
        }
    }

    static {
        BottomMenuHelper bottomMenuHelper = new BottomMenuHelper();
        f28520a = bottomMenuHelper;
        f28521b = new WeakHashMap<>();
        f28522c = BottomLottieMode.LEGACY;
        f28525f = new BottomCompositionStore<>(new Function1() { // from class: com.kubi.kucoin.utils.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomMenuHelper.m33060f((String) obj);
            }
        }, new BottomMenuHelper$compositionStore$2(bottomMenuHelper));
    }

    /* JADX INFO: renamed from: f */
    public static final BottomCompositionTask m33060f(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Context context = f28524e;
        if (context == null) {
            throw new IllegalStateException("BottomMenuHelper context must be initialized before loading composition");
        }
        C5102p0<C5080h> c5102p0M5884l = C5107r.m5884l(context, assetName);
        Intrinsics.checkNotNullExpressionValue(c5102p0M5884l, "fromAsset(...)");
        return new LottieCompositionTask(c5102p0M5884l);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m33061p(Ref.BooleanRef booleanRef, Function2 function2, C5080h composition, BottomLottieSource source) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!booleanRef.element) {
            booleanRef.element = true;
            function2.invoke(composition, source);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m33062q(Ref.BooleanRef booleanRef, String str, Function1 function1, Throwable error, BottomLottieSource bottomLottieSource) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(bottomLottieSource, "<unused var>");
        if (!booleanRef.element) {
            booleanRef.element = true;
            C44128b.m97262f("BottomMenuHelper", "load lottie composition failed: " + str, error);
            function1.invoke(error);
        }
        return Unit.INSTANCE;
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: g */
    public final LottieDrawable m33064g(@NotNull C5080h composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        m33063e();
        LottieDrawable lottieDrawable = new LottieDrawable();
        lottieDrawable.m5630w0(composition);
        lottieDrawable.m5582Q0(RenderMode.HARDWARE);
        return lottieDrawable;
    }

    @MainThread
    @Nullable
    /* JADX INFO: renamed from: h */
    public final Drawable m33065h(@NotNull Context context, @DrawableRes int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        m33063e();
        Drawable drawable = AppCompatResources.getDrawable(context, i11);
        if (drawable == null) {
            return null;
        }
        return C15731n.m33152a(drawable, context);
    }

    /* JADX INFO: renamed from: i */
    public final void m33066i(Context context) {
        if (f28524e == null) {
            f28524e = context.getApplicationContext();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final LottieDrawable m33067j(@NotNull Context context, @NotNull String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        LottieDrawable lottieDrawable = f28521b.get(key);
        if (lottieDrawable == null) {
            lottieDrawable = new LottieDrawable();
            try {
                lottieDrawable.m5630w0(C5107r.m5886n(context.getApplicationContext(), key).m5811b());
            } catch (Throwable th2) {
                C44128b.m97262f("BottomMenuHelper", "load lottie composition failed: " + key, th2);
            }
            lottieDrawable.m5582Q0(RenderMode.HARDWARE);
            f28521b.put(key, lottieDrawable);
        }
        return lottieDrawable;
    }

    /* JADX INFO: renamed from: k */
    public final void m33068k(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m33067j(context, "icon_home_checked.json");
        m33067j(context, "icon_home_checked-night.json");
    }

    @MainThread
    /* JADX INFO: renamed from: l */
    public final void m33069l(@NotNull BottomLottieMode newMode) {
        Intrinsics.checkNotNullParameter(newMode, "newMode");
        m33063e();
        if (f28523d) {
            if (f28522c != newMode) {
                throw new IllegalStateException("Bottom Lottie mode cannot change in current process");
            }
        } else {
            f28522c = newMode;
            f28523d = true;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m33070m() {
        return f28522c == BottomLottieMode.ASYNC;
    }

    @MainThread
    /* JADX INFO: renamed from: n */
    public final void m33071n(@NotNull Context context, @NotNull String assetName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        m33063e();
        m33066i(context);
        f28525f.m33040l(assetName);
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: o */
    public final BottomLottieRequest m33072o(@NotNull Context context, @NotNull final String assetName, @NotNull final Function2<? super C5080h, ? super BottomLottieSource, Unit> onSuccess, @NotNull final Function1<? super Throwable, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        m33063e();
        m33066i(context);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        return new C15697a(booleanRef, f28525f.m33041m(assetName, new Function2() { // from class: com.kubi.kucoin.utils.j
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BottomMenuHelper.m33061p(booleanRef, onSuccess, (C5080h) obj, (BottomLottieSource) obj2);
            }
        }, new Function2() { // from class: com.kubi.kucoin.utils.k
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BottomMenuHelper.m33062q(booleanRef, assetName, onFailure, (Throwable) obj, (BottomLottieSource) obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public final void m33063e() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
        } else {
            throw new IllegalStateException("BottomMenuHelper must be called on the main thread");
        }
    }
}
