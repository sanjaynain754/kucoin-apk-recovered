package com.kubi.kucoin.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.kubi.kucoin.data.platform.IPAddressHelper;
import com.kubi.router.core.Router;
import com.kubi.utils.C27100x0;
import java.util.Iterator;
import o00.C42916f;
import org.jetbrains.annotations.Nullable;
import p764xk.InterfaceC46256d;
import p777xx.C46337a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NetworkChangeReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kucoin/utils/NetworkChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNetworkChangeReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkChangeReceiver.kt\ncom/kubi/kucoin/utils/NetworkChangeReceiver\n+ 2 KuEmitter.kt\ncom/kubi/router/emitter/KuEmitter\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n16#2:30\n2756#3:31\n1#4:32\n*S KotlinDebug\n*F\n+ 1 NetworkChangeReceiver.kt\ncom/kubi/kucoin/utils/NetworkChangeReceiver\n*L\n25#1:30\n25#1:31\n25#1:32\n*E\n"})
public final class NetworkChangeReceiver extends BroadcastReceiver {
    /* JADX INFO: renamed from: c */
    public static final void m33118c() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.kucoin.utils.y0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NetworkChangeReceiver.m33119d();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m33119d() throws Exception {
        IPAddressHelper.f27740a.m32048b();
        return Unit.INSTANCE;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        C42916f.m94127f().scheduleDirect(new Runnable() { // from class: com.kubi.kucoin.utils.x0
            @Override // java.lang.Runnable
            public final void run() {
                NetworkChangeReceiver.m33118c();
            }
        });
        C46337a c46337a = C46337a.f103912a;
        Iterator it = Router.f46192a.m56190l(InterfaceC46256d.class).iterator();
        while (it.hasNext()) {
            ((InterfaceC46256d) it.next()).invoke(Boolean.TRUE);
        }
    }
}
