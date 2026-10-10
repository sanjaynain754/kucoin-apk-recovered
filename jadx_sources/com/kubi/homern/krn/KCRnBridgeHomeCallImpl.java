package com.kubi.homern.krn;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36574i;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCRnBridgeHomeCallImpl.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/homern/krn/KCRnBridgeHomeCallImpl;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiHomeModule;", "<init>", "()V", "launchLiteMainActivity", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCRnBridgeHomeCallImpl implements InterfaceC36574i {
    /* JADX INFO: renamed from: d */
    public static final Unit m31246d(Function2 function2, FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(it), null, null, new KCRnBridgeHomeCallImpl$launchLiteMainActivity$1$1(function2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m31247e(Function2 function2) {
        function2.invoke(Boolean.FALSE, null);
        return Unit.INSTANCE;
    }

    @Override // d00.InterfaceC36574i
    /* JADX INFO: renamed from: a */
    public void mo31248a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42899b.m94074d(new Function1() { // from class: com.kubi.homern.krn.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return KCRnBridgeHomeCallImpl.m31246d(callback, (FragmentActivity) obj2);
            }
        }, new Function0() { // from class: com.kubi.homern.krn.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KCRnBridgeHomeCallImpl.m31247e(callback);
            }
        });
    }
}
