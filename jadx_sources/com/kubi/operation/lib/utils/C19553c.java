package com.kubi.operation.lib.utils;

import com.kubi.utils.C27100x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.operation.lib.utils.c */
/* JADX INFO: compiled from: CountDownHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u001a\b\u0010\u0003\u001a\u00020\u0004H\u0000\"\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u000e"}, m90084d2 = {"countdownJobs", "", "Lkotlinx/coroutines/Job;", "resetAllCountdownJobs", "", "countDownTimeForBonus", "", "getCountDownTimeForBonus", "()J", "setCountDownTimeForBonus", "(J)V", "countDownTimeForWelfare", "getCountDownTimeForWelfare", "setCountDownTimeForWelfare", "OperationLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCountDownHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountDownHelper.kt\ncom/kubi/operation/lib/utils/CountDownHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1563#2:145\n1634#2,3:146\n1869#2,2:149\n*S KotlinDebug\n*F\n+ 1 CountDownHelper.kt\ncom/kubi/operation/lib/utils/CountDownHelperKt\n*L\n123#1:145\n123#1:146,3\n124#1:149,2\n*E\n"})
public final class C19553c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final List<InterfaceC41775x1> f36857a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static long f36858b = -1;

    /* JADX INFO: renamed from: c */
    public static long f36859c = -1;

    /* JADX INFO: renamed from: c */
    public static final long m43655c() {
        return f36858b;
    }

    /* JADX INFO: renamed from: d */
    public static final long m43656d() {
        return f36859c;
    }

    /* JADX INFO: renamed from: e */
    public static final void m43657e() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.utils.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C19553c.m43658f();
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m43658f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("resetAllCountdownJobs: ");
        List<InterfaceC41775x1> list = f36857a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            Boolean boolValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) it.next();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(interfaceC41775x1);
            sb3.append('(');
            if (interfaceC41775x1 != null) {
                boolValueOf = Boolean.valueOf(interfaceC41775x1.isActive());
            }
            sb3.append(boolValueOf);
            sb3.append(')');
            arrayList.add(sb3.toString());
        }
        sb2.append(arrayList);
        C19570t.m43669g(sb2.toString());
        for (InterfaceC41775x1 interfaceC41775x2 : f36857a) {
            if (interfaceC41775x2 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
            }
        }
        f36857a.clear();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final void m43659g(long j11) {
        f36858b = j11;
    }

    /* JADX INFO: renamed from: h */
    public static final void m43660h(long j11) {
        f36859c = j11;
    }
}
