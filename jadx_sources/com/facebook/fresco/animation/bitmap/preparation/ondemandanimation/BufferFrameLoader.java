package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.BufferFrameLoader;
import com.tencent.bugly.library.MonitorCallback;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p006a4.AbstractC0110a;
import p007a5.C0124a;
import p007a5.C0129f;
import p526p5.AbstractC43387c;
import p683v4.InterfaceC45417d;
import p713w4.InterfaceC45719b;
import p820z4.C46691b;
import p820z4.C46692c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: BufferFrameLoader.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0002\u0017RB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J1\u0010%\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\nH\u0003¢\u0006\u0004\b%\u0010&J5\u0010*\u001a\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b/\u00100J'\u00102\u001a\b\u0012\u0004\u0012\u00020(0'*\b\u0012\u0004\u0012\u00020(0'2\u0006\u00101\u001a\u00020(H\u0002¢\u0006\u0004\b2\u00103J\u0013\u00104\u001a\u00020\n*\u00020\bH\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00108R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010=R\u0014\u0010>\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010=R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010=R\u0016\u0010F\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010HR\u0016\u0010J\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010=R\"\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010LR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020\n0N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006S"}, m90084d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/BufferFrameLoader;", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;", "Lp5/c;", "platformBitmapFactory", "Lw4/b;", "bitmapFrameRenderer", "Lz4/c;", "fpsCompressor", "Lv4/d;", "animationInformation", "", "bufferLengthMilliseconds", "<init>", "(Lp5/c;Lw4/b;Lz4/c;Lv4/d;I)V", "frameNumber", "width", "height", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "c", "(III)Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "Lkotlin/Function0;", "", "onAnimationLoaded", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(IILkotlin/jvm/functions/Function0;)V", MonitorCallback.EVENT_FPS, "b", "(I)V", "clear", "()V", "targetFrame", "i", "(I)Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", CmcdData.Factory.STREAM_TYPE_LIVE, "(II)V", "count", "", "f", "(IIII)Z", "La4/a;", "Landroid/graphics/Bitmap;", "targetBitmap", "n", "(La4/a;III)V", "La5/a;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(I)La5/a;", "e", "(La4/a;)V", TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, "o", "(La4/a;Landroid/graphics/Bitmap;)La4/a;", "j", "(Lv4/d;)I", "Lp5/c;", "Lw4/b;", "Lz4/c;", "d", "Lv4/d;", "k", "()Lv4/d;", "I", "bufferSize", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/BufferFrameLoader$a;", "g", "Ljava/util/concurrent/ConcurrentHashMap;", "bufferFramesHash", "thresholdFrame", "Z", "isFetching", "La5/f;", "La5/f;", "frameSequence", "lastRenderedFrameNumber", "", "Ljava/util/Map;", "compressionFrameMap", "", "m", "Ljava/util/Set;", "renderableFrameIndexes", "Companion", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBufferFrameLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferFrameLoader.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/BufferFrameLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n1#2:253\n1863#3,2:254\n774#3:256\n865#3,2:257\n1863#3,2:259\n1863#3,2:261\n1863#3,2:263\n*S KotlinDebug\n*F\n+ 1 BufferFrameLoader.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/BufferFrameLoader\n*L\n109#1:254,2\n137#1:256\n137#1:257,2\n144#1:259,2\n198#1:261,2\n204#1:263,2\n*E\n"})
public final class BufferFrameLoader implements InterfaceC5611b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC43387c platformBitmapFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45719b bitmapFrameRenderer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C46692c fpsCompressor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45417d animationInformation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int bufferLengthMilliseconds;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int bufferSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<Integer, C5609a> bufferFramesHash;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public volatile int thresholdFrame;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public volatile boolean isFetching;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C0129f frameSequence;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int lastRenderedFrameNumber;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public Map<Integer, Integer> compressionFrameMap;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public Set<Integer> renderableFrameIndexes;

    /* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.BufferFrameLoader$a */
    /* JADX INFO: compiled from: BufferFrameLoader.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\"\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0015"}, m90084d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/BufferFrameLoader$a;", "", "La4/a;", "Landroid/graphics/Bitmap;", "bitmapRef", "<init>", "(La4/a;)V", "", "c", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "La4/a;", "()La4/a;", "", "b", "Z", "isUpdatingFrame", "()Z", "d", "(Z)V", "isFrameAvailable", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C5609a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final AbstractC0110a<Bitmap> bitmapRef;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean isUpdatingFrame;

        public C5609a(@NotNull AbstractC0110a<Bitmap> bitmapRef) {
            Intrinsics.checkNotNullParameter(bitmapRef, "bitmapRef");
            this.bitmapRef = bitmapRef;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final AbstractC0110a<Bitmap> m8786a() {
            return this.bitmapRef;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m8787b() {
            return !this.isUpdatingFrame && this.bitmapRef.mo567n();
        }

        /* JADX INFO: renamed from: c */
        public final void m8788c() {
            AbstractC0110a.m555j(this.bitmapRef);
        }

        /* JADX INFO: renamed from: d */
        public final void m8789d(boolean z11) {
            this.isUpdatingFrame = z11;
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m8772g(BufferFrameLoader bufferFrameLoader, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            i14 = 0;
        }
        return bufferFrameLoader.m8778f(i11, i12, i13, i14);
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC5611b
    @UiThread
    /* JADX INFO: renamed from: a */
    public void mo8774a(int width, int height, @NotNull Function0<Unit> onAnimationLoaded) {
        Intrinsics.checkNotNullParameter(onAnimationLoaded, "onAnimationLoaded");
        m8783l(width, height);
        onAnimationLoaded.invoke();
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC5611b
    @UiThread
    @NotNull
    /* JADX INFO: renamed from: c */
    public FrameResult mo8776c(int frameNumber, int width, int height) {
        Integer num = this.compressionFrameMap.get(Integer.valueOf(frameNumber));
        if (num == null) {
            return m8780i(frameNumber);
        }
        int iIntValue = num.intValue();
        this.lastRenderedFrameNumber = iIntValue;
        C5609a c5609a = this.bufferFramesHash.get(num);
        if (c5609a == null || !c5609a.m8787b()) {
            c5609a = null;
        }
        if (c5609a == null) {
            m8783l(width, height);
            return m8780i(iIntValue);
        }
        if (this.frameSequence.m594c(this.thresholdFrame, iIntValue, this.bufferSize)) {
            m8783l(width, height);
        }
        return new FrameResult(c5609a.m8786a().clone(), FrameResult.FrameType.SUCCESS);
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC5611b
    public void clear() {
        Collection<C5609a> collectionValues = this.bufferFramesHash.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((C5609a) it.next()).m8788c();
        }
        this.bufferFramesHash.clear();
        this.lastRenderedFrameNumber = -1;
    }

    @WorkerThread
    /* JADX INFO: renamed from: f */
    public final boolean m8778f(int targetFrame, int width, int height, int count) {
        int iIntValue;
        AbstractC0110a<Bitmap> abstractC0110aM8786a;
        List<Integer> listM595d = this.frameSequence.m595d(targetFrame, this.bufferSize);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM595d) {
            if (this.renderableFrameIndexes.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        Set set = CollectionsKt.toSet(arrayList);
        Set<Integer> setKeySet = this.bufferFramesHash.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        ArrayDeque arrayDeque = new ArrayDeque(SetsKt.minus((Set) setKeySet, (Iterable) set));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (this.bufferFramesHash.get(Integer.valueOf(iIntValue2)) == null) {
                int i11 = this.lastRenderedFrameNumber;
                if (i11 != -1 && !set.contains(Integer.valueOf(i11))) {
                    return false;
                }
                Integer num = (Integer) arrayDeque.pollFirst();
                int iIntValue3 = num != null ? num.intValue() : -1;
                C5609a c5609a = this.bufferFramesHash.get(Integer.valueOf(iIntValue3));
                AbstractC0110a<Bitmap> abstractC0110aMo564g = (c5609a == null || (abstractC0110aM8786a = c5609a.m8786a()) == null) ? null : abstractC0110aM8786a.mo564g();
                if (abstractC0110aMo564g == null) {
                    AbstractC0110a<Bitmap> abstractC0110aM95560a = this.platformBitmapFactory.m95560a(width, height);
                    Intrinsics.checkNotNullExpressionValue(abstractC0110aM95560a, "createBitmap(...)");
                    c5609a = new C5609a(abstractC0110aM95560a);
                    abstractC0110aMo564g = c5609a.m8786a().clone();
                }
                c5609a.m8789d(true);
                try {
                    m8784n(abstractC0110aMo564g, iIntValue2, width, height);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(abstractC0110aMo564g, null);
                    this.bufferFramesHash.remove(Integer.valueOf(iIntValue3));
                    c5609a.m8789d(false);
                    this.bufferFramesHash.put(Integer.valueOf(iIntValue2), c5609a);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(abstractC0110aMo564g, th2);
                        throw th3;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            iIntValue = (int) (this.bufferSize * 0.5f);
        } else {
            int size = arrayList.size();
            iIntValue = ((Number) arrayList.get(RangesKt.coerceIn((int) (size * 0.5f), 0, size - 1))).intValue();
        }
        this.thresholdFrame = iIntValue;
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final C0124a m8779h(int targetFrame) {
        C0124a c0124a;
        Iterator<Integer> it = new IntRange(0, this.frameSequence.getSize()).iterator();
        do {
            c0124a = null;
            if (!it.hasNext()) {
                break;
            }
            int iM592a = this.frameSequence.m592a(targetFrame - ((IntIterator) it).nextInt());
            C5609a c5609a = this.bufferFramesHash.get(Integer.valueOf(iM592a));
            if (c5609a != null) {
                if (!c5609a.m8787b()) {
                    c5609a = null;
                }
                if (c5609a != null) {
                    c0124a = new C0124a(iM592a, c5609a.m8786a());
                }
            }
        } while (c0124a == null);
        return c0124a;
    }

    /* JADX INFO: renamed from: j */
    public final int m8781j(InterfaceC45417d interfaceC45417d) {
        return (int) RangesKt.coerceAtLeast(TimeUnit.SECONDS.toMillis(1L) / ((long) (interfaceC45417d.mo4286h() / interfaceC45417d.mo4283a())), 1L);
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public InterfaceC45417d getAnimationInformation() {
        return this.animationInformation;
    }

    /* JADX INFO: renamed from: l */
    public final void m8783l(final int width, final int height) {
        if (this.isFetching) {
            return;
        }
        this.isFetching = true;
        C46691b.f104529a.m102928b(new Runnable() { // from class: a5.e
            @Override // java.lang.Runnable
            public final void run() {
                BufferFrameLoader.m8773m(this.f456b, width, height);
            }
        });
    }

    public BufferFrameLoader(@NotNull AbstractC43387c platformBitmapFactory, @NotNull InterfaceC45719b bitmapFrameRenderer, @NotNull C46692c fpsCompressor, @NotNull InterfaceC45417d animationInformation, int i11) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(fpsCompressor, "fpsCompressor");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        this.platformBitmapFactory = platformBitmapFactory;
        this.bitmapFrameRenderer = bitmapFrameRenderer;
        this.fpsCompressor = fpsCompressor;
        this.animationInformation = animationInformation;
        this.bufferLengthMilliseconds = i11;
        int iCoerceAtLeast = RangesKt.coerceAtLeast((m8781j(getAnimationInformation()) * i11) / 1000, 1);
        this.bufferSize = iCoerceAtLeast;
        this.bufferFramesHash = new ConcurrentHashMap<>();
        this.frameSequence = new C0129f(getAnimationInformation().mo4283a());
        this.lastRenderedFrameNumber = -1;
        this.compressionFrameMap = MapsKt.emptyMap();
        this.renderableFrameIndexes = SetsKt.emptySet();
        mo8775b(m8781j(getAnimationInformation()));
        this.thresholdFrame = (int) (iCoerceAtLeast * 0.5f);
    }

    /* JADX INFO: renamed from: m */
    public static final void m8773m(BufferFrameLoader this$0, int i11, int i12) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        while (true) {
            BufferFrameLoader bufferFrameLoader = this$0;
            int i13 = i11;
            int i14 = i12;
            if (m8772g(bufferFrameLoader, RangesKt.coerceAtLeast(this$0.lastRenderedFrameNumber, 0), i13, i14, 0, 8, null)) {
                bufferFrameLoader.isFetching = false;
                return;
            } else {
                this$0 = bufferFrameLoader;
                i11 = i13;
                i12 = i14;
            }
        }
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC5611b
    /* JADX INFO: renamed from: b */
    public void mo8775b(int fps) {
        Map<Integer, Integer> mapM102929a = this.fpsCompressor.m102929a(getAnimationInformation().mo4286h() * RangesKt.coerceAtLeast(getAnimationInformation().mo4284b(), 1), getAnimationInformation().mo4283a(), RangesKt.coerceAtMost(fps, m8781j(getAnimationInformation())));
        this.compressionFrameMap = mapM102929a;
        this.renderableFrameIndexes = CollectionsKt.toSet(mapM102929a.values());
    }

    /* JADX INFO: renamed from: e */
    public final void m8777e(AbstractC0110a<Bitmap> abstractC0110a) {
        if (abstractC0110a.mo567n()) {
            new Canvas(abstractC0110a.m565l()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    @UiThread
    /* JADX INFO: renamed from: i */
    public final FrameResult m8780i(int targetFrame) {
        C0124a c0124aM8779h = m8779h(targetFrame);
        if (c0124aM8779h != null) {
            AbstractC0110a<Bitmap> abstractC0110aClone = c0124aM8779h.m590a().clone();
            Intrinsics.checkNotNullExpressionValue(abstractC0110aClone, "clone(...)");
            this.lastRenderedFrameNumber = c0124aM8779h.getFrameNumber();
            return new FrameResult(abstractC0110aClone, FrameResult.FrameType.NEAREST);
        }
        return new FrameResult(null, FrameResult.FrameType.MISSING);
    }

    /* JADX INFO: renamed from: n */
    public final void m8784n(AbstractC0110a<Bitmap> targetBitmap, int targetFrame, int width, int height) {
        AbstractC0110a<Bitmap> abstractC0110aM590a;
        AbstractC0110a<Bitmap> abstractC0110aMo564g;
        C0124a c0124aM8779h = m8779h(targetFrame);
        if (c0124aM8779h != null && (abstractC0110aM590a = c0124aM8779h.m590a()) != null && (abstractC0110aMo564g = abstractC0110aM590a.mo564g()) != null) {
            try {
                int frameNumber = c0124aM8779h.getFrameNumber();
                if (frameNumber < targetFrame) {
                    Bitmap bitmapM565l = abstractC0110aMo564g.m565l();
                    Intrinsics.checkNotNullExpressionValue(bitmapM565l, "get(...)");
                    m8785o(targetBitmap, bitmapM565l);
                    Iterator<Integer> it = new IntRange(frameNumber + 1, targetFrame).iterator();
                    while (it.hasNext()) {
                        int iNextInt = ((IntIterator) it).nextInt();
                        InterfaceC45719b interfaceC45719b = this.bitmapFrameRenderer;
                        Bitmap bitmapM565l2 = targetBitmap.m565l();
                        Intrinsics.checkNotNullExpressionValue(bitmapM565l2, "get(...)");
                        interfaceC45719b.mo8808a(iNextInt, bitmapM565l2);
                    }
                    CloseableKt.closeFinally(abstractC0110aMo564g, null);
                    return;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(abstractC0110aMo564g, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(abstractC0110aMo564g, th2);
                    throw th3;
                }
            }
        }
        m8777e(targetBitmap);
        Iterator<Integer> it2 = new IntRange(0, targetFrame).iterator();
        while (it2.hasNext()) {
            int iNextInt2 = ((IntIterator) it2).nextInt();
            InterfaceC45719b interfaceC45719b2 = this.bitmapFrameRenderer;
            Bitmap bitmapM565l3 = targetBitmap.m565l();
            Intrinsics.checkNotNullExpressionValue(bitmapM565l3, "get(...)");
            interfaceC45719b2.mo8808a(iNextInt2, bitmapM565l3);
        }
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC0110a<Bitmap> m8785o(AbstractC0110a<Bitmap> abstractC0110a, Bitmap bitmap) {
        if (abstractC0110a.mo567n() && !Intrinsics.areEqual(abstractC0110a.m565l(), bitmap)) {
            Canvas canvas = new Canvas(abstractC0110a.m565l());
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        return abstractC0110a;
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC5611b
    public void onStop() {
        InterfaceC5611b.a.m8806a(this);
    }
}
