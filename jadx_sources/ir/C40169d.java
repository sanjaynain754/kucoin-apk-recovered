package ir;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: ir.d */
/* JADX INFO: compiled from: LinkUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lir/d;", ExifInterface.GPS_DIRECTION_TRUE, "Lir/a;", "Lkotlin/Function0;", "initializer", "", "lock", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/jvm/functions/Function0;", "getInitializer", "()Lkotlin/jvm/functions/Function0;", "b", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "network-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C40169d<T> implements InterfaceC40166a<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function0<T> initializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX WARN: Multi-variable type inference failed */
    public C40169d(@NotNull Function0<? extends T> initializer, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
        this.lock = obj == null ? this : obj;
    }

    @Override // ir.InterfaceC40166a, p852kotlin.properties.ReadOnlyProperty
    public T getValue(@Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return (T) InterfaceC40166a.a.m88524a(this, obj, kProperty);
    }

    @Override // ir.InterfaceC40166a
    public T getValue() {
        T tInvoke;
        synchronized (this.lock) {
            tInvoke = this.initializer.invoke();
        }
        return tInvoke;
    }

    public /* synthetic */ C40169d(Function0 function0, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i11 & 2) != 0 ? null : obj);
    }
}
