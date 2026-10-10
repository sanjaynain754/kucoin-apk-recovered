package com.sumsub.sentry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.ArrayIteratorKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.Q0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@SourceDebugExtension({"SMAP\nSentryStackTraceFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentryStackTraceFactory.kt\ncom/sumsub/sentry/SentryStackTraceFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
@InterfaceC44962o
public final class C27891Q0 {

    @NotNull
    public static final C27889P0 Companion = new C27889P0();

    /* JADX INFO: renamed from: c */
    public static final Lazy[] f56967c;

    /* JADX INFO: renamed from: a */
    public final List f56968a;

    /* JADX INFO: renamed from: b */
    public final List f56969b;

    public /* synthetic */ C27891Q0(int i11, List list, List list2) {
        if ((i11 & 1) == 0) {
            this.f56968a = null;
        } else {
            this.f56968a = list;
        }
        if ((i11 & 2) == 0) {
            this.f56969b = null;
        } else {
            this.f56969b = list2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m68977a() {
        return new C41813f(C41897w2.f92051a);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f56967c = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.t1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27891Q0.m68977a();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.u1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27891Q0.m68978b();
            }
        })};
    }

    public C27891Q0() {
        this.f56968a = null;
        this.f56969b = null;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m68978b() {
        return new C41813f(C41897w2.f92051a);
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m68979a(StackTraceElement[] stackTraceElementArr) {
        boolean z11;
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ArrayIteratorKt.iterator(stackTraceElementArr);
        while (it.hasNext()) {
            StackTraceElement stackTraceElement = (StackTraceElement) it.next();
            String className = stackTraceElement.getClassName();
            if (className == null || className.length() == 0) {
                z11 = true;
            } else {
                List list = this.f56969b;
                z11 = false;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (StringsKt.startsWith$default(className, (String) it2.next(), false, 2, (Object) null)) {
                                z11 = true;
                            }
                        }
                    }
                }
                List list2 = this.f56968a;
                if (list2 != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext() && !StringsKt.startsWith$default(className, (String) it3.next(), false, 2, (Object) null)) {
                    }
                }
            }
            String methodName = stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            int lineNumber = stackTraceElement.getLineNumber();
            arrayList.add(new C27879K0(fileName, methodName, className, lineNumber >= 0 ? Integer.valueOf(lineNumber) : null, Boolean.valueOf(z11), Boolean.valueOf(stackTraceElement.isNativeMethod())));
        }
        CollectionsKt.reverse(arrayList);
        return arrayList;
    }
}
