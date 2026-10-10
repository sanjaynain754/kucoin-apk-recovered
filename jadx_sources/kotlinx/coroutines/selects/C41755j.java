package kotlinx.coroutines.selects;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.InterfaceC41708m;
import og0.C43045a0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.j */
/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aj\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00010\u00002O\u0010\u000b\u001aK\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"c\u0010\u0019\u001aQ\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002j\u0002`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c\"\u0014\u0010!\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001c\"\u0014\u0010#\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001c\"\u001a\u0010'\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010&*¢\u0001\b\u0007\u0010*\"M\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030(¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u00022M\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030(¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u0002*¢\u0001\b\u0007\u0010+\"M\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00022M\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002*Ú\u0001\b\u0007\u0010-\"i\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030(¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(,\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00020\u00022i\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030(¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b()\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(,\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00020\u0002¨\u0006."}, m90084d2 = {"Lkotlinx/coroutines/m;", "", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "", "value", "Lkotlin/coroutines/CoroutineContext;", "context", "onCancellation", "", "j", "(Lkotlinx/coroutines/m;Lkotlin/jvm/functions/Function3;)Z", "", "trySelectInternalResult", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "clauseObject", "param", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "Lkotlin/jvm/functions/Function3;", "DUMMY_PROCESS_RESULT_FUNCTION", "Log0/a0;", "b", "Log0/a0;", "STATE_REG", "c", "STATE_COMPLETED", "d", "STATE_CANCELLED", "e", "NO_RESULT", "f", "i", "()Log0/a0;", "PARAM_CLAUSE_0", "Lkotlinx/coroutines/selects/i;", "select", "RegistrationFunction", "ProcessResultFunction", "internalResult", "OnCancellationConstructor", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41755j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Function3<Object, Object, Object, Object> f91845a = a.f91851b;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C43045a0 f91846b = new C43045a0("STATE_REG");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C43045a0 f91847c = new C43045a0("STATE_COMPLETED");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final C43045a0 f91848d = new C43045a0("STATE_CANCELLED");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final C43045a0 f91849e = new C43045a0("NO_RESULT");

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final C43045a0 f91850f = new C43045a0("PARAM_CLAUSE_0");

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.j$a */
    /* JADX INFO: compiled from: Select.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class a implements Function3 {

        /* JADX INFO: renamed from: b */
        public static final a f91851b = new a();

        @Override // p852kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final TrySelectDetailedResult m91303a(int i11) {
        if (i11 == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i11 == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i11 == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i11 == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i11).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final C43045a0 m91311i() {
        return f91850f;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m91312j(InterfaceC41708m<? super Unit> interfaceC41708m, Function3<? super Throwable, Object, ? super CoroutineContext, Unit> function3) {
        Object objMo91115G = interfaceC41708m.mo91115G(Unit.INSTANCE, null, function3);
        if (objMo91115G == null) {
            return false;
        }
        interfaceC41708m.mo91118s(objMo91115G);
        return true;
    }
}
