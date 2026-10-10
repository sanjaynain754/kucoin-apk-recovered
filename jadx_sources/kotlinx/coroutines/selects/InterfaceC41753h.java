package kotlinx.coroutines.selects;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.h */
/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001R\u0014\u0010\u0004\u001a\u00020\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003Rc\u0010\u000f\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005j\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eRc\u0010\u0013\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005j\u0002`\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0083\u0001\u0010\u0019\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0014\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\u0005\u0018\u00010\u0005j\u0004\u0018\u0001`\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000e\u0082\u0001\u0002\u001a\u001b¨\u0006\u001c"}, m90084d2 = {"Lkotlinx/coroutines/selects/h;", "", "d", "()Ljava/lang/Object;", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/selects/i;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "c", "()Lkotlin/jvm/functions/Function3;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "b", "processResFunc", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "onCancellationConstructor", "Lkotlinx/coroutines/selects/d;", "Lkotlinx/coroutines/selects/f;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC41753h {
    @Nullable
    /* JADX INFO: renamed from: a */
    Function3<InterfaceC41754i<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> mo91299a();

    @NotNull
    /* JADX INFO: renamed from: b */
    Function3<Object, Object, Object, Object> mo91300b();

    @NotNull
    /* JADX INFO: renamed from: c */
    Function3<Object, InterfaceC41754i<?>, Object, Unit> mo91301c();

    @NotNull
    /* JADX INFO: renamed from: d */
    Object mo91302d();
}
