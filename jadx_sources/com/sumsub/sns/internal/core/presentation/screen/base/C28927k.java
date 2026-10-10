package com.sumsub.sns.internal.core.presentation.screen.base;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28954k;
import com.sumsub.sns.internal.core.presentation.screen.navigation.InterfaceC28952i;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.base.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28927k {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty[] f58814c = {AbstractC28639a.m69485a(C28927k.class, "screens", "getScreens()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: a */
    public final C28936t f58815a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41678w f58816b;

    /* JADX INFO: renamed from: a */
    public final List m69692a() {
        C28936t c28936t = this.f58815a;
        KProperty kProperty = f58814c[0];
        return (List) c28936t.m69705a();
    }

    /* JADX INFO: renamed from: b */
    public final void m69697b(final InterfaceC28952i interfaceC28952i) {
        m69695a(new Function1() { // from class: com.sumsub.sns.internal.core.presentation.screen.base.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28927k.m69690b(interfaceC28952i, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final List m69689a(List list) {
        return CollectionsKt.dropLast(list, 1);
    }

    /* JADX INFO: renamed from: b */
    public static final List m69690b(Parcelable parcelable, List list) {
        return CollectionsKt.plus((Collection<? extends Parcelable>) list, parcelable);
    }

    public C28927k(SavedStateHandle savedStateHandle) {
        this.f58815a = new C28936t(savedStateHandle, "screenStack", CollectionsKt.emptyList(), false);
        this.f58816b = savedStateHandle.getStateFlow("screenStack", CollectionsKt.emptyList());
    }

    /* JADX INFO: renamed from: c */
    public static final List m69691c(Parcelable parcelable, List list) {
        if (list.isEmpty()) {
            return CollectionsKt.listOf(parcelable);
        }
        return CollectionsKt.plus((Collection<? extends Parcelable>) CollectionsKt.dropLast(list, 1), parcelable);
    }

    /* JADX INFO: renamed from: a */
    public final void m69693a(final InterfaceC28952i interfaceC28952i) {
        m69695a(new Function1() { // from class: com.sumsub.sns.internal.core.presentation.screen.base.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28927k.m69688a(interfaceC28952i, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m69696b() {
        if (((Parcelable) CollectionsKt.lastOrNull(m69692a())) == null) {
            return;
        }
        m69695a(new Function1() { // from class: com.sumsub.sns.internal.core.presentation.screen.base.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28927k.m69689a((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final List m69688a(Parcelable parcelable, List list) {
        int iIndexOf = list.indexOf(parcelable);
        return iIndexOf == -1 ? CollectionsKt.listOf(parcelable) : CollectionsKt.take(list, iIndexOf + 1);
    }

    /* JADX INFO: renamed from: a */
    public final void m69694a(final C28954k c28954k) {
        m69695a(new Function1() { // from class: com.sumsub.sns.internal.core.presentation.screen.base.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28927k.m69691c(c28954k, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m69695a(Function1 function1) {
        List list = (List) function1.invoke(m69692a());
        C28936t c28936t = this.f58815a;
        KProperty kProperty = f58814c[0];
        c28936t.f58834a.set(c28936t.f58835b, list);
    }
}
