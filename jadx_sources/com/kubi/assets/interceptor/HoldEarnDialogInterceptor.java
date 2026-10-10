package com.kubi.assets.interceptor;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.assets.holdearn.HoldEarnOpenDialog;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.utils.extensions.C27041f;
import cy.InterfaceC36555b;
import il.C38661c;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p846zx.InterfaceC46935a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.assets.interceptor.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HoldEarnDialogInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/interceptor/HoldEarnDialogInterceptor;", "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHoldEarnDialogInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoldEarnDialogInterceptor.kt\ncom/kubi/assets/interceptor/HoldEarnDialogInterceptor\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,43:1\n19#2,2:44\n*S KotlinDebug\n*F\n+ 1 HoldEarnDialogInterceptor.kt\ncom/kubi/assets/interceptor/HoldEarnDialogInterceptor\n*L\n29#1:44,2\n*E\n"})
public final class HoldEarnDialogInterceptor extends C38661c {
    /* JADX INFO: renamed from: f */
    public static final Unit m17449f(final InterfaceC46935a interfaceC46935a, final FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final String strM66668h = C27041f.m66668h(interfaceC46935a.getPostcard().getBundle().getString("spm"));
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.assets.interceptor.i
            @Override // java.lang.Runnable
            public final void run() {
                HoldEarnDialogInterceptor.m17450g(strM66668h, it, interfaceC46935a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final void m17450g(String str, FragmentActivity fragmentActivity, final InterfaceC46935a interfaceC46935a) {
        HoldEarnOpenDialog holdEarnOpenDialogM17366D4 = HoldEarnOpenDialog.f17726y0.create(str).m17366D4(new Function1() { // from class: com.kubi.assets.interceptor.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HoldEarnDialogInterceptor.m17451h(interfaceC46935a, ((Boolean) obj).booleanValue());
            }
        });
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        holdEarnOpenDialogM17366D4.show(supportFragmentManager, "HoldEarnOpenDialog");
    }

    @Override // il.C38661c, p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull final InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!AssetsDepend.f18689a.m19189j().c()) {
            return super.mo4304b(chain);
        }
        C42899b.m94073c(new Function1() { // from class: com.kubi.assets.interceptor.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HoldEarnDialogInterceptor.m17449f(chain, (FragmentActivity) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m17451h(InterfaceC46935a interfaceC46935a, boolean z11) {
        int i11;
        InterfaceC36555b interfaceC36555bM4046i = interfaceC46935a.getPostcard().m4046i();
        if (interfaceC36555bM4046i != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = -1;
            }
            interfaceC36555bM4046i.mo4404a(i11, new Intent());
        }
        return Unit.INSTANCE;
    }
}
