package og0;

import androidx.core.internal.view.SupportMenu;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.InterfaceC41693i2;
import og0.AbstractC43081x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: og0.x */
/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004¨\u0006\""}, m90084d2 = {"Log0/x;", ExifInterface.LATITUDE_SOUTH, "Log0/c;", "Lkotlinx/coroutines/i2;", "", "id", "prev", "", "pointers", "<init>", "(JLog0/x;I)V", "", "u", "()Z", "p", "index", "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", CmcdData.Factory.STREAMING_FORMAT_SS, "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "t", "()V", "d", "J", "r", "()I", "numberOfSlots", "k", "isRemoved", "Lkotlinx/atomicfu/AtomicInt;", "cleanedAndPointers", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n1#1,265:1\n248#2,4:266\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n*L\n221#1:266,4\n*E\n"})
public abstract class AbstractC43081x<S extends AbstractC43081x<S>> extends AbstractC43048c<S> implements InterfaceC41693i2 {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f95279e = AtomicIntegerFieldUpdater.newUpdater(AbstractC43081x.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    public final long id;

    /* JADX INFO: renamed from: r */
    public abstract int mo90699r();

    /* JADX INFO: renamed from: s */
    public abstract void mo90700s(int index, @Nullable Throwable cause, @NotNull CoroutineContext context);

    public AbstractC43081x(long j11, @Nullable S s11, int i11) {
        super(s11);
        this.id = j11;
        this.cleanedAndPointers$volatile = i11 << 16;
    }

    @Override // og0.AbstractC43048c
    /* JADX INFO: renamed from: k */
    public boolean mo94555k() {
        if (f95279e.get(this) == mo90699r() && !m94556l()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m94643p() {
        if (f95279e.addAndGet(this, SupportMenu.CATEGORY_MASK) == mo90699r() && !m94556l()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m94644t() {
        if (f95279e.incrementAndGet(this) == mo90699r()) {
            m94558n();
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m94645u() {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f95279e;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 == mo90699r() && !m94556l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 65536 + i11));
        return true;
    }
}
