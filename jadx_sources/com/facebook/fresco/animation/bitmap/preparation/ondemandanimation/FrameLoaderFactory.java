package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p007a5.C0131h;
import p526p5.AbstractC43387c;
import p683v4.InterfaceC45417d;
import p713w4.InterfaceC45719b;
import p820z4.C46692c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AnimationLoaderFactory.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, m90084d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameLoaderFactory;", "", "Lp5/c;", "platformBitmapFactory", "", "maxFpsRender", "bufferLengthMilliseconds", "<init>", "(Lp5/c;II)V", "", "cacheKey", "Lw4/b;", "bitmapFrameRenderer", "Lv4/d;", "animationInformation", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;", "b", "(Ljava/lang/String;Lw4/b;Lv4/d;)Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lp5/c;", "I", "c", "d", "Companion", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class FrameLoaderFactory {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final ConcurrentHashMap<String, C0131h> f8435e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC43387c platformBitmapFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int maxFpsRender;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int bufferLengthMilliseconds;

    /* JADX INFO: compiled from: AnimationLoaderFactory.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameLoaderFactory$Companion;", "", "<init>", "()V", "", "cacheKey", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;", "frameLoader", "", "saveUnusedFrame", "(Ljava/lang/String;Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;)V", "Ljava/util/Date;", "until", "clearUnusedUntil", "(Ljava/util/Date;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "La5/h;", "UNUSED_FRAME_LOADERS", "Ljava/util/concurrent/ConcurrentHashMap;", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAnimationLoaderFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationLoaderFactory.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameLoaderFactory$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,65:1\n535#2:66\n520#2,6:67\n216#3,2:73\n*S KotlinDebug\n*F\n+ 1 AnimationLoaderFactory.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameLoaderFactory$Companion\n*L\n53#1:66\n53#1:67,6\n55#1:73,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void saveUnusedFrame(@NotNull String cacheKey, @NotNull InterfaceC5611b frameLoader) {
            Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
            Intrinsics.checkNotNullParameter(frameLoader, "frameLoader");
            FrameLoaderFactory.f8435e.put(cacheKey, new C0131h(frameLoader, new Date()));
        }

        public final void clearUnusedUntil(@NotNull Date until) {
            Intrinsics.checkNotNullParameter(until, "until");
            synchronized (FrameLoaderFactory.f8435e) {
                try {
                    ConcurrentHashMap concurrentHashMap = FrameLoaderFactory.f8435e;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        if (((C0131h) entry.getValue()).getInsertedTime().compareTo(until) < 0) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        ((C0131h) entry2.getValue()).getFrameLoader().clear();
                        FrameLoaderFactory.f8435e.remove(entry2.getKey());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC5611b m8791b(@NotNull String cacheKey, @NotNull InterfaceC45719b bitmapFrameRenderer, @NotNull InterfaceC45417d animationInformation) {
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        ConcurrentHashMap<String, C0131h> concurrentHashMap = f8435e;
        synchronized (concurrentHashMap) {
            C0131h c0131h = concurrentHashMap.get(cacheKey);
            if (c0131h == null) {
                Unit unit = Unit.INSTANCE;
                return new BufferFrameLoader(this.platformBitmapFactory, bitmapFrameRenderer, new C46692c(this.maxFpsRender), animationInformation, this.bufferLengthMilliseconds);
            }
            concurrentHashMap.remove(cacheKey);
            return c0131h.getFrameLoader();
        }
    }

    public FrameLoaderFactory(@NotNull AbstractC43387c platformBitmapFactory, int i11, int i12) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        this.platformBitmapFactory = platformBitmapFactory;
        this.maxFpsRender = i11;
        this.bufferLengthMilliseconds = i12;
    }
}
