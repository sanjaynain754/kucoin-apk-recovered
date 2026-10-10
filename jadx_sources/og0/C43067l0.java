package og0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import og0.InterfaceC43069m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: og0.l0 */
/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0010H\u0082\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0010H\u0082\u0010¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR$\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00108F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0018R\u0011\u0010'\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004¨\u0006*"}, m90084d2 = {"Log0/l0;", "Log0/m0;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "f", "()Log0/m0;", "j", "node", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Log0/m0;)Z", "b", "", "index", "i", "(I)Log0/m0;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Log0/m0;)V", "m", "(I)V", CmcdData.Factory.STREAM_TYPE_LIVE, "", "g", "()[Log0/m0;", "n", "(II)V", "[Log0/m0;", "value", "c", "()I", "k", "size", "e", "()Z", "isEmpty", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n29#2:160\n29#2:162\n29#2:164\n29#2:166\n29#2:168\n29#2:170\n29#2:172\n16#3:161\n16#3:163\n16#3:165\n16#3:167\n16#3:169\n16#3:171\n16#3:173\n1#4:174\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n33#1:160\n41#1:162\n43#1:164\n51#1:166\n60#1:168\n63#1:170\n72#1:172\n33#1:161\n41#1:163\n43#1:165\n51#1:167\n60#1:169\n63#1:171\n72#1:173\n*E\n"})
public class C43067l0<T extends InterfaceC43069m0 & Comparable<? super T>> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f95264b = AtomicIntegerFieldUpdater.newUpdater(C43067l0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    @Nullable
    public T[] a;

    @Nullable
    /* JADX INFO: renamed from: f */
    public final T m94614f() {
        T t11;
        synchronized (this) {
            t11 = (T) m94611b();
        }
        return t11;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m94616h(@NotNull T node) {
        boolean z11;
        synchronized (this) {
            if (node.mo91037a() == null) {
                z11 = false;
            } else {
                m94617i(node.getIndex());
                z11 = true;
            }
        }
        return z11;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final T m94618j() {
        T t11;
        synchronized (this) {
            t11 = m94612c() > 0 ? (T) m94617i(0) : null;
        }
        return t11;
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: b */
    public final T m94611b() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final T[] m94615g() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new InterfaceC43069m0[4];
            this.a = tArr2;
            return tArr2;
        }
        if (m94612c() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, m94612c() * 2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((InterfaceC43069m0[]) objArrCopyOf);
        this.a = tArr3;
        return tArr3;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: i */
    public final T m94617i(int index) {
        T[] tArr = this.a;
        Intrinsics.checkNotNull(tArr);
        m94619k(m94612c() - 1);
        if (index < m94612c()) {
            m94622n(index, m94612c());
            int i11 = (index - 1) / 2;
            if (index > 0) {
                T t11 = tArr[index];
                Intrinsics.checkNotNull(t11);
                T t12 = tArr[i11];
                Intrinsics.checkNotNull(t12);
                if (((Comparable) t11).compareTo(t12) < 0) {
                    m94622n(index, i11);
                    m94621m(i11);
                } else {
                    m94620l(index);
                }
            } else {
                m94620l(index);
            }
        }
        T t13 = tArr[m94612c()];
        Intrinsics.checkNotNull(t13);
        t13.mo91038c(null);
        t13.mo91039d(-1);
        tArr[m94612c()] = null;
        return t13;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX INFO: renamed from: l */
    public final void m94620l(int i11) {
        while (true) {
            int i12 = i11 * 2;
            int i13 = i12 + 1;
            if (i13 >= m94612c()) {
                return;
            }
            T[] tArr = this.a;
            Intrinsics.checkNotNull(tArr);
            int i14 = i12 + 2;
            if (i14 < m94612c()) {
                T t11 = tArr[i14];
                Intrinsics.checkNotNull(t11);
                T t12 = tArr[i13];
                Intrinsics.checkNotNull(t12);
                if (((Comparable) t11).compareTo(t12) >= 0) {
                    i14 = i13;
                }
            } else {
                i14 = i13;
            }
            T t13 = tArr[i11];
            Intrinsics.checkNotNull(t13);
            T t14 = tArr[i14];
            Intrinsics.checkNotNull(t14);
            if (((Comparable) t13).compareTo(t14) <= 0) {
                return;
            }
            m94622n(i11, i14);
            i11 = i14;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m94621m(int i11) {
        while (i11 > 0) {
            T[] tArr = this.a;
            Intrinsics.checkNotNull(tArr);
            int i12 = (i11 - 1) / 2;
            T t11 = tArr[i12];
            Intrinsics.checkNotNull(t11);
            T t12 = tArr[i11];
            Intrinsics.checkNotNull(t12);
            if (((Comparable) t11).compareTo(t12) <= 0) {
                return;
            }
            m94622n(i11, i12);
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m94622n(int i11, int j11) {
        T[] tArr = this.a;
        Intrinsics.checkNotNull(tArr);
        T t11 = tArr[j11];
        Intrinsics.checkNotNull(t11);
        T t12 = tArr[i11];
        Intrinsics.checkNotNull(t12);
        tArr[i11] = t11;
        tArr[j11] = t12;
        t11.mo91039d(i11);
        t12.mo91039d(j11);
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final void m94610a(@NotNull T node) {
        node.mo91038c(this);
        InterfaceC43069m0[] interfaceC43069m0ArrM94615g = m94615g();
        int iM94612c = m94612c();
        m94619k(iM94612c + 1);
        interfaceC43069m0ArrM94615g[iM94612c] = node;
        node.mo91039d(iM94612c);
        m94621m(iM94612c);
    }

    /* JADX INFO: renamed from: c */
    public final int m94612c() {
        return f95264b.get(this);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m94613e() {
        if (m94612c() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m94619k(int i11) {
        f95264b.set(this, i11);
    }
}
