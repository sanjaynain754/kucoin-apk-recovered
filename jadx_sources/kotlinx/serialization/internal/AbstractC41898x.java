package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: kotlinx.serialization.internal.x */
/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00028\u0001H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r*\u00028\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lkotlinx/serialization/internal/x;", ExifInterface.LONGITUDE_EAST, "", "C", "B", "Lkotlinx/serialization/internal/w;", "Ltg0/d;", "element", "<init>", "(Ltg0/d;)V", "", "p", "(Ljava/util/Collection;)I", "", "o", "(Ljava/util/Collection;)Ljava/util/Iterator;", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@PublishedApi
public abstract class AbstractC41898x<E, C extends Collection<? extends E>, B> extends AbstractC41894w<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC41898x(@NotNull InterfaceC44951d<E> element) {
        super(element, null);
        Intrinsics.checkNotNullParameter(element, "element");
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator<E> mo91426d(@NotNull C c11) {
        Intrinsics.checkNotNullParameter(c11, "<this>");
        return c11.iterator();
    }

    @Override // kotlinx.serialization.internal.AbstractC41788a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int mo91427e(@NotNull C c11) {
        Intrinsics.checkNotNullParameter(c11, "<this>");
        return c11.size();
    }
}
