package og0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.C41701k0;
import kotlinx.coroutines.internal.UndeliveredElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.ExceptionsKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: og0.t */
/* JADX INFO: compiled from: OnUndeliveredElement.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f**\b\u0000\u0010\r\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u000e"}, m90084d2 = {ExifInterface.LONGITUDE_EAST, "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "undeliveredElementException", "b", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;", "Lkotlin/coroutines/CoroutineContext;", "context", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "OnUndeliveredElement", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C43077t {
    /* JADX INFO: renamed from: a */
    public static final <E> void m94636a(@NotNull Function1<? super E, Unit> function1, E e11, @NotNull CoroutineContext coroutineContext) {
        UndeliveredElementException undeliveredElementExceptionM94637b = m94637b(function1, e11, null);
        if (undeliveredElementExceptionM94637b != null) {
            C41701k0.m91111a(coroutineContext, undeliveredElementExceptionM94637b);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ UndeliveredElementException m94638c(Function1 function1, Object obj, UndeliveredElementException undeliveredElementException, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            undeliveredElementException = null;
        }
        return m94637b(function1, obj, undeliveredElementException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <E> UndeliveredElementException m94637b(@NotNull Function1<? super E, Unit> function1, E e11, @Nullable UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(e11);
            return undeliveredElementException;
        } catch (Throwable th2) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th2) {
                ExceptionsKt.addSuppressed(undeliveredElementException, th2);
                return undeliveredElementException;
            }
            return new UndeliveredElementException("Exception in undelivered element handler for " + e11, th2);
        }
    }
}
