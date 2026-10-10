package jumio.core;

import com.jumio.core.plugins.PluginRegistryInterface;
import com.jumio.sdk.preload.JumioPreloadCallback;
import com.jumio.sdk.preload.JumioPreloader;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.g2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40665g2 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public List f90270a;

    /* JADX INFO: renamed from: b */
    public Object f90271b;

    /* JADX INFO: renamed from: c */
    public Object f90272c;

    /* JADX INFO: renamed from: d */
    public Iterator f90273d;

    /* JADX INFO: renamed from: e */
    public Object f90274e;

    /* JADX INFO: renamed from: f */
    public Object f90275f;

    /* JADX INFO: renamed from: g */
    public int f90276g;

    /* JADX INFO: renamed from: h */
    public int f90277h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f90278i;

    public C40665g2(Continuation continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40665g2 c40665g2 = new C40665g2(continuation);
        c40665g2.f90278i = obj;
        return c40665g2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C40665g2 c40665g2 = new C40665g2((Continuation) obj2);
        c40665g2.f90278i = (InterfaceC41709m0) obj;
        return c40665g2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:29:0x008b->B:47:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r14 == r1) goto L36;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Iterable availablePlugins;
        Iterator it;
        int i11;
        Iterable iterable;
        JumioPreloadCallback jumioPreloadCallback;
        WeakReference weakReference;
        JumioPreloadCallback jumioPreloadCallback2;
        EnumC40613W2 enumC40613W2;
        C40541I c40541i;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f90278i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f90277h;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f90276g;
                it = this.f90273d;
                availablePlugins = (Iterable) this.f90272c;
                iterable = (List) this.f90271b;
                list = this.f90270a;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                enumC40613W2 = (EnumC40613W2) next;
                c40541i = JumioPreloader.cdnModelLoader;
                if (c40541i == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cdnModelLoader");
                    c40541i = null;
                }
                this.f90278i = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.f90270a = list;
                this.f90271b = SpillingKt.nullOutSpilledVariable(iterable);
                this.f90272c = SpillingKt.nullOutSpilledVariable(availablePlugins);
                this.f90273d = it;
                this.f90274e = SpillingKt.nullOutSpilledVariable(next);
                this.f90275f = SpillingKt.nullOutSpilledVariable(enumC40613W2);
                this.f90276g = i11;
                this.f90277h = 2;
                c40541i.getClass();
                if (C41713n0.m91130f(new C40536H(enumC40613W2, list, c40541i, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            weakReference = JumioPreloader.callback;
            if (weakReference != null && (jumioPreloadCallback2 = (JumioPreloadCallback) weakReference.get()) != null) {
                jumioPreloadCallback2.preloadFinished();
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C40541I c40541i2 = JumioPreloader.cdnModelLoader;
        if (c40541i2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cdnModelLoader");
            c40541i2 = null;
        }
        this.f90278i = interfaceC41709m0;
        this.f90277h = 1;
        c40541i2.getClass();
        obj = C41686h.m91049g(C41782z0.m91392b(), new C40526F(c40541i2, null), this);
        list = (List) obj;
        if (list == null) {
            WeakReference weakReference2 = JumioPreloader.callback;
            if (weakReference2 != null && (jumioPreloadCallback = (JumioPreloadCallback) weakReference2.get()) != null) {
                jumioPreloadCallback.preloadFinished();
            }
            return Unit.INSTANCE;
        }
        PluginRegistryInterface pluginRegistryInterface = JumioPreloader.pluginRegistry;
        if (pluginRegistryInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pluginRegistry");
            pluginRegistryInterface = null;
        }
        availablePlugins = pluginRegistryInterface.getAvailablePlugins();
        it = availablePlugins.iterator();
        i11 = 0;
        iterable = availablePlugins;
        while (it.hasNext()) {
            Object next2 = it.next();
            enumC40613W2 = (EnumC40613W2) next2;
            c40541i = JumioPreloader.cdnModelLoader;
            if (c40541i == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cdnModelLoader");
                c40541i = null;
            }
            this.f90278i = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.f90270a = list;
            this.f90271b = SpillingKt.nullOutSpilledVariable(iterable);
            this.f90272c = SpillingKt.nullOutSpilledVariable(availablePlugins);
            this.f90273d = it;
            this.f90274e = SpillingKt.nullOutSpilledVariable(next2);
            this.f90275f = SpillingKt.nullOutSpilledVariable(enumC40613W2);
            this.f90276g = i11;
            this.f90277h = 2;
            c40541i.getClass();
            if (C41713n0.m91130f(new C40536H(enumC40613W2, list, c40541i, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        weakReference = JumioPreloader.callback;
        if (weakReference != null) {
            jumioPreloadCallback2.preloadFinished();
        }
        return Unit.INSTANCE;
    }
}
