package com.kubi.sdk.util;

import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.base.p113ui.InterfaceC23686g;
import io.reactivex.functions.Consumer;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.sdk.util.c1 */
/* JADX INFO: compiled from: SimpleThrowableConsumer.java */
/* JADX INFO: loaded from: classes12.dex */
public class C24223c1 implements Consumer<Throwable> {

    /* JADX INFO: renamed from: b */
    public InterfaceC23686g f48152b;

    /* JADX INFO: renamed from: c */
    public boolean f48153c;

    public C24223c1(InterfaceC23686g interfaceC23686g) {
        this.f48153c = true;
        this.f48152b = interfaceC23686g;
    }

    @Override // io.reactivex.functions.Consumer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th2) {
        InterfaceC23686g interfaceC23686g = this.f48152b;
        if (interfaceC23686g != null) {
            interfaceC23686g.hideDialogLoading();
        }
        if (this.f48153c) {
            C19331c c19331c = C19331c.f35969a;
            C19331c.m42835b(th2, new Function1() { // from class: com.kubi.sdk.util.b1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C24223c1.m58398a(this.f48150b, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m58398a(C24223c1 c24223c1, String str) {
        c24223c1.mo32077c();
        c24223c1.m58399d(str);
        return null;
    }

    public C24223c1(InterfaceC23686g interfaceC23686g, boolean z11) {
        this.f48152b = interfaceC23686g;
        this.f48153c = z11;
    }

    /* JADX INFO: renamed from: c */
    public void mo32077c() {
    }

    /* JADX INFO: renamed from: d */
    public void m58399d(String str) {
    }
}
