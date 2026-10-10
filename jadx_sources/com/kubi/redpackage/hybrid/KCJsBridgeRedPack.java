package com.kubi.redpackage.hybrid;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.redpackage.utils.RedPkgCategory;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36585t;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p481ny.C42899b;
import p845zv.C46928a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJsBridgeRedPack.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016JH\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/redpackage/hybrid/KCJsBridgeRedPack;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiRedpacketModule;", "<init>", "()V", "checkRedpacketCodeValid", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "source", "", "redpacketCode", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "requestRedpacketInfoByCode", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCJsBridgeRedPack implements InterfaceC36585t {
    /* JADX INFO: renamed from: d */
    public static final Unit m53750d(String str, Function2 function2, FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(it), null, null, new KCJsBridgeRedPack$requestRedpacketInfoByCode$1$1(str, function2, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // d00.InterfaceC36585t
    /* JADX INFO: renamed from: a */
    public void mo53751a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String redpacketCode, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) throws JSONException {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(redpacketCode, "redpacketCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        boolean zM66664d = C27041f.m66664d(redpacketCode);
        callback.invoke(Boolean.valueOf(zM66664d), null);
        if (zM66664d) {
            return;
        }
        C46928a.m103398d(RedPkgCategory.RECEIVE_CODE_CHECK, false, null, null, 7, null);
    }

    @Override // d00.InterfaceC36585t
    /* JADX INFO: renamed from: b */
    public void mo53752b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull final String redpacketCode, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(redpacketCode, "redpacketCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42899b.m94073c(new Function1() { // from class: com.kubi.redpackage.hybrid.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return KCJsBridgeRedPack.m53750d(redpacketCode, callback, (FragmentActivity) obj2);
            }
        });
    }
}
