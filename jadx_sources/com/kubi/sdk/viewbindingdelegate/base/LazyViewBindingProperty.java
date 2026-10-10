package com.kubi.sdk.viewbindingdelegate.base;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.viewbinding.ViewBinding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: compiled from: ViewBindingProperty.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B/\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bB\u001d\b\u0016\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\n\u0010\fJ&\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u00002\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0097\u0002¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u00068\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u0012\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/viewbindingdelegate/base/LazyViewBindingProperty;", "", "R", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/sdk/viewbindingdelegate/base/a;", "Lkotlin/Function1;", "", "onViewDestroyed", "viewBinder", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function1;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/jvm/functions/Function1;", "b", "getViewBinder", "()Lkotlin/jvm/functions/Function1;", "c", "Ljava/lang/Object;", "getViewBinding", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "viewBinding", "sdk_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class LazyViewBindingProperty<R, T extends ViewBinding> implements InterfaceC24293a<R, T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<T, Unit> onViewDestroyed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<R, T> viewBinder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Object viewBinding;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyViewBindingProperty(@NotNull Function1<? super T, Unit> onViewDestroyed, @NotNull Function1<? super R, ? extends T> viewBinder) {
        Intrinsics.checkNotNullParameter(onViewDestroyed, "onViewDestroyed");
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.onViewDestroyed = onViewDestroyed;
        this.viewBinder = viewBinder;
    }

    /* JADX INFO: renamed from: a */
    public final void m58547a(@Nullable Object obj) {
        this.viewBinding = obj;
    }

    @Override // com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a
    @MainThread
    @Nullable
    public T getValue(@NotNull R thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj = this.viewBinding;
        T t11 = obj instanceof ViewBinding ? (T) obj : null;
        if (t11 != null) {
            return t11;
        }
        T tInvoke = this.viewBinder.invoke(thisRef);
        m58547a(tInvoke);
        return tInvoke;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LazyViewBindingProperty(@NotNull Function1<? super R, ? extends T> viewBinder) {
        this(new Function1<T, Unit>() { // from class: com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty.1
            public final void invoke(@NotNull T it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((ViewBinding) obj);
                return Unit.INSTANCE;
            }
        }, viewBinder);
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
    }
}
