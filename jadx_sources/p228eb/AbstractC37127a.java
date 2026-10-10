package p228eb;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.channels.C41568g;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002a0.C0006b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: eb.a */
/* JADX INFO: compiled from: BaseMviViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u00020\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0015\u001a\u00020\u00162\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0018¢\u0006\u0002\b\u0019H\u0004J\u0016\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00028\u0002H\u0084@¢\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/mvi/BaseMviViewModel;", "I", "", ExifInterface.LATITUDE_SOUTH, ExifInterface.LONGITUDE_EAST, "Landroidx/lifecycle/ViewModel;", "initialState", "<init>", "(Ljava/lang/Object;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_effect", "Lkotlinx/coroutines/channels/Channel;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;", "reduce", "", "reducer", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "sendEffect", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatch", "intent", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseMviViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMviViewModel.kt\ncom/kubi/assets/mvi/BaseMviViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,39:1\n230#2,5:40\n*S KotlinDebug\n*F\n+ 1 BaseMviViewModel.kt\ncom/kubi/assets/mvi/BaseMviViewModel\n*L\n31#1:40,5\n*E\n"})
public abstract class AbstractC37127a<I, S, E> extends ViewModel {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC41669n<S> f82400V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC41678w<S> f82401W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC41565d<E> f82402X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC41634e<E> f82403Y;

    public AbstractC37127a(@NotNull S initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        InterfaceC41669n<S> interfaceC41669nM91009a = C41679x.m91009a(initialState);
        this.f82400V = interfaceC41669nM91009a;
        this.f82401W = interfaceC41669nM91009a;
        InterfaceC41565d<E> interfaceC41565dM90691b = C41568g.m90691b(0, null, null, 7, null);
        this.f82402X = interfaceC41565dM90691b;
        this.f82403Y = C41636g.m90900X(interfaceC41565dM90691b);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final InterfaceC41634e<E> m83042n() {
        return this.f82403Y;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final InterfaceC41678w<S> m83043o() {
        return this.f82401W;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: p */
    public final void m83044p(@NotNull Function1<? super S, ? extends S> reducer) {
        C0006b c0006b;
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        InterfaceC41669n<S> interfaceC41669n = this.f82400V;
        do {
            c0006b = (Object) interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(c0006b, reducer.invoke(c0006b)));
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final Object m83045q(@NotNull E e11, @NotNull Continuation<? super Unit> continuation) {
        Object objSend = this.f82402X.send(e11, continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }
}
