package com.kubi.quotefacade.knb;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import b00.InterfaceC4410a;
import com.google.firebase.messaging.Constants;
import com.kubi.mvi.common.MviExKt;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$string;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: KCFlutterBridgeAlertCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016J$\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/quotefacade/knb/KCFlutterBridgeAlertCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAlertCall;", "<init>", "()V", "alertContent", "", "ctx", "Landroid/content/Context;", "content", "", "", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "showEmotionDetailDialog", "map", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCFlutterBridgeAlertCallImpl implements InterfaceC4410a {
    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final Unit m52193f(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4((String) objectRef.element).m54156M4((CharSequence) objectRef2.element).m54169Z4(true).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.quotefacade.knb.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                KCFlutterBridgeAlertCallImpl.m52194g(dialogInterface, i11);
            }
        });
        if (!Intrinsics.areEqual(objectRef3.element, "")) {
            alertDialogFragmentHelperM54162S4.m54166W4(112, 112);
            String str = (String) objectRef3.element;
            int iHashCode = str.hashCode();
            if (iHashCode != -1867169789) {
                if (iHashCode != 96784904) {
                    if (iHashCode == 1124446108 && str.equals("warning")) {
                        alertDialogFragmentHelperM54162S4.m54165V4(R$drawable.ic2_common_warning);
                    } else {
                        Unit unit = Unit.INSTANCE;
                    }
                } else if (str.equals(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                    alertDialogFragmentHelperM54162S4.m54165V4(R$drawable.ic2_common_error);
                } else {
                    Unit unit2 = Unit.INSTANCE;
                }
            } else if (str.equals("success")) {
                alertDialogFragmentHelperM54162S4.m54165V4(R$drawable.ic2_common_success);
            } else {
                Unit unit3 = Unit.INSTANCE;
            }
        }
        FragmentManager supportFragmentManager = it.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(supportFragmentManager, "AlertDialog");
        return Unit.INSTANCE;
    }

    @Override // b00.InterfaceC4410a
    /* JADX INFO: renamed from: a */
    public void mo4082a(@NotNull Context ctx, @NotNull Map<String, ? extends Object> content, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCFlutterBridgeAlertCallImpl$alertContent$1(this, ctx, content, null));
        callback.invoke(null, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    public final void m52195e(Context context, Map<String, ? extends Object> map) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "";
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = "";
        ?? r11 = map.get("title");
        if (r11 != 0 && (r11 instanceof String)) {
            objectRef.element = r11;
        }
        ?? r12 = map.get("content");
        if (r12 != 0 && (r12 instanceof String)) {
            objectRef2.element = r12;
        }
        ?? r13 = map.get("statusImgRes");
        if (r13 != 0 && (r13 instanceof String)) {
            objectRef3.element = r13;
        }
        C42899b.m94073c(new Function1() { // from class: com.kubi.quotefacade.knb.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCFlutterBridgeAlertCallImpl.m52193f(objectRef, objectRef2, objectRef3, (FragmentActivity) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final void m52194g(DialogInterface dialogInterface, int i11) {
    }
}
