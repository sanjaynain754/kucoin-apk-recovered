package p477nt;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Observer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nt.i */
/* JADX INFO: compiled from: Event.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/payment/base/EventObserver;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/Observer;", "Lcom/kubi/payment/base/Event;", "onEventUnhandledContent", "Lkotlin/Function1;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "onChanged", "value", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42876i<T> implements Observer<C42875h<? extends T>> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function1<T, Unit> f94947b;

    /* JADX WARN: Multi-variable type inference failed */
    public C42876i(@NotNull Function1<? super T, Unit> onEventUnhandledContent) {
        Intrinsics.checkNotNullParameter(onEventUnhandledContent, "onEventUnhandledContent");
        this.f94947b = onEventUnhandledContent;
    }

    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onChanged(@NotNull C42875h<? extends T> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        T tM94037a = value.m94037a();
        if (tM94037a != null) {
            this.f94947b.invoke(tM94037a);
        }
    }
}
