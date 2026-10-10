package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41729r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoroutineAdapter.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/r0;", "", "tag", "Lcom/google/common/util/concurrent/ListenableFuture;", "asListenableFuture", "(Lkotlinx/coroutines/r0;Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;", "ads-adservices-java_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class CoroutineAdapterKt {
    @NotNull
    public static final <T> ListenableFuture<T> asListenableFuture(@NotNull final InterfaceC41729r0<? extends T> interfaceC41729r0, @Nullable final Object obj) {
        Intrinsics.checkNotNullParameter(interfaceC41729r0, "<this>");
        ListenableFuture<T> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.privacysandbox.ads.adservices.java.internal.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return CoroutineAdapterKt.asListenableFuture$lambda$0(interfaceC41729r0, obj, completer);
            }
        });
        Intrinsics.checkNotNullExpressionValue(future, "getFuture { completer ->…      }\n        tag\n    }");
        return future;
    }

    public static /* synthetic */ ListenableFuture asListenableFuture$default(InterfaceC41729r0 interfaceC41729r0, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return asListenableFuture(interfaceC41729r0, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object asListenableFuture$lambda$0(final InterfaceC41729r0 this_asListenableFuture, Object obj, final CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.mo90426j(new Function1<Throwable, Unit>() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                if (th2 == null) {
                    completer.set((T) this_asListenableFuture.mo91197b());
                } else if (th2 instanceof CancellationException) {
                    completer.setCancelled();
                } else {
                    completer.setException(th2);
                }
            }
        });
        return obj;
    }
}
