package com.sumsub.sns.internal.core.presentation.android;

import androidx.lifecycle.SavedStateHandle;
import com.sumsub.sns.internal.core.presentation.common.InterfaceC28773g;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28651g implements InterfaceC28773g {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty[] f58282c = {AbstractC28639a.m69485a(C28651g.class, "_state", "get_state()Lcom/sumsub/sns/internal/core/presentation/android/PermissionController$State;", 0)};

    /* JADX INFO: renamed from: a */
    public final C28936t f58283a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41678w f58284b;

    /* JADX INFO: renamed from: a */
    public final void m69487a(InterfaceC28649f interfaceC28649f) {
        C28936t c28936t = this.f58283a;
        KProperty kProperty = f58282c[0];
        c28936t.f58834a.set(c28936t.f58835b, interfaceC28649f);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.InterfaceC28773g
    public final InterfaceC41678w getState() {
        return this.f58284b;
    }

    public C28651g(SavedStateHandle savedStateHandle) {
        C28936t c28936t = new C28936t(savedStateHandle, "PERMISSION_CONTROLLER_STATE", C28647e.f58280a, false);
        this.f58283a = c28936t;
        KProperty kProperty = f58282c[0];
        this.f58284b = savedStateHandle.getStateFlow("PERMISSION_CONTROLLER_STATE", (InterfaceC28649f) c28936t.m69705a());
    }

    /* JADX INFO: renamed from: a */
    public final void m69488a(Set set, boolean z11) {
        C28936t c28936t = this.f58283a;
        KProperty kProperty = f58282c[0];
        InterfaceC28649f interfaceC28649f = (InterfaceC28649f) c28936t.m69705a();
        C28643c c28643c = interfaceC28649f instanceof C28643c ? (C28643c) interfaceC28649f : null;
        if (c28643c == null) {
            return;
        }
        C28643c c28643cM69486a = C28643c.m69486a(c28643c, set, !Intrinsics.areEqual(c28643c.f58276a, set), c28643c.f58279d + 1, 2);
        if (z11) {
            c28643cM69486a = C28643c.m69486a(c28643cM69486a, null, false, 0, 13);
        }
        m69487a(c28643cM69486a);
    }
}
