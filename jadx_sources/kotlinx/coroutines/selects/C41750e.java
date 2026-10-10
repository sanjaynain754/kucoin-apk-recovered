package kotlinx.coroutines.selects;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.e */
/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012U\u0010\f\u001aQ\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000b\u0012w\b\u0002\u0010\u0011\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017Ri\u0010\f\u001aQ\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0089\u0001\u0010\u0011\u001aq\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0014\u0010\u001bRi\u0010\u001e\u001aQ\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004j\u0002`\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001f"}, m90084d2 = {"Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/selects/d;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/selects/i;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "b", "Lkotlin/jvm/functions/Function3;", "c", "()Lkotlin/jvm/functions/Function3;", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41750e implements InterfaceC41749d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Object clauseObject;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function3<Object, InterfaceC41754i<?>, Object, Unit> regFunc;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Function3<InterfaceC41754i<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> onCancellationConstructor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function3<Object, Object, Object, Object> processResFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public C41750e(@NotNull Object obj, @NotNull Function3<Object, ? super InterfaceC41754i<?>, Object, Unit> function3, @Nullable Function3<? super InterfaceC41754i<?>, Object, Object, ? extends Function3<? super Throwable, Object, ? super CoroutineContext, Unit>> function4) {
        this.clauseObject = obj;
        this.regFunc = function3;
        this.onCancellationConstructor = function4;
        this.processResFunc = C41755j.f91845a;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC41753h
    @Nullable
    /* JADX INFO: renamed from: a */
    public Function3<InterfaceC41754i<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> mo91299a() {
        return this.onCancellationConstructor;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC41753h
    @NotNull
    /* JADX INFO: renamed from: b */
    public Function3<Object, Object, Object, Object> mo91300b() {
        return this.processResFunc;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC41753h
    @NotNull
    /* JADX INFO: renamed from: c */
    public Function3<Object, InterfaceC41754i<?>, Object, Unit> mo91301c() {
        return this.regFunc;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC41753h
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public Object getClauseObject() {
        return this.clauseObject;
    }

    public /* synthetic */ C41750e(Object obj, Function3 function3, Function3 function4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function3, (i11 & 4) != 0 ? null : function4);
    }
}
