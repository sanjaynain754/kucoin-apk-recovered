package p236em;

import com.kubi.kumex.utils.Log;
import com.kubi.network.retrofit.utils.C19331c;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: em.a */
/* JADX INFO: compiled from: CoroutineException.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u000b"}, m90084d2 = {"NetworkToastOfException", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getNetworkToastOfException", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "LogOfException", "getLogOfException", "CategoryOfException", "source", "", "ignore", "", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoroutineException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineException.kt\ncom/kubi/kumex/exception/CoroutineExceptionKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,36:1\n47#2,4:37\n47#2,4:41\n47#2,4:45\n*S KotlinDebug\n*F\n+ 1 CoroutineException.kt\ncom/kubi/kumex/exception/CoroutineExceptionKt\n*L\n33#1:37,4\n18#1:41,4\n25#1:45,4\n*E\n"})
public final class C37213a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CoroutineExceptionHandler f82531a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final CoroutineExceptionHandler f82532b;

    /* JADX INFO: renamed from: em.a$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineException.kt\ncom/kubi/kumex/exception/CoroutineExceptionKt\n*L\n1#1,49:1\n34#2,3:50\n*E\n"})
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f82533b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f82534c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Companion companion, String str, boolean z11) {
            super(companion);
            this.f82533b = str;
            this.f82534c = z11;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (exception instanceof CancellationException) {
                return;
            }
            C37214b.m83256b(exception, this.f82533b, this.f82534c);
        }
    }

    /* JADX INFO: renamed from: em.a$c */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineException.kt\ncom/kubi/kumex/exception/CoroutineExceptionKt\n*L\n1#1,49:1\n26#2,2:50\n*E\n"})
    public static final class c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            Log.f30813a.m36616b("LogOfException", exception);
        }

        public c(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: em.a$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CoroutineException.kt\ncom/kubi/kumex/exception/CoroutineExceptionKt\n*L\n1#1,49:1\n19#2,2:50\n*E\n"})
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C19331c.m42836c(exception, null, 2, null);
        }

        public b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    static {
        CoroutineExceptionHandler.Companion companion = CoroutineExceptionHandler.INSTANCE;
        f82531a = new b(companion);
        f82532b = new c(companion);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CoroutineExceptionHandler m83251a(@NotNull String source, boolean z11) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new a(CoroutineExceptionHandler.INSTANCE, source, z11);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ CoroutineExceptionHandler m83252b(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return m83251a(str, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final CoroutineExceptionHandler m83253c() {
        return f82532b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final CoroutineExceptionHandler m83254d() {
        return f82531a;
    }
}
